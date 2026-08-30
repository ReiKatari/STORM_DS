package n2;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j1 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ j1[] $VALUES;
    public static final j1 Invalid = new j1("Invalid", 0);
    public static final j1 Cancelled = new j1("Cancelled", 1);
    public static final j1 InitialPending = new j1("InitialPending", 2);
    public static final j1 RecomposePending = new j1("RecomposePending", 3);
    public static final j1 Recomposing = new j1("Recomposing", 4);
    public static final j1 ApplyPending = new j1("ApplyPending", 5);
    public static final j1 Applied = new j1("Applied", 6);

    private static final /* synthetic */ j1[] $values() {
        return new j1[]{Invalid, Cancelled, InitialPending, RecomposePending, Recomposing, ApplyPending, Applied};
    }

    static {
        j1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private j1(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) $VALUES.clone();
    }
}
