package g2;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h6 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ h6[] $VALUES;
    public static final h6 Tabs = new h6("Tabs", 0);
    public static final h6 Divider = new h6("Divider", 1);
    public static final h6 Indicator = new h6("Indicator", 2);

    private static final /* synthetic */ h6[] $values() {
        return new h6[]{Tabs, Divider, Indicator};
    }

    static {
        h6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private h6(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static h6 valueOf(String str) {
        return (h6) Enum.valueOf(h6.class, str);
    }

    public static h6[] values() {
        return (h6[]) $VALUES.clone();
    }
}
