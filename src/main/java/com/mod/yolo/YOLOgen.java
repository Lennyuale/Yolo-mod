package com.mod.yolo;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class YOLOgen implements IWorldGenerator {

    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
                         IChunkProvider chunkProvider) {
        if (world.provider.dimensionId == 0) {
            this.generateOverworld(world, random, chunkX * 16, chunkZ * 16);
        }
    }

    public void generateOverworld(World world, Random random, int chunkX, int chunkZ) {
        int Zcoord1;
        int Ycoord1;
        int Xcoord1;
        int i;

        for (i = 0; i < 10; ++i) {
            Xcoord1 = chunkX + random.nextInt(16);
            Ycoord1 = random.nextInt(26);
            Zcoord1 = chunkZ + random.nextInt(16);
            new WorldGenMinable(YoloMod.yoloore, 8).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
        }

        for (i = 0; i < 25; ++i) {
            Xcoord1 = chunkX + random.nextInt(16);
            Ycoord1 = random.nextInt(140);
            Zcoord1 = chunkZ + random.nextInt(16);
            new WorldGenYOLOtree().generate(world, new ChunkCoordinates(Xcoord1, Ycoord1, Zcoord1));
        }
    }
}
