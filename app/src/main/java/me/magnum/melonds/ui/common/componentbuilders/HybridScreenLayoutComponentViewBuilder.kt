package me.magnum.melonds.ui.common.componentbuilders

import android.content.Context
import android.view.View
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import me.magnum.melonds.R
import me.magnum.melonds.ui.common.LayoutComponentViewBuilder

class HybridScreenLayoutComponentViewBuilder : LayoutComponentViewBuilder() {
    override fun build(context: Context): View {
        return LinearLayout(context).apply {
            orientation = LinearLayout.VERTICAL
            addView(buildScreenHalf(context, R.drawable.background_top_screen), LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                0,
                1f,
            ))
            addView(buildScreenHalf(context, R.drawable.background_bottom_screen), LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                0,
                1f,
            ))
        }
    }

    override fun getAspectRatio() = 256f / (192f * 2f)

    private fun buildScreenHalf(context: Context, backgroundRes: Int): View {
        return View(context).apply {
            background = ContextCompat.getDrawable(context, backgroundRes)
        }
    }
}
