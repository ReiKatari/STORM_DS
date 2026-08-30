package j0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c2 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ c2[] $VALUES;
    public static final c2 FEATURE_COMBINATION_TABLE = new c2("FEATURE_COMBINATION_TABLE", 0);
    public static final c2 CAPTURE_SESSION_TABLES = new c2("CAPTURE_SESSION_TABLES", 1);

    private static final /* synthetic */ c2[] $values() {
        return new c2[]{FEATURE_COMBINATION_TABLE, CAPTURE_SESSION_TABLES};
    }

    static {
        c2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private c2(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static c2 valueOf(String str) {
        return (c2) Enum.valueOf(c2.class, str);
    }

    public static c2[] values() {
        return (c2[]) $VALUES.clone();
    }
}
