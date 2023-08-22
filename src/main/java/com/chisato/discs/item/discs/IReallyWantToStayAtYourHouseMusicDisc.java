package com.chisato.discs.item.discs;

import com.chisato.discs.item.Handler.DiscSoundEventsHandler;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class IReallyWantToStayAtYourHouseMusicDisc extends RecordItem {

    public IReallyWantToStayAtYourHouseMusicDisc() {
        super(1, DiscSoundEventsHandler.I_REALLY_WANT_TO_STAY_AT_YOUR_HOUSE_MUSIC_DISC_EVENT,
                new Properties().stacksTo(1).rarity(Rarity.RARE), 8000);
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(Component.literal(
                "“我想帮你实现你的梦想，那就是我的梦想，只要能帮你达成，失去一切都无所谓!”"));
        list.add(Component.literal(
                "\"You called it a prison camp. To me, this city is a whole lot worse. I wanna go away. Far as possible.\""));
    }

}
