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
                        output.accept(ModBlocks.MITHRIL_ORE);
                        output.accept(ModBlocks.ADAMANTITE_ORE);
                        output.accept(ModBlocks.MITHRIL_BLOCK);
                        output.accept(ModBlocks.ADAMANTITE_BLOCK);
                        output.accept(ModItems.MITHRIL_INGOT);
                        output.accept(ModItems.ADAMANTITE_INGOT);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
