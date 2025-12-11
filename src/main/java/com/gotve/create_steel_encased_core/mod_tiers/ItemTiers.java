package com.gotve.create_steel_encased_core.mod_tiers;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

@SuppressWarnings("removal")
public class ItemTiers {

    public static final Tier COPPER_TIER = new Tier() {
        @Override public int getUses() { return 128; }
        @Override public float getSpeed() { return 4.0f; }
        @Override public float getAttackDamageBonus() { return 1.0f; }
        @Override public int getLevel() { return 1; }
        @Override public int getEnchantmentValue() { return 5; }
        @Override public Ingredient getRepairIngredient() {
            return Ingredient.of(ItemTags.create(new ResourceLocation("forge", "ingots/copper")));
        }
    };

    public static final Tier BRASS_TIER = new Tier() {
        @Override public int getUses() { return 256; }
        @Override public float getSpeed() { return 6.0f; }
        @Override public float getAttackDamageBonus() { return 2.0f; }
        @Override public int getLevel() { return 2; }
        @Override public int getEnchantmentValue() { return 10; }
        @Override public Ingredient getRepairIngredient() {
            return Ingredient.of(ItemTags.create(new ResourceLocation("forge", "ingots/brass")));
        }
    };

    public static final Tier NETHERSTEEL_TIER = new Tier() {
        @Override public int getUses() { return 1024; }
        @Override public float getSpeed() { return 9.0F; }
        @Override public float getAttackDamageBonus() { return 4.0F; }
        @Override public int getLevel() { return 4; }
        @Override public int getEnchantmentValue() { return 15; }
        @Override public Ingredient getRepairIngredient() {
            return Ingredient.of(ItemTags.create(new ResourceLocation("forge", "ingots/nethersteel")));
        }
    };
}
