package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: by7  reason: default package */
/* loaded from: classes.dex */
public final class by7 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ by7[] $VALUES;
    public final char begin;
    public final char end;
    public static final by7 OBJ = new by7("OBJ", 0, '{', '}');
    public static final by7 LIST = new by7("LIST", 1, '[', ']');
    public static final by7 MAP = new by7("MAP", 2, '{', '}');
    public static final by7 POLY_OBJ = new by7("POLY_OBJ", 3, '[', ']');

    private static final /* synthetic */ by7[] $values() {
        return new by7[]{OBJ, LIST, MAP, POLY_OBJ};
    }

    static {
        by7[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private by7(String str, int i, char c, char c2) {
        this.begin = c;
        this.end = c2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static by7 valueOf(String str) {
        return (by7) Enum.valueOf(by7.class, str);
    }

    public static by7[] values() {
        return (by7[]) $VALUES.clone();
    }
}
