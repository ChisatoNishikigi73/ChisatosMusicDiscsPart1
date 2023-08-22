package com.chisato.discs.handler;

import com.chisato.discs.item.discs.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.chisato.discs.Chisato_sMusicDiscs.MODID;

public class DiscItemsHandler {
    public static final DeferredRegister<Item> ITEMS;

    public static final RegistryObject<Item> MUSIC_DISC_TEST;
    public static final RegistryObject<Item> ILL_NEVER_BREAK_YOUR_HEART_MUSIC_DISC_ITEM;
    public static final RegistryObject<Item> GOLDEN_HOUR_MUSIC_DISC_ITEM;
    public static final RegistryObject<Item> HU_DIE_MUSIC_DISC_ITEM;
    public static final RegistryObject<Item> I_REALLY_WANT_TO_STAY_AT_YOUR_HOUSE_MUSIC_DISC_ITEM;
    public static final RegistryObject<Item> KAI_NATSU_MUSIC_DISC_ITEM;
    public static final RegistryObject<Item> LA_GUO_GOU_DE_MUSIC_DISC_ITEM;
    public static final RegistryObject<Item> SACRED_PLAY_SECRET_PLACE_MUSIC_DISC_ITEM;
    public static final RegistryObject<Item> SHITSUREN_SONG_TAKUSAN_KII_TE_NAI_TE_BAKARI_NO_WATASHI_HAMOU_MUSIC_DISC_ITEM;

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    static {
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

        MUSIC_DISC_TEST = ITEMS.register("music_disc_test", () -> new RecordItem(1, DiscSoundEventsHandler.MUSIC_DISC_TEST_EVENT, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 8000));

        ILL_NEVER_BREAK_YOUR_HEART_MUSIC_DISC_ITEM = ITEMS.register("ill_never_break_your_heart_music_disc", illNeverBreakYourHeartMusicDisc::new);
        GOLDEN_HOUR_MUSIC_DISC_ITEM = ITEMS.register("golden_hour_music_disc", GoldenHourMusicDisc::new);
        HU_DIE_MUSIC_DISC_ITEM = ITEMS.register("hu_die_music_disc", HuDieMusicDisc::new);
        I_REALLY_WANT_TO_STAY_AT_YOUR_HOUSE_MUSIC_DISC_ITEM = ITEMS.register("i_really_want_to_stay_at_your_house_music_disc", IReallyWantToStayAtYourHouseMusicDisc::new);
        KAI_NATSU_MUSIC_DISC_ITEM = ITEMS.register("kai_natsu_music_disc", KaiNatsuMusicDisc::new);
        LA_GUO_GOU_DE_MUSIC_DISC_ITEM = ITEMS.register("la_guo_gou_de_music_disc", LaGuoGouDeMusicDisc::new);
        SACRED_PLAY_SECRET_PLACE_MUSIC_DISC_ITEM = ITEMS.register("sacred_play_secret_place_music_disc", SacredPlaySecretPlaceMusicDisc::new);
        SHITSUREN_SONG_TAKUSAN_KII_TE_NAI_TE_BAKARI_NO_WATASHI_HAMOU_MUSIC_DISC_ITEM = ITEMS.register("shitsuren_song_takusan_kii_te_nai_te_bakari_no_watashi_hamou_music_disc", ShitsurenSongTakusanKiiTeNaiTeBakariNoWatashiHamouMusicDisc::new);
    }

    public DiscItemsHandler() {
    }
}
