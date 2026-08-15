package me.magnum.melonds.ui.settings.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.preference.Preference
import dagger.hilt.android.AndroidEntryPoint
import me.magnum.melonds.R
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider

@AndroidEntryPoint
class AboutPreferencesFragment : BasePreferenceFragment(), PreferenceFragmentTitleProvider {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.pref_about, rootKey)

        findPreference<Preference>("about_github")?.setOnPreferenceClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/ReiKatari/STORM_DS"))
            startActivity(intent)
            true
        }

        findPreference<Preference>("credits_watermelonds")?.setOnPreferenceClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/SapphireRhodonite/WatermelonDS"))
            startActivity(intent)
            true
        }

        findPreference<Preference>("credits_melonds")?.setOnPreferenceClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://melonds.kuribo64.net/"))
            startActivity(intent)
            true
        }
    }

    override fun getTitle(): String = getString(R.string.about_app_title)
}
