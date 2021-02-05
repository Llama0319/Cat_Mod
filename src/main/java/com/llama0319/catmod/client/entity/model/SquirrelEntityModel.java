package com.llama0319.catmod.client.entity.model;

import com.llama0319.catmod.common.entities.SquirrelEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class SquirrelEntityModel extends EntityModel<SquirrelEntity> {
	private final ModelRenderer RearLeftFoot;
	private final ModelRenderer rearFootLeft;
	private final ModelRenderer haunchLeft;
	private final ModelRenderer rearFootRight;
	private final ModelRenderer haunchRight;
	private final ModelRenderer body;
	private final ModelRenderer frontLegLeft;
	private final ModelRenderer frontLegRight;
	private final ModelRenderer head;
	private final ModelRenderer earRight;
	private final ModelRenderer earLeft;
	private final ModelRenderer tail;
	private final ModelRenderer tail_top;
	private final ModelRenderer nose;

	public SquirrelEntityModel() {
		textureWidth = 64;
		textureHeight = 64;

		RearLeftFoot = new ModelRenderer(this);
		RearLeftFoot.setRotationPoint(3.0F, 14.5F, 3.7F);

		rearFootLeft = new ModelRenderer(this);
		rearFootLeft.setRotationPoint(-6.0F, 3.0F, 0.0F);
		RearLeftFoot.addChild(rearFootLeft);
		rearFootLeft.setTextureOffset(18, 31).addBox(-1.0F, 5.5F, -4.7F, 2.0F, 1.0F, 5.0F, 0.0F, false);

		haunchLeft = new ModelRenderer(this);
		haunchLeft.setRotationPoint(-6.0F, 3.0F, 0.0F);
		RearLeftFoot.addChild(haunchLeft);
		setRotationAngle(haunchLeft, -0.3491F, 0.0F, 0.0F);
		haunchLeft.setTextureOffset(27, 27).addBox(-1.0F, 1.0261F, -2.8191F, 2.0F, 4.0F, 5.0F, 0.0F, false);

		rearFootRight = new ModelRenderer(this);
		rearFootRight.setRotationPoint(3.0F, 17.5F, 3.7F);
		rearFootRight.setTextureOffset(9, 30).addBox(-1.0F, 5.5F, -4.7F, 2.0F, 1.0F, 5.0F, 0.0F, false);

		haunchRight = new ModelRenderer(this);
		haunchRight.setRotationPoint(0.0F, 0.0F, 0.0F);
		rearFootRight.addChild(haunchRight);
		setRotationAngle(haunchRight, -0.3491F, 0.0F, 0.0F);
		haunchRight.setTextureOffset(0, 24).addBox(-1.0F, 1.0261F, -2.8191F, 2.0F, 4.0F, 5.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 17.0F, 12.0F);
		setRotationAngle(body, -0.3491F, 0.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-3.0F, 2.2735F, -15.8938F, 6.0F, 5.0F, 10.0F, 0.0F, false);

		frontLegLeft = new ModelRenderer(this);
		frontLegLeft.setRotationPoint(-3.0F, 17.0F, -1.0F);
		setRotationAngle(frontLegLeft, -0.1745F, 0.0F, 0.0F);
		frontLegLeft.setTextureOffset(8, 36).addBox(-1.0F, 0.5209F, -3.9544F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		frontLegRight = new ModelRenderer(this);
		frontLegRight.setRotationPoint(3.0F, 17.0F, -1.0F);
		setRotationAngle(frontLegRight, -0.1745F, 0.0F, 0.0F);
		frontLegRight.setTextureOffset(0, 33).addBox(-1.0F, 0.5209F, -3.9544F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 16.0F, -1.0F);
		head.setTextureOffset(0, 15).addBox(-2.5F, -4.0F, -8.0F, 5.0F, 4.0F, 5.0F, 0.0F, false);

		earRight = new ModelRenderer(this);
		earRight.setRotationPoint(0.0F, 16.0F, -1.0F);
		setRotationAngle(earRight, 0.0F, 0.2618F, 0.0F);
		earRight.setTextureOffset(36, 5).addBox(1.2765F, -6.0F, -3.8978F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		earLeft = new ModelRenderer(this);
		earLeft.setRotationPoint(0.0F, 16.0F, -1.0F);
		setRotationAngle(earLeft, 0.0F, -0.2618F, 0.0F);
		earLeft.setTextureOffset(0, 7).addBox(-3.2765F, -6.0F, -3.8978F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 20.0F, 7.0F);
		setRotationAngle(tail, -0.3491F, 0.0F, 0.0F);
		tail.setTextureOffset(0, 0).addBox(-1.5F, -2.4739F, -2.8191F, 3.0F, 5.0F, 2.0F, 0.0F, false);
		tail.setTextureOffset(32, 19).addBox(-1.8F, -5.0533F, -2.6031F, 3.0F, 4.0F, 2.0F, 0.0F, false);
		tail.setTextureOffset(6, 7).addBox(-1.0F, -1.258F, -0.9397F, 2.0F, 3.0F, 0.0F, 0.0F, false);
		tail.setTextureOffset(15, 15).addBox(-1.7F, -3.2557F, -2.2214F, 3.0F, 4.0F, 1.0F, 0.0F, false);

		tail_top = new ModelRenderer(this);
		tail_top.setRotationPoint(0.0F, -0.9397F, -0.342F);
		tail.addChild(tail_top);
		setRotationAngle(tail_top, 0.2182F, 0.0F, 0.0F);
		tail_top.setTextureOffset(28, 11).addBox(-1.4F, -10.4358F, -3.2338F, 3.0F, 4.0F, 4.0F, 0.0F, false);
		tail_top.setTextureOffset(16, 20).addBox(-2.1F, -10.7358F, -3.0338F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		tail_top.setTextureOffset(9, 24).addBox(-1.0F, -7.3564F, -2.6498F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		tail_top.setTextureOffset(36, 0).addBox(-1.0F, -5.4771F, -2.2658F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		tail_top.setTextureOffset(22, 0).addBox(-2.0F, -11.2016F, -2.8568F, 4.0F, 7.0F, 3.0F, 0.0F, false);
		tail_top.setTextureOffset(30, 36).addBox(-1.0F, -7.4079F, -1.9236F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		nose = new ModelRenderer(this);
		nose.setRotationPoint(0.0F, 16.0F, -1.0F);
		nose.setTextureOffset(0, 15).addBox(-0.5F, -2.5F, -8.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn,
			float red, float green, float blue, float alpha) {

	}

	@Override
	public void setRotationAngles(SquirrelEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {

	}
}
