package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fv2  reason: default package */
/* loaded from: classes.dex */
public final class fv2 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ fv2[] $VALUES;
    public static final fv2 Cursor = new fv2("Cursor", 0);
    public static final fv2 SelectionStart = new fv2("SelectionStart", 1);
    public static final fv2 SelectionEnd = new fv2("SelectionEnd", 2);

    private static final /* synthetic */ fv2[] $values() {
        return new fv2[]{Cursor, SelectionStart, SelectionEnd};
    }

    static {
        fv2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private fv2(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static fv2 valueOf(String str) {
        return (fv2) Enum.valueOf(fv2.class, str);
    }

    public static fv2[] values() {
        return (fv2[]) $VALUES.clone();
    }
}
