package me.magnum.melonds.ui.settings.preferences

import android.content.Context
import android.net.Uri
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.core.net.toUri
import androidx.core.view.isGone
import androidx.preference.PreferenceViewHolder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.R
import me.magnum.melonds.common.Permission
import java.io.File

class SavesDirectoryPickerPreference(context: Context, attrs: AttributeSet?) : StoragePickerPreference(context, attrs) {

    init {
        widgetLayoutResource = R.layout.preference_directory_picker_status
        selectionType = SelectionType.DIRECTORY
        permissions = Permission.READ_WRITE
        persistPermissions = true
    }

    private var buttonResetDefault: ImageView? = null
    private var imageViewStatus: ImageView? = null
    private var ioScope: CoroutineScope? = null
    private var attachJob: Job? = null

    private fun ensureScope(): CoroutineScope {
        return ioScope ?: CoroutineScope(SupervisorJob() + Dispatchers.Main.immediate).also { ioScope = it }
    }

    private fun getDefaultDirectory(): File {
        val subFolder = if (key == "save_state_custom_dir") "quicksaves" else "saves"
        val extRoot = runCatching { android.os.Environment.getExternalStorageDirectory() }.getOrNull()
        val extDir = extRoot?.let { File(File(it, "STORM DS"), subFolder) }
        val isExtReady = extDir != null && runCatching {
            (extDir.exists() || extDir.mkdirs()) && extDir.isDirectory && extDir.canWrite()
        }.getOrDefault(false)
        return if (isExtReady) {
            extDir!!
        } else {
            File(context.filesDir, subFolder).apply { mkdirs() }
        }
    }

    override fun onAttached() {
        super.onAttached()
        val persisted = getPersistedStringSet(emptySet()).firstOrNull()
        if (persisted == null || persisted.contains("data/user/0") || persisted.contains("files/saves")) {
            attachJob?.cancel()
            attachJob = ensureScope().launch {
                val defaultDir = withContext(Dispatchers.IO) { getDefaultDirectory() }
                val defaultUri = Uri.fromFile(defaultDir)
                persistStringSet(setOf(defaultUri.toString()))
                summary = defaultDir.absolutePath
            }
        }
    }

    override fun onDetached() {
        attachJob?.cancel()
        ioScope?.cancel()
        ioScope = null
        super.onDetached()
    }

    override fun onBindViewHolder(holder: PreferenceViewHolder) {
        super.onBindViewHolder(holder)

        buttonResetDefault = holder.findViewById(R.id.buttonResetDefault) as? ImageView
        imageViewStatus = holder.findViewById(R.id.imageViewStatus) as? ImageView

        imageViewStatus?.visibility = View.GONE

        buttonResetDefault?.isGone = !isEnabled
        buttonResetDefault?.setOnClickListener {
            ensureScope().launch {
                val defaultDir = withContext(Dispatchers.IO) { getDefaultDirectory() }
                val defaultUri = Uri.fromFile(defaultDir)
                onDirectoryPicked(defaultUri)
                summary = defaultDir.absolutePath
                Toast.makeText(
                    context,
                    "${context.getString(R.string.reset_to_default)}: ${defaultDir.absolutePath}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
