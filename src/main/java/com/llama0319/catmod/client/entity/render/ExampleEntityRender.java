package com.llama0319.catmod.client.entity.render;

import com.llama0319.catmod.Cat_Mod;
import com.llama0319.catmod.client.entity.model.ExampleEntityModel;
import com.llama0319.catmod.common.entities.ExampleEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ExampleEntityRender extends MobRenderer<ExampleEntity, ExampleEntityModel> {

	protected static final ResourceLocation TEXTURE = new ResourceLocation(Cat_Mod.MOD_ID,
			"textures/entity/example_entity.png");

	public ExampleEntityRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new ExampleEntityModel(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(ExampleEntity entity) {
		return TEXTURE;
	}
}