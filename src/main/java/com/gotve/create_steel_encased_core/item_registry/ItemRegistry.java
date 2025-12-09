package com.gotve.create_steel_encased_core.item_registry;

import com.gotve.create_steel_encased_core.mod_tiers.ItemTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {

    public static final DeferredRegister<Item> MINECRAFT_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");


    /// //////////////////////////
    ///      Copper Tier       ///
    /// //////////////////////////
    public static final RegistryObject<Item> STONE_AXE = MINECRAFT_ITEMS.register("stone_axe",
            () -> new AxeItem(ItemTiers.COPPER_TIER, 7.0F, -3.2F, new Item.Properties())
    );

    public static final RegistryObject<Item> STONE_SWORD = MINECRAFT_ITEMS.register("stone_sword",
            () -> new SwordItem(ItemTiers.COPPER_TIER, 3, -2.4f, new Item.Properties())
    );

    public static final RegistryObject<Item> STONE_HOE = MINECRAFT_ITEMS.register("stone_hoe",
            () -> new HoeItem(ItemTiers.COPPER_TIER, -1, -2.0F, new Item.Properties())
    );

    public static final RegistryObject<Item> STONE_PICKAXE = MINECRAFT_ITEMS.register("stone_pickaxe",
            () -> new PickaxeItem(ItemTiers.COPPER_TIER, 1, -2.8F, new Item.Properties())
    );

    public static final RegistryObject<Item> STONE_SHOVEL = MINECRAFT_ITEMS.register("stone_shovel",
            () -> new ShovelItem(ItemTiers.COPPER_TIER, 1.5F, -3.0F, new Item.Properties())
    );



    /// //////////////////////////
    ///       Brass tier       ///
    /// //////////////////////////
    public static final RegistryObject<Item> BRASS_AXE = MINECRAFT_ITEMS.register("iron_axe",
            () -> new AxeItem(ItemTiers.BRASS_TIER, 6.0F, -3.1F, new Item.Properties())
    );

    public static final RegistryObject<Item> BRASS_SWORD = MINECRAFT_ITEMS.register("iron_sword",
            () -> new SwordItem(ItemTiers.BRASS_TIER, 3, -2.4F, new Item.Properties())
    );

    public static final RegistryObject<Item> BRASS_HOE = MINECRAFT_ITEMS.register("iron_hoe",
            () -> new HoeItem(ItemTiers.BRASS_TIER, -2, -1.0F, new Item.Properties())
    );

    public static final RegistryObject<Item> BRASS_PICKAXE = MINECRAFT_ITEMS.register("iron_pickaxe",
            () -> new PickaxeItem(ItemTiers.BRASS_TIER, 1, -2.8F, new Item.Properties())
    );

    public static final RegistryObject<Item> BRASS_SHOVEL = MINECRAFT_ITEMS.register("iron_shovel",
            () -> new ShovelItem(ItemTiers.BRASS_TIER, 1.5F, -3.0F, new Item.Properties())
    );


    /// //////////////////////////
    ///       Steel tier       ///
    /// //////////////////////////
    public static final RegistryObject<Item> STEEL_AXE = MINECRAFT_ITEMS.register("diamond_axe",
            () -> new AxeItem(ItemTiers.STEEL_TIER, 5.0F, -3.0F, new Item.Properties())
    );

    public static final RegistryObject<Item> STEEL_SWORD = MINECRAFT_ITEMS.register("diamond_sword",
            () -> new SwordItem(ItemTiers.STEEL_TIER, 3, -2.4F, new Item.Properties())
    );

    public static final RegistryObject<Item> STEEL_HOE = MINECRAFT_ITEMS.register("diamond_hoe",
            () -> new HoeItem(ItemTiers.STEEL_TIER, -3, 0.0F, new Item.Properties())
    );

    public static final RegistryObject<Item> STEEL_PICKAXE = MINECRAFT_ITEMS.register("diamond_pickaxe",
            () -> new PickaxeItem(ItemTiers.STEEL_TIER, 1, -2.8F, new Item.Properties())
    );

    public static final RegistryObject<Item> STEEL_SHOVEL = MINECRAFT_ITEMS.register("diamond_shovel",
            () -> new ShovelItem(ItemTiers.STEEL_TIER, 1.5F, -3.0F, new Item.Properties())
    );


    /// //////////////////////////
    ///     Nethersteel tier   ///
    /// //////////////////////////
    public static final RegistryObject<Item> NETHERSTEEL_AXE = MINECRAFT_ITEMS.register("netherite_axe",
            () -> new AxeItem(ItemTiers.NETHERSTEEL_TIER, 5.0F, -3.0F, new Item.Properties())
    );

    public static final RegistryObject<Item> NETHERSTEEL_SWORD = MINECRAFT_ITEMS.register("netherite_sword",
            () -> new SwordItem(ItemTiers.NETHERSTEEL_TIER, 3, -2.4F, new Item.Properties())
    );

    public static final RegistryObject<Item> NETHERSTEEL_HOE = MINECRAFT_ITEMS.register("netherite_hoe",
            () -> new HoeItem(ItemTiers.NETHERSTEEL_TIER, -3, 0.0F, new Item.Properties())
    );

    public static final RegistryObject<Item> NETHERSTEEL_PICKAXE = MINECRAFT_ITEMS.register("netherite_pickaxe",
            () -> new PickaxeItem(ItemTiers.NETHERSTEEL_TIER, 1, -2.8F, new Item.Properties())
    );

    public static final RegistryObject<Item> NETHERSTEEL_SHOVEL = MINECRAFT_ITEMS.register("netherite_shovel",
            () -> new ShovelItem(ItemTiers.NETHERSTEEL_TIER, 1.5F, -3.0F, new Item.Properties())
    );


    @SuppressWarnings("removal")
    public static void register(IEventBus bus) {
        MINECRAFT_ITEMS.register(bus);
    }
}
