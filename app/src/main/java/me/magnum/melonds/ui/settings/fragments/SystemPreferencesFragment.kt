package me.magnum.melonds.ui.settings.fragments

import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.activity.result.contract.ActivityResultContracts
import androidx.lifecycle.lifecycleScope
import androidx.preference.ListPreference
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.SwitchPreference
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.R
import me.magnum.melonds.common.DirectoryAccessValidator
import me.magnum.melonds.common.UriPermissionManager
import me.magnum.melonds.impl.SettingsBackupManager
import me.magnum.melonds.ui.settings.PreferenceFragmentHelper
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference
import javax.inject.Inject

@AndroidEntryPoint
class SystemPreferencesFragment : BasePreferenceFragment(), PreferenceFragmentTitleProvider {

    @Inject lateinit var uriPermissionManager: UriPermissionManager
    @Inject lateinit var directoryAccessValidator: DirectoryAccessValidator
    @Inject lateinit var settingsRepository: me.magnum.melonds.domain.repositories.SettingsRepository
    @Inject lateinit var settingsBackupManager: SettingsBackupManager
    @Inject lateinit var configurationDirectoryVerifier: me.magnum.melonds.domain.services.ConfigurationDirectoryVerifier
    private val helper by lazy { PreferenceFragmentHelper(this, uriPermissionManager, directoryAccessValidator) }
    private var updatingMirrorPreference = false

