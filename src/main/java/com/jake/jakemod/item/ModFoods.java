package com.jake.jakemod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties
    CHOCOLATE_BAR = (new FoodProperties.Builder()).fast().nutrition(3).saturationMod(0.3F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 1), 1F).build(),
    CANDY_CANE = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 1), 1F).build(),

    CANDY_CORN = (new FoodProperties.Builder()).fast().nutrition(4).saturationMod(0.3F).effect(new MobEffectInstance(MobEffects.CONFUSION, 40, 2), 1F).build(),

    GHAST_BERRY = (new FoodProperties.Builder()).nutrition(6).saturationMod(1F).build(),

    ENDER_FRUIT = (new FoodProperties.Builder()).nutrition(5).saturationMod(1.3F).build(),

    PEPPERMINT_BARK = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.7F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 1),1F).build(),

    APPLE_PIE = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.3F).build(),

    BERRY_PIE = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.3F).build(),

    SUSHI = (new FoodProperties.Builder()).nutrition(5).saturationMod(1F).build();
}
