package com.llama0319.catmod.common.blocks.cat_tower_parts;

import java.util.stream.Stream;

import com.llama0319.catmod.common.blocks.BaseHorizontalBlock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class ScratchingPost extends BaseHorizontalBlock{
	
	private static final VoxelShape SHAPE = Stream.of(
			Block.makeCuboidShape(6, 1, 6, 10, 16, 10),
			Block.makeCuboidShape(2, 0, 2, 14, 1, 14)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	public ScratchingPost(Properties properties) {
		super(properties);
		runCalculation(SHAPE);
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPES.get(this).get(state.get(HORIZONTAL_FACING));
	}
}
