package me.magnum.melonds.ui.settings.preferences

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Palette
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.preference.Preference
import androidx.preference.PreferenceViewHolder
import me.magnum.melonds.R
import me.magnum.melonds.ui.settings.dialogs.SettingsDialogScaffold
import me.magnum.melonds.ui.settings.dialogs.showSettingsComposeDialog
import me.magnum.melonds.ui.theme.LocalWatermelonColors

class FirmwareColourPickerPreference(context: Context, attrs: AttributeSet?) : Preference(context, attrs) {
    companion object {
        private val extendedColorList = listOf(
            0x61829A, // 0: GRAY
            0xBA4900, // 1: BROWN
            0xFB0018, // 2: RED
            0xFB8AFB, // 3: PINK
            0xFB9200, // 4: ORANGE
            0xF3E300, // 5: YELLOW
            0xAAFB00, // 6: LIME
            0x00FB00, // 7: GREEN
            0x00A238, // 8: DARK_GREEN
            0x49DB8A, // 9: TURQUOISE
            0x30BAF3, // 10: LIGHT_BLUE
            0x0059F3, // 11: BLUE
            0x000092, // 12: DARK_BLUE
            0x8A00D3, // 13: PURPLE
            0xD300EB, // 14: VIOLET
            0xFB0092, // 15: FUCHSIA
            0xFFFFFF, // 16: WHITE
            0x121418, // 17: OBSIDIAN BLACK
            0x00E5FF, // 18: CYBER CYAN
            0xFFD700, // 19: PURE GOLD
            0xE0115F, // 20: RUBY CRIMSON
            0x00E676, // 21: BRIGHT EMERALD
            0xFF6E40, // 22: SUNSET CORAL
            0x651FFF  // 23: ELECTRIC INDIGO
        )
    }

    private lateinit var viewSelectedColour: View

    init {
        widgetLayoutResource = R.layout.preference_firmware_colour_picker_colour
    }

    override fun onClick() {
        super.onClick()
        val currentColour = getPersistedInt(0)

        showSettingsComposeDialog(context) { dismiss ->
            var selected by remember { mutableIntStateOf(currentColour) }

            SettingsDialogScaffold(
                title = title?.toString() ?: stringResource(R.string.firmware_favourite_colour),
                subtitle = "Цвет профиля Nintendo DS",
                icon = Icons.Filled.Palette,
                onDismiss = dismiss,
            ) {
                LazyVerticalGrid(
                    columns = GridCells.Fixed(6),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 14.dp, vertical = 12.dp),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                ) {
                    itemsIndexed(extendedColorList) { index, colorInt ->
                        val color = Color((0xFF000000 or colorInt.toLong()).toInt())
                        val isSelected = index == selected

                        Box(
                            modifier = Modifier
                                .size(42.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(color)
                                .border(
                                    width = if (isSelected) 2.dp else 1.dp,
                                    color = if (isSelected) Color.White else Color.Black.copy(alpha = 0.4f),
                                    shape = RoundedCornerShape(10.dp)
                                )
                                .clickable {
                                    selected = index
                                    updateSelectedColour(index)
                                    if (callChangeListener(index)) {
                                        persistInt(index)
                                    }
                                    dismiss()
                                },
                            contentAlignment = Alignment.Center,
                        ) {
                            if (isSelected) {
                                Icon(
                                    imageVector = Icons.Filled.Check,
                                    contentDescription = null,
                                    tint = if (colorInt == 0xFFFFFF) Color.Black else Color.White,
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }

    private fun updateSelectedColour(selectedColour: Int) {
        val colorRgb = extendedColorList.getOrNull(selectedColour) ?: extendedColorList[0]
        val colourWithAlpha = (0xFF000000 or colorRgb.toLong())
        if (::viewSelectedColour.isInitialized) {
            viewSelectedColour.setBackgroundColor(colourWithAlpha.toInt())
        }
    }

    override fun onBindViewHolder(holder: PreferenceViewHolder) {
        super.onBindViewHolder(holder)
        viewSelectedColour = holder.findViewById(R.id.viewSelectedColour)
        updateSelectedColour(getPersistedInt(0))
    }
}