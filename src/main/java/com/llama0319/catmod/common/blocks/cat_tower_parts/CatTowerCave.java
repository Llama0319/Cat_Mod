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

public class CatTowerCave extends BaseHorizontalBlock{
	
	private static final VoxelShape SHAPE = Stream.of(
			Block.makeCuboidShape(11, 1, 11, 14, 13, 14),
			Block.makeCuboidShape(2, 1, 11, 5, 13, 14),
			Block.makeCuboidShape(10, 1, 3, 13, 13, 6),
			Block.makeCuboidShape(2, 1, 2, 5, 13, 5),
			Block.makeCuboidShape(1, 13, 1, 3, 14, 13),
			Block.makeCuboidShape(1, 14, 1, 2, 23, 14),
			Block.makeCuboidShape(3, 13, 3, 13, 14, 13),
			Block.makeCuboidShape(2, 22, 3, 14, 23, 14),
			Block.makeCuboidShape(2, 22, 2, 13, 23, 14),
			Block.makeCuboidShape(3, 13, 1, 10, 14, 3),
			Block.makeCuboidShape(2, 14, 1, 10, 16, 2),
			Block.makeCuboidShape(2, 16, 1, 9, 20, 2),
			Block.makeCuboidShape(2, 20, 1, 10, 23, 2),
			Block.makeCuboidShape(1, 13, 13, 15, 14, 15),
			Block.makeCuboidShape(1, 14, 14, 15, 23, 15),
			Block.makeCuboidShape(13, 13, 6, 15, 14, 13),
			Block.makeCuboidShape(14, 20, 6, 15, 23, 14),
			Block.makeCuboidShape(14, 14, 6, 15, 16, 14),
			Block.makeCuboidShape(14, 16, 7, 15, 20, 14),
			Block.makeCuboidShape(13, 13, 3, 14, 14, 6),
			Block.makeCuboidShape(13, 14, 3, 14, 15, 6),
			Block.makeCuboidShape(13, 21, 3, 14, 22, 6),
			Block.makeCuboidShape(10, 13, 2, 13, 14, 3),
			Block.makeCuboidShape(10, 21, 2, 13, 22, 3),
			Block.makeCuboidShape(10, 14, 2, 13, 15, 3),
			Block.makeCuboidShape(0, 0, 0, 16, 1, 16)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	public CatTowerCave(Properties properties) {
		super(properties);
		runCalculation(SHAPE);
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPES.get(this).get(state.get(HORIZONTAL_FACING));
	}
}
