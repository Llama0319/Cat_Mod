package com.llama0319.catmod.core.init;

import com.llama0319.catmod.Cat_Mod;
import com.llama0319.catmod.world.feature.CatTree;

import net.minecraft.world.gen.feature.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FeatureInit {
	public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, Cat_Mod.MOD_ID);

	public static final RegistryObject<CatTree> OAK = FEATURES.register("cat_tree", () -> new CatTree(NoFeatureConfig.field_236558_a_));

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
	public static class FeatureEvents {
	}
}
