package net.programmingpenguin.prgpengsuite.registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.programmingpenguin.prgpengsuite.things.blocks.screen.NewIndustrialScreenHandler;

public class ScreenHandlerRegistry {

    public static ScreenHandlerType<NewIndustrialScreenHandler> SCREEN;

    public static void register() {
        SCREEN = net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry.registerSimple(new Identifier("mod:test"), NewIndustrialScreenHandler::new);
    }
}
