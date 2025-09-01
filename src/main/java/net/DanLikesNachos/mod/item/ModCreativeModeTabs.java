package net.DanLikesNachos.mod.item;

import net.DanLikesNachos.mod.Mod;
import net.DanLikesNachos.mod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Mod.MOD_ID);

    public static final Supplier<CreativeModeTab> GEMFORGE_TAB = CREATIVE_MODE_TAB.register("gemforge_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ONYX.get()))
                    .title(Component.translatable("creativetab.myfirstmod.gemforge"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ONYX);
                        output.accept(ModItems.RAW_MITHRIL);
                        output.accept(ModItems.RAW_ADAMANTITE);

                        output.accept(ModBlocks.ONYX_ORE);
                        output.accept(ModBlocks.ONYX_DEEPSLATE_ORE);
                        output.accept(ModBlocks.MITHRIL_ORE);
                        output.accept(ModBlocks.MITHRIL_DEEPSLATE_ORE);
                        output.accept(ModBlocks.ADAMANTITE_ORE);

                        output.accept(ModBlocks.ONYX_BLOCK);
                        output.accept(ModBlocks.MITHRIL_BLOCK);
                        output.accept(ModBlocks.ADAMANTITE_BLOCK);

                        output.accept(ModItems.MITHRIL_INGOT);
                        output.accept(ModItems.ADAMANTITE_INGOT);

                        output.accept(ModItems.MITHRIL_SWORD);
                        output.accept(ModItems.MITHRIL_AXE);
                        output.accept(ModItems.MITHRIL_PICKAXE);
                        output.accept(ModItems.MITHRIL_SHOVEL);
                        output.accept(ModItems.MITHRIL_HOE);

                        output.accept(ModItems.MITHRIL_HAMMER);

                        output.accept(ModItems.ADAMANTITE_SWORD);
                        output.accept(ModItems.ADAMANTITE_AXE);
                        output.accept(ModItems.ADAMANTITE_PICKAXE);
                        output.accept(ModItems.ADAMANTITE_SHOVEL);
                        output.accept(ModItems.ADAMANTITE_HOE);

                        output.accept(ModItems.ADAMANTITE_HAMMER);

                        output.accept(ModItems.MITHRIL_HELMET);
                        output.accept(ModItems.MITHRIL_CHESTPLATE);
                        output.accept(ModItems.MITHRIL_LEGGINGS);
                        output.accept(ModItems.MITHRIL_BOOTS);

                        output.accept(ModItems.ADAMANTITE_HELMET);
                        output.accept(ModItems.ADAMANTITE_CHESTPLATE);
                        output.accept(ModItems.ADAMANTITE_LEGGINGS);
                        output.accept(ModItems.ADAMANTITE_BOOTS);

                        output.accept(ModItems.CIRCUIT);
                        output.accept(ModItems.NANO_CIRCUIT);
                        output.accept(ModItems.CONTAINED_PHOTON);
                        output.accept(ModItems.PHOTONIC_QUBIT);
                        output.accept(ModItems.NANO_BREAD);
                        output.accept(ModBlocks.NANITE_INFUSER);

                        output.accept(ModItems.CATALYST);

                        output.accept(ModBlocks.ONYX_STAIRS);
                        output.accept(ModBlocks.ONYX_SLAB);

                        output.accept(ModBlocks.ONYX_PRESSURE_PLATE);
                        output.accept(ModBlocks.ONYX_BUTTON);

                        output.accept(ModBlocks.ONYX_FENCE);
                        output.accept(ModBlocks.ONYX_FENCE_GATE);
                        output.accept(ModBlocks.ONYX_STAIRS);
                        output.accept(ModBlocks.ONYX_WALL);

                        output.accept(ModBlocks.ONYX_DOOR);
                        output.accept(ModBlocks.ONYX_TRAPDOOR);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
