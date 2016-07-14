package net.synthetixa.magic.common.tiles;

import net.minecraft.client.renderer.texture.ITickable;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;


/**
 * Created by ben on 7/13/16.
 */
public class TileEnchantedCauldron extends TileEntity implements ITickable {

    public boolean hasCoal = false;
    public ItemStack stack1;
    public ItemStack stack2;
    public ItemStack stack3;

    public boolean hasOne = false;
    public boolean hasTwo = false;
    public boolean hasThree = false;

    public boolean isComplete = false;
    public int time = 0;

    @Override
    public void tick() {
        if (hasOne) {
            time += 1;
        }

        if (time >= 2400) {
            stack1 = null;
            stack2 = null;
            stack3 = null;
            hasOne = false;
            hasTwo = false;
            hasThree = false;
            hasCoal = false;
            time = 0;
        }
    }
}
