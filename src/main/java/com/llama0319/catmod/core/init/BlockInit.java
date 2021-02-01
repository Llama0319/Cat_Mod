package com.llama0319.catmod.core.init;

import com.llama0319.catmod.Cat_Mod;
import com.llama0319.catmod.common.blocks.CustomBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, 
			Cat_Mod.MOD_ID);
	
	//Ores
	public static final RegistryObject<Block> CAT_ORE = BLOCKS.register("cat_ore", 
			() -> new Block(AbstractBlock.Properties.from(Blocks.DIAMOND_ORE)));
	
	public static final RegistryObject<Block> HEART_ORE = BLOCKS.register("heart_ore", 
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLUE)
					.hardnessAndResistance(15f, 30f).harvestTool(ToolType.PICKAXE).harvestLevel(-1).sound(SoundType.METAL)));
	
	//Custom Blocks
	public static final RegistryObject<CustomBlock> CUSTOM_BLOCK = BLOCKS.register("custom_block", 
			() -> new CustomBlock(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
					.harvestLevel(-1).sound(SoundType.WOOD).setRequiresTool()));
}
