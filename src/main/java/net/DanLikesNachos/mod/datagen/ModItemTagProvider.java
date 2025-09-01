package net.DanLikesNachos.mod.datagen;

import net.DanLikesNachos.mod.Mod;
import net.DanLikesNachos.mod.item.ModItems;
import net.DanLikesNachos.mod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import javax.swing.text.html.HTML;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Mod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.SWORDS)
                .add(ModItems.MITHRIL_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.MITHRIL_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.MITHRIL_SHOVEL.get());
        tag(ItemTags.AXES)
                .add(ModItems.MITHRIL_AXE.get());
        tag(ItemTags.HOES)
                .add(ModItems.MITHRIL_HOE.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.ADAMANTITE_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.ADAMANTITE_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.ADAMANTITE_SHOVEL.get());
        tag(ItemTags.AXES)
                .add(ModItems.ADAMANTITE_AXE.get());
        tag(ItemTags.HOES)
                .add(ModItems.ADAMANTITE_HOE.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.MITHRIL_HELMET.get())
                .add(ModItems.MITHRIL_CHESTPLATE.get())
                .add(ModItems.MITHRIL_LEGGINGS.get())
                .add(ModItems.MITHRIL_BOOTS.get())
                .add(ModItems.ADAMANTITE_HELMET.get())
                .add(ModItems.ADAMANTITE_CHESTPLATE.get())
                .add(ModItems.ADAMANTITE_LEGGINGS.get())
                .add(ModItems.ADAMANTITE_BOOTS.get());
    }
}
