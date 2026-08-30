package d1;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o0 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ o0[] $VALUES;
    public static final o0 Restart = new o0("Restart", 0);
    public static final o0 Reverse = new o0("Reverse", 1);

    private static final /* synthetic */ o0[] $values() {
        return new o0[]{Restart, Reverse};
    }

    static {
        o0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private o0(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) $VALUES.clone();
    }
}
