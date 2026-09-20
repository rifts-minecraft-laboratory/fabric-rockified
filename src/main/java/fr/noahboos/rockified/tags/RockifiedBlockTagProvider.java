package fr.noahboos.rockified.tags;

import fr.noahboos.rockified.Rockified;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.references.BlockItemIds;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class RockifiedBlockTagProvider extends FabricTagsProvider.BlockTagsProvider {
    public RockifiedBlockTagProvider(FabricPackOutput fabricPackOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(fabricPackOutput, registriesFuture);
    }

    public static final TagKey<Block> HAS_ADDITIONAL_COBBLESTONE_DROP = TagKey.create(
        Registries.BLOCK,
        Identifier.fromNamespaceAndPath(Rockified.MOD_ID, "has_additional_cobblestone_drop")
    );

    public static final TagKey<Block> HAS_ADDITIONAL_COBBLED_DEEPSLATE_DROP = TagKey.create(
        Registries.BLOCK,
        Identifier.fromNamespaceAndPath(Rockified.MOD_ID, "has_additional_cobbled_deepslate_drop")
    );

    public static final TagKey<Block> HAS_ADDITIONAL_NETHERRACK_DROP = TagKey.create(
        Registries.BLOCK,
        Identifier.fromNamespaceAndPath(Rockified.MOD_ID, "has_additional_netherrack_drop")
    );

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        builder(HAS_ADDITIONAL_COBBLESTONE_DROP)
            .add(BlockItemIds.COAL_ORE)
            .add(BlockItemIds.COPPER_ORE)
            .add(BlockItemIds.DIAMOND_ORE)
            .add(BlockItemIds.EMERALD_ORE)
            .add(BlockItemIds.GOLD_ORE)
            .add(BlockItemIds.IRON_ORE)
            .add(BlockItemIds.LAPIS_ORE)
            .add(BlockItemIds.REDSTONE_ORE)
            .setReplace(true);

        builder(HAS_ADDITIONAL_COBBLED_DEEPSLATE_DROP)
            .add(BlockItemIds.DEEPSLATE_COAL_ORE)
            .add(BlockItemIds.DEEPSLATE_COPPER_ORE)
            .add(BlockItemIds.DEEPSLATE_DIAMOND_ORE)
            .add(BlockItemIds.DEEPSLATE_EMERALD_ORE)
            .add(BlockItemIds.DEEPSLATE_GOLD_ORE)
            .add(BlockItemIds.DEEPSLATE_IRON_ORE)
            .add(BlockItemIds.DEEPSLATE_LAPIS_ORE)
            .add(BlockItemIds.DEEPSLATE_REDSTONE_ORE)
            .setReplace(true);

        builder(HAS_ADDITIONAL_NETHERRACK_DROP)
            .add(BlockItemIds.NETHER_GOLD_ORE)
            .add(BlockItemIds.NETHER_QUARTZ_ORE)
            .setReplace(true);
    }
}
