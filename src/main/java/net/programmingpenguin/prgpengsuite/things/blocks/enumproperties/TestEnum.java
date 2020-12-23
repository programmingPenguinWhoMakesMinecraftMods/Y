package net.programmingpenguin.prgpengsuite.things.blocks.enumproperties;

import net.minecraft.util.StringIdentifiable;

public enum TestEnum implements StringIdentifiable {
    MODEL1("1"),
    MODEL2("2"),
    MODEL3("3"),
    MODEL4("4");

    public final String name;

    private TestEnum(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public String asString() {
        return this.name;
    }
}
