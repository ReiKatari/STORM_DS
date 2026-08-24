package me.magnum.melonds.impl.layout

import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.distinctUntilChanged
import me.magnum.melonds.domain.model.Point
import me.magnum.melonds.domain.model.Rect
import me.magnum.melonds.domain.model.layout.Insets
import me.magnum.melonds.domain.model.layout.LayoutConfiguration
import me.magnum.melonds.domain.model.layout.LayoutDisplayPair
import me.magnum.melonds.domain.model.layout.ScreenFold
import me.magnum.melonds.domain.model.layout.ScreenLayout
import me.magnum.melonds.domain.model.layout.UILayout
import me.magnum.melonds.domain.model.layout.UILayoutVariant
import me.magnum.melonds.domain.model.ui.Orientation
import kotlin.time.Duration.Companion.milliseconds

@OptIn(FlowPreview::class)
class UILayoutProvider(private val defaultLayoutProvider: DefaultLayoutProvider) {

    private val currentUiSize = MutableStateFlow<Point?>(null)
    private val currentUiInsets = MutableStateFlow<Insets>(Insets.Zero)
    private val currentOrientation = MutableStateFlow<Orientation?>(null)
    private val currentFolds = MutableStateFlow<List<ScreenFold>>(emptyList())
    private val currentDisplays = MutableStateFlow<LayoutDisplayPair?>(null)

    private val currentLayoutVariant = combine(currentUiSize, currentUiInsets, currentOrientation, currentFolds, currentDisplays) { size, insets, orientation, folds, displays ->
        val resolvedDisplays = displays ?: size?.let {
            LayoutDisplayPair(
                mainScreenDisplay = me.magnum.melonds.domain.model.layout.LayoutDisplay(
                    id = 0,
                    type = me.magnum.melonds.domain.model.layout.LayoutDisplay.Type.BUILT_IN,
                    width = it.x,
                    height = it.y,
                ),
                secondaryScreenDisplay = null,
            )
        }
        if (size == null || orientation == null || resolvedDisplays == null) {
            null
        } else {
            UILayoutVariant(size, insets, orientation, folds, resolvedDisplays)
        }
    }.distinctUntilChanged().debounce(50.milliseconds)

    private val _currentLayoutConfiguration = MutableStateFlow<LayoutConfiguration?>(null)

    val currentLayout = combine(_currentLayoutConfiguration, currentLayoutVariant) { layoutConfiguration, variant ->
        if (layoutConfiguration == null || variant == null) {
            null
        } else {
            variant to getOptimalLayoutForVariant(layoutConfiguration, variant)
        }
    }

    fun updateCurrentOrientation(orientation: Orientation) {
        currentOrientation.value = orientation
    }

    fun updateUiSize(width: Int, height: Int) {
        currentUiSize.value = Point(width, height)
    }

    fun updateUiInsets(insets: Insets) {
        currentUiInsets.value = insets
    }

    fun updateFolds(folds: List<ScreenFold>) {
        currentFolds.value = folds
    }

    fun updateDisplays(displays: LayoutDisplayPair) {
        currentDisplays.value = displays
    }

    fun setCurrentLayoutConfiguration(layoutConfiguration: LayoutConfiguration) {
        _currentLayoutConfiguration.value = layoutConfiguration
    }

    private fun getOptimalLayoutForVariant(layoutConfiguration: LayoutConfiguration, variant: UILayoutVariant): UILayout {
        val exactLayoutMatch = layoutConfiguration.layoutVariants[variant]
        if (exactLayoutMatch != null) {
            return populateLayoutIfRequired(exactLayoutMatch, variant)
        }

        val bestLayoutVariant = findSimilarLayoutVariant(layoutConfiguration, variant)
        if (bestLayoutVariant != null) {
            return populateLayoutIfRequired(bestLayoutVariant, variant)
        }

        return defaultLayoutProvider.buildDefaultLayout(variant)
    }

