package com.chisato.discs.item.discs;

import com.chisato.discs.item.Handler.DiscSoundEvents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class LaGuoGouDeMusicDisc extends RecordItem {

    public LaGuoGouDeMusicDisc() {
        super(1, DiscSoundEvents.LA_GUO_GOU_DE_MUSIC_DISC_EVENT,
                new Properties().stacksTo(1).rarity(Rarity.RARE), 8000);
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(Component.literal(
                "拉过勾的！"));

    }
}