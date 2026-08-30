package e7;

import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e INT = new e("INT", 0);
    public static final e INT_NULLABLE = new e("INT_NULLABLE", 1);
    public static final e BOOL = new e("BOOL", 2);
    public static final e BOOL_NULLABLE = new e("BOOL_NULLABLE", 3);
    public static final e DOUBLE = new e("DOUBLE", 4);
    public static final e DOUBLE_NULLABLE = new e("DOUBLE_NULLABLE", 5);
    public static final e FLOAT = new e("FLOAT", 6);
    public static final e FLOAT_NULLABLE = new e("FLOAT_NULLABLE", 7);
    public static final e LONG = new e("LONG", 8);
    public static final e LONG_NULLABLE = new e("LONG_NULLABLE", 9);
    public static final e STRING = new e("STRING", 10);
    public static final e STRING_NULLABLE = new e("STRING_NULLABLE", 11);
    public static final e INT_ARRAY = new e("INT_ARRAY", 12);
    public static final e BOOL_ARRAY = new e("BOOL_ARRAY", 13);
    public static final e DOUBLE_ARRAY = new e("DOUBLE_ARRAY", 14);
    public static final e FLOAT_ARRAY = new e("FLOAT_ARRAY", 15);
    public static final e LONG_ARRAY = new e("LONG_ARRAY", 16);
    public static final e ARRAY = new e("ARRAY", 17);
    public static final e LIST = new e("LIST", 18);
    public static final e ENUM = new e("ENUM", 19);
    public static final e ENUM_NULLABLE = new e("ENUM_NULLABLE", 20);
    public static final e UNKNOWN = new e("UNKNOWN", 21);

    private static final /* synthetic */ e[] $values() {
        return new e[]{INT, INT_NULLABLE, BOOL, BOOL_NULLABLE, DOUBLE, DOUBLE_NULLABLE, FLOAT, FLOAT_NULLABLE, LONG, LONG_NULLABLE, STRING, STRING_NULLABLE, INT_ARRAY, BOOL_ARRAY, DOUBLE_ARRAY, FLOAT_ARRAY, LONG_ARRAY, ARRAY, LIST, ENUM, ENUM_NULLABLE, UNKNOWN};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private e(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
