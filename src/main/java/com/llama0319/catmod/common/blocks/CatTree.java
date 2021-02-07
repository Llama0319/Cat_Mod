package com.llama0319.catmod.common.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import com.llama0319.catmod.core.init.FeatureInit;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class CatTree extends Tree {
	CatTree() {

	}

	@Nullable
	@Override
	protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean largeHive) {
		return FeatureInit.CAT_TREE;
	}
}
