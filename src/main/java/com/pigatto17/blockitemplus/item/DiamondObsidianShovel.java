package com.pigatto17.blockitemplus.item;

import com.pigatto17.blockitemplus.creativetab.CreativeTabBIPTools;
import net.minecraft.item.ItemSpade;

public class DiamondObsidianShovel extends ItemSpade
{
    public DiamondObsidianShovel(int i, ToolMaterial DiamondObsidianm)
    {
        super(DiamondObsidianm);
        this.setUnlocalizedName("diamondInfusedObsidianShovel");
        this.setCreativeTab(CreativeTabBIPTools.BIP_TOOLS);
        this.setTextureName("blockitemplus:diamondInfusedObsidianShovel");
    }
}
