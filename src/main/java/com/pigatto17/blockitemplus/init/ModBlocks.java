package com.pigatto17.blockitemplus.init;

import com.pigatto17.blockitemplus.block.*;
import com.pigatto17.blockitemplus.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockBIP blockBlueSolid = new BlockBlueSolid();
    public static final BlockBIP blockBlackSolid = new BlockBlackSolid();
    public static final BlockBIP blockCyanSolid = new BlockCyanSolid();
    public static final BlockBIP blockPinkSolid = new BlockPinkSolid();

    public static void init()
    {
        GameRegistry.registerBlock(blockBlueSolid, "blockBlueSolid");
        GameRegistry.registerBlock(blockBlackSolid, "blockBlackSolid");
        GameRegistry.registerBlock(blockCyanSolid, "blockCyanSolid");
        GameRegistry.registerBlock(blockPinkSolid, "blockPinkSolid");
    }
}
