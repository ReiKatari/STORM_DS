package me.magnum.melonds.ui.sgw

import android.text.format.Formatter
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.CloudDownload
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.SystemUpdateAlt
import androidx.compose.material.icons.filled.Translate
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.R
import me.magnum.melonds.sgw.SgwCatalogSnapshot
import me.magnum.melonds.sgw.SgwDownloadProgress
import me.magnum.melonds.sgw.SgwGameEntry
import me.magnum.melonds.sgw.SgwReplaceResult
import me.magnum.melonds.sgw.SgwUpdateCandidate
import me.magnum.melonds.sgw.SgwUpdateReason
import me.magnum.melonds.ui.theme.watermelon

@Composable
fun StormGamesWorldScreen(
    snapshot: SgwCatalogSnapshot,
    isLoading: Boolean,
    selectedTab: SgwStoreTab,
    searchQuery: String,
    downloadProgress: SgwDownloadProgress?,
    isBusy: Boolean = downloadProgress != null,
    highlightedRomUri: String? = null,
    lastReplaceResult: SgwReplaceResult?,
    onBack: () -> Unit,
    onSelectTab: (SgwStoreTab) -> Unit,
    onSearchChange: (String) -> Unit,
    onRefresh: () -> Unit,
    onDownloadEntry: (SgwGameEntry) -> Unit,
    onUpdateRom: (SgwUpdateCandidate) -> Unit,
    onCancelDownload: () -> Unit,
    onDismissResult: () -> Unit,
) {
    val colors = watermelon
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colors.bg)
            .statusBarsPadding()
            .navigationBarsPadding(),
    ) {
        // Header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .padding(horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            IconButton(onClick = onBack) {
                Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null, tint = colors.text)
            }
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = stringResource(R.string.sgw_store_title),
                    color = colors.text,
                    fontWeight = FontWeight.Bold,
                    fontSize = 17.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
                Text(
                    text = stringResource(R.string.sgw_store_subtitle),
                    color = colors.text2,
                    fontSize = 11.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            IconButton(onClick = onRefresh, enabled = !isLoading) {
                Icon(Icons.Filled.Refresh, contentDescription = null, tint = colors.text2)
            }
        }

        // Search input
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 6.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(colors.surface)
                .border(1.dp, colors.line, RoundedCornerShape(10.dp))
                .padding(horizontal = 12.dp, vertical = 9.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(Icons.Filled.Search, contentDescription = null, tint = colors.text3, modifier = Modifier.size(18.dp))
            Spacer(Modifier.width(8.dp))
            Box(modifier = Modifier.weight(1f)) {
                if (searchQuery.isEmpty()) {
                    Text(
                        text = stringResource(R.string.sgw_search_hint),
                        color = colors.text3,
                        fontSize = 14.sp,
                    )
                }
                BasicTextField(
                    value = searchQuery,
                    onValueChange = onSearchChange,
                    singleLine = true,
                    textStyle = TextStyle(color = colors.text, fontSize = 14.sp),
                    cursorBrush = SolidColor(colors.red),
                    modifier = Modifier.fillMaxWidth(),
                )
            }
            if (searchQuery.isNotEmpty()) {
                Icon(
                    Icons.Filled.Close,
                    contentDescription = null,
                    tint = colors.text3,
                    modifier = Modifier.size(18.dp).clickable { onSearchChange("") },
                )
            }
        }

        // Tabs row
        val tabs = remember(snapshot.updates.size) {
            listOf(
                SgwStoreTab.NDS to "Nintendo DS",
                SgwStoreTab.DSI to "Nintendo DSi",
                SgwStoreTab.TRANSLATIONS to null,
                SgwStoreTab.UPDATES to null,
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 4.dp),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
        ) {
            tabs.forEach { (tab, fixedLabel) ->
                val selected = selectedTab == tab
                val label = when (tab) {
                    SgwStoreTab.TRANSLATIONS -> stringResource(R.string.sgw_tab_translations)
                    SgwStoreTab.UPDATES -> stringResource(R.string.sgw_tab_updates, snapshot.updates.size)
                    else -> fixedLabel ?: tab.name
                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .clip(RoundedCornerShape(8.dp))
                        .background(if (selected) colors.red else colors.surface)
                        .border(1.dp, if (selected) colors.red else colors.line, RoundedCornerShape(8.dp))
                        .clickable { onSelectTab(tab) }
                        .padding(vertical = 8.dp, horizontal = 4.dp),
                    contentAlignment = Alignment.Center,
                ) {
                    Text(
                        text = label,
                        color = if (selected) androidx.compose.ui.graphics.Color.White else colors.text2,
                        fontSize = 11.sp,
                        fontWeight = if (selected) FontWeight.Bold else FontWeight.Medium,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
        }

        // Active download bar
        if (downloadProgress != null) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 14.dp, vertical = 6.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(colors.surface2)
                    .border(1.dp, colors.green, RoundedCornerShape(10.dp))
                    .padding(12.dp),
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(downloadProgress.title, color = colors.text, fontWeight = FontWeight.Bold, fontSize = 13.sp, maxLines = 1, overflow = TextOverflow.Ellipsis)
                        val dlStr = Formatter.formatShortFileSize(context, downloadProgress.downloadedBytes)
                        val totStr = if (downloadProgress.totalBytes > 0L) " / ${Formatter.formatShortFileSize(context, downloadProgress.totalBytes)}" else ""
                        Text("${downloadProgress.statusText}: $dlStr$totStr", color = colors.text2, fontSize = 11.sp)
                    }
                    Text(
                        text = stringResource(R.string.cancel),
                        color = colors.red,
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp,
                        modifier = Modifier.clickable { onCancelDownload() }.padding(horizontal = 8.dp, vertical = 4.dp),
                    )
                }
                Spacer(Modifier.height(6.dp))
                val frac = if (downloadProgress.totalBytes > 0L) {
                    (downloadProgress.downloadedBytes.toFloat() / downloadProgress.totalBytes.toFloat()).coerceIn(0f, 1f)
                } else null
                if (frac != null) {
                    LinearProgressIndicator(progress = frac, color = colors.green, backgroundColor = colors.surface3, modifier = Modifier.fillMaxWidth())
                } else {
                    LinearProgressIndicator(color = colors.green, backgroundColor = colors.surface3, modifier = Modifier.fillMaxWidth())
                }
            }
        }

        // Result feedback banner
        if (lastReplaceResult != null) {
            val bgColor = if (lastReplaceResult.success) colors.greenDim else colors.surface2
            val borderColor = if (lastReplaceResult.success) colors.green else colors.red
            val msg = if (lastReplaceResult.success) {
                stringResource(R.string.sgw_operation_success, lastReplaceResult.newFileName ?: "", lastReplaceResult.migratedSavesCount, lastReplaceResult.migratedStatesCount)
            } else {
                val detail = lastReplaceResult.httpStatusCode?.let { code ->
                    if (code == 404) stringResource(R.string.sgw_http_404_error) else "HTTP $code"
                } ?: (lastReplaceResult.errorMessage ?: "Error")
                stringResource(R.string.sgw_operation_failed, detail)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 14.dp, vertical = 4.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(bgColor)
                    .border(1.dp, borderColor, RoundedCornerShape(10.dp))
                    .padding(horizontal = 12.dp, vertical = 9.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(msg, color = colors.text, fontSize = 12.sp, modifier = Modifier.weight(1f))
                Icon(Icons.Filled.Close, contentDescription = null, tint = colors.text2, modifier = Modifier.size(18.dp).clickable { onDismissResult() })
            }
        }

        // Content body
        val q = searchQuery.trim().lowercase()
        when {
            isLoading && snapshot.ndsGames.isEmpty() && snapshot.dsiGames.isEmpty() && snapshot.translations.isEmpty() -> {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator(color = colors.red)
                }
            }
            selectedTab == SgwStoreTab.UPDATES -> {
                val filtered = snapshot.updates.filter {
                    q.isBlank() || it.localRom.name.lowercase().contains(q) || it.remoteEntry.title.lowercase().contains(q)
                }
                if (filtered.isEmpty()) {
                    val hasCatalogError = snapshot.updates.isEmpty() && snapshot.errorMessage != null
                    val message = when {
                        q.isNotBlank() -> stringResource(R.string.no_roms_found)
                        hasCatalogError -> snapshot.errorMessage.orEmpty()
                        else -> stringResource(R.string.sgw_no_updates_found)
                    }
                    SgwEmptyState(
                        message = message,
                        showRetry = q.isBlank() && hasCatalogError,
                        isLoading = isLoading,
                        onRetry = onRefresh,
                    )
                } else {
                    val listState = rememberLazyListState()
                    LaunchedEffect(highlightedRomUri, filtered) {
                        val targetUri = highlightedRomUri ?: return@LaunchedEffect
                        val idx = filtered.indexOfFirst { it.localRom.uri.toString() == targetUri }
                        if (idx >= 0) {
                            listState.animateScrollToItem(idx)
                        }
                    }
                    LazyColumn(
                        state = listState,
                        contentPadding = PaddingValues(14.dp),
                        verticalArrangement = Arrangement.spacedBy(10.dp),
                    ) {
                        items(filtered, key = { it.localRom.uri.toString() }) { candidate ->
                            SgwUpdateCard(
                                candidate = candidate,
                                busy = isBusy,
                                highlighted = highlightedRomUri != null && candidate.localRom.uri.toString() == highlightedRomUri,
                                onUpdate = { onUpdateRom(candidate) },
                            )
                        }
                    }
                }
            }
            else -> {
                val rawList = when (selectedTab) {
                    SgwStoreTab.NDS -> snapshot.ndsGames
                    SgwStoreTab.DSI -> snapshot.dsiGames
                    SgwStoreTab.TRANSLATIONS -> snapshot.translations
                    SgwStoreTab.UPDATES -> emptyList()
                }
                val filtered = rawList.filter { q.isBlank() || it.title.lowercase().contains(q) }
                if (filtered.isEmpty()) {
                    val isSearchEmpty = rawList.isNotEmpty() && q.isNotBlank()
                    val hasCatalogError = rawList.isEmpty() && snapshot.errorMessage != null
                    val message = when {
                        isSearchEmpty -> stringResource(R.string.no_roms_found)
                        hasCatalogError -> snapshot.errorMessage.orEmpty()
                        q.isNotBlank() -> stringResource(R.string.no_roms_found)
                        else -> stringResource(R.string.sgw_empty_catalog)
                    }
                    SgwEmptyState(
                        message = message,
                        showRetry = rawList.isEmpty(),
                        isLoading = isLoading,
                        onRetry = onRefresh,
                    )
                } else {
                    LazyColumn(
                        contentPadding = PaddingValues(14.dp),
                        verticalArrangement = Arrangement.spacedBy(10.dp),
                    ) {
                        items(filtered, key = { "${it.sourceKind}_${it.platform.platformId}_${it.id}" }) { entry ->
                            SgwCatalogCard(entry = entry, busy = isBusy, onDownload = { onDownloadEntry(entry) })
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun SgwEmptyState(
    message: String,
    showRetry: Boolean,
    isLoading: Boolean,
    onRetry: () -> Unit,
) {
    val colors = watermelon
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        contentAlignment = Alignment.Center,
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = message,
                color = colors.text2,
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
            )
            if (showRetry) {
                Spacer(Modifier.height(14.dp))
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .background(if (isLoading) colors.surface3 else colors.red)
                        .clickable(enabled = !isLoading, onClick = onRetry)
                        .padding(horizontal = 18.dp, vertical = 9.dp),
                ) {
                    Text(
                        text = stringResource(R.string.retry),
                        color = androidx.compose.ui.graphics.Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp,
                    )
                }
            }
        }
    }
}

@Composable
private fun SgwCatalogCard(
    entry: SgwGameEntry,
    busy: Boolean,
    onDownload: () -> Unit,
) {
    val colors = watermelon
    val context = LocalContext.current
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(colors.surface)
            .border(1.dp, colors.line, RoundedCornerShape(12.dp))
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier
                .size(44.dp)
                .clip(RoundedCornerShape(9.dp))
                .background(colors.surface2),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                if (entry.hasTranslation) Icons.Filled.Translate else Icons.Filled.CloudDownload,
                contentDescription = null,
                tint = if (entry.hasTranslation) colors.green else colors.red,
                modifier = Modifier.size(22.dp),
            )
        }
        Spacer(Modifier.width(12.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(entry.title, color = colors.text, fontWeight = FontWeight.Bold, fontSize = 14.sp, maxLines = 2, overflow = TextOverflow.Ellipsis)
            val meta = buildList {
                add(entry.platform.label)
                if (entry.version.isNotBlank()) add(entry.version)
                if (!entry.translatorTeam.isNullOrBlank()) add(entry.translatorTeam)
                if (entry.fileSizeBytes > 0L) add(Formatter.formatShortFileSize(context, entry.fileSizeBytes))
            }.joinToString(" | ")
            Text(meta, color = colors.text2, fontSize = 11.sp, maxLines = 1, overflow = TextOverflow.Ellipsis)
        }
        Spacer(Modifier.width(8.dp))
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .background(if (busy) colors.surface3 else colors.red)
                .clickable(enabled = !busy, onClick = onDownload)
                .padding(horizontal = 12.dp, vertical = 8.dp),
        ) {
            Text(
                text = stringResource(R.string.sgw_download_action),
                color = androidx.compose.ui.graphics.Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
            )
        }
    }
}

