package p8;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w NOT_REQUIRED = new w("NOT_REQUIRED", 0);
    public static final w CONNECTED = new w("CONNECTED", 1);
    public static final w UNMETERED = new w("UNMETERED", 2);
    public static final w NOT_ROAMING = new w("NOT_ROAMING", 3);
    public static final w METERED = new w("METERED", 4);
    public static final w TEMPORARILY_UNMETERED = new w("TEMPORARILY_UNMETERED", 5);

    private static final /* synthetic */ w[] $values() {
        return new w[]{NOT_REQUIRED, CONNECTED, UNMETERED, NOT_ROAMING, METERED, TEMPORARILY_UNMETERED};
    }

    static {
        w[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private w(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}
