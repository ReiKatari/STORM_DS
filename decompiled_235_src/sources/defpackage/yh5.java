package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yh5  reason: default package */
/* loaded from: classes.dex */
public final class yh5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ yh5[] $VALUES;
    private final int mask;
    private final int value;
    public static final yh5 IGNORE_CASE = new yh5("IGNORE_CASE", 0, 2, 0, 2, null);
    public static final yh5 MULTILINE = new yh5("MULTILINE", 1, 8, 0, 2, null);
    public static final yh5 LITERAL = new yh5("LITERAL", 2, 16, 0, 2, null);
    public static final yh5 UNIX_LINES = new yh5("UNIX_LINES", 3, 1, 0, 2, null);
    public static final yh5 COMMENTS = new yh5("COMMENTS", 4, 4, 0, 2, null);
    public static final yh5 DOT_MATCHES_ALL = new yh5("DOT_MATCHES_ALL", 5, 32, 0, 2, null);
    public static final yh5 CANON_EQ = new yh5("CANON_EQ", 6, 128, 0, 2, null);

    private static final /* synthetic */ yh5[] $values() {
        return new yh5[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    static {
        yh5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    public /* synthetic */ yh5(String str, int i, int i2, int i3, int i4, id1 id1Var) {
        this(str, i, i2, (i4 & 2) != 0 ? i2 : i3);
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static yh5 valueOf(String str) {
        return (yh5) Enum.valueOf(yh5.class, str);
    }

    public static yh5[] values() {
        return (yh5[]) $VALUES.clone();
    }

    public int getMask() {
        return this.mask;
    }

    public int getValue() {
        return this.value;
    }

    private yh5(String str, int i, int i2, int i3) {
        this.value = i2;
        this.mask = i3;
    }
}
