package com.gotve.create_steel_encased_core.mod_tiers;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class ModTiers {

    public static final Tier COPPER_TIER = new Tier() {
        @Override public int getUses() { return 131; }
        @Override public float getSpeed() { return 4.0f; } // mining speed
        @Override public float getAttackDamageBonus() { return 1.0f; }
        @Override public int getLevel() { return 1; }
        @Override public int getEnchantmentValue() { return 5; }
        @Override public Ingredient getRepairIngredient() { // used for defining material to repair with
            return Ingredient.of(Items.COPPER_INGOT); // no repair item
        }
    };

    public static final Tier BRASS_TIER = new Tier() {
        @Override public int getUses() { return 250; }
        @Override public float getSpeed() { return 6.0f; } // mining speed
        @Override public float getAttackDamageBonus() { return 2.0f; }
        @Override public int getLevel() { return 2; }
        @Override public int getEnchantmentValue() { return 10; }
        @Override public Ingredient getRepairIngredient() { // used for defining material to repair with
            return Ingredient.of(Items.COPPER_INGOT); // no repair item
        }
    };
}
