package me.magnum.melonds.ui.romdetails.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.ui.common.WatermelonCard
import me.magnum.melonds.ui.common.WatermelonRowSeparator
import me.magnum.melonds.ui.common.WatermelonSectionLabel
import me.magnum.melonds.ui.common.WatermelonSwitch
import me.magnum.melonds.ui.theme.watermelon

val LocalConfigFocusReporter = compositionLocalOf<(String, String?) -> Unit> { { _, _ -> } }

/**
 * A grouping container for related ROM configuration rows, styled per the WatermelonDS
 * redesign: monospace section label above a rounded surface card.
 */
@Composable
fun ConfigSection(
    title: String? = null,
    modifier: Modifier = Modifier,
    content: @Composable androidx.compose.foundation.layout.ColumnScope.() -> Unit,
) {
    Column(modifier = modifier.fillMaxWidth().padding(horizontal = 16.dp)) {
        if (title != null) {
            WatermelonSectionLabel(title)
        } else {
            Spacer(Modifier.size(12.dp))
        }
        WatermelonCard(content = content)
    }
}

/**
 * A single ROM configuration row: title (13.5/500) with the current value + chevron on
 * the right, as in the redesign.
 */
@Composable
fun ConfigRow(
    title: String,
    value: String,
    enabled: Boolean = true,
    showDivider: Boolean = false,
    onClick: () -> Unit,
) {
    val colors = watermelon
    val interactionSource = remember { androidx.compose.foundation.interaction.MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val focusReporter = LocalConfigFocusReporter.current
    androidx.compose.runtime.LaunchedEffect(isFocused) {
        if (isFocused) focusReporter(title, value)
    }
    if (showDivider) {
        WatermelonRowSeparator()
    }
    val rowShape = androidx.compose.foundation.shape.RoundedCornerShape(8.dp)
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(rowShape)
            .then(
                if (isFocused) {
                    Modifier
                        .background(colors.surface3)
                        .border(2.dp, colors.red, rowShape)
                } else {
                    Modifier
                },
            )
            .let { if (enabled) it.clickable(interactionSource = interactionSource, indication = null, onClick = onClick) else it }
            .alpha(if (enabled) 1f else 0.45f)
            .heightIn(min = 48.dp)
            .padding(horizontal = 15.dp, vertical = 13.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = title,
            color = colors.text,
            fontSize = 13.5.sp,
            lineHeight = 17.sp,
            fontWeight = FontWeight.Medium,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.weight(1f),
        )
        Spacer(Modifier.width(12.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.widthIn(max = 200.dp),
        ) {
            Text(
                text = value,
                color = colors.text2,
                fontSize = 12.5.sp,
                lineHeight = 15.sp,
                textAlign = TextAlign.End,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
            )
            Icon(
                imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = null,
                tint = colors.text3,
                modifier = Modifier.size(17.dp).padding(start = 1.dp),
            )
        }
    }
}

@Composable
fun ConfigToggleRow(
    title: String,
    subtitle: String? = null,
    isOn: Boolean,
    enabled: Boolean = true,
    showDivider: Boolean = false,
    onToggle: (Boolean) -> Unit,
) {
    val colors = watermelon
    if (showDivider) {
        WatermelonRowSeparator()
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .let { if (enabled) it.clickable { onToggle(!isOn) } else it }
            .alpha(if (enabled) 1f else 0.45f)
            .heightIn(min = 48.dp)
            .padding(horizontal = 15.dp, vertical = 13.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.Center) {
            Text(
                text = title,
                color = colors.text,
                fontSize = 13.5.sp,
                lineHeight = 17.sp,
                fontWeight = FontWeight.Medium,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
            )
            if (subtitle != null) {
                Text(
                    text = subtitle,
                    color = colors.text3,
                    fontSize = 11.5.sp,
                    lineHeight = 14.sp,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(top = 2.dp),
                )
            }
        }
        Spacer(Modifier.width(16.dp))
        WatermelonSwitch(
            checked = isOn,
            onCheckedChange = if (enabled) onToggle else null,
            enabled = enabled,
        )
    }
}
