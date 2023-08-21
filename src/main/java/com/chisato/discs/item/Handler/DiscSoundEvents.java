package com.chisato.discs.item.Handler;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.chisato.discs.Chisato_sMusicDiscs.MODID;

public class DiscSoundEvents {
    private static final DeferredRegister<SoundEvent> DISC_EVENTS;

    public static final RegistryObject<SoundEvent> MUSIC_DISC_TEST_EVENT;
    public static final RegistryObject<SoundEvent> ILL_NEVER_BREAK_YOUR_HEART_MUSIC_DISC_EVENT;

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return DISC_EVENTS.register(name, () -> {
            return SoundEvent.createFixedRangeEvent(new ResourceLocation(MODID, name), 75.0F);
        });
    }

    public static void register(IEventBus eventBus) {
        DISC_EVENTS.register(eventBus);
    }

    static {
        DISC_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MODID);
        ILL_NEVER_BREAK_YOUR_HEART_MUSIC_DISC_EVENT = registerSoundEvent("ill_never_break_your_heart");
        MUSIC_DISC_TEST_EVENT = registerSoundEvent("music_disc_test");
    }
}
