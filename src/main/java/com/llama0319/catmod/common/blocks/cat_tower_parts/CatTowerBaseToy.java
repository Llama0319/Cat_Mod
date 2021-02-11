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

public class CatTowerBaseToy extends BaseHorizontalBlock{
	
	private static final VoxelShape SHAPE = Stream.of(
			Block.makeCuboidShape(13, 1, 13, 16, 13, 16),
			Block.makeCuboidShape(0, 1, 13, 3, 13, 16),
			Block.makeCuboidShape(13, 1, 0, 16, 13, 3),
			Block.makeCuboidShape(0, 1, 0, 3, 13, 3),
			Block.makeCuboidShape(0, 0, 0, 16, 1, 16),
			Block.makeCuboidShape(0, 13, 0, 16, 14, 8),
			Block.makeCuboidShape(12, 13, 8, 16, 14, 16),
			Block.makeCuboidShape(4, 13, 14, 12, 14, 16),
			Block.makeCuboidShape(0, 13, 8, 4, 14, 16),
			Block.makeCuboidShape(10, 11, 2, 11, 13, 3),
			Block.makeCuboidShape(10, 7, 2, 11, 8, 3),
			Block.makeCuboidShape(9, 8, 2, 10, 10, 3),
			Block.makeCuboidShape(9, 10, 3, 10, 11, 4),
			Block.makeCuboidShape(9, 5, 2, 11, 7, 4)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	public CatTowerBaseToy(Properties properties) {
		super(properties);
		runCalculation(SHAPE);
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPES.get(this).get(state.get(HORIZONTAL_FACING));
	}
}
