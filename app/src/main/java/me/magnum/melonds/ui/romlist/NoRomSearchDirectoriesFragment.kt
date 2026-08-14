package me.magnum.melonds.ui.romlist

import android.content.Intent
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FolderOpen
import androidx.compose.material.icons.filled.Tune
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import dagger.hilt.android.AndroidEntryPoint
import me.magnum.melonds.R
import me.magnum.melonds.common.Permission
import me.magnum.melonds.common.contracts.DirectoryPickerContract
import me.magnum.melonds.ui.common.WatermelonMark
import me.magnum.melonds.ui.theme.Manrope
import me.magnum.melonds.ui.theme.MelonTheme
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.watermelon

@AndroidEntryPoint
class NoRomSearchDirectoriesFragment : Fragment() {
    companion object {
        fun newInstance(): NoRomSearchDirectoriesFragment {
            return NoRomSearchDirectoriesFragment()
        }

        private val DOCUMENT_PICKER_PACKAGES = listOf(
            "com.google.android.documentsui",
            "com.android.documentsui",
        )
    }

    private val romListViewModel: RomListViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val packageManager = requireActivity().packageManager
        val directoryPickerContract = DirectoryPickerContract(Permission.READ_WRITE)
        val directoryPickerIntent = directoryPickerContract.createIntent(requireContext(), null)
        val directoryPickerComponent = packageManager.resolveActivity(directoryPickerIntent, PackageManager.MATCH_DEFAULT_ONLY)

        val disabledFilePicker = if (directoryPickerComponent == null) findDisabledFilePicker() else null
        val pickerNotFound = directoryPickerComponent == null && disabledFilePicker == null
        val isPickerDisabled = disabledFilePicker != null

        val romPickerLauncher = registerForActivityResult(directoryPickerContract) { uri ->
            if (uri != null) {
                romListViewModel.addRomSearchDirectory(uri)
            }
        }

        return ComposeView(requireContext()).apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                MelonTheme {
                    NoDirectoriesScreen(
                        isPickerDisabled = isPickerDisabled,
                        pickerNotFound = pickerNotFound,
                        onOpenSettings = { (activity as? RomListActivity)?.openSettings() },
                        onActionClick = {
                            if (isPickerDisabled && disabledFilePicker != null) {
                                val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
                                    data = Uri.fromParts("package", disabledFilePicker.packageName, null)
                                }
                                startActivity(intent)
                            } else if (!pickerNotFound) {
                                romPickerLauncher.launch(null)
                            }
                        },
                    )
                }
            }
        }
    }

    private fun findDisabledFilePicker(): ApplicationInfo? {
        DOCUMENT_PICKER_PACKAGES.forEach {
            try {
                val appInfo = requireActivity().packageManager.getApplicationInfo(it, 0)
                if (!appInfo.enabled) {
                    return appInfo
                }
            } catch (e: PackageManager.NameNotFoundException) {
                // Ignore
            }
        }
        return null
    }
}

@Composable
private fun NoDirectoriesScreen(
    isPickerDisabled: Boolean,
    pickerNotFound: Boolean,
    onOpenSettings: () -> Unit,
    onActionClick: () -> Unit,
) {
    val colors = watermelon

    Surface(color = colors.bg, modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize().systemBarsPadding()) {
            // Unified Top Header identical to RomBrowserScreen
            Column(modifier = Modifier.fillMaxWidth()) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(52.dp)
                        .padding(horizontal = 14.dp),
                ) {
                    WatermelonMark(height = 24.dp)
                    Spacer(Modifier.width(9.dp))
                    Row(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "STORM ",
                            color = colors.text,
                            fontFamily = SpaceGrotesk,
                            fontSize = 21.sp,
                            fontWeight = FontWeight.Bold,
                            letterSpacing = (-0.3).sp,
                        )
                        Text(
                            text = "DS",
                            color = Color(0xFF00E5FF),
                            fontFamily = SpaceGrotesk,
                            fontSize = 21.sp,
                            fontWeight = FontWeight.Bold,
                            letterSpacing = (-0.3).sp,
                        )
                    }
                    IconButton(onClick = onOpenSettings, modifier = Modifier.size(42.dp)) {
                        Icon(
                            Icons.Filled.Tune,
                            contentDescription = stringResource(R.string.settings),
                            tint = colors.text2,
                            modifier = Modifier.size(22.dp),
                        )
                    }
                }
                Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))
            }

            // Center Content
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(horizontal = 32.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                WatermelonMark(height = 76.dp)

                Spacer(Modifier.height(24.dp))

                Text(
                    text = if (pickerNotFound) {
                        stringResource(R.string.system_file_picker_not_found)
                    } else if (isPickerDisabled) {
                        stringResource(R.string.system_file_picker_not_enabled)
                    } else {
                        stringResource(R.string.no_rom_search_directory_specified)
                    },
                    color = colors.text2,
                    fontSize = 15.sp,
                    fontFamily = Manrope,
                    lineHeight = 22.sp,
                    textAlign = TextAlign.Center,
                )

                if (!pickerNotFound) {
                    Spacer(Modifier.height(28.dp))

                    Button(
                        onClick = onActionClick,
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color(0xFF00E5FF),
                            contentColor = Color.Black,
                        ),
                        modifier = Modifier.height(48.dp),
                    ) {
                        Icon(
                            Icons.Filled.FolderOpen,
                            contentDescription = null,
                            modifier = Modifier.size(20.dp),
                            tint = Color.Black,
                        )
                        Spacer(Modifier.width(8.dp))
                        Text(
                            text = if (isPickerDisabled) {
                                stringResource(R.string.file_picker_settings)
                            } else {
                                stringResource(R.string.set_rom_directory)
                            },
                            fontFamily = SpaceGrotesk,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.5.sp,
                        )
                    }
                }
            }
        }
    }
}