package com.gotve.create_steel_encased_core.mod_tiers;

import com.gotve.create_steel_encased_core.CreateSteelEncasedCore;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("removal")
public class ModMaterials {

    public static final ArmorMaterial COPPER = new ArmorMaterial() {
        @Override
        public int getDurabilityForType(ArmorItem.Type p_266807_) {
            return switch (p_266807_) {
                case HELMET -> 105;
                case CHESTPLATE -> 140;
                case LEGGINGS -> 155;
                case BOOTS -> 135;
            };
        }

        @Override
        public int getDefenseForType(ArmorItem.Type p_267168_) {
            return switch (p_267168_) {
                case HELMET -> 2;
                case CHESTPLATE -> 5;
                case LEGGINGS -> 4;
                case BOOTS -> 1;
            };
        }

        @Override
        public int getEnchantmentValue() {
            return 8;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.ARMOR_EQUIP_GOLD;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(ItemTags.create(new ResourceLocation("forge", "ingots/copper")));
        }

        @Override
        public String getName() {
            return CreateSteelEncasedCore.MOD_ID + ":copper";
        }

        @Override
        public float getToughness() {
            return 0;
        }

        @Override
        public float getKnockbackResistance() {
            return 0;
        }
    };

    public static final ArmorMaterial BRASS = new ArmorMaterial() {
        @Override
        public int getDurabilityForType(ArmorItem.Type p_266807_) {
            return switch (p_266807_) {
                case HELMET -> 165;
                case CHESTPLATE -> 240;
                case LEGGINGS -> 255;
                case BOOTS -> 195;
            };
        }

        @Override
        public int getDefenseForType(ArmorItem.Type p_267168_) {
            return switch (p_267168_) {
                case HELMET -> 2;
                case CHESTPLATE -> 6;
                case LEGGINGS -> 5;
                case BOOTS -> 2;
            };
        }

        @Override
        public int getEnchantmentValue() {
            return 12;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.ARMOR_EQUIP_IRON;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(ItemTags.create(new ResourceLocation("forge", "ingots/brass")));
        }

        @Override
        public String getName() {
            return CreateSteelEncasedCore.MOD_ID + ":brass";
        }

        @Override
        public float getToughness() {
            return 0;
        }

        @Override
        public float getKnockbackResistance() {
            return 0;
        }
    };

    public static final ArmorMaterial NETHERSTEEL = new ArmorMaterial() {
        @Override
        public int getDurabilityForType(ArmorItem.Type p_266807_) {
            return switch (p_266807_) {
                case HELMET -> 407;
                case CHESTPLATE -> 592;
                case LEGGINGS -> 555;
                case BOOTS -> 481;
            };
        }

        @Override
        public int getDefenseForType(ArmorItem.Type p_267168_) {
            return switch (p_267168_) {
                case HELMET -> 3;
                case CHESTPLATE -> 8;
                case LEGGINGS -> 6;
                case BOOTS -> 3;
            };
        }

        @Override
        public int getEnchantmentValue() {
            return 20;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.ARMOR_EQUIP_NETHERITE;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(ItemTags.create(new ResourceLocation("forge", "ingots/nethersteel")));
        }

        @Override
        public String getName() {
            return CreateSteelEncasedCore.MOD_ID + ":nethersteel";
        }

        @Override
        public float getToughness() {
            return 3.0f;
        }

        @Override
        public float getKnockbackResistance() {
            return 0.1f;
        }
    };
}