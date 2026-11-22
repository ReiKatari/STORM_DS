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
import androidx.compose.foundation.layout.width
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
import androidx.compose.material.icons.filled.Close
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.R
import me.magnum.melonds.common.cheats.EmbeddedActionReplayCheats
import me.magnum.melonds.common.network.SharedOkHttpClient
import me.magnum.melonds.di.entrypoint.CheatsEntryPoint
import me.magnum.melonds.domain.model.Cheat
import me.magnum.melonds.domain.model.CheatFolder
import me.magnum.melonds.domain.model.Game
import me.magnum.melonds.domain.model.RomInfo
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.emulator.ui.JusrcheatAllGamesTab
import me.magnum.melonds.ui.romlist.composables.romDisplayName
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon
import me.magnum.melonds.utils.RomProcessor
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
    var showJusrcheatBrowser by remember { mutableStateOf(false) }

    val expandedFolders = remember(rom) { mutableStateMapOf<Long, Boolean>() }
    var refreshJob by remember(rom) { mutableStateOf<Job?>(null) }
    var pendingAutoImportSig by remember { mutableStateOf<String?>(null) }

    fun refreshCheats() {
        refreshJob?.cancel()
        isLoading = true
        refreshJob = coroutineScope.launch(Dispatchers.IO) {
            val parsedInfo = parseRomInfoDeep(context, rom)

            val checksum = parsedInfo?.headerChecksumString() ?: ""
            val effectiveCode = parsedInfo?.gameCode?.takeIf { it.isNotBlank() }
                ?: extractDsiCode(rom)
            val effectiveTitle = parsedInfo?.gameTitle?.takeIf { it.isNotBlank() }
                ?: romDisplayName(rom)

            EmbeddedActionReplayCheats.populateIfEmpty(database, effectiveCode, effectiveTitle, checksum)

            var foundGame = if (parsedInfo != null) {
                cheatsRepository.findGameForRom(parsedInfo)
            } else {
                null
            }

            if (foundGame == null) {
                val resolvedEntity = (if (checksum.isNotBlank()) database.gameDao().findGameByChecksum(checksum) else null)
                    ?: database.gameDao().findGameByCode(effectiveCode)
                    ?: if (effectiveCode.length >= 3) database.gameDao().findGameByPrefix(effectiveCode.take(3)) else null
                    ?: database.gameDao().findGameByTitle(effectiveTitle)

                foundGame = resolvedEntity?.let {
                    Game(it.id, it.name, it.gameCode, it.gameChecksum, emptyList())
                }
            }
            withContext(Dispatchers.Main) {
                romInfo = parsedInfo
                game = foundGame
            }

            if (foundGame != null) {
                cheatsRepository.getAllGameCheats(foundGame).collect { folders ->
                    if (folders.isEmpty()) {
                        EmbeddedActionReplayCheats.populateIfEmpty(database, effectiveCode, effectiveTitle, checksum)
                    }
                    withContext(Dispatchers.Main) {
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
                }
            } else {
                withContext(Dispatchers.Main) {
                    cheatFolders = emptyList()
                    isLoading = false
                }
            }
        }
    }

    LaunchedEffect(cheatsRepository) {
        var sawActiveImport = false
        cheatsRepository.getCheatImportProgress().collect { progress ->
            when (progress.status) {
                me.magnum.melonds.domain.model.CheatImportProgress.CheatImportStatus.STARTING,
                me.magnum.melonds.domain.model.CheatImportProgress.CheatImportStatus.ONGOING -> {
                    sawActiveImport = true
                }
                me.magnum.melonds.domain.model.CheatImportProgress.CheatImportStatus.FINISHED -> {
                    if (sawActiveImport) {
                        sawActiveImport = false
                        pendingAutoImportSig?.let { sig ->
                            context.getSharedPreferences("storm_cheats_auto_import", android.content.Context.MODE_PRIVATE)
                                .edit()
                                .putString("usrcheat_auto_import_sig", sig)
                                .apply()
                            pendingAutoImportSig = null
                        }
                        Toast.makeText(context, R.string.cheats_import_finished, Toast.LENGTH_LONG).show()
                        refreshCheats()
                    }
                }
                me.magnum.melonds.domain.model.CheatImportProgress.CheatImportStatus.FAILED -> {
                    if (sawActiveImport) {
                        sawActiveImport = false
                        pendingAutoImportSig = null
                        Toast.makeText(context, R.string.cheats_import_failed, Toast.LENGTH_LONG).show()
                    }
                }
                me.magnum.melonds.domain.model.CheatImportProgress.CheatImportStatus.NOT_IMPORTING -> {
                    sawActiveImport = false
                }
            }
        }
    }

    LaunchedEffect(rom) {
        // Auto-check for cheat files in /storage/emulated/0/STORM DS/cheats/ with internal fallback
        withContext(Dispatchers.IO) {
            val extCheatsDir = runCatching {
                File(android.os.Environment.getExternalStorageDirectory(), "STORM DS/cheats")
            }.getOrNull()
            val extUsrCheat = extCheatsDir?.let { File(it, "usrcheat.dat") }?.takeIf { it.exists() && it.canRead() }
            val internalUsrCheat = File(context.filesDir, "cheats/usrcheat.dat").takeIf { it.exists() && it.canRead() }
            val usrCheat = extUsrCheat ?: internalUsrCheat
            if (usrCheat != null && usrCheat.exists() && usrCheat.length() > 1024L) {
                val hasValidMagic = runCatching {
                    usrCheat.inputStream().use { ins ->
                        val hdr = ByteArray(12)
                        val r = ins.read(hdr)
                        r == 12 && String(hdr, Charsets.US_ASCII).startsWith("R4 CheatCode")
                    }
                }.getOrDefault(false)
                if (hasValidMagic) {
                    val prefs = context.getSharedPreferences("storm_cheats_auto_import", android.content.Context.MODE_PRIVATE)
                    val currentSig = "${usrCheat.length()}_${usrCheat.lastModified()}"
                    val lastSig = prefs.getString("usrcheat_auto_import_sig", null)
                    if (currentSig != lastSig) {
                        withContext(Dispatchers.Main) {
                            pendingAutoImportSig = currentSig
                        }
                        runCatching {
                            cheatsRepository.importCheats(Uri.fromFile(usrCheat))
                        }.onFailure {
                            withContext(Dispatchers.Main) {
                                pendingAutoImportSig = null
                            }
                        }
                    }
                }
            }
        }
        refreshCheats()
    }

    val importCheatsLauncher = rememberLauncherForActivityResult(ActivityResultContracts.OpenDocument()) { uri ->
        if (uri != null) {
            coroutineScope.launch(Dispatchers.IO) {
                var importedSig: String? = null
                // Copy imported file to STORM DS/cheats/ (or internal fallback without MANAGE_EXTERNAL_STORAGE)
                runCatching {
                    val cheatsDir = resolveWritableCheatsDir(context)
                    val fileName = runCatching {
                        androidx.documentfile.provider.DocumentFile.fromSingleUri(context, uri)?.name
                    }.getOrNull() ?: "usrcheat.dat"
                    val targetName = when {
                        fileName.endsWith(".dat", ignoreCase = true) -> "usrcheat.dat"
                        fileName.endsWith(".xml", ignoreCase = true) -> "cheat.xml"
                        fileName.endsWith(".zip", ignoreCase = true) -> "cheats.zip"
                        else -> "usrcheat.dat"
                    }
                    context.contentResolver.openInputStream(uri)?.use { input ->
                        val target = File(cheatsDir, targetName)
                        FileOutputStream(target).use { output ->
                            input.copyTo(output)
                        }
                        if (targetName == "usrcheat.dat") {
                            importedSig = "${target.length()}_${target.lastModified()}"
                        }
                    }
                }
                withContext(Dispatchers.Main) {
                    pendingAutoImportSig = importedSig
                }
                cheatsRepository.importCheats(uri)
            }
        }
    }

    fun downloadOfficialDatabase() {
        if (isDownloadingDb) return
        isDownloadingDb = true
        coroutineScope.launch(Dispatchers.IO) {
            val effectiveCode = romInfo?.gameCode?.takeIf { it.isNotBlank() } ?: extractDsiCode(rom)
            val effectiveTitle = romInfo?.gameTitle?.takeIf { it.isNotBlank() } ?: romDisplayName(rom)

            // 1. First ensure embedded/offline cheats are populated in database
            val populated = EmbeddedActionReplayCheats.populateIfEmpty(database, effectiveCode, effectiveTitle)

            // 2. Try online mirror download of full usrcheat.dat
            var downloaded = false
            var downloadedSig: String? = null
            val candidateUrls = listOf(
                "https://raw.githubusercontent.com/3song/Hacking-DeadSkullzJr-s-NDS-i--Cheat-Databases/main/Cheat%20Databases/usrcheat.dat",
                "https://ghfast.top/https://raw.githubusercontent.com/3song/Hacking-DeadSkullzJr-s-NDS-i--Cheat-Databases/main/Cheat%20Databases/usrcheat.dat",
                "https://gh-proxy.com/https://raw.githubusercontent.com/3song/Hacking-DeadSkullzJr-s-NDS-i--Cheat-Databases/main/Cheat%20Databases/usrcheat.dat",
                "https://ghproxy.net/https://raw.githubusercontent.com/3song/Hacking-DeadSkullzJr-s-NDS-i--Cheat-Databases/main/Cheat%20Databases/usrcheat.dat",
            )

            val client = SharedOkHttpClient.instance.newBuilder()
                .followRedirects(true)
                .followSslRedirects(true)
                .connectTimeout(12, TimeUnit.SECONDS)
                .readTimeout(40, TimeUnit.SECONDS)
                .callTimeout(180, TimeUnit.SECONDS)
                .build()

            val cheatsDir = resolveWritableCheatsDir(context)
            val targetCheatFile = File(cheatsDir, "usrcheat.dat")
            val tempCheatFile = File(cheatsDir, "usrcheat.dat.tmp")

            for (url in candidateUrls) {
                try {
                    val request = Request.Builder()
                        .url(url)
                        .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)")
                        .build()

                    client.newCall(request).execute().use { response ->
                        val body = response.body
                        if (response.isSuccessful && body != null) {
                            body.byteStream().use { input ->
                                val header = ByteArray(16)
                                val headerRead = input.read(header)
                                if (headerRead >= 12 && String(header, 0, 12, Charsets.US_ASCII).startsWith("R4 CheatCode")) {
                                    FileOutputStream(tempCheatFile).use { fos ->
                                        fos.write(header, 0, headerRead)
                                        input.copyTo(fos, 32 * 1024)
                                        fos.flush()
                                    }
                                    if (tempCheatFile.length() > 1024L) {
                                        if (targetCheatFile.exists()) targetCheatFile.delete()
                                        if (!tempCheatFile.renameTo(targetCheatFile)) {
                                            tempCheatFile.copyTo(targetCheatFile, overwrite = true)
                                            tempCheatFile.delete()
                                        }
                                        downloadedSig = "${targetCheatFile.length()}_${targetCheatFile.lastModified()}"
                                        downloaded = true
                                    } else {
                                        tempCheatFile.delete()
                                    }
                                }
                            }
                        }
                    }
                    if (downloaded) break
                } catch (_: Throwable) {
                    runCatching { tempCheatFile.delete() }
                }
            }

            if (downloaded) {
                withContext(Dispatchers.Main) {
                    pendingAutoImportSig = downloadedSig
                    isDownloadingDb = false
                    Toast.makeText(context, context.getString(R.string.v870_cheats_downloaded_importing), Toast.LENGTH_SHORT).show()
                }
                cheatsRepository.importCheats(Uri.fromFile(targetCheatFile))
            } else {
                withContext(Dispatchers.Main) {
                    isDownloadingDb = false
                    if (populated) {
                        Toast.makeText(context, context.getString(R.string.v870_cheats_ar_connected), Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(context, context.getString(R.string.v870_cheats_db_synced), Toast.LENGTH_SHORT).show()
                    }
                    refreshCheats()
                }
            }
        }
    }

    fun toggleCheat(cheat: Cheat, isEnabled: Boolean) {
        coroutineScope.launch(Dispatchers.IO) {
            cheatsRepository.updateCheatsStatus(listOf(cheat.copy(enabled = isEnabled)))
        }
    }

    val displayGameCode = romInfo?.gameCode?.takeIf { it.isNotBlank() } ?: extractDsiCode(rom)

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
                            text = if (displayGameCode.isNotBlank()) stringResource(R.string.v870_cheats_header_with_code, displayGameCode) else stringResource(R.string.v870_cheats_header_default),
                            fontFamily = SpaceGrotesk,
                            fontWeight = FontWeight.Bold,
                            fontSize = 13.sp,
                            color = Color.White
                        )
                    }
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text = stringResource(R.string.v870_cheats_rom_card_desc),
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
                                .clickable { importCheatsLauncher.launch(arrayOf("application/octet-stream", "text/xml", "application/xml", "application/zip", "*/*")) }
                                .padding(vertical = 8.dp, horizontal = 10.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(Icons.Filled.UploadFile, contentDescription = null, tint = Color.White, modifier = Modifier.size(16.dp))
                                Spacer(Modifier.size(6.dp))
                                Text(
                                    text = stringResource(R.string.v870_cheats_import_file_btn),
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
                                    text = if (isDownloadingDb) stringResource(R.string.v870_cheats_updating_btn) else stringResource(R.string.v870_cheats_update_db_btn),
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color.White
                                )
                            }
                        }
                    }

                    Spacer(Modifier.height(8.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.White.copy(alpha = 0.2f))
                            .clickable { showJusrcheatBrowser = true }
                            .padding(vertical = 9.dp, horizontal = 12.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Filled.Bolt, contentDescription = null, tint = Color.White, modifier = Modifier.size(17.dp))
                            Spacer(Modifier.size(6.dp))
                            Text(
                                text = stringResource(R.string.v791_jusrcheat_open_browser_btn),
                                fontFamily = SpaceGrotesk,
                                fontSize = 11.5.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
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
                            text = stringResource(R.string.v870_cheats_none_found_title),
                            fontFamily = SpaceGrotesk,
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                            color = Color(0xFF94A3B8)
                        )
                        Spacer(Modifier.height(4.dp))
                        Text(
                            text = stringResource(R.string.v870_cheats_none_found_desc, "${romDisplayName(rom)}${if (displayGameCode.isNotBlank()) " [$displayGameCode]" else ""}"),
                            fontFamily = WatermelonMono,
                            fontSize = 9.5.sp,
                            color = Color(0xFF64748B),
                            textAlign = TextAlign.Center
                        )
                        Spacer(Modifier.height(10.dp))
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(8.dp))
                                .background(colors.green)
                                .clickable { showJusrcheatBrowser = true }
                                .padding(horizontal = 14.dp, vertical = 8.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    Icons.Filled.Bolt,
                                    contentDescription = null,
                                    tint = if (colors.isDark) Color.Black else Color.White,
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(Modifier.width(6.dp))
                                Text(
                                    text = stringResource(R.string.v791_jusrcheat_open_browser_btn),
                                    color = if (colors.isDark) Color.Black else Color.White,
                                    fontFamily = SpaceGrotesk,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 11.5.sp
                                )
                            }
                        }
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

    if (showJusrcheatBrowser) {
        Dialog(
            onDismissRequest = { showJusrcheatBrowser = false },
            properties = DialogProperties(usePlatformDefaultWidth = false)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.85f))
                    .padding(horizontal = 12.dp, vertical = 20.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(16.dp))
                        .background(colors.surface)
                        .border(1.dp, colors.line, RoundedCornerShape(16.dp))
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 12.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Filled.Bolt, contentDescription = null, tint = colors.green, modifier = Modifier.size(20.dp))
                            Spacer(Modifier.width(8.dp))
                            Text(
                                text = stringResource(R.string.v791_jusrcheat_browser_title),
                                color = colors.text,
                                fontFamily = SpaceGrotesk,
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp
                            )
                        }
                        Icon(
                            Icons.Filled.Close,
                            contentDescription = "Close",
                            tint = colors.text2,
                            modifier = Modifier
                                .size(24.dp)
                                .clickable { showJusrcheatBrowser = false }
                        )
                    }

                    Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))

                    JusrcheatAllGamesTab(
                        romInfo = romInfo,
                        cheatsRepository = cheatsRepository,
                        onCheatAttached = {
                            refreshCheats()
                        },
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
        }
    }
}

