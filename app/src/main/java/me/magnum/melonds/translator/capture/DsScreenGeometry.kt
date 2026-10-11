package me.magnum.melonds.translator.capture

import android.graphics.Rect
import android.graphics.RectF

/**
 * Where a DS screen (0 = top, 1 = bottom) is presented on the emulator surface, in surface pixels.
 * Supplied by EmulatorActivity from the same rects that are given to the renderer, so swapped screens,
 * single-screen and hybrid layouts are all represented exactly.
 */
data class DsScreenPlacement(val screen: Int, val rect: RectF) {
    companion object {
        fun of(screen: Int, x: Int, y: Int, width: Int, height: Int): DsScreenPlacement? {
            if (width <= 0 || height <= 0) return null
            return DsScreenPlacement(screen, RectF(x.toFloat(), y.toFloat(), (x + width).toFloat(), (y + height).toFloat()))
        }
    }
}

/**
 * Native DS frame split per screen. Each screen is a 256x192 ARGB pixel array (or null when not captured).
 */
class DsFrame(val screens: Array<IntArray?>) {
    fun screen(index: Int): IntArray? = screens.getOrNull(index)

    companion object {
        const val SCREEN_WIDTH = 256
        const val SCREEN_HEIGHT = 192
        const val SCREEN_PIXELS = SCREEN_WIDTH * SCREEN_HEIGHT
    }
}

/**
 * Maps native DS coordinates to overlay view coordinates (and back) through the real screen rects.
 */
class DsScreenGeometry(
    placements: List<DsScreenPlacement>,
    /** Offset of the emulator surface origin inside the overlay view, in px. */
    private val surfaceOffsetX: Float,
    private val surfaceOffsetY: Float,
) {
    /** One placement per screen: when a screen is drawn twice (hybrid layouts) the biggest one wins. */
    private val primary: Map<Int, RectF> = placements
        .filter { it.rect.width() > 1f && it.rect.height() > 1f && it.screen in 0..1 }
        .groupBy { it.screen }
        .mapValues { (_, list) -> list.maxByOrNull { it.rect.width() * it.rect.height() }!!.rect }

    val visibleScreens: List<Int>
        get() = primary.keys.sorted()

    val isEmpty: Boolean
        get() = primary.isEmpty()

    /** Screen rect in overlay view coordinates. */
    fun screenRectInView(screen: Int): RectF? {
        val r = primary[screen] ?: return null
        return RectF(r.left + surfaceOffsetX, r.top + surfaceOffsetY, r.right + surfaceOffsetX, r.bottom + surfaceOffsetY)
    }

    /** Screen rect in surface coordinates. */
    fun screenRectInSurface(screen: Int): RectF? = primary[screen]?.let { RectF(it) }

    fun dsToView(screen: Int, ds: Rect): RectF? {
        val v = screenRectInView(screen) ?: return null
        val sx = v.width() / DsFrame.SCREEN_WIDTH
        val sy = v.height() / DsFrame.SCREEN_HEIGHT
        return RectF(v.left + ds.left * sx, v.top + ds.top * sy, v.left + ds.right * sx, v.top + ds.bottom * sy)
    }

    /** Converts a rect in overlay view px to native DS px of [screen]; null when they don't intersect. */
    fun viewToDs(screen: Int, view: RectF): Rect? {
        val v = screenRectInView(screen) ?: return null
        val inter = RectF()
        if (!inter.setIntersect(v, view)) return null
        val sx = DsFrame.SCREEN_WIDTH / v.width()
        val sy = DsFrame.SCREEN_HEIGHT / v.height()
        val l = ((inter.left - v.left) * sx).toInt().coerceIn(0, DsFrame.SCREEN_WIDTH - 1)
        val t = ((inter.top - v.top) * sy).toInt().coerceIn(0, DsFrame.SCREEN_HEIGHT - 1)
        val r = kotlin.math.ceil((inter.right - v.left) * sx).toInt().coerceIn(l + 1, DsFrame.SCREEN_WIDTH)
        val b = kotlin.math.ceil((inter.bottom - v.top) * sy).toInt().coerceIn(t + 1, DsFrame.SCREEN_HEIGHT)
        return Rect(l, t, r, b)
    }

    companion object {
        /**
         * Fallback when the activity did not report screen rects: replicates the default layout
         * (portrait = stacked, landscape = side by side, both aspect-fitted and centred).
         */
        fun defaultFor(surfaceWidth: Int, surfaceHeight: Int, surfaceOffsetX: Float, surfaceOffsetY: Float): DsScreenGeometry {
            val w = surfaceWidth.coerceAtLeast(1).toFloat()
            val h = surfaceHeight.coerceAtLeast(1).toFloat()
            val aspect = DsFrame.SCREEN_WIDTH.toFloat() / DsFrame.SCREEN_HEIGHT
            val placements = if (w > h) {
                val sw = w / 2f
                val sh = minOf(sw / aspect, h)
                val top = (h - sh) / 2f
                listOf(
                    DsScreenPlacement(0, RectF(0f, top, sw, top + sh)),
                    DsScreenPlacement(1, RectF(sw, top, w, top + sh)),
                )
            } else {
                val sh = minOf(w / aspect, h / 2f)
                val sw = sh * aspect
                val left = (w - sw) / 2f
                listOf(
                    DsScreenPlacement(0, RectF(left, 0f, left + sw, sh)),
                    DsScreenPlacement(1, RectF(left, sh, left + sw, sh * 2f)),
                )
            }
            return DsScreenGeometry(placements, surfaceOffsetX, surfaceOffsetY)
        }
    }
}
