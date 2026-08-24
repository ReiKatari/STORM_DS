package me.magnum.melonds.ui.common

import android.view.View
import android.widget.FrameLayout
import androidx.core.view.updateLayoutParams
import me.magnum.melonds.domain.model.layout.LayoutComponent
import me.magnum.melonds.domain.model.Point
import me.magnum.melonds.domain.model.Rect

class LayoutComponentView(val view: View, val aspectRatio: Float, val component: LayoutComponent) {
    var baseAlpha: Float = 1f
        set(value) {
            field = value
            applyAlpha()
        }

    var onTop: Boolean = false

    fun setPosition(position: Point) {
        view.updateLayoutParams<FrameLayout.LayoutParams> {
            leftMargin = position.x
            topMargin = position.y
        }
    }

    fun setSize(width: Int, height: Int) {
        view.updateLayoutParams {
            this.width = width
            this.height = height
        }
    }

    fun setPositionAndSize(position: Point, width: Int, height: Int) {
        view.updateLayoutParams<FrameLayout.LayoutParams> {
            this.width = width
            this.height = height
            leftMargin = position.x
            topMargin = position.y
        }
    }

    fun getPosition(): Point {
        return Point().apply {
            x = view.x.toInt()
            y = view.y.toInt()
        }
    }

    fun getWidth(): Int {
        return view.width
    }

    fun getHeight(): Int {
        return view.height
    }

    fun getRect(): Rect {
        val layoutParams = view.layoutParams as? FrameLayout.LayoutParams
        val lpWidth = layoutParams?.width?.takeIf { it > 0 }
        val lpHeight = layoutParams?.height?.takeIf { it > 0 }
        val lpX = layoutParams?.leftMargin
        val lpY = layoutParams?.topMargin

        val width = lpWidth ?: view.width.coerceAtLeast(0)
        val height = lpHeight ?: view.height.coerceAtLeast(0)
        val x = lpX ?: view.x.toInt()
        val y = lpY ?: view.y.toInt()

        return Rect(
            x,
            y,
            width,
            height,
        )
    }

    fun setHighlighted(value: Boolean) {
        view.isSelected = value
    }

    private fun applyAlpha() {
        view.alpha = baseAlpha
    }
}
