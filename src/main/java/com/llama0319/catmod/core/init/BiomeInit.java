package com.llama0319.catmod.core.init;

import com.llama0319.catmod.Cat_Mod;
import com.llama0319.catmod.world.biomes.BiomeMaker;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(Cat_Mod.MOD_ID)
public class BiomeInit {
	public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES,
			Cat_Mod.MOD_ID);

	private static final RegistryObject<Biome> CAT_PLAINS = BIOMES.register("cat_plains", BiomeMaker::makeBiome);
	private static final RegistryKey<Biome> CAT_PLAINS_KEY = RegistryKey.getOrCreateKey(Registry.BIOME_KEY,
			new ResourceLocation(Cat_Mod.MOD_ID, "cat_plains"));

	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void biomeLoading(BiomeLoadingEvent event) {
		if (event.getName().equals(CAT_PLAINS.get().getRegistryName())) {
			BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(CAT_PLAINS_KEY, 24));
			BiomeDictionary.addTypes(CAT_PLAINS_KEY, Type.PLAINS, Type.MOUNTAIN);
		}
	}
}