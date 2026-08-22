package me.magnum.melonds.ui.emulator.input

import android.annotation.SuppressLint
import android.graphics.RectF
import android.view.MotionEvent
import android.view.View
import me.magnum.melonds.MelonEmulator.onScreenRelease
import me.magnum.melonds.domain.model.Input
import me.magnum.melonds.domain.model.Point

class TouchscreenInputHandler(
    inputListener: IInputListener,
    private val viewRectProvider: (() -> RectF)? = null,
) : BaseInputHandler(inputListener) {
    private val touchPoint: Point = Point()
    private var touchActive = false
    private var activePointerId = MotionEvent.INVALID_POINTER_ID

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouch(v: View, event: MotionEvent): Boolean {
        val width = if (v.width > 0) v.width else 1
        val height = if (v.height > 0) v.height else 1

        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN -> {
                val actionIndex = event.actionIndex
                activePointerId = event.getPointerId(actionIndex)
                touchActive = true
                inputListener.onKeyPress(Input.TOUCHSCREEN)
                inputListener.onTouch(normalizeTouchCoordinates(event, width, height))
            }
            MotionEvent.ACTION_POINTER_DOWN -> {
                val actionIndex = event.actionIndex
                val pointerId = event.getPointerId(actionIndex)
                val tool = event.getToolType(actionIndex)
                if (tool == MotionEvent.TOOL_TYPE_STYLUS || tool == MotionEvent.TOOL_TYPE_ERASER || !touchActive || activePointerId == MotionEvent.INVALID_POINTER_ID) {
                    activePointerId = pointerId
                }
                if (!touchActive) {
                    touchActive = true
                    inputListener.onKeyPress(Input.TOUCHSCREEN)
                }
                inputListener.onTouch(normalizeTouchCoordinates(event, width, height))
            }
            MotionEvent.ACTION_MOVE -> {
                if (touchActive) {
                    inputListener.onTouch(normalizeTouchCoordinates(event, width, height))
                }
            }
            MotionEvent.ACTION_POINTER_UP -> {
                val actionIndex = event.actionIndex
                val releasedPointerId = event.getPointerId(actionIndex)
                if (activePointerId == releasedPointerId) {
                    val remainingPointerId = findRemainingBestPointerId(event, actionIndex)
                    if (remainingPointerId != MotionEvent.INVALID_POINTER_ID) {
                        activePointerId = remainingPointerId
                        inputListener.onTouch(normalizeTouchCoordinates(event, width, height))
                    } else {
                        endTouch()
                    }
                }
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                endTouch()
            }
        }
        return true
    }

    private fun endTouch() {
        if (touchActive) {
            inputListener.onKeyReleased(Input.TOUCHSCREEN)
            onScreenRelease()
            touchActive = false
            activePointerId = MotionEvent.INVALID_POINTER_ID
        }
    }

    private fun findRemainingBestPointerId(event: MotionEvent, excludeIndex: Int): Int {
        for (i in 0 until event.pointerCount) {
            if (i == excludeIndex) continue
            val tool = event.getToolType(i)
            if (tool == MotionEvent.TOOL_TYPE_STYLUS || tool == MotionEvent.TOOL_TYPE_ERASER) {
                return event.getPointerId(i)
            }
        }
        for (i in 0 until event.pointerCount) {
            if (i != excludeIndex) {
                return event.getPointerId(i)
            }
        }
        return MotionEvent.INVALID_POINTER_ID
    }

    private fun normalizeTouchCoordinates(event: MotionEvent, viewWidth: Int, viewHeight: Int): Point {
        val pointerIndex = if (activePointerId != MotionEvent.INVALID_POINTER_ID) {
            val idx = event.findPointerIndex(activePointerId)
            if (idx >= 0 && idx < event.pointerCount) idx else event.actionIndex.coerceIn(0, event.pointerCount - 1)
        } else {
            event.actionIndex.coerceIn(0, event.pointerCount - 1)
        }

        val touchX = event.getX(pointerIndex)
        val touchY = event.getY(pointerIndex)

        val safeWidth = if (viewWidth > 0) viewWidth.toFloat() else 256f
        val safeHeight = if (viewHeight > 0) viewHeight.toFloat() else 192f

        val rect = viewRectProvider?.invoke()
        if (rect == null || rect.width() <= 0f || rect.height() <= 0f) {
            touchPoint.x = ((touchX / safeWidth) * 256f).toInt().coerceIn(0, 255)
            touchPoint.y = ((touchY / safeHeight) * 192f).toInt().coerceIn(0, 191)
            return touchPoint
        }

        val normalizedX = ((touchX - rect.left) / rect.width() * 256f)
        val normalizedY = ((touchY - rect.top) / rect.height() * 192f)

        touchPoint.x = normalizedX.toInt().coerceIn(0, 255)
        touchPoint.y = normalizedY.toInt().coerceIn(0, 191)
        return touchPoint
    }
}
