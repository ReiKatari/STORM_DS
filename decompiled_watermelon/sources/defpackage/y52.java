package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum DOUBLE uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y52  reason: default package */
/* loaded from: classes.dex */
public final class y52 {
    private static final /* synthetic */ y52[] $VALUES;
    public static final y52 BOOL;
    public static final y52 BOOL_LIST;
    public static final y52 BOOL_LIST_PACKED;
    public static final y52 BYTES;
    public static final y52 BYTES_LIST;
    public static final y52 DOUBLE;
    public static final y52 DOUBLE_LIST;
    public static final y52 DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final y52 ENUM;
    public static final y52 ENUM_LIST;
    public static final y52 ENUM_LIST_PACKED;
    public static final y52 FIXED32;
    public static final y52 FIXED32_LIST;
    public static final y52 FIXED32_LIST_PACKED;
    public static final y52 FIXED64;
    public static final y52 FIXED64_LIST;
    public static final y52 FIXED64_LIST_PACKED;
    public static final y52 FLOAT;
    public static final y52 FLOAT_LIST;
    public static final y52 FLOAT_LIST_PACKED;
    public static final y52 GROUP;
    public static final y52 GROUP_LIST;
    public static final y52 INT32;
    public static final y52 INT32_LIST;
    public static final y52 INT32_LIST_PACKED;
    public static final y52 INT64;
    public static final y52 INT64_LIST;
    public static final y52 INT64_LIST_PACKED;
    public static final y52 MAP;
    public static final y52 MESSAGE;
    public static final y52 MESSAGE_LIST;
    public static final y52 SFIXED32;
    public static final y52 SFIXED32_LIST;
    public static final y52 SFIXED32_LIST_PACKED;
    public static final y52 SFIXED64;
    public static final y52 SFIXED64_LIST;
    public static final y52 SFIXED64_LIST_PACKED;
    public static final y52 SINT32;
    public static final y52 SINT32_LIST;
    public static final y52 SINT32_LIST_PACKED;
    public static final y52 SINT64;
    public static final y52 SINT64_LIST;
    public static final y52 SINT64_LIST_PACKED;
    public static final y52 STRING;
    public static final y52 STRING_LIST;
    public static final y52 UINT32;
    public static final y52 UINT32_LIST;
    public static final y52 UINT32_LIST_PACKED;
    public static final y52 UINT64;
    public static final y52 UINT64_LIST;
    public static final y52 UINT64_LIST_PACKED;
    private static final y52[] VALUES;
    private final a collection;
    private final Class<?> elementType;
    private final int id;
    private final a63 javaType;
    private final boolean primitiveScalar;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: y52$a */
    /* loaded from: classes.dex */
    public enum a {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        
        private final boolean isList;

        a(boolean z) {
            this.isList = z;
        }

        public boolean isList() {
            return this.isList;
        }
    }

