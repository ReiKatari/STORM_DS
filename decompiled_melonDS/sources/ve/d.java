package ve;

import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d FOLLOW_SYSTEM = new d("FOLLOW_SYSTEM", 0);
    public static final d PORTRAIT = new d("PORTRAIT", 1);
    public static final d LANDSCAPE = new d("LANDSCAPE", 2);

    private static final /* synthetic */ d[] $values() {
        return new d[]{FOLLOW_SYSTEM, PORTRAIT, LANDSCAPE};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private d(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
