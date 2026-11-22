package me.magnum.melonds.ui.settings.fragments

import android.content.Intent
import android.os.Bundle
import android.view.InputDevice
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.SeekBarPreference
import androidx.preference.SwitchPreference
import dagger.hilt.android.AndroidEntryPoint
import me.magnum.melonds.R
import me.magnum.melonds.common.vibration.TouchVibrator
import me.magnum.melonds.ui.inputsetup.InputSetupActivity
import me.magnum.melonds.ui.layouts.LayoutListActivity
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider
import me.magnum.melonds.ui.settings.SettingsActivity
import me.magnum.melonds.ui.settings.preferences.InGameLockedPreference
import me.magnum.melonds.ui.settings.preferences.SoftwareInputBehaviourPreference
import javax.inject.Inject

@AndroidEntryPoint
class InputPreferencesFragment : BasePreferenceFragment(), PreferenceFragmentTitleProvider {

    @Inject lateinit var vibrator: TouchVibrator

    private lateinit var softInputBehaviourPreference: androidx.preference.ListPreference
    private var activeDialog: android.app.Dialog? = null

    override fun getTitle() = getString(R.string.input)

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.pref_input, rootKey)
        softInputBehaviourPreference = findPreference("soft_input_behaviour")!!
        val touchVibratePreference = findPreference<SwitchPreference>("input_touch_haptic_feedback_enabled")!!
        val vibrationStrengthPreference = findPreference<SeekBarPreference>("input_touch_haptic_feedback_strength")!!
        val keyMappingPreference = findPreference<InGameLockedPreference>("input_key_mapping")!!
        val layoutsPreference = findPreference<InGameLockedPreference>("input_layouts")!!
        keyMappingPreference.isInGameLocked = requireActivity().intent.getBooleanExtra(SettingsActivity.KEY_LOCK_INPUT_MAPPING, false)
        keyMappingPreference.inGameLockedMessageRes = R.string.cannot_change_use_rom_settings
        layoutsPreference.isInGameLocked = requireActivity().intent.getBooleanExtra(SettingsActivity.KEY_LOCK_INPUT_LAYOUT, false)
        layoutsPreference.inGameLockedMessageRes = R.string.cannot_change_use_rom_settings

        val opacityPreference = findPreference<SeekBarPreference>("input_opacity")
        opacityPreference?.let { opPref ->
            opPref.summary = "${opPref.value}%"
            opPref.setOnPreferenceChangeListener { _, newValue ->
                val v = newValue as? Int ?: opPref.value
                opPref.summary = "$v%"
                true
            }
        }

        val supportsVibe = vibrator.supportsVibration()
        if (!supportsVibe) {
            touchVibratePreference.isVisible = false
            vibrationStrengthPreference.isVisible = false
        } else {
            vibrationStrengthPreference.isVisible = touchVibratePreference.isChecked
            vibrationStrengthPreference.summary = "${vibrationStrengthPreference.value}%"
            touchVibratePreference.setOnPreferenceChangeListener { _, newValue ->
                vibrationStrengthPreference.isVisible = (newValue as? Boolean) == true
                true
            }
        }

        vibrationStrengthPreference.setOnPreferenceChangeListener { _, newValue ->
            val strength = newValue as Int
            vibrationStrengthPreference.summary = "$strength%"
            vibrator.performTouchHapticFeedback(strength)
            true
        }
        keyMappingPreference.setOnPreferenceClickListener {
            if (keyMappingPreference.isInGameLocked) {
                return@setOnPreferenceClickListener true
            }
            val intent = InputSetupActivity.getGlobalIntent(requireContext())
            startActivity(intent)
            true
        }
        layoutsPreference.setOnPreferenceClickListener {
            if (layoutsPreference.isInGameLocked) {
                return@setOnPreferenceClickListener true
            }
            val intent = Intent(requireContext(), LayoutListActivity::class.java)
            startActivity(intent)
            true
        }

        findPreference<androidx.preference.ListPreference>("pref_motion_gyro_mode")?.apply {
            title = getString(R.string.v870_input_gyro_mode_title)
            entries = arrayOf(
                getString(R.string.v870_input_gyro_stylus),
                getString(R.string.v870_input_gyro_dpad),
                getString(R.string.v870_input_gyro_paddle)
            )
            entryValues = arrayOf("touch_aim", "dpad_steer", "slot2_analog")
            if (value == null) {
                value = "touch_aim"
            }
        }

        findPreference<Preference>("input_gamepad_tester")?.setOnPreferenceClickListener {
            val deadzone = preferenceManager.sharedPreferences?.getInt("input_gamepad_analog_deadzone", 15)?.coerceIn(5, 40) ?: 15
            activeDialog?.dismiss()
            activeDialog = me.magnum.melonds.ui.settings.dialogs.showGamepadTesterDialog(requireContext(), deadzone)
            true
        }

        findPreference<SeekBarPreference>("input_gamepad_analog_deadzone")?.let { dzPref ->
            dzPref.summary = getString(R.string.input_gamepad_analog_deadzone_summary, dzPref.value.coerceIn(5, 40))
            dzPref.setOnPreferenceChangeListener { pref, newValue ->
                val pct = (newValue as? Int)?.coerceIn(5, 40) ?: 15
                pref.summary = getString(R.string.input_gamepad_analog_deadzone_summary, pct)
                true
            }
        }

        findPreference<SwitchPreference>("input_gyro_aiming_enabled")?.setOnPreferenceChangeListener { _, newValue ->
            val enabled = newValue as? Boolean ?: false
            preferenceManager.sharedPreferences?.edit()?.remove("pref_motion_gyro_enabled")?.apply()
            listOf(
                "pref_motion_gyro_mode",
                "input_gyro_activation_mode",
                "input_gyro_sensitivity_x",
                "input_gyro_sensitivity_y",
                "input_gyro_invert_x",
                "input_gyro_invert_y",
                "input_gyro_deadzone_x",
                "input_gyro_deadzone_y",
            ).forEach { key ->
                findPreference<Preference>(key)?.isVisible = enabled
            }
            true
        }
        hideDependentsWhenInactive(
            "input_gyro_aiming_enabled",
            "pref_motion_gyro_mode",
            "input_gyro_activation_mode",
            "input_gyro_sensitivity_x",
            "input_gyro_sensitivity_y",
            "input_gyro_invert_x",
            "input_gyro_invert_y",
            "input_gyro_deadzone_x",
            "input_gyro_deadzone_y",
        )

        updateKeyMappingSummary()
    }

    override fun onDisplayPreferenceDialog(preference: Preference) {
        if (preference.key == "button_color_theme" && preference is androidx.preference.ListPreference) {
            val ctx = context ?: return
            activeDialog?.dismiss()
            activeDialog = me.magnum.melonds.ui.settings.dialogs.showButtonColorThemePickerDialog(
                context = ctx,
                selectedValue = preference.value,
            ) { selectedKey ->
                if (preference.callChangeListener(selectedKey)) {
                    preference.value = selectedKey
                }
            }
            return
        }
        super.onDisplayPreferenceDialog(preference)
    }

    override fun onDestroyView() {
        activeDialog?.dismiss()
        activeDialog = null
        super.onDestroyView()
    }

    override fun onResume() {
        super.onResume()
        if (::softInputBehaviourPreference.isInitialized) {
            softInputBehaviourPreference.value = softInputBehaviourPreference.sharedPreferences?.getString(softInputBehaviourPreference.key, "hide_system_buttons_when_controller_connected")
        }
        updateKeyMappingSummary()
    }

    private fun updateKeyMappingSummary() {
        val keyMappingPreference = findPreference<Preference>("input_key_mapping") ?: return
        val deviceIds = InputDevice.getDeviceIds()
        val controllerNames = mutableListOf<String>()
        for (id in deviceIds) {
            val dev = InputDevice.getDevice(id) ?: continue
            if (dev.isVirtual) continue
            val sources = dev.sources
            val isGamepad = (sources and InputDevice.SOURCE_GAMEPAD) == InputDevice.SOURCE_GAMEPAD
            val isJoystick = (sources and InputDevice.SOURCE_JOYSTICK) == InputDevice.SOURCE_JOYSTICK
            if (isGamepad || isJoystick) {
                val name = dev.name.takeIf { !it.isNullOrBlank() } ?: "Gamepad $id"
                if (!controllerNames.contains(name)) {
                    controllerNames.add(name)
                }
            }
        }
        val defaultSummary = getString(R.string.key_mapping_summary)
        if (controllerNames.isNotEmpty()) {
            keyMappingPreference.summary = "$defaultSummary\n🎮 ${getString(R.string.v780_connected_controllers_format, controllerNames.joinToString(", "))}"
        } else {
            keyMappingPreference.summary = defaultSummary
        }
    }
}
