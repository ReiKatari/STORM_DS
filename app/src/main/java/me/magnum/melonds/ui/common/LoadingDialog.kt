package me.magnum.melonds.ui.common

import android.app.Dialog
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.Gravity
import android.widget.FrameLayout
import android.widget.ProgressBar
import me.magnum.melonds.ui.Theme
import me.magnum.melonds.ui.theme.AppThemeManager
import me.magnum.melonds.ui.theme.CyberpunkWatermelonColors
import me.magnum.melonds.ui.theme.DarkWatermelonColors
import me.magnum.melonds.ui.theme.GothicWatermelonColors
import me.magnum.melonds.ui.theme.LightWatermelonColors
import me.magnum.melonds.ui.theme.MatrixWatermelonColors
import me.magnum.melonds.ui.theme.MidnightWatermelonColors
import me.magnum.melonds.ui.theme.SakuraWatermelonColors
import me.magnum.melonds.ui.theme.SolarWatermelonColors
import me.magnum.melonds.ui.theme.getCustomizedAccentColors

class LoadingDialog(context: Context) : Dialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val baseColors = when (AppThemeManager.currentTheme) {
            Theme.LIGHT -> LightWatermelonColors
            Theme.MIDNIGHT -> MidnightWatermelonColors
            Theme.CYBERPUNK -> CyberpunkWatermelonColors
            Theme.GOTHIC -> GothicWatermelonColors
            Theme.MATRIX -> MatrixWatermelonColors
            Theme.SOLAR -> SolarWatermelonColors
            Theme.SAKURA -> SakuraWatermelonColors
            Theme.DARK, Theme.SYSTEM -> DarkWatermelonColors
        }
        val palette = getCustomizedAccentColors(baseColors, AppThemeManager.accentColorState.value)
        val density = context.resources.displayMetrics.density
        val cardSize = (88 * density).toInt()
        val pad = (22 * density).toInt()

        val cardBg = GradientDrawable().apply {
            shape = GradientDrawable.RECTANGLE
            cornerRadius = 20f * density
            setColor(
                Color.argb(
                    (palette.surface.alpha * 255).toInt(),
                    (palette.surface.red * 255).toInt(),
                    (palette.surface.green * 255).toInt(),
                    (palette.surface.blue * 255).toInt(),
                )
            )
            setStroke(
                (1.2f * density).toInt().coerceAtLeast(1),
                Color.argb(
                    (palette.line.alpha * 255).toInt(),
                    (palette.line.red * 255).toInt(),
                    (palette.line.green * 255).toInt(),
                    (palette.line.blue * 255).toInt(),
                )
            )
        }

        val container = FrameLayout(context).apply {
            layoutParams = FrameLayout.LayoutParams(cardSize, cardSize, Gravity.CENTER)
            background = cardBg
            setPadding(pad, pad, pad, pad)
        }

        val progressBar = ProgressBar(context).apply {
            isIndeterminate = true
            indeterminateTintList = ColorStateList.valueOf(AppThemeManager.getAccentColor())
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT,
                Gravity.CENTER,
            )
        }
        container.addView(progressBar)

        setContentView(container)
        setCancelable(false)
        setCanceledOnTouchOutside(false)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }
}