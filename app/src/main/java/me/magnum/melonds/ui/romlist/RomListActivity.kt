package me.magnum.melonds.ui.romlist

import android.app.Dialog
import android.app.SearchManager
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.KeyEvent
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.SystemBarStyle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.content.getSystemService
import androidx.compose.runtime.collectAsState
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import android.os.Build
import android.view.View
import android.view.WindowManager
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updateLayoutParams
import androidx.core.view.updatePadding
import androidx.fragment.app.commit
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import dagger.hilt.android.AndroidEntryPoint
import io.noties.markwon.Markwon
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import me.magnum.melonds.R
import me.magnum.melonds.databinding.ActivityRomListBinding
import me.magnum.melonds.domain.model.ConsoleType
import me.magnum.melonds.domain.model.DownloadProgress
import me.magnum.melonds.domain.model.RomViewMode
import me.magnum.melonds.domain.model.SortingMode
import me.magnum.melonds.domain.model.Version
import me.magnum.melonds.domain.model.appupdate.AppUpdate
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.github.services.GitHubUpdateInstallManager
import me.magnum.melonds.ui.common.rom.EmulatorLaunchValidatorDelegate
import me.magnum.melonds.ui.emulator.EmulatorActivity
import me.magnum.melonds.ui.settings.SettingsActivity
import me.magnum.melonds.ui.updates.showStormUpdateAvailableDialog
import me.magnum.melonds.ui.updates.showStormUpdateInfoDialog
import me.magnum.melonds.ui.updates.showStormUpdateProgressDialog
import javax.inject.Inject

@AndroidEntryPoint
class RomListActivity : AppCompatActivity() {
    companion object {
        private const val FRAGMENT_ROM_LIST = "ROM_LIST"
        private const val FRAGMENT_NO_ROM_DIRECTORIES = "NO_ROM_DIRECTORY"
    }

    @Inject lateinit var markwon: Markwon
    @Inject lateinit var settingsBackupManager: me.magnum.melonds.impl.SettingsBackupManager
    private val viewModel: RomListViewModel by viewModels()
    private val updatesViewModel: UpdatesViewModel by viewModels()
    private lateinit var emulatorLauncherValidatorDelegate: EmulatorLaunchValidatorDelegate

    private var activeUpdateDialog: Dialog? = null
    private var downloadProgressDialog: Dialog? = null
    private var pendingUpdateApkPath: String? = null
    private val updateDownloadProgressFlow = kotlinx.coroutines.flow.MutableStateFlow<DownloadProgress?>(null)
    private var romBrowserDpadDownGate: (() -> Boolean)? = null
    private var hasPromptedStoragePermissionThisSession = false
    private var hasPromptedNotificationPermissionThisSession = false
    private val externalInfoController by lazy { me.magnum.melonds.ui.common.ExternalInfoDisplayController(this) }
    private val highlightedRom = kotlinx.coroutines.flow.MutableStateFlow<Rom?>(null)

    private lateinit var binding: ActivityRomListBinding

