package me.magnum.melonds.ui.layouteditor

import android.content.Context
import android.util.AttributeSet
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.WindowManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.FrameLayout
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.stringResource
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isGone
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.lifecycle.get
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import me.magnum.melonds.R
import me.magnum.melonds.databinding.ViewLayoutEditorManagerBinding
import me.magnum.melonds.domain.model.RuntimeBackground
import me.magnum.melonds.domain.model.consoleAspectRatio
import me.magnum.melonds.domain.model.layout.LayoutComponent
import me.magnum.melonds.extensions.setBackgroundMode
import me.magnum.melonds.ui.common.component.dialog.TextInputDialog
import me.magnum.melonds.ui.common.component.dialog.TextInputDialogState
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.MenuOption
import me.magnum.melonds.ui.layouteditor.LayoutEditorManagerView.AspectRatioEnforcementPriority.HEIGHT
import me.magnum.melonds.ui.layouteditor.LayoutEditorManagerView.AspectRatioEnforcementPriority.WIDTH
import me.magnum.melonds.ui.layouteditor.model.LayoutComponentEditableProperty
import me.magnum.melonds.ui.layouteditor.model.LayoutComponentPositionEditorState
import me.magnum.melonds.ui.layouteditor.model.LayoutTarget
import me.magnum.melonds.ui.layouteditor.model.ScreenEditorState
import me.magnum.melonds.ui.layouteditor.ui.LayoutBackgroundDialog
import me.magnum.melonds.ui.layouteditor.ui.LayoutComponentPositionDialog
import me.magnum.melonds.ui.layouteditor.ui.LayoutComponentPropertyValueDialog
import me.magnum.melonds.ui.layouteditor.ui.LayoutPropertiesDialog
import me.magnum.melonds.ui.theme.MelonTheme
import me.magnum.melonds.utils.getLayoutComponentName
import java.util.UUID
import kotlin.math.min
import kotlin.math.roundToInt

private const val CONTROLS_SLIDE_ANIMATION_DURATION_MS = 100L

