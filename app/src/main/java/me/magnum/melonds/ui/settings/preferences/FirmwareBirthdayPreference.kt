package me.magnum.melonds.ui.settings.preferences

import android.content.Context
import android.util.AttributeSet
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Cake
import androidx.compose.material.icons.filled.Remove
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.preference.Preference
import me.magnum.melonds.R
import me.magnum.melonds.ui.settings.dialogs.SettingsDialogScaffold
import me.magnum.melonds.ui.settings.dialogs.showSettingsComposeDialog
import me.magnum.melonds.ui.theme.LocalWatermelonColors
import me.magnum.melonds.ui.theme.SpaceGrotesk
import java.text.NumberFormat

class FirmwareBirthdayPreference(context: Context, attrs: AttributeSet?) : Preference(context, attrs) {
    companion object {
        private val daysInMonth = mapOf(
            1 to 31, 2 to 29, 3 to 31, 4 to 30, 5 to 31, 6 to 30,
            7 to 31, 8 to 31, 9 to 30, 10 to 31, 11 to 30, 12 to 31
        )

        private val numberFormat = NumberFormat.getNumberInstance().apply {
            minimumIntegerDigits = 2
        }
    }

    override fun onClick() {
        super.onClick()
        val currentBirthday = getPersistedString("01/01")
        val parts = currentBirthday.split("/")
        val initDay = parts.getOrNull(0)?.toIntOrNull() ?: 1
        val initMonth = parts.getOrNull(1)?.toIntOrNull() ?: 1

        showSettingsComposeDialog(context) { dismiss ->
            val colors = LocalWatermelonColors.current
            var day by remember { mutableIntStateOf(initDay) }
            var month by remember { mutableIntStateOf(initMonth) }

            SettingsDialogScaffold(
                title = title?.toString() ?: stringResource(R.string.firmware_birthday),
                subtitle = "Формат: День / Месяц",
                icon = Icons.Filled.Cake,
                onDismiss = dismiss,
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        // Day Picker
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(8.dp),
                        ) {
                            Text(
                                text = "День",
                                color = colors.text3,
                                fontFamily = SpaceGrotesk,
                                fontSize = 12.sp,
                            )
                            Box(
                                modifier = Modifier
                                    .size(36.dp)
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(colors.surface2)
                                    .border(1.dp, colors.line, RoundedCornerShape(8.dp))
                                    .clickable {
                                        val maxDay = daysInMonth[month] ?: 31
                                        day = if (day >= maxDay) 1 else day + 1
                                    },
                                contentAlignment = Alignment.Center,
                            ) {
                                Icon(Icons.Filled.Add, contentDescription = null, tint = colors.green, modifier = Modifier.size(18.dp))
                            }
                            Text(
                                text = numberFormat.format(day),
                                color = colors.green,
                                fontFamily = SpaceGrotesk,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                            )
                            Box(
                                modifier = Modifier
                                    .size(36.dp)
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(colors.surface2)
                                    .border(1.dp, colors.line, RoundedCornerShape(8.dp))
                                    .clickable {
                                        val maxDay = daysInMonth[month] ?: 31
                                        day = if (day <= 1) maxDay else day - 1
                                    },
                                contentAlignment = Alignment.Center,
                            ) {
                                Icon(Icons.Filled.Remove, contentDescription = null, tint = colors.text, modifier = Modifier.size(18.dp))
                            }
                        }

                        Text(
                            text = "/",
                            color = colors.text3,
                            fontFamily = SpaceGrotesk,
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold,
                        )

                        // Month Picker
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(8.dp),
                        ) {
                            Text(
                                text = "Месяц",
                                color = colors.text3,
                                fontFamily = SpaceGrotesk,
                                fontSize = 12.sp,
                            )
                            Box(
                                modifier = Modifier
                                    .size(36.dp)
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(colors.surface2)
                                    .border(1.dp, colors.line, RoundedCornerShape(8.dp))
                                    .clickable {
                                        month = if (month >= 12) 1 else month + 1
                                        val maxDay = daysInMonth[month] ?: 31
                                        if (day > maxDay) day = maxDay
                                    },
                                contentAlignment = Alignment.Center,
                            ) {
                                Icon(Icons.Filled.Add, contentDescription = null, tint = colors.green, modifier = Modifier.size(18.dp))
                            }
                            Text(
                                text = numberFormat.format(month),
                                color = colors.green,
                                fontFamily = SpaceGrotesk,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                            )
                            Box(
                                modifier = Modifier
                                    .size(36.dp)
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(colors.surface2)
                                    .border(1.dp, colors.line, RoundedCornerShape(8.dp))
                                    .clickable {
                                        month = if (month <= 1) 12 else month - 1
                                        val maxDay = daysInMonth[month] ?: 31
                                        if (day > maxDay) day = maxDay
                                    },
                                contentAlignment = Alignment.Center,
                            ) {
                                Icon(Icons.Filled.Remove, contentDescription = null, tint = colors.text, modifier = Modifier.size(18.dp))
                            }
                        }
                    }

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(12.dp))
                            .background(colors.green)
                            .clickable {
                                val bday = "${numberFormat.format(day)}/${numberFormat.format(month)}"
                                if (callChangeListener(bday)) {
                                    persistString(bday)
                                }
                                dismiss()
                            }
                            .padding(vertical = 12.dp),
                        contentAlignment = Alignment.Center,
                    ) {
                        Text(
                            text = stringResource(R.string.ok),
                            color = colors.bg,
                            fontFamily = SpaceGrotesk,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
            }
        }
    }
}