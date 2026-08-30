package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a82  reason: default package */
/* loaded from: classes.dex */
public final class a82 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ a82[] $VALUES;
    public static final a82 GRAY = new a82("GRAY", 0);
    public static final a82 BROWN = new a82("BROWN", 1);
    public static final a82 RED = new a82("RED", 2);
    public static final a82 PINK = new a82("PINK", 3);
    public static final a82 ORANGE = new a82("ORANGE", 4);
    public static final a82 YELLOW = new a82("YELLOW", 5);
    public static final a82 LIME = new a82("LIME", 6);
    public static final a82 GREEN = new a82("GREEN", 7);
    public static final a82 DARK_GREEN = new a82("DARK_GREEN", 8);
    public static final a82 TURQUOISE = new a82("TURQUOISE", 9);
    public static final a82 LIGHT_BLUE = new a82("LIGHT_BLUE", 10);
    public static final a82 BLUE = new a82("BLUE", 11);
    public static final a82 DARK_BLUE = new a82("DARK_BLUE", 12);
    public static final a82 PURPLE = new a82("PURPLE", 13);
    public static final a82 VIOLET = new a82("VIOLET", 14);
    public static final a82 FUCHSIA = new a82("FUCHSIA", 15);

    private static final /* synthetic */ a82[] $values() {
        return new a82[]{GRAY, BROWN, RED, PINK, ORANGE, YELLOW, LIME, GREEN, DARK_GREEN, TURQUOISE, LIGHT_BLUE, BLUE, DARK_BLUE, PURPLE, VIOLET, FUCHSIA};
    }

    static {
        a82[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private a82(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static a82 valueOf(String str) {
        return (a82) Enum.valueOf(a82.class, str);
    }

    public static a82[] values() {
        return (a82[]) $VALUES.clone();
    }
}
