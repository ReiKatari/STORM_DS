package me.magnum.melonds.ui.romdetails.ui

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import me.magnum.melonds.R
import me.magnum.melonds.common.Permission
import me.magnum.melonds.common.contracts.FilePickerContract
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.domain.model.rom.config.RomConfig
import me.magnum.melonds.domain.model.rom.config.RomInputMode
import me.magnum.melonds.domain.model.rom.config.RuntimeConsoleType
import me.magnum.melonds.domain.model.rom.config.RuntimeMicSource
import me.magnum.melonds.ui.common.MelonPreviewSet
import me.magnum.melonds.ui.common.component.dialog.SingleChoiceDialog
import me.magnum.melonds.ui.common.component.dialog.TextInputDialog
import me.magnum.melonds.ui.common.component.dialog.rememberSingleChoiceDialogState
import me.magnum.melonds.ui.common.component.dialog.rememberTextInputDialogState
import me.magnum.melonds.ui.inputsetup.InputSetupActivity
import me.magnum.melonds.ui.layouts.LayoutSelectorActivity
import me.magnum.melonds.ui.romdetails.model.RomConfigUiModel
import me.magnum.melonds.ui.romdetails.model.RomConfigUiState
import me.magnum.melonds.ui.romdetails.model.RomConfigUpdateEvent
import me.magnum.melonds.ui.romdetails.model.RomGbaSlotConfigUiModel
import me.magnum.melonds.ui.theme.MelonTheme
import java.util.Date
import java.util.UUID

@Composable
fun RomConfigUi(
    modifier: Modifier,
    contentPadding: PaddingValues,
    rom: Rom,
    romConfigUiState: RomConfigUiState,
    onConfigUpdate: (RomConfigUpdateEvent) -> Unit,
    onCustomInputConfigEdited: () -> Unit,
) {
    when (romConfigUiState) {
        is RomConfigUiState.Loading -> Loading(modifier.padding(contentPadding))
        is RomConfigUiState.Ready -> Content(
            modifier = modifier,
            contentPadding = contentPadding,
            rom = rom,
            romConfig = romConfigUiState.romConfigUiModel,
            onConfigUpdate = onConfigUpdate,
            onCustomInputConfigEdited = onCustomInputConfigEdited,
        )
    }
}

@Composable
private fun Loading(modifier: Modifier) {
    Box(modifier) {
        CircularProgressIndicator(
            modifier = Modifier.align(Alignment.Center),
            color = MaterialTheme.colors.secondary,
        )
    }
}

