package me.magnum.melonds.ui.settings.vulkandriver

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.displayCutout
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.union
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material.SnackbarHost
import androidx.compose.material.SnackbarHostState
import androidx.compose.material.Surface
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.CloudDownload
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.DeleteSweep
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.FileOpen
import androidx.compose.material.icons.filled.GetApp
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Memory
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Storage
import androidx.compose.material.icons.filled.Warning
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.VulkanDriverInfo
import me.magnum.melonds.domain.model.VulkanDriverMode
import me.magnum.melonds.impl.AdrenoVulkanDriverSupport
import me.magnum.melonds.impl.vulkandriver.DriverRepoCategory
import me.magnum.melonds.impl.vulkandriver.OnlineVulkanDriverRepository
import me.magnum.melonds.impl.vulkandriver.VulkanDriverAsset
import me.magnum.melonds.impl.vulkandriver.VulkanDriverRelease
import me.magnum.melonds.impl.vulkandriver.VulkanDriverRepoGroup
import me.magnum.melonds.impl.vulkandriver.VulkanDriverRepoSpec
import me.magnum.melonds.ui.common.UnifiedBackButton
import me.magnum.melonds.ui.theme.WatermelonColors
import me.magnum.melonds.ui.theme.watermelon
import java.util.Locale

@Composable
fun VulkanDriverManagerScreen(
    viewModel: VulkanDriverManagerViewModel,
    onBackClick: () -> Unit,
) {
    val state by viewModel.uiState.collectAsState()
    val colors = watermelon
    var selectedTab by remember { mutableIntStateOf(0) }
    val snackbarHostState = remember { SnackbarHostState() }

    val zipPickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.OpenDocument()
    ) { uri: Uri? ->
        uri?.let { viewModel.importFromUri(it) }
    }

    LaunchedEffect(state.snackbarMessage) {
        state.snackbarMessage?.let { msg ->
            snackbarHostState.showSnackbar(msg)
            viewModel.clearMessage()
        }
    }

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.statusBars.union(WindowInsets.displayCutout))
            .windowInsetsPadding(WindowInsets.safeDrawing.only(WindowInsetsSides.Horizontal)),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(R.string.vulkan_driver_hub_title),
                        color = colors.text,
                        fontWeight = FontWeight.Bold,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                },
                actions = {
                    if (state.isSupported) {
                        val isBusy = state.activeDownloadKey != null || state.isImportingLocal
                        IconButton(
                            enabled = !isBusy,
                            onClick = {
                                zipPickerLauncher.launch(
                                    arrayOf(
                                        "application/zip",
                                        "application/x-zip-compressed",
                                        "application/octet-stream",
                                        "application/x-compressed",
                                    )
                                )
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Filled.FileOpen,
                                contentDescription = stringResource(R.string.vulkan_driver_import_zip),
                                tint = colors.text,
                            )
                        }
                        IconButton(onClick = { viewModel.refreshRepositories(forceRefresh = true) }) {
                            Icon(
                                imageVector = Icons.Filled.Refresh,
                                contentDescription = stringResource(R.string.vulkan_driver_refresh),
                                tint = colors.text,
                            )
                        }
                    }
                },
                backgroundColor = colors.surface,
                elevation = 4.dp,
            )
        },
        bottomBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(colors.surface)
                    .navigationBarsPadding()
                    .padding(bottom = 12.dp, top = 8.dp),
                contentAlignment = Alignment.Center,
            ) {
                UnifiedBackButton(onClick = onBackClick)
            }
        },
        snackbarHost = { SnackbarHost(snackbarHostState) },
        backgroundColor = colors.bg,
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            GpuTelemetryHeader(state = state)

            if (state.supportStatus != AdrenoVulkanDriverSupport.SupportStatus.SUPPORTED) {
                BlockedDeviceContent(
                    supportStatus = state.supportStatus,
                    gpuDescription = state.gpuDescription,
                    modifier = Modifier.fillMaxSize(),
                )
            } else {
                if (state.activeDownloadKey != null) {
                    ActiveDownloadBanner(
                        driverName = state.activeDownloadName.orEmpty(),
                        bytesRead = state.downloadBytesRead,
                        totalBytes = state.downloadTotalBytes,
                        percent = state.downloadPercent,
                    )
                }

                TabRow(
                    selectedTabIndex = selectedTab,
                    backgroundColor = colors.surface,
                    contentColor = colors.green,
                    indicator = { tabPositions ->
                        if (selectedTab < tabPositions.size) {
                            TabRowDefaults.Indicator(
                                modifier = Modifier.tabIndicatorOffset(tabPositions[selectedTab]),
                                color = colors.green,
                                height = 3.dp,
                            )
                        }
                    },
                ) {
                    Tab(
                        selected = selectedTab == 0,
                        onClick = { selectedTab = 0 },
                        text = {
                            Text(
                                text = stringResource(
                                    R.string.vulkan_driver_tab_installed,
                                    state.installedDrivers.size + 1,
                                ),
                                color = if (selectedTab == 0) colors.green else colors.text2,
                                fontWeight = if (selectedTab == 0) FontWeight.Bold else FontWeight.Medium,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                        },
                    )
                    Tab(
                        selected = selectedTab == 1,
                        onClick = { selectedTab = 1 },
                        text = {
                            Text(
                                text = stringResource(
                                    R.string.vulkan_driver_tab_repositories,
                                    state.repoGroups.size,
                                ),
                                color = if (selectedTab == 1) colors.green else colors.text2,
                                fontWeight = if (selectedTab == 1) FontWeight.Bold else FontWeight.Medium,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                        },
                    )
                    Tab(
                        selected = selectedTab == 2,
                        onClick = { selectedTab = 2 },
                        text = {
                            Text(
                                text = stringResource(R.string.vulkan_driver_tab_recommended),
                                color = if (selectedTab == 2) colors.green else colors.text2,
                                fontWeight = if (selectedTab == 2) FontWeight.Bold else FontWeight.Medium,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                        },
                    )
                }

                when (selectedTab) {
                    0 -> InstalledDriversTab(
                        state = state,
                        onSelectSystem = { viewModel.setSystemDriver() },
                        onSelectDriver = { viewModel.selectDriver(it) },
                        onDeleteDriver = { viewModel.requestDeleteDriver(it) },
                        onInstallStorm = { viewModel.installStormDriver() },
                        onImportClick = {
                            zipPickerLauncher.launch(
                                arrayOf(
                                    "application/zip",
                                    "application/x-zip-compressed",
                                    "application/octet-stream",
                                    "application/x-compressed",
                                )
                            )
                        },
                        onClearCachesClick = { viewModel.clearPipelineCaches() },
                    )
                    1 -> RepositoriesHubTab(
                        state = state,
                        onSearchQueryChange = { viewModel.updateSearchQuery(it) },
                        onCategorySelect = { viewModel.selectCategory(it) },
                        onSelectInstalledDriver = { viewModel.selectDriver(it) },
                        onInstallAsset = { repo, release, asset ->
                            viewModel.requestInstallAsset(repo, release, asset)
                        },
                        onImportClick = {
                            zipPickerLauncher.launch(
                                arrayOf(
                                    "application/zip",
                                    "application/x-zip-compressed",
                                    "application/octet-stream",
                                    "application/x-compressed",
                                )
                            )
                        },
                    )
                    else -> RecommendedForGpuTab(
                        state = state,
                        onSelectSystem = { viewModel.setSystemDriver() },
                        onInstallStorm = { viewModel.installStormDriver() },
                        onSelectInstalledDriver = { viewModel.selectDriver(it) },
                        onInstallAsset = { repo, release, asset ->
                            viewModel.requestInstallAsset(repo, release, asset)
                        },
                        onImportClick = {
                            zipPickerLauncher.launch(
                                arrayOf(
                                    "application/zip",
                                    "application/x-zip-compressed",
                                    "application/octet-stream",
                                    "application/x-compressed",
                                )
                            )
                        },
                    )
                }
            }
        }
    }

    state.pendingDeleteDriver?.let { target ->
        AlertDialog(
            onDismissRequest = { viewModel.dismissDeleteDriver() },
            backgroundColor = colors.surface,
            contentColor = colors.text,
            title = {
                Text(
                    text = stringResource(R.string.vulkan_driver_delete_confirm_title),
                    color = colors.text,
                    fontWeight = FontWeight.Bold,
                )
            },
            text = {
                Text(
                    text = stringResource(R.string.vulkan_driver_delete_confirm_message, target.displayName),
                    color = colors.text2,
                )
            },
            confirmButton = {
                Button(
                    onClick = { viewModel.confirmDeleteDriver() },
                    colors = ButtonDefaults.buttonColors(backgroundColor = colors.red, contentColor = Color.White),
                ) {
                    Text(stringResource(R.string.vulkan_driver_delete))
                }
            },
            dismissButton = {
                TextButton(onClick = { viewModel.dismissDeleteDriver() }) {
                    Text(stringResource(android.R.string.cancel), color = colors.text2)
                }
            },
        )
    }

    state.pendingAdreno8xxInstall?.let { pending ->
        AlertDialog(
            onDismissRequest = { viewModel.dismissAdreno8xxInstall() },
            backgroundColor = colors.surface,
            contentColor = colors.text,
            title = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Filled.Warning, contentDescription = null, tint = WatermelonColors.gold)
                    Spacer(Modifier.width(8.dp))
                    Text(
                        text = stringResource(R.string.vulkan_driver_adreno8xx_warn_title),
                        color = colors.text,
                        fontWeight = FontWeight.Bold,
                    )
                }
            },
            text = {
                Text(
                    text = stringResource(R.string.vulkan_driver_adreno8xx_warn_message, pending.displayName),
                    color = colors.text2,
                )
            },
            confirmButton = {
                Button(
                    onClick = { viewModel.confirmAdreno8xxInstall() },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = WatermelonColors.gold,
                        contentColor = Color.Black,
                    ),
                ) {
                    Text(stringResource(R.string.vulkan_driver_install_anyway), fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                TextButton(onClick = { viewModel.dismissAdreno8xxInstall() }) {
                    Text(stringResource(android.R.string.cancel), color = colors.text2)
                }
            },
        )
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun GpuTelemetryHeader(state: VulkanDriverManagerViewModel.UiState) {
    val colors = watermelon
    val hw = state.gpuHardwareInfo
    val activeCustom = if (state.driverMode == VulkanDriverMode.CUSTOM && state.selectedDriverId != null) {
        state.installedDrivers.firstOrNull { it.id == state.selectedDriverId }
    } else {
        null
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 14.dp, vertical = 10.dp),
        shape = RoundedCornerShape(14.dp),
        backgroundColor = colors.surface,
        border = BorderStroke(1.dp, if (state.isSupported) colors.line else colors.redGlow),
        elevation = 4.dp,
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Filled.Memory,
                    contentDescription = null,
                    tint = if (state.isSupported) colors.green else colors.red,
                    modifier = Modifier.size(22.dp),
                )
                Spacer(Modifier.width(8.dp))
                Text(
                    text = state.gpuDescription.ifBlank { state.gpuSeries.displayName },
                    color = colors.text,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                )
            }

            Spacer(Modifier.height(8.dp))

            FlowRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp),
            ) {
                if (hw != null && hw.apiVersion.isNotBlank()) {
                    TelemetryPill(
                        label = "${stringResource(R.string.vulkan_driver_api_label)}: ${hw.apiVersion}",
                        bg = colors.surface2,
                        fg = colors.text2,
                    )
                }
                TelemetryPill(
                    label = activeCustom?.displayName
                        ?: stringResource(R.string.vulkan_driver_system_title),
                    bg = if (activeCustom != null) colors.greenDim else colors.surface2,
                    fg = if (activeCustom != null) colors.green else colors.text2,
                )
                TelemetryPill(
                    label = if (activeCustom != null) {
                        stringResource(R.string.vulkan_driver_custom_tag)
                    } else {
                        stringResource(R.string.vulkan_driver_system_tag)
                    },
                    bg = colors.surface3,
                    fg = colors.text3,
                )
                TelemetryPill(
                    label = "${stringResource(R.string.vulkan_driver_recommended_badge)}: ${
                        if (state.isAdrenoTurnipCapable) "STORM DRIVER" else stringResource(R.string.vulkan_driver_system_title)
                    }",
                    bg = WatermelonColors.gold.copy(alpha = 0.18f),
                    fg = WatermelonColors.gold,
                )
            }

            if (hw != null && hw.driverInfo.isNotBlank()) {
                Spacer(Modifier.height(6.dp))
                Text(
                    text = hw.driverInfo,
                    color = colors.text3,
                    fontSize = 11.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
    }
}

