Stream.of(
Block.makeCuboidShape(2, 2, 1, 14, 3, 14),
Block.makeCuboidShape(2, 0, 14, 14, 7, 16),
Block.makeCuboidShape(2, 0, 0, 14, 7, 2),
Block.makeCuboidShape(2, 0, 2, 14, 2, 14),
Block.makeCuboidShape(0, 0, 0, 2, 7, 16),
Block.makeCuboidShape(14, 0, 0, 16, 7, 4),
Block.makeCuboidShape(14, 0, 4, 16, 3, 12),
Block.makeCuboidShape(14, 0, 12, 16, 7, 16)
).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);});