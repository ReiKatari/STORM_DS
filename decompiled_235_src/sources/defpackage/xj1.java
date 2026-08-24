package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xj1  reason: default package */
/* loaded from: classes.dex */
public final class xj1 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ xj1[] $VALUES;
    public static final xj1 OK = new xj1("OK", 0);
    public static final xj1 READ_ONLY = new xj1("READ_ONLY", 1);
    public static final xj1 NOT_FOUND = new xj1("NOT_FOUND", 2);

    private static final /* synthetic */ xj1[] $values() {
        return new xj1[]{OK, READ_ONLY, NOT_FOUND};
    }

    static {
        xj1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private xj1(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static xj1 valueOf(String str) {
        return (xj1) Enum.valueOf(xj1.class, str);
    }

    public static xj1[] values() {
        return (xj1[]) $VALUES.clone();
    }
}
