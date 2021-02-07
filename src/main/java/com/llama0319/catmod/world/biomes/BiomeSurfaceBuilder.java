package com.llama0319.catmod.world.biomes;

import com.llama0319.catmod.Cat_Mod;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeSurfaceBuilder {
	public static final DeferredRegister<SurfaceBuilder<?>> SURFACE_BUILDERS = DeferredRegister
			.create(ForgeRegistries.SURFACE_BUILDERS, Cat_Mod.MOD_ID);

	public static final RegistryObject<CatBiome> CAT_BIOME = SURFACE_BUILDERS.register("cat_biome",
			() -> new CatBiome(SurfaceBuilderConfig.field_237203_a_));
}