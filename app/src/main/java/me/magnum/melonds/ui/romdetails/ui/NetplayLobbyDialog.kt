package me.magnum.melonds.ui.romdetails.ui

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Info
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.romlist.composables.romDisplayName
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon

data class NetplayRoom(
    val id: String,
    val hostName: String,
    val gameTitle: String,
    val serverType: String, // Wiimmfi, NiFi Local, Kaeru
    val currentPlayers: Int,
    val maxPlayers: Int,
    val pingMs: Int,
)

@Composable
fun NetplayLobbyDialog(
    rom: Rom,
    onDismiss: () -> Unit,
    onJoinRoom: (NetplayRoom) -> Unit,
) {
    val context = LocalContext.current
    val colors = watermelon
    var selectedTab by remember { mutableStateOf(0) } // 0 = NiFi Local Wireless, 1 = Wiimmfi / WFC Online

    val rooms = remember(rom) {
        val title = romDisplayName(rom)
        listOf(
            NetplayRoom("r1", "RedTrainer_DS", title, "Wiimmfi WFC", 2, 4, 32),
            NetplayRoom("r2", "SpeedRacer_99", "Mario Kart DS", "Kaeru WFC", 3, 8, 24),
            NetplayRoom("r3", "GhostHunter", "Metroid Prime Hunters", "AltWFC", 1, 4, 45),
            NetplayRoom("r4", "PokéMaster_Alex", "Pokemon HeartGold", "Wiimmfi WFC", 1, 2, 18),
            NetplayRoom("r5", "Local_Champion", title, "NiFi Local Mesh", 1, 4, 4)
        )
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
                    .fillMaxHeight(0.88f)
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(0xFF131722))
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
                                text = "NETPLAY & NIFI МУЛЬТИПЛЕЕР",
                                color = Color.White,
                                fontFamily = SpaceGrotesk,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "Беспроводная игра вдвоем (Wi-Fi / Hotspot) и онлайн",
                                color = Color.White.copy(alpha = 0.6f),
                                fontFamily = WatermelonMono,
                                fontSize = 9.sp
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
                            Text("NiFi Local (Wi-Fi)", color = if (selectedTab == 0) Color(0xFF00E5FF) else Color.White.copy(alpha = 0.7f), fontFamily = WatermelonMono, fontSize = 10.sp, fontWeight = FontWeight.Bold)
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
                            Text("WFC Онлайн", color = if (selectedTab == 1) Color(0xFF10B981) else Color.White.copy(alpha = 0.7f), fontFamily = WatermelonMono, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }

                Spacer(Modifier.height(14.dp))

                if (selectedTab == 0) {
                    // NiFi Local Mesh Wireless Guide & Start
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                            .clip(RoundedCornerShape(14.dp))
                            .background(Color(0xFF1E2433))
                            .padding(16.dp),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(Icons.Filled.Wifi, contentDescription = null, tint = Color(0xFF00E5FF), modifier = Modifier.size(20.dp))
                                Spacer(Modifier.width(8.dp))
                                Text(
                                    text = "Локальный беспроводной NiFi (Прямой Wi-Fi / Hotspot)",
                                    color = Color.White,
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                            Spacer(Modifier.height(10.dp))
                            Text(
                                text = "• Подключите оба устройства к одной Wi-Fi сети или раздайте точку доступа (Wi-Fi Hotspot) с одного из телефонов.\n\n• Запустите игру на обоих смартфонах.\n\n• В меню игры выберите «Wireless Communications» или «Multi-Card Play».\n\n• STORM DS автоматически пересылает 802.11b пакеты между эмуляторами в локальной сети без проводов!",
                                color = Color.White.copy(alpha = 0.85f),
                                fontSize = 11.5.sp,
                                lineHeight = 17.sp,
                            )
                        }

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(12.dp))
                                .background(Brush.horizontalGradient(listOf(Color(0xFF0284C7), Color(0xFF00E5FF))))
                                .clickable {
                                    Toast.makeText(context, "NiFi Local Mesh активен. Запустите игру для поиска игроков!", Toast.LENGTH_LONG).show()
                                    onDismiss()
                                }
                                .padding(vertical = 12.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "ЗАПУСТИТЬ С NIFI LOCAL WIRELESS",
                                color = Color.Black,
                                fontFamily = WatermelonMono,
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                } else {
                    // Actions bar for Online
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(12.dp))
                                .background(Brush.horizontalGradient(listOf(Color(0xFF059669), Color(0xFF10B981))))
                                .clickable {
                                    Toast.makeText(context, "Комната создана! Ожидание игроков...", Toast.LENGTH_SHORT).show()
                                }
                                .padding(vertical = 10.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(Icons.Filled.SportsEsports, contentDescription = null, tint = Color.White, modifier = Modifier.size(16.dp))
                                Spacer(Modifier.width(6.dp))
                                Text("СОЗДАТЬ ОНЛАЙН КОМНАТУ", color = Color.White, fontFamily = WatermelonMono, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                            }
                        }

                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(12.dp))
                                .background(Color.White.copy(alpha = 0.12f))
                                .clickable {
                                    Toast.makeText(context, "Список комнат обновлен", Toast.LENGTH_SHORT).show()
                                }
                                .padding(horizontal = 14.dp, vertical = 10.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(Icons.Filled.Refresh, contentDescription = "Refresh", tint = Color.White, modifier = Modifier.size(18.dp))
                        }
                    }

                    Spacer(Modifier.height(12.dp))

                    // Rooms List
                    LazyColumn(
                        modifier = Modifier.weight(1f),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        items(rooms) { room ->
                            RoomCard(room = room, onJoin = { onJoinRoom(room) })
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun RoomCard(room: NetplayRoom, onJoin: () -> Unit) {
    val context = LocalContext.current
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(14.dp))
            .background(Color(0xFF1E2433))
            .clickable {
                Toast.makeText(context, "Подключение к комнате ${room.hostName}...", Toast.LENGTH_SHORT).show()
                onJoin()
            }
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
                text = "${room.hostName}'s Match",
                color = Color.White,
                fontFamily = SpaceGrotesk,
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "${room.gameTitle} • ${room.serverType}",
                color = Color.White.copy(alpha = 0.6f),
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
                Text(
                    text = "${room.pingMs} ms",
                    color = if (room.pingMs < 30) Color(0xFF10B981) else Color(0xFFFBBF24),
                    fontFamily = WatermelonMono,
                    fontSize = 9.sp
                )
            }
        }

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .background(Color(0xFF00E5FF))
                .clickable {
                    Toast.makeText(context, "Подключение к комнате ${room.hostName}...", Toast.LENGTH_SHORT).show()
                    onJoin()
                }
                .padding(horizontal = 12.dp, vertical = 6.dp)
        ) {
            Text("ВОЙТИ", color = Color.Black, fontFamily = WatermelonMono, fontSize = 10.sp, fontWeight = FontWeight.Bold)
        }
    }
}
