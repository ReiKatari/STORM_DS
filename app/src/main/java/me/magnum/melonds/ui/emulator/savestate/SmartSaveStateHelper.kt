package me.magnum.melonds.ui.emulator.savestate

import android.content.Context
import android.content.SharedPreferences
import me.magnum.melonds.R

object SmartSaveStateHelper {
    private const val PREFS_NAME = "smart_savestate_bookmarks"

    private fun getPrefs(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    fun getCustomName(context: Context, romChecksum: String, slot: Int): String? {
        val key = "${romChecksum}_slot_${slot}_name"
        return getPrefs(context).getString(key, null)
    }

    fun setCustomName(context: Context, romChecksum: String, slot: Int, name: String?) {
        val key = "${romChecksum}_slot_${slot}_name"
        getPrefs(context).edit().apply {
            if (name.isNullOrBlank()) remove(key) else putString(key, name.trim())
            apply()
        }
    }

    fun generateAutoBookmarkTag(context: Context, gameTitle: String?, slot: Int): String {
        val title = gameTitle?.lowercase() ?: ""
        val resId = when {
            title.contains("pokemon") || title.contains("heartgold") || title.contains("soulsilver") -> when (slot % 4) {
                0 -> R.string.v870_smart_quick
                1 -> R.string.v870_smart_pokemon_center
                2 -> R.string.v870_smart_gym_leader
                else -> R.string.v870_smart_route
            }
            title.contains("mario") -> when (slot % 4) {
                0 -> R.string.v870_smart_quick
                1 -> R.string.v870_smart_bowser
                2 -> R.string.v870_smart_trial_world
                else -> R.string.v870_smart_checkpoint
            }
            title.contains("zelda") -> when (slot % 4) {
                0 -> R.string.v870_smart_quick
                1 -> R.string.v870_smart_dungeon_boss
                2 -> R.string.v870_smart_temple
                else -> R.string.v870_smart_sea
            }
            title.contains("batman") -> when (slot % 4) {
                0 -> R.string.v870_smart_quick
                1 -> R.string.v870_smart_gotham_boss
                2 -> R.string.v870_smart_lair
                else -> R.string.v870_smart_patrol
            }
            title.contains("castlevania") -> when (slot % 4) {
                0 -> R.string.v870_smart_quick
                1 -> R.string.v870_smart_throne
                2 -> R.string.v870_smart_gate
                else -> R.string.v870_smart_secret
            }
            else -> when (slot % 3) {
                0 -> R.string.v870_smart_quick
                1 -> R.string.v870_smart_boss
                else -> R.string.v870_smart_story
            }
        }
        return context.getString(resId)
    }
}
