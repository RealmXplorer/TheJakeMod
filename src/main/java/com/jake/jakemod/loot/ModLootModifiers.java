package com.jake.jakemod.loot;

import com.mojang.serialization.Codec;
import com.jake.jakemod.JakeMod;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, JakeMod.MOD_ID);

    //public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_ITEM =
    //        LOOT_MODIFIER_SERIALIZERS.register("add_item", AddItemModifier.CODEC);

    //public static final RegistryObject<Codec<? extends IGlobalLootModifier>> GLASS_BLOCK_SHARD =
    //        LOOT_MODIFIER_SERIALIZERS.register("glass_block_shard", GlassBlockShard.CODEC);

    //public static final RegistryObject<Codec<? extends IGlobalLootModifier>> GLASS_PANE_SHARD =
    //       LOOT_MODIFIER_SERIALIZERS.register("glass_pane_shard", GlassPaneShard.CODEC);
    public static void register(IEventBus bus) {
        LOOT_MODIFIER_SERIALIZERS.register(bus);
    }
}