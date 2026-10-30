package me.magnum.melonds.ui.layouteditor

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.DashPathEffect
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.GestureDetector
import android.view.HapticFeedbackConstants
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.*
import me.magnum.melonds.domain.model.layout.LayoutComponent
import me.magnum.melonds.domain.model.layout.PositionedLayoutComponent
import me.magnum.melonds.domain.model.layout.UILayout
import me.magnum.melonds.impl.dpToPixels
import me.magnum.melonds.ui.common.LayoutComponentView
import me.magnum.melonds.ui.common.LayoutView
import me.magnum.melonds.ui.common.views.IAnimatedInputView
import me.magnum.melonds.ui.layouteditor.model.LayoutComponentPositionEditorState
import me.magnum.melonds.ui.layouteditor.model.LayoutTarget
import kotlin.math.*

typealias ViewSelectedListener = (
    view: LayoutComponentView,
    widthScale: Float,
    heightScale: Float,
    maxWidth: Int,
    maxHeight: Int,
    minSize: Int
) -> Unit

class LayoutEditorView(context: Context, attrs: AttributeSet?) : LayoutView(context, attrs) {
    enum class Anchor {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT
    }

    private var onViewSelectedListener: ViewSelectedListener? = null
    private var onViewDeselectedListener: ((LayoutComponentView) -> Unit)? = null
    private var otherClickListener: OnClickListener? = null
    private val defaultComponentWidth by lazy { context.dpToPixels(140f).toInt() }
    private val minComponentSize by lazy { context.dpToPixels(30f).toInt() }
    private var selectedView: LayoutComponentView? = null
    private var selectedViewAnchor = Anchor.TOP_LEFT
    private var modifiedByUser = false
    private var onLayoutChangedListener: ((List<PositionedLayoutComponent>, Int, Int) -> Unit)? = null
    private var onViewPositionEditRequestedListener: ((LayoutComponentPositionEditorState) -> Unit)? = null

    private val undoStack = java.util.ArrayDeque<List<PositionedLayoutComponent>>()
    private val maxUndoHistory = 25
    private var onUndoAvailabilityChangedListener: ((Boolean) -> Unit)? = null

    var snapToGridEnabled = true
        set(value) {
            field = value
            invalidate()
        }
    var snapGridStepDp = 16f
    var magneticAxisSnapEnabled = true

    private var isDragging = false
    private var isSnappedToCenterX = false
    private var isSnappedToCenterY = false

    // Multi-Select Mode state
    var isMultiSelectMode: Boolean = false
        private set
    val multiSelectedViews = mutableSetOf<LayoutComponentView>()
    private val multiSelectInitialPositions = mutableMapOf<LayoutComponentView, Point>()

    // Live Test Mode state
    var isLiveTestMode: Boolean = false
        private set
    private var onLiveTestInputsChangedListener: ((Set<Input>) -> Unit)? = null
    private val liveTestActiveInputs = mutableSetOf<Input>()

