package y3;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y0 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ y0[] $VALUES;
    public static final y0 Min = new y0("Min", 0);
    public static final y0 Max = new y0("Max", 1);

    private static final /* synthetic */ y0[] $values() {
        return new y0[]{Min, Max};
    }

    static {
        y0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private y0(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static y0 valueOf(String str) {
        return (y0) Enum.valueOf(y0.class, str);
    }

    public static y0[] values() {
        return (y0[]) $VALUES.clone();
    }
}
