package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ej7  reason: default package */
/* loaded from: classes.dex */
public final class ej7 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ej7[] $VALUES;
    public final char begin;
    public final char end;
    public static final ej7 OBJ = new ej7("OBJ", 0, '{', '}');
    public static final ej7 LIST = new ej7("LIST", 1, '[', ']');
    public static final ej7 MAP = new ej7("MAP", 2, '{', '}');
    public static final ej7 POLY_OBJ = new ej7("POLY_OBJ", 3, '[', ']');

    private static final /* synthetic */ ej7[] $values() {
        return new ej7[]{OBJ, LIST, MAP, POLY_OBJ};
    }

    static {
        ej7[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private ej7(String str, int i, char c, char c2) {
        this.begin = c;
        this.end = c2;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ej7 valueOf(String str) {
        return (ej7) Enum.valueOf(ej7.class, str);
    }

    public static ej7[] values() {
        return (ej7[]) $VALUES.clone();
    }
}
