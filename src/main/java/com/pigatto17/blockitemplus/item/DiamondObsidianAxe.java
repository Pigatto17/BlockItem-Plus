package com.pigatto17.blockitemplus.item;

import com.pigatto17.blockitemplus.creativetab.CreativeTabBIPTools;
import net.minecraft.item.ItemAxe;

public class DiamondObsidianAxe extends ItemAxe
{
    public DiamondObsidianAxe(int i, ToolMaterial DiamondObsidianm)
    {
        super(DiamondObsidianm);
        this.setUnlocalizedName("diamondInfusedObsidianAxe");
        this.setCreativeTab(CreativeTabBIPTools.BIP_TOOLS);
        this.setTextureName("blockitemplus:diamondInfusedObsidianAxe");
    }
}
