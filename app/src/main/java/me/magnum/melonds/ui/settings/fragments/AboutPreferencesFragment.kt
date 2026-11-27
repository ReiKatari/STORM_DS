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

        val vName = (runCatching { requireContext().packageManager.getPackageInfo(requireContext().packageName, 0).versionName }.getOrNull() ?: "8.9.3")
            .removePrefix("v")
            .removePrefix("V")
        findPreference<Preference>("about_version")?.summary = vName

        findPreference<Preference>("manual_check_updates")?.setOnPreferenceClickListener {
            me.magnum.melonds.ui.settings.ManualUpdateChecker.checkNow(requireContext())
            true
        }

        val actManager = requireContext().getSystemService(Context.ACTIVITY_SERVICE) as? android.app.ActivityManager
        val memInfo = android.app.ActivityManager.MemoryInfo()
        actManager?.getMemoryInfo(memInfo)
        val totalRamGb = memInfo.totalMem / (1024 * 1024 * 1024.0)
        val availRamGb = memInfo.availMem / (1024 * 1024 * 1024.0)
        val ramFormatted = String.format(java.util.Locale.US, "%.1f / %.1f GB", availRamGb, totalRamGb)

        val pm = requireContext().packageManager
        val vulkanSupported = pm.hasSystemFeature(PackageManager.FEATURE_VULKAN_HARDWARE_VERSION)
        val glesVersion = actManager?.deviceConfigurationInfo?.glEsVersion ?: "3.2"
        val storagePath = requireContext().getExternalFilesDir(null)?.absolutePath ?: requireContext().filesDir.absolutePath

        val soc = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            Build.SOC_MODEL.takeIf { !it.isNullOrBlank() } ?: Build.HARDWARE
        } else {
            Build.HARDWARE
        }
        val abi = Build.SUPPORTED_ABIS.firstOrNull() ?: "unknown"

        findPreference<Preference>("about_copy_diagnostics")?.summary =
            "${Build.MANUFACTURER} ${Build.MODEL} • Android ${Build.VERSION.RELEASE} (API ${Build.VERSION.SDK_INT}) • RAM: $ramFormatted • Vulkan: ${getString(if (vulkanSupported) R.string.yes else R.string.no)}"

        findPreference<Preference>("about_copy_diagnostics")?.setOnPreferenceClickListener {
            val vulkanStatus = if (vulkanSupported) {
                getString(R.string.v780_diagnostics_vulkan_supported)
            } else {
                getString(R.string.v780_diagnostics_vulkan_unsupported)
            }

            val diagnosticsText = buildString {
                appendLine("STORM DS $vName")
                appendLine("Device: ${Build.MANUFACTURER} ${Build.MODEL} (${Build.DEVICE})")
                appendLine("SoC: $soc (Hardware: ${Build.HARDWARE})")
                appendLine("Android: ${Build.VERSION.RELEASE} (API ${Build.VERSION.SDK_INT})")
                appendLine("ABI: $abi (Supported: ${Build.SUPPORTED_ABIS.joinToString(", ")})")
                appendLine("RAM: $ramFormatted (Available / Total)")
                appendLine("OpenGL ES: $glesVersion")
                appendLine("Vulkan: $vulkanStatus")
                appendLine("Storage: $storagePath")
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
            openExternalUrl("https://github.com/SapphireRhodonite/WatermelonDS")
            true
        }

        findPreference<Preference>("about_github")?.setOnPreferenceClickListener {
            openExternalUrl("https://github.com/ReiKatari/STORM_DS")
            true
        }

        findPreference<Preference>("credits_jpeacekeeper")?.setOnPreferenceClickListener {
            openExternalUrl("https://4pda.to/forum/index.php?showuser=5768740")
            true
        }

        findPreference<Preference>("credits_melonds")?.setOnPreferenceClickListener {
            openExternalUrl("https://melonds.kuribo64.net/")
            true
        }

        findPreference<Preference>("credits_melonds_ds")?.setOnPreferenceClickListener {
            openExternalUrl("https://github.com/JesseTG/melonds-ds")
            true
        }

        findPreference<Preference>("credits_melon_android_origins")?.setOnPreferenceClickListener {
            openExternalUrl("https://github.com/melonDS-emu/melonDS-android")
            true
        }

        findPreference<Preference>("credits_drastic")?.setOnPreferenceClickListener {
            openExternalUrl("https://drastic-ds.com/")
            true
        }

        findPreference<Preference>("credits_drivers_vulkan")?.setOnPreferenceClickListener {
            openExternalUrl("https://github.com/bylaws/libadrenotools")
            true
        }

        findPreference<Preference>("credits_shaders")?.setOnPreferenceClickListener {
            openExternalUrl("https://github.com/SnowflakePowered/librashader")
            true
        }

        findPreference<Preference>("credits_core_engines")?.setOnPreferenceClickListener {
            openExternalUrl("https://github.com/dolphin-emu/dolphin")
            true
        }

        findPreference<Preference>("credits_audio_netplay")?.setOnPreferenceClickListener {
            openExternalUrl("https://github.com/google/oboe")
            true
        }

        findPreference<Preference>("credits_achievements_cheats")?.setOnPreferenceClickListener {
            openExternalUrl("https://retroachievements.org/")
            true
        }

        findPreference<Preference>("credits_fonts_archives")?.setOnPreferenceClickListener {
            openExternalUrl("https://github.com/TakWolf/fusion-pixel-font")
            true
        }

        findPreference<Preference>("credits_libraries")?.setOnPreferenceClickListener {
            AlertDialog.Builder(requireContext())
                .setTitle(R.string.about_credits_libraries_title)
                .setMessage(
                    "• melonDS Core (Arisotura, StapleButter, Nadia, RSDuck & team)\n" +
                    "• FreeBIOS (DraStic Open-Source Replacement BIOS)\n" +
                    "• Dolphin ARMJIT Emitters (ARM64 & x64 JIT)\n" +
                    "• Teakra (Nintendo DSi DSP Engine)\n" +
                    "• SoundTouch, blip_buf & FAAD2 Audio Processing\n" +
                    "• Khronos Vulkan, OpenGL ES, SPIR-V & PanVK\n" +
                    "• Mesa Freedreno / Turnip & libadrenotools (bylaws)\n" +
                    "• librashader (SnowflakePowered) & Libretro Slang Shaders\n" +
                    "• Google Oboe (AAudio / OpenSL ES Low-Latency Audio)\n" +
                    "• ENet & libslirp (NiFi LAN & Nintendo WFC Networking)\n" +
                    "• Wiimmfi, Kaeru WFC & AltWFC / WFCZwei\n" +
                    "• rcheevos (RetroAchievements) & Libretro Thumbnails\n" +
                    "• Jusrcheat (xperia64) & DeadSkullzJr Cheat Database\n" +
                    "• FatFs (ChaN), Zstandard (zstd), miniz, tiny-AES-c & xxHash\n" +
                    "• Apache Commons Compress, junrar & Tukaani XZ\n" +
                    "• Google ML Kit Text Recognition & Offline Translation\n" +
                    "• Jetpack Compose, Material 3, AndroidX & CameraX\n" +
                    "• Dagger Hilt, Kotlin Coroutines, Serialization & Gson\n" +
                    "• OkHttp, Retrofit, Room, Markwon, Picasso & Coil\n" +
                    "• Avalonia UI, SkiaSharp & .NET 10 (Windows Edition)"
                )
                .setPositiveButton(android.R.string.ok, null)
                .show()
            true
        }
    }

    private fun openExternalUrl(url: String) {
        val ctx = context ?: return
        runCatching {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }.onFailure {
            Toast.makeText(ctx, "No browser app installed", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getTitle(): String = getString(R.string.about_app_title)
}
