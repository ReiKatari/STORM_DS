package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o43  reason: default package */
/* loaded from: classes.dex */
public final class o43 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ o43[] $VALUES;
    public static final o43 INT = new o43("INT", 0);
    public static final o43 INT_NULLABLE = new o43("INT_NULLABLE", 1);
    public static final o43 BOOL = new o43("BOOL", 2);
    public static final o43 BOOL_NULLABLE = new o43("BOOL_NULLABLE", 3);
    public static final o43 DOUBLE = new o43("DOUBLE", 4);
    public static final o43 DOUBLE_NULLABLE = new o43("DOUBLE_NULLABLE", 5);
    public static final o43 FLOAT = new o43("FLOAT", 6);
    public static final o43 FLOAT_NULLABLE = new o43("FLOAT_NULLABLE", 7);
    public static final o43 LONG = new o43("LONG", 8);
    public static final o43 LONG_NULLABLE = new o43("LONG_NULLABLE", 9);
    public static final o43 STRING = new o43("STRING", 10);
    public static final o43 STRING_NULLABLE = new o43("STRING_NULLABLE", 11);
    public static final o43 INT_ARRAY = new o43("INT_ARRAY", 12);
    public static final o43 BOOL_ARRAY = new o43("BOOL_ARRAY", 13);
    public static final o43 DOUBLE_ARRAY = new o43("DOUBLE_ARRAY", 14);
    public static final o43 FLOAT_ARRAY = new o43("FLOAT_ARRAY", 15);
    public static final o43 LONG_ARRAY = new o43("LONG_ARRAY", 16);
    public static final o43 ARRAY = new o43("ARRAY", 17);
    public static final o43 LIST = new o43("LIST", 18);
    public static final o43 ENUM = new o43("ENUM", 19);
    public static final o43 ENUM_NULLABLE = new o43("ENUM_NULLABLE", 20);
    public static final o43 UNKNOWN = new o43("UNKNOWN", 21);

    private static final /* synthetic */ o43[] $values() {
        return new o43[]{INT, INT_NULLABLE, BOOL, BOOL_NULLABLE, DOUBLE, DOUBLE_NULLABLE, FLOAT, FLOAT_NULLABLE, LONG, LONG_NULLABLE, STRING, STRING_NULLABLE, INT_ARRAY, BOOL_ARRAY, DOUBLE_ARRAY, FLOAT_ARRAY, LONG_ARRAY, ARRAY, LIST, ENUM, ENUM_NULLABLE, UNKNOWN};
    }

    static {
        o43[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private o43(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static o43 valueOf(String str) {
        return (o43) Enum.valueOf(o43.class, str);
    }

    public static o43[] values() {
        return (o43[]) $VALUES.clone();
    }
}
