package com.rngaming.createstellaris.items;

import com.rngaming.createstellaris.CreateStellaris;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class Items {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateStellaris.MODID);

    public static final DeferredItem<Item> ENGINEFANINCOMPLETE = ITEMS.register("enginefanincomplete", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROCKETENGINEINCOMPLETE = ITEMS.register("rocketengineincomplete", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROCKETINCOMPLETE = ITEMS.register("rocketincomplete", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
