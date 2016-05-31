package com.pigatto17.blockitemplus.item;

import com.pigatto17.blockitemplus.creativetab.CreativeTabBIPTools;
import net.minecraft.item.ItemPickaxe;

public class ObsidianPickaxe extends ItemPickaxe
{
    public ObsidianPickaxe(int i, ToolMaterial obsidianm)
    {
        super(obsidianm);
        this.setUnlocalizedName("obsidianPickaxe");
        this.setCreativeTab(CreativeTabBIPTools.BIP_TOOLS);
        this.setTextureName("blockitemplus:obsidianPickaxe");
    }
}
