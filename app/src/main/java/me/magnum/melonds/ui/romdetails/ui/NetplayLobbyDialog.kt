package me.magnum.melonds.ui.romdetails.ui

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Dns
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.SportsEsports
import androidx.compose.material.icons.filled.Wifi
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.preference.PreferenceManager
import kotlinx.coroutines.delay
import me.magnum.melonds.MelonEmulator
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.romlist.composables.romDisplayName
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon
import java.net.Inet4Address
import java.net.NetworkInterface

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

private fun resolveLocalIpv4Address(): String {
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
        "Не подключено к Wi-Fi"
    }.getOrDefault("Неизвестно")
}

private fun parseDiscoveredLanRooms(rawSessions: Array<String>, fallbackTitle: String): List<NetplayRoom> {
    return rawSessions.mapNotNull { entry ->
        val parts = entry.split("|")
        if (parts.size < 4) return@mapNotNull null
        val ip = parts[0].trim()
        val hostName = parts[1].trim().ifEmpty { "DS Host" }
        val currentPlayers = parts[2].toIntOrNull() ?: 1
        val maxPlayers = parts[3].toIntOrNull() ?: 4
        val status = parts.getOrNull(4)?.toIntOrNull() ?: 1
        val statusLabel = if (status == 2) "В игре ($ip)" else "Ожидание ($ip)"
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
    val prefs = remember { PreferenceManager.getDefaultSharedPreferences(context) }
    val colors = watermelon
    var selectedTab by remember { mutableStateOf(0) } // 0 = NiFi Local Wireless, 1 = WFC Online

    val defaultNickname = remember {
        prefs.getString("firmware_settings_nickname", null)?.takeIf { it.isNotBlank() } ?: "STORM_Player"
    }
    var manualHostIp by remember {
        mutableStateOf(prefs.getString("lan_last_host_ip", "") ?: "")
    }
    val localIpAddress = remember { resolveLocalIpv4Address() }
    val romTitle = remember(rom) { romDisplayName(rom) }

    var discoveredRooms by remember { mutableStateOf<List<NetplayRoom>>(emptyList()) }
    var activeWfcServer by remember {
        mutableStateOf(prefs.getString("system_wfc_server", "wiimmfi") ?: "wiimmfi")
    }

    val wfcServers = remember {
        listOf(
            WfcServerOption(
                id = "wiimmfi",
                title = "Wiimmfi WFC (Рекомендуется)",
                dnsIp = "167.235.229.36",
                description = "Основной глобальный сервер Nintendo WFC (Mario Kart DS, Pokémon Gen 4/5, Animal Crossing и др.)",
            ),
            WfcServerOption(
                id = "kaeru",
                title = "Kaeru WFC",
                dnsIp = "178.62.43.212",
                description = "Альтернативный сервер сообщества с поддержкой классических игр DS и сетевых сервисов",
            ),
            WfcServerOption(
                id = "altwfc",
                title = "AltWFC / WFCZwei",
                dnsIp = "172.104.88.237",
                description = "Классический сервер AltWFC для старых ревизий игр Nintendo DS",
            ),
        )
    }

    DisposableEffect(Unit) {
        runCatching { MelonEmulator.startLanDiscovery() }
        onDispose {
            runCatching { MelonEmulator.stopLanDiscovery() }
        }
    }

    LaunchedEffect(selectedTab, romTitle) {
        if (selectedTab == 0) {
            runCatching { MelonEmulator.startLanDiscovery() }
            while (true) {
                val raw = runCatching { MelonEmulator.getLanDiscoveredSessions() }.getOrDefault(emptyArray())
                discoveredRooms = parseDiscoveredLanRooms(raw, romTitle)
                delay(1200L)
            }
        }
    }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.90f))
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .fillMaxHeight(0.90f)
                    .clip(RoundedCornerShape(20.dp))
                    .background(colors.bg)
                    .border(1.dp, colors.line, RoundedCornerShape(20.dp))
                    .padding(20.dp)
            ) {
                // Header with Back Button
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(
                            onClick = onDismiss,
                            modifier = Modifier
                                .size(36.dp)
                                .clip(CircleShape)
                                .background(Color.White.copy(alpha = 0.12f)),
                        ) {
                            Icon(
                                Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Назад",
                                tint = Color.White,
                                modifier = Modifier.size(18.dp),
                            )
                        }
                        Spacer(Modifier.width(10.dp))
                        Column {
                            Text(
                                text = "Сетевая и локальная игра",
                                color = Color.White,
                                fontFamily = SpaceGrotesk,
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "Локальный мультиплеер NiFi (Wi-Fi / Hotspot) и серверы WFC",
                                color = Color.White.copy(alpha = 0.65f),
                                fontFamily = WatermelonMono,
                                fontSize = 9.5.sp
                            )
                        }
                    }
                }

                Spacer(Modifier.height(14.dp))

                // Mode Tabs
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(Color(0xFF1E2433))
                        .padding(4.dp),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(9.dp))
                            .background(if (selectedTab == 0) Color(0xFF00E5FF).copy(alpha = 0.25f) else Color.Transparent)
                            .clickable { selectedTab = 0 }
                            .padding(vertical = 8.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Filled.Wifi, contentDescription = null, tint = if (selectedTab == 0) Color(0xFF00E5FF) else Color.White.copy(alpha = 0.6f), modifier = Modifier.size(16.dp))
                            Spacer(Modifier.width(6.dp))
                            Text("Локальная сеть NiFi", color = if (selectedTab == 0) Color(0xFF00E5FF) else Color.White.copy(alpha = 0.7f), fontFamily = WatermelonMono, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                        }
                    }

                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(9.dp))
                            .background(if (selectedTab == 1) Color(0xFF10B981).copy(alpha = 0.25f) else Color.Transparent)
                            .clickable { selectedTab = 1 }
                            .padding(vertical = 8.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Filled.Language, contentDescription = null, tint = if (selectedTab == 1) Color(0xFF10B981) else Color.White.copy(alpha = 0.6f), modifier = Modifier.size(16.dp))
                            Spacer(Modifier.width(6.dp))
                            Text("WFC онлайн", color = if (selectedTab == 1) Color(0xFF10B981) else Color.White.copy(alpha = 0.7f), fontFamily = WatermelonMono, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }

                Spacer(Modifier.height(12.dp))

                if (selectedTab == 0) {
                    // NiFi Local Multiplayer (Host / Discovery / Direct IP)
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        // Status & Host Card
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(14.dp))
                                .background(Color(0xFF1E2433))
                                .padding(14.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(Icons.Filled.Wifi, contentDescription = null, tint = Color(0xFF00E5FF), modifier = Modifier.size(18.dp))
                                    Spacer(Modifier.width(8.dp))
                                    Text(
                                        text = "Ваш IP: $localIpAddress",
                                        color = Color(0xFF00E5FF),
                                        fontFamily = WatermelonMono,
                                        fontSize = 11.sp,
                                        fontWeight = FontWeight.Bold,
                                    )
                                }
                                Text(
                                    text = "Игрок: $defaultNickname",
                                    color = Color.White.copy(alpha = 0.7f),
                                    fontFamily = WatermelonMono,
                                    fontSize = 10.sp,
                                )
                            }

                            Text(
                                text = "Подключите смартфоны к одной Wi-Fi сети или точке доступа. Один игрок создаёт комнату (Хост), второй подключается к найденной комнате ниже или вводит IP хоста.",
                                color = Color.White.copy(alpha = 0.8f),
                                fontSize = 11.sp,
                                lineHeight = 15.sp,
                            )

                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(Brush.horizontalGradient(listOf(Color(0xFF0284C7), Color(0xFF00E5FF))))
                                    .clickable {
                                        val ok = runCatching { MelonEmulator.startLanHost(defaultNickname, 4) }.getOrDefault(false)
                                        if (ok) {
                                            Toast.makeText(
                                                context,
                                                "Локальная комната создана ($localIpAddress). Запуск игры...",
                                                Toast.LENGTH_LONG
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
                                                )
                                            )
                                        } else {
                                            Toast.makeText(
                                                context,
                                                "Не удалось открыть порт локального хоста. Проверьте подключение к Wi-Fi.",
                                                Toast.LENGTH_LONG
                                            ).show()
                                        }
                                    }
                                    .padding(vertical = 11.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(Icons.Filled.SportsEsports, contentDescription = null, tint = Color.Black, modifier = Modifier.size(16.dp))
                                    Spacer(Modifier.width(6.dp))
                                    Text(
                                        text = "Создать комнату и запустить игру (Хост)",
                                        color = Color.Black,
                                        fontFamily = WatermelonMono,
                                        fontSize = 10.5.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            }
                        }

                        // Direct IP Connect Row
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(12.dp))
                                .background(Color(0xFF1E2433))
                                .padding(horizontal = 12.dp, vertical = 8.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(Color.Black.copy(alpha = 0.35f))
                                    .padding(horizontal = 10.dp, vertical = 8.dp)
                            ) {
                                if (manualHostIp.isEmpty()) {
                                    Text(
                                        text = "IP хоста (напр. 192.168.1.10)",
                                        color = Color.White.copy(alpha = 0.4f),
                                        fontFamily = WatermelonMono,
                                        fontSize = 10.5.sp
                                    )
                                }
                                BasicTextField(
                                    value = manualHostIp,
                                    onValueChange = { manualHostIp = it.trim() },
                                    singleLine = true,
                                    textStyle = TextStyle(
                                        color = Color.White,
                                        fontFamily = WatermelonMono,
                                        fontSize = 11.sp
                                    ),
                                    cursorBrush = SolidColor(Color(0xFF00E5FF)),
                                    modifier = Modifier.fillMaxWidth()
                                )
                            }

                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(Color(0xFF00E5FF))
                                    .clickable {
                                        val targetIp = manualHostIp.trim()
                                        if (targetIp.isEmpty()) {
                                            Toast.makeText(context, "Введите IP-адрес хоста", Toast.LENGTH_SHORT).show()
                                            return@clickable
                                        }
                                        prefs.edit().putString("lan_last_host_ip", targetIp).apply()
                                        val ok = runCatching { MelonEmulator.startLanClient(defaultNickname, targetIp) }.getOrDefault(false)
                                        if (ok) {
                                            Toast.makeText(context, "Подключено к $targetIp! Запуск игры...", Toast.LENGTH_SHORT).show()
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
                                                )
                                            )
                                        } else {
                                            Toast.makeText(context, "Не удалось подключиться к $targetIp", Toast.LENGTH_LONG).show()
                                        }
                                    }
                                    .padding(horizontal = 12.dp, vertical = 8.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "По IP",
                                    color = Color.Black,
                                    fontFamily = WatermelonMono,
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }

                        // Discovered Rooms Header
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Найденные комнаты в локальной сети (${discoveredRooms.size})",
                                color = Color.White.copy(alpha = 0.85f),
                                fontFamily = SpaceGrotesk,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Row(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(Color.White.copy(alpha = 0.1f))
                                    .clickable {
                                        val raw = runCatching { MelonEmulator.getLanDiscoveredSessions() }.getOrDefault(emptyArray())
                                        discoveredRooms = parseDiscoveredLanRooms(raw, romTitle)
                                        Toast.makeText(context, "Поиск комнат в сети обновлён", Toast.LENGTH_SHORT).show()
                                    }
                                    .padding(horizontal = 10.dp, vertical = 5.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(Icons.Filled.Refresh, contentDescription = "Обновить", tint = Color.White, modifier = Modifier.size(14.dp))
                                Spacer(Modifier.width(4.dp))
                                Text("Обновить", color = Color.White, fontFamily = WatermelonMono, fontSize = 9.5.sp)
                            }
                        }

                        if (discoveredRooms.isEmpty()) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .weight(1f)
                                    .clip(RoundedCornerShape(14.dp))
                                    .background(Color(0xFF1E2433).copy(alpha = 0.6f))
                                    .padding(16.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "Поиск активных хостов в Wi-Fi сети...\nЕсли второй телефон раздаёт точку доступа и комната не появляется автоматически, введите его IP-адрес выше.",
                                    color = Color.White.copy(alpha = 0.6f),
                                    fontFamily = WatermelonMono,
                                    fontSize = 10.sp,
                                    lineHeight = 15.sp
                                )
                            }
                        } else {
                            LazyColumn(
                                modifier = Modifier.weight(1f),
                                verticalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                items(discoveredRooms) { room ->
                                    RoomCard(
                                        room = room,
                                        onJoin = {
                                            val ok = runCatching {
                                                MelonEmulator.startLanClient(defaultNickname, room.hostIp)
                                            }.getOrDefault(false)
                                            if (ok) {
                                                Toast.makeText(context, "Подключено к ${room.hostName}!", Toast.LENGTH_SHORT).show()
                                                onJoinRoom(room)
                                            } else {
                                                Toast.makeText(context, "Ошибка подключения к ${room.hostIp}", Toast.LENGTH_LONG).show()
                                            }
                                        }
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
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(
                            modifier = Modifier.weight(1f),
                            verticalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(14.dp))
                                    .background(Color(0xFF1E2433))
                                    .padding(14.dp)
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(Icons.Filled.Dns, contentDescription = null, tint = Color(0xFF10B981), modifier = Modifier.size(18.dp))
                                    Spacer(Modifier.width(8.dp))
                                    Text(
                                        text = "Сервер Nintendo Wi-Fi Connection (WFC)",
                                        color = Color.White,
                                        fontFamily = SpaceGrotesk,
                                        fontSize = 13.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                                Spacer(Modifier.height(6.dp))
                                Text(
                                    text = "Выберите онлайн-сервер WFC. STORM DS автоматически прописывает его DNS в точку доступа melonAP и перенаправляет трафик игры на выбранный сервер без ручной настройки.",
                                    color = Color.White.copy(alpha = 0.8f),
                                    fontSize = 11.sp,
                                    lineHeight = 15.sp
                                )
                            }

                            LazyColumn(
                                modifier = Modifier.weight(1f),
                                verticalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                items(wfcServers) { server ->
                                    val isSelected = activeWfcServer == server.id
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clip(RoundedCornerShape(14.dp))
                                            .background(if (isSelected) Color(0xFF10B981).copy(alpha = 0.16f) else Color(0xFF1E2433))
                                            .border(
                                                width = if (isSelected) 1.5.dp else 1.dp,
                                                color = if (isSelected) Color(0xFF10B981) else Color.White.copy(alpha = 0.08f),
                                                shape = RoundedCornerShape(14.dp)
                                            )
                                            .clickable {
                                                activeWfcServer = server.id
                                                prefs.edit().putString("system_wfc_server", server.id).apply()
                                                Toast.makeText(context, "Выбран сервер ${server.title} (DNS: ${server.dnsIp})", Toast.LENGTH_SHORT).show()
                                            }
                                            .padding(14.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .size(36.dp)
                                                .clip(CircleShape)
                                                .background(if (isSelected) Color(0xFF10B981).copy(alpha = 0.25f) else Color.White.copy(alpha = 0.08f)),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            Icon(
                                                imageVector = if (isSelected) Icons.Filled.CheckCircle else Icons.Filled.Language,
                                                contentDescription = null,
                                                tint = if (isSelected) Color(0xFF10B981) else Color.White.copy(alpha = 0.7f),
                                                modifier = Modifier.size(20.dp)
                                            )
                                        }
                                        Spacer(Modifier.width(12.dp))
                                        Column(modifier = Modifier.weight(1f)) {
                                            Row(
                                                modifier = Modifier.fillMaxWidth(),
                                                horizontalArrangement = Arrangement.SpaceBetween,
                                                verticalAlignment = Alignment.CenterVertically
                                            ) {
                                                Text(
                                                    text = server.title,
                                                    color = Color.White,
                                                    fontFamily = SpaceGrotesk,
                                                    fontSize = 13.sp,
                                                    fontWeight = FontWeight.Bold
                                                )
                                                Text(
                                                    text = "DNS: ${server.dnsIp}",
                                                    color = Color(0xFF10B981),
                                                    fontFamily = WatermelonMono,
                                                    fontSize = 9.5.sp,
                                                    fontWeight = FontWeight.Bold
                                                )
                                            }
                                            Spacer(Modifier.height(3.dp))
                                            Text(
                                                text = server.description,
                                                color = Color.White.copy(alpha = 0.7f),
                                                fontSize = 10.5.sp,
                                                lineHeight = 14.sp
                                            )
                                        }
                                    }
                                }
                            }
                        }

                        Spacer(Modifier.height(10.dp))

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(12.dp))
                                .background(Brush.horizontalGradient(listOf(Color(0xFF059669), Color(0xFF10B981))))
                                .clickable {
                                    runCatching { MelonEmulator.stopLanSession() }
                                    val chosenServer = if (activeWfcServer == "off") "wiimmfi" else activeWfcServer
                                    prefs.edit().putString("system_wfc_server", chosenServer).apply()
                                    val serverObj = wfcServers.firstOrNull { it.id == chosenServer } ?: wfcServers.first()
                                    Toast.makeText(
                                        context,
                                        "WFC онлайн активен (${serverObj.title}, DNS ${serverObj.dnsIp}). Запуск игры...",
                                        Toast.LENGTH_LONG
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
                                        )
                                    )
                                }
                                .padding(vertical = 12.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(Icons.Filled.Language, contentDescription = null, tint = Color.White, modifier = Modifier.size(16.dp))
                                Spacer(Modifier.width(8.dp))
                                Text(
                                    text = "Запустить игру с WFC онлайн",
                                    color = Color.White,
                                    fontFamily = WatermelonMono,
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold
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
private fun RoomCard(room: NetplayRoom, onJoin: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(14.dp))
            .background(Color(0xFF1E2433))
            .clickable { onJoin() }
            .padding(14.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(38.dp)
                .clip(CircleShape)
                .background(Color(0xFF00E5FF).copy(alpha = 0.18f)),
            contentAlignment = Alignment.Center
        ) {
            Icon(Icons.Filled.Wifi, contentDescription = null, tint = Color(0xFF00E5FF), modifier = Modifier.size(20.dp))
        }

        Spacer(Modifier.width(12.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = room.hostName,
                color = Color.White,
                fontFamily = SpaceGrotesk,
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "${room.gameTitle} • ${room.serverType}",
                color = Color.White.copy(alpha = 0.65f),
                fontFamily = WatermelonMono,
                fontSize = 9.5.sp
            )
            Row(
                modifier = Modifier.padding(top = 2.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "Игроки: ${room.currentPlayers}/${room.maxPlayers}",
                    color = Color(0xFF10B981),
                    fontFamily = WatermelonMono,
                    fontSize = 9.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .background(Color(0xFF00E5FF))
                .clickable { onJoin() }
                .padding(horizontal = 12.dp, vertical = 6.dp)
        ) {
            Text("Войти", color = Color.Black, fontFamily = WatermelonMono, fontSize = 10.sp, fontWeight = FontWeight.Bold)
        }
    }
}
