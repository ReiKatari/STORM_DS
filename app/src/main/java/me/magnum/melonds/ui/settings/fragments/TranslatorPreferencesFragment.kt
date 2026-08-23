package me.magnum.melonds.ui.settings.fragments

import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import me.magnum.melonds.R
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider

@AndroidEntryPoint
class TranslatorPreferencesFragment : BasePreferenceFragment(), PreferenceFragmentTitleProvider {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.pref_translator, rootKey)

        val translatorEnabledPref = findPreference<androidx.preference.SwitchPreferenceCompat>("translator_enabled")
        val ttsEnabledPref = findPreference<androidx.preference.SwitchPreferenceCompat>("translator_tts_enabled")
        val voiceEnginePref = findPreference<androidx.preference.ListPreference>(me.magnum.melonds.translator.tts.GameTtsManager.PREF_TRANSLATOR_TTS_VOICE_ENGINE)
        val localVoiceStudioPref = findPreference<androidx.preference.SwitchPreferenceCompat>("translator_local_voice_actor_studio")

        translatorEnabledPref?.setOnPreferenceChangeListener { _, newValue ->
            val isEnabled = newValue as? Boolean ?: false
            if (!isEnabled) {
                ttsEnabledPref?.isChecked = false
            }
            true
        }

        voiceEnginePref?.setOnPreferenceChangeListener { _, newValue ->
            val chosen = newValue as? String ?: "neural_edge"
            val isNeural = chosen == "neural_edge"
            val isMulti = chosen != "single"
            val isLocalMulti = chosen == "local_multi"

            localVoiceStudioPref?.isChecked = isLocalMulti

            preferenceManager.sharedPreferences?.edit()
                ?.putBoolean(me.magnum.melonds.translator.tts.GameTtsManager.PREF_TRANSLATOR_TTS_NEURAL_ENABLED, isNeural)
                ?.putBoolean(me.magnum.melonds.translator.tts.GameTtsManager.PREF_TRANSLATOR_TTS_MULTI_VOICE, isMulti)
                ?.putBoolean("translator_local_voice_actor_studio", isLocalMulti)
                ?.apply()
            true
        }

        localVoiceStudioPref?.setOnPreferenceChangeListener { _, newValue ->
            val isEnabled = newValue as? Boolean ?: false
            if (isEnabled) {
                voiceEnginePref?.value = "local_multi"
                preferenceManager.sharedPreferences?.edit()
                    ?.putString(me.magnum.melonds.translator.tts.GameTtsManager.PREF_TRANSLATOR_TTS_VOICE_ENGINE, "local_multi")
                    ?.putBoolean(me.magnum.melonds.translator.tts.GameTtsManager.PREF_TRANSLATOR_TTS_NEURAL_ENABLED, false)
                    ?.putBoolean(me.magnum.melonds.translator.tts.GameTtsManager.PREF_TRANSLATOR_TTS_MULTI_VOICE, true)
                    ?.apply()
            } else {
                if (voiceEnginePref?.value == "local_multi") {
                    voiceEnginePref.value = "neural_edge"
                    preferenceManager.sharedPreferences?.edit()
                        ?.putString(me.magnum.melonds.translator.tts.GameTtsManager.PREF_TRANSLATOR_TTS_VOICE_ENGINE, "neural_edge")
                        ?.putBoolean(me.magnum.melonds.translator.tts.GameTtsManager.PREF_TRANSLATOR_TTS_NEURAL_ENABLED, true)
                        ?.putBoolean(me.magnum.melonds.translator.tts.GameTtsManager.PREF_TRANSLATOR_TTS_MULTI_VOICE, true)
                        ?.apply()
                }
            }
            true
        }
    }

    override fun getTitle(): String {
        return getString(R.string.category_translator)
    }
}
