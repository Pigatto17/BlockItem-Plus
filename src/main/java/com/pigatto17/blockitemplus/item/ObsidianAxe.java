package com.pigatto17.blockitemplus.item;

import com.pigatto17.blockitemplus.creativetab.CreativeTabBIPTools;
import net.minecraft.item.ItemAxe;

public class ObsidianAxe extends ItemAxe
{
    public ObsidianAxe(int i, ToolMaterial obsidianm)
    {
        super(obsidianm);
        this.setUnlocalizedName("obsidianAxe");
        this.setCreativeTab(CreativeTabBIPTools.BIP_TOOLS);
        this.setTextureName("blockitemplus:obsidianAxe");
    }
}
