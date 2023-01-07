//package com.jake.jakemod.integration;
//
//import com.jake.jakemod.JakeMod;
//import com.jake.jakemod.recipe.KilnBlockRecipe;
//import mezz.jei.api.IModPlugin;
//import mezz.jei.api.JeiPlugin;
//import mezz.jei.api.recipe.RecipeType;
//import mezz.jei.api.registration.IRecipeCategoryRegistration;
//import mezz.jei.api.registration.IRecipeRegistration;
//import net.minecraft.client.Minecraft;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.item.crafting.RecipeManager;
//
//import java.util.List;
//import java.util.Objects;
//
//@JeiPlugin
//public class JEIJakeModPlugin implements IModPlugin {
//    public static RecipeType<KilnBlockRecipe> FIRING_TYPE =
//            new RecipeType<>(KilnBlockRecipeCategory.UID, KilnBlockRecipe.class);
//
//    @Override
//    public ResourceLocation getPluginUid() {
//        return new ResourceLocation(JakeMod.MOD_ID, "jei_plugin");
//    }
//
//    @Override
//    public void registerCategories(IRecipeCategoryRegistration registration) {
//        registration.addRecipeCategories(new
//                KilnBlockRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
//    }
//
//    @Override
//    public void registerRecipes(IRecipeRegistration registration) {
//        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
//
//        List<KilnBlockRecipe> recipesInfusing = rm.getAllRecipesFor(KilnBlockRecipe.Type.INSTANCE);
//        registration.addRecipes(FIRING_TYPE, recipesInfusing);
//    }
//}