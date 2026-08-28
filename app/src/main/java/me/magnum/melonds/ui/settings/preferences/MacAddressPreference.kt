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
import androidx.compose.material.icons.filled.Autorenew
import androidx.compose.material.icons.filled.Wifi
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
import me.magnum.melonds.domain.model.MacAddress
import me.magnum.melonds.ui.settings.dialogs.SettingsDialogScaffold
import me.magnum.melonds.ui.settings.dialogs.showSettingsComposeDialog
import me.magnum.melonds.ui.theme.LocalWatermelonColors
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import kotlin.random.Random

class MacAddressPreference(context: Context, attrs: AttributeSet?) : Preference(context, attrs) {
    private val random = Random(System.nanoTime())

    override fun onClick() {
        super.onClick()
        val initMac = getPersistedString(null)?.let { MacAddress.fromString(it) }?.takeIf { it.isValid() }

        showSettingsComposeDialog(context) { dismiss ->
            val colors = LocalWatermelonColors.current
            var currentMac by remember { mutableStateOf(initMac) }

            SettingsDialogScaffold(
                title = title?.toString() ?: stringResource(R.string.mac_address),
                subtitle = "Сетевой адрес Nintendo DS Wi-Fi",
                icon = Icons.Filled.Wifi,
                onDismiss = dismiss,
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(14.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(12.dp))
                            .background(colors.surface2)
                            .border(1.2.dp, colors.line, RoundedCornerShape(12.dp))
                            .padding(horizontal = 16.dp, vertical = 14.dp),
                        contentAlignment = Alignment.Center,
                    ) {
                        Text(
                            text = currentMac?.toString() ?: stringResource(R.string.not_set),
                            color = if (currentMac != null) colors.green else colors.text3,
                            fontFamily = WatermelonMono,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                        )
                    }

                    // Generate Random MAC Button
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(12.dp))
                            .background(colors.surface2)
                            .border(1.dp, colors.green.copy(alpha = 0.5f), RoundedCornerShape(12.dp))
                            .clickable {
                                currentMac = MacAddress.randomDsAddress(random)
                            }
                            .padding(vertical = 12.dp),
                        contentAlignment = Alignment.Center,
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Filled.Autorenew, contentDescription = null, tint = colors.green, modifier = Modifier.size(18.dp))
                            Spacer(Modifier.width(8.dp))
                            Text(
                                text = stringResource(R.string.generate_new_mac_address),
                                color = colors.green,
                                fontFamily = SpaceGrotesk,
                                fontSize = 13.5.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                    }

                    // Save / Apply Button
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(12.dp))
                            .background(colors.green)
                            .clickable {
                                val address = currentMac?.toString()
                                if (callChangeListener(address)) {
                                    persistString(address)
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