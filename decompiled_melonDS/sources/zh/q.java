package zh;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q CONFIG = new q("CONFIG", 0, 0);
    public static final q RETRO_ACHIEVEMENTS = new q("RETRO_ACHIEVEMENTS", 1, 1);
    private final int tabIndex;

    private static final /* synthetic */ q[] $values() {
        return new q[]{CONFIG, RETRO_ACHIEVEMENTS};
    }

    static {
        q[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private q(String str, int i2, int i10) {
        this.tabIndex = i10;
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }

    public final int getTabIndex() {
        return this.tabIndex;
    }
}
