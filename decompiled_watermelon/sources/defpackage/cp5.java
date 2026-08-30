package defpackage;

import me.magnum.melondualds.R;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cp5  reason: default package */
/* loaded from: classes.dex */
public final class cp5 implements ll4 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ cp5[] $VALUES;
    private final int textResource;
    public static final cp5 SETTINGS = new cp5("SETTINGS", 0, R.string.settings);
    public static final cp5 ROM_SETTINGS = new cp5("ROM_SETTINGS", 1, R.string.rom_settings);
    public static final cp5 SAVE_STATE = new cp5("SAVE_STATE", 2, R.string.save_state);
    public static final cp5 LOAD_STATE = new cp5("LOAD_STATE", 3, R.string.load_state);
    public static final cp5 REWIND = new cp5("REWIND", 4, R.string.rewind);
    public static final cp5 CHEATS = new cp5("CHEATS", 5, R.string.cheats);
    public static final cp5 VIEW_ACHIEVEMENTS = new cp5("VIEW_ACHIEVEMENTS", 6, R.string.achievements);
    public static final cp5 SYNC_RETRO_ACHIEVEMENTS = new cp5("SYNC_RETRO_ACHIEVEMENTS", 7, R.string.ra_pending_sync_menu);
    public static final cp5 PRESETS = new cp5("PRESETS", 8, R.string.presets);
    public static final cp5 RENDERER_DEBUG = new cp5("RENDERER_DEBUG", 9, R.string.renderer_debug_menu);
    public static final cp5 RESET = new cp5("RESET", 10, R.string.reset);
    public static final cp5 EXIT = new cp5("EXIT", 11, R.string.exit);

    private static final /* synthetic */ cp5[] $values() {
        return new cp5[]{SETTINGS, ROM_SETTINGS, SAVE_STATE, LOAD_STATE, REWIND, CHEATS, VIEW_ACHIEVEMENTS, SYNC_RETRO_ACHIEVEMENTS, PRESETS, RENDERER_DEBUG, RESET, EXIT};
    }

    static {
        cp5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private cp5(String str, int i, int i2) {
        this.textResource = i2;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static cp5 valueOf(String str) {
        return (cp5) Enum.valueOf(cp5.class, str);
    }

    public static cp5[] values() {
        return (cp5[]) $VALUES.clone();
    }

    @Override // defpackage.ll4
    public int getTextResource() {
        return this.textResource;
    }
}
