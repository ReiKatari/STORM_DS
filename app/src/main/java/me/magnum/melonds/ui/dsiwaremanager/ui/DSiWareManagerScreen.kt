package me.magnum.melonds.ui.dsiwaremanager.ui

import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.exclude
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.InsertDriveFile
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import me.magnum.melonds.domain.model.RomIconFiltering
import me.magnum.melonds.domain.model.rom.Rom
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.core.graphics.createBitmap
import androidx.core.graphics.set
import kotlinx.coroutines.flow.collectLatest
import me.magnum.melonds.R
import me.magnum.melonds.common.Permission
import me.magnum.melonds.common.contracts.FilePickerContract
import me.magnum.melonds.domain.model.ConfigurationDirResult
import me.magnum.melonds.domain.model.DSiWareTitle
import me.magnum.melonds.domain.model.dsinand.DSiWareTitleFileType
import me.magnum.melonds.domain.model.dsinand.ImportDSiWareTitleResult
import me.magnum.melonds.ui.common.FabActionItem
import me.magnum.melonds.ui.common.MultiActionFloatingActionButton
import me.magnum.melonds.ui.common.melonButtonColors
import me.magnum.melonds.ui.dsiwaremanager.DSiWareManagerViewModel
import me.magnum.melonds.ui.dsiwaremanager.model.DSiWareManagerUiState
import me.magnum.melonds.ui.dsiwaremanager.model.ImportExportDSiWareTitleFileEvent
import me.magnum.melonds.ui.common.component.dialog.TextInputDialog
import me.magnum.melonds.ui.common.component.dialog.rememberTextInputDialogState
import me.magnum.melonds.ui.common.WatermelonScreenScaffold
import me.magnum.melonds.ui.romlist.RomIcon
import me.magnum.melonds.ui.settings.SettingsActivity
import me.magnum.melonds.ui.theme.MelonTheme
import me.magnum.melonds.ui.theme.watermelon

private const val FAB_ITEM_FROM_FILE = 1
private const val FAB_ITEM_FROM_ROM_LIST = 2

