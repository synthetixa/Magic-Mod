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

        GameRegistry.addRecipe(new ItemStack(net.synthetixa.magic.init.Items.ImperfectNetherStar), " S ", "SWS", " S ", 'S', net.minecraft.init.Blocks.SOUL_SAND, 'W', new ItemStack(Items.SKULL, 1, 1));
        GameRegistry.addRecipe(new ItemStack(Items.NETHER_STAR), " I ", "IDI", " I ", 'I', net.synthetixa.magic.init.Items.ImperfectNetherStar, 'D', net.minecraft.init.Blocks.DIAMOND_BLOCK);

        GameRegistry.addRecipe(new ItemStack(net.synthetixa.magic.init.Items.Wand), " E ", " N ", " D ", 'E', Items.END_CRYSTAL, 'N', Items.NETHERBRICK, 'D', Items.DIAMOND);
    }

}
