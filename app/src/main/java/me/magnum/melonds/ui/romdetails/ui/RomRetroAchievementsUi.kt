package me.magnum.melonds.ui.romdetails.ui

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
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
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.foundation.text.appendInlineContent
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.sp
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Divider
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.PlaceholderVerticalAlign
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.retroachievements.RAUserAchievement
import me.magnum.melonds.ui.common.MelonPreviewSet
import me.magnum.melonds.ui.common.achievements.ui.AchievementFiltersRow
import me.magnum.melonds.ui.common.achievements.ui.AchievementStateFilter
import me.magnum.melonds.ui.common.achievements.ui.AchievementTypeFilter
import me.magnum.melonds.ui.common.achievements.ui.model.AchievementUiModel
import me.magnum.melonds.ui.common.melonButtonColors
import me.magnum.melonds.ui.romdetails.model.AchievementBucketUiModel
import me.magnum.melonds.ui.romdetails.model.AchievementSetUiModel
import me.magnum.melonds.ui.romdetails.model.OfflineAchievementsUiState
import me.magnum.melonds.ui.romdetails.model.RomAchievementsSummary
import me.magnum.melonds.ui.romdetails.model.RomRetroAchievementsUiState
import me.magnum.melonds.ui.romdetails.ui.preview.mockRAAchievementPreview
import me.magnum.melonds.ui.theme.MelonTheme
import me.magnum.melonds.ui.theme.watermelon
import me.magnum.rcheevosapi.model.RAAchievement
import me.magnum.rcheevosapi.model.RAAchievementSet
import java.net.URL

private const val SETS_TABS_ITEM_TYPE = "sets"
private const val HEADER_ITEM_TYPE = "header"
private const val FILTERS_ITEM_TYPE = "filters"
private const val BUCKET_HEADER_ITEM_TYPE = "bucket_header"
private const val ACHIEVEMENT_ITEM_TYPE = "achievement"
private const val LEDGER_EXPIRATION_DAY_MS = 24L * 60L * 60L * 1000L

@Composable
fun RomRetroAchievementsUi(
    modifier: Modifier,
    contentPadding: PaddingValues,
    retroAchievementsUiState: RomRetroAchievementsUiState,
    offlineAchievementsUiState: OfflineAchievementsUiState,
    onLogin: (username: String, password: String) -> Unit,
    onRetryLoad: () -> Unit,
    onViewAchievement: (RAAchievement) -> Unit,
    onSyncOfflineNow: () -> Unit,
    onViewLeaderboard: (me.magnum.rcheevosapi.model.RALeaderboard) -> Unit = {},
    onLoadLeaderboardRanking: suspend (me.magnum.rcheevosapi.model.RALeaderboard) -> Result<me.magnum.rcheevosapi.model.RALeaderboardRanking> = { Result.failure(UnsupportedOperationException()) },
    onAchievementFocused: (AchievementUiModel) -> Unit = {},
) {
    Column(modifier = modifier.padding(contentPadding)) {
        when (retroAchievementsUiState) {
            is RomRetroAchievementsUiState.LoggedOut -> LoggedOut(
                modifier = Modifier.weight(1f).fillMaxWidth(),
                state = retroAchievementsUiState,
                onLogin = onLogin,
            )
            is RomRetroAchievementsUiState.Loading -> Loading(Modifier.weight(1f).fillMaxWidth())
            is RomRetroAchievementsUiState.Ready -> {
                if (!retroAchievementsUiState.hasAchievements()) {
                    NoAchievements(Modifier.weight(1f).fillMaxWidth())
                } else {
                    Box(modifier = Modifier.weight(1f).fillMaxWidth()) {
                        var detailAchievement by remember {
                            mutableStateOf<Pair<AchievementUiModel, Boolean>?>(null)
                        }
                        me.magnum.melonds.ui.emulator.ui.AchievementList(
                            modifier = Modifier.fillMaxSize(),
                            state = retroAchievementsUiState,
                            onAchievementSelected = { model, inLedger -> detailAchievement = model to inLedger },
                            onViewLeaderboard = onViewLeaderboard,
                            onLoadLeaderboardRanking = onLoadLeaderboardRanking,
                            onRetry = onRetryLoad,
                            onDismiss = {},
                            onAchievementFocused = onAchievementFocused,
                        )
                        detailAchievement?.let { (model, inLedger) ->
                            me.magnum.melonds.ui.emulator.ui.AchievementDetailOverlay(
                                achievementModel = model,
                                isInOfflineLedger = inLedger,
                                onClose = { detailAchievement = null },
                            )
                        }
                    }
                }
            }
            is RomRetroAchievementsUiState.LoginError -> LoginError(modifier = Modifier.weight(1f).fillMaxWidth(), onLogin = onLogin)
            is RomRetroAchievementsUiState.AchievementLoadError -> LoadError(modifier = Modifier.weight(1f).fillMaxWidth(), onRetry = onRetryLoad)
        }
    }
}

