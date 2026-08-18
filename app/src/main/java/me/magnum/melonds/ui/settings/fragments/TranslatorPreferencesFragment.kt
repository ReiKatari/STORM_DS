package me.magnum.melonds.ui.settings.fragments

import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import me.magnum.melonds.R
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider

@AndroidEntryPoint
class TranslatorPreferencesFragment : BasePreferenceFragment(), PreferenceFragmentTitleProvider {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.pref_translator, rootKey)

        findPreference<androidx.preference.ListPreference>(me.magnum.melonds.translator.tts.GameTtsManager.PREF_TRANSLATOR_TTS_VOICE_ENGINE)?.setOnPreferenceChangeListener { _, newValue ->
            val chosen = newValue as? String ?: "neural_edge"
            val isNeural = chosen == "neural_edge"
            val isMulti = chosen != "single"
            preferenceManager.sharedPreferences?.edit()
                ?.putBoolean(me.magnum.melonds.translator.tts.GameTtsManager.PREF_TRANSLATOR_TTS_NEURAL_ENABLED, isNeural)
                ?.putBoolean(me.magnum.melonds.translator.tts.GameTtsManager.PREF_TRANSLATOR_TTS_MULTI_VOICE, isMulti)
                ?.apply()
            true
        }
    }

    override fun getTitle(): String {
        return getString(R.string.category_translator)
    }
}
