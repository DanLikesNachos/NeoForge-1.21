package net.DanLikesNachos.mod.item;

import net.DanLikesNachos.mod.Mod;
import net.DanLikesNachos.mod.item.custom.HammerItem;
import net.DanLikesNachos.mod.item.custom.ModArmorItem;
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
                    .attributes(SwordItem.createAttributes(ModToolTiers.MITHRIL, 2.5f, -2.0f))));
    public static final DeferredItem<PickaxeItem> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.MITHRIL, 2.0f, -2.4f))));
    public static final DeferredItem<ShovelItem> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel",
            () -> new ShovelItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.MITHRIL, 1.5f, -2.6f))));
    public static final DeferredItem<AxeItem> MITHRIL_AXE = ITEMS.register("mithril_axe",
            () -> new AxeItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.MITHRIL, 5.5f, -3.2f))));
    public static final DeferredItem<HoeItem> MITHRIL_HOE = ITEMS.register("mithril_hoe",
            () -> new HoeItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.MITHRIL, 0f, -3.0f))));
    public static final DeferredItem<HammerItem> MITHRIL_HAMMER = ITEMS.register("mithril_hammer",
            () -> new HammerItem(ModToolTiers.MITHRIL, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.MITHRIL, 7.0f, -3.4f))));

    public static final DeferredItem<SwordItem> ADAMANTITE_SWORD = ITEMS.register("adamantite_sword",
            () -> new SwordItem(ModToolTiers.ADAMANTITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADAMANTITE, 3.0f, -2.6f))));
    public static final DeferredItem<PickaxeItem> ADAMANTITE_PICKAXE = ITEMS.register("adamantite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ADAMANTITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ADAMANTITE, 2.0f, -2.4f))));
    public static final DeferredItem<ShovelItem> ADAMANTITE_SHOVEL = ITEMS.register("adamantite_shovel",
            () -> new ShovelItem(ModToolTiers.ADAMANTITE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.ADAMANTITE, 1.5f, -2.6f))));
    public static final DeferredItem<AxeItem> ADAMANTITE_AXE = ITEMS.register("adamantite_axe",
            () -> new AxeItem(ModToolTiers.ADAMANTITE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.ADAMANTITE, 7.0f, -3.0f))));
    public static final DeferredItem<HoeItem> ADAMANTITE_HOE = ITEMS.register("adamantite_hoe",
            () -> new HoeItem(ModToolTiers.ADAMANTITE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.ADAMANTITE, 0f, -3.0f))));
    public static final DeferredItem<HammerItem> ADAMANTITE_HAMMER = ITEMS.register("adamantite_hammer",
            () -> new HammerItem(ModToolTiers.ADAMANTITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ADAMANTITE, 8.0f, -3.4f))));

    public static final DeferredItem<ArmorItem> MITHRIL_HELMET = ITEMS.register("mithril_helmet",
            () -> new ModArmorItem(ModArmorMaterials.MITHRIL_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(35))));
    public static final DeferredItem<ArmorItem> MITHRIL_CHESTPLATE = ITEMS.register("mithril_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MITHRIL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(35))));
    public static final DeferredItem<ArmorItem> MITHRIL_LEGGINGS = ITEMS.register("mithril_leggings",
            () -> new ArmorItem(ModArmorMaterials.MITHRIL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(35))));
    public static final DeferredItem<ArmorItem> MITHRIL_BOOTS = ITEMS.register("mithril_boots",
            () -> new ArmorItem(ModArmorMaterials.MITHRIL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(35))));

    public static final DeferredItem<ArmorItem> ADAMANTITE_HELMET = ITEMS.register("adamantite_helmet",
            () -> new ModArmorItem(ModArmorMaterials.ADAMANTITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(35))));
    public static final DeferredItem<ArmorItem> ADAMANTITE_CHESTPLATE = ITEMS.register("adamantite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ADAMANTITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(35))));
    public static final DeferredItem<ArmorItem> ADAMANTITE_LEGGINGS = ITEMS.register("adamantite_leggings",
            () -> new ArmorItem(ModArmorMaterials.ADAMANTITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(35))));
    public static final DeferredItem<ArmorItem> ADAMANTITE_BOOTS = ITEMS.register("adamantite_boots",
            () -> new ArmorItem(ModArmorMaterials.ADAMANTITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(35))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
