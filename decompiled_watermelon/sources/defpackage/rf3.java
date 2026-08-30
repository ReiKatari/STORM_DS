package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rf3  reason: default package */
/* loaded from: classes.dex */
public final class rf3 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ rf3[] $VALUES;
    public static final rf3 Measuring = new rf3("Measuring", 0);
    public static final rf3 LookaheadMeasuring = new rf3("LookaheadMeasuring", 1);
    public static final rf3 LayingOut = new rf3("LayingOut", 2);
    public static final rf3 LookaheadLayingOut = new rf3("LookaheadLayingOut", 3);
    public static final rf3 Idle = new rf3("Idle", 4);

    private static final /* synthetic */ rf3[] $values() {
        return new rf3[]{Measuring, LookaheadMeasuring, LayingOut, LookaheadLayingOut, Idle};
    }

    static {
        rf3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private rf3(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static rf3 valueOf(String str) {
        return (rf3) Enum.valueOf(rf3.class, str);
    }

    public static rf3[] values() {
        return (rf3[]) $VALUES.clone();
    }
}
