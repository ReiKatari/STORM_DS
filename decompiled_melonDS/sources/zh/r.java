package zh;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r None = new r("None", 0);
    public static final r GbaRom = new r("GbaRom", 1);
    public static final r RumblePak = new r("RumblePak", 2);
    public static final r MemoryExpansion = new r("MemoryExpansion", 3);

    private static final /* synthetic */ r[] $values() {
        return new r[]{None, GbaRom, RumblePak, MemoryExpansion};
    }

    static {
        r[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private r(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
