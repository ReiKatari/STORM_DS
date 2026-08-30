package a4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;
    public static final x LookaheadMeasurement = new x("LookaheadMeasurement", 0);
    public static final x LookaheadPlacement = new x("LookaheadPlacement", 1);
    public static final x Measurement = new x("Measurement", 2);
    public static final x Placement = new x("Placement", 3);

    private static final /* synthetic */ x[] $values() {
        return new x[]{LookaheadMeasurement, LookaheadPlacement, Measurement, Placement};
    }

    static {
        x[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private x(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }
}
