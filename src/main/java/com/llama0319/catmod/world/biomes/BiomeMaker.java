package com.llama0319.catmod.world.biomes;

import com.llama0319.catmod.core.init.BlockInit;
import com.llama0319.catmod.core.init.FeatureInit;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.Biome.RainType;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class BiomeMaker {

	public static Biome makeBiome() {
		BiomeGenerationSettings.Builder generationSettings = genSettings(SurfaceBuilder.DEFAULT,
				new SurfaceBuilderConfig(BlockInit.PINK_GRASS_BLOCK.get().getDefaultState(),
						BlockInit.CAT_STONE.get().getDefaultState(), Blocks.DIRT.getDefaultState()));

		WorldGenRegistries.init();

		generationSettings.withStructure(StructureFeatures.PILLAGER_OUTPOST);
		generationSettings.withStructure(StructureFeatures.VILLAGE_PLAINS);
		generationSettings.withStructure(StructureFeatures.RUINED_PORTAL);
		DefaultBiomeFeatures.withCavesAndCanyons(generationSettings);
		DefaultBiomeFeatures.withStrongholdAndMineshaft(generationSettings);
		DefaultBiomeFeatures.withCommonOverworldBlocks(generationSettings);
		DefaultBiomeFeatures.withOverworldOres(generationSettings);
		DefaultBiomeFeatures.withDisks(generationSettings);
		DefaultBiomeFeatures.withAllForestFlowerGeneration(generationSettings);
		DefaultBiomeFeatures.withOverworldOres(generationSettings);
		generationSettings.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, FeatureInit.CAT_TREE);
		DefaultBiomeFeatures.withDefaultFlowers(generationSettings);

		MobSpawnInfo.Builder spawnSettings = new MobSpawnInfo.Builder();
		// spawnSettings.withSpawner(EntityClassification.CREATURE, new
		// MobSpawnInfo.Spawners(EntityTypeRegistry.RUBY_SHEEP, 12, 2, 3));
		spawnSettings.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.CAT, 5, 1, 3));
		DefaultBiomeFeatures.withPassiveMobs(spawnSettings);

		return biome(RainType.NONE, Category.PLAINS, 0.13f, 0.5f, 0.5f, 0.3f,
				new BiomeAmbience.Builder().withGrassColor(0xe80a0a).setWaterColor(0x3f76e4).setWaterFogColor(0x50533)
						.withFoliageColor(0x77ab2f).setFogColor(12638463).withSkyColor(getSkyForTemp(0.5f)),
				generationSettings, spawnSettings.copy());
	}

	private static Biome biome(RainType precipitation, Category category, float depth, float scale, float temperature,
			float downfall, BiomeAmbience.Builder effects, BiomeGenerationSettings.Builder genSettings,
			MobSpawnInfo spawnSettings) {
		return new Biome.Builder().precipitation(precipitation).category(category).depth(depth).scale(scale)
				.temperature(temperature).downfall(downfall).setEffects(effects.build())
				.withGenerationSettings(genSettings.build()).withMobSpawnSettings(spawnSettings).build();
	}

	private static <C extends ISurfaceBuilderConfig> BiomeGenerationSettings.Builder genSettings(
			SurfaceBuilder<C> surfaceBuilder, C config) {
		return new BiomeGenerationSettings.Builder().withSurfaceBuilder(surfaceBuilder.func_242929_a(config));
	}

	private static int getSkyForTemp(float temperature) {
		float a = MathHelper.clamp(temperature / 3.0f, -1.0f, 1.0f);
		return MathHelper.hsvToRGB(0.62222224f - a * 0.05f, 0.5f + a * 0.1f, 1.0f);
	}
}