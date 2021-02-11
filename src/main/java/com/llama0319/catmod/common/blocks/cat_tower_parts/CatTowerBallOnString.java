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

public class CatTowerBallOnString extends BaseHorizontalBlock{
	
	private static final VoxelShape SHAPE = Stream.of(
			Block.makeCuboidShape(2, 0, 2, 14, 1, 14),
			Block.makeCuboidShape(9, 1, 9, 13, 13, 13),
			Block.makeCuboidShape(2, 13, 6, 3, 14, 12),
			Block.makeCuboidShape(15, 13, 6, 16, 14, 12),
			Block.makeCuboidShape(6, 13, 2, 12, 14, 3),
			Block.makeCuboidShape(6, 13, 15, 12, 14, 16),
			Block.makeCuboidShape(3, 13, 4, 4, 14, 14),
			Block.makeCuboidShape(4, 13, 14, 14, 14, 15),
			Block.makeCuboidShape(4, 13, 3, 14, 14, 4),
			Block.makeCuboidShape(4, 13, 4, 14, 14, 14),
			Block.makeCuboidShape(14, 13, 4, 15, 14, 14),
			Block.makeCuboidShape(4, 11, 4, 5, 13, 5),
			Block.makeCuboidShape(5, 7, 4, 6, 9, 5),
			Block.makeCuboidShape(4, 9, 5, 5, 11, 6),
			Block.makeCuboidShape(4, 5, 3, 6, 7, 5)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	public CatTowerBallOnString(Properties properties) {
		super(properties);
		runCalculation(SHAPE);
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPES.get(this).get(state.get(HORIZONTAL_FACING));
	}
}
