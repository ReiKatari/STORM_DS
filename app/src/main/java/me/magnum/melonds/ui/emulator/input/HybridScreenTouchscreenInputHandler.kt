package me.magnum.melonds.ui.emulator.input

import android.annotation.SuppressLint
import android.view.MotionEvent
import android.view.View
import me.magnum.melonds.MelonEmulator.onScreenRelease
import me.magnum.melonds.domain.model.Input
import me.magnum.melonds.domain.model.Point

class HybridScreenTouchscreenInputHandler(inputListener: IInputListener) : BaseInputHandler(inputListener) {
    private val touchPoint = Point()
    private var touchActive = false
    private var activePointerId = MotionEvent.INVALID_POINTER_ID

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouch(v: View, event: MotionEvent): Boolean {
        val bottomScreenTop = v.height / 2f
        val width = if (v.width > 0) v.width else 1
        val height = if (v.height > 0) v.height else 1

        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN -> {
                val actionIndex = event.actionIndex
                if (event.getY(actionIndex) >= bottomScreenTop) {
                    activePointerId = event.getPointerId(actionIndex)
                    touchActive = true
                    inputListener.onKeyPress(Input.TOUCHSCREEN)
                    inputListener.onTouch(normalizeTouchCoordinates(event, width, height, bottomScreenTop))
                }
            }
            MotionEvent.ACTION_POINTER_DOWN -> {
                val actionIndex = event.actionIndex
                if (event.getY(actionIndex) >= bottomScreenTop) {
                    val pointerId = event.getPointerId(actionIndex)
                    val tool = event.getToolType(actionIndex)
                    if (tool == MotionEvent.TOOL_TYPE_STYLUS || tool == MotionEvent.TOOL_TYPE_ERASER || !touchActive || activePointerId == MotionEvent.INVALID_POINTER_ID) {
                        activePointerId = pointerId
                    }
                    if (!touchActive) {
                        touchActive = true
                        inputListener.onKeyPress(Input.TOUCHSCREEN)
                    }
                    inputListener.onTouch(normalizeTouchCoordinates(event, width, height, bottomScreenTop))
                }
            }
            MotionEvent.ACTION_MOVE -> {
                if (touchActive) {
                    inputListener.onTouch(normalizeTouchCoordinates(event, width, height, bottomScreenTop))
                }
            }
            MotionEvent.ACTION_POINTER_UP -> {
                val actionIndex = event.actionIndex
                val releasedPointerId = event.getPointerId(actionIndex)
                if (activePointerId == releasedPointerId) {
                    val remainingPointerId = findRemainingBestPointerId(event, actionIndex, bottomScreenTop)
                    if (remainingPointerId != MotionEvent.INVALID_POINTER_ID) {
                        activePointerId = remainingPointerId
                        inputListener.onTouch(normalizeTouchCoordinates(event, width, height, bottomScreenTop))
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

    private fun findRemainingBestPointerId(event: MotionEvent, excludeIndex: Int, bottomScreenTop: Float): Int {
        for (i in 0 until event.pointerCount) {
            if (i == excludeIndex) continue
            if (event.getY(i) >= bottomScreenTop) {
                val tool = event.getToolType(i)
                if (tool == MotionEvent.TOOL_TYPE_STYLUS || tool == MotionEvent.TOOL_TYPE_ERASER) {
                    return event.getPointerId(i)
                }
            }
        }
        for (i in 0 until event.pointerCount) {
            if (i != excludeIndex && event.getY(i) >= bottomScreenTop) {
                return event.getPointerId(i)
            }
        }
        return MotionEvent.INVALID_POINTER_ID
    }

    private fun normalizeTouchCoordinates(event: MotionEvent, viewWidth: Int, viewHeight: Int, bottomScreenTop: Float): Point {
        val pointerIndex = if (activePointerId != MotionEvent.INVALID_POINTER_ID) {
            val idx = event.findPointerIndex(activePointerId)
            if (idx >= 0 && idx < event.pointerCount) idx else event.actionIndex.coerceIn(0, event.pointerCount - 1)
        } else {
            event.actionIndex.coerceIn(0, event.pointerCount - 1)
        }

        val touchX = event.getX(pointerIndex)
        val touchY = event.getY(pointerIndex)

        val safeWidth = if (viewWidth > 0) viewWidth.toFloat() else 256f
        val bottomScreenHeight = (viewHeight - bottomScreenTop).coerceAtLeast(1f)

        touchPoint.x = ((touchX / safeWidth) * 256f).toInt().coerceIn(0, 255)
        touchPoint.y = (((touchY - bottomScreenTop) / bottomScreenHeight) * 192f).toInt().coerceIn(0, 191)
        return touchPoint
    }
}
