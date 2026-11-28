package me.magnum.melonds.ui.emulator

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import androidx.core.view.isGone
import androidx.core.view.isVisible
import dagger.hilt.android.AndroidEntryPoint
import me.magnum.melonds.common.vibration.TouchVibrator
import me.magnum.melonds.domain.model.Input
import me.magnum.melonds.domain.model.input.SoftInputBehaviour
import me.magnum.melonds.domain.model.layout.LayoutComponent
import me.magnum.melonds.ui.common.LayoutView
import me.magnum.melonds.ui.emulator.input.ButtonsInputHandler
import me.magnum.melonds.ui.emulator.input.DpadInputHandler
import me.magnum.melonds.ui.emulator.input.FrontendInputHandler
import me.magnum.melonds.ui.emulator.input.HybridScreenTouchscreenInputHandler
import me.magnum.melonds.ui.emulator.input.IInputListener
import me.magnum.melonds.ui.emulator.input.SingleButtonInputHandler
import me.magnum.melonds.ui.emulator.input.Slot2AnalogInput
import me.magnum.melonds.ui.emulator.input.Slot2AnalogInputHandler
import me.magnum.melonds.ui.emulator.input.TouchscreenInputHandler
import me.magnum.melonds.ui.emulator.input.view.ToggleableImageView
import me.magnum.melonds.ui.emulator.model.ConnectedControllersState
import me.magnum.melonds.ui.emulator.model.RuntimeInputLayoutConfiguration
import me.magnum.melonds.ui.layouteditor.model.LayoutTarget
import javax.inject.Inject

@AndroidEntryPoint
class RuntimeLayoutView(context: Context, attrs: AttributeSet? = null) : LayoutView(context, attrs) {

    @Inject
    lateinit var touchVibrator: TouchVibrator

    var onQuickSlotCarouselRequested: (() -> Unit)? = null
        set(value) {
            field = value
            if (currentRuntimeLayout != null && frontendInputHandler != null) {
                updateInputs()
            }
        }

    private var currentRuntimeLayout: RuntimeInputLayoutConfiguration? = null
    private var frontendInputHandler: IInputListener? = null
    private var systemInputHandler: IInputListener? = null
    private var isSoftInputVisible = true
    private var areScreensSwapped = false
    private var connectedControllersState: ConnectedControllersState = ConnectedControllersState.NoControllers
    private var slot2AnalogInput: Slot2AnalogInput? = null
    private var slot2AnalogHandler: Slot2AnalogInputHandler? = null
    private var dpadHandler: DpadInputHandler? = null
    private var buttonsHandler: ButtonsInputHandler? = null
    private val virtualButtonInputs = mutableMapOf<LayoutComponent, SingleButtonInputHandler>()
    private val screenTouchHandlers = mutableListOf<TouchscreenInputHandler>()
    private var hybridTouchHandler: HybridScreenTouchscreenInputHandler? = null

    init {
        isMotionEventSplittingEnabled = true
    }

    fun setSlot2AnalogInput(input: Slot2AnalogInput) {
        releaseVirtualButtonInputs()
        slot2AnalogInput = input
        updateInputs()
    }

    fun setFrontendInputHandler(frontendInputHandler: FrontendInputHandler) {
        this.frontendInputHandler = frontendInputHandler
        updateInputs()
    }

    fun setSystemInputHandler(systemInputHandler: IInputListener) {
        this.systemInputHandler = systemInputHandler
        updateInputs()
    }

    fun setConnectedControllersState(state: ConnectedControllersState) {
        connectedControllersState = state
        updateVisibility()
    }

    fun toggleSoftInputVisibility() {
        isSoftInputVisible = !isSoftInputVisible
        setLayoutComponentToggleState(LayoutComponent.BUTTON_TOGGLE_SOFT_INPUT, isSoftInputVisible)
        updateVisibility()
    }

    fun swapScreens() {
        areScreensSwapped = !areScreensSwapped
        updateScreenInputs()
    }

    fun areScreensSwapped(): Boolean {
        return areScreensSwapped
    }

    fun setLayoutComponentToggleState(layoutComponent: LayoutComponent, isEnabled: Boolean) {
        val view = getLayoutComponentView(layoutComponent)?.view
        (view as? me.magnum.melonds.ui.common.views.ModernSingleButtonView)?.setToggleState(isEnabled)
        (view as? ToggleableImageView)?.setToggleState(isEnabled)
    }

    fun instantiateLayout(runtimeLayout: RuntimeInputLayoutConfiguration, layoutTarget: LayoutTarget) {
        currentRuntimeLayout = runtimeLayout
        instantiateLayout(runtimeLayout.layout, layoutTarget)
        updateInputs()
        updateVisibility()
        setLayoutComponentToggleState(LayoutComponent.BUTTON_TOGGLE_SOFT_INPUT, isSoftInputVisible)
    }

