package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kt4  reason: default package */
/* loaded from: classes.dex */
public final class kt4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ kt4[] $VALUES;
    public static final kt4 CounterClockwise = new kt4("CounterClockwise", 0);
    public static final kt4 Clockwise = new kt4("Clockwise", 1);

    private static final /* synthetic */ kt4[] $values() {
        return new kt4[]{CounterClockwise, Clockwise};
    }

    static {
        kt4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private kt4(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static kt4 valueOf(String str) {
        return (kt4) Enum.valueOf(kt4.class, str);
    }

    public static kt4[] values() {
        return (kt4[]) $VALUES.clone();
    }
}
