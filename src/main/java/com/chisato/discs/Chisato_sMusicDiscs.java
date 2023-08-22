package com.chisato.discs;

import com.chisato.discs.handler.DiscItemsHandler;
import com.chisato.discs.handler.DiscItemsTabHandler;
import com.chisato.discs.handler.DiscSoundEventsHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Chisato_sMusicDiscs.MODID)
public class Chisato_sMusicDiscs {
    public static final String MODID = "chisatos_music_discs";

    public Chisato_sMusicDiscs() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        DiscItemsHandler.register(modEventBus);
        DiscSoundEventsHandler.register(modEventBus);
        DiscItemsTabHandler.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
