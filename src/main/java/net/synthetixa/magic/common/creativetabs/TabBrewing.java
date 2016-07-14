package net.synthetixa.magic.common.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.synthetixa.magic.init.Blocks;

/**
 * Created by ben on 7/14/16.
 */
public class TabBrewing extends CreativeTabs {

    public TabBrewing(int id, String name) {
        super(id, name);
    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(Blocks.EnchantedCauldron);
    }
}
