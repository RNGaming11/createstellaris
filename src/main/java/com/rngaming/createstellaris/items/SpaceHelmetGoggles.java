package com.rngaming.createstellaris.items;

import com.st0x0ef.stellaris.common.items.armors.AbstractSpaceArmor;
import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

public class SpaceHelmetGoggles extends AbstractSpaceArmor {

    public SpaceHelmetGoggles(Holder<ArmorMaterial> material, ArmorItem.Type type, Properties properties) {
        super(material, type, properties, true);
    }

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