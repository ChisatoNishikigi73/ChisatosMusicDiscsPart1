package com.chisato.discs.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;


public class DiscFragmentItem extends Item {
    public DiscFragmentItem() {
        super(new Properties().stacksTo(64).rarity(Rarity.COMMON));
    }
}
