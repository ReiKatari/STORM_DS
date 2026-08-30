package w4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j Ltr = new j("Ltr", 0);
    public static final j Rtl = new j("Rtl", 1);

    private static final /* synthetic */ j[] $values() {
        return new j[]{Ltr, Rtl};
    }

    static {
        j[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private j(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