@Composable
fun DSiWareManagerScreen(
    viewModel: DSiWareManagerViewModel,
    onBackClick: () -> Unit,
) {
    val state by viewModel.state.collectAsState()
    val importingTitle = viewModel.importingTitle.collectAsState(false)
    val context = LocalContext.current
    val showingRomList = rememberSaveable(null) { mutableStateOf(false) }
    val renameDialogState = rememberTextInputDialogState()

    val importTitleFilePickLauncher = rememberDSiWareTitleImportFilePicker(
        onFilePicked = viewModel::importDSiWareTitleFile,
    )
    val exportTitleFilePickLauncher = rememberDSiWareTitleExportFilePicker(
        onFilePicked = viewModel::exportDSiWareTitleFile,
    )

    val importTitleLauncher = rememberLauncherForActivityResult(FilePickerContract(Permission.READ)) {
        if (it != null) {
            viewModel.importTitleToNand(it)
        }
    }

    val currentState = state
    var showImportMenu by remember { mutableStateOf(false) }
    var enhancedRomToDelete by remember { mutableStateOf<Rom?>(null) }
    WatermelonScreenScaffold(
        title = stringResource(R.string.dsiware_manager),
        onBack = onBackClick,
        actions = {
            if (currentState is DSiWareManagerUiState.Ready) {
                Box(
                    modifier = Modifier
                        .size(38.dp)
                        .clip(CircleShape)
                        .clickable { showImportMenu = true },
                    contentAlignment = Alignment.Center,
                ) {
                    Icon(
                        painter = rememberVectorPainter(Icons.Default.Add),
                        contentDescription = stringResource(R.string.import_dsiware_title),
                        tint = watermelon.text,
                        modifier = Modifier.size(24.dp),
                    )
                }
            }
        },
    ) { padding ->
        when (currentState) {
            is DSiWareManagerUiState.DSiSetupInvalid -> {
                InvalidSetup(
                    modifier = Modifier.padding(padding).consumeWindowInsets(padding).fillMaxSize(),
                    configurationStatus = currentState.status,
                    onBiosConfigurationFinished = viewModel::revalidateBiosConfiguration,
                )
            }
            is DSiWareManagerUiState.Loading -> Loading(Modifier.padding(padding).consumeWindowInsets(padding).fillMaxSize())
            is DSiWareManagerUiState.Ready -> {
                Ready(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = padding,
                    titles = currentState.titles,
                    dsiEnhancedRoms = currentState.dsiEnhancedRoms,
                    onRenameTitle = { title ->
                        renameDialogState.show(
                            initialText = title.name,
                            onConfirm = { newName ->
                                viewModel.renameTitle(title, newName)
                            },
                        )
                    },
                    onDeleteTitle = viewModel::deleteTitle,
                    onImportTitleFile = importTitleFilePickLauncher::launch,
                    onExportTitleFile = exportTitleFilePickLauncher::launch,
                    retrieveTitleIcon = viewModel::getTitleIcon,
                    onRenameEnhancedRom = { rom ->
                        renameDialogState.show(
                            initialText = rom.fileName.substringBeforeLast('.'),
                            onConfirm = { newName ->
                                viewModel.renameEnhancedRomFile(rom, newName)
                            },
                        )
                    },
                    onDeleteEnhancedRom = { rom ->
                        enhancedRomToDelete = rom
                    },
                    retrieveRomIcon = viewModel::getRomIcon,
                )
            }
            is DSiWareManagerUiState.Error -> Error(Modifier.padding(padding).consumeWindowInsets(padding).fillMaxSize())
        }
    }

    if (enhancedRomToDelete != null) {
        val rom = enhancedRomToDelete!!
        androidx.compose.material.AlertDialog(
            onDismissRequest = { enhancedRomToDelete = null },
            title = {
                Text(
                    text = "Удалить файл игры?",
                    color = watermelon.text,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                )
            },
            text = {
                Text(
                    text = "Файл «${rom.fileName}» будет безвозвратно удален из хранилища устройства.",
                    color = watermelon.text2,
                    fontSize = 13.5.sp,
                )
            },
            confirmButton = {
                androidx.compose.material.TextButton(
                    onClick = {
                        viewModel.deleteEnhancedRomFile(rom)
                        enhancedRomToDelete = null
                    }
                ) {
                    Text("Удалить", color = watermelon.red, fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                androidx.compose.material.TextButton(
                    onClick = { enhancedRomToDelete = null }
                ) {
                    Text("Отмена", color = watermelon.text2)
                }
            },
            backgroundColor = watermelon.surface,
            contentColor = watermelon.text,
        )
    }

    TextInputDialog(
        title = stringResource(R.string.dsiware_manager_rename),
        dialogState = renameDialogState,
    )

    if (showImportMenu) {
        ConsoleActionDialog(
            title = stringResource(R.string.import_dsiware_title),
            onDismiss = { showImportMenu = false },
        ) {
            ConsoleActionRow(label = stringResource(R.string.dsiware_import_from_file)) {
                showImportMenu = false
                importTitleLauncher.launch(null to arrayOf("*/*"))
            }
            ConsoleActionRow(label = stringResource(R.string.dsiware_import_from_rom_list)) {
                showImportMenu = false
                showingRomList.value = true
            }
        }
    }

    if (showingRomList.value) {
        DSiWareRomListDialog(
            onDismiss = { showingRomList.value = false },
            onRomSelected = {
                viewModel.importTitleToNand(it.uri)
                showingRomList.value = false
            },
        )
    }

    if (importingTitle.value) {
        Dialog(
            properties = DialogProperties(dismissOnBackPress = false, dismissOnClickOutside = false),
            onDismissRequest = { },
        ) {
            CircularProgressIndicator(color = watermelon.red)
        }
    }

    LaunchedEffect(null) {
        viewModel.importTitleError.collectLatest {
            Toast.makeText(context, getImportTitleResultMessage(context, it), Toast.LENGTH_LONG).show()
        }
    }

    LaunchedEffect(null) {
        viewModel.importExportFileEvent.collectLatest {
            Toast.makeText(context, getImportExportFileErrorMessage(context, it), Toast.LENGTH_SHORT).show()
        }
    }
}

@Composable
private fun InvalidSetup(modifier: Modifier, configurationStatus: ConfigurationDirResult.Status, onBiosConfigurationFinished: () -> Unit) {
    val context = LocalContext.current
    
    val biosSetupLauncher = rememberLauncherForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        onBiosConfigurationFinished()
    }

    Column(modifier.padding(24.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        when (configurationStatus) {
            ConfigurationDirResult.Status.UNSET -> {
                Text(
                    text = stringResource(R.string.dsiware_manager_no_dsi_setup),
                    textAlign = TextAlign.Center,
                )
                Spacer(Modifier.height(8.dp))
                Button(
                    onClick = {
                        val intent = Intent(context, SettingsActivity::class.java).apply {
                            putExtra(SettingsActivity.KEY_ENTRY_POINT, SettingsActivity.CUSTOM_FIRMWARE_ENTRY_POINT)
                        }
                        biosSetupLauncher.launch(intent)
                    },
                    colors = melonButtonColors(),
                ) {
                    Text(text = stringResource(R.string.dsiware_manager_setup).uppercase())
                }
            }
            ConfigurationDirResult.Status.INVALID -> {
                Text(
                    text = stringResource(R.string.dsiware_manager_invalid_dsi_setup),
                    textAlign = TextAlign.Center,
                )
                Spacer(Modifier.height(8.dp))
                Button(
                    onClick = {
                        val intent = Intent(context, SettingsActivity::class.java).apply {
                            putExtra(SettingsActivity.KEY_ENTRY_POINT, SettingsActivity.CUSTOM_FIRMWARE_ENTRY_POINT)
                        }
                        biosSetupLauncher.launch(intent)
                    },
                    colors = melonButtonColors(),
                ) {
                    Text(text = stringResource(R.string.dsiware_manager_fix_setup).uppercase())
                }
            }
            ConfigurationDirResult.Status.VALID -> {
            }
        }
    }
}

@Composable
private fun Loading(modifier: Modifier) {
    Box(modifier) {
        CircularProgressIndicator(
            modifier = Modifier.align(Alignment.Center),
            color = watermelon.red,
        )
    }
}

@Composable
private fun Ready(
    modifier: Modifier,
    contentPadding: PaddingValues,
    titles: List<DSiWareTitle>,
    dsiEnhancedRoms: List<me.magnum.melonds.domain.model.rom.Rom>,
    onRenameTitle: (DSiWareTitle) -> Unit,
    onDeleteTitle: (DSiWareTitle) -> Unit,
    onImportTitleFile: (DSiWareTitle, DSiWareTitleFileType) -> Unit,
    onExportTitleFile: (DSiWareTitle, DSiWareTitleFileType) -> Unit,
    retrieveTitleIcon: (DSiWareTitle) -> RomIcon,
    onRenameEnhancedRom: (me.magnum.melonds.domain.model.rom.Rom) -> Unit,
    onDeleteEnhancedRom: (me.magnum.melonds.domain.model.rom.Rom) -> Unit,
    retrieveRomIcon: suspend (me.magnum.melonds.domain.model.rom.Rom) -> RomIcon,
) {
    val colors = watermelon
    Box(modifier = modifier) {
        if (titles.isEmpty() && dsiEnhancedRoms.isEmpty()) {
            Text(
                modifier = Modifier
                    .padding(contentPadding)
                    .consumeWindowInsets(contentPadding)
                    .align(Alignment.Center)
                    .padding(24.dp),
                text = stringResource(R.string.no_dsiware_titles_installed),
                color = colors.text3,
            )
        } else {
            DSiWareTitleList(
                modifier = Modifier.fillMaxSize(),
                contentPadding = contentPadding,
                titles = titles,
                dsiEnhancedRoms = dsiEnhancedRoms,
                onRenameTitle = onRenameTitle,
                onDeleteTitle = onDeleteTitle,
                onImportTitleFile = onImportTitleFile,
                onExportTitleFile = onExportTitleFile,
                retrieveTitleIcon = retrieveTitleIcon,
                onRenameEnhancedRom = onRenameEnhancedRom,
                onDeleteEnhancedRom = onDeleteEnhancedRom,
                retrieveRomIcon = retrieveRomIcon,
            )
        }
    }
}

@Composable
private fun Error(modifier: Modifier) {
    val colors = watermelon
    Box(
        modifier = modifier.padding(24.dp),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = stringResource(R.string.dsiware_manager_load_error),
            textAlign = TextAlign.Center,
            color = colors.red,
        )
    }
}

@Composable
private fun DSiWareTitleList(
    modifier: Modifier,
    contentPadding: PaddingValues,
    titles: List<DSiWareTitle>,
    dsiEnhancedRoms: List<me.magnum.melonds.domain.model.rom.Rom>,
    onRenameTitle: (DSiWareTitle) -> Unit,
    onDeleteTitle: (DSiWareTitle) -> Unit,
    onImportTitleFile: (DSiWareTitle, DSiWareTitleFileType) -> Unit,
    onExportTitleFile: (DSiWareTitle, DSiWareTitleFileType) -> Unit,
    retrieveTitleIcon: (DSiWareTitle) -> RomIcon,
    onRenameEnhancedRom: (me.magnum.melonds.domain.model.rom.Rom) -> Unit,
    onDeleteEnhancedRom: (me.magnum.melonds.domain.model.rom.Rom) -> Unit,
    retrieveRomIcon: suspend (me.magnum.melonds.domain.model.rom.Rom) -> RomIcon,
) {
    val colors = watermelon
    LazyColumn(
        modifier = modifier.consumeWindowInsets(contentPadding),
        contentPadding = PaddingValues(
            start = contentPadding.calculateStartPadding(LocalLayoutDirection.current),
            top = contentPadding.calculateTopPadding(),
            end = contentPadding.calculateEndPadding(LocalLayoutDirection.current),
            bottom = contentPadding.calculateBottomPadding() + 16.dp + 56.dp + 16.dp,
        ),
    ) {
        if (titles.isNotEmpty()) {
            item(key = "header_dsiware") {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(4.dp))
                            .background(androidx.compose.ui.graphics.Color(0xFF6200EA).copy(alpha = 0.25f))
                            .padding(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Text(
                            text = "DSiWare",
                            color = androidx.compose.ui.graphics.Color(0xFFD1C4E9),
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = me.magnum.melonds.ui.theme.WatermelonMono,
                        )
                    }
                    Spacer(Modifier.width(8.dp))
                    Text(
                        text = "Системная память NAND (${titles.size})",
                        color = colors.text2,
                        fontSize = 12.5.sp,
                        fontWeight = FontWeight.Medium,
                    )
                }
            }
            items(
                items = titles,
                key = { it.titleId },
            ) { dSiWareTitle ->
                DSiWareItem(
                    modifier = Modifier.fillMaxWidth(),
                    item = dSiWareTitle,
                    onRenameClicked = { onRenameTitle(dSiWareTitle) },
                    onDeleteClicked = { onDeleteTitle(dSiWareTitle) },
                    onImportFile = { onImportTitleFile(dSiWareTitle, it) },
                    onExportFile = { onExportTitleFile(dSiWareTitle, it) },
                    retrieveTitleIcon = { retrieveTitleIcon(dSiWareTitle) },
                )
            }
        }

        if (dsiEnhancedRoms.isNotEmpty()) {
            item(key = "header_dsi_enhanced") {
                Spacer(Modifier.height(14.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(4.dp))
                            .background(androidx.compose.ui.graphics.Color(0xFF00695C).copy(alpha = 0.25f))
                            .padding(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Text(
                            text = "DSi E.",
                            color = androidx.compose.ui.graphics.Color(0xFF80CBC4),
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = me.magnum.melonds.ui.theme.WatermelonMono,
                        )
                    }
                    Spacer(Modifier.width(8.dp))
                    Text(
                        text = "Картриджи с DSi-улучшениями (${dsiEnhancedRoms.size})",
                        color = colors.text2,
                        fontSize = 12.5.sp,
                        fontWeight = FontWeight.Medium,
                    )
                }
            }
            items(
                items = dsiEnhancedRoms,
                key = { it.uri.toString() },
            ) { rom ->
                DSiEnhancedItem(
                    modifier = Modifier.fillMaxWidth(),
                    rom = rom,
                    onRename = { onRenameEnhancedRom(rom) },
                    onDelete = { onDeleteEnhancedRom(rom) },
                    retrieveRomIcon = retrieveRomIcon,
                )
            }
        }
    }
}

