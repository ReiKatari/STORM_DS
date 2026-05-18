package me.magnum.melonds.ui.emulator.input.componentbuilder

import android.content.Context
import android.graphics.drawable.Drawable
import me.magnum.melonds.ui.common.componentbuilders.ScreenLayoutComponentViewBuilder

class RuntimeScreenLayoutComponentViewBuilder(
    private val aspectRatio: Float = 256f / 192f,
) : ScreenLayoutComponentViewBuilder() {
    override fun getBackgroundDrawable(context: Context): Drawable? = null
    override fun getAspectRatio() = aspectRatio
}
