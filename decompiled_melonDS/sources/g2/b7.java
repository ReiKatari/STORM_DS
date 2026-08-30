package g2;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b7 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ b7[] $VALUES;
    public static final b7 Filled = new b7("Filled", 0);
    public static final b7 Outlined = new b7("Outlined", 1);

    private static final /* synthetic */ b7[] $values() {
        return new b7[]{Filled, Outlined};
    }

    static {
        b7[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private b7(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static b7 valueOf(String str) {
        return (b7) Enum.valueOf(b7.class, str);
    }

    public static b7[] values() {
        return (b7[]) $VALUES.clone();
    }
}
