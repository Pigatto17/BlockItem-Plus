package com.pigatto17.blockitemplus.creativetab;

import com.pigatto17.blockitemplus.init.ModBlocks;
import com.pigatto17.blockitemplus.init.ModItems;
import com.pigatto17.blockitemplus.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBIPTools
{
    public static final CreativeTabs BIP_TOOLS = new CreativeTabs(Reference.MOD_ID + 1)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.EmeraldPickaxe;
        }
    };
}
