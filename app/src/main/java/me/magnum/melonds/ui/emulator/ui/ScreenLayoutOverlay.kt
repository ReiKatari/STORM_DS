package me.magnum.melonds.ui.emulator.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
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
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.DashboardCustomize
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.ScreenRotation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.R
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.watermelon

enum class ScreenLayoutMode {
    EVEN_LANDSCAPE,
    UNEVEN_LANDSCAPE,
    EVEN_PORTRAIT_LOCKED,
    PROPORTIONAL_LANDSCAPE,
    FULLSCREEN_LANDSCAPE,
    AUTO_ROTATE,
    OPEN_LAYOUT_EDITOR,
}

@Composable
fun ScreenLayoutOverlay(
    currentLayoutMode: ScreenLayoutMode?,
    onLayoutModeSelected: (ScreenLayoutMode) -> Unit,
    onDismiss: () -> Unit,
) {
    val colors = watermelon

    BackHandler(onBack = onDismiss)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = 0.88f))
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
                onClick = onDismiss,
            )
            .systemBarsPadding(),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            modifier = Modifier
                .widthIn(min = 320.dp, max = 420.dp)
                .fillMaxWidth(0.92f)
                .padding(top = 26.dp, bottom = 16.dp)
                .clip(RoundedCornerShape(24.dp))
                .background(colors.surface)
                .border(1.dp, colors.line, RoundedCornerShape(24.dp))
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                    onClick = { /* consume click inside card */ },
                )
                .padding(vertical = 20.dp, horizontal = 18.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 6.dp, vertical = 2.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Box(
                    modifier = Modifier
                        .size(36.dp)
                        .clip(CircleShape)
                        .background(colors.greenDim),
                    contentAlignment = Alignment.Center,
                ) {
                    Icon(
                        imageVector = Icons.Filled.ScreenRotation,
                        contentDescription = null,
                        tint = colors.green,
                        modifier = Modifier.size(20.dp),
                    )
                }

                Spacer(modifier = Modifier.width(12.dp))

                Column {
                    Text(
                        text = stringResource(R.string.screen_layout),
                        fontFamily = SpaceGrotesk,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = colors.text,
                    )
                    Text(
                        text = "Быстрая смена раскладки",
                        fontFamily = SpaceGrotesk,
                        fontWeight = FontWeight.Normal,
                        fontSize = 11.5.sp,
                        color = colors.text2,
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            LayoutOptionItem(
                title = stringResource(R.string.layout_even_landscape),
                subtitle = "2 экрана в альбомном режиме",
                isSelected = currentLayoutMode == ScreenLayoutMode.EVEN_LANDSCAPE,
                icon = { isSel -> LayoutModeIcon(ScreenLayoutMode.EVEN_LANDSCAPE, isSel, colors.green, colors.text2) },
                onClick = {
                    onLayoutModeSelected(ScreenLayoutMode.EVEN_LANDSCAPE)
                    onDismiss()
                },
            )

            Spacer(modifier = Modifier.height(8.dp))

            LayoutOptionItem(
                title = stringResource(R.string.layout_uneven_landscape),
                subtitle = "2 экрана (один большой, второй маленький)",
                isSelected = currentLayoutMode == ScreenLayoutMode.UNEVEN_LANDSCAPE,
                icon = { isSel -> LayoutModeIcon(ScreenLayoutMode.UNEVEN_LANDSCAPE, isSel, colors.green, colors.text2) },
                onClick = {
                    onLayoutModeSelected(ScreenLayoutMode.UNEVEN_LANDSCAPE)
                    onDismiss()
                },
            )

            Spacer(modifier = Modifier.height(8.dp))

            LayoutOptionItem(
                title = stringResource(R.string.layout_even_portrait_locked),
                subtitle = "2 экрана в портретном режиме",
                isSelected = currentLayoutMode == ScreenLayoutMode.EVEN_PORTRAIT_LOCKED,
                icon = { isSel -> LayoutModeIcon(ScreenLayoutMode.EVEN_PORTRAIT_LOCKED, isSel, colors.green, colors.text2) },
                onClick = {
                    onLayoutModeSelected(ScreenLayoutMode.EVEN_PORTRAIT_LOCKED)
                    onDismiss()
                },
            )

            Spacer(modifier = Modifier.height(8.dp))

            LayoutOptionItem(
                title = stringResource(R.string.layout_proportional_landscape),
                subtitle = "Один большой экран 4:3 по центру",
                isSelected = currentLayoutMode == ScreenLayoutMode.PROPORTIONAL_LANDSCAPE,
                icon = { isSel -> LayoutModeIcon(ScreenLayoutMode.PROPORTIONAL_LANDSCAPE, isSel, colors.green, colors.text2) },
                onClick = {
                    onLayoutModeSelected(ScreenLayoutMode.PROPORTIONAL_LANDSCAPE)
                    onDismiss()
                },
            )

            Spacer(modifier = Modifier.height(8.dp))

            LayoutOptionItem(
                title = stringResource(R.string.layout_fullscreen_landscape),
                subtitle = "Один большой экран во весь дисплей",
                isSelected = currentLayoutMode == ScreenLayoutMode.FULLSCREEN_LANDSCAPE,
                icon = { isSel -> LayoutModeIcon(ScreenLayoutMode.FULLSCREEN_LANDSCAPE, isSel, colors.green, colors.text2) },
                onClick = {
                    onLayoutModeSelected(ScreenLayoutMode.FULLSCREEN_LANDSCAPE)
                    onDismiss()
                },
            )

            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(colors.line),
            )
            Spacer(modifier = Modifier.height(10.dp))

            LayoutOptionItem(
                title = stringResource(R.string.layout_auto_rotate),
                subtitle = "Снять блокировку (поворот по датчику)",
                isSelected = currentLayoutMode == ScreenLayoutMode.AUTO_ROTATE,
                icon = { isSel -> LayoutModeIcon(ScreenLayoutMode.AUTO_ROTATE, isSel, colors.green, colors.text2) },
                onClick = {
                    onLayoutModeSelected(ScreenLayoutMode.AUTO_ROTATE)
                    onDismiss()
                },
            )

            Spacer(modifier = Modifier.height(8.dp))

            LayoutOptionItem(
                title = stringResource(R.string.layout_open_editor),
                subtitle = "Настройка расположения элементов",
                isSelected = false,
                icon = { isSel -> LayoutModeIcon(ScreenLayoutMode.OPEN_LAYOUT_EDITOR, isSel, colors.green, colors.text2) },
                onClick = {
                    onLayoutModeSelected(ScreenLayoutMode.OPEN_LAYOUT_EDITOR)
                    onDismiss()
                },
            )

            Spacer(modifier = Modifier.height(14.dp))

            // Unified Bottom Center Back Arrow
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .clip(CircleShape)
                    .background(colors.surface2)
                    .border(1.dp, colors.line, CircleShape)
                    .clickable(onClick = onDismiss),
                contentAlignment = Alignment.Center,
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = stringResource(R.string.back),
                    tint = colors.text,
                    modifier = Modifier.size(20.dp),
                )
            }
        }
    }
}

