package net.synthetixa.magic.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Iterator;
import java.util.List;

/**
 * Created by ben on 7/13/16.
 */
public class Crafting {

    public static void init() {
        List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();

        Iterator<IRecipe> Leash = recipes.iterator();

        while (Leash.hasNext()) {
            ItemStack is = Leash.next().getRecipeOutput();
            if (is != null && is.getItem() == Items.END_CRYSTAL)
                Leash.remove();
        }
        GameRegistry.addRecipe(new ItemStack(Blocks.EnchantedCauldron), "NEN", "NCN", "NWN", 'N', net.minecraft.init.Items.NETHERBRICK, 'E', Items.IRON_INGOT, 'C', net.minecraft.init.Items.CAULDRON, 'W', net.minecraft.init.Blocks.LOG);

        GameRegistry.addShapelessRecipe(new ItemStack(net.synthetixa.magic.init.Items.ImperfectNetherStar, 4), Items.DIAMOND, new ItemStack(Items.SKULL, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.NETHER_STAR), net.synthetixa.magic.init.Items.ImperfectNetherStar, net.synthetixa.magic.init.Items.ImperfectNetherStar, net.synthetixa.magic.init.Items.ImperfectNetherStar, net.synthetixa.magic.init.Items.ImperfectNetherStar);
    }

}
