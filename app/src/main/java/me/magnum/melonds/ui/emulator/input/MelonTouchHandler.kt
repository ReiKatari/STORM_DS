package me.magnum.melonds.ui.emulator.input

import android.os.Handler
import android.os.Looper
import android.os.SystemClock
import me.magnum.melonds.MelonEmulator
import me.magnum.melonds.domain.model.Input
import me.magnum.melonds.domain.model.Point

class MelonTouchHandler(
    var onLidStateChanged: ((Boolean) -> Unit)? = null,
    var onStartPressed: (() -> Unit)? = null,
    var onShoulderButtonStateChanged: ((Input, Boolean) -> Unit)? = null,
    var isHardcoreModeActiveProvider: () -> Boolean = { false },
) : IInputListener {
    var isLidClosed = false
        private set
    var turboMacrosEnabled = false
    var turboFrequencyHz = 15

    fun isTurboAllowed(): Boolean = !isHardcoreModeActiveProvider()

    private val handler = Handler(Looper.getMainLooper())
    private val lastPressTimeMs = mutableMapOf<Input, Long>()
    private val activeTurboRunnables = mutableMapOf<Input, Runnable>()

    override fun onKeyPress(key: Input) {
        if (key == Input.HINGE) {
            handleHingePress()
        } else {
            if (key == Input.START) {
                onStartPressed?.invoke()
            }
            if (key == Input.L || key == Input.R) {
                onShoulderButtonStateChanged?.invoke(key, true)
            }
            stopTurboFor(key)
            MelonEmulator.onInputDown(key)
            if (turboMacrosEnabled && isTurboAllowed() && key in TURBO_ELIGIBLE_INPUTS) {
                val now = SystemClock.uptimeMillis()
                val prev = lastPressTimeMs[key] ?: 0L
                lastPressTimeMs[key] = now
                if (now - prev in 30L..260L) {
                    val hz = turboFrequencyHz.coerceIn(1, 60)
                    val halfPeriodMs = (500L / hz).coerceAtLeast(16L)
                    var isDown = true
                    val runnable = object : Runnable {
                        override fun run() {
                            isDown = !isDown
                            if (isDown) {
                                MelonEmulator.onInputDown(key)
                            } else {
                                MelonEmulator.onInputUp(key)
                            }
                            handler.postDelayed(this, halfPeriodMs)
                        }
                    }
                    activeTurboRunnables[key] = runnable
                    handler.postDelayed(runnable, halfPeriodMs)
                }
            }
        }
    }

    override fun onKeyReleased(key: Input) {
        if (key != Input.HINGE) {
            if (key == Input.L || key == Input.R) {
                onShoulderButtonStateChanged?.invoke(key, false)
            }
            stopTurboFor(key)
            MelonEmulator.onInputUp(key)
        }
    }

    fun stopAllTurbo() {
        val activeKeys = activeTurboRunnables.keys.toList()
        for (key in activeKeys) {
            stopTurboFor(key)
            MelonEmulator.onInputUp(key)
        }
    }

    private fun stopTurboFor(key: Input) {
        activeTurboRunnables.remove(key)?.let { handler.removeCallbacks(it) }
    }

    override fun onTouch(point: Point) {
        if (isLidClosed) {
            handleHingePress()
            return
        }
        MelonEmulator.onScreenTouch(point.x, point.y)
    }

    fun handleHingePress() {
        isLidClosed = !isLidClosed
        if (isLidClosed) {
            MelonEmulator.onInputDown(Input.HINGE)
        } else {
            MelonEmulator.onInputUp(Input.HINGE)
        }
        onLidStateChanged?.invoke(isLidClosed)
    }

    private companion object {
        val TURBO_ELIGIBLE_INPUTS = setOf(
            Input.A,
            Input.B,
            Input.X,
            Input.Y,
            Input.L,
            Input.R,
        )
    }
}