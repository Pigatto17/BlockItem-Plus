package com.pigatto17.blockitemplus.item;

import com.pigatto17.blockitemplus.creativetab.CreativeTabBIPTools;
import net.minecraft.item.ItemSword;

public class EmeraldSword extends ItemSword
{
    public EmeraldSword(int i, ToolMaterial emeraldm)
    {
        super(emeraldm);
        this.setUnlocalizedName("emeraldSword");
        this.setCreativeTab(CreativeTabBIPTools.BIP_TOOLS);
        this.setTextureName("blockitemplus:emeraldSword");
    }
}
