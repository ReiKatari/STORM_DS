package x4;

import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m Ltr = new m("Ltr", 0);
    public static final m Rtl = new m("Rtl", 1);

    private static final /* synthetic */ m[] $values() {
        return new m[]{Ltr, Rtl};
    }

    static {
        m[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private m(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
