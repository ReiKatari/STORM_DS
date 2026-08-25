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

        runCatching {
            val pInfo = requireContext().packageManager.getPackageInfo(requireContext().packageName, 0)
            val vName = pInfo.versionName ?: "1.0.0"
            val vCode = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.P) {
                pInfo.longVersionCode
            } else {
                @Suppress("DEPRECATION")
                pInfo.versionCode.toLong()
            }
            findPreference<Preference>("about_version")?.summary = "v$vName (Build $vCode)"
        }

        findPreference<Preference>("about_fork_info")?.setOnPreferenceClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/SapphireRhodonite/WatermelonDS"))
            startActivity(intent)
            true
        }

        findPreference<Preference>("about_github")?.setOnPreferenceClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/ReiKatari/STORM_DS"))
            startActivity(intent)
            true
        }

        findPreference<Preference>("credits_jpeacekeeper")?.setOnPreferenceClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://4pda.to/forum/index.php?showuser=5768740"))
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

        findPreference<Preference>("credits_melonds_ds")?.setOnPreferenceClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/JesseTG/melonds-ds"))
            startActivity(intent)
            true
        }

        findPreference<Preference>("credits_drastic")?.setOnPreferenceClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drastic-ds.com/"))
            startActivity(intent)
            true
        }
    }

    override fun getTitle(): String = getString(R.string.about_app_title)
}
