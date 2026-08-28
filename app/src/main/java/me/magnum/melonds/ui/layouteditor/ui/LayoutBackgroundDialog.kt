package me.magnum.melonds.ui.layouteditor.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Tune
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.layout.BackgroundMode
import me.magnum.melonds.ui.theme.LocalWatermelonColors
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import java.util.UUID

@Composable
fun LayoutBackgroundDialog(
    backgroundId: UUID?,
    backgroundMode: BackgroundMode,
    loadBackgroundName: suspend (UUID) -> String?,
    onOpenBackgroundPicker: () -> Unit,
    onBackgroundModeUpdate: (BackgroundMode) -> Unit,
    onDismiss: () -> Unit,
    onSave: () -> Unit,
) {
    val colors = LocalWatermelonColors.current
    var backgroundName by remember { mutableStateOf<String?>(null) }
    val currentLoadBackgroundName by rememberUpdatedState(loadBackgroundName)

    LaunchedEffect(backgroundId) {
        backgroundName = if (backgroundId != null) {
            currentLoadBackgroundName(backgroundId)
        } else {
            null
        }
    }

    val modeOptions = stringArrayResource(R.array.background_portrait_mode_options)

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
                    .widthIn(max = 440.dp)
                    .fillMaxWidth(0.92f)
                    .clip(RoundedCornerShape(20.dp))
                    .background(colors.surface)
                    .border(1.2.dp, colors.line, RoundedCornerShape(20.dp))
                    .clickable(enabled = false) {}
                    .padding(20.dp),
            ) {
                Column(modifier = Modifier.fillMaxWidth()) {
                    // Header
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Image,
                            contentDescription = null,
                            tint = colors.green,
                            modifier = Modifier.size(24.dp),
                        )
                        Spacer(Modifier.width(12.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = stringResource(R.string.layout_background_title),
                                color = colors.text,
                                fontFamily = SpaceGrotesk,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                            )
                            Text(
                                text = "Настройка фонового изображения макета",
                                color = colors.text3,
                                fontFamily = WatermelonMono,
                                fontSize = 11.sp,
                            )
                        }
                        Box(
                            modifier = Modifier
                                .size(32.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(colors.surface2)
                                .clickable(onClick = onDismiss),
                            contentAlignment = Alignment.Center,
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Close,
                                contentDescription = stringResource(R.string.cancel),
                                tint = colors.text2,
                                modifier = Modifier.size(18.dp),
                            )
                        }
                    }

                    Spacer(Modifier.height(14.dp))
                    Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))
                    Spacer(Modifier.height(14.dp))

                    // Background selection card
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(12.dp))
                            .background(colors.surface2)
                            .border(1.dp, colors.line, RoundedCornerShape(12.dp))
                            .clickable(onClick = onOpenBackgroundPicker)
                            .padding(14.dp),
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth(),
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Tune,
                                contentDescription = null,
                                tint = colors.green,
                                modifier = Modifier.size(20.dp),
                            )
                            Spacer(Modifier.width(12.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = stringResource(R.string.background_name),
                                    color = colors.text,
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.SemiBold,
                                )
                                Text(
                                    text = backgroundName ?: stringResource(R.string.none),
                                    color = if (backgroundName != null) colors.green else colors.text3,
                                    fontFamily = WatermelonMono,
                                    fontSize = 12.sp,
                                )
                            }
                            Text(
                                text = "Выбрать",
                                color = colors.green,
                                fontFamily = SpaceGrotesk,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                    }

                    Spacer(Modifier.height(14.dp))

                    // Mode title
                    Text(
                        text = stringResource(R.string.background_mode),
                        color = colors.text2,
                        fontFamily = SpaceGrotesk,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(start = 4.dp, bottom = 6.dp),
                    )

                    // Mode radio buttons
                    Column(
                        verticalArrangement = Arrangement.spacedBy(6.dp),
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        modeOptions.forEachIndexed { index, optionName ->
                            val isSelected = backgroundMode.ordinal == index
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(if (isSelected) colors.green.copy(alpha = 0.12f) else colors.surface2)
                                    .border(
                                        1.dp,
                                        if (isSelected) colors.green.copy(alpha = 0.5f) else colors.line,
                                        RoundedCornerShape(10.dp)
                                    )
                                    .clickable {
                                        onBackgroundModeUpdate(BackgroundMode.entries[index])
                                    }
                                    .padding(horizontal = 12.dp, vertical = 8.dp),
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.fillMaxWidth(),
                                ) {
                                    RadioButton(
                                        selected = isSelected,
                                        onClick = { onBackgroundModeUpdate(BackgroundMode.entries[index]) },
                                        colors = RadioButtonDefaults.colors(
                                            selectedColor = colors.green,
                                            unselectedColor = colors.text3,
                                        ),
                                    )
                                    Spacer(Modifier.width(8.dp))
                                    Text(
                                        text = optionName,
                                        color = if (isSelected) colors.text else colors.text2,
                                        fontFamily = SpaceGrotesk,
                                        fontSize = 13.5.sp,
                                        fontWeight = if (isSelected) FontWeight.SemiBold else FontWeight.Normal,
                                    )
                                }
                            }
                        }
                    }

                    Spacer(Modifier.height(18.dp))

                    // Action buttons
                    Row(
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .background(colors.surface2)
                                .border(1.dp, colors.line, RoundedCornerShape(10.dp))
                                .clickable(onClick = onDismiss)
                                .padding(horizontal = 16.dp, vertical = 10.dp),
                            contentAlignment = Alignment.Center,
                        ) {
                            Text(
                                text = stringResource(R.string.cancel),
                                color = colors.text2,
                                fontFamily = SpaceGrotesk,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Medium,
                            )
                        }
                        Spacer(Modifier.width(10.dp))
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .background(colors.green)
                                .clickable(onClick = onSave)
                                .padding(horizontal = 20.dp, vertical = 10.dp),
                            contentAlignment = Alignment.Center,
                        ) {
                            Text(
                                text = stringResource(R.string.ok),
                                color = colors.bg,
                                fontFamily = SpaceGrotesk,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                    }
                }
            }
        }
    }
}
