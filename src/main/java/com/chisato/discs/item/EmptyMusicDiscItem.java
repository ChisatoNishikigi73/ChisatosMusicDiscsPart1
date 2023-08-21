package com.chisato.discs.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;


public class EmptyMusicDiscItem extends Item {
    public EmptyMusicDiscItem() {
        super(new Properties().stacksTo(1).rarity(Rarity.COMMON));
    }
}
