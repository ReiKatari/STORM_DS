package me.magnum.melonds.ui.common.rom

import android.content.Context
import android.content.Intent
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import me.magnum.melonds.MelonRomDecryptor
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.ConfigurationDirResult
import me.magnum.melonds.domain.model.ConsoleType
import me.magnum.melonds.domain.model.DSiProfile
import me.magnum.melonds.domain.model.VideoRenderer
import me.magnum.melonds.domain.model.emulator.validation.FirmwareLaunchPreconditionCheckResult
import me.magnum.melonds.domain.model.emulator.validation.RomLaunchPreconditionCheckResult
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.domain.repositories.RomsRepository
import me.magnum.melonds.ui.common.rom.model.LaunchValidationResult
import me.magnum.melonds.ui.settings.SettingsActivity
import java.util.WeakHashMap

class EmulatorLaunchValidatorDelegate(
    private val context: ComponentActivity,
    private val callback: Callback,
) {

    @EntryPoint
    @InstallIn(SingletonComponent::class)
    interface ValidatorEntryPoint {
        fun romsRepository(): RomsRepository
    }

    private sealed interface DecryptionUiState {
        data object Idle : DecryptionUiState
        data class InProgress(val rom: Rom, val percent: Int) : DecryptionUiState
        data class Completed(
            val targetRom: Rom?,
            val result: MelonRomDecryptor.DecryptResult,
        ) : DecryptionUiState
    }

    private class DecryptionSession {
        private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
        private val _state = MutableStateFlow<DecryptionUiState>(DecryptionUiState.Idle)
        val state: StateFlow<DecryptionUiState> = _state.asStateFlow()
        private var job: Job? = null

        fun start(appContext: Context, rom: Rom, romsRepository: RomsRepository) {
            if (job?.isActive == true) return
            _state.value = DecryptionUiState.InProgress(rom, 0)
            job = scope.launch {
                val outcome = MelonRomDecryptor.decryptRomWithOutput(
                    appContext,
                    rom.uri,
                    object : MelonRomDecryptor.DecryptProgressCallback {
                        override fun onProgress(current: Int, total: Int) {
                            val percent = if (total > 0) {
                                ((current.toLong() * 100L) / total).toInt().coerceIn(0, 100)
                            } else {
                                0
                            }
                            if (_state.value is DecryptionUiState.InProgress) {
                                _state.value = DecryptionUiState.InProgress(rom, percent)
                            }
                        }
                    },
                )

                val isSuccess = outcome.result == MelonRomDecryptor.DecryptResult.SUCCESS ||
                    outcome.result == MelonRomDecryptor.DecryptResult.ALREADY_DECRYPTED
                if (!isSuccess) {
                    _state.value = DecryptionUiState.Completed(rom, outcome.result)
                    return@launch
                }

                val outputUri = outcome.outputUri
                if (outputUri != null && outputUri != rom.uri) {
                    val siblingRom = runCatching { romsRepository.getRomAtUri(outputUri) }.getOrNull()
                    if (siblingRom != null) {
                        _state.value = DecryptionUiState.Completed(siblingRom, outcome.result)
                    } else {
                        _state.value = DecryptionUiState.Completed(null, MelonRomDecryptor.DecryptResult.ERROR_READING_FILE)
                    }
                } else {
                    val refreshedRom = outputUri?.let { runCatching { romsRepository.getRomAtUri(it) }.getOrNull() } ?: rom
                    _state.value = DecryptionUiState.Completed(refreshedRom, outcome.result)
                }
            }
        }

        fun reset() {
            if (job?.isActive != true) {
                _state.value = DecryptionUiState.Idle
            }
        }
    }

    private companion object {
        private val decryptionSessions = WeakHashMap<EmulatorLaunchValidationViewModel, DecryptionSession>()

        @Synchronized
        private fun getSession(viewModel: EmulatorLaunchValidationViewModel): DecryptionSession {
            return decryptionSessions.getOrPut(viewModel) { DecryptionSession() }
        }
    }

    private val viewModel by context.viewModels<EmulatorLaunchValidationViewModel>()
    private val decryptionSession by lazy { getSession(viewModel) }
    private val _isInteractiveDialogActive = MutableStateFlow(false)
    val isInteractiveDialogActive: StateFlow<Boolean> = _isInteractiveDialogActive.asStateFlow()

    private var activeDialog: AlertDialog? = null
    private var progressBarView: ProgressBar? = null
    private var progressPercentView: TextView? = null
    private var isProgressDialogShowing = false

    private val firmwareSettingsLauncher = context.registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        _isInteractiveDialogActive.value = false
        viewModel.onReturnFromFirmwareSettings()
    }

    init {
        context.lifecycle.addObserver(LifecycleEventObserver { _, event ->
            if (event == Lifecycle.Event.ON_DESTROY) {
                dismissActiveDialog()
            }
        })

        context.lifecycleScope.launch {
            context.lifecycle.repeatOnLifecycle(Lifecycle.State.CREATED) {
                viewModel.romValidationResult.collect {
                    when (it) {
                        is LaunchValidationResult.Firmware -> {
                            when (it.result) {
                                is FirmwareLaunchPreconditionCheckResult.Success -> {
                                    _isInteractiveDialogActive.value = false
                                    callback.onFirmwareValidated(it.result.consoleType, it.result.dsiProfile)
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

        context.lifecycleScope.launch {
            context.lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                decryptionSession.state.collect { state ->
                    when (state) {
                        is DecryptionUiState.Idle -> Unit
                        is DecryptionUiState.InProgress -> {
                            showOrUpdateDecryptionProgressDialog(state.percent)
                        }
                        is DecryptionUiState.Completed -> {
                            if (isProgressDialogShowing) {
                                dismissActiveDialog()
                            }
                            showRomDecryptionResultDialog(state.targetRom, state.result)
                        }
                    }
                }
            }
        }
    }

    private fun dismissActiveDialog() {
        runCatching { activeDialog?.dismiss() }
        activeDialog = null
        progressBarView = null
        progressPercentView = null
        isProgressDialogShowing = false
    }

    private fun showManagedDialog(dialog: AlertDialog, isProgress: Boolean = false) {
        if (context.isFinishing || context.isDestroyed) {
            return
        }
        dismissActiveDialog()
        activeDialog = dialog
        isProgressDialogShowing = isProgress
        dialog.show()
    }

    private fun abortValidation() {
        dismissActiveDialog()
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
        val dialog = AlertDialog.Builder(context)
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
            .create()
        showManagedDialog(dialog)
    }

    private fun showIncorrectConfigurationDirectoryDialogForRom(configurationDirResult: ConfigurationDirResult) {
        _isInteractiveDialogActive.value = true
        val dialog = AlertDialog.Builder(context)
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
            .create()
        showManagedDialog(dialog)
    }

    private fun showDsiWareTitleLoadIssueDialog(reason: RomLaunchPreconditionCheckResult.DSiWareTitleValidationFailed.Reason) {
        _isInteractiveDialogActive.value = true
        val message = when (reason) {
            RomLaunchPreconditionCheckResult.DSiWareTitleValidationFailed.Reason.NandError -> context.getString(R.string.failed_launch_dsiware_title_check_failed)
            RomLaunchPreconditionCheckResult.DSiWareTitleValidationFailed.Reason.RomParseError -> context.getString(R.string.failed_launch_dsiware_title_rom_failed)
            RomLaunchPreconditionCheckResult.DSiWareTitleValidationFailed.Reason.TitleNotInstalled -> context.getString(R.string.failed_launch_dsiware_title_not_installed)
        }

        val dialog = AlertDialog.Builder(context)
            .setTitle(R.string.failed_launch_dsiware_title)
            .setMessage(message)
            .setPositiveButton(R.string.ok) { _, _ -> abortValidation() }
            .setOnCancelListener { abortValidation() }
            .create()
        showManagedDialog(dialog)
    }

    private fun showInvalidDirectoryAccessDialog() {
        _isInteractiveDialogActive.value = true
        val dialog = AlertDialog.Builder(context)
            .setTitle(R.string.error_invalid_directory)
            .setMessage(R.string.error_invalid_directory_description)
            .setPositiveButton(R.string.ok, null)
            .setOnDismissListener { abortValidation() }
            .create()
        showManagedDialog(dialog)
    }

    private fun showRendererUnsupportedDialog(renderer: VideoRenderer) {
        _isInteractiveDialogActive.value = true
        val rendererLabel = when (renderer) {
            VideoRenderer.SOFTWARE -> "Software"
            VideoRenderer.OPENGL -> "OpenGL"
            VideoRenderer.VULKAN -> "Vulkan"
            VideoRenderer.COMPUTE -> "Compute"
        }

        val dialog = AlertDialog.Builder(context)
            .setTitle(R.string.renderer_unsupported_title)
            .setMessage(context.getString(R.string.renderer_unsupported_message, rendererLabel))
            .setPositiveButton(R.string.settings) { _, _ ->
                val intent = Intent(context, SettingsActivity::class.java)
                firmwareSettingsLauncher.launch(intent)
            }
            .setNegativeButton(R.string.cancel) { _, _ -> abortValidation() }
            .setOnCancelListener { abortValidation() }
            .create()
        showManagedDialog(dialog)
    }

    private fun showRendererInitFailedDialog(renderer: VideoRenderer) {
        _isInteractiveDialogActive.value = true
        val rendererLabel = when (renderer) {
            VideoRenderer.SOFTWARE -> "Software"
            VideoRenderer.OPENGL -> "OpenGL"
            VideoRenderer.VULKAN -> "Vulkan"
            VideoRenderer.COMPUTE -> "Compute"
        }

        val dialog = AlertDialog.Builder(context)
            .setTitle(R.string.renderer_init_failed_title)
            .setMessage(context.getString(R.string.renderer_init_failed_message, rendererLabel))
            .setPositiveButton(R.string.settings) { _, _ ->
                val intent = Intent(context, SettingsActivity::class.java)
                firmwareSettingsLauncher.launch(intent)
            }
            .setNegativeButton(R.string.cancel) { _, _ -> abortValidation() }
            .setOnCancelListener { abortValidation() }
            .create()
        showManagedDialog(dialog)
    }

    private fun showRomEncryptedDialog(rom: Rom) {
        if (context.isFinishing || context.isDestroyed) {
            return
        }

        _isInteractiveDialogActive.value = true
        val dialog = AlertDialog.Builder(context)
            .setTitle(R.string.decrypt_rom_title)
            .setMessage(R.string.decrypt_rom_replace_description)
            .setPositiveButton(R.string.decrypt_rom_replace_confirm) { _, _ ->
                startRomDecryptionWithProgressDialog(rom)
            }
            .setNegativeButton(R.string.cancel) { _, _ -> abortValidation() }
            .setOnCancelListener { abortValidation() }
            .create()
        showManagedDialog(dialog)
    }

    private fun startRomDecryptionWithProgressDialog(rom: Rom) {
        if (context.isFinishing || context.isDestroyed) {
            return
        }
        val appContext = context.applicationContext
        val romsRepository = EntryPointAccessors.fromApplication(
            appContext,
            ValidatorEntryPoint::class.java,
        ).romsRepository()
        decryptionSession.start(appContext, rom, romsRepository)
    }

    private fun showOrUpdateDecryptionProgressDialog(percent: Int) {
        if (context.isFinishing || context.isDestroyed) {
            return
        }
        _isInteractiveDialogActive.value = true
        if (isProgressDialogShowing && activeDialog?.isShowing == true) {
            progressBarView?.progress = percent
            progressPercentView?.text = "$percent%"
            return
        }

        val density = context.resources.displayMetrics.density
        val padH = (24 * density).toInt()
        val padV = (16 * density).toInt()
        val container = LinearLayout(context).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(padH, padV, padH, padV)
        }
        val statusText = TextView(context).apply {
            text = context.getString(R.string.decrypt_rom_progress)
            textSize = 14f
        }
        val progressBar = ProgressBar(context, null, android.R.attr.progressBarStyleHorizontal).apply {
            isIndeterminate = false
            max = 100
            progress = percent
            setPadding(0, (12 * density).toInt(), 0, (4 * density).toInt())
        }
        val percentText = TextView(context).apply {
            text = "$percent%"
            textSize = 13f
            gravity = Gravity.END
        }
        container.addView(statusText)
        container.addView(progressBar)
        container.addView(percentText)

        val progressDialog = AlertDialog.Builder(context)
            .setTitle(R.string.decrypt_rom_title)
            .setView(container)
            .setCancelable(false)
            .create()

        showManagedDialog(progressDialog, isProgress = true)
        progressBarView = progressBar
        progressPercentView = percentText
    }

    private fun showRomDecryptionResultDialog(
        targetRom: Rom?,
        result: MelonRomDecryptor.DecryptResult,
    ) {
        if (context.isFinishing || context.isDestroyed) {
            return
        }

        _isInteractiveDialogActive.value = true
        if (
            targetRom != null &&
            (result == MelonRomDecryptor.DecryptResult.SUCCESS ||
                result == MelonRomDecryptor.DecryptResult.ALREADY_DECRYPTED)
        ) {
            val dialog = AlertDialog.Builder(context)
                .setTitle(R.string.decrypt_rom_result_success_title)
                .setMessage(R.string.decrypt_rom_result_success_message)
                .setCancelable(false)
                .setPositiveButton(R.string.decrypt_rom_launch_now) { _, _ ->
                    decryptionSession.reset()
                    validateRom(targetRom)
                }
                .setNegativeButton(R.string.cancel) { _, _ ->
                    decryptionSession.reset()
                    abortValidation()
                }
                .setOnCancelListener {
                    decryptionSession.reset()
                    abortValidation()
                }
                .create()
            showManagedDialog(dialog)
        } else {
            val reasonRes = when (result) {
                MelonRomDecryptor.DecryptResult.ERROR_READING_FILE -> R.string.decrypt_rom_err_read
                MelonRomDecryptor.DecryptResult.ERROR_WRITING_FILE -> R.string.decrypt_rom_err_write
                MelonRomDecryptor.DecryptResult.ERROR_NOT_DSI_ROM -> R.string.decrypt_rom_err_not_dsi
                MelonRomDecryptor.DecryptResult.ERROR_FILE_TOO_SMALL -> R.string.decrypt_rom_err_too_small
                MelonRomDecryptor.DecryptResult.ERROR_MODCRYPT_AREA_OUT_OF_BOUNDS -> R.string.decrypt_rom_err_bounds
                MelonRomDecryptor.DecryptResult.ERROR_VALIDATION_FAILED -> R.string.decrypt_rom_err_validation
                MelonRomDecryptor.DecryptResult.SUCCESS,
                MelonRomDecryptor.DecryptResult.ALREADY_DECRYPTED -> R.string.decrypt_rom_err_read
            }
            val reasonText = context.getString(reasonRes)
            val dialog = AlertDialog.Builder(context)
                .setTitle(R.string.decrypt_rom_result_error_title)
                .setMessage(context.getString(R.string.decrypt_rom_result_error_message, reasonText))
                .setCancelable(false)
                .setPositiveButton(R.string.ok) { _, _ ->
                    decryptionSession.reset()
                    abortValidation()
                }
                .setOnCancelListener {
                    decryptionSession.reset()
                    abortValidation()
                }
                .create()
            showManagedDialog(dialog)
        }
    }

    interface Callback {
        fun onRomValidated(rom: Rom)
        fun onFirmwareValidated(consoleType: ConsoleType) {}
        fun onFirmwareValidated(consoleType: ConsoleType, dsiProfile: DSiProfile?) {
            onFirmwareValidated(consoleType)
        }
        fun onValidationAborted()
    }
}
