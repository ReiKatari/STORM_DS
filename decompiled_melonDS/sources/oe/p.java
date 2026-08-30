package oe;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p HIDDEN = new p("HIDDEN", 0);
    public static final p TOP_LEFT = new p("TOP_LEFT", 1);
    public static final p TOP_CENTER = new p("TOP_CENTER", 2);
    public static final p TOP_RIGHT = new p("TOP_RIGHT", 3);
    public static final p BOTTOM_LEFT = new p("BOTTOM_LEFT", 4);
    public static final p BOTTOM_CENTER = new p("BOTTOM_CENTER", 5);
    public static final p BOTTOM_RIGHT = new p("BOTTOM_RIGHT", 6);

    private static final /* synthetic */ p[] $values() {
        return new p[]{HIDDEN, TOP_LEFT, TOP_CENTER, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT};
    }

    static {
        p[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private p(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
