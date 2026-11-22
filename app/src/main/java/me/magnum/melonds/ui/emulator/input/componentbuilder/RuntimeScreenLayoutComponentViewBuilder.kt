package me.magnum.melonds.ui.emulator.input.componentbuilder

import android.content.Context
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.graphics.drawable.LayerDrawable
import androidx.core.content.ContextCompat
import me.magnum.melonds.R
import me.magnum.melonds.multiplayer.phantom.PhantomPlayer
import me.magnum.melonds.ui.common.componentbuilders.ScreenLayoutComponentViewBuilder

class RuntimeScreenLayoutComponentViewBuilder(
    private val aspectRatio: Float = 256f / 192f,
) : ScreenLayoutComponentViewBuilder() {
    private val isHybrid: Boolean get() = aspectRatio < 1f

    override fun getBackgroundDrawable(context: Context): Drawable? {
        if (PhantomPlayer.current?.primary != false) return null
        val frame = ContextCompat.getDrawable(context, R.drawable.phantom_clone_frame) ?: return null
        if (!isHybrid) return frame
        val bottomFrame = ContextCompat.getDrawable(context, R.drawable.phantom_clone_frame) ?: return frame
        return object : LayerDrawable(arrayOf(frame, bottomFrame)) {
            override fun onBoundsChange(bounds: Rect) {
                val middle = bounds.centerY()
                getDrawable(0).setBounds(bounds.left, bounds.top, bounds.right, middle)
                getDrawable(1).setBounds(bounds.left, middle, bounds.right, bounds.bottom)
            }
        }
    }

    override fun getAspectRatio() = aspectRatio
}
