package me.magnum.melonds.ui.romdetails.ui

import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.CloudDownload
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.FolderOpen
import androidx.compose.material.icons.filled.UploadFile
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.common.cheats.EmbeddedActionReplayCheats
import me.magnum.melonds.di.entrypoint.CheatsEntryPoint
import me.magnum.melonds.domain.model.Cheat
import me.magnum.melonds.domain.model.CheatFolder
import me.magnum.melonds.domain.model.Game
import me.magnum.melonds.domain.model.RomInfo
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.romlist.composables.romDisplayName
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon
import me.magnum.melonds.utils.RomProcessor
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.File
import java.io.FileOutputStream
import java.util.concurrent.TimeUnit
import java.util.zip.ZipInputStream

@Composable
fun RomCheatsUi(
    rom: Rom,
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val colors = watermelon

    val entryPoint = remember { CheatsEntryPoint.resolve(context) }
    val cheatsRepository = remember { entryPoint.cheatsRepository() }
    val database = remember { entryPoint.database() }

    var game by remember(rom) { mutableStateOf<Game?>(null) }
    var romInfo by remember(rom) { mutableStateOf<RomInfo?>(null) }
    var cheatFolders by remember(rom) { mutableStateOf<List<CheatFolder>>(emptyList()) }
    var isLoading by remember(rom) { mutableStateOf(true) }
    var isDownloadingDb by remember { mutableStateOf(false) }

    val expandedFolders = remember(rom) { mutableStateMapOf<Long, Boolean>() }

    fun refreshCheats() {
        coroutineScope.launch(Dispatchers.IO) {
            isLoading = true
            val parsedInfo = parseRomInfoDeep(context, rom)
            romInfo = parsedInfo

            var foundGame = if (parsedInfo != null) {
                cheatsRepository.findGameForRom(parsedInfo)
            } else {
                null
            }

            // Auto-populate embedded/online cheats if missing
            if (foundGame == null && parsedInfo != null) {
                EmbeddedActionReplayCheats.populateIfEmpty(database, parsedInfo.gameCode, rom.name)
                foundGame = cheatsRepository.findGameForRom(parsedInfo)
            }
            game = foundGame

            if (foundGame != null) {
                cheatsRepository.getAllGameCheats(foundGame).collect { folders ->
                    cheatFolders = folders
                    folders.forEach { f ->
                        f.id?.let { id ->
                            if (!expandedFolders.containsKey(id)) {
                                expandedFolders[id] = true
                            }
                        }
                    }
                    isLoading = false
                }
            } else {
                cheatFolders = emptyList()
                isLoading = false
            }
        }
    }

    LaunchedEffect(rom) {
        refreshCheats()
    }

    val importCheatsLauncher = rememberLauncherForActivityResult(ActivityResultContracts.OpenDocument()) { uri ->
        if (uri != null) {
            coroutineScope.launch(Dispatchers.IO) {
                cheatsRepository.importCheats(uri)
                withContext(Dispatchers.Main) {
                    Toast.makeText(context, "Импорт чит-базы запущен...", Toast.LENGTH_SHORT).show()
                }
                refreshCheats()
            }
        }
    }

    fun downloadOfficialDatabase() {
        if (isDownloadingDb) return
        isDownloadingDb = true
        coroutineScope.launch(Dispatchers.IO) {
            try {
                val client = OkHttpClient.Builder()
                    .connectTimeout(15, TimeUnit.SECONDS)
                    .readTimeout(30, TimeUnit.SECONDS)
                    .build()

                val url = "https://raw.githubusercontent.com/DeadskullzJr/NDS-i-Cheat-Databases/master/usrcheat.dat"
                val request = Request.Builder()
                    .url(url)
                    .header("User-Agent", "STORM_DS_Emulator")
                    .build()

                val response = client.newCall(request).execute()
                if (response.isSuccessful && response.body != null) {
                    val file = File(context.cacheDir, "usrcheat_downloaded.dat")
                    FileOutputStream(file).use { fos ->
                        fos.write(response.body!!.bytes())
                    }
                    val fileUri = Uri.fromFile(file)
                    cheatsRepository.importCheats(fileUri)
                    withContext(Dispatchers.Main) {
                        isDownloadingDb = false
                        Toast.makeText(context, "База читов успешно загружена и импортирована!", Toast.LENGTH_LONG).show()
                        refreshCheats()
                    }
                } else {
                    throw IllegalStateException("HTTP ${response.code}")
                }
            } catch (e: Throwable) {
                withContext(Dispatchers.Main) {
                    isDownloadingDb = false
                    Toast.makeText(context, "Ошибка загрузки: ${e.message}. Выберите локальный файл usrcheat.dat.", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    fun toggleCheat(cheat: Cheat, isEnabled: Boolean) {
        coroutineScope.launch(Dispatchers.IO) {
            cheatsRepository.updateCheatsStatus(listOf(cheat.copy(enabled = isEnabled)))
            refreshCheats()
        }
    }

    val displayGameCode = romInfo?.gameCode ?: ""

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(colors.bg)
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
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
                            text = if (displayGameCode.isNotBlank()) "ACTION REPLAY ЧИТЫ ($displayGameCode)" else "ACTION REPLAY ЧИТЫ",
                            fontFamily = SpaceGrotesk,
                            fontWeight = FontWeight.Bold,
                            fontSize = 13.sp,
                            color = Color.White
                        )
                    }
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text = "Официальные чит-коды для выбранной игры. Включение читов применяется мгновенно при запуске эмулятора.",
                        fontFamily = WatermelonMono,
                        fontSize = 9.5.sp,
                        color = Color.White.copy(alpha = 0.75f)
                    )

                    Spacer(Modifier.height(10.dp))
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(8.dp))
                                .background(Color.White.copy(alpha = 0.15f))
                                .clickable { importCheatsLauncher.launch(arrayOf("*/*")) }
                                .padding(vertical = 8.dp, horizontal = 10.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(Icons.Filled.UploadFile, contentDescription = null, tint = Color.White, modifier = Modifier.size(16.dp))
                                Spacer(Modifier.size(6.dp))
                                Text(
                                    text = "Импорт usrcheat.dat",
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color.White
                                )
                            }
                        }

                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(8.dp))
                                .background(Color(0xFFFF0055).copy(alpha = 0.35f))
                                .clickable { downloadOfficialDatabase() }
                                .padding(vertical = 8.dp, horizontal = 10.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                if (isDownloadingDb) {
                                    CircularProgressIndicator(color = Color.White, modifier = Modifier.size(14.dp), strokeWidth = 2.dp)
                                } else {
                                    Icon(Icons.Filled.Download, contentDescription = null, tint = Color.White, modifier = Modifier.size(16.dp))
                                }
                                Spacer(Modifier.size(6.dp))
                                Text(
                                    text = if (isDownloadingDb) "Загрузка..." else "Скачать базу читов",
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color.White
                                )
                            }
                        }
                    }
                }
            }
        }

        if (isLoading) {
            item {
                Box(
                    modifier = Modifier.fillMaxWidth().padding(32.dp),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator(color = Color(0xFFFF0055))
                }
            }
        } else if (cheatFolders.isEmpty() || cheatFolders.all { it.cheats.isEmpty() }) {
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(colors.surface.copy(alpha = 0.5f))
                        .padding(24.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            Icons.Filled.Bolt,
                            contentDescription = null,
                            tint = Color(0xFF64748B),
                            modifier = Modifier.size(40.dp)
                        )
                        Spacer(Modifier.height(8.dp))
                        Text(
                            text = "ЧИТ-КОДЫ ДЛЯ ДАННОЙ ИГРЫ НЕ НАЙДЕНЫ",
                            fontFamily = SpaceGrotesk,
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                            color = Color(0xFF94A3B8)
                        )
                        Spacer(Modifier.height(4.dp))
                        Text(
                            text = "В базе пока нет читов для ${romDisplayName(rom)}${if (displayGameCode.isNotBlank()) " [$displayGameCode]" else ""}.\nНажмите «Импорт usrcheat.dat» или «Скачать базу читов», чтобы подключить Action Replay.",
                            fontFamily = WatermelonMono,
                            fontSize = 9.5.sp,
                            color = Color(0xFF64748B),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        } else {
            cheatFolders.forEach { folder ->
                if (folder.cheats.isNotEmpty()) {
                    val folderId = folder.id ?: 0L
                    val isExpanded = expandedFolders[folderId] ?: true

                    item(key = "folder_$folderId") {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(10.dp))
                                .background(colors.surface)
                                .clickable { expandedFolders[folderId] = !isExpanded }
                                .padding(horizontal = 14.dp, vertical = 10.dp)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        if (isExpanded) Icons.Filled.FolderOpen else Icons.Filled.Folder,
                                        contentDescription = null,
                                        tint = Color(0xFFFF0055),
                                        modifier = Modifier.size(20.dp)
                                    )
                                    Spacer(Modifier.size(8.dp))
                                    Text(
                                        text = folder.name,
                                        fontFamily = SpaceGrotesk,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 13.sp,
                                        color = colors.text
                                    )
                                    Spacer(Modifier.size(6.dp))
                                    Text(
                                        text = "(${folder.cheats.size})",
                                        fontFamily = WatermelonMono,
                                        fontSize = 11.sp,
                                        color = colors.text.copy(alpha = 0.5f)
                                    )
                                }
                                Icon(
                                    if (isExpanded) Icons.Filled.ExpandMore else Icons.Filled.ChevronRight,
                                    contentDescription = null,
                                    tint = colors.text.copy(alpha = 0.6f),
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                        }
                    }

                    if (isExpanded) {
                        items(folder.cheats, key = { "cheat_${it.id}" }) { cheat ->
                            RealCheatCard(
                                cheat = cheat,
                                onToggle = { isEnabled -> toggleCheat(cheat, isEnabled) }
                            )
                        }
                    }
                }
            }
        }

        item {
            Spacer(Modifier.height(32.dp))
        }
    }
}

