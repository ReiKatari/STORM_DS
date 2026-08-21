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
import androidx.compose.foundation.layout.heightIn
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
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .systemBarsPadding()
                .focusProperties { canFocus = false }
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                ) { },
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 12.dp, end = 22.dp, top = 8.dp, bottom = 8.dp),
            ) {
                Box(
                    modifier = Modifier
                        .size(38.dp)
                        .clip(CircleShape)
                        .focusProperties { canFocus = false }
                        .clickable(onClick = onDismiss),
                    contentAlignment = Alignment.Center,
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(20.dp),
                    )
                }
                Spacer(Modifier.width(10.dp))
                Icon(
                    imageVector = Icons.Filled.Tune,
                    contentDescription = null,
                    tint = colors.red,
                    modifier = Modifier.size(20.dp),
                )
                Spacer(Modifier.width(10.dp))
                Text(
                    text = title,
                    color = Color.White,
                    fontFamily = SpaceGrotesk,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            Box(Modifier.fillMaxWidth().height(1.dp).background(Color.White.copy(alpha = 0.09f)))

            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .weight(1f)
                    .widthIn(max = 680.dp)
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState())
                    .padding(horizontal = 18.dp, vertical = 14.dp),
            ) {
                items.forEachIndexed { index, item ->
                    val interactionSource = remember { MutableInteractionSource() }
                    val isFocused by interactionSource.collectIsFocusedAsState()
                    val shape = RoundedCornerShape(12.dp)
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .heightIn(min = 52.dp)
                            .clip(shape)
                            .background(if (isFocused) Color.White.copy(alpha = 0.16f) else Color.White.copy(alpha = 0.05f))
                            .border(
                                width = if (isFocused) 2.dp else 1.dp,
                                color = if (isFocused) colors.red else Color.White.copy(alpha = 0.10f),
                                shape = shape,
                            )
                            .let { if (index == 0) it.focusRequester(firstFocusRequester) else it }
                            .clickable(interactionSource = interactionSource, indication = null) { onEntrySelected(index) }
                            .padding(horizontal = 14.dp, vertical = 12.dp),
                    ) {
                        if (item.icon != null) {
                            Icon(
                                imageVector = item.icon,
                                contentDescription = null,
                                tint = if (isFocused) colors.red else Color.White.copy(alpha = 0.8f),
                                modifier = Modifier.size(24.dp),
                            )
                            Spacer(Modifier.width(14.dp))
                        }
                        Column(modifier = Modifier.weight(1f)) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier.fillMaxWidth(),
                            ) {
                                Text(
                                    text = item.title,
                                    color = Color.White,
                                    fontSize = 14.sp,
                                    lineHeight = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                    modifier = Modifier.weight(1f, fill = false),
                                )
                                if (item.value != null) {
                                    Spacer(Modifier.width(8.dp))
                                    Box(
                                        modifier = Modifier
                                            .clip(RoundedCornerShape(6.dp))
                                            .background(Color.White.copy(alpha = 0.12f))
                                            .padding(horizontal = 8.dp, vertical = 2.dp),
                                    ) {
                                        Text(
                                            text = item.value,
                                            color = me.magnum.melonds.ui.theme.WatermelonColors.gold,
                                            fontSize = 11.5.sp,
                                            fontWeight = FontWeight.SemiBold,
                                            maxLines = 1,
                                            overflow = TextOverflow.Ellipsis,
                                        )
                                    }
                                }
                            }
                            if (item.description != null) {
                                Spacer(Modifier.height(3.dp))
                                Text(
                                    text = item.description,
                                    color = Color.White.copy(alpha = 0.58f),
                                    fontSize = 11.5.sp,
                                    lineHeight = 15.sp,
                                )
                            }
                        }
                        Spacer(Modifier.width(10.dp))
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                            contentDescription = null,
                            tint = Color.White.copy(alpha = 0.45f),
                            modifier = Modifier.size(18.dp),
                        )
                    }
                }
            }

            GamepadHintsFooter(
                hints = listOf(
                    GamepadHint(null, stringResource(R.string.pause_hint_navigate)),
                    GamepadHint("A", stringResource(R.string.pause_hint_accept)),
                    GamepadHint("B", stringResource(R.string.pause_hint_back)),
                ),
            )
        }

        me.magnum.melonds.ui.common.RequestInitialFocus(firstFocusRequester)
    }
}

private fun getMetadataForSetting(title: String): Pair<ImageVector, String> {
    val lower = title.lowercase()
    return when {
        lower.contains("mapping") || lower.contains("назнач") || lower.contains("кноп") || lower.contains("клавиш") ->
            Icons.Filled.SportsEsports to "Настройка назначения физических кнопок геймпада или клавиатуры"
        lower.contains("layout") || lower.contains("расклад") || lower.contains("управлен") || lower.contains("экранн") ->
            Icons.Filled.TouchApp to "Выбор и редактирование расположения сенсорных кнопок на экране"
        lower.contains("dual") || lower.contains("двух") || lower.contains("экран") ->
            Icons.Filled.Tv to "Распределение экранов DS на внешнем мониторе/ТВ с автосохранением для игры"
        lower.contains("filter") || lower.contains("фильтр") ->
            Icons.Filled.Filter to "Графический фильтр или шейдерная постобработка изображения"
        lower.contains("preset") || lower.contains("пресет") ->
            Icons.Filled.AutoAwesome to "Выбор файла шейдера RetroArch (.slangp / .glslp)"
        lower.contains("parameter") || lower.contains("параметр") ->
            Icons.Filled.Tune to "Пользовательские параметры и переменные активного шейдера"
        lower.contains("mic") || lower.contains("микрофон") ->
            Icons.Filled.Mic to "Выбор источника звука микрофона DS (микрофон устройства или шум)"
        else ->
            Icons.Filled.Tune to "Параметры и конфигурация для текущей игры"
    }
}

