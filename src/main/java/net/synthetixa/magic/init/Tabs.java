package net.synthetixa.magic.init;

import net.minecraft.creativetab.CreativeTabs;
import net.synthetixa.magic.common.creativetabs.TabBrewing;

/**
 * Created by ben on 7/14/16.
 */
public class Tabs {
    public static CreativeTabs tabBrewing;

    public static void init() {
        tabBrewing = new TabBrewing(CreativeTabs.getNextID(), "brewingTab");
    }

}
