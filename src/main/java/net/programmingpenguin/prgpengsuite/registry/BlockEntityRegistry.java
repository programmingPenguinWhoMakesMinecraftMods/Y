package net.programmingpenguin.prgpengsuite.registry;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.programmingpenguin.prgpengsuite.things.blocks.entity.NewIndustrialBlockEntity;

public class BlockEntityRegistry {

    public static BlockEntityType<NewIndustrialBlockEntity> NEW_INDUSTRIAL_BLOCK_ENTITY;

    public static void register(){
        NEW_INDUSTRIAL_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier("mod:tests"), BlockEntityType.Builder.create(NewIndustrialBlockEntity::new, BlockRegistry.TEST_FACTORY_BLOCK).build(null));
    }
}
