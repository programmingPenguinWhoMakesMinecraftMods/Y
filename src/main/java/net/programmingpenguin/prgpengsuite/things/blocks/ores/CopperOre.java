package net.programmingpenguin.prgpengsuite.things.blocks.ores;

import net.minecraft.block.OreBlock;

import java.util.Random;


public class CopperOre extends OreBlock {
    public CopperOre(Settings settings) {
        super(settings);
    }

    @Override
    protected int getExperienceWhenMined(Random random) {
        return 5;
    }
}