    static {
        a aVar = a.SCALAR;
        a63 a63Var = a63.DOUBLE;
        y52 y52Var = new y52("DOUBLE", 0, 0, aVar, a63Var);
        DOUBLE = y52Var;
        a63 a63Var2 = a63.FLOAT;
        y52 y52Var2 = new y52("FLOAT", 1, 1, aVar, a63Var2);
        FLOAT = y52Var2;
        a63 a63Var3 = a63.LONG;
        y52 y52Var3 = new y52("INT64", 2, 2, aVar, a63Var3);
        INT64 = y52Var3;
        y52 y52Var4 = new y52("UINT64", 3, 3, aVar, a63Var3);
        UINT64 = y52Var4;
        a63 a63Var4 = a63.INT;
        y52 y52Var5 = new y52("INT32", 4, 4, aVar, a63Var4);
        INT32 = y52Var5;
        y52 y52Var6 = new y52("FIXED64", 5, 5, aVar, a63Var3);
        FIXED64 = y52Var6;
        y52 y52Var7 = new y52("FIXED32", 6, 6, aVar, a63Var4);
        FIXED32 = y52Var7;
        a63 a63Var5 = a63.BOOLEAN;
        y52 y52Var8 = new y52("BOOL", 7, 7, aVar, a63Var5);
        BOOL = y52Var8;
        a63 a63Var6 = a63.STRING;
        y52 y52Var9 = new y52("STRING", 8, 8, aVar, a63Var6);
        STRING = y52Var9;
        a63 a63Var7 = a63.MESSAGE;
        y52 y52Var10 = new y52("MESSAGE", 9, 9, aVar, a63Var7);
        MESSAGE = y52Var10;
        a63 a63Var8 = a63.BYTE_STRING;
        y52 y52Var11 = new y52("BYTES", 10, 10, aVar, a63Var8);
        BYTES = y52Var11;
        y52 y52Var12 = new y52("UINT32", 11, 11, aVar, a63Var4);
        UINT32 = y52Var12;
        a63 a63Var9 = a63.ENUM;
        y52 y52Var13 = new y52("ENUM", 12, 12, aVar, a63Var9);
        ENUM = y52Var13;
        y52 y52Var14 = new y52("SFIXED32", 13, 13, aVar, a63Var4);
        SFIXED32 = y52Var14;
        y52 y52Var15 = new y52("SFIXED64", 14, 14, aVar, a63Var3);
        SFIXED64 = y52Var15;
        y52 y52Var16 = new y52("SINT32", 15, 15, aVar, a63Var4);
        SINT32 = y52Var16;
        y52 y52Var17 = new y52("SINT64", 16, 16, aVar, a63Var3);
        SINT64 = y52Var17;
        y52 y52Var18 = new y52("GROUP", 17, 17, aVar, a63Var7);
        GROUP = y52Var18;
        a aVar2 = a.VECTOR;
        y52 y52Var19 = new y52("DOUBLE_LIST", 18, 18, aVar2, a63Var);
        DOUBLE_LIST = y52Var19;
        y52 y52Var20 = new y52("FLOAT_LIST", 19, 19, aVar2, a63Var2);
        FLOAT_LIST = y52Var20;
        y52 y52Var21 = new y52("INT64_LIST", 20, 20, aVar2, a63Var3);
        INT64_LIST = y52Var21;
        y52 y52Var22 = new y52("UINT64_LIST", 21, 21, aVar2, a63Var3);
        UINT64_LIST = y52Var22;
        y52 y52Var23 = new y52("INT32_LIST", 22, 22, aVar2, a63Var4);
        INT32_LIST = y52Var23;
        y52 y52Var24 = new y52("FIXED64_LIST", 23, 23, aVar2, a63Var3);
        FIXED64_LIST = y52Var24;
        y52 y52Var25 = new y52("FIXED32_LIST", 24, 24, aVar2, a63Var4);
        FIXED32_LIST = y52Var25;
        y52 y52Var26 = new y52("BOOL_LIST", 25, 25, aVar2, a63Var5);
        BOOL_LIST = y52Var26;
        y52 y52Var27 = new y52("STRING_LIST", 26, 26, aVar2, a63Var6);
        STRING_LIST = y52Var27;
        y52 y52Var28 = new y52("MESSAGE_LIST", 27, 27, aVar2, a63Var7);
        MESSAGE_LIST = y52Var28;
        y52 y52Var29 = new y52("BYTES_LIST", 28, 28, aVar2, a63Var8);
        BYTES_LIST = y52Var29;
        y52 y52Var30 = new y52("UINT32_LIST", 29, 29, aVar2, a63Var4);
        UINT32_LIST = y52Var30;
        y52 y52Var31 = new y52("ENUM_LIST", 30, 30, aVar2, a63Var9);
        ENUM_LIST = y52Var31;
        y52 y52Var32 = new y52("SFIXED32_LIST", 31, 31, aVar2, a63Var4);
        SFIXED32_LIST = y52Var32;
        y52 y52Var33 = new y52("SFIXED64_LIST", 32, 32, aVar2, a63Var3);
        SFIXED64_LIST = y52Var33;
        y52 y52Var34 = new y52("SINT32_LIST", 33, 33, aVar2, a63Var4);
        SINT32_LIST = y52Var34;
        y52 y52Var35 = new y52("SINT64_LIST", 34, 34, aVar2, a63Var3);
        SINT64_LIST = y52Var35;
        a aVar3 = a.PACKED_VECTOR;
        y52 y52Var36 = new y52("DOUBLE_LIST_PACKED", 35, 35, aVar3, a63Var);
        DOUBLE_LIST_PACKED = y52Var36;
        y52 y52Var37 = new y52("FLOAT_LIST_PACKED", 36, 36, aVar3, a63Var2);
        FLOAT_LIST_PACKED = y52Var37;
        y52 y52Var38 = new y52("INT64_LIST_PACKED", 37, 37, aVar3, a63Var3);
        INT64_LIST_PACKED = y52Var38;
        y52 y52Var39 = new y52("UINT64_LIST_PACKED", 38, 38, aVar3, a63Var3);
        UINT64_LIST_PACKED = y52Var39;
        y52 y52Var40 = new y52("INT32_LIST_PACKED", 39, 39, aVar3, a63Var4);
        INT32_LIST_PACKED = y52Var40;
        y52 y52Var41 = new y52("FIXED64_LIST_PACKED", 40, 40, aVar3, a63Var3);
        FIXED64_LIST_PACKED = y52Var41;
        y52 y52Var42 = new y52("FIXED32_LIST_PACKED", 41, 41, aVar3, a63Var4);
        FIXED32_LIST_PACKED = y52Var42;
        y52 y52Var43 = new y52("BOOL_LIST_PACKED", 42, 42, aVar3, a63Var5);
        BOOL_LIST_PACKED = y52Var43;
        y52 y52Var44 = new y52("UINT32_LIST_PACKED", 43, 43, aVar3, a63Var4);
        UINT32_LIST_PACKED = y52Var44;
        y52 y52Var45 = new y52("ENUM_LIST_PACKED", 44, 44, aVar3, a63Var9);
        ENUM_LIST_PACKED = y52Var45;
        y52 y52Var46 = new y52("SFIXED32_LIST_PACKED", 45, 45, aVar3, a63Var4);
        SFIXED32_LIST_PACKED = y52Var46;
        y52 y52Var47 = new y52("SFIXED64_LIST_PACKED", 46, 46, aVar3, a63Var3);
        SFIXED64_LIST_PACKED = y52Var47;
        y52 y52Var48 = new y52("SINT32_LIST_PACKED", 47, 47, aVar3, a63Var4);
        SINT32_LIST_PACKED = y52Var48;
        y52 y52Var49 = new y52("SINT64_LIST_PACKED", 48, 48, aVar3, a63Var3);
        SINT64_LIST_PACKED = y52Var49;
        y52 y52Var50 = new y52("GROUP_LIST", 49, 49, aVar2, a63Var7);
        GROUP_LIST = y52Var50;
        y52 y52Var51 = new y52("MAP", 50, 50, a.MAP, a63.VOID);
        MAP = y52Var51;
        $VALUES = new y52[]{y52Var, y52Var2, y52Var3, y52Var4, y52Var5, y52Var6, y52Var7, y52Var8, y52Var9, y52Var10, y52Var11, y52Var12, y52Var13, y52Var14, y52Var15, y52Var16, y52Var17, y52Var18, y52Var19, y52Var20, y52Var21, y52Var22, y52Var23, y52Var24, y52Var25, y52Var26, y52Var27, y52Var28, y52Var29, y52Var30, y52Var31, y52Var32, y52Var33, y52Var34, y52Var35, y52Var36, y52Var37, y52Var38, y52Var39, y52Var40, y52Var41, y52Var42, y52Var43, y52Var44, y52Var45, y52Var46, y52Var47, y52Var48, y52Var49, y52Var50, y52Var51};
        EMPTY_TYPES = new Type[0];
        y52[] values = values();
        VALUES = new y52[values.length];
        for (y52 y52Var52 : values) {
            VALUES[y52Var52.id] = y52Var52;
        }
    }

