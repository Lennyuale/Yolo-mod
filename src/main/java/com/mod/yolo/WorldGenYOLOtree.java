/*
 * Decompiled with CFR 0.152.
 * Could not load the following classes:
 * net.minecraft.init.Blocks
 * net.minecraft.util.BlockPos
 * net.minecraft.world.World
 */
package com.mod.yolo;

import net.minecraft.init.Blocks;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;

public class WorldGenYOLOtree {

    public boolean generate(World world, ChunkCoordinates pos) {
        int k;
        int j;
        int i = pos.posX;
        if (YoloMod.getBlock(world, i + 2, (j = pos.posY) - 1, (k = pos.posZ) + 2, pos) == Blocks.grass
            && YoloMod.getBlock(world, i + 3, j, k + 2, pos) == Blocks.air
            && YoloMod.getBlock(world, i, j + 5, k, pos) == Blocks.air
            && YoloMod.getBlock(world, i + 3, j + 5, k + 3, pos) == Blocks.air
            && YoloMod.getBlock(world, i - 3, j + 5, k + 3, pos) == Blocks.air
            && YoloMod.getBlock(world, i + 3, j + 5, k - 3, pos) == Blocks.air
            && YoloMod.getBlock(world, i - 3, j + 5, k - 3, pos) == Blocks.air) {
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
        return true;
    }
}
