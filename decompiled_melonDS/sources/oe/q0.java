package oe;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q0 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ q0[] $VALUES;
    public static final q0 ASCENDING = new q0("ASCENDING", 0);
    public static final q0 DESCENDING = new q0("DESCENDING", 1);

    private static final /* synthetic */ q0[] $values() {
        return new q0[]{ASCENDING, DESCENDING};
    }

    static {
        q0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private q0(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) $VALUES.clone();
    }
}
