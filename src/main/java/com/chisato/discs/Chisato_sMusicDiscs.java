package com.chisato.discs;

import com.chisato.discs.item.Handler.DiscSoundEvents;
import com.chisato.discs.item.Handler.DiscSoundItems;
import com.chisato.discs.item.Handler.DiscSoundTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Chisato_sMusicDiscs.MODID)
public class Chisato_sMusicDiscs {
    public static final String MODID = "chisatos_music_discs";

    public Chisato_sMusicDiscs() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        DiscSoundItems.register(modEventBus);
        DiscSoundEvents.register(modEventBus);
        DiscSoundTab.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
