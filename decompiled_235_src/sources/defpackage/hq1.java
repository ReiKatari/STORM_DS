package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hq1  reason: default package */
/* loaded from: classes.dex */
public final class hq1 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ hq1[] $VALUES;
    public static final hq1 BOTH = new hq1("BOTH", 0);
    public static final hq1 TOP = new hq1("TOP", 1);
    public static final hq1 BOTTOM = new hq1("BOTTOM", 2);

    private static final /* synthetic */ hq1[] $values() {
        return new hq1[]{BOTH, TOP, BOTTOM};
    }

    static {
        hq1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private hq1(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static hq1 valueOf(String str) {
        return (hq1) Enum.valueOf(hq1.class, str);
    }

    public static hq1[] values() {
        return (hq1[]) $VALUES.clone();
    }
}
