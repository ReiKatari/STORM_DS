package me.magnum.melonds.domain.model

import android.view.KeyEvent
import android.view.MotionEvent

class ControllerConfiguration(
    configList: List<InputConfig>,
    val slot2AnalogMapping: Slot2AnalogMapping = Slot2AnalogMapping(),
) {
    companion object {
        private val configurableInput = listOf(
            Input.A,
            Input.B,
            Input.X,
            Input.Y,
            Input.LEFT,
            Input.RIGHT,
            Input.UP,
            Input.DOWN,
            Input.L,
            Input.R,
            Input.START,
            Input.SELECT,
            Input.HINGE,
            Input.PAUSE,
            Input.FAST_FORWARD,
            Input.HOLD_FAST_FORWARD,
            Input.MICROPHONE,
            Input.RESET,
            Input.SWAP_SCREENS,
            Input.QUICK_SAVE,
            Input.QUICK_LOAD,
            Input.REWIND,
            Input.TRANSLATE,
            Input.LOCK_ROTATION,
            Input.TOGGLE_EXTRA_BUTTONS,
            Input.TOGGLE_ANALOG_STICK,
            Input.SLOW_MOTION,
            Input.FRAME_ADVANCE,
            Input.TAKE_SCREENSHOT,
            Input.TOGGLE_HARDWARE_TURBO,
            Input.CYCLE_LAYOUT,
            Input.EXIT_GAME,
        )

        private val standardGamepadAssignments: Map<Input, Pair<InputConfig.Assignment, InputConfig.Assignment>> by lazy {
            mapOf(
                Input.UP to (
                    InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_DPAD_UP) to
                        InputConfig.Assignment.Axis(null, MotionEvent.AXIS_HAT_Y, InputConfig.Assignment.Axis.Direction.NEGATIVE)
                    ),
                Input.DOWN to (
                    InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_DPAD_DOWN) to
                        InputConfig.Assignment.Axis(null, MotionEvent.AXIS_HAT_Y, InputConfig.Assignment.Axis.Direction.POSITIVE)
                    ),
                Input.LEFT to (
                    InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_DPAD_LEFT) to
                        InputConfig.Assignment.Axis(null, MotionEvent.AXIS_HAT_X, InputConfig.Assignment.Axis.Direction.NEGATIVE)
                    ),
                Input.RIGHT to (
                    InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_DPAD_RIGHT) to
                        InputConfig.Assignment.Axis(null, MotionEvent.AXIS_HAT_X, InputConfig.Assignment.Axis.Direction.POSITIVE)
                    ),
                Input.A to (
                    InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_BUTTON_B) to
                        InputConfig.Assignment.None
                    ),
                Input.B to (
                    InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_BUTTON_A) to
                        InputConfig.Assignment.None
                    ),
                Input.X to (
                    InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_BUTTON_Y) to
                        InputConfig.Assignment.None
                    ),
                Input.Y to (
                    InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_BUTTON_X) to
                        InputConfig.Assignment.None
                    ),
                Input.L to (
                    InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_BUTTON_L1) to
                        InputConfig.Assignment.None
                    ),
                Input.R to (
                    InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_BUTTON_R1) to
                        InputConfig.Assignment.None
                    ),
                Input.START to (
                    InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_BUTTON_START) to
                        InputConfig.Assignment.None
                    ),
                Input.SELECT to (
                    InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_BUTTON_SELECT) to
                        InputConfig.Assignment.None
                    ),
                Input.FAST_FORWARD to (
                    InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_BUTTON_THUMBR) to
                        InputConfig.Assignment.None
                    ),
                Input.SWAP_SCREENS to (
                    InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_BUTTON_THUMBL) to
                        InputConfig.Assignment.None
                    ),
                Input.PAUSE to (
                    InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_BUTTON_MODE) to
                        InputConfig.Assignment.None
                    ),
            )
        }

        fun standardGamepadInputConfigs(): List<InputConfig> {
            return configurableInput.map { input ->
                val pair = standardGamepadAssignments[input]
                if (pair != null) {
                    InputConfig(input, pair.first, pair.second)
                } else {
                    InputConfig(input)
                }
            }
        }

        fun standardGamepadConfiguration(
            slot2AnalogMapping: Slot2AnalogMapping = Slot2AnalogMapping(),
        ): ControllerConfiguration {
            return ControllerConfiguration(
                configList = standardGamepadInputConfigs(),
                slot2AnalogMapping = slot2AnalogMapping,
            )
        }
    }

    val inputMapper: List<InputConfig>

    init {
        inputMapper = configurableInput.map { input ->
            // Find config in the config list, or fallback to a default config without assignments
            configList.firstOrNull { it.input == input } ?: InputConfig(input)
        }
    }

    fun getInputAssignments(input: Input): List<InputConfig.Assignment>? {
        return inputMapper.firstOrNull { it.input == input && it.hasKeyAssigned() }?.let {
            listOfNotNull(
                it.assignment.takeIf { it != InputConfig.Assignment.None },
                it.altAssignment.takeIf { it != InputConfig.Assignment.None },
            )
        }
    }

    fun keyToInput(key: Int): Input? {
        for (config in inputMapper) {
            val assignments = listOf(config.assignment, config.altAssignment)
            if (assignments.any { (it as? InputConfig.Assignment.Key)?.keyCode == key }) {
                return config.input
            }
        }
        return null
    }

    fun axisToInput(axis: Int, direction: InputConfig.Assignment.Axis.Direction): Input? {
        return inputMapper.firstOrNull { config ->
            val assignments = listOf(config.assignment, config.altAssignment)
            assignments.any {
                (it as? InputConfig.Assignment.Axis)?.let { ax ->
                    ax.axisCode == axis && ax.direction == direction
                } ?: false
            }
        }?.input
    }

    fun chordToInput(modifierKey: Int, triggerKey: Int, deviceId: Int? = null): Input? {
        for (config in inputMapper) {
            val assignments = listOf(config.assignment, config.altAssignment)
            for (assignment in assignments) {
                if (assignment is InputConfig.Assignment.Chord &&
                    (assignment.deviceId == null || deviceId == null || assignment.deviceId == deviceId) &&
                    ((assignment.modifierKeyCode == modifierKey && assignment.triggerKeyCode == triggerKey) ||
                        (assignment.modifierKeyCode == triggerKey && assignment.triggerKeyCode == modifierKey))
                ) {
                    return config.input
                }
            }
        }
        return null
    }

    fun copy(): ControllerConfiguration {
        return ControllerConfiguration(
            configList = inputMapper.map { it.copy() },
            slot2AnalogMapping = slot2AnalogMapping.copy(),
        )
    }
}
