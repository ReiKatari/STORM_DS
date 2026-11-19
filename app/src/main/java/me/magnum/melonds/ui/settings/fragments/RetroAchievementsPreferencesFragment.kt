package me.magnum.melonds.ui.settings.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Error
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material.icons.filled.Wifi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.preference.Preference
import androidx.preference.ListPreference
import androidx.preference.SwitchPreference
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import me.magnum.melonds.R
import me.magnum.melonds.extensions.addOnPreferenceChangeListener
import me.magnum.melonds.ui.common.LoadingDialog
import me.magnum.melonds.ui.emulator.ui.popup.RetroAchievementsSoundPlayer
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider
import me.magnum.melonds.ui.settings.SettingsActivity
import me.magnum.melonds.ui.settings.dialogs.SettingsDialogScaffold
import me.magnum.melonds.ui.settings.flow.observeAsFlow
import me.magnum.melonds.ui.settings.model.RetroAchievementsAccountState
import me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference
import me.magnum.melonds.ui.settings.viewmodel.RetroAchievementsSettingsViewModel
import me.magnum.melonds.ui.theme.AppThemeManager
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonColors
import me.magnum.melonds.common.retroachievements.RetroAchievementsEndpointProvider
import me.magnum.melonds.common.retroachievements.RetroAchievementsEndpointSnapshot
import javax.inject.Inject

@AndroidEntryPoint
class RetroAchievementsPreferencesFragment : BasePreferenceFragment(), PreferenceFragmentTitleProvider {

    private val viewModel by viewModels<RetroAchievementsSettingsViewModel>()

    @Inject
    lateinit var endpointProvider: RetroAchievementsEndpointProvider

