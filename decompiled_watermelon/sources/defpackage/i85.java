package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i85  reason: default package */
/* loaded from: classes.dex */
public final class i85 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ i85[] $VALUES;
    private final int mask;
    private final int value;
    public static final i85 IGNORE_CASE = new i85("IGNORE_CASE", 0, 2, 0, 2, null);
    public static final i85 MULTILINE = new i85("MULTILINE", 1, 8, 0, 2, null);
    public static final i85 LITERAL = new i85("LITERAL", 2, 16, 0, 2, null);
    public static final i85 UNIX_LINES = new i85("UNIX_LINES", 3, 1, 0, 2, null);
    public static final i85 COMMENTS = new i85("COMMENTS", 4, 4, 0, 2, null);
    public static final i85 DOT_MATCHES_ALL = new i85("DOT_MATCHES_ALL", 5, 32, 0, 2, null);
    public static final i85 CANON_EQ = new i85("CANON_EQ", 6, 128, 0, 2, null);

    private static final /* synthetic */ i85[] $values() {
        return new i85[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    static {
        i85[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    public /* synthetic */ i85(String str, int i, int i2, int i3, int i4, n91 n91Var) {
        this(str, i, i2, (i4 & 2) != 0 ? i2 : i3);
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static i85 valueOf(String str) {
        return (i85) Enum.valueOf(i85.class, str);
    }

    public static i85[] values() {
        return (i85[]) $VALUES.clone();
    }

    public int getMask() {
        return this.mask;
    }

    public int getValue() {
        return this.value;
    }

    private i85(String str, int i, int i2, int i3) {
        this.value = i2;
        this.mask = i3;
    }
}
