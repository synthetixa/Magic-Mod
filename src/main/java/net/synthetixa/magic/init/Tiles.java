package net.synthetixa.magic.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.synthetixa.magic.common.tiles.TileEnchantedCauldron;

/**
 * Created by ben on 7/12/16.
 */
public class Tiles {

    public static void init() {
        GameRegistry.registerTileEntity(TileEnchantedCauldron.class, "tile_enchanted_cauldron");
    }

}
