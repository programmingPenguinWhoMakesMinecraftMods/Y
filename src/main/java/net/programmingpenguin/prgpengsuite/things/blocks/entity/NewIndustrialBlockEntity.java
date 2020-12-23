package net.programmingpenguin.prgpengsuite.things.blocks.entity;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.programmingpenguin.prgpengsuite.registry.BlockEntityRegistry;
import net.programmingpenguin.prgpengsuite.registry.RecipeRegistry;
import net.programmingpenguin.prgpengsuite.things.blocks.screen.NewIndustrialScreenHandler;

public class NewIndustrialBlockEntity extends AbstractFurnaceBlockEntity {
    public NewIndustrialBlockEntity() {
        super(BlockEntityRegistry.NEW_INDUSTRIAL_BLOCK_ENTITY, RecipeRegistry.NEW_RECIPE);
    }

    public Text getContainerName() {
        return new TranslatableText("block.test.lmao");
    }

    public int getFuelTime(ItemStack fuel) {
        return super.getFuelTime(fuel) / 2;
    }

    public ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new NewIndustrialScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }
}

