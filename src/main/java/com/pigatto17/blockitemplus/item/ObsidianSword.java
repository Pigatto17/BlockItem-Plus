package com.pigatto17.blockitemplus.item;

import com.pigatto17.blockitemplus.creativetab.CreativeTabBIPTools;
import net.minecraft.item.ItemSword;

public class ObsidianSword extends ItemSword
{
    public ObsidianSword(int i, ToolMaterial obsidianm)
    {
        super(obsidianm);
        this.setUnlocalizedName("obsidianSword");
        this.setCreativeTab(CreativeTabBIPTools.BIP_TOOLS);
        this.setTextureName("blockitemplus:obsidianSword");
    }
}

