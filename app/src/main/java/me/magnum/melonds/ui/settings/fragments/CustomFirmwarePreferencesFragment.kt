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

    override fun getTitle() = getString(R.string.custom_bios_firmware)
}
