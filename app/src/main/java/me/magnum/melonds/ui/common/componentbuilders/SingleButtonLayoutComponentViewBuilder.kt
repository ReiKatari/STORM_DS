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

    override fun getAspectRatio() = 1f
}