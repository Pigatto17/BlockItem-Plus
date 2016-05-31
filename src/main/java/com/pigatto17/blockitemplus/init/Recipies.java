package com.pigatto17.blockitemplus.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipies
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldPickaxe),"eee", " s ", " s ", 's', new ItemStack(Items.stick), 'e', new ItemStack(Items.emerald));
        GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldShovel)," e ", " s ", " s ", 's', new ItemStack(Items.stick), 'e', new ItemStack(Items.emerald));
        GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldAxe),"ee ", "es ", " s ", 's', new ItemStack(Items.stick), 'e', new ItemStack(Items.emerald));
        GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldSword),"e  ", "e  ", "s  ", 's', new ItemStack(Items.stick), 'e', new ItemStack(Items.emerald));
        GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldSword)," e ", " e ", " s ", 's', new ItemStack(Items.stick), 'e', new ItemStack(Items.emerald));
        GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldSword),"  e", "  e", "  s", 's', new ItemStack(Items.stick), 'e', new ItemStack(Items.emerald));
        GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldHoe),"ee ", " s ", " s ", 's', new ItemStack(Items.stick), 'e', new ItemStack(Items.emerald));
        GameRegistry.addRecipe(new ItemStack(ModItems.diamondStick),"   ", " d ", " d ", 'd', new ItemStack(Items.diamond));
        GameRegistry.addRecipe(new ItemStack(ModItems.diamondIngot),"ddd", "ddd", "   ", 'd', new ItemStack(Items.diamond));
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianIngot),"ooo", "ooo", "   ", 'o', new ItemStack(Blocks.obsidian));
        GameRegistry.addRecipe(new ItemStack(ModItems.ingotInducingCompound),"ddd", "dod", "ddd", 'o', new ItemStack(Blocks.obsidian), 'd', new ItemStack(Items.diamond));
        GameRegistry.addRecipe(new ItemStack(ModItems.diamondCompound),"ddd", "dod", "ddd", 'o', new ItemStack(ModItems.ingotInducingCompound), 'd', new ItemStack(ModItems.diamondIngot));
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianCompound),"ddd", "dod", "ddd", 'o', new ItemStack(ModItems.ingotInducingCompound), 'd', new ItemStack(ModItems.obsidianIngot));
        GameRegistry.addRecipe(new ItemStack(ModItems.rawDiamondInfusedObsidianCompound),"dod", "odo", "dod", 'o', new ItemStack(ModItems.obsidianCompound), 'd', new ItemStack(ModItems.diamondCompound));
        GameRegistry.addSmelting(ModItems.rawDiamondInfusedObsidianCompound, new ItemStack(ModItems.diamondInfusedObsidianCompound), 1.0f);
        GameRegistry.addRecipe(new ItemStack(ModItems.compoundInducingIngot),"odo", "odo", "   ", 'o', new ItemStack(Blocks.obsidian), 'd', new ItemStack(Items.diamond));
        GameRegistry.addRecipe(new ItemStack(ModItems.diamondInfusedObsidianIngot),"ccc", "cic", "ccc", 'i', new ItemStack(ModItems.compoundInducingIngot), 'c', new ItemStack(ModItems.diamondInfusedObsidianCompound));
        GameRegistry.addRecipe(new ItemStack(ModItems.DiamondInfusedObsidianPickaxe),"ddd", " s ", " s ", 'd', new ItemStack(ModItems.diamondInfusedObsidianIngot), 's', new ItemStack(ModItems.diamondStick));
        GameRegistry.addRecipe(new ItemStack(ModItems.DiamondInfusedObsidianAxe),"dd ", "ds ", " s ", 'd', new ItemStack(ModItems.diamondInfusedObsidianIngot), 's', new ItemStack(ModItems.diamondStick));
        GameRegistry.addRecipe(new ItemStack(ModItems.DiamondInfusedObsidianShovel)," d ", " s ", " s ", 'd', new ItemStack(ModItems.diamondInfusedObsidianIngot), 's', new ItemStack(ModItems.diamondStick));
        GameRegistry.addRecipe(new ItemStack(ModItems.DiamondInfusedObsidianHoe),"dd ", " s ", " s ", 'd', new ItemStack(ModItems.diamondInfusedObsidianIngot), 's', new ItemStack(ModItems.diamondStick));
        GameRegistry.addRecipe(new ItemStack(ModItems.DiamondInfusedObsidianSword),"d  ", "d  ", "s  ", 'd', new ItemStack(ModItems.diamondInfusedObsidianIngot), 's', new ItemStack(ModItems.diamondStick));
        GameRegistry.addRecipe(new ItemStack(ModItems.DiamondInfusedObsidianSword)," d ", " d ", " s ", 'd', new ItemStack(ModItems.diamondInfusedObsidianIngot), 's', new ItemStack(ModItems.diamondStick));
        GameRegistry.addRecipe(new ItemStack(ModItems.DiamondInfusedObsidianSword),"  d", "  d", "  s", 'd', new ItemStack(ModItems.diamondInfusedObsidianIngot), 's', new ItemStack(ModItems.diamondStick));
        GameRegistry.addRecipe(new ItemStack(ModItems.coalMixture),"ccc", "c c", "ccc", 'c', new ItemStack(Items.coal));
        GameRegistry.addSmelting(ModItems.coalMixture, new ItemStack(ModItems.compressedCoalChunk), 0.5f);
    }
}
