package com.pigatto17.blockitemplus.item;

import com.pigatto17.blockitemplus.creativetab.CreativeTabBIPTools;
import net.minecraft.item.ItemSpade;

public class ObsidianShovel extends ItemSpade
{
    public ObsidianShovel(int i, ToolMaterial obsidianm)
    {
        super(obsidianm);
        this.setUnlocalizedName("obsidianShovel");
        this.setCreativeTab(CreativeTabBIPTools.BIP_TOOLS);
        this.setTextureName("blockitemplus:obsidianShovel");
    }
}
