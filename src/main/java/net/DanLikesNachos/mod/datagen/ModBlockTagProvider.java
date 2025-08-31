package net.DanLikesNachos.mod.datagen;

import net.DanLikesNachos.mod.Mod;
import net.DanLikesNachos.mod.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Mod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ONYX_ORE.get())
                .add(ModBlocks.ONYX_DEEPSLATE_ORE.get())
                .add(ModBlocks.MITHRIL_ORE.get())
                .add(ModBlocks.MITHRIL_DEEPSLATE_ORE.get())
                .add(ModBlocks.ADAMANTITE_ORE.get())
                .add(ModBlocks.ADAMANTITE_BLOCK.get())
                .add(ModBlocks.MITHRIL_BLOCK.get())
                .add(ModBlocks.NANITE_INFUSER.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ONYX_ORE.get())
                .add(ModBlocks.ONYX_DEEPSLATE_ORE.get());
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.MITHRIL_ORE.get())
                .add(ModBlocks.MITHRIL_DEEPSLATE_ORE.get())
                .add(ModBlocks.MITHRIL_BLOCK.get())
                .add(ModBlocks.ADAMANTITE_ORE.get())
                .add(ModBlocks.ADAMANTITE_BLOCK.get());
    }
}