@Composable
fun OfflineAchievementsStatusUi(
    modifier: Modifier,
    state: OfflineAchievementsUiState,
    onSyncNow: () -> Unit,
) {
    val colors = watermelon
    val context = LocalContext.current

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        // Status Hero Banner
        val isEnabled = state.availability == OfflineAchievementsUiState.Availability.ENABLED
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(14.dp))
                .background(
                    Brush.horizontalGradient(
                        if (isEnabled) listOf(androidx.compose.ui.graphics.Color(0xFF064E3B), androidx.compose.ui.graphics.Color(0xFF022C22))
                        else listOf(androidx.compose.ui.graphics.Color(0xFF451A03), androidx.compose.ui.graphics.Color(0xFF1C1917))
                    )
                )
                .border(
                    1.dp,
                    if (isEnabled) androidx.compose.ui.graphics.Color(0xFF10B981).copy(alpha = 0.5f)
                    else androidx.compose.ui.graphics.Color(0xFFF59E0B).copy(alpha = 0.5f),
                    RoundedCornerShape(14.dp)
                )
                .padding(16.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(12.dp)
                        .clip(RoundedCornerShape(6.dp))
                        .background(if (isEnabled) androidx.compose.ui.graphics.Color(0xFF10B981) else androidx.compose.ui.graphics.Color(0xFFF59E0B))
                )
                Spacer(Modifier.width(10.dp))
                Column {
                    Text(
                        text = if (isEnabled) "ОФЛАЙН-СИСТЕМА RETROACHIEVEMENTS АКТИВНА" else "ОФЛАЙН-РЕЖИМ: ТРЕБУЕТСЯ ВХОД",
                        fontFamily = me.magnum.melonds.ui.theme.SpaceGrotesk,
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.5.sp,
                        color = androidx.compose.ui.graphics.Color.White
                    )
                    Text(
                        text = if (isEnabled) "Достижения сохраняются локально и синхронизируются при появлении сети" else "Войдите в аккаунт RetroAchievements для локального кэширования",
                        fontFamily = me.magnum.melonds.ui.theme.WatermelonMono,
                        fontSize = 9.5.sp,
                        color = androidx.compose.ui.graphics.Color.White.copy(alpha = 0.75f)
                    )
                }
            }
        }

        // Color Indicator Cards Grid
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // Softcore Pending Card (Cyan)
            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(12.dp))
                    .background(colors.surface)
                    .border(1.dp, androidx.compose.ui.graphics.Color(0xFF0284C7).copy(alpha = 0.35f), RoundedCornerShape(12.dp))
                    .padding(12.dp)
            ) {
                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(8.dp)
                                .clip(RoundedCornerShape(4.dp))
                                .background(androidx.compose.ui.graphics.Color(0xFF38BDF8))
                        )
                        Spacer(Modifier.width(6.dp))
                        Text(
                            text = "СОФТКОР",
                            fontFamily = me.magnum.melonds.ui.theme.SpaceGrotesk,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                            color = androidx.compose.ui.graphics.Color(0xFF38BDF8)
                        )
                    }
                    Spacer(Modifier.height(6.dp))
                    Text(
                        text = "${state.pendingSoftcoreUnlockCount} в очереди",
                        fontFamily = me.magnum.melonds.ui.theme.WatermelonMono,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = colors.text
                    )
                    Text(
                        text = "Ожидают отправки",
                        fontFamily = me.magnum.melonds.ui.theme.WatermelonMono,
                        fontSize = 8.5.sp,
                        color = colors.text3
                    )
                }
            }

            // Hardcore Ledger Card (Gold / Flame)
            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(12.dp))
                    .background(colors.surface)
                    .border(1.dp, androidx.compose.ui.graphics.Color(0xFFD97706).copy(alpha = 0.35f), RoundedCornerShape(12.dp))
                    .padding(12.dp)
            ) {
                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(8.dp)
                                .clip(RoundedCornerShape(4.dp))
                                .background(androidx.compose.ui.graphics.Color(0xFFFBBF24))
                        )
                        Spacer(Modifier.width(6.dp))
                        Text(
                            text = "ХАРДКОР ЛЕДЖЕР",
                            fontFamily = me.magnum.melonds.ui.theme.SpaceGrotesk,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                            color = androidx.compose.ui.graphics.Color(0xFFFBBF24)
                        )
                    }
                    Spacer(Modifier.height(6.dp))
                    Text(
                        text = "${state.pendingLedgerUnlockCount} записей",
                        fontFamily = me.magnum.melonds.ui.theme.WatermelonMono,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = colors.text
                    )
                    Text(
                        text = "Защищенный журнал",
                        fontFamily = me.magnum.melonds.ui.theme.WatermelonMono,
                        fontSize = 8.5.sp,
                        color = colors.text3
                    )
                }
            }
        }

        // Integrity & Expiration Info Card
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(colors.surface)
                .padding(14.dp)
        ) {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                // Integrity Indicator
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(8.dp)
                                .clip(RoundedCornerShape(4.dp))
                                .background(if (state.isLedgerIntegrityOk) androidx.compose.ui.graphics.Color(0xFF10B981) else androidx.compose.ui.graphics.Color(0xFFEF4444))
                        )
                        Spacer(Modifier.width(8.dp))
                        Text(
                            text = "Целостность журнала достижений",
                            fontFamily = me.magnum.melonds.ui.theme.SpaceGrotesk,
                            fontSize = 11.sp,
                            color = colors.text
                        )
                    }
                    Text(
                        text = if (state.isLedgerIntegrityOk) "ПОДТВЕРЖДЕНА (OK)" else "НАРУШЕНА",
                        fontFamily = me.magnum.melonds.ui.theme.WatermelonMono,
                        fontWeight = FontWeight.Bold,
                        fontSize = 10.sp,
                        color = if (state.isLedgerIntegrityOk) androidx.compose.ui.graphics.Color(0xFF10B981) else androidx.compose.ui.graphics.Color(0xFFEF4444)
                    )
                }

                // Expiration Indicator
                val expirationText = rememberLedgerExpirationText(state.ledgerExpiresInMs)
                if (expirationText != null) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .size(8.dp)
                                    .clip(RoundedCornerShape(4.dp))
                                    .background(if (state.isLedgerExpired) androidx.compose.ui.graphics.Color(0xFFEF4444) else androidx.compose.ui.graphics.Color(0xFFA855F7))
                            )
                            Spacer(Modifier.width(8.dp))
                            Text(
                                text = "Срок действия кэша",
                                fontFamily = me.magnum.melonds.ui.theme.SpaceGrotesk,
                                fontSize = 11.sp,
                                color = colors.text
                            )
                        }
                        Text(
                            text = expirationText,
                            fontFamily = me.magnum.melonds.ui.theme.WatermelonMono,
                            fontSize = 10.sp,
                            color = if (state.isLedgerExpired) androidx.compose.ui.graphics.Color(0xFFEF4444) else androidx.compose.ui.graphics.Color(0xFFA855F7)
                        )
                    }
                }
            }
        }

        if (state.isSyncing) {
            LinearProgressIndicator(
                modifier = Modifier.fillMaxWidth(),
                color = androidx.compose.ui.graphics.Color(0xFFFF0055)
            )
        }

        // Sync Action Button
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))
                .background(Brush.horizontalGradient(listOf(androidx.compose.ui.graphics.Color(0xFFFF0055), androidx.compose.ui.graphics.Color(0xFFBE123C))))
                .clickable(enabled = !state.isSyncing) {
                    onSyncNow()
                    Toast.makeText(context, "Синхронизация с сервером RetroAchievements выполнена", Toast.LENGTH_SHORT).show()
                }
                .padding(vertical = 12.dp),
            contentAlignment = Alignment.Center
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (state.isSyncing) {
                    CircularProgressIndicator(color = androidx.compose.ui.graphics.Color.White, modifier = Modifier.size(16.dp), strokeWidth = 2.dp)
                    Spacer(Modifier.width(8.dp))
                    Text(
                        text = "СИНХРОНИЗАЦИЯ...",
                        fontFamily = me.magnum.melonds.ui.theme.SpaceGrotesk,
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp,
                        color = androidx.compose.ui.graphics.Color.White
                    )
                } else {
                    Text(
                        text = "СИНХРОНИЗИРОВАТЬ С СЕРВЕРОМ СЕЙЧАС",
                        fontFamily = me.magnum.melonds.ui.theme.SpaceGrotesk,
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp,
                        color = androidx.compose.ui.graphics.Color.White
                    )
                }
            }
        }
    }
}

