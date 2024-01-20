package com.mod.yolo;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.util.IIcon;

public class ItemYOLOhoe extends ItemHoe {

    public ItemYOLOhoe(Item.ToolMaterial mat) {
        super(mat);
    }
    private IIcon icon;

    @Override
    public void registerIcons(IIconRegister iconRegister) {
        this.icon = iconRegister.registerIcon("yolomod:yolohoe");
    }

    @Override
    public IIcon getIconFromDamage(int damage) {
        return this.icon;
    }
}
