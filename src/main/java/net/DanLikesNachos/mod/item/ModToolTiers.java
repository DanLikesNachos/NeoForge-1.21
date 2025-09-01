package net.DanLikesNachos.mod.item;

import net.DanLikesNachos.mod.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier MITHRIL = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_MITHRIL_TOOL,
            1500, 9.5f, 3.0f, 20, () -> Ingredient.of(ModItems.MITHRIL_INGOT));

    public static final Tier ADAMANTITE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ADAMANTITE_TOOL,
            2000, 8.5f, 4f, 20, () -> Ingredient.of(ModItems.ADAMANTITE_INGOT));
}
