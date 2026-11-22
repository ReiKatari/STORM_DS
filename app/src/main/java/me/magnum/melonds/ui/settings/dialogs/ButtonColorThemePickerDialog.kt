package me.magnum.melonds.ui.settings.dialogs

import android.app.Dialog
import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Palette
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.R
import me.magnum.melonds.ui.theme.LocalWatermelonColors
import me.magnum.melonds.ui.theme.SpaceGrotesk

internal data class ButtonSwatchColors(
    val capA: Pair<Color, Color>,
    val capB: Pair<Color, Color>,
    val capX: Pair<Color, Color>,
    val capY: Pair<Color, Color>,
    val glow: Color,
)

internal fun resolveButtonSwatches(key: String): ButtonSwatchColors {
    fun solid(top: Long, bot: Long, glow: Long): ButtonSwatchColors {
        val p = Color(top) to Color(bot)
        return ButtonSwatchColors(p, p, p, p, Color(glow))
    }
    return when (key) {
        "classic_white" -> solid(0xFFFFFFFF, 0xFFCBD5E1, 0xFF38BDF8)
        "classic_grey" -> solid(0xFF64748B, 0xFF334155, 0xFF94A3B8)
        "crimson_ruby" -> solid(0xFFDC2626, 0xFF5B090E, 0xFFFF1744)
        "midnight_purple" -> solid(0xFF9333EA, 0xFF3B0764, 0xFFC084FC)
        "gold_luxury" -> solid(0xFFD97706, 0xFF5C2B05, 0xFFFFD700)
        "emerald_matrix" -> solid(0xFF059669, 0xFF022C22, 0xFF00E676)
        "wii_crystal" -> solid(0xFFFFFFFF, 0xFFDDE3EA, 0xFF00D2FF)
        "wii_u_dark" -> solid(0xFF2C3240, 0xFF151922, 0xFF38BDF8)
        "switch_neon" -> ButtonSwatchColors(
            capA = Color(0xFFFF3E3E) to Color(0xFFB91C1C),
            capB = Color(0xFFFF3E3E) to Color(0xFFB91C1C),
            capX = Color(0xFF0AB9E6) to Color(0xFF0284C7),
            capY = Color(0xFF0AB9E6) to Color(0xFF0284C7),
            glow = Color(0xFF0AB9E6),
        )
        "switch_oled" -> solid(0xFFF8FAFC, 0xFFCBD5E1, 0xFF94A3B8)
        "virtual_boy" -> solid(0xFF2B0008, 0xFF0A0002, 0xFFFF0033)
        "gamecube_indigo" -> ButtonSwatchColors(
            capA = Color(0xFF00B894) to Color(0xFF006266),
            capB = Color(0xFFD63031) to Color(0xFF740E10),
            capX = Color(0xFF747D8C) to Color(0xFF2F3542),
            capY = Color(0xFF747D8C) to Color(0xFF2F3542),
            glow = Color(0xFF6C5CE7),
        )
        "gameboy_dmg" -> solid(0xFF801336, 0xFF4A0E17, 0xFFC70039)
        "gba_glacier" -> solid(0xFF575FCF, 0xFF2C2C54, 0xFF706FD3)
        "famicom_retro" -> solid(0xFF8B0000, 0xFF4A0000, 0xFFFFD700)
        "3ds_aqua" -> solid(0xFF00838F, 0xFF004D40, 0xFF00D2D3)
        "snes_super" -> ButtonSwatchColors(
            capA = Color(0xFFDC2626) to Color(0xFF7F1D1D),
            capB = Color(0xFFF59E0B) to Color(0xFF78350F),
            capX = Color(0xFF2563EB) to Color(0xFF1E3A8A),
            capY = Color(0xFF059669) to Color(0xFF064E3B),
            glow = Color(0xFF74B9FF),
        )
        "arcade_retro" -> ButtonSwatchColors(
            capA = Color(0xFF2563EB) to Color(0xFF1E3A8A),
            capB = Color(0xFFD97706) to Color(0xFF78350F),
            capX = Color(0xFFDC2626) to Color(0xFF7F1D1D),
            capY = Color(0xFF059669) to Color(0xFF064E3B),
            glow = Color(0xFFFBBF24),
        )
        "aurora_spectrum" -> ButtonSwatchColors(
            capA = Color(0xFFFDA4AF) to Color(0xFFE11D48),
            capB = Color(0xFF6EE7B7) to Color(0xFF059669),
            capX = Color(0xFF7DD3FC) to Color(0xFF0284C7),
            capY = Color(0xFFFDE047) to Color(0xFFD97706),
            glow = Color(0xFF38BDF8),
        )
        "cyberpunk_neon" -> ButtonSwatchColors(
            capA = Color(0xFFFCEE0A) to Color(0xFF857E02),
            capB = Color(0xFFFF003C) to Color(0xFF8A001F),
            capX = Color(0xFF00F0FF) to Color(0xFF007D85),
            capY = Color(0xFFB026FF) to Color(0xFF5A008A),
            glow = Color(0xFF00F0FF),
        )
        "frost_glacier" -> ButtonSwatchColors(
            capA = Color(0xFFBAE6FD) to Color(0xFF0284C7),
            capB = Color(0xFF99F6E4) to Color(0xFF0D9488),
            capX = Color(0xFFA5F3FC) to Color(0xFF0891B2),
            capY = Color(0xFFE0F2FE) to Color(0xFF0369A1),
            glow = Color(0xFF38BDF8),
        )
        "sakura_blossom" -> ButtonSwatchColors(
            capA = Color(0xFFFB7185) to Color(0xFFBE123C),
            capB = Color(0xFFF472B6) to Color(0xFFDB2777),
            capX = Color(0xFFE879F9) to Color(0xFFA21CAF),
            capY = Color(0xFFFBCFE8) to Color(0xFFE11D48),
            glow = Color(0xFFF472B6),
        )
        "solar_fusion" -> ButtonSwatchColors(
            capA = Color(0xFFFDE68A) to Color(0xFFD97706),
            capB = Color(0xFFFCD34D) to Color(0xFFB45309),
            capX = Color(0xFFFB923C) to Color(0xFFEA580C),
            capY = Color(0xFFFDBA74) to Color(0xFFC2410C),
            glow = Color(0xFFF59E0B),
        )
        else -> solid(0xFF334155, 0xFF0F172A, 0xFF00E5FF) // cyber_cyan
    }
}

