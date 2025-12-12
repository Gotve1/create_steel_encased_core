package com.gotve.create_steel_encased_core.registry;

import com.gotve.create_steel_encased_core.CreateSteelEncasedCore;
import com.gotve.create_steel_encased_core.mod_tiers.ItemTiers;
import com.gotve.create_steel_encased_core.mod_tiers.ModMaterials;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("removal")
public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS_REGISTRY =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateSteelEncasedCore.MOD_ID);


    /// //////////////////////////
    ///       Brass Tools      ///
    /// //////////////////////////
    public static final RegistryObject<Item> BRASS_AXE = ITEMS_REGISTRY.register("brass_axe",
            () -> new AxeItem(ItemTiers.BRASS_TIER, 6.0F, -3.1F, new Item.Properties())
    );
    public static final RegistryObject<Item> BRASS_AXE_HEAD = ITEMS_REGISTRY.register("brass_axe_head",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> BRASS_SWORD = ITEMS_REGISTRY.register("brass_sword",
            () -> new SwordItem(ItemTiers.BRASS_TIER, 3, -2.4F, new Item.Properties())
    );
    public static final RegistryObject<Item> BRASS_SWORD_BLADE = ITEMS_REGISTRY.register("brass_sword_blade",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> BRASS_HOE = ITEMS_REGISTRY.register("brass_hoe",
            () -> new HoeItem(ItemTiers.BRASS_TIER, -2, -1.0F, new Item.Properties())
    );
    public static final RegistryObject<Item> BRASS_HOE_HEAD = ITEMS_REGISTRY.register("brass_hoe_head",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> BRASS_PICKAXE = ITEMS_REGISTRY.register("brass_pickaxe",
            () -> new PickaxeItem(ItemTiers.BRASS_TIER, 1, -2.8F, new Item.Properties())
    );
    public static final RegistryObject<Item> BRASS_PICKAXE_HEAD = ITEMS_REGISTRY.register("brass_pickaxe_head",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> BRASS_SHOVEL = ITEMS_REGISTRY.register("brass_shovel",
            () -> new ShovelItem(ItemTiers.BRASS_TIER, 1.5F, -3.0F, new Item.Properties())
    );
    public static final RegistryObject<Item> BRASS_SHOVEL_HEAD = ITEMS_REGISTRY.register("brass_shovel_head",
            () -> new Item(new Item.Properties())
    );


    /// //////////////////////////
    ///       Brass Armour      ///
    /// //////////////////////////
    public static final RegistryObject<ArmorItem> BRASS_HELMET = ITEMS_REGISTRY.register("brass_helmet",
            () -> new ArmorItem(ModMaterials.BRASS, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<ArmorItem> BRASS_CHESTPLATE = ITEMS_REGISTRY.register("brass_chestplate",
            () -> new ArmorItem(ModMaterials.BRASS, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<ArmorItem> BRASS_LEGGINGS = ITEMS_REGISTRY.register("brass_leggings",
            () -> new ArmorItem(ModMaterials.BRASS, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<ArmorItem> BRASS_BOOTS = ITEMS_REGISTRY.register("brass_boots",
            () -> new ArmorItem(ModMaterials.BRASS, ArmorItem.Type.BOOTS, new Item.Properties()));


    /// //////////////////////////
    ///     Nethersteel tier   ///
    /// //////////////////////////
    public static final RegistryObject<Item> NETHERSTEEL_AXE = ITEMS_REGISTRY.register("nethersteel_axe",
            () -> new AxeItem(ItemTiers.NETHERSTEEL_TIER, 5.0F, -3.0F, new Item.Properties())
    );

    public static final RegistryObject<Item> NETHERSTEEL_SWORD = ITEMS_REGISTRY.register("nethersteel_sword",
            () -> new SwordItem(ItemTiers.NETHERSTEEL_TIER, 3, -2.4F, new Item.Properties())
    );

    public static final RegistryObject<Item> NETHERSTEEL_HOE = ITEMS_REGISTRY.register("nethersteel_hoe",
            () -> new HoeItem(ItemTiers.NETHERSTEEL_TIER, -3, 0.0F, new Item.Properties())
    );

    public static final RegistryObject<Item> NETHERSTEEL_PICKAXE = ITEMS_REGISTRY.register("nethersteel_pickaxe",
            () -> new PickaxeItem(ItemTiers.NETHERSTEEL_TIER, 1, -2.8F, new Item.Properties())
    );

    public static final RegistryObject<Item> NETHERSTEEL_SHOVEL = ITEMS_REGISTRY.register("nethersteel_shovel",
            () -> new ShovelItem(ItemTiers.NETHERSTEEL_TIER, 1.5F, -3.0F, new Item.Properties())
    );
    /// //////////////////////////
    ///   Nethersteel Armour   ///
    /// //////////////////////////
    public static final RegistryObject<ArmorItem> NETHERSTEEL_HELMET = ITEMS_REGISTRY.register("nethersteel_helmet",
            () -> new ArmorItem(ModMaterials.NETHERSTEEL, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<ArmorItem> NETHERSTEEL_CHESTPLATE = ITEMS_REGISTRY.register("nethersteel_chestplate",
            () -> new ArmorItem(ModMaterials.NETHERSTEEL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<ArmorItem> NETHERSTEEL_LEGGINGS = ITEMS_REGISTRY.register("nethersteel_leggings",
            () -> new ArmorItem(ModMaterials.NETHERSTEEL, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<ArmorItem> NETHERSTEEL_BOOTS = ITEMS_REGISTRY.register("nethersteel_boots",
            () -> new ArmorItem(ModMaterials.NETHERSTEEL, ArmorItem.Type.BOOTS, new Item.Properties()));


    @SuppressWarnings("removal")
    public static void register(IEventBus bus) {
        ITEMS_REGISTRY.register(bus);
    }
}
