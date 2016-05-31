package com.pigatto17.blockitemplus;

import com.pigatto17.blockitemplus.configuration.ConfigurationHandler;
import com.pigatto17.blockitemplus.init.ModBlocks;
import com.pigatto17.blockitemplus.init.ModItems;
import com.pigatto17.blockitemplus.init.Recipies;
import com.pigatto17.blockitemplus.proxy.IProxy;
import com.pigatto17.blockitemplus.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class BlockItemPlus
{
    @Mod.Instance(Reference.MOD_ID)
    public static BlockItemPlus instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        ModItems.init();
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipies.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
