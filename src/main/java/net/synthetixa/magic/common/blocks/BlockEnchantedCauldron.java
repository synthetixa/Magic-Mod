package net.synthetixa.magic.common.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.synthetixa.magic.common.tiles.TileEnchantedCauldron;
import net.synthetixa.magic.init.Tabs;

import javax.annotation.Nullable;

/**
 * Created by ben on 7/13/16.
 */
public class BlockEnchantedCauldron extends BlockContainer {

    public BlockEnchantedCauldron() {
        super(Material.IRON);

        setRegistryName("enchanted_cauldron");
        setUnlocalizedName("enchanted_cauldron");
        setCreativeTab(Tabs.tabBrewing);
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEnchantedCauldron();
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        TileEnchantedCauldron te = (TileEnchantedCauldron) worldIn.getTileEntity(pos);

        if (heldItem != null) {
            if (te.itemStackHandler.getStackInSlot(0) == null) {
                te.itemStackHandler.setStackInSlot(0, heldItem);
                heldItem.stackSize -= 1;
            } else if (te.itemStackHandler.getStackInSlot(1) == null) {
                te.itemStackHandler.setStackInSlot(1, heldItem);
                heldItem.stackSize -= 1;
            } else if (te.itemStackHandler.getStackInSlot(2) == null) {
                te.itemStackHandler.setStackInSlot(2, heldItem);
                heldItem.stackSize -= 1;
            } else if (te.itemStackHandler.getStackInSlot(3) == null) {
                te.itemStackHandler.setStackInSlot(3, heldItem);
                heldItem.stackSize -= 1;
            } else if (te.itemStackHandler.getStackInSlot(4) == null) {
                te.itemStackHandler.setStackInSlot(4, heldItem);
                heldItem.stackSize -= 1;
            }

            if (te.itemStackHandler.getStackInSlot(0) != null && te.itemStackHandler.getStackInSlot(1) != null && te.itemStackHandler.getStackInSlot(2) != null && te.itemStackHandler.getStackInSlot(3) != null && te.itemStackHandler.getStackInSlot(4) == null) {
                if (te.itemStackHandler.getStackInSlot(0).getItem() == Items.COAL) {
                    if (te.itemStackHandler.getStackInSlot(1).getItem() == Items.NETHER_STAR && te.itemStackHandler.getStackInSlot(2).getItem() == Item.getItemFromBlock(Blocks.GLASS) && te.itemStackHandler.getStackInSlot(3).getItem() == Items.ENDER_EYE) {
                        te.itemStackHandler.setStackInSlot(4, new ItemStack(Items.END_CRYSTAL));
                        playerIn.inventory.addItemStackToInventory(te.itemStackHandler.getStackInSlot(4));
                        te.itemStackHandler.setStackInSlot(0, null);
                        te.itemStackHandler.setStackInSlot(1, null);
                        te.itemStackHandler.setStackInSlot(2, null);
                        te.itemStackHandler.setStackInSlot(3, null);
                        te.itemStackHandler.setStackInSlot(4, null);
                    }
                }
            }

            return true;
        } else {
            return false;
        }
    }
}
