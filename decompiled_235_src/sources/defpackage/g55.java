package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g55  reason: default package */
/* loaded from: classes.dex */
public final class g55 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ g55[] $VALUES;
    public static final g55 ACCEPTABLE = new g55("ACCEPTABLE", 0);
    public static final g55 OPTIONAL = new g55("OPTIONAL", 1);
    public static final g55 COLLECTION = new g55("COLLECTION", 2);
    public static final g55 LIST_ELEMENT = new g55("LIST_ELEMENT", 3);
    public static final g55 NOT_NULL = new g55("NOT_NULL", 4);

    private static final /* synthetic */ g55[] $values() {
        return new g55[]{ACCEPTABLE, OPTIONAL, COLLECTION, LIST_ELEMENT, NOT_NULL};
    }

    static {
        g55[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private g55(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static g55 valueOf(String str) {
        return (g55) Enum.valueOf(g55.class, str);
    }

    public static g55[] values() {
        return (g55[]) $VALUES.clone();
    }
}
