package p8;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l REPLACE = new l("REPLACE", 0);
    public static final l KEEP = new l("KEEP", 1);
    public static final l APPEND = new l("APPEND", 2);
    public static final l APPEND_OR_REPLACE = new l("APPEND_OR_REPLACE", 3);

    private static final /* synthetic */ l[] $values() {
        return new l[]{REPLACE, KEEP, APPEND, APPEND_OR_REPLACE};
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
