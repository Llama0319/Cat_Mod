Stream.of(
Block.makeCuboidShape(13, 1, 13, 16, 15, 16),
Block.makeCuboidShape(0, 1, 13, 3, 15, 16),
Block.makeCuboidShape(13, 1, 0, 16, 15, 3),
Block.makeCuboidShape(0, 1, 0, 3, 15, 3),
Block.makeCuboidShape(0, 0, 0, 16, 1, 16),
Block.makeCuboidShape(0, 15, 0, 16, 16, 8),
Block.makeCuboidShape(12, 15, 8, 16, 16, 16),
Block.makeCuboidShape(4, 15, 14, 12, 16, 16),
Block.makeCuboidShape(0, 15, 8, 4, 16, 16),
Block.makeCuboidShape(10, 13, 2, 11, 15, 3),
Block.makeCuboidShape(10, 8, 2, 11, 9, 3),
Block.makeCuboidShape(9, 9, 2, 10, 11, 3),
Block.makeCuboidShape(9, 11, 3, 10, 13, 4),
Block.makeCuboidShape(9, 6, 2, 11, 8, 4)
).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);});