package ve;

import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e DEFAULT = new e("DEFAULT", 0);
    public static final e CUSTOM = new e("CUSTOM", 1);

    private static final /* synthetic */ e[] $values() {
        return new e[]{DEFAULT, CUSTOM};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private e(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