    private val backupInternalLayoutLauncher = registerForActivityResult(ActivityResultContracts.OpenDocumentTree()) { uri ->
        if (uri != null) {
            lifecycleScope.launch(Dispatchers.IO) {
                runCatching { settingsBackupManager.backupInternalLayout(uri) }
                    .onSuccess {
                        withContext(Dispatchers.Main) {
                            if (!isAdded) return@withContext
                            AlertDialog.Builder(requireContext())
                                .setMessage(R.string.internal_layout_backup_success)
                                .setPositiveButton(android.R.string.ok, null)
                                .show()
                        }
                    }
                    .onFailure {
                        withContext(Dispatchers.Main) {
                            if (!isAdded) return@withContext
                            Toast.makeText(requireContext(), R.string.internal_layout_backup_error, Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }
    }

    private val backupExternalLayoutLauncher = registerForActivityResult(ActivityResultContracts.OpenDocumentTree()) { uri ->
        if (uri != null) {
            lifecycleScope.launch(Dispatchers.IO) {
                runCatching { settingsBackupManager.backupExternalLayout(uri) }
                    .onSuccess {
                        withContext(Dispatchers.Main) {
                            if (!isAdded) return@withContext
                            AlertDialog.Builder(requireContext())
                                .setMessage(R.string.external_layout_backup_success)
                                .setPositiveButton(android.R.string.ok, null)
                                .show()
                        }
                    }
                    .onFailure {
                        withContext(Dispatchers.Main) {
                            if (!isAdded) return@withContext
                            Toast.makeText(requireContext(), R.string.external_layout_backup_error, Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }
    }

    private val restoreInternalLayoutLauncher = registerForActivityResult(ActivityResultContracts.OpenDocumentTree()) { uri ->
        if (uri != null) {
            lifecycleScope.launch(Dispatchers.IO) {
                runCatching { settingsBackupManager.restoreInternalLayout(uri) }
                    .onSuccess {
                        withContext(Dispatchers.Main) {
                            if (!isAdded) return@withContext
                            AlertDialog.Builder(requireContext())
                                .setMessage(R.string.internal_layout_restore_success)
                                .setPositiveButton(android.R.string.ok, null)
                                .show()
                        }
                    }
                    .onFailure {
                        withContext(Dispatchers.Main) {
                            if (!isAdded) return@withContext
                            Toast.makeText(requireContext(), R.string.internal_layout_restore_error, Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }
    }

    private val restoreExternalLayoutLauncher = registerForActivityResult(ActivityResultContracts.OpenDocumentTree()) { uri ->
        if (uri != null) {
            lifecycleScope.launch(Dispatchers.IO) {
                runCatching { settingsBackupManager.restoreExternalLayout(uri) }
                    .onSuccess {
                        withContext(Dispatchers.Main) {
                            if (!isAdded) return@withContext
                            AlertDialog.Builder(requireContext())
                                .setMessage(R.string.external_layout_restore_success)
                                .setPositiveButton(android.R.string.ok, null)
                                .show()
                        }
                    }
                    .onFailure {
                        withContext(Dispatchers.Main) {
                            if (!isAdded) return@withContext
                            Toast.makeText(requireContext(), R.string.external_layout_restore_error, Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }
    }

    override fun getTitle() = getString(R.string.category_system)

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.pref_system, rootKey)
        val jitPreference = findPreference<SwitchPreference>("enable_jit")
        val stormCompilerPreference = findPreference<SwitchPreference>("enable_storm_compiler")
        val mirrorPreference = findPreference<SwitchPreference>("save_internal_config_as_file")
        val sharedPrefs = preferenceManager.sharedPreferences

        val appLanguagePreference = findPreference<ListPreference>("app_language")
        appLanguagePreference?.setOnPreferenceChangeListener { _, newValue ->
            val langTag = newValue as? String ?: me.magnum.melonds.common.AppLocaleSync.VALUE_DEFAULT
            me.magnum.melonds.common.AppLocaleSync.applyLanguageTag(langTag)
            true
        }

        val performanceModePreference = findPreference<ListPreference>("performance_mode")
        performanceModePreference?.let { pref ->
            updatePerformanceModeSummary()
            pref.setOnPreferenceChangeListener { _, newValue ->
                val modeValue = newValue as? String
                updatePerformanceModeSummary(modeValue)
                view?.post {
                    if (isAdded) {
                        updateFrameskipDrsExclusion()
                    }
                }
                true
            }
        }

        jitPreference?.isVisible = false
        if (Build.SUPPORTED_64_BIT_ABIS.isEmpty()) {
            jitPreference?.isChecked = false
            stormCompilerPreference?.isChecked = false
            stormCompilerPreference?.isVisible = false
            sharedPrefs?.edit()?.putBoolean("enable_jit", false)?.apply()
        } else {
            val legacyJitEnabled = jitPreference?.isChecked == true || sharedPrefs?.getBoolean("enable_jit", false) == true
            if (legacyJitEnabled && stormCompilerPreference?.isChecked == false) {
                stormCompilerPreference.isChecked = true
                sharedPrefs?.edit()?.putBoolean("enable_storm_compiler", true)?.apply()
            }
            if (legacyJitEnabled) {
                jitPreference?.isChecked = false
                sharedPrefs?.edit()?.putBoolean("enable_jit", false)?.apply()
            }
            stormCompilerPreference?.setOnPreferenceChangeListener { _, newValue ->
                if (newValue == false) {
                    jitPreference?.isChecked = false
                    sharedPrefs?.edit()?.putBoolean("enable_jit", false)?.apply()
                }
                true
            }
        }

        val arm9OverclockPref = findPreference<ListPreference>("arm9_overclock")
        if (arm9OverclockPref?.value == "3") {
            arm9OverclockPref.value = "2"
            sharedPrefs?.edit()?.putString("arm9_overclock", "2")?.apply()
        }

        val frameskipModePreference = findPreference<ListPreference>("frameskip_mode")
        val frameskipManualPreference = findPreference<ListPreference>("frameskip_manual_value")
        if (frameskipModePreference != null && frameskipManualPreference != null) {
            helper.bindPreferenceSummaryToValue(frameskipManualPreference)
            frameskipManualPreference.isVisible = frameskipModePreference.value == "manual"
            frameskipModePreference.setOnPreferenceChangeListener { _, newValue ->
                frameskipManualPreference.isVisible = newValue == "manual"
                true
            }
            updateFrameskipDrsExclusion()
        }

        mirrorPreference?.setOnPreferenceChangeListener { _, newValue ->
            if (updatingMirrorPreference) {
                return@setOnPreferenceChangeListener true
            }
            if (newValue != true) {
                preferenceManager.sharedPreferences?.edit()?.putBoolean("save_internal_config_as_file", false)?.apply()
                return@setOnPreferenceChangeListener true
            }

            if (!settingsBackupManager.hasStorageAccess()) {
                Toast.makeText(requireContext(), R.string.settings_mirror_no_storage_permission, Toast.LENGTH_LONG).show()
                return@setOnPreferenceChangeListener false
            }

            lifecycleScope.launch(Dispatchers.IO) {
                try {
                    val mirrorDirectory = settingsBackupManager.getActiveMirrorDirectory()
                    val hasMirror = mirrorDirectory != null && runCatching { settingsBackupManager.hasMirrorAt(mirrorDirectory) }.getOrDefault(false)

                    withContext(Dispatchers.Main) {
                        if (!isAdded) return@withContext
                        val ctx = context ?: return@withContext

                        if (!hasMirror || mirrorDirectory == null) {
                            setMirrorEnabled(mirrorPreference)
                            settingsBackupManager.requestMirrorWrite()
                        } else {
                            AlertDialog.Builder(ctx)
                                .setTitle(R.string.settings_mirror_detected_title)
                                .setMessage(R.string.settings_mirror_detected_message)
                                .setPositiveButton(R.string.settings_mirror_restore) { _, _ ->
                                    setMirrorEnabled(mirrorPreference)
                                    lifecycleScope.launch(Dispatchers.IO) {
                                        val restored = runCatching {
                                            settingsBackupManager.restoreMirrorFrom(mirrorDirectory)
                                            settingsBackupManager.requestMirrorWrite()
                                            true
                                        }.getOrDefault(false)
                                        if (restored) {
                                            withContext(Dispatchers.Main) {
                                                if (isAdded) {
                                                    activity?.recreate()
                                                }
                                            }
                                        }
                                    }
                                }
                                .setNegativeButton(R.string.settings_mirror_ignore) { _, _ ->
                                    setMirrorEnabled(mirrorPreference)
                                    lifecycleScope.launch(Dispatchers.IO) {
                                        runCatching {
                                            settingsBackupManager.overwriteMirrorAt(mirrorDirectory)
                                            settingsBackupManager.requestMirrorWrite()
                                        }
                                    }
                                }
                                .setOnCancelListener {
                                    updatingMirrorPreference = true
                                    mirrorPreference.isChecked = false
                                    preferenceManager.sharedPreferences?.edit()?.putBoolean("save_internal_config_as_file", false)?.apply()
                                    updatingMirrorPreference = false
                                }
                                .show()
                        }
                    }
                } catch (e: Exception) {
                    withContext(Dispatchers.Main) {
                        if (isAdded) {
                            setMirrorEnabled(mirrorPreference)
                            settingsBackupManager.requestMirrorWrite()
                        }
                    }
                }
            }
            false
        }

        findPreference<Preference>("backup_internal_layout")?.setOnPreferenceClickListener {
            backupInternalLayoutLauncher.launch(null)
            true
        }
        findPreference<Preference>("backup_external_layout")?.setOnPreferenceClickListener {
            backupExternalLayoutLauncher.launch(null)
            true
        }
        findPreference<Preference>("restore_internal_layout")?.setOnPreferenceClickListener {
            restoreInternalLayoutLauncher.launch(null)
            true
        }
        findPreference<Preference>("restore_external_layout")?.setOnPreferenceClickListener {
            restoreExternalLayoutLauncher.launch(null)
            true
        }

        val wfcServerPref = findPreference<ListPreference>("system_wfc_server")
        val wfcCustomDnsPref = findPreference<androidx.preference.EditTextPreference>("system_wfc_custom_dns")
        val wfcTestPref = findPreference<Preference>("system_wfc_test_connection")
        val updateCustomDnsVisibility = { serverVal: String? ->
            val isCustom = serverVal == "custom"
            wfcCustomDnsPref?.isVisible = isCustom
            wfcCustomDnsPref?.isEnabled = isCustom
            val hasServer = !serverVal.isNullOrBlank() && serverVal != "none"
            wfcTestPref?.isVisible = hasServer
            wfcTestPref?.isEnabled = hasServer
        }
        updateCustomDnsVisibility(wfcServerPref?.value)
        wfcServerPref?.setOnPreferenceChangeListener { _, newValue ->
            updateCustomDnsVisibility(newValue as? String)
            true
        }
        wfcCustomDnsPref?.setOnPreferenceChangeListener { _, newValue ->
            val candidate = (newValue as? String)?.trim().orEmpty()
            if (!isValidIpv4(candidate)) {
                Toast.makeText(requireContext(), R.string.wfc_custom_dns_invalid, Toast.LENGTH_SHORT).show()
                false
            } else {
                true
            }
        }

        wfcTestPref?.setOnPreferenceClickListener {
            val serverMode = wfcServerPref?.value ?: "none"
            val targetIp = when (serverMode) {
                "wiimmfi" -> "167.235.229.36"
                "altwfc" -> "172.104.88.237"
                "kaeru" -> "178.62.43.212"
                "custom" -> wfcCustomDnsPref?.text?.trim().orEmpty()
                else -> ""
            }
            if (!isValidIpv4(targetIp)) {
                Toast.makeText(requireContext(), R.string.wfc_custom_dns_invalid, Toast.LENGTH_SHORT).show()
                return@setOnPreferenceClickListener true
            }
            wfcTestPref.isEnabled = false
            wfcTestPref.summary = getString(R.string.wfc_test_running, targetIp)
            lifecycleScope.launch(Dispatchers.IO) {
                val testResult = testWfcDnsServer(targetIp)
                withContext(Dispatchers.Main) {
                    if (!isAdded) return@withContext
                    wfcTestPref.isEnabled = true
                    val msg = if (testResult.first) {
                        getString(R.string.wfc_test_success, targetIp, testResult.second)
                    } else {
                        getString(R.string.wfc_test_failed, targetIp, testResult.third ?: "Timeout")
                    }
                    wfcTestPref.summary = msg
                    Toast.makeText(requireContext(), msg, Toast.LENGTH_LONG).show()
                }
            }
            true
        }

        findPreference<Preference>("system_share_app_log")?.setOnPreferenceClickListener {
            shareSystemLogFiles()
            true
        }

        if (isLaunchedInGame()) {
            lockPreferenceInGame("enable_storm_compiler")
            lockPreferenceInGame("arm9_overclock")
            lockPreferenceInGame("system_wfc_server")
            lockPreferenceInGame("system_wfc_custom_dns")
        }
    }

    private fun testWfcDnsServer(ip: String): Triple<Boolean, Long, String?> {
        val startNs = System.nanoTime()
        // 1. Send a standard minimal UDP DNS A-record query to port 53 (exact protocol used by DS WFC)
        val udpAttempt = runCatching {
            val query = byteArrayOf(
                0x13, 0x37, // Transaction ID
                0x01, 0x00, // Standard query with recursion desired
                0x00, 0x01, // 1 question
                0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                // conntest.nintendowifi.net
                8, 'c'.code.toByte(), 'o'.code.toByte(), 'n'.code.toByte(), 'n'.code.toByte(),
                't'.code.toByte(), 'e'.code.toByte(), 's'.code.toByte(), 't'.code.toByte(),
                12, 'n'.code.toByte(), 'i'.code.toByte(), 'n'.code.toByte(), 't'.code.toByte(),
                'e'.code.toByte(), 'n'.code.toByte(), 'd'.code.toByte(), 'o'.code.toByte(),
                'w'.code.toByte(), 'i'.code.toByte(), 'f'.code.toByte(), 'i'.code.toByte(),
                3, 'n'.code.toByte(), 'e'.code.toByte(), 't'.code.toByte(),
                0x00,
                0x00, 0x01, // Type A
                0x00, 0x01  // Class IN
            )
            java.net.DatagramSocket().use { socket ->
                socket.soTimeout = 3000
                val address = java.net.InetAddress.getByName(ip)
                socket.send(java.net.DatagramPacket(query, query.size, address, 53))
                val respBuf = ByteArray(512)
                val respPacket = java.net.DatagramPacket(respBuf, respBuf.size)
                socket.receive(respPacket)
                respPacket.length >= 12
            }
        }
        if (udpAttempt.getOrDefault(false)) {
            val ms = ((System.nanoTime() - startNs) / 1_000_000L).coerceAtLeast(1L)
            return Triple(true, ms, null)
        }
        // 2. Fallback: TCP port 80 / 443 or ICMP reachability
        val fallbackStart = System.nanoTime()
        val tcpOk = runCatching {
            java.net.Socket().use { sock ->
                sock.connect(java.net.InetSocketAddress(ip, 80), 2500)
                true
            }
        }.getOrDefault(false) || runCatching {
            java.net.InetAddress.getByName(ip).isReachable(2500)
        }.getOrDefault(false)

        if (tcpOk) {
            val ms = ((System.nanoTime() - fallbackStart) / 1_000_000L).coerceAtLeast(1L)
            return Triple(true, ms, null)
        }
        val errMsg = udpAttempt.exceptionOrNull()?.localizedMessage ?: "Timeout"
        return Triple(false, 0L, errMsg)
    }

    private fun shareSystemLogFiles() {
        val ctx = context ?: return
        val appContext = ctx.applicationContext
        lifecycleScope.launch(Dispatchers.IO) {
            val shareData = runCatching {
                val candidateLogDirs = listOfNotNull(
                    java.io.File(android.os.Environment.getExternalStorageDirectory(), "STORM DS/logs"),
                    appContext.getExternalFilesDir(null)?.let { java.io.File(it, "logs") },
                    java.io.File(appContext.filesDir, "logs"),
                )
                fun findNonEmptyLogFile(name: String): java.io.File? {
                    return candidateLogDirs
                        .map { java.io.File(it, name) }
                        .firstOrNull { it.exists() && it.length() > 0L }
                }

                // Ensure fresh STORM_INFO.txt always exists
                val freshInfoReport = runCatching {
                    me.magnum.melonds.impl.StormDeviceSystemInfoReporter.saveUnifiedReport(appContext)
                }.getOrNull()

                val infoFile = findNonEmptyLogFile(me.magnum.melonds.impl.StormDeviceSystemInfoReporter.INFO_FILE_NAME)
                val crashFile = findNonEmptyLogFile(me.magnum.melonds.impl.StormDeviceSystemInfoReporter.CRASH_FILE_NAME)
                val appLogFile = findNonEmptyLogFile("STORM_DS.log")

                val exportDir = java.io.File(appContext.cacheDir, "shared_logs").apply { mkdirs() }
                val exportFile = java.io.File(exportDir, "STORM_DS_DIAGNOSTIC_LOG.txt")
                exportFile.bufferedWriter(Charsets.UTF_8).use { writer ->
                    writer.appendLine("===== STORM DS SYSTEM INFO (STORM_INFO.txt) =====")
                    when {
                        infoFile != null -> writer.appendLine(infoFile.readText(Charsets.UTF_8))
                        !freshInfoReport.isNullOrBlank() -> writer.appendLine(freshInfoReport)
                        else -> writer.appendLine("(No system info generated)")
                    }
                    if (crashFile != null) {
                        writer.appendLine()
                        writer.appendLine("===== STORM DS CRASH LOG (STORM_CRASH.txt) =====")
                        writer.appendLine(crashFile.readText(Charsets.UTF_8))
                    }
                    if (appLogFile != null) {
                        writer.appendLine()
                        writer.appendLine("===== STORM DS APP LOG (STORM_DS.log, last 256 KB) =====")
                        val maxTail = 256 * 1024L
                        java.io.RandomAccessFile(appLogFile, "r").use { raf ->
                            val len = raf.length()
                            if (len > maxTail) raf.seek(len - maxTail)
                            val bytes = ByteArray((len - raf.filePointer).toInt().coerceAtLeast(0))
                            raf.readFully(bytes)
                            writer.write(String(bytes, Charsets.UTF_8))
                        }
                    }
                }
                val uri = androidx.core.content.FileProvider.getUriForFile(
                    appContext,
                    "${appContext.packageName}.fileprovider",
                    exportFile
                )
                exportFile.name to uri
            }.getOrNull()

            withContext(Dispatchers.Main) {
                if (!isAdded) return@withContext
                if (shareData == null) {
                    Toast.makeText(requireContext(), R.string.system_share_log_error, Toast.LENGTH_SHORT).show()
                    return@withContext
                }
                val (fileName, shareUri) = shareData
                val shareIntent = android.content.Intent(android.content.Intent.ACTION_SEND).apply {
                    type = "text/plain"
                    putExtra(android.content.Intent.EXTRA_SUBJECT, "STORM DS Log")
                    putExtra(android.content.Intent.EXTRA_STREAM, shareUri)
                    clipData = android.content.ClipData.newUri(appContext.contentResolver, fileName, shareUri)
                    addFlags(android.content.Intent.FLAG_GRANT_READ_URI_PERMISSION)
                }
                runCatching {
                    startActivity(android.content.Intent.createChooser(shareIntent, getString(R.string.system_share_log_title)))
                }.onFailure {
                    Toast.makeText(requireContext(), R.string.system_share_log_error, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun isValidIpv4(value: String): Boolean {
        val parts = value.split(".")
        if (parts.size != 4) return false
        return parts.all { part ->
            part.isNotEmpty() && part.length <= 3 && part.all { it.isDigit() } && (part.toIntOrNull() in 0..255)
        }
    }

    private fun setMirrorEnabled(mirrorPreference: SwitchPreference) {
        updatingMirrorPreference = true
        mirrorPreference.isChecked = true
        preferenceManager.sharedPreferences?.edit()?.putBoolean("save_internal_config_as_file", true)?.apply()
        updatingMirrorPreference = false
    }

    override fun onResume() {
        super.onResume()
        updatePerformanceModeSummary()
        updateFrameskipDrsExclusion()
        updateBiosStatusSummary()
    }

    private fun updatePerformanceModeSummary(selectedPrefValue: String? = null) {
        val perfPref = findPreference<ListPreference>("performance_mode") ?: return
        val value = selectedPrefValue ?: perfPref.value ?: me.magnum.melonds.domain.model.PerformanceMode.AUTO.prefValue
        val mode = me.magnum.melonds.domain.model.PerformanceMode.fromPrefValue(value)
        val selectedLabel = when (mode) {
            me.magnum.melonds.domain.model.PerformanceMode.AUTO -> getString(R.string.performance_mode_auto)
            me.magnum.melonds.domain.model.PerformanceMode.STANDARD -> getString(R.string.performance_mode_standard)
            me.magnum.melonds.domain.model.PerformanceMode.LITE -> getString(R.string.performance_mode_lite)
        }
        val activeLite = when (mode) {
            me.magnum.melonds.domain.model.PerformanceMode.STANDARD -> false
            me.magnum.melonds.domain.model.PerformanceMode.LITE -> true
            me.magnum.melonds.domain.model.PerformanceMode.AUTO ->
                settingsRepository.getDevicePerformanceProfile()?.recommendsLiteMode
                    ?: settingsRepository.isLiteModeActive()
        }
        val activeLabel = getString(
            if (activeLite) R.string.performance_mode_active_lite else R.string.performance_mode_active_standard,
        )
        val baseDesc = getString(R.string.performance_mode_summary)
        perfPref.summary = "$selectedLabel - $activeLabel\n$baseDesc"
    }

    private fun updateFrameskipDrsExclusion() {
        val modePreference = findPreference<ListPreference>("frameskip_mode") ?: return
        val manualPreference = findPreference<ListPreference>("frameskip_manual_value") ?: return
        val drsActive = settingsRepository.isVulkanDrsActive()
        modePreference.isEnabled = !drsActive
        if (drsActive) {
            modePreference.summary = getString(R.string.frameskip_mode_disabled_by_drs)
            manualPreference.isVisible = false
        } else {
            modePreference.setSummary(R.string.frameskip_mode_summary)
            manualPreference.isVisible = modePreference.value == "manual"
        }
    }

    private fun updateBiosStatusSummary() {
        lifecycleScope.launch(Dispatchers.IO) {
            val statusPair = runCatching {
                val dsResult = configurationDirectoryVerifier.checkDsConfigurationDirectory()
                val dsiResult = configurationDirectoryVerifier.checkDsiConfigurationDirectory()
                val dsReady = dsResult.status == me.magnum.melonds.domain.model.ConfigurationDirResult.Status.VALID
                val dsiReady = dsiResult.status == me.magnum.melonds.domain.model.ConfigurationDirResult.Status.VALID
                dsReady to dsiReady
            }.getOrNull() ?: return@launch

            withContext(Dispatchers.Main) {
                if (!isAdded) return@withContext
                val (dsReady, dsiReady) = statusPair
                val dsStatusStr = if (dsReady) getString(R.string.v780_bios_status_ready) else getString(R.string.v780_bios_status_not_ready)
                val dsiStatusStr = if (dsiReady) getString(R.string.v780_bios_status_ready) else getString(R.string.v780_bios_status_not_ready)
                findPreference<Preference>("custom_bios_firmware")?.summary = getString(R.string.v780_bios_ready_status, dsStatusStr, dsiStatusStr)
            }
        }
    }
}
