package com.chisato.discs.item.Handler;

import com.chisato.discs.item.discs.illNeverBreakYourHeartMusicDisc;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.chisato.discs.Chisato_sMusicDiscs.MODID;

public class DiscSoundItems {
    public static final DeferredRegister<Item> ITEMS;

    public static final RegistryObject<Item> MUSIC_DISC_TEST;
    public static final RegistryObject<Item> ILL_NEVER_BREAK_YOUR_HEART_MUSIC_DISC_ITEM;

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public DiscSoundItems() {
    }

    static {
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

        MUSIC_DISC_TEST = ITEMS.register("music_disc_test", () -> {
            return new RecordItem(1, DiscSoundEvents.MUSIC_DISC_TEST_EVENT, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 8000);
        });

        ILL_NEVER_BREAK_YOUR_HEART_MUSIC_DISC_ITEM = ITEMS.register("ill_never_break_your_heart_music_disc", illNeverBreakYourHeartMusicDisc::new);
    }
}
