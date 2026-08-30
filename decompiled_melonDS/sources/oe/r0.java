package oe;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r0 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ r0[] $VALUES;
    public static final r0 ALPHA = new r0("ALPHA", 0);
    public static final r0 BETA = new r0("BETA", 1);
    public static final r0 FINAL = new r0("FINAL", 2);
    public static final r0 NIGHTLY = new r0("NIGHTLY", 3);

    private static final /* synthetic */ r0[] $values() {
        return new r0[]{ALPHA, BETA, FINAL, NIGHTLY};
    }

    static {
        r0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private r0(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) $VALUES.clone();
    }
}
