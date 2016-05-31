package com.pigatto17.blockitemplus.item;

import com.pigatto17.blockitemplus.creativetab.CreativeTabBIPTools;
import net.minecraft.item.ItemHoe;

public class EmeraldHoe extends ItemHoe
{
    public EmeraldHoe(int i, ToolMaterial emeraldm)
    {
        super(emeraldm);
        this.setUnlocalizedName("emeraldHoe");
        this.setCreativeTab(CreativeTabBIPTools.BIP_TOOLS);
        this.setTextureName("blockitemplus:emeraldHoe");
    }
}
