package com.pigatto17.blockitemplus.item;

import com.pigatto17.blockitemplus.creativetab.CreativeTabBIPTools;
import net.minecraft.item.ItemAxe;

public class EmeraldAxe extends ItemAxe
{
    public EmeraldAxe(int i, ToolMaterial emeraldm)
    {
        super(emeraldm);
        this.setUnlocalizedName("emeraldAxe");
        this.setCreativeTab(CreativeTabBIPTools.BIP_TOOLS);
        this.setTextureName("blockitemplus:emeraldAxe");
    }
}