@Composable
private fun TelemetryPill(label: String, bg: Color, fg: Color) {
    Surface(shape = RoundedCornerShape(8.dp), color = bg) {
        Text(
            text = label,
            color = fg,
            fontSize = 11.sp,
            fontWeight = FontWeight.SemiBold,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
        )
    }
}

@Composable
private fun BlockedDeviceContent(
    supportStatus: AdrenoVulkanDriverSupport.SupportStatus,
    gpuDescription: String,
    modifier: Modifier = Modifier,
) {
    val colors = watermelon
    val reasonText = when (supportStatus) {
        AdrenoVulkanDriverSupport.SupportStatus.UNSUPPORTED_LEGACY_BUILD ->
            stringResource(R.string.vulkan_driver_blocked_legacy_reason)
        AdrenoVulkanDriverSupport.SupportStatus.UNSUPPORTED_ANDROID_OR_ABI ->
            stringResource(R.string.vulkan_driver_blocked_abi_reason)
        AdrenoVulkanDriverSupport.SupportStatus.UNSUPPORTED_GPU,
        AdrenoVulkanDriverSupport.SupportStatus.SUPPORTED,
        -> stringResource(R.string.vulkan_driver_blocked_gpu_reason, gpuDescription)
    }

    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(14.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                backgroundColor = colors.surface,
                border = BorderStroke(1.5.dp, colors.red),
                elevation = 5.dp,
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Surface(
                            shape = RoundedCornerShape(10.dp),
                            color = colors.redGlow,
                            modifier = Modifier.size(40.dp),
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Filled.Lock,
                                    contentDescription = null,
                                    tint = colors.red,
                                )
                            }
                        }
                        Spacer(Modifier.width(12.dp))
                        Text(
                            text = stringResource(R.string.vulkan_driver_blocked_title),
                            color = colors.text,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                        )
                    }
                    Spacer(Modifier.height(10.dp))
                    Text(
                        text = reasonText,
                        color = colors.text2,
                        fontSize = 13.sp,
                        lineHeight = 19.sp,
                    )
                }
            }
        }

        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                backgroundColor = colors.surface,
                border = BorderStroke(1.dp, colors.green),
                elevation = 3.dp,
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    RadioButton(
                        selected = true,
                        onClick = null,
                        colors = RadioButtonDefaults.colors(selectedColor = colors.green),
                    )
                    Spacer(Modifier.width(8.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = stringResource(R.string.vulkan_driver_system_title),
                            color = colors.text,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                        )
                        Text(
                            text = stringResource(R.string.vulkan_driver_system_subtitle),
                            color = colors.text3,
                            fontSize = 12.sp,
                        )
                    }
                    TelemetryPill(
                        label = stringResource(R.string.vulkan_driver_status_active),
                        bg = colors.greenDim,
                        fg = colors.green,
                    )
                }
            }
        }
    }
}

