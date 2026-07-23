package me.magnum.melonds.ui.emulator.ui

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import kotlinx.coroutines.delay
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.common.ExternalBootInfo

@Composable
fun BootInfoOverlay(
    rom: Rom,
    boxArtUrl: String?,
    statusText: String?,
    romReady: Boolean,
    onFinished: () -> Unit,
) {
    val exit = remember { Animatable(0f) }
    var minTimeElapsed by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        delay(650)
        minTimeElapsed = true
    }
    LaunchedEffect(romReady, minTimeElapsed) {
        if (romReady && minTimeElapsed) {
            exit.animateTo(1f, tween(durationMillis = 380, easing = FastOutSlowInEasing))
            onFinished()
        }
    }

    Box(modifier = Modifier.fillMaxSize().alpha(1f - exit.value)) {
        ExternalBootInfo(
            rom = rom,
            boxArtUrl = boxArtUrl,
            statusText = statusText,
        )
    }
}
