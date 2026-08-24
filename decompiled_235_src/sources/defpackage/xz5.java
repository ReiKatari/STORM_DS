package defpackage;

import com.stormds.emulator.R;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xz5  reason: default package */
/* loaded from: classes.dex */
public final class xz5 implements nu4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ xz5[] $VALUES;
    private final int textResource;
    public static final xz5 SETTINGS = new xz5("SETTINGS", 0, R.string.settings);
    public static final xz5 ROM_SETTINGS = new xz5("ROM_SETTINGS", 1, R.string.rom_settings);
    public static final xz5 SAVE_STATE = new xz5("SAVE_STATE", 2, R.string.save_state);
    public static final xz5 LOAD_STATE = new xz5("LOAD_STATE", 3, R.string.load_state);
    public static final xz5 REWIND = new xz5("REWIND", 4, R.string.rewind);
    public static final xz5 CHEATS = new xz5("CHEATS", 5, R.string.cheats);
    public static final xz5 VIEW_ACHIEVEMENTS = new xz5("VIEW_ACHIEVEMENTS", 6, R.string.achievements);
    public static final xz5 SYNC_RETRO_ACHIEVEMENTS = new xz5("SYNC_RETRO_ACHIEVEMENTS", 7, R.string.ra_pending_sync_menu);
    public static final xz5 PRESETS = new xz5("PRESETS", 8, R.string.presets);
    public static final xz5 RENDERER_DEBUG = new xz5("RENDERER_DEBUG", 9, R.string.renderer_debug_menu);
    public static final xz5 RESET = new xz5("RESET", 10, R.string.reset);
    public static final xz5 EXIT = new xz5("EXIT", 11, R.string.exit);

    private static final /* synthetic */ xz5[] $values() {
        return new xz5[]{SETTINGS, ROM_SETTINGS, SAVE_STATE, LOAD_STATE, REWIND, CHEATS, VIEW_ACHIEVEMENTS, SYNC_RETRO_ACHIEVEMENTS, PRESETS, RENDERER_DEBUG, RESET, EXIT};
    }

    static {
        xz5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private xz5(String str, int i, int i2) {
        this.textResource = i2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static xz5 valueOf(String str) {
        return (xz5) Enum.valueOf(xz5.class, str);
    }

    public static xz5[] values() {
        return (xz5[]) $VALUES.clone();
    }

    @Override // defpackage.nu4
    public int getTextResource() {
        return this.textResource;
    }
}
