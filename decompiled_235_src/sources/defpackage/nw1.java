package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nw1  reason: default package */
/* loaded from: classes.dex */
public final class nw1 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ nw1[] $VALUES;
    public static final nw1 UNSUPPORTED = new nw1("UNSUPPORTED", 0);
    public static final nw1 INIT_FAILED = new nw1("INIT_FAILED", 1);

    private static final /* synthetic */ nw1[] $values() {
        return new nw1[]{UNSUPPORTED, INIT_FAILED};
    }

    static {
        nw1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private nw1(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static nw1 valueOf(String str) {
        return (nw1) Enum.valueOf(nw1.class, str);
    }

    public static nw1[] values() {
        return (nw1[]) $VALUES.clone();
    }
}
