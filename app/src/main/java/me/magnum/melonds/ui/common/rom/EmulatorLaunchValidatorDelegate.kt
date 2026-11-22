package me.magnum.melonds.ui.common.rom

import android.content.Intent
import androidx.activity.ComponentActivity
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.ConfigurationDirResult
import me.magnum.melonds.domain.model.ConsoleType
import me.magnum.melonds.domain.model.VideoRenderer
import me.magnum.melonds.domain.model.emulator.validation.FirmwareLaunchPreconditionCheckResult
import me.magnum.melonds.domain.model.emulator.validation.RomLaunchPreconditionCheckResult
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.common.rom.model.LaunchValidationResult
import me.magnum.melonds.ui.settings.SettingsActivity

class EmulatorLaunchValidatorDelegate(
    private val context: ComponentActivity,
    private val callback: Callback,
) {

    private val viewModel by context.viewModels<EmulatorLaunchValidationViewModel>()
    private val _isInteractiveDialogActive = MutableStateFlow(false)
    val isInteractiveDialogActive: StateFlow<Boolean> = _isInteractiveDialogActive.asStateFlow()

    private val firmwareSettingsLauncher = context.registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        _isInteractiveDialogActive.value = false
        viewModel.onReturnFromFirmwareSettings()
    }

    init {
        context.lifecycleScope.launch {
            context.lifecycle.repeatOnLifecycle(Lifecycle.State.CREATED) {
                viewModel.romValidationResult.collect {
                    when (it) {
                        is LaunchValidationResult.Firmware -> {
                            when (it.result) {
                                is FirmwareLaunchPreconditionCheckResult.Success -> {
                                    _isInteractiveDialogActive.value = false
                                    callback.onFirmwareValidated(it.result.consoleType)
                                }
                                is FirmwareLaunchPreconditionCheckResult.BiosConfigurationIncorrect -> {
                                    showIncorrectConfigurationDirectoryDialogForFirmware(it.result.configurationDirectoryResult)
                                }
                                is FirmwareLaunchPreconditionCheckResult.RendererUnsupported -> {
                                    showRendererUnsupportedDialog(it.result.renderer)
                                }
                                is FirmwareLaunchPreconditionCheckResult.RendererInitFailed -> {
                                    showRendererInitFailedDialog(it.result.renderer)
                                }
                            }
                        }
                        is LaunchValidationResult.Rom -> {
                            when (it.result) {
                                is RomLaunchPreconditionCheckResult.Success -> {
                                    _isInteractiveDialogActive.value = false
                                    callback.onRomValidated(it.result.rom)
                                }
                                is RomLaunchPreconditionCheckResult.RomEncrypted -> showRomEncryptedDialog(it.result.rom)
                                is RomLaunchPreconditionCheckResult.DSiWareTitleValidationFailed -> showDsiWareTitleLoadIssueDialog(it.result.reason)
                                is RomLaunchPreconditionCheckResult.BiosConfigurationIncorrect -> {
                                    showIncorrectConfigurationDirectoryDialogForRom(it.result.configurationDirectoryResult)
                                }
                                is RomLaunchPreconditionCheckResult.RendererUnsupported -> {
                                    showRendererUnsupportedDialog(it.result.renderer)
                                }
                                is RomLaunchPreconditionCheckResult.RendererInitFailed -> {
                                    showRendererInitFailedDialog(it.result.renderer)
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private fun abortValidation() {
        _isInteractiveDialogActive.value = false
        callback.onValidationAborted()
    }

    fun validateRom(rom: Rom) {
        _isInteractiveDialogActive.value = false
        viewModel.validateRomForLaunch(rom)
    }

    fun validateFirmware(consoleType: ConsoleType) {
        _isInteractiveDialogActive.value = false
        viewModel.validateFirmwareForLaunch(consoleType)
    }

    private fun showIncorrectConfigurationDirectoryDialogForFirmware(configurationDirResult: ConfigurationDirResult) {
        _isInteractiveDialogActive.value = true
        AlertDialog.Builder(context)
            .setTitle(R.string.firmware_launch_failed)
            .setMessage(R.string.firmware_launch_bad_setup)
            .setPositiveButton(R.string.settings) { _, _ ->
                val intent = Intent(context, SettingsActivity::class.java).apply {
                    putExtra(SettingsActivity.KEY_ENTRY_POINT, SettingsActivity.CUSTOM_FIRMWARE_ENTRY_POINT)
                }
                firmwareSettingsLauncher.launch(intent)
            }
            .setNeutralButton(R.string.delete_bios_paths) { _, _ ->
                _isInteractiveDialogActive.value = false
                viewModel.clearBiosDirectoriesAndRetry()
            }
            .setNegativeButton(R.string.cancel) { _, _ -> abortValidation() }
            .setOnCancelListener { abortValidation() }
            .show()
    }

    private fun showIncorrectConfigurationDirectoryDialogForRom(configurationDirResult: ConfigurationDirResult) {
        _isInteractiveDialogActive.value = true
        AlertDialog.Builder(context)
            .setTitle(R.string.rom_launch_failed)
            .setMessage(R.string.rom_launch_custom_bios_firmware_bad_setup)
            .setPositiveButton(R.string.settings) { _, _ ->
                val intent = Intent(context, SettingsActivity::class.java).apply {
                    putExtra(SettingsActivity.KEY_ENTRY_POINT, SettingsActivity.CUSTOM_FIRMWARE_ENTRY_POINT)
                }
                firmwareSettingsLauncher.launch(intent)
            }
            .setNegativeButton(R.string.cancel) { _, _ -> abortValidation() }
            .setOnCancelListener { abortValidation() }
            .show()
    }

    private fun showDsiWareTitleLoadIssueDialog(reason: RomLaunchPreconditionCheckResult.DSiWareTitleValidationFailed.Reason) {
        _isInteractiveDialogActive.value = true
        val message = when (reason) {
            RomLaunchPreconditionCheckResult.DSiWareTitleValidationFailed.Reason.NandError -> context.getString(R.string.failed_launch_dsiware_title_check_failed)
            RomLaunchPreconditionCheckResult.DSiWareTitleValidationFailed.Reason.RomParseError -> context.getString(R.string.failed_launch_dsiware_title_rom_failed)
            RomLaunchPreconditionCheckResult.DSiWareTitleValidationFailed.Reason.TitleNotInstalled -> context.getString(R.string.failed_launch_dsiware_title_not_installed)
        }

        AlertDialog.Builder(context)
            .setTitle(R.string.failed_launch_dsiware_title)
            .setMessage(message)
            .setPositiveButton(R.string.ok) { _, _ -> abortValidation() }
            .setOnCancelListener {
                abortValidation()
            }
            .show()
    }

    private fun showInvalidDirectoryAccessDialog() {
        _isInteractiveDialogActive.value = true
        AlertDialog.Builder(context)
            .setTitle(R.string.error_invalid_directory)
            .setMessage(R.string.error_invalid_directory_description)
            .setPositiveButton(R.string.ok, null)
            .setOnDismissListener { abortValidation() }
            .show()
    }

    private fun showRendererUnsupportedDialog(renderer: VideoRenderer) {
        _isInteractiveDialogActive.value = true
        val rendererLabel = when (renderer) {
            VideoRenderer.SOFTWARE -> "Software"
            VideoRenderer.OPENGL -> "OpenGL"
            VideoRenderer.VULKAN -> "Vulkan"
            VideoRenderer.COMPUTE -> "Compute"
        }

        AlertDialog.Builder(context)
            .setTitle(R.string.renderer_unsupported_title)
            .setMessage(context.getString(R.string.renderer_unsupported_message, rendererLabel))
            .setPositiveButton(R.string.settings) { _, _ ->
                val intent = Intent(context, SettingsActivity::class.java)
                firmwareSettingsLauncher.launch(intent)
            }
            .setNegativeButton(R.string.cancel) { _, _ -> abortValidation() }
            .setOnCancelListener { abortValidation() }
            .show()
    }

    private fun showRendererInitFailedDialog(renderer: VideoRenderer) {
        _isInteractiveDialogActive.value = true
        val rendererLabel = when (renderer) {
            VideoRenderer.SOFTWARE -> "Software"
            VideoRenderer.OPENGL -> "OpenGL"
            VideoRenderer.VULKAN -> "Vulkan"
            VideoRenderer.COMPUTE -> "Compute"
        }

        AlertDialog.Builder(context)
            .setTitle(R.string.renderer_init_failed_title)
            .setMessage(context.getString(R.string.renderer_init_failed_message, rendererLabel))
            .setPositiveButton(R.string.settings) { _, _ ->
                val intent = Intent(context, SettingsActivity::class.java)
                firmwareSettingsLauncher.launch(intent)
            }
            .setNegativeButton(R.string.cancel) { _, _ -> abortValidation() }
            .setOnCancelListener { abortValidation() }
            .show()
    }

    private fun showRomEncryptedDialog(rom: Rom) {
        if (context.isFinishing || context.isDestroyed) {
            return
        }

        _isInteractiveDialogActive.value = true
        AlertDialog.Builder(context)
            .setTitle(R.string.decrypt_rom_title)
            .setMessage(R.string.decrypt_rom_replace_description)
            .setPositiveButton(R.string.decrypt_rom_replace_confirm) { _, _ ->
                startRomDecryptionWithProgressDialog(rom)
            }
            .setNegativeButton(R.string.cancel) { _, _ -> abortValidation() }
            .setOnCancelListener { abortValidation() }
            .show()
    }

    private fun startRomDecryptionWithProgressDialog(rom: Rom) {
        if (context.isFinishing || context.isDestroyed) {
            return
        }

        _isInteractiveDialogActive.value = true

        val density = context.resources.displayMetrics.density
        val padH = (24 * density).toInt()
        val padV = (16 * density).toInt()
        val container = android.widget.LinearLayout(context).apply {
            orientation = android.widget.LinearLayout.VERTICAL
            setPadding(padH, padV, padH, padV)
        }
        val statusText = android.widget.TextView(context).apply {
            text = context.getString(R.string.decrypt_rom_progress)
            textSize = 14f
        }
        val progressBar = android.widget.ProgressBar(context, null, android.R.attr.progressBarStyleHorizontal).apply {
            isIndeterminate = false
            max = 100
            progress = 0
            setPadding(0, (12 * density).toInt(), 0, (4 * density).toInt())
        }
        val percentText = android.widget.TextView(context).apply {
            text = "0%"
            textSize = 13f
            gravity = android.view.Gravity.END
        }
        container.addView(statusText)
        container.addView(progressBar)
        container.addView(percentText)

        val progressDialog = AlertDialog.Builder(context)
            .setTitle(R.string.decrypt_rom_title)
            .setView(container)
            .setCancelable(false)
            .create()

        if (!context.isFinishing && !context.isDestroyed) {
            progressDialog.show()
        }

        context.lifecycleScope.launch(kotlinx.coroutines.Dispatchers.IO) {
            val result = me.magnum.melonds.MelonRomDecryptor.decryptRom(
                context,
                rom.uri,
                object : me.magnum.melonds.MelonRomDecryptor.DecryptProgressCallback {
                    override fun onProgress(current: Int, total: Int) {
                        val percent = if (total > 0) ((current.toLong() * 100L) / total).toInt().coerceIn(0, 100) else 0
                        context.runOnUiThread {
                            if (!context.isFinishing && !context.isDestroyed && progressDialog.isShowing) {
                                progressBar.progress = percent
                                percentText.text = "$percent%"
                            }
                        }
                    }
                },
            )

            kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.Main) {
                if (!context.isFinishing && !context.isDestroyed && progressDialog.isShowing) {
                    runCatching { progressDialog.dismiss() }
                }
                if (context.isFinishing || context.isDestroyed) {
                    return@withContext
                }
                showRomDecryptionResultDialog(rom, result)
            }
        }
    }

    private fun showRomDecryptionResultDialog(
        rom: Rom,
        result: me.magnum.melonds.MelonRomDecryptor.DecryptResult,
    ) {
        if (context.isFinishing || context.isDestroyed) {
            return
        }

        if (
            result == me.magnum.melonds.MelonRomDecryptor.DecryptResult.SUCCESS ||
            result == me.magnum.melonds.MelonRomDecryptor.DecryptResult.ALREADY_DECRYPTED
        ) {
            AlertDialog.Builder(context)
                .setTitle(R.string.decrypt_rom_result_success_title)
                .setMessage(R.string.decrypt_rom_result_success_message)
                .setCancelable(false)
                .setPositiveButton(R.string.decrypt_rom_launch_now) { _, _ ->
                    validateRom(rom)
                }
                .setNegativeButton(R.string.cancel) { _, _ ->
                    abortValidation()
                }
                .setOnCancelListener {
                    abortValidation()
                }
                .show()
        } else {
            val reasonRes = when (result) {
                me.magnum.melonds.MelonRomDecryptor.DecryptResult.ERROR_READING_FILE -> R.string.decrypt_rom_err_read
                me.magnum.melonds.MelonRomDecryptor.DecryptResult.ERROR_WRITING_FILE -> R.string.decrypt_rom_err_write
                me.magnum.melonds.MelonRomDecryptor.DecryptResult.ERROR_NOT_DSI_ROM -> R.string.decrypt_rom_err_not_dsi
                me.magnum.melonds.MelonRomDecryptor.DecryptResult.ERROR_FILE_TOO_SMALL -> R.string.decrypt_rom_err_too_small
                me.magnum.melonds.MelonRomDecryptor.DecryptResult.ERROR_MODCRYPT_AREA_OUT_OF_BOUNDS -> R.string.decrypt_rom_err_bounds
                me.magnum.melonds.MelonRomDecryptor.DecryptResult.ERROR_VALIDATION_FAILED -> R.string.decrypt_rom_err_validation
                me.magnum.melonds.MelonRomDecryptor.DecryptResult.SUCCESS,
                me.magnum.melonds.MelonRomDecryptor.DecryptResult.ALREADY_DECRYPTED -> R.string.decrypt_rom_err_read
            }
            val reasonText = context.getString(reasonRes)
            AlertDialog.Builder(context)
                .setTitle(R.string.decrypt_rom_result_error_title)
                .setMessage(context.getString(R.string.decrypt_rom_result_error_message, reasonText))
                .setCancelable(false)
                .setPositiveButton(R.string.ok) { _, _ ->
                    abortValidation()
                }
                .setOnCancelListener {
                    abortValidation()
                }
                .show()
        }
    }

    interface Callback {
        fun onRomValidated(rom: Rom)
        fun onFirmwareValidated(consoleType: ConsoleType)
        fun onValidationAborted()
    }
}