    private y52(String str, int i, int i2, a aVar, a63 a63Var) {
        int i3;
        this.id = i2;
        this.collection = aVar;
        this.javaType = a63Var;
        int i4 = x52.a[aVar.ordinal()];
        boolean z = true;
        if (i4 != 1) {
            if (i4 != 2) {
                this.elementType = null;
            } else {
                this.elementType = a63Var.getBoxedType();
            }
        } else {
            this.elementType = a63Var.getBoxedType();
        }
        this.primitiveScalar = (aVar != a.SCALAR || (i3 = x52.b[a63Var.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : false;
    }

    public static y52 forId(int i) {
        if (i >= 0) {
            y52[] y52VarArr = VALUES;
            if (i < y52VarArr.length) {
                return y52VarArr[i];
            }
            return null;
        }
        return null;
    }

    private static Type getGenericSuperList(Class<?> cls) {
        Type[] genericInterfaces;
        for (Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static Type getListParameter(Class<?> cls, Type[] typeArr) {
        while (true) {
            int i = 0;
            if (cls != List.class) {
                Type genericSuperList = getGenericSuperList(cls);
                if (genericSuperList instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                        Type type = actualTypeArguments[i2];
                        if (type instanceof TypeVariable) {
                            TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                            if (typeArr.length == typeParameters.length) {
                                for (int i3 = 0; i3 < typeParameters.length; i3++) {
                                    if (type == typeParameters[i3]) {
                                        actualTypeArguments[i2] = typeArr[i3];
                                    }
                                }
                                f81.t(type, "Unable to find replacement for ");
                                return null;
                            }
                            f81.w("Type array mismatch");
                            return null;
                        }
                    }
                    cls = (Class) parameterizedType.getRawType();
                    typeArr = actualTypeArguments;
                } else {
                    typeArr = EMPTY_TYPES;
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length = interfaces.length;
                    while (true) {
                        if (i < length) {
                            Class<?> cls2 = interfaces[i];
                            if (List.class.isAssignableFrom(cls2)) {
                                cls = cls2;
                                break;
                            }
                            i++;
                        } else {
                            cls = cls.getSuperclass();
                            break;
                        }
                    }
                }
            } else if (typeArr.length == 1) {
                return typeArr[0];
            } else {
                f81.w("Unable to identify parameter type for List<T>");
                return null;
            }
        }
    }

    private boolean isValidForList(Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        Type[] typeArr = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            typeArr = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type listParameter = getListParameter(type, typeArr);
        if (!(listParameter instanceof Class)) {
            return true;
        }
        return this.elementType.isAssignableFrom((Class) listParameter);
    }

    public static y52 valueOf(String str) {
        return (y52) Enum.valueOf(y52.class, str);
    }

    public static y52[] values() {
        return (y52[]) $VALUES.clone();
    }

    public a63 getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.id;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        if (this.collection == a.MAP) {
            return true;
        }
        return false;
    }

    public boolean isPacked() {
        return a.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        if (this.collection == a.SCALAR) {
            return true;
        }
        return false;
    }

    public boolean isValidForField(Field field) {
        if (a.VECTOR.equals(this.collection)) {
            return isValidForList(field);
        }
        return this.javaType.getType().isAssignableFrom(field.getType());
    }
}
