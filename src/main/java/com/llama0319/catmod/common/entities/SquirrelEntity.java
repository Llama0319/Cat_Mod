package com.llama0319.catmod.common.entities;

import com.llama0319.catmod.core.init.ItemInit;
import java.util.Random;
import java.util.Set;
import com.llama0319.catmod.core.init.EntityTypeInit;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.entity.ai.goal.BreedGoal;
import net.minecraft.entity.ai.goal.EatGrassGoal;
import net.minecraft.entity.ai.goal.FollowParentGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.ClimberPathNavigator;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

	public class SquirrelEntity extends AnimalEntity {

	protected static final DataParameter<Byte> CLIMBING = EntityDataManager.<Byte>createKey(SquirrelEntity.class, DataSerializers.BYTE);

    private int climbTimeWithoutLog = 0;

    public SquirrelEntity(World worldIn) {
        super(EntityTypeInit.SQUIRREL.entityType, worldIn);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new SwimGoal(this));
        this.goalSelector.addGoal(2, new PanicGoal(this, 0.72D));
        this.goalSelector.addGoal(3, new BreedGoal(this, 0.5D));
        this.goalSelector.addGoal(4, new TemptGoal(this, 0.5D, Ingredient.fromItems(Items.WHEAT_SEEDS), false));
        this.goalSelector.addGoal(5, new AvoidEntityGoal<>(this, PlayerEntity.class, 10F, 0.5D, 0.7D));
        this.goalSelector.addGoal(6, new WaterAvoidingRandomWalkingGoal(this, 0.5D));
    }

    @Override
    protected void registerData() {
        super.registerData();
        this.dataManager.register(SquirrelEntity.CLIMBING, Byte.valueOf((byte) 0));
    }

    @Override
    public void tick() {
        super.tick();

        if (!this.world.isRemote) {
            boolean nearLog = false;
            for (Direction facing : Direction.values()) {
                BlockPos pos = this.getPosition().offset(facing);
                Block block = this.world.getBlockState(pos).getBlock();
                if (block == Blocks.ACACIA_LOG || block == Blocks.BIRCH_LOG || block == Blocks.DARK_OAK_LOG
                        || block == Blocks.JUNGLE_LOG || block == Blocks.OAK_LOG || block == Blocks.SPRUCE_LOG) {
                    nearLog = true;
                }
            }
            this.setBesideClimbableBlock(
                    this.collidedHorizontally && nearLog || this.collidedHorizontally && this.climbTimeWithoutLog < 15);
            if (this.collidedHorizontally && !nearLog) {
                this.climbTimeWithoutLog++;
            } else if (this.climbTimeWithoutLog > 0 || this.collidedHorizontally && nearLog) {
                this.climbTimeWithoutLog = 0;
            }
        }
    }

    @Override
    public boolean isOnLadder() {
        return this.isBesideClimbableBlock();
    }

    public boolean isBesideClimbableBlock() {
        return (this.dataManager.get(SquirrelEntity.CLIMBING).byteValue() & 1) != 0;
    }

    public void setBesideClimbableBlock(boolean climbing) {
        byte b0 = this.dataManager.get(SquirrelEntity.CLIMBING).byteValue();

        if (climbing) {
            b0 = (byte) (b0 | 1);
        } else {
            b0 = (byte) (b0 & -2);
        }

        this.dataManager.set(SquirrelEntity.CLIMBING, Byte.valueOf(b0));
    }

    @Override
    protected PathNavigator createNavigator(World worldIn) {
        return new ClimberPathNavigator(this, worldIn);
    }

    @Override
    public AgeableEntity func_241840_a(ServerWorld world, AgeableEntity ageable) {
        SquirrelEntity squirrel = new SquirrelEntity(this.world);
        if (ageable instanceof SquirrelEntity) {
            SquirrelEntity other = (SquirrelEntity) ageable;
            if ((this.isAlbino() || other.isAlbino()) && !this.getVariantNameOrEmpty().equals(other.getVariantNameOrEmpty())) {
                squirrel.setType(this.isAlbino() ? other.getVariant().get() : this.getVariant().get());
            } else {
                squirrel.setType(this.rand.nextBoolean() ? this.getVariant().get() : other.getVariant().get());
            }
        }
        return squirrel;
    }

    private void setType(Object object) {
		
	}

	private Object getVariantNameOrEmpty() {
		return null;
	}

	private RegistryObject<EntityType<SquirrelEntity>> getVariant() {
		return null;
	}

	@Override
    public boolean isBreedingItem(ItemStack stack) {
        return stack.getItem() == Items.WHEAT_SEEDS || stack.getItem() == Items.BEETROOT_SEEDS
                || stack.getItem() == Items.MELON_SEEDS || stack.getItem() == Items.PUMPKIN_SEEDS;
    }
    
    @Override
    public boolean onLivingFall(float distance, float damageMultiplier) {
        return false;
    }

    protected SquirrelEntity getBaseChild() {
        return null; 
    }

    @Override
    public ILivingEntityData onInitialSpawn(IServerWorld world, DifficultyInstance difficulty, SpawnReason reason, ILivingEntityData livingdata, CompoundNBT compound) {
        return EntityUtil.childChance(this, reason, super.onInitialSpawn(world, difficulty, reason, livingdata, compound), 0.25F);
    }

    public String[] getTypesFor(RegistryKey<Biome> biomeKey, Biome biome, Set<BiomeDictionary.Type> types, SpawnReason reason) {
        if(types.contains(Type.FOREST) && !types.contains(Type.CONIFEROUS)) {
            return new String[] { "gray", "albino" };
        } else if(types.contains(Type.CONIFEROUS) && !types.contains(Type.SNOWY)) {
            return new String[] { "red" };
        } else {
            return new String[] { "gray", "red", "albino" };
        }
    }

    @Override
    public EntityTypeContainer<? extends EntityAnimalWithTypes> getContainer() {
        return EntityTypeInit.SQUIRREL;
    }
    
    protected boolean isAlbino() {
        return "albino".equals(this.getVariantNameOrEmpty());
    }

    public static boolean canSquirrelSpawn(EntityType<SquirrelEntity> type, IServerWorld world, SpawnReason reason, BlockPos pos, Random rand) {
        Block below = world.getBlockState(pos.down()).getBlock();
        return MobEntity.canSpawnOn(type, world, reason, pos, rand) || below.isIn(BlockTags.LEAVES) || below.isIn(BlockTags.LOGS);
    }
}