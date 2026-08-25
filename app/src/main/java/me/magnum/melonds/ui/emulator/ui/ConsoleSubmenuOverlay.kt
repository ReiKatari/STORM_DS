package me.magnum.melonds.ui.emulator.ui

import androidx.activity.compose.BackHandler
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
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Filter
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.SportsEsports
import androidx.compose.material.icons.filled.TouchApp
import androidx.compose.material.icons.filled.Tune
import androidx.compose.material.icons.filled.Tv
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.R
import me.magnum.melonds.ui.common.GamepadHint
import me.magnum.melonds.ui.common.GamepadHintsFooter
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.watermelon

private val SubmenuScrim = Color(0xF208070A)

data class ConsoleSubmenuEntry(
    val title: String,
    val value: String? = null,
    val description: String? = null,
    val icon: ImageVector? = null,
)

@Composable
fun ConsoleSubmenuOverlay(
    title: String,
    entries: List<String>,
    onEntrySelected: (Int) -> Unit,
    onDismiss: () -> Unit,
) {
    val items = remember(entries) {
        entries.map { entry ->
            val parts = entry.split(": ", limit = 2)
            val itemTitle = parts[0]
            val itemValue = if (parts.size == 2) parts[1] else null
            val (icon, desc) = getMetadataForSetting(itemTitle)
            ConsoleSubmenuEntry(
                title = itemTitle,
                value = itemValue,
                description = desc,
                icon = icon,
            )
        }
    }
    ConsoleSubmenuOverlayDetailed(
        title = title,
        items = items,
        onEntrySelected = onEntrySelected,
        onDismiss = onDismiss,
    )
}

