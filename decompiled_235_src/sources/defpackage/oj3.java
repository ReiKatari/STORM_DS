package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oj3  reason: default package */
/* loaded from: classes.dex */
public final class oj3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ oj3[] $VALUES;
    public static final oj3 SIZE = new oj3("SIZE", 0);
    public static final oj3 WIDTH = new oj3("WIDTH", 1);
    public static final oj3 HEIGHT = new oj3("HEIGHT", 2);

    private static final /* synthetic */ oj3[] $values() {
        return new oj3[]{SIZE, WIDTH, HEIGHT};
    }

    static {
        oj3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private oj3(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static oj3 valueOf(String str) {
        return (oj3) Enum.valueOf(oj3.class, str);
    }

    public static oj3[] values() {
        return (oj3[]) $VALUES.clone();
    }
}
