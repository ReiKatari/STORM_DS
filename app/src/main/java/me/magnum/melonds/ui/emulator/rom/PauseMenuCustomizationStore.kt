package me.magnum.melonds.ui.emulator.rom

import android.content.Context
import androidx.preference.PreferenceManager
import me.magnum.melonds.ui.emulator.PauseMenuOption

class PauseMenuCustomizationStore(private val context: Context) {

    private val prefs by lazy { PreferenceManager.getDefaultSharedPreferences(context) }

    companion object {
        const val KEY_CUSTOM_ORDER = "pause_menu_custom_order"
        const val KEY_HIDDEN_ITEMS = "pause_menu_hidden_items"
        const val KEY_INDIVIDUALLY_PINNED = "pause_menu_individually_pinned"

        val DEFAULT_EXTENDED_OPTIONS: Set<RomPauseMenuOption> = setOf(
            RomPauseMenuOption.TAKE_SCREENSHOT,
            RomPauseMenuOption.SLOW_MOTION,
            RomPauseMenuOption.FRAME_ADVANCE,
            RomPauseMenuOption.LOAD_PERIODIC_AUTOSAVE,
            RomPauseMenuOption.CALIBRATE_GYRO,
            RomPauseMenuOption.RENDERER_DEBUG,
            RomPauseMenuOption.RESET_COMPATIBILITY,
            RomPauseMenuOption.SYNC_RETRO_ACHIEVEMENTS,
        )
    }

    data class CustomizationStats(
        val totalAvailable: Int,
        val visibleCount: Int,
        val hiddenCount: Int,
        val hasCustomOrder: Boolean,
    )

    fun getCustomOrder(): List<String> {
        val raw = prefs.getString(KEY_CUSTOM_ORDER, null) ?: return emptyList()
        return raw.split(",")
            .map { it.trim() }
            .filter { it.isNotEmpty() }
    }

    fun saveCustomOrder(order: List<String>) {
        val csv = order.joinToString(",")
        prefs.edit().putString(KEY_CUSTOM_ORDER, csv).apply()
    }

    fun getHiddenItems(): Set<String> {
        return prefs.getStringSet(KEY_HIDDEN_ITEMS, emptySet()) ?: emptySet()
    }

    fun saveHiddenItems(hidden: Set<String>) {
        // Enforce protection: SETTINGS can never be hidden
        val safeHidden = hidden.filterNot { it == RomPauseMenuOption.SETTINGS.name }.toSet()
        prefs.edit().putStringSet(KEY_HIDDEN_ITEMS, safeHidden).apply()
    }

    fun getIndividuallyPinned(): Set<String> {
        return prefs.getStringSet(KEY_INDIVIDUALLY_PINNED, emptySet()) ?: emptySet()
    }

    fun saveIndividuallyPinned(pinned: Set<String>) {
        prefs.edit().putStringSet(KEY_INDIVIDUALLY_PINNED, pinned).apply()
    }

    fun resetToDefaults() {
        prefs.edit()
            .remove(KEY_CUSTOM_ORDER)
            .remove(KEY_HIDDEN_ITEMS)
            .remove(KEY_INDIVIDUALLY_PINNED)
            .apply()
    }

    fun isExtendedOption(option: PauseMenuOption): Boolean {
        return option in DEFAULT_EXTENDED_OPTIONS
    }

    fun isOptionVisible(option: PauseMenuOption, isExtendedEnabled: Boolean): Boolean {
        val name = (option as? Enum<*>)?.name ?: option.toString()
        // Protection: SETTINGS is always visible
        if (option == RomPauseMenuOption.SETTINGS) return true

        val hidden = getHiddenItems()
        if (name in hidden) return false

        val isExt = isExtendedOption(option)
        if (!isExt) return true

        if (isExtendedEnabled) return true

        val pinned = getIndividuallyPinned()
        return name in pinned
    }

    fun getVisibleOrderedOptions(
        availableOptions: List<PauseMenuOption>,
        isExtendedEnabled: Boolean,
    ): List<PauseMenuOption> {
        val customOrder = getCustomOrder()
        val orderMap = customOrder.mapIndexed { index, name -> name to index }.toMap()

        val sortedOptions = if (customOrder.isNotEmpty()) {
            availableOptions.sortedWith { a, b ->
                val nameA = (a as? Enum<*>)?.name ?: a.toString()
                val nameB = (b as? Enum<*>)?.name ?: b.toString()
                val idxA = orderMap[nameA] ?: Int.MAX_VALUE
                val idxB = orderMap[nameB] ?: Int.MAX_VALUE
                if (idxA != idxB) idxA.compareTo(idxB)
                else availableOptions.indexOf(a).compareTo(availableOptions.indexOf(b))
            }
        } else {
            availableOptions
        }

        return sortedOptions.filter { isOptionVisible(it, isExtendedEnabled) }
    }

    fun getStats(availableOptions: List<PauseMenuOption>, isExtendedEnabled: Boolean): CustomizationStats {
        val visible = getVisibleOrderedOptions(availableOptions, isExtendedEnabled)
        val hiddenCount = getHiddenItems().size
        val hasCustom = getCustomOrder().isNotEmpty()
        return CustomizationStats(
            totalAvailable = availableOptions.size,
            visibleCount = visible.size,
            hiddenCount = hiddenCount,
            hasCustomOrder = hasCustom,
        )
    }
}
