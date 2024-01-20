/*
 * Decompiled with CFR 0.152.
 * Could not load the following classes:
 * net.minecraft.block.Block
 * net.minecraft.block.material.Material
 * net.minecraft.block.state.IBlockState
 * net.minecraft.init.Blocks
 * net.minecraft.item.Item
 * net.minecraft.util.EnumWorldBlockLayer
 * net.minecraftforge.fml.relauncher.Side
 * net.minecraftforge.fml.relauncher.SideOnly
 */
package com.mod.yolo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockYOLOleaves extends Block {

    public BlockYOLOleaves() {
        super(Material.leaves);
    }

    public boolean isNormalCube() {
        return false;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    /*
     * @SideOnly(value= Side.CLIENT)
     * public EnumWorldBlockLayer getBlockLayer() {
     * return EnumWorldBlockLayer.CUTOUT;
     * }
     */

    public Item getItemDropped(int meta, Random random, int fortune) {
        int dropChance = random.nextInt(40);
        if (dropChance == 10 || dropChance == 20) {
            return YoloMod.yoloitem;
        }
        if (dropChance == 30) {
            return Item.getItemFromBlock(YoloMod.yolosapling);
        }
        return Item.getItemFromBlock(Blocks.air);
    }
    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("yolomod:yololeaves");
    }
}