@Composable
private fun LayoutOptionItem(
    title: String,
    subtitle: String? = null,
    isSelected: Boolean,
    icon: @Composable (Boolean) -> Unit,
    onClick: () -> Unit,
) {
    val colors = watermelon
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused = interactionSource.collectIsFocusedAsState().value

    val bg = when {
        isSelected -> colors.greenDim
        isFocused -> colors.surface3
        else -> colors.surface2
    }
    val border = when {
        isSelected -> colors.green
        isFocused -> colors.green.copy(alpha = 0.5f)
        else -> colors.line
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(14.dp))
            .background(bg)
            .border(1.dp, border, RoundedCornerShape(14.dp))
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
            .padding(horizontal = 14.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier.size(38.dp),
            contentAlignment = Alignment.Center,
        ) {
            icon(isSelected)
        }

        Spacer(modifier = Modifier.width(14.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = title,
                fontFamily = SpaceGrotesk,
                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                fontSize = 15.sp,
                color = if (isSelected) colors.text else colors.text.copy(alpha = 0.9f),
            )
            if (subtitle != null) {
                Text(
                    text = subtitle,
                    fontFamily = SpaceGrotesk,
                    fontWeight = FontWeight.Normal,
                    fontSize = 11.5.sp,
                    color = if (isSelected) colors.green else colors.text2,
                )
            }
        }

        if (isSelected) {
            Icon(
                imageVector = Icons.Filled.CheckCircle,
                contentDescription = null,
                tint = colors.green,
                modifier = Modifier.size(22.dp),
            )
        }
    }
}

