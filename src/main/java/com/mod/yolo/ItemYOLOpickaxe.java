package com.mod.yolo;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.IIcon;

public class ItemYOLOpickaxe extends ItemPickaxe {

    public ItemYOLOpickaxe(Item.ToolMaterial mat) {
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
