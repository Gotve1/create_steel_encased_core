package com.gotve.create_steel_encased_core;

import com.gotve.create_steel_encased_core.registry.ItemRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("removal")
@Mod.EventBusSubscriber(modid = CreateSteelEncasedCore.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ForgeEvents {

    @SubscribeEvent
    public static void editCombatTabContents(BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey().equals(CreativeModeTabs.COMBAT)) {

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
                    Items.IRON_SWORD.getDefaultInstance(),
                    new ItemStack(ItemRegistry.BRASS_SWORD.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );

            // Steel
            ResourceLocation TFMG_STEEL_HELMET = new ResourceLocation("tfmg", "steel_helmet");
            Item STEEL_HELMET = ForgeRegistries.ITEMS.getValue(TFMG_STEEL_HELMET);
            event.getEntries().putAfter(
                    Items.DIAMOND_HELMET.getDefaultInstance(),
                    new ItemStack(STEEL_HELMET),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            ResourceLocation TFMG_STEEL_CHESTPLATE = new ResourceLocation("tfmg", "steel_chestplate");
            Item STEEL_CHESTPLATE = ForgeRegistries.ITEMS.getValue(TFMG_STEEL_CHESTPLATE);
            event.getEntries().putAfter(
                    Items.DIAMOND_CHESTPLATE.getDefaultInstance(),
                    new ItemStack(STEEL_CHESTPLATE),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            ResourceLocation TFMG_STEEL_LEGGINGS = new ResourceLocation("tfmg", "steel_leggings");
            Item STEEL_LEGGINGS = ForgeRegistries.ITEMS.getValue(TFMG_STEEL_LEGGINGS);
            event.getEntries().putAfter(
                    Items.DIAMOND_LEGGINGS.getDefaultInstance(),
                    new ItemStack(STEEL_LEGGINGS),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            ResourceLocation TFMG_STEEL_BOOTS = new ResourceLocation("tfmg", "steel_boots");
            Item STEEL_BOOTS = ForgeRegistries.ITEMS.getValue(TFMG_STEEL_BOOTS);
            event.getEntries().putAfter(
                    Items.DIAMOND_BOOTS.getDefaultInstance(),
                    new ItemStack(STEEL_BOOTS),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            ResourceLocation TFMG_STEEL_SWORD = new ResourceLocation("tfmg", "steel_sword");
            Item STEEL_SWORD = ForgeRegistries.ITEMS.getValue(TFMG_STEEL_SWORD);
            event.getEntries().putAfter(
                    Items.DIAMOND_SWORD.getDefaultInstance(),
                    new ItemStack(STEEL_SWORD),
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

        if (event.getTabKey().equals(CreativeModeTabs.TOOLS_AND_UTILITIES)) {

            // Brass tools
            event.getEntries().putAfter(
                    Items.IRON_SHOVEL.getDefaultInstance(),
                    new ItemStack(ItemRegistry.BRASS_SHOVEL.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putAfter(
                    Items.IRON_PICKAXE.getDefaultInstance(),
                    new ItemStack(ItemRegistry.BRASS_PICKAXE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putAfter(
                    Items.IRON_AXE.getDefaultInstance(),
                    new ItemStack(ItemRegistry.BRASS_AXE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putAfter(
                    Items.IRON_HOE.getDefaultInstance(),
                    new ItemStack(ItemRegistry.BRASS_HOE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );

            // Steel
            ResourceLocation TFMG_STEEL_SHOVEL = new ResourceLocation("tfmg", "steel_shovel");
            Item STEEL_SHOVEL = ForgeRegistries.ITEMS.getValue(TFMG_STEEL_SHOVEL);
            event.getEntries().putAfter(
                    Items.DIAMOND_SHOVEL.getDefaultInstance(),
                    new ItemStack(STEEL_SHOVEL),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            ResourceLocation TFMG_STEEL_PICKAXE = new ResourceLocation("tfmg", "steel_pickaxe");
            Item STEEL_PICKAXE = ForgeRegistries.ITEMS.getValue(TFMG_STEEL_PICKAXE);
            event.getEntries().putAfter(
                    Items.DIAMOND_PICKAXE.getDefaultInstance(),
                    new ItemStack(STEEL_PICKAXE),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            ResourceLocation TFMG_STEEL_AXE = new ResourceLocation("tfmg", "steel_axe");
            Item STEEL_AXE = ForgeRegistries.ITEMS.getValue(TFMG_STEEL_AXE);
            event.getEntries().putAfter(
                    Items.DIAMOND_AXE.getDefaultInstance(),
                    new ItemStack(STEEL_AXE),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            ResourceLocation TFMG_STEEL_HOE = new ResourceLocation("tfmg", "steel_hoe");
            Item STEEL_HOE = ForgeRegistries.ITEMS.getValue(TFMG_STEEL_HOE);
            event.getEntries().putAfter(
                    Items.DIAMOND_HOE.getDefaultInstance(),
                    new ItemStack(STEEL_HOE),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );

            // Nethersteel
            event.getEntries().putAfter(
                    Items.NETHERITE_SHOVEL.getDefaultInstance(),
                    new ItemStack(ItemRegistry.NETHERSTEEL_SHOVEL.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putAfter(
                    Items.NETHERITE_PICKAXE.getDefaultInstance(),
                    new ItemStack(ItemRegistry.NETHERSTEEL_PICKAXE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putAfter(
                    Items.NETHERITE_AXE.getDefaultInstance(),
                    new ItemStack(ItemRegistry.NETHERSTEEL_AXE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putAfter(
                    Items.NETHERITE_HOE.getDefaultInstance(),
                    new ItemStack(ItemRegistry.NETHERSTEEL_HOE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );

            // Minecarts
            ResourceLocation CREATE_BENCHCART = new ResourceLocation("railways", "benchcart");
            Item BENCHCART = ForgeRegistries.ITEMS.getValue(CREATE_BENCHCART);
            event.getEntries().putAfter(
                    Items.CHEST_MINECART.getDefaultInstance(),
                    new ItemStack(BENCHCART),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );

            ResourceLocation CREATE_JUKEBOX = new ResourceLocation("railways", "jukeboxcart");
            Item JUKEBOX = ForgeRegistries.ITEMS.getValue(CREATE_JUKEBOX);
            event.getEntries().putAfter(
                    Items.CHEST_MINECART.getDefaultInstance(),
                    new ItemStack(JUKEBOX),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );

            ResourceLocation CREATE_MINECART_COUPLER = new ResourceLocation("create", "minecart_coupling");
            Item MINECART_COUPLER = ForgeRegistries.ITEMS.getValue(CREATE_MINECART_COUPLER);
            event.getEntries().putAfter(
                    Items.ACTIVATOR_RAIL.getDefaultInstance(),
                    new ItemStack(MINECART_COUPLER),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );

            // Rails
            ResourceLocation CREATE_CONTROLLER_RAIL = new ResourceLocation("create", "controller_rail");
            Item CONTROLLER_RAIL = ForgeRegistries.ITEMS.getValue(CREATE_CONTROLLER_RAIL);
            event.getEntries().putAfter(
                    Items.POWERED_RAIL.getDefaultInstance(),
                    new ItemStack(CONTROLLER_RAIL),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
        }
    }
}
