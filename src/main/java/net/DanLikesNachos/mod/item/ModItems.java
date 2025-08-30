package net.DanLikesNachos.mod.item;

import net.DanLikesNachos.mod.Mod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod.MOD_ID);

    public static final DeferredItem<Item> ONYX = ITEMS.register("onyx",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_MITHRIL = ITEMS.register("raw_mithril",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ADAMANTITE = ITEMS.register("raw_adamantite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ADAMANTITE_INGOT = ITEMS.register("adamantite_ingot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