fun showButtonColorThemePickerDialog(
    context: Context,
    selectedValue: String?,
    onSelect: (String) -> Unit,
): Dialog {
    val entries = context.resources.getStringArray(R.array.button_color_theme_options)
    val values = context.resources.getStringArray(R.array.button_color_theme_values)
    val pairs = values.indices.map { i -> values[i] to entries.getOrElse(i) { values[i] } }

    return showSettingsComposeDialog(context) { dismiss ->
        ButtonColorThemePickerContent(
            items = pairs,
            selectedValue = selectedValue ?: "cyber_cyan",
            onSelect = { key ->
                onSelect(key)
                dismiss()
            },
            onDismiss = dismiss,
        )
    }
}

@Composable
private fun ButtonColorThemePickerContent(
    items: List<Pair<String, String>>,
    selectedValue: String,
    onSelect: (String) -> Unit,
    onDismiss: () -> Unit,
) {
    val colors = LocalWatermelonColors.current

    SettingsDialogScaffold(
        title = stringResource(R.string.button_theme_picker_title),
        subtitle = stringResource(R.string.button_theme_picker_subtitle),
        icon = Icons.Filled.Palette,
        onDismiss = onDismiss,
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(max = 520.dp),
            contentPadding = PaddingValues(12.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            itemsIndexed(items, key = { _, pair -> pair.first }) { _, (key, title) ->
                val isSelected = key.equals(selectedValue, ignoreCase = true)
                val swatch = resolveButtonSwatches(key)

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(if (isSelected) colors.green.copy(alpha = 0.14f) else colors.surface2)
                        .border(
                            width = if (isSelected) 1.8.dp else 1.dp,
                            color = if (isSelected) colors.green else colors.line,
                            shape = RoundedCornerShape(12.dp),
                        )
                        .clickable { onSelect(key) }
                        .padding(horizontal = 12.dp, vertical = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                ) {
                    // 4 miniature ABXY button caps
                    Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                        MiniButtonCap("A", swatch.capA, swatch.glow)
                        MiniButtonCap("B", swatch.capB, swatch.glow)
                        MiniButtonCap("X", swatch.capX, swatch.glow)
                        MiniButtonCap("Y", swatch.capY, swatch.glow)
                    }

                    Text(
                        text = title,
                        color = if (isSelected) colors.green else colors.text,
                        fontFamily = SpaceGrotesk,
                        fontSize = 13.5.sp,
                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.weight(1f),
                    )

                    if (isSelected) {
                        Box(
                            modifier = Modifier
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
            }
        }
    }
}

@Composable
private fun MiniButtonCap(
    letter: String,
    capColors: Pair<Color, Color>,
    borderGlow: Color,
) {
    val labelColor = if (capColors.first.luminance() > 0.65f) Color(0xFF0F172A) else Color(0xFFF8FAFC)
    Box(
        modifier = Modifier
            .size(22.dp)
            .clip(CircleShape)
            .background(Brush.verticalGradient(listOf(capColors.first, capColors.second)))
            .border(1.2.dp, borderGlow.copy(alpha = 0.85f), CircleShape),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = letter,
            color = labelColor,
            fontFamily = SpaceGrotesk,
            fontSize = 10.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}
