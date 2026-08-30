package w3;

import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b Lsq2 = new b("Lsq2", 0);
    public static final b Impulse = new b("Impulse", 1);

    private static final /* synthetic */ b[] $values() {
        return new b[]{Lsq2, Impulse};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private b(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