@Composable
private fun SgwUpdateCard(
    candidate: SgwUpdateCandidate,
    busy: Boolean,
    highlighted: Boolean = false,
    onUpdate: () -> Unit,
) {
    val colors = watermelon
    val reasonText = when (candidate.updateReason) {
        SgwUpdateReason.RUSSIAN_TRANSLATION_AVAILABLE -> stringResource(R.string.sgw_reason_rus_available)
        SgwUpdateReason.TRANSLATION_UPDATE -> stringResource(R.string.sgw_reason_trans_update)
        SgwUpdateReason.NEWER_VERSION -> stringResource(R.string.sgw_reason_new_version)
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(if (highlighted) colors.greenDim else colors.surface)
            .border(if (highlighted) 2.dp else 1.dp, colors.green, RoundedCornerShape(12.dp))
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(Icons.Filled.SystemUpdateAlt, contentDescription = null, tint = colors.green, modifier = Modifier.size(28.dp))
        Spacer(Modifier.width(12.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(candidate.localRom.name, color = colors.text, fontWeight = FontWeight.Bold, fontSize = 14.sp, maxLines = 1, overflow = TextOverflow.Ellipsis)
            Text(reasonText, color = colors.green, fontWeight = FontWeight.SemiBold, fontSize = 11.sp)
            val remoteVer = candidate.remoteEntry.version.ifBlank { "1.0" }
            val verText = "${candidate.localVersion ?: "1.0"} -> $remoteVer (${candidate.remoteEntry.platform.label})"
            Text(verText, color = colors.text2, fontSize = 11.sp)
        }
        Spacer(Modifier.width(8.dp))
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .background(if (busy) colors.surface3 else colors.green)
                .clickable(enabled = !busy, onClick = onUpdate)
                .padding(horizontal = 12.dp, vertical = 8.dp),
        ) {
            Text(
                text = stringResource(R.string.sgw_update_replace_action),
                color = MaterialTheme.colors.onPrimary,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
            )
        }
    }
}
