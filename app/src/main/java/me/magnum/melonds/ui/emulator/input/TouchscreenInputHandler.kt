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
        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN -> {
                touchActive = true
                activePointerId = findBestPointerId(event)
                inputListener.onKeyPress(Input.TOUCHSCREEN)
                inputListener.onTouch(normalizeTouchCoordinates(event, v.width, v.height))
            }
            MotionEvent.ACTION_POINTER_DOWN -> {
                val bestId = findBestPointerId(event)
                activePointerId = bestId
                if (touchActive) {
                    inputListener.onTouch(normalizeTouchCoordinates(event, v.width, v.height))
                } else {
                    touchActive = true
                    inputListener.onKeyPress(Input.TOUCHSCREEN)
                    inputListener.onTouch(normalizeTouchCoordinates(event, v.width, v.height))
                }
            }
            MotionEvent.ACTION_MOVE -> {
                if (touchActive) {
                    inputListener.onTouch(normalizeTouchCoordinates(event, v.width, v.height))
                }
            }
            MotionEvent.ACTION_POINTER_UP -> {
                val actionIndex = event.actionIndex
                val releasedPointerId = event.getPointerId(actionIndex)
                if (activePointerId == releasedPointerId) {
                    val remainingCount = event.pointerCount - 1
                    if (remainingCount > 0) {
                        activePointerId = findRemainingBestPointerId(event, actionIndex)
                        inputListener.onTouch(normalizeTouchCoordinates(event, v.width, v.height))
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

    private fun findBestPointerId(event: MotionEvent): Int {
        for (i in 0 until event.pointerCount) {
            val tool = event.getToolType(i)
            if (tool == MotionEvent.TOOL_TYPE_STYLUS || tool == MotionEvent.TOOL_TYPE_ERASER) {
                return event.getPointerId(i)
            }
        }
        return event.getPointerId(event.actionIndex)
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
        var touchX = 0f
        var touchY = 0f

        var stylusIndex = -1
        for (i in 0 until event.pointerCount) {
            val tool = event.getToolType(i)
            if (tool == MotionEvent.TOOL_TYPE_STYLUS || tool == MotionEvent.TOOL_TYPE_ERASER) {
                stylusIndex = i
                break
            }
        }

        if (stylusIndex != -1) {
            touchX = event.getX(stylusIndex)
            touchY = event.getY(stylusIndex)
        } else {
            val pointerIndex = if (activePointerId != MotionEvent.INVALID_POINTER_ID) {
                event.findPointerIndex(activePointerId).takeIf { it >= 0 } ?: 0
            } else {
                0
            }
            touchX = event.getX(pointerIndex)
            touchY = event.getY(pointerIndex)
        }

        val rect = viewRectProvider?.invoke()
        if (rect == null || rect.width() <= 0f || rect.height() <= 0f) {
            touchPoint.x = (touchX / viewWidth * 256).toInt().coerceIn(0, 255)
            touchPoint.y = (touchY / viewHeight * 192).toInt().coerceIn(0, 191)
            return touchPoint
        }

        val normalizedX = ((touchX - rect.left) / rect.width() * 256f)
        val normalizedY = ((touchY - rect.top) / rect.height() * 192f)

        touchPoint.x = normalizedX.toInt().coerceIn(0, 255)
        touchPoint.y = normalizedY.toInt().coerceIn(0, 191)
        return touchPoint
    }
}
