package com.chisato.discs.item.discs;

import com.chisato.discs.handler.DiscSoundEventsHandler;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class AdvancementItem extends RecordItem {
    public AdvancementItem() {
        super(1, DiscSoundEventsHandler.ILL_NEVER_BREAK_YOUR_HEART_MUSIC_DISC_EVENT,
                new Properties().stacksTo(1).rarity(Rarity.RARE), 8000);
    }
}
