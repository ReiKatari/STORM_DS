package oe;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g0 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ g0[] $VALUES;
    public static final g0 SCANNING = new g0("SCANNING", 0);
    public static final g0 NOT_SCANNING = new g0("NOT_SCANNING", 1);

    private static final /* synthetic */ g0[] $values() {
        return new g0[]{SCANNING, NOT_SCANNING};
    }

    static {
        g0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private g0(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }
}
