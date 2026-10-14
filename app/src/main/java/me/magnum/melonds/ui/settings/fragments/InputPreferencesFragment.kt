package me.magnum.melonds.ui.settings.fragments

import android.content.Intent
import android.os.Bundle
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

        val supportsVibe = vibrator.supportsVibration()
        if (!supportsVibe) {
            touchVibratePreference.isVisible = false
            vibrationStrengthPreference.isVisible = false
        } else {
            vibrationStrengthPreference.isVisible = touchVibratePreference.isChecked
            touchVibratePreference.setOnPreferenceChangeListener { _, newValue ->
                vibrationStrengthPreference.isVisible = (newValue as? Boolean) == true
                true
            }
        }

        vibrationStrengthPreference.setOnPreferenceChangeListener { _, newValue ->
            val strength = newValue as Int
            vibrator.performTouchHapticFeedback(strength)
            true
        }
        keyMappingPreference.setOnPreferenceClickListener {
            val intent = InputSetupActivity.getGlobalIntent(requireContext())
            startActivity(intent)
            true
        }
        layoutsPreference.setOnPreferenceClickListener {
            val intent = Intent(requireContext(), LayoutListActivity::class.java)
            startActivity(intent)
            true
        }

        findPreference<androidx.preference.ListPreference>("pref_motion_gyro_mode")?.apply {
            val lang = resources.configuration.locales.get(0)?.language?.lowercase().orEmpty()
            title = when (lang) {
                "ru" -> "Режим работы гироскопа"
                "de" -> "Gyroskop-Modus"
                "fr" -> "Mode gyroscope"
                "zh" -> "陀螺仪模式"
                "ja" -> "ジャイロモード"
                else -> "Gyroscope mode"
            }
            entries = when (lang) {
                "ru" -> arrayOf(
                    "Прицеливание стилусом (FPS / Шутеры)",
                    "Наклон руля D-Pad (Гонки)",
                    "Аналоговый сенсор Slot-2"
                )
                "de" -> arrayOf(
                    "Stylus-Zielen (FPS / Shooter)",
                    "D-Pad-Lenkung (Rennspiele)",
                    "Slot-2-Analogsensor"
                )
                "fr" -> arrayOf(
                    "Visée au stylet (FPS / Tir)",
                    "Direction D-Pad (Course)",
                    "Capteur analogique Slot-2"
                )
                "zh" -> arrayOf(
                    "触控笔瞄准 (FPS / 射击)",
                    "十字键倾斜转向 (赛车)",
                    "Slot-2 模拟传感器"
                )
                "ja" -> arrayOf(
                    "タッチペン照準 (FPS / シューティング)",
                    "十字キー傾きステアリング (レース)",
                    "スロット2アナログセンサー"
                )
                else -> arrayOf(
                    "Touchscreen stylus aiming (FPS)",
                    "D-Pad tilt steering (Racing)",
                    "Slot-2 analog motion sensor"
                )
            }
            entryValues = arrayOf("touch_aim", "dpad_steer", "slot2_analog")
            if (value == null) {
                value = "touch_aim"
            }
        }
    }

    override fun onResume() {
        super.onResume()
        if (::softInputBehaviourPreference.isInitialized) {
            softInputBehaviourPreference.value = softInputBehaviourPreference.sharedPreferences?.getString(softInputBehaviourPreference.key, "hide_system_buttons_when_controller_connected")
        }
    }
}
