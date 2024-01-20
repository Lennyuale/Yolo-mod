package com.mod.yolo;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.util.IIcon;

public class ItemYOLOaxe extends ItemAxe {

    public ItemYOLOaxe(Item.ToolMaterial mat) {
        super(mat);
    }
    private IIcon icon;

    @Override
    public void registerIcons(IIconRegister iconRegister) {
        this.icon = iconRegister.registerIcon("yolomod:yolopickaxe");
    }

    @Override
    public IIcon getIconFromDamage(int damage) {
        return this.icon;
    }
}
