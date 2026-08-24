package me.magnum.melonds.ui.emulator.ui

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import me.magnum.melonds.domain.model.ConsoleType
import me.magnum.melonds.ui.emulator.composables.Console3DBootScreen

enum class DsBootScreenHalf { BOTH, TOP, BOTTOM }

@Composable
fun DsBootOverlay(
    half: DsBootScreenHalf,
    romReady: Boolean,
    romTitle: String?,
    modifier: Modifier = Modifier,
    isDsi: Boolean = false,
    statusText: String? = null,
    onFinished: () -> Unit,
) {
    val intro = remember { Animatable(0f) }
    val exit = remember { Animatable(0f) }

    LaunchedEffect(Unit) {
        intro.animateTo(1f, tween(durationMillis = 200, easing = FastOutSlowInEasing))
    }
    LaunchedEffect(romReady) {
        if (romReady) {
            exit.animateTo(1f, tween(durationMillis = 180, easing = FastOutSlowInEasing))
            onFinished()
        }
    }

    val contentAlpha = (intro.value * (1f - smooth(exit.value))).coerceIn(0f, 1f)
    val consoleType = if (isDsi) ConsoleType.DSi else ConsoleType.DS

    Console3DBootScreen(
        consoleType = consoleType,
        statusText = statusText ?: (if (isDsi) "Launching Nintendo DSi System Firmware…" else "Launching Nintendo DS System Firmware…"),
        contentAlpha = contentAlpha,
        modifier = modifier,
    )
}

private fun smooth(x: Float): Float {
    val t = x.coerceIn(0f, 1f)
    return t * t * (3f - 2f * t)
}
