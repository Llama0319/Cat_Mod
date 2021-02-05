package com.llama0319.catmod.core.util;

import com.llama0319.catmod.Cat_Mod;
import com.llama0319.catmod.core.init.BlockInit;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Cat_Mod.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {

		RenderTypeLookup.setRenderLayer(BlockInit.CATNIP.get(), RenderType.getCutout());

	}

	public float call(ItemStack stack, World worldIn, LivingEntity entityIn) {
		switch (stack.getCount()) {
		case 1:
			return 0.25f;
		case 2:
			return 0.5f;
		case 3:
			return 0.75f;
		case 4:
			return 1.0f;
		default:
			return 0.0f;
		}
	};
}
