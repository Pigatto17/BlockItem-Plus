package com.pigatto17.blockitemplus.item;

import com.pigatto17.blockitemplus.creativetab.CreativeTabBIPTools;
import net.minecraft.item.ItemHoe;

public class ObsidianHoe extends ItemHoe
{
    public ObsidianHoe(int i, ToolMaterial obsidianm)
    {
        super(obsidianm);
        this.setUnlocalizedName("obsidianHoe");
        this.setCreativeTab(CreativeTabBIPTools.BIP_TOOLS);
        this.setTextureName("blockitemplus:obsidianHoe");
    }
}
