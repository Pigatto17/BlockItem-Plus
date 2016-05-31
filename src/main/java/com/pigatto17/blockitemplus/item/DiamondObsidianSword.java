package com.pigatto17.blockitemplus.item;

import com.pigatto17.blockitemplus.creativetab.CreativeTabBIPTools;
import net.minecraft.item.ItemSword;

public class DiamondObsidianSword extends ItemSword
{
    public DiamondObsidianSword(int i, ToolMaterial DiamondObsidianm)
    {
        super(DiamondObsidianm);
        this.setUnlocalizedName("diamondInfusedObsidianSword");
        this.setCreativeTab(CreativeTabBIPTools.BIP_TOOLS);
        this.setTextureName("blockitemplus:diamondInfusedObsidianSword");
    }
}
