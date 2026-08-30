package oe;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i0 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ i0[] $VALUES;
    public static final i0 SAVE_DIR = new i0("SAVE_DIR", 0);
    public static final i0 ROM_DIR = new i0("ROM_DIR", 1);
    public static final i0 INTERNAL_DIR = new i0("INTERNAL_DIR", 2);

    private static final /* synthetic */ i0[] $values() {
        return new i0[]{SAVE_DIR, ROM_DIR, INTERNAL_DIR};
    }

    static {
        i0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private i0(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) $VALUES.clone();
    }
}
