package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f25  reason: default package */
/* loaded from: classes.dex */
public final class f25 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ f25[] $VALUES;
    public static final f25 MAIN = new f25("MAIN", 0);
    public static final f25 FILL_AREA = new f25("FILL_AREA", 1);
    public static final f25 VERTICAL_ALIGNMENT = new f25("VERTICAL_ALIGNMENT", 2);

    private static final /* synthetic */ f25[] $values() {
        return new f25[]{MAIN, FILL_AREA, VERTICAL_ALIGNMENT};
    }

    static {
        f25[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private f25(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static f25 valueOf(String str) {
        return (f25) Enum.valueOf(f25.class, str);
    }

    public static f25[] values() {
        return (f25[]) $VALUES.clone();
    }
}
