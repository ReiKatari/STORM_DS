package me.magnum.melonds.ui.romdetails.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import me.magnum.melonds.ui.common.melonSwitchColors

/**
 * A grouping container for related ROM configuration rows. Renders as a Surface card with rounded
 * corners and a subtle elevation, matching the visual language of the new ROM browser cards.
 *
 * The optional [title] is rendered above the card in caption style.
 */
@Composable
fun ConfigSection(
    title: String? = null,
    modifier: Modifier = Modifier,
    content: @Composable androidx.compose.foundation.layout.ColumnScope.() -> Unit,
) {
    Column(modifier = modifier.fillMaxWidth()) {
        if (title != null) {
            Text(
                text = title.uppercase(),
                style = MaterialTheme.typography.caption,
                color = MaterialTheme.colors.secondary,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(start = 20.dp, top = 16.dp, bottom = 8.dp, end = 16.dp),
            )
        }
        // No background fill so cards blend visually with the screen surface (matches the ROM
        // list cards). Rounded shape + thin separator from siblings via outer padding.
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp),
            content = content,
        )
    }
}

/**
 * A single ROM configuration row showing a title + current value. Tapping the row triggers
 * [onClick] (e.g. opens a chooser dialog or navigates).
 */
@Composable
fun ConfigRow(
    title: String,
    value: String,
    enabled: Boolean = true,
    showDivider: Boolean = false,
    onClick: () -> Unit,
) {
    CompositionLocalProvider(LocalContentAlpha provides if (enabled) ContentAlpha.high else ContentAlpha.disabled) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .let { if (enabled) it.clickable(onClick = onClick) else it }
                .heightIn(min = 64.dp)
                .padding(horizontal = 16.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.Center) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.body1,
                    fontWeight = FontWeight.Medium,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
                Spacer(Modifier.size(2.dp))
                Text(
                    text = value,
                    style = MaterialTheme.typography.body2,
                    color = MaterialTheme.colors.onSurface.copy(alpha = 0.65f),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            Icon(
                imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = null,
                tint = MaterialTheme.colors.onSurface.copy(alpha = 0.45f),
            )
        }
    }
    if (showDivider) {
        Divider(
            modifier = Modifier.padding(start = 16.dp),
            color = MaterialTheme.colors.onSurface.copy(alpha = 0.10f),
        )
    }
}

/** A switch row: title with optional caption + a toggle on the right. */
@Composable
fun ConfigToggleRow(
    title: String,
    subtitle: String? = null,
    isOn: Boolean,
    enabled: Boolean = true,
    showDivider: Boolean = false,
    onToggle: (Boolean) -> Unit,
) {
    CompositionLocalProvider(LocalContentAlpha provides if (enabled) ContentAlpha.high else ContentAlpha.disabled) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .let { if (enabled) it.clickable { onToggle(!isOn) } else it }
                .heightIn(min = 64.dp)
                .padding(horizontal = 16.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.Center) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.body1,
                    fontWeight = FontWeight.Medium,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
                if (subtitle != null) {
                    Spacer(Modifier.size(2.dp))
                    Text(
                        text = subtitle,
                        style = MaterialTheme.typography.body2,
                        color = MaterialTheme.colors.onSurface.copy(alpha = 0.65f),
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
            Spacer(Modifier.width(16.dp))
            Switch(
                checked = isOn,
                onCheckedChange = if (enabled) onToggle else null,
                colors = melonSwitchColors(),
            )
        }
    }
    if (showDivider) {
        Divider(
            modifier = Modifier.padding(start = 16.dp),
            color = MaterialTheme.colors.onSurface.copy(alpha = 0.10f),
        )
    }
}
