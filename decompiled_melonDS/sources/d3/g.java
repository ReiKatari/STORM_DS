package d3;

import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g VIEW_APPEAR = new g("VIEW_APPEAR", 0);
    public static final g VIEW_DISAPPEAR = new g("VIEW_DISAPPEAR", 1);

    private static final /* synthetic */ g[] $values() {
        return new g[]{VIEW_APPEAR, VIEW_DISAPPEAR};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private g(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
