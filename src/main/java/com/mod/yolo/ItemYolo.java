package com.mod.yolo;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class ItemYolo extends Item {
    private IIcon icon;

    @Override
    public void registerIcons(IIconRegister iconRegister) {
        this.icon = iconRegister.registerIcon("yolomod:yoloitem");
    }

    @Override
    public IIcon getIconFromDamage(int damage) {
        return this.icon;
    }
}
