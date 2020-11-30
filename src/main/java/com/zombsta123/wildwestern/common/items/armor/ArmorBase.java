package com.zombsta123.wildwestern.common.items.armor;

import com.zombsta123.wildwestern.WildWestern;
import com.zombsta123.wildwestern.core.init.ItemInit;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor
{
    public ArmorBase(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot slot)
    {
    	super(material, renderIndex, slot);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(WildWestern.WILDWESTERNTAB);

        ItemInit.ITEMS.add(this);
    }
}
