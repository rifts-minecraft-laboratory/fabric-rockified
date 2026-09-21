package fr.noahboos.rockified.events.handlers.player;

import fr.noahboos.rockified.tags.RockifiedBlockTagProvider;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class AfterBlockBreakEventHandler {
    public static void register() {
        PlayerBlockBreakEvents.AFTER.register(((level, player, blockPos, blockState, blockEntity) -> {
            ItemStack itemStack = ItemStack.EMPTY;

            if (blockState.is(RockifiedBlockTagProvider.HAS_ADDITIONAL_COBBLESTONE_DROP)) {
                itemStack = new ItemStack(Items.COBBLESTONE, 1);
            } else if (blockState.is(RockifiedBlockTagProvider.HAS_ADDITIONAL_COBBLED_DEEPSLATE_DROP)) {
                itemStack = new ItemStack(Items.COBBLED_DEEPSLATE, 1);
            } else if (blockState.is(RockifiedBlockTagProvider.HAS_ADDITIONAL_NETHERRACK_DROP)) {
                itemStack = new ItemStack(Items.NETHERRACK, 1);
            }

            if (itemStack.isEmpty()) return;

            ItemEntity itemEntity = new ItemEntity(level, blockPos.getX(), blockPos.getY(), blockPos.getZ(), itemStack);;
            itemEntity.setDeltaMovement(0, itemEntity.getDeltaMovement().y, 0);
            level.addFreshEntity(itemEntity);
        }));
    }
}