@Composable
private fun rememberLedgerExpirationText(expiresInMs: Long?): String? {
    if (expiresInMs == null) return null

    val context = LocalContext.current
    return remember(expiresInMs, context) {
        if (expiresInMs <= 0L) {
            context.getString(R.string.offline_ra_ledger_expired)
        } else {
            val days = ((expiresInMs + LEDGER_EXPIRATION_DAY_MS - 1L) / LEDGER_EXPIRATION_DAY_MS)
                .coerceAtLeast(1L)
                .toInt()
            context.resources.getQuantityString(R.plurals.offline_ra_ledger_expires_days, days, days)
        }
    }
}

@Composable
private fun StatusLine(text: String, highlight: Boolean = false) {
    Text(
        text = text,
        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 4.dp),
        style = MaterialTheme.typography.body2,
        color = if (highlight) MaterialTheme.colors.secondary else MaterialTheme.colors.onSurface.copy(alpha = 0.85f),
        fontWeight = if (highlight) FontWeight.SemiBold else FontWeight.Normal,
    )
}

@Composable
private fun LoggedOut(
    modifier: Modifier,
    state: RomRetroAchievementsUiState.LoggedOut,
    onLogin: (username: String, password: String) -> Unit,
) {
    var showLoginPopup by rememberSaveable {
        mutableStateOf(false)
    }

    Box(
        modifier = modifier.padding(32.dp),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = stringResource(id = R.string.retro_achievements_login_description),
                textAlign = TextAlign.Center,
            )

            Button(
                onClick = { showLoginPopup = true },
                colors = melonButtonColors(),
            ) {
                Text(
                    text = stringResource(id = R.string.login_with_retro_achievements).uppercase(),
                    textAlign = TextAlign.Center,
                )
            }
        }
    }

    if (showLoginPopup) {
        RetroAchievementsLoginDialog(
            existingUsername = state.existingUsername,
            onDismiss = { showLoginPopup = false },
            onLogin = { username, password ->
                onLogin(username, password)
                showLoginPopup = false
            },
        )
    }
}

