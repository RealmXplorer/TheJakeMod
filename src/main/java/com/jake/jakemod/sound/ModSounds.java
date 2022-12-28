package com.jake.jakemod.sound;

import com.jake.jakemod.JakeMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, JakeMod.MOD_ID);


    public static RegistryObject<SoundEvent> DOG_MUSIC_DISC = registerSoundEvent("dog_music_disc");
    private static RegistryObject<SoundEvent> registerSoundEvent(String name){
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(JakeMod.MOD_ID,name)));
    }
public static void register(IEventBus eventBus) {
    SOUND_EVENTS.register(eventBus);
}
}
