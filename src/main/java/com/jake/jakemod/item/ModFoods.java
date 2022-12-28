package com.jake.jakemod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties
    CHOCOLATE_BAR = (new FoodProperties.Builder()).fast().nutrition(3).saturationMod(0.3F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 1), 1F).build(),
    CANDY_CANE = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 1), 1F).build(),

    GHAST_BERRY = (new FoodProperties.Builder()).nutrition(6).saturationMod(1F).build();

}
