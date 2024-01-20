package com.mod.yolo;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.util.IIcon;

public class ItemYOLOshovel extends ItemSpade {

    public ItemYOLOshovel(Item.ToolMaterial mat) {
        super(mat);
    }
    private IIcon icon;

    @Override
    public void registerIcons(IIconRegister iconRegister) {
        this.icon = iconRegister.registerIcon("yolomod:yoloshovel");
    }

    @Override
    public IIcon getIconFromDamage(int damage) {
        return this.icon;
    }
}
