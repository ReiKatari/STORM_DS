package me.magnum.melonds.ui.emulator.rom

import android.content.Context
import androidx.preference.PreferenceManager
import me.magnum.melonds.ui.emulator.PauseMenuOption
import me.magnum.melonds.ui.emulator.firmware.FirmwarePauseMenuOption

class PauseMenuCustomizationStore(
    private val context: Context,
    private val isFirmwareMode: Boolean = false,
) {

    private val prefs by lazy { PreferenceManager.getDefaultSharedPreferences(context) }
    private val keyPrefix: String = if (isFirmwareMode) "firmware_" else ""

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

    private val customOrderKey: String get() = "${keyPrefix}$KEY_CUSTOM_ORDER"
    private val hiddenItemsKey: String get() = "${keyPrefix}$KEY_HIDDEN_ITEMS"
    private val individuallyPinnedKey: String get() = "${keyPrefix}$KEY_INDIVIDUALLY_PINNED"

    private fun isProtectedOption(option: PauseMenuOption): Boolean {
        return option == RomPauseMenuOption.SETTINGS || option == FirmwarePauseMenuOption.SETTINGS
    }

    fun getCustomOrder(): List<String> {
        val raw = prefs.getString(customOrderKey, null) ?: return emptyList()
        return raw.split(",")
            .map { it.trim() }
            .filter { it.isNotEmpty() }
    }

    fun saveCustomOrder(order: List<String>) {
        val csv = order.joinToString(",")
        prefs.edit().putString(customOrderKey, csv).apply()
    }

    fun getHiddenItems(): Set<String> {
        return prefs.getStringSet(hiddenItemsKey, emptySet())?.toSet() ?: emptySet()
    }

    fun saveHiddenItems(hidden: Set<String>) {
        // Enforce protection: SETTINGS can never be hidden
        val safeHidden = hidden.filterNot {
            it == RomPauseMenuOption.SETTINGS.name || it == FirmwarePauseMenuOption.SETTINGS.name
        }.toSet()
        prefs.edit().putStringSet(hiddenItemsKey, safeHidden).apply()
    }

    fun getIndividuallyPinned(): Set<String> {
        return prefs.getStringSet(individuallyPinnedKey, emptySet())?.toSet() ?: emptySet()
    }

    fun saveIndividuallyPinned(pinned: Set<String>) {
        prefs.edit().putStringSet(individuallyPinnedKey, pinned.toSet()).apply()
    }

    fun resetToDefaults() {
        prefs.edit()
            .remove(customOrderKey)
            .remove(hiddenItemsKey)
            .remove(individuallyPinnedKey)
            .apply()
    }

    fun isExtendedOption(option: PauseMenuOption): Boolean {
        return option in DEFAULT_EXTENDED_OPTIONS
    }

    fun isOptionVisible(option: PauseMenuOption, isExtendedEnabled: Boolean): Boolean {
        return isOptionVisible(
            option = option,
            isExtendedEnabled = isExtendedEnabled,
            hiddenItems = getHiddenItems(),
            individuallyPinned = getIndividuallyPinned(),
        )
    }

    fun isOptionVisible(
        option: PauseMenuOption,
        isExtendedEnabled: Boolean,
        hiddenItems: Set<String>,
        individuallyPinned: Set<String>,
    ): Boolean {
        val name = (option as? Enum<*>)?.name ?: option.toString()
        // Protection: SETTINGS is always visible
        if (isProtectedOption(option)) return true

        if (name in hiddenItems) return false

        val isExt = isExtendedOption(option)
        if (!isExt) return true

        if (isExtendedEnabled) return true

        return name in individuallyPinned
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
