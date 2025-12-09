package com.gotve.create_steel_encased_core.item_registry;

import com.gotve.create_steel_encased_core.mod_tiers.ModTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {

    public static final DeferredRegister<Item> MINECRAFT_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");


    /// //////////////////////////
    ///      Copper Tier      ///
    /// //////////////////////////
    public static final RegistryObject<Item> STONE_AXE = MINECRAFT_ITEMS.register("stone_axe",
            () -> new AxeItem(ModTiers.COPPER_TIER, 7.0F, -3.2F, new Item.Properties())
    );

    public static final RegistryObject<Item> STONE_SWORD = MINECRAFT_ITEMS.register("stone_sword",
            () -> new SwordItem(ModTiers.COPPER_TIER, 3, -2.4f, new Item.Properties())
    );

    public static final RegistryObject<Item> STONE_HOE = MINECRAFT_ITEMS.register("stone_hoe",
            () -> new HoeItem(ModTiers.COPPER_TIER, -1, -2.0F, new Item.Properties())
    );

    public static final RegistryObject<Item> STONE_PICKAXE = MINECRAFT_ITEMS.register("stone_pickaxe",
            () -> new PickaxeItem(ModTiers.COPPER_TIER, 1, -2.8F, new Item.Properties())
    );

    public static final RegistryObject<Item> STONE_SHOVEL = MINECRAFT_ITEMS.register("stone_shovel",
            () -> new ShovelItem(ModTiers.COPPER_TIER, 1.5F, -3.0F, new Item.Properties())
    );


    /// //////////////////////////
    ///       Brass tier      ///
    /// //////////////////////////
    public static final RegistryObject<Item> BRASS_AXE = MINECRAFT_ITEMS.register("iron_axe",
            () -> new AxeItem(ModTiers.BRASS_TIER, 6.0F, -3.1F, new Item.Properties())
    );

    public static final RegistryObject<Item> BRASS_SWORD = MINECRAFT_ITEMS.register("iron_sword",
            () -> new SwordItem(ModTiers.BRASS_TIER, 3, -2.4F, new Item.Properties())
    );

    public static final RegistryObject<Item> BRASS_HOE = MINECRAFT_ITEMS.register("iron_hoe",
            () -> new HoeItem(ModTiers.BRASS_TIER, -2, -1.0F, new Item.Properties())
    );

    public static final RegistryObject<Item> BRASS_PICKAXE = MINECRAFT_ITEMS.register("iron_pickaxe",
            () -> new PickaxeItem(ModTiers.BRASS_TIER, 1, -2.8F, new Item.Properties())
    );

    public static final RegistryObject<Item> BRASS_SHOVEL = MINECRAFT_ITEMS.register("iron_shovel",
            () -> new ShovelItem(ModTiers.BRASS_TIER, 1.5F, -3.0F, new Item.Properties())
    );


    @SuppressWarnings("removal")
    public static void register(IEventBus bus) {
        MINECRAFT_ITEMS.register(bus);
    }
}
