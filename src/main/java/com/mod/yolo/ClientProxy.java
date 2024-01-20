package com.mod.yolo;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import java.util.Arrays;

@SideOnly(Side.CLIENT)
public class ClientProxy {

    public static void preInit() {
    }

    public static void init() {
        for (String name : YoloMod.itemList) {
            Item item = GameRegistry.findItem("yolomod", name);
            ClientProxy.registerItem(item, "yolomod:" + name);
        }
        for (String name : YoloMod.blockList) {
            Item item = GameRegistry.findItem("yolomod", name);
            ClientProxy.registerItem(item, "yolomod:" + name);
        }
    }

    public static void registerItem(Item item, String itemName) {
        if (item instanceof IIconRegister) {
            ((IIconRegister) item)
                .registerIcon(Arrays.toString(new IIcon[]{((IIconRegister) item).registerIcon(itemName)}));
        }
    }
}
