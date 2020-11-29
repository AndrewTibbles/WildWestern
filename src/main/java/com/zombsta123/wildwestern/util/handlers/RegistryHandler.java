package com.zombsta123.wildwestern.util.handlers;

import com.zombsta123.wildwestern.WildWestern;
import com.zombsta123.wildwestern.init.BlockInit;
import com.zombsta123.wildwestern.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler
{
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event)
    {
        for(Item item : ItemInit.ITEMS)
        {
            WildWestern.proxy.registerItemRenderer(item, 0, "inventory");
        }

        for(Block block : BlockInit.BLOCKS)
        {
            WildWestern.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
        }
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }

    public static void preInitRegistries()
    {

    }

    public static void initRegistries()
    {
        WildWestern.proxy.render();
    }

    public static void postInitRegistries()
    {

    }

    public static void serverRegistries()
    {

    }
}
