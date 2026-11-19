package me.magnum.melonds.ui.emulator.skin

import android.app.Dialog
import android.content.Context
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Devices
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.Rect
import me.magnum.melonds.ui.settings.dialogs.SettingsDialogScaffold
import me.magnum.melonds.ui.settings.dialogs.showSettingsComposeDialog
import me.magnum.melonds.ui.theme.LocalWatermelonColors
import me.magnum.melonds.ui.theme.SpaceGrotesk

fun showConsoleSkinPickerDialog(
    context: Context,
    selectedValue: String?,
    brightnessPercent: Int = 100,
    onSelect: (String) -> Unit,
): Dialog {
    val entries = context.resources.getStringArray(R.array.console_skin_entries_v792)
    val values = context.resources.getStringArray(R.array.console_skin_values_v792)
    val pairs = values.indices.map { i ->
        values[i] to entries.getOrElse(i) { values[i] }
    }
    val title = context.getString(R.string.video_console_skin_type_title)
    val subtitle = context.getString(R.string.video_console_skin_summary)

    return showSettingsComposeDialog(context) { dismiss ->
        ConsoleSkinPickerDialogContent(
            title = title,
            subtitle = subtitle,
            skins = pairs,
            selectedValue = selectedValue ?: "aurora_auto_theme",
            brightnessPercent = brightnessPercent.coerceIn(30, 100),
            onSelect = { key ->
                onSelect(key)
                dismiss()
            },
            onDismiss = dismiss,
        )
    }
}

@Composable
private fun ConsoleSkinPickerDialogContent(
    title: String,
    subtitle: String,
    skins: List<Pair<String, String>>,
    selectedValue: String,
    brightnessPercent: Int,
    onSelect: (String) -> Unit,
    onDismiss: () -> Unit,
) {
    val colors = LocalWatermelonColors.current

    SettingsDialogScaffold(
        title = title,
        subtitle = subtitle,
        icon = Icons.Filled.Devices,
        onDismiss = onDismiss,
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(max = 560.dp),
            contentPadding = PaddingValues(12.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            itemsIndexed(skins, key = { _, pair -> pair.first }) { _, (skinKey, skinTitle) ->
                val isSelected = skinKey.equals(selectedValue, ignoreCase = true)
                val theme = remember(skinKey) { ConsoleSkinTheme.fromKey(skinKey) }

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(14.dp))
                        .background(if (isSelected) colors.green.copy(alpha = 0.14f) else colors.surface2)
                        .border(
                            width = if (isSelected) 2.dp else 1.dp,
                            color = if (isSelected) colors.green else colors.line,
                            shape = RoundedCornerShape(14.dp),
                        )
                        .clickable { onSelect(skinKey) }
                        .padding(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(0.82f)
                            .clip(RoundedCornerShape(10.dp))
                            .border(0.8.dp, colors.line.copy(alpha = 0.7f), RoundedCornerShape(10.dp)),
                    ) {
                        SkinMiniPreviewCanvas(
                            theme = theme,
                            brightnessPercent = brightnessPercent,
                            modifier = Modifier.fillMaxSize(),
                        )

                        if (isSelected) {
                            Box(
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(6.dp)
                                    .size(22.dp)
                                    .clip(CircleShape)
                                    .background(colors.green),
                                contentAlignment = Alignment.Center,
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.Check,
                                    contentDescription = null,
                                    tint = Color.Black,
                                    modifier = Modifier.size(14.dp),
                                )
                            }
                        }
                    }

                    Spacer(Modifier.height(6.dp))

                    Text(
                        text = skinTitle,
                        color = if (isSelected) colors.green else colors.text,
                        fontFamily = SpaceGrotesk,
                        fontSize = 11.5.sp,
                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                        textAlign = TextAlign.Center,
                        maxLines = 2,
                        minLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        lineHeight = 14.sp,
                        modifier = Modifier.fillMaxWidth(),
                    )
                }
            }
        }
    }
}

@Composable
private fun SkinMiniPreviewCanvas(
    theme: ConsoleSkinTheme,
    brightnessPercent: Int,
    modifier: Modifier = Modifier,
) {
    val density = LocalDensity.current

    BoxWithConstraints(modifier = modifier) {
        val wPx = with(density) { maxWidth.toPx() }.toInt().coerceAtLeast(1)
        val hPx = with(density) { maxHeight.toPx() }.toInt().coerceAtLeast(1)

        // Realistic DS 4:3 dual-screen portrait cutouts inside the mini handheld chassis
        val screenW = (wPx * 0.58f).toInt().coerceAtLeast(16)
        val screenH = (screenW * 0.75f).toInt().coerceAtLeast(12).coerceAtMost((hPx * 0.34f).toInt().coerceAtLeast(12))
        val screenX = ((wPx - screenW) / 2).coerceAtLeast(4)
        val topY = (hPx * 0.12f).toInt().coerceAtLeast(6)
        val hingeGap = (hPx * 0.11f).toInt().coerceAtLeast(8)
        val bottomY = (topY + screenH + hingeGap).coerceAtMost(hPx - screenH - 6)

        val topRect = remember(wPx, hPx) { Rect(screenX, topY, screenW, screenH) }
        val bottomRect = remember(wPx, hPx) { Rect(screenX, bottomY, screenW, screenH) }

        // Mock lit DS game screens visible through the exact Cutout holes
        Canvas(modifier = Modifier.fillMaxSize()) {
            val topBg = Brush.verticalGradient(
                colors = listOf(Color(0xFF0F2B46), Color(0xFF1D4E89), Color(0xFF38BDF8)),
                startY = topRect.y.toFloat(),
                endY = topRect.bottom.toFloat(),
            )
            drawRect(
                brush = topBg,
                topLeft = Offset(topRect.x.toFloat(), topRect.y.toFloat()),
                size = androidx.compose.ui.geometry.Size(topRect.width.toFloat(), topRect.height.toFloat()),
            )
            val botBg = Brush.verticalGradient(
                colors = listOf(Color(0xFF111827), Color(0xFF1E293B), Color(0xFF0F172A)),
                startY = bottomRect.y.toFloat(),
                endY = bottomRect.bottom.toFloat(),
            )
            drawRect(
                brush = botBg,
                topLeft = Offset(bottomRect.x.toFloat(), bottomRect.y.toFloat()),
                size = androidx.compose.ui.geometry.Size(bottomRect.width.toFloat(), bottomRect.height.toFloat()),
            )
        }

        // Real 3D console chassis rendered with the exact ConsoleSkinFullFrame engine
        ConsoleSkinFullFrame(
            skinTheme = theme,
            topScreenRect = topRect,
            bottomScreenRect = bottomRect,
            overrideTheme = true,
            brightnessOverride = brightnessPercent,
            modifier = Modifier.fillMaxSize(),
        )
    }
}
