package f2;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j CROSSED = new j("CROSSED", 0);
    public static final j NOT_CROSSED = new j("NOT_CROSSED", 1);
    public static final j COLLAPSED = new j("COLLAPSED", 2);

    private static final /* synthetic */ j[] $values() {
        return new j[]{CROSSED, NOT_CROSSED, COLLAPSED};
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
