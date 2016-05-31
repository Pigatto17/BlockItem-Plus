package com.pigatto17.blockitemplus.item;

import com.pigatto17.blockitemplus.creativetab.CreativeTabBIPTools;
import net.minecraft.item.ItemPickaxe;

public class DiamondObsidianPickaxe extends ItemPickaxe
{
    public DiamondObsidianPickaxe(int i, ToolMaterial DiamondObsidianm)
    {
        super(DiamondObsidianm);
        this.setUnlocalizedName("diamondInfusedObsidianPickaxe");
        this.setCreativeTab(CreativeTabBIPTools.BIP_TOOLS);
        this.setTextureName("blockitemplus:diamondInfusedObsidianPickaxe");
    }
}