@Composable
private fun ActiveDownloadBanner(
    driverName: String,
    bytesRead: Long,
    totalBytes: Long,
    percent: Int,
) {
    val colors = watermelon
    val progressSizeText = if (totalBytes > 0L) {
        String.format(
            Locale.US,
            "%.1f / %.1f MB",
            bytesRead / (1024.0 * 1024.0),
            totalBytes / (1024.0 * 1024.0),
        )
    } else if (bytesRead > 0L) {
        String.format(Locale.US, "%.1f MB", bytesRead / (1024.0 * 1024.0))
    } else {
        "..."
    }

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 14.dp, vertical = 4.dp),
        shape = RoundedCornerShape(10.dp),
        color = colors.surface2,
    ) {
        Column(modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = stringResource(R.string.vulkan_driver_downloading_progress, driverName, progressSizeText),
                    color = colors.text,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.weight(1f),
                )
                if (percent in 0..100) {
                    Spacer(Modifier.width(8.dp))
                    Text(
                        text = "$percent%",
                        color = colors.green,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }
            Spacer(Modifier.height(6.dp))
            if (percent in 0..100) {
                LinearProgressIndicator(
                    progress = percent / 100f,
                    modifier = Modifier.fillMaxWidth().height(4.dp),
                    color = colors.green,
                    backgroundColor = colors.surface3,
                )
            } else {
                LinearProgressIndicator(
                    modifier = Modifier.fillMaxWidth().height(4.dp),
                    color = colors.green,
                    backgroundColor = colors.surface3,
                )
            }
        }
    }
}