    private fun updateInputs() {
        releaseVirtualButtonInputs()
        virtualButtonInputs.clear()
        slot2AnalogHandler = null
        dpadHandler = null
        buttonsHandler = null
        val currentRuntimeLayout = currentRuntimeLayout
        if (currentRuntimeLayout == null) {
            isGone = true
            return
        }

        isVisible = true
        val inputAlpha = currentRuntimeLayout.softInputOpacity / 100f

        slot2AnalogInput?.let { input ->
            getLayoutComponentView(LayoutComponent.SLOT2_ANALOG)?.view?.let { view ->
                Slot2AnalogInputHandler(input).also {
                    slot2AnalogHandler = it
                    view.setOnTouchListener(it)
                }
            }
        }
        val enableHapticFeedback = currentRuntimeLayout.isHapticFeedbackEnabled
        systemInputHandler?.let {
            getLayoutComponentView(LayoutComponent.DPAD)?.view?.let { view ->
                DpadInputHandler(it, enableHapticFeedback, touchVibrator).also { handler ->
                    dpadHandler = handler
                    view.setOnTouchListener(handler)
                }
            }
            getLayoutComponentView(LayoutComponent.BUTTONS)?.view?.let { view ->
                ButtonsInputHandler(it, enableHapticFeedback, touchVibrator).also { handler ->
                    buttonsHandler = handler
                    view.setOnTouchListener(handler)
                }
            }
            for (component in listOf(LayoutComponent.BUTTON_A, LayoutComponent.BUTTON_B, LayoutComponent.BUTTON_X, LayoutComponent.BUTTON_Y)) {
                val componentView = getLayoutComponentView(component) ?: continue
                val handler = SingleButtonInputHandler(it, component.matchingInputs.single(), enableHapticFeedback, touchVibrator, mode = componentView.buttonMode)
                virtualButtonInputs[component] = handler
                componentView.view.setOnTouchListener(handler)
            }
            for (component in listOf(LayoutComponent.BUTTON_L, LayoutComponent.BUTTON_R, LayoutComponent.BUTTON_SELECT, LayoutComponent.BUTTON_START, LayoutComponent.BUTTON_HINGE)) {
                val componentView = getLayoutComponentView(component) ?: continue
                val handler = SingleButtonInputHandler(it, component.matchingInputs.single(), enableHapticFeedback, touchVibrator)
                virtualButtonInputs[component] = handler
                componentView.view.setOnTouchListener(handler)
            }
        }
        frontendInputHandler?.let {
            getLayoutComponentView(LayoutComponent.BUTTON_RESET)?.view?.setOnTouchListener(SingleButtonInputHandler(it, Input.RESET, enableHapticFeedback, touchVibrator))
            getLayoutComponentView(LayoutComponent.BUTTON_PAUSE)?.view?.setOnTouchListener(SingleButtonInputHandler(it, Input.PAUSE, enableHapticFeedback, touchVibrator))
            getLayoutComponentView(LayoutComponent.BUTTON_FAST_FORWARD_TOGGLE)?.view?.setOnTouchListener(SingleButtonInputHandler(it, Input.FAST_FORWARD, enableHapticFeedback, touchVibrator))
            getLayoutComponentView(LayoutComponent.BUTTON_MICROPHONE_TOGGLE)?.view?.setOnTouchListener(SingleButtonInputHandler(it, Input.MICROPHONE, enableHapticFeedback, touchVibrator))
            getLayoutComponentView(LayoutComponent.BUTTON_TOGGLE_SOFT_INPUT)?.view?.setOnTouchListener(SingleButtonInputHandler(it, Input.TOGGLE_SOFT_INPUT, enableHapticFeedback, touchVibrator))
            getLayoutComponentView(LayoutComponent.BUTTON_SWAP_SCREENS)?.view?.setOnTouchListener(SingleButtonInputHandler(it, Input.SWAP_SCREENS, enableHapticFeedback, touchVibrator))
            val quickSlotLongPress = onQuickSlotCarouselRequested?.let { callback -> { callback.invoke() } }
            getLayoutComponentView(LayoutComponent.BUTTON_QUICK_SAVE)?.view?.setOnTouchListener(SingleButtonInputHandler(it, Input.QUICK_SAVE, enableHapticFeedback, touchVibrator, onLongPress = quickSlotLongPress))
            getLayoutComponentView(LayoutComponent.BUTTON_QUICK_LOAD)?.view?.setOnTouchListener(SingleButtonInputHandler(it, Input.QUICK_LOAD, enableHapticFeedback, touchVibrator, onLongPress = quickSlotLongPress))
            getLayoutComponentView(LayoutComponent.BUTTON_REWIND)?.view?.setOnTouchListener(SingleButtonInputHandler(it, Input.REWIND, enableHapticFeedback, touchVibrator))
            getLayoutComponentView(LayoutComponent.BUTTON_TRANSLATE)?.view?.setOnTouchListener(SingleButtonInputHandler(it, Input.TRANSLATE, enableHapticFeedback, touchVibrator))
            getLayoutComponentView(LayoutComponent.BUTTON_TOGGLE_EXTRA_BUTTONS)?.view?.setOnTouchListener(SingleButtonInputHandler(it, Input.TOGGLE_EXTRA_BUTTONS, enableHapticFeedback, touchVibrator))
            getLayoutComponentView(LayoutComponent.BUTTON_LOCK_ROTATION)?.view?.setOnTouchListener(SingleButtonInputHandler(it, Input.LOCK_ROTATION, enableHapticFeedback, touchVibrator))
            getLayoutComponentView(LayoutComponent.BUTTON_TOGGLE_ANALOG_STICK)?.view?.setOnTouchListener(SingleButtonInputHandler(it, Input.TOGGLE_ANALOG_STICK, enableHapticFeedback, touchVibrator))
        }

        getLayoutComponentViews().forEach {
            if (!it.component.isScreen()) {
                it.view.apply {
                    alpha = inputAlpha
                }
            }
        }

        updateScreenInputs()
    }

