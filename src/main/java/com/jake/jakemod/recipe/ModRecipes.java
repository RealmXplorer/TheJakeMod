package com.jake.jakemod.recipe;


import com.jake.jakemod.JakeMod;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, JakeMod.MOD_ID);


    public static final RegistryObject<RecipeSerializer<KilnBlockRecipe>> KILN_BLOCK_SERIALIZER =
            SERIALIZERS.register("kiln_firing", () -> KilnBlockRecipe.Serializer.INSTANCE);




    public static void register (IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
