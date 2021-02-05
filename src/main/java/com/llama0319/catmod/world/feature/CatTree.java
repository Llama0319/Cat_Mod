package com.llama0319.catmod.world.feature;

import java.util.Random;

import com.llama0319.catmod.core.init.BlockInit;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraftforge.common.IPlantable;

public class CatTree extends Tree {

	public static final TreeFeatureConfig CAT_TREE_CONFIG = (new TreeFeatureConfig.Builder(
			new SimpleBlockStateProvider(BlockInit.CAT_LOG.get().getDefaultState()),
			new SimpleBlockStateProvider(BlockInit.CAT_LEAVES.get().getDefaultState()),
			new BlobFoliagePlacer(40, 1))).baseHeight(150).heightRandA(5).foliageHeight(125).ignoreVines()
					.setSapling((IPlantable) BlockInit.CAT_TREE_SAPLING.get()).build();

	@Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean b) {
		return Feature.NORMAL_TREE.withConfiguration(CAT_TREE_CONFIG);
	}
}