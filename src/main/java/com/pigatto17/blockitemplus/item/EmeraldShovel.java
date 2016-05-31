package com.pigatto17.blockitemplus.item;

import com.pigatto17.blockitemplus.creativetab.CreativeTabBIPTools;
import net.minecraft.item.ItemSpade;

public class EmeraldShovel extends ItemSpade
{
    public EmeraldShovel(int i, ToolMaterial emeraldm)
    {
        super(emeraldm);
        this.setUnlocalizedName("emeraldShovel");
        this.setCreativeTab(CreativeTabBIPTools.BIP_TOOLS);
        this.setTextureName("blockitemplus:emeraldShovel");
    }
}
