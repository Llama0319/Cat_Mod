package com.llama0319.catmod.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CatSaplingBlock extends SaplingBlock {
	public CatSaplingBlock() {
		super(new CatTree(), AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly()
				.zeroHardnessAndResistance().sound(SoundType.PLANT));
	}
}