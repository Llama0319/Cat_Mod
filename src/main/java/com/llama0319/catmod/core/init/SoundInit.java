package com.llama0319.catmod.core.init;

import com.llama0319.catmod.Cat_Mod;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundInit {

	public static final DeferredRegister<SoundEvent> SOUNDS = new DeferredRegister<>(ForgeRegistries.SOUND_EVENTS,
			Cat_Mod.MOD_ID);

	public static final RegistryObject<SoundEvent> AMBIENT = SOUNDS.register("entity.quirrel_entity.ambient",
			() -> new SoundEvent(new ResourceLocation(Cat_Mod.MOD_ID, "entity.squirrel_entity.ambient")));

}