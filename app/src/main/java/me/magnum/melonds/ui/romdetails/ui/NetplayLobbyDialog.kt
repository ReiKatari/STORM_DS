package me.magnum.melonds.ui.romdetails.ui

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.displayCutout
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.union
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Dns
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.SportsEsports
import androidx.compose.material.icons.filled.Wifi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.preference.PreferenceManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.MelonEmulator
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.common.UnifiedBackButton
import me.magnum.melonds.ui.common.bouncingClickable
import me.magnum.melonds.ui.romlist.composables.romDisplayName
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon
import java.net.Inet4Address
import java.net.NetworkInterface
import java.util.concurrent.atomic.AtomicBoolean

private fun isValidHostIp(input: String): Boolean {
    val trimmed = input.trim()
    if (trimmed.isEmpty() || trimmed.any { it.isWhitespace() }) return false
    val ipv4Regex = Regex("""^((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)\.){3}(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)$""")
    if (ipv4Regex.matches(trimmed)) return true
    val hostnameRegex = Regex("""^[a-zA-Z0-9]([a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(\.[a-zA-Z0-9]([a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$""")
    return hostnameRegex.matches(trimmed)
}

data class NetplayRoom(
    val id: String,
    val hostName: String,
    val gameTitle: String,
    val serverType: String,
    val currentPlayers: Int,
    val maxPlayers: Int,
    val pingMs: Int,
    val hostIp: String = "",
)

private data class WfcServerOption(
    val id: String,
    val title: String,
    val dnsIp: String,
    val description: String,
)

private fun resolveLocalIpv4Address(context: Context): String {
    return runCatching {
        val interfaces = NetworkInterface.getNetworkInterfaces() ?: return@runCatching "127.0.0.1"
        for (intf in interfaces) {
            if (!intf.isUp || intf.isLoopback) continue
            for (addr in intf.inetAddresses) {
                if (!addr.isLoopbackAddress && addr is Inet4Address) {
                    val ip = addr.hostAddress ?: continue
                    if (ip.startsWith("192.168.") || ip.startsWith("10.") || ip.startsWith("172.")) {
                        return@runCatching ip
                    }
                }
            }
        }
        context.getString(R.string.v870_netplay_no_wifi)
    }.getOrDefault(context.getString(R.string.v870_netplay_unknown))
}

private fun parseDiscoveredLanRooms(context: Context, rawSessions: Array<String>, fallbackTitle: String): List<NetplayRoom> {
    return rawSessions.mapNotNull { entry ->
        val parts = entry.split("|")
        if (parts.size < 4) return@mapNotNull null
        val ip = parts[0].trim()
        val hostName = parts[1].trim().ifEmpty { "DS Host" }
        val currentPlayers = parts[2].toIntOrNull() ?: 1
        val maxPlayers = parts[3].toIntOrNull() ?: 4
        val status = parts.getOrNull(4)?.toIntOrNull() ?: 1
        val statusLabel = if (status == 2) {
            context.getString(R.string.v870_netplay_status_in_game, ip)
        } else {
            context.getString(R.string.v870_netplay_status_waiting, ip)
        }
        NetplayRoom(
            id = ip,
            hostName = hostName,
            gameTitle = fallbackTitle,
            serverType = statusLabel,
            currentPlayers = currentPlayers,
            maxPlayers = maxPlayers,
            pingMs = 4,
            hostIp = ip,
        )
    }
}

