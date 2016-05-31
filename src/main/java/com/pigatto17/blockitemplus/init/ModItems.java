package com.pigatto17.blockitemplus.init;

import com.pigatto17.blockitemplus.item.*;
import com.pigatto17.blockitemplus.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
//Items
    public static final ItemBIP diamondStick = new ItemDiamondStick();
    public static final ItemBIP diamondIngot = new ItemDiamondIngot();
    public static final ItemBIP obsidianIngot = new ItemObsidianIngot();
    public static final ItemBIP ingotInducingCompound = new ItemIngotInducingCompound();
    public static final ItemBIP diamondCompound = new ItemDiamondCompound();
    public static final ItemBIP obsidianCompound = new ItemObsidianCompound();
    public static final ItemBIP rawDiamondInfusedObsidianCompound = new ItemRawDiamondInfusedObsidian();
    public static final ItemBIP diamondInfusedObsidianCompound = new ItemDiamondInfusedObsidianCompound();
    public static final ItemBIP compoundInducingIngot = new ItemCompoundInducingIngot();
    public static final ItemBIP diamondInfusedObsidianIngot = new ItemDiamondInfusedObsidianIngot();
//Tool Materials
    public static Item.ToolMaterial emeraldm = EnumHelper.addToolMaterial("EmeraldM", 3, 2000, 10.0F, 4.0F, 22);
    public static Item.ToolMaterial obsidianm = EnumHelper.addToolMaterial("ObsidianM", 3, 3000, 12.0F, 8.0F, 22);
    public static Item.ToolMaterial diamondObsidianm = EnumHelper.addToolMaterial("DiamondObsidianM", 3, 8000, 20.0f, 28.0F, 30);
//Emerald Tools
    public final static Item EmeraldPickaxe = new EmeraldPickaxe(5000, emeraldm);
    public final static Item EmeraldShovel = new EmeraldShovel(5000, emeraldm);
    public final static Item EmeraldAxe = new EmeraldAxe(5000, emeraldm);
    public final static Item EmeraldSword = new EmeraldSword(5000, emeraldm);
    public final static Item EmeraldHoe = new EmeraldHoe(5000, emeraldm);
//Obsidian Tools
    public final static Item ObsidianPickaxe = new ObsidianPickaxe(5000, obsidianm);
    public final static Item ObsidianShovel = new ObsidianShovel(5000, obsidianm);
    public final static Item ObsidianAxe = new ObsidianAxe(5000, obsidianm);
    public final static Item ObsidianSword = new ObsidianSword(5000, obsidianm);
    public final static Item ObsidianHoe = new ObsidianHoe(5000, obsidianm);
//Diamond Obsidian Tools
    public final static Item DiamondInfusedObsidianSword = new DiamondObsidianSword(5000, diamondObsidianm);
    public final static Item DiamondInfusedObsidianPickaxe = new DiamondObsidianPickaxe(5000, diamondObsidianm);
    public final static Item DiamondInfusedObsidianAxe = new DiamondObsidianAxe(5000, diamondObsidianm);
    public final static Item DiamondInfusedObsidianShovel = new DiamondObsidianShovel(5000, diamondObsidianm);

    public static void init()
    {
//Items
        GameRegistry.registerItem(diamondStick, "diamondStick");
        GameRegistry.registerItem(diamondIngot, "diamondIngot");
        GameRegistry.registerItem(obsidianIngot, "obsidianIngot");
        GameRegistry.registerItem(ingotInducingCompound, "ingotInducingCompound");
        GameRegistry.registerItem(diamondCompound, "diamondCompound");
        GameRegistry.registerItem(obsidianCompound, "obsidianCompound");
        GameRegistry.registerItem(rawDiamondInfusedObsidianCompound, "rawDiamondInfusedObsidianCompound");
        GameRegistry.registerItem(diamondInfusedObsidianCompound, "diamondInfusedObsidianCompound");
        GameRegistry.registerItem(compoundInducingIngot, "compoundInducingIngot");
        GameRegistry.registerItem(diamondInfusedObsidianIngot, "diamondInfusedObsidianIngot");
//EmeraldToolsRegistry
        GameRegistry.registerItem(EmeraldPickaxe, "emeraldPickaxe");
        GameRegistry.registerItem(EmeraldShovel, "emeraldShovel");
        GameRegistry.registerItem(EmeraldAxe, "emeraldAxe");
        GameRegistry.registerItem(EmeraldSword, "emeraldSword");
        GameRegistry.registerItem(EmeraldHoe, "emeraldHoe");
//ObsidianToolsRegistry
        GameRegistry.registerItem(ObsidianPickaxe, "obsidianPickaxe");
        GameRegistry.registerItem(ObsidianShovel, "obsidianShovel");
        GameRegistry.registerItem(ObsidianAxe, "obsidianAxe");
        GameRegistry.registerItem(ObsidianSword, "obsidianSword");
        GameRegistry.registerItem(ObsidianHoe, "obsidianHoe");
//DiamondObsidianToolsRegistry
        GameRegistry.registerItem(DiamondInfusedObsidianSword, "diamondInfusedObsidianSword");
        GameRegistry.registerItem(DiamondInfusedObsidianPickaxe, "diamondInfusedObsidianPickaxe");
        GameRegistry.registerItem(DiamondInfusedObsidianAxe, "diamondInfusedObsidianAxe");
        GameRegistry.registerItem(DiamondInfusedObsidianShovel, "diamondInfusedObsidianShovel");
    }
}