    /**
     * Populates the given [layout] with default components if they were not placed by the user.
     */
    private fun populateLayoutIfRequired(layout: UILayout, variant: UILayoutVariant): UILayout {
        val mainScreenRequiresDefaultLayout = layout.mainScreenLayout.components.isNullOrEmpty()
        val secondaryScreenRequiresDefaultLayout = layout.secondaryScreenLayout.components.isNullOrEmpty() && variant.displays.secondaryScreenDisplay != null
        val requiresDefaultLayout = mainScreenRequiresDefaultLayout || secondaryScreenRequiresDefaultLayout

        return if (requiresDefaultLayout) {
            val defaultLayout = defaultLayoutProvider.buildDefaultLayout(variant)
            val mainScreenLayout = if (mainScreenRequiresDefaultLayout) {
                layout.mainScreenLayout.copy(components = defaultLayout.mainScreenLayout.components)
            } else {
                layout.mainScreenLayout
            }
            val secondaryScreenLayout = if (secondaryScreenRequiresDefaultLayout) {
                layout.secondaryScreenLayout.copy(components = defaultLayout.secondaryScreenLayout.components)
            } else {
                layout.secondaryScreenLayout
            }
            UILayout(mainScreenLayout, secondaryScreenLayout)
        } else {
            layout
        }
    }

