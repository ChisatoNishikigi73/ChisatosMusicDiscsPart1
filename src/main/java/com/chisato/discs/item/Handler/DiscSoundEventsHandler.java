package com.chisato.discs.item.Handler;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.chisato.discs.Chisato_sMusicDiscs.MODID;

public class DiscSoundEventsHandler {
    private static final DeferredRegister<SoundEvent> DISC_EVENTS;

    public static final RegistryObject<SoundEvent> MUSIC_DISC_TEST_EVENT;
    public static final RegistryObject<SoundEvent> ILL_NEVER_BREAK_YOUR_HEART_MUSIC_DISC_EVENT;
    public static final RegistryObject<SoundEvent> GOLDEN_HOUR_MUSIC_DISC_EVENT;
    public static final RegistryObject<SoundEvent> HU_DIE_MUSIC_DISC_EVENT;
    public static final RegistryObject<SoundEvent> I_REALLY_WANT_TO_STAY_AT_YOUR_HOUSE_MUSIC_DISC_EVENT;
    public static final RegistryObject<SoundEvent> KAI_NATSU_MUSIC_DISC_EVENT;
    public static final RegistryObject<SoundEvent> LA_GUO_GOU_DE_MUSIC_DISC_EVENT;
    public static final RegistryObject<SoundEvent> SACRED_PLAY_SECRET_PLACE_MUSIC_DISC_EVENT;
    public static final RegistryObject<SoundEvent> SHITSUREN_SONG_TAKUSAN_KII_TE_NAI_TE_BAKARI_NO_WATASHI_HAMOU_MUSIC_DISC_EVENT;

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return DISC_EVENTS.register(name, () -> SoundEvent.createFixedRangeEvent(new ResourceLocation(MODID, name), 75.0F));
    }

    public static void register(IEventBus eventBus) {
        DISC_EVENTS.register(eventBus);
    }

    static {
        DISC_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MODID);
        MUSIC_DISC_TEST_EVENT = registerSoundEvent("music_disc_test");
        ILL_NEVER_BREAK_YOUR_HEART_MUSIC_DISC_EVENT = registerSoundEvent("ill_never_break_your_heart");
        GOLDEN_HOUR_MUSIC_DISC_EVENT = registerSoundEvent("golden_hour");
        HU_DIE_MUSIC_DISC_EVENT = registerSoundEvent("hu_die");
        I_REALLY_WANT_TO_STAY_AT_YOUR_HOUSE_MUSIC_DISC_EVENT = registerSoundEvent("i_really_want_to_stay_at_your_house");
        KAI_NATSU_MUSIC_DISC_EVENT = registerSoundEvent("kai_natsu");
        LA_GUO_GOU_DE_MUSIC_DISC_EVENT = registerSoundEvent("la_guo_gou_de");
        SACRED_PLAY_SECRET_PLACE_MUSIC_DISC_EVENT = registerSoundEvent("sacred_play_secret_place");
        SHITSUREN_SONG_TAKUSAN_KII_TE_NAI_TE_BAKARI_NO_WATASHI_HAMOU_MUSIC_DISC_EVENT = registerSoundEvent("shitsuren_song_takusan_kii_te_nai_te_bakari_no_watashi_hamou");
    }
}
