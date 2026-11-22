package me.magnum.melonds.ui.emulator.input.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View
import me.magnum.melonds.R
import me.magnum.melonds.ui.common.views.ButtonColorStyle
import me.magnum.melonds.ui.common.views.ButtonThemeManager
import kotlin.math.min

class Slot2AnalogView(context: Context) : View(context) {
    private val basePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#66111622")
    }
    private val ringPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 3f
        color = Color.parseColor("#8000E5FF")
    }
    private val thumbPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#E6F8FAFC")
    }
    private val thumbStrokePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 2.5f
        color = Color.parseColor("#FF00E5FF")
    }

    private var axisX = 0f
    private var axisY = 0f
    val travelRadius: Float get() = min(width, height) * 0.32f

    init {
        ButtonThemeManager.init(context)
        contentDescription = context.getString(R.string.input_slot2_analog)
    }

    fun setAxes(x: Float, y: Float) {
        if (axisX == x && axisY == y) return
        axisX = x
        axisY = y
        invalidate()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val size = min(width, height).toFloat()
        if (size <= 0f) return
        val cx = width / 2f
        val cy = height / 2f

        val accent = when (ButtonThemeManager.currentStyle) {
            ButtonColorStyle.CLASSIC_WHITE -> Color.parseColor("#0284C7")
            ButtonColorStyle.CRIMSON_RUBY -> Color.parseColor("#FF1744")
            ButtonColorStyle.MIDNIGHT_PURPLE -> Color.parseColor("#C084FC")
            ButtonColorStyle.GOLD_LUXURY -> Color.parseColor("#FFD700")
            ButtonColorStyle.EMERALD_MATRIX -> Color.parseColor("#00E676")
            ButtonColorStyle.VIRTUAL_BOY -> Color.parseColor("#FF0033")
            else -> Color.parseColor("#00E5FF")
        }
        ringPaint.color = accent
        ringPaint.alpha = 140
        thumbStrokePaint.color = accent

        canvas.drawCircle(cx, cy, size * 0.48f, basePaint)
        canvas.drawCircle(cx, cy, size * 0.47f, ringPaint)

        val thumbX = cx + axisX * travelRadius
        val thumbY = cy + axisY * travelRadius
        canvas.drawCircle(thumbX, thumbY, size * 0.16f, thumbPaint)
        canvas.drawCircle(thumbX, thumbY, size * 0.16f, thumbStrokePaint)
    }
}