    private var areExtraButtonsVisible = true

    fun releaseScreenInputs() {
        screenTouchHandlers.forEach { it.release() }
        hybridTouchHandler?.release()
    }

    fun releaseVirtualButtonInputs() {
        slot2AnalogHandler?.release()
        dpadHandler?.release()
        buttonsHandler?.release()
        virtualButtonInputs.values.forEach { it.release() }
        releaseScreenInputs()
    }

    override fun destroyLayout() {
        releaseVirtualButtonInputs()
        virtualButtonInputs.clear()
        slot2AnalogHandler = null
        dpadHandler = null
        buttonsHandler = null
        screenTouchHandlers.clear()
        hybridTouchHandler = null
        super.destroyLayout()
    }

    override fun onDetachedFromWindow() {
        releaseVirtualButtonInputs()
        super.onDetachedFromWindow()
    }

    fun toggleExtraButtonsVisibility() {
        areExtraButtonsVisible = !areExtraButtonsVisible
        updateVisibility()
        setLayoutComponentToggleState(LayoutComponent.BUTTON_TOGGLE_EXTRA_BUTTONS, areExtraButtonsVisible)
    }

    private fun updateScreenInputs() {
        releaseScreenInputs()
        screenTouchHandlers.clear()
        hybridTouchHandler = null
        val (touchScreenComponent, nonTouchScreenComponent) = if (areScreensSwapped) {
            LayoutComponent.TOP_SCREEN to LayoutComponent.BOTTOM_SCREEN
        } else {
            LayoutComponent.BOTTOM_SCREEN to LayoutComponent.TOP_SCREEN
        }
        systemInputHandler?.let { handler ->
            val touchView = getLayoutComponentView(touchScreenComponent)?.view
            if (touchView != null) {
                TouchscreenInputHandler(handler).also {
                    screenTouchHandlers.add(it)
                    touchView.setOnTouchListener(it)
                }
            } else {
                // Fallback for single-screen layouts where only one screen is rendered on this display
                getLayoutComponentView(nonTouchScreenComponent)?.view?.let { fallbackView ->
                    TouchscreenInputHandler(handler).also {
                        screenTouchHandlers.add(it)
                        fallbackView.setOnTouchListener(it)
                    }
                }
            }
            getLayoutComponentView(LayoutComponent.HYBRID_SCREEN)?.view?.let { hybridView ->
                HybridScreenTouchscreenInputHandler(handler).also {
                    hybridTouchHandler = it
                    hybridView.setOnTouchListener(it)
                }
            }
        }
        if (getLayoutComponentView(touchScreenComponent)?.view != null) {
            getLayoutComponentView(nonTouchScreenComponent)?.view?.setOnTouchListener(null)
        }
    }

