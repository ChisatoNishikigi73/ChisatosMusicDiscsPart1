package com.chisato.discs.item.discs;

import com.chisato.discs.item.Handler.DiscSoundEventsHandler;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class SacredPlaySecretPlaceMusicDisc extends RecordItem {

    public SacredPlaySecretPlaceMusicDisc() {
        super(1, DiscSoundEventsHandler.SACRED_PLAY_SECRET_PLACE_MUSIC_DISC_EVENT,
                new Properties().stacksTo(1).rarity(Rarity.RARE), 8000);
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(Component.literal(
                "“我从未觉得孤独，我听见我的身体里刮起一阵狂风，说的浪漫点，我完全自由“"));

    }
}
