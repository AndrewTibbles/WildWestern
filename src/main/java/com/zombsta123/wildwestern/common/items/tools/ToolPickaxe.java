package com.zombsta123.wildwestern.common.items.tools;

import com.zombsta123.wildwestern.WildWestern;
import com.zombsta123.wildwestern.core.init.ItemInit;

import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe
{
    public ToolPickaxe(String name, ToolMaterial material)
    {
    	super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(WildWestern.WILDWESTERNTAB);

        ItemInit.ITEMS.add(this);
    }
}
