package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ts1  reason: default package */
/* loaded from: classes.dex */
public final class ts1 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ts1[] $VALUES;
    public static final ts1 PAUSE_MENU = new ts1("PAUSE_MENU", 0);
    public static final ts1 REWIND_WINDOW = new ts1("REWIND_WINDOW", 1);
    public static final ts1 SAVE_STATES_DIALOG = new ts1("SAVE_STATES_DIALOG", 2);
    public static final ts1 ROM_LOAD_ERROR_DIALOG = new ts1("ROM_LOAD_ERROR_DIALOG", 3);
    public static final ts1 FIRMWARE_LOAD_ERROR_DIALOG = new ts1("FIRMWARE_LOAD_ERROR_DIALOG", 4);
    public static final ts1 ROM_NOT_FOUND_DIALOG = new ts1("ROM_NOT_FOUND_DIALOG", 5);
    public static final ts1 SWITCH_NEW_ROM_DIALOG = new ts1("SWITCH_NEW_ROM_DIALOG", 6);
    public static final ts1 ACHIEVEMENTS_DIALOG = new ts1("ACHIEVEMENTS_DIALOG", 7);
    public static final ts1 PENDING_SUBMISSION_CONFIRM_EXIT = new ts1("PENDING_SUBMISSION_CONFIRM_EXIT", 8);
    public static final ts1 RA_PENDING_EXIT = new ts1("RA_PENDING_EXIT", 9);
    public static final ts1 RA_PENDING_SYNC = new ts1("RA_PENDING_SYNC", 10);
    public static final ts1 PRESETS_DIALOG = new ts1("PRESETS_DIALOG", 11);

    private static final /* synthetic */ ts1[] $values() {
        return new ts1[]{PAUSE_MENU, REWIND_WINDOW, SAVE_STATES_DIALOG, ROM_LOAD_ERROR_DIALOG, FIRMWARE_LOAD_ERROR_DIALOG, ROM_NOT_FOUND_DIALOG, SWITCH_NEW_ROM_DIALOG, ACHIEVEMENTS_DIALOG, PENDING_SUBMISSION_CONFIRM_EXIT, RA_PENDING_EXIT, RA_PENDING_SYNC, PRESETS_DIALOG};
    }

    static {
        ts1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private ts1(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ts1 valueOf(String str) {
        return (ts1) Enum.valueOf(ts1.class, str);
    }

    public static ts1[] values() {
        return (ts1[]) $VALUES.clone();
    }
}
