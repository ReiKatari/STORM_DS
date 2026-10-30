package me.magnum.melonds.ui.emulator.savestate

import android.content.Context
import android.net.Uri
import me.magnum.melonds.domain.model.SaveStateSlot
import me.magnum.melonds.domain.model.rom.Rom
import java.io.File

data class SaveStateUndoBackup(
    val slotNumber: Int,
    val stateBackupFile: File,
    val screenshotBackupFile: File?,
    val customName: String?,
    val timestamp: Long = System.currentTimeMillis(),
)

object SaveStateUndoManager {
    private var lastBackup: SaveStateUndoBackup? = null
    private var lastRomHash: Int? = null

    fun hasUndoBackup(rom: Rom): Boolean {
        if (lastRomHash != rom.uri.hashCode()) return false
        val backup = lastBackup ?: return false
        return backup.stateBackupFile.exists() && backup.stateBackupFile.length() > 0
    }

    fun getUndoSlot(rom: Rom): Int? {
        return if (hasUndoBackup(rom)) lastBackup?.slotNumber else null
    }

    fun backupBeforeOverwrite(
        context: Context,
        rom: Rom,
        slot: SaveStateSlot,
        slotUri: Uri,
        screenshotUri: Uri?,
        customName: String?,
    ) {
        if (!slot.exists) return
        val cacheDir = File(context.cacheDir, "savestate_undo_${rom.uri.hashCode()}").apply { mkdirs() }
        val stateBackup = File(cacheDir, "slot_${slot.slot}.ml.undo.bak")
        val screenshotBackup = if (screenshotUri != null) File(cacheDir, "slot_${slot.slot}.png.undo.bak") else null

        runCatching {
            context.contentResolver.openInputStream(slotUri)?.use { input ->
                stateBackup.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
        }

        if (screenshotUri != null && screenshotBackup != null) {
            runCatching {
                context.contentResolver.openInputStream(screenshotUri)?.use { input ->
                    screenshotBackup.outputStream().use { output ->
                        input.copyTo(output)
                    }
                }
            }
        }

        if (stateBackup.exists() && stateBackup.length() > 0) {
            lastRomHash = rom.uri.hashCode()
            lastBackup = SaveStateUndoBackup(
                slotNumber = slot.slot,
                stateBackupFile = stateBackup,
                screenshotBackupFile = screenshotBackup?.takeIf { it.exists() && it.length() > 0 },
                customName = customName,
            )
        }
    }

    fun restoreUndoBackup(
        context: Context,
        rom: Rom,
        targetSlotUri: Uri,
        targetScreenshotUri: Uri?,
        onRestoreCustomName: (Int, String?) -> Unit,
    ): Boolean {
        val backup = lastBackup ?: return false
        if (lastRomHash != rom.uri.hashCode()) return false
        if (!backup.stateBackupFile.exists() || backup.stateBackupFile.length() == 0L) return false

        var success = false
        runCatching {
            backup.stateBackupFile.inputStream().use { input ->
                context.contentResolver.openOutputStream(targetSlotUri)?.use { output ->
                    input.copyTo(output)
                    success = true
                }
            }
        }

        if (success) {
            if (backup.screenshotBackupFile != null && backup.screenshotBackupFile.exists() && targetScreenshotUri != null) {
                runCatching {
                    backup.screenshotBackupFile.inputStream().use { input ->
                        context.contentResolver.openOutputStream(targetScreenshotUri)?.use { output ->
                            input.copyTo(output)
                        }
                    }
                }
            }
            onRestoreCustomName(backup.slotNumber, backup.customName)
            lastBackup = null
        }
        return success
    }

    fun clear() {
        lastBackup = null
        lastRomHash = null
    }
}