@Composable
fun NetplayLobbyDialog(
    rom: Rom,
    onDismiss: () -> Unit,
    onJoinRoom: (NetplayRoom) -> Unit,
) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val prefs = remember { PreferenceManager.getDefaultSharedPreferences(context) }
    val colors = watermelon
    val accent = colors.green
    val onAccent = if (accent.luminance() > 0.45f) Color(0xFF0B0F14) else Color.White

    var selectedTab by remember { mutableIntStateOf(0) } // 0 = NiFi Local Wireless, 1 = WFC Online
    val joinedSessionRef = remember { AtomicBoolean(false) }
    val isHostingSessionRef = remember { AtomicBoolean(false) }
    var isLanConnecting by remember { mutableStateOf(false) }

    val defaultNickname = remember {
        prefs.getString("firmware_settings_nickname", null)?.takeIf { it.isNotBlank() } ?: "STORM_Player"
    }
    var manualHostIp by remember {
        mutableStateOf(prefs.getString("lan_last_host_ip", "") ?: "")
    }
    var localIpAddress by remember { mutableStateOf("...") }
    LaunchedEffect(Unit) {
        localIpAddress = withContext(Dispatchers.IO) { resolveLocalIpv4Address(context) }
    }
    val romTitle = remember(rom) { romDisplayName(rom) }

    val wfcServers = remember(context) {
        listOf(
            WfcServerOption(
                id = "wiimmfi",
                title = context.getString(R.string.v870_netplay_wiimmfi_title),
                dnsIp = "167.235.229.36",
                description = context.getString(R.string.v870_netplay_wiimmfi_desc),
            ),
            WfcServerOption(
                id = "kaeru",
                title = "Kaeru WFC",
                dnsIp = "178.62.43.212",
                description = context.getString(R.string.v870_netplay_kaeru_desc),
            ),
            WfcServerOption(
                id = "altwfc",
                title = "AltWFC / WFCZwei",
                dnsIp = "172.104.88.237",
                description = context.getString(R.string.v870_netplay_altwfc_desc),
            ),
        )
    }

    var discoveredRooms by remember { mutableStateOf<List<NetplayRoom>>(emptyList()) }
    var activeWfcServer by remember {
        val saved = prefs.getString("system_wfc_server", "wiimmfi") ?: "wiimmfi"
        mutableStateOf(if (saved in wfcServers.map { it.id }) saved else "wiimmfi")
    }

    DisposableEffect(Unit) {
        onDispose {
            val didJoin = joinedSessionRef.get()
            val isHosting = isHostingSessionRef.get()
            CoroutineScope(Dispatchers.IO).launch {
                if (!didJoin || !isHosting) {
                    runCatching { MelonEmulator.stopLanDiscovery() }
                }
                if (!didJoin) {
                    runCatching { MelonEmulator.stopLanSession() }
                }
            }
        }
    }

    LaunchedEffect(selectedTab, romTitle) {
        if (selectedTab == 0) {
            withContext(Dispatchers.IO) {
                runCatching { MelonEmulator.startLanDiscovery() }
            }
            try {
                while (true) {
                    val raw = withContext(Dispatchers.IO) {
                        runCatching { MelonEmulator.getLanDiscoveredSessions() }.getOrDefault(emptyArray())
                    }
                    discoveredRooms = parseDiscoveredLanRooms(context, raw, romTitle)
                    delay(1200L)
                }
            } finally {
                if (!joinedSessionRef.get() || !isHostingSessionRef.get()) {
                    withContext(NonCancellable + Dispatchers.IO) {
                        runCatching { MelonEmulator.stopLanDiscovery() }
                    }
                }
            }
        } else {
            withContext(Dispatchers.IO) {
                runCatching { MelonEmulator.stopLanDiscovery() }
            }
        }
    }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false),
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = if (colors.isDark) 0.82f else 0.65f))
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                ) { onDismiss() },
            contentAlignment = Alignment.BottomCenter,
        ) {
            Column(
                modifier = Modifier
                    .widthIn(max = 760.dp)
                    .fillMaxWidth()
                    .windowInsetsPadding(WindowInsets.statusBars.union(WindowInsets.displayCutout).only(WindowInsetsSides.Top))
                    .navigationBarsPadding()
                    .padding(bottom = 16.dp)
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null,
                    ) { /* consume inner clicks */ },
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                // Main Panel Card matching SettingsDialogScaffold
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f, fill = false)
                        .fillMaxHeight(0.86f)
                        .padding(start = 14.dp, end = 14.dp, top = 20.dp, bottom = 12.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(colors.surface)
                        .border(1.2.dp, colors.line, RoundedCornerShape(20.dp)),
                ) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        // Unified Header Bar
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 16.dp, end = 16.dp, top = 14.dp, bottom = 12.dp),
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(36.dp)
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(colors.surface2)
                                    .border(1.dp, colors.line, RoundedCornerShape(10.dp)),
                                contentAlignment = Alignment.Center,
                            ) {
                                Icon(
                                    imageVector = if (selectedTab == 0) Icons.Filled.Wifi else Icons.Filled.Language,
                                    contentDescription = null,
                                    tint = accent,
                                    modifier = Modifier.size(20.dp),
                                )
                            }
                            Spacer(Modifier.width(12.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = stringResource(R.string.v870_netplay_title),
                                    color = colors.text,
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 16.sp,
                                    lineHeight = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                )
                                Spacer(Modifier.height(2.dp))
                                Text(
                                    text = stringResource(R.string.v870_netplay_subtitle),
                                    color = colors.text2,
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 11.5.sp,
                                    lineHeight = 15.sp,
                                    maxLines = 2,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                        }

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(1.dp)
                                .background(colors.line),
                        )

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f)
                                .padding(horizontal = 16.dp, vertical = 14.dp),
                        ) {
                            // Unified Mode Selector Pills
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(colors.surface2)
                                    .border(1.dp, colors.line, RoundedCornerShape(12.dp))
                                    .padding(4.dp),
                                horizontalArrangement = Arrangement.spacedBy(4.dp),
                            ) {
                                NetplayModeTabPill(
                                    selected = selectedTab == 0,
                                    icon = Icons.Filled.Wifi,
                                    label = stringResource(R.string.v870_netplay_tab_nifi),
                                    onClick = { selectedTab = 0 },
                                    modifier = Modifier.weight(1f),
                                )
                                NetplayModeTabPill(
                                    selected = selectedTab == 1,
                                    icon = Icons.Filled.Language,
                                    label = stringResource(R.string.v870_netplay_tab_wfc),
                                    onClick = { selectedTab = 1 },
                                    modifier = Modifier.weight(1f),
                                )
                            }

                            Spacer(Modifier.height(12.dp))

                            if (selectedTab == 0) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .weight(1f),
                                    verticalArrangement = Arrangement.spacedBy(10.dp),
                                ) {
                                    // Status & Host Card
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clip(RoundedCornerShape(15.dp))
                                            .background(colors.surface2)
                                            .border(1.dp, colors.line, RoundedCornerShape(15.dp))
                                            .padding(14.dp),
                                        verticalArrangement = Arrangement.spacedBy(9.dp),
                                    ) {
                                        Row(
                                            modifier = Modifier.fillMaxWidth(),
                                            horizontalArrangement = Arrangement.SpaceBetween,
                                            verticalAlignment = Alignment.CenterVertically,
                                        ) {
                                            Row(
                                                verticalAlignment = Alignment.CenterVertically,
                                                modifier = Modifier.weight(1f, fill = false),
                                            ) {
                                                Icon(
                                                    imageVector = Icons.Filled.Wifi,
                                                    contentDescription = null,
                                                    tint = accent,
                                                    modifier = Modifier.size(17.dp),
                                                )
                                                Spacer(Modifier.width(7.dp))
                                                Text(
                                                    text = stringResource(R.string.v870_netplay_your_ip, localIpAddress),
                                                    color = accent,
                                                    fontFamily = WatermelonMono,
                                                    fontSize = 11.sp,
                                                    fontWeight = FontWeight.Bold,
                                                    maxLines = 1,
                                                    overflow = TextOverflow.Ellipsis,
                                                )
                                            }
                                            Spacer(Modifier.width(8.dp))
                                            Text(
                                                text = stringResource(R.string.v870_netplay_player_label, defaultNickname),
                                                color = colors.text2,
                                                fontFamily = WatermelonMono,
                                                fontSize = 10.sp,
                                                maxLines = 1,
                                            )
                                        }

                                        Text(
                                            text = stringResource(R.string.v870_netplay_nifi_instructions),
                                            color = colors.text2,
                                            fontSize = 11.5.sp,
                                            lineHeight = 16.sp,
                                        )

                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clip(RoundedCornerShape(11.dp))
                                                .background(
                                                    Brush.horizontalGradient(
                                                        listOf(accent.copy(alpha = 0.88f), accent),
                                                    ),
                                                )
                                                .bouncingClickable(enabled = !isLanConnecting) {
                                                    isLanConnecting = true
                                                    coroutineScope.launch {
                                                        val ok = withContext(Dispatchers.IO) {
                                                            runCatching { MelonEmulator.startLanHost(defaultNickname, 4) }.getOrDefault(false)
                                                        }
                                                        isLanConnecting = false
                                                        if (ok) {
                                                            isHostingSessionRef.set(true)
                                                            joinedSessionRef.set(true)
                                                            Toast.makeText(
                                                                context,
                                                                context.getString(R.string.v870_netplay_host_created_toast, localIpAddress),
                                                                Toast.LENGTH_LONG,
                                                            ).show()
                                                            onJoinRoom(
                                                                NetplayRoom(
                                                                    id = "local_host",
                                                                    hostName = defaultNickname,
                                                                    gameTitle = romTitle,
                                                                    serverType = "LAN Host ($localIpAddress)",
                                                                    currentPlayers = 1,
                                                                    maxPlayers = 4,
                                                                    pingMs = 1,
                                                                    hostIp = localIpAddress,
                                                                ),
                                                            )
                                                        } else {
                                                            Toast.makeText(
                                                                context,
                                                                context.getString(R.string.v870_netplay_host_failed_toast),
                                                                Toast.LENGTH_LONG,
                                                            ).show()
                                                        }
                                                    }
                                                }
                                                .padding(vertical = 11.dp),
                                            contentAlignment = Alignment.Center,
                                        ) {
                                            Row(verticalAlignment = Alignment.CenterVertically) {
                                                Icon(
                                                    imageVector = Icons.Filled.SportsEsports,
                                                    contentDescription = null,
                                                    tint = onAccent,
                                                    modifier = Modifier.size(16.dp),
                                                )
                                                Spacer(Modifier.width(7.dp))
                                                Text(
                                                    text = stringResource(R.string.v870_netplay_create_host_btn),
                                                    color = onAccent,
                                                    fontFamily = SpaceGrotesk,
                                                    fontSize = 12.sp,
                                                    fontWeight = FontWeight.Bold,
                                                )
                                            }
                                        }
                                    }

                                    // Direct IP Connect Card
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clip(RoundedCornerShape(14.dp))
                                            .background(colors.surface2)
                                            .border(1.dp, colors.line, RoundedCornerShape(14.dp))
                                            .padding(horizontal = 10.dp, vertical = 8.dp),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .weight(1f)
                                                .clip(RoundedCornerShape(9.dp))
                                                .background(colors.bg)
                                                .border(1.dp, colors.line, RoundedCornerShape(9.dp))
                                                .padding(horizontal = 10.dp, vertical = 9.dp),
                                        ) {
                                            if (manualHostIp.isEmpty()) {
                                                Text(
                                                    text = stringResource(R.string.v870_netplay_host_ip_label),
                                                    color = colors.text3,
                                                    fontFamily = WatermelonMono,
                                                    fontSize = 10.5.sp,
                                                )
                                            }
                                            BasicTextField(
                                                value = manualHostIp,
                                                onValueChange = { manualHostIp = it.trim() },
                                                singleLine = true,
                                                textStyle = TextStyle(
                                                    color = colors.text,
                                                    fontFamily = WatermelonMono,
                                                    fontSize = 11.sp,
                                                ),
                                                cursorBrush = SolidColor(accent),
                                                modifier = Modifier.fillMaxWidth(),
                                            )
                                        }

                                        Box(
                                            modifier = Modifier
                                                .clip(RoundedCornerShape(9.dp))
                                                .background(accent)
                                                .bouncingClickable(enabled = !isLanConnecting) {
                                                    val targetIp = manualHostIp.trim()
                                                    if (!isValidHostIp(targetIp)) {
                                                        Toast.makeText(
                                                            context,
                                                            context.getString(R.string.v870_netplay_invalid_ip_toast),
                                                            Toast.LENGTH_SHORT,
                                                        ).show()
                                                        return@bouncingClickable
                                                    }
                                                    isLanConnecting = true
                                                    coroutineScope.launch {
                                                        val ok = withContext(Dispatchers.IO) {
                                                            runCatching { MelonEmulator.startLanClient(defaultNickname, targetIp) }.getOrDefault(false)
                                                        }
                                                        isLanConnecting = false
                                                        if (ok) {
                                                            prefs.edit().putString("lan_last_host_ip", targetIp).apply()
                                                            isHostingSessionRef.set(false)
                                                            joinedSessionRef.set(true)
                                                            Toast.makeText(
                                                                context,
                                                                context.getString(R.string.v870_netplay_connected_ip_toast, targetIp),
                                                                Toast.LENGTH_SHORT,
                                                            ).show()
                                                            onJoinRoom(
                                                                NetplayRoom(
                                                                    id = targetIp,
                                                                    hostName = targetIp,
                                                                    gameTitle = romTitle,
                                                                    serverType = "LAN Direct IP",
                                                                    currentPlayers = 2,
                                                                    maxPlayers = 4,
                                                                    pingMs = 4,
                                                                    hostIp = targetIp,
                                                                ),
                                                            )
                                                        } else {
                                                            Toast.makeText(
                                                                context,
                                                                context.getString(R.string.v870_netplay_connect_ip_failed_toast, targetIp),
                                                                Toast.LENGTH_LONG,
                                                            ).show()
                                                        }
                                                    }
                                                }
                                                .padding(horizontal = 13.dp, vertical = 9.dp),
                                            contentAlignment = Alignment.Center,
                                        ) {
                                            Text(
                                                text = stringResource(R.string.v870_netplay_join_by_ip_btn),
                                                color = onAccent,
                                                fontFamily = SpaceGrotesk,
                                                fontSize = 11.5.sp,
                                                fontWeight = FontWeight.Bold,
                                            )
                                        }
                                    }

                                    // Discovered Rooms Header
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically,
                                    ) {
                                        Text(
                                            text = stringResource(R.string.v870_netplay_found_rooms_header, discoveredRooms.size),
                                            color = colors.text,
                                            fontFamily = SpaceGrotesk,
                                            fontSize = 12.5.sp,
                                            fontWeight = FontWeight.Bold,
                                        )
                                        Row(
                                            modifier = Modifier
                                                .clip(RoundedCornerShape(9.dp))
                                                .background(colors.surface2)
                                                .border(1.dp, colors.line, RoundedCornerShape(9.dp))
                                                .bouncingClickable {
                                                    coroutineScope.launch {
                                                        val raw = withContext(Dispatchers.IO) {
                                                            runCatching { MelonEmulator.getLanDiscoveredSessions() }.getOrDefault(emptyArray())
                                                        }
                                                        discoveredRooms = parseDiscoveredLanRooms(context, raw, romTitle)
                                                        Toast.makeText(
                                                            context,
                                                            context.getString(R.string.v870_netplay_rooms_refreshed_toast),
                                                            Toast.LENGTH_SHORT,
                                                        ).show()
                                                    }
                                                }
                                                .padding(horizontal = 10.dp, vertical = 6.dp),
                                            verticalAlignment = Alignment.CenterVertically,
                                        ) {
                                            Icon(
                                                imageVector = Icons.Filled.Refresh,
                                                contentDescription = stringResource(R.string.v870_netplay_refresh),
                                                tint = accent,
                                                modifier = Modifier.size(14.dp),
                                            )
                                            Spacer(Modifier.width(5.dp))
                                            Text(
                                                text = stringResource(R.string.v870_netplay_refresh),
                                                color = colors.text,
                                                fontFamily = SpaceGrotesk,
                                                fontSize = 11.sp,
                                                fontWeight = FontWeight.Medium,
                                            )
                                        }
                                    }

                                    if (discoveredRooms.isEmpty()) {
                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .weight(1f)
                                                .clip(RoundedCornerShape(15.dp))
                                                .background(colors.surface2)
                                                .border(1.dp, colors.line, RoundedCornerShape(15.dp))
                                                .padding(16.dp),
                                            contentAlignment = Alignment.Center,
                                        ) {
                                            Text(
                                                text = stringResource(R.string.v870_netplay_searching_hosts_hint),
                                                color = colors.text2,
                                                fontFamily = WatermelonMono,
                                                fontSize = 10.5.sp,
                                                lineHeight = 16.sp,
                                            )
                                        }
                                    } else {
                                        LazyColumn(
                                            modifier = Modifier.weight(1f),
                                            verticalArrangement = Arrangement.spacedBy(8.dp),
                                        ) {
                                            items(discoveredRooms) { room ->
                                                RoomCard(
                                                    room = room,
                                                    onJoin = {
                                                        if (isLanConnecting) return@RoomCard
                                                        isLanConnecting = true
                                                        coroutineScope.launch {
                                                            val ok = withContext(Dispatchers.IO) {
                                                                runCatching {
                                                                    MelonEmulator.startLanClient(defaultNickname, room.hostIp)
                                                                }.getOrDefault(false)
                                                            }
                                                            isLanConnecting = false
                                                            if (ok) {
                                                                isHostingSessionRef.set(false)
                                                                joinedSessionRef.set(true)
                                                                Toast.makeText(
                                                                    context,
                                                                    context.getString(R.string.v870_netplay_connected_room_toast, room.hostName),
                                                                    Toast.LENGTH_SHORT,
                                                                ).show()
                                                                onJoinRoom(room)
                                                            } else {
                                                                Toast.makeText(
                                                                    context,
                                                                    context.getString(R.string.v870_netplay_connect_room_failed_toast, room.hostIp),
                                                                    Toast.LENGTH_LONG,
                                                                ).show()
                                                            }
                                                        }
                                                    },
                                                )
                                            }
                                        }
                                    }
                                }
                            } else {
                                // Tab 1: Nintendo WFC Online Server Selection & Launch
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .weight(1f),
                                    verticalArrangement = Arrangement.spacedBy(10.dp),
                                ) {
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clip(RoundedCornerShape(15.dp))
                                            .background(colors.surface2)
                                            .border(1.dp, colors.line, RoundedCornerShape(15.dp))
                                            .padding(14.dp),
                                    ) {
                                        Row(verticalAlignment = Alignment.CenterVertically) {
                                            Icon(
                                                imageVector = Icons.Filled.Dns,
                                                contentDescription = null,
                                                tint = accent,
                                                modifier = Modifier.size(18.dp),
                                            )
                                            Spacer(Modifier.width(8.dp))
                                            Text(
                                                text = stringResource(R.string.v870_netplay_wfc_title),
                                                color = colors.text,
                                                fontFamily = SpaceGrotesk,
                                                fontSize = 13.5.sp,
                                                fontWeight = FontWeight.Bold,
                                            )
                                        }
                                        Spacer(Modifier.height(6.dp))
                                        Text(
                                            text = stringResource(R.string.v870_netplay_wfc_desc),
                                            color = colors.text2,
                                            fontSize = 11.5.sp,
                                            lineHeight = 16.sp,
                                        )
                                    }

                                    LazyColumn(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .weight(1f),
                                        verticalArrangement = Arrangement.spacedBy(8.dp),
                                    ) {
                                        items(wfcServers) { server ->
                                            val isSelected = activeWfcServer == server.id
                                            Row(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .clip(RoundedCornerShape(15.dp))
                                                    .background(
                                                        if (isSelected) accent.copy(alpha = 0.14f) else colors.surface2,
                                                    )
                                                    .border(
                                                        width = if (isSelected) 1.5.dp else 1.dp,
                                                        color = if (isSelected) accent else colors.line,
                                                        shape = RoundedCornerShape(15.dp),
                                                    )
                                                    .clickable {
                                                        activeWfcServer = server.id
                                                        prefs.edit().putString("system_wfc_server", server.id).apply()
                                                        Toast.makeText(
                                                            context,
                                                            context.getString(R.string.v870_netplay_wfc_selected_toast, server.title, server.dnsIp),
                                                            Toast.LENGTH_SHORT,
                                                        ).show()
                                                    }
                                                    .padding(14.dp),
                                                verticalAlignment = Alignment.CenterVertically,
                                            ) {
                                                Box(
                                                    modifier = Modifier
                                                        .size(38.dp)
                                                        .clip(CircleShape)
                                                        .background(if (isSelected) accent.copy(alpha = 0.22f) else colors.bg)
                                                        .border(
                                                            width = 1.dp,
                                                            color = if (isSelected) accent else colors.line,
                                                            shape = CircleShape,
                                                        ),
                                                    contentAlignment = Alignment.Center,
                                                ) {
                                                    Icon(
                                                        imageVector = if (isSelected) Icons.Filled.CheckCircle else Icons.Filled.Language,
                                                        contentDescription = null,
                                                        tint = if (isSelected) accent else colors.text2,
                                                        modifier = Modifier.size(20.dp),
                                                    )
                                                }
                                                Spacer(Modifier.width(12.dp))
                                                Column(modifier = Modifier.weight(1f)) {
                                                    Text(
                                                        text = server.title,
                                                        color = colors.text,
                                                        fontFamily = SpaceGrotesk,
                                                        fontSize = 13.5.sp,
                                                        fontWeight = FontWeight.Bold,
                                                        maxLines = 2,
                                                        overflow = TextOverflow.Ellipsis,
                                                    )
                                                    Spacer(Modifier.height(4.dp))
                                                    Box(
                                                        modifier = Modifier
                                                            .clip(RoundedCornerShape(6.dp))
                                                            .background(colors.bg.copy(alpha = 0.72f))
                                                            .border(
                                                                width = 1.dp,
                                                                color = if (isSelected) accent.copy(alpha = 0.45f) else colors.line,
                                                                shape = RoundedCornerShape(6.dp),
                                                            )
                                                            .padding(horizontal = 7.dp, vertical = 2.dp),
                                                    ) {
                                                        Text(
                                                            text = "DNS: ${server.dnsIp}",
                                                            color = accent,
                                                            fontFamily = WatermelonMono,
                                                            fontSize = 10.sp,
                                                            fontWeight = FontWeight.Bold,
                                                            softWrap = false,
                                                            maxLines = 1,
                                                        )
                                                    }
                                                    Spacer(Modifier.height(5.dp))
                                                    Text(
                                                        text = server.description,
                                                        color = colors.text2,
                                                        fontSize = 11.sp,
                                                        lineHeight = 15.sp,
                                                    )
                                                }
                                            }
                                        }
                                    }

                                    Box(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clip(RoundedCornerShape(12.dp))
                                            .background(
                                                Brush.horizontalGradient(
                                                    listOf(accent.copy(alpha = 0.88f), accent),
                                                ),
                                            )
                                            .bouncingClickable {
                                                val validServerIds = wfcServers.map { it.id }
                                                val chosenServer = if (activeWfcServer in validServerIds) activeWfcServer else "wiimmfi"
                                                prefs.edit().putString("system_wfc_server", chosenServer).apply()
                                                val serverObj = wfcServers.firstOrNull { it.id == chosenServer } ?: wfcServers.first()
                                                coroutineScope.launch {
                                                    withContext(Dispatchers.IO) {
                                                        runCatching { MelonEmulator.stopLanSession() }
                                                    }
                                                    isHostingSessionRef.set(false)
                                                    joinedSessionRef.set(true)
                                                    Toast.makeText(
                                                        context,
                                                        context.getString(R.string.wfc_lobby_activated_toast, serverObj.title, serverObj.dnsIp),
                                                        Toast.LENGTH_LONG,
                                                    ).show()
                                                    onJoinRoom(
                                                        NetplayRoom(
                                                            id = serverObj.id,
                                                            hostName = serverObj.title,
                                                            gameTitle = romTitle,
                                                            serverType = serverObj.dnsIp,
                                                            currentPlayers = 1,
                                                            maxPlayers = 8,
                                                            pingMs = 24,
                                                            hostIp = serverObj.dnsIp,
                                                        ),
                                                    )
                                                }
                                            }
                                            .padding(vertical = 12.dp),
                                        contentAlignment = Alignment.Center,
                                    ) {
                                        Row(verticalAlignment = Alignment.CenterVertically) {
                                            Icon(
                                                imageVector = Icons.Filled.Language,
                                                contentDescription = null,
                                                tint = onAccent,
                                                modifier = Modifier.size(16.dp),
                                            )
                                            Spacer(Modifier.width(8.dp))
                                            Text(
                                                text = stringResource(R.string.v870_netplay_launch_wfc_btn),
                                                color = onAccent,
                                                fontFamily = SpaceGrotesk,
                                                fontSize = 12.5.sp,
                                                fontWeight = FontWeight.Bold,
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                // Unified Bottom Centered Back Button
                UnifiedBackButton(onClick = onDismiss)
            }
        }
    }
}

