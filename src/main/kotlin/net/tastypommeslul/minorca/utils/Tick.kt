package net.tastypommeslul.minorca.utils

object Tick {
  fun fromSeconds(seconds: Double) = (seconds * 20).toInt()
  fun fromMinutes(minutes: Double) = (minutes * 60 * 20).toInt()

  fun fromSeconds(seconds: Int) = seconds * 20
  fun fromMinutes(minutes: Int) = minutes * 60 * 20
}