@Composable
private fun DSiEnhancedItem(
    modifier: Modifier = Modifier,
    rom: Rom,
    onRename: () -> Unit,
    onDelete: () -> Unit,
    retrieveRomIcon: suspend (Rom) -> RomIcon,
) {
    val colors = watermelon
    var menuOpen by remember { mutableStateOf(false) }
    var infoOpen by remember { mutableStateOf(false) }
    val romIcon by produceState<RomIcon?>(initialValue = null, key1 = rom.uri) {
        value = retrieveRomIcon(rom)
    }

    Row(
        modifier = modifier
            .padding(horizontal = 12.dp, vertical = 4.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(colors.surface)
            .border(1.dp, colors.line, RoundedCornerShape(10.dp))
            .padding(start = 10.dp, end = 6.dp, top = 9.dp, bottom = 9.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier
                .size(46.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(colors.surface2),
        ) {
            if (romIcon?.bitmap != null) {
                Image(
                    modifier = Modifier.fillMaxSize(),
                    bitmap = romIcon!!.bitmap!!.asImageBitmap(),
                    contentDescription = null,
                    filterQuality = when (romIcon!!.filtering) {
                        RomIconFiltering.NONE -> FilterQuality.None
                        RomIconFiltering.LINEAR -> DrawScope.DefaultFilterQuality
                    },
                )
            } else {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center,
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.InsertDriveFile,
                        contentDescription = null,
                        tint = colors.text3,
                        modifier = Modifier.size(24.dp),
                    )
                }
            }
        }

        Spacer(Modifier.width(12.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = rom.name.ifBlank { rom.fileName.substringBeforeLast('.') },
                color = colors.text,
                fontSize = 14.sp,
                lineHeight = 18.sp,
                fontWeight = FontWeight.SemiBold,
                softWrap = true,
            )
            if (rom.developerName.isNotBlank()) {
                Spacer(Modifier.height(2.dp))
                Text(
                    text = rom.developerName,
                    color = colors.text3,
                    fontFamily = me.magnum.melonds.ui.theme.WatermelonMono,
                    fontSize = 11.sp,
                    lineHeight = 14.sp,
                    softWrap = true,
                )
            }
            Spacer(Modifier.height(6.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp),
            ) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(4.dp))
                        .background(androidx.compose.ui.graphics.Color(0xFF00695C).copy(alpha = 0.2f))
                        .padding(horizontal = 5.dp, vertical = 1.5.dp)
                ) {
                    Text("⚡ 133 MHz", color = androidx.compose.ui.graphics.Color(0xFF80CBC4), fontSize = 9.5.sp, fontWeight = FontWeight.Medium)
                }
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(4.dp))
                        .background(androidx.compose.ui.graphics.Color(0xFF00695C).copy(alpha = 0.2f))
                        .padding(horizontal = 5.dp, vertical = 1.5.dp)
                ) {
                    Text("💾 16 MB RAM", color = androidx.compose.ui.graphics.Color(0xFF80CBC4), fontSize = 9.5.sp, fontWeight = FontWeight.Medium)
                }
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(4.dp))
                        .background(androidx.compose.ui.graphics.Color(0xFF00695C).copy(alpha = 0.2f))
                        .padding(horizontal = 5.dp, vertical = 1.5.dp)
                ) {
                    Text("📷 DSi Camera / Wi-Fi", color = androidx.compose.ui.graphics.Color(0xFF80CBC4), fontSize = 9.5.sp, fontWeight = FontWeight.Medium)
                }
            }
        }

        Box(
            modifier = Modifier
                .size(38.dp)
                .clip(CircleShape)
                .clickable { menuOpen = true },
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                modifier = Modifier.size(22.dp),
                painter = painterResource(id = R.drawable.ic_menu),
                contentDescription = null,
                tint = colors.text3,
            )
        }
    }

    if (menuOpen) {
        ConsoleActionDialog(
            title = rom.fileName.substringBeforeLast('.'),
            onDismiss = { menuOpen = false },
        ) {
            ConsoleActionRow(
                label = stringResource(id = R.string.dsiware_manager_rename),
                onClick = {
                    menuOpen = false
                    onRename()
                },
            )
            ConsoleActionRow(
                label = "Особенности DSi Enhanced версии",
                onClick = {
                    menuOpen = false
                    infoOpen = true
                },
            )
            ConsoleActionRow(
                label = stringResource(id = R.string.delete),
                onClick = {
                    menuOpen = false
                    onDelete()
                },
            )
        }
    }

    if (infoOpen) {
        ConsoleActionDialog(
            title = "Особенности DSi Enhanced",
            onDismiss = { infoOpen = false },
        ) {
            Column(
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 12.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                Text(
                    text = rom.name.ifBlank { rom.fileName.substringBeforeLast('.') },
                    color = colors.text,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "Картридж стандарта Nintendo DS со встроенными аппаратно-программными расширениями DSi:",
                    color = colors.text2,
                    fontSize = 12.5.sp,
                )
                Spacer(Modifier.height(4.dp))
                Text("• 🚀 ARM9i CPU на удвоенной частоте 133.79 МГц (вместо 67 МГц DS)", color = colors.text, fontSize = 12.sp)
                Text("• 💾 16 МБ системной памяти RAM (в 4 раза больше памяти)", color = colors.text, fontSize = 12.sp)
                Text("• 📷 Доступ к камерам DSi для интерактивного геймплея", color = colors.text, fontSize = 12.sp)
                Text("• 📶 Поддержка защищенных сетей WPA / WPA2", color = colors.text, fontSize = 12.sp)
            }
            ConsoleActionRow(
                label = "Закрыть",
                onClick = { infoOpen = false },
            )
        }
    }
}