@Composable
private fun NetplayModeTabPill(
    selected: Boolean,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val colors = watermelon
    val shape = RoundedCornerShape(9.dp)
    Box(
        modifier = modifier
            .clip(shape)
            .background(if (selected) colors.green.copy(alpha = 0.20f) else Color.Transparent)
            .border(
                width = if (selected) 1.dp else 0.dp,
                color = if (selected) colors.green else Color.Transparent,
                shape = shape,
            )
            .clickable(onClick = onClick)
            .padding(horizontal = 8.dp, vertical = 9.dp),
        contentAlignment = Alignment.Center,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = if (selected) colors.green else colors.text2,
                modifier = Modifier.size(15.dp),
            )
            Spacer(Modifier.width(6.dp))
            Text(
                text = label,
                color = if (selected) colors.green else colors.text2,
                fontFamily = SpaceGrotesk,
                fontSize = 11.5.sp,
                fontWeight = if (selected) FontWeight.Bold else FontWeight.Medium,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        }
    }
}

@Composable
private fun RoomCard(room: NetplayRoom, onJoin: () -> Unit) {
    val colors = watermelon
    val accent = colors.green
    val onAccent = if (accent.luminance() > 0.45f) Color(0xFF0B0F14) else Color.White
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(15.dp))
            .background(colors.surface2)
            .border(1.dp, colors.line, RoundedCornerShape(15.dp))
            .clickable { onJoin() }
            .padding(14.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier
                .size(38.dp)
                .clip(CircleShape)
                .background(accent.copy(alpha = 0.18f))
                .border(1.dp, accent.copy(alpha = 0.45f), CircleShape),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                imageVector = Icons.Filled.Wifi,
                contentDescription = null,
                tint = accent,
                modifier = Modifier.size(20.dp),
            )
        }

        Spacer(Modifier.width(12.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = room.hostName,
                color = colors.text,
                fontFamily = SpaceGrotesk,
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
            Text(
                text = "${room.gameTitle} · ${room.serverType}",
                color = colors.text2,
                fontFamily = WatermelonMono,
                fontSize = 9.5.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
            Row(
                modifier = Modifier.padding(top = 3.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                Text(
                    text = stringResource(R.string.v870_netplay_players_count, room.currentPlayers, room.maxPlayers),
                    color = accent,
                    fontFamily = WatermelonMono,
                    fontSize = 9.5.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        }

        Spacer(Modifier.width(8.dp))

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(9.dp))
                .background(accent)
                .bouncingClickable { onJoin() }
                .padding(horizontal = 12.dp, vertical = 7.dp),
        ) {
            Text(
                text = stringResource(R.string.v870_netplay_join_btn),
                color = onAccent,
                fontFamily = SpaceGrotesk,
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}
