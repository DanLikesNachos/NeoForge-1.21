package net.DanLikesNachos.mod.datagen;

import net.DanLikesNachos.mod.Mod;
import net.DanLikesNachos.mod.block.ModBlocks;
import net.DanLikesNachos.mod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Mod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.ONYX.get());
        basicItem(ModItems.RAW_MITHRIL.get());
        basicItem(ModItems.MITHRIL_INGOT.get());
        basicItem(ModItems.RAW_ADAMANTITE.get());
        basicItem(ModItems.ADAMANTITE_INGOT.get());

        basicItem(ModItems.CATALYST.get());
        basicItem(ModItems.NANO_BREAD.get());

        basicItem(ModItems.CIRCUIT.get());
        basicItem(ModItems.NANO_CIRCUIT.get());
        basicItem(ModItems.CONTAINED_PHOTON.get());
        basicItem(ModItems.PHOTONIC_QUBIT.get());

        buttonItem(ModBlocks.ONYX_BUTTON, ModBlocks.ONYX_BLOCK);
        fenceItem(ModBlocks.ONYX_FENCE, ModBlocks.ONYX_BLOCK);
        wallItem(ModBlocks.ONYX_WALL, ModBlocks.ONYX_BLOCK);

        basicItem(ModBlocks.ONYX_DOOR.asItem());

        handheldItem(ModItems.MITHRIL_SWORD);
        handheldItem(ModItems.MITHRIL_PICKAXE);
        handheldItem(ModItems.MITHRIL_SHOVEL);
        handheldItem(ModItems.MITHRIL_AXE);
        handheldItem(ModItems.MITHRIL_HOE);
    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(Mod.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(Mod.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(Mod.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(Mod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
