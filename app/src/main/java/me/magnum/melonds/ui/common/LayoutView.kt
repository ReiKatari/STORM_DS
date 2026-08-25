package me.magnum.melonds.ui.common

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import me.magnum.melonds.domain.model.layout.LayoutComponent
import me.magnum.melonds.domain.model.layout.PositionedLayoutComponent
import me.magnum.melonds.domain.model.layout.UILayout
import me.magnum.melonds.ui.layouteditor.model.LayoutTarget

open class LayoutView(context: Context, attrs: AttributeSet?) : FrameLayout(context, attrs) {

    protected lateinit var viewBuilderFactory: LayoutComponentViewBuilderFactory
    protected val views = mutableMapOf<LayoutComponent, LayoutComponentView>()

    init {
        layoutDirection = LAYOUT_DIRECTION_LTR
    }

    fun setLayoutComponentViewBuilderFactory(factory: LayoutComponentViewBuilderFactory) {
        viewBuilderFactory = factory
    }

    open fun instantiateLayout(layoutConfiguration: UILayout, layoutTarget: LayoutTarget = LayoutTarget.MAIN_SCREEN) {
        destroyLayout()
        loadLayout(layoutConfiguration, layoutTarget)
    }

    fun destroyLayout() {
        views.clear()
        removeAllViews()
    }

    fun getInstantiatedComponents(): List<LayoutComponent> {
        return views.keys.toList()
    }

    fun getLayoutComponentViews(): List<LayoutComponentView> {
        return views.values.toList()
    }

    fun getLayoutComponentView(layoutComponent: LayoutComponent): LayoutComponentView? {
        return views[layoutComponent]
    }

    private fun loadLayout(layout: UILayout, layoutTarget: LayoutTarget) {
        val components = when(layoutTarget) {
            LayoutTarget.MAIN_SCREEN -> layout.mainScreenLayout.components
            LayoutTarget.SECONDARY_SCREEN -> layout.secondaryScreenLayout.components
        }
        if (components == null) return

        val screens = components.filter { it.isScreen() }.sortedBy { if (it.onTop) 0 else 1 }
        val others = components.filterNot { it.isScreen() }

        (screens + others).forEach {
            views[it.component] = addPositionedLayoutComponent(it)
        }
    }

    protected fun addPositionedLayoutComponent(layoutComponent: PositionedLayoutComponent): LayoutComponentView {
        val viewBuilder = viewBuilderFactory.getLayoutComponentViewBuilder(layoutComponent.component)
        val view = viewBuilder.build(context)

        val viewParams = LayoutParams(layoutComponent.rect.width, layoutComponent.rect.height).apply {
            leftMargin = layoutComponent.rect.x
            topMargin = layoutComponent.rect.y
        }

        val viewLayoutComponent = LayoutComponentView(view, viewBuilder.getAspectRatio(), layoutComponent.component).apply {
            baseAlpha = layoutComponent.alpha
            setHighlighted(false)
            onTop = layoutComponent.onTop
        }

        if (layoutComponent.isScreen()) {
            // Screens should be below other views
            addView(view, 0, viewParams)
        } else {
            addView(view, viewParams)
        }

        onLayoutComponentViewAdded(viewLayoutComponent)
        return viewLayoutComponent
    }

    fun updateComponentRect(layoutComponent: LayoutComponent, rect: me.magnum.melonds.domain.model.Rect?) {
        val componentView = views[layoutComponent] ?: return
        val v = componentView.view
        val lp = v.layoutParams as? LayoutParams ?: LayoutParams(0, 0)
        if (rect != null && rect.width > 0 && rect.height > 0) {
            lp.width = rect.width
            lp.height = rect.height
            lp.leftMargin = rect.x
            lp.topMargin = rect.y
            v.layoutParams = lp
            v.visibility = android.view.View.VISIBLE
        } else {
            lp.width = 0
            lp.height = 0
            v.layoutParams = lp
            v.visibility = android.view.View.GONE
        }
    }

    protected open fun onLayoutComponentViewAdded(layoutComponentView: LayoutComponentView) {
    }
}