@Composable
private fun Loading(modifier: Modifier) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center,
    ) {
        CircularProgressIndicator(color = MaterialTheme.colors.secondary)
    }
}

@Composable
private fun NoAchievements(modifier: Modifier) {
    Box(
        modifier = modifier.padding(32.dp),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            modifier = Modifier.focusable(),
            text = stringResource(id = R.string.retro_achievements_no_achievements),
            textAlign = TextAlign.Center,
        )
    }
}

@Composable
private fun Ready(
    modifier: Modifier,
    contentPadding: PaddingValues,
    content: RomRetroAchievementsUiState.Ready,
    onViewAchievement: (RAAchievement) -> Unit,
) {
    if (content.sets.isEmpty()) {
        NoAchievements(modifier)
        return
    }

    var selectedSetId by rememberSaveable {
        mutableLongStateOf(content.sets.first().setId)
    }
    var selectedTypeFilter by rememberSaveable {
        mutableStateOf(AchievementTypeFilter.All)
    }
    var selectedStateFilter by rememberSaveable {
        mutableStateOf(AchievementStateFilter.All)
    }
    LaunchedEffect(content.sets) {
        if (content.sets.none { it.setId == selectedSetId }) {
            selectedSetId = content.sets.first().setId
        }
    }
    val selectedSet = remember(content.sets, selectedSetId) {
        content.sets.firstOrNull { it.setId == selectedSetId } ?: content.sets.first()
    }
    val availableStateFilters = remember(selectedSet) {
        buildList {
            add(AchievementStateFilter.All)
            addAll(
                selectedSet.buckets
                    .map { AchievementStateFilter.fromBucket(it.bucket) }
                    .distinct()
                    .sortedBy { it.displayOrder },
            )
        }
    }
    LaunchedEffect(availableStateFilters) {
        if (selectedStateFilter !in availableStateFilters) {
            selectedStateFilter = AchievementStateFilter.All
        }
    }
    val filteredBuckets = remember(selectedSet, selectedTypeFilter, selectedStateFilter) {
        selectedSet.buckets
            .asSequence()
            .filter { selectedStateFilter.matches(it.bucket) }
            .map { bucket ->
                bucket.copy(
                    achievements = bucket.achievements.filter {
                        selectedTypeFilter.matches(it.actualAchievement().type)
                    },
                )
            }
            .filter { it.achievements.isNotEmpty() }
            .toList()
    }

    val layoutDirection = LocalLayoutDirection.current
    val listState = rememberLazyListState()
    LazyColumn(
        modifier = modifier.onKeyEvent { keyEvent ->
            if (keyEvent.type == KeyEventType.KeyDown) {
                val indexOffset = when (keyEvent.key) {
                    Key.ButtonL2 -> -1
                    Key.ButtonR2 -> 1
                    else -> 0
                }.let {
                    // Flip offset direction for RTL layouts
                    if (layoutDirection == LayoutDirection.Ltr) it else -it
                }

                val selectedSetIndex = content.sets.indexOfFirst { it.setId == selectedSetId }
                if (indexOffset != 0 && selectedSetIndex + indexOffset in content.sets.indices) {
                    selectedSetId = content.sets[selectedSetIndex + indexOffset].setId
                    true
                } else {
                    false
                }
            } else {
                false
            }
        },
        state = listState,
        contentPadding = contentPadding,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        if (content.sets.size > 1) {
            item(contentType = SETS_TABS_ITEM_TYPE) {
                AchievementsMultiSetTabRow(
                    sets = content.sets,
                    selectedSetId = selectedSetId,
                    onSetSelected = { selectedSetId = it },
                )
            }
        }

        item(contentType = HEADER_ITEM_TYPE) {
            Header(
                modifier = Modifier.fillMaxWidth().focusable(),
                achievementsSummary = selectedSet.setSummary,
            )
        }

        item(contentType = FILTERS_ITEM_TYPE) {
            AchievementFiltersRow(
                typeFilter = selectedTypeFilter,
                onTypeFilterChanged = { selectedTypeFilter = it },
                stateFilter = selectedStateFilter,
                availableStateFilters = availableStateFilters,
                onStateFilterChanged = { selectedStateFilter = it },
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 12.dp),
            )
        }

        if (filteredBuckets.isEmpty()) {
            item(contentType = ACHIEVEMENT_ITEM_TYPE) {
                Text(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 24.dp),
                    text = stringResource(id = R.string.retro_achievements_filter_no_results),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.body2,
                )
            }
        }

        filteredBuckets.forEachIndexed { index, bucket ->
            item(contentType = BUCKET_HEADER_ITEM_TYPE) {
                Text(
                    modifier = Modifier
                        .padding(
                            start = 20.dp,
                            top = if (index == 0) 8.dp else 20.dp,
                            end = 16.dp,
                            bottom = 8.dp,
                        )
                        .fillMaxWidth(),
                    text = getBucketTitle(bucket.bucket).uppercase(),
                    style = MaterialTheme.typography.caption,
                    color = MaterialTheme.colors.secondary,
                    fontWeight = FontWeight.SemiBold,
                )
            }

            items(
                items = bucket.achievements,
                contentType = { ACHIEVEMENT_ITEM_TYPE },
            ) { userAchievement ->
                RomAchievementUi(
                    modifier = Modifier.fillMaxWidth(),
                    achievementModel = userAchievement,
                    isInOfflineLedger = content.pendingLedgerAchievementIds.contains(userAchievement.actualAchievement().id),
                    onViewAchievement = { onViewAchievement(userAchievement.actualAchievement()) },
                )
            }
        }
    }
}

