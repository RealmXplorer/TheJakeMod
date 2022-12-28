package com.jake.jakemod.sound;

import com.jake.jakemod.JakeMod;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, JakeMod.MOD_ID);


    public static RegistryObject<SoundEvent> MUSIC_DISC_DOG = registerSoundEvent("music_disc_dog");

    public static RegistryObject<SoundEvent> MUSIC_DISC_KINGSTEAD = registerSoundEvent("music_disc_kingstead");

    //public static final RegistryObject<SoundEvent> SOUL_GLASS_BREAK =
      //      registerSoundEvent("soul_glass_break");


    //public static final ForgeSoundType SOUL_GLASS_SOUNDS = new ForgeSoundType(1f,1f,
      //      ModSounds.SOUL_GLASS_BREAK);

    private static RegistryObject<SoundEvent> registerSoundEvent(String name){
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(JakeMod.MOD_ID,name)));
    }
public static void register(IEventBus eventBus) {
    SOUND_EVENTS.register(eventBus);
}
}