@Composable
private fun InstalledDriversTab(
    state: VulkanDriverManagerViewModel.UiState,
    onSelectSystem: () -> Unit,
    onSelectDriver: (String) -> Unit,
    onDeleteDriver: (VulkanDriverInfo) -> Unit,
    onInstallStorm: () -> Unit,
    onImportClick: () -> Unit,
    onClearCachesClick: () -> Unit,
) {
    val colors = watermelon
    val stormInstalled = state.installedDrivers.any {
        it.sourceRepo == "storm_driver" || it.displayName.contains("STORM", ignoreCase = true)
    }

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(14.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        if (state.isAdrenoTurnipCapable) {
            item {
                StormQuickInstallCard(
                    isInstalled = stormInstalled,
                    isBusy = state.activeDownloadKey != null || state.isImportingLocal,
                    onClick = onInstallStorm,
                )
            }
        } else {
            item {
                NonAdrenoCompatibilityCard(state = state)
            }
        }

        item {
            val isSystemActive = state.driverMode == VulkanDriverMode.SYSTEM
            val isSystemRecommended = !state.isAdrenoTurnipCapable
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onSelectSystem() },
                shape = RoundedCornerShape(12.dp),
                backgroundColor = colors.surface,
                border = BorderStroke(
                    width = if (isSystemActive) 1.5.dp else 1.dp,
                    color = when {
                        isSystemActive -> colors.green
                        isSystemRecommended -> WatermelonColors.gold
                        else -> colors.line
                    },
                ),
                elevation = if (isSystemActive) 4.dp else 2.dp,
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    RadioButton(
                        selected = isSystemActive,
                        onClick = onSelectSystem,
                        colors = RadioButtonDefaults.colors(
                            selectedColor = colors.green,
                            unselectedColor = colors.text3,
                        ),
                    )
                    Spacer(Modifier.width(8.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = stringResource(R.string.vulkan_driver_system_title),
                            color = colors.text,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                        )
                        Text(
                            text = stringResource(R.string.vulkan_driver_system_subtitle),
                            color = colors.text2,
                            fontSize = 12.sp,
                        )
                    }
                    Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                        if (isSystemRecommended) {
                            TelemetryPill(
                                label = stringResource(R.string.vulkan_driver_recommended_badge),
                                bg = WatermelonColors.gold.copy(alpha = 0.20f),
                                fg = WatermelonColors.gold,
                            )
                        }
                        if (isSystemActive) {
                            TelemetryPill(
                                label = stringResource(R.string.vulkan_driver_status_active),
                                bg = colors.greenDim,
                                fg = colors.green,
                            )
                        }
                    }
                }
            }
        }

        if (state.installedDrivers.isEmpty()) {
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    backgroundColor = colors.surface,
                    border = BorderStroke(1.dp, colors.line),
                ) {
                    Text(
                        text = stringResource(R.string.vulkan_driver_no_installed),
                        color = colors.text3,
                        fontSize = 13.sp,
                        modifier = Modifier.padding(16.dp),
                    )
                }
            }
        } else {
            items(state.installedDrivers, key = { it.id }) { driver ->
                val isActive = state.driverMode == VulkanDriverMode.CUSTOM && state.selectedDriverId == driver.id
                val isCompatible = state.compatibleInstalledDrivers[driver.id] != false
                InstalledCustomDriverCard(
                    driver = driver,
                    sizeText = state.installedDriverSizes[driver.id],
                    isActive = isActive,
                    isCompatible = isCompatible,
                    onSelect = { onSelectDriver(driver.id) },
                    onDelete = { onDeleteDriver(driver) },
                )
            }
        }

        item {
            Spacer(Modifier.height(4.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
            ) {
                OutlinedButton(
                    enabled = state.activeDownloadKey == null && !state.isImportingLocal,
                    onClick = onImportClick,
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(10.dp),
                    border = BorderStroke(1.dp, colors.line),
                ) {
                    Icon(Icons.Filled.FileOpen, contentDescription = null, tint = colors.green, modifier = Modifier.size(18.dp))
                    Spacer(Modifier.width(6.dp))
                    Text(
                        text = stringResource(R.string.vulkan_driver_import_zip),
                        color = colors.text,
                        fontSize = 12.sp,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                OutlinedButton(
                    onClick = onClearCachesClick,
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(10.dp),
                    border = BorderStroke(1.dp, colors.line),
                ) {
                    Icon(Icons.Filled.DeleteSweep, contentDescription = null, tint = colors.text2, modifier = Modifier.size(18.dp))
                    Spacer(Modifier.width(6.dp))
                    Text(
                        text = stringResource(R.string.vulkan_driver_clear_caches),
                        color = colors.text,
                        fontSize = 12.sp,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
        }
    }
}

@Composable
private fun NonAdrenoCompatibilityCard(
    state: VulkanDriverManagerViewModel.UiState,
    showEmptyReposNotice: Boolean = false,
) {
    val colors = watermelon
    val baseDescription = when (state.gpuVendorFamily) {
        AdrenoVulkanDriverSupport.GpuVendorFamily.ARM_MALI ->
            stringResource(R.string.vulkan_driver_non_adreno_mali_desc)
        else ->
            stringResource(R.string.vulkan_driver_non_adreno_other_desc, state.gpuDescription.ifBlank { state.gpuVendorFamily.displayName })
    }
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(14.dp),
        backgroundColor = colors.surface,
        border = BorderStroke(1.dp, WatermelonColors.gold.copy(alpha = 0.65f)),
        elevation = 3.dp,
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Filled.Info, contentDescription = null, tint = WatermelonColors.gold, modifier = Modifier.size(20.dp))
                Spacer(Modifier.width(8.dp))
                Text(
                    text = stringResource(
                        R.string.vulkan_driver_non_adreno_title,
                        state.gpuVendorFamily.displayName,
                    ),
                    color = colors.text,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                )
            }
            Spacer(Modifier.height(6.dp))
            Text(
                text = baseDescription,
                color = colors.text2,
                fontSize = 12.sp,
                lineHeight = 17.sp,
            )
            if (state.hasPanfrostKernel) {
                Spacer(Modifier.height(6.dp))
                Text(
                    text = stringResource(R.string.vulkan_driver_non_adreno_panfrost_detected),
                    color = colors.green,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                )
            }
            if (showEmptyReposNotice) {
                Spacer(Modifier.height(6.dp))
                Text(
                    text = stringResource(R.string.vulkan_driver_non_adreno_no_online_repos),
                    color = colors.text3,
                    fontSize = 12.sp,
                )
            }
        }
    }
}

