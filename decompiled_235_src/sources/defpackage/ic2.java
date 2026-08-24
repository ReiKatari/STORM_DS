package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ic2  reason: default package */
/* loaded from: classes.dex */
public final class ic2 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ic2[] $VALUES;
    public static final ic2 TOP_DOWN = new ic2("TOP_DOWN", 0);
    public static final ic2 BOTTOM_UP = new ic2("BOTTOM_UP", 1);

    private static final /* synthetic */ ic2[] $values() {
        return new ic2[]{TOP_DOWN, BOTTOM_UP};
    }

    static {
        ic2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ic2(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ic2 valueOf(String str) {
        return (ic2) Enum.valueOf(ic2.class, str);
    }

    public static ic2[] values() {
        return (ic2[]) $VALUES.clone();
    }
}
