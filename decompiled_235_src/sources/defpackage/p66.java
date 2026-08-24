package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p66  reason: default package */
/* loaded from: classes.dex */
public final class p66 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ p66[] $VALUES;
    public static final p66 TOP = new p66("TOP", 0);
    public static final p66 CENTER = new p66("CENTER", 1);
    public static final p66 BOTTOM = new p66("BOTTOM", 2);

    private static final /* synthetic */ p66[] $values() {
        return new p66[]{TOP, CENTER, BOTTOM};
    }

    static {
        p66[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private p66(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static p66 valueOf(String str) {
        return (p66) Enum.valueOf(p66.class, str);
    }

    public static p66[] values() {
        return (p66[]) $VALUES.clone();
    }
}
