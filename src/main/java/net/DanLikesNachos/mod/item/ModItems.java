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
    public static final DeferredItem<Item> CIRCUIT = ITEMS.register("circuit",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NANO_CIRCUIT = ITEMS.register("nano_circuit",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CONTAINED_PHOTON = ITEMS.register("contained_photon",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PHOTONIC_QUBIT = ITEMS.register("photonic_qubit",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NANO_BREAD = ITEMS.register("nano_bread",
            () -> new Item(new Item.Properties().food(ModFoodProperties.NANO_BREAD)));
    public static final DeferredItem<Item> CATALYST = ITEMS.register("catalyst",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
