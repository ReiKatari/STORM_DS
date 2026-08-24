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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sa2  reason: default package */
/* loaded from: classes.dex */
public final class sa2 {
    private static final /* synthetic */ sa2[] $VALUES;
    public static final sa2 BOOL;
    public static final sa2 BOOL_LIST;
    public static final sa2 BOOL_LIST_PACKED;
    public static final sa2 BYTES;
    public static final sa2 BYTES_LIST;
    public static final sa2 DOUBLE;
    public static final sa2 DOUBLE_LIST;
    public static final sa2 DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final sa2 ENUM;
    public static final sa2 ENUM_LIST;
    public static final sa2 ENUM_LIST_PACKED;
    public static final sa2 FIXED32;
    public static final sa2 FIXED32_LIST;
    public static final sa2 FIXED32_LIST_PACKED;
    public static final sa2 FIXED64;
    public static final sa2 FIXED64_LIST;
    public static final sa2 FIXED64_LIST_PACKED;
    public static final sa2 FLOAT;
    public static final sa2 FLOAT_LIST;
    public static final sa2 FLOAT_LIST_PACKED;
    public static final sa2 GROUP;
    public static final sa2 GROUP_LIST;
    public static final sa2 INT32;
    public static final sa2 INT32_LIST;
    public static final sa2 INT32_LIST_PACKED;
    public static final sa2 INT64;
    public static final sa2 INT64_LIST;
    public static final sa2 INT64_LIST_PACKED;
    public static final sa2 MAP;
    public static final sa2 MESSAGE;
    public static final sa2 MESSAGE_LIST;
    public static final sa2 SFIXED32;
    public static final sa2 SFIXED32_LIST;
    public static final sa2 SFIXED32_LIST_PACKED;
    public static final sa2 SFIXED64;
    public static final sa2 SFIXED64_LIST;
    public static final sa2 SFIXED64_LIST_PACKED;
    public static final sa2 SINT32;
    public static final sa2 SINT32_LIST;
    public static final sa2 SINT32_LIST_PACKED;
    public static final sa2 SINT64;
    public static final sa2 SINT64_LIST;
    public static final sa2 SINT64_LIST_PACKED;
    public static final sa2 STRING;
    public static final sa2 STRING_LIST;
    public static final sa2 UINT32;
    public static final sa2 UINT32_LIST;
    public static final sa2 UINT32_LIST_PACKED;
    public static final sa2 UINT64;
    public static final sa2 UINT64_LIST;
    public static final sa2 UINT64_LIST_PACKED;
    private static final sa2[] VALUES;
    private final a collection;
    private final Class<?> elementType;
    private final int id;
    private final pc3 javaType;
    private final boolean primitiveScalar;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: sa2$a */
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
        pc3 pc3Var = pc3.DOUBLE;
        sa2 sa2Var = new sa2("DOUBLE", 0, 0, aVar, pc3Var);
        DOUBLE = sa2Var;
        pc3 pc3Var2 = pc3.FLOAT;
        sa2 sa2Var2 = new sa2("FLOAT", 1, 1, aVar, pc3Var2);
        FLOAT = sa2Var2;
        pc3 pc3Var3 = pc3.LONG;
        sa2 sa2Var3 = new sa2("INT64", 2, 2, aVar, pc3Var3);
        INT64 = sa2Var3;
        sa2 sa2Var4 = new sa2("UINT64", 3, 3, aVar, pc3Var3);
        UINT64 = sa2Var4;
        pc3 pc3Var4 = pc3.INT;
        sa2 sa2Var5 = new sa2("INT32", 4, 4, aVar, pc3Var4);
        INT32 = sa2Var5;
        sa2 sa2Var6 = new sa2("FIXED64", 5, 5, aVar, pc3Var3);
        FIXED64 = sa2Var6;
        sa2 sa2Var7 = new sa2("FIXED32", 6, 6, aVar, pc3Var4);
        FIXED32 = sa2Var7;
        pc3 pc3Var5 = pc3.BOOLEAN;
        sa2 sa2Var8 = new sa2("BOOL", 7, 7, aVar, pc3Var5);
        BOOL = sa2Var8;
        pc3 pc3Var6 = pc3.STRING;
        sa2 sa2Var9 = new sa2("STRING", 8, 8, aVar, pc3Var6);
        STRING = sa2Var9;
        pc3 pc3Var7 = pc3.MESSAGE;
        sa2 sa2Var10 = new sa2("MESSAGE", 9, 9, aVar, pc3Var7);
        MESSAGE = sa2Var10;
        pc3 pc3Var8 = pc3.BYTE_STRING;
        sa2 sa2Var11 = new sa2("BYTES", 10, 10, aVar, pc3Var8);
        BYTES = sa2Var11;
        sa2 sa2Var12 = new sa2("UINT32", 11, 11, aVar, pc3Var4);
        UINT32 = sa2Var12;
        pc3 pc3Var9 = pc3.ENUM;
        sa2 sa2Var13 = new sa2("ENUM", 12, 12, aVar, pc3Var9);
        ENUM = sa2Var13;
        sa2 sa2Var14 = new sa2("SFIXED32", 13, 13, aVar, pc3Var4);
        SFIXED32 = sa2Var14;
        sa2 sa2Var15 = new sa2("SFIXED64", 14, 14, aVar, pc3Var3);
        SFIXED64 = sa2Var15;
        sa2 sa2Var16 = new sa2("SINT32", 15, 15, aVar, pc3Var4);
        SINT32 = sa2Var16;
        sa2 sa2Var17 = new sa2("SINT64", 16, 16, aVar, pc3Var3);
        SINT64 = sa2Var17;
        sa2 sa2Var18 = new sa2("GROUP", 17, 17, aVar, pc3Var7);
        GROUP = sa2Var18;
        a aVar2 = a.VECTOR;
        sa2 sa2Var19 = new sa2("DOUBLE_LIST", 18, 18, aVar2, pc3Var);
        DOUBLE_LIST = sa2Var19;
        sa2 sa2Var20 = new sa2("FLOAT_LIST", 19, 19, aVar2, pc3Var2);
        FLOAT_LIST = sa2Var20;
        sa2 sa2Var21 = new sa2("INT64_LIST", 20, 20, aVar2, pc3Var3);
        INT64_LIST = sa2Var21;
        sa2 sa2Var22 = new sa2("UINT64_LIST", 21, 21, aVar2, pc3Var3);
        UINT64_LIST = sa2Var22;
        sa2 sa2Var23 = new sa2("INT32_LIST", 22, 22, aVar2, pc3Var4);
        INT32_LIST = sa2Var23;
        sa2 sa2Var24 = new sa2("FIXED64_LIST", 23, 23, aVar2, pc3Var3);
        FIXED64_LIST = sa2Var24;
        sa2 sa2Var25 = new sa2("FIXED32_LIST", 24, 24, aVar2, pc3Var4);
        FIXED32_LIST = sa2Var25;
        sa2 sa2Var26 = new sa2("BOOL_LIST", 25, 25, aVar2, pc3Var5);
        BOOL_LIST = sa2Var26;
        sa2 sa2Var27 = new sa2("STRING_LIST", 26, 26, aVar2, pc3Var6);
        STRING_LIST = sa2Var27;
        sa2 sa2Var28 = new sa2("MESSAGE_LIST", 27, 27, aVar2, pc3Var7);
        MESSAGE_LIST = sa2Var28;
        sa2 sa2Var29 = new sa2("BYTES_LIST", 28, 28, aVar2, pc3Var8);
        BYTES_LIST = sa2Var29;
        sa2 sa2Var30 = new sa2("UINT32_LIST", 29, 29, aVar2, pc3Var4);
        UINT32_LIST = sa2Var30;
        sa2 sa2Var31 = new sa2("ENUM_LIST", 30, 30, aVar2, pc3Var9);
        ENUM_LIST = sa2Var31;
        sa2 sa2Var32 = new sa2("SFIXED32_LIST", 31, 31, aVar2, pc3Var4);
        SFIXED32_LIST = sa2Var32;
        sa2 sa2Var33 = new sa2("SFIXED64_LIST", 32, 32, aVar2, pc3Var3);
        SFIXED64_LIST = sa2Var33;
        sa2 sa2Var34 = new sa2("SINT32_LIST", 33, 33, aVar2, pc3Var4);
        SINT32_LIST = sa2Var34;
        sa2 sa2Var35 = new sa2("SINT64_LIST", 34, 34, aVar2, pc3Var3);
        SINT64_LIST = sa2Var35;
        a aVar3 = a.PACKED_VECTOR;
        sa2 sa2Var36 = new sa2("DOUBLE_LIST_PACKED", 35, 35, aVar3, pc3Var);
        DOUBLE_LIST_PACKED = sa2Var36;
        sa2 sa2Var37 = new sa2("FLOAT_LIST_PACKED", 36, 36, aVar3, pc3Var2);
        FLOAT_LIST_PACKED = sa2Var37;
        sa2 sa2Var38 = new sa2("INT64_LIST_PACKED", 37, 37, aVar3, pc3Var3);
        INT64_LIST_PACKED = sa2Var38;
        sa2 sa2Var39 = new sa2("UINT64_LIST_PACKED", 38, 38, aVar3, pc3Var3);
        UINT64_LIST_PACKED = sa2Var39;
        sa2 sa2Var40 = new sa2("INT32_LIST_PACKED", 39, 39, aVar3, pc3Var4);
        INT32_LIST_PACKED = sa2Var40;
        sa2 sa2Var41 = new sa2("FIXED64_LIST_PACKED", 40, 40, aVar3, pc3Var3);
        FIXED64_LIST_PACKED = sa2Var41;
        sa2 sa2Var42 = new sa2("FIXED32_LIST_PACKED", 41, 41, aVar3, pc3Var4);
        FIXED32_LIST_PACKED = sa2Var42;
        sa2 sa2Var43 = new sa2("BOOL_LIST_PACKED", 42, 42, aVar3, pc3Var5);
        BOOL_LIST_PACKED = sa2Var43;
        sa2 sa2Var44 = new sa2("UINT32_LIST_PACKED", 43, 43, aVar3, pc3Var4);
        UINT32_LIST_PACKED = sa2Var44;
        sa2 sa2Var45 = new sa2("ENUM_LIST_PACKED", 44, 44, aVar3, pc3Var9);
        ENUM_LIST_PACKED = sa2Var45;
        sa2 sa2Var46 = new sa2("SFIXED32_LIST_PACKED", 45, 45, aVar3, pc3Var4);
        SFIXED32_LIST_PACKED = sa2Var46;
        sa2 sa2Var47 = new sa2("SFIXED64_LIST_PACKED", 46, 46, aVar3, pc3Var3);
        SFIXED64_LIST_PACKED = sa2Var47;
        sa2 sa2Var48 = new sa2("SINT32_LIST_PACKED", 47, 47, aVar3, pc3Var4);
        SINT32_LIST_PACKED = sa2Var48;
        sa2 sa2Var49 = new sa2("SINT64_LIST_PACKED", 48, 48, aVar3, pc3Var3);
        SINT64_LIST_PACKED = sa2Var49;
        sa2 sa2Var50 = new sa2("GROUP_LIST", 49, 49, aVar2, pc3Var7);
        GROUP_LIST = sa2Var50;
        sa2 sa2Var51 = new sa2("MAP", 50, 50, a.MAP, pc3.VOID);
        MAP = sa2Var51;
        $VALUES = new sa2[]{sa2Var, sa2Var2, sa2Var3, sa2Var4, sa2Var5, sa2Var6, sa2Var7, sa2Var8, sa2Var9, sa2Var10, sa2Var11, sa2Var12, sa2Var13, sa2Var14, sa2Var15, sa2Var16, sa2Var17, sa2Var18, sa2Var19, sa2Var20, sa2Var21, sa2Var22, sa2Var23, sa2Var24, sa2Var25, sa2Var26, sa2Var27, sa2Var28, sa2Var29, sa2Var30, sa2Var31, sa2Var32, sa2Var33, sa2Var34, sa2Var35, sa2Var36, sa2Var37, sa2Var38, sa2Var39, sa2Var40, sa2Var41, sa2Var42, sa2Var43, sa2Var44, sa2Var45, sa2Var46, sa2Var47, sa2Var48, sa2Var49, sa2Var50, sa2Var51};
        EMPTY_TYPES = new Type[0];
        sa2[] values = values();
        VALUES = new sa2[values.length];
        for (sa2 sa2Var52 : values) {
            VALUES[sa2Var52.id] = sa2Var52;
        }
    }

    private sa2(String str, int i, int i2, a aVar, pc3 pc3Var) {
        int i3;
        this.id = i2;
        this.collection = aVar;
        this.javaType = pc3Var;
        int i4 = ra2.a[aVar.ordinal()];
        boolean z = true;
        if (i4 != 1) {
            if (i4 != 2) {
                this.elementType = null;
            } else {
                this.elementType = pc3Var.getBoxedType();
            }
        } else {
            this.elementType = pc3Var.getBoxedType();
        }
        this.primitiveScalar = (aVar != a.SCALAR || (i3 = ra2.b[pc3Var.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : false;
    }

    public static sa2 forId(int i) {
        if (i >= 0) {
            sa2[] sa2VarArr = VALUES;
            if (i < sa2VarArr.length) {
                return sa2VarArr[i];
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
                                e41.p(type, "Unable to find replacement for ");
                                return null;
                            }
                            u34.j("Type array mismatch");
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
                u34.j("Unable to identify parameter type for List<T>");
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

    public static sa2 valueOf(String str) {
        return (sa2) Enum.valueOf(sa2.class, str);
    }

    public static sa2[] values() {
        return (sa2[]) $VALUES.clone();
    }

    public pc3 getJavaType() {
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
