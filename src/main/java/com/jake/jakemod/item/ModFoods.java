package com.jake.jakemod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties
    CHOCOLATE_BAR = (new FoodProperties.Builder()).fast().nutrition(2).saturationMod(0.3F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 1), 1F).build();
}
