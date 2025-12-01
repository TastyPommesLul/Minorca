package net.tastypommeslul.minorca

import net.fabricmc.api.ModInitializer
import net.tastypommeslul.minorca.item.ModItems
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object Minorca : ModInitializer {
  const val MOD_ID = "minorca"
  val logger: Logger = LoggerFactory.getLogger(MOD_ID)

  override fun onInitialize() {
    ModItems.initialize()

  }
}
