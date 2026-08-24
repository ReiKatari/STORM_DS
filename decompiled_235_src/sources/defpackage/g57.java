package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g57  reason: default package */
/* loaded from: classes.dex */
public final class g57 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ g57[] $VALUES;
    public static final e57 Companion;
    private final int nightMode;
    private final String preferenceValue;
    public static final g57 DARK = new g57("DARK", 0, 2, "dark");
    public static final g57 LIGHT = new g57("LIGHT", 1, 1, "light");
    public static final g57 MIDNIGHT = new g57("MIDNIGHT", 2, 2, "midnight");
    public static final g57 CYBERPUNK = new g57("CYBERPUNK", 3, 2, "cyberpunk");
    public static final g57 GOTHIC = new g57("GOTHIC", 4, 2, "gothic");
    public static final g57 MATRIX = new g57("MATRIX", 5, 2, "matrix");
    public static final g57 SOLAR = new g57("SOLAR", 6, 2, "solar");
    public static final g57 SAKURA = new g57("SAKURA", 7, 1, "sakura");
    public static final g57 SYSTEM = new g57("SYSTEM", 8, -1, "system");

    private static final /* synthetic */ g57[] $values() {
        return new g57[]{DARK, LIGHT, MIDNIGHT, CYBERPUNK, GOTHIC, MATRIX, SOLAR, SAKURA, SYSTEM};
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [e57, java.lang.Object] */
    static {
        g57[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
    }

    private g57(String str, int i, int i2, String str2) {
        this.nightMode = i2;
        this.preferenceValue = str2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static g57 valueOf(String str) {
        return (g57) Enum.valueOf(g57.class, str);
    }

    public static g57[] values() {
        return (g57[]) $VALUES.clone();
    }

    public final int getNightMode() {
        return this.nightMode;
    }

    public final String getPreferenceValue() {
        return this.preferenceValue;
    }

    public final int getThemeResId() {
        switch (f57.a[ordinal()]) {
            case 1:
                return 2132017165;
            case 2:
                return 2132017167;
            case 3:
                return 2132017169;
            case 4:
                return 2132017164;
            case 5:
                return 2132017166;
            case 6:
                return 2132017168;
            case 7:
                return 2132017171;
            case 8:
                return 2132017170;
            case 9:
                return 2132017165;
            default:
                i.d();
                return 0;
        }
    }
}
