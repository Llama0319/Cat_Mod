package com.llama0319.catmod.common.blocks;

import java.util.stream.Stream;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class LitterBox extends BaseHorizontalBlock{
	
	private static final VoxelShape SHAPE = Stream.of(
			Block.makeCuboidShape(2, 2, 1, 14, 3, 14),
			Block.makeCuboidShape(2, 0, 14, 14, 7, 16),
			Block.makeCuboidShape(2, 0, 0, 14, 7, 2),
			Block.makeCuboidShape(2, 0, 2, 14, 2, 14),
			Block.makeCuboidShape(0, 0, 0, 2, 7, 16),
			Block.makeCuboidShape(14, 0, 0, 16, 7, 4),
			Block.makeCuboidShape(14, 0, 4, 16, 3, 12),
			Block.makeCuboidShape(14, 0, 12, 16, 7, 16)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	public LitterBox(Properties properties) {
		super(properties);
		runCalculation(SHAPE);
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPES.get(state.get(HORIZONTAL_FACING));
	}
}
