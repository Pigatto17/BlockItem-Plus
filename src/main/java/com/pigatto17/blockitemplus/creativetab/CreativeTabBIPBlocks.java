package com.pigatto17.blockitemplus.creativetab;

import com.pigatto17.blockitemplus.init.ModBlocks;
import com.pigatto17.blockitemplus.init.ModItems;
import com.pigatto17.blockitemplus.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabBIPBlocks
{
    public static final CreativeTabs BIP_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(ModBlocks.blockBlueSolid);
        }
    };
}