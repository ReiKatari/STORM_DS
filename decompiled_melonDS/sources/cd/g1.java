package cd;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g1 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ g1[] $VALUES;
    public static final g1 START = new g1("START", 0);
    public static final g1 STOP = new g1("STOP", 1);
    public static final g1 STOP_AND_RESET_REPLAY_CACHE = new g1("STOP_AND_RESET_REPLAY_CACHE", 2);

    private static final /* synthetic */ g1[] $values() {
        return new g1[]{START, STOP, STOP_AND_RESET_REPLAY_CACHE};
    }

    static {
        g1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private g1(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static g1 valueOf(String str) {
        return (g1) Enum.valueOf(g1.class, str);
    }

    public static g1[] values() {
        return (g1[]) $VALUES.clone();
    }
}
