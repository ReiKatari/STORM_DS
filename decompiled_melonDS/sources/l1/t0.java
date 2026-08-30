package l1;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t0 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ t0[] $VALUES;
    public static final t0 Min = new t0("Min", 0);
    public static final t0 Max = new t0("Max", 1);

    private static final /* synthetic */ t0[] $values() {
        return new t0[]{Min, Max};
    }

    static {
        t0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private t0(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) $VALUES.clone();
    }
}
