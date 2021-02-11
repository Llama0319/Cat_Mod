package com.llama0319.catmod.core.init;


import com.llama0319.catmod.Cat_Mod;
import com.llama0319.catmod.common.entities.SquirrelEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypeInit {

	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister.create(ForgeRegistries.ENTITIES,
			Cat_Mod.MOD_ID);

	public static final RegistryObject<EntityType<SquirrelEntity>> SQUIRREL_ENTITY = ENTITY_TYPES
			.register("example_entity",
					() -> EntityType.Builder.<SquirrelEntity>create(SquirrelEntity::new, EntityClassification.CREATURE)
							.size(0.9f, 1.3f)
							.build(new ResourceLocation(Cat_Mod.MOD_ID, "example_entity").toString()));
}