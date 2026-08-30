package y3;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w Min = new w("Min", 0);
    public static final w Max = new w("Max", 1);

    private static final /* synthetic */ w[] $values() {
        return new w[]{Min, Max};
    }

    static {
        w[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private w(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}
