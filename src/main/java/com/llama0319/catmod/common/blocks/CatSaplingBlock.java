package com.llama0319.catmod.common.blocks;

import com.llama0319.catmod.core.init.BlockInit;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class CatSaplingBlock extends SaplingBlock {
	public CatSaplingBlock() {
		super(new CatTree(), AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly()
				.zeroHardnessAndResistance().sound(SoundType.PLANT));
	}
	
	protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return state.isIn(Blocks.GRASS_BLOCK) || state.isIn(Blocks.DIRT) || state.isIn(Blocks.COARSE_DIRT)
				|| state.isIn(Blocks.PODZOL) || state.isIn(Blocks.FARMLAND) || state.isIn(BlockInit.PINK_GRASS_BLOCK.get());
	}
}