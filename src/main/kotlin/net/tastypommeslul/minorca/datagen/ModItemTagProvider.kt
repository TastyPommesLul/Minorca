package net.tastypommeslul.minorca.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.core.HolderLookup
import net.minecraft.tags.ItemTags
import net.tastypommeslul.minorca.item.ModItems
import java.util.concurrent.CompletableFuture

class ModItemTagProvider(
  output: FabricDataOutput,
  registriesFuture: CompletableFuture<HolderLookup.Provider>
) : FabricTagProvider.ItemTagProvider(output, registriesFuture) {
  override fun addTags(provider: HolderLookup.Provider) {
    valueLookupBuilder(ItemTags.MEAT)
      .add(ModItems.poisonFish)
  }
}