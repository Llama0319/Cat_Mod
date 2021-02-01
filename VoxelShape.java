Stream.of(
Block.makeCuboidShape(0, 0, 0, 16, 3, 16),
Block.makeCuboidShape(2, 3, 1, 14, 4, 14),
Block.makeCuboidShape(0, 3, 0, 2, 7, 14),
Block.makeCuboidShape(14, 3, 0, 16, 7, 14),
Block.makeCuboidShape(0, 3, 14, 16, 7, 16),
Block.makeCuboidShape(2, 3, 0, 14, 4, 1)
).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);});