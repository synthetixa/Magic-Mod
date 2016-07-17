package net.synthetixa.magic.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.synthetixa.magic.Compendium;

/**
 * Created by ben on 7/12/16.
 */
public class Renderers {

    public static void init() {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(Blocks.EnchantedCauldron), 0, new ModelResourceLocation(Compendium.MODID + ":enchanted_cauldron", "inventory"));

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Items.ImperfectNetherStar, 0, new ModelResourceLocation(Compendium.MODID + ":imperfect_nether_star", "inventory"));

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Items.Wand, 0, new ModelResourceLocation(Compendium.MODID + ":wand", "inventory"));
    }

}