@Composable
private fun getBucketTitle(bucket: AchievementBucketUiModel.Bucket): String {
    return when (bucket) {
        AchievementBucketUiModel.Bucket.PendingSubmissions -> stringResource(R.string.retro_achievements_pending_unlocks)
        AchievementBucketUiModel.Bucket.ActiveChallenges -> stringResource(R.string.retro_achievements_active_challenges)
        AchievementBucketUiModel.Bucket.RecentlyUnlocked -> stringResource(R.string.retro_achievements_recently_unlokced)
        AchievementBucketUiModel.Bucket.Unsynced -> stringResource(R.string.retro_achievements_unsynced)
        AchievementBucketUiModel.Bucket.AlmostThere -> stringResource(R.string.retro_achievements_almost_there)
        AchievementBucketUiModel.Bucket.Locked -> stringResource(R.string.retro_achievements_locked)
        AchievementBucketUiModel.Bucket.Unsupported -> stringResource(R.string.retro_achievements_unsupported)
        AchievementBucketUiModel.Bucket.Unofficial -> stringResource(R.string.retro_achievements_unofficial)
        AchievementBucketUiModel.Bucket.Unlocked -> stringResource(R.string.retro_achievements_unlocked)
    }
}

@Composable
private fun Header(
    modifier: Modifier,
    achievementsSummary: RomAchievementsSummary,
) {
    Column(
        modifier = modifier.padding(horizontal = 20.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        androidx.compose.foundation.layout.Row(verticalAlignment = Alignment.Bottom) {
            Text(
                text = "${achievementsSummary.completedAchievements}",
                style = MaterialTheme.typography.h3,
                color = MaterialTheme.colors.secondary,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = " / ${achievementsSummary.totalAchievements}",
                style = MaterialTheme.typography.h5,
                color = MaterialTheme.colors.onSurface.copy(alpha = 0.6f),
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(bottom = 4.dp),
            )
            androidx.compose.foundation.layout.Spacer(Modifier.weight(1f))
            Text(
                text = if (achievementsSummary.forHardcoreMode) {
                    stringResource(id = R.string.ra_mode_hardcore).uppercase()
                } else {
                    stringResource(id = R.string.ra_mode_softcore).uppercase()
                },
                style = MaterialTheme.typography.caption,
                color = MaterialTheme.colors.secondary,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .clip(RoundedCornerShape(50))
                    .background(MaterialTheme.colors.secondary.copy(alpha = 0.15f))
                    .padding(horizontal = 10.dp, vertical = 4.dp),
            )
        }

        LinearProgressIndicator(
            modifier = Modifier
                .fillMaxWidth()
                .height(8.dp)
                .clip(RoundedCornerShape(50)),
            progress = achievementsSummary.completedAchievements / achievementsSummary.totalAchievements.toFloat(),
            color = MaterialTheme.colors.secondary,
            backgroundColor = MaterialTheme.colors.onSurface.copy(alpha = 0.10f),
        )

        Text(
            text = buildAnnotatedString {
                appendInlineContent("icon-points")
                append("  ")
                withStyle(SpanStyle(fontWeight = FontWeight.SemiBold)) {
                    append(achievementsSummary.totalPoints.toString())
                }
                append(' ')
                append(stringResource(id = R.string.points_abbreviated))
                append(" • ${achievementsSummary.completedPercentage}%")
            },
            style = MaterialTheme.typography.body2,
            color = MaterialTheme.colors.onSurface.copy(alpha = 0.85f),
            inlineContent = mapOf(
                "icon-points" to InlineTextContent(Placeholder(MaterialTheme.typography.body2.fontSize, MaterialTheme.typography.body2.fontSize, PlaceholderVerticalAlign.Center)) {
                    Image(
                        modifier = Modifier.fillMaxSize(),
                        painter = painterResource(id = R.drawable.ic_points),
                        contentDescription = null,
                    )
                }
            )
        )
    }
}

@Composable
private fun LoginError(
    modifier: Modifier,
    onLogin: (username: String, password: String) -> Unit,
) {
    var showLoginPopup by remember {
        mutableStateOf(false)
    }

    Box(
        modifier = modifier.padding(32.dp),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = stringResource(id = R.string.retro_achievements_login_error),
                textAlign = TextAlign.Center,
            )

            Button(
                onClick = { showLoginPopup = true },
                colors = melonButtonColors(),
            ) {
                Text(text = stringResource(id = R.string.login_with_retro_achievements).uppercase())
            }
        }
    }

    if (showLoginPopup) {
        RetroAchievementsLoginDialog(
            existingUsername = null,
            onDismiss = { showLoginPopup = false },
            onLogin = { username, password ->
                onLogin(username, password)
                showLoginPopup = false
            },
        )
    }
}

