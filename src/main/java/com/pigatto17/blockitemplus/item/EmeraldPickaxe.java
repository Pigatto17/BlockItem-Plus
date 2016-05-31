package com.pigatto17.blockitemplus.item;

import com.pigatto17.blockitemplus.creativetab.CreativeTabBIPTools;
import net.minecraft.item.ItemPickaxe;

public class EmeraldPickaxe extends ItemPickaxe
{
    public EmeraldPickaxe(int i, ToolMaterial emeraldm)
{
    super(emeraldm);
    this.setUnlocalizedName("emeraldPickaxe");
    this.setCreativeTab(CreativeTabBIPTools.BIP_TOOLS);
    this.setTextureName("blockitemplus:emeraldPickaxe");
}
}
