package me.magnum.melonds.ui.settings.fragments

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.preference.ListPreference
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import me.magnum.melonds.R
import me.magnum.melonds.common.DirectoryAccessValidator
import me.magnum.melonds.common.UriPermissionManager
import me.magnum.melonds.domain.model.ConfigurationDirResult
import me.magnum.melonds.domain.model.ConsoleType
import me.magnum.melonds.ui.settings.viewmodel.CustomFirmwareViewModel
import me.magnum.melonds.ui.settings.PreferenceFragmentHelper
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider
import me.magnum.melonds.ui.settings.preferences.BiosDirectoryPickerPreference
import me.magnum.melonds.utils.enumValueOfIgnoreCase
import javax.inject.Inject

@AndroidEntryPoint
class CustomFirmwarePreferencesFragment : BasePreferenceFragment(), PreferenceFragmentTitleProvider {

    private val viewModel by viewModels<CustomFirmwareViewModel>()
    private val helper by lazy { PreferenceFragmentHelper(this, uriPermissionManager, directoryAccessValidator) }
    @Inject lateinit var uriPermissionManager: UriPermissionManager
    @Inject lateinit var directoryAccessValidator: DirectoryAccessValidator
    @Inject lateinit var biosDownloadManager: me.magnum.melonds.impl.bios.BiosDownloadManager

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.pref_custom_firmware, rootKey)
        val dsBiosDirPreference = findPreference<BiosDirectoryPickerPreference>("bios_dir")!!
        val dsiBiosDirPreference = findPreference<BiosDirectoryPickerPreference>("dsi_bios_dir")!!

        helper.setupStoragePickerPreference(dsBiosDirPreference)
        helper.setupStoragePickerPreference(dsiBiosDirPreference)

        val biosValidator = object : BiosDirectoryPickerPreference.BiosDirectoryValidator {
            override fun getBiosDirectoryValidationResult(consoleType: ConsoleType, directory: Uri?): ConfigurationDirResult {
                return viewModel.getConsoleConfigurationDirectoryStatus(consoleType, directory)
            }
        }

        dsBiosDirPreference.setBiosDirectoryValidator(biosValidator)
        dsiBiosDirPreference.setBiosDirectoryValidator(biosValidator)

        val autoDownloadDsPreference = findPreference<androidx.preference.Preference>("auto_download_ds_bios")
        val autoDownloadDsiPreference = findPreference<androidx.preference.Preference>("auto_download_dsi_bios")
        val blockDownloadPreference = findPreference<androidx.preference.SwitchPreference>("block_bios_download")

        fun updateDownloadVisibility(blocked: Boolean) {
            autoDownloadDsPreference?.isVisible = !blocked
            autoDownloadDsiPreference?.isVisible = !blocked
        }

        val isBlocked = blockDownloadPreference?.isChecked ?: false
        updateDownloadVisibility(isBlocked)

        blockDownloadPreference?.setOnPreferenceChangeListener { _, newValue ->
            val blocked = newValue as Boolean
            updateDownloadVisibility(blocked)
            true
        }

        fun createDownloadProgressDialog(title: String, message: String): Pair<AlertDialog, android.widget.ProgressBar> {
            val ctx = requireContext()
            val density = ctx.resources.displayMetrics.density
            val padH = (24 * density).toInt()
            val padV = (16 * density).toInt()

            val container = android.widget.LinearLayout(ctx).apply {
                orientation = android.widget.LinearLayout.VERTICAL
                setPadding(padH, padV, padH, padV)
            }
            val msgView = android.widget.TextView(ctx).apply {
                text = message
                setPadding(0, 0, 0, (12 * density).toInt())
            }
            val progressBar = android.widget.ProgressBar(ctx, null, android.R.attr.progressBarStyleHorizontal).apply {
                max = 100
                progress = 0
                isIndeterminate = false
            }
            container.addView(msgView)
            container.addView(progressBar)

            val dialog = AlertDialog.Builder(ctx)
                .setTitle(title)
                .setView(container)
                .setCancelable(false)
                .create()
            dialog.show()
            return dialog to progressBar
        }

        autoDownloadDsPreference?.setOnPreferenceClickListener {
            val (progressDialog, progressBar) = createDownloadProgressDialog(
                title = getString(R.string.auto_download_ds_bios_title),
                message = "Загрузка и настройка bios7.bin, bios9.bin, firmware.bin, sd_card.bin..."
            )

            lifecycleScope.launch {
                val result = biosDownloadManager.downloadAndSetupDsBios { progress ->
                    activity?.runOnUiThread {
                        progressBar.progress = progress
                    }
                }
                progressDialog.dismiss()
                if (result.isSuccess) {
                    val targetDir = result.getOrThrow()
                    val targetUri = Uri.fromFile(targetDir)
                    preferenceManager.sharedPreferences?.edit()?.putBoolean("use_custom_bios", true)?.apply()
                    findPreference<androidx.preference.SwitchPreference>("use_custom_bios")?.isChecked = true
                    dsBiosDirPreference.onDirectoryPicked(targetUri)
                    dsBiosDirPreference.summary = targetDir.absolutePath
                    AlertDialog.Builder(requireContext())
                        .setTitle("Успешно")
                        .setMessage("Файлы BIOS DS (bios7.bin, bios9.bin, firmware.bin, sd_card.bin) успешно скачаны и настроены!\n\nПапка: ${targetDir.absolutePath}")
                        .setPositiveButton(R.string.ok, null)
                        .show()
                } else {
                    AlertDialog.Builder(requireContext())
                        .setTitle("Ошибка")
                        .setMessage("Не удалось скачать файлы BIOS: ${result.exceptionOrNull()?.localizedMessage}")
                        .setPositiveButton(R.string.ok, null)
                        .show()
                }
            }
            true
        }

        autoDownloadDsiPreference?.setOnPreferenceClickListener {
            val (progressDialog, progressBar) = createDownloadProgressDialog(
                title = getString(R.string.auto_download_dsi_bios_title),
                message = "Загрузка и настройка bios7.bin, bios9.bin, firmware.bin, nand.bin, sd_card.bin..."
            )

            lifecycleScope.launch {
                val result = biosDownloadManager.downloadAndSetupDsiBios { progress ->
                    activity?.runOnUiThread {
                        progressBar.progress = progress
                    }
                }
                progressDialog.dismiss()
                if (result.isSuccess) {
                    val targetDir = result.getOrThrow()
                    val targetUri = Uri.fromFile(targetDir)
                    preferenceManager.sharedPreferences?.edit()?.putBoolean("use_custom_bios", true)?.apply()
                    findPreference<androidx.preference.SwitchPreference>("use_custom_bios")?.isChecked = true
                    dsiBiosDirPreference.onDirectoryPicked(targetUri)
                    dsiBiosDirPreference.summary = targetDir.absolutePath
                    AlertDialog.Builder(requireContext())
                        .setTitle("Успешно")
                        .setMessage("Файлы BIOS DSi (bios7.bin, bios9.bin, firmware.bin, nand.bin, sd_card.bin) успешно скачаны и настроены!\n\nПапка: ${targetDir.absolutePath}")
                        .setPositiveButton(R.string.ok, null)
                        .show()
                } else {
                    AlertDialog.Builder(requireContext())
                        .setTitle("Ошибка")
                        .setMessage("Не удалось скачать файлы BIOS DSi: ${result.exceptionOrNull()?.localizedMessage}")
                        .setPositiveButton(R.string.ok, null)
                        .show()
                }
            }
            true
        }
    }

    override fun onResume() {
        super.onResume()
        updateBiosSummaries()
    }

    private fun updateBiosSummaries() {
        val dsPref = findPreference<BiosDirectoryPickerPreference>("bios_dir")
        val dsiPref = findPreference<BiosDirectoryPickerPreference>("dsi_bios_dir")
        if (dsPref != null) {
            val uriStr = preferenceManager.sharedPreferences?.getStringSet("bios_dir", emptySet())?.firstOrNull()
            val uri = uriStr?.let { Uri.parse(it) }
            val summary = formatBiosDirSummary(ConsoleType.DS, uri)
            if (summary.isNotEmpty()) dsPref.summary = summary
        }
        if (dsiPref != null) {
            val uriStr = preferenceManager.sharedPreferences?.getStringSet("dsi_bios_dir", emptySet())?.firstOrNull()
            val uri = uriStr?.let { Uri.parse(it) }
            val summary = formatBiosDirSummary(ConsoleType.DSi, uri)
            if (summary.isNotEmpty()) dsiPref.summary = summary
        }
    }

    private fun formatBiosDirSummary(consoleType: ConsoleType, directoryUri: Uri?): String {
        val targetUri = directoryUri ?: run {
            val subFolder = if (consoleType == ConsoleType.DSi) "bios/dsi" else "bios/ds"
            val baseDir = android.os.Environment.getExternalStorageDirectory().resolve("STORM DS")
            val defaultDir = java.io.File(baseDir, subFolder)
            if (defaultDir.exists()) Uri.fromFile(defaultDir) else null
        } ?: return getString(R.string.not_set)

        val rawPath = me.magnum.melonds.utils.FileUtils.getAbsolutePathFromSAFUri(requireContext(), targetUri) ?: targetUri.path ?: targetUri.toString()
        val decodedPath = Uri.decode(rawPath)

        val dirDoc = runCatching {
            if (targetUri.scheme == "file") {
                val f = java.io.File(decodedPath)
                if (f.exists() && f.isDirectory) androidx.documentfile.provider.DocumentFile.fromFile(f) else null
            } else {
                androidx.documentfile.provider.DocumentFile.fromTreeUri(requireContext(), targetUri)
            }
        }.getOrNull() ?: return decodedPath

        fun findDoc(vararg names: String): androidx.documentfile.provider.DocumentFile? {
            for (name in names) {
                dirDoc.findFile(name)?.let { return it }
            }
            return null
        }

        fun getLength(doc: androidx.documentfile.provider.DocumentFile?): Long {
            if (doc == null) return -1L
            return runCatching {
                if (doc.uri.scheme == "file") {
                    java.io.File(Uri.decode(doc.uri.path ?: "")).length()
                } else {
                    requireContext().contentResolver.openAssetFileDescriptor(doc.uri, "r")?.use { it.length } ?: -1L
                }
            }.getOrDefault(-1L)
        }

        val unitKb = getString(R.string.v793_bios_unit_kb)
        val expectedWord = getString(R.string.v793_bios_expected)
        val missingWord = getString(R.string.v793_bios_missing)
        val sb = StringBuilder(decodedPath).append("\n")
        if (consoleType == ConsoleType.DS) {
            val f7 = findDoc("bios7.bin", "ds_bios7.bin", "arm7.bin")
            val l7 = getLength(f7)
            val f9 = findDoc("bios9.bin", "ds_bios9.bin", "arm9.bin")
            val l9 = getLength(f9)
            val ff = findDoc("firmware.bin", "ds_firmware.bin")
            val lf = getLength(ff)

            val s7 = if (l7 == 16384L) "DS BIOS7: 16 $unitKb ✓" else if (l7 > 0) "DS BIOS7: ${l7 / 1024} $unitKb ⚠ ($expectedWord 16 $unitKb)" else "DS BIOS7: $missingWord"
            val s9 = if (l9 == 4096L) "DS BIOS9: 4 $unitKb ✓" else if (l9 > 0) "DS BIOS9: ${l9 / 1024} $unitKb ⚠ ($expectedWord 4 $unitKb)" else "DS BIOS9: $missingWord"
            val sf = if (lf >= 1024L) "Firmware: ${lf / 1024} $unitKb ✓" else "Firmware: $missingWord"
            sb.append(s7).append(" | ").append(s9).append(" | ").append(sf)
        } else {
            val f7 = findDoc("bios7.bin", "dsi_bios7.bin", "arm7.bin", "bios7i.bin")
            val l7 = getLength(f7)
            val f9 = findDoc("bios9.bin", "dsi_bios9.bin", "arm9.bin", "bios9i.bin")
            val l9 = getLength(f9)

            val s7 = if (l7 == 65536L) "DSi BIOS7: 64 $unitKb ✓" else if (l7 > 0) "DSi BIOS7: ${l7 / 1024} $unitKb ⚠ ($expectedWord 64 $unitKb)" else "DSi BIOS7: $missingWord"
            val s9 = if (l9 == 65536L) "DSi BIOS9: 64 $unitKb ✓" else if (l9 > 0) "DSi BIOS9: ${l9 / 1024} $unitKb ⚠ ($expectedWord 64 $unitKb)" else "DSi BIOS9: $missingWord"
            sb.append(s7).append(" | ").append(s9)
        }
        return sb.toString()
    }

    override fun getTitle() = getString(R.string.custom_bios_firmware)
}
