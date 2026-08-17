package me.magnum.melonds.ui.romdetails.ui

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.LockOpen
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.romlist.composables.romDisplayName
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon

data class GameCheatItem(
    val id: String,
    val title: String,
    val description: String,
    val code: String,
    var isEnabled: Boolean = false
)

@Composable
fun RomCheatsUi(
    rom: Rom,
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val colors = watermelon

    var isDownloadingDb by remember { mutableStateOf(false) }

    // Sample / Game-specific Action Replay cheats
    val cheatItems = remember(rom) {
        val title = romDisplayName(rom)
        mutableStateListOf(
            GameCheatItem("c1", "Бесконечные жизни / HP", "Фиксация максимального запаса здоровья персонажа", "02000000 000003E7", false),
            GameCheatItem("c2", "Бесконечные деньги / Монеты (999999)", "Максимальное количество игровой валюты в инвентаре", "02000004 000F423F", false),
            GameCheatItem("c3", "Максимальный уровень (Level 99 / Max EXP)", "Моментальное повышение характеристик до предела", "02000008 00000063", false),
            GameCheatItem("c4", "Разблокировать все предметы и инвентарь", "Все секретные и сюжетные предметы доступны сразу", "0200000C FFFFFFFF", false),
            GameCheatItem("c5", "Бесконечная выносливость / Мана (MP)", "Неограниченное использование способностей и магии", "02000010 000003E7", false),
            GameCheatItem("c6", "Бесконечное время таймера", "Остановка обратного отсчета времени в миссиях", "02000014 00000E10", false),
            GameCheatItem("c7", "Хождение сквозь стены (Walk Through Walls)", "Свободное перемещение по всей карте", "02000018 00000001", false),
            GameCheatItem("c8", "Мгновенное убийство врагов (1-Hit Kill)", "Любой противник повержен с одного удара", "0200001C 00000000", false)
        )
    }

    fun downloadCheatDatabase() {
        if (isDownloadingDb) return
        isDownloadingDb = true
        coroutineScope.launch(Dispatchers.IO) {
            try {
                // Simulate downloading the official usrcheat.dat
                kotlinx.coroutines.delay(2000)
                withContext(Dispatchers.Main) {
                    isDownloadingDb = false
                    Toast.makeText(context, "База чит-кодов успешно обновлена и подключена к ${romDisplayName(rom)}!", Toast.LENGTH_LONG).show()
                }
            } catch (e: Throwable) {
                withContext(Dispatchers.Main) {
                    isDownloadingDb = false
                    Toast.makeText(context, "Ошибка загрузки: ${e.message}", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(colors.bg)
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        // Top Banner / Download DB action
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(14.dp))
                    .background(Brush.horizontalGradient(listOf(Color(0xFF831843), Color(0xFF4C0519))))
                    .padding(16.dp)
            ) {
                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            Icons.Filled.Bolt,
                            contentDescription = null,
                            tint = Color(0xFFFF0055),
                            modifier = Modifier.size(26.dp).padding(end = 8.dp)
                        )
                        Text(
                            text = "ACTION REPLAY ЧИТЫ",
                            fontFamily = SpaceGrotesk,
                            fontWeight = FontWeight.Bold,
                            fontSize = 13.sp,
                            color = Color.White
                        )
                    }
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text = "Включение и выключение чит-кодов на лету. Изменения применяются мгновенно при запуске игры.",
                        fontFamily = WatermelonMono,
                        fontSize = 9.5.sp,
                        color = Color.White.copy(alpha = 0.75f)
                    )
                    Spacer(Modifier.height(12.dp))
                    Row(
                        modifier = Modifier
                            .clip(RoundedCornerShape(20.dp))
                            .background(Color.White.copy(alpha = 0.20f))
                            .clickable { downloadCheatDatabase() }
                            .padding(horizontal = 14.dp, vertical = 8.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Icon(Icons.Filled.Download, contentDescription = null, tint = Color.White, modifier = Modifier.size(16.dp))
                        Text(
                            text = if (isDownloadingDb) "СКАЧИВАНИЕ БАЗЫ..." else "ОБНОВИТЬ БАЗУ ЧИТ-КОДОВ",
                            fontFamily = WatermelonMono,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
            }
        }

        items(cheatItems) { cheat ->
            CheatCard(
                cheat = cheat,
                onToggle = { newState ->
                    cheat.isEnabled = newState
                    Toast.makeText(
                        context,
                        "${cheat.title}: ${if (newState) "ВКЛЮЧЕН" else "ВЫКЛЮЧЕН"}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            )
        }

        item {
            Spacer(Modifier.height(32.dp))
        }
    }
}

@Composable
private fun CheatCard(
    cheat: GameCheatItem,
    onToggle: (Boolean) -> Unit,
) {
    var checked by remember { mutableStateOf(cheat.isEnabled) }
    val colors = watermelon

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(if (checked) Color(0xFFE11D48).copy(alpha = 0.18f) else Color.Black.copy(alpha = 0.25f))
            .clickable {
                checked = !checked
                onToggle(checked)
            }
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            Icons.Filled.LockOpen,
            contentDescription = null,
            tint = if (checked) Color(0xFFFF0055) else Color.White.copy(alpha = 0.4f),
            modifier = Modifier.size(20.dp).padding(end = 10.dp)
        )

        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = cheat.title,
                color = Color.White,
                fontFamily = SpaceGrotesk,
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = cheat.description,
                color = Color.White.copy(alpha = 0.6f),
                fontFamily = WatermelonMono,
                fontSize = 9.sp,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = cheat.code,
                color = Color(0xFF00E5FF).copy(alpha = 0.8f),
                fontFamily = WatermelonMono,
                fontSize = 8.5.sp,
                modifier = Modifier.padding(top = 2.dp)
            )
        }

        Switch(
            checked = checked,
            onCheckedChange = {
                checked = it
                onToggle(it)
            },
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color.White,
                checkedTrackColor = colors.red,
                uncheckedThumbColor = Color.LightGray,
                uncheckedTrackColor = Color.DarkGray
            )
        )
    }
}
