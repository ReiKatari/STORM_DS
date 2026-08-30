package g2;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l1 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ l1[] $VALUES;
    public static final l1 Closed = new l1("Closed", 0);
    public static final l1 Open = new l1("Open", 1);

    private static final /* synthetic */ l1[] $values() {
        return new l1[]{Closed, Open};
    }

    static {
        l1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private l1(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static l1 valueOf(String str) {
        return (l1) Enum.valueOf(l1.class, str);
    }

    public static l1[] values() {
        return (l1[]) $VALUES.clone();
    }
}
