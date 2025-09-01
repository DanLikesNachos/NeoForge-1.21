package net.DanLikesNachos.mod.datagen;

import net.DanLikesNachos.mod.Mod;
import net.DanLikesNachos.mod.block.ModBlocks;
import net.DanLikesNachos.mod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> MITHRIL_SMELTABLES = List.of(ModItems.RAW_MITHRIL,
                ModBlocks.MITHRIL_ORE, ModBlocks.MITHRIL_DEEPSLATE_ORE);
        List<ItemLike> ADAMANTITE_SMELTABLES = List.of(ModItems.RAW_ADAMANTITE,
                ModBlocks.ADAMANTITE_ORE);
        List<ItemLike> ONYX_SMELTABLES = List.of(ModBlocks.ONYX_ORE,
                ModBlocks.ONYX_DEEPSLATE_ORE);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MITHRIL_BLOCK.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', ModItems.MITHRIL_INGOT.get())
                .unlockedBy("has_mithril_ingot", has(ModItems.MITHRIL_INGOT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MITHRIL_INGOT.get(), 9)
                .requires(ModBlocks.MITHRIL_BLOCK)
                .unlockedBy("has_mithril_block", has(ModBlocks.MITHRIL_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ADAMANTITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ADAMANTITE_INGOT.get())
                .unlockedBy("has_adamantite_ingot", has(ModItems.ADAMANTITE_INGOT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ADAMANTITE_INGOT.get(), 9)
                .requires(ModBlocks.ADAMANTITE_BLOCK)
                .unlockedBy("has_adamantite_block", has(ModBlocks.ADAMANTITE_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ONYX_BLOCK.get())
                .pattern("OOO")
                .pattern("OOO")
                .pattern("OOO")
                .define('O', ModItems.ONYX.get())
                .unlockedBy("has_onyx", has(ModItems.ONYX)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ONYX.get(), 9)
                .requires(ModBlocks.ONYX_BLOCK)
                .unlockedBy("has_onyx_block", has(ModBlocks.ONYX_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CATALYST.get())
                .requires(ItemTags.COALS)
                .requires(Items.MAGMA_BLOCK)
                .unlockedBy("has_coals", has(ItemTags.COALS))
                .unlockedBy("has_magma_block", has(Items.MAGMA_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CONTAINED_PHOTON.get())
                .pattern(" S ")
                .pattern("IGI")
                .pattern(" S ")
                .define('G', Items.GLOWSTONE_DUST)
                .define('I', Items.STICK)
                .define('S', Items.SHULKER_SHELL)
                .unlockedBy("has_shulker_shell", has(Items.SHULKER_SHELL))
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_glowstone_dust", has(Items.GLOWSTONE_DUST)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CIRCUIT.get())
                .pattern("LGT")
                .pattern("DGC")
                .pattern("IGR")
                .define('L', Items.REDSTONE_LAMP)
                .define('I', Items.IRON_INGOT)
                .define('D', Items.REDSTONE)
                .define('G', Items.GREEN_CARPET)
                .define('R', Items.REPEATER)
                .define('C', Items.COMPARATOR)
                .define('T', Items.REDSTONE_TORCH)
                .unlockedBy("has_redstone_lamp", has(Items.REDSTONE_LAMP))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .unlockedBy("has_repeater", has(Items.REPEATER))
                .unlockedBy("has_comparator", has(Items.COMPARATOR))
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .unlockedBy("has_green_carpet", has(Items.GREEN_CARPET))
                .unlockedBy("has_redstone_torch", has(Items.REDSTONE_TORCH)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NANITE_INFUSER.get())
                .pattern("IGI")
                .pattern("GDG")
                .pattern("IGI")
                .define('G', Items.GLASS)
                .define('I', Items.IRON_INGOT)
                .define('D', Items.DIAMOND)
                .unlockedBy("has_glass", has(Items.GLASS))
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .unlockedBy("has_diamond", has(Items.DIAMOND)).save(recipeOutput);

        oreSmelting(recipeOutput, MITHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MITHRIL_INGOT.get(), 0.25f, 200, "mithril_ingot");
        oreBlasting(recipeOutput, MITHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MITHRIL_INGOT.get(), 0.25f, 100, "mithril_ingot");

        oreSmelting(recipeOutput, ADAMANTITE_SMELTABLES, RecipeCategory.MISC, ModItems.ADAMANTITE_INGOT.get(), 0.25f, 200, "adamantite_ingot");
        oreBlasting(recipeOutput, ADAMANTITE_SMELTABLES, RecipeCategory.MISC, ModItems.ADAMANTITE_INGOT.get(), 0.25f, 100, "adamantite_ingot");

        oreSmelting(recipeOutput, ONYX_SMELTABLES, RecipeCategory.MISC, ModItems.ONYX.get(), 0.25f, 200, "onyx");
        oreBlasting(recipeOutput, ONYX_SMELTABLES, RecipeCategory.MISC, ModItems.ONYX.get(), 0.25f, 100, "onyx");

        stairBuilder(ModBlocks.ONYX_STAIRS.get(), Ingredient.of(ModItems.ONYX)).group("onyx")
                .unlockedBy("has_onyx", has(ModItems.ONYX)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ONYX_SLAB.get(), ModItems.ONYX.get());

        buttonBuilder(ModBlocks.ONYX_BUTTON.get(), Ingredient.of(ModItems.ONYX.get())).group("onyx")
                .unlockedBy("has_onyx", has(ModItems.ONYX.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.ONYX_PRESSURE_PLATE.get(), ModItems.ONYX.get());

        fenceBuilder(ModBlocks.ONYX_FENCE.get(), Ingredient.of(ModItems.ONYX.get())).group("onyx")
                .unlockedBy("has_onyx", has(ModItems.ONYX.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.ONYX_FENCE_GATE.get(), Ingredient.of(ModItems.ONYX.get())).group("onyx")
                .unlockedBy("has_onyx", has(ModItems.ONYX.get())).save(recipeOutput);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ONYX_WALL.get(), ModItems.ONYX.get());

        doorBuilder(ModBlocks.ONYX_DOOR.get(), Ingredient.of(ModItems.ONYX.get())).group("onyx")
                .unlockedBy("has_onyx", has(ModItems.ONYX.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.ONYX_TRAPDOOR.get(), Ingredient.of(ModItems.ONYX.get())).group("onyx")
                .unlockedBy("has_onyx", has(ModItems.ONYX.get())).save(recipeOutput);

    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, Mod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
