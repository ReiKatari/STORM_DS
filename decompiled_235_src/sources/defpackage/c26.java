package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c26  reason: default package */
/* loaded from: classes.dex */
public final class c26 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ c26[] $VALUES;
    public static final c26 PATH = new c26("PATH", 0);
    public static final c26 QUERY = new c26("QUERY", 1);

    private static final /* synthetic */ c26[] $values() {
        return new c26[]{PATH, QUERY};
    }

    static {
        c26[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private c26(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static c26 valueOf(String str) {
        return (c26) Enum.valueOf(c26.class, str);
    }

    public static c26[] values() {
        return (c26[]) $VALUES.clone();
    }
}
