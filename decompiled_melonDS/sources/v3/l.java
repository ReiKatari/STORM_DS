package v3;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l Initial = new l("Initial", 0);
    public static final l Main = new l("Main", 1);
    public static final l Final = new l("Final", 2);

    private static final /* synthetic */ l[] $values() {
        return new l[]{Initial, Main, Final};
    }

    static {
        l[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private l(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