@Composable
private fun LoadError(
    modifier: Modifier,
    onRetry: () -> Unit,
) {
    Box(
        modifier = modifier.padding(32.dp),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = stringResource(id = R.string.retro_achievements_load_error),
                textAlign = TextAlign.Center,
            )

            Button(
                onClick = onRetry,
                colors = melonButtonColors(),
            ) {
                Text(text = stringResource(id = R.string.retry).uppercase())
            }
        }
    }
}

@MelonPreviewSet
@Composable
private fun PreviewContent() {
    MelonTheme {
        Ready(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(0.dp),
            content = RomRetroAchievementsUiState.Ready(
                listOf(
                    AchievementSetUiModel(
                        setId = 1,
                        setTitle = null,
                        setType = RAAchievementSet.Type.Core,
                        setIcon = URL("http://example.com/icon.png"),
                        setSummary = RomAchievementsSummary(true, 50, 20, 85),
                        buckets = listOf(
                            AchievementBucketUiModel(
                                bucket = AchievementBucketUiModel.Bucket.Locked,
                                achievements = listOf(
                                    AchievementUiModel.UserAchievementUiModel(RAUserAchievement(mockRAAchievementPreview(id = 1), false, false)),
                                    AchievementUiModel.UserAchievementUiModel(RAUserAchievement(mockRAAchievementPreview(id = 2, title = "This is another amazing achievement", description = "But this one cannot be missed."), false, false)),
                                ),
                            )
                        ),
                        leaderboards = emptyList(),
                    ),
                    AchievementSetUiModel(
                        setId = 2,
                        setTitle = "Special Challenge",
                        setType = RAAchievementSet.Type.Bonus,
                        setIcon = URL("http://example.com/icon.png"),
                        setSummary = RomAchievementsSummary(true, 20, 4, 12),
                        buckets = listOf(
                            AchievementBucketUiModel(
                                bucket = AchievementBucketUiModel.Bucket.Locked,
                                achievements = listOf(
                                    AchievementUiModel.UserAchievementUiModel(RAUserAchievement(mockRAAchievementPreview(id = 1), false, false)),
                                    AchievementUiModel.UserAchievementUiModel(RAUserAchievement(mockRAAchievementPreview(id = 2, title = "This is a subset achievement", description = "This is part of the special subset"), false, false)),
                                ),
                            )
                        ),
                        leaderboards = emptyList(),
                    ),
                ),
            ),
            onViewAchievement = {},
        )
    }
}

@MelonPreviewSet
@Composable
private fun PreviewLoggedOut() {
    MelonTheme {
        LoggedOut(
            modifier = Modifier.fillMaxSize(),
            state = RomRetroAchievementsUiState.LoggedOut(null),
            onLogin = { _, _ -> },
        )
    }
}

@MelonPreviewSet
@Composable
private fun PreviewLoginError() {
    MelonTheme {
        LoginError(
            modifier = Modifier.fillMaxSize(),
            onLogin = { _, _ -> },
        )
    }
}

@MelonPreviewSet
@Composable
private fun PreviewLoadError() {
    MelonTheme {
        LoadError(
            modifier = Modifier.fillMaxSize(),
            onRetry = { },
        )
    }
}
