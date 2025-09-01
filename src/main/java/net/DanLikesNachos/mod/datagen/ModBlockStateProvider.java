package net.DanLikesNachos.mod.datagen;

import net.DanLikesNachos.mod.Mod;
import net.DanLikesNachos.mod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
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
        blockWithItem(ModBlocks.ONYX_BLOCK);

        blockWithItem(ModBlocks.ONYX_ORE);
        blockWithItem(ModBlocks.ONYX_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.MITHRIL_ORE);
        blockWithItem(ModBlocks.MITHRIL_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.ADAMANTITE_ORE);

        blockWithItem(ModBlocks.NANITE_INFUSER);

        stairsBlock(ModBlocks.ONYX_STAIRS.get(), blockTexture(ModBlocks.ONYX_BLOCK.get()));
        slabBlock(ModBlocks.ONYX_SLAB.get(), blockTexture(ModBlocks.ONYX_BLOCK.get()), blockTexture(ModBlocks.ONYX_BLOCK.get()));

        buttonBlock(ModBlocks.ONYX_BUTTON.get(), blockTexture(ModBlocks.ONYX_BLOCK.get()));
        pressurePlateBlock(ModBlocks.ONYX_PRESSURE_PLATE.get(), blockTexture(ModBlocks.ONYX_BLOCK.get()));

        fenceBlock(ModBlocks.ONYX_FENCE.get(), blockTexture(ModBlocks.ONYX_BLOCK.get()));
        fenceGateBlock(ModBlocks.ONYX_FENCE_GATE.get(), blockTexture(ModBlocks.ONYX_BLOCK.get()));
        wallBlock(ModBlocks.ONYX_WALL.get(), blockTexture(ModBlocks.ONYX_BLOCK.get()));

        doorBlockWithRenderType(ModBlocks.ONYX_DOOR.get(), modLoc("block/onyx_door_bottom"), modLoc("block/onyx_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.ONYX_TRAPDOOR.get(), modLoc("block/onyx_trapdoor"),true, "cutout");


        blockItem(ModBlocks.ONYX_STAIRS);
        blockItem(ModBlocks.ONYX_SLAB);
        blockItem(ModBlocks.ONYX_PRESSURE_PLATE);
        blockItem(ModBlocks.ONYX_FENCE_GATE);
        blockItem(ModBlocks.ONYX_TRAPDOOR, "_bottom");



    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("myfirstmod:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("myfirstmod:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
