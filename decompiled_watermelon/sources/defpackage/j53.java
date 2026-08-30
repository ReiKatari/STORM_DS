package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j53  reason: default package */
/* loaded from: classes.dex */
public final class j53 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ j53[] $VALUES;
    public static final j53 LookaheadMeasurement = new j53("LookaheadMeasurement", 0);
    public static final j53 LookaheadPlacement = new j53("LookaheadPlacement", 1);
    public static final j53 Measurement = new j53("Measurement", 2);
    public static final j53 Placement = new j53("Placement", 3);

    private static final /* synthetic */ j53[] $values() {
        return new j53[]{LookaheadMeasurement, LookaheadPlacement, Measurement, Placement};
    }

    static {
        j53[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private j53(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static j53 valueOf(String str) {
        return (j53) Enum.valueOf(j53.class, str);
    }

    public static j53[] values() {
        return (j53[]) $VALUES.clone();
    }
}
