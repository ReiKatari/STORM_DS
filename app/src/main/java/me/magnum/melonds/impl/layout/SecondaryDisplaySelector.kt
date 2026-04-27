package me.magnum.melonds.impl.layout

import android.content.Context
import android.hardware.display.DisplayManager
import android.view.Display
import androidx.core.content.ContextCompat
import androidx.core.content.getSystemService
import javax.inject.Inject

class SecondaryDisplaySelector @Inject constructor() {

    private companion object {
        val ExcludedDisplays = listOf(
            "HiddenDisplay", // Seems like a placeholder display present in some devices
            "WebRTC_ScreenCapture", // Used by apps that record the screen (e.g.: Discord)
        )
    }

    fun getSecondaryDisplay(context: Context): Display? {
        val currentDisplay = ContextCompat.getDisplayOrDefault(context)
        return context.getSystemService<DisplayManager>()?.let { displayManager ->
            displayManager.getDisplays(DisplayManager.DISPLAY_CATEGORY_PRESENTATION).firstOrNull {
                it.displayId != currentDisplay.displayId && it.name !in ExcludedDisplays
            }
        }
    }
}