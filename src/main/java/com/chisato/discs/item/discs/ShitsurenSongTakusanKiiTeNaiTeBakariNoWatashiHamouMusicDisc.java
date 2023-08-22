package com.chisato.discs.item.discs;

import com.chisato.discs.handler.DiscSoundEventsHandler;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class ShitsurenSongTakusanKiiTeNaiTeBakariNoWatashiHamouMusicDisc extends RecordItem {

    public ShitsurenSongTakusanKiiTeNaiTeBakariNoWatashiHamouMusicDisc() {
        super(1, DiscSoundEventsHandler.SHITSUREN_SONG_TAKUSAN_KII_TE_NAI_TE_BAKARI_NO_WATASHI_HAMOU_MUSIC_DISC_EVENT,
                new Properties().stacksTo(1).rarity(Rarity.RARE), 8000);
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(Component.literal(
                "“我总感觉，如果这次不回来见她，以后就再也见不到了，所以我只是想再见她一面而已！”"));

    }
}
