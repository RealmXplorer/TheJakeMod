package com.jake.jakemod.potion;

import com.jake.jakemod.JakeMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS
            = DeferredRegister.create(ForgeRegistries.POTIONS, JakeMod.MOD_ID);

    public static final RegistryObject<Potion> BLINDNESS_POTION = POTIONS.register("blindness_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.BLINDNESS, 240, 0)));

    public static final RegistryObject<Potion> GLOWING_POTION = POTIONS.register("glowing_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.GLOWING, 2040, 0)));

    public static final RegistryObject<Potion> LEVITATION_POTION = POTIONS.register("levitation_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 500, 0)));

    public static final RegistryObject<Potion> HUNGER_POTION = POTIONS.register("hunger_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.HUNGER, 1000, 1)));

    public static void register(IEventBus eventBus) {
    POTIONS.register(eventBus);
}
}
