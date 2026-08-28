package me.magnum.melonds.ui.layouteditor.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.layout.LayoutComponent
import me.magnum.melonds.ui.theme.LocalWatermelonColors
import me.magnum.melonds.ui.theme.Manrope
import me.magnum.melonds.utils.getLayoutComponentName

@Composable
fun LayoutComponentsVisibilityDialog(
    instantiatedComponents: Set<LayoutComponent>,
    onToggleComponent: (LayoutComponent, Boolean) -> Unit,
    onDismiss: () -> Unit,
) {
    val colors = LocalWatermelonColors.current
    // Exclude BUTTON_TRANSLATE as requested by user
    val allComponents = LayoutComponent.entries.filter { it != LayoutComponent.BUTTON_TRANSLATE }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false),
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(colors.surface.copy(alpha = 0.65f))
                .clickable(onClick = onDismiss),
            contentAlignment = Alignment.Center,
        ) {
            Box(
                modifier = Modifier
                    .widthIn(max = 480.dp)
                    .fillMaxWidth(0.92f)
                    .fillMaxHeight(0.85f)
                    .clip(RoundedCornerShape(20.dp))
                    .background(colors.surface)
                    .border(1.2.dp, colors.line, RoundedCornerShape(20.dp))
                    .clickable(enabled = false) {}
                    .padding(20.dp),
            ) {
                Column(modifier = Modifier.fillMaxSize()) {
                    // Header
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Extension,
                            contentDescription = null,
                            tint = colors.green,
                            modifier = Modifier.size(24.dp),
                        )
                        Spacer(Modifier.width(12.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = stringResource(R.string.components_visibility_title),
                                color = colors.text,
                                fontFamily = Manrope,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                            )
                            Text(
                                text = "Включение и скрытие элементов на экране",
                                color = colors.text3,
                                fontFamily = Manrope,
                                fontSize = 11.sp,
                            )
                        }
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(8.dp))
                                .background(colors.surface2)
                                .border(1.dp, colors.green.copy(alpha = 0.6f), RoundedCornerShape(8.dp))
                                .clickable(onClick = onDismiss)
                                .padding(horizontal = 12.dp, vertical = 6.dp),
                            contentAlignment = Alignment.Center,
                        ) {
                            Text(
                                text = stringResource(R.string.ok),
                                color = colors.green,
                                fontFamily = Manrope,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                    }

                    Spacer(Modifier.height(14.dp))
                    Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))
                    Spacer(Modifier.height(8.dp))

                    // Components List
                    LazyColumn(
                        verticalArrangement = Arrangement.spacedBy(6.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                    ) {
                        items(allComponents, key = { it.name }) { component ->
                            val isChecked = instantiatedComponents.contains(component)
                            val isScreen = component.isScreen()

                            val name = when (component) {
                                LayoutComponent.DPAD -> "Крестовина (D-Pad) / Левый стик"
                                LayoutComponent.BUTTON_TOGGLE_ANALOG_STICK -> "Сменить D-Pad / Стик"
                                else -> stringResource(getLayoutComponentName(component))
                            }

                            val description = when (component) {
                                LayoutComponent.TOP_SCREEN -> "Верхний игровой экран Nintendo DS"
                                LayoutComponent.BOTTOM_SCREEN -> "Нижний сенсорный экран (Touch Screen)"
                                LayoutComponent.HYBRID_SCREEN -> "Основной большой экран с миниатюрой второго экрана сбоку"
                                LayoutComponent.DPAD -> "Крестовина управления (D-Pad) или аналоговый стик"
                                LayoutComponent.BUTTONS -> "Основные кнопки действия (A, B, X, Y)"
                                LayoutComponent.BUTTON_START -> "Кнопка Start (Пауза / Меню в игре)"
                                LayoutComponent.BUTTON_SELECT -> "Кнопка Select"
                                LayoutComponent.BUTTON_L -> "Левый шифт (L)"
                                LayoutComponent.BUTTON_R -> "Правый шифт (R)"
                                LayoutComponent.BUTTON_HINGE -> "Имитация закрытия крышки консоли"
                                LayoutComponent.BUTTON_FAST_FORWARD_TOGGLE -> "Включение и отключение ускоренной перемотки (Fast Forward)"
                                LayoutComponent.BUTTON_TOGGLE_SOFT_INPUT -> "Скрыть или показать виртуальные кнопки на экране"
                                LayoutComponent.BUTTON_RESET -> "Сброс и перезапуск текущей игры"
                                LayoutComponent.BUTTON_PAUSE -> "Приостановка / возобновление эмуляции"
                                LayoutComponent.BUTTON_SWAP_SCREENS -> "Мгновенное переключение верхнего и нижнего экранов местами"
                                LayoutComponent.BUTTON_QUICK_SAVE -> "Быстрое сохранение состояния в текущий слот"
                                LayoutComponent.BUTTON_QUICK_LOAD -> "Быстрая загрузка состояния из текущего слота"
                                LayoutComponent.BUTTON_REWIND -> "Перемотка игрового процесса назад во времени"
                                LayoutComponent.BUTTON_MICROPHONE_TOGGLE -> "Активация микрофона (шум или голос)"
                                LayoutComponent.BUTTON_TOGGLE_EXTRA_BUTTONS -> "Панель дополнительных быстрых кнопок"
                                LayoutComponent.BUTTON_LOCK_ROTATION -> "Фиксация ориентации экрана (портретная / альбомная)"
                                LayoutComponent.BUTTON_TOGGLE_ANALOG_STICK -> "Переключение между D-Pad и аналоговым стиком"
                                else -> null
                            }

                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(if (isChecked) colors.surface2 else colors.surface2.copy(alpha = 0.5f))
                                    .border(
                                        1.dp,
                                        if (isChecked) colors.green.copy(alpha = 0.35f) else colors.line,
                                        RoundedCornerShape(12.dp)
                                    )
                                    .clickable {
                                        onToggleComponent(component, !isChecked)
                                    }
                                    .padding(horizontal = 14.dp, vertical = 9.dp),
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.fillMaxWidth(),
                                ) {
                                    Icon(
                                        imageVector = when {
                                            isScreen -> Icons.Filled.Tv
                                            component == LayoutComponent.DPAD -> Icons.Filled.Gamepad
                                            component == LayoutComponent.BUTTONS -> Icons.Filled.RadioButtonChecked
                                            component == LayoutComponent.BUTTON_TOGGLE_ANALOG_STICK -> Icons.Filled.ChangeCircle
                                            else -> Icons.Filled.TouchApp
                                        },
                                        contentDescription = null,
                                        tint = if (isChecked) colors.green else colors.text3,
                                        modifier = Modifier.size(20.dp),
                                    )
                                    Spacer(Modifier.width(12.dp))
                                    Column(modifier = Modifier.weight(1f)) {
                                        Text(
                                            text = name,
                                            color = if (isChecked) colors.text else colors.text3,
                                            fontFamily = Manrope,
                                            fontSize = 14.sp,
                                            fontWeight = if (isChecked) FontWeight.SemiBold else FontWeight.Normal,
                                        )
                                        if (description != null) {
                                            Spacer(Modifier.height(2.dp))
                                            Text(
                                                text = description,
                                                color = colors.text3.copy(alpha = 0.75f),
                                                fontFamily = Manrope,
                                                fontSize = 11.sp,
                                                lineHeight = 14.sp,
                                            )
                                        }
                                    }
                                    Spacer(Modifier.width(8.dp))
                                    Switch(
                                        checked = isChecked,
                                        onCheckedChange = { checked ->
                                            onToggleComponent(component, checked)
                                        },
                                        colors = SwitchDefaults.colors(
                                            checkedThumbColor = colors.green,
                                            checkedTrackColor = colors.green.copy(alpha = 0.5f),
                                            uncheckedThumbColor = colors.text3,
                                            uncheckedTrackColor = colors.surface,
                                        ),
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

