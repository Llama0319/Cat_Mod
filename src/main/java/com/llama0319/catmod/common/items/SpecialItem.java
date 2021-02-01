package com.llama0319.catmod.common.items;

import java.util.List;
import org.lwjgl.glfw.GLFW;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class SpecialItem extends Item{

	public SpecialItem(Properties properties) {
		super(properties);
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		super.addInformation(stack, worldIn, tooltip, flagIn);
		if(InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), GLFW.GLFW_KEY_LEFT_SHIFT)) {
			tooltip.add(new StringTextComponent("There is nothing more to say, it summons cats. What did you expect?"));
		} else {
			//"Hold " + "\u00A7e" + "Shift" + "\u00A77" + "for More Information"));
			tooltip.add(new TranslationTextComponent("Summons a Cat"));
		}
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		if(!playerIn.getCooldownTracker().hasCooldown(this)) {
			playerIn.addPotionEffect(new EffectInstance(Effects.REGENERATION, 400, 5));
			CatEntity entity = new CatEntity(EntityType.CAT, worldIn);
			entity.setPosition(playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ());
			worldIn.addEntity(entity);
			playerIn.getCooldownTracker().setCooldown(this, 150);
			return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
		}
		return ActionResult.resultFail(playerIn.getHeldItem(handIn));
	}
}
