package com.mod.yolo;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.util.IIcon;

public class ItemYOLOsword extends ItemSword {

    public ItemYOLOsword(Item.ToolMaterial mat) {
        super(mat);
    }
    private IIcon icon;

    @Override
    public void registerIcons(IIconRegister iconRegister) {
        this.icon = iconRegister.registerIcon("yolomod:yolosword");
    }

    @Override
    public IIcon getIconFromDamage(int damage) {
        return this.icon;
    }
}
