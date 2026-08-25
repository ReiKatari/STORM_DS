package me.magnum.melonds.domain.model.layout

import java.util.UUID

data class LayoutConfiguration(
    val id: UUID?,
    val name: String?,
    val type: LayoutType,
    val orientation: LayoutOrientation,
    val useCustomOpacity: Boolean,
    val opacity: Int,
    val layoutVariants: Map<UILayoutVariant, UILayout>,
) {

    companion object {
        val DEFAULT_ID = UUID(0, 0)
        val EVEN_LANDSCAPE_ID = UUID(0, 1)
        val UNEVEN_LANDSCAPE_ID = UUID(0, 2)
        val EVEN_PORTRAIT_ID = UUID(0, 3)
        val PROPORTIONAL_LANDSCAPE_ID = UUID(0, 4)
        val FULLSCREEN_LANDSCAPE_ID = UUID(0, 5)

        fun newCustom(): LayoutConfiguration {
            return LayoutConfiguration(
                id = null,
                name = null,
                type = LayoutType.CUSTOM,
                orientation = LayoutOrientation.FOLLOW_SYSTEM,
                useCustomOpacity = false,
                opacity = 50,
                layoutVariants = emptyMap(),
            )
        }
    }

    // Empty constructor to include defaults that help in migrations
    constructor() : this(null, null, LayoutType.CUSTOM, LayoutOrientation.FOLLOW_SYSTEM, false, 50, emptyMap())

    enum class LayoutType {
        DEFAULT,
        CUSTOM
    }

    enum class LayoutOrientation {
        FOLLOW_SYSTEM,
        PORTRAIT,
        LANDSCAPE
    }
}