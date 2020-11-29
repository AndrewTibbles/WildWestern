package com.zombsta123.wildwestern.objects.items;

import com.zombsta123.wildwestern.WildWestern;
import com.zombsta123.wildwestern.init.ItemInit;
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
