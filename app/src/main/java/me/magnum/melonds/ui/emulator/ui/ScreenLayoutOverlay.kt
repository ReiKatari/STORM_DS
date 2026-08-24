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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
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

private val DialogScrim = Color(0xC0000000)

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
            .background(DialogScrim)
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
                .widthIn(min = 280.dp, max = 380.dp)
                .fillMaxWidth(0.88f)
                .clip(RoundedCornerShape(20.dp))
                .background(Color(0xFFFFFFFF))
                .border(1.dp, Color(0xFFE2E8F0), RoundedCornerShape(20.dp))
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                    onClick = { /* consume click inside card */ },
                )
                .padding(vertical = 20.dp, horizontal = 16.dp)
                .verticalScroll(rememberScrollState()),
        ) {
            Text(
                text = stringResource(R.string.screen_layout),
                fontFamily = SpaceGrotesk,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color(0xFF1E293B),
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp),
            )

            Spacer(modifier = Modifier.height(12.dp))

            LayoutOptionItem(
                title = stringResource(R.string.layout_even_landscape),
                isSelected = currentLayoutMode == ScreenLayoutMode.EVEN_LANDSCAPE,
                icon = { LayoutModeIcon(ScreenLayoutMode.EVEN_LANDSCAPE) },
                onClick = {
                    onLayoutModeSelected(ScreenLayoutMode.EVEN_LANDSCAPE)
                    onDismiss()
                },
            )

            LayoutOptionItem(
                title = stringResource(R.string.layout_uneven_landscape),
                isSelected = currentLayoutMode == ScreenLayoutMode.UNEVEN_LANDSCAPE,
                icon = { LayoutModeIcon(ScreenLayoutMode.UNEVEN_LANDSCAPE) },
                onClick = {
                    onLayoutModeSelected(ScreenLayoutMode.UNEVEN_LANDSCAPE)
                    onDismiss()
                },
            )

            LayoutOptionItem(
                title = stringResource(R.string.layout_even_portrait_locked),
                isSelected = currentLayoutMode == ScreenLayoutMode.EVEN_PORTRAIT_LOCKED,
                icon = { LayoutModeIcon(ScreenLayoutMode.EVEN_PORTRAIT_LOCKED) },
                onClick = {
                    onLayoutModeSelected(ScreenLayoutMode.EVEN_PORTRAIT_LOCKED)
                    onDismiss()
                },
            )

            LayoutOptionItem(
                title = stringResource(R.string.layout_proportional_landscape),
                isSelected = currentLayoutMode == ScreenLayoutMode.PROPORTIONAL_LANDSCAPE,
                icon = { LayoutModeIcon(ScreenLayoutMode.PROPORTIONAL_LANDSCAPE) },
                onClick = {
                    onLayoutModeSelected(ScreenLayoutMode.PROPORTIONAL_LANDSCAPE)
                    onDismiss()
                },
            )

            LayoutOptionItem(
                title = stringResource(R.string.layout_fullscreen_landscape),
                isSelected = currentLayoutMode == ScreenLayoutMode.FULLSCREEN_LANDSCAPE,
                icon = { LayoutModeIcon(ScreenLayoutMode.FULLSCREEN_LANDSCAPE) },
                onClick = {
                    onLayoutModeSelected(ScreenLayoutMode.FULLSCREEN_LANDSCAPE)
                    onDismiss()
                },
            )

            Spacer(modifier = Modifier.height(8.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color(0xFFE2E8F0)),
            )
            Spacer(modifier = Modifier.height(8.dp))

            LayoutOptionItem(
                title = stringResource(R.string.layout_auto_rotate),
                isSelected = currentLayoutMode == ScreenLayoutMode.AUTO_ROTATE,
                icon = { LayoutModeIcon(ScreenLayoutMode.AUTO_ROTATE) },
                onClick = {
                    onLayoutModeSelected(ScreenLayoutMode.AUTO_ROTATE)
                    onDismiss()
                },
            )

            LayoutOptionItem(
                title = stringResource(R.string.layout_open_editor),
                isSelected = false,
                icon = { LayoutModeIcon(ScreenLayoutMode.OPEN_LAYOUT_EDITOR) },
                onClick = {
                    onLayoutModeSelected(ScreenLayoutMode.OPEN_LAYOUT_EDITOR)
                    onDismiss()
                },
            )
        }
    }
}

@Composable
private fun LayoutOptionItem(
    title: String,
    isSelected: Boolean,
    icon: @Composable () -> Unit,
    onClick: () -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused = interactionSource.collectIsFocusedAsState().value

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(if (isSelected) Color(0xFFF1F5F9) else if (isFocused) Color(0xFFF8FAFC) else Color.Transparent)
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
            .padding(horizontal = 12.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier.size(36.dp),
            contentAlignment = Alignment.Center,
        ) {
            icon()
        }

        Spacer(modifier = Modifier.width(14.dp))

        Text(
            text = title,
            fontFamily = SpaceGrotesk,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
            fontSize = 15.sp,
            color = if (isSelected) Color(0xFF0F172A) else Color(0xFF334155),
            modifier = Modifier.weight(1f),
        )

        if (isSelected) {
            Icon(
                imageVector = Icons.Filled.Check,
                contentDescription = null,
                tint = Color(0xFF0284C7),
                modifier = Modifier.size(20.dp),
            )
        }
    }
}

@Composable
private fun LayoutModeIcon(mode: ScreenLayoutMode) {
    val strokeColor = Color(0xFF475569)
    val strokeWidth = 2.2f

    when (mode) {
        ScreenLayoutMode.EVEN_LANDSCAPE -> {
            Canvas(modifier = Modifier.size(30.dp, 20.dp)) {
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
            Canvas(modifier = Modifier.size(30.dp, 20.dp)) {
                val w = size.width
                val h = size.height
                val pad = 2f

                // Main screen large on left
                val mainW = w * 0.6f
                val mainH = h - pad * 2
                drawRoundRect(
                    color = strokeColor,
                    topLeft = Offset(pad, pad),
                    size = Size(mainW, mainH),
                    cornerRadius = CornerRadius(3f, 3f),
                    style = Stroke(strokeWidth),
                )

                // Sub screen small on top right
                val subW = w * 0.3f
                val subH = h * 0.45f
                drawRoundRect(
                    color = strokeColor,
                    topLeft = Offset(w - subW - pad, pad),
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
                    tint = Color(0xFF0284C7),
                    modifier = Modifier.size(13.dp),
                )
            }
        }
        ScreenLayoutMode.PROPORTIONAL_LANDSCAPE -> {
            Canvas(modifier = Modifier.size(30.dp, 20.dp)) {
                val w = size.width
                val h = size.height
                val pad = 2f

                // Outer phone frame
                drawRoundRect(
                    color = strokeColor.copy(alpha = 0.5f),
                    topLeft = Offset(pad, pad),
                    size = Size(w - pad * 2, h - pad * 2),
                    cornerRadius = CornerRadius(4f, 4f),
                    style = Stroke(1.5f),
                )

                // Centered 4:3 display
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
            Canvas(modifier = Modifier.size(30.dp, 20.dp)) {
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
                tint = Color(0xFF0284C7),
                modifier = Modifier.size(22.dp),
            )
        }
        ScreenLayoutMode.OPEN_LAYOUT_EDITOR -> {
            Icon(
                imageVector = Icons.Filled.Edit,
                contentDescription = null,
                tint = strokeColor,
                modifier = Modifier.size(20.dp),
            )
        }
    }
}
