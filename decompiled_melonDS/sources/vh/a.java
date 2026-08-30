package vh;

import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a INITIAL_SELECTION = new a("INITIAL_SELECTION", 0);
    public static final a SELECTED_BY_USER = new a("SELECTED_BY_USER", 1);
    public static final a SELECTED_BY_FALLBACK = new a("SELECTED_BY_FALLBACK", 2);

    private static final /* synthetic */ a[] $values() {
        return new a[]{INITIAL_SELECTION, SELECTED_BY_USER, SELECTED_BY_FALLBACK};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private a(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
