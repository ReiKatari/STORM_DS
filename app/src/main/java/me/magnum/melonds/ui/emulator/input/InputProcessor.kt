package me.magnum.melonds.ui.emulator.input

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.os.SystemClock
import android.util.Log
import android.view.InputDevice
import android.view.KeyEvent
import android.view.MotionEvent
import android.widget.Toast
import androidx.preference.PreferenceManager
import me.magnum.melonds.MelonDSApplication
import me.magnum.melonds.MelonEmulator
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.ControllerConfiguration
import me.magnum.melonds.domain.model.Input
import me.magnum.melonds.domain.model.InputConfig
import java.util.Locale
import kotlin.math.absoluteValue

class InputProcessor(
    private val controllerConfiguration: ControllerConfiguration,
    private val systemInputListener: IInputListener,
    private val frontendInputListener: IInputListener,
    private val context: Context? = null,
) : INativeInputListener {

    companion object {
        private const val TAG = "InputProcessor"
        private const val SLOT2_ANALOG_LOG_INTERVAL_MS = 1500L
        private const val SLOT2_RAW_ANALOG_PRIORITY_MS = 150L
        private val slot2XAxisFallbackCodes = intArrayOf(
            MotionEvent.AXIS_X,
            MotionEvent.AXIS_HAT_X,
            MotionEvent.AXIS_Z,
            MotionEvent.AXIS_RX,
            MotionEvent.AXIS_LTRIGGER,
            MotionEvent.AXIS_RTRIGGER,
        )
        private val slot2YAxisFallbackCodes = intArrayOf(
            MotionEvent.AXIS_Y,
            MotionEvent.AXIS_HAT_Y,
            MotionEvent.AXIS_RY,
            MotionEvent.AXIS_RZ,
            MotionEvent.AXIS_BRAKE,
            MotionEvent.AXIS_GAS,
        )
        private val r2Axes = intArrayOf(
            MotionEvent.AXIS_RTRIGGER,
            MotionEvent.AXIS_GAS,
            MotionEvent.AXIS_RZ,
        )
        private val l2Axes = intArrayOf(
            MotionEvent.AXIS_LTRIGGER,
            MotionEvent.AXIS_BRAKE,
            MotionEvent.AXIS_Z,
        )

        private val turboEligibleButtons = setOf(
            Input.A,
            Input.B,
            Input.X,
            Input.Y,
            Input.L,
            Input.R,
        )
    }

    private val mainHandler = Handler(Looper.getMainLooper())
    private val axisStates: Map<Axis, AxisState>
    private val lastFrontendInputPressMs = java.util.EnumMap<Input, Long>(Input::class.java)
    private var lastSlot2AnalogLogAtMs = 0L
    private var lastSlot2RawAnalogEventAtMs = 0L
    private var slot2DigitalLeftPressed = false
    private var slot2DigitalRightPressed = false
    private var slot2DigitalUpPressed = false
    private var slot2DigitalDownPressed = false

    // Hardware Turbo state
    private var isHardwareTurboActive = false
    private val activeTurboRunnables = mutableMapOf<Input, Runnable>()
    private val turboButtonsInDownState = mutableSetOf<Input>()

    // Chord Hotkeys state
    private val heldPhysicalKeys = mutableSetOf<Int>()
    private val activeChordTriggers = mutableMapOf<Int, Input>()
    private var selectModifierHeld = false
    private var selectUsedInChord = false

    init {
        val configuredAxes = controllerConfiguration.inputMapper.flatMap { inputConfig ->
            listOf(inputConfig.assignment, inputConfig.altAssignment)
        }.mapNotNull { assignment ->
            (assignment as? InputConfig.Assignment.Axis)?.let {
                Axis(it.deviceId, it.axisCode, it.direction)
            }
        }.toMutableList()

        val hasR2Mapped = controllerConfiguration.keyToInput(KeyEvent.KEYCODE_BUTTON_R2) != null ||
            r2Axes.any { axisCode -> controllerConfiguration.axisToInput(axisCode, InputConfig.Assignment.Axis.Direction.POSITIVE) != null }
        if (hasR2Mapped) {
            for (axisCode in r2Axes) {
                if (configuredAxes.none { it.axisCode == axisCode }) {
                    configuredAxes.add(Axis(null, axisCode, InputConfig.Assignment.Axis.Direction.POSITIVE))
                }
            }
        }

        val hasL2Mapped = controllerConfiguration.keyToInput(KeyEvent.KEYCODE_BUTTON_L2) != null ||
            l2Axes.any { axisCode -> controllerConfiguration.axisToInput(axisCode, InputConfig.Assignment.Axis.Direction.POSITIVE) != null }
        if (hasL2Mapped) {
            for (axisCode in l2Axes) {
                if (configuredAxes.none { it.axisCode == axisCode }) {
                    configuredAxes.add(Axis(null, axisCode, InputConfig.Assignment.Axis.Direction.POSITIVE))
                }
            }
        }

        axisStates = configuredAxes.distinct().associateWith { AxisState(0f, false) }
    }

    private fun getAppContext(): Context? {
        return context ?: MelonDSApplication.appContext
    }

    private fun isChordHotkeysEnabled(): Boolean {
        val ctx = getAppContext() ?: return true
        return PreferenceManager.getDefaultSharedPreferences(ctx).getBoolean("input_chord_hotkeys_enabled", true)
    }

    private fun getTurboFrequencyHz(): Int {
        val ctx = getAppContext() ?: return 15
        val freqStr = PreferenceManager.getDefaultSharedPreferences(ctx).getString("input_turbo_frequency_hz", "15") ?: "15"
        return freqStr.toIntOrNull() ?: 15
    }

    private fun isSelectKeyCode(keyCode: Int): Boolean {
        return keyCode == KeyEvent.KEYCODE_BUTTON_SELECT ||
            controllerConfiguration.keyToInput(keyCode) == Input.SELECT
    }

    override fun onKeyEvent(keyEvent: KeyEvent): Boolean {
        val keyCode = keyEvent.keyCode
        var input = controllerConfiguration.keyToInput(keyCode)
        if (input == null) {
            input = resolveTriggerKeyFallback(keyCode)
        }

        val fromController = keyEvent.isFromSource(InputDevice.SOURCE_CLASS_JOYSTICK)
            || keyEvent.isFromSource(InputDevice.SOURCE_JOYSTICK)
            || keyEvent.isFromSource(InputDevice.SOURCE_GAMEPAD)
            || keyEvent.isFromSource(InputDevice.SOURCE_DPAD)
            || keyEvent.device?.supportsSource(InputDevice.SOURCE_JOYSTICK) == true
            || keyEvent.device?.supportsSource(InputDevice.SOURCE_GAMEPAD) == true

        when (keyEvent.action) {
            KeyEvent.ACTION_DOWN -> {
                if (keyEvent.repeatCount > 0) {
                    if (keyCode in activeChordTriggers || input?.isSystemInput == false) {
                        return true
                    }
                }

                // 1. Check user custom chords first
                for (modKey in heldPhysicalKeys) {
                    val customChordInput = controllerConfiguration.chordToInput(modKey, keyCode)
                    if (customChordInput != null) {
                        activeChordTriggers[keyCode] = customChordInput
                        // Release modifier in system listener if it was previously pressed
                        controllerConfiguration.keyToInput(modKey)?.let { modInput ->
                            if (modInput.isSystemInput) {
                                systemInputListener.onKeyReleased(modInput)
                            }
                        }
                        dispatchInputPressed(customChordInput, fromController)
                        return true
                    }
                }

                // 2. Check built-in Select Chord Hotkeys (Select + R, L, Start, Y, X)
                if (isChordHotkeysEnabled() && (selectModifierHeld || heldPhysicalKeys.any { isSelectKeyCode(it) })) {
                    val selectChordAction: Input? = when {
                        input == Input.R || keyCode == KeyEvent.KEYCODE_BUTTON_R1 -> Input.FAST_FORWARD
                        input == Input.L || keyCode == KeyEvent.KEYCODE_BUTTON_L1 -> Input.REWIND
                        input == Input.START || keyCode == KeyEvent.KEYCODE_BUTTON_START -> Input.PAUSE
                        input == Input.Y || keyCode == KeyEvent.KEYCODE_BUTTON_Y || keyCode == KeyEvent.KEYCODE_BUTTON_X -> Input.TAKE_SCREENSHOT
                        input == Input.X -> Input.SLOW_MOTION
                        else -> null
                    }
                    if (selectChordAction != null) {
                        selectUsedInChord = true
                        // Instantly release SELECT in the emulator so the game does not see the modifier
                        systemInputListener.onKeyReleased(Input.SELECT)
                        activeChordTriggers[keyCode] = selectChordAction
                        dispatchInputPressed(selectChordAction, fromController)
                        return true
                    }
                }

                if (isSelectKeyCode(keyCode)) {
                    selectModifierHeld = true
                    selectUsedInChord = false
                }

                heldPhysicalKeys.add(keyCode)

                if (input == null) return false

                dispatchInputPressed(input, fromController)
                return true
            }

            KeyEvent.ACTION_UP -> {
                heldPhysicalKeys.remove(keyCode)

                // 1. Release active chord trigger
                if (keyCode in activeChordTriggers) {
                    val chordAction = activeChordTriggers.remove(keyCode)
                    if (chordAction != null) {
                        dispatchInputReleased(chordAction, fromController)
                    }
                    return true
                }

                // 2. If Select key released
                if (isSelectKeyCode(keyCode)) {
                    selectModifierHeld = false
                    if (selectUsedInChord) {
                        selectUsedInChord = false
                        // Select was already released when chord fired; don't send duplicate release
                        return true
                    }
                }

                if (input == null) return false

                dispatchInputReleased(input, fromController)
                return true
            }
        }
        return false
    }

    override fun onMotionEvent(motionEvent: MotionEvent): Boolean {
        if (isControllerMotionEvent(motionEvent)) {
            val slot2Handled = processSlot2AnalogFromMotionEvent(motionEvent)

            val deviceAxis = axisStates.filterKeys { it.deviceId == null || it.deviceId == motionEvent.deviceId }
            deviceAxis.forEach {
                val axis = it.key
                val axisState = it.value

                val newValue = motionEvent.getAxisValue(axis.axisCode)
                val clampedValue = when (axis.direction) {
                    InputConfig.Assignment.Axis.Direction.POSITIVE -> newValue.coerceAtLeast(0f)
                    InputConfig.Assignment.Axis.Direction.NEGATIVE -> newValue.coerceAtMost(0f)
                }

                if (axisState.shouldToggleFor(newValue = clampedValue)) {
                    resolveAxisInput(axis.axisCode, axis.direction)?.let { input ->
                        if (axisState.active) {
                            axisState.active = false
                            dispatchInputReleased(input, fromController = true)
                        } else {
                            axisState.active = true
                            dispatchInputPressed(input, fromController = true)
                        }
                    }
                }
                axisState.value = clampedValue
            }
            return slot2Handled || deviceAxis.isNotEmpty()
        } else {
            return false
        }
    }

    private fun resolveTriggerKeyFallback(keyCode: Int): Input? {
        return when (keyCode) {
            KeyEvent.KEYCODE_BUTTON_R2 -> {
                for (axisCode in r2Axes) {
                    val input = controllerConfiguration.axisToInput(axisCode, InputConfig.Assignment.Axis.Direction.POSITIVE)
                    if (input != null) return input
                }
                null
            }
            KeyEvent.KEYCODE_BUTTON_L2 -> {
                for (axisCode in l2Axes) {
                    val input = controllerConfiguration.axisToInput(axisCode, InputConfig.Assignment.Axis.Direction.POSITIVE)
                    if (input != null) return input
                }
                null
            }
            else -> null
        }
    }

    private fun resolveAxisInput(axisCode: Int, direction: InputConfig.Assignment.Axis.Direction): Input? {
        val direct = controllerConfiguration.axisToInput(axisCode, direction)
        if (direct != null) return direct

        if (direction == InputConfig.Assignment.Axis.Direction.POSITIVE) {
            if (axisCode in r2Axes) {
                for (altAxis in r2Axes) {
                    val altInput = controllerConfiguration.axisToInput(altAxis, direction)
                    if (altInput != null) return altInput
                }
                val keyInput = controllerConfiguration.keyToInput(KeyEvent.KEYCODE_BUTTON_R2)
                if (keyInput != null) return keyInput
            }
            if (axisCode in l2Axes) {
                for (altAxis in l2Axes) {
                    val altInput = controllerConfiguration.axisToInput(altAxis, direction)
                    if (altInput != null) return altInput
                }
                val keyInput = controllerConfiguration.keyToInput(KeyEvent.KEYCODE_BUTTON_L2)
                if (keyInput != null) return keyInput
            }
        }
        return null
    }

    override fun onMotionEventSlot2(motionEvent: MotionEvent): Boolean {
        if (!isControllerMotionEvent(motionEvent)) {
            return false
        }
        return processSlot2AnalogFromMotionEvent(motionEvent)
    }

    private fun dispatchInputPressed(input: Input, fromController: Boolean) {
        if (input == Input.TOGGLE_HARDWARE_TURBO) {
            toggleHardwareTurbo()
            return
        }

        if (input == Input.PAUSE) {
            stopAllTurboPulses()
        }

        updateSlot2DigitalFallback(input, pressed = true, fromController = fromController)

        if (input.isSystemInput) {
            if (isHardwareTurboActive && fromController && input in turboEligibleButtons) {
                startTurboForButton(input)
            } else {
                systemInputListener.onKeyPress(input)
            }
        } else {
            if (input != Input.HOLD_FAST_FORWARD) {
                val now = SystemClock.uptimeMillis()
                val prev = lastFrontendInputPressMs[input] ?: 0L
                if (now - prev < 250L) {
                    return
                }
                lastFrontendInputPressMs[input] = now
            }
            frontendInputListener.onKeyPress(input)
        }
    }

    private fun dispatchInputReleased(input: Input, fromController: Boolean) {
        updateSlot2DigitalFallback(input, pressed = false, fromController = fromController)

        if (input.isSystemInput) {
            if (input in activeTurboRunnables) {
                stopTurboForButton(input)
            } else {
                systemInputListener.onKeyReleased(input)
            }
        } else {
            frontendInputListener.onKeyReleased(input)
        }
    }

    private fun toggleHardwareTurbo() {
        isHardwareTurboActive = !isHardwareTurboActive
        if (!isHardwareTurboActive) {
            stopAllTurboPulses()
        }
        val ctx = getAppContext() ?: return
        val freq = getTurboFrequencyHz()
        val text = if (isHardwareTurboActive) {
            ctx.getString(R.string.turbo_toast_enabled_format, freq)
        } else {
            ctx.getString(R.string.turbo_toast_disabled)
        }
        mainHandler.post {
            Toast.makeText(ctx, text, Toast.LENGTH_SHORT).show()
        }
    }

    private fun startTurboForButton(input: Input) {
        if (input in activeTurboRunnables) return
        val freqHz = getTurboFrequencyHz().coerceIn(10, 30)
        val periodMs = (1000L / freqHz).coerceAtLeast(20L)
        val halfPeriodMs = (periodMs / 2L).coerceAtLeast(10L)

        var isPressedState = true
        systemInputListener.onKeyPress(input)
        turboButtonsInDownState.add(input)

        val runnable = object : Runnable {
            override fun run() {
                if (!isHardwareTurboActive || input !in activeTurboRunnables) {
                    return
                }
                if (isPressedState) {
                    systemInputListener.onKeyReleased(input)
                    turboButtonsInDownState.remove(input)
                    isPressedState = false
                    mainHandler.postDelayed(this, halfPeriodMs)
                } else {
                    systemInputListener.onKeyPress(input)
                    turboButtonsInDownState.add(input)
                    isPressedState = true
                    mainHandler.postDelayed(this, halfPeriodMs)
                }
            }
        }
        activeTurboRunnables[input] = runnable
        mainHandler.postDelayed(runnable, halfPeriodMs)
    }

    private fun stopTurboForButton(input: Input) {
        activeTurboRunnables.remove(input)?.let { mainHandler.removeCallbacks(it) }
        if (input in turboButtonsInDownState) {
            systemInputListener.onKeyReleased(input)
            turboButtonsInDownState.remove(input)
        }
    }

    private fun stopAllTurboPulses() {
        activeTurboRunnables.values.forEach { mainHandler.removeCallbacks(it) }
        activeTurboRunnables.clear()
        for (btn in turboButtonsInDownState) {
            systemInputListener.onKeyReleased(btn)
        }
        turboButtonsInDownState.clear()
    }

    private fun updateSlot2DigitalFallback(input: Input, pressed: Boolean, fromController: Boolean) {
        if (!fromController) {
            return
        }

        when (input) {
            Input.LEFT -> slot2DigitalLeftPressed = pressed
            Input.RIGHT -> slot2DigitalRightPressed = pressed
            Input.UP -> slot2DigitalUpPressed = pressed
            Input.DOWN -> slot2DigitalDownPressed = pressed
            else -> return
        }

        val now = SystemClock.uptimeMillis()
        if (now - lastSlot2RawAnalogEventAtMs <= SLOT2_RAW_ANALOG_PRIORITY_MS) {
            return
        }

        val digitalX = when {
            slot2DigitalLeftPressed == slot2DigitalRightPressed -> 0f
            slot2DigitalLeftPressed -> -1f
            else -> 1f
        }
        val digitalY = when {
            slot2DigitalUpPressed == slot2DigitalDownPressed -> 0f
            slot2DigitalUpPressed -> -1f
            else -> 1f
        }

        MelonEmulator.setSlot2AnalogInput(digitalX, digitalY)
        if ((digitalX.absoluteValue > 0f || digitalY.absoluteValue > 0f)
            && now - lastSlot2AnalogLogAtMs >= SLOT2_ANALOG_LOG_INTERVAL_MS
        ) {
            lastSlot2AnalogLogAtMs = now
            Log.w(
                TAG,
                "slot2AnalogInput source=digital-fallback x=${"%.3f".format(Locale.US, digitalX)} y=${"%.3f".format(Locale.US, digitalY)}",
            )
        }
    }

    private fun isControllerMotionEvent(motionEvent: MotionEvent): Boolean {
        return motionEvent.isFromSource(InputDevice.SOURCE_CLASS_JOYSTICK)
            || motionEvent.isFromSource(InputDevice.SOURCE_JOYSTICK)
            || motionEvent.isFromSource(InputDevice.SOURCE_GAMEPAD)
    }

    private fun processSlot2AnalogFromMotionEvent(motionEvent: MotionEvent): Boolean {
        val slot2Mapping = controllerConfiguration.slot2AnalogMapping
        val mappedDeviceId = slot2Mapping.effectiveDeviceId()
        val mappedDeviceConnected = mappedDeviceId == null || InputDevice.getDevice(mappedDeviceId) != null
        if (mappedDeviceId != null && mappedDeviceId != motionEvent.deviceId && mappedDeviceConnected) {
            return false
        }

        val deadzone = slot2Mapping.normalizedDeadzone()
        val rawAnalogX = resolveSlot2AxisValue(
            motionEvent = motionEvent,
            preferredAxisCode = slot2Mapping.axisXCode,
            fallbackAxisCodes = slot2XAxisFallbackCodes,
        ).coerceIn(-1f, 1f)
        val rawAnalogY = resolveSlot2AxisValue(
            motionEvent = motionEvent,
            preferredAxisCode = slot2Mapping.axisYCode,
            fallbackAxisCodes = slot2YAxisFallbackCodes,
        ).coerceIn(-1f, 1f)
        val mappedX = if (slot2Mapping.invertX) -rawAnalogX else rawAnalogX
        val mappedY = if (slot2Mapping.invertY) -rawAnalogY else rawAnalogY
        val analogX = if (mappedX.absoluteValue < deadzone) 0f else mappedX
        val analogY = if (mappedY.absoluteValue < deadzone) 0f else mappedY
        MelonEmulator.setSlot2AnalogInput(analogX, analogY)
        val now = SystemClock.uptimeMillis()
        lastSlot2RawAnalogEventAtMs = now
        if ((analogX.absoluteValue > 0f || analogY.absoluteValue > 0f)
            && now - lastSlot2AnalogLogAtMs >= SLOT2_ANALOG_LOG_INTERVAL_MS
        ) {
            lastSlot2AnalogLogAtMs = now
            Log.w(
                TAG,
                "slot2AnalogInput deviceId=${motionEvent.deviceId} source=0x${motionEvent.source.toString(16)} axisX=${slot2Mapping.axisXCode} axisY=${slot2Mapping.axisYCode} x=${"%.3f".format(Locale.US, analogX)} y=${"%.3f".format(Locale.US, analogY)} deadzone=${"%.3f".format(Locale.US, deadzone)}",
            )
        }
        return true
    }

    private fun resolveSlot2AxisValue(
        motionEvent: MotionEvent,
        preferredAxisCode: Int,
        fallbackAxisCodes: IntArray,
    ): Float {
        val preferredValue = motionEvent.getAxisValue(preferredAxisCode)
        if (deviceSupportsAxis(motionEvent, preferredAxisCode)) {
            return preferredValue
        }

        if (preferredValue.absoluteValue > 0.0001f) {
            return preferredValue
        }

        var bestAxisValue = preferredValue
        var bestAxisAbs = preferredValue.absoluteValue
        fallbackAxisCodes.forEach { axisCode ->
            if (axisCode == preferredAxisCode) {
                return@forEach
            }
            val axisValue = motionEvent.getAxisValue(axisCode)
            val axisAbs = axisValue.absoluteValue
            if (axisAbs > bestAxisAbs) {
                bestAxisAbs = axisAbs
                bestAxisValue = axisValue
            }
        }
        return bestAxisValue
    }

    private fun deviceSupportsAxis(motionEvent: MotionEvent, axisCode: Int): Boolean {
        val device = motionEvent.device ?: return false
        return device.getMotionRange(axisCode, motionEvent.source) != null
            || device.getMotionRange(axisCode, InputDevice.SOURCE_CLASS_JOYSTICK) != null
            || device.getMotionRange(axisCode, InputDevice.SOURCE_JOYSTICK) != null
            || device.getMotionRange(axisCode, InputDevice.SOURCE_GAMEPAD) != null
            || device.getMotionRange(axisCode) != null
    }

    private data class Axis(
        val deviceId: Int?,
        val axisCode: Int,
        val direction: InputConfig.Assignment.Axis.Direction,
    )

    private data class AxisState(
        var value: Float,
        var active: Boolean,
    ) {
        fun shouldToggleFor(newValue: Float): Boolean {
            return if (active) {
                newValue.absoluteValue < 0.5f
            } else {
                newValue.absoluteValue >= 0.5f
            }
        }
    }
}
