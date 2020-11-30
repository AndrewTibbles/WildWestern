package com.zombsta123.wildwestern.core.handlers;

import com.zombsta123.wildwestern.WildWestern;
import com.zombsta123.wildwestern.core.init.BlockInit;
import com.zombsta123.wildwestern.core.init.ItemInit;
import com.zombsta123.wildwestern.core.recipes.CraftingRecipes;
import com.zombsta123.wildwestern.core.recipes.SmeltingRecipes;
import com.zombsta123.wildwestern.core.world.gen.WorldGenOres;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
        GameRegistry.registerWorldGenerator(new WorldGenOres(), 0);
    }

    public static void initRegistries()
    {
    	CraftingRecipes.init();
    	SmeltingRecipes.init();
        WildWestern.proxy.render();
    }

    public static void postInitRegistries()
    {

    }

    public static void serverRegistries()
    {

    }
}
