package com.jake.jakemod.block.entity;

import com.jake.jakemod.JakeMod;
import com.jake.jakemod.block.ModBlocks;
//import com.jake.jakemod.block.custom.KilnBlock;
//import com.jake.jakemod.block.entity.custom.KilnBlockEntity;
import net.minecraft.util.datafix.fixes.BlockEntityKeepPacked;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, JakeMod.MOD_ID);

//public static final RegistryObject<BlockEntityType<KilnBlockEntity>> KILN_BLOCK =
  //      BLOCK_ENTITIES.register("kiln", () ->
    //            BlockEntityType.Builder.of(KilnBlockEntity::new,
      //                  ModBlocks.KILN_BLOCK.get()).build(null));


    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
