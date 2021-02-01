package com.llama0319.catmod.core.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodInit {

	public static final Food FISH_TACO = new Food.Builder().fastToEat().hunger(2).meat().setAlwaysEdible()
			.effect(() -> new EffectInstance(Effects.STRENGTH, 100, 25), 1.0f)
			.effect(() -> new EffectInstance(Effects.STRENGTH, 50, 50), 0.5f)
			.effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.SLOW_FALLING, 500, 5), 1.0f)
			.effect(() -> new EffectInstance(Effects.HASTE, 500, 5), 1.0f)
			.effect(() -> new EffectInstance(Effects.HEALTH_BOOST, 300, 5), 1.0f)
			.effect(() -> new EffectInstance(Effects.LUCK, 1000, 10), 1.0f)
			.effect(() -> new EffectInstance(Effects.NIGHT_VISION, 500, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.REGENERATION, 100, 5), 1.0f)
			.effect(() -> new EffectInstance(Effects.WATER_BREATHING, 500, 1), 1.0f).build();
}
