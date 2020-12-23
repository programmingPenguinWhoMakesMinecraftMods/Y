package net.programmingpenguin.prgpengsuite.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.programmingpenguin.prgpengsuite.things.blocks.factory.TestIndustrialBlock;
import net.programmingpenguin.prgpengsuite.things.blocks.furniture.Test;
import net.programmingpenguin.prgpengsuite.things.blocks.ores.CopperOre;

public class BlockRegistry {

    public static final Block TEST = new Test(FabricBlockSettings.of(Material.METAL).hardness(1f));
    public static final Block COPPER_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(2f, 1f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block SILVER_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(3.8f, 3f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block URANIUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(19f, 12f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block PLUTONIUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(12f, 9f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block BERYLLIUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(7.7f, 3f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block TITANIUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(7f, 3f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block LITHIUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(2.7f, 1.7f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block COBALT_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(3f, 2.2f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block PALLADIUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(7f, 4f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block PLATINUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(3f, 3f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block TUNGSTEN_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(3f, 2f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block NIOBIUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(5f, 2f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block TRITIUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(2f, 1f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block HELIUM_3_DEPOSIT = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(2f, 1f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block FRANCIUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(2f, 1f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block TERBIUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(2f, 1f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block TANTALUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(2f, 1f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block MOLYBDENUM_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).strength(2f, 1f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());
    public static final Block TEST_FACTORY_BLOCK = new TestIndustrialBlock(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier("furniture", "test"), TEST);
        Registry.register(Registry.BLOCK, new Identifier("ores", "copper_ore"), COPPER_ORE);
        Registry.register(Registry.BLOCK, new Identifier("ores", "silver_ore"), SILVER_ORE);
        Registry.register(Registry.BLOCK, new Identifier("ores", "uranium_ore"), URANIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("ores", "plutonium_ore"), PLUTONIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("ores", "beryllium_ore"), BERYLLIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("ores", "titanium_ore"), TITANIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("ores", "lithium_ore"), LITHIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("ores", "cobalt_ore"), COBALT_ORE);
        Registry.register(Registry.BLOCK, new Identifier("ores", "palladium_ore"), PALLADIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("ores", "platinum_ore"), PLATINUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("ores", "tungsten_ore"), TUNGSTEN_ORE);
        Registry.register(Registry.BLOCK, new Identifier("ores", "niobium_ore"), NIOBIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("ores", "tritium_ore"), TRITIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("ores", "helium_3_deposit"), HELIUM_3_DEPOSIT);
        Registry.register(Registry.BLOCK, new Identifier("ores", "francium_ore"), FRANCIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("ores", "terbium_ore"), TERBIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("ores", "tantalum_ore"), TANTALUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("ores", "molybdenum_ore"), MOLYBDENUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier("ores", "lmao"), TEST_FACTORY_BLOCK);


        //Blocks
        Registry.register(Registry.ITEM, new Identifier("furniture", "test"), new BlockItem(TEST, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("ores", "copper_ore"), new BlockItem(COPPER_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("ores", "silver_ore"), new BlockItem(SILVER_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("ores", "uranium_ore"), new BlockItem(URANIUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("ores", "plutonium_ore"), new BlockItem(PLUTONIUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("ores", "beryllium_ore"), new BlockItem(BERYLLIUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("ores", "titanium_ore"), new BlockItem(TITANIUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("ores", "lithium_ore"), new BlockItem(LITHIUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("ores", "cobalt_ore"), new BlockItem(COBALT_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("ores", "palladium_ore"), new BlockItem(PALLADIUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("ores", "platinum_ore"), new BlockItem(PLATINUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("ores", "tungsten_ore"), new BlockItem(TUNGSTEN_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("ores", "niobium_ore"), new BlockItem(NIOBIUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("ores", "tritium_ore"), new BlockItem(TRITIUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("ores", "helium_3_deposit"), new BlockItem(HELIUM_3_DEPOSIT, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("ores", "francium_ore"), new BlockItem(FRANCIUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("ores", "terbium_ore"), new BlockItem(TERBIUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("ores", "tantalum_ore"), new BlockItem(TANTALUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("ores", "molybdenum_ore"), new BlockItem(MOLYBDENUM_ORE, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("furniture", "lmao"), new BlockItem(TEST_FACTORY_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
    }
}
