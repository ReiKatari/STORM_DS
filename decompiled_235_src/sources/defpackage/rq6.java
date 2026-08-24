package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rq6  reason: default package */
/* loaded from: classes.dex */
public final class rq6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ rq6[] $VALUES;
    public static final rq6 Unknown = new rq6("Unknown", 0);
    public static final rq6 Fixed = new rq6("Fixed", 1);
    public static final rq6 NotApplicable = new rq6("NotApplicable", 2);
    public static final rq6 NotFixed = new rq6("NotFixed", 3);

    private static final /* synthetic */ rq6[] $values() {
        return new rq6[]{Unknown, Fixed, NotApplicable, NotFixed};
    }

    static {
        rq6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private rq6(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static rq6 valueOf(String str) {
        return (rq6) Enum.valueOf(rq6.class, str);
    }

    public static rq6[] values() {
        return (rq6[]) $VALUES.clone();
    }
}
