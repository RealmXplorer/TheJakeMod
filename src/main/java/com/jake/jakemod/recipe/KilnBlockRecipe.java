//package com.jake.jakemod.recipe;
//
//import com.google.gson.JsonArray;
//import com.google.gson.JsonObject;
//import com.jake.jakemod.JakeMod;
//import net.minecraft.core.NonNullList;
//import net.minecraft.network.FriendlyByteBuf;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.util.GsonHelper;
//import net.minecraft.world.SimpleContainer;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.crafting.*;
//import net.minecraft.world.level.Level;
//import org.jetbrains.annotations.Nullable;
//
//public class KilnBlockRecipe extends AbstractCookingRecipe {
//
//    public KilnBlockRecipe(RecipeType<?> pType, ResourceLocation pId, String pGroup, Ingredient pIngredient, ItemStack pResult, float pExperience, int pCookingTime) {
//        super(pType, pId, pGroup, pIngredient, pResult, pExperience, pCookingTime);
//    }
//
//    @Override
//    public RecipeSerializer<?> getSerializer() {
//        return null;
//    }
//}