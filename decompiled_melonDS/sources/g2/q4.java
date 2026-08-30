package g2;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q4 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ q4[] $VALUES;
    public static final q4 Short = new q4("Short", 0);
    public static final q4 Long = new q4("Long", 1);
    public static final q4 Indefinite = new q4("Indefinite", 2);

    private static final /* synthetic */ q4[] $values() {
        return new q4[]{Short, Long, Indefinite};
    }

    static {
        q4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private q4(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static q4 valueOf(String str) {
        return (q4) Enum.valueOf(q4.class, str);
    }

    public static q4[] values() {
        return (q4[]) $VALUES.clone();
    }
}
