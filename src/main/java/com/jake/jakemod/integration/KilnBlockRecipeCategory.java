//package com.jake.jakemod.integration;
//
//import com.jake.jakemod.JakeMod;
//import com.jake.jakemod.block.ModBlocks;
//import com.jake.jakemod.recipe.KilnBlockRecipe;
//import mezz.jei.api.constants.VanillaTypes;
//import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
//import mezz.jei.api.gui.drawable.IDrawable;
//import mezz.jei.api.helpers.IGuiHelper;
//import mezz.jei.api.recipe.IFocusGroup;
//import mezz.jei.api.recipe.RecipeIngredientRole;
//import mezz.jei.api.recipe.RecipeType;
//import mezz.jei.api.recipe.category.IRecipeCategory;
//import net.minecraft.network.chat.Component;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.item.ItemStack;
//
//public class KilnBlockRecipeCategory implements IRecipeCategory<KilnBlockRecipe> {
//    public final static ResourceLocation UID = new ResourceLocation(JakeMod.MOD_ID, "kiln_firing");
//    public final static ResourceLocation TEXTURE =
//            new ResourceLocation(JakeMod.MOD_ID, "textures/gui/gem_infusing_station_gui.png");
//
//    private final IDrawable background;
//    private final IDrawable icon;
//
//    public KilnBlockRecipeCategory(IGuiHelper helper) {
//        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
//        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.KILN_BLOCK.get()));
//    }
//
//    @Override
//    public RecipeType<KilnBlockRecipe> getRecipeType() {
//        return JEIJakeModPlugin.FIRING_TYPE;
//    }
//
//    @Override
//    public Component getTitle() {
//        return Component.literal("Kiln");
//    }
//
//    @Override
//    public IDrawable getBackground() {
//        return this.background;
//    }
//
//    @Override
//    public IDrawable getIcon() {
//        return this.icon;
//    }
//
//    @Override
//    public void setRecipe(IRecipeLayoutBuilder builder, KilnBlockRecipe recipe, IFocusGroup focuses) {
//        builder.addSlot(RecipeIngredientRole.INPUT, 86, 15).addIngredients(recipe.getIngredients().get(0));
//
//        builder.addSlot(RecipeIngredientRole.OUTPUT, 86, 60).addItemStack(recipe.getResultItem());
//    }
//}