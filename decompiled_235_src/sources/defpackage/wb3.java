package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wb3  reason: default package */
/* loaded from: classes.dex */
public final class wb3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ wb3[] $VALUES;
    public static final wb3 LookaheadMeasurement = new wb3("LookaheadMeasurement", 0);
    public static final wb3 LookaheadPlacement = new wb3("LookaheadPlacement", 1);
    public static final wb3 Measurement = new wb3("Measurement", 2);
    public static final wb3 Placement = new wb3("Placement", 3);

    private static final /* synthetic */ wb3[] $values() {
        return new wb3[]{LookaheadMeasurement, LookaheadPlacement, Measurement, Placement};
    }

    static {
        wb3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private wb3(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static wb3 valueOf(String str) {
        return (wb3) Enum.valueOf(wb3.class, str);
    }

    public static wb3[] values() {
        return (wb3[]) $VALUES.clone();
    }
}
