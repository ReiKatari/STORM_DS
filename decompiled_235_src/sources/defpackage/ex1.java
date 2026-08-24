package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ex1  reason: default package */
/* loaded from: classes.dex */
public final class ex1 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ex1[] $VALUES;
    public static final ex1 PAUSE_MENU = new ex1("PAUSE_MENU", 0);
    public static final ex1 REWIND_WINDOW = new ex1("REWIND_WINDOW", 1);
    public static final ex1 SAVE_STATES_DIALOG = new ex1("SAVE_STATES_DIALOG", 2);
    public static final ex1 ROM_LOAD_ERROR_DIALOG = new ex1("ROM_LOAD_ERROR_DIALOG", 3);
    public static final ex1 FIRMWARE_LOAD_ERROR_DIALOG = new ex1("FIRMWARE_LOAD_ERROR_DIALOG", 4);
    public static final ex1 ROM_NOT_FOUND_DIALOG = new ex1("ROM_NOT_FOUND_DIALOG", 5);
    public static final ex1 SWITCH_NEW_ROM_DIALOG = new ex1("SWITCH_NEW_ROM_DIALOG", 6);
    public static final ex1 ACHIEVEMENTS_DIALOG = new ex1("ACHIEVEMENTS_DIALOG", 7);
    public static final ex1 PENDING_SUBMISSION_CONFIRM_EXIT = new ex1("PENDING_SUBMISSION_CONFIRM_EXIT", 8);
    public static final ex1 RA_PENDING_EXIT = new ex1("RA_PENDING_EXIT", 9);
    public static final ex1 RA_PENDING_SYNC = new ex1("RA_PENDING_SYNC", 10);
    public static final ex1 PRESETS_DIALOG = new ex1("PRESETS_DIALOG", 11);

    private static final /* synthetic */ ex1[] $values() {
        return new ex1[]{PAUSE_MENU, REWIND_WINDOW, SAVE_STATES_DIALOG, ROM_LOAD_ERROR_DIALOG, FIRMWARE_LOAD_ERROR_DIALOG, ROM_NOT_FOUND_DIALOG, SWITCH_NEW_ROM_DIALOG, ACHIEVEMENTS_DIALOG, PENDING_SUBMISSION_CONFIRM_EXIT, RA_PENDING_EXIT, RA_PENDING_SYNC, PRESETS_DIALOG};
    }

    static {
        ex1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ex1(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ex1 valueOf(String str) {
        return (ex1) Enum.valueOf(ex1.class, str);
    }

    public static ex1[] values() {
        return (ex1[]) $VALUES.clone();
    }
}
