package me.magnum.melonds.ui.settings.fragments

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.preference.ListPreference
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.R
import me.magnum.melonds.common.DirectoryAccessValidator
import me.magnum.melonds.common.UriPermissionManager
import me.magnum.melonds.domain.model.ConfigurationDirResult
import me.magnum.melonds.domain.model.ConsoleType
import me.magnum.melonds.extensions.addOnPreferenceChangeListener
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

        dsBiosDirPreference.addOnPreferenceChangeListener { _, _ ->
            view?.post { updateBiosSummaries() }
            true
        }
        dsiBiosDirPreference.addOnPreferenceChangeListener { _, _ ->
            view?.post { updateBiosSummaries() }
            true
        }

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
                message = getString(R.string.bios_download_ds_progress)
            )

            lifecycleScope.launch {
                val result = biosDownloadManager.downloadAndSetupDsBios { progress ->
                    activity?.runOnUiThread {
                        progressBar.progress = progress
                    }
                }
                runCatching { if (progressDialog.isShowing) progressDialog.dismiss() }
                if (!isAdded || activity == null) return@launch
                if (result.isSuccess) {
                    val targetDir = result.getOrThrow()
                    val targetUri = Uri.fromFile(targetDir)
                    preferenceManager.sharedPreferences?.edit()?.putBoolean("use_custom_bios", true)?.apply()
                    findPreference<androidx.preference.SwitchPreference>("use_custom_bios")?.isChecked = true
                    dsBiosDirPreference.onDirectoryPicked(targetUri)
                    updateBiosSummaries()
                    AlertDialog.Builder(requireContext())
                        .setTitle(R.string.bios_download_success_title)
                        .setMessage(getString(R.string.bios_download_ds_success_msg, targetDir.absolutePath))
                        .setPositiveButton(R.string.ok, null)
                        .show()
                } else {
                    AlertDialog.Builder(requireContext())
                        .setTitle(R.string.bios_download_error_title)
                        .setMessage(getString(R.string.bios_download_ds_error_msg, result.exceptionOrNull()?.localizedMessage.orEmpty()))
                        .setPositiveButton(R.string.ok, null)
                        .show()
                }
            }
            true
        }

        autoDownloadDsiPreference?.setOnPreferenceClickListener {
            val (progressDialog, progressBar) = createDownloadProgressDialog(
                title = getString(R.string.auto_download_dsi_bios_title),
                message = getString(R.string.bios_download_dsi_progress)
            )

            lifecycleScope.launch {
                val result = biosDownloadManager.downloadAndSetupDsiBios { progress ->
                    activity?.runOnUiThread {
                        progressBar.progress = progress
                    }
                }
                runCatching { if (progressDialog.isShowing) progressDialog.dismiss() }
                if (!isAdded || activity == null) return@launch
                if (result.isSuccess) {
                    val targetDir = result.getOrThrow()
                    val targetUri = Uri.fromFile(targetDir)
                    preferenceManager.sharedPreferences?.edit()?.putBoolean("use_custom_bios", true)?.apply()
                    findPreference<androidx.preference.SwitchPreference>("use_custom_bios")?.isChecked = true
                    dsiBiosDirPreference.onDirectoryPicked(targetUri)
                    updateBiosSummaries()
                    AlertDialog.Builder(requireContext())
                        .setTitle(R.string.bios_download_success_title)
                        .setMessage(getString(R.string.bios_download_dsi_success_msg, targetDir.absolutePath))
                        .setPositiveButton(R.string.ok, null)
                        .show()
                } else {
                    AlertDialog.Builder(requireContext())
                        .setTitle(R.string.bios_download_error_title)
                        .setMessage(getString(R.string.bios_download_dsi_error_msg, result.exceptionOrNull()?.localizedMessage.orEmpty()))
                        .setPositiveButton(R.string.ok, null)
                        .show()
                }
            }
            true
        }

        findPreference<androidx.preference.Preference>("bios_health_check")?.setOnPreferenceClickListener {
            runBiosHealthCheck(
                dsBiosDirPreference = dsBiosDirPreference,
                dsiBiosDirPreference = dsiBiosDirPreference,
                createDownloadProgressDialog = ::createDownloadProgressDialog,
            )
            true
        }

        applyInGameLocks()
    }

    private fun applyInGameLocks() {
        if (!isLaunchedInGame()) return
        listOf(
            "use_custom_bios",
            "console_type",
            "show_bios",
            "custom_randomize_mac_address",
            "bios_dir",
            "dsi_bios_dir",
            "auto_download_ds_bios",
            "auto_download_dsi_bios",
        ).forEach { lockPreferenceInGame(it) }
    }

    private fun runBiosHealthCheck(
        dsBiosDirPreference: BiosDirectoryPickerPreference,
        dsiBiosDirPreference: BiosDirectoryPickerPreference,
        createDownloadProgressDialog: (String, String) -> Pair<AlertDialog, android.widget.ProgressBar>,
    ) {
        val ctx = context ?: return
        val appContext = ctx.applicationContext
        val prefs = preferenceManager.sharedPreferences
        val dsUri = prefs?.getStringSet("bios_dir", emptySet())?.firstOrNull()?.let { Uri.parse(it) }
        val dsiUri = prefs?.getStringSet("dsi_bios_dir", emptySet())?.firstOrNull()?.let { Uri.parse(it) }
        val blocked = prefs?.getBoolean("block_bios_download", false) ?: false

        val loadingToast = android.widget.Toast.makeText(ctx, R.string.bios_health_check_running, android.widget.Toast.LENGTH_SHORT)
        loadingToast.show()

        lifecycleScope.launch(Dispatchers.IO) {
            data class CheckRow(
                val label: String,
                val ok: Boolean,
                val required: Boolean,
                val detail: String,
            )

            fun resolveDirDoc(consoleType: ConsoleType, uri: Uri?): androidx.documentfile.provider.DocumentFile? {
                val targetUri = uri ?: run {
                    val subFolder = if (consoleType == ConsoleType.DSi) "bios/dsi" else "bios/ds"
                    val defaultDir = java.io.File(android.os.Environment.getExternalStorageDirectory().resolve("STORM DS"), subFolder)
                    if (defaultDir.exists()) Uri.fromFile(defaultDir) else null
                } ?: return null
                return runCatching {
                    if (targetUri.scheme == "file") {
                        val f = java.io.File(Uri.decode(targetUri.path ?: ""))
                        if (f.exists() && f.isDirectory) androidx.documentfile.provider.DocumentFile.fromFile(f) else null
                    } else {
                        androidx.documentfile.provider.DocumentFile.fromTreeUri(appContext, targetUri)
                    }
                }.getOrNull()
            }

            val fileIndexCache = HashMap<String, Map<String, androidx.documentfile.provider.DocumentFile>>()
            fun indexDirectory(dirDoc: androidx.documentfile.provider.DocumentFile?): Map<String, androidx.documentfile.provider.DocumentFile> {
                if (dirDoc == null) return emptyMap()
                val key = dirDoc.uri.toString()
                fileIndexCache[key]?.let { return it }
                val index = LinkedHashMap<String, androidx.documentfile.provider.DocumentFile>()
                runCatching { dirDoc.listFiles() }.getOrNull()?.forEach { child ->
                    val name = child.name
                    if (!name.isNullOrBlank() && child.isFile) {
                        index.putIfAbsent(name.lowercase(java.util.Locale.ROOT), child)
                    }
                }
                fileIndexCache[key] = index
                return index
            }

            fun resolveFallbackBiosDir(): androidx.documentfile.provider.DocumentFile? {
                val fallbackDir = java.io.File(android.os.Environment.getExternalStorageDirectory().resolve("STORM DS"), "bios")
                return if (fallbackDir.exists() && fallbackDir.isDirectory) {
                    androidx.documentfile.provider.DocumentFile.fromFile(fallbackDir)
                } else {
                    null
                }
            }

            fun findFileIgnoreCase(
                dirDoc: androidx.documentfile.provider.DocumentFile?,
                fallbackDoc: androidx.documentfile.provider.DocumentFile?,
                vararg candidateNames: String,
            ): androidx.documentfile.provider.DocumentFile? {
                for (searchDir in listOfNotNull(dirDoc, fallbackDoc)) {
                    val index = indexDirectory(searchDir)
                    for (name in candidateNames) {
                        index[name.lowercase(java.util.Locale.ROOT)]?.let { return it }
                        searchDir.findFile(name)?.takeIf { it.isFile }?.let { return it }
                    }
                }
                return null
            }

            val fallbackBiosDir = resolveFallbackBiosDir()

            fun inspectFile(
                dirDoc: androidx.documentfile.provider.DocumentFile?,
                label: String,
                exactSize: Long?,
                minSize: Long,
                required: Boolean,
                validSizes: Set<Long>? = null,
                vararg candidateNames: String,
            ): CheckRow {
                val doc = findFileIgnoreCase(dirDoc, fallbackBiosDir, *candidateNames)
                if (doc == null) {
                    return CheckRow(label, ok = !required, required = required, detail = getString(R.string.v793_bios_missing))
                }
                val sizeAndHash = runCatching {
                    val digest = java.security.MessageDigest.getInstance("SHA-256")
                    var total = 0L
                    val buf = ByteArray(16384)
                    val stream = if (doc.uri.scheme == "file") {
                        java.io.FileInputStream(java.io.File(Uri.decode(doc.uri.path ?: "")))
                    } else {
                        appContext.contentResolver.openInputStream(doc.uri)
                    }
                    stream?.use { ins ->
                        while (true) {
                            val r = ins.read(buf)
                            if (r <= 0) break
                            total += r
                            digest.update(buf, 0, r)
                        }
                    }
                    val sha = digest.digest().take(6).joinToString("") { "%02x".format(it) }
                    total to sha
                }.getOrNull() ?: return CheckRow(label, ok = false, required = required, detail = "Read error")

                val (len, shaShort) = sizeAndHash
                val sizeOk = when {
                    exactSize != null -> len == exactSize
                    validSizes != null -> len in validSizes
                    else -> len >= minSize
                }
                val sizeText = if (len >= 1024L * 1024L) {
                    String.format(java.util.Locale.US, "%.1f MB", len / (1024.0 * 1024.0))
                } else {
                    "${len / 1024L} KB"
                }
                val statusTag = if (sizeOk) "OK" else "SIZE MISMATCH"
                return CheckRow(label, ok = sizeOk, required = required, detail = "$statusTag ($sizeText, sha256:$shaShort)")
            }

            val dsDir = resolveDirDoc(ConsoleType.DS, dsUri)
            val dsiDir = resolveDirDoc(ConsoleType.DSi, dsiUri)
            val validFirmwareSizes = setOf(131072L, 262144L, 524288L)

            val dsRows = listOf(
                inspectFile(dsDir, "DS bios7.bin", exactSize = 16384L, minSize = 16384L, required = true, candidateNames = arrayOf("bios7.bin", "ds_bios7.bin", "arm7.bin", "bios7_ds.bin")),
                inspectFile(dsDir, "DS bios9.bin", exactSize = 4096L, minSize = 4096L, required = true, candidateNames = arrayOf("bios9.bin", "ds_bios9.bin", "arm9.bin", "bios9_ds.bin")),
                inspectFile(dsDir, "DS firmware.bin", exactSize = null, minSize = 131072L, required = true, validSizes = validFirmwareSizes, candidateNames = arrayOf("firmware.bin", "ds_firmware.bin", "firmware_ds.bin")),
                inspectFile(dsDir, "DS sd_card.bin", exactSize = null, minSize = 1024L, required = false, candidateNames = arrayOf("sd_card.bin", "dldi_sd_card.bin")),
            )
            val dsiRows = listOf(
                inspectFile(dsiDir, "DSi bios7.bin", exactSize = 65536L, minSize = 65536L, required = true, candidateNames = arrayOf("bios7i.bin", "dsi_bios7.bin", "bios7.bin", "arm7i.bin", "dsi_arm7.bin")),
                inspectFile(dsiDir, "DSi bios9.bin", exactSize = 65536L, minSize = 65536L, required = true, candidateNames = arrayOf("bios9i.bin", "dsi_bios9.bin", "bios9.bin", "arm9i.bin", "dsi_arm9.bin")),
                inspectFile(dsiDir, "DSi firmware.bin", exactSize = null, minSize = 131072L, required = true, validSizes = validFirmwareSizes, candidateNames = arrayOf("dsi_firmware.bin", "firmware.bin", "firmware_dsi.bin", "dsi_bios.bin")),
                inspectFile(dsiDir, "DSi nand.bin", exactSize = null, minSize = 1024L * 1024L, required = true, candidateNames = arrayOf("dsi_nand.bin", "nand.bin", "nand_dsi.bin")),
                inspectFile(dsiDir, "DSi sd_card.bin", exactSize = null, minSize = 1024L, required = false, candidateNames = arrayOf("sd_card.bin", "dsi_sd_card.bin")),
            )

            val dsMissing = dsRows.any { it.required && !it.ok }
            val dsiMissing = dsiRows.any { it.required && !it.ok }

            val report = buildString {
                if (!dsMissing && !dsiMissing) {
                    appendLine(getString(R.string.bios_health_check_all_ok))
                    appendLine()
                }
                appendLine("[Nintendo DS]")
                dsRows.forEach { row ->
                    val mark = if (row.ok) "✓" else if (row.required) "✕" else "•"
                    appendLine("$mark ${row.label}: ${row.detail}")
                }
                appendLine()
                appendLine("[Nintendo DSi]")
                dsiRows.forEach { row ->
                    val mark = if (row.ok) "✓" else if (row.required) "✕" else "•"
                    appendLine("$mark ${row.label}: ${row.detail}")
                }
            }.trimEnd()

            withContext(Dispatchers.Main) {
                loadingToast.cancel()
                if (!isAdded || activity == null) return@withContext
                val builder = AlertDialog.Builder(requireContext())
                    .setTitle(R.string.bios_health_check_title)
                    .setMessage(report)
                    .setPositiveButton(R.string.ok, null)

                if ((dsMissing || dsiMissing) && !blocked && !isLaunchedInGame()) {
                    builder.setNeutralButton(R.string.bios_health_check_download_missing) { _, _ ->
                        val (progressDialog, progressBar) = createDownloadProgressDialog(
                            getString(R.string.bios_health_check_download_missing),
                            getString(R.string.bios_health_check_running)
                        )
                        lifecycleScope.launch {
                            var anySuccess = false
                            if (dsMissing) {
                                val res = biosDownloadManager.downloadAndSetupDsBios { p ->
                                    activity?.runOnUiThread { progressBar.progress = if (dsiMissing) p / 2 else p }
                                }
                                if (res.isSuccess) {
                                    anySuccess = true
                                    dsBiosDirPreference.onDirectoryPicked(Uri.fromFile(res.getOrThrow()))
                                }
                            }
                            if (dsiMissing) {
                                val res = biosDownloadManager.downloadAndSetupDsiBios { p ->
                                    activity?.runOnUiThread { progressBar.progress = if (dsMissing) 50 + p / 2 else p }
                                }
                                if (res.isSuccess) {
                                    anySuccess = true
                                    dsiBiosDirPreference.onDirectoryPicked(Uri.fromFile(res.getOrThrow()))
                                }
                            }
                            runCatching { if (progressDialog.isShowing) progressDialog.dismiss() }
                            if (anySuccess && isAdded) {
                                preferenceManager.sharedPreferences?.edit()?.putBoolean("use_custom_bios", true)?.apply()
                                findPreference<androidx.preference.SwitchPreference>("use_custom_bios")?.isChecked = true
                                updateBiosSummaries()
                            }
                        }
                    }
                }
                builder.show()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        val blocked = findPreference<androidx.preference.SwitchPreference>("block_bios_download")?.isChecked ?: false
        findPreference<androidx.preference.Preference>("auto_download_ds_bios")?.isVisible = !blocked
        findPreference<androidx.preference.Preference>("auto_download_dsi_bios")?.isVisible = !blocked
        updateBiosSummaries()
    }

    private fun updateBiosSummaries() {
        val appContext = context?.applicationContext ?: return
        val dsPref = findPreference<BiosDirectoryPickerPreference>("bios_dir")
        val dsiPref = findPreference<BiosDirectoryPickerPreference>("dsi_bios_dir")
        val prefs = preferenceManager.sharedPreferences
        val dsUri = prefs?.getStringSet("bios_dir", emptySet())?.firstOrNull()?.let { Uri.parse(it) }
        val dsiUri = prefs?.getStringSet("dsi_bios_dir", emptySet())?.firstOrNull()?.let { Uri.parse(it) }
        val unitKb = getString(R.string.v793_bios_unit_kb)
        val expectedWord = getString(R.string.v793_bios_expected)
        val missingWord = getString(R.string.v793_bios_missing)
        val notSetWord = getString(R.string.not_set)

        viewLifecycleOwner.lifecycleScope.launch {
            val (dsSummary, dsiSummary) = withContext(Dispatchers.IO) {
                val ds = if (dsPref != null) {
                    formatBiosDirSummary(appContext, ConsoleType.DS, dsUri, unitKb, expectedWord, missingWord, notSetWord)
                } else ""
                val dsi = if (dsiPref != null) {
                    formatBiosDirSummary(appContext, ConsoleType.DSi, dsiUri, unitKb, expectedWord, missingWord, notSetWord)
                } else ""
                ds to dsi
            }
            if (!isAdded) return@launch
            val inGameSuffix = if (isLaunchedInGame()) " (${getString(R.string.video_setting_cannot_change_ingame)})" else ""
            if (dsPref != null && dsSummary.isNotEmpty()) dsPref.summary = dsSummary + inGameSuffix
            if (dsiPref != null && dsiSummary.isNotEmpty()) dsiPref.summary = dsiSummary + inGameSuffix
        }
    }

    private fun formatBiosDirSummary(
        appContext: android.content.Context,
        consoleType: ConsoleType,
        directoryUri: Uri?,
        unitKb: String,
        expectedWord: String,
        missingWord: String,
        notSetWord: String,
    ): String {
        val targetUri = directoryUri ?: run {
            val subFolder = if (consoleType == ConsoleType.DSi) "bios/dsi" else "bios/ds"
            val baseDir = android.os.Environment.getExternalStorageDirectory().resolve("STORM DS")
            val defaultDir = java.io.File(baseDir, subFolder)
            if (defaultDir.exists()) Uri.fromFile(defaultDir) else null
        } ?: return notSetWord

        val rawPath = me.magnum.melonds.utils.FileUtils.getAbsolutePathFromSAFUri(appContext, targetUri) ?: targetUri.path ?: targetUri.toString()
        val decodedPath = Uri.decode(rawPath)

        val dirDoc = runCatching {
            if (targetUri.scheme == "file") {
                val f = java.io.File(decodedPath)
                if (f.exists() && f.isDirectory) androidx.documentfile.provider.DocumentFile.fromFile(f) else null
            } else {
                androidx.documentfile.provider.DocumentFile.fromTreeUri(appContext, targetUri)
            }
        }.getOrNull() ?: return decodedPath

        val fallbackBiosDir = java.io.File(android.os.Environment.getExternalStorageDirectory().resolve("STORM DS"), "bios")
            .takeIf { it.exists() && it.isDirectory }
            ?.let { androidx.documentfile.provider.DocumentFile.fromFile(it) }
        val lowerIndexCache = HashMap<String, Map<String, androidx.documentfile.provider.DocumentFile>>()
        fun indexDir(doc: androidx.documentfile.provider.DocumentFile): Map<String, androidx.documentfile.provider.DocumentFile> {
            val key = doc.uri.toString()
            lowerIndexCache[key]?.let { return it }
            val index = LinkedHashMap<String, androidx.documentfile.provider.DocumentFile>()
            runCatching { doc.listFiles() }.getOrNull()?.forEach { child ->
                val childName = child.name
                if (!childName.isNullOrBlank() && child.isFile) {
                    index.putIfAbsent(childName.lowercase(java.util.Locale.ROOT), child)
                }
            }
            lowerIndexCache[key] = index
            return index
        }

        fun findDoc(vararg names: String): androidx.documentfile.provider.DocumentFile? {
            for (searchDir in listOfNotNull(dirDoc, fallbackBiosDir)) {
                val indexed = indexDir(searchDir)
                for (name in names) {
                    indexed[name.lowercase(java.util.Locale.ROOT)]?.let { return it }
                    searchDir.findFile(name)?.takeIf { it.isFile }?.let { return it }
                }
            }
            return null
        }

        fun getLength(doc: androidx.documentfile.provider.DocumentFile?): Long {
            if (doc == null) return -1L
            return runCatching {
                if (doc.uri.scheme == "file") {
                    java.io.File(Uri.decode(doc.uri.path ?: "")).length()
                } else {
                    appContext.contentResolver.openAssetFileDescriptor(doc.uri, "r")?.use { it.length } ?: -1L
                }
            }.getOrDefault(-1L)
        }

        val validFirmwareSizes = setOf(131072L, 262144L, 524288L)
        val sb = StringBuilder(decodedPath).append("\n")
        if (consoleType == ConsoleType.DS) {
            val f7 = findDoc("bios7.bin", "ds_bios7.bin", "arm7.bin", "bios7_ds.bin")
            val l7 = getLength(f7)
            val f9 = findDoc("bios9.bin", "ds_bios9.bin", "arm9.bin", "bios9_ds.bin")
            val l9 = getLength(f9)
            val ff = findDoc("firmware.bin", "ds_firmware.bin", "firmware_ds.bin")
            val lf = getLength(ff)

            val s7 = if (l7 == 16384L) "DS BIOS7: 16 $unitKb ✓" else if (l7 > 0) "DS BIOS7: ${l7 / 1024} $unitKb ⚠ ($expectedWord 16 $unitKb)" else "DS BIOS7: $missingWord"
            val s9 = if (l9 == 4096L) "DS BIOS9: 4 $unitKb ✓" else if (l9 > 0) "DS BIOS9: ${l9 / 1024} $unitKb ⚠ ($expectedWord 4 $unitKb)" else "DS BIOS9: $missingWord"
            val sf = when {
                lf in validFirmwareSizes -> "Firmware: ${lf / 1024} $unitKb ✓"
                lf > 0 -> "Firmware: ${lf / 1024} $unitKb ⚠ ($expectedWord 128/256/512 $unitKb)"
                else -> "Firmware: $missingWord"
            }
            sb.append(s7).append(" | ").append(s9).append(" | ").append(sf)
        } else {
            val f7 = findDoc("bios7i.bin", "dsi_bios7.bin", "bios7.bin", "arm7i.bin", "dsi_arm7.bin")
            val l7 = getLength(f7)
            val f9 = findDoc("bios9i.bin", "dsi_bios9.bin", "bios9.bin", "arm9i.bin", "dsi_arm9.bin")
            val l9 = getLength(f9)
            val ff = findDoc("dsi_firmware.bin", "firmware.bin", "firmware_dsi.bin", "dsi_bios.bin")
            val lf = getLength(ff)
            val fn = findDoc("dsi_nand.bin", "nand.bin", "nand_dsi.bin")
            val ln = getLength(fn)

            val s7 = if (l7 == 65536L) "DSi BIOS7: 64 $unitKb ✓" else if (l7 > 0) "DSi BIOS7: ${l7 / 1024} $unitKb ⚠ ($expectedWord 64 $unitKb)" else "DSi BIOS7: $missingWord"
            val s9 = if (l9 == 65536L) "DSi BIOS9: 64 $unitKb ✓" else if (l9 > 0) "DSi BIOS9: ${l9 / 1024} $unitKb ⚠ ($expectedWord 64 $unitKb)" else "DSi BIOS9: $missingWord"
            val sf = when {
                lf in validFirmwareSizes -> "Firmware: ${lf / 1024} $unitKb ✓"
                lf > 0 -> "Firmware: ${lf / 1024} $unitKb ⚠ ($expectedWord 128/256/512 $unitKb)"
                else -> "Firmware: $missingWord"
            }
            val sn = when {
                ln >= 1024L * 1024L -> String.format(java.util.Locale.US, "NAND: %.1f MB ✓", ln / (1024.0 * 1024.0))
                ln > 0 -> "NAND: ${ln / 1024} $unitKb ⚠"
                else -> "NAND: $missingWord"
            }
            sb.append(s7).append(" | ").append(s9).append(" | ").append(sf).append(" | ").append(sn)
        }
        return sb.toString()
    }

    override fun getTitle() = getString(R.string.custom_bios_firmware)
}
