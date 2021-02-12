package com.llama0319.catmod.core.init;

import com.llama0319.catmod.Cat_Mod;
import com.llama0319.catmod.common.blocks.CatSaplingBlock;
import com.llama0319.catmod.common.blocks.Catnip;
import com.llama0319.catmod.common.blocks.CatBed;

import com.llama0319.catmod.common.blocks.LitterBox;
import com.llama0319.catmod.common.blocks.TwoBlock;
import com.llama0319.catmod.common.blocks.cat_tower_parts.CatTowerBallOnString;
import com.llama0319.catmod.common.blocks.cat_tower_parts.CatTowerBaseToy;
import com.llama0319.catmod.common.blocks.cat_tower_parts.CatTowerBed;
import com.llama0319.catmod.common.blocks.cat_tower_parts.CatTowerCave;
import com.llama0319.catmod.common.blocks.cat_tower_parts.CatTowerPlatform;
import com.llama0319.catmod.common.blocks.cat_tower_parts.ScratchingPost;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import net.minecraft.block.LeavesBlock;
import net.minecraft.block.RotatedPillarBlock;
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

	public static final RegistryObject<TwoBlock> TEST = BLOCKS.register("test",
			() -> new TwoBlock(AbstractBlock.Properties.from(Blocks.DARK_OAK_DOOR)));

	// Ores
	public static final RegistryObject<Block> CAT_ORE = BLOCKS
			.register("cat_ore",
					() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLUE)
							.hardnessAndResistance(15f, 30f).harvestTool(ToolType.PICKAXE).harvestLevel(-1)
							.sound(SoundType.METAL)));

	public static final RegistryObject<Block> HEART_ORE = BLOCKS
			.register("heart_ore",
					() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLUE)
							.hardnessAndResistance(15f, 30f).harvestTool(ToolType.PICKAXE).harvestLevel(-1)
							.sound(SoundType.METAL)));

	public static final RegistryObject<Block> CAT_STONE = BLOCKS.register("cat_stone", () -> new Block(
			AbstractBlock.Properties.create(Material.ROCK, MaterialColor.STONE).harvestTool(ToolType.PICKAXE)));

	// Cat Beds
	public static final RegistryObject<CatBed> CAT_BED_RED = BLOCKS.register("cat_bed_red",
			() -> new CatBed(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(-1)
					.sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<CatBed> CAT_BED_ORANGE = BLOCKS.register("cat_bed_orange",
			() -> new CatBed(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(-1)
					.sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<CatBed> CAT_BED_YELLOW = BLOCKS.register("cat_bed_yellow",
			() -> new CatBed(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(-1)
					.sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<CatBed> CAT_BED_GREEN = BLOCKS.register("cat_bed_green",
			() -> new CatBed(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(-1)
					.sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<CatBed> CAT_BED_LIME_GREEN = BLOCKS.register("cat_bed_lime_green",
			() -> new CatBed(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(-1)
					.sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<CatBed> CAT_BED_CYAN = BLOCKS.register("cat_bed_cyan",
			() -> new CatBed(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(-1)
					.sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<CatBed> CAT_BED_BLUE = BLOCKS.register("cat_bed_blue",
			() -> new CatBed(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(-1)
					.sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<CatBed> CAT_BED_LIGHT_BLUE = BLOCKS.register("cat_bed_light_blue",
			() -> new CatBed(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(-1)
					.sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<CatBed> CAT_BED_PURPLE = BLOCKS.register("cat_bed_purple",
			() -> new CatBed(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(-1)
					.sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<CatBed> CAT_BED_MAGENTA = BLOCKS.register("cat_bed_magenta",
			() -> new CatBed(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(-1)
					.sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<CatBed> CAT_BED_PINK = BLOCKS.register("cat_bed_pink",
			() -> new CatBed(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(-1)
					.sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<CatBed> CAT_BED_LIGHT_GRAY = BLOCKS.register("cat_bed_light_gray",
			() -> new CatBed(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(-1)
					.sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<CatBed> CAT_BED_GRAY = BLOCKS.register("cat_bed_gray",
			() -> new CatBed(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(-1)
					.sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<CatBed> CAT_BED_BLACK = BLOCKS.register("cat_bed_black",
			() -> new CatBed(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(-1)
					.sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<CatBed> CAT_BED_BROWN = BLOCKS.register("cat_bed_brown",
			() -> new CatBed(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(-1)
					.sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<CatBed> CAT_BED_WHITE = BLOCKS.register("cat_bed_white",
			() -> new CatBed(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).harvestLevel(-1)
					.sound(SoundType.WOOD).setRequiresTool()));

	// Litter Boxes
	public static final RegistryObject<LitterBox> LITTER_BOX_RED = BLOCKS.register("litter_box_red",
			() -> new LitterBox(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
					.harvestLevel(-1).sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<LitterBox> LITTER_BOX_ORANGE = BLOCKS.register("litter_box_orange",
			() -> new LitterBox(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
					.harvestLevel(-1).sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<LitterBox> LITTER_BOX_YELLOW = BLOCKS.register("litter_box_yellow",
			() -> new LitterBox(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
					.harvestLevel(-1).sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<LitterBox> LITTER_BOX_GREEN = BLOCKS.register("litter_box_green",
			() -> new LitterBox(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
					.harvestLevel(-1).sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<LitterBox> LITTER_BOX_LIME_GREEN = BLOCKS.register("litter_box_lime_green",
			() -> new LitterBox(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
					.harvestLevel(-1).sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<LitterBox> LITTER_BOX_CYAN = BLOCKS.register("litter_box_cyan",
			() -> new LitterBox(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
					.harvestLevel(-1).sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<LitterBox> LITTER_BOX_BLUE = BLOCKS.register("litter_box_blue",
			() -> new LitterBox(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
					.harvestLevel(-1).sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<LitterBox> LITTER_BOX_LIGHT_BLUE = BLOCKS.register("litter_box_light_blue",
			() -> new LitterBox(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
					.harvestLevel(-1).sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<LitterBox> LITTER_BOX_PURPLE = BLOCKS.register("litter_box_purple",
			() -> new LitterBox(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
					.harvestLevel(-1).sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<LitterBox> LITTER_BOX_MAGENTA = BLOCKS.register("litter_box_magenta",
			() -> new LitterBox(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
					.harvestLevel(-1).sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<LitterBox> LITTER_BOX_PINK = BLOCKS.register("litter_box_pink",
			() -> new LitterBox(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
					.harvestLevel(-1).sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<LitterBox> LITTER_BOX_LIGHT_GRAY = BLOCKS.register("litter_box_light_gray",
			() -> new LitterBox(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
					.harvestLevel(-1).sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<LitterBox> LITTER_BOX_GRAY = BLOCKS.register("litter_box_gray",
			() -> new LitterBox(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
					.harvestLevel(-1).sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<LitterBox> LITTER_BOX_BLACK = BLOCKS.register("litter_box_black",
			() -> new LitterBox(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
					.harvestLevel(-1).sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<LitterBox> LITTER_BOX_BROWN = BLOCKS.register("litter_box_brown",
			() -> new LitterBox(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
					.harvestLevel(-1).sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<LitterBox> LITTER_BOX_WHITE = BLOCKS.register("litter_box_white",
			() -> new LitterBox(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
					.harvestLevel(-1).sound(SoundType.WOOD).setRequiresTool()));

	// Cat Tower
	public static final RegistryObject<CatTowerBed> CAT_TOWER_BED = BLOCKS.register("cat_tower_bed",
			() -> new CatTowerBed(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
					.harvestLevel(-1).sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<CatTowerPlatform> CAT_TOWER_PLATFORM = BLOCKS.register("cat_tower_platform",
			() -> new CatTowerPlatform(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
					.harvestLevel(-1).sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<CatTowerCave> CAT_TOWER_CAVE = BLOCKS.register("cat_tower_cave",
			() -> new CatTowerCave(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
					.harvestLevel(-1).sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<ScratchingPost> SCRATCHING_POST = BLOCKS.register("scratching_post",
			() -> new ScratchingPost(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
					.harvestLevel(-1).sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<CatTowerBallOnString> CAT_TOWER_BALL_ON_STRING = BLOCKS.register(
			"cat_tower_ball_on_string", () -> new CatTowerBallOnString(AbstractBlock.Properties.create(Material.WOOD)
					.harvestTool(ToolType.AXE).harvestLevel(-1).sound(SoundType.WOOD).setRequiresTool()));

	public static final RegistryObject<CatTowerBaseToy> CAT_TOWER_BASE_TOY = BLOCKS.register("cat_tower_base_toy",
			() -> new CatTowerBaseToy(AbstractBlock.Properties.create(Material.WOOD).harvestTool(ToolType.AXE)
					.harvestLevel(-1).sound(SoundType.WOOD).setRequiresTool()));

	// Crops
	public static final RegistryObject<Block> CATNIP = BLOCKS.register("catnip",
			() -> new Catnip(Block.Properties.from(Blocks.WHEAT)));

	// Plants and Environment
	public static final RegistryObject<Block> PINK_GRASS_BLOCK = BLOCKS.register("pink_grass_block", () -> new Block(
			AbstractBlock.Properties.create(Material.EARTH).harvestTool(ToolType.SHOVEL).sound(SoundType.GROUND)));

	public static final RegistryObject<Block> CAT_LOG = BLOCKS.register("cat_log",
			() -> new RotatedPillarBlock(Block.Properties.from(Blocks.OAK_LOG)));

	public static final RegistryObject<Block> CAT_PLANKS = BLOCKS.register("cat_planks",
			() -> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));

	public static final RegistryObject<Block> CAT_LEAVES = BLOCKS.register("cat_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES)));

	public static final RegistryObject<Block> CAT_TREE_SAPLING = BLOCKS.register("cat_tree_sapling",
			CatSaplingBlock::new);
}