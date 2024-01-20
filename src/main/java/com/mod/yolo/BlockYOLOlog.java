package com.mod.yolo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import java.util.Random;

public class BlockYOLOlog extends Block {

    private IIcon[] icons = new IIcon[2];

    public BlockYOLOlog() {
        super(Material.wood);
        this.setTickRandomly(true);
        this.setHarvestLevel("axe", 0);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(this);
    }

    @Override
    public int quantityDropped(Random random) {
        return 1;
    }

    @Override
    public int quantityDroppedWithBonus(int fortune, Random random) {
        if (fortune > 0) {
            int bonus = random.nextInt(fortune + 2) - 1;
            return this.quantityDropped(random) + bonus;
        } else {
            return this.quantityDropped(random);
        }
    }

    @Override
    public void dropBlockAsItemWithChance(net.minecraft.world.World world, int x, int y, int z, int metadata,
                                          float chance, int fortune) {
        super.dropBlockAsItemWithChance(world, x, y, z, metadata, chance, fortune);
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.icons[0] = iconRegister.registerIcon("yolomod:yololog_side");

        this.icons[1] = iconRegister.registerIcon("yolomod:yololog_top");
    }

    @Override
    public IIcon getIcon(int side, int metadata) {
        if (side == 0 || side == 1) {
            return this.icons[1];
        } else {
            return this.icons[0];
        }
    }
}
