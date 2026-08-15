package me.magnum.melonds.ui.settings.fragments

import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import me.magnum.melonds.R
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider

@AndroidEntryPoint
class TranslatorPreferencesFragment : BasePreferenceFragment(), PreferenceFragmentTitleProvider {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.pref_translator, rootKey)
    }

    override fun getTitle(): String {
        return getString(R.string.category_translator)
    }
}
