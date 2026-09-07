package me.magnum.melonds.ui.layouteditor.model

import me.magnum.melonds.domain.model.layout.LayoutConfiguration
import me.magnum.melonds.domain.model.layout.UILayout
import me.magnum.melonds.domain.model.ui.Orientation

data class CurrentLayoutState(
    val layout: UILayout,
    val orientation: LayoutConfiguration.LayoutOrientation,
    val systemOrientation: Orientation = Orientation.PORTRAIT,
)