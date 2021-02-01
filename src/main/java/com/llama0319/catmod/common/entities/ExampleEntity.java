package com.llama0319.catmod.common.entities;

import java.util.jar.Attributes;
import com.llama0319.catmod.core.init.EntityTypeInit;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.goal.BreedGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.FoxEntity.EatBerriesGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ExampleEntity extends AnimalEntity{
	
	private EatBerriesGoal eatBerriesGoal;

	public ExampleEntity(EntityType<? extends AnimalEntity> type, World worldIn) {
		super(type, worldIn);
	}
	
	public  AgeableEntity createChild(AgeableEntity ageable) {
		ExampleEntity entity = new ExampleEntity(EntityTypeInit.SQUIRREL.get(), this.world);
		entity.onInitialSpawn(this.world, this.world.getDifficultyForLocation(new BlockPos(entity)), 
				SpawnReason.BREEDING, (ILivingEntityData)null, (CompoundNBT) null);
		return entity;
	}
	
	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.eatBerriesGoal = new EatBerriesGoal(this);
		this.goalSelector.addGoal(0,new SwimGoal(this));
		this.goalSelector.addGoal(1, new PanicGoal(this , 1.25D));
		this.goalSelector.addGoal(2, new BreedGoal(this, 1.0D));
		this.goalSelector.addGoal(3, this.eatBerriesGoal);
		this.goalSelector.addGoal(4, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
		
	}
	
	@Override
	protected void updateAITasks() {
		super.updateAITasks();}
		
		public static AttributeModifierMap.MutableAttribute registerAttributes() {
		
		return MobEntity.func_233666_p_()
				.createMutableAttribute(Attributes.MAX_HEALTH, 16.0D)
				.createMutableAttribute(Attributes.MOVEMENT_SPEED, defaultMoveSpeed)
				.createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE, defaultMoveSpeed);
	}
	
}



