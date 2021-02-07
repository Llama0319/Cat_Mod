package com.llama0319.catmod.world.biomes;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Builder;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.feature.TwoFeatureChoiceConfig;

import net.minecraft.world.gen.placement.Placement;

public class CatBiome extends Biome {

	public CatBiome(Builder biomeBuilder) {
		super(biomeBuilder);
		this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.ZOMBIE, 10, 2, 5));
		this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.BEE, 20, 2, 10));
		this.addCarver(GenerationStage.Carving.AIR,
				Biome.createCarver(WorldCarver.CAVE, new ProbabilityConfig(0.14285715F)));
		this.addCarver(GenerationStage.Carving.AIR,
				Biome.createCarver(WorldCarver.NETHER_CAVE, new ProbabilityConfig(0.02F)));

		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
				Feature.RANDOM_BOOLEAN_SELECTOR
						.withConfiguration(new TwoFeatureChoiceConfig(
								Feature.FLOWER.withConfiguration(DefaultBiomeFeatures.withAllForestFlowerGeneration(null)),
								Feature.BONUS_CHEST
						.withPlacement(Placement.HEIGHTMAP.configure(new FrequencyConfig(1))));
		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
				Feature.RANDOM_PATCH.withConfiguration(DefaultBiomeFeatures.withJungleGrass(null).withPlacement(
						Placement.COUNT_CHANCE_HEIGHTMAP.configure(new HeightWithChanceConfig(1, 0.25F)))));
		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
				Feature.RANDOM_PATCH.gene(DefaultBiomeFeatures.withAllForestFlowerGeneration(null)).withPlacement(
						Placement.HEIGHTMAP.configure(new HeightWithChanceConfig(1, 0.125F))));
		// this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
		// Feature.NORMAL_TREE.withConfiguration(JazzTree.JAZZ_TREE_CONFIG).withPlacement(
		// Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(7,
		// 0.1f, 1))));

		DefaultBiomeFeatures.withOverworldOres(this);
		DefaultBiomeFeatures.withExtraGoldOre(this);
		DefaultBiomeFeatures.addExtraEmeraldOre(this);
	}
}