@Composable
private fun StormQuickInstallCard(
    isInstalled: Boolean,
    isBusy: Boolean,
    onClick: () -> Unit,
) {
    val colors = watermelon
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(14.dp),
        backgroundColor = colors.surface,
        border = BorderStroke(1.5.dp, WatermelonColors.gold),
        elevation = 5.dp,
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Filled.Bolt, contentDescription = null, tint = WatermelonColors.gold)
                Spacer(Modifier.width(8.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = stringResource(R.string.vulkan_driver_storm_quick_title),
                            color = colors.text,
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            modifier = Modifier.weight(1f, fill = false),
                        )
                        Spacer(Modifier.width(6.dp))
                        TelemetryPill(
                            label = stringResource(R.string.vulkan_driver_recommended_badge),
                            bg = WatermelonColors.gold.copy(alpha = 0.20f),
                            fg = WatermelonColors.gold,
                        )
                    }
                    Text(
                        text = stringResource(R.string.vulkan_driver_storm_quick_subtitle),
                        color = colors.text2,
                        fontSize = 12.sp,
                    )
                }
            }
            Spacer(Modifier.height(10.dp))
            Button(
                onClick = onClick,
                enabled = !isBusy,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = WatermelonColors.gold,
                    contentColor = Color.Black,
                ),
            ) {
                Icon(Icons.Filled.CloudDownload, contentDescription = null, modifier = Modifier.size(18.dp))
                Spacer(Modifier.width(8.dp))
                Text(
                    text = stringResource(
                        if (isInstalled) R.string.vulkan_driver_reinstall_storm
                        else R.string.vulkan_driver_install_storm
                    ),
                    fontWeight = FontWeight.Bold,
                )
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun InstalledCustomDriverCard(
    driver: VulkanDriverInfo,
    sizeText: String?,
    isActive: Boolean,
    isCompatible: Boolean,
    onSelect: () -> Unit,
    onDelete: () -> Unit,
) {
    val colors = watermelon
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onSelect() },
        shape = RoundedCornerShape(12.dp),
        backgroundColor = colors.surface,
        border = BorderStroke(
            width = if (isActive) 1.5.dp else 1.dp,
            color = when {
                isActive -> colors.green
                !isCompatible -> WatermelonColors.gold.copy(alpha = 0.65f)
                else -> colors.line
            },
        ),
        elevation = if (isActive) 4.dp else 2.dp,
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = isActive,
                    onClick = onSelect,
                    colors = RadioButtonDefaults.colors(
                        selectedColor = colors.green,
                        unselectedColor = colors.text3,
                    ),
                )
                Spacer(Modifier.width(6.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = driver.displayName,
                        color = colors.text,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                    )
                    if (!driver.description.isNullOrBlank()) {
                        Text(
                            text = driver.description,
                            color = colors.text2,
                            fontSize = 12.sp,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
                IconButton(onClick = onDelete) {
                    Icon(
                        imageVector = Icons.Filled.Delete,
                        contentDescription = stringResource(R.string.vulkan_driver_delete),
                        tint = colors.red,
                    )
                }
            }

            Spacer(Modifier.height(6.dp))
            FlowRow(
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp),
            ) {
                if (isActive) {
                    TelemetryPill(
                        label = stringResource(R.string.vulkan_driver_status_active),
                        bg = colors.greenDim,
                        fg = colors.green,
                    )
                }
                if (!isCompatible) {
                    TelemetryPill(
                        label = stringResource(R.string.vulkan_driver_incompatible_gpu_badge),
                        bg = colors.redGlow,
                        fg = colors.red,
                    )
                }
                TelemetryPill(label = driver.driverName, bg = colors.surface2, fg = colors.text2)
                sizeText?.let {
                    TelemetryPill(label = it, bg = colors.surface2, fg = colors.text3)
                }
                driver.driverVersion?.takeIf { it.isNotBlank() }?.let { ver ->
                    TelemetryPill(
                        label = stringResource(R.string.vulkan_driver_meta_version, ver),
                        bg = colors.surface3,
                        fg = colors.text2,
                    )
                }
                driver.author?.takeIf { it.isNotBlank() }?.let { auth ->
                    TelemetryPill(
                        label = stringResource(R.string.vulkan_driver_meta_author, auth),
                        bg = colors.surface3,
                        fg = colors.text3,
                    )
                }
            }
        }
    }
}

