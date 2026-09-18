package com.rngaming.createstellaris.items;


import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

public class SpaceHelmetGoggles {


    public boolean hasOxygen(ItemStack stack) {
        return true;
    }
    public int getAir(ItemStack stack) {
        return 1000;
    }

    public int getMaxAir(ItemStack stack) {
        return 1000;
    }

    public boolean isAirtight(ItemStack stack) {
        return true;
    }

    public boolean isAirtight() {
        return true;
    }
}