@Composable
private fun LayoutModeIcon(mode: ScreenLayoutMode, isSelected: Boolean, activeColor: Color, inactiveColor: Color) {
    val strokeColor = if (isSelected) activeColor else inactiveColor
    val strokeWidth = 2.0f

    when (mode) {
        ScreenLayoutMode.EVEN_LANDSCAPE -> {
            Canvas(modifier = Modifier.size(32.dp, 20.dp)) {
                val w = size.width
                val h = size.height
                val pad = 2f
                val scrW = (w - pad * 3) / 2f
                val scrH = h - pad * 2

                drawRoundRect(
                    color = strokeColor,
                    topLeft = Offset(pad, pad),
                    size = Size(scrW, scrH),
                    cornerRadius = CornerRadius(3f, 3f),
                    style = Stroke(strokeWidth),
                )
                drawRoundRect(
                    color = strokeColor,
                    topLeft = Offset(pad * 2 + scrW, pad),
                    size = Size(scrW, scrH),
                    cornerRadius = CornerRadius(3f, 3f),
                    style = Stroke(strokeWidth),
                )
            }
        }
        ScreenLayoutMode.UNEVEN_LANDSCAPE -> {
            Canvas(modifier = Modifier.size(32.dp, 20.dp)) {
                val w = size.width
                val h = size.height
                val pad = 2f

                val mainW = w * 0.58f
                val mainH = h - pad * 2
                drawRoundRect(
                    color = strokeColor,
                    topLeft = Offset(pad, pad),
                    size = Size(mainW, mainH),
                    cornerRadius = CornerRadius(3f, 3f),
                    style = Stroke(strokeWidth),
                )

                val subW = w * 0.32f
                val subH = h * 0.48f
                drawRoundRect(
                    color = strokeColor,
                    topLeft = Offset(w - subW - pad, pad + (mainH - subH) / 2f),
                    size = Size(subW, subH),
                    cornerRadius = CornerRadius(2f, 2f),
                    style = Stroke(strokeWidth),
                )
            }
        }
        ScreenLayoutMode.EVEN_PORTRAIT_LOCKED -> {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
            ) {
                Canvas(modifier = Modifier.size(16.dp, 26.dp)) {
                    val w = size.width
                    val h = size.height
                    val pad = 2f
                    val scrW = w - pad * 2
                    val scrH = (h - pad * 3) / 2f

                    drawRoundRect(
                        color = strokeColor,
                        topLeft = Offset(pad, pad),
                        size = Size(scrW, scrH),
                        cornerRadius = CornerRadius(2f, 2f),
                        style = Stroke(strokeWidth),
                    )
                    drawRoundRect(
                        color = strokeColor,
                        topLeft = Offset(pad, pad * 2 + scrH),
                        size = Size(scrW, scrH),
                        cornerRadius = CornerRadius(2f, 2f),
                        style = Stroke(strokeWidth),
                    )
                }
                Spacer(modifier = Modifier.width(3.dp))
                Icon(
                    imageVector = Icons.Filled.Lock,
                    contentDescription = null,
                    tint = activeColor,
                    modifier = Modifier.size(14.dp),
                )
            }
        }
        ScreenLayoutMode.PROPORTIONAL_LANDSCAPE -> {
            Canvas(modifier = Modifier.size(32.dp, 20.dp)) {
                val w = size.width
                val h = size.height
                val pad = 2f

                drawRoundRect(
                    color = strokeColor.copy(alpha = 0.4f),
                    topLeft = Offset(pad, pad),
                    size = Size(w - pad * 2, h - pad * 2),
                    cornerRadius = CornerRadius(4f, 4f),
                    style = Stroke(1.2f),
                )

                val dispW = (h - pad * 4) * (4f / 3f)
                val dispH = h - pad * 4
                val dispX = (w - dispW) / 2f
                drawRoundRect(
                    color = strokeColor,
                    topLeft = Offset(dispX, pad * 2),
                    size = Size(dispW, dispH),
                    cornerRadius = CornerRadius(2f, 2f),
                    style = Stroke(strokeWidth),
                )
            }
        }
        ScreenLayoutMode.FULLSCREEN_LANDSCAPE -> {
            Canvas(modifier = Modifier.size(32.dp, 20.dp)) {
                val w = size.width
                val h = size.height
                val pad = 2f

                drawRoundRect(
                    color = strokeColor,
                    topLeft = Offset(pad, pad),
                    size = Size(w - pad * 2, h - pad * 2),
                    cornerRadius = CornerRadius(4f, 4f),
                    style = Stroke(strokeWidth),
                )
            }
        }
        ScreenLayoutMode.AUTO_ROTATE -> {
            Icon(
                imageVector = Icons.Filled.ScreenRotation,
                contentDescription = null,
                tint = strokeColor,
                modifier = Modifier.size(24.dp),
            )
        }
        ScreenLayoutMode.OPEN_LAYOUT_EDITOR -> {
            Icon(
                imageVector = Icons.Filled.DashboardCustomize,
                contentDescription = null,
                tint = strokeColor,
                modifier = Modifier.size(22.dp),
            )
        }
    }
}
