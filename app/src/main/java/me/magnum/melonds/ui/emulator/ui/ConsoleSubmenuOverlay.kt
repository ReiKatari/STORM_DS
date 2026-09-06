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
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import me.magnum.melonds.ui.common.bouncingClickable
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
import androidx.compose.material.icons.filled.PlayArrow
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
    onResumeGame: (() -> Unit)? = null,
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
        onResumeGame = onResumeGame,
    )
}

@Composable
fun ConsoleSubmenuOverlayDetailed(
    title: String,
    items: List<ConsoleSubmenuEntry>,
    onEntrySelected: (Int) -> Unit,
    onDismiss: () -> Unit,
    onResumeGame: (() -> Unit)? = null,
) {
    val colors = watermelon
    val firstFocusRequester = remember { FocusRequester() }

    androidx.compose.runtime.LaunchedEffect(Unit) {
        kotlinx.coroutines.delay(50)
        try {
            firstFocusRequester.requestFocus()
        } catch (_: Throwable) {}
    }

    BackHandler { onDismiss() }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = if (colors.isDark) 0.82f else 0.65f))
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
                .navigationBarsPadding()
                .padding(bottom = 16.dp)
                .focusProperties { canFocus = false }
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                ) { /* consume clicks inside panel */ },
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // Main Panel Card (Header + Items List)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f, fill = false)
                    .fillMaxHeight(0.85f)
                    .padding(horizontal = 14.dp, vertical = 6.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(colors.surface)
                    .border(1.dp, colors.line, RoundedCornerShape(20.dp)),
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    val (headerIcon, headerSubtitle) = getHeaderMetadata(title)
                    // Header Bar
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 16.dp, end = 16.dp, top = 14.dp, bottom = 12.dp),
                    ) {
                        Icon(
                            imageVector = headerIcon,
                            contentDescription = null,
                            tint = colors.green,
                            modifier = Modifier.size(22.dp),
                        )
                        Spacer(Modifier.width(10.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = title,
                                color = colors.text,
                                fontFamily = SpaceGrotesk,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.SemiBold,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                            Text(
                                text = headerSubtitle,
                                color = colors.text3,
                                fontSize = 10.5.sp,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        if (onResumeGame != null) {
                            Spacer(Modifier.width(8.dp))
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(colors.surface2)
                                    .border(1.dp, colors.green.copy(alpha = 0.5f), RoundedCornerShape(8.dp))
                                    .clickable(onClick = onResumeGame)
                                    .padding(horizontal = 10.dp, vertical = 5.dp),
                                contentAlignment = Alignment.Center,
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        imageVector = Icons.Filled.PlayArrow,
                                        contentDescription = stringResource(R.string.pause_resume),
                                        tint = colors.green,
                                        modifier = Modifier.size(15.dp),
                                    )
                                    Spacer(Modifier.width(4.dp))
                                    Text(
                                        text = "В игру",
                                        color = colors.green,
                                        fontFamily = SpaceGrotesk,
                                        fontSize = 11.5.sp,
                                        fontWeight = FontWeight.Bold,
                                    )
                                }
                            }
                        }
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
                                    .background(if (isFocused) colors.surface2.copy(alpha = 0.8f) else colors.surface2)
                                    .border(
                                        width = if (isFocused) 1.5.dp else 1.dp,
                                        color = if (isFocused) colors.green else colors.line,
                                        shape = shape,
                                    )
                                    .let { if (index == 0) it.focusRequester(firstFocusRequester) else it }
                                    .bouncingClickable(interactionSource = interactionSource) { onEntrySelected(index) }
                                    .padding(horizontal = 14.dp, vertical = 10.dp),
                            ) {
                                if (item.icon != null) {
                                    Box(
                                        modifier = Modifier
                                            .size(36.dp)
                                            .clip(RoundedCornerShape(8.dp))
                                            .background(if (isFocused) colors.green.copy(alpha = 0.22f) else colors.surface),
                                        contentAlignment = Alignment.Center,
                                    ) {
                                        Icon(
                                            imageVector = item.icon,
                                            contentDescription = null,
                                            tint = if (isFocused) colors.green else colors.text,
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
            me.magnum.melonds.ui.common.UnifiedBackButton(
                onClick = onDismiss,
                modifier = Modifier.align(Alignment.CenterHorizontally),
            )
        }

        me.magnum.melonds.ui.common.RequestInitialFocus(firstFocusRequester)
    }
}

private fun getHeaderMetadata(title: String): Pair<ImageVector, String> {
    val lower = title.lowercase()
    return when {
        lower.contains("настройки игры") || lower.contains("rom settings") || lower.contains("game settings") ->
            Icons.Filled.Tune to "Параметры и оверлеи для текущей игры"
        lower.contains("видео") || lower.contains("video") || lower.contains("фильтр") ->
            Icons.Filled.AutoAwesome to "Шейдеры, фильтры и видеочип"
        lower.contains("звук") || lower.contains("audio") || lower.contains("микрофон") ->
            Icons.Filled.Mic to "Аудиопотоки и параметры микрофона"
        lower.contains("управлен") || lower.contains("input") || lower.contains("клавиш") ->
            Icons.Filled.SportsEsports to "Геймпады, маппинг и сенсор"
        lower.contains("экран") || lower.contains("расклад") || lower.contains("preset") || lower.contains("пресет") ->
            Icons.Filled.Tv to "Ориентация, пресеты и вывод экранов"
        else ->
            Icons.Filled.Tune to "Параметры и настройки"
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

