package com.llama0319.catmod.core.init;

import com.llama0319.catmod.Cat_Mod;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.BiomeManager;

public class BiomeInit {
	public static void registerBiomes() {
		BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(
				RegistryKey.getOrCreateKey(Registry.BIOME_KEY, new ResourceLocation(Cat_Mod.MOD_ID, "cat_biome")), 2));
	}
}