package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mk2  reason: default package */
/* loaded from: classes.dex */
public final class mk2 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ mk2[] $VALUES;
    public static final mk2 HIDDEN = new mk2("HIDDEN", 0);
    public static final mk2 TOP_LEFT = new mk2("TOP_LEFT", 1);
    public static final mk2 TOP_CENTER = new mk2("TOP_CENTER", 2);
    public static final mk2 TOP_RIGHT = new mk2("TOP_RIGHT", 3);
    public static final mk2 BOTTOM_LEFT = new mk2("BOTTOM_LEFT", 4);
    public static final mk2 BOTTOM_CENTER = new mk2("BOTTOM_CENTER", 5);
    public static final mk2 BOTTOM_RIGHT = new mk2("BOTTOM_RIGHT", 6);

    private static final /* synthetic */ mk2[] $values() {
        return new mk2[]{HIDDEN, TOP_LEFT, TOP_CENTER, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT};
    }

    static {
        mk2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private mk2(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static mk2 valueOf(String str) {
        return (mk2) Enum.valueOf(mk2.class, str);
    }

    public static mk2[] values() {
        return (mk2[]) $VALUES.clone();
    }
}
