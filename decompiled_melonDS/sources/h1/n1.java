package h1;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n1 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ n1[] $VALUES;
    public static final n1 Vertical = new n1("Vertical", 0);
    public static final n1 Horizontal = new n1("Horizontal", 1);

    private static final /* synthetic */ n1[] $values() {
        return new n1[]{Vertical, Horizontal};
    }

    static {
        n1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private n1(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static n1 valueOf(String str) {
        return (n1) Enum.valueOf(n1.class, str);
    }

    public static n1[] values() {
        return (n1[]) $VALUES.clone();
    }
}
