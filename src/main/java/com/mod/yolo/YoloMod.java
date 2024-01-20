package com.mod.yolo;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

@Mod(modid = "yolomod", version = "1.1", name = "YOLO Mod")
public class YoloMod {

    public static final String MODID = "yolomod";
    public static final String VERSION = "1.1";
    public static final String NAME = "YOLO Mod";
    public static List<String> blockList = new ArrayList<String>();
    public static List<String> itemList = new ArrayList<String>();
    public static Block yoloblock;
    public static Item yoloitem;
    public static Block yoloore;
    public static Block yololog;
    public static Block yoloplanks;
    public static Block yololeaves;
    public static Block yolosapling;
    public static Item yolopickaxe;
    public static Item yoloaxe;
    public static Item yolohoe;
    public static Item yolosword;
    public static Item yoloshovel;
    public static CreativeTabs yolotab;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("Adding YOLO to Minecraft");
        yoloblock = new BlockYolo().setHardness(2.5f)
            .setResistance(7.5f)
            .setBlockName("yoloblock")
            .setCreativeTab(yolotab)
            .setStepSound(Block.soundTypePiston);
        GameRegistry.registerBlock(yoloblock, "yoloblock");
        blockList.add("yoloblock");
        yoloitem = new ItemYolo().setUnlocalizedName("yoloitem")
            .setCreativeTab(yolotab);
        GameRegistry.registerItem(yoloitem, "yoloitem");
        itemList.add("yoloitem");
        Object[] objectArray = new Object[5];
        objectArray[0] = "###";
        objectArray[1] = "###";
        objectArray[2] = "###";
        objectArray[3] = Character.valueOf('#');
        objectArray[4] = yoloitem;
        GameRegistry.addRecipe(new ItemStack(yoloblock, 1), objectArray);
        Object[] objectArray2 = new Object[3];
        objectArray2[0] = "#";
        objectArray2[1] = Character.valueOf('#');
        objectArray2[2] = yoloblock;
        GameRegistry.addRecipe(new ItemStack(yoloitem, 9), objectArray2);
        GameRegistry.addRecipe(
                new ItemStack(yoloitem, 7),
                new Object[]{"###", "###", " # ", Character.valueOf('#'), Items.redstone});
        yoloore = new BlockYoloOre().setBlockName("yoloore")
            .setCreativeTab(yolotab)
            .setHardness(3.0f)
            .setResistance(5.0f)
            .setStepSound(Block.soundTypePiston);
        GameRegistry.registerBlock(yoloore, "yoloore");
        blockList.add("yoloore");
        GameRegistry.addSmelting(yoloore, new ItemStack(yoloitem, 1), 2.0f);
        GameRegistry.registerWorldGenerator(new YOLOgen(), 1);
        yololog = new BlockYOLOlog().setBlockName("yololog")
            .setHardness(2.0f)
            .setResistance(5.0f)
            .setStepSound(Block.soundTypeWood)
            .setCreativeTab(yolotab);
        GameRegistry.registerBlock(yololog, "yololog");
        blockList.add("yololog");
        yoloplanks = new BlockYOLOplanks().setBlockName("yoloplanks")
            .setHardness(2.0f)
            .setResistance(5.0f)
            .setStepSound(Block.soundTypeWood)
            .setCreativeTab(yolotab);
        GameRegistry.registerBlock(yoloplanks, "yoloplanks");
        blockList.add("yoloplanks");
        Object[] objectArray3 = new Object[3];
        objectArray3[0] = "#";
        objectArray3[1] = Character.valueOf('#');
        objectArray3[2] = yololog;
        GameRegistry.addRecipe(new ItemStack(yoloplanks, 4), objectArray3);
        Object[] objectArray4 = new Object[4];
        objectArray4[0] = "#";
        objectArray4[1] = "#";
        objectArray4[2] = Character.valueOf('#');
        objectArray4[3] = yoloplanks;
        GameRegistry.addRecipe(new ItemStack(Items.stick, 4), objectArray4);
        Object[] objectArray5 = new Object[5];
        objectArray5[0] = "###";
        objectArray5[1] = "# #";
        objectArray5[2] = "###";
        objectArray5[3] = Character.valueOf('#');
        objectArray5[4] = yoloplanks;
        GameRegistry.addRecipe(new ItemStack(Blocks.chest, 1), objectArray5);
        Object[] objectArray6 = new Object[4];
        objectArray6[0] = "##";
        objectArray6[1] = "##";
        objectArray6[2] = Character.valueOf('#');
        objectArray6[3] = yoloplanks;
        GameRegistry.addRecipe(new ItemStack(Blocks.crafting_table, 1), objectArray6);
        yololeaves = new BlockYOLOleaves().setCreativeTab(yolotab)
            .setResistance(1.0f)
            .setStepSound(Block.soundTypeGrass)
            .setHardness(0.2f)
            .setBlockName("yololeaves");
        GameRegistry.registerBlock(yololeaves, "yololeaves");
        blockList.add("yololeaves");
        // todo fix sappling doesn't work : if i continue i will destroy my computer
        /*  yolosapling = new BlockYOLOSapling().setHardness(0.0f)
            .setResistance(0.1f)
            .setCreativeTab(yolotab)
            .setStepSound(Block.soundTypeGrass)
            .setBlockName("yolospaling");

      */
        GameRegistry.registerBlock(yolosapling, "yolosapling");
        blockList.add("yolosapling");
        yolopickaxe = new ItemYOLOpickaxe(Item.ToolMaterial.IRON).setUnlocalizedName("yolopickaxe")
            .setCreativeTab(yolotab);
        GameRegistry.registerItem(yolopickaxe, "yolopickaxe");
        itemList.add("yolopickaxe");
        Object[] objectArray7 = new Object[7];
        objectArray7[0] = "###";
        objectArray7[1] = " X ";
        objectArray7[2] = " X ";
        objectArray7[3] = Character.valueOf('#');
        objectArray7[4] = yoloitem;
        objectArray7[5] = Character.valueOf('X');
        objectArray7[6] = Items.stick;
        GameRegistry.addRecipe(new ItemStack(yolopickaxe, 1), objectArray7);
        yoloaxe = new ItemYOLOaxe(Item.ToolMaterial.IRON).setUnlocalizedName("yoloaxe")
            .setCreativeTab(yolotab);
        yolosword = new ItemYOLOsword(Item.ToolMaterial.IRON).setUnlocalizedName("yolosword")
            .setCreativeTab(yolotab);
        yoloshovel = new ItemYOLOshovel(Item.ToolMaterial.IRON).setUnlocalizedName("yoloshovel")
            .setCreativeTab(yolotab);
        yolohoe = new ItemYOLOhoe(Item.ToolMaterial.IRON).setUnlocalizedName("yolohoe")
            .setCreativeTab(yolotab);
        GameRegistry.registerItem(yoloaxe, "yoloaxe");
        GameRegistry.registerItem(yolosword, "yolosword");
        GameRegistry.registerItem(yoloshovel, "yoloshovel");
        GameRegistry.registerItem(yolohoe, "yolohoe");
        itemList.add("yoloaxe");
        itemList.add("yolosword");
        itemList.add("yoloshovel");
        itemList.add("yolohoe");
        Object[] objectArray8 = new Object[7];
        objectArray8[0] = "##";
        objectArray8[1] = "#X";
        objectArray8[2] = " X";
        objectArray8[3] = Character.valueOf('#');
        objectArray8[4] = yoloitem;
        objectArray8[5] = Character.valueOf('X');
        objectArray8[6] = Items.stick;
        GameRegistry.addRecipe(new ItemStack(yoloaxe, 1), objectArray8);
        Object[] objectArray9 = new Object[7];
        objectArray9[0] = "#";
        objectArray9[1] = "#";
        objectArray9[2] = "X";
        objectArray9[3] = Character.valueOf('#');
        objectArray9[4] = yoloitem;
        objectArray9[5] = Character.valueOf('X');
        objectArray9[6] = Items.stick;
        GameRegistry.addRecipe(new ItemStack(yolosword, 1), objectArray9);
        Object[] objectArray10 = new Object[7];
        objectArray10[0] = "#";
        objectArray10[1] = "X";
        objectArray10[2] = "X";
        objectArray10[3] = Character.valueOf('#');
        objectArray10[4] = yoloitem;
        objectArray10[5] = Character.valueOf('X');
        objectArray10[6] = Items.stick;
        GameRegistry.addRecipe(new ItemStack(yoloshovel, 1), objectArray10);
        Object[] objectArray11 = new Object[7];
        objectArray11[0] = "##";
        objectArray11[1] = " X";
        objectArray11[2] = " X";
        objectArray11[3] = Character.valueOf('#');
        objectArray11[4] = yoloitem;
        objectArray11[5] = Character.valueOf('X');
        objectArray11[6] = Items.stick;
        GameRegistry.addRecipe(new ItemStack(yolohoe, 1), objectArray11);
        if (FMLCommonHandler.instance()
            .getSide()
            .isClient()) {
            ClientProxy.preInit();
        }
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent evt) {
        ClientProxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent evt) {
        System.out.println("Added YOLO. Time to yolo around.");
    }

    public static Block getBlock(World w, int x, int y, int z, ChunkCoordinates pos) {
        return w.getBlock(x - pos.posX, y - pos.posY, z - pos.posZ);
    }

    public static void setBlock(World w, int x, int y, int z, ChunkCoordinates pos, Block b) {
        int newX = pos.posX + x - pos.posX;
        int newY = pos.posY + y - pos.posY;
        int newZ = pos.posZ + z - pos.posZ;

        w.setBlock(newX, newY, newZ, b);
    }

    static {
        yolotab = new CreativeTabs("YOLO") {

            @SideOnly(value = Side.CLIENT)
            public Item getTabIconItem() {
                return Item.getItemFromBlock(yoloblock);
            }
        };
    }
}
