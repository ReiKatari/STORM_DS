package vc;

import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    private final int mask;
    private final int value;
    public static final g IGNORE_CASE = new g("IGNORE_CASE", 0, 2, 0, 2, null);
    public static final g MULTILINE = new g("MULTILINE", 1, 8, 0, 2, null);
    public static final g LITERAL = new g("LITERAL", 2, 16, 0, 2, null);
    public static final g UNIX_LINES = new g("UNIX_LINES", 3, 1, 0, 2, null);
    public static final g COMMENTS = new g("COMMENTS", 4, 4, 0, 2, null);
    public static final g DOT_MATCHES_ALL = new g("DOT_MATCHES_ALL", 5, 32, 0, 2, null);
    public static final g CANON_EQ = new g("CANON_EQ", 6, 128, 0, 2, null);

    private static final /* synthetic */ g[] $values() {
        return new g[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    public /* synthetic */ g(String str, int i2, int i10, int i11, int i12, nc.f fVar) {
        this(str, i2, i10, (i12 & 2) != 0 ? i10 : i11);
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

    public int getMask() {
        return this.mask;
    }

    public int getValue() {
        return this.value;
    }

    private g(String str, int i2, int i10, int i11) {
        this.value = i10;
        this.mask = i11;
    }
}
