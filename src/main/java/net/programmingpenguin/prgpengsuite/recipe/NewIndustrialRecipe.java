package net.programmingpenguin.prgpengsuite.recipe;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.util.Identifier;
import net.programmingpenguin.prgpengsuite.registry.RecipeRegistry;

public class NewIndustrialRecipe extends AbstractCookingRecipe {
    public NewIndustrialRecipe(Identifier id, String group, Ingredient input, ItemStack output, float experience, int cookTime) {
        super(RecipeRegistry.NEW_RECIPE, id, group, input, output, experience, cookTime);
    }

    @Environment(EnvType.CLIENT)
    public ItemStack getRecipeKindIcon() {
        return new ItemStack(Blocks.FURNACE);
    }

    public RecipeSerializer<?> getSerializer() {
        return RecipeRegistry.NEW_SERIALIZER;
    }
}
