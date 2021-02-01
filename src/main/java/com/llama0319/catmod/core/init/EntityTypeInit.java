package com.llama0319.catmod.core.init;

import com.llama0319.catmod.Cat_Mod;
import com.llama0319.catmod.common.entities.ExampleEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypeInit {
	
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister(ForgeRegistries.ENTITIES, 
			Cat_Mod.MOD_ID);

	public static final RegistryObject<EntityType<ExampleEntity>> SQUIRREL = ENTITY_TYPES
			.register("squirrel", 
					() -> EntityType.Builder.<ExampleEntity>create(ExampleEntity::new, EntityClassification.CREATURE)
					.size(0.4f, 0.5f)
					.build(new ResourceLocation(Cat_Mod.MOD_ID, "squirrel").toString()));
}