@Composable
private fun Content(
    modifier: Modifier,
    contentPadding: PaddingValues,
    rom: Rom,
    romConfig: RomConfigUiModel,
    onConfigUpdate: (RomConfigUpdateEvent) -> Unit,
    onCustomInputConfigEdited: () -> Unit,
) {
    val context = LocalContext.current
    val renameDialogState = rememberTextInputDialogState()
    val consoleDialogState = rememberSingleChoiceDialogState<RuntimeConsoleType>()
    val micDialogState = rememberSingleChoiceDialogState<RuntimeMicSource>()
    val inputModeDialogState = rememberSingleChoiceDialogState<RomInputMode>()
    val gbaSlotDialogState = rememberSingleChoiceDialogState<RomGbaSlotConfigUiModel.Type>()

    val customInputSetupLauncher = rememberLauncherForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        onCustomInputConfigEdited()
    }
    val layoutSelectorLauncher = rememberLauncherForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val layoutId = result.data?.getStringExtra(LayoutSelectorActivity.KEY_SELECTED_LAYOUT_ID)?.let { UUID.fromString(it) }
            onConfigUpdate(RomConfigUpdateEvent.LayoutUpdate(layoutId))
        }
    }
    val gbaRomSelectorLauncher = rememberLauncherForActivityResult(FilePickerContract(Permission.READ)) { result ->
        if (result != null) onConfigUpdate(RomConfigUpdateEvent.GbaRomPathUpdate(result))
    }
    val gbaSaveSelectorLauncher = rememberLauncherForActivityResult(FilePickerContract(Permission.READ_WRITE)) { result ->
        if (result != null) onConfigUpdate(RomConfigUpdateEvent.GbaSavePathUpdate(result))
    }

    val consoleOptions = stringArrayResource(id = R.array.game_runtime_console_type_options)
    val micOptions = stringArrayResource(id = R.array.game_runtime_mic_source_options)
    val inputModeOptions = stringArrayResource(id = R.array.rom_input_mode_options)
    val gbaSlotOptions = stringArrayResource(id = R.array.gba_slot_options)

    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .padding(
                start = contentPadding.calculateStartPadding(LocalLayoutDirection.current),
                end = contentPadding.calculateEndPadding(LocalLayoutDirection.current),
            ),
    ) {
        ConfigSection(title = stringResource(R.string.rom_details_configuration_tab)) {
            ConfigRow(
                title = stringResource(R.string.label_rom_config_custom_name),
                value = romConfig.customName ?: rom.name,
                onClick = {
                    renameDialogState.show(
                        initialText = romConfig.customName ?: rom.name,
                        onConfirm = { newName -> onConfigUpdate(RomConfigUpdateEvent.CustomNameUpdate(newName.ifBlank { null })) },
                    )
                },
            )
        }

        ConfigSection(title = stringResource(R.string.console_type)) {
            ConfigRow(
                title = stringResource(R.string.label_rom_config_console),
                value = consoleOptions[romConfig.runtimeConsoleType.ordinal],
                enabled = !rom.isDsiWareTitle,
                showDivider = true,
                onClick = {
                    consoleDialogState.show(
                        title = context.getString(R.string.label_rom_config_console),
                        items = RuntimeConsoleType.entries.toList(),
                        labelOf = { consoleOptions[it.ordinal] },
                        selected = romConfig.runtimeConsoleType,
                        onSelect = { onConfigUpdate(RomConfigUpdateEvent.RuntimeConsoleUpdate(it)) },
                    )
                },
            )
            ConfigRow(
                title = stringResource(R.string.microphone_source),
                value = micOptions[romConfig.runtimeMicSource.ordinal],
                showDivider = true,
                onClick = {
                    micDialogState.show(
                        title = context.getString(R.string.microphone_source),
                        items = RuntimeMicSource.entries.toList(),
                        labelOf = { micOptions[it.ordinal] },
                        selected = romConfig.runtimeMicSource,
                        onSelect = { onConfigUpdate(RomConfigUpdateEvent.RuntimeMicSourceUpdate(it)) },
                    )
                },
            )
            ConfigToggleRow(
                title = stringResource(R.string.label_rom_config_hg_engine_fix),
                isOn = romConfig.useHgEngineFix,
                onToggle = { onConfigUpdate(RomConfigUpdateEvent.UseHgEngineFixUpdate(it)) },
            )
        }

        ConfigSection(title = stringResource(R.string.label_rom_config_input_mode)) {
            ConfigRow(
                title = stringResource(R.string.label_rom_config_input_mode),
                value = inputModeOptions[romConfig.inputMode.ordinal],
                showDivider = romConfig.inputMode == RomInputMode.CUSTOM,
                onClick = {
                    inputModeDialogState.show(
                        title = context.getString(R.string.label_rom_config_input_mode),
                        items = RomInputMode.entries.toList(),
                        labelOf = { inputModeOptions[it.ordinal] },
                        selected = romConfig.inputMode,
                        onSelect = { onConfigUpdate(RomConfigUpdateEvent.InputModeUpdate(it)) },
                    )
                },
            )
            AnimatedVisibility(visible = romConfig.inputMode == RomInputMode.CUSTOM) {
                ConfigRow(
                    title = stringResource(R.string.label_rom_config_custom_input_mapping),
                    value = stringResource(R.string.edit),
                    onClick = {
                        customInputSetupLauncher.launch(InputSetupActivity.getRomCustomIntent(context, rom))
                    },
                )
            }
        }

        ConfigSection(title = stringResource(R.string.controller_layout)) {
            ConfigRow(
                title = stringResource(R.string.controller_layout),
                value = romConfig.layoutName ?: stringResource(R.string.use_global_layout),
                onClick = {
                    val intent = Intent(context, LayoutSelectorActivity::class.java).apply {
                        putExtra(LayoutSelectorActivity.KEY_SELECTED_LAYOUT_ID, romConfig.layoutId?.toString())
                    }
                    layoutSelectorLauncher.launch(intent)
                },
            )
        }

        ConfigSection(title = stringResource(R.string.label_rom_config_gba_slot)) {
            val isGbaRom = romConfig.gbaSlotConfig.type == RomGbaSlotConfigUiModel.Type.GbaRom
            ConfigRow(
                title = stringResource(R.string.label_rom_config_gba_slot),
                value = gbaSlotOptions[romConfig.gbaSlotConfig.type.ordinal],
                showDivider = isGbaRom,
                onClick = {
                    gbaSlotDialogState.show(
                        title = context.getString(R.string.label_rom_config_gba_slot),
                        items = RomGbaSlotConfigUiModel.Type.entries.toList(),
                        labelOf = { gbaSlotOptions[it.ordinal] },
                        selected = romConfig.gbaSlotConfig.type,
                        onSelect = { onConfigUpdate(RomConfigUpdateEvent.GbaSlotTypeUpdated(it)) },
                    )
                },
            )
            AnimatedVisibility(visible = isGbaRom) {
                Column {
                    ConfigRow(
                        title = stringResource(R.string.label_rom_config_gba_rom_path),
                        value = romConfig.gbaSlotConfig.gbaRomPath ?: stringResource(R.string.not_set),
                        showDivider = true,
                        onClick = { gbaRomSelectorLauncher.launch(Pair(null, null)) },
                    )
                    ConfigRow(
                        title = stringResource(R.string.label_rom_config_gba_save_path),
                        value = romConfig.gbaSlotConfig.gbaSavePath ?: stringResource(R.string.not_set),
                        onClick = { gbaSaveSelectorLauncher.launch(Pair(null, null)) },
                    )
                }
            }
        }

        Spacer(Modifier.height(contentPadding.calculateBottomPadding() + 16.dp))
    }

    TextInputDialog(
        title = stringResource(R.string.label_rom_config_custom_name),
        dialogState = renameDialogState,
        textValidator = { true },
        onDelete = { onConfigUpdate(RomConfigUpdateEvent.CustomNameUpdate(null)) },
    )
    SingleChoiceDialog(consoleDialogState)
    SingleChoiceDialog(micDialogState)
    SingleChoiceDialog(inputModeDialogState)
    SingleChoiceDialog(gbaSlotDialogState)
}

@MelonPreviewSet
@Composable
private fun PreviewRomConfigUi() {
    MelonTheme {
        RomConfigUi(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(0.dp),
            rom = Rom(
                name = "Professor Layton and the Unwound Future",
                developerName = "Nontendo",
                fileName = "layton.nds",
                uri = Uri.EMPTY,
                parentTreeUri = Uri.EMPTY,
                config = RomConfig(),
                lastPlayed = Date(),
                isDsiWareTitle = false,
                retroAchievementsHash = "",
            ),
            romConfigUiState = RomConfigUiState.Ready(
                RomConfigUiModel(
                    layoutName = "Default",
                    gbaSlotConfig = RomGbaSlotConfigUiModel(type = RomGbaSlotConfigUiModel.Type.GbaRom)
                ),
            ),
            onConfigUpdate = { },
            onCustomInputConfigEdited = { },
        )
    }
}
