package net.DanLikesNachos.mod.block.custom;

import net.DanLikesNachos.mod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class NaniteInfuser extends Block {
    public NaniteInfuser(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if (entity instanceof ItemEntity itemEntity) {
            if (itemEntity.getItem().getItem() == ModItems.CIRCUIT.get()) {
                itemEntity.setItem(new ItemStack(ModItems.NANO_CIRCUIT.get(), itemEntity.getItem().getCount()));
            }
        }
        if (entity instanceof  ItemEntity itemEntity) {
            if (itemEntity.getItem().getItem() == ModItems.CONTAINED_PHOTON.get()) {
                itemEntity.setItem(new ItemStack(ModItems.PHOTONIC_QUBIT.get(), itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.BREAD) {
                itemEntity.setItem(new ItemStack(ModItems.NANO_BREAD.get(), itemEntity.getItem().getCount()));
            }
        }

        super.stepOn(level, pos, state, entity);
    }
}