private fun getImportTitleResultMessage(context: Context, result: ImportDSiWareTitleResult): String {
    return when (result) {
        ImportDSiWareTitleResult.SUCCESS -> ""
        ImportDSiWareTitleResult.NAND_NOT_OPEN -> context.getString(R.string.dsiware_manager_import_title_error_open_nand_failed)
        ImportDSiWareTitleResult.ERROR_OPENING_FILE -> context.getString(R.string.dsiware_manager_import_title_error_open_file_failed)
        ImportDSiWareTitleResult.NOT_DSIWARE_TITLE -> context.getString(R.string.dsiware_manager_import_title_error_not_dsiware_title)
        ImportDSiWareTitleResult.TITLE_ALREADY_IMPORTED -> context.getString(R.string.dsiware_manager_import_title_error_title_already_imported)
        ImportDSiWareTitleResult.TITLE_LIMIT_REACHED -> context.getString(R.string.dsiware_manager_import_title_error_title_limit_reached)
        ImportDSiWareTitleResult.DSI_MEMORY_FULL -> context.getString(R.string.dsiware_manager_import_title_error_dsi_memory_full)
        ImportDSiWareTitleResult.INSATLL_FAILED -> context.getString(R.string.dsiware_manager_import_title_error_insatll_failed)
        ImportDSiWareTitleResult.METADATA_FETCH_FAILED -> context.getString(R.string.dsiware_manager_import_title_error_metadat_fetch_failed)
        ImportDSiWareTitleResult.UNKNOWN -> context.getString(R.string.dsiware_manager_import_title_error_unknown)
    }
}

