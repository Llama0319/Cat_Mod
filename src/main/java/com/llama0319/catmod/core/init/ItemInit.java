package com.llama0319.catmod.core.init;

import java.util.function.Supplier;
import com.llama0319.catmod.Cat_Mod;
import com.llama0319.catmod.common.items.SpecialItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ItemInit {
	
	public static final Item super_cat_gem = null;
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, 
			Cat_Mod.MOD_ID);
	
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
	
	//Food
	public static final RegistryObject<Item> FISH_TACO = ITEMS.register("fish_taco", 
			() -> new Item(new Item.Properties().group(Cat_Mod.CATMOD_GROUP).food(FoodInit.FISH_TACO)));
	
	//Advanced Items
	public static final RegistryObject<SpecialItem> CAT_STAFF = ITEMS.register("cat_staff", 
			() -> new SpecialItem(new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));
	
	// Block Items
	public static final RegistryObject<BlockItem> CAT_ORE = ITEMS.register("cat_ore", 
			() -> new BlockItem(BlockInit.CAT_ORE.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));
	
	public static final RegistryObject<BlockItem> HEART_ORE = ITEMS.register("heart_ore", 
			() -> new BlockItem(BlockInit.HEART_ORE.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));
	
	public static final RegistryObject<BlockItem> CUSTOM_BLOCK = ITEMS.register("custom_block", 
			() -> new BlockItem(BlockInit.CUSTOM_BLOCK.get(), new Item.Properties().group(Cat_Mod.CATMOD_GROUP)));
	
	//Tools
	public static final Item cat_sword = null;
	public static final Item cat_pickaxe = null;
	public static final Item cat_shovel = null;
	public static final Item cat_axe = null;
	public static final Item cat_hoe = null;
	
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
	
	public enum ModItemTier implements IItemTier
	{
		CAT(5, 1000000, 50.0f, 1000.0f, 10000, () -> {
			return Ingredient.fromItems(ItemInit.super_cat_gem);
		});
		
		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;
		
		private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
		{
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
		public Ingredient getRepairMaterial() 
		{
			return this.repairMaterial.getValue();
		}
	}
}
