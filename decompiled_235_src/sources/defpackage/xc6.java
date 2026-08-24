package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xc6  reason: default package */
/* loaded from: classes.dex */
public final class xc6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ xc6[] $VALUES;
    public static final xc6 PENDING = new xc6("PENDING", 0);
    public static final xc6 CREATING = new xc6("CREATING", 1);
    public static final xc6 CREATED = new xc6("CREATED", 2);

    private static final /* synthetic */ xc6[] $values() {
        return new xc6[]{PENDING, CREATING, CREATED};
    }

    static {
        xc6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private xc6(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static xc6 valueOf(String str) {
        return (xc6) Enum.valueOf(xc6.class, str);
    }

    public static xc6[] values() {
        return (xc6[]) $VALUES.clone();
    }
}
