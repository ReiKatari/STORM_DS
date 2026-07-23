package me.magnum.melonds.ui.common

import android.app.Presentation
import android.content.Context
import android.hardware.display.DisplayManager
import android.os.Bundle
import android.view.Display
import androidx.activity.ComponentActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.setViewTreeLifecycleOwner
import androidx.lifecycle.setViewTreeViewModelStoreOwner
import androidx.savedstate.setViewTreeSavedStateRegistryOwner
import me.magnum.melonds.ui.theme.MelonTheme
import me.magnum.melonds.ui.theme.WatermelonColors
import me.magnum.melonds.ui.theme.WatermelonMono

class ExternalInfoPresentation(
    private val activity: ComponentActivity,
    display: Display,
) : Presentation(activity, display) {

    private val content = mutableStateOf<(@Composable () -> Unit)?>(null)

    fun setInfoContent(block: (@Composable () -> Unit)?) {
        content.value = block
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val composeView = ComposeView(context).apply {
            setViewTreeLifecycleOwner(activity)
            setViewTreeViewModelStoreOwner(activity)
            setViewTreeSavedStateRegistryOwner(activity)
            setContent {
                MelonTheme(isDarkTheme = true) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(WatermelonColors.tvBg),
                    ) {
                        content.value?.invoke()
                    }
                }
            }
        }
        setContentView(composeView)
    }
}

class ExternalInfoDisplayController(private val activity: ComponentActivity) {

    private var presentation: ExternalInfoPresentation? = null
    private var currentContent: (@Composable () -> Unit)? = null

    private val displayManager: DisplayManager
        get() = activity.getSystemService(Context.DISPLAY_SERVICE) as DisplayManager

    private val displayListener = object : DisplayManager.DisplayListener {
        override fun onDisplayAdded(displayId: Int) = refresh()
        override fun onDisplayRemoved(displayId: Int) = refresh()
        override fun onDisplayChanged(displayId: Int) = Unit
    }

    fun attach() {
        displayManager.registerDisplayListener(displayListener, null)
        refresh()
    }

    fun detach() {
        displayManager.unregisterDisplayListener(displayListener)
        presentation?.dismiss()
        presentation = null
    }

    fun setContent(block: (@Composable () -> Unit)?) {
        currentContent = block
        presentation?.setInfoContent(block)
    }

    private fun refresh() {
        val display = displayManager.getDisplays(DisplayManager.DISPLAY_CATEGORY_PRESENTATION).firstOrNull()
        if (display == null) {
            presentation?.dismiss()
            presentation = null
            return
        }
        if (presentation?.display?.displayId != display.displayId) {
            presentation?.dismiss()
            presentation = ExternalInfoPresentation(activity, display).also {
                it.setInfoContent(currentContent)
                runCatching { it.show() }
            }
        }
    }
}
