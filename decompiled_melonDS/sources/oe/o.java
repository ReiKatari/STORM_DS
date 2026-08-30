package oe;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o GRAY = new o("GRAY", 0);
    public static final o BROWN = new o("BROWN", 1);
    public static final o RED = new o("RED", 2);
    public static final o PINK = new o("PINK", 3);
    public static final o ORANGE = new o("ORANGE", 4);
    public static final o YELLOW = new o("YELLOW", 5);
    public static final o LIME = new o("LIME", 6);
    public static final o GREEN = new o("GREEN", 7);
    public static final o DARK_GREEN = new o("DARK_GREEN", 8);
    public static final o TURQUOISE = new o("TURQUOISE", 9);
    public static final o LIGHT_BLUE = new o("LIGHT_BLUE", 10);
    public static final o BLUE = new o("BLUE", 11);
    public static final o DARK_BLUE = new o("DARK_BLUE", 12);
    public static final o PURPLE = new o("PURPLE", 13);
    public static final o VIOLET = new o("VIOLET", 14);
    public static final o FUCHSIA = new o("FUCHSIA", 15);

    private static final /* synthetic */ o[] $values() {
        return new o[]{GRAY, BROWN, RED, PINK, ORANGE, YELLOW, LIME, GREEN, DARK_GREEN, TURQUOISE, LIGHT_BLUE, BLUE, DARK_BLUE, PURPLE, VIOLET, FUCHSIA};
    }

    static {
        o[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private o(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
