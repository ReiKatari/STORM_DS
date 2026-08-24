package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: om3  reason: default package */
/* loaded from: classes.dex */
public final class om3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ om3[] $VALUES;
    public static final om3 Measuring = new om3("Measuring", 0);
    public static final om3 LookaheadMeasuring = new om3("LookaheadMeasuring", 1);
    public static final om3 LayingOut = new om3("LayingOut", 2);
    public static final om3 LookaheadLayingOut = new om3("LookaheadLayingOut", 3);
    public static final om3 Idle = new om3("Idle", 4);

    private static final /* synthetic */ om3[] $values() {
        return new om3[]{Measuring, LookaheadMeasuring, LayingOut, LookaheadLayingOut, Idle};
    }

    static {
        om3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private om3(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static om3 valueOf(String str) {
        return (om3) Enum.valueOf(om3.class, str);
    }

    public static om3[] values() {
        return (om3[]) $VALUES.clone();
    }
}
