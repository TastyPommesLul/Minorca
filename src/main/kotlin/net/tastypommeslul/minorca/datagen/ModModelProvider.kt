package net.tastypommeslul.minorca.datagen

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.minecraft.client.data.models.BlockModelGenerators
import net.minecraft.client.data.models.ItemModelGenerators
import net.minecraft.client.data.models.model.ModelTemplates
import net.tastypommeslul.minorca.item.ModItems

class ModModelProvider(
  output: FabricDataOutput
) : FabricModelProvider(output) {
  override fun generateBlockStateModels(generator: BlockModelGenerators) {

  }

  override fun generateItemModels(generator: ItemModelGenerators) {
    generator.generateFlatItem(ModItems.poisonFish, ModelTemplates.FLAT_ITEM)
  }

  override fun getName(): String {
    return "MinorcaModelProvider"
  }
}