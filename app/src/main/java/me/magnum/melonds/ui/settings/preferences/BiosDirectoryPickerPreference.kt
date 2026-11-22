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
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
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
    private var ioScope: CoroutineScope? = null
    private var validationJob: Job? = null
    private var attachJob: Job? = null

    private fun ensureScope(): CoroutineScope {
        return ioScope ?: CoroutineScope(SupervisorJob() + Dispatchers.Main.immediate).also { ioScope = it }
    }

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
        if (consoleType != null) {
            validateDirectory(getPersistedStringSet(emptySet()).firstOrNull()?.toUri())
        }
    }

    private fun validateDirectory(uri: Uri?) {
        if (!isEnabled) {
            validationJob?.cancel()
            imageViewStatus?.isGone = true
            buttonResetDefault?.isGone = true
            return
        }

        imageViewStatus?.isGone = false
        buttonResetDefault?.isGone = false

        val validator = biosDirectoryValidator ?: return
        val type = consoleType ?: return
        validationJob?.cancel()
        validationJob = ensureScope().launch {
            val result = withContext(Dispatchers.IO) {
                runCatching { validator.getBiosDirectoryValidationResult(type, uri) }.getOrNull()
            }
            if (result != null) {
                currentValidationResult = result
                updateStatusView()
            }
        }
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
        val type = consoleType
        attachJob?.cancel()
        attachJob = ensureScope().launch {
            val resolved = withContext(Dispatchers.IO) {
                val subFolder = if (type == ConsoleType.DSi) "bios/dsi" else "bios/ds"
                val baseDir = android.os.Environment.getExternalStorageDirectory().resolve("STORM DS")
                val defaultDir = java.io.File(baseDir, subFolder)
                if (persisted == null || persisted.contains("data/user/0") || persisted.contains("files/bios")) {
                    defaultDir.mkdirs()
                    Triple(Uri.fromFile(defaultDir), defaultDir.absolutePath, true)
                } else {
                    val uri = persisted.toUri()
                    val rawPath = me.magnum.melonds.utils.FileUtils.getAbsolutePathFromSAFUri(context, uri) ?: uri.path ?: persisted
                    Triple(uri, Uri.decode(rawPath), false)
                }
            }
            val (targetUri, resolvedSummary, shouldPersist) = resolved
            if (shouldPersist) {
                persistStringSet(setOf(targetUri.toString()))
            }
            summary = resolvedSummary
            validateDirectory(targetUri)
        }
    }

    override fun onDetached() {
        validationJob?.cancel()
        attachJob?.cancel()
        ioScope?.cancel()
        ioScope = null
        super.onDetached()
    }

    override fun onBindViewHolder(holder: PreferenceViewHolder) {
        super.onBindViewHolder(holder)

        imageViewStatus = holder.findViewById(R.id.imageViewStatus) as? ImageView
        buttonResetDefault = holder.findViewById(R.id.buttonResetDefault) as? ImageView

        buttonResetDefault?.setOnClickListener {
            val type = consoleType
            ensureScope().launch {
                val (defaultDir, defaultUri) = withContext(Dispatchers.IO) {
                    val subFolder = if (type == ConsoleType.DSi) "bios/dsi" else "bios/ds"
                    val baseDir = android.os.Environment.getExternalStorageDirectory().resolve("STORM DS")
                    val dir = java.io.File(baseDir, subFolder).apply { mkdirs() }
                    dir to Uri.fromFile(dir)
                }
                onDirectoryPicked(defaultUri)
                summary = defaultDir.absolutePath
                validateDirectory(defaultUri)
                android.widget.Toast.makeText(context, "${context.getString(R.string.reset_to_default)}: ${defaultDir.absolutePath}", android.widget.Toast.LENGTH_SHORT).show()
            }
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