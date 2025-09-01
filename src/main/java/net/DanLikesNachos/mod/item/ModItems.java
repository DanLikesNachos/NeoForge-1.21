package net.DanLikesNachos.mod.item;

import net.DanLikesNachos.mod.Mod;
import net.minecraft.world.item.*;
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

    public static final DeferredItem<SwordItem> MITHRIL_SWORD = ITEMS.register("mithril_sword",
            () -> new SwordItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.MITHRIL, 5.0f, -2.0f))));
    public static final DeferredItem<PickaxeItem> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.MITHRIL, 2.0f, -2.4f))));
    public static final DeferredItem<ShovelItem> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel",
            () -> new ShovelItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.MITHRIL, 1.5f, -2.6f))));
    public static final DeferredItem<AxeItem> MITHRIL_AXE = ITEMS.register("mithril_axe",
            () -> new AxeItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.MITHRIL, 6.0f, -3.0f))));
    public static final DeferredItem<HoeItem> MITHRIL_HOE = ITEMS.register("mithril_hoe",
            () -> new HoeItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.MITHRIL, 0f, -3.0f))));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
