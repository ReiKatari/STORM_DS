package me.magnum.melonds.ui.settings.vulkandriver

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.RadioButton
import androidx.compose.material.Scaffold
import androidx.compose.material.SnackbarHost
import androidx.compose.material.SnackbarHostState
import androidx.compose.material.Surface
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CloudDownload
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.FileOpen
import androidx.compose.material.icons.filled.GetApp
import androidx.compose.material.icons.filled.Memory
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Storage
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.domain.model.VulkanDriverInfo
import me.magnum.melonds.domain.model.VulkanDriverMode
import me.magnum.melonds.impl.vulkandriver.OnlineVulkanDriver

import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding

enum class DriverStatus {
    ACTIVE,
    INSTALLED,
    NOT_INSTALLED
}

@Composable
fun DriverStatusBadge(status: DriverStatus, modifier: Modifier = Modifier) {
    val (bg, fg, label) = when (status) {
        DriverStatus.ACTIVE -> Triple(Color(0xFF059669), Color.White, "Включен")
        DriverStatus.INSTALLED -> Triple(Color(0xFF0284C7), Color.White, "Установлен")
        DriverStatus.NOT_INSTALLED -> Triple(Color(0xFF64748B), Color.White, "Отсутствует")
    }
    Surface(
        shape = RoundedCornerShape(6.dp),
        color = bg,
        modifier = modifier
    ) {
        Text(
            text = label,
            fontSize = 11.sp,
            fontWeight = FontWeight.Bold,
            color = fg,
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
        )
    }
}

@Composable
fun VulkanDriverManagerScreen(
    viewModel: VulkanDriverManagerViewModel,
    onBackClick: () -> Unit,
) {
    val state by viewModel.uiState.collectAsState()
    var selectedTab by remember { mutableIntStateOf(0) }
    val snackbarHostState = remember { SnackbarHostState() }

    val zipPickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.OpenDocument()
    ) { uri: Uri? ->
        uri?.let { viewModel.importFromUri(it) }
    }

    LaunchedEffect(state.message) {
        state.message?.let {
            snackbarHostState.showSnackbar(it)
            viewModel.clearMessage()
        }
    }

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .navigationBarsPadding(),
        topBar = {
            TopAppBar(
                title = { Text("Драйверы Vulkan", color = MaterialTheme.colors.onSurface) },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Назад", tint = MaterialTheme.colors.onSurface)
                    }
                },
                actions = {
                    IconButton(onClick = { viewModel.refresh() }) {
                        Icon(Icons.Default.Refresh, contentDescription = "Обновить", tint = MaterialTheme.colors.onSurface)
                    }
                },
                backgroundColor = MaterialTheme.colors.surface,
                elevation = 4.dp
            )
        },
        snackbarHost = { SnackbarHost(snackbarHostState) },
        backgroundColor = MaterialTheme.colors.background
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            // GPU Info Header
            GpuInfoHeader(
                gpuDescription = state.gpuDescription,
                gpuSeriesName = state.gpuSeries.displayName
            )

            // Recommended Hero Banner
            state.recommendedDriver?.let { recommended ->
                val installedMatch = findMatchingInstalledDriver(recommended, state.installedDrivers)
                val isInstalled = installedMatch != null
                val isActive = state.driverMode == VulkanDriverMode.CUSTOM &&
                    state.selectedDriverId != null &&
                    installedMatch != null &&
                    state.selectedDriverId == installedMatch.id

                RecommendedDriverBanner(
                    driver = recommended,
                    isDownloading = state.activeDownloadingId == recommended.id,
                    downloadProgress = state.downloadProgress[recommended.id] ?: 0,
                    isInstalled = isInstalled,
                    isActive = isActive,
                    onActionClick = {
                        if (isInstalled && installedMatch != null) {
                            viewModel.selectDriver(installedMatch.id)
                        } else {
                            viewModel.downloadAndInstall(recommended)
                        }
                    }
                )
            }

            // Tabs
            TabRow(
                selectedTabIndex = selectedTab,
                backgroundColor = MaterialTheme.colors.surface,
                contentColor = MaterialTheme.colors.primary
            ) {
                Tab(
                    selected = selectedTab == 0,
                    onClick = { selectedTab = 0 },
                    text = { Text("Онлайн-каталог") },
                    icon = { Icon(Icons.Default.CloudDownload, contentDescription = null) }
                )
                Tab(
                    selected = selectedTab == 1,
                    onClick = { selectedTab = 1 },
                    text = { Text("Установленные (${state.installedDrivers.size + 1})") },
                    icon = { Icon(Icons.Default.Storage, contentDescription = null) }
                )
            }

            // Tab Content
            if (selectedTab == 0) {
                OnlineDriversList(
                    drivers = state.onlineDrivers,
                    activeDownloadingId = state.activeDownloadingId,
                    downloadProgress = state.downloadProgress,
                    installedDrivers = state.installedDrivers,
                    selectedDriverId = state.selectedDriverId,
                    isCustomActive = state.driverMode == VulkanDriverMode.CUSTOM,
                    onDownloadClick = { viewModel.downloadAndInstall(it) },
                    onSelectInstalled = { viewModel.selectDriver(it) }
                )
            } else {
                InstalledDriversList(
                    driverMode = state.driverMode,
                    selectedDriverId = state.selectedDriverId,
                    installedDrivers = state.installedDrivers,
                    onSelectSystem = { viewModel.setSystemDriver() },
                    onSelectCustom = { viewModel.selectDriver(it) },
                    onDeleteCustom = { viewModel.deleteDriver(it) },
                    onImportZip = {
                        zipPickerLauncher.launch(
                            arrayOf(
                                "application/zip",
                                "application/x-zip-compressed",
                                "application/octet-stream",
                                "application/x-compressed"
                            )
                        )
                    }
                )
            }
        }
    }
}

