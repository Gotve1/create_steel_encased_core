package com.gotve.create_steel_encased_core.registry;

import com.gotve.create_steel_encased_core.CreateSteelEncasedCore;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("removal")
public class CreativeTabRegistry {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateSteelEncasedCore.MOD_ID);

    public static final RegistryObject<CreativeModeTab> EQUIPMENT_TAB =
            CREATIVE_TABS.register("equipment_tab", () -> CreativeModeTab.builder()
                    .title(Component.literal("Equipment"))
                    .icon(() -> new ItemStack(ItemRegistry.BRASS_AXE.get()))
                    .displayItems((paramns, output) -> {
                        ItemRegistry.ITEMS_REGISTRY.getEntries().forEach(item -> {
                            output.accept(item.get());
                        });
                    })
                    .build()
            );


    public static void register(IEventBus bus) {
        CREATIVE_TABS.register(bus);
    }
}
