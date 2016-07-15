package net.synthetixa.magic.common.tiles;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.items.ItemStackHandler;


/**
 * Created by ben on 7/13/16.
 */
public class TileEnchantedCauldron extends TileEntity {

    public ItemStackHandler itemStackHandler = new ItemStackHandler(64);

    public TileEnchantedCauldron() {
        itemStackHandler.setSize(5);
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
        itemStackHandler.serializeNBT();

        return nbt;
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        itemStackHandler.deserializeNBT(nbt);
    }
}
