package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xv5  reason: default package */
/* loaded from: classes.dex */
public final class xv5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ xv5[] $VALUES;
    public static final xv5 MISSING_FROM_CURRENT_SET = new xv5("MISSING_FROM_CURRENT_SET", 0);
    public static final xv5 DEFINITION_CHANGED = new xv5("DEFINITION_CHANGED", 1);
    public static final xv5 NOT_IN_PREFETCH_CACHE = new xv5("NOT_IN_PREFETCH_CACHE", 2);
    public static final xv5 SERVER_REJECTED = new xv5("SERVER_REJECTED", 3);

    private static final /* synthetic */ xv5[] $values() {
        return new xv5[]{MISSING_FROM_CURRENT_SET, DEFINITION_CHANGED, NOT_IN_PREFETCH_CACHE, SERVER_REJECTED};
    }

    static {
        xv5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private xv5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static xv5 valueOf(String str) {
        return (xv5) Enum.valueOf(xv5.class, str);
    }

    public static xv5[] values() {
        return (xv5[]) $VALUES.clone();
    }
}
