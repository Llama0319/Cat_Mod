package com.llama0319.catmod.core.event;

import java.util.Random;

import com.llama0319.catmod.Cat_Mod;
import com.llama0319.catmod.common.blocks.CustomBlock;
import com.llama0319.catmod.core.init.BlockInit;

import net.minecraft.block.AnvilBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = Cat_Mod.MOD_ID, bus = Bus.FORGE)
public class EventHandler {

	@SubscribeEvent
	public static void onBlockBreak(final BlockEvent.BreakEvent event) {
		IWorld world = event.getWorld();
		BlockPos pos = event.getPos();
		if (event.getState().getBlock() instanceof AnvilBlock) {
			EventHandler.setBlocks(world, pos, world.getRandom());
		}

		else if (event.getPlayer().hasItemInSlot(EquipmentSlotType.OFFHAND) && world instanceof World) {
			CatEntity catEntity = new CatEntity(EntityType.CAT, (World) world);
			catEntity.setPosition(pos.getX(), pos.getY(), pos.getZ());
			world.addEntity(catEntity);
		}
	}

	private static void setBlocks(IWorld world, BlockPos pos, Random rand) {
		for (int x = -5; x < 5; x++) {
			for (int y = -5; y < 5; y++) {
				for (int z = -5; z < 5; z++) {
					world.setBlockState(
							pos.add(x, y, z), BlockInit.CUSTOM_BLOCK.get().getDefaultState()
									.with(CustomBlock.HORIZONTAL_FACING, Direction.Plane.HORIZONTAL.random(rand)),
							Constants.BlockFlags.BLOCK_UPDATE);
				}
			}
		}
	}
}