package net.synthetixa.magic.init;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.synthetixa.magic.common.items.ItemImperfectNetherStar;
import net.synthetixa.magic.common.items.ItemWandEndCrystal;

/**
 * Created by ben on 7/12/16.
 */
public class Items {

    public static Item ImperfectNetherStar;
    public static Item Wand;

    public static void init() {
        ImperfectNetherStar = new ItemImperfectNetherStar();
        Wand = new ItemWandEndCrystal();

        GameRegistry.register(ImperfectNetherStar);
        GameRegistry.register(Wand);
    }

}
