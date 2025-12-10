package com.gotve.create_steel_encased_core;

import com.gotve.create_steel_encased_core.registry.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CreateSteelEncasedCore.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ForgeEvents {

    @SubscribeEvent
    public static void editCombatTabContents(BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey() == CreativeModeTabs.COMBAT) {

            // Copper
            event.getEntries().putAfter(
                    Items.CHAINMAIL_HELMET.getDefaultInstance(),
                    new ItemStack(ItemRegistry.COPPER_HELMET.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putAfter(
                    Items.CHAINMAIL_CHESTPLATE.getDefaultInstance(),
                    new ItemStack(ItemRegistry.COPPER_CHESTPLATE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putAfter(
                    Items.CHAINMAIL_LEGGINGS.getDefaultInstance(),
                    new ItemStack(ItemRegistry.COPPER_LEGGINGS.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putAfter(
                    Items.CHAINMAIL_BOOTS.getDefaultInstance(),
                    new ItemStack(ItemRegistry.COPPER_BOOTS.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putAfter(
                    Items.STONE_SWORD.getDefaultInstance(),
                    new ItemStack(ItemRegistry.COPPER_SWORD.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );

            // Brass
            event.getEntries().putAfter(
                    Items.IRON_HELMET.getDefaultInstance(),
                    new ItemStack(ItemRegistry.BRASS_HELMET.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putAfter(
                    Items.IRON_CHESTPLATE.getDefaultInstance(),
                    new ItemStack(ItemRegistry.BRASS_CHESTPLATE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putAfter(
                    Items.IRON_LEGGINGS.getDefaultInstance(),
                    new ItemStack(ItemRegistry.BRASS_LEGGINGS.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putAfter(
                    Items.IRON_BOOTS.getDefaultInstance(),
                    new ItemStack(ItemRegistry.BRASS_BOOTS.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putAfter(
                    Items.IRON_BOOTS.getDefaultInstance(),
                    new ItemStack(ItemRegistry.BRASS_SWORD.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );

            // Steel
            event.getEntries().putAfter(
                    Items.DIAMOND_HELMET.getDefaultInstance(),
                    new ItemStack(ItemRegistry.STEEL_HELMET.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putAfter(
                    Items.DIAMOND_CHESTPLATE.getDefaultInstance(),
                    new ItemStack(ItemRegistry.STEEL_CHESTPLATE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putAfter(
                    Items.DIAMOND_LEGGINGS.getDefaultInstance(),
                    new ItemStack(ItemRegistry.STEEL_LEGGINGS.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putAfter(
                    Items.DIAMOND_BOOTS.getDefaultInstance(),
                    new ItemStack(ItemRegistry.STEEL_BOOTS.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putAfter(
                    Items.DIAMOND_SWORD.getDefaultInstance(),
                    new ItemStack(ItemRegistry.STEEL_SWORD.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );

            // Nethersteel
            event.getEntries().putAfter(
                    Items.NETHERITE_HELMET.getDefaultInstance(),
                    new ItemStack(ItemRegistry.NETHERSTEEL_HELMET.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putAfter(
                    Items.NETHERITE_CHESTPLATE.getDefaultInstance(),
                    new ItemStack(ItemRegistry.NETHERSTEEL_CHESTPLATE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putAfter(
                    Items.NETHERITE_LEGGINGS.getDefaultInstance(),
                    new ItemStack(ItemRegistry.NETHERSTEEL_LEGGINGS.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putAfter(
                    Items.NETHERITE_BOOTS.getDefaultInstance(),
                    new ItemStack(ItemRegistry.NETHERSTEEL_BOOTS.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putAfter(
                    Items.NETHERITE_SWORD.getDefaultInstance(),
                    new ItemStack(ItemRegistry.NETHERSTEEL_SWORD.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
        }
    }
}
