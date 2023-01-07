package com.jake.jakemod.item.custom;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

public class CrownItem extends ArmorItem {


    public CrownItem(ArmorMaterial p_40386_, EquipmentSlot p_40387_, Properties p_40388_) {
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
