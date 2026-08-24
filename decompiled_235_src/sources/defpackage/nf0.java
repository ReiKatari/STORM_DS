package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nf0  reason: default package */
/* loaded from: classes.dex */
public final class nf0 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ nf0[] $VALUES;
    public static final nf0 AT_LEAST = new nf0("AT_LEAST", 0);
    public static final nf0 EXACT = new nf0("EXACT", 1);

    private static final /* synthetic */ nf0[] $values() {
        return new nf0[]{AT_LEAST, EXACT};
    }

    static {
        nf0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private nf0(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static nf0 valueOf(String str) {
        return (nf0) Enum.valueOf(nf0.class, str);
    }

    public static nf0[] values() {
        return (nf0[]) $VALUES.clone();
    }
}
