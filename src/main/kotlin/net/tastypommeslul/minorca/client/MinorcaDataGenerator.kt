package net.tastypommeslul.minorca.client

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import net.tastypommeslul.minorca.datagen.ModBlockTagProvider
import net.tastypommeslul.minorca.datagen.ModItemTagProvider
import net.tastypommeslul.minorca.datagen.ModLootTableProvider
import net.tastypommeslul.minorca.datagen.ModModelProvider
import net.tastypommeslul.minorca.datagen.ModRecipeProvider

class MinorcaDataGenerator : DataGeneratorEntrypoint {
  override fun onInitializeDataGenerator(fabricDataGenerator: FabricDataGenerator) {
    val pack = fabricDataGenerator.createPack()

    pack.addProvider(::ModModelProvider)
    pack.addProvider(::ModItemTagProvider)
    pack.addProvider(::ModBlockTagProvider)
    pack.addProvider(::ModRecipeProvider)
    pack.addProvider(::ModLootTableProvider)
  }
}
