package me.magnum.melonds.ui.emulator.input

import android.annotation.SuppressLint
import android.view.MotionEvent
import android.view.View
import me.magnum.melonds.MelonEmulator.onScreenRelease
import me.magnum.melonds.domain.model.Input
import me.magnum.melonds.domain.model.Point
import kotlin.math.roundToInt

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
            MotionEvent.ACTION_DOWN, MotionEvent.ACTION_POINTER_DOWN -> {
                v.parent?.requestDisallowInterceptTouchEvent(true)
                val pointerIndex = getBestPointerIndex(event, bottomScreenTop)
                if (pointerIndex != -1 && event.getY(pointerIndex) >= bottomScreenTop) {
                    activePointerId = event.getPointerId(pointerIndex)
                    if (!touchActive) {
                        touchActive = true
                        inputListener.onKeyPress(Input.TOUCHSCREEN)
                        val tool = event.getToolType(pointerIndex)
                        if (tool == MotionEvent.TOOL_TYPE_STYLUS || tool == MotionEvent.TOOL_TYPE_ERASER) {
                            StylusHapticHelper.performStylusClick(v)
                        }
                    }
                    val rawX = event.getX(pointerIndex)
                    val rawY = event.getY(pointerIndex)
                    inputListener.onTouch(mapRawCoordsToDsPoint(rawX, rawY, width, height, bottomScreenTop))
                }
            }
            MotionEvent.ACTION_MOVE -> {
                v.parent?.requestDisallowInterceptTouchEvent(true)
                if (touchActive) {
                    val pointerIndex = getBestPointerIndex(event, bottomScreenTop)
                    if (pointerIndex != -1) {
                        activePointerId = event.getPointerId(pointerIndex)

                        // Process high-frequency historical digitizer samples (120Hz/240Hz/480Hz)
                        val historySize = event.historySize
                        for (h in 0 until historySize) {
                            val histX = event.getHistoricalX(pointerIndex, h)
                            val histY = event.getHistoricalY(pointerIndex, h)
                            inputListener.onTouch(mapRawCoordsToDsPoint(histX, histY, width, height, bottomScreenTop))
                        }

                        val rawX = event.getX(pointerIndex)
                        val rawY = event.getY(pointerIndex)
                        inputListener.onTouch(mapRawCoordsToDsPoint(rawX, rawY, width, height, bottomScreenTop))
                    }
                }
            }
            MotionEvent.ACTION_POINTER_UP -> {
                val actionIndex = event.actionIndex
                val releasedPointerId = event.getPointerId(actionIndex)
                if (activePointerId == releasedPointerId) {
                    val remainingPointerIndex = findRemainingBestPointerIndex(event, actionIndex, bottomScreenTop)
                    if (remainingPointerIndex != -1) {
                        activePointerId = event.getPointerId(remainingPointerIndex)
                        val rawX = event.getX(remainingPointerIndex)
                        val rawY = event.getY(remainingPointerIndex)
                        inputListener.onTouch(mapRawCoordsToDsPoint(rawX, rawY, width, height, bottomScreenTop))
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

    private fun getBestPointerIndex(event: MotionEvent, bottomScreenTop: Float): Int {
        // Priority 1: Stylus or Eraser tool on bottom screen (Palm Rejection)
        for (i in 0 until event.pointerCount) {
            if (event.getY(i) >= bottomScreenTop) {
                val tool = event.getToolType(i)
                if (tool == MotionEvent.TOOL_TYPE_STYLUS || tool == MotionEvent.TOOL_TYPE_ERASER) {
                    return i
                }
            }
        }
        // Priority 2: Existing active pointer if still valid
        if (activePointerId != MotionEvent.INVALID_POINTER_ID) {
            val idx = event.findPointerIndex(activePointerId)
            if (idx >= 0 && idx < event.pointerCount && event.getY(idx) >= bottomScreenTop) {
                return idx
            }
        }
        // Priority 3: First valid pointer on bottom screen
        for (i in 0 until event.pointerCount) {
            if (event.getY(i) >= bottomScreenTop) {
                return i
            }
        }
        return -1
    }

    private fun findRemainingBestPointerIndex(event: MotionEvent, excludeIndex: Int, bottomScreenTop: Float): Int {
        for (i in 0 until event.pointerCount) {
            if (i == excludeIndex) continue
            if (event.getY(i) >= bottomScreenTop) {
                val tool = event.getToolType(i)
                if (tool == MotionEvent.TOOL_TYPE_STYLUS || tool == MotionEvent.TOOL_TYPE_ERASER) {
                    return i
                }
            }
        }
        for (i in 0 until event.pointerCount) {
            if (i != excludeIndex && event.getY(i) >= bottomScreenTop) {
                return i
            }
        }
        return -1
    }

    private fun mapRawCoordsToDsPoint(rawX: Float, rawY: Float, viewWidth: Int, viewHeight: Int, bottomScreenTop: Float): Point {
        val safeWidth = if (viewWidth > 0) viewWidth.toFloat() else 256f
        val bottomScreenHeight = (viewHeight - bottomScreenTop).coerceAtLeast(1f)

        touchPoint.x = ((rawX / safeWidth) * 256f).roundToInt().coerceIn(0, 255)
        touchPoint.y = (((rawY - bottomScreenTop) / bottomScreenHeight) * 192f).roundToInt().coerceIn(0, 191)
        return touchPoint
    }
}
