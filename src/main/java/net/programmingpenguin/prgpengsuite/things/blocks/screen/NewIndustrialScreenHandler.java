package net.programmingpenguin.prgpengsuite.things.blocks.screen;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.screen.AbstractFurnaceScreenHandler;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandlerType;
import net.programmingpenguin.prgpengsuite.registry.RecipeRegistry;
import net.programmingpenguin.prgpengsuite.registry.ScreenHandlerRegistry;

public class NewIndustrialScreenHandler extends AbstractFurnaceScreenHandler {
    public NewIndustrialScreenHandler(int syncId, PlayerInventory playerInventory) {
        super(ScreenHandlerRegistry.SCREEN, RecipeRegistry.NEW_RECIPE, RecipeBookCategory.BLAST_FURNACE, syncId, playerInventory);
    }

    public NewIndustrialScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory, PropertyDelegate propertyDelegate) {
        super(ScreenHandlerRegistry.SCREEN, RecipeRegistry.NEW_RECIPE, RecipeBookCategory.BLAST_FURNACE, syncId, playerInventory, inventory, propertyDelegate);
    }
}

