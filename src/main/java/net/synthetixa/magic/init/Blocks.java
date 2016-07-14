package net.synthetixa.magic.init;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.synthetixa.magic.common.blocks.BlockEnchantedCauldron;

/**
 * Created by ben on 7/12/16.
 */
public class Blocks {

    public static Block EnchantedCauldron;

    public static void init() {
        EnchantedCauldron = new BlockEnchantedCauldron();

        GameRegistry.register(EnchantedCauldron);
        GameRegistry.register(new ItemBlock(EnchantedCauldron), EnchantedCauldron.getRegistryName());
    }

}