@Composable
fun GpuInfoHeader(gpuDescription: String, gpuSeriesName: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        shape = RoundedCornerShape(12.dp),
        backgroundColor = MaterialTheme.colors.surface,
        elevation = 2.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Default.Memory,
                contentDescription = null,
                tint = MaterialTheme.colors.primary,
                modifier = Modifier.size(32.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(
                    text = "📱 Ваше устройство: $gpuDescription",
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    color = MaterialTheme.colors.onSurface
                )
                Text(
                    text = "Совместимость: $gpuSeriesName",
                    fontSize = 12.sp,
                    color = MaterialTheme.colors.onSurface.copy(alpha = 0.7f)
                )
            }
        }
    }
}

@Composable
fun RecommendedDriverBanner(
    driver: OnlineVulkanDriver,
    isDownloading: Boolean,
    downloadProgress: Int,
    isInstalled: Boolean,
    isActive: Boolean,
    onActionClick: () -> Unit,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 4.dp),
        shape = RoundedCornerShape(12.dp),
        backgroundColor = if (isActive) Color(0xFF059669).copy(alpha = 0.15f)
            else if (isInstalled) MaterialTheme.colors.primary.copy(alpha = 0.15f)
            else MaterialTheme.colors.surface,
        elevation = 2.dp
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        Icons.Default.Star,
                        contentDescription = null,
                        tint = Color(0xFFFFB300),
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Рекомендуемый драйвер",
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp,
                        color = MaterialTheme.colors.primary
                    )
                }
                val status = if (isActive) DriverStatus.ACTIVE else if (isInstalled) DriverStatus.INSTALLED else DriverStatus.NOT_INSTALLED
                DriverStatusBadge(status)
            }
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = driver.name,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                color = MaterialTheme.colors.onSurface
            )
            Text(
                text = driver.description,
                fontSize = 12.sp,
                color = MaterialTheme.colors.onSurface.copy(alpha = 0.8f),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(8.dp))

            if (isDownloading) {
                Column {
                    LinearProgressIndicator(
                        progress = downloadProgress / 100f,
                        modifier = Modifier.fillMaxWidth(),
                        color = MaterialTheme.colors.primary
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "Загрузка: $downloadProgress%",
                        fontSize = 11.sp,
                        color = MaterialTheme.colors.primary
                    )
                }
            } else {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Button(
                        onClick = onActionClick,
                        enabled = !isActive,
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = if (isActive) Color(0xFF059669) else MaterialTheme.colors.primary
                        )
                    ) {
                        Icon(
                            if (isActive || isInstalled) Icons.Default.Check else Icons.Default.GetApp,
                            contentDescription = null,
                            modifier = Modifier.size(16.dp),
                            tint = MaterialTheme.colors.onPrimary
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = if (isActive) "Уже включен" else if (isInstalled) "Включить" else "Скачать и установить",
                            color = MaterialTheme.colors.onPrimary
                        )
                    }
                }
            }
        }
    }
}

