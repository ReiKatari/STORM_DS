package me.magnum.melonds.ui.inputsetup

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import me.magnum.melonds.domain.model.ControllerConfiguration
import me.magnum.melonds.domain.model.Input
import me.magnum.melonds.domain.model.InputConfig
import me.magnum.melonds.domain.model.Slot2AnalogMapping
import me.magnum.melonds.domain.model.rom.config.RomInputMode
import me.magnum.melonds.domain.repositories.RomsRepository
import me.magnum.melonds.domain.repositories.SettingsRepository
import me.magnum.melonds.parcelables.RomParcelable
import me.magnum.melonds.utils.EventSharedFlow
import javax.inject.Inject

@HiltViewModel
class InputSetupViewModel @Inject constructor(
    private val settingsRepository: SettingsRepository,
    private val romsRepository: RomsRepository,
    savedStateHandle: SavedStateHandle,
) : ViewModel() {
    enum class Slot2AnalogAxisTarget {
        X,
        Y,
    }

    private var rom = savedStateHandle.get<RomParcelable>(InputSetupActivity.KEY_ROM)?.rom

    private val initialConfiguration = rom?.config?.customControllerConfiguration
        ?: settingsRepository.getControllerConfiguration()
    private val _inputConfig = MutableStateFlow(initialConfiguration.copy().inputMapper)
    val inputConfiguration = _inputConfig.asStateFlow()

    private val _slot2AnalogMapping = MutableStateFlow(initialConfiguration.slot2AnalogMapping)
    val slot2AnalogMapping = _slot2AnalogMapping.asStateFlow()

    private val _inputUnderAssignment = MutableStateFlow<Input?>(null)
    val inputUnderAssignment = _inputUnderAssignment.asStateFlow()

    private val _assigningCombo = MutableStateFlow(false)
    val assigningCombo = _assigningCombo.asStateFlow()
    private val _comboConflict = MutableStateFlow<Input?>(null)
    val comboConflict = _comboConflict.asStateFlow()
    private val comboKeys = linkedSetOf<Int>()
    private var comboDevice: Int? = null

    private val _slot2AxisUnderAssignment = MutableStateFlow<Slot2AnalogAxisTarget?>(null)
    val slot2AxisUnderAssignment = _slot2AxisUnderAssignment.asStateFlow()

    private val _onInputAssignedEvent = EventSharedFlow<Input>()
    val onInputAssignedEvent = _onInputAssignedEvent.asSharedFlow()

    private var hasLocalChanges = false

    init {
        rom?.let { initialRom ->
            viewModelScope.launch {
                val refreshedRom = romsRepository.getRomAtUri(initialRom.uri) ?: return@launch
                if (hasLocalChanges) {
                    return@launch
                }
                val refreshedConfiguration = refreshedRom.config.customControllerConfiguration
                    ?: settingsRepository.getControllerConfiguration()
                rom = refreshedRom
                _inputConfig.value = refreshedConfiguration.copy().inputMapper
                _slot2AnalogMapping.value = refreshedConfiguration.slot2AnalogMapping
            }
        }
    }

    fun startInputAssignment(input: Input) {
        stopInputAssignment()
        _slot2AxisUnderAssignment.value = null
        _inputUnderAssignment.value = input
    }

    fun startComboAssignment(input: Input) {
        if (input.isSystemInput) return
        startInputAssignment(input)
        _assigningCombo.value = true
    }

    fun stopInputAssignment() {
        _inputUnderAssignment.value = null
        _assigningCombo.value = false
        _comboConflict.value = null
        comboKeys.clear()
        comboDevice = null
    }

    fun startSlot2AxisAssignment(target: Slot2AnalogAxisTarget) {
        stopInputAssignment()
        _slot2AxisUnderAssignment.value = target
    }

    fun stopSlot2AxisAssignment() {
        _slot2AxisUnderAssignment.value = null
    }

    fun stopAnyAssignment() {
        stopInputAssignment()
        _slot2AxisUnderAssignment.value = null
    }

    fun updateInputAssignedKey(key: Int) {
        val inputUnderAssignment = _inputUnderAssignment.value ?: return
        val inputType = InputConfig.Assignment.Key(null, key)
        setInputAssignment(inputUnderAssignment, inputType)
        focusOnNextInput(inputUnderAssignment)
    }

    fun updateInputAssignedChord(modifierKey: Int, triggerKey: Int) {
        val inputUnderAssignment = _inputUnderAssignment.value ?: return
        val inputType = InputConfig.Assignment.Chord(null, modifierKey, triggerKey)
        setInputAssignment(inputUnderAssignment, inputType)
        focusOnNextInput(inputUnderAssignment)
    }

    fun updateComboKey(key: Int, deviceId: Int, pressed: Boolean) {
        val input = _inputUnderAssignment.value ?: return
        if (!_assigningCombo.value || key <= 0) return
        if (pressed) {
            if (comboDevice != null && comboDevice != deviceId) return
            comboDevice = deviceId
            _comboConflict.value = null
            comboKeys.add(key)
            if (comboKeys.size != 2) return
            val conflict = _inputConfig.value.firstOrNull { config ->
                config.input != input && listOf(config.assignment, config.altAssignment).any {
                    it is InputConfig.Assignment.Chord && setOf(it.modifierKeyCode, it.triggerKeyCode) == comboKeys
                }
            }
            if (conflict != null) {
                _comboConflict.value = conflict.input
                return
            }
            val modifier = comboKeys.first()
            val main = comboKeys.last()
            setInputAssignment(input, InputConfig.Assignment.Chord(null, modifier, main))
            focusOnNextInput(input)
        } else if (comboDevice == deviceId) {
            comboKeys.remove(key)
            if (comboKeys.isEmpty()) comboDevice = null
        }
    }

    fun updateInputAssignedAxis(axis: Int, direction: InputConfig.Assignment.Axis.Direction) {
        if (_assigningCombo.value) return
        val inputUnderAssignment = _inputUnderAssignment.value ?: return
        val inputType = InputConfig.Assignment.Axis(null, axis, direction)
        setInputAssignment(inputUnderAssignment, inputType)
        focusOnNextInput(inputUnderAssignment)
    }

    fun clearInputAssignment(input: Input) {
        setInputAssignment(input, InputConfig.Assignment.None)
        stopInputAssignment()
    }

    fun updateSlot2AxisAssignment(axisCode: Int, deviceId: Int) {
        val target = _slot2AxisUnderAssignment.value ?: return
        val currentMapping = _slot2AnalogMapping.value
        val nextMapping = when (target) {
            Slot2AnalogAxisTarget.X -> currentMapping.copy(axisXCode = axisCode, deviceId = deviceId)
            Slot2AnalogAxisTarget.Y -> currentMapping.copy(axisYCode = axisCode, deviceId = deviceId)
        }
        updateSlot2AnalogMapping(nextMapping)
        _slot2AxisUnderAssignment.value = null
    }

    fun setSlot2InvertX(invert: Boolean) {
        updateSlot2AnalogMapping(_slot2AnalogMapping.value.copy(invertX = invert))
    }

    fun setSlot2InvertY(invert: Boolean) {
        updateSlot2AnalogMapping(_slot2AnalogMapping.value.copy(invertY = invert))
    }

    fun setSlot2Deadzone(deadzone: Float) {
        updateSlot2AnalogMapping(_slot2AnalogMapping.value.copy(deadzone = deadzone.coerceIn(0f, 1f)))
    }

    fun setSlot2UseDeviceFilter(enabled: Boolean) {
        val currentMapping = _slot2AnalogMapping.value
        val shouldEnable = enabled && currentMapping.deviceId != null
        updateSlot2AnalogMapping(currentMapping.copy(useDeviceFilter = shouldEnable))
    }

    private fun setInputAssignment(input: Input, assignment: InputConfig.Assignment) {
        val inputIndex = _inputConfig.value.indexOfFirst { it.input == input }
        if (inputIndex >= 0) {
            _inputConfig.update { config ->
                config.toMutableList().apply {
                    val current = this[inputIndex]
                    var primary = current.assignment
                    var secondary = current.altAssignment
                    when (assignment) {
                        InputConfig.Assignment.None -> {
                            primary = InputConfig.Assignment.None
                            secondary = InputConfig.Assignment.None
                        }
                        is InputConfig.Assignment.Key -> {
                            if (primary == InputConfig.Assignment.None || primary == assignment) {
                                primary = assignment
                            } else if (secondary == InputConfig.Assignment.None || secondary == assignment) {
                                secondary = assignment
                            } else {
                                secondary = assignment
                            }
                        }
                        is InputConfig.Assignment.Chord -> {
                            if (primary == InputConfig.Assignment.None || primary == assignment) {
                                primary = assignment
                            } else {
                                secondary = assignment
                            }
                        }
                        is InputConfig.Assignment.Axis -> {
                            if (primary == InputConfig.Assignment.None|| primary == assignment) {
                                primary = assignment
                            } else if (secondary == InputConfig.Assignment.None || secondary == assignment) {
                                secondary = assignment
                            } else {
                                secondary = assignment
                            }
                        }
                    }
                    this[inputIndex] = current.copy(assignment = primary, altAssignment = secondary)
                }.also {
                    onConfigsChanged(it)
                }
            }
        }
        stopInputAssignment()
    }

    private fun onConfigsChanged(newConfig: List<InputConfig>) {
        persistConfiguration(
            newConfig = newConfig,
            newMapping = _slot2AnalogMapping.value,
        )
    }

    private fun updateSlot2AnalogMapping(newMapping: Slot2AnalogMapping) {
        _slot2AnalogMapping.value = newMapping
        persistConfiguration(
            newConfig = _inputConfig.value,
            newMapping = newMapping,
        )
    }

    private fun persistConfiguration(newConfig: List<InputConfig>, newMapping: Slot2AnalogMapping) {
        val currentConfiguration = ControllerConfiguration(
            configList = newConfig,
            slot2AnalogMapping = newMapping,
        )
        hasLocalChanges = true
        val currentRom = rom
        if (currentRom != null) {
            val updatedConfig = currentRom.config.copy(
                inputMode = RomInputMode.CUSTOM,
                customControllerConfiguration = currentConfiguration,
            )
            romsRepository.updateRomConfig(currentRom, updatedConfig)
            rom = currentRom.copy(config = updatedConfig)
        } else {
            settingsRepository.setControllerConfiguration(currentConfiguration)
        }
    }

    private fun focusOnNextInput(currentInput: Input) {
        val currentInputIndex = _inputConfig.value.indexOfFirst { it.input == currentInput }
        val nextInput = _inputConfig.value.getOrNull(currentInputIndex + 1)
        if (nextInput != null) {
            _onInputAssignedEvent.tryEmit(nextInput.input)
        }
    }
    fun autoMapStandardGamepad() {
        val standardConfigs = ControllerConfiguration.standardGamepadInputConfigs()
        _inputConfig.update {
            standardConfigs.also {
                onConfigsChanged(it)
            }
        }
        stopInputAssignment()
    }

    fun clearAllAssignments() {
        _inputConfig.update { list ->
            list.map { cfg ->
                cfg.copy(assignment = InputConfig.Assignment.None, altAssignment = InputConfig.Assignment.None)
            }.also {
                onConfigsChanged(it)
            }
        }
        stopInputAssignment()
    }
}
