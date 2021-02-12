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

	public static final RegistryObject<BlockItem> TEST = ITEMS.register("test",
			() -> new BlockItem(BlockInit.TEST.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

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

	public static final RegistryObject<BlockItem> CAT_STONE = ITEMS.register("cat_stone",
			() -> new BlockItem(BlockInit.CAT_STONE.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> CAT_PLANKS = ITEMS.register("cat_planks",
			() -> new BlockItem(BlockInit.CAT_PLANKS.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	// Cat Beds
	public static final RegistryObject<BlockItem> CAT_BED_RED = ITEMS.register("cat_bed_red",
			() -> new BlockItem(BlockInit.CAT_BED_RED.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> CAT_BED_ORANGE = ITEMS.register("cat_bed_orange",
			() -> new BlockItem(BlockInit.CAT_BED_ORANGE.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> CAT_BED_YELLOW = ITEMS.register("cat_bed_yellow",
			() -> new BlockItem(BlockInit.CAT_BED_YELLOW.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> CAT_BED_GREEN = ITEMS.register("cat_bed_green",
			() -> new BlockItem(BlockInit.CAT_BED_GREEN.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> CAT_BED_LIME_GREEN = ITEMS.register("cat_bed_lime_green",
			() -> new BlockItem(BlockInit.CAT_BED_LIME_GREEN.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> CAT_BED_CYAN = ITEMS.register("cat_bed_cyan",
			() -> new BlockItem(BlockInit.CAT_BED_CYAN.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> CAT_BED_BLUE = ITEMS.register("cat_bed_blue",
			() -> new BlockItem(BlockInit.CAT_BED_BLUE.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> CAT_BED_LIGHT_BLUE = ITEMS.register("cat_bed_light_blue",
			() -> new BlockItem(BlockInit.CAT_BED_LIGHT_BLUE.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> CAT_BED_PURPLE = ITEMS.register("cat_bed_purple",
			() -> new BlockItem(BlockInit.CAT_BED_PURPLE.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> CAT_BED_MAGENTA = ITEMS.register("cat_bed_magenta",
			() -> new BlockItem(BlockInit.CAT_BED_MAGENTA.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> CAT_BED_PINK = ITEMS.register("cat_bed_pink",
			() -> new BlockItem(BlockInit.CAT_BED_PINK.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> CAT_BED_LIGHT_GRAY = ITEMS.register("cat_bed_light_gray",
			() -> new BlockItem(BlockInit.CAT_BED_LIGHT_GRAY.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> CAT_BED_GRAY = ITEMS.register("cat_bed_gray",
			() -> new BlockItem(BlockInit.CAT_BED_GRAY.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> CAT_BED_BLACK = ITEMS.register("cat_bed_black",
			() -> new BlockItem(BlockInit.CAT_BED_BLACK.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> CAT_BED_BROWN = ITEMS.register("cat_bed_brown",
			() -> new BlockItem(BlockInit.CAT_BED_BROWN.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> CAT_BED_WHITE = ITEMS.register("cat_bed_white",
			() -> new BlockItem(BlockInit.CAT_BED_WHITE.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	// Litter Boxes
	public static final RegistryObject<BlockItem> LITTER_BOX_RED = ITEMS.register("litter_box_red",
			() -> new BlockItem(BlockInit.LITTER_BOX_RED.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> LITTER_BOX_ORANGE = ITEMS.register("litter_box_orange",
			() -> new BlockItem(BlockInit.LITTER_BOX_ORANGE.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> LITTER_BOX_YELLOW = ITEMS.register("litter_box_yellow",
			() -> new BlockItem(BlockInit.LITTER_BOX_YELLOW.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> LITTER_BOX_GREEN = ITEMS.register("litter_box_green",
			() -> new BlockItem(BlockInit.LITTER_BOX_GREEN.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> LITTER_BOX_LIME_GREEN = ITEMS.register("litter_box_lime_green",
			() -> new BlockItem(BlockInit.LITTER_BOX_LIME_GREEN.get(),
					new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> LITTER_BOX_CYAN = ITEMS.register("litter_box_cyan",
			() -> new BlockItem(BlockInit.LITTER_BOX_CYAN.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> LITTER_BOX_BLUE = ITEMS.register("litter_box_blue",
			() -> new BlockItem(BlockInit.LITTER_BOX_BLUE.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> LITTER_BOX_LIGHT_BLUE = ITEMS.register("litter_box_light_blue",
			() -> new BlockItem(BlockInit.LITTER_BOX_LIGHT_BLUE.get(),
					new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> LITTER_BOX_PURPLE = ITEMS.register("litter_box_purple",
			() -> new BlockItem(BlockInit.LITTER_BOX_PURPLE.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> LITTER_BOX_MAGENTA = ITEMS.register("litter_box_magenta",
			() -> new BlockItem(BlockInit.LITTER_BOX_MAGENTA.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> LITTER_BOX_PINK = ITEMS.register("litter_box_pink",
			() -> new BlockItem(BlockInit.LITTER_BOX_PINK.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> LITTER_BOX_LIGHT_GRAY = ITEMS.register("litter_box_light_gray",
			() -> new BlockItem(BlockInit.LITTER_BOX_LIGHT_GRAY.get(),
					new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> LITTER_BOX_GRAY = ITEMS.register("litter_box_gray",
			() -> new BlockItem(BlockInit.LITTER_BOX_GRAY.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> LITTER_BOX_BLACK = ITEMS.register("litter_box_black",
			() -> new BlockItem(BlockInit.LITTER_BOX_BLACK.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> LITTER_BOX_BROWN = ITEMS.register("litter_box_brown",
			() -> new BlockItem(BlockInit.LITTER_BOX_BROWN.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> LITTER_BOX_WHITE = ITEMS.register("litter_box_white",
			() -> new BlockItem(BlockInit.LITTER_BOX_WHITE.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	// Cat Tower
	public static final RegistryObject<BlockItem> CAT_TOWER_BED = ITEMS.register("cat_tower_bed",
			() -> new BlockItem(BlockInit.CAT_TOWER_BED.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> CAT_TOWER_PLATFORM = ITEMS.register("cat_tower_platform",
			() -> new BlockItem(BlockInit.CAT_TOWER_PLATFORM.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> CAT_TOWER_CAVE = ITEMS.register("cat_tower_cave",
			() -> new BlockItem(BlockInit.CAT_TOWER_CAVE.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> SCRATCHING_POST = ITEMS.register("scratching_post",
			() -> new BlockItem(BlockInit.SCRATCHING_POST.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> CAT_TOWER_BALL_ON_STRING = ITEMS.register("cat_tower_ball_on_string",
			() -> new BlockItem(BlockInit.CAT_TOWER_BALL_ON_STRING.get(),
					new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	public static final RegistryObject<BlockItem> CAT_TOWER_BASE_TOY = ITEMS.register("cat_tower_base_toy",
			() -> new BlockItem(BlockInit.CAT_TOWER_BASE_TOY.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

	// Environment
	public static final RegistryObject<BlockItem> PINK_GRASS = ITEMS.register("pink_grass_block",
			() -> new BlockItem(BlockInit.PINK_GRASS_BLOCK.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));

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