class LayoutEditorManagerView(
    private val layoutTarget: LayoutTarget,
    private val picasso: Picasso,
    initialEditorState: ScreenEditorState? = null,
    context: Context,
    attrs: AttributeSet? = null
) : FrameLayout(context, attrs) {

    interface LayoutEditorManagerListener {
        fun openBackgroundPicker(layoutTarget: LayoutTarget, selectedBackgroundId: UUID?)
        fun onStoreLayoutChanges()
        fun onSaveLayoutAndExit()
        fun onSaveLayoutAsNewAndExit()
        fun onExit()
    }

    private enum class ScreenAspectRatio(val ratio: Float?) {
        RATIO_4_3(consoleAspectRatio),
        RATIO_16_9(16 / 9f),
        UNRESTRICTED(null)
    }

    private enum class AspectRatioEnforcementPriority {
        WIDTH, HEIGHT,
    }

    private val binding: ViewLayoutEditorManagerBinding
    private val viewModel: LayoutEditorViewModel by lazy {
        val owner = findViewTreeViewModelStoreOwner() ?: error("No view-model store owner found")
        ViewModelProvider(owner).get<LayoutEditorViewModel>()
    }

    var listener: LayoutEditorManagerListener? = null
    private var areBottomControlsShown = true
    private var areScalingControlsShown = true
    private var selectedViewMinSize = 0
    private var currentWidthScale = 0f
    private var currentHeightScale = 0f
    private var selectedViewIsScreen = false
    private var selectedViewSupportsAspectRatio = false
    private var selectedScreenComponent: LayoutComponent? = null
    private var selectedAspectRatio = ScreenAspectRatio.RATIO_4_3
    private var topAspectRatio = ScreenAspectRatio.RATIO_4_3
    private var bottomAspectRatio = ScreenAspectRatio.RATIO_4_3
    private var updatingAspectSpinner = false
    private var updatingScalingControls = false

    private var showLayoutPropertiesDialog by mutableStateOf(initialEditorState?.isPropertiesDialogShown ?: false)
    private var showBackgroundPropertiesDialog by mutableStateOf(initialEditorState?.isBackgroundPropertiesDialogShown ?: false)
    private var shownEditablePropertyDialog by mutableStateOf<LayoutComponentEditableProperty?>(null)
    private var shownPositionDialog by mutableStateOf<LayoutComponentPositionEditorState?>(null)
    private var pendingEditTargetComponent: LayoutComponent? = null
    private var editableDialogTargetComponent: LayoutComponent? = null
    private var positionDialogTargetComponent: LayoutComponent? = null
    private val nameInputDialogState = TextInputDialogState()

    val layoutEditorView get() = binding.viewLayoutEditor
    val imageBackground get() = binding.imageBackground

    init {
        val layoutInflater = LayoutInflater.from(context)
        isFocusable = true
        isFocusableInTouchMode = true
        binding = ViewLayoutEditorManagerBinding.inflate(layoutInflater)
        val composeView = ComposeView(context).apply {
            setContent {
                MelonTheme {
                    if (showLayoutPropertiesDialog) {
                        val layoutConfiguration by viewModel.currentLayoutConfiguration.collectAsStateWithLifecycle()
                        val currentConfiguration = layoutConfiguration

                        if (currentConfiguration != null) {
                            LayoutPropertiesDialog(
                                layoutConfiguration = currentConfiguration,
                                onDismiss = { showLayoutPropertiesDialog = false },
                                onSave = { name, orientation, useCustomOpacity, opacity ->
                                    viewModel.savePropertiesToCurrentConfiguration(name, orientation, useCustomOpacity, opacity)
                                    showLayoutPropertiesDialog = false
                                }
                            )
                        }
                    }

                    if (showBackgroundPropertiesDialog) {
                        val backgroundProperties by when (layoutTarget) {
                            LayoutTarget.MAIN_SCREEN -> viewModel.mainScreenBackgroundProperties.collectAsStateWithLifecycle()
                            LayoutTarget.SECONDARY_SCREEN -> viewModel.secondaryScreenBackgroundProperties.collectAsStateWithLifecycle()
                        }
                        val currentBackgroundProperties = backgroundProperties

                        if (currentBackgroundProperties != null) {
                            LayoutBackgroundDialog(
                                backgroundId = currentBackgroundProperties.backgroundId,
                                backgroundMode = currentBackgroundProperties.backgroundMode,
                                loadBackgroundName = { backgroundId -> viewModel.getBackgroundName(backgroundId) },
                                onOpenBackgroundPicker = { listener?.openBackgroundPicker(layoutTarget, currentBackgroundProperties.backgroundId) },
                                onBackgroundModeUpdate = { viewModel.setBackgroundPropertiesBackgroundMode(layoutTarget, it) },
                                onDismiss = {
                                    viewModel.resetBackgroundProperties(layoutTarget)
                                    showBackgroundPropertiesDialog = false
                                },
                                onSave = {
                                    viewModel.saveBackgroundToCurrentConfiguration(layoutTarget)
                                    showBackgroundPropertiesDialog = false
                                }
                            )
                        }
                    }

                    val currentlyShownEditablePropertyDialog = shownEditablePropertyDialog
                    LayoutComponentPropertyValueDialog(
                        editableProperty = currentlyShownEditablePropertyDialog,
                        initialValue = when (currentlyShownEditablePropertyDialog) {
                            LayoutComponentEditableProperty.SIZE -> binding.seekBarSize.progress + selectedViewMinSize
                            LayoutComponentEditableProperty.WIDTH -> binding.seekBarWidth.progress + selectedViewMinSize
                            LayoutComponentEditableProperty.HEIGHT -> binding.seekBarHeight.progress + selectedViewMinSize
                            null -> 0
                        },
                        minValue = selectedViewMinSize,
                        maxValue = when (currentlyShownEditablePropertyDialog) {
                            LayoutComponentEditableProperty.SIZE -> binding.seekBarSize.max + selectedViewMinSize
                            LayoutComponentEditableProperty.WIDTH -> binding.seekBarWidth.max + selectedViewMinSize
                            LayoutComponentEditableProperty.HEIGHT -> binding.seekBarHeight.max + selectedViewMinSize
                            null -> selectedViewMinSize
                        },
                        onValueChanged = {
                            applyEditablePropertyDialogValue(currentlyShownEditablePropertyDialog, it)
                            shownEditablePropertyDialog = null
                            editableDialogTargetComponent = null
                        },
                        onCancel = {
                            shownEditablePropertyDialog = null
                            editableDialogTargetComponent = null
                        },
                    )

                    LayoutComponentPositionDialog(
                        positionEditorState = shownPositionDialog,
                        onDismiss = {
                            shownPositionDialog = null
                            positionDialogTargetComponent = null
                        },
                        onSave = { x, y ->
                            val targetComponent = positionDialogTargetComponent ?: shownPositionDialog?.component
                            if (targetComponent != null && binding.viewLayoutEditor.setComponentPosition(targetComponent, x, y)) {
                                listener?.onStoreLayoutChanges()
                                finishAppliedComponentEdit(targetComponent)
                            }
                            shownPositionDialog = null
                            positionDialogTargetComponent = null
                        }
                    )

                    TextInputDialog(
                        title = stringResource(R.string.layout_name),
                        dialogState = nameInputDialogState,
                    )
                }
            }
        }
        addView(binding.root, LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT))
        addView(composeView, LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT))

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { _, windowInsets ->
            val insets = windowInsets.getInsets(WindowInsetsCompat.Type.displayCutout())
            binding.layoutScalingContainer.setPadding(
                insets.left,
                0,
                insets.right,
                insets.bottom,
            )
            binding.layoutControls.setPadding(
                insets.left,
                0,
                insets.right,
                insets.bottom,
            )

            WindowInsetsCompat.CONSUMED
        }

        binding.buttonAddButton.setOnClickListener {
            openButtonsMenu()
        }
        binding.buttonMenu.setOnClickListener {
            openMenu()
        }
        binding.buttonDeleteButton.setOnClickListener {
            binding.viewLayoutEditor.deleteSelectedView()
        }
        binding.buttonEditPosition.captureEditTargetOnTouchDown()
        binding.buttonEditPosition.setOnClickListener {
            openSelectedViewPositionDialog()
        }
        binding.buttonEditSize.captureEditTargetOnTouchDown()
        binding.buttonEditSize.setOnClickListener {
            openSelectedViewSizeDialog()
        }
        binding.buttonCenterHorizontal.setOnClickListener {
            binding.viewLayoutEditor.centerSelectedViewHorizontally()
        }
        binding.buttonCenterVertical.setOnClickListener {
            binding.viewLayoutEditor.centerSelectedViewVertically()
        }

        binding.viewLayoutEditor.setLayoutComponentViewBuilderFactory(EditorLayoutComponentViewBuilderFactory())
        binding.viewLayoutEditor.setOnClickListener {
            if (areBottomControlsShown)
                hideBottomControls()
            else
                showBottomControls()
        }
        binding.viewLayoutEditor.setOnViewSelectedListener { view, widthScale, heightScale, maxWidth, maxHeight, minSize ->
            hideBottomControls()
            // Force the scaling controls to restart so the new view always
            // receives fresh listeners even if they were already visible.
            hideScalingControls(false)
            selectedViewIsScreen = view.component.isScreen()
            selectedViewSupportsAspectRatio = view.component.supportsAspectRatioSelection()
            selectedScreenComponent = view.component
            selectedAspectRatio = when (view.component) {
                LayoutComponent.TOP_SCREEN -> topAspectRatio
                LayoutComponent.BOTTOM_SCREEN -> bottomAspectRatio
                else -> ScreenAspectRatio.UNRESTRICTED
            }
            showScalingControls(
                widthScale,
                heightScale,
                maxWidth,
                maxHeight,
                minSize,
                selectedViewIsScreen,
                view.baseAlpha,
                view.onTop,
            )
        }
        binding.viewLayoutEditor.setOnViewDeselectedListener {
            hideScalingControls()
        }
        binding.viewLayoutEditor.setOnViewPositionEditRequestedListener {
            positionDialogTargetComponent = it.component
            shownPositionDialog = it
        }
        binding.layoutSizeLabels.setOnClickListener {
            openSelectedViewSizeDialog()
        }
        binding.layoutSizeLabels.captureEditTargetOnTouchDown()
        binding.seekBarSize.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                val maxDelta = seekBar.max.coerceAtLeast(1)
                val scale = progress / maxDelta.toFloat()
                val value = (maxDelta * scale + selectedViewMinSize).toInt()
                binding.textSize.text = value.toString()
                if (updatingScalingControls) {
                    return
                }
                binding.viewLayoutEditor.scaleSelectedView(scale)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }
        })

        binding.layoutWidthLabels.setOnClickListener {
            openSelectedViewPropertyDialog(LayoutComponentEditableProperty.WIDTH)
        }
        binding.layoutWidthLabels.captureEditTargetOnTouchDown()
        binding.seekBarWidth.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                if (selectedViewIsScreen && fromUser && selectedAspectRatio.ratio != null) {
                    enforceAspectRatio(selectedAspectRatio, WIDTH)
                } else {
                    val widthScale = progress / binding.seekBarWidth.max.toFloat()
                    currentWidthScale = widthScale
                    binding.textWidth.text = (binding.seekBarWidth.max * currentWidthScale + selectedViewMinSize).toInt().toString()
                }
                if (updatingScalingControls) {
                    return
                }
                binding.viewLayoutEditor.scaleSelectedView(currentWidthScale, currentHeightScale)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }
        })

        binding.layoutHeightLabels.setOnClickListener {
            openSelectedViewPropertyDialog(LayoutComponentEditableProperty.HEIGHT)
        }
        binding.layoutHeightLabels.captureEditTargetOnTouchDown()
        binding.seekBarHeight.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                if (selectedViewIsScreen && fromUser && selectedAspectRatio.ratio != null) {
                    enforceAspectRatio(selectedAspectRatio, HEIGHT)
                } else {
                    val heightScale = progress / binding.seekBarHeight.max.toFloat()
                    currentHeightScale = heightScale
                    binding.textHeight.text = (binding.seekBarHeight.max * currentHeightScale + selectedViewMinSize).toInt().toString()
                }
                if (updatingScalingControls) {
                    return
                }
                binding.viewLayoutEditor.scaleSelectedView(currentWidthScale, currentHeightScale)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }
        })

        binding.seekBarAlpha.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                val alpha = progress / 100f
                if (updatingScalingControls) {
                    return
                }
                binding.viewLayoutEditor.setSelectedViewAlpha(alpha)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })

        val aspectOptions = listOf(
            resources.getString(R.string.aspect_ratio_4_3),
            resources.getString(R.string.aspect_ratio_16_9),
            resources.getString(R.string.aspect_ratio_unrestricted),
        )
        val aspectAdapter = ArrayAdapter(context, android.R.layout.simple_spinner_item, aspectOptions)
        aspectAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerAspectRatio.adapter = aspectAdapter
        binding.spinnerAspectRatio.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                if (!selectedViewSupportsAspectRatio || updatingAspectSpinner) return
                val targetComponent = selectedScreenComponent ?: return
                selectedAspectRatio = ScreenAspectRatio.entries[position]
                when (targetComponent) {
                    LayoutComponent.TOP_SCREEN -> topAspectRatio = selectedAspectRatio
                    LayoutComponent.BOTTOM_SCREEN -> bottomAspectRatio = selectedAspectRatio
                    else -> { }
                }
                enforceAspectRatio(selectedAspectRatio, WIDTH)
                binding.viewLayoutEditor.scaleSelectedView(currentWidthScale, currentHeightScale)
                binding.spinnerAspectRatio.post {
                    binding.viewLayoutEditor.selectComponent(targetComponent)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        binding.checkboxAboveScreen.setOnCheckedChangeListener { _, isChecked ->
            if (updatingScalingControls) {
                return@setOnCheckedChangeListener
            }
            binding.viewLayoutEditor.setSelectedScreenOnTop(isChecked)
        }

        binding.buttonHideControls.setOnClickListener {
            hideScalingControls()
        }

        hideScalingControls(false)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        return if (binding.viewLayoutEditor.handleKeyDown(event)) {
            true
        } else {
            super.onKeyDown(keyCode, event)
        }
    }

    fun handleBackNavigation() {
        if (areScalingControlsShown) {
            hideScalingControls(true)
        } else {
            openMenu()
        }
    }

    fun saveEditorState(): ScreenEditorState {
        return ScreenEditorState(
            isMenuShown = false,
            isPropertiesDialogShown = showLayoutPropertiesDialog,
            isBackgroundPropertiesDialogShown = showBackgroundPropertiesDialog,
        )
    }

    fun updateBackground(background: RuntimeBackground) {
        picasso.load(background.background?.uri).into(binding.imageBackground, object : Callback {
            override fun onSuccess() {
                binding.imageBackground.setBackgroundMode(background.mode)
            }

            override fun onError(e: Exception?) {
                e?.printStackTrace()
                Toast.makeText(context, R.string.layout_background_load_failed, Toast.LENGTH_LONG).show()
            }
        })
    }

    private fun openSelectedViewPositionDialog() {
        val targetComponent = consumeEditTargetComponent() ?: return
        val positionEditorState = binding.viewLayoutEditor.buildComponentPositionEditorState(targetComponent) ?: return
        positionDialogTargetComponent = targetComponent
        shownPositionDialog = positionEditorState
    }

    private fun openSelectedViewSizeDialog() {
        openSelectedViewPropertyDialog(LayoutComponentEditableProperty.SIZE)
    }

    private fun openSelectedViewPropertyDialog(editableProperty: LayoutComponentEditableProperty) {
        val targetComponent = consumeEditTargetComponent() ?: return
        editableDialogTargetComponent = targetComponent
        shownEditablePropertyDialog = editableProperty
    }

    private fun consumeEditTargetComponent(): LayoutComponent? {
        return (pendingEditTargetComponent ?: binding.viewLayoutEditor.getSelectedComponent()).also {
            pendingEditTargetComponent = null
        }
    }

    private fun applyEditablePropertyDialogValue(
        editableProperty: LayoutComponentEditableProperty?,
        value: Int,
    ) {
        val targetComponent = editableDialogTargetComponent ?: binding.viewLayoutEditor.getSelectedComponent() ?: return

        updatingScalingControls = true
        try {
            when (editableProperty) {
                LayoutComponentEditableProperty.SIZE -> {
                    binding.seekBarSize.progress = (value - selectedViewMinSize).coerceIn(0, binding.seekBarSize.max)
                }
                LayoutComponentEditableProperty.WIDTH -> {
                    binding.seekBarWidth.progress = (value - selectedViewMinSize).coerceIn(0, binding.seekBarWidth.max)
                    enforceAspectRatio(selectedAspectRatio, WIDTH)
                }
                LayoutComponentEditableProperty.HEIGHT -> {
                    binding.seekBarHeight.progress = (value - selectedViewMinSize).coerceIn(0, binding.seekBarHeight.max)
                    enforceAspectRatio(selectedAspectRatio, HEIGHT)
                }
                null -> return
            }
        } finally {
            updatingScalingControls = false
        }

        val applied = when (editableProperty) {
            LayoutComponentEditableProperty.SIZE -> {
                val maxDelta = binding.seekBarSize.max.coerceAtLeast(1)
                val scale = binding.seekBarSize.progress / maxDelta.toFloat()
                binding.viewLayoutEditor.scaleComponent(targetComponent, scale)
            }
            LayoutComponentEditableProperty.WIDTH,
            LayoutComponentEditableProperty.HEIGHT -> {
                binding.viewLayoutEditor.scaleComponent(targetComponent, currentWidthScale, currentHeightScale)
            }
        }

        if (applied) {
            listener?.onStoreLayoutChanges()
            finishAppliedComponentEdit(targetComponent)
        }
    }

    private fun finishAppliedComponentEdit(component: LayoutComponent) {
        binding.viewLayoutEditor.releaseComponentEdit(component)
        hideScalingControls()
    }

    private fun View.captureEditTargetOnTouchDown() {
        setOnTouchListener { view, event ->
            when (event.actionMasked) {
                MotionEvent.ACTION_DOWN -> {
                    pendingEditTargetComponent = binding.viewLayoutEditor.getSelectedComponent()
                }
                MotionEvent.ACTION_CANCEL -> {
                    pendingEditTargetComponent = null
                }
                MotionEvent.ACTION_UP -> view.post {
                    if (!isEditDialogShown()) {
                        pendingEditTargetComponent = null
                    }
                }
            }
            false
        }
    }

    private fun isEditDialogShown(): Boolean {
        return shownEditablePropertyDialog != null || shownPositionDialog != null
    }

    private fun openButtonsMenu() {
        hideBottomControls()
        val instantiatedComponents = binding.viewLayoutEditor.getInstantiatedComponents()
        val componentsToShow = LayoutComponent.entries.filterNot { instantiatedComponents.contains(it) }

        val themedContext = android.view.ContextThemeWrapper(context, R.style.AppTheme)
        val dialogBuilder = AlertDialog.Builder(themedContext)
            .setTitle(R.string.choose_component)
            .setNegativeButton(R.string.cancel) { dialog, _ ->
                dialog.cancel()
            }

        if (componentsToShow.isNotEmpty()) {
            dialogBuilder.setItems(componentsToShow.map { resources.getString(getLayoutComponentName(it)) }.toTypedArray()) { _, which ->
                val component = componentsToShow[which]
                binding.viewLayoutEditor.addLayoutComponent(component)
            }
        } else {
            dialogBuilder.setMessage(R.string.no_more_components)
        }

        dialogBuilder.showInCurrentWindow()
    }

    private fun openMenu() {
        listener?.onStoreLayoutChanges()
        val values = getMenuOptions()
        val options = Array(values.size) { i -> resources.getString(values[i].stringRes) }

        val themedContext = android.view.ContextThemeWrapper(context, R.style.AppTheme)
        AlertDialog.Builder(themedContext)
            .setTitle(R.string.menu)
            .setItems(options) { _, which -> onMenuOptionSelected(values[which]) }
            .setNegativeButton(R.string.cancel, null)
            .showInCurrentWindow()
    }

    private fun onMenuOptionSelected(option: MenuOption) {
        when (option) {
            MenuOption.PROPERTIES -> openPropertiesDialog()
            MenuOption.BACKGROUNDS -> openBackgroundsConfigDialog()
            MenuOption.REVERT -> viewModel.revertLayoutChanges()
            MenuOption.RESET -> viewModel.resetLayout()
            MenuOption.SAVE_AS_NEW -> showLayoutNameInputDialog(
                initialName = viewModel.getCurrentLayoutName()?.ifBlank { resources.getString(R.string.custom_layout_default_name) }
                    ?: resources.getString(R.string.custom_layout_default_name),
                onConfirm = {
                    viewModel.setCurrentLayoutName(it)
                    listener?.onSaveLayoutAsNewAndExit()
                },
            )
            MenuOption.SAVE_AND_EXIT -> {
                if (viewModel.currentLayoutHasName()) {
                    listener?.onSaveLayoutAndExit()
                } else {
                    showLayoutNameInputDialog(
                        initialName = resources.getString(R.string.custom_layout_default_name),
                        onConfirm = {
                            viewModel.setCurrentLayoutName(it)
                            listener?.onSaveLayoutAndExit()
                        },
                    )
                }
            }
            MenuOption.EXIT_WITHOUT_SAVING -> listener?.onExit()
        }
    }

    private fun openPropertiesDialog() {
        listener?.onStoreLayoutChanges()
        showLayoutPropertiesDialog = true
    }

    private fun openBackgroundsConfigDialog() {
        listener?.onStoreLayoutChanges()
        showBackgroundPropertiesDialog = true
    }

    private fun getMenuOptions(): List<MenuOption> {
        return buildList {
            add(MenuOption.PROPERTIES)
            add(MenuOption.BACKGROUNDS)
            add(MenuOption.REVERT)
            add(MenuOption.RESET)
            if (viewModel.canSaveLayoutAsNew()) {
                add(MenuOption.SAVE_AS_NEW)
            }
            add(MenuOption.SAVE_AND_EXIT)
            add(MenuOption.EXIT_WITHOUT_SAVING)
        }
    }

    private fun showLayoutNameInputDialog(initialName: String, onConfirm: (String) -> Unit) {
        nameInputDialogState.show(
            initialText = initialName,
            onConfirm = onConfirm,
        )
    }

    private fun showBottomControls(animate: Boolean = true) {
        if (areBottomControlsShown) {
            return
        }

        binding.layoutControls.clearAnimation()
        if (animate) {
            binding.layoutControls
                .animate()
                .y(binding.layoutControls.bottom.toFloat() - binding.layoutControls.height.toFloat())
                .setDuration(CONTROLS_SLIDE_ANIMATION_DURATION_MS)
                .withStartAction {
                    binding.layoutControls.isVisible = true
                }
                .start()
        } else {
            binding.layoutControls.isVisible = true
        }

        areBottomControlsShown = true
    }

    private fun hideBottomControls(animate: Boolean = true) {
        if (!areBottomControlsShown) {
            return
        }

        if (animate) {
            binding.layoutControls.clearAnimation()
            binding.layoutControls.animate()
                .y(binding.layoutControls.bottom.toFloat())
                .setDuration(CONTROLS_SLIDE_ANIMATION_DURATION_MS)
                .withEndAction {
                    binding.layoutControls.isGone = true
                }
                .start()
        } else {
            binding.layoutControls.isGone = true
        }

        areBottomControlsShown = false
    }

    private fun showScalingControls(
        widthScale: Float,
        heightScale: Float,
        maxWidth: Int,
        maxHeight: Int,
        minSize: Int,
        isScreen: Boolean,
        alpha: Float,
        onTop: Boolean,
        animate: Boolean = true,
    ) {
        binding.layoutScalingContainer.animate().cancel()
        selectedViewMinSize = minSize
        currentWidthScale = widthScale
        currentHeightScale = heightScale

        updatingScalingControls = true

        try {
            if (isScreen) {
                binding.seekBarWidth.apply {
                    max = maxWidth - minSize
                    progress = (widthScale * (maxWidth - minSize)).roundToInt().coerceIn(0, max)
                }
                binding.textWidth.text = ((maxWidth - minSize) * widthScale + minSize).roundToInt().toString()

                binding.seekBarHeight.apply {
                    max = maxHeight - minSize
                    progress = (heightScale * (maxHeight - minSize)).roundToInt().coerceIn(0, max)
                }
                binding.textHeight.text = ((maxHeight - minSize) * heightScale + minSize).roundToInt().toString()
            } else {
                val maxDelta = (min(maxWidth, maxHeight) - minSize).coerceAtLeast(1)
                val currentWidth = ((maxWidth - minSize) * widthScale + minSize).roundToInt()
                val currentHeight = ((maxHeight - minSize) * heightScale + minSize).roundToInt()
                val currentSize = min(currentWidth, currentHeight).coerceIn(minSize, minSize + maxDelta)
                binding.seekBarSize.apply {
                    max = maxDelta
                    progress = currentSize - minSize
                }
                binding.textSize.text = currentSize.toString()
            }

            binding.seekBarAlpha.progress = (alpha * 100).roundToInt().coerceIn(0, binding.seekBarAlpha.max)
            binding.checkboxAboveScreen.isChecked = onTop
            updatingAspectSpinner = true
            try {
                binding.spinnerAspectRatio.setSelection(selectedAspectRatio.ordinal, false)
            } finally {
                updatingAspectSpinner = false
            }
        } finally {
            updatingScalingControls = false
        }

        binding.layoutSizeLabels.isVisible = !isScreen
        binding.seekBarSize.isVisible = !isScreen
        binding.buttonEditSize.isVisible = !isScreen
        binding.layoutWidthLabels.isVisible = isScreen
        binding.seekBarWidth.isVisible = isScreen
        binding.layoutHeightLabels.isVisible = isScreen
        binding.seekBarHeight.isVisible = isScreen
        binding.layoutAlphaLabels.isVisible = isScreen
        binding.seekBarAlpha.isVisible = isScreen
        binding.layoutAspectRatio.isVisible = selectedViewSupportsAspectRatio
        binding.checkboxAboveScreen.isVisible = isScreen
        binding.buttonCenterHorizontal.isVisible = isScreen
        binding.buttonCenterVertical.isVisible = isScreen

        if (!areScalingControlsShown) {
            if (animate) {
                binding.layoutScalingContainer.isVisible = true
                binding.layoutScalingContainer.post {
                    binding.layoutScalingContainer
                        .animate()
                        .y(binding.root.bottom.toFloat() - binding.layoutScalingContainer.height.toFloat())
                        .setDuration(CONTROLS_SLIDE_ANIMATION_DURATION_MS)
                        .withEndAction(null)
                        .start()
                }
            } else {
                binding.layoutScalingContainer.isVisible = true
                binding.layoutScalingContainer.y = binding.root.bottom.toFloat() - binding.layoutScalingContainer.height.toFloat()
            }

            areScalingControlsShown = true
        }

        binding.layoutScalingContainer.requestFocus()
    }

    private fun hideScalingControls(animate: Boolean = true) {
        if (!areScalingControlsShown) {
            return
        }

        binding.layoutScalingContainer.animate().cancel()

        if (animate) {
            binding.layoutScalingContainer.post {
                binding.layoutScalingContainer
                    .animate()
                    .y(binding.root.bottom.toFloat())
                    .setDuration(CONTROLS_SLIDE_ANIMATION_DURATION_MS)
                    .withEndAction {
                        binding.layoutScalingContainer.isInvisible = true
                    }
                    .start()
            }
        } else {
            binding.layoutScalingContainer.y = binding.layoutScalingContainer.bottom.toFloat()
            binding.layoutScalingContainer.isInvisible = true
        }

        areScalingControlsShown = false
    }

    private fun enforceAspectRatio(aspectRatio: ScreenAspectRatio, priority: AspectRatioEnforcementPriority) {
        val ratio = aspectRatio.ratio ?: return

        val displayRatio = binding.seekBarWidth.max.toFloat() / binding.seekBarHeight.max.toFloat()
        var width: Float
        var height: Float

        when (priority) {
            WIDTH -> {
                width = binding.seekBarWidth.progress.toFloat() + selectedViewMinSize
                height = width / ratio
            }
            HEIGHT -> {
                height = binding.seekBarHeight.progress.toFloat() + selectedViewMinSize
                width = height * ratio
            }
        }

        val minWidth = selectedViewMinSize * aspectRatio.ratio
        val minHeight = selectedViewMinSize.toFloat()
        val maxWidth = min(binding.seekBarWidth.max.toFloat() + selectedViewMinSize, (binding.seekBarHeight.max + selectedViewMinSize) * ratio)
        val maxHeight = min(binding.seekBarHeight.max.toFloat() + selectedViewMinSize, (binding.seekBarWidth.max + selectedViewMinSize) / ratio)

        // Enforce min size
        if (width < minWidth) {
            width = minWidth
            height = width / ratio
        }
        if (height < minHeight) {
            height = minHeight
            width = height * ratio
        }

        // Enforce max size
        if (displayRatio > ratio) {
            if (width > maxWidth) {
                width = maxWidth
                height = width / ratio
            }
        } else {
            if (height > maxHeight) {
                height = maxHeight
                width = height * ratio
            }
        }

        currentWidthScale = ((width - selectedViewMinSize) / binding.seekBarWidth.max.toFloat()).coerceIn(0f, 1f)
        binding.seekBarWidth.progress = (currentWidthScale * binding.seekBarWidth.max).toInt()
        binding.textWidth.text = (binding.seekBarWidth.max * currentWidthScale + selectedViewMinSize).toInt().toString()

        currentHeightScale = ((height - selectedViewMinSize) / binding.seekBarHeight.max.toFloat()).coerceIn(0f, 1f)
        binding.seekBarHeight.progress = (currentHeightScale * binding.seekBarHeight.max).toInt()
        binding.textHeight.text = (binding.seekBarHeight.max * currentHeightScale + selectedViewMinSize).toInt().toString()
    }

    private fun LayoutComponent.supportsAspectRatioSelection(): Boolean {
        return this == LayoutComponent.TOP_SCREEN || this == LayoutComponent.BOTTOM_SCREEN
    }

    /**
     * Allows an [AlertDialog] to be shown on a window that is not the main application window. This is required when the layout editor is being shown on a secondary display.
     */
    private fun AlertDialog.Builder.showInCurrentWindow(): AlertDialog {
        val dialog = create()
        dialog.window?.apply {
            setType(WindowManager.LayoutParams.TYPE_APPLICATION_ATTACHED_DIALOG)
            attributes.token = this@LayoutEditorManagerView.windowToken
        }
        dialog.show()
        return dialog
    }
}