    // Paints
    private val activeCenterGuidePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 2.5f
        color = Color.parseColor("#E600E5FF")
        pathEffect = DashPathEffect(floatArrayOf(12f, 8f), 0f)
    }

    private val gridPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 1f
        color = Color.parseColor("#15FFFFFF")
    }

    private val centerGuidePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 1.5f
        color = Color.parseColor("#3300E5FF")
        pathEffect = DashPathEffect(floatArrayOf(10f, 10f), 0f)
    }

    private val lockBadgeBgPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#E612151C")
    }

    private val lockBadgeBorderPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 2f
        color = Color.parseColor("#FFD700")
    }

    private val lockBodyPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#FFD700")
    }

    private val lockShacklePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 2f
        color = Color.parseColor("#FFD700")
    }

    private val multiSelectBorderPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 3f
        color = Color.parseColor("#00E5FF")
    }

    var safeAreaInsets: android.graphics.Rect = android.graphics.Rect(0, 0, 0, 0)
        set(value) {
            field = value
            invalidate()
        }

    init {
        setWillNotDraw(false)
        super.setOnClickListener {
            if (isLiveTestMode) return@setOnClickListener
            if (isMultiSelectMode) {
                // Clicking canvas in multi-select mode keeps selection or can be ignored
            } else if (selectedView != null) {
                deselectCurrentView()
            } else {
                otherClickListener?.onClick(it)
            }
        }
    }

    fun setOnUndoAvailabilityChangedListener(listener: ((Boolean) -> Unit)?) {
        onUndoAvailabilityChangedListener = listener
        listener?.invoke(canUndo())
    }

    fun canUndo(): Boolean = undoStack.isNotEmpty()

    fun pushUndoSnapshot() {
        val currentSnapshot = buildCurrentLayout()
        if (currentSnapshot.isEmpty()) return
        if (undoStack.size >= maxUndoHistory) {
            undoStack.removeFirst()
        }
        undoStack.addLast(currentSnapshot)
        onUndoAvailabilityChangedListener?.invoke(true)
    }

    fun undo(): Boolean {
        if (undoStack.isEmpty()) return false
        val previousState = undoStack.removeLast()
        applySnapshot(previousState)
        onUndoAvailabilityChangedListener?.invoke(canUndo())
        return true
    }

    fun applySnapshot(components: List<PositionedLayoutComponent>) {
        deselectCurrentView()
        destroyLayout()
        val screens = components.filter { it.isScreen() }.sortedBy { if (it.onTop) 0 else 1 }
        val others = components.filterNot { it.isScreen() }
        (screens + others).forEach {
            views[it.component] = addPositionedLayoutComponent(it)
        }
        modifiedByUser = true
        notifyLayoutChanged()
        invalidate()
    }

    override fun onDraw(canvas: Canvas) {
        if (isLiveTestMode) return
        super.onDraw(canvas)
        val w = width.toFloat()
        val h = height.toFloat()
        if (w <= 0 || h <= 0) return

        // Draw center guidelines
        val cx = w / 2f
        val cy = h / 2f
        if (isDragging && isSnappedToCenterX) {
            canvas.drawLine(cx, 0f, cx, h, activeCenterGuidePaint)
        } else {
            canvas.drawLine(cx, 0f, cx, h, centerGuidePaint)
        }

        if (isDragging && isSnappedToCenterY) {
            canvas.drawLine(0f, cy, w, cy, activeCenterGuidePaint)
        } else {
            canvas.drawLine(0f, cy, w, cy, centerGuidePaint)
        }

        // Draw alignment grid
        val step = context.dpToPixels(if (snapToGridEnabled) snapGridStepDp else 32f)
        if (step > 0) {
            var x = step
            while (x < w) {
                if (Math.abs(x - cx) > 4f) {
                    canvas.drawLine(x, 0f, x, h, gridPaint)
                }
                x += step
            }
            var y = step
            while (y < h) {
                if (Math.abs(y - cy) > 4f) {
                    canvas.drawLine(0f, y, w, y, gridPaint)
                }
                y += step
            }
        }
    }

    override fun dispatchDraw(canvas: Canvas) {
        super.dispatchDraw(canvas)
        if (isLiveTestMode) return

        // Draw badges and selection overlays on top of child components
        views.values.forEach { compView ->
            val rect = compView.getRect()

            // 1. Locked element badge
            if (compView.locked) {
                val badgeRadius = context.dpToPixels(12f)
                val bx = (rect.x + rect.width - badgeRadius - context.dpToPixels(4f)).toFloat()
                val by = (rect.y + badgeRadius + context.dpToPixels(4f)).toFloat()
                canvas.drawCircle(bx, by, badgeRadius, lockBadgeBgPaint)
                canvas.drawCircle(bx, by, badgeRadius, lockBadgeBorderPaint)

                // Lock body and shackle
                val bodyW = context.dpToPixels(8f)
                val bodyH = context.dpToPixels(6f)
                val bodyRect = RectF(bx - bodyW / 2f, by - bodyH / 4f, bx + bodyW / 2f, by + bodyH * 0.75f)
                canvas.drawRoundRect(bodyRect, 2f, 2f, lockBodyPaint)
                val shackleRect = RectF(bx - bodyW * 0.35f, by - bodyH * 0.9f, bx + bodyW * 0.35f, by - bodyH / 4f)
                canvas.drawArc(shackleRect, 180f, 180f, false, lockShacklePaint)
            }

            // 2. Multi-select highlight outline
            if (isMultiSelectMode && compView in multiSelectedViews) {
                val selRect = RectF(
                    rect.x.toFloat(),
                    rect.y.toFloat(),
                    (rect.x + rect.width).toFloat(),
                    (rect.y + rect.height).toFloat()
                )
                canvas.drawRoundRect(selRect, context.dpToPixels(8f), context.dpToPixels(8f), multiSelectBorderPaint)
            }
        }
    }

    override fun instantiateLayout(layoutConfiguration: UILayout, layoutTarget: LayoutTarget) {
        selectedView = null
        if (isMultiSelectMode) setMultiSelectMode(false)
        if (isLiveTestMode) stopLiveTest()
        super.instantiateLayout(layoutConfiguration, layoutTarget)
        if (width > 0 && height > 0) {
            clampComponentsToCanvasBounds(width, height, 0, 0)
        }
        modifiedByUser = false
        undoStack.clear()
        onUndoAvailabilityChangedListener?.invoke(false)
        notifyLayoutChanged()
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        if (w > 0 && h > 0) {
            clampComponentsToCanvasBounds(w, h, oldw, oldh)
            notifyLayoutChanged()
        }
    }

    private fun clampComponentsToCanvasBounds(w: Int, h: Int, oldw: Int, oldh: Int) {
        val shouldScale = oldw > 0 && oldh > 0 && (oldw != w || oldh != h)
        val scaleX = if (shouldScale) w.toFloat() / oldw else 1f
        val scaleY = if (shouldScale) h.toFloat() / oldh else 1f

        views.values.forEach { compView ->
            val rect = compView.getRect()
            val compWidth = rect.width.coerceIn(minComponentSize, w)
            val compHeight = rect.height.coerceIn(minComponentSize, h)
            val maxX = (w - compWidth).coerceAtLeast(0)
            val maxY = (h - compHeight).coerceAtLeast(0)

            val newX = if (shouldScale && !compView.component.isScreen()) {
                (rect.x * scaleX).toInt()
            } else {
                rect.x
            }
            val newY = if (shouldScale && !compView.component.isScreen()) {
                (rect.y * scaleY).toInt()
            } else {
                rect.y
            }

            val clampedX = newX.coerceIn(0, maxX)
            val clampedY = newY.coerceIn(0, maxY)

            if (clampedX != rect.x || clampedY != rect.y) {
                compView.setPosition(Point(clampedX, clampedY))
            }
        }
    }

    fun destroyEditorLayout() {
        super.destroyLayout()
        notifyLayoutChanged()
    }

    fun setOnViewSelectedListener(listener: ViewSelectedListener) {
        onViewSelectedListener = listener
    }

    fun setOnViewDeselectedListener(listener: (LayoutComponentView) -> Unit) {
        onViewDeselectedListener = listener
    }

    fun setOnLayoutChangedListener(listener: ((List<PositionedLayoutComponent>, Int, Int) -> Unit)?) {
        onLayoutChangedListener = listener
    }

    fun setOnViewPositionEditRequestedListener(listener: ((LayoutComponentPositionEditorState) -> Unit)?) {
        onViewPositionEditRequestedListener = listener
    }

    fun getSelectedComponent(): LayoutComponent? {
        return selectedView?.component
    }

    fun getSelectedComponentView(): LayoutComponentView? {
        return selectedView
    }

    fun setSelectedViewLocked(locked: Boolean) {
        selectedView?.let {
            pushUndoSnapshot()
            it.locked = locked
            modifiedByUser = true
            notifyLayoutChanged()
            invalidate()
        }
    }

    fun selectComponent(component: LayoutComponent): Boolean {
        val componentView = views[component] ?: return false
        selectView(componentView)
        componentView.view.alpha = 1f
        componentView.setHighlighted(true)
        return true
    }

    fun addLayoutComponent(component: LayoutComponent) {
        pushUndoSnapshot()
        val baseWidth = when (component) {
            LayoutComponent.DPAD, LayoutComponent.BUTTONS -> context.dpToPixels(140f).toInt()
            LayoutComponent.BUTTON_L, LayoutComponent.BUTTON_R -> context.dpToPixels(56f).toInt()
            LayoutComponent.BUTTON_SELECT, LayoutComponent.BUTTON_START -> context.dpToPixels(54f).toInt()
            LayoutComponent.TOP_SCREEN, LayoutComponent.BOTTOM_SCREEN -> (width * 0.5f).toInt().coerceAtLeast(defaultComponentWidth)
            else -> context.dpToPixels(40f).toInt()
        }
        val componentBuilder = viewBuilderFactory.getLayoutComponentViewBuilder(component)
        val componentHeight = (baseWidth / componentBuilder.getAspectRatio()).toInt().coerceAtLeast(minComponentSize)
        val startX = ((width - baseWidth) / 2).coerceAtLeast(0)
        val startY = ((height - componentHeight) / 2).coerceAtLeast(0)
        val componentView = addPositionedLayoutComponent(PositionedLayoutComponent(Rect(startX, startY, baseWidth, componentHeight), component))
        views[component] = componentView
        modifiedByUser = true
        notifyLayoutChanged()
    }

    fun isModifiedByUser(): Boolean {
        return modifiedByUser
    }

    fun resetModifiedState() {
        modifiedByUser = false
    }

    fun buildCurrentLayout(): List<PositionedLayoutComponent> {
        return views.values.map {
            PositionedLayoutComponent(it.getRect(), it.component, it.baseAlpha, it.onTop, it.locked)
        }
    }

    fun handleKeyDown(event: KeyEvent): Boolean {
        val currentlySelectedView = selectedView ?: return false
        if (currentlySelectedView.locked) return false

        val stepX = (width / 100f).coerceAtLeast(3f)
        val stepY = (height / 100f).coerceAtLeast(3f)
        when (event.keyCode) {
            KeyEvent.KEYCODE_DPAD_UP -> dragView(currentlySelectedView, 0f, -stepY)
            KeyEvent.KEYCODE_DPAD_DOWN -> dragView(currentlySelectedView, 0f, stepY)
            KeyEvent.KEYCODE_DPAD_LEFT -> dragView(currentlySelectedView, -stepX, 0f)
            KeyEvent.KEYCODE_DPAD_RIGHT -> dragView(currentlySelectedView, stepX, 0f)
            else -> return false
        }

        return true
    }

    fun hasSelectedComponent(): Boolean = selectedView != null

    fun deselectComponent() {
        deselectCurrentView()
    }

    fun cycleSelectedComponent(forward: Boolean): Boolean {
        val ordered = views.values.toList()
        if (ordered.isEmpty()) {
            return false
        }

        val currentIndex = selectedView?.let { ordered.indexOf(it) } ?: -1
        val nextIndex = when {
            currentIndex < 0 -> if (forward) 0 else ordered.lastIndex
            else -> ((currentIndex + if (forward) 1 else -1) + ordered.size) % ordered.size
        }
        val next = ordered[nextIndex]

        selectedView?.takeIf { it != next }?.let {
            it.view.alpha = 0.5f
            it.setHighlighted(false)
        }
        selectView(next)
        next.view.alpha = 1f
        next.setHighlighted(true)
        return true
    }

    override fun setOnClickListener(l: OnClickListener?) {
        otherClickListener = l
    }

    override fun onLayoutComponentViewAdded(layoutComponentView: LayoutComponentView) {
        super.onLayoutComponentViewAdded(layoutComponentView)
        setupDragHandler(layoutComponentView)
        layoutComponentView.view.alpha = 0.5f
        layoutComponentView.setHighlighted(false)
    }

    private fun setupDragHandler(layoutComponentView: LayoutComponentView) {
        val gestureDetector = GestureDetector(context, object : GestureDetector.SimpleOnGestureListener() {
            override fun onDown(e: MotionEvent): Boolean {
                return true
            }

            override fun onSingleTapUp(e: MotionEvent): Boolean {
                if (isMultiSelectMode || isLiveTestMode) return true
                selectView(layoutComponentView)
                layoutComponentView.view.performClick()
                return true
            }

            override fun onDoubleTap(e: MotionEvent): Boolean {
                if (isMultiSelectMode || isLiveTestMode) return true
                selectView(layoutComponentView)
                onViewPositionEditRequestedListener?.invoke(buildPositionEditorState(layoutComponentView))
                layoutComponentView.view.performClick()
                return true
            }
        })

        layoutComponentView.view.setOnTouchListener(object : OnTouchListener {
            private var dragging = false
            private var downOffsetX = -1f
            private var downOffsetY = -1f

            override fun onTouch(view: View?, motionEvent: MotionEvent?): Boolean {
                if (view == null || motionEvent == null) return false
                if (isLiveTestMode) return false

                if (isMultiSelectMode) {
                    when (motionEvent.action) {
                        MotionEvent.ACTION_DOWN -> {
                            if (layoutComponentView.locked) {
                                Toast.makeText(context, R.string.layout_editor_component_locked_toast, Toast.LENGTH_SHORT).show()
                                return true
                            }
                            downOffsetX = motionEvent.x
                            downOffsetY = motionEvent.y
                            if (layoutComponentView !in multiSelectedViews) {
                                multiSelectedViews.add(layoutComponentView)
                                layoutComponentView.setHighlighted(true)
                                layoutComponentView.view.alpha = 1f
                                invalidate()
                            }
                            return true
                        }
                        MotionEvent.ACTION_MOVE -> {
                            if (layoutComponentView in multiSelectedViews) {
                                val distance = sqrt((motionEvent.x - downOffsetX).pow(2f) + (motionEvent.y - downOffsetY).pow(2f))
                                if (!dragging) {
                                    if (distance >= 20) {
                                        pushUndoSnapshot()
                                        dragging = true
                                        isDragging = true
                                        multiSelectInitialPositions.clear()
                                        multiSelectedViews.forEach { v ->
                                            multiSelectInitialPositions[v] = v.getPosition()
                                        }
                                    }
                                } else {
                                    val totalDx = motionEvent.x - downOffsetX
                                    val totalDy = motionEvent.y - downOffsetY
                                    dragMultiSelectGroup(totalDx, totalDy)
                                }
                            }
                            return true
                        }
                        MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                            if (dragging) {
                                dragging = false
                                isDragging = false
                                invalidate()
                            } else if (motionEvent.action == MotionEvent.ACTION_UP) {
                                val distance = sqrt((motionEvent.x - downOffsetX).pow(2f) + (motionEvent.y - downOffsetY).pow(2f))
                                if (distance < 20 && layoutComponentView in multiSelectedViews) {
                                    // Tap to toggle out of group
                                    multiSelectedViews.remove(layoutComponentView)
                                    layoutComponentView.setHighlighted(false)
                                    layoutComponentView.view.alpha = 0.5f
                                    invalidate()
                                }
                            }
                            return true
                        }
                    }
                    return false
                }

                // Normal Edit Mode
                return when (motionEvent.action) {
                    MotionEvent.ACTION_DOWN -> {
                        if (layoutComponentView.locked) {
                            if (selectedView != null && selectedView != layoutComponentView) {
                                deselectCurrentView()
                            }
                            selectView(layoutComponentView)
                            downOffsetX = motionEvent.x
                            downOffsetY = motionEvent.y
                            layoutComponentView.view.performClick()
                            return true
                        }
                        if (selectedView != null && selectedView != layoutComponentView) {
                            deselectCurrentView()
                        }
                        downOffsetX = motionEvent.x
                        downOffsetY = motionEvent.y
                        view.alpha = 1f
                        layoutComponentView.setHighlighted(true)
                        gestureDetector.onTouchEvent(motionEvent)
                        true
                    }
                    MotionEvent.ACTION_MOVE -> {
                        if (layoutComponentView.locked) {
                            return true
                        }
                        if (!dragging) {
                            val distance = sqrt((motionEvent.x - downOffsetX).pow(2f) + (motionEvent.y - downOffsetY).pow(2f))
                            if (distance >= 25) {
                                pushUndoSnapshot()
                                dragging = true
                                isDragging = true
                            }
                        } else {
                            dragView(layoutComponentView, motionEvent.x - downOffsetX, motionEvent.y - downOffsetY)
                        }
                        gestureDetector.onTouchEvent(motionEvent)
                        true
                    }
                    MotionEvent.ACTION_CANCEL -> {
                        gestureDetector.onTouchEvent(motionEvent)
                        if (dragging) {
                            view.alpha = 0.5f
                            layoutComponentView.setHighlighted(false)
                            dragging = false
                            isDragging = false
                            isSnappedToCenterX = false
                            isSnappedToCenterY = false
                            invalidate()
                        }
                        true
                    }
                    MotionEvent.ACTION_UP -> {
                        val gestureHandled = if (!dragging) {
                            gestureDetector.onTouchEvent(motionEvent)
                        } else {
                            false
                        }
                        if (dragging) {
                            view.alpha = 0.5f
                            layoutComponentView.setHighlighted(false)
                            dragging = false
                            isDragging = false
                            isSnappedToCenterX = false
                            isSnappedToCenterY = false
                            invalidate()
                        } else if (!gestureHandled) {
                            selectView(layoutComponentView)
                            view.performClick()
                        }
                        true
                    }
                    else -> false
                }
            }
        })
    }

    private fun dragMultiSelectGroup(totalDx: Float, totalDy: Float) {
        multiSelectedViews.forEach { v ->
            val init = multiSelectInitialPositions[v] ?: return@forEach
            val minX = 0
            val maxX = max(0, width - v.getWidth())
            val minY = 0
            val maxY = max(0, height - v.getHeight())
            val newX = (init.x + totalDx).toInt().coerceIn(minX, maxX)
            val newY = (init.y + totalDy).toInt().coerceIn(minY, maxY)
            v.setPosition(Point(newX, newY))
        }
        modifiedByUser = true
        notifyLayoutChanged()
        invalidate()
    }

    fun setMultiSelectMode(enabled: Boolean) {
        if (isMultiSelectMode == enabled) return
        if (enabled) {
            deselectCurrentView()
            isMultiSelectMode = true
            multiSelectedViews.clear()
        } else {
            isMultiSelectMode = false
            multiSelectedViews.forEach {
                it.setHighlighted(false)
                it.view.alpha = 0.5f
            }
            multiSelectedViews.clear()
        }
        invalidate()
    }

    // Live Test Mode engine
    fun startLiveTest(onInputsChanged: (Set<Input>) -> Unit) {
        deselectCurrentView()
        if (isMultiSelectMode) {
            setMultiSelectMode(false)
        }
        isLiveTestMode = true
        onLiveTestInputsChangedListener = onInputsChanged
        liveTestActiveInputs.clear()
        onInputsChanged(emptySet())

        views.values.forEach { compView ->
            compView.view.alpha = compView.baseAlpha
            compView.setHighlighted(false)
            attachLiveTestTouchListener(compView)
        }
        invalidate()
    }

    fun stopLiveTest() {
        if (!isLiveTestMode) return
        isLiveTestMode = false
        liveTestActiveInputs.clear()
        onLiveTestInputsChangedListener?.invoke(emptySet())
        onLiveTestInputsChangedListener = null

        views.values.forEach { compView ->
            compView.view.alpha = 0.5f
            compView.setHighlighted(false)
            (compView.view as? IAnimatedInputView)?.updatePressedInputs(emptySet())
            setupDragHandler(compView)
        }
        invalidate()
    }

    private fun attachLiveTestTouchListener(compView: LayoutComponentView) {
        val component = compView.component
        compView.view.setOnTouchListener { v, event ->
            if (!isLiveTestMode) return@setOnTouchListener false

            when (component) {
                LayoutComponent.BUTTONS -> handleLiveTestButtons(v, event)
                LayoutComponent.DPAD -> handleLiveTestDpad(v, event)
                else -> handleLiveTestSingleButton(v, event, component)
            }
            true
        }
    }

    private fun handleLiveTestButtons(v: View, event: MotionEvent) {
        val w = v.width.toFloat()
        val h = v.height.toFloat()
        val cx = w / 2f
        val cy = h / 2f
        val size = min(w, h)
        val offset = size * 0.285f
        val buttonRadius = size * 0.175f * 1.25f

        val touched = mutableSetOf<Input>()
        val count = event.pointerCount

        if (event.actionMasked != MotionEvent.ACTION_UP && event.actionMasked != MotionEvent.ACTION_CANCEL) {
            for (i in 0 until count) {
                if (event.actionMasked == MotionEvent.ACTION_POINTER_UP && event.actionIndex == i) continue
                val px = event.getX(i)
                val py = event.getY(i)

                if (sqrt((px - cx).pow(2) + (py - (cy - offset)).pow(2)) <= buttonRadius) touched.add(Input.X)
                if (sqrt((px - cx).pow(2) + (py - (cy + offset)).pow(2)) <= buttonRadius) touched.add(Input.B)
                if (sqrt((px - (cx - offset)).pow(2) + (py - cy).pow(2)) <= buttonRadius) touched.add(Input.Y)
                if (sqrt((px - (cx + offset)).pow(2) + (py - cy).pow(2)) <= buttonRadius) touched.add(Input.A)
            }
        }

        val allButtons = setOf(Input.X, Input.B, Input.Y, Input.A)
        val newlyPressed = touched - liveTestActiveInputs
        if (newlyPressed.isNotEmpty()) {
            v.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_TAP)
        }

        liveTestActiveInputs.removeAll(allButtons)
        liveTestActiveInputs.addAll(touched)
        (v as? IAnimatedInputView)?.updatePressedInputs(touched)
        onLiveTestInputsChangedListener?.invoke(liveTestActiveInputs.toSet())
    }

    private fun handleLiveTestDpad(v: View, event: MotionEvent) {
        val w = v.width.toFloat()
        val h = v.height.toFloat()
        val cx = w / 2f
        val cy = h / 2f
        val size = min(w, h)
        val deadzone = size * 0.12f
        val maxDist = size * 0.52f

        val touched = mutableSetOf<Input>()
        val count = event.pointerCount

        if (event.actionMasked != MotionEvent.ACTION_UP && event.actionMasked != MotionEvent.ACTION_CANCEL) {
            for (i in 0 until count) {
                if (event.actionMasked == MotionEvent.ACTION_POINTER_UP && event.actionIndex == i) continue
                val px = event.getX(i)
                val py = event.getY(i)
                val dx = px - cx
                val dy = py - cy
                val dist = sqrt(dx.pow(2) + dy.pow(2))

                if (dist >= deadzone && dist <= maxDist) {
                    val angle = Math.toDegrees(atan2(dy.toDouble(), dx.toDouble())).toFloat()
                    val normalizedAngle = (angle + 360f) % 360f
                    if (normalizedAngle >= 337.5f || normalizedAngle < 22.5f) {
                        touched.add(Input.RIGHT)
                    } else if (normalizedAngle in 22.5f..67.5f) {
                        touched.add(Input.RIGHT)
                        touched.add(Input.DOWN)
                    } else if (normalizedAngle in 67.5f..112.5f) {
                        touched.add(Input.DOWN)
                    } else if (normalizedAngle in 112.5f..157.5f) {
                        touched.add(Input.DOWN)
                        touched.add(Input.LEFT)
                    } else if (normalizedAngle in 157.5f..202.5f) {
                        touched.add(Input.LEFT)
                    } else if (normalizedAngle in 202.5f..247.5f) {
                        touched.add(Input.LEFT)
                        touched.add(Input.UP)
                    } else if (normalizedAngle in 247.5f..292.5f) {
                        touched.add(Input.UP)
                    } else if (normalizedAngle in 292.5f..337.5f) {
                        touched.add(Input.UP)
                        touched.add(Input.RIGHT)
                    }
                }
            }
        }

        val allDpad = setOf(Input.UP, Input.DOWN, Input.LEFT, Input.RIGHT)
        val newlyPressed = touched - liveTestActiveInputs
        if (newlyPressed.isNotEmpty()) {
            v.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_TAP)
        }

        liveTestActiveInputs.removeAll(allDpad)
        liveTestActiveInputs.addAll(touched)
        (v as? IAnimatedInputView)?.updatePressedInputs(touched)
        onLiveTestInputsChangedListener?.invoke(liveTestActiveInputs.toSet())
    }

    private fun handleLiveTestSingleButton(v: View, event: MotionEvent, component: LayoutComponent) {
        val input = componentToInput(component) ?: return
        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN, MotionEvent.ACTION_POINTER_DOWN -> {
                if (input !in liveTestActiveInputs) {
                    v.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_TAP)
                    liveTestActiveInputs.add(input)
                    (v as? IAnimatedInputView)?.updatePressedInputs(setOf(input))
                    onLiveTestInputsChangedListener?.invoke(liveTestActiveInputs.toSet())
                }
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                liveTestActiveInputs.remove(input)
                (v as? IAnimatedInputView)?.updatePressedInputs(emptySet())
                onLiveTestInputsChangedListener?.invoke(liveTestActiveInputs.toSet())
            }
        }
    }

    private fun componentToInput(component: LayoutComponent): Input? {
        return when (component) {
            LayoutComponent.BUTTON_L -> Input.L
            LayoutComponent.BUTTON_R -> Input.R
            LayoutComponent.BUTTON_START -> Input.START
            LayoutComponent.BUTTON_SELECT -> Input.SELECT
            LayoutComponent.BUTTON_PAUSE -> Input.PAUSE
            LayoutComponent.BUTTON_FAST_FORWARD_TOGGLE -> Input.FAST_FORWARD
            LayoutComponent.BUTTON_RESET -> Input.RESET
            LayoutComponent.BUTTON_SWAP_SCREENS -> Input.SWAP_SCREENS
            LayoutComponent.BUTTON_QUICK_SAVE -> Input.QUICK_SAVE
            LayoutComponent.BUTTON_QUICK_LOAD -> Input.QUICK_LOAD
            LayoutComponent.BUTTON_REWIND -> Input.REWIND
            LayoutComponent.BUTTON_TRANSLATE -> Input.TRANSLATE
            LayoutComponent.BUTTON_MICROPHONE_TOGGLE -> Input.MICROPHONE
            LayoutComponent.BUTTON_HINGE -> Input.HINGE
            LayoutComponent.BUTTON_TOGGLE_SOFT_INPUT -> Input.TOGGLE_SOFT_INPUT
            LayoutComponent.BUTTON_LOCK_ROTATION -> Input.LOCK_ROTATION
            LayoutComponent.BUTTON_TOGGLE_EXTRA_BUTTONS -> Input.TOGGLE_EXTRA_BUTTONS
            LayoutComponent.BUTTON_TOGGLE_ANALOG_STICK -> Input.TOGGLE_ANALOG_STICK
            else -> null
        }
    }

    private fun buildPositionEditorState(view: LayoutComponentView): LayoutComponentPositionEditorState {
        val position = view.getPosition()
        return LayoutComponentPositionEditorState(
            component = view.component,
            x = position.x,
            y = position.y,
            maxX = max(width - view.getWidth(), 0),
            maxY = max(height - view.getHeight(), 0),
        )
    }

    private fun selectView(view: LayoutComponentView) {
        val anchorDistances = mutableMapOf<Anchor, Double>()
        anchorDistances[Anchor.TOP_LEFT] = view.getPosition().x.toDouble().pow(2) + view.getPosition().y.toDouble().pow(2)
        anchorDistances[Anchor.TOP_RIGHT] = (width - (view.getPosition().x + view.getWidth())).toDouble().pow(2) + view.getPosition().y.toDouble().pow(2)
        anchorDistances[Anchor.BOTTOM_LEFT] = view.getPosition().x.toDouble().pow(2) + (height - (view.getPosition().y + view.getHeight())).toDouble().pow(2)
        anchorDistances[Anchor.BOTTOM_RIGHT] = (width - (view.getPosition().x + view.getWidth())).toDouble().pow(2) + (height - (view.getPosition().y + view.getHeight())).toDouble().pow(2)

        var anchor = Anchor.TOP_LEFT
        var minDistance = Double.MAX_VALUE
        anchorDistances.keys.forEach {
            if (anchorDistances[it]!! < minDistance) {
                minDistance = anchorDistances[it]!!
                anchor = it
            }
        }

        selectedViewAnchor = anchor
        selectedView = view

        val widthScale = (view.getWidth() - minComponentSize) / (width - minComponentSize).toFloat()
        val heightScale = (view.getHeight() - minComponentSize) / (height - minComponentSize).toFloat()
        onViewSelectedListener?.invoke(view, widthScale, heightScale, width, height, minComponentSize)
    }

    private fun deselectCurrentView() {
        selectedView?.let {
            it.view.alpha = 0.5f
            it.setHighlighted(false)
            onViewDeselectedListener?.invoke(it)
        }
        selectedView = null
    }

    fun deleteSelectedView() {
        val currentlySelectedView = selectedView ?: return
        if (currentlySelectedView.locked) {
            Toast.makeText(context, R.string.layout_editor_component_locked_toast, Toast.LENGTH_SHORT).show()
            return
        }
        pushUndoSnapshot()
        removeView(currentlySelectedView.view)
        views.remove(currentlySelectedView.component)
        deselectCurrentView()
        modifiedByUser = true
        notifyLayoutChanged()
    }

    fun removeLayoutComponent(component: LayoutComponent) {
        val compView = views[component] ?: return
        if (compView.locked) {
            Toast.makeText(context, R.string.layout_editor_component_locked_toast, Toast.LENGTH_SHORT).show()
            return
        }
        pushUndoSnapshot()
        if (selectedView == compView) {
            deselectCurrentView()
        }
        removeView(compView.view)
        views.remove(component)
        modifiedByUser = true
        notifyLayoutChanged()
    }

    private fun dragView(view: LayoutComponentView, offsetX: Float, offsetY: Float) {
        if (view.locked) return

        val currentPosition = view.getPosition()
        val minX = 0f
        val maxX = max(0f, (width - view.getWidth()).toFloat())
        val minY = 0f
        val maxY = max(0f, (height - view.getHeight()).toFloat())

        val rawX = currentPosition.x + offsetX
        val rawY = currentPosition.y + offsetY

        var finalX = rawX
        var finalY = rawY

        val cx = width / 2f
        val cy = height / 2f
        val snapThresholdPx = context.dpToPixels(12f)

        // Center X magnetic axis snap
        val compCenterX = rawX + view.getWidth() / 2f
        if (magneticAxisSnapEnabled && kotlin.math.abs(compCenterX - cx) <= snapThresholdPx) {
            finalX = cx - view.getWidth() / 2f
            isSnappedToCenterX = true
        } else if (snapToGridEnabled) {
            val stepPx = context.dpToPixels(snapGridStepDp).coerceAtLeast(1f)
            finalX = kotlin.math.round(rawX / stepPx) * stepPx
            isSnappedToCenterX = false
        } else {
            isSnappedToCenterX = false
        }

        // Center Y magnetic axis snap
        val compCenterY = rawY + view.getHeight() / 2f
        if (magneticAxisSnapEnabled && kotlin.math.abs(compCenterY - cy) <= snapThresholdPx) {
            finalY = cy - view.getHeight() / 2f
            isSnappedToCenterY = true
        } else if (snapToGridEnabled) {
            val stepPx = context.dpToPixels(snapGridStepDp).coerceAtLeast(1f)
            finalY = kotlin.math.round(rawY / stepPx) * stepPx
            isSnappedToCenterY = false
        } else {
            isSnappedToCenterY = false
        }

        val clampedX = finalX.coerceIn(minX, maxX)
        val clampedY = finalY.coerceIn(minY, maxY)
        view.setPosition(Point(clampedX.toInt(), clampedY.toInt()))
        modifiedByUser = true
        notifyLayoutChanged()
        invalidate()
    }

    fun setSelectedViewAlpha(alpha: Float) {
        selectedView?.let {
            it.baseAlpha = alpha
            modifiedByUser = true
            notifyLayoutChanged()
        }
    }

    fun setSelectedScreenOnTop(onTop: Boolean) {
        selectedView?.let {
            pushUndoSnapshot()
            it.onTop = onTop
            rearrangeScreens()
            modifiedByUser = true
            notifyLayoutChanged()
        }
    }

    fun setSelectedViewPosition(x: Int, y: Int) {
        val currentlySelectedView = selectedView ?: return
        if (currentlySelectedView.locked) return
        setComponentPosition(currentlySelectedView.component, x, y)
    }

    fun setComponentPosition(component: LayoutComponent, x: Int, y: Int): Boolean {
        val view = views[component] ?: return false
        if (view.locked) return false
        val minX = 0
        val maxX = max(0, width - view.getWidth())
        val minY = 0
        val maxY = max(0, height - view.getHeight())
        val boundedX = x.coerceIn(minX, maxX)
        val boundedY = y.coerceIn(minY, maxY)
        view.setPosition(Point(boundedX, boundedY))
        modifiedByUser = true
        notifyLayoutChanged()
        return true
    }

    fun buildComponentPositionEditorState(component: LayoutComponent): LayoutComponentPositionEditorState? {
        val view = views[component] ?: return null
        return buildPositionEditorState(view)
    }

    private fun rearrangeScreens() {
        val topScreen = views[LayoutComponent.TOP_SCREEN]
        val bottomScreen = views[LayoutComponent.BOTTOM_SCREEN]
        if (topScreen != null && bottomScreen != null) {
            removeView(topScreen.view)
            removeView(bottomScreen.view)
            if (topScreen.onTop) {
                addView(bottomScreen.view, 0)
                addView(topScreen.view, 0)
            } else if (bottomScreen.onTop) {
                addView(topScreen.view, 0)
                addView(bottomScreen.view, 0)
            } else {
                addView(bottomScreen.view, 0)
                addView(topScreen.view, 0)
            }
        }
    }

    fun centerSelectedViewHorizontally() {
        val view = selectedView ?: return
        if (view.locked) return
        pushUndoSnapshot()
        val usableWidth = width - safeAreaInsets.left - safeAreaInsets.right
        val centerX = safeAreaInsets.left + (usableWidth - view.getWidth()) / 2
        val position = view.getPosition()
        view.setPosition(Point(centerX, position.y))
        modifiedByUser = true
        notifyLayoutChanged()
    }

    fun centerSelectedViewVertically() {
        val view = selectedView ?: return
        if (view.locked) return
        pushUndoSnapshot()
        val usableHeight = height - safeAreaInsets.top - safeAreaInsets.bottom
        val centerY = safeAreaInsets.top + (usableHeight - view.getHeight()) / 2
        val position = view.getPosition()
        view.setPosition(Point(position.x, centerY))
        modifiedByUser = true
        notifyLayoutChanged()
    }

    fun scaleSelectedView(scale: Float) {
        val currentView = selectedView ?: return
        if (currentView.locked) return
        val currentW = currentView.getWidth().toFloat().coerceAtLeast(minComponentSize.toFloat())
        val currentH = currentView.getHeight().toFloat().coerceAtLeast(minComponentSize.toFloat())
        val ratio = currentW / currentH

        val baseDimension = (min(width, height) - minComponentSize).toFloat().coerceAtLeast(1f)
        val targetH = (baseDimension * scale + minComponentSize).coerceAtLeast(minComponentSize.toFloat())
        val targetW = (targetH * ratio).coerceIn(minComponentSize.toFloat(), (width - minComponentSize).toFloat())

        val widthScale = ((targetW - minComponentSize) / (width - minComponentSize).toFloat()).coerceIn(0f, 1f)
        val heightScale = ((targetH - minComponentSize) / (height - minComponentSize).toFloat()).coerceIn(0f, 1f)

        scaleSelectedView(widthScale, heightScale)
    }

    fun scaleSelectedView(widthScale: Float, heightScale: Float) {
        val currentlySelectedView = selectedView ?: return
        if (currentlySelectedView.locked) return
        scaleComponent(currentlySelectedView.component, widthScale, heightScale, selectedViewAnchor)
    }

    fun scaleComponent(component: LayoutComponent, scale: Float): Boolean {
        val currentView = views[component] ?: return false
        if (currentView.locked) return false
        val currentW = currentView.getWidth().toFloat().coerceAtLeast(minComponentSize.toFloat())
        val currentH = currentView.getHeight().toFloat().coerceAtLeast(minComponentSize.toFloat())
        val ratio = currentW / currentH

        val baseDimension = (min(width, height) - minComponentSize).toFloat().coerceAtLeast(1f)
        val targetH = (baseDimension * scale + minComponentSize).coerceAtLeast(minComponentSize.toFloat())
        val targetW = (targetH * ratio).coerceIn(minComponentSize.toFloat(), (width - minComponentSize).toFloat())

        val widthScale = ((targetW - minComponentSize) / (width - minComponentSize).toFloat()).coerceIn(0f, 1f)
        val heightScale = ((targetH - minComponentSize) / (height - minComponentSize).toFloat()).coerceIn(0f, 1f)

        return scaleComponent(component, widthScale, heightScale)
    }

    fun scaleComponent(component: LayoutComponent, widthScale: Float, heightScale: Float): Boolean {
        return scaleComponent(component, widthScale, heightScale, findAnchor(views[component] ?: return false))
    }

    private fun scaleComponent(
        component: LayoutComponent,
        widthScale: Float,
        heightScale: Float,
        anchor: Anchor,
    ): Boolean {
        val currentlySelectedView = views[component] ?: return false
        if (currentlySelectedView.locked) return false

        val newViewWidth = ((width - minComponentSize) * widthScale + minComponentSize).roundToInt()
        val newViewHeight = ((height - minComponentSize) * heightScale + minComponentSize).roundToInt()

        val viewPosition = currentlySelectedView.getPosition()
        var viewX: Int
        var viewY: Int

        if (anchor == Anchor.TOP_LEFT) {
            viewX = viewPosition.x
            viewY = viewPosition.y
            if (viewX + newViewWidth > width) {
                viewX = width - newViewWidth
            }
            if (viewY + newViewHeight > height) {
                viewY = height - newViewHeight
            }
        } else if (anchor == Anchor.TOP_RIGHT) {
            viewX = viewPosition.x + currentlySelectedView.getWidth() - newViewWidth
            viewY = viewPosition.y
            if (viewX < 0) {
                viewX = 0
            }
            if (viewY + newViewHeight > height) {
                viewY = height - newViewHeight
            }
        } else if (anchor == Anchor.BOTTOM_LEFT) {
            viewX = viewPosition.x
            viewY = viewPosition.y + currentlySelectedView.getHeight() - newViewHeight
            if (viewX + newViewWidth > width) {
                viewX = width - newViewWidth
            }
            if (viewY < 0) {
                viewY = 0
            }
        } else {
            viewX = viewPosition.x + currentlySelectedView.getWidth() - newViewWidth
            viewY = viewPosition.y + currentlySelectedView.getHeight() - newViewHeight
            if (viewX < 0) {
                viewX = 0
            }
            if (viewY < 0) {
                viewY = 0
            }
        }
        currentlySelectedView.setPositionAndSize(Point(viewX, viewY), newViewWidth, newViewHeight)
        modifiedByUser = true
        notifyLayoutChanged()
        return true
    }

    fun releaseComponentEdit(component: LayoutComponent?) {
        val componentView = component?.let { views[it] }
        if (componentView != null && componentView != selectedView) {
            componentView.view.alpha = 0.5f
            componentView.setHighlighted(false)
            onViewDeselectedListener?.invoke(componentView)
        }
        deselectCurrentView()
    }

    private fun findAnchor(view: LayoutComponentView): Anchor {
        val anchorDistances = mutableMapOf<Anchor, Double>()
        anchorDistances[Anchor.TOP_LEFT] = view.getPosition().x.toDouble().pow(2) + view.getPosition().y.toDouble().pow(2)
        anchorDistances[Anchor.TOP_RIGHT] = (width - (view.getPosition().x + view.getWidth())).toDouble().pow(2) + view.getPosition().y.toDouble().pow(2)
        anchorDistances[Anchor.BOTTOM_LEFT] = view.getPosition().x.toDouble().pow(2) + (height - (view.getPosition().y + view.getHeight())).toDouble().pow(2)
        anchorDistances[Anchor.BOTTOM_RIGHT] = (width - (view.getPosition().x + view.getWidth())).toDouble().pow(2) + (height - (view.getPosition().y + view.getHeight())).toDouble().pow(2)

        var anchor = Anchor.TOP_LEFT
        var minDistance = Double.MAX_VALUE
        anchorDistances.keys.forEach {
            if (anchorDistances[it]!! < minDistance) {
                minDistance = anchorDistances[it]!!
                anchor = it
            }
        }

        return anchor
    }

    private fun notifyLayoutChanged() {
        if (width <= 0 || height <= 0) {
            return
        }
        val currentLayout = buildCurrentLayout()
        onLayoutChangedListener?.invoke(currentLayout, width, height)
    }
}
