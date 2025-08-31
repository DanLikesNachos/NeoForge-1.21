package net.DanLikesNachos.mod.datagen;

import net.DanLikesNachos.mod.Mod;
import net.DanLikesNachos.mod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

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
    }
}
