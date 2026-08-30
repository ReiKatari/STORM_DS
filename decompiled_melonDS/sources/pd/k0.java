package pd;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k0 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ k0[] $VALUES;
    public final char begin;
    public final char end;
    public static final k0 OBJ = new k0("OBJ", 0, '{', '}');
    public static final k0 LIST = new k0("LIST", 1, '[', ']');
    public static final k0 MAP = new k0("MAP", 2, '{', '}');
    public static final k0 POLY_OBJ = new k0("POLY_OBJ", 3, '[', ']');

    private static final /* synthetic */ k0[] $values() {
        return new k0[]{OBJ, LIST, MAP, POLY_OBJ};
    }

    static {
        k0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private k0(String str, int i2, char c4, char c10) {
        this.begin = c4;
        this.end = c10;
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }
}
