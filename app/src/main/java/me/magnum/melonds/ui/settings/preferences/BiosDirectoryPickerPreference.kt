package me.magnum.melonds.ui.settings.preferences

import android.content.Context
import android.content.res.ColorStateList
import android.net.Uri
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.core.content.res.getIntOrThrow
import androidx.core.net.toUri
import androidx.core.view.isGone
import androidx.core.widget.ImageViewCompat
import androidx.preference.Preference
import androidx.preference.PreferenceViewHolder
import me.magnum.melonds.R
import me.magnum.melonds.common.Permission
import me.magnum.melonds.domain.model.ConfigurationDirResult
import me.magnum.melonds.domain.model.ConsoleType
import me.magnum.melonds.ui.settings.FileStatusPopup

class BiosDirectoryPickerPreference(context: Context, attrs: AttributeSet?) : StoragePickerPreference(context, attrs) {
    interface BiosDirectoryValidator {
        fun getBiosDirectoryValidationResult(consoleType: ConsoleType, directory: Uri?): ConfigurationDirResult
    }

    init {
        widgetLayoutResource = R.layout.preference_directory_picker_status
        selectionType = SelectionType.DIRECTORY
        permissions = Permission.READ_WRITE
        persistPermissions = true
    }

    private var consoleType: ConsoleType? = null
    private var biosDirectoryValidator: BiosDirectoryValidator? = null
    private var currentValidationResult: ConfigurationDirResult? = null

    private var imageViewStatus: ImageView? = null
    private var buttonResetDefault: ImageView? = null

    override fun onDirectoryPicked(uri: Uri?) {
        super.onDirectoryPicked(uri)

        if (uri == null)
            return

        validateDirectory(uri)
    }

    override fun onDependencyChanged(dependency: Preference, disableDependent: Boolean) {
        super.onDependencyChanged(dependency, disableDependent)
        imageViewStatus?.isGone = disableDependent
        buttonResetDefault?.isGone = disableDependent
    }

    fun setBiosDirectoryValidator(validator: BiosDirectoryValidator) {
        biosDirectoryValidator = validator
    }

    private fun validateDirectory(uri: Uri?) {
        if (!isEnabled) {
            imageViewStatus?.isGone = true
            buttonResetDefault?.isGone = true
            return
        }

        imageViewStatus?.isGone = false
        buttonResetDefault?.isGone = false

        currentValidationResult = biosDirectoryValidator?.getBiosDirectoryValidationResult(consoleType!!, uri)
        updateStatusView()
    }

    override fun initAttributes(attrs: AttributeSet?) {
        if (attrs == null)
            return

        val attrArray = context.theme.obtainStyledAttributes(attrs, R.styleable.BiosDirectoryPickerPreference, 0, 0)
        consoleType = ConsoleType.entries[attrArray.getIntOrThrow(R.styleable.BiosDirectoryPickerPreference_consoleType)]

        attrArray.recycle()
    }

    override fun onAttached() {
        super.onAttached()
        val persisted = getPersistedStringSet(emptySet()).firstOrNull()
        val subFolder = if (consoleType == ConsoleType.DSi) "bios/dsi" else "bios/ds"
        val baseDir = android.os.Environment.getExternalStorageDirectory().resolve("STORM DS")
        val defaultDir = java.io.File(baseDir, subFolder).apply { mkdirs() }
        val defaultUri = Uri.fromFile(defaultDir)
        if (persisted == null || persisted.contains("data/user/0") || persisted.contains("files/bios")) {
            persistStringSet(setOf(defaultUri.toString()))
            summary = defaultDir.absolutePath
            validateDirectory(defaultUri)
        } else {
            val uri = persisted.toUri()
            val rawPath = me.magnum.melonds.utils.FileUtils.getAbsolutePathFromSAFUri(context, uri) ?: uri.path ?: persisted
            summary = Uri.decode(rawPath)
            validateDirectory(uri)
        }
    }

    override fun onBindViewHolder(holder: PreferenceViewHolder) {
        super.onBindViewHolder(holder)

        imageViewStatus = holder.findViewById(R.id.imageViewStatus) as? ImageView
        buttonResetDefault = holder.findViewById(R.id.buttonResetDefault) as? ImageView

        buttonResetDefault?.setOnClickListener {
            val subFolder = if (consoleType == ConsoleType.DSi) "bios/dsi" else "bios/ds"
            val baseDir = android.os.Environment.getExternalStorageDirectory().resolve("STORM DS")
            val defaultDir = java.io.File(baseDir, subFolder).apply { mkdirs() }
            val defaultUri = Uri.fromFile(defaultDir)
            onDirectoryPicked(defaultUri)
            summary = defaultDir.absolutePath
            validateDirectory(defaultUri)
            android.widget.Toast.makeText(context, "${context.getString(R.string.reset_to_default)}: ${defaultDir.absolutePath}", android.widget.Toast.LENGTH_SHORT).show()
        }

        updateStatusView()
    }

    private fun updateStatusView() {
        val statusView = imageViewStatus ?: return
        val resetView = buttonResetDefault

        statusView.isGone = !isEnabled
        resetView?.isGone = !isEnabled

        if (!isEnabled) {
            return
        }

        currentValidationResult?.let { dirResult ->
            when (dirResult.status) {
                ConfigurationDirResult.Status.VALID -> {
                    statusView.visibility = View.GONE
                }
                ConfigurationDirResult.Status.INVALID -> {
                    statusView.visibility = View.VISIBLE
                    statusView.setImageResource(R.drawable.ic_status_warn)
                    ImageViewCompat.setImageTintList(statusView, ColorStateList.valueOf(ContextCompat.getColor(context, R.color.statusWarn)))
                }
                ConfigurationDirResult.Status.UNSET -> {
                    statusView.visibility = View.VISIBLE
                    statusView.setImageResource(R.drawable.ic_status_error)
                    ImageViewCompat.setImageTintList(statusView, ColorStateList.valueOf(ContextCompat.getColor(context, R.color.statusError)))
                }
            }
            statusView.setOnClickListener {
                FileStatusPopup(context, dirResult.fileResults).showAt(statusView)
            }
        }
    }
}