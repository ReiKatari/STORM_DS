package me.magnum.melonds.ui.common.componentbuilders

import android.content.Context
import android.view.View
import me.magnum.melonds.domain.model.layout.LayoutComponent
import me.magnum.melonds.ui.common.LayoutComponentViewBuilder
import me.magnum.melonds.ui.common.views.ModernSingleButtonView

class SingleButtonLayoutComponentViewBuilder(private val layoutComponent: LayoutComponent) : LayoutComponentViewBuilder() {
    override fun build(context: Context): View {
        return ModernSingleButtonView(context, layoutComponent)
    }

    override fun getAspectRatio(): Float {
        return when (layoutComponent) {
            LayoutComponent.BUTTON_START, LayoutComponent.BUTTON_SELECT -> 1.8f
            LayoutComponent.BUTTON_L, LayoutComponent.BUTTON_R -> 1.25f
            else -> 1.0f
        }
    }
}