package com.pigatto17.blockitemplus.creativetab;

import com.pigatto17.blockitemplus.init.ModItems;
import com.pigatto17.blockitemplus.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBIPItems
{
    public static final CreativeTabs BIP_ITEMS = new CreativeTabs(Reference.MOD_ID + 2)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.diamondStick;
        }
    };
}
