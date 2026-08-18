package me.magnum.melonds.ui.emulator.savestate

import android.content.Context
import android.content.SharedPreferences

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

    fun generateAutoBookmarkTag(gameTitle: String?, slot: Int): String {
        val title = gameTitle?.lowercase() ?: ""
        return when {
            title.contains("pokemon") || title.contains("heartgold") || title.contains("soulsilver") -> when (slot % 4) {
                0 -> "⭐ Быстрое сохранение"
                1 -> "🏛️ Покецентр / Лига"
                2 -> "⚔️ Битва с лидером гима"
                else -> "🌲 Маршрут / Исследование"
            }
            title.contains("mario") -> when (slot % 4) {
                0 -> "⭐ Быстрое сохранение"
                1 -> "🏰 Замок Боузера"
                2 -> "🍄 Мир испытаний"
                else -> "🚩 Контрольная точка"
            }
            title.contains("zelda") -> when (slot % 4) {
                0 -> "⭐ Быстрое сохранение"
                1 -> "⚔️ Босс подземелья"
                2 -> "🗝️ Храм / Загадка"
                else -> "⛵ Морское плавание"
            }
            title.contains("batman") -> when (slot % 4) {
                0 -> "⭐ Быстрое сохранение"
                1 -> "🦇 Готэм: Битва с боссом"
                2 -> "🌃 Логово суперзлодея"
                else -> "⚡ Ночной патруль"
            }
            title.contains("castlevania") -> when (slot % 4) {
                0 -> "⭐ Быстрое сохранение"
                1 -> "🩸 Тронный зал / Замок"
                2 -> "🦇 Врата бессмертия"
                else -> "🗝️ Потайная комната"
            }
            else -> when (slot % 3) {
                0 -> "⭐ Быстрое сохранение"
                1 -> "⚔️ Битва с боссом"
                else -> "📍 Точка сюжета"
            }
        }
    }
}
