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

public class CatTowerBed extends BaseHorizontalBlock{
	
	private static final VoxelShape SHAPE = Stream.of(
			Block.makeCuboidShape(2, 0, 2, 14, 1, 14),
			Block.makeCuboidShape(6, 1, 6, 10, 13, 10),
			Block.makeCuboidShape(3, 13, 2, 13, 14, 3),
			Block.makeCuboidShape(3, 13, 3, 13, 14, 13),
			Block.makeCuboidShape(1, 13, 5, 2, 15, 11),
			Block.makeCuboidShape(14, 13, 5, 15, 15, 11),
			Block.makeCuboidShape(5, 13, 1, 11, 15, 2),
			Block.makeCuboidShape(5, 13, 14, 11, 15, 15),
			Block.makeCuboidShape(3, 14, 13, 5, 15, 14),
			Block.makeCuboidShape(11, 14, 13, 13, 15, 14),
			Block.makeCuboidShape(11, 14, 2, 13, 15, 3),
			Block.makeCuboidShape(3, 14, 2, 5, 15, 3),
			Block.makeCuboidShape(13, 14, 3, 14, 15, 5),
			Block.makeCuboidShape(13, 14, 11, 14, 15, 13),
			Block.makeCuboidShape(2, 14, 3, 3, 15, 5),
			Block.makeCuboidShape(2, 14, 11, 3, 15, 13),
			Block.makeCuboidShape(2, 13, 3, 3, 14, 13),
			Block.makeCuboidShape(3, 13, 13, 13, 14, 14),
			Block.makeCuboidShape(13, 13, 3, 14, 14, 13)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	public CatTowerBed(Properties properties) {
		super(properties);
		runCalculation(SHAPE);
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPES.get(this).get(state.get(HORIZONTAL_FACING));
	}
}
