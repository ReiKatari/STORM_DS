package hh;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d PAUSE_MENU = new d("PAUSE_MENU", 0);
    public static final d REWIND_WINDOW = new d("REWIND_WINDOW", 1);
    public static final d SAVE_STATES_DIALOG = new d("SAVE_STATES_DIALOG", 2);
    public static final d ROM_LOAD_ERROR_DIALOG = new d("ROM_LOAD_ERROR_DIALOG", 3);
    public static final d FIRMWARE_LOAD_ERROR_DIALOG = new d("FIRMWARE_LOAD_ERROR_DIALOG", 4);
    public static final d ROM_NOT_FOUND_DIALOG = new d("ROM_NOT_FOUND_DIALOG", 5);
    public static final d SWITCH_NEW_ROM_DIALOG = new d("SWITCH_NEW_ROM_DIALOG", 6);
    public static final d ACHIEVEMENTS_DIALOG = new d("ACHIEVEMENTS_DIALOG", 7);
    public static final d PENDING_SUBMISSION_CONFIRM_EXIT = new d("PENDING_SUBMISSION_CONFIRM_EXIT", 8);

    private static final /* synthetic */ d[] $values() {
        return new d[]{PAUSE_MENU, REWIND_WINDOW, SAVE_STATES_DIALOG, ROM_LOAD_ERROR_DIALOG, FIRMWARE_LOAD_ERROR_DIALOG, ROM_NOT_FOUND_DIALOG, SWITCH_NEW_ROM_DIALOG, ACHIEVEMENTS_DIALOG, PENDING_SUBMISSION_CONFIRM_EXIT};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private d(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
