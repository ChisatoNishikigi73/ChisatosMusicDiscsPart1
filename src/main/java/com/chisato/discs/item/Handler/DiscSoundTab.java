package com.chisato.discs.item.Handler;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.chisato.discs.Chisato_sMusicDiscs.MODID;

public class DiscSoundTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB_DEFERRED_REGISTER;
    public static RegistryObject<CreativeModeTab> CHISATOS_MUSIC_DISCS;

    public DiscSoundTab() {
    }

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB_DEFERRED_REGISTER.register(eventBus);
    }


    static {
        CREATIVE_MODE_TAB_DEFERRED_REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
        CHISATOS_MUSIC_DISCS = CREATIVE_MODE_TAB_DEFERRED_REGISTER.register("music_disc_group", () -> {
            return CreativeModeTab.builder().title(Component.keybind("Chisato's Music Discs")).icon(() -> {
                return new ItemStack(DiscSoundItems.ILL_NEVER_BREAK_YOUR_HEART_MUSIC_DISC_ITEM.get()); //icon
            }).displayItems((enabledFlags, populator) -> {
                populator.accept(DiscSoundItems.ILL_NEVER_BREAK_YOUR_HEART_MUSIC_DISC_ITEM.get());
                populator.accept(DiscSoundItems.MUSIC_DISC_TEST.get());
                    })
                    .build();

        });
    }
}