@Composable
private fun RepositoriesHubTab(
    state: VulkanDriverManagerViewModel.UiState,
    onSearchQueryChange: (String) -> Unit,
    onCategorySelect: (DriverRepoCategory) -> Unit,
    onSelectInstalledDriver: (String) -> Unit,
    onInstallAsset: (VulkanDriverRepoSpec, VulkanDriverRelease, VulkanDriverAsset) -> Unit,
    onImportClick: () -> Unit,
) {
    val colors = watermelon
    val query = state.searchQuery.trim()
    val expandedRepos = remember { mutableStateMapOf("storm_driver" to true) }

    val filteredGroups = remember(state.repoGroups, query, state.selectedCategory) {
        state.repoGroups.filter { group ->
            val catOk = state.selectedCategory == DriverRepoCategory.ALL ||
                group.spec.category == state.selectedCategory
            if (!catOk) return@filter false
            if (query.isBlank()) return@filter true

            group.spec.displayName.contains(query, ignoreCase = true) ||
                group.spec.repoPath.contains(query, ignoreCase = true) ||
                group.releases.any { release ->
                    release.title.contains(query, ignoreCase = true) ||
                        release.tagName.contains(query, ignoreCase = true) ||
                        release.assets.any { it.name.contains(query, ignoreCase = true) }
                }
        }
    }

    Column(modifier = Modifier.fillMaxSize()) {
        OutlinedTextField(
            value = state.searchQuery,
            onValueChange = onSearchQueryChange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 8.dp),
            placeholder = {
                Text(
                    text = stringResource(R.string.vulkan_driver_search_hint),
                    color = colors.text3,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            },
            leadingIcon = {
                Icon(Icons.Filled.Search, contentDescription = null, tint = colors.text3)
            },
            trailingIcon = {
                if (state.searchQuery.isNotEmpty()) {
                    IconButton(onClick = { onSearchQueryChange("") }) {
                        Icon(Icons.Filled.Clear, contentDescription = null, tint = colors.text2)
                    }
                }
            },
            singleLine = true,
            shape = RoundedCornerShape(12.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = colors.text,
                cursorColor = colors.green,
                focusedBorderColor = colors.green,
                unfocusedBorderColor = colors.line,
                backgroundColor = colors.surface,
            ),
        )

        val categoryLabels = mapOf(
            DriverRepoCategory.ALL to stringResource(R.string.vulkan_driver_cat_all, state.repoGroups.size),
            DriverRepoCategory.STORM to stringResource(R.string.vulkan_driver_cat_storm),
            DriverRepoCategory.TURNIP to stringResource(R.string.vulkan_driver_cat_turnip),
            DriverRepoCategory.QUALCOMM_8XX to stringResource(R.string.vulkan_driver_cat_8xx),
            DriverRepoCategory.ADRENO_710 to stringResource(R.string.vulkan_driver_cat_710),
        )
        val categories = state.availableCategories.mapNotNull { cat ->
            categoryLabels[cat]?.let { cat to it }
        }

        if (state.repoGroups.isNotEmpty()) {
            LazyRow(
                contentPadding = PaddingValues(horizontal = 14.dp, vertical = 4.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                items(categories, key = { it.first.name }) { (cat, label) ->
                    val selected = state.selectedCategory == cat
                    Surface(
                        shape = RoundedCornerShape(20.dp),
                        color = if (selected) colors.green else colors.surface,
                        border = BorderStroke(1.dp, if (selected) colors.green else colors.line),
                        modifier = Modifier.clickable { onCategorySelect(cat) },
                    ) {
                        Text(
                            text = label,
                            color = if (selected) (if (colors.isDark) Color.Black else Color.White) else colors.text2,
                            fontSize = 12.sp,
                            fontWeight = if (selected) FontWeight.Bold else FontWeight.Medium,
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                        )
                    }
                }
            }
        }

        if (state.isSyncingRepos) {
            LinearProgressIndicator(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 14.dp, vertical = 4.dp)
                    .height(3.dp),
                color = colors.green,
                backgroundColor = colors.surface3,
            )
            Text(
                text = stringResource(R.string.vulkan_driver_loading_repos),
                color = colors.text3,
                fontSize = 11.sp,
                modifier = Modifier.padding(horizontal = 14.dp, vertical = 2.dp),
            )
        }

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(14.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            if (filteredGroups.isEmpty() && !state.isSyncingRepos) {
                if (!state.isAdrenoTurnipCapable) {
                    item {
                        NonAdrenoCompatibilityCard(
                            state = state,
                            showEmptyReposNotice = true,
                        )
                    }
                    item {
                        OutlinedButton(
                            enabled = state.activeDownloadKey == null && !state.isImportingLocal,
                            onClick = onImportClick,
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(10.dp),
                            border = BorderStroke(1.dp, colors.line),
                        ) {
                            Icon(Icons.Filled.FileOpen, contentDescription = null, tint = colors.green, modifier = Modifier.size(18.dp))
                            Spacer(Modifier.width(8.dp))
                            Text(
                                text = stringResource(R.string.vulkan_driver_import_zip),
                                color = colors.text,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.SemiBold,
                            )
                        }
                    }
                } else {
                    item {
                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(12.dp),
                            backgroundColor = colors.surface,
                        ) {
                            Text(
                                text = stringResource(R.string.vulkan_driver_no_matches, query),
                                color = colors.text3,
                                modifier = Modifier.padding(16.dp),
                            )
                        }
                    }
                }
            } else {
                items(filteredGroups, key = { it.spec.id }) { group ->
                    val expanded = if (query.isNotBlank()) true else (expandedRepos[group.spec.id] == true)
                    RepoGroupCard(
                        group = group,
                        isRecommended = group.spec.id in state.recommendedRepoIds,
                        expanded = expanded,
                        onToggleExpand = { expandedRepos[group.spec.id] = !expanded },
                        installedDrivers = state.installedDrivers,
                        activeDriverId = if (state.driverMode == VulkanDriverMode.CUSTOM) state.selectedDriverId else null,
                        activeDownloadKey = state.activeDownloadKey,
                        searchQuery = query,
                        onSelectInstalledDriver = onSelectInstalledDriver,
                        onInstallAsset = { release, asset ->
                            onInstallAsset(group.spec, release, asset)
                        },
                    )
                }
            }
        }
    }
}

