package com.mod.yolo;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.Random;

public class BlockYOLOSapling extends BlockBush implements IGrowable {

    public BlockYOLOSapling() {
        super(Material.plants);
        float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        this.setTickRandomly(true);
    }

    @Override
    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
        return super.canPlaceBlockAt(world, x, y, z) && this.canBlockStay(world, x, y, z);
    }

    public boolean canBlockStay(World world, int x, int y, int z) {
        return world.getBlock(x, y - 1, z) == Blocks.grass;
    }

    protected void checkAndDropBlock(World world, int x, int y, int z) {
        if (!this.canBlockStay(world, x, y, z)) {
            this.dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
            world.setBlockToAir(x, y, z);
        }
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block neighborBlock) {
        super.onNeighborBlockChange(world, x, y, z, neighborBlock);
        this.checkAndDropBlock(world, x, y, z);
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        saplingIcon = iconRegister.registerIcon("yolomod:yolosapling");
    }

    private IIcon saplingIcon;

    @Override
    public IIcon getIcon(int side, int meta) {
        return saplingIcon;
    }

    @Override
    public boolean func_149851_a(World worldIn, int x, int y, int z, boolean isClient) {
        return worldIn.getBlockLightValue(x, y + 1, z) >= 9 && worldIn.getBlock(x, y - 1, z) == Blocks.grass;
    }

    @Override
    public boolean func_149852_a(World worldIn, Random random, int x, int y, int z) {
        return random.nextInt(10) == 0;
    }

    @Override
    public void func_149853_b(World worldIn, Random random, int x, int y, int z) {
        ChunkCoordinates blockPos = new ChunkCoordinates(x, y, z);

        if (random.nextInt(2) == 0 && !worldIn.isRemote) {
            int xOffset = blockPos.posX - 2;
            int zOffset = blockPos.posZ - 2;

            // Generate the tree directly in func_149853_b
            generateTree(worldIn, new ChunkCoordinates(xOffset, blockPos.posY, zOffset));
        }
    }

    private void generateTree(World world, ChunkCoordinates pos) {
        int i = pos.posX;
        int j = pos.posY;
        int k = pos.posZ;

        // Simple condition to check if there's enough space for the tree
        if (world.isAirBlock(i + 2, j - 1, k + 2)
            && world.isAirBlock(i + 3, j, k + 2)
            && world.isAirBlock(i, j + 5, k)
            && world.isAirBlock(i + 3, j + 5, k + 3)
            && world.isAirBlock(i - 3, j + 5, k + 3)
            && world.isAirBlock(i + 3, j + 5, k - 3)
            && world.isAirBlock(i - 3, j + 5, k - 3)) {
            YoloMod.setBlock(world, i, j + 2, k + 1, pos, YoloMod.yololeaves);
            YoloMod.setBlock(world, i, j + 2, k + 3, pos, YoloMod.yololeaves);
            YoloMod.setBlock(world, i + 1, j + 1, k + 2, pos, YoloMod.yololog);
            YoloMod.setBlock(world, i + 1, j + 2, k, pos, YoloMod.yololeaves);
            YoloMod.setBlock(world, i + 1, j + 2, k + 1, pos, YoloMod.yololeaves);
            YoloMod.setBlock(world, i + 1, j + 2, k + 2, pos, YoloMod.yololeaves);
            YoloMod.setBlock(world, i + 1, j + 2, k + 3, pos, YoloMod.yololeaves);
            YoloMod.setBlock(world, i + 1, j + 2, k + 4, pos, YoloMod.yololeaves);
            YoloMod.setBlock(world, i + 1, j + 3, k + 1, pos, YoloMod.yololeaves);
            YoloMod.setBlock(world, i + 1, j + 3, k + 3, pos, YoloMod.yololeaves);
            YoloMod.setBlock(world, i + 2, j, k + 2, pos, YoloMod.yololog);
            YoloMod.setBlock(world, i + 2, j + 1, k + 1, pos, YoloMod.yololog);
            YoloMod.setBlock(world, i + 2, j + 1, k + 2, pos, YoloMod.yololog);
            YoloMod.setBlock(world, i + 2, j + 1, k + 3, pos, YoloMod.yololog);
            YoloMod.setBlock(world, i + 2, j + 2, k + 1, pos, YoloMod.yololeaves);
            YoloMod.setBlock(world, i + 2, j + 2, k + 2, pos, YoloMod.yololeaves);
            YoloMod.setBlock(world, i + 2, j + 2, k + 3, pos, YoloMod.yololeaves);
            YoloMod.setBlock(world, i + 2, j + 3, k + 2, pos, YoloMod.yololeaves);
            YoloMod.setBlock(world, i + 2, j + 4, k + 2, pos, YoloMod.yololeaves);
            YoloMod.setBlock(world, i + 3, j + 1, k + 2, pos, YoloMod.yololog);
            YoloMod.setBlock(world, i + 3, j + 2, k, pos, YoloMod.yololeaves);
            YoloMod.setBlock(world, i + 3, j + 2, k + 1, pos, YoloMod.yololeaves);
            YoloMod.setBlock(world, i + 3, j + 2, k + 2, pos, YoloMod.yololeaves);
            YoloMod.setBlock(world, i + 3, j + 2, k + 3, pos, YoloMod.yololeaves);
            YoloMod.setBlock(world, i + 3, j + 2, k + 4, pos, YoloMod.yololeaves);
            YoloMod.setBlock(world, i + 3, j + 3, k + 1, pos, YoloMod.yololeaves);
            YoloMod.setBlock(world, i + 3, j + 3, k + 3, pos, YoloMod.yololeaves);
            YoloMod.setBlock(world, i + 4, j + 2, k + 1, pos, YoloMod.yololeaves);
            YoloMod.setBlock(world, i + 4, j + 2, k + 3, pos, YoloMod.yololeaves);
        }
    }
}
