package com.gotve.create_steel_encased_core;


import com.gotve.create_steel_encased_core.registry.CreativeTabRegistry;
import com.gotve.create_steel_encased_core.registry.ItemRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@SuppressWarnings("removal")
@Mod(CreateSteelEncasedCore.MOD_ID)
public class CreateSteelEncasedCore {

    public static final String MOD_ID = "create_steel_encased_core";

    IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

    public CreateSteelEncasedCore() {

        ItemRegistry.register(bus);
        CreativeTabRegistry.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