private fun findMatchingInstalledDriver(driver: OnlineVulkanDriver, installedDrivers: List<VulkanDriverInfo>): VulkanDriverInfo? {
    return installedDrivers.firstOrNull { installed ->
        installed.id == driver.id ||
        installed.displayName.equals(driver.name, ignoreCase = true) ||
        installed.displayName.equals("${driver.name} (${driver.version})", ignoreCase = true) ||
        (driver.version.length >= 6 && installed.displayName.contains(driver.version, ignoreCase = true))
    }
}

@Composable
fun OnlineDriversList(
    drivers: List<OnlineVulkanDriver>,
    activeDownloadingId: String?,
    downloadProgress: Map<String, Int>,
    installedDrivers: List<VulkanDriverInfo>,
    selectedDriverId: String?,
    isCustomActive: Boolean,
    onDownloadClick: (OnlineVulkanDriver) -> Unit,
    onSelectInstalled: (String) -> Unit,
) {
    if (drivers.isEmpty()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(32.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Для вашего GPU нет подходящих кастомных драйверов в каталоге. Рекомендуется использовать системный драйвер.",
                color = MaterialTheme.colors.onSurface.copy(alpha = 0.7f)
            )
        }
        return
    }

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(drivers, key = { it.id }) { driver ->
            val isDownloading = activeDownloadingId == driver.id
            val progress = downloadProgress[driver.id] ?: 0
            val installedMatch = findMatchingInstalledDriver(driver, installedDrivers)
            val isActive = isCustomActive &&
                selectedDriverId != null &&
                installedMatch != null &&
                selectedDriverId == installedMatch.id

            OnlineDriverCard(
                driver = driver,
                isDownloading = isDownloading,
                downloadProgress = progress,
                isInstalled = installedMatch != null,
                isActive = isActive,
                onDownloadClick = { onDownloadClick(driver) },
                onSelectClick = { installedMatch?.let { onSelectInstalled(it.id) } }
            )
        }
    }
}