private fun resolveWritableCheatsDir(context: android.content.Context): File {
    val extDir = runCatching {
        File(android.os.Environment.getExternalStorageDirectory(), "STORM DS/cheats")
    }.getOrNull()
    if (extDir != null && isCheatsDirWritable(extDir)) {
        return extDir
    }
    return File(context.filesDir, "cheats").apply { mkdirs() }
}

private fun isCheatsDirWritable(dir: File): Boolean {
    if (!dir.exists() && !dir.mkdirs()) return false
    if (!dir.isDirectory) return false
    return runCatching {
        val probe = File(dir, ".write_test_${System.nanoTime()}")
        FileOutputStream(probe).use { it.write(0) }
        probe.delete()
        true
    }.getOrDefault(false)
}

private fun extractDsiCode(rom: Rom): String {
    val titleId = rom.installedDsiWareTitleId
    if (titleId != null) {
        val low32 = (titleId and 0xFFFFFFFFL)
        val b0 = ((low32 shr 24) and 0xFF).toInt().toChar()
        val b1 = ((low32 shr 16) and 0xFF).toInt().toChar()
        val b2 = ((low32 shr 8) and 0xFF).toInt().toChar()
        val b3 = (low32 and 0xFF).toInt().toChar()
        val forward = "$b0$b1$b2$b3"
        if (forward.all { it.isLetterOrDigit() }) return forward.uppercase()
        val reverse = "$b3$b2$b1$b0"
        if (reverse.all { it.isLetterOrDigit() }) return reverse.uppercase()
        return (low32 and 0xFFFFFFFFL).toString(16).padStart(8, '0').take(4).uppercase()
    }
    return extractCodeFromName(rom.name, rom.retroAchievementsHash)
}