    /**
     * Attempts to find a layout variant compatible with the given [variant]. If an exact match isn't available, this method falls back to any variant that shares the same orientation, ignoring size differences.
     */
    private fun findSimilarLayoutVariant(
        layoutConfiguration: LayoutConfiguration,
        variant: UILayoutVariant,
    ): UILayout? {
        if (variant.displays.secondaryScreenDisplay != null) {
            // The device has 2 displays. Try to find an equal layout with the screens swapped. Strip remaining variant information since it only refers to the main screen
            val swappedDisplayVariant = variant.copy(
                uiSize = Point(),
                orientation = Orientation.PORTRAIT,
                folds = emptyList(),
                displays = variant.displays.copy(
                    mainScreenDisplay = variant.displays.secondaryScreenDisplay,
                    secondaryScreenDisplay = variant.displays.mainScreenDisplay,
                ),
            )
            val swappedDisplaysLayoutConfigurationVariants = layoutConfiguration.layoutVariants.map {
                it.key.copy(uiSize = Point(), orientation = Orientation.PORTRAIT, folds = emptyList()) to it.value
            }.toMap()
            val swappedDisplayMatch = swappedDisplaysLayoutConfigurationVariants[swappedDisplayVariant]
            if (swappedDisplayMatch != null) {
                // Swap the layouts so that they match the original configuration
                return swappedDisplayMatch.copy(
                    mainScreenLayout = swappedDisplayMatch.secondaryScreenLayout,
                    secondaryScreenLayout = swappedDisplayMatch.mainScreenLayout,
                )
            }

            // Try to find a similar secondary display configuration (same display type and size). Strip identifying information to compare display specs
            val strippedDisplayInformation = variant.displays.copy(
                secondaryScreenDisplay = variant.displays.secondaryScreenDisplay.copy(id = -1),
            )
            val strippedLayoutConfigurationVariants = layoutConfiguration.layoutVariants.map {
                val strippedDisplays = it.key.displays.copy(
                    secondaryScreenDisplay = it.key.displays.secondaryScreenDisplay?.copy(id = -1),
                )
                it.key.copy(displays = strippedDisplays) to it.value
            }.toMap()

            val simplifiedVariant = variant.copy(displays = strippedDisplayInformation)
            val equivalentMatch = strippedLayoutConfigurationVariants[simplifiedVariant]
            if (equivalentMatch != null) {
                return equivalentMatch
            }

            // Find a layout without a secondary display but with a comparable main screen configuration. Reuse the main screen config, but adjust screen components to match
            // the default layout
            val noSecondaryDisplayVariant = variant.copy(displays = variant.displays.copy(secondaryScreenDisplay = null))
            val noSecondaryDisplayMatch = layoutConfiguration.layoutVariants[noSecondaryDisplayVariant]
            if (noSecondaryDisplayMatch != null) {
                // Copy screen layouts from the default layout
                val defaultLayout = defaultLayoutProvider.buildDefaultLayout(variant)
                val mainScreenLayoutComponents = noSecondaryDisplayMatch.mainScreenLayout.components.orEmpty().toMutableList().apply {
                    removeAll { it.isScreen() }
                    defaultLayout.mainScreenLayout.components?.filter { it.isScreen() }?.let {
                        addAll(0, it)
                    }
                }
                val mainScreenLayout = noSecondaryDisplayMatch.mainScreenLayout.copy(components = mainScreenLayoutComponents)
                return noSecondaryDisplayMatch.copy(
                    mainScreenLayout = mainScreenLayout,
                    secondaryScreenLayout = defaultLayout.secondaryScreenLayout,
                )
            }
        }

        val bestVariant = layoutConfiguration.layoutVariants.entries.firstOrNull {
            it.key.orientation == variant.orientation && it.key.uiSize == variant.uiSize
        } ?: layoutConfiguration.layoutVariants.entries.firstOrNull {
            it.key.orientation == variant.orientation
        }
        if (bestVariant != null) {
            val sourceVariant = bestVariant.key
            val sourceLayout = bestVariant.value
            val defaultLayout = defaultLayoutProvider.buildDefaultLayout(variant)

            if (sourceVariant.uiSize == variant.uiSize && sourceVariant.uiInsets == variant.uiInsets) {
                // Ensure screen components are valid and not corrupted
                var hasCorruptedScreen = false
                val sanitizedComponents = sourceLayout.mainScreenLayout.components?.map { comp ->
                    if (comp.isScreen()) {
                        val defScreen = defaultLayout.mainScreenLayout.components?.firstOrNull { it.component == comp.component }
                        if (defScreen != null && (comp.rect.width < defScreen.rect.width * 0.75f || comp.rect.height < defScreen.rect.height * 0.75f)) {
                            hasCorruptedScreen = true
                            comp.copy(rect = defScreen.rect)
                        } else {
                            comp
                        }
                    } else {
                        comp
                    }
                }
                if (hasCorruptedScreen && sanitizedComponents != null) {
                    return sourceLayout.copy(mainScreenLayout = sourceLayout.mainScreenLayout.copy(components = sanitizedComponents))
                }
                return sourceLayout
            }
            if (sourceVariant.uiSize == variant.uiSize) {
                val rotatedInsets = with(sourceVariant.uiInsets) {
                    Insets(left = right, top = bottom, right = left, bottom = top)
                }
                if (rotatedInsets == variant.uiInsets) {
                    val offset = -sourceVariant.uiInsets.left + sourceVariant.uiInsets.right
                    val offsetComponents = sourceLayout.mainScreenLayout.components?.map {
                        it.copy(rect = it.rect.copy(x = it.rect.x + offset))
                    }
                    return sourceLayout.copy(mainScreenLayout = sourceLayout.mainScreenLayout.copy(components = offsetComponents))
                }
                return sourceLayout
            }

            // Proportional scaling so user customizations are never lost on window resizing or backgrounding
            val scaleX = if (sourceVariant.uiSize.x > 0) variant.uiSize.x.toFloat() / sourceVariant.uiSize.x else 1f
            val scaleY = if (sourceVariant.uiSize.y > 0) variant.uiSize.y.toFloat() / sourceVariant.uiSize.y else 1f
            val scaledComponents = sourceLayout.mainScreenLayout.components?.map { comp ->
                if (comp.isScreen()) {
                    val defaultScreenComp = defaultLayout.mainScreenLayout.components?.firstOrNull { it.component == comp.component }
                    if (defaultScreenComp != null) {
                        comp.copy(rect = defaultScreenComp.rect)
                    } else {
                        val scaledWidth = (comp.rect.width * scaleX).toInt()
                        val scaledHeight = (scaledWidth / me.magnum.melonds.domain.model.consoleAspectRatio).toInt()
                        val scaledX = (comp.rect.x * scaleX).toInt()
                        val scaledY = (comp.rect.y * scaleY).toInt()
                        comp.copy(rect = Rect(scaledX, scaledY, scaledWidth, scaledHeight))
                    }
                } else {
                    val scaledRect = Rect(
                        (comp.rect.x * scaleX).toInt(),
                        (comp.rect.y * scaleY).toInt(),
                        (comp.rect.width * scaleX).toInt(),
                        (comp.rect.height * scaleY).toInt()
                    )
                    comp.copy(rect = scaledRect)
                }
            }
            return sourceLayout.copy(mainScreenLayout = sourceLayout.mainScreenLayout.copy(components = scaledComponents))
        }

        return null
    }

    private fun getLayoutBoundingRect(layout: ScreenLayout): Rect? {
        if (layout.components.isNullOrEmpty()) {
            return null
        }

        var minX = Int.MAX_VALUE
        var minY = Int.MAX_VALUE
        var maxX = 0
        var maxY = 0

        layout.components.forEach {
            minX = minOf(minX, it.rect.x)
            minY = minOf(minY, it.rect.y)
            maxX = maxOf(maxX, it.rect.right)
            maxY = maxOf(maxY, it.rect.bottom)
        }

        val boundsWidth = maxX - minX
        val boundsHeight = maxY - minY
        return Rect(minX, minY, boundsWidth, boundsHeight)
    }
}
