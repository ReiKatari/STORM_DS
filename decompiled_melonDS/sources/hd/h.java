package hd;

import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h SUCCESSFUL = new h("SUCCESSFUL", 0);
    public static final h REREGISTER = new h("REREGISTER", 1);
    public static final h CANCELLED = new h("CANCELLED", 2);
    public static final h ALREADY_SELECTED = new h("ALREADY_SELECTED", 3);

    private static final /* synthetic */ h[] $values() {
        return new h[]{SUCCESSFUL, REREGISTER, CANCELLED, ALREADY_SELECTED};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
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
