package a4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v1 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ v1[] $VALUES;
    public static final v1 Min = new v1("Min", 0);
    public static final v1 Max = new v1("Max", 1);

    private static final /* synthetic */ v1[] $values() {
        return new v1[]{Min, Max};
    }

    static {
        v1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private v1(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static v1 valueOf(String str) {
        return (v1) Enum.valueOf(v1.class, str);
    }

    public static v1[] values() {
        return (v1[]) $VALUES.clone();
    }
}
