package me.magnum.melonds.ui.dldi

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.Folder
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon
import java.io.File

class DldiFileManagerActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dldiDir = File(filesDir, "dldi/sync").apply { mkdirs() }

        setContent {
            val colors = watermelon
            var currentFiles by remember { mutableStateOf(dldiDir.listFiles()?.toList() ?: emptyList()) }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(colors.bg)
                    .systemBarsPadding()
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(colors.surface2)
                            .clickable { finish() },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back",
                            tint = colors.text,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                    Spacer(Modifier.width(12.dp))
                    Column {
                        Text(
                            text = "Файловый менеджер DLDI",
                            color = colors.text,
                            fontFamily = SpaceGrotesk,
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Виртуальная SD-карта (Homebrew & Moonshell)",
                            color = colors.text3,
                            fontFamily = WatermelonMono,
                            fontSize = 11.sp
                        )
                    }
                }

                Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))

                if (currentFiles.isEmpty()) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(
                                imageVector = Icons.Filled.Folder,
                                contentDescription = null,
                                tint = colors.text3,
                                modifier = Modifier.size(48.dp)
                            )
                            Spacer(Modifier.height(8.dp))
                            Text(
                                text = "SD-карта пуста",
                                color = colors.text,
                                fontFamily = SpaceGrotesk,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                            Text(
                                text = "Папка: ${dldiDir.absolutePath}",
                                color = colors.text3,
                                fontFamily = WatermelonMono,
                                fontSize = 10.sp,
                                modifier = Modifier.padding(horizontal = 24.dp, vertical = 4.dp)
                            )
                        }
                    }
                } else {
                    LazyColumn(
                        modifier = Modifier.fillMaxSize().padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(currentFiles) { file ->
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(colors.surface2)
                                    .padding(12.dp)
                            ) {
                                Icon(
                                    imageVector = if (file.isDirectory) Icons.Filled.Folder else Icons.Filled.Description,
                                    contentDescription = null,
                                    tint = if (file.isDirectory) colors.red else colors.text2,
                                    modifier = Modifier.size(24.dp)
                                )
                                Spacer(Modifier.width(12.dp))
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        text = file.name,
                                        color = colors.text,
                                        fontFamily = SpaceGrotesk,
                                        fontSize = 13.sp,
                                        fontWeight = FontWeight.Medium
                                    )
                                    Text(
                                        text = "${file.length() / 1024} KB",
                                        color = colors.text3,
                                        fontFamily = WatermelonMono,
                                        fontSize = 10.sp
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
