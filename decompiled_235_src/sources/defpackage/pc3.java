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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pc3  reason: default package */
/* loaded from: classes.dex */
public final class pc3 {
    private static final /* synthetic */ pc3[] $VALUES;
    public static final pc3 BOOLEAN;
    public static final pc3 BYTE_STRING;
    public static final pc3 DOUBLE;
    public static final pc3 ENUM;
    public static final pc3 FLOAT;
    public static final pc3 INT;
    public static final pc3 LONG;
    public static final pc3 MESSAGE;
    public static final pc3 STRING;
    public static final pc3 VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        pc3 pc3Var = new pc3("VOID", 0, Void.class, Void.class, null);
        VOID = pc3Var;
        Class cls = Integer.TYPE;
        pc3 pc3Var2 = new pc3("INT", 1, cls, Integer.class, 0);
        INT = pc3Var2;
        pc3 pc3Var3 = new pc3("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = pc3Var3;
        pc3 pc3Var4 = new pc3("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf((float) RecyclerView.B1));
        FLOAT = pc3Var4;
        pc3 pc3Var5 = new pc3("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = pc3Var5;
        pc3 pc3Var6 = new pc3("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = pc3Var6;
        pc3 pc3Var7 = new pc3("STRING", 6, String.class, String.class, "");
        STRING = pc3Var7;
        pc3 pc3Var8 = new pc3("BYTE_STRING", 7, ea0.class, ea0.class, ea0.B);
        BYTE_STRING = pc3Var8;
        pc3 pc3Var9 = new pc3("ENUM", 8, cls, Integer.class, null);
        ENUM = pc3Var9;
        pc3 pc3Var10 = new pc3("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = pc3Var10;
        $VALUES = new pc3[]{pc3Var, pc3Var2, pc3Var3, pc3Var4, pc3Var5, pc3Var6, pc3Var7, pc3Var8, pc3Var9, pc3Var10};
    }

    private pc3(String str, int i, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static pc3 valueOf(String str) {
        return (pc3) Enum.valueOf(pc3.class, str);
    }

    public static pc3[] values() {
        return (pc3[]) $VALUES.clone();
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
