package com.jake.jakemod.item.custom;

import com.google.common.collect.Multimap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.extensions.IForgeItemStack;
import net.minecraftforge.common.util.LazyOptional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import net.minecraftforge.common.extensions.IForgeItem;

import java.util.Properties;

import static org.openjdk.nashorn.internal.objects.NativeError.getStack;

public class RoseGoldItem extends ArmorItem {


    public RoseGoldItem(ArmorMaterial p_40386_, EquipmentSlot p_40387_, Properties p_40388_) {
        super(p_40386_, p_40387_, p_40388_);
    }

@Override
    public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity wearer){
        return true;
    }


    // public static boolean isWearingGold(LivingEntity p_234460_0_) {
     //   for(ItemStack itemstack : p_234460_0_.getArmorSlots()) {
       //     Item item = itemstack.getItem();
         //   if (itemstack.makesPiglinsNeutral(p_234460_0_)) {
           //     return true;
            //}
        //}

        //eturn false;
    //}
//@Override
    //public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer){
  //  return getStack.getItem().makesPiglinsNeutral(getStack(), wearer);
//}

    //private ItemStack getStack() {
      //  return RoseGoldItem();
    //}

}
