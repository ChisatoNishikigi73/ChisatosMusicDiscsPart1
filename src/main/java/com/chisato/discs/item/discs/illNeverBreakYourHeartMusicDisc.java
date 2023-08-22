package com.chisato.discs.item.discs;

import com.chisato.discs.item.Handler.DiscSoundEventsHandler;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

import java.util.List;

public class illNeverBreakYourHeartMusicDisc extends RecordItem {

    public illNeverBreakYourHeartMusicDisc() {
        super(1, DiscSoundEventsHandler.ILL_NEVER_BREAK_YOUR_HEART_MUSIC_DISC_EVENT,
                new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 8000);
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(Component.literal(
                "是一名叫Kylinz的玩家最喜欢的歌曲"));

    }
}
