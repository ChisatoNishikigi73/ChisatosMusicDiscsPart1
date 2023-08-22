
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.chisato.discs.init;

import com.chisato.discs.Chisato_sMusicDiscs;
import com.chisato.discs.item.DiscFragmentItem;
import com.chisato.discs.item.EmptyMusicDiscItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class CreatedMusicDiscsModItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Chisato_sMusicDiscs.MODID);
    public static final RegistryObject<Item> DISC_FRAGMENT = REGISTRY.register("disc_fragment", DiscFragmentItem::new);
    public static final RegistryObject<Item> EMPTY_MUSIC_DISC = REGISTRY.register("empty_music_disc", EmptyMusicDiscItem::new);
//    public static final RegistryObject<Item> ILL_NEVER_BREAK_YOUR_HEART_MUSIC_DISC = REGISTRY.register("ill_never_break_your_heart_music_disc", illNeverBreakYourHeartMusicDisc::new);


    public static void addCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(DISC_FRAGMENT);
            event.accept(EMPTY_MUSIC_DISC);
//        event.accept(ILL_NEVER_BREAK_YOUR_HEART_MUSIC_DISC);
        }
    }


}