private fun getImportExportFileErrorMessage(context: Context, result: ImportExportDSiWareTitleFileEvent): String {
    return when (result) {
        is ImportExportDSiWareTitleFileEvent.ImportSuccess -> context.getString(R.string.dsiware_manager_import_file_success, result.fileName)
        is ImportExportDSiWareTitleFileEvent.ImportError -> context.getString(R.string.dsiware_manager_import_file_error)
        is ImportExportDSiWareTitleFileEvent.ExportSuccess -> context.getString(R.string.dsiware_manager_export_file_success, result.fileName)
        is ImportExportDSiWareTitleFileEvent.ExportError -> context.getString(R.string.dsiware_manager_export_file_error)
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewDSiWareManagerReady() {
    val bitmap = createBitmap(1, 1).apply { this[0, 0] = 0xFF777777.toInt() }

    MelonTheme {
        Ready(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(0.dp),
            titles = listOf(
                DSiWareTitle("Legit Game", "Notendo", 0, ByteArray(0), 0, 0, 0),
                DSiWareTitle("Legit Game: Snapped!", "Upasuft", 1, ByteArray(0), 0, 0, 0),
                DSiWareTitle("Highway 4 - Mediocre Racing", "Microware", 2, ByteArray(0), 0, 0, 0),
            ),
            dsiEnhancedRoms = emptyList(),
            onRenameTitle = {},
            onDeleteTitle = {},
            onImportTitleFile = { _, _ -> },
            onExportTitleFile = { _, _ -> },
            retrieveTitleIcon = { RomIcon(bitmap, RomIconFiltering.NONE) },
            onRenameEnhancedRom = {},
            onDeleteEnhancedRom = {},
            retrieveRomIcon = { RomIcon(bitmap, RomIconFiltering.NONE) },
        )
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewDSiWareManagerInvalidSetup() {
    MelonTheme {
        InvalidSetup(
            modifier = Modifier.fillMaxSize(),
            configurationStatus = ConfigurationDirResult.Status.INVALID,
            onBiosConfigurationFinished = {},
        )
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewDSiWareManagerError() {
    MelonTheme {
        Error(Modifier.fillMaxSize())
    }
}
