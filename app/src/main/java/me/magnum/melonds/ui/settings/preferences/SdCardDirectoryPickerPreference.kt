package me.magnum.melonds.ui.settings.preferences

import android.content.Context
import android.net.Uri
import android.util.AttributeSet
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.preference.PreferenceViewHolder
import me.magnum.melonds.R
import me.magnum.melonds.common.Permission
import me.magnum.melonds.domain.model.ConsoleType

class SdCardDirectoryPickerPreference(context: Context, attrs: AttributeSet?) : StoragePickerPreference(context, attrs) {

    init {
        widgetLayoutResource = R.layout.preference_directory_picker_status
        selectionType = SelectionType.DIRECTORY
        permissions = Permission.READ_WRITE
        persistPermissions = true
    }

    private var targetConsoleType: ConsoleType? = null
    private var buttonResetDefault: ImageView? = null

    override fun initAttributes(attrs: AttributeSet?) {
        super.initAttributes(attrs)
        if (attrs == null) return

        val attrArray = context.theme.obtainStyledAttributes(attrs, R.styleable.SdCardDirectoryPickerPreference, 0, 0)
        val typeIdx = attrArray.getInt(R.styleable.SdCardDirectoryPickerPreference_sdConsoleType, 0)
        targetConsoleType = if (typeIdx == 1) ConsoleType.DSi else ConsoleType.DS
        attrArray.recycle()
    }

    private fun getEffectiveConsoleType(): ConsoleType {
        targetConsoleType?.let { return it }
        return if (key?.contains("dsi", ignoreCase = true) == true) ConsoleType.DSi else ConsoleType.DS
    }

    override fun onAttached() {
        super.onAttached()
        val cType = getEffectiveConsoleType()
        val persisted = getPersistedStringSet(emptySet()).firstOrNull()
        val subFolder = if (cType == ConsoleType.DSi) "bios/dsi" else "bios/ds"
        val baseDir = android.os.Environment.getExternalStorageDirectory().resolve("STORM DS")
        val defaultDir = java.io.File(baseDir, subFolder).apply { mkdirs() }
        val defaultUri = Uri.fromFile(defaultDir)

        if (persisted.isNullOrBlank() || persisted.contains("data/user/0") || persisted.contains("files/dldi") || (cType == ConsoleType.DSi && persisted.endsWith("bios/ds"))) {
            persistStringSet(setOf(defaultUri.toString()))
            summary = defaultDir.absolutePath
        } else {
            val uri = persisted.toUri()
            val rawPath = me.magnum.melonds.utils.FileUtils.getAbsolutePathFromSAFUri(context, uri) ?: uri.path ?: persisted
            summary = Uri.decode(rawPath)
        }
    }

    override fun onBindViewHolder(holder: PreferenceViewHolder) {
        super.onBindViewHolder(holder)

        buttonResetDefault = holder.findViewById(R.id.buttonResetDefault) as? ImageView
        val statusView = holder.findViewById(R.id.imageViewStatus) as? ImageView
        statusView?.visibility = android.view.View.GONE

        buttonResetDefault?.setOnClickListener {
            val cType = getEffectiveConsoleType()
            val subFolder = if (cType == ConsoleType.DSi) "bios/dsi" else "bios/ds"
            val baseDir = android.os.Environment.getExternalStorageDirectory().resolve("STORM DS")
            val defaultDir = java.io.File(baseDir, subFolder).apply { mkdirs() }
            val defaultUri = Uri.fromFile(defaultDir)
            onDirectoryPicked(defaultUri)
            summary = defaultDir.absolutePath
            android.widget.Toast.makeText(context, "${context.getString(R.string.reset_to_default)}: ${defaultDir.absolutePath}", android.widget.Toast.LENGTH_SHORT).show()
        }
    }
}
