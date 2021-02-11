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
			Block.makeCuboidShape(1, 2, 2, 14, 3, 14),
			Block.makeCuboidShape(14, 0, 2, 16, 5, 14),
			Block.makeCuboidShape(0, 0, 2, 2, 5, 14),
			Block.makeCuboidShape(2, 0, 2, 14, 0, 14),
			Block.makeCuboidShape(0, 0, 14, 16, 5, 16),
			Block.makeCuboidShape(0, 0, 0, 4, 5, 2),
			Block.makeCuboidShape(4, 0, 0, 12, 3, 2),
			Block.makeCuboidShape(12, 0, 0, 16, 5, 2)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	public LitterBox(Properties properties) {
		super(properties);
		runCalculation(SHAPE);
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPES.get(this).get(state.get(HORIZONTAL_FACING));
	}
}
