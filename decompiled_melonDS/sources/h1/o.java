package h1;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o Yes = new o("Yes", 0);
    public static final o No = new o("No", 1);
    public static final o NotInitialized = new o("NotInitialized", 2);

    private static final /* synthetic */ o[] $values() {
        return new o[]{Yes, No, NotInitialized};
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
