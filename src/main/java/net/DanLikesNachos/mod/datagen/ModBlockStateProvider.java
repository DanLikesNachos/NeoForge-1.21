package net.DanLikesNachos.mod.datagen;

import net.DanLikesNachos.mod.Mod;
import net.DanLikesNachos.mod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Mod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.MITHRIL_BLOCK);
        blockWithItem(ModBlocks.ADAMANTITE_BLOCK);

        blockWithItem(ModBlocks.ONYX_ORE);
        blockWithItem(ModBlocks.ONYX_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.MITHRIL_ORE);
        blockWithItem(ModBlocks.MITHRIL_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.ADAMANTITE_ORE);

        blockWithItem(ModBlocks.NANITE_INFUSER);

    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