    private var loginProgressDialog: LoadingDialog? = null

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.pref_retroachievements, rootKey)

        val accountPreference = findPreference<Preference>("ra_login")!!
        val profilePreference = findPreference<RetroAchievementsProfilePreference>("ra_profile")!!
        val retroAchievementsEnabledPreference = findPreference<SwitchPreference>("ra_enabled")!!
        val hardcoreModePreference = findPreference<SwitchPreference>("ra_hardcore_enabled")!!
        hardcoreModePreference.summary = getString(R.string.v780_ra_hardcore_mode_detailed_summary)
        val richPresencePreference = findPreference<SwitchPreference>("ra_rich_presence")!!
        retroAchievementsEnabledPreference.isVisible = false
        richPresencePreference.isVisible = false
        val offlineBackendPreference = findPreference<ListPreference>("ra_offline_backend")!!
        val builtInOfflinePreference = findPreference<SwitchPreference>("ra_offline_softcore_enabled")!!
        val notificationSoundPreference = findPreference<ListPreference>("ra_notification_sound")!!
        val syncPendingPreference = findPreference<Preference>("ra_sync_pending_submissions")!!
        val testConnectionPreference = findPreference<Preference>("ra_test_connection")!!
        val integrationPreferences = listOf(
            hardcoreModePreference,
            findPreference<SwitchPreference>("ra_unofficial_enabled")!!,
            findPreference<SwitchPreference>("ra_encore_enabled")!!,
            offlineBackendPreference,
            builtInOfflinePreference,
            findPreference<SwitchPreference>("ra_active_challenge_indicators")!!,
            findPreference<SwitchPreference>("ra_progress_indicators")!!,
            findPreference<SwitchPreference>("ra_leaderboard_indicators")!!,
        )

        hardcoreModePreference.addOnPreferenceChangeListener { _, newValue ->
            val isEnabled = newValue as Boolean
            if (!endpointProvider.allowHardcoreUserChoice(isEnabled)) {
                Toast.makeText(
                    requireContext(),
                    R.string.ra_offline_proxy_hardcore_not_supported,
                    Toast.LENGTH_LONG,
                ).show()
                return@addOnPreferenceChangeListener false
            }

            richPresencePreference.isVisible = !isEnabled
            if (isEnabled) {
                richPresencePreference.isChecked = true
            }
            true
        }

        offlineBackendPreference.addOnPreferenceChangeListener { _, newValue ->
            val backend = me.magnum.melonds.domain.model.retroachievements.RetroAchievementsOfflineBackend
                .fromPreference(newValue as? String)
            endpointProvider.setSelectedBackend(backend)
            if (backend == me.magnum.melonds.domain.model.retroachievements.RetroAchievementsOfflineBackend.RA_OFFLINE_PROXY &&
                endpointProvider.currentSnapshot().apiUrl == null
            ) {
                Toast.makeText(
                    requireContext(),
                    R.string.ra_offline_proxy_not_active,
                    Toast.LENGTH_LONG,
                ).show()
            }
            true
        }

        accountPreference.setOnPreferenceClickListener {
            val accountState = viewModel.accountState.value
            val runtimeIdentityLocked = requireActivity().intent.getBooleanExtra(
                SettingsActivity.KEY_RA_RUNTIME_IDENTITY_LOCKED,
                false,
            )
            when (accountState) {
                is RetroAchievementsAccountState.LoggedIn -> showLogoutConfirmationDialog()
                is RetroAchievementsAccountState.LoginExpired -> {
                    if (runtimeIdentityLocked) {
                        showInGameAccountChangeBlockedDialog()
                    } else {
                        showLoginDialog(accountState.existingUsername)
                    }
                }
                RetroAchievementsAccountState.LoggedOut -> {
                    if (runtimeIdentityLocked) {
                        showInGameAccountChangeBlockedDialog()
                    } else {
                        showLoginDialog(null)
                    }
                }
                RetroAchievementsAccountState.Unknown -> {
                    // Do nothing until a proper state is known
                }
            }
            true
        }

        lifecycleScope.launch {
            lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.accountState.collect {
                    when (it) {
                        is RetroAchievementsAccountState.LoggedIn -> {
                            accountPreference.title = getString(R.string.retroachievements_logout)
                            accountPreference.summary = getString(R.string.retroachievements_login_status, it.accountName)
                            accountPreference.notifyDependencyChange(false)
                        }
                        is RetroAchievementsAccountState.LoginExpired -> {
                            accountPreference.title = getString(R.string.login)
                            accountPreference.summary = getString(R.string.retroachievements_login_expired_status)
                            accountPreference.notifyDependencyChange(true)
                        }
                        RetroAchievementsAccountState.LoggedOut -> {
                            accountPreference.title = getString(R.string.login_with_retro_achievements)
                            accountPreference.summary = getString(R.string.retroachievements_login_summary)
                            accountPreference.notifyDependencyChange(true)
                        }
                        RetroAchievementsAccountState.Unknown -> {
                            accountPreference.title = getString(R.string.ellipsis)
                            accountPreference.summary = getString(R.string.ellipsis)
                            accountPreference.notifyDependencyChange(true)
                        }
                    }
                }
            }
        }

        lifecycleScope.launch {
            lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.accountState.combine(viewModel.userProfile) { accountState, profile ->
                    profile?.takeIf {
                        accountState is RetroAchievementsAccountState.LoggedIn &&
                            accountState.accountName == it.username
                    }
                }.collect(profilePreference::setProfile)
            }
        }

        lifecycleScope.launch {
            lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                val isLoggedInFlow = viewModel.accountState.map { it is RetroAchievementsAccountState.LoggedIn }
                combine(
                    isLoggedInFlow,
                    retroAchievementsEnabledPreference.observeAsFlow(),
                    hardcoreModePreference.observeAsFlow(),
                    endpointProvider.snapshot,
                ) { isLoggedIn, isRetroAchievementsEnabled, isHardcoreEnabled, endpoint ->
                    EndpointPreferenceState(
                        isLoggedIn,
                        isRetroAchievementsEnabled,
                        isHardcoreEnabled,
                        endpoint,
                    )
                }.collect { state ->
                    val isLoggedIn = state.isLoggedIn
                    val isRetroAchievementsEnabled = state.isRetroAchievementsEnabled
                    val isHardcoreEnabled = state.isHardcoreEnabled
                    retroAchievementsEnabledPreference.isVisible = isLoggedIn
                    val integrationOptionsEnabled = isLoggedIn && isRetroAchievementsEnabled
                    integrationPreferences.forEach { preference ->
                        preference.isVisible = integrationOptionsEnabled
                    }
                    val builtInEffective =
                        state.endpoint.backendEffective ==
                            me.magnum.melonds.domain.model.retroachievements.RetroAchievementsOfflineBackend.BUILT_IN
                    hardcoreModePreference.isVisible = integrationOptionsEnabled && builtInEffective
                    builtInOfflinePreference.isVisible = integrationOptionsEnabled && builtInEffective
                    richPresencePreference.isVisible =
                        integrationOptionsEnabled && !isHardcoreEnabled && builtInEffective
                    val selectedIdx = offlineBackendPreference.findIndexOfValue(offlineBackendPreference.value)
                    val selectedEntry = if (selectedIdx >= 0 && selectedIdx < offlineBackendPreference.entries.size) {
                        offlineBackendPreference.entries[selectedIdx].toString()
                    } else {
                        null
                    }
                    val statusSummary = when (state.endpoint.hostSource) {
                        RetroAchievementsEndpointSnapshot.HostSource.OFFICIAL ->
                            getString(R.string.ra_offline_backend_summary)
                        RetroAchievementsEndpointSnapshot.HostSource.RA_OFFLINE_PROXY ->
                            getString(R.string.ra_offline_proxy_active_summary)
                        RetroAchievementsEndpointSnapshot.HostSource.RA_OFFLINE_PROXY_UNAVAILABLE ->
                            getString(R.string.ra_offline_proxy_not_active)
                    }
                    offlineBackendPreference.summary = if (selectedEntry != null) {
                        "$selectedEntry - $statusSummary"
                    } else {
                        statusSummary
                    }
                }
            }
        }

        lifecycleScope.launch {
            lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.loggingIn.collect { loggingIn ->
                    loginProgressDialog = if (loggingIn) {
                        LoadingDialog(requireContext()).apply {
                            show()
                        }
                    } else {
                        loginProgressDialog?.dismiss()
                        null
                    }
                }
            }
        }

        lifecycleScope.launch {
            lifecycle.repeatOnLifecycle(Lifecycle.State.RESUMED) {
                viewModel.loginErrorEvent.collect {
                    Toast.makeText(requireContext(), R.string.retro_achievements_login_error_short, Toast.LENGTH_LONG).show()
                }
            }
        }

        notificationSoundPreference.addOnPreferenceChangeListener { _, newValue ->
            RetroAchievementsSoundPlayer.play(newValue as? String)
            true
        }

        syncPendingPreference.setOnPreferenceClickListener {
            val accountState = viewModel.accountState.value
            val runtimeIdentityLocked = requireActivity().intent.getBooleanExtra(
                SettingsActivity.KEY_RA_RUNTIME_IDENTITY_LOCKED,
                false,
            )
            when (accountState) {
                is RetroAchievementsAccountState.LoggedIn -> {
                    if (viewModel.pendingSubmissionsCount.value == 0) {
                        Toast.makeText(
                            requireContext(),
                            R.string.ra_sync_pending_all_synced_toast,
                            Toast.LENGTH_SHORT,
                        ).show()
                    } else {
                        viewModel.syncPendingSubmissions()
                    }
                }
                is RetroAchievementsAccountState.LoginExpired -> {
                    if (runtimeIdentityLocked) {
                        showInGameAccountChangeBlockedDialog()
                    } else {
                        Toast.makeText(
                            requireContext(),
                            R.string.ra_sync_pending_login_prompt,
                            Toast.LENGTH_SHORT,
                        ).show()
                        showLoginDialog(accountState.existingUsername)
                    }
                }
                RetroAchievementsAccountState.LoggedOut -> {
                    if (runtimeIdentityLocked) {
                        showInGameAccountChangeBlockedDialog()
                    } else {
                        Toast.makeText(
                            requireContext(),
                            R.string.ra_sync_pending_login_prompt,
                            Toast.LENGTH_SHORT,
                        ).show()
                        showLoginDialog(null)
                    }
                }
                RetroAchievementsAccountState.Unknown -> {
                    // Wait until state resolves
                }
            }
            true
        }

        lifecycleScope.launch {
            lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                combine(
                    viewModel.accountState,
                    viewModel.pendingSubmissionsCount,
                    viewModel.syncingPending,
                ) { accountState, pendingCount, syncing ->
                    Triple(accountState, pendingCount, syncing)
                }.collect { (accountState, pendingCount, syncing) ->
                    syncPendingPreference.isEnabled = !syncing
                    syncPendingPreference.summary = when {
                        syncing -> getString(R.string.ra_sync_pending_in_progress)
                        pendingCount > 0 -> getString(R.string.ra_sync_pending_summary_count, pendingCount)
                        accountState !is RetroAchievementsAccountState.LoggedIn ->
                            getString(R.string.ra_sync_pending_summary_login_required)
                        else -> getString(R.string.ra_sync_pending_summary_all_synced)
                    }
                }
            }
        }

        lifecycleScope.launch {
            lifecycle.repeatOnLifecycle(Lifecycle.State.RESUMED) {
                viewModel.syncPendingResultEvent.collect { summary ->
                    when {
                        summary.totalCount == 0 -> {
                            Toast.makeText(
                                requireContext(),
                                R.string.ra_sync_pending_all_synced_toast,
                                Toast.LENGTH_SHORT,
                            ).show()
                        }
                        summary.failedCount == 0 -> {
                            Toast.makeText(
                                requireContext(),
                                getString(R.string.ra_sync_pending_result_success, summary.succeededCount),
                                Toast.LENGTH_LONG,
                            ).show()
                        }
                        else -> {
                            val message = buildString {
                                append(getString(R.string.ra_sync_pending_result_partial, summary.succeededCount, summary.failedCount))
                                if (!summary.lastErrorMessage.isNullOrBlank()) {
                                    append("\n\n")
                                    append(getString(R.string.ra_sync_pending_result_error_detail, summary.lastErrorMessage))
                                }
                            }
                            Toast.makeText(
                                requireContext(),
                                getString(R.string.ra_sync_pending_result_partial, summary.succeededCount, summary.failedCount),
                                Toast.LENGTH_LONG,
                            ).show()
                            val ctx = context ?: return@collect
                            me.magnum.melonds.ui.settings.dialogs.showSettingsComposeDialog(ctx) { dismiss ->
                                me.magnum.melonds.ui.settings.dialogs.SettingsConfirmDialogContent(
                                    title = getString(R.string.ra_sync_pending_result_title),
                                    message = message,
                                    confirmText = getString(android.R.string.ok),
                                    onConfirm = {},
                                    onDismiss = dismiss,
                                )
                            }
                        }
                    }
                }
            }
        }

        testConnectionPreference.setOnPreferenceClickListener {
            showConnectionTestDialog()
            viewModel.testConnection()
            true
        }
    }

    override fun onDestroyView() {
        loginProgressDialog?.dismiss()
        loginProgressDialog = null
        super.onDestroyView()
    }

    private fun showLoginDialog(existingUsername: String?) {
        val ctx = context ?: return
        me.magnum.melonds.ui.settings.dialogs.showSettingsComposeDialog(ctx) { dismiss ->
            me.magnum.melonds.ui.settings.dialogs.SettingsRetroAchievementsLoginDialogContent(
                existingUsername = existingUsername,
                onLogin = { username, password ->
                    viewModel.login(username, password)
                },
                onDismiss = dismiss,
            )
        }
    }

    private fun showLogoutConfirmationDialog() {
        val ctx = context ?: return
        val inGameRuntimeIdentityLocked =
            requireActivity().intent.getBooleanExtra(SettingsActivity.KEY_IN_GAME, false) &&
                requireActivity().intent.getBooleanExtra(
                    SettingsActivity.KEY_RA_RUNTIME_IDENTITY_LOCKED,
                    false,
                )
        val inGameLogoutSupported =
            inGameRuntimeIdentityLocked &&
                requireActivity().intent.getBooleanExtra(
                    SettingsActivity.KEY_RA_IN_GAME_LOGOUT_SUPPORTED,
                    false,
                )
        if (inGameRuntimeIdentityLocked && !inGameLogoutSupported) {
            showInGameAccountChangeBlockedDialog()
            return
        }
        val messageRes = if (inGameLogoutSupported) {
            R.string.retroachievements_logout_confirmation_in_game
        } else {
            R.string.retroachievements_logout_confirmation
        }
        me.magnum.melonds.ui.settings.dialogs.showSettingsComposeDialog(ctx) { dismiss ->
            me.magnum.melonds.ui.settings.dialogs.SettingsConfirmDialogContent(
                title = getString(R.string.retroachievements_logout),
                message = getString(messageRes),
                confirmText = getString(R.string.retroachievements_logout),
                cancelText = getString(R.string.cancel),
                isDestructive = true,
                onConfirm = {
                    if (inGameLogoutSupported) {
                        requireActivity().setResult(
                            Activity.RESULT_OK,
                            Intent().putExtra(SettingsActivity.KEY_RA_LOGOUT_REQUESTED, true),
                        )
                        requireActivity().finish()
                    } else {
                        viewModel.logoutFromRetroAchievements()
                    }
                },
                onDismiss = dismiss,
            )
        }
    }

    private fun showInGameAccountChangeBlockedDialog() {
        val ctx = context ?: return
        me.magnum.melonds.ui.settings.dialogs.showSettingsComposeDialog(ctx) { dismiss ->
            me.magnum.melonds.ui.settings.dialogs.SettingsConfirmDialogContent(
                title = getString(R.string.retroachievements),
                message = getString(R.string.retroachievements_account_change_blocked_in_game),
                confirmText = getString(android.R.string.ok),
                onConfirm = {},
                onDismiss = dismiss,
            )
        }
    }

    private fun showConnectionTestDialog() {
        val ctx = context ?: return
        me.magnum.melonds.ui.settings.dialogs.showSettingsComposeDialog(ctx) { dismiss ->
            val composeContext = LocalContext.current
            val colors = remember(composeContext) {
                AppThemeManager.getCurrentWatermelonColors(composeContext)
            }
            val state by viewModel.connectionTestState.collectAsState()

            val closeDialog = {
                viewModel.resetConnectionTestState()
                dismiss()
            }

            SettingsDialogScaffold(
                title = stringResource(R.string.ra_test_connection_dialog_title),
                icon = Icons.Filled.Wifi,
                onDismiss = closeDialog,
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .verticalScroll(rememberScrollState())
                        .padding(horizontal = 16.dp, vertical = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                ) {
                    when (val current = state) {
                        RetroAchievementsSettingsViewModel.RetroAchievementsConnectionTestState.Idle,
                        RetroAchievementsSettingsViewModel.RetroAchievementsConnectionTestState.Testing -> {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 20.dp),
                            ) {
                                CircularProgressIndicator(
                                    color = colors.green,
                                    modifier = Modifier.size(24.dp),
                                    strokeWidth = 2.5.dp,
                                )
                                Spacer(Modifier.width(12.dp))
                                Text(
                                    text = stringResource(R.string.ra_test_connection_checking),
                                    color = colors.text,
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Medium,
                                )
                            }
                        }
                        is RetroAchievementsSettingsViewModel.RetroAchievementsConnectionTestState.Result -> {
                            val reachabilityValue = if (current.isReachable) {
                                stringResource(R.string.ra_test_connection_reachable_fmt, current.latencyMs ?: 0L)
                            } else {
                                stringResource(
                                    R.string.ra_test_connection_unreachable_fmt,
                                    current.reachabilityError ?: "Error",
                                )
                            }
                            ConnectionDiagnosticRow(
                                label = stringResource(R.string.ra_test_connection_label_reachability),
                                value = "$reachabilityValue (${current.targetUrl})",
                                statusIcon = if (current.isReachable) Icons.Filled.CheckCircle else Icons.Filled.Error,
                                statusColor = if (current.isReachable) colors.green else colors.red,
                                colors = colors,
                            )

                            val (authText, authIcon, authColor) = when (val auth = current.authState) {
                                is RetroAchievementsSettingsViewModel.AuthCheckState.Authenticated -> {
                                    if (auth.hasToken) {
                                        Triple(
                                            stringResource(R.string.ra_test_connection_auth_ok_fmt, auth.username),
                                            Icons.Filled.CheckCircle,
                                            colors.green,
                                        )
                                    } else {
                                        Triple(
                                            stringResource(R.string.ra_test_connection_auth_expired_fmt, auth.username),
                                            Icons.Filled.Warning,
                                            WatermelonColors.gold,
                                        )
                                    }
                                }
                                is RetroAchievementsSettingsViewModel.AuthCheckState.Expired -> Triple(
                                    stringResource(R.string.ra_test_connection_auth_expired_fmt, auth.username),
                                    Icons.Filled.Warning,
                                    WatermelonColors.gold,
                                )
                                RetroAchievementsSettingsViewModel.AuthCheckState.NotSignedIn -> Triple(
                                    stringResource(R.string.ra_test_connection_auth_none),
                                    Icons.Filled.Warning,
                                    WatermelonColors.gold,
                                )
                            }
                            ConnectionDiagnosticRow(
                                label = stringResource(R.string.ra_test_connection_label_account),
                                value = authText,
                                statusIcon = authIcon,
                                statusColor = authColor,
                                colors = colors,
                            )

                            val (proxyText, proxyIcon, proxyColor) = when (val proxy = current.proxyStatus) {
                                RetroAchievementsSettingsViewModel.ProxyCheckState.Direct -> Triple(
                                    stringResource(R.string.ra_test_connection_proxy_direct),
                                    Icons.Filled.CheckCircle,
                                    colors.green,
                                )
                                is RetroAchievementsSettingsViewModel.ProxyCheckState.ProxyActive -> Triple(
                                    stringResource(R.string.ra_test_connection_proxy_active_fmt, proxy.hostUrl),
                                    Icons.Filled.CheckCircle,
                                    colors.green,
                                )
                                RetroAchievementsSettingsViewModel.ProxyCheckState.ProxyUnavailable -> Triple(
                                    stringResource(R.string.ra_test_connection_proxy_unavailable),
                                    Icons.Filled.Warning,
                                    WatermelonColors.gold,
                                )
                            }
                            ConnectionDiagnosticRow(
                                label = stringResource(R.string.ra_test_connection_label_proxy),
                                value = proxyText,
                                statusIcon = proxyIcon,
                                statusColor = proxyColor,
                                colors = colors,
                            )

                            Spacer(Modifier.height(4.dp))

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(10.dp),
                            ) {
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .clip(RoundedCornerShape(12.dp))
                                        .background(colors.surface2)
                                        .border(1.dp, colors.line, RoundedCornerShape(12.dp))
                                        .clickable { viewModel.testConnection() }
                                        .padding(vertical = 12.dp),
                                    contentAlignment = Alignment.Center,
                                ) {
                                    Text(
                                        text = stringResource(R.string.ra_test_connection_retest),
                                        color = colors.text,
                                        fontFamily = SpaceGrotesk,
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Bold,
                                    )
                                }

                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .clip(RoundedCornerShape(12.dp))
                                        .background(colors.green)
                                        .clickable { closeDialog() }
                                        .padding(vertical = 12.dp),
                                    contentAlignment = Alignment.Center,
                                ) {
                                    Text(
                                        text = stringResource(R.string.ra_test_connection_close),
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
            }
        }
    }

    @Composable
    private fun ConnectionDiagnosticRow(
        label: String,
        value: String,
        statusIcon: ImageVector,
        statusColor: Color,
        colors: WatermelonColors,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(colors.surface2)
                .border(1.dp, colors.line, RoundedCornerShape(12.dp))
                .padding(horizontal = 14.dp, vertical = 12.dp),
        ) {
            Icon(
                imageVector = statusIcon,
                contentDescription = null,
                tint = statusColor,
                modifier = Modifier.size(20.dp),
            )
            Spacer(Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = label,
                    color = colors.text2,
                    fontFamily = SpaceGrotesk,
                    fontSize = 11.5.sp,
                    fontWeight = FontWeight.SemiBold,
                )
                Text(
                    text = value,
                    color = colors.text,
                    fontFamily = SpaceGrotesk,
                    fontSize = 13.5.sp,
                    fontWeight = FontWeight.Medium,
                )
            }
        }
    }

    override fun getTitle() = getString(R.string.retroachievements)

    private data class EndpointPreferenceState(
        val isLoggedIn: Boolean,
        val isRetroAchievementsEnabled: Boolean,
        val isHardcoreEnabled: Boolean,
        val endpoint: RetroAchievementsEndpointSnapshot,
    )
}
