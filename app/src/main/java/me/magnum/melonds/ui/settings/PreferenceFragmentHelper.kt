package me.magnum.melonds.ui.settings

import android.content.Context
import android.net.Uri
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.appcompat.app.AlertDialog
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DeleteOutline
import androidx.compose.material.icons.filled.Folder
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.documentfile.provider.DocumentFile
import androidx.preference.ListPreference
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.PreferenceManager
import com.smp.masterswitchpreference.MasterSwitchPreference
import me.magnum.melonds.R
import me.magnum.melonds.common.DirectoryAccessValidator
import me.magnum.melonds.common.UriPermissionManager
import me.magnum.melonds.common.contracts.DirectoryPickerContract
import me.magnum.melonds.common.contracts.FilePickerContract
import me.magnum.melonds.extensions.addOnPreferenceChangeListener
import me.magnum.melonds.ui.settings.dialogs.SettingsDialogScaffold
import me.magnum.melonds.ui.settings.dialogs.showSettingsComposeDialog
import me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference
import me.magnum.melonds.ui.settings.preferences.MacAddressPreference
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference
import me.magnum.melonds.ui.theme.LocalWatermelonColors
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.utils.FileUtils

class PreferenceFragmentHelper(
    private val fragment: PreferenceFragmentCompat,
    private val uriPermissionManager: UriPermissionManager,
    private val directoryAccessValidator: DirectoryAccessValidator
) {

    companion object {
        private val sBindPreferenceSummaryToValueListener = Preference.OnPreferenceChangeListener { preference, value ->
            when (preference) {
                is ListPreference -> {
                    val chosenValue = (value as? String) ?: preference.value
                    val index = chosenValue
                        ?.let { preference.findIndexOfValue(it) }
                        ?: -1

                    val summary = if (index >= 0)
                        preference.entries[index]
                    else
                        preference.context.getString(R.string.not_set)
                    preference.setSummary(summary)
                }
                is StoragePickerPreference -> {
                    if (value == null || value !is Set<*> || value.isEmpty())
                        preference.summary = preference.getContext().getString(R.string.not_set)
                    else {
                        val uris = value.mapNotNull {
                            val uri = (it as String).toUri()
                            val rawPath = FileUtils.getAbsolutePathFromSAFUri(preference.context, uri) ?: uri.path ?: it
                            android.net.Uri.decode(rawPath)
                        }
                        preference.summary = uris.joinToString("\n").ifBlank { preference.context.getString(R.string.not_set) }
                    }
                }
                is FirmwareBirthdayPreference -> {
                    val birthdayString = (value as String?) ?: "01/01"
                    preference.summary = birthdayString
                }
                is MasterSwitchPreference -> {
                    val isOn = (value as Boolean)
                    preference.summary = if (isOn) preference.context.getString(R.string.on) else preference.context.getString(R.string.off)
                }
                is MacAddressPreference -> {
                    val addressString = value as String?
                    preference.summary = addressString ?: preference.context.getString(R.string.not_set)
                }
                else -> {
                    preference.summary = value?.toString() ?: preference.context.getString(R.string.not_set)
                }
            }
            true
        }
    }

    fun bindPreferenceSummaryToValue(preference: Preference?) {
        if (preference == null)
            return

        preference.addOnPreferenceChangeListener(sBindPreferenceSummaryToValueListener)

        val initialValue: Any? = when (preference) {
            is StoragePickerPreference -> PreferenceManager.getDefaultSharedPreferences(preference.context).getStringSet(preference.key, null)
            is MasterSwitchPreference -> PreferenceManager.getDefaultSharedPreferences(preference.context).getBoolean(preference.key, false)
            else -> PreferenceManager.getDefaultSharedPreferences(preference.context).getString(preference.key, null)
        }
        sBindPreferenceSummaryToValueListener.onPreferenceChange(preference, initialValue)
    }

    fun setupStoragePickerPreference(
        storagePreference: StoragePickerPreference,
        onDirectoryPicked: ((Uri, () -> Unit) -> Unit)? = null,
    ) {
        if (storagePreference.selectionType == StoragePickerPreference.SelectionType.FILE) {
            setupFilePickerPreference(storagePreference)
        } else {
            setupDirectoryPickerPreference(storagePreference, onDirectoryPicked)
        }
    }

    private fun setupDirectoryPickerPreference(
        storagePreference: StoragePickerPreference,
        onDirectoryPicked: ((Uri, () -> Unit) -> Unit)?,
    ) {
        bindPreferenceSummaryToValue(storagePreference)
        val filePickerLauncher = fragment.registerForActivityResult(DirectoryPickerContract(storagePreference.permissions), ActivityResultCallback {
            if (it == null) {
                return@ActivityResultCallback
            }

            if (directoryAccessValidator.getDirectoryAccessForPermission(it, storagePreference.permissions) == DirectoryAccessValidator.DirectoryAccessResult.OK) {
                val persistDirectory = { storagePreference.onDirectoryPicked(it) }
                if (onDirectoryPicked != null) {
                    onDirectoryPicked(it, persistDirectory)
                } else {
                    persistDirectory()
                }
            } else {
                showInvalidDirectoryAccessDialog()
            }
        })
        storagePreference.setOnPreferenceClickListener { preference ->
            val directories = preference.getPersistedStringSet(emptySet())?.toSet() ?: emptySet()
            val isMultiSelection = storagePreference.multiSelection

            if (isMultiSelection && directories.isNotEmpty()) {
                showDirectoryManagementDialog(storagePreference, directories, filePickerLauncher)
            } else {
                val initialUri = directories.firstOrNull()?.toUri()
                filePickerLauncher.launch(initialUri)
            }
            true
        }
        if (storagePreference.persistPermissions) {
            storagePreference.addOnPreferenceChangeListener { _, newValue ->
                (newValue as? Set<String>)?.forEach {
                    uriPermissionManager.persistDirectoryPermissions(it.toUri(), storagePreference.permissions)
                }
                true
            }
        }
    }

    private fun setupFilePickerPreference(storagePreference: StoragePickerPreference) {
        bindPreferenceSummaryToValue(storagePreference)
        val filePickerLauncher = fragment.registerForActivityResult(FilePickerContract(storagePreference.permissions), storagePreference::onDirectoryPicked)
        storagePreference.setOnPreferenceClickListener { preference ->
            val initialUri = preference.getPersistedStringSet(null)?.firstOrNull()?.toUri()
            filePickerLauncher.launch(Pair(initialUri, storagePreference.mimeTypes?.toTypedArray()))
            true
        }
        if (storagePreference.persistPermissions) {
            storagePreference.addOnPreferenceChangeListener { _, newValue ->
                (newValue as? Set<String>)?.firstOrNull()?.let {
                    uriPermissionManager.persistFilePermissions(it.toUri(), storagePreference.permissions)
                }
                true
            }
        }
    }

    private fun showInvalidDirectoryAccessDialog() {
        AlertDialog.Builder(fragment.requireContext())
            .setTitle(R.string.error_invalid_directory)
            .setMessage(R.string.error_invalid_directory_description)
            .setPositiveButton(R.string.ok, null)
            .setCancelable(true)
            .show()
    }

    private fun showDirectoryManagementDialog(
        storagePreference: StoragePickerPreference,
        directories: Set<String>,
        filePickerLauncher: ActivityResultLauncher<Uri?>
    ) {
        val context = fragment.requireContext()
        val directoryList = directories.toList()
        val displayNames = directoryList.map { getDirectoryDisplayName(storagePreference.context, it) }

        showSettingsComposeDialog(context) { dismiss ->
            val colors = LocalWatermelonColors.current
            SettingsDialogScaffold(
                title = stringResource(R.string.manage_rom_directories),
                subtitle = null,
                icon = Icons.Filled.Folder,
                onDismiss = dismiss,
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f, fill = false)
                        .verticalScroll(rememberScrollState())
                        .padding(horizontal = 14.dp, vertical = 12.dp),
                ) {
                    displayNames.forEachIndexed { index, name ->
                        val uriString = directoryList[index]
                        val shape = RoundedCornerShape(12.dp)
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .heightIn(min = 46.dp)
                                .clip(shape)
                                .background(colors.surface2)
                                .border(1.dp, colors.line, shape)
                                .clickable {
                                    dismiss()
                                    promptRemoveDirectory(storagePreference, uriString)
                                }
                                .padding(horizontal = 14.dp, vertical = 10.dp),
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Folder,
                                contentDescription = null,
                                tint = colors.green,
                                modifier = Modifier.size(20.dp),
                            )
                            Spacer(Modifier.width(12.dp))
                            Text(
                                text = name,
                                color = colors.text,
                                fontFamily = SpaceGrotesk,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium,
                                maxLines = 2,
                                overflow = TextOverflow.Ellipsis,
                                modifier = Modifier.weight(1f),
                            )
                            Icon(
                                imageVector = Icons.Filled.DeleteOutline,
                                contentDescription = stringResource(R.string.action_remove),
                                tint = colors.red,
                                modifier = Modifier.size(20.dp),
                            )
                        }
                    }

                    Spacer(Modifier.height(6.dp))

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(12.dp))
                            .background(colors.green)
                            .clickable {
                                dismiss()
                                val initialUri = directoryList.firstOrNull()?.toUri()
                                filePickerLauncher.launch(initialUri)
                            }
                            .padding(vertical = 12.dp),
                        contentAlignment = Alignment.Center,
                    ) {
                        Text(
                            text = stringResource(R.string.add_directory),
                            color = colors.bg,
                            fontFamily = SpaceGrotesk,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
            }
        }
    }

    private fun promptRemoveDirectory(storagePreference: StoragePickerPreference, uriString: String) {
        val context = fragment.requireContext()
        val directoryName = getDirectoryDisplayName(storagePreference.context, uriString)

        showSettingsComposeDialog(context) { dismiss ->
            val colors = LocalWatermelonColors.current
            SettingsDialogScaffold(
                title = stringResource(R.string.remove_rom_directory_title),
                subtitle = stringResource(R.string.remove_rom_directory_message, directoryName),
                icon = Icons.Filled.DeleteOutline,
                onDismiss = dismiss,
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(12.dp))
                            .background(colors.red)
                            .clickable {
                                removeDirectoryFromPreference(storagePreference, uriString)
                                dismiss()
                            }
                            .padding(vertical = 12.dp),
                        contentAlignment = Alignment.Center,
                    ) {
                        Text(
                            text = stringResource(R.string.action_remove),
                            color = colors.bg,
                            fontFamily = SpaceGrotesk,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
            }
        }
    }

    private fun removeDirectoryFromPreference(storagePreference: StoragePickerPreference, uriString: String) {
        val currentDirectories = storagePreference.getPersistedStringSet(emptySet())?.toMutableSet() ?: mutableSetOf()
        if (currentDirectories.remove(uriString)) {
            storagePreference.updatePersistedDirectories(currentDirectories)
        }
    }

    private fun getDirectoryDisplayName(context: Context, uriString: String): String {
        val uri = uriString.toUri()
        return FileUtils.getAbsolutePathFromSAFUri(context, uri)
            ?: DocumentFile.fromTreeUri(context, uri)?.name
            ?: uri.lastPathSegment
            ?: uri.toString()
    }
}