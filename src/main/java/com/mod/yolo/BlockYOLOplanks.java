package com.mod.yolo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockYOLOplanks extends Block {

    public BlockYOLOplanks() {
        super(Material.wood);
        this.setHarvestLevel("axe", 0);
    }
    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("yolomod:yoloplanks");
    }
}
