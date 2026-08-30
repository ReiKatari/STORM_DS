package me.magnum.melonds.ui.dldi

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.documentfile.provider.DocumentFile
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.domain.repositories.SettingsRepository
import me.magnum.melonds.extensions.applyImmersiveFullscreen
import me.magnum.melonds.ui.theme.LocalWatermelonColors
import me.magnum.melonds.ui.theme.MelonTheme
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.utils.FatImageExtractor
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

sealed class FileItem {
    abstract val name: String
    abstract val isDirectory: Boolean
    abstract val size: Long
    abstract val lastModified: Long

    data class Local(val file: File) : FileItem() {
        override val name: String get() = file.name
        override val isDirectory: Boolean get() = file.isDirectory
        override val size: Long get() = if (file.isDirectory) 0L else file.length()
        override val lastModified: Long get() = file.lastModified()
    }

    data class Document(val doc: DocumentFile) : FileItem() {
        override val name: String get() = doc.name.orEmpty()
        override val isDirectory: Boolean get() = doc.isDirectory
        override val size: Long get() = if (doc.isDirectory) 0L else doc.length()
        override val lastModified: Long get() = doc.lastModified()
    }
}

@dagger.hilt.EntryPoint
@dagger.hilt.InstallIn(dagger.hilt.components.SingletonComponent::class)
interface DsiSdFileManagerEntryPoint {
    fun settingsRepository(): SettingsRepository
}

class DsiSdFileManagerActivity : ComponentActivity() {

    private val settingsRepository: SettingsRepository by lazy {
        dagger.hilt.android.EntryPointAccessors.fromApplication(
            applicationContext,
            DsiSdFileManagerEntryPoint::class.java
        ).settingsRepository()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        applyImmersiveMode()

        setContent {
            MelonTheme {
                DsiSdFileManagerScreen(
                    settingsRepository = settingsRepository,
                    onBack = { finish() }
                )
            }
        }
    }

    private fun applyImmersiveMode() {
        window.applyImmersiveFullscreen()
    }

    override fun onResume() {
        super.onResume()
        applyImmersiveMode()
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            applyImmersiveMode()
        }
    }
}

