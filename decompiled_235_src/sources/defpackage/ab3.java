package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ab3  reason: default package */
/* loaded from: classes.dex */
public final class ab3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ab3[] $VALUES;
    public static final ab3 INT = new ab3("INT", 0);
    public static final ab3 INT_NULLABLE = new ab3("INT_NULLABLE", 1);
    public static final ab3 BOOL = new ab3("BOOL", 2);
    public static final ab3 BOOL_NULLABLE = new ab3("BOOL_NULLABLE", 3);
    public static final ab3 DOUBLE = new ab3("DOUBLE", 4);
    public static final ab3 DOUBLE_NULLABLE = new ab3("DOUBLE_NULLABLE", 5);
    public static final ab3 FLOAT = new ab3("FLOAT", 6);
    public static final ab3 FLOAT_NULLABLE = new ab3("FLOAT_NULLABLE", 7);
    public static final ab3 LONG = new ab3("LONG", 8);
    public static final ab3 LONG_NULLABLE = new ab3("LONG_NULLABLE", 9);
    public static final ab3 STRING = new ab3("STRING", 10);
    public static final ab3 STRING_NULLABLE = new ab3("STRING_NULLABLE", 11);
    public static final ab3 INT_ARRAY = new ab3("INT_ARRAY", 12);
    public static final ab3 BOOL_ARRAY = new ab3("BOOL_ARRAY", 13);
    public static final ab3 DOUBLE_ARRAY = new ab3("DOUBLE_ARRAY", 14);
    public static final ab3 FLOAT_ARRAY = new ab3("FLOAT_ARRAY", 15);
    public static final ab3 LONG_ARRAY = new ab3("LONG_ARRAY", 16);
    public static final ab3 ARRAY = new ab3("ARRAY", 17);
    public static final ab3 LIST = new ab3("LIST", 18);
    public static final ab3 ENUM = new ab3("ENUM", 19);
    public static final ab3 ENUM_NULLABLE = new ab3("ENUM_NULLABLE", 20);
    public static final ab3 UNKNOWN = new ab3("UNKNOWN", 21);

    private static final /* synthetic */ ab3[] $values() {
        return new ab3[]{INT, INT_NULLABLE, BOOL, BOOL_NULLABLE, DOUBLE, DOUBLE_NULLABLE, FLOAT, FLOAT_NULLABLE, LONG, LONG_NULLABLE, STRING, STRING_NULLABLE, INT_ARRAY, BOOL_ARRAY, DOUBLE_ARRAY, FLOAT_ARRAY, LONG_ARRAY, ARRAY, LIST, ENUM, ENUM_NULLABLE, UNKNOWN};
    }

    static {
        ab3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ab3(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ab3 valueOf(String str) {
        return (ab3) Enum.valueOf(ab3.class, str);
    }

    public static ab3[] values() {
        return (ab3[]) $VALUES.clone();
    }
}
