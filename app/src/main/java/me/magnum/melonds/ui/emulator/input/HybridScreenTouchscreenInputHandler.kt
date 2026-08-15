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

        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN -> {
                val bestId = findBestPointerId(event, bottomScreenTop)
                if (bestId != MotionEvent.INVALID_POINTER_ID) {
                    touchActive = true
                    activePointerId = bestId
                    inputListener.onKeyPress(Input.TOUCHSCREEN)
                    inputListener.onTouch(normalizeTouchCoordinates(event, v.width, v.height, bottomScreenTop))
                }
            }
            MotionEvent.ACTION_POINTER_DOWN -> {
                val bestId = findBestPointerId(event, bottomScreenTop)
                if (bestId != MotionEvent.INVALID_POINTER_ID) {
                    activePointerId = bestId
                    if (touchActive) {
                        inputListener.onTouch(normalizeTouchCoordinates(event, v.width, v.height, bottomScreenTop))
                    } else {
                        touchActive = true
                        inputListener.onKeyPress(Input.TOUCHSCREEN)
                        inputListener.onTouch(normalizeTouchCoordinates(event, v.width, v.height, bottomScreenTop))
                    }
                }
            }
            MotionEvent.ACTION_MOVE -> {
                if (touchActive) {
                    inputListener.onTouch(normalizeTouchCoordinates(event, v.width, v.height, bottomScreenTop))
                }
            }
            MotionEvent.ACTION_POINTER_UP -> {
                val actionIndex = event.actionIndex
                val releasedPointerId = event.getPointerId(actionIndex)
                if (activePointerId == releasedPointerId) {
                    val remainingCount = event.pointerCount - 1
                    if (remainingCount > 0) {
                        activePointerId = findRemainingBestPointerId(event, actionIndex, bottomScreenTop)
                        if (activePointerId != MotionEvent.INVALID_POINTER_ID) {
                            inputListener.onTouch(normalizeTouchCoordinates(event, v.width, v.height, bottomScreenTop))
                        } else {
                            endTouch()
                        }
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

    private fun findBestPointerId(event: MotionEvent, bottomScreenTop: Float): Int {
        for (i in 0 until event.pointerCount) {
            if (event.getY(i) >= bottomScreenTop) {
                val tool = event.getToolType(i)
                if (tool == MotionEvent.TOOL_TYPE_STYLUS || tool == MotionEvent.TOOL_TYPE_ERASER) {
                    return event.getPointerId(i)
                }
            }
        }
        for (i in 0 until event.pointerCount) {
            if (event.getY(i) >= bottomScreenTop) {
                return event.getPointerId(i)
            }
        }
        return MotionEvent.INVALID_POINTER_ID
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
        var touchX = 0f
        var touchY = bottomScreenTop

        var stylusIndex = -1
        for (i in 0 until event.pointerCount) {
            if (event.getY(i) >= bottomScreenTop) {
                val tool = event.getToolType(i)
                if (tool == MotionEvent.TOOL_TYPE_STYLUS || tool == MotionEvent.TOOL_TYPE_ERASER) {
                    stylusIndex = i
                    break
                }
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

        val bottomScreenHeight = (viewHeight - bottomScreenTop).coerceAtLeast(1f)
        touchPoint.x = (touchX / viewWidth * 256f).toInt().coerceIn(0, 255)
        touchPoint.y = ((touchY - bottomScreenTop) / bottomScreenHeight * 192f).toInt().coerceIn(0, 191)
        return touchPoint
    }
}
