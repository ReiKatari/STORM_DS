package me.magnum.melonds.ui.emulator.rom

import me.magnum.melonds.R
import me.magnum.melonds.ui.emulator.PauseMenuOption

enum class RomPauseMenuOption(override val textResource: Int) : PauseMenuOption {
    SETTINGS(R.string.settings),
    ROM_SETTINGS(R.string.rom_settings),
    SAVE_STATE(R.string.save_state),
    LOAD_STATE(R.string.load_state),
    QUICK_SLOT_CAROUSEL(R.string.quick_slot_carousel_title),
    LOAD_PERIODIC_AUTOSAVE(R.string.load_periodic_auto_save),
    TAKE_SCREENSHOT(R.string.take_clean_screenshot),
    SLOW_MOTION(R.string.slow_motion_toggle),
    FRAME_ADVANCE(R.string.frame_advance_step),
    REWIND(R.string.rewind),
    CHEATS(R.string.cheats),
    VIEW_ACHIEVEMENTS(R.string.achievements),
    SYNC_RETRO_ACHIEVEMENTS(R.string.ra_pending_sync_menu),
    CALIBRATE_GYRO(R.string.input_gyro_recenter_quick_action),
    PRESETS(R.string.presets),
    SCREEN_LAYOUT(R.string.screen_layout),
    RENDERER_DEBUG(R.string.renderer_debug_menu),
    RESET_COMPATIBILITY(R.string.compat_reset_safe_mode),
    RESET(R.string.reset),
    EXIT(R.string.exit)
}
