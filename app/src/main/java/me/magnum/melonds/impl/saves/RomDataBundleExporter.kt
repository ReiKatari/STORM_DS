package me.magnum.melonds.impl.saves

import android.content.Context
import android.net.Uri
import android.os.Environment
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import me.magnum.melonds.domain.model.SaveStateSlot
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.impl.emulator.SramProvider
import me.magnum.melonds.ui.emulator.savestate.SaveStateUndoManager
import org.json.JSONArray
import org.json.JSONObject
import java.io.File
import java.io.InputStream
import java.io.OutputStream
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

object RomDataBundleExporter {
    private const val TAG = "RomDataBundleExporter"

    var lastActiveRom: Rom? = null

    suspend fun exportBundle(
        context: Context,
        rom: Rom? = null,
        slots: List<SaveStateSlot> = emptyList(),
        destinationUri: Uri? = null,
    ): Result<String> = withContext(Dispatchers.IO) {
        runCatching {
            val effectiveRom = rom ?: SramProvider.lastRom ?: SaveStateUndoManager.lastActiveRom
            val rawName = effectiveRom?.config?.customName ?: effectiveRom?.name ?: "NDS_Game"
            val sanitizedRomName = rawName.replace(Regex("[\\\\/:*?\"<>|\\s]+"), "_").trim('_').ifEmpty { "nds_game" }
            val timestampStr = SimpleDateFormat("dd.MM.yyyy_HH-mm", Locale.US).format(Date())
            val defaultZipName = "${sanitizedRomName}_${timestampStr}.zip"

            val extStorage = runCatching { Environment.getExternalStorageDirectory() }.getOrNull()
            val stormDsRoot = if (extStorage != null) File(extStorage, "STORM DS") else null
            val backupsDir = if (stormDsRoot != null && (stormDsRoot.exists() || stormDsRoot.mkdirs())) {
                File(stormDsRoot, "backups").apply { mkdirs() }
            } else {
                File(context.getExternalFilesDir(null) ?: context.filesDir, "backups").apply { mkdirs() }
            }

            val targetFile = File(backupsDir, defaultZipName)
            val outputStream: OutputStream = if (destinationUri != null) {
                context.contentResolver.openOutputStream(destinationUri)
                    ?: throw IllegalStateException("Could not open output stream for $destinationUri")
            } else {
                targetFile.outputStream()
            }

            ZipOutputStream(outputStream.buffered()).use { zipOut ->
                // 1. Export Battery Save (.sav / .srm)
                val sramUri = SramProvider.lastSramUri
                var primarySaveWritten = false
                if (sramUri != null) {
                    runCatching {
                        context.contentResolver.openInputStream(sramUri)?.use { input ->
                            val sramName = sramUri.lastPathSegment?.substringAfterLast('/') ?: "$sanitizedRomName.sav"
                            zipOut.putNextEntry(ZipEntry("saves/$sramName"))
                            input.copyTo(zipOut)
                            zipOut.closeEntry()
                            primarySaveWritten = true
                            Log.i(TAG, "Added battery save to bundle: saves/$sramName")
                        }
                    }
                }

                // If not found from URI, scan common save folders
                if (!primarySaveWritten) {
                    val candidateDirs = listOfNotNull(
                        stormDsRoot?.let { File(it, "saves") },
                        File(context.getExternalFilesDir(null) ?: context.filesDir, "saves")
                    )
                    for (dir in candidateDirs) {
                        if (!dir.exists()) continue
                        val matchingSave = dir.listFiles()?.firstOrNull { file ->
                            val n = file.name.lowercase(Locale.ROOT)
                            (n.startsWith(sanitizedRomName.lowercase(Locale.ROOT)) || (effectiveRom != null && n.startsWith(effectiveRom.name.lowercase(Locale.ROOT)))) &&
                                (n.endsWith(".sav") || n.endsWith(".srm") || n.endsWith(".dsv"))
                        }
                        if (matchingSave != null && matchingSave.exists() && matchingSave.length() > 0L) {
                            matchingSave.inputStream().use { input ->
                                zipOut.putNextEntry(ZipEntry("saves/${matchingSave.name}"))
                                input.copyTo(zipOut)
                                zipOut.closeEntry()
                                primarySaveWritten = true
                                Log.i(TAG, "Added file battery save to bundle: saves/${matchingSave.name}")
                            }
                            break
                        }
                    }
                }

                // 2. Export SRAM Backups (.bak1..3)
                val candidateBackupDirs = listOfNotNull(
                    stormDsRoot?.let { File(it, "cache/save_backups") },
                    File(context.cacheDir, "save_backups")
                )
                for (bDir in candidateBackupDirs) {
                    if (!bDir.exists()) continue
                    bDir.listFiles()?.filter { file ->
                        val n = file.name.lowercase(Locale.ROOT)
                        (n.contains(sanitizedRomName.lowercase(Locale.ROOT)) || (effectiveRom != null && n.contains(effectiveRom.name.lowercase(Locale.ROOT)))) &&
                            (n.endsWith(".bak1") || n.endsWith(".bak2") || n.endsWith(".bak3") || n.endsWith(".bak")) &&
                            file.length() > 0L
                    }?.forEach { bakFile ->
                        runCatching {
                            bakFile.inputStream().use { input ->
                                zipOut.putNextEntry(ZipEntry("backups/${bakFile.name}"))
                                input.copyTo(zipOut)
                                zipOut.closeEntry()
                                Log.i(TAG, "Added SRAM backup to bundle: backups/${bakFile.name}")
                            }
                        }
                    }
                }

                // 3. Export Save State Slots and Screenshots
                val candidateStatesDirs = listOfNotNull(
                    stormDsRoot?.let { File(it, "savestates") },
                    File(context.getExternalFilesDir(null) ?: context.filesDir, "savestates")
                )
                slots.forEach { slot ->
                    if (slot.exists) {
                        // Slot screenshot
                        if (slot.screenshot != null) {
                            runCatching {
                                context.contentResolver.openInputStream(slot.screenshot)?.use { input ->
                                    val entryName = "states/slot_${slot.slot}.png"
                                    zipOut.putNextEntry(ZipEntry(entryName))
                                    input.copyTo(zipOut)
                                    zipOut.closeEntry()
                                    Log.i(TAG, "Added state screenshot to bundle: $entryName")
                                }
                            }
                        }

                        // State binary file (.ml0..8)
                        var stateWritten = false
                        for (sDir in candidateStatesDirs) {
                            if (!sDir.exists()) continue
                            val stateFile = sDir.listFiles()?.firstOrNull { file ->
                                val n = file.name.lowercase(Locale.ROOT)
                                (n.contains(sanitizedRomName.lowercase(Locale.ROOT)) || (effectiveRom != null && n.contains(effectiveRom.name.lowercase(Locale.ROOT)))) &&
                                    (n.endsWith(".ml${slot.slot}"))
                            }
                            if (stateFile != null && stateFile.exists() && stateFile.length() > 0L) {
                                stateFile.inputStream().use { input ->
                                    val entryName = "states/slot_${slot.slot}.ml${slot.slot}"
                                    zipOut.putNextEntry(ZipEntry(entryName))
                                    input.copyTo(zipOut)
                                    zipOut.closeEntry()
                                    stateWritten = true
                                    Log.i(TAG, "Added state file to bundle: $entryName")
                                }
                                break
                            }
                        }
                    }
                }

                // 4. Export JSON Metadata (rom.config)
                val configJson = JSONObject().apply {
                    put("version", "7.9.0")
                    put("exportDate", SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.US).format(Date()))
                    put("romName", effectiveRom?.name ?: rawName)
                    put("fileName", effectiveRom?.fileName ?: "")
                    put("gameCode", effectiveRom?.gameCode ?: "")
                    put("retroAchievementsHash", effectiveRom?.retroAchievementsHash ?: "")

                    val romConfigObj = JSONObject()
                    if (effectiveRom != null) {
                        romConfigObj.put("customName", effectiveRom.config.customName)
                        romConfigObj.put("runtimeConsoleType", effectiveRom.config.runtimeConsoleType.name)
                        romConfigObj.put("runtimeMicSource", effectiveRom.config.runtimeMicSource.name)
                        romConfigObj.put("inputMode", effectiveRom.config.inputMode.name)
                        romConfigObj.put("useHgEngineFix", effectiveRom.config.useHgEngineFix)
                        romConfigObj.put("retroAchievementsEnabled", effectiveRom.config.retroAchievementsEnabled)
                        romConfigObj.put("videoRenderer", effectiveRom.config.videoRenderer?.name)
                        romConfigObj.put("videoFiltering", effectiveRom.config.videoFiltering?.name)
                        romConfigObj.put("threadedRendering", effectiveRom.config.threadedRendering)
                        romConfigObj.put("internalResolutionScaling", effectiveRom.config.internalResolutionScaling)
                    }
                    put("config", romConfigObj)

                    val slotsArray = JSONArray()
                    slots.forEach { s ->
                        if (s.exists) {
                            val slotObj = JSONObject().apply {
                                put("slot", s.slot)
                                put("exists", s.exists)
                                put("lastModified", s.lastUsedDate?.time ?: 0L)
                                put("customName", s.customName)
                            }
                            slotsArray.put(slotObj)
                        }
                    }
                    put("slots", slotsArray)
                }

                val configBytes = configJson.toString(2).toByteArray(Charsets.UTF_8)
                zipOut.putNextEntry(ZipEntry("rom.config.json"))
                zipOut.write(configBytes)
                zipOut.closeEntry()

                zipOut.putNextEntry(ZipEntry("rom.config"))
                zipOut.write(configBytes)
                zipOut.closeEntry()
            }

            val savedPath = destinationUri?.toString() ?: targetFile.absolutePath
            Log.i(TAG, "Successfully exported ROM data bundle to $savedPath")
            savedPath
        }
    }
}
