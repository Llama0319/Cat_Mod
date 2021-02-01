package com.llama0319.catmod.client.entity.render;

import com.llama0319.catmod.Cat_Mod;
import com.llama0319.catmod.client.entity.model.EntitySquirrelModel;
import com.llama0319.catmod.common.entities.EntitySquirrel;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class EntitySquirrelRender extends MobRenderer<EntitySquirrel, EntitySquirrelModel> {

	protected static final ResourceLocation TEXTURE = new ResourceLocation(Cat_Mod.MOD_ID,
			"textures/entity/example_entity.png");

	@SuppressWarnings("rawtypes")
	public EntitySquirrelRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new EntitySquirrelModel(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntitySquirrel entity) {
		return TEXTURE;
	}
}