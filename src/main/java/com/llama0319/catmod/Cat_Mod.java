package com.llama0319.catmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.llama0319.catmod.core.init.BiomeInit;
import com.llama0319.catmod.core.init.BlockInit;
import com.llama0319.catmod.core.init.FeatureInit;
import com.llama0319.catmod.core.init.ItemInit;

import com.llama0319.catmod.world.gen.OreGeneration;
import com.llama0319.catmod.common.blocks.Catnip;

import net.minecraft.block.DoublePlantBlock;
import net.minecraft.block.GrassPathBlock;
import net.minecraft.block.LadderBlock;
import net.minecraft.block.TallGrassBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(Cat_Mod.MOD_ID)
public class Cat_Mod {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "catmod";
	public static final ItemGroup CATMOD_GROUP = new CatMod("catmodtab");
	public static final ResourceLocation CAT_DIM_TYPE = new ResourceLocation(MOD_ID, "cat");

	public Cat_Mod() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);

		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		BiomeInit.BIOMES.register(bus);
		// EntityTypeInit.ENTITY_TYPES.register(bus);
		// SoundInit.SOUNDS.register(bus);

		MinecraftForge.EVENT_BUS.register(this);
		MinecraftForge.EVENT_BUS.addListener(OreGeneration::generateOres);
	}

	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();

		BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)
				.filter(block -> !(block instanceof Catnip) && !(block instanceof TallGrassBlock)
						&& !(block instanceof DoublePlantBlock) && !(block instanceof GrassPathBlock)
						&& !(block instanceof LadderBlock))

				.forEach(block -> {
					final Item.Properties properties = new Item.Properties().group(Cat_Mod.CATMOD_GROUP);
					final BlockItem blockItem = new BlockItem(block, properties);
					blockItem.setRegistryName(block.getRegistryName());
					registry.register(blockItem);
				});

		LOGGER.debug("Registered BlockItems!");
	}

	private void setup(final FMLCommonSetupEvent event) {

		RenderTypeLookup.setRenderLayer(BlockInit.CAT_TREE_SAPLING.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CAT_PLANKS_LADDER.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.LARGE_PINK_FERN.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.PINK_FERN.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.PINK_GRASS.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.TALL_PINK_GRASS.get(), RenderType.getCutout());


		FeatureInit.registerTrees();

	}

	public static class CatMod extends ItemGroup {

		public CatMod(String label) {
			super(label);
		}

		@Override
		public ItemStack createIcon() {
			return ItemInit.SCREAMING_CAT.get().getDefaultInstance();
		}
	}
}
