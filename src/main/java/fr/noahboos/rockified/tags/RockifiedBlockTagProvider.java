package fr.noahboos.rockified.tags;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class RockifiedBlockTagProvider extends FabricTagsProvider.BlockTagsProvider {
    public RockifiedBlockTagProvider(FabricPackOutput fabricPackOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(fabricPackOutput, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        //
    }
}
