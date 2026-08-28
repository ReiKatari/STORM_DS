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

    private fun getDefaultDirectory(): File {
        val baseDir = File(android.os.Environment.getExternalStorageDirectory(), "STORM DS")
        val subFolder = if (key == "save_state_custom_dir") "quicksaves" else "saves"
        return File(baseDir, subFolder).apply { mkdirs() }
    }

    override fun onAttached() {
        super.onAttached()
        val persisted = getPersistedStringSet(emptySet()).firstOrNull()
        val defaultDir = getDefaultDirectory()
        val defaultUri = Uri.fromFile(defaultDir)
        if (persisted == null || persisted.contains("data/user/0") || persisted.contains("files/saves")) {
            persistStringSet(setOf(defaultUri.toString()))
            summary = defaultDir.absolutePath
        }
    }

    override fun onBindViewHolder(holder: PreferenceViewHolder) {
        super.onBindViewHolder(holder)

        buttonResetDefault = holder.findViewById(R.id.buttonResetDefault) as? ImageView
        imageViewStatus = holder.findViewById(R.id.imageViewStatus) as? ImageView

        imageViewStatus?.visibility = View.GONE

        buttonResetDefault?.isGone = !isEnabled
        buttonResetDefault?.setOnClickListener {
            val defaultDir = getDefaultDirectory()
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
