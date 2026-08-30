package c1;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r2 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ r2[] $VALUES;
    public static final r2 NoRequest = new r2("NoRequest", 0);
    public static final r2 MatchFound = new r2("MatchFound", 1);
    public static final r2 VisibleContentAbsentDuringTransition = new r2("VisibleContentAbsentDuringTransition", 2);
    public static final r2 NoMatchFound = new r2("NoMatchFound", 3);

    private static final /* synthetic */ r2[] $values() {
        return new r2[]{NoRequest, MatchFound, VisibleContentAbsentDuringTransition, NoMatchFound};
    }

    static {
        r2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private r2(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static r2 valueOf(String str) {
        return (r2) Enum.valueOf(r2.class, str);
    }

    public static r2[] values() {
        return (r2[]) $VALUES.clone();
    }
}
