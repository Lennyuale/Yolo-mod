package com.mod.yolo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockYoloOre extends Block {

    public BlockYoloOre() {
        super(Material.rock);
        this.setHarvestLevel("pickaxe", 1);
    }

    public int quantityDropped(Random random) {
        return 1;
    }

    public Item getItemDropped(int meta, Random random, int fortune) {
        if (random.nextBoolean()) {
            return YoloMod.yoloitem;
        }
        return Item.getItemFromBlock(this);
    }
    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("yolomod:yoloore");
    }
}
