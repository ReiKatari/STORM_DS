package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vl1  reason: default package */
/* loaded from: classes.dex */
public final class vl1 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ vl1[] $VALUES;
    public static final vl1 LOCAL = new vl1("LOCAL", 0);
    public static final vl1 DOCUMENT = new vl1("DOCUMENT", 1);

    private static final /* synthetic */ vl1[] $values() {
        return new vl1[]{LOCAL, DOCUMENT};
    }

    static {
        vl1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private vl1(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static vl1 valueOf(String str) {
        return (vl1) Enum.valueOf(vl1.class, str);
    }

    public static vl1[] values() {
        return (vl1[]) $VALUES.clone();
    }
}
