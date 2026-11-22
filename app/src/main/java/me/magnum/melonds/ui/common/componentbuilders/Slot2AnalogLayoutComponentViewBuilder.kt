package me.magnum.melonds.ui.common.componentbuilders

import android.content.Context
import me.magnum.melonds.ui.common.LayoutComponentViewBuilder
import me.magnum.melonds.ui.emulator.input.view.Slot2AnalogView

class Slot2AnalogLayoutComponentViewBuilder : LayoutComponentViewBuilder() {
    override fun build(context: Context) = Slot2AnalogView(context)
    override fun getAspectRatio() = 1f
}
