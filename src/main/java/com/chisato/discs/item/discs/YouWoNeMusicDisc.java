package com.chisato.discs.item.discs;

import com.chisato.discs.handler.DiscSoundEventsHandler;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class YouWoNeMusicDisc extends RecordItem {

    public YouWoNeMusicDisc() {
        super(1, DiscSoundEventsHandler.YOU_WO_NE_MUSIC_DISC_EVENT,
                new Properties().stacksTo(1).rarity(Rarity.EPIC), 8000);
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(Component.literal(
                "“都入冬了还执着于盛夏的蝉鸣吗”"));

    }
}
