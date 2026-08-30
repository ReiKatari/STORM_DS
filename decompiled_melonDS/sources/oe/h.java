package oe;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h UNSET = new h("UNSET", 0);
    public static final h INVALID = new h("INVALID", 1);
    public static final h VALID = new h("VALID", 2);

    private static final /* synthetic */ h[] $values() {
        return new h[]{UNSET, INVALID, VALID};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private h(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