@Composable
private fun RecommendedForGpuTab(
    state: VulkanDriverManagerViewModel.UiState,
    onSelectSystem: () -> Unit,
    onInstallStorm: () -> Unit,
    onSelectInstalledDriver: (String) -> Unit,
    onInstallAsset: (VulkanDriverRepoSpec, VulkanDriverRelease, VulkanDriverAsset) -> Unit,
    onImportClick: () -> Unit,
) {
    val colors = watermelon
    val adviceText = when (state.gpuSubFamily) {
        AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_840_PLUS ->
            stringResource(R.string.vulkan_driver_series_840_desc)
        AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_8XX_ELITE ->
            stringResource(R.string.vulkan_driver_series_8xx_desc)
        AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_710_720 ->
            stringResource(R.string.vulkan_driver_series_710_desc)
        AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_7XX_MODERN ->
            stringResource(R.string.vulkan_driver_series_7xx_desc)
        AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_6XX ->
            stringResource(R.string.vulkan_driver_series_6xx_desc)
        AdrenoVulkanDriverSupport.AdrenoSubFamily.ADRENO_LEGACY_OR_UNKNOWN,
        AdrenoVulkanDriverSupport.AdrenoSubFamily.NON_ADRENO,
        -> stringResource(R.string.vulkan_driver_non_adreno_no_online_repos)
    }

    val stormInstalled = state.installedDrivers.any {
        it.sourceRepo == "storm_driver" || it.displayName.contains("STORM", ignoreCase = true)
    }

    val recommendedGroups = remember(state.repoGroups, state.recommendedRepoIds) {
        val byId = state.repoGroups.associateBy { it.spec.id }
        state.recommendedRepoIds.mapNotNull { byId[it] }
    }

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(14.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        if (!state.isAdrenoTurnipCapable) {
            item {
                val isSystemActive = state.driverMode == VulkanDriverMode.SYSTEM
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(14.dp),
                    backgroundColor = colors.surface,
                    border = BorderStroke(1.5.dp, if (isSystemActive) colors.green else WatermelonColors.gold),
                    elevation = 4.dp,
                ) {
                    Column(modifier = Modifier.padding(14.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Icon(Icons.Filled.Star, contentDescription = null, tint = WatermelonColors.gold)
                            Spacer(Modifier.width(8.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = stringResource(R.string.vulkan_driver_system_title),
                                    color = colors.text,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                )
                                Text(
                                    text = stringResource(R.string.vulkan_driver_system_subtitle),
                                    color = colors.text2,
                                    fontSize = 12.sp,
                                )
                            }
                            TelemetryPill(
                                label = stringResource(R.string.vulkan_driver_recommended_badge),
                                bg = WatermelonColors.gold.copy(alpha = 0.20f),
                                fg = WatermelonColors.gold,
                            )
                        }
                        Spacer(Modifier.height(10.dp))
                        if (isSystemActive) {
                            TelemetryPill(
                                label = stringResource(R.string.vulkan_driver_status_active),
                                bg = colors.greenDim,
                                fg = colors.green,
                            )
                        } else {
                            Button(
                                onClick = onSelectSystem,
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(10.dp),
                                colors = ButtonDefaults.buttonColors(
                                    backgroundColor = colors.green,
                                    contentColor = if (colors.isDark) Color.Black else Color.White,
                                ),
                            ) {
                                Text(
                                    text = stringResource(R.string.vulkan_driver_activate),
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                        }
                    }
                }
            }
            item {
                NonAdrenoCompatibilityCard(
                    state = state,
                    showEmptyReposNotice = true,
                )
            }
            item {
                OutlinedButton(
                    enabled = state.activeDownloadKey == null && !state.isImportingLocal,
                    onClick = onImportClick,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(10.dp),
                    border = BorderStroke(1.dp, colors.line),
                ) {
                    Icon(Icons.Filled.FileOpen, contentDescription = null, tint = colors.green, modifier = Modifier.size(18.dp))
                    Spacer(Modifier.width(8.dp))
                    Text(
                        text = stringResource(R.string.vulkan_driver_import_zip),
                        color = colors.text,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.SemiBold,
                    )
                }
            }
        } else {
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(14.dp),
                    backgroundColor = colors.surface,
                    border = BorderStroke(1.dp, colors.green),
                    elevation = 4.dp,
                ) {
                    Row(
                        modifier = Modifier.padding(14.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Icon(Icons.Filled.Star, contentDescription = null, tint = WatermelonColors.gold)
                        Spacer(Modifier.width(10.dp))
                        Text(
                            text = adviceText,
                            color = colors.text,
                            fontSize = 13.sp,
                            lineHeight = 18.sp,
                        )
                    }
                }
            }

            item {
                StormQuickInstallCard(
                    isInstalled = stormInstalled,
                    isBusy = state.activeDownloadKey != null || state.isImportingLocal,
                    onClick = onInstallStorm,
                )
            }

            items(recommendedGroups, key = { "rec_${it.spec.id}" }) { group ->
                RepoGroupCard(
                    group = group,
                    isRecommended = true,
                    expanded = true,
                    onToggleExpand = {},
                    installedDrivers = state.installedDrivers,
                    activeDriverId = if (state.driverMode == VulkanDriverMode.CUSTOM) state.selectedDriverId else null,
                    activeDownloadKey = state.activeDownloadKey,
                    searchQuery = "",
                    maxReleasesShown = 3,
                    onSelectInstalledDriver = onSelectInstalledDriver,
                    onInstallAsset = { release, asset ->
                        onInstallAsset(group.spec, release, asset)
                    },
                )
            }
        }
    }
}

@Composable
private fun RepoGroupCard(
    group: VulkanDriverRepoGroup,
    isRecommended: Boolean,
    expanded: Boolean,
    onToggleExpand: () -> Unit,
    installedDrivers: List<VulkanDriverInfo>,
    activeDriverId: String?,
    activeDownloadKey: String?,
    searchQuery: String,
    maxReleasesShown: Int = 8,
    onSelectInstalledDriver: (String) -> Unit,
    onInstallAsset: (VulkanDriverRelease, VulkanDriverAsset) -> Unit,
) {
    val colors = watermelon
    val visibleReleases = remember(group.releases, searchQuery, maxReleasesShown) {
        val base = if (searchQuery.isBlank() || group.spec.displayName.contains(searchQuery, ignoreCase = true)) {
            group.releases
        } else {
            group.releases.filter { r ->
                r.title.contains(searchQuery, ignoreCase = true) ||
                    r.tagName.contains(searchQuery, ignoreCase = true) ||
                    r.assets.any { it.name.contains(searchQuery, ignoreCase = true) }
            }
        }
        base.take(maxReleasesShown)
    }

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(14.dp),
        backgroundColor = colors.surface,
        border = BorderStroke(
            width = if (group.spec.id == "storm_driver") 1.5.dp else 1.dp,
            color = if (group.spec.id == "storm_driver") WatermelonColors.gold else colors.line,
        ),
        elevation = 3.dp,
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onToggleExpand() }
                    .padding(14.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    imageVector = if (group.spec.id == "storm_driver") Icons.Filled.Bolt else Icons.Filled.Storage,
                    contentDescription = null,
                    tint = if (group.spec.id == "storm_driver") WatermelonColors.gold else colors.green,
                    modifier = Modifier.size(22.dp),
                )
                Spacer(Modifier.width(10.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = group.spec.displayName,
                            color = colors.text,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier.weight(1f, fill = false),
                        )
                        if (isRecommended) {
                            Spacer(Modifier.width(6.dp))
                            Icon(
                                imageVector = Icons.Filled.Star,
                                contentDescription = null,
                                tint = WatermelonColors.gold,
                                modifier = Modifier.size(15.dp),
                            )
                            Spacer(Modifier.width(4.dp))
                            TelemetryPill(
                                label = stringResource(R.string.vulkan_driver_recommended_badge),
                                bg = WatermelonColors.gold.copy(alpha = 0.20f),
                                fg = WatermelonColors.gold,
                            )
                        }
                    }
                    Text(
                        text = group.spec.repoPath,
                        color = colors.text3,
                        fontSize = 11.sp,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                Spacer(Modifier.width(8.dp))
                if (group.releases.isNotEmpty()) {
                    TelemetryPill(
                        label = stringResource(R.string.vulkan_driver_repo_releases_count, group.releases.size),
                        bg = colors.surface2,
                        fg = colors.text2,
                    )
                }
                Spacer(Modifier.width(4.dp))
                Icon(
                    imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                    contentDescription = null,
                    tint = colors.text2,
                )
            }

            AnimatedVisibility(visible = expanded) {
                Column(modifier = Modifier.padding(start = 12.dp, end = 12.dp, bottom = 12.dp)) {
                    if (group.error != null && visibleReleases.isEmpty()) {
                        Text(
                            text = stringResource(R.string.vulkan_driver_repo_error, group.error),
                            color = colors.red,
                            fontSize = 12.sp,
                            modifier = Modifier.padding(vertical = 6.dp),
                        )
                    }
                    visibleReleases.forEach { release ->
                        Divider(color = colors.line, thickness = 1.dp)
                        Spacer(Modifier.height(8.dp))
                        ReleaseCardSection(
                            repoId = group.spec.id,
                            release = release,
                            fromCache = group.fromCache,
                            installedDrivers = installedDrivers,
                            activeDriverId = activeDriverId,
                            activeDownloadKey = activeDownloadKey,
                            onSelectInstalledDriver = onSelectInstalledDriver,
                            onInstallAsset = { asset -> onInstallAsset(release, asset) },
                        )
                        Spacer(Modifier.height(6.dp))
                    }
                }
            }
        }
    }
}

