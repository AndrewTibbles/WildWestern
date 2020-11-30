package com.zombsta123.wildwestern.common.items;

import com.zombsta123.wildwestern.WildWestern;
import com.zombsta123.wildwestern.core.init.ItemInit;

import net.minecraft.item.Item;

public class ItemBase extends Item
{
    public ItemBase(String name)
    {
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(WildWestern.WILDWESTERNTAB);

        ItemInit.ITEMS.add(this);
    }
}