    private fun updateVisibility() {
        val currentConnectedControllersState = connectedControllersState
        var hiddenComponents = when(currentRuntimeLayout?.softInputBehaviour) {
            SoftInputBehaviour.ALWAYS_VISIBLE -> emptyList()
            SoftInputBehaviour.HIDE_SYSTEM_BUTTONS_WHEN_CONTROLLERS_CONNECTED, null -> {
                when(currentConnectedControllersState) {
                    ConnectedControllersState.NoControllers -> emptyList()
                    is ConnectedControllersState.ControllersConnected -> listOf(
                        LayoutComponent.BUTTONS,
                        LayoutComponent.BUTTON_A,
                        LayoutComponent.BUTTON_B,
                        LayoutComponent.BUTTON_X,
                        LayoutComponent.BUTTON_Y,
                        LayoutComponent.SLOT2_ANALOG,
                        LayoutComponent.DPAD,
                        LayoutComponent.BUTTON_L,
                        LayoutComponent.BUTTON_R,
                        LayoutComponent.BUTTON_START,
                        LayoutComponent.BUTTON_SELECT
                    )
                }
            }
            SoftInputBehaviour.HIDE_ALL_BUTTONS_ASSIGNED_TO_CONNECTED_CONTROLLERS -> when(currentConnectedControllersState) {
                ConnectedControllersState.NoControllers -> emptyList()
                is ConnectedControllersState.ControllersConnected -> {
                    LayoutComponent.entries.filter {
                        // The component can be hidden if all matching inputs are assigned to connected controllers
                        it != LayoutComponent.SLOT2_ANALOG && it.matchingInputs.all {
                            currentConnectedControllersState.assignedInputs.contains(it)
                        }
                    }
                }
            }
            SoftInputBehaviour.ALWAYS_INVISIBLE -> LayoutComponent.entries.toList()
        }.toMutableList()

        if (!areExtraButtonsVisible) {
            LayoutComponent.entries.forEach { c ->
                val isCore = c == LayoutComponent.DPAD || c == LayoutComponent.BUTTONS ||
                        c == LayoutComponent.BUTTON_A || c == LayoutComponent.BUTTON_B ||
                        c == LayoutComponent.BUTTON_X || c == LayoutComponent.BUTTON_Y ||
                        c == LayoutComponent.BUTTON_L || c == LayoutComponent.BUTTON_R ||
                        c == LayoutComponent.BUTTON_START || c == LayoutComponent.BUTTON_SELECT ||
                        c == LayoutComponent.BUTTON_TOGGLE_EXTRA_BUTTONS ||
                        c.isScreen()
                if (!isCore && c !in hiddenComponents) {
                    hiddenComponents.add(c)
                }
            }
        }

        if (!isSoftInputVisible) {
            // Hide everything except the soft input toggle button if it was not already hidden by the soft input behaviour logic
            hiddenComponents = if (hiddenComponents.contains(LayoutComponent.BUTTON_TOGGLE_SOFT_INPUT)) {
                LayoutComponent.entries.toMutableList()
            } else {
                LayoutComponent.entries.filter { it != LayoutComponent.BUTTON_TOGGLE_SOFT_INPUT }.toMutableList()
            }
        }

        // Audit [7.13]: centrally keep BUTTON_TRANSLATE hidden here rather than overriding visibility elsewhere
        if (LayoutComponent.BUTTON_TRANSLATE !in hiddenComponents) {
            hiddenComponents.add(LayoutComponent.BUTTON_TRANSLATE)
        }

        val visibleComponents = LayoutComponent.entries.filter { !hiddenComponents.contains(it) }

        hiddenComponents.forEach { component ->
            if (!component.isScreen()) {
                if (component == LayoutComponent.SLOT2_ANALOG) slot2AnalogHandler?.release()
                if (component == LayoutComponent.DPAD) dpadHandler?.release()
                if (component == LayoutComponent.BUTTONS) buttonsHandler?.release()
                virtualButtonInputs[component]?.release()
                getLayoutComponentView(component)?.view?.isVisible = false
            }
        }
        visibleComponents.forEach { component ->
            if (!component.isScreen()) {
                getLayoutComponentView(component)?.view?.isVisible = true
            }
        }
    }

    fun applyConsoleSkinButtonShift(isConsoleSkinEnabled: Boolean, shiftPx: Int) {
        val w = width
        val h = height

        getLayoutComponentViews().forEach { compView ->
            if (!compView.component.isScreen()) {
                val v = compView.view
                val lp = v.layoutParams as? FrameLayout.LayoutParams
                if (lp != null) {
                    val baseTop = compView.initialRect?.y ?: lp.topMargin
                    val baseLeft = compView.initialRect?.x ?: lp.leftMargin

                    val maxTop = if (h > 0 && lp.height > 0) (h - lp.height - 4).coerceAtLeast(0) else Int.MAX_VALUE
                    val newTop = baseTop.coerceIn(0, maxTop)

                    val maxLeft = if (w > 0 && lp.width > 0) (w - lp.width - 4).coerceAtLeast(0) else Int.MAX_VALUE
                    val newLeft = baseLeft.coerceIn(0, maxLeft)

                    var changed = false
                    if (newTop != lp.topMargin) {
                        lp.topMargin = newTop
                        changed = true
                    }
                    if (newLeft != lp.leftMargin) {
                        lp.leftMargin = newLeft
                        changed = true
                    }
                    if (changed) {
                        v.layoutParams = lp
                    }
                }
            }
        }
    }

    fun invalidateInputControlViews() {
        getLayoutComponentViews().forEach { compView ->
            if (!compView.component.isScreen()) {
                compView.view.invalidate()
            }
        }
    }
}
