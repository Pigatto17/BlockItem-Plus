package com.pigatto17.blockitemplus.item;

import com.pigatto17.blockitemplus.creativetab.CreativeTabBIPTools;
import net.minecraft.item.ItemHoe;

public class DiamondObsidianHoe extends ItemHoe
{
    public DiamondObsidianHoe(int i, ToolMaterial DiamondObsidianm)
    {
        super(DiamondObsidianm);
        this.setUnlocalizedName("diamondInfusedObsidianHoe");
        this.setCreativeTab(CreativeTabBIPTools.BIP_TOOLS);
        this.setTextureName("blockitemplus:diamondInfusedObsidianHoe");
    }
}