@Composable
fun OnlineDriverCard(
    driver: OnlineVulkanDriver,
    isDownloading: Boolean,
    downloadProgress: Int,
    isInstalled: Boolean,
    isActive: Boolean,
    onDownloadClick: () -> Unit,
    onSelectClick: () -> Unit,
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        backgroundColor = if (isActive) Color(0xFF059669).copy(alpha = 0.12f)
        else MaterialTheme.colors.surface,
        elevation = 2.dp
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = driver.name,
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            color = MaterialTheme.colors.onSurface
                        )
                        if (driver.isRecommended) {
                            Spacer(modifier = Modifier.width(6.dp))
                            Surface(
                                color = Color(0xFFFFB300),
                                shape = RoundedCornerShape(4.dp)
                            ) {
                                Text(
                                    text = "ТОП",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Black,
                                    modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp)
                                )
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "📅 ${driver.formattedReleaseDate} • 📦 ${driver.fileSizeMb} MB",
                        fontSize = 12.sp,
                        color = MaterialTheme.colors.onSurface.copy(alpha = 0.7f)
                    )
                }
                val status = if (isActive) DriverStatus.ACTIVE else if (isInstalled) DriverStatus.INSTALLED else DriverStatus.NOT_INSTALLED
                DriverStatusBadge(status)
            }

            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = driver.description,
                fontSize = 13.sp,
                color = MaterialTheme.colors.onSurface.copy(alpha = 0.8f)
            )

            Spacer(modifier = Modifier.height(12.dp))

            if (isDownloading) {
                Column {
                    LinearProgressIndicator(
                        progress = downloadProgress / 100f,
                        modifier = Modifier.fillMaxWidth(),
                        color = MaterialTheme.colors.primary
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "Загрузка и установка: $downloadProgress%",
                        fontSize = 12.sp,
                        color = MaterialTheme.colors.primary
                    )
                }
            } else {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (isActive) {
                        Surface(
                            shape = RoundedCornerShape(8.dp),
                            color = Color(0xFF059669).copy(alpha = 0.2f),
                            modifier = Modifier.padding(4.dp)
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(Icons.Default.Check, contentDescription = null, modifier = Modifier.size(16.dp), tint = Color(0xFF059669))
                                Spacer(modifier = Modifier.width(4.dp))
                                Text("Включен", fontWeight = FontWeight.Bold, color = Color(0xFF059669), fontSize = 13.sp)
                            }
                        }
                    } else if (isInstalled) {
                        Button(
                            onClick = onSelectClick,
                            shape = RoundedCornerShape(8.dp),
                            colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary)
                        ) {
                            Text("Включить", color = MaterialTheme.colors.onPrimary)
                        }
                    } else {
                        Button(
                            onClick = onDownloadClick,
                            shape = RoundedCornerShape(8.dp),
                            colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary)
                        ) {
                            Icon(Icons.Default.GetApp, contentDescription = null, modifier = Modifier.size(16.dp), tint = MaterialTheme.colors.onPrimary)
                            Spacer(modifier = Modifier.width(6.dp))
                            Text("Скачать", color = MaterialTheme.colors.onPrimary)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun InstalledDriversList(
    driverMode: VulkanDriverMode,
    selectedDriverId: String?,
    installedDrivers: List<VulkanDriverInfo>,
    onSelectSystem: () -> Unit,
    onSelectCustom: (String) -> Unit,
    onDeleteCustom: (String) -> Unit,
    onImportZip: () -> Unit,
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        // System Default Option
        item {
            val isSysActive = driverMode == VulkanDriverMode.SYSTEM
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onSelectSystem() },
                shape = RoundedCornerShape(12.dp),
                backgroundColor = if (isSysActive)
                    Color(0xFF059669).copy(alpha = 0.15f)
                else MaterialTheme.colors.surface,
                elevation = 2.dp
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = isSysActive,
                        onClick = { onSelectSystem() },
                        colors = androidx.compose.material.RadioButtonDefaults.colors(
                            selectedColor = if (isSysActive) Color(0xFF059669) else MaterialTheme.colors.primary
                        )
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Системный драйвер Android (По умолчанию)",
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            color = MaterialTheme.colors.onSurface
                        )
                        Text(
                            text = "Встроенный драйвер от производителя устройства",
                            fontSize = 12.sp,
                            color = MaterialTheme.colors.onSurface.copy(alpha = 0.7f)
                        )
                    }
                    DriverStatusBadge(if (isSysActive) DriverStatus.ACTIVE else DriverStatus.INSTALLED)
                }
            }
        }

        // Custom Installed Drivers
        items(installedDrivers, key = { it.id }) { driver ->
            val isSelected = driverMode == VulkanDriverMode.CUSTOM && selectedDriverId == driver.id

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onSelectCustom(driver.id) },
                shape = RoundedCornerShape(12.dp),
                backgroundColor = if (isSelected)
                    Color(0xFF059669).copy(alpha = 0.15f)
                else MaterialTheme.colors.surface,
                elevation = 2.dp
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = isSelected,
                        onClick = { onSelectCustom(driver.id) },
                        colors = androidx.compose.material.RadioButtonDefaults.colors(
                            selectedColor = if (isSelected) Color(0xFF059669) else MaterialTheme.colors.primary
                        )
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = driver.displayName,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            color = MaterialTheme.colors.onSurface
                        )
                        Text(
                            text = "Файл: ${driver.driverName}",
                            fontSize = 11.sp,
                            color = MaterialTheme.colors.onSurface.copy(alpha = 0.7f)
                        )
                    }
                    DriverStatusBadge(if (isSelected) DriverStatus.ACTIVE else DriverStatus.INSTALLED)
                    IconButton(onClick = { onDeleteCustom(driver.id) }) {
                        Icon(
                            Icons.Default.Delete,
                            contentDescription = "Удалить",
                            tint = MaterialTheme.colors.error
                        )
                    }
                }
            }
        }

        // Local Import Button
        item {
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedButton(
                onClick = onImportZip,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Icon(Icons.Default.FileOpen, contentDescription = null, tint = MaterialTheme.colors.primary)
                Spacer(modifier = Modifier.width(8.dp))
                Text("Установить свой ZIP файл", color = MaterialTheme.colors.primary)
            }
        }
    }
}
