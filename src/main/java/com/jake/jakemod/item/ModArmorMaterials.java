package com.jake.jakemod.item;

import com.jake.jakemod.JakeMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial{


    COPPER("copper", 15, new int[]{2, 4, 5, 2}, 19, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.COPPER_INGOT);
    }),
    CROWN("crown", 7, new int[]{1, 3, 5, 2}, 22, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {
        return Ingredient.of(ModItems.RUBY.get());
    }),
    STEEL("steel", 20, new int[]{3, 5, 6, 3}, 9, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.25F, 0.05F, () -> {
        return Ingredient.of(ModItems.STEEL_INGOT.get());
    }),
    ROSE_GOLD("rose_gold", 7, new int[]{2, 3, 5, 2}, 22, SoundEvents.ARMOR_EQUIP_GOLD, 0.5F, 0.0F, () -> {
        return Ingredient.of(ModItems.ROSE_GOLD_INGOT.get());
    });

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ModArmorMaterials(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_, SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.durabilityMultiplier = p_40475_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.sound = p_40478_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }

    public int getDurabilityForSlot(EquipmentSlot p_40484_) {
        return HEALTH_PER_SLOT[p_40484_.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot p_40487_) {
        return this.slotProtections[p_40487_.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {

        return JakeMod.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
