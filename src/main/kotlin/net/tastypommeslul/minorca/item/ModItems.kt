package net.tastypommeslul.minorca.item

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.CreativeModeTabs
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items
import net.tastypommeslul.minorca.Minorca
import java.util.function.Function

@Suppress("Unused")
object ModItems {

  val poisonFish: Item = register("poison_fish", ::Item, Item.Properties()
    .food(FoodProps.poisonFish,
      ConsumeProps.poisonFish).usingConvertsTo(Items.BOWL))

  fun register(
    name: String, itemFunction: Function<Item.Properties, Item>, properties: Item.Properties
  ): Item {
    val itemKey = ResourceKey.create(Registries.ITEM, ResourceLocation
      .fromNamespaceAndPath(Minorca.MOD_ID, name))
    val item = itemFunction.apply(properties.setId(itemKey))
    Registry.register(BuiltInRegistries.ITEM, itemKey, item)
    return item
  }
  fun initialize() {
    ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FOOD_AND_DRINKS).register {
      it.accept(poisonFish)
    }
    Minorca.logger.info("Registering Mod Items")
  }
}
