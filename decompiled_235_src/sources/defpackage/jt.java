package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jt  reason: default package */
/* loaded from: classes.dex */
public final class jt {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ jt[] $VALUES;
    public static final jt PRODUCTION = new jt("PRODUCTION", 0);
    public static final jt NIGHTLY = new jt("NIGHTLY", 1);

    private static final /* synthetic */ jt[] $values() {
        return new jt[]{PRODUCTION, NIGHTLY};
    }

    static {
        jt[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private jt(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static jt valueOf(String str) {
        return (jt) Enum.valueOf(jt.class, str);
    }

    public static jt[] values() {
        return (jt[]) $VALUES.clone();
    }
}
