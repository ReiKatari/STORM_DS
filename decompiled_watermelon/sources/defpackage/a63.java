package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum INT uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a63  reason: default package */
/* loaded from: classes.dex */
public final class a63 {
    private static final /* synthetic */ a63[] $VALUES;
    public static final a63 BOOLEAN;
    public static final a63 BYTE_STRING;
    public static final a63 DOUBLE;
    public static final a63 ENUM;
    public static final a63 FLOAT;
    public static final a63 INT;
    public static final a63 LONG;
    public static final a63 MESSAGE;
    public static final a63 STRING;
    public static final a63 VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        a63 a63Var = new a63("VOID", 0, Void.class, Void.class, null);
        VOID = a63Var;
        Class cls = Integer.TYPE;
        a63 a63Var2 = new a63("INT", 1, cls, Integer.class, 0);
        INT = a63Var2;
        a63 a63Var3 = new a63("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = a63Var3;
        a63 a63Var4 = new a63("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf((float) RecyclerView.A1));
        FLOAT = a63Var4;
        a63 a63Var5 = new a63("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = a63Var5;
        a63 a63Var6 = new a63("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = a63Var6;
        a63 a63Var7 = new a63("STRING", 6, String.class, String.class, "");
        STRING = a63Var7;
        a63 a63Var8 = new a63("BYTE_STRING", 7, x70.class, x70.class, x70.B);
        BYTE_STRING = a63Var8;
        a63 a63Var9 = new a63("ENUM", 8, cls, Integer.class, null);
        ENUM = a63Var9;
        a63 a63Var10 = new a63("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = a63Var10;
        $VALUES = new a63[]{a63Var, a63Var2, a63Var3, a63Var4, a63Var5, a63Var6, a63Var7, a63Var8, a63Var9, a63Var10};
    }

    private a63(String str, int i, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static a63 valueOf(String str) {
        return (a63) Enum.valueOf(a63.class, str);
    }

    public static a63[] values() {
        return (a63[]) $VALUES.clone();
    }

    public Class<?> getBoxedType() {
        return this.boxedType;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }

    public Class<?> getType() {
        return this.type;
    }

    public boolean isValidType(Class<?> cls) {
        return this.type.isAssignableFrom(cls);
    }
}
