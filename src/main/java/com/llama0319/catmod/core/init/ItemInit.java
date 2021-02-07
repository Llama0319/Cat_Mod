package com.llama0319.catmod.core.init;

import java.util.function.Supplier;
import com.llama0319.catmod.Cat_Mod;
import com.llama0319.catmod.common.items.SpecialItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Cat_Mod.MOD_ID);

	public static final RegistryObject<Item> SCREAMING_CAT = ITEMS.register("screaming_cat",
			() -> new Item(new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<Item> CAT_GEM = ITEMS.register("cat_gem",
			() -> new Item(new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<Item> SUPER_CAT_GEM = ITEMS.register("super_cat_gem",
			() -> new Item(new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<Item> HEART_GEM = ITEMS.register("heart_gem",
			() -> new Item(new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<Item> FISH_BISCUIT = ITEMS.register("fish_biscuit",
			() -> new Item(new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<Item> GOLDEN_TREAT = ITEMS.register("golden_treat",
			() -> new Item(new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<Item> ACORN = ITEMS.register("acorn",
			() -> new Item(new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	// Crops
	public static final RegistryObject<Item> CATNIP_SEEDS = ITEMS.register("catnip_seeds",
			() -> new BlockItem(BlockInit.CATNIP.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<Item> CATNIP = ITEMS.register("catnip",
			() -> new Item(new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	// Food
	public static final RegistryObject<Item> FISH_TACO = ITEMS.register("fish_taco",
			() -> new Item(new Item.Properties().group(Cat_Mod.CATMOD_GROUP).food(FoodInit.FISH_TACO)));

	// Advanced Items
	public static final RegistryObject<SpecialItem> CAT_STAFF = ITEMS.register("cat_staff",
			() -> new SpecialItem(new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	// Fuel

	// Block Items
	public static final RegistryObject<BlockItem> CAT_ORE = ITEMS.register("cat_ore",
			() -> new BlockItem(BlockInit.CAT_ORE.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> HEART_ORE = ITEMS.register("heart_ore",
			() -> new BlockItem(BlockInit.HEART_ORE.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> CUSTOM_BLOCK = ITEMS.register("custom_block",
			() -> new BlockItem(BlockInit.CUSTOM_BLOCK.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> LITTER_BOX_RED = ITEMS.register("litter_box_red",
			() -> new BlockItem(BlockInit.LITTER_BOX_RED.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> PINK_GRASS = ITEMS.register("pink_grass",
			() -> new BlockItem(BlockInit.PINK_GRASS.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> CAT_LEAVES = ITEMS.register("cat_leaves",
			() -> new BlockItem(BlockInit.CAT_LEAVES.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> CAT_LOG = ITEMS.register("cat_log",
			() -> new BlockItem(BlockInit.CAT_LOG.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<Item> CAT_TREE_SAPLING = ITEMS.register("cat_tree_sapling",
			() -> new BlockItem(BlockInit.CAT_TREE_SAPLING.get(), (new Item.Properties()).group(Cat_Mod.CATMOD_GROUP)));

	// Armor
	public static final RegistryObject<ArmorItem> CAT_HELMET = ITEMS.register("cat_helmet",
			() -> new ArmorItem(ModArmorMaterial.CAT, EquipmentSlotType.HEAD,
					new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<ArmorItem> CAT_CHESTPLATE = ITEMS.register("cat_chestplate",
			() -> new ArmorItem(ModArmorMaterial.CAT, EquipmentSlotType.CHEST,
					new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<ArmorItem> CAT_LEGGINGS = ITEMS.register("cat_leggings",
			() -> new ArmorItem(ModArmorMaterial.CAT, EquipmentSlotType.LEGS,
					new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<ArmorItem> CAT_BOOTS = ITEMS.register("cat_boots",
			() -> new ArmorItem(ModArmorMaterial.CAT, EquipmentSlotType.FEET,
					new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	// Tools
	public static final RegistryObject<SwordItem> CAT_SWORD = ITEMS.register("cat_sword",
			() -> new SwordItem(ModItemTier.CAT, 499, 10.0f, new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<PickaxeItem> CAT_PICKAXE = ITEMS.register("cat_pickaxe",
			() -> new PickaxeItem(ModItemTier.CAT, 100, 10.0f, new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<ShovelItem> CAT_SHOVEL = ITEMS.register("cat_shovel",
			() -> new ShovelItem(ModItemTier.CAT, 100, 10.0f, new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<AxeItem> CAT_AXE = ITEMS.register("cat_axe",
			() -> new AxeItem(ModItemTier.CAT, 999, 8.0f, new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<HoeItem> CAT_HOE = ITEMS.register("cat_hoe",
			() -> new HoeItem(ModItemTier.CAT, 100, 10.0f, new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public enum ModItemTier implements IItemTier {
		CAT(5, 1000000, 50.0f, 1000.0f, 10000, () -> {
			return Ingredient.fromItems(ItemInit.SUPER_CAT_GEM.get());
		});

		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;

		private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability,
				Supplier<Ingredient> repairMaterial) {
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.enchantability = enchantability;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}

		@Override
		public int getMaxUses() {
			return this.maxUses;
		}

		@Override
		public float getEfficiency() {
			return this.efficiency;
		}

		@Override
		public float getAttackDamage() {
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel() {
			return this.harvestLevel;
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
	}

	// Armor
	public enum ModArmorMaterial implements IArmorMaterial {
		CAT(Cat_Mod.MOD_ID + ":cat_armor", 5, new int[] { 14, 18, 22, 14 }, 420, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
				6.9F, () -> {
					return Ingredient.fromItems(ItemInit.SUPER_CAT_GEM.get());
				});

		private static final int[] MAX_DAMAGE_ARRAY = new int[] { 32, 32, 32, 32 };
		private final String name;
		private final int maxDamageFactor;
		private final int[] damageReductionAmountArray;
		private final int enchantability;
		private final SoundEvent soundEvent;
		private final float toughness;
		private final LazyValue<Ingredient> repairMaterial;

		private ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn,
				int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn,
				Supplier<Ingredient> repairMaterialIn) {
			this.name = nameIn;
			this.maxDamageFactor = maxDamageFactorIn;
			this.damageReductionAmountArray = damageReductionAmountIn;
			this.enchantability = enchantabilityIn;
			this.soundEvent = soundEventIn;
			this.toughness = toughnessIn;
			this.repairMaterial = new LazyValue<>(repairMaterialIn);
		}

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.damageReductionAmountArray[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return this.soundEvent;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public String getName() {
			return this.name;
		}

		@Override
		public float getToughness() {
			return this.toughness;
		}

		@Override
		public float getKnockbackResistance() {
			return 0;
		}

	}
}