@Composable
fun ConsoleSubmenuOverlayDetailed(
    title: String,
    items: List<ConsoleSubmenuEntry>,
    onEntrySelected: (Int) -> Unit,
    onDismiss: () -> Unit,
) {
    val colors = watermelon
    val firstFocusRequester = remember { FocusRequester() }

    BackHandler { onDismiss() }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(SubmenuScrim)
            .focusProperties { canFocus = false }
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
            ) { onDismiss() }
            .onPreviewKeyEvent { event ->
                if (event.type == KeyEventType.KeyDown && (event.key == Key.ButtonB || event.key == Key.Back)) {
                    onDismiss()
                    true
                } else {
                    false
                }
            },
        contentAlignment = Alignment.BottomCenter,
    ) {
        Column(
            modifier = Modifier
                .widthIn(max = 760.dp)
                .fillMaxWidth()
                .systemBarsPadding()
                .focusProperties { canFocus = false }
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                ) { /* consume clicks inside panel */ },
            verticalArrangement = Arrangement.Bottom,
        ) {
            // Main Panel Card (Header + Items List)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 14.dp, vertical = 6.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(0xFF131217))
                    .border(1.dp, colors.line, RoundedCornerShape(20.dp)),
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    // Header Bar
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 16.dp, end = 16.dp, top = 14.dp, bottom = 12.dp),
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Tune,
                            contentDescription = null,
                            tint = colors.red,
                            modifier = Modifier.size(22.dp),
                        )
                        Spacer(Modifier.width(10.dp))
                        Text(
                            text = title,
                            color = colors.text,
                            fontFamily = SpaceGrotesk,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier.weight(1f),
                        )
                    }

                    Box(
                        Modifier
                            .fillMaxWidth()
                            .height(1.dp)
                            .background(colors.line)
                    )

                    // Options List
                    Column(
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .verticalScroll(rememberScrollState())
                            .padding(horizontal = 14.dp, vertical = 10.dp),
                    ) {
                        items.forEachIndexed { index, item ->
                            val interactionSource = remember { MutableInteractionSource() }
                            val isFocused by interactionSource.collectIsFocusedAsState()
                            val shape = RoundedCornerShape(12.dp)
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(shape)
                                    .background(if (isFocused) Color(0xFF2A1C22) else colors.surface)
                                    .border(
                                        width = if (isFocused) 1.5.dp else 1.dp,
                                        color = if (isFocused) colors.red else colors.line,
                                        shape = shape,
                                    )
                                    .let { if (index == 0) it.focusRequester(firstFocusRequester) else it }
                                    .clickable(interactionSource = interactionSource, indication = null) { onEntrySelected(index) }
                                    .padding(horizontal = 14.dp, vertical = 10.dp),
                            ) {
                                if (item.icon != null) {
                                    Box(
                                        modifier = Modifier
                                            .size(36.dp)
                                            .clip(RoundedCornerShape(8.dp))
                                            .background(if (isFocused) colors.red.copy(alpha = 0.22f) else colors.surface2),
                                        contentAlignment = Alignment.Center,
                                    ) {
                                        Icon(
                                            imageVector = item.icon,
                                            contentDescription = null,
                                            tint = if (isFocused) colors.red else colors.text,
                                            modifier = Modifier.size(18.dp),
                                        )
                                    }
                                    Spacer(Modifier.width(12.dp))
                                }

                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        text = item.title,
                                        color = colors.text,
                                        fontSize = 13.5.sp,
                                        lineHeight = 17.sp,
                                        fontWeight = FontWeight.Bold,
                                        maxLines = 2,
                                        overflow = TextOverflow.Ellipsis,
                                    )

                                    if (item.value != null) {
                                        Spacer(Modifier.height(3.dp))
                                        Box(
                                            modifier = Modifier
                                                .clip(RoundedCornerShape(6.dp))
                                                .background(Color(0x22F59E0B))
                                                .border(0.5.dp, Color(0x66F59E0B), RoundedCornerShape(6.dp))
                                                .padding(horizontal = 6.dp, vertical = 2.dp),
                                        ) {
                                            Text(
                                                text = item.value,
                                                color = Color(0xFFFBBF24),
                                                fontSize = 11.sp,
                                                fontWeight = FontWeight.SemiBold,
                                                lineHeight = 13.sp,
                                                maxLines = 2,
                                                overflow = TextOverflow.Ellipsis,
                                            )
                                        }
                                    }

                                    if (item.description != null) {
                                        Spacer(Modifier.height(2.dp))
                                        Text(
                                            text = item.description,
                                            color = colors.text2,
                                            fontSize = 11.sp,
                                            lineHeight = 14.sp,
                                            maxLines = 2,
                                            overflow = TextOverflow.Ellipsis,
                                        )
                                    }
                                }

                                Spacer(Modifier.width(10.dp))
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                                    contentDescription = null,
                                    tint = colors.text3,
                                    modifier = Modifier.size(18.dp),
                                )
                            }
                        }
                    }
                }
            }

            // Unified Bottom Center Back Arrow
            Box(
                modifier = Modifier
                    .padding(bottom = 12.dp, top = 2.dp)
                    .size(42.dp)
                    .clip(CircleShape)
                    .background(colors.surface2)
                    .border(1.dp, colors.line, CircleShape)
                    .clickable(onClick = onDismiss)
                    .align(Alignment.CenterHorizontally),
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

        me.magnum.melonds.ui.common.RequestInitialFocus(firstFocusRequester)
    }
}

private fun getMetadataForSetting(title: String): Pair<ImageVector, String> {
    val lower = title.lowercase()
    return when {
        lower.contains("mapping") || lower.contains("назнач") || lower.contains("клавиш") ->
            Icons.Filled.SportsEsports to "Назначение физических кнопок геймпада или клавиатуры"
        lower.contains("layout") || lower.contains("макет") || lower.contains("расклад") ->
            Icons.Filled.TouchApp to "Выбор и редактирование сенсорных кнопок"
        lower.contains("dual") || lower.contains("двух") || lower.contains("экран") ->
            Icons.Filled.Tv to "Пресеты и вывод экранов на ТВ/монитор"
        lower.contains("filter") || lower.contains("фильтр") ->
            Icons.Filled.Filter to "Шейдерная постобработка и графические фильтры"
        lower.contains("preset") || lower.contains("пресет") ->
            Icons.Filled.AutoAwesome to "Файл шейдера RetroArch (.slangp / .glslp)"
        lower.contains("parameter") || lower.contains("параметр") ->
            Icons.Filled.Tune to "Пользовательские параметры активного шейдера"
        lower.contains("mic") || lower.contains("микрофон") ->
            Icons.Filled.Mic to "Выбор источника микрофона DS"
        else ->
            Icons.Filled.Tune to "Параметры для текущей игры"
    }
}