@Composable
private fun ReleaseCardSection(
    repoId: String,
    release: VulkanDriverRelease,
    fromCache: Boolean,
    installedDrivers: List<VulkanDriverInfo>,
    activeDriverId: String?,
    activeDownloadKey: String?,
    onSelectInstalledDriver: (String) -> Unit,
    onInstallAsset: (VulkanDriverAsset) -> Unit,
) {
    val colors = watermelon
    var showNotes by remember(release.id) { mutableIntStateOf(0) }

    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = release.title,
                color = colors.text,
                fontWeight = FontWeight.SemiBold,
                fontSize = 13.sp,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.weight(1f),
            )
            if (release.publishedAt.isNotBlank()) {
                Spacer(Modifier.width(8.dp))
                Text(
                    text = release.publishedAt,
                    color = colors.text3,
                    fontSize = 11.sp,
                )
            }
        }

        if (release.isFromOfflineFallback || fromCache) {
            Spacer(Modifier.height(4.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                if (release.isFromOfflineFallback) {
                    TelemetryPill(
                        label = stringResource(R.string.vulkan_driver_offline_fallback_badge),
                        bg = colors.surface3,
                        fg = WatermelonColors.gold,
                    )
                } else if (fromCache) {
                    TelemetryPill(
                        label = stringResource(R.string.vulkan_driver_cache_badge),
                        bg = colors.surface2,
                        fg = colors.text3,
                    )
                }
            }
        }

        if (release.releaseNotes.isNotBlank()) {
            Spacer(Modifier.height(2.dp))
            Text(
                text = stringResource(
                    if (showNotes == 1) R.string.vulkan_driver_hide_notes else R.string.vulkan_driver_show_notes
                ),
                color = colors.green,
                fontSize = 11.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .clickable { showNotes = if (showNotes == 1) 0 else 1 }
                    .padding(vertical = 3.dp),
            )
            if (showNotes == 1) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = colors.surface2,
                    modifier = Modifier.fillMaxWidth().padding(bottom = 6.dp),
                ) {
                    Text(
                        text = release.releaseNotes.take(700),
                        color = colors.text2,
                        fontSize = 11.sp,
                        lineHeight = 15.sp,
                        modifier = Modifier.padding(8.dp),
                    )
                }
            }
        }

        Spacer(Modifier.height(4.dp))
        release.assets.forEach { asset ->
            val matchingInstalled = installedDrivers.firstOrNull { installed ->
                if (!installed.sourceRepo.isNullOrBlank() && !installed.assetFileName.isNullOrBlank()) {
                    installed.sourceRepo == repoId && installed.assetFileName == asset.name
                } else {
                    release.assets.size == 1 && installed.displayName.equals(release.title, ignoreCase = true)
                }
            }
            val isActive = matchingInstalled != null && matchingInstalled.id == activeDriverId
            val isBusy = activeDownloadKey != null

            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 3.dp),
                shape = RoundedCornerShape(8.dp),
                color = colors.surface2,
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = asset.name,
                            color = colors.text,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis,
                        )
                        if (asset.sizeBytes > 0L) {
                            Text(
                                text = String.format(Locale.US, "%.1f MB", asset.sizeBytes / (1024.0 * 1024.0)),
                                color = colors.text3,
                                fontSize = 11.sp,
                            )
                        }
                    }
                    Spacer(Modifier.width(8.dp))
                    when {
                        isActive -> {
                            TelemetryPill(
                                label = stringResource(R.string.vulkan_driver_status_active),
                                bg = colors.greenDim,
                                fg = colors.green,
                            )
                        }
                        matchingInstalled != null -> {
                            OutlinedButton(
                                onClick = { onSelectInstalledDriver(matchingInstalled.id) },
                                enabled = !isBusy,
                                contentPadding = PaddingValues(horizontal = 10.dp, vertical = 4.dp),
                                shape = RoundedCornerShape(8.dp),
                                border = BorderStroke(1.dp, colors.green),
                            ) {
                                Icon(Icons.Filled.Check, contentDescription = null, tint = colors.green, modifier = Modifier.size(14.dp))
                                Spacer(Modifier.width(4.dp))
                                Text(
                                    text = stringResource(R.string.vulkan_driver_activate),
                                    color = colors.green,
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                        }
                        else -> {
                            Button(
                                onClick = { onInstallAsset(asset) },
                                enabled = !isBusy,
                                contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp),
                                shape = RoundedCornerShape(8.dp),
                                colors = ButtonDefaults.buttonColors(
                                    backgroundColor = colors.green,
                                    contentColor = if (colors.isDark) Color.Black else Color.White,
                                ),
                            ) {
                                Icon(Icons.Filled.GetApp, contentDescription = null, modifier = Modifier.size(14.dp))
                                Spacer(Modifier.width(4.dp))
                                Text(
                                    text = stringResource(R.string.vulkan_driver_install),
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