    val openSingleRomLauncher = registerForActivityResult(androidx.activity.result.contract.ActivityResultContracts.OpenDocument()) { uri ->
        if (uri != null) {
            lifecycleScope.launch(kotlinx.coroutines.Dispatchers.IO) {
                try {
                    contentResolver.takePersistableUriPermission(
                        uri,
                        Intent.FLAG_GRANT_READ_URI_PERMISSION or Intent.FLAG_GRANT_WRITE_URI_PERMISSION
                    )
                } catch (_: Throwable) {
                    try {
                        contentResolver.takePersistableUriPermission(
                            uri,
                            Intent.FLAG_GRANT_READ_URI_PERMISSION
                        )
                    } catch (_: Throwable) {}
                }
                val rom = viewModel.getRomAtUri(uri)
                if (rom != null) {
                    kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.Main) {
                        emulatorLauncherValidatorDelegate.validateRom(rom)
                    }
                } else {
                    kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.Main) {
                        android.widget.Toast.makeText(this@RomListActivity, getString(R.string.rom_launch_failed), android.widget.Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }

    fun openSingleRom() {
        openSingleRomLauncher.launch(arrayOf("*/*"))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        me.magnum.melonds.ui.theme.AppThemeManager.applyEdgeToEdgeTheme(this)
        super.onCreate(savedInstanceState)
        binding = ActivityRomListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.hide()
        applyImmersiveMode()

        fun applyLaunchTransition() {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
                overrideActivityTransition(OVERRIDE_TRANSITION_OPEN, android.R.anim.fade_in, android.R.anim.fade_out)
            } else {
                @Suppress("DEPRECATION")
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            }
        }

        emulatorLauncherValidatorDelegate = EmulatorLaunchValidatorDelegate(this, object : EmulatorLaunchValidatorDelegate.Callback {
            override fun onRomValidated(rom: Rom) {
                viewModel.setRomLastPlayedNow(rom)
                me.magnum.melonds.ui.quickresume.QuickResumeStore.rememberLastRom(this@RomListActivity, rom)
                me.magnum.melonds.ui.stats.PlayStatsStore.recordLaunch(this@RomListActivity, rom)
                val intent = EmulatorActivity.getRomEmulatorActivityIntent(this@RomListActivity, rom)
                startActivity(intent)
                applyLaunchTransition()
            }

            override fun onFirmwareValidated(consoleType: ConsoleType) {
                val intent = EmulatorActivity.getFirmwareEmulatorActivityIntent(this@RomListActivity, consoleType)
                startActivity(intent)
                applyLaunchTransition()
            }

            override fun onValidationAborted() {
                me.magnum.melonds.ui.quickresume.QuickResumeRequest.clear()
            }
        })

        if (savedInstanceState == null) {
            handleShortcutLaunchIntent(intent)
        }

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.hasSearchDirectories.collectLatest { hasDirectories ->
                    if (hasDirectories) {
                        addRomListFragment()
                    } else {
                        addNoSearchDirectoriesFragment()
                    }
                }
            }
        }

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.invalidDirectoryAccessEvent.collectLatest {
                    showInvalidDirectoryAccessDialog()
                }
            }
        }

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                updatesViewModel.appUpdate.collectLatest {
                    when (it.type) {
                        AppUpdate.Type.PRODUCTION -> showProdUpdateAvailableDialog(it)
                        AppUpdate.Type.NIGHTLY -> showNightlyUpdateAvailableDialog(it)
                    }
                }
            }
        }
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                updatesViewModel.updateDownloadProgressEvent.collectLatest {
                    onDownloadProgressUpdated(it)
                }
            }
        }
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                updatesViewModel.manualUpdateResult.collectLatest { result ->
                    when (result) {
                        is ManualUpdateResult.Checking -> {
                            Toast.makeText(this@RomListActivity, R.string.v800_checking_updates, Toast.LENGTH_SHORT).show()
                        }
                        is ManualUpdateResult.UpdateAvailable -> {
                            // Handled by appUpdate flow
                        }
                        is ManualUpdateResult.UpToDate -> {
                            val curVer = (runCatching {
                                packageManager.getPackageInfo(packageName, 0).versionName
                            }.getOrNull() ?: "8.9.3").removePrefix("v").removePrefix("V")
                            activeUpdateDialog?.dismiss()
                            activeUpdateDialog = showStormUpdateInfoDialog(
                                context = this@RomListActivity,
                                title = getString(R.string.v800_update_up_to_date_title),
                                message = getString(R.string.v800_update_up_to_date_msg, curVer),
                                versionBadge = curVer,
                            )
                        }
                        is ManualUpdateResult.Error -> {
                            activeUpdateDialog?.dismiss()
                            activeUpdateDialog = showStormUpdateInfoDialog(
                                context = this@RomListActivity,
                                title = getString(R.string.v800_update_error),
                                message = result.message?.takeIf { it.isNotBlank() } ?: getString(R.string.v800_update_error),
                                isError = true,
                                onRetry = { updatesViewModel.checkForUpdatesManually() },
                            )
                        }
                    }
                }
            }
        }

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.viewMode.collectLatest {
                    invalidateOptionsMenu()
                }
            }
        }
    }

    override fun onPrepareOptionsMenu(menu: Menu): Boolean {
        val toggleItem = menu.findItem(R.id.action_view_toggle)
        toggleItem?.setIcon(
            when (viewModel.viewMode.value) {
                RomViewMode.GRID -> R.drawable.ic_view_list
                RomViewMode.LIST -> R.drawable.ic_view_grid
            }
        )
        return super.onPrepareOptionsMenu(menu)
    }

    override fun dispatchKeyEvent(event: KeyEvent): Boolean {
        if (event.action == KeyEvent.ACTION_DOWN) {
            when (event.keyCode) {
                KeyEvent.KEYCODE_DPAD_DOWN -> {
                    if (romBrowserDpadDownGate?.invoke() == true) {
                        return true
                    }
                }
                KeyEvent.KEYCODE_BUTTON_L1, KeyEvent.KEYCODE_PAGE_UP -> {
                    viewModel.cycleFilter(forward = false)
                    return true
                }
                KeyEvent.KEYCODE_BUTTON_R1, KeyEvent.KEYCODE_PAGE_DOWN -> {
                    viewModel.cycleFilter(forward = true)
                    return true
                }
                KeyEvent.KEYCODE_BUTTON_SELECT -> {
                    if (event.repeatCount == 0) openMultiplayer()
                    return true
                }
            }
        }
        return super.dispatchKeyEvent(event)
    }

    internal fun setRomBrowserDpadDownGate(gate: (() -> Boolean)?) {
        romBrowserDpadDownGate = gate
    }

    internal fun onLibraryRomHighlighted(rom: Rom?) {
        if (rom != null) {
            highlightedRom.value = rom
        }
    }

    override fun onStart() {
        super.onStart()
        externalInfoController.attach()
        externalInfoController.setContent {
            val rom = highlightedRom.collectAsState().value
            if (rom != null) {
                val boxArtByUri = viewModel.boxArtByUri.collectAsState().value
                val raCoverByHash = viewModel.raCoverByHash.collectAsState().value
                me.magnum.melonds.ui.common.ExternalLibraryGameInfo(
                    rom = rom,
                    boxArtUrl = boxArtByUri[rom.uri.toString()]?.takeIf { it.isNotEmpty() },
                    raCoverUrl = raCoverByHash[rom.retroAchievementsHash],
                )
            } else {
                me.magnum.melonds.ui.common.ExternalIdleInfo()
            }
        }
    }

    override fun onStop() {
        externalInfoController.detach()
        super.onStop()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.rom_list_menu, menu)

        val searchItem =  menu.findItem(R.id.action_search_roms)
        getSystemService<SearchManager>()?.let { searchManager ->
            val searchView = searchItem.actionView as SearchView
            searchView.apply {
                queryHint = getString(R.string.hint_search_roms)
                setSearchableInfo(searchManager.getSearchableInfo(componentName))
                setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                    override fun onQueryTextSubmit(query: String?): Boolean {
                        return true
                    }

                    override fun onQueryTextChange(newText: String?): Boolean {
                        viewModel.setRomSearchQuery(newText)
                        return true
                    }
                })
            }
        }

        // Fix for action items not appearing after closing the search view
        searchItem.setOnActionExpandListener(object : MenuItem.OnActionExpandListener {
            override fun onMenuItemActionExpand(item: MenuItem): Boolean {
                return true
            }

            override fun onMenuItemActionCollapse(item: MenuItem): Boolean {
                invalidateMenu()
                return true
            }
        })

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_view_toggle -> {
                viewModel.toggleViewMode()
                return true
            }
            R.id.action_sort_alphabetically -> {
                viewModel.setRomSorting(SortingMode.ALPHABETICALLY)
                return true
            }
            R.id.action_sort_recent -> {
                viewModel.setRomSorting(SortingMode.RECENTLY_PLAYED)
                return true
            }
            R.id.action_sort_most_played -> {
                viewModel.setRomSorting(SortingMode.MOST_PLAYED)
                return true
            }
            R.id.action_boot_firmware_ds -> {
                launchFirmware(ConsoleType.DS)
                return true
            }
            R.id.action_boot_firmware_dsi -> {
                launchFirmware(ConsoleType.DSi)
                return true
            }
            R.id.action_random_rom -> {
                launchRandomRom()
                return true
            }
            R.id.action_rom_list_refresh -> {
                viewModel.refreshRoms()
                updatesViewModel.checkForUpdatesSilently()
                return true
            }
            R.id.action_player_stats -> {
                openPlayerStats()
                return true
            }
            R.id.action_report_problem -> {
                reportProblem(viewModel.browserState.value.continuePlaying.firstOrNull())
                return true
            }
            R.id.action_settings -> {
                val intent = Intent(this, SettingsActivity::class.java)
                startActivity(intent)
                return true
            }
        }
        return false
    }

    internal fun launchRandomRom() {
        val randomRom = viewModel.getRandomRom()
        if (randomRom != null) {
            val displayName = me.magnum.melonds.ui.romlist.composables.romDisplayName(randomRom)
            Toast.makeText(
                this,
                getString(R.string.toast_random_rom_selected, displayName),
                Toast.LENGTH_SHORT
            ).show()
            launchRom(randomRom)
        } else {
            Toast.makeText(
                this,
                getString(R.string.toast_no_roms_found),
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    fun checkForUpdatesManually() {
        updatesViewModel.checkForUpdatesManually()
    }

    fun checkForUpdatesSilently() {
        updatesViewModel.checkForUpdatesSilently()
    }

    internal fun bootFirmware(consoleType: ConsoleType) {
        launchFirmware(consoleType)
    }

    internal fun openSettings() {
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }

    internal fun openMultiplayer(join: String? = null) {
        startActivity(
            Intent(this, me.magnum.melonds.multiplayer.MultiplayerActivity::class.java)
                .putExtra(me.magnum.melonds.multiplayer.MultiplayerActivity.EXTRA_JOIN, join)
        )
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        setIntent(intent)
        handleShortcutLaunchIntent(intent)
    }

    private fun handleShortcutLaunchIntent(launchIntent: Intent?) {
        if (launchIntent == null) return
        if ((launchIntent.flags and Intent.FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY) != 0) return
        val action = launchIntent.action ?: return
        if (action != "${packageName}.LAUNCH_ROM" && action != "${packageName}.LAUNCH_FIRMWARE") return
        launchIntent.action = null
        val launchArgs = me.magnum.melonds.ui.emulator.model.LaunchArgs.fromIntent(launchIntent) ?: return
        when (launchArgs) {
            is me.magnum.melonds.ui.emulator.model.LaunchArgs.Firmware -> launchFirmware(launchArgs.consoleType)
            is me.magnum.melonds.ui.emulator.model.LaunchArgs.RomObject -> launchRom(launchArgs.rom)
            is me.magnum.melonds.ui.emulator.model.LaunchArgs.RomUri -> launchRomUri(launchArgs.uri)
            is me.magnum.melonds.ui.emulator.model.LaunchArgs.RomPath -> {
                launchRomUri(android.net.Uri.fromFile(java.io.File(launchArgs.path)))
            }
        }
    }

    private fun launchRomUri(uri: android.net.Uri) {
        lifecycleScope.launch(kotlinx.coroutines.Dispatchers.IO) {
            val rom = viewModel.getRomAtUri(uri)
            kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.Main) {
                if (rom != null) {
                    launchRom(rom)
                } else {
                    Toast.makeText(this@RomListActivity, R.string.rom_launch_failed, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    internal fun openPlayerStats() {
        val intent = Intent(this, me.magnum.melonds.ui.stats.PlayerStatsActivity::class.java)
        startActivity(intent)
    }

    internal fun reportProblem(lastRom: Rom? = null) {
        me.magnum.melonds.ui.diagnostics.ProblemReportGenerator.showDialogAndShare(this, lastRom)
    }

    private fun addNoSearchDirectoriesFragment() {
        supportActionBar?.hide()
        var noRomDirectoriesFragment = supportFragmentManager.findFragmentByTag(FRAGMENT_NO_ROM_DIRECTORIES) as NoRomSearchDirectoriesFragment?
        if (noRomDirectoriesFragment == null) {
            noRomDirectoriesFragment = NoRomSearchDirectoriesFragment.newInstance()
            supportFragmentManager.commit(allowStateLoss = true) {
                replace(R.id.layout_main, noRomDirectoriesFragment, FRAGMENT_NO_ROM_DIRECTORIES)
            }
        }
    }

    private fun addRomListFragment() {
        supportActionBar?.hide()
        var romListFragment = supportFragmentManager.findFragmentByTag(FRAGMENT_ROM_LIST) as RomListFragment?
        if (romListFragment == null) {
            romListFragment = RomListFragment.newInstance(true, RomListFragment.RomEnableCriteria.ENABLE_ALL)
            supportFragmentManager.commit(allowStateLoss = true) {
                replace(R.id.layout_main, romListFragment, FRAGMENT_ROM_LIST)
            }
        }
        romListFragment.setRomSelectedListener { rom -> launchRom(rom) }
    }

    private fun showProdUpdateAvailableDialog(update: AppUpdate) {
        if (isFinishing || isDestroyed) return
        val currentVersionStr = runCatching {
            val pInfo = packageManager.getPackageInfo(packageName, 0)
            pInfo.versionName ?: "8.9.3"
        }.getOrDefault("8.9.3")

        val newVersionStr = getReadableVersionString(update.newVersion)
        val rawDescription = update.description.ifBlank {
            "STORM DS ${newVersionStr.removePrefix("v").removePrefix("V")}"
        }

        activeUpdateDialog?.dismiss()
        activeUpdateDialog = showStormUpdateAvailableDialog(
            context = this,
            currentVersion = currentVersionStr,
            newVersion = newVersionStr,
            changelogMd = rawDescription,
            binarySizeBytes = update.binarySize,
            publishedEpochMillis = update.updateDate.toEpochMilliseconds(),
            sourceReleaseUrl = update.sourceReleaseUrl,
            downloadUrl = update.downloadUri.toString(),
            onUpdateNow = { startUpdateDownload(update) },
            onRemindLater = {},
            onSkipVersion = { updatesViewModel.skipUpdate(update) },
        )
    }

    private fun showNightlyUpdateAvailableDialog(update: AppUpdate) {
        if (isFinishing || isDestroyed) return
        val currentVersionStr = runCatching {
            val pInfo = packageManager.getPackageInfo(packageName, 0)
            pInfo.versionName ?: "8.9.3"
        }.getOrDefault("8.9.3")

        activeUpdateDialog?.dismiss()
        activeUpdateDialog = showStormUpdateAvailableDialog(
            context = this,
            currentVersion = currentVersionStr,
            newVersion = getReadableVersionString(update.newVersion),
            changelogMd = update.description.ifBlank { getString(R.string.nightly_update_available_message) },
            binarySizeBytes = update.binarySize,
            publishedEpochMillis = update.updateDate.toEpochMilliseconds(),
            sourceReleaseUrl = update.sourceReleaseUrl,
            downloadUrl = update.downloadUri.toString(),
            titleOverride = getString(R.string.nightly_update_available),
            onUpdateNow = { startUpdateDownload(update) },
            onRemindLater = {},
            onSkipVersion = { updatesViewModel.skipUpdate(update) },
        )
    }

    private fun startUpdateDownload(update: AppUpdate) {
        updateDownloadProgressFlow.value = DownloadProgress.DownloadUpdate(update.binarySize.coerceAtLeast(0L), 0L)
        downloadProgressDialog?.dismiss()
        downloadProgressDialog = showStormUpdateProgressDialog(
            context = this,
            versionLabel = getReadableVersionString(update.newVersion),
            progressFlow = updateDownloadProgressFlow,
            onMoveToBackground = { downloadProgressDialog = null },
        )

        updatesViewModel.downloadUpdate(update)
    }

    private fun onDownloadProgressUpdated(downloadProgress: DownloadProgress) {
        when (downloadProgress) {
            is DownloadProgress.DownloadUpdate -> {
                updateDownloadProgressFlow.value = downloadProgress
            }
            is DownloadProgress.DownloadComplete -> {
                updateDownloadProgressFlow.value = downloadProgress
                runCatching { downloadProgressDialog?.dismiss() }
                downloadProgressDialog = null
            }
            is DownloadProgress.DownloadFailed -> {
                updateDownloadProgressFlow.value = downloadProgress
                runCatching { downloadProgressDialog?.dismiss() }
                downloadProgressDialog = null
                Toast.makeText(this, R.string.update_download_failed, Toast.LENGTH_LONG).show()
            }
            is DownloadProgress.InstallPermissionRequired -> {
                updateDownloadProgressFlow.value = downloadProgress
                runCatching { downloadProgressDialog?.dismiss() }
                downloadProgressDialog = null
                pendingUpdateApkPath = downloadProgress.apkPath
                Toast.makeText(this, R.string.update_install_permission_required, Toast.LENGTH_LONG).show()
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    runCatching {
                        startActivity(
                            Intent(
                                android.provider.Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES,
                                android.net.Uri.parse("package:$packageName"),
                            )
                        )
                    }.onFailure {
                        pendingUpdateApkPath = null
                        Toast.makeText(this, R.string.update_download_failed, Toast.LENGTH_LONG).show()
                    }
                }
            }
        }
    }

    private fun getReadableVersionString(version: Version): String {
        val typeString = when(version.type) {
            Version.ReleaseType.ALPHA -> getString(R.string.version_alpha)
            Version.ReleaseType.BETA -> getString(R.string.version_beta)
            Version.ReleaseType.RC -> getString(R.string.version_rc)
            Version.ReleaseType.FINAL -> ""
            Version.ReleaseType.NIGHTLY -> return getString(R.string.version_nightly)
        }
        return "$typeString${if (typeString.isEmpty()) "" else " "}${version.major}.${version.minor}.${version.patch}"
    }

    private fun launchRom(rom: Rom) {
        emulatorLauncherValidatorDelegate.validateRom(rom)
    }

    private fun launchFirmware(consoleType: ConsoleType) {
        emulatorLauncherValidatorDelegate.validateFirmware(consoleType)
    }

    private fun showInvalidDirectoryAccessDialog() {
        AlertDialog.Builder(this)
            .setTitle(R.string.error_invalid_directory)
            .setMessage(R.string.error_invalid_directory_description)
            .setPositiveButton(R.string.ok, null)
            .setCancelable(true)
            .show()
    }

    override fun onDestroy() {
        activeUpdateDialog?.dismiss()
        activeUpdateDialog = null
        downloadProgressDialog?.dismiss()
        downloadProgressDialog = null
        super.onDestroy()
    }

    private fun applyImmersiveMode() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            window.attributes = window.attributes.apply {
                layoutInDisplayCutoutMode = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                    WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_ALWAYS
                } else {
                    WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES
                }
            }
        }
        val windowInsetsController = WindowCompat.getInsetsController(window, window.decorView)
        windowInsetsController.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        windowInsetsController.hide(WindowInsetsCompat.Type.systemBars())

        @Suppress("DEPRECATION")
        window.decorView.systemUiVisibility = (
            View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN
        )
    }

    override fun onResume() {
        super.onResume()
        applyImmersiveMode()
        enablePhoneGameBoosterIntegration()
        checkAndRequestStoragePermission()
        me.magnum.melonds.MelonDSApplication.migrateStorageToRoot(this)
        val pendingPath = pendingUpdateApkPath
        if (pendingPath != null) {
            val installManager = GitHubUpdateInstallManager(applicationContext)
            if (installManager.canRequestPackageInstalls()) {
                pendingUpdateApkPath = null
                if (!installManager.openInstaller(java.io.File(pendingPath))) {
                    Toast.makeText(this, R.string.update_download_failed, Toast.LENGTH_LONG).show()
                }
            }
        }
        lifecycleScope.launch(kotlinx.coroutines.Dispatchers.IO) {
            settingsBackupManager.syncExternalSettingsIfModified(force = false)
        }
    }

    private fun enablePhoneGameBoosterIntegration() {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                display?.supportedModes?.maxByOrNull { it.refreshRate }?.let { maxMode ->
                    window.attributes = window.attributes.apply {
                        preferredDisplayModeId = maxMode.modeId
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                val gameManager = getSystemService(android.app.GameManager::class.java)
                gameManager?.setGameState(
                    android.app.GameState(false, android.app.GameState.MODE_GAMEPLAY_UNINTERRUPTIBLE)
                )
            }
        } catch (_: Throwable) {}
    }

    private fun checkAndRequestStoragePermission() {
        val prefs = androidx.preference.PreferenceManager.getDefaultSharedPreferences(this)
        if (!hasPromptedStoragePermissionThisSession) {
            hasPromptedStoragePermissionThisSession = true
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                if (!android.os.Environment.isExternalStorageManager()) {
                    val alreadyPromptedAllFiles = prefs.getBoolean("storage_all_files_prompted", false)
                    if (!alreadyPromptedAllFiles) {
                        prefs.edit().putBoolean("storage_all_files_prompted", true).apply()
                        val intent = Intent(android.provider.Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION).apply {
                            data = android.net.Uri.parse("package:$packageName")
                        }
                        if (runCatching { startActivity(intent) }.isFailure) {
                            runCatching {
                                startActivity(Intent(android.provider.Settings.ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION))
                            }
                        }
                        return
                    }
                }
            } else {
                val writeGranted = androidx.core.content.ContextCompat.checkSelfPermission(
                    this,
                    android.Manifest.permission.WRITE_EXTERNAL_STORAGE
                ) == android.content.pm.PackageManager.PERMISSION_GRANTED
                if (!writeGranted) {
                    val alreadyPromptedLegacy = prefs.getBoolean("storage_legacy_prompted", false)
                    if (!alreadyPromptedLegacy) {
                        prefs.edit().putBoolean("storage_legacy_prompted", true).apply()
                        androidx.core.app.ActivityCompat.requestPermissions(
                            this,
                            arrayOf(
                                android.Manifest.permission.READ_EXTERNAL_STORAGE,
                                android.Manifest.permission.WRITE_EXTERNAL_STORAGE
                            ),
                            1001
                        )
                        return
                    }
                }
            }
        }
        if (!hasPromptedNotificationPermissionThisSession && Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            hasPromptedNotificationPermissionThisSession = true
            val notifGranted = androidx.core.content.ContextCompat.checkSelfPermission(
                this,
                android.Manifest.permission.POST_NOTIFICATIONS
            ) == android.content.pm.PackageManager.PERMISSION_GRANTED
            if (!notifGranted) {
                val alreadyPromptedNotif = prefs.getBoolean("notifications_permission_prompted", false)
                if (!alreadyPromptedNotif) {
                    prefs.edit().putBoolean("notifications_permission_prompted", true).apply()
                    androidx.core.app.ActivityCompat.requestPermissions(
                        this,
                        arrayOf(android.Manifest.permission.POST_NOTIFICATIONS),
                        1002
                    )
                }
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray,
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 1001) {
            val granted = grantResults.isNotEmpty() && grantResults.all { it == android.content.pm.PackageManager.PERMISSION_GRANTED }
            if (!granted) {
                Toast.makeText(this, R.string.rom_search_dir_saf_fallback_hint, Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            applyImmersiveMode()
        }
    }
}
