package net.tastypommeslul.minorca.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.core.HolderLookup
import net.minecraft.data.recipes.RecipeOutput
import net.minecraft.data.recipes.RecipeProvider
import java.util.concurrent.CompletableFuture

class ModRecipeProvider(
  output: FabricDataOutput,
  registriesFuture: CompletableFuture<HolderLookup.Provider>
) : FabricRecipeProvider(output, registriesFuture) {
  override fun createRecipeProvider(
    p0: HolderLookup.Provider,
    p1: RecipeOutput
  ): RecipeProvider {
    return object : RecipeProvider(p0, p1) {
      override fun buildRecipes() {

      }
    }
  }

  override fun getName(): String {
    return "MinorcaRecipeProvider"
  }
}