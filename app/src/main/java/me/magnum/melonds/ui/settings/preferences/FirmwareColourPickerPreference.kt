package me.magnum.melonds.ui.settings.preferences

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.core.view.children
import androidx.preference.Preference
import androidx.preference.PreferenceViewHolder
import me.magnum.melonds.R
import me.magnum.melonds.databinding.DialogFirmwareColourPickerBinding

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

        val binding = DialogFirmwareColourPickerBinding.inflate(LayoutInflater.from(context))

        val alertDialog = AlertDialog.Builder(context)
                .setTitle(title)
                .setView(binding.root)
                .setNegativeButton(R.string.cancel) { dialog, _ ->
                    dialog.dismiss()
                }
                .show()

        binding.layoutGridColours.children.flatMap { (it as ViewGroup).children }.forEach {
            it.setOnClickListener { view ->
                val selectedColour = (view.tag as String).toInt()
                updateSelectedColour(selectedColour)
                if (callChangeListener(selectedColour)) {
                    persistInt(selectedColour)
                }
                alertDialog.dismiss()
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