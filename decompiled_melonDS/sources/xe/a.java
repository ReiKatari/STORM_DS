package xe;

import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DISABLED_NOT_LOGGED_IN = new a("DISABLED_NOT_LOGGED_IN", 0);
    public static final a DISABLED_LOAD_ERROR = new a("DISABLED_LOAD_ERROR", 1);
    public static final a DISABLED_GAME_NOT_FOUND = new a("DISABLED_GAME_NOT_FOUND", 2);
    public static final a ENABLED_NO_ACHIEVEMENTS = new a("ENABLED_NO_ACHIEVEMENTS", 3);
    public static final a ENABLED_FULL = new a("ENABLED_FULL", 4);

    private static final /* synthetic */ a[] $values() {
        return new a[]{DISABLED_NOT_LOGGED_IN, DISABLED_LOAD_ERROR, DISABLED_GAME_NOT_FOUND, ENABLED_NO_ACHIEVEMENTS, ENABLED_FULL};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private a(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
