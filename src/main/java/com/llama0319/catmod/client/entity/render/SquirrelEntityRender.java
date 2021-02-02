package com.llama0319.catmod.client.entity.render;

import com.llama0319.catmod.Cat_Mod;
import com.llama0319.catmod.client.entity.model.SquirrelEntityModel;
import com.llama0319.catmod.common.entities.SquirrelEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SquirrelEntityRender extends MobRenderer<SquirrelEntity, SquirrelEntityModel> {

	protected static final ResourceLocation TEXTURE = new ResourceLocation(Cat_Mod.MOD_ID,
			"textures/entity/example_entity.png");

	@SuppressWarnings("rawtypes")
	public SquirrelEntityRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new SquirrelEntityModel(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(SquirrelEntity entity) {
		return TEXTURE;
	}
}