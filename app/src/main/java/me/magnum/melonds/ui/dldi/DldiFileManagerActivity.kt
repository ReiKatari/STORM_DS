package me.magnum.melonds.ui.dldi

import android.os.Bundle
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
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.SdCard
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import me.magnum.melonds.extensions.applyImmersiveFullscreen
import me.magnum.melonds.ui.theme.MelonTheme
import me.magnum.melonds.ui.theme.LocalWatermelonColors
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import java.io.File

class DldiFileManagerActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        applyImmersiveMode()

        val dldiDir = File(filesDir, "dldi/sync").apply { mkdirs() }

        setContent {
            MelonTheme {
                val colors = LocalWatermelonColors.current
                var currentFiles by remember { mutableStateOf(dldiDir.listFiles()?.toList() ?: emptyList()) }

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
                                .padding(horizontal = 16.dp, vertical = 14.dp)
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
                                    tint = colors.green,
                                    modifier = Modifier.size(22.dp)
                                )
                            }
                            Spacer(Modifier.width(12.dp))
                            Column {
                                Text(
                                    text = "Менеджер файлов DLDI",
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
                                        text = "SD-карта пуста",
                                        color = colors.text,
                                        fontFamily = SpaceGrotesk,
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                    Spacer(Modifier.height(6.dp))
                                    Text(
                                        text = "Файлы виртуальной SD-карты синхронизируются автоматически.",
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
                                    .padding(horizontal = 16.dp, vertical = 12.dp),
                                verticalArrangement = Arrangement.spacedBy(10.dp)
                            ) {
                                items(currentFiles) { file ->
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clip(RoundedCornerShape(12.dp))
                                            .background(colors.surface2)
                                            .border(1.dp, colors.line, RoundedCornerShape(12.dp))
                                            .padding(14.dp)
                                    ) {
                                        Icon(
                                            imageVector = if (file.isDirectory) Icons.Filled.Folder else Icons.Filled.Description,
                                            contentDescription = null,
                                            tint = if (file.isDirectory) colors.green else colors.text2,
                                            modifier = Modifier.size(24.dp)
                                        )
                                        Spacer(Modifier.width(14.dp))
                                        Column(modifier = Modifier.weight(1f)) {
                                            Text(
                                                text = file.name,
                                                color = colors.text,
                                                fontFamily = SpaceGrotesk,
                                                fontSize = 14.sp,
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

                    // Bottom centered back button
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
                            onClick = { finish() },
                        )
                    }
                }
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