@Composable
fun DsiSdFileManagerScreen(
    settingsRepository: SettingsRepository,
    onBack: () -> Unit
) {
    val colors = LocalWatermelonColors.current
    val cyanColor = remember { Color(0xFF00E5FF) }
    val coroutineScope = rememberCoroutineScope()
    val context = androidx.compose.ui.platform.LocalContext.current

    // Safe resolution of directories
    val localSyncDir = remember {
        try {
            File(context.filesDir, "dsi_sd/sync").apply { mkdirs() }
        } catch (e: Throwable) {
            File(context.filesDir, "dsi_sync").apply { mkdirs() }
        }
    }

    val dsiSdDirUri = remember {
        runCatching { settingsRepository.getDsiSdCardDirectory() }.getOrNull()
    }

    val initialDocTree = remember {
        if (dsiSdDirUri != null) {
            runCatching {
                val doc = DocumentFile.fromTreeUri(context, dsiSdDirUri)
                if (doc != null && doc.exists() && doc.isDirectory && doc.canRead()) doc else null
            }.getOrNull()
        } else null
    }

    var isDocumentMode by remember { mutableStateOf(initialDocTree != null) }
    var currentLocalDir by remember { mutableStateOf(localSyncDir) }
    var currentDocTree by remember { mutableStateOf(initialDocTree) }
    val docDirectoryStack = remember { mutableStateListOf<DocumentFile>() }

    var fileItems by remember { mutableStateOf<List<FileItem>>(emptyList()) }
    var isLoading by remember { mutableStateOf(true) }

    // Dialog states
    var itemToRename by remember { mutableStateOf<FileItem?>(null) }
    var renameInput by remember { mutableStateOf("") }

    var itemToDelete by remember { mutableStateOf<FileItem?>(null) }
    var isCreateFolderDialogOpen by remember { mutableStateOf(false) }
    var newFolderNameInput by remember { mutableStateOf("") }

    fun refreshList() {
        isLoading = true
        coroutineScope.launch(Dispatchers.IO) {
            val list = mutableListOf<FileItem>()
            if (isDocumentMode && currentDocTree != null) {
                try {
                    val docs = currentDocTree?.listFiles() ?: emptyArray()
                    docs.forEach { doc ->
                        if (doc.name != null) {
                            list.add(FileItem.Document(doc))
                        }
                    }
                } catch (e: Throwable) {
                    list.clear()
                }
            } else {
                try {
                    // Check if local sync dir is empty and an SD card image file exists
                    val existingFiles = currentLocalDir.listFiles() ?: emptyArray()
                    if (existingFiles.isEmpty() && currentLocalDir == localSyncDir) {
                        val extBase = Environment.getExternalStorageDirectory()
                        val candidateImages = listOf(
                            File(extBase, "STORM DS/bios/dsi/sd_card.bin"),
                            File(extBase, "STORM DS/bios/dsi/sd.bin"),
                            File(extBase, "STORM DS/bios/sd_card.bin"),
                            File(extBase, "STORM DS/bios/sd.bin"),
                            File(extBase, "STORM DS/sd_card.bin"),
                            File(extBase, "STORM DS/dldi/dsi_sd.img"),
                            File(extBase, "STORM DS/dldi/dldi_sd.img"),
                            File(context.filesDir, "bios/dsi/sd_card.bin"),
                            File(context.filesDir, "bios/dsi/sd.bin"),
                            File(context.filesDir, "dsi_sd/dsi_sd.img"),
                            File(context.filesDir, "dldi/dsi_sd.img"),
                            File(context.filesDir, "dldi/dldi_sd.img"),
                        )
                        for (img in candidateImages) {
                            if (img.isFile && img.length() >= 512 * 1024L) {
                                if (FatImageExtractor.extractFatImage(img, localSyncDir)) {
                                    break
                                }
                            }
                        }
                    }

                    val files = currentLocalDir.listFiles() ?: emptyArray()
                    files.forEach { file ->
                        list.add(FileItem.Local(file))
                    }
                } catch (e: Throwable) {
                    list.clear()
                }
            }

            list.sortWith(compareBy({ !it.isDirectory }, { it.name.lowercase() }))
            withContext(Dispatchers.Main) {
                fileItems = list
                isLoading = false
            }
        }
    }

    LaunchedEffect(currentLocalDir, currentDocTree) {
        refreshList()
    }

    fun navigateIntoFolder(item: FileItem) {
        if (!item.isDirectory) return
        if (isDocumentMode && item is FileItem.Document) {
            currentDocTree?.let { docDirectoryStack.add(it) }
            currentDocTree = item.doc
        } else if (item is FileItem.Local) {
            currentLocalDir = item.file
        }
    }

    fun navigateUp(): Boolean {
        if (isDocumentMode) {
            if (docDirectoryStack.isNotEmpty()) {
                currentDocTree = docDirectoryStack.removeLast()
                return true
            }
        } else {
            if (currentLocalDir != localSyncDir && currentLocalDir.parentFile != null && currentLocalDir.parentFile!!.startsWith(localSyncDir)) {
                currentLocalDir = currentLocalDir.parentFile!!
                return true
            }
        }
        return false
    }

    fun renameItem(item: FileItem, newName: String) {
        if (newName.isBlank()) return
        coroutineScope.launch(Dispatchers.IO) {
            var success = false
            try {
                if (item is FileItem.Local) {
                    val target = File(item.file.parentFile, newName)
                    success = item.file.renameTo(target)
                } else if (item is FileItem.Document) {
                    success = item.doc.renameTo(newName)
                }
            } catch (e: Throwable) {
                success = false
            }
            withContext(Dispatchers.Main) {
                if (success) {
                    Toast.makeText(context, "Переименовано", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "Ошибка переименования", Toast.LENGTH_SHORT).show()
                }
                refreshList()
            }
        }
    }

    fun deleteItem(item: FileItem) {
        coroutineScope.launch(Dispatchers.IO) {
            var success = false
            try {
                if (item is FileItem.Local) {
                    success = item.file.deleteRecursively()
                } else if (item is FileItem.Document) {
                    success = item.doc.delete()
                }
            } catch (e: Throwable) {
                success = false
            }
            withContext(Dispatchers.Main) {
                if (success) {
                    Toast.makeText(context, "Удалено", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "Ошибка удаления", Toast.LENGTH_SHORT).show()
                }
                refreshList()
            }
        }
    }

    fun createFolder(name: String) {
        if (name.isBlank()) return
        coroutineScope.launch(Dispatchers.IO) {
            var success = false
            try {
                if (isDocumentMode && currentDocTree != null) {
                    val created = currentDocTree?.createDirectory(name)
                    success = created != null
                } else {
                    val newDir = File(currentLocalDir, name)
                    success = newDir.mkdirs()
                }
            } catch (e: Throwable) {
                success = false
            }
            withContext(Dispatchers.Main) {
                if (success) {
                    Toast.makeText(context, "Папка создана", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "Ошибка создания папки", Toast.LENGTH_SHORT).show()
                }
                refreshList()
            }
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colors.bg)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 72.dp)
        ) {
            // Header
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .statusBarsPadding()
                    .padding(horizontal = 16.dp, vertical = 12.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(38.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(colors.surface2)
                        .border(1.dp, colors.line, RoundedCornerShape(10.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Filled.SdCard,
                        contentDescription = null,
                        tint = cyanColor,
                        modifier = Modifier.size(22.dp)
                    )
                }
                Spacer(Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Менеджер файлов SD-карты Nintendo DSi",
                        color = colors.text,
                        fontFamily = SpaceGrotesk,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = if (isDocumentMode) "Пользовательская папка SD-карты Nintendo DSi" else "Внутреннее хранилище SD-карты Nintendo DSi (Mirror)",
                        color = colors.text3,
                        fontFamily = WatermelonMono,
                        fontSize = 11.sp
                    )
                }
                IconButton(onClick = { isCreateFolderDialogOpen = true }) {
                    Icon(
                        imageVector = Icons.Filled.CreateNewFolder,
                        contentDescription = "Новая папка",
                        tint = cyanColor,
                        modifier = Modifier.size(24.dp)
                    )
                }
                IconButton(onClick = { refreshList() }) {
                    Icon(
                        imageVector = Icons.Filled.Refresh,
                        contentDescription = "Обновить",
                        tint = colors.text2,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }

            // Path & Navigation bar
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(colors.surface2)
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                val canGoUp = if (isDocumentMode) docDirectoryStack.isNotEmpty() else currentLocalDir != localSyncDir
                if (canGoUp) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Вверх",
                        tint = cyanColor,
                        modifier = Modifier
                            .size(20.dp)
                            .clickable { navigateUp() }
                    )
                    Spacer(Modifier.width(8.dp))
                }

                val currentPathName = if (isDocumentMode) {
                    currentDocTree?.name ?: "Корень SD"
                } else {
                    if (currentLocalDir == localSyncDir) "Корень SD" else currentLocalDir.name
                }

                Text(
                    text = "📁 $currentPathName",
                    color = colors.text2,
                    fontFamily = SpaceGrotesk,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.weight(1f)
                )

                Text(
                    text = "${fileItems.size} элементов",
                    color = colors.text3,
                    fontFamily = WatermelonMono,
                    fontSize = 11.sp
                )
            }

            Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))

            if (isLoading) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator(color = cyanColor)
                }
            } else if (fileItems.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(24.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(72.dp)
                                .clip(CircleShape)
                                .background(colors.surface2),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Folder,
                                contentDescription = null,
                                tint = colors.text3,
                                modifier = Modifier.size(36.dp)
                            )
                        }
                        Spacer(Modifier.height(14.dp))
                        Text(
                            text = "Папка пуста",
                            color = colors.text,
                            fontFamily = SpaceGrotesk,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(Modifier.height(6.dp))
                        Text(
                            text = "Здесь нет файлов. Нажмите на иконку папки сверху, чтобы создать каталог.",
                            color = colors.text2,
                            fontFamily = SpaceGrotesk,
                            fontSize = 12.sp,
                            textAlign = androidx.compose.ui.text.style.TextAlign.Center
                        )
                    }
                }
            } else {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(horizontal = 14.dp, vertical = 10.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(fileItems, key = { it.name + it.isDirectory }) { item ->
                        val isDir = item.isDirectory
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(12.dp))
                                .background(colors.surface2)
                                .border(1.dp, colors.line, RoundedCornerShape(12.dp))
                                .clickable {
                                    if (isDir) {
                                        navigateIntoFolder(item)
                                    }
                                }
                                .padding(horizontal = 14.dp, vertical = 12.dp)
                        ) {
                            Icon(
                                imageVector = if (isDir) Icons.Filled.Folder else when {
                                    item.name.endsWith(".nds", ignoreCase = true) || item.name.endsWith(".dsi", ignoreCase = true) -> Icons.Filled.SportsEsports
                                    item.name.endsWith(".sav", ignoreCase = true) -> Icons.Filled.Save
                                    item.name.endsWith(".ini", ignoreCase = true) || item.name.endsWith(".cfg", ignoreCase = true) -> Icons.Filled.Settings
                                    else -> Icons.Filled.Description
                                },
                                contentDescription = null,
                                tint = if (isDir) cyanColor else colors.green,
                                modifier = Modifier.size(24.dp)
                            )
                            Spacer(Modifier.width(12.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = item.name,
                                    color = colors.text,
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Medium,
                                    maxLines = 1
                                )
                                val detailsText = if (isDir) {
                                    "Папка"
                                } else {
                                    val sizeKb = item.size / 1024
                                    if (sizeKb >= 1024) String.format(Locale.US, "%.1f MB", sizeKb / 1024f) else "$sizeKb KB"
                                }
                                Text(
                                    text = detailsText,
                                    color = colors.text3,
                                    fontFamily = WatermelonMono,
                                    fontSize = 11.sp
                                )
                            }

                            // Rename button
                            IconButton(
                                onClick = {
                                    itemToRename = item
                                    renameInput = item.name
                                },
                                modifier = Modifier.size(32.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.Edit,
                                    contentDescription = "Переименовать",
                                    tint = colors.text2,
                                    modifier = Modifier.size(18.dp)
                                )
                            }

                            // Delete button
                            IconButton(
                                onClick = { itemToDelete = item },
                                modifier = Modifier.size(32.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.Delete,
                                    contentDescription = "Удалить",
                                    tint = colors.red,
                                    modifier = Modifier.size(18.dp)
                                )
                            }
                        }
                    }
                }
            }
        }

        // Bottom Navigation Bar with Back Button
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .background(colors.surface)
                .navigationBarsPadding()
                .padding(bottom = 16.dp, top = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            me.magnum.melonds.ui.common.UnifiedBackButton(
                onClick = {
                    if (!navigateUp()) {
                        onBack()
                    }
                }
            )
        }
    }

    // Rename Dialog
    itemToRename?.let { item ->
        AlertDialog(
            onDismissRequest = { itemToRename = null },
            backgroundColor = colors.surface,
            title = {
                Text(
                    text = "Переименовать",
                    color = colors.text,
                    fontFamily = SpaceGrotesk,
                    fontWeight = FontWeight.Bold
                )
            },
            text = {
                Column {
                    Text(
                        text = "Введите новое имя:",
                        color = colors.text2,
                        fontFamily = SpaceGrotesk,
                        fontSize = 13.sp
                    )
                    Spacer(Modifier.height(8.dp))
                    OutlinedTextField(
                        value = renameInput,
                        onValueChange = { renameInput = it },
                        singleLine = true,
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            textColor = colors.text,
                            cursorColor = cyanColor,
                            focusedBorderColor = cyanColor,
                            unfocusedBorderColor = colors.line
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        val trimmed = renameInput.trim()
                        if (trimmed.isNotBlank()) {
                            renameItem(item, trimmed)
                        }
                        itemToRename = null
                    }
                ) {
                    Text("Сохранить", color = cyanColor, fontFamily = SpaceGrotesk)
                }
            },
            dismissButton = {
                TextButton(onClick = { itemToRename = null }) {
                    Text("Отмена", color = colors.text3, fontFamily = SpaceGrotesk)
                }
            }
        )
    }

    // Delete Confirmation Dialog
    itemToDelete?.let { item ->
        AlertDialog(
            onDismissRequest = { itemToDelete = null },
            backgroundColor = colors.surface,
            title = {
                Text(
                    text = "Удалить ${if (item.isDirectory) "папку" else "файл"}?",
                    color = colors.text,
                    fontFamily = SpaceGrotesk,
                    fontWeight = FontWeight.Bold
                )
            },
            text = {
                Text(
                    text = "Вы уверены, что хотите безвозвратно удалить «${item.name}»?",
                    color = colors.text2,
                    fontFamily = SpaceGrotesk,
                    fontSize = 13.sp
                )
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        deleteItem(item)
                        itemToDelete = null
                    }
                ) {
                    Text("Удалить", color = colors.red, fontFamily = SpaceGrotesk)
                }
            },
            dismissButton = {
                TextButton(onClick = { itemToDelete = null }) {
                    Text("Отмена", color = colors.text3, fontFamily = SpaceGrotesk)
                }
            }
        )
    }

    // Create Folder Dialog
    if (isCreateFolderDialogOpen) {
        AlertDialog(
            onDismissRequest = { isCreateFolderDialogOpen = false },
            backgroundColor = colors.surface,
            title = {
                Text(
                    text = "Создать папку",
                    color = colors.text,
                    fontFamily = SpaceGrotesk,
                    fontWeight = FontWeight.Bold
                )
            },
            text = {
                Column {
                    Text(
                        text = "Введите название новой папки:",
                        color = colors.text2,
                        fontFamily = SpaceGrotesk,
                        fontSize = 13.sp
                    )
                    Spacer(Modifier.height(8.dp))
                    OutlinedTextField(
                        value = newFolderNameInput,
                        onValueChange = { newFolderNameInput = it },
                        singleLine = true,
                        placeholder = { Text("Например, roms или title", color = colors.text3) },
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            textColor = colors.text,
                            cursorColor = cyanColor,
                            focusedBorderColor = cyanColor,
                            unfocusedBorderColor = colors.line
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        val trimmed = newFolderNameInput.trim()
                        if (trimmed.isNotBlank()) {
                            createFolder(trimmed)
                        }
                        newFolderNameInput = ""
                        isCreateFolderDialogOpen = false
                    }
                ) {
                    Text("Создать", color = cyanColor, fontFamily = SpaceGrotesk)
                }
            },
            dismissButton = {
                TextButton(onClick = {
                    newFolderNameInput = ""
                    isCreateFolderDialogOpen = false
                }) {
                    Text("Отмена", color = colors.text3, fontFamily = SpaceGrotesk)
                }
            }
        )
    }
}
