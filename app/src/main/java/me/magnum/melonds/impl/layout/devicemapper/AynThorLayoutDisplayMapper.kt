package me.magnum.melonds.impl.layout.devicemapper

import android.content.Context
import android.view.Display
import me.magnum.melonds.domain.model.layout.LayoutDisplay
import me.magnum.melonds.domain.model.layout.LayoutDisplayPair
import me.magnum.melonds.impl.layout.DeviceLayoutDisplayMapper

/**
 * [DeviceLayoutDisplayMapper] for the AYN Thor. This device has 2 different names for the built-in screens: "Built-in Screen" for the top display and "Screen-2" for the
 * bottom display.
 */
class AynThorLayoutDisplayMapper(context: Context) : DeviceLayoutDisplayMapper(context) {

    private companion object {
        val BUILT_IN_DISPLAY_NAMES = listOf(
            "Built-in Screen",
            "Screen-2",
            "Screen 2",
            "Built-in Screen 2",
            "Built-in display 2",
            "Secondary Screen",
        )
    }

    override fun mapDisplaysToLayoutDisplays(
        currentDisplay: Display,
        secondaryDisplay: Display?,
    ): LayoutDisplayPair {
        val isCurrentBuiltIn = BUILT_IN_DISPLAY_NAMES.any { it.equals(currentDisplay.name, ignoreCase = true) }
        val mainLayoutDisplay = mapDisplayToLayoutDisplay(
            display = currentDisplay,
            displayType = if (isCurrentBuiltIn) LayoutDisplay.Type.BUILT_IN else LayoutDisplay.Type.EXTERNAL,
        )
        val secondaryLayoutDisplay = secondaryDisplay?.let {
            val isSecBuiltIn = BUILT_IN_DISPLAY_NAMES.any { name -> name.equals(it.name, ignoreCase = true) }
            mapDisplayToLayoutDisplay(
                display = it,
                displayType = if (isSecBuiltIn) LayoutDisplay.Type.BUILT_IN else LayoutDisplay.Type.EXTERNAL,
            )
        }

        return LayoutDisplayPair(mainLayoutDisplay, secondaryLayoutDisplay)
    }
}