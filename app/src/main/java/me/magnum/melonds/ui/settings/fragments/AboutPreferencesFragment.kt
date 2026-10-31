package me.magnum.melonds.ui.settings.fragments

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.preference.Preference
import dagger.hilt.android.AndroidEntryPoint
import me.magnum.melonds.R
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider

@AndroidEntryPoint
class AboutPreferencesFragment : BasePreferenceFragment(), PreferenceFragmentTitleProvider {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.pref_about, rootKey)

        val vName = (runCatching { requireContext().packageManager.getPackageInfo(requireContext().packageName, 0).versionName }.getOrNull() ?: "7.9.1")
            .removePrefix("v")
            .removePrefix("V")
        findPreference<Preference>("about_version")?.summary = vName

        findPreference<Preference>("about_copy_diagnostics")?.setOnPreferenceClickListener {
            val soc = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                Build.SOC_MODEL.takeIf { !it.isNullOrBlank() } ?: Build.HARDWARE
            } else {
                Build.HARDWARE
            }
            val pm = requireContext().packageManager
            val vulkanSupported = pm.hasSystemFeature(PackageManager.FEATURE_VULKAN_HARDWARE_VERSION)
            val vulkanStatus = if (vulkanSupported) {
                getString(R.string.v780_diagnostics_vulkan_supported)
            } else {
                getString(R.string.v780_diagnostics_vulkan_unsupported)
            }
            val abi = Build.SUPPORTED_ABIS.firstOrNull() ?: "unknown"

            val diagnosticsText = buildString {
                appendLine("STORM DS $vName")
                appendLine("Device: ${Build.MANUFACTURER} ${Build.MODEL} (${Build.DEVICE})")
                appendLine("SoC: $soc (Hardware: ${Build.HARDWARE})")
                appendLine("Android: ${Build.VERSION.RELEASE} (API ${Build.VERSION.SDK_INT})")
                appendLine("ABI: $abi")
                appendLine("Vulkan: $vulkanStatus")
            }.trimEnd()

            val clipboard = requireContext().getSystemService(Context.CLIPBOARD_SERVICE) as? ClipboardManager
            if (clipboard != null) {
                val clip = ClipData.newPlainText("STORM DS Diagnostics", diagnosticsText)
                clipboard.setPrimaryClip(clip)
                Toast.makeText(
                    requireContext(),
                    R.string.v780_about_copy_diagnostics_success,
                    Toast.LENGTH_SHORT
                ).show()
            }
            true
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

        findPreference<Preference>("credits_libraries")?.setOnPreferenceClickListener {
            AlertDialog.Builder(requireContext())
                .setTitle(R.string.about_credits_libraries_title)
                .setMessage(
                    "• melonDS Core (Arisotura and melonDS team)\n" +
                    "• DraStic Open-Source Replacement BIOS\n" +
                    "• Librashader (SnowflakePowered — RetroArch Slang Shaders)\n" +
                    "• rcheevos (RetroAchievements C Library)\n" +
                    "• Google ML Kit Text Recognition and Translation\n" +
                    "• Jetpack Compose, Material 3 and AndroidX\n" +
                    "• Dagger Hilt, Kotlin Coroutines and Serialization\n" +
                    "• OkHttp, Retrofit, Room and Markwon\n" +
                    "• Picasso and Coil Image Loaders"
                )
                .setPositiveButton(android.R.string.ok, null)
                .show()
            true
        }
    }

    override fun getTitle(): String = getString(R.string.about_app_title)
}
