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
    public static final DeferredRegister<SoundEvent> MOD_SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
            JakeMod.MOD_ID);


    //public static RegistryObject<SoundEvent> MUSIC_DISC_DOG = registerSoundEvent("music_disc_dog");

    public static final RegistryObject<SoundEvent> MUSIC_DISC_DOG = MOD_SOUNDS.register("music_disc_dog",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(JakeMod.MOD_ID, "music_disc_dog")));

    public static final RegistryObject<SoundEvent> MUSIC_DISC_KINGSTEAD = MOD_SOUNDS.register("music_disc_kingstead",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(JakeMod.MOD_ID, "music_disc_kingstead")));

    public static final RegistryObject<SoundEvent> MUSIC_DISC_DECEMBER = MOD_SOUNDS.register("music_disc_december",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(JakeMod.MOD_ID, "music_disc_december")));

    //    public static RegistryObject<SoundEvent> MUSIC_DISC_KINGSTEAD = registerSoundEvent("music_disc_kingstead");

//    public static RegistryObject<SoundEvent> MUSIC_DISC_DECEMBER = registerSoundEvent("music_disc_december");

    //public static final RegistryObject<SoundEvent> SOUL_GLASS_BREAK =
      //      registerSoundEvent("soul_glass_break");


    //public static final ForgeSoundType SOUL_GLASS_SOUNDS = new ForgeSoundType(1f,1f,
      //      ModSounds.SOUL_GLASS_BREAK);


//        public static final RegistryObject<SoundEvent> NEW_SOUND = MOD_SOUNDS.register("your_new_sound",
//                () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(YourCoolMod.MODID, "your_new_sound")));
//    private static RegistryObject<SoundEvent> registerSoundEvent(String name){
//        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(JakeMod.MOD_ID,name)));
//    }
public static void register(IEventBus eventBus) {
    MOD_SOUNDS.register(eventBus);
}
}
