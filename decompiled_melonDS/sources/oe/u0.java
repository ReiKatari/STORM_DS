package oe;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u0 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ u0[] $VALUES;
    public static final u0 NONE = new u0("NONE", 0);
    public static final u0 LINEAR = new u0("LINEAR", 1);
    public static final u0 XBR2 = new u0("XBR2", 2);
    public static final u0 HQ2X = new u0("HQ2X", 3);
    public static final u0 HQ4X = new u0("HQ4X", 4);
    public static final u0 QUILEZ = new u0("QUILEZ", 5);
    public static final u0 LCD = new u0("LCD", 6);
    public static final u0 SCANLINES = new u0("SCANLINES", 7);

    private static final /* synthetic */ u0[] $values() {
        return new u0[]{NONE, LINEAR, XBR2, HQ2X, HQ4X, QUILEZ, LCD, SCANLINES};
    }

    static {
        u0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private u0(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) $VALUES.clone();
    }
}
