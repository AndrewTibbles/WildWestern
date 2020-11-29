package com.zombsta123.wildwestern;

import com.zombsta123.wildwestern.proxy.CommonProxy;
import com.zombsta123.wildwestern.util.Reference;
import com.zombsta123.wildwestern.util.handlers.RegistryHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.MOD_NAME)
public class WildWestern
{
    @Mod.Instance
    public static WildWestern Instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        RegistryHandler.preInitRegistries();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        RegistryHandler.initRegistries();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        RegistryHandler.postInitRegistries();
    }

    @Mod.EventHandler
    public void ServerInit(FMLServerStartingEvent event)
    {
        RegistryHandler.serverRegistries();
    }
}