private fun extractCodeFromName(name: String, hashFallback: String = ""): String {
    val regex = Regex("([A-Za-z0-9]{4})")
    val match = regex.find(name)
    if (match != null) return match.value.uppercase()
    if (hashFallback.isNotBlank()) return hashFallback.take(4).uppercase()
    val clean = name.filter { it.isLetterOrDigit() }.uppercase()
    if (clean.length >= 4) return clean.take(4)
    val hash = kotlin.math.abs(name.hashCode()).toString(16).padStart(4, '0').take(4).uppercase()
    return "DS$hash".take(4)
}

private fun parseRomInfoDeep(context: android.content.Context, rom: Rom): RomInfo? {
    if (rom.isInstalledDsiWareShortcut) {
        val code = extractDsiCode(rom)
        val checksum = (rom.installedDsiWareTitleId ?: 0L).toUInt()
        return RomInfo(code, checksum, rom.name, rom.name, isDsiWareTitle = true)
    }

    return try {
        val rawStream = context.contentResolver.openInputStream(rom.uri) ?: return null
        rawStream.buffered().use { buffered ->
            buffered.mark(4)
            val magic = ByteArray(4)
            val read = buffered.read(magic)
            buffered.reset()

            val isZip = read == 4 && magic[0] == 'P'.code.toByte() && magic[1] == 'K'.code.toByte()
            if (isZip) {
                ZipInputStream(buffered).use { zip ->
                    var entry = zip.nextEntry
                    while (entry != null) {
                        val name = entry.name.lowercase()
                        if (name.endsWith(".nds") || name.endsWith(".dsi") || name.endsWith(".ids")) {
                            return RomProcessor.getRomInfo(rom, zip)
                        }
                        zip.closeEntry()
                        entry = zip.nextEntry
                    }
                    null
                }
            } else {
                RomProcessor.getRomInfo(rom, buffered)
            }
        }
    } catch (_: Throwable) {
        val code = extractDsiCode(rom)
        val checksum = kotlin.math.abs(rom.name.hashCode()).toUInt()
        RomInfo(code, checksum, rom.name, rom.name, isDsiWareTitle = rom.isDsiWareTitle)
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
