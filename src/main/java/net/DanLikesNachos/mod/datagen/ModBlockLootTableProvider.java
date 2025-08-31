package net.DanLikesNachos.mod.datagen;

import net.DanLikesNachos.mod.block.ModBlocks;
import net.DanLikesNachos.mod.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.MITHRIL_BLOCK.get());
        dropSelf(ModBlocks.ADAMANTITE_BLOCK.get());
        dropSelf(ModBlocks.NANITE_INFUSER.get());

        add(ModBlocks.ONYX_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.ONYX_ORE.get(), ModItems.ONYX.get(), 2, 5));
        add(ModBlocks.ONYX_DEEPSLATE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.ONYX_DEEPSLATE_ORE.get(), ModItems.ONYX.get(), 2, 5));
        add(ModBlocks.MITHRIL_ORE.get(),
                block -> createOreDrop(ModBlocks.MITHRIL_ORE.get(), ModItems.RAW_MITHRIL.get()));
        add(ModBlocks.MITHRIL_DEEPSLATE_ORE.get(),
                block -> createOreDrop(ModBlocks.MITHRIL_DEEPSLATE_ORE.get(), ModItems.RAW_MITHRIL.get()));
        add(ModBlocks.ADAMANTITE_ORE.get(),
                block -> createOreDrop(ModBlocks.ADAMANTITE_ORE.get(), ModItems.RAW_ADAMANTITE.get()));

    }
    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
