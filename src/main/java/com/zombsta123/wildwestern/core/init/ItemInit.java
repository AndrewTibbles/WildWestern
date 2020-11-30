package com.zombsta123.wildwestern.core.init;

import java.util.ArrayList;
import java.util.List;

import com.zombsta123.wildwestern.common.items.EnchantedRubyApple;
import com.zombsta123.wildwestern.common.items.FoodBase;
import com.zombsta123.wildwestern.common.items.FuelBase;
import com.zombsta123.wildwestern.common.items.ItemBase;
import com.zombsta123.wildwestern.common.items.armor.ArmorBase;
import com.zombsta123.wildwestern.common.items.tools.ToolAxe;
import com.zombsta123.wildwestern.common.items.tools.ToolHoe;
import com.zombsta123.wildwestern.common.items.tools.ToolPickaxe;
import com.zombsta123.wildwestern.common.items.tools.ToolShovel;
import com.zombsta123.wildwestern.common.items.tools.ToolSword;
import com.zombsta123.wildwestern.core.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit
{
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Materials
    public static final ArmorMaterial ARMOR_RUBY = EnumHelper.addArmorMaterial("armor_ruby", Reference.MOD_ID + ":ruby", 1000, new int[] {3,5,7,3}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
    public static final ToolMaterial TOOL_RUBY = EnumHelper.addToolMaterial("tool_ruby", 2, 1000, 4.0f, 6.0f, 17);
    
    //Items
    public static final Item RUBY = new ItemBase("ruby");
    
    //Fuels
    public static final Item DENSE_COAL = new FuelBase("dense_coal", 5000);
    //Food
    public static final Item RUBY_APPLE = new FoodBase("ruby_apple", 4, 3.0f, false);
    public static final Item ENCHANTED_RUBY_APPLE = new EnchantedRubyApple("enchanted_ruby_apple", 8, 10.0f, false);
    //Tools
    public static final Item SWORD_RUBY = new ToolSword("ruby_sword", TOOL_RUBY);
    public static final Item PICKAXE_RUBY = new ToolPickaxe("ruby_pickaxe", TOOL_RUBY);
    public static final Item SHOVELRUBY = new ToolShovel("ruby_shovel", TOOL_RUBY);
    public static final Item AXE_RUBY = new ToolAxe("ruby_axe", TOOL_RUBY);
    public static final Item HOE_RUBY = new ToolHoe("ruby_hoe", TOOL_RUBY);
    
    //Armour
    public static final Item HELMET_RUBY = new ArmorBase("ruby_helmet", ARMOR_RUBY, 1, EntityEquipmentSlot.HEAD);
    public static final Item CHESTPLATE_RUBY = new ArmorBase("ruby_chestplate", ARMOR_RUBY, 1, EntityEquipmentSlot.CHEST);
    public static final Item LEGGINGS_RUBY = new ArmorBase("ruby_leggings", ARMOR_RUBY, 2, EntityEquipmentSlot.LEGS);
    public static final Item BOOTS_RUBY = new ArmorBase("ruby_boots", ARMOR_RUBY, 1, EntityEquipmentSlot.FEET);

}