private fun parseRomInfoDeep(context: android.content.Context, rom: Rom): RomInfo? {
    return try {
        val rawStream = context.contentResolver.openInputStream(rom.uri) ?: return null
        val buffered = rawStream.buffered()
        buffered.mark(4)
        val magic = ByteArray(4)
        val read = buffered.read(magic)
        buffered.reset()

        val isZip = read == 4 && magic[0] == 'P'.code.toByte() && magic[1] == 'K'.code.toByte()
        if (isZip) {
            val zip = ZipInputStream(buffered)
            var entry = zip.nextEntry
            while (entry != null) {
                val name = entry.name.lowercase()
                if (name.endsWith(".nds") || name.endsWith(".dsi") || name.endsWith(".ids")) {
                    return RomProcessor.getRomInfo(rom, zip)
                }
                entry = zip.nextEntry
            }
            null
        } else {
            buffered.use { RomProcessor.getRomInfo(rom, it) }
        }
    } catch (_: Throwable) {
        null
    }
}

@Composable
private fun RealCheatCard(
    cheat: Cheat,
    onToggle: (Boolean) -> Unit,
) {
    val colors = watermelon
    var showDetails by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(colors.surface)
            .border(1.dp, if (cheat.enabled) Color(0xFFFF0055).copy(alpha = 0.4f) else Color.Transparent, RoundedCornerShape(12.dp))
            .clickable { showDetails = !showDetails }
            .padding(14.dp)
    ) {
        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(modifier = Modifier.weight(1f).padding(end = 12.dp)) {
                    Text(
                        text = cheat.name,
                        fontFamily = SpaceGrotesk,
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.5.sp,
                        color = if (cheat.enabled) Color(0xFFFF0055) else colors.text
                    )
                    val desc = cheat.description
                    if (!desc.isNullOrBlank()) {
                        Spacer(Modifier.height(2.dp))
                        Text(
                            text = desc,
                            fontFamily = WatermelonMono,
                            fontSize = 9.sp,
                            color = colors.text.copy(alpha = 0.65f),
                            maxLines = if (showDetails) 10 else 2
                        )
                    }
                }
                Switch(
                    checked = cheat.enabled,
                    onCheckedChange = { onToggle(it) },
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color.White,
                        checkedTrackColor = Color(0xFFFF0055),
                        uncheckedThumbColor = colors.text.copy(alpha = 0.6f),
                        uncheckedTrackColor = colors.bg
                    )
                )
            }

            AnimatedVisibility(visible = showDetails) {
                Column(modifier = Modifier.padding(top = 10.dp)) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.Black.copy(alpha = 0.35f))
                            .padding(10.dp)
                    ) {
                        Text(
                            text = cheat.code,
                            fontFamily = FontFamily.Monospace,
                            fontSize = 9.5.sp,
                            color = Color(0xFF4ADE80),
                            lineHeight = 14.sp
                        )
                    }
                }
            }
        }
    }
}
