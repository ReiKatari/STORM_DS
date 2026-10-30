package me.magnum.melonds.ui.emulator.savestate

import android.content.Context
import android.net.Uri
import android.util.Log
import me.magnum.melonds.domain.model.SaveStateSlot
import me.magnum.melonds.domain.model.rom.Rom
import java.io.File
import java.util.ArrayDeque

object SaveStateUndoManager {
    private const val TAG = "SaveStateUndoManager"
    const val MAX_UNDO_STEPS = 5

    data class SaveStateUndoBackup(
        val slotNumber: Int,
        val timestamp: Long = System.currentTimeMillis(),
        val stateBackupFile: File,
        val screenshotBackupFile: File?,
        val customName: String?,
        val stepIndex: Int = 0,
    )

    private val undoStacks = mutableMapOf<Int, ArrayDeque<SaveStateUndoBackup>>()
    var lastRomHash: Int? = null
        private set
    var lastActiveRom: Rom? = null

    private fun getStack(romHash: Int): ArrayDeque<SaveStateUndoBackup> {
        return undoStacks.getOrPut(romHash) { ArrayDeque() }
    }

    @Synchronized
    fun hasUndoBackup(rom: Rom? = null): Boolean {
        val targetHash = rom?.uri?.hashCode() ?: lastRomHash ?: return false
        val stack = undoStacks[targetHash] ?: return false
        val top = stack.peekFirst() ?: return false
        return top.stateBackupFile.exists() && top.stateBackupFile.length() > 0L
    }

    @Synchronized
    fun getUndoCount(rom: Rom? = null): Int {
        val targetHash = rom?.uri?.hashCode() ?: lastRomHash ?: return 0
        val stack = undoStacks[targetHash] ?: return 0
        return stack.count { it.stateBackupFile.exists() && it.stateBackupFile.length() > 0L }
    }

    @Synchronized
    fun getActiveUndoCount(): Int {
        val hash = lastRomHash ?: return 0
        return getUndoCount(hash)
    }

    @Synchronized
    fun getUndoCount(romHash: Int): Int {
        val stack = undoStacks[romHash] ?: return 0
        return stack.count { it.stateBackupFile.exists() && it.stateBackupFile.length() > 0L }
    }

    @Synchronized
    fun peekTopUndo(rom: Rom? = null): SaveStateUndoBackup? {
        val targetHash = rom?.uri?.hashCode() ?: lastRomHash ?: return null
        val stack = undoStacks[targetHash] ?: return null
        return stack.peekFirst()
    }

    @Synchronized
    fun popUndo(rom: Rom? = null): SaveStateUndoBackup? {
        val targetHash = rom?.uri?.hashCode() ?: lastRomHash ?: return null
        val stack = undoStacks[targetHash] ?: return null
        return stack.pollFirst()
    }

    @Synchronized
    fun getUndoSlot(rom: Rom): Int? {
        return if (hasUndoBackup(rom)) peekTopUndo(rom)?.slotNumber else null
    }

    @Synchronized
    fun backupBeforeOverwrite(
        context: Context,
        rom: Rom,
        slot: SaveStateSlot,
        slotUri: Uri,
        screenshotUri: Uri?,
        customName: String?,
    ) {
        if (!slot.exists) return
        val romHash = rom.uri.hashCode()
        lastRomHash = romHash
        lastActiveRom = rom

        val cacheDir = File(context.cacheDir, "savestate_undo_$romHash").apply { mkdirs() }
        val stepIdx = System.currentTimeMillis() % 100000
        val stateBackup = File(cacheDir, "slot_${slot.slot}_undo_${stepIdx}.bak")
        val screenshotBackup = if (screenshotUri != null) {
            File(cacheDir, "slot_${slot.slot}_undo_${stepIdx}.png.bak")
        } else null

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

        if (stateBackup.exists() && stateBackup.length() > 0L) {
            val stack = getStack(romHash)
            // LIFO Ring Buffer: keep up to MAX_UNDO_STEPS = 5
            while (stack.size >= MAX_UNDO_STEPS) {
                val oldest = stack.removeLast()
                runCatching { oldest.stateBackupFile.delete() }
                runCatching { oldest.screenshotBackupFile?.delete() }
            }

            val backup = SaveStateUndoBackup(
                slotNumber = slot.slot,
                timestamp = System.currentTimeMillis(),
                stateBackupFile = stateBackup,
                screenshotBackupFile = screenshotBackup?.takeIf { it.exists() && it.length() > 0L },
                customName = customName,
                stepIndex = stack.size + 1
            )
            stack.addFirst(backup)
            Log.i(TAG, "Recorded undo step for slot ${slot.slot}, current depth: ${stack.size}/$MAX_UNDO_STEPS")
        }
    }

    @Synchronized
    fun restoreUndoBackup(
        context: Context,
        rom: Rom,
        targetSlotUri: Uri,
        targetScreenshotUri: Uri?,
        onRestoreCustomName: (Int, String?) -> Unit,
    ): Boolean {
        val romHash = rom.uri.hashCode()
        val stack = undoStacks[romHash] ?: return false
        val backup = stack.peekFirst() ?: return false
        if (!backup.stateBackupFile.exists() || backup.stateBackupFile.length() == 0L) {
            stack.pollFirst()
            return false
        }

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
            stack.pollFirst()
            runCatching { backup.stateBackupFile.delete() }
            runCatching { backup.screenshotBackupFile?.delete() }
            Log.i(TAG, "Restored undo step for slot ${backup.slotNumber}, remaining depth: ${stack.size}")
        }
        return success
    }

    @Synchronized
    fun clear(rom: Rom? = null) {
        if (rom != null) {
            val stack = undoStacks.remove(rom.uri.hashCode())
            stack?.forEach {
                runCatching { it.stateBackupFile.delete() }
                runCatching { it.screenshotBackupFile?.delete() }
            }
        } else {
            undoStacks.values.forEach { stack ->
                stack.forEach {
                    runCatching { it.stateBackupFile.delete() }
                    runCatching { it.screenshotBackupFile?.delete() }
                }
            }
            undoStacks.clear()
            lastRomHash = null
            lastActiveRom = null
        }
    }
}
