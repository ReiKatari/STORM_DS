package oe;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d NOT_IMPORTING = new d("NOT_IMPORTING", 0);
    public static final d STARTING = new d("STARTING", 1);
    public static final d ONGOING = new d("ONGOING", 2);
    public static final d FINISHED = new d("FINISHED", 3);
    public static final d FAILED = new d("FAILED", 4);

    private static final /* synthetic */ d[] $values() {
        return new d[]{NOT_IMPORTING, STARTING, ONGOING, FINISHED, FAILED};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
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
