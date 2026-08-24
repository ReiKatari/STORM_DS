package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q60  reason: default package */
/* loaded from: classes.dex */
public abstract class q60 {
    public static final r41[] a = new r41[0];
    public static final byte[] b = new byte[0];
    public static final zv0 c = new zv0(-1943209074, false, new kw0(25));
    public static final zv0 d = new zv0(-2081621257, false, new kw0(26));
    public static final zv0 e = new zv0(-1394817530, false, new kw0(27));
    public static final zv0 f = new zv0(707011015, false, new kw0(28));
    public static final zv0 g = new zv0(1890101041, false, new iw0(23));
    public static final Type[] h = new Type[0];
    public static final int[] i = {16842752, R.attr.theme};
    public static final int[] j = {R.attr.materialThemeOverlay};
    public static final wb6[] k = new wb6[0];
    public static final /* synthetic */ int l = 0;
    public static e33 m;
    public static e33 n;
    public static e33 o;

    public static final boolean A(long j2, long j3) {
        if (j2 == j3) {
            return true;
        }
        return false;
    }

    public static Object B(Class cls, Object obj) {
        if (obj instanceof ir2) {
            return cls.cast(obj);
        }
        if (obj instanceof jr2) {
            return B(cls, ((jr2) obj).c());
        }
        Class<?> cls2 = obj.getClass();
        throw new IllegalStateException("Given component holder " + cls2 + " does not implement " + ir2.class + " or " + jr2.class);
    }

    public static final ug1 D(l61 l61Var) {
        ug1 ug1Var;
        j61 Z = l61Var.Z(d90.r0);
        if (Z instanceof ug1) {
            ug1Var = (ug1) Z;
        } else {
            ug1Var = null;
        }
        if (ug1Var == null) {
            return td1.a;
        }
        return ug1Var;
    }

    public static final e33 E() {
        e33 e33Var = m;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.Download", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(5.0f, 20.0f);
        ww2Var.l(14.0f);
        ww2Var.u(-2.0f);
        ww2Var.k(5.0f);
        ww2Var.t(20.0f);
        ww2Var.g();
        ww2Var.o(19.0f, 9.0f);
        ww2Var.l(-4.0f);
        ww2Var.t(3.0f);
        ww2Var.k(9.0f);
        ww2Var.u(6.0f);
        ww2Var.k(5.0f);
        ww2Var.n(7.0f, 7.0f);
        ww2Var.m(19.0f, 9.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b2 = d33Var.b();
        m = b2;
        return b2;
    }

    public static final e33 F() {
        e33 e33Var = n;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.EmojiEvents", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(19.0f, 5.0f);
        ww2Var.l(-2.0f);
        ww2Var.t(3.0f);
        ww2Var.k(7.0f);
        ww2Var.u(2.0f);
        ww2Var.k(5.0f);
        ww2Var.h(3.9f, 5.0f, 3.0f, 5.9f, 3.0f, 7.0f);
        ww2Var.u(1.0f);
        ww2Var.i(RecyclerView.B1, 2.55f, 1.92f, 4.63f, 4.39f, 4.94f);
        ww2Var.i(0.63f, 1.5f, 1.98f, 2.63f, 3.61f, 2.96f);
        ww2Var.t(19.0f);
        ww2Var.k(7.0f);
        ww2Var.u(2.0f);
        ww2Var.l(10.0f);
        ww2Var.u(-2.0f);
        ww2Var.l(-4.0f);
        ww2Var.u(-3.1f);
        ww2Var.i(1.63f, -0.33f, 2.98f, -1.46f, 3.61f, -2.96f);
        ww2Var.h(19.08f, 12.63f, 21.0f, 10.55f, 21.0f, 8.0f);
        ww2Var.t(7.0f);
        ww2Var.h(21.0f, 5.9f, 20.1f, 5.0f, 19.0f, 5.0f);
        ww2Var.g();
        ww2Var.o(5.0f, 8.0f);
        ww2Var.t(7.0f);
        ww2Var.l(2.0f);
        ww2Var.u(3.82f);
        ww2Var.h(5.84f, 10.4f, 5.0f, 9.3f, 5.0f, 8.0f);
        ww2Var.g();
        ww2Var.o(19.0f, 8.0f);
        ww2Var.i(RecyclerView.B1, 1.3f, -0.84f, 2.4f, -2.0f, 2.82f);
        ww2Var.t(7.0f);
        ww2Var.l(2.0f);
        ww2Var.t(8.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b2 = d33Var.b();
        n = b2;
        return b2;
    }

    public static Type G(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return G(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return G(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static na H() {
        String lowerCase = V().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (!qs6.j0(lowerCase, "830", false) && !qs6.j0(lowerCase, "adreno 8", false) && !qs6.j0(lowerCase, "adreno8", false)) {
            if (!qs6.j0(lowerCase, "750", false) && !qs6.j0(lowerCase, "740", false) && !qs6.j0(lowerCase, "730", false) && !qs6.j0(lowerCase, "725", false) && !qs6.j0(lowerCase, "720", false) && !qs6.j0(lowerCase, "710", false) && !qs6.j0(lowerCase, "702", false) && !qs6.j0(lowerCase, "adreno 7", false) && !qs6.j0(lowerCase, "adreno7", false)) {
                if (!qs6.j0(lowerCase, "690", false) && !qs6.j0(lowerCase, "680", false) && !qs6.j0(lowerCase, "660", false) && !qs6.j0(lowerCase, "650", false) && !qs6.j0(lowerCase, "642", false) && !qs6.j0(lowerCase, "640", false) && !qs6.j0(lowerCase, "630", false) && !qs6.j0(lowerCase, "620", false) && !qs6.j0(lowerCase, "619", false) && !qs6.j0(lowerCase, "618", false) && !qs6.j0(lowerCase, "616", false) && !qs6.j0(lowerCase, "615", false) && !qs6.j0(lowerCase, "612", false) && !qs6.j0(lowerCase, "610", false) && !qs6.j0(lowerCase, "adreno 6", false) && !qs6.j0(lowerCase, "adreno6", false)) {
                    if (M()) {
                        return na.ADRENO_7XX;
                    }
                    return na.NON_ADRENO;
                }
                return na.ADRENO_6XX;
            }
            return na.ADRENO_7XX;
        }
        return na.ADRENO_8XX;
    }

    public static final gg3 I(gg3 gg3Var) {
        gg3Var.getClass();
        if (gg3Var.e().c()) {
            return gg3Var;
        }
        return new jh4(gg3Var);
    }

    public static Class J(Type type) {
        String name;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(J(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return J(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            name = "null";
        } else {
            name = type.getClass().getName();
        }
        fa6.f("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", name);
        return null;
    }

    public static Type K(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if (cls2.isAssignableFrom(cls)) {
            return W(type, cls, G(type, cls, cls2), new HashMap());
        }
        throw new IllegalArgumentException(cls + " is not the same as or a subtype of " + cls2);
    }

    public static final int L(zu zuVar, Object obj, int i2) {
        int i3 = zuVar.L;
        if (i3 == 0) {
            return -1;
        }
        try {
            int v = g04.v(i3, i2, zuVar.A);
            if (v < 0 || nb3.k(obj, zuVar.B[v])) {
                return v;
            }
            int i4 = v + 1;
            while (i4 < i3 && zuVar.A[i4] == i2) {
                if (nb3.k(obj, zuVar.B[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = v - 1; i5 >= 0 && zuVar.A[i5] == i2; i5--) {
                if (nb3.k(obj, zuVar.B[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            i.l();
            return 0;
        }
    }

    public static boolean M() {
        if (qs6.j0(V(), "adreno", true) || new File("/sys/class/kgsl/kgsl-3d0").exists()) {
            return true;
        }
        return xs6.Z(Build.HARDWARE, "qcom", true);
    }

    public static boolean N(Context context) {
        if (context.getResources().getBoolean(R.bool.adrenotools_enabled) && Build.VERSION.SDK_INT >= 28) {
            String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
            strArr.getClass();
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (xs6.Z(strArr[i2], "arm64-v8a", true)) {
                    if (M()) {
                        return true;
                    }
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    public static final ar0 O(hg3 hg3Var) {
        ar0 c2 = hg3Var.c();
        if (c2 instanceof ar0) {
            return c2;
        }
        e41.w(c2, "Only KClass supported as classifier, got ");
        return null;
    }

    public static final String P(ar0 ar0Var) {
        ar0Var.getClass();
        String c2 = ar0Var.c();
        if (c2 == null) {
            c2 = "<local class name not available>";
        }
        return lb1.A("Serializer for class '", c2, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    public static final a74 Q(a74 a74Var, qn2 qn2Var) {
        return a74Var.d(new z21(qn2Var));
    }

    public static final String R(j36 j36Var) {
        StringBuilder sb = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = 0;
        do {
            if (i2 == 0) {
                sb.append("Foreign key violation(s) detected in '");
                sb.append(j36Var.R(0));
                sb.append("'.\n");
            }
            String R = j36Var.R(3);
            if (!linkedHashMap.containsKey(R)) {
                linkedHashMap.put(R, j36Var.R(2));
            }
            i2++;
        } while (j36Var.f0());
        sb.append("Number of different violations discovered: ");
        sb.append(linkedHashMap.keySet().size());
        sb.append("\nNumber of rows in violation: ");
        sb.append(i2);
        sb.append("\nViolation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            i61.B(sb, "\tParent Table = ", (String) entry.getValue(), ", Foreign Key Constraint Index = ", (String) entry.getKey());
            sb.append("\n");
        }
        return sb.toString();
    }

    public static final Object U(xv4 xv4Var, l55 l55Var) {
        l55Var.getClass();
        Object obj = xv4Var.get(l55Var);
        if (obj == null) {
            obj = l55Var.b();
        }
        return ((nk7) obj).a(xv4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (defpackage.qs6.v0(r1) == false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [em5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String V() {
        String str;
        String em5Var;
        Iterator it = hf.c0("/sys/class/kgsl/kgsl-3d0/gpu_model", "/sys/class/kgsl/kgsl-3d0/gpu_model_name", "/proc/gpuinfo").iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                File file = new File((String) it.next());
                if (!file.isFile()) {
                    file = null;
                }
                if (file != null) {
                    em5Var = jc2.B0(file);
                }
                em5Var = null;
            } catch (Throwable th) {
                em5Var = new em5(th);
            }
            if (!(em5Var instanceof em5)) {
                str = em5Var;
            }
            str = str;
        } while (str == null);
        if (str == null) {
            return "";
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x013f, code lost:
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0141, code lost:
        r13.put(r1, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0144, code lost:
        return r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013f A[EDGE_INSN: B:85:0x013f->B:80:0x013f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v3, types: [wu2] */
    /* JADX WARN: Type inference failed for: r12v4, types: [wu2] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type W(Type type, Class cls, Type type2, HashMap hashMap) {
        Type W;
        Type[] typeArr;
        Type[] typeArr2;
        Type vu2Var;
        Class cls2;
        TypeVariable typeVariable = null;
        while (true) {
            int i2 = 0;
            if (type2 instanceof TypeVariable) {
                TypeVariable typeVariable2 = type2;
                Type type3 = (Type) hashMap.get(typeVariable2);
                Class cls3 = Void.TYPE;
                if (type3 != null) {
                    if (type3 == cls3) {
                        return type2;
                    }
                    return type3;
                }
                hashMap.put(typeVariable2, cls3);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                GenericDeclaration genericDeclaration = typeVariable2.getGenericDeclaration();
                if (genericDeclaration instanceof Class) {
                    cls2 = (Class) genericDeclaration;
                } else {
                    cls2 = null;
                }
                if (cls2 != null) {
                    Type G = G(type, cls, cls2);
                    if (G instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        int length = typeParameters.length;
                        while (i2 < length) {
                            if (typeVariable2.equals(typeParameters[i2])) {
                                type2 = ((ParameterizedType) G).getActualTypeArguments()[i2];
                                continue;
                                if (type2 == typeVariable2) {
                                    break;
                                }
                            } else {
                                i2++;
                            }
                        }
                        fa6.c();
                        return null;
                    }
                }
                type2 = typeVariable2;
                continue;
                if (type2 == typeVariable2) {
                }
            } else {
                if (type2 instanceof Class) {
                    Class cls4 = type2;
                    if (cls4.isArray()) {
                        Class<?> componentType = cls4.getComponentType();
                        Type W2 = W(type, cls, componentType, hashMap);
                        if (Objects.equals(componentType, W2)) {
                            type2 = cls4;
                        } else {
                            vu2Var = new uu2(0, W2);
                            type2 = vu2Var;
                        }
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    type2 = (GenericArrayType) type2;
                    Type genericComponentType = type2.getGenericComponentType();
                    Type W3 = W(type, cls, genericComponentType, hashMap);
                    if (!Objects.equals(genericComponentType, W3)) {
                        vu2Var = new uu2(0, W3);
                        type2 = vu2Var;
                    }
                } else if (type2 instanceof ParameterizedType) {
                    type2 = (ParameterizedType) type2;
                    Type ownerType = type2.getOwnerType();
                    Type W4 = W(type, cls, ownerType, hashMap);
                    boolean equals = Objects.equals(W4, ownerType);
                    Type[] actualTypeArguments = type2.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    Type[] typeArr3 = actualTypeArguments;
                    boolean z = false;
                    while (i2 < length2) {
                        Type W5 = W(type, cls, typeArr3[i2], hashMap);
                        if (!Objects.equals(W5, typeArr3[i2])) {
                            if (!z) {
                                typeArr3 = (Type[]) typeArr3.clone();
                                z = true;
                            }
                            typeArr3[i2] = W5;
                        }
                        i2++;
                    }
                    if (!equals || z) {
                        vu2Var = new vu2(W4, (Class) type2.getRawType(), typeArr3);
                        type2 = vu2Var;
                    }
                } else if (type2 instanceof WildcardType) {
                    type2 = (WildcardType) type2;
                    Type[] lowerBounds = type2.getLowerBounds();
                    Type[] upperBounds = type2.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type W6 = W(type, cls, lowerBounds[0], hashMap);
                        if (W6 != lowerBounds[0]) {
                            if (W6 instanceof WildcardType) {
                                typeArr2 = ((WildcardType) W6).getLowerBounds();
                            } else {
                                typeArr2 = new Type[]{W6};
                            }
                            type2 = new wu2(new Type[]{Object.class}, typeArr2, 0);
                        }
                    } else if (upperBounds.length == 1 && (W = W(type, cls, upperBounds[0], hashMap)) != upperBounds[0]) {
                        if (W instanceof WildcardType) {
                            typeArr = ((WildcardType) W).getUpperBounds();
                        } else {
                            typeArr = new Type[]{W};
                        }
                        type2 = new wu2(typeArr, h, 0);
                    }
                }
            }
        }
    }

    public static final a74 X(j27 j27Var) {
        return new o07(j27Var);
    }

    public static final long Y(long j2) {
        boolean z;
        jd1 jd1Var = oq1.B;
        if (j2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return oq1.e(oq1.j(j2, n16.M(999999L, uq1.NANOSECONDS)));
        }
        if (!z) {
            return 0L;
        }
        i.d();
        return 0L;
    }

    public static String Z(int i2) {
        return xg6.o("OperatingMode(mode=", i2, ')');
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, final on2 on2Var, final zv0 zv0Var, final eo2 eo2Var, boolean z, px0 px0Var, final int i2, final int i3) {
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        final boolean z4;
        cf5 t;
        boolean z5;
        int i6;
        int i7;
        int i8;
        int i9;
        str.getClass();
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(730854861);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(str)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i4 = i9 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.h(on2Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i4 |= i8;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(zv0Var)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (xq2Var.h(eo2Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i4 |= i6;
        }
        int i10 = i3 & 16;
        if (i10 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            z2 = z;
            if (xq2Var.g(z2)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i4 |= i5;
            if ((i4 & 9363) == 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!xq2Var.S(i4 & 1, z3)) {
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                u24.c(on2Var, null, n16.I(2011387140, new f20(z5, str, zv0Var, eo2Var, 0), xq2Var), xq2Var, ((i4 >> 3) & 14) | RendererDebugBridge.CAPTURE_HEIGHT);
                z4 = z5;
            } else {
                xq2Var.V();
                z4 = z2;
            }
            t = xq2Var.t();
            if (t == null) {
                t.d = new eo2() { // from class: g20
                    @Override // defpackage.eo2
                    public final Object o(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        q60.a(str, on2Var, zv0Var, eo2Var, z4, (px0) obj, ii2.a0(i2 | 1), i3);
                        return jg7.a;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        if ((i4 & 9363) == 9362) {
        }
        if (!xq2Var.S(i4 & 1, z3)) {
        }
        t = xq2Var.t();
        if (t == null) {
        }
    }

    public static String a0(long j2) {
        if (A(j2, 12884901888L)) {
            return "Rgb";
        }
        if (A(j2, 12884901889L)) {
            return "Xyz";
        }
        if (A(j2, 12884901890L)) {
            return "Lab";
        }
        if (A(j2, 17179869187L)) {
            return "Cmyk";
        }
        return "Unknown";
    }

    public static final void b(String str, boolean z, on2 on2Var, px0 px0Var, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        on2 on2Var2;
        boolean z3;
        boolean z4;
        str.getClass();
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(883884621);
        if (xq2Var.f(str)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i8 = i4 | i2;
        int i9 = i3 & 2;
        if (i9 != 0) {
            i6 = i8 | 48;
        } else {
            if (xq2Var.g(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i6 = i8 | i5;
        }
        if (xq2Var.h(on2Var)) {
            i7 = 256;
        } else {
            i7 = 128;
        }
        int i10 = i6 | i7;
        if ((i10 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i10 & 1, z2)) {
            if (i9 != 0) {
                z4 = true;
            } else {
                z4 = z;
            }
            mb3.o(on2Var, null, z4, mb3.K(xq2Var), n16.I(-106743248, new e20(str, 0), xq2Var), xq2Var, ((i10 >> 6) & 14) | 805306368 | ((i10 << 3) & 896), 378);
            on2Var2 = on2Var;
            z3 = z4;
        } else {
            on2Var2 = on2Var;
            xq2Var.V();
            z3 = z;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new yl(str, z3, on2Var2, i2, i3);
        }
    }

    public static String b0(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    public static final void c(a74 a74Var, on2 on2Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1906451854);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.h(on2Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            a74 O = ge7.O(a74Var, 32.0f);
            e34 d2 = h70.d(d90.Z, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, O);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, d2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            yt0 a2 = wt0.a(new gu(16.0f, true, new i(1)), d90.l0, xq2Var, 54);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E2 = l.E(xq2Var, x64.a);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a2);
            yh2.K(xq2Var, pnVar2, l3);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            x37.b(yh2.O(xq2Var, R.string.retro_achievements_load_error), null, 0L, 0L, null, null, 0L, new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var, 0, 0, 130558);
            i4 = 1;
            mb3.a(on2Var, null, false, null, null, null, mb3.I(xq2Var), null, vy7.X, xq2Var, ((i3 >> 3) & 14) | 805306368, 382);
            xq2Var.p(true);
            xq2Var.p(true);
        } else {
            i4 = 1;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new v4(a74Var, on2Var, i2, i4);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [wv4, aw4] */
    public static final xv4 c0(pq[] pqVarArr, xv4 xv4Var, xv4 xv4Var2) {
        xv4 xv4Var3 = xv4.R;
        ?? aw4Var = new aw4(xv4Var3);
        aw4Var.Z = xv4Var3;
        for (pq pqVar : pqVarArr) {
            l55 l55Var = (l55) pqVar.f;
            if (pqVar.e || !xv4Var.containsKey(l55Var)) {
                aw4Var.put(l55Var, l55Var.c(pqVar, (nk7) xv4Var2.get(l55Var)));
            }
        }
        return aw4Var.b();
    }

    public static final void d(a74 a74Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1075706924);
        if (xq2Var.f(a74Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i4 & 1, z)) {
            e34 d2 = h70.d(d90.Z, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, a74Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, d2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            e45.a(null, ((ut0) xq2Var.j(vt0.a)).i(), RecyclerView.B1, 0L, 0, xq2Var, 0, 29);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new v00(a74Var, i2, 4);
        }
    }

    public static final a74 d0(a74 a74Var, tt7 tt7Var) {
        return a74Var.d(new l83(tt7Var));
    }

    public static final void e(a74 a74Var, g06 g06Var, eo2 eo2Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-176169450);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.f(g06Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(eo2Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            Object[] objArr = new Object[0];
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = new kt5(2);
                xq2Var.l0(P);
            }
            qa4 qa4Var = (qa4) qo2.I(objArr, (on2) P, xq2Var, 48);
            a74 O = ge7.O(a74Var, 32.0f);
            e34 d2 = h70.d(d90.Z, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, O);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, d2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            yt0 a2 = wt0.a(new gu(16.0f, true, new i(1)), d90.l0, xq2Var, 54);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E2 = l.E(xq2Var, x64.a);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a2);
            yh2.K(xq2Var, pnVar2, l3);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            x37.b(yh2.O(xq2Var, R.string.retro_achievements_login_description), null, 0L, 0L, null, null, 0L, new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var, 0, 0, 130558);
            xq2Var = xq2Var;
            boolean f2 = xq2Var.f(qa4Var);
            Object P2 = xq2Var.P();
            if (f2 || P2 == vs0Var) {
                P2 = new oe4(qa4Var, 20);
                xq2Var.l0(P2);
            }
            mb3.a((on2) P2, null, false, null, null, null, mb3.I(xq2Var), null, vy7.L, xq2Var, 805306368, 382);
            xq2Var.p(true);
            xq2Var.p(true);
            if (((Boolean) qa4Var.getValue()).booleanValue()) {
                xq2Var.b0(186996890);
                String str = g06Var.a;
                boolean f3 = xq2Var.f(qa4Var);
                Object P3 = xq2Var.P();
                if (f3 || P3 == vs0Var) {
                    P3 = new oe4(qa4Var, 21);
                    xq2Var.l0(P3);
                }
                on2 on2Var = (on2) P3;
                if ((i3 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean f4 = xq2Var.f(qa4Var) | z2;
                Object P4 = xq2Var.P();
                if (f4 || P4 == vs0Var) {
                    P4 = new c06(eo2Var, qa4Var, 1);
                    xq2Var.l0(P4);
                }
                kj2.c(str, on2Var, (eo2) P4, xq2Var, 0);
                xq2Var.p(false);
            } else {
                xq2Var.b0(187290956);
                xq2Var.p(false);
            }
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new rl(a74Var, g06Var, eo2Var, i2, 23);
        }
    }

    public static Context e0(Context context, AttributeSet attributeSet, int i2, int i3) {
        return f0(context, attributeSet, i2, i3, new int[0]);
    }

    public static final void f(a74 a74Var, eo2 eo2Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1547843077);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i2 | i5;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.h(eo2Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        int i6 = i3;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i6 & 1, z)) {
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = np2.Y(Boolean.FALSE);
                xq2Var.l0(P);
            }
            qa4 qa4Var = (qa4) P;
            a74 O = ge7.O(a74Var, 32.0f);
            e34 d2 = h70.d(d90.Z, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, O);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, d2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            yt0 a2 = wt0.a(new gu(16.0f, true, new i(1)), d90.l0, xq2Var, 54);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E2 = l.E(xq2Var, x64.a);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a2);
            yh2.K(xq2Var, pnVar2, l3);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            x37.b(yh2.O(xq2Var, R.string.retro_achievements_login_error), null, 0L, 0L, null, null, 0L, new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var, 0, 0, 130558);
            xq2Var = xq2Var;
            Object P2 = xq2Var.P();
            if (P2 == vs0Var) {
                P2 = new oe4(qa4Var, 17);
                xq2Var.l0(P2);
            }
            mb3.a((on2) P2, null, false, null, null, null, mb3.I(xq2Var), null, vy7.R, xq2Var, 805306374, 382);
            xq2Var.p(true);
            xq2Var.p(true);
            if (((Boolean) qa4Var.getValue()).booleanValue()) {
                xq2Var.b0(1025111837);
                Object P3 = xq2Var.P();
                if (P3 == vs0Var) {
                    P3 = new oe4(qa4Var, 18);
                    xq2Var.l0(P3);
                }
                on2 on2Var = (on2) P3;
                if ((i6 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object P4 = xq2Var.P();
                if (!z2 && P4 != vs0Var) {
                    z3 = false;
                } else {
                    z3 = false;
                    P4 = new c06(eo2Var, qa4Var, 0);
                    xq2Var.l0(P4);
                }
                kj2.c(null, on2Var, (eo2) P4, xq2Var, 54);
                xq2Var.p(z3);
            } else {
                xq2Var.b0(1025388605);
                xq2Var.p(false);
            }
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new hp(a74Var, i2, 11, eo2Var);
        }
    }

    public static Context f0(Context context, AttributeSet attributeSet, int i2, int i3, int[] iArr) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j, i2, i3);
        int[] iArr2 = {obtainStyledAttributes.getResourceId(0, 0)};
        obtainStyledAttributes.recycle();
        int i4 = iArr2[0];
        if ((context instanceof p41) && ((p41) context).A == i4) {
            z = true;
        } else {
            z = false;
        }
        if (i4 != 0 && !z) {
            p41 p41Var = new p41(context, i4);
            int length = iArr.length;
            int[] iArr3 = new int[length];
            if (iArr.length > 0) {
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
                for (int i5 = 0; i5 < iArr.length; i5++) {
                    iArr3[i5] = obtainStyledAttributes2.getResourceId(i5, 0);
                }
                obtainStyledAttributes2.recycle();
            }
            for (int i6 = 0; i6 < length; i6++) {
                int i7 = iArr3[i6];
                if (i7 != 0) {
                    p41Var.getTheme().applyStyle(i7, true);
                }
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, i);
            int resourceId = obtainStyledAttributes3.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes3.getResourceId(1, 0);
            obtainStyledAttributes3.recycle();
            if (resourceId == 0) {
                resourceId = resourceId2;
            }
            if (resourceId != 0) {
                p41Var.getTheme().applyStyle(resourceId, true);
            }
            return p41Var;
        }
        return context;
    }

    public static final void g(a74 a74Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1227064775);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            a74 O = ge7.O(a74Var, 32.0f);
            e34 d2 = h70.d(d90.Z, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, O);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, d2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            x37.b(yh2.O(xq2Var, R.string.retro_achievements_no_achievements), nw7.f0(x64.a, false, null, 3), 0L, 0L, null, null, 0L, new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var, 48, 0, 130556);
            xq2Var = xq2Var;
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new f5(a74Var, i2, 6, (byte) 0);
        }
    }

    public static final void h(a74 a74Var, oi4 oi4Var, on2 on2Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        on2 on2Var2;
        xq2 xq2Var;
        boolean z2;
        boolean z3;
        int i4;
        List c0;
        long c2;
        iy0 iy0Var;
        long c3;
        String str;
        String str2;
        a74 b2;
        a74 b3;
        long c4;
        String str3;
        long c5;
        String quantityString;
        String str4;
        String str5;
        boolean z4;
        long c6;
        long c7;
        int i5;
        int i6;
        int i7;
        a74Var.getClass();
        oi4Var.getClass();
        Long l2 = oi4Var.e;
        boolean z5 = oi4Var.g;
        ui4 ui4Var = oi4Var.d;
        on2Var.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(581343799);
        if ((i2 & 6) == 0) {
            if (xq2Var2.f(a74Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var2.f(oi4Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var2.h(on2Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i3 & 1, z)) {
            es7 F = bl2.F(xq2Var2);
            Context context = (Context) xq2Var2.j(kf.b);
            a74 O = ge7.O(dj6.c(a74Var, 1.0f), 16.0f);
            gu guVar = new gu(12.0f, true, new i(1));
            c40 c40Var = d90.k0;
            yt0 a2 = wt0.a(guVar, c40Var, xq2Var2, 6);
            int hashCode = Long.hashCode(xq2Var2.T);
            xv4 l3 = xq2Var2.l();
            a74 E = l.E(xq2Var2, O);
            jx0.i.getClass();
            iy0 iy0Var2 = ix0.b;
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var2);
            } else {
                xq2Var2.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var2, pnVar, a2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var2, pnVar2, l3);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var2, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var2, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var2, pnVar4, E);
            if (oi4Var.a == ni4.ENABLED) {
                z2 = true;
            } else {
                z2 = false;
            }
            x64 x64Var = x64.a;
            boolean z6 = z2;
            a74 g2 = u24.g(dj6.c(x64Var, 1.0f), z16.b(14.0f));
            if (z6) {
                z3 = z5;
                i4 = i3;
                c0 = hf.c0(new kt0(hv.c(4278603323L)), new kt0(hv.c(4278332450L)));
            } else {
                z3 = z5;
                i4 = i3;
                c0 = hf.c0(new kt0(hv.c(4282718723L)), new kt0(hv.c(4280031511L)));
            }
            a74 J = vy7.J(g2, d90.k(c0, RecyclerView.B1, RecyclerView.B1, 14));
            if (z6) {
                c2 = kt0.c(0.5f, hv.c(4279286145L));
            } else {
                c2 = kt0.c(0.5f, hv.c(4294286859L));
            }
            a74 O2 = ge7.O(ak7.I(J, 1.0f, c2, z16.b(14.0f)), 16.0f);
            e40 e40Var = d90.L;
            e34 d2 = h70.d(e40Var, false);
            int hashCode2 = Long.hashCode(xq2Var2.T);
            xv4 l4 = xq2Var2.l();
            a74 E2 = l.E(xq2Var2, O2);
            xq2Var2.f0();
            if (xq2Var2.S) {
                iy0Var = iy0Var2;
                xq2Var2.k(iy0Var);
            } else {
                iy0Var = iy0Var2;
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, d2);
            yh2.K(xq2Var2, pnVar2, l4);
            i61.w(hashCode2, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E2);
            d40 d40Var = d90.i0;
            du duVar = ju.a;
            l26 a3 = k26.a(duVar, d40Var, xq2Var2, 48);
            int hashCode3 = Long.hashCode(xq2Var2.T);
            xv4 l5 = xq2Var2.l();
            a74 E3 = l.E(xq2Var2, x64Var);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, a3);
            yh2.K(xq2Var2, pnVar2, l5);
            i61.w(hashCode3, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E3);
            a74 g3 = u24.g(dj6.i(x64Var, 12.0f), z16.b(6.0f));
            if (z6) {
                c3 = hv.c(4279286145L);
            } else {
                c3 = hv.c(4294286859L);
            }
            h70.a(vy7.L(g3, c3, u24.m), xq2Var2, 0);
            gi2.h(xq2Var2, dj6.l(x64Var, 10.0f));
            eu euVar = ju.c;
            yt0 a4 = wt0.a(euVar, c40Var, xq2Var2, 0);
            int hashCode4 = Long.hashCode(xq2Var2.T);
            xv4 l6 = xq2Var2.l();
            a74 E4 = l.E(xq2Var2, x64Var);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, a4);
            yh2.K(xq2Var2, pnVar2, l6);
            i61.w(hashCode4, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E4);
            if (z6) {
                str = "ОФЛАЙН-СИСТЕМА RETROACHIEVEMENTS АКТИВНА";
            } else {
                str = "ОФЛАЙН-РЕЖИМ: ТРЕБУЕТСЯ ВХОД";
            }
            String str6 = str;
            pi2 pi2Var = qs7.a;
            oj2 oj2Var = oj2.e0;
            long D = hi2.D(12.5d);
            int i8 = kt0.i;
            long j2 = kt0.d;
            int i9 = i4;
            iy0 iy0Var3 = iy0Var;
            x37.b(str6, null, j2, D, oj2Var, pi2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1772928, 0, 130962);
            if (z6) {
                str2 = "Достижения сохраняются локально и синхронизируются при появлении сети";
            } else {
                str2 = "Войдите в аккаунт RetroAchievements для локального кэширования";
            }
            x37.b(str2, null, kt0.c(0.75f, j2), hi2.D(9.5d), null, qs7.c, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1576320, 0, 130994);
            i61.y(xq2Var2, true, true, true);
            a74 c8 = dj6.c(x64Var, 1.0f);
            l26 a5 = k26.a(new gu(8.0f, true, new i(1)), d90.h0, xq2Var2, 6);
            int hashCode5 = Long.hashCode(xq2Var2.T);
            xv4 l7 = xq2Var2.l();
            a74 E5 = l.E(xq2Var2, c8);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var3);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, a5);
            yh2.K(xq2Var2, pnVar2, l7);
            i61.x(xq2Var2, Integer.valueOf(hashCode5), xq2Var2, xq2Var2, E5);
            n26 n26Var = n26.a;
            b2 = n26Var.b(x64Var, 1.0f, true);
            a74 O3 = ge7.O(ak7.I(vy7.M(u24.g(b2, z16.b(12.0f)), F.b()), 1.0f, kt0.c(0.35f, hv.c(4278355143L)), z16.b(12.0f)), 12.0f);
            e34 d3 = h70.d(e40Var, false);
            int hashCode6 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z7 = xq2Var2.z();
            a74 E6 = l.E(xq2Var2, O3);
            iy0 b4 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b4);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), d3);
            yh2.K(xq2Var2, ix0.f(), z7);
            i61.x(xq2Var2, Integer.valueOf(hashCode6), xq2Var2, xq2Var2, E6);
            yt0 a6 = wt0.a(euVar, c40Var, xq2Var2, 0);
            int hashCode7 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z8 = xq2Var2.z();
            a74 E7 = l.E(xq2Var2, x64Var);
            iy0 b5 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b5);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), a6);
            yh2.K(xq2Var2, ix0.f(), z8);
            i61.x(xq2Var2, Integer.valueOf(hashCode7), xq2Var2, xq2Var2, E7);
            l26 a7 = k26.a(duVar, d40Var, xq2Var2, 48);
            int hashCode8 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z9 = xq2Var2.z();
            a74 E8 = l.E(xq2Var2, x64Var);
            iy0 b6 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b6);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), a7);
            yh2.K(xq2Var2, ix0.f(), z9);
            i61.x(xq2Var2, Integer.valueOf(hashCode8), xq2Var2, xq2Var2, E8);
            h70.a(vy7.M(u24.g(dj6.i(x64Var, 8.0f), z16.b(4.0f)), hv.c(4281908728L)), xq2Var2, 0);
            gi2.h(xq2Var2, dj6.l(x64Var, 6.0f));
            x37.b("СОФТКОР", null, hv.c(4281908728L), hi2.E(10), nj2.p(), qs7.a(), 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1772934, 0, 130962);
            xq2Var2.r();
            gi2.h(xq2Var2, dj6.e(x64Var, 6.0f));
            x37.b(oi4Var.b + " в очереди", null, F.d(), hi2.E(12), nj2.t(), qs7.b(), 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1772544, 0, 130962);
            x37.b("Ожидают отправки", null, F.f(), hi2.D(8.5d), null, qs7.b(), 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1575942, 0, 130994);
            xq2Var2.r();
            xq2Var2.r();
            b3 = n26Var.b(x64Var, 1.0f, true);
            a74 O4 = ge7.O(ak7.I(vy7.M(u24.g(b3, z16.b(12.0f)), F.b()), 1.0f, kt0.c(0.35f, hv.c(4292441862L)), z16.b(12.0f)), 12.0f);
            e34 d4 = h70.d(e40Var, false);
            int hashCode9 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z10 = xq2Var2.z();
            a74 E9 = l.E(xq2Var2, O4);
            iy0 b7 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b7);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), d4);
            yh2.K(xq2Var2, ix0.f(), z10);
            i61.x(xq2Var2, Integer.valueOf(hashCode9), xq2Var2, xq2Var2, E9);
            yt0 a8 = wt0.a(euVar, c40Var, xq2Var2, 0);
            int hashCode10 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z11 = xq2Var2.z();
            a74 E10 = l.E(xq2Var2, x64Var);
            iy0 b8 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b8);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), a8);
            yh2.K(xq2Var2, ix0.f(), z11);
            i61.x(xq2Var2, Integer.valueOf(hashCode10), xq2Var2, xq2Var2, E10);
            l26 a9 = k26.a(duVar, d40Var, xq2Var2, 48);
            int hashCode11 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z12 = xq2Var2.z();
            a74 E11 = l.E(xq2Var2, x64Var);
            iy0 b9 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b9);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), a9);
            yh2.K(xq2Var2, ix0.f(), z12);
            i61.x(xq2Var2, Integer.valueOf(hashCode11), xq2Var2, xq2Var2, E11);
            h70.a(vy7.M(u24.g(dj6.i(x64Var, 8.0f), z16.b(4.0f)), hv.c(4294688548L)), xq2Var2, 0);
            gi2.h(xq2Var2, dj6.l(x64Var, 6.0f));
            x37.b("ХАРДКОР ЛЕДЖЕР", null, hv.c(4294688548L), hi2.E(10), nj2.p(), qs7.a(), 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1772934, 0, 130962);
            xq2Var2.r();
            gi2.h(xq2Var2, dj6.e(x64Var, 6.0f));
            x37.b(oi4Var.c + " записей", null, F.d(), hi2.E(12), nj2.t(), qs7.b(), 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1772544, 0, 130962);
            x37.b("Защищенный журнал", null, F.f(), hi2.D(8.5d), null, qs7.b(), 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1575942, 0, 130994);
            xq2Var2.r();
            xq2Var2.r();
            xq2Var2.r();
            a74 O5 = ge7.O(vy7.M(u24.g(dj6.d(x64Var), z16.b(12.0f)), F.b()), 14.0f);
            e34 d5 = h70.d(e40Var, false);
            int hashCode12 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z13 = xq2Var2.z();
            a74 E12 = l.E(xq2Var2, O5);
            iy0 b10 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b10);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), d5);
            yh2.K(xq2Var2, ix0.f(), z13);
            yh2.K(xq2Var2, ix0.c(), Integer.valueOf(hashCode12));
            yh2.F(xq2Var2, ix0.a());
            yh2.K(xq2Var2, ix0.e(), E12);
            yt0 a10 = wt0.a(new gu(8.0f, true, new i(1)), c40Var, xq2Var2, 6);
            int hashCode13 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z14 = xq2Var2.z();
            a74 E13 = l.E(xq2Var2, x64Var);
            iy0 b11 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b11);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), a10);
            yh2.K(xq2Var2, ix0.f(), z14);
            i61.x(xq2Var2, Integer.valueOf(hashCode13), xq2Var2, xq2Var2, E13);
            a74 d6 = dj6.d(x64Var);
            vs0 vs0Var = ju.e;
            l26 a11 = k26.a(vs0Var, d40Var, xq2Var2, 54);
            int hashCode14 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z15 = xq2Var2.z();
            a74 E14 = l.E(xq2Var2, d6);
            iy0 b12 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b12);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), a11);
            yh2.K(xq2Var2, ix0.f(), z15);
            i61.x(xq2Var2, Integer.valueOf(hashCode14), xq2Var2, xq2Var2, E14);
            l26 a12 = k26.a(duVar, d40Var, xq2Var2, 48);
            int hashCode15 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z16 = xq2Var2.z();
            a74 E15 = l.E(xq2Var2, x64Var);
            iy0 b13 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b13);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), a12);
            yh2.K(xq2Var2, ix0.f(), z16);
            i61.x(xq2Var2, Integer.valueOf(hashCode15), xq2Var2, xq2Var2, E15);
            a74 g4 = u24.g(dj6.i(x64Var, 8.0f), z16.b(4.0f));
            ui4 ui4Var2 = ui4.OK;
            if (ui4Var != ui4Var2 && ui4Var != ui4.EMPTY) {
                c4 = hv.c(4293870660L);
            } else {
                c4 = hv.c(4279286145L);
            }
            h70.a(vy7.M(g4, c4), xq2Var2, 0);
            gi2.h(xq2Var2, dj6.l(x64Var, 8.0f));
            x64 x64Var2 = x64Var;
            x37.b("Целостность журнала достижений", null, F.d(), hi2.E(11), null, qs7.a(), 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1575942, 0, 130994);
            xq2Var2.r();
            if (ui4Var != ui4Var2 && ui4Var != ui4.EMPTY) {
                str3 = "НАРУШЕНА";
            } else {
                str3 = "ПОДТВЕРЖДЕНА (OK)";
            }
            sr2 b14 = qs7.b();
            oj2 p = nj2.p();
            long E16 = hi2.E(10);
            if (ui4Var != ui4Var2 && ui4Var != ui4.EMPTY) {
                c5 = hv.c(4293870660L);
            } else {
                c5 = hv.c(4279286145L);
            }
            x37.b(str3, null, c5, E16, p, b14, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1772544, 0, 130962);
            xq2 xq2Var3 = xq2Var2;
            xq2Var3.r();
            Long l8 = oi4Var.e;
            xq2Var3.b0(1363451086);
            vs0 vs0Var2 = ox0.a;
            if (l8 == null) {
                xq2Var3.p(false);
                str4 = null;
            } else {
                Context context2 = (Context) xq2Var3.j(kf.b);
                boolean e2 = xq2Var3.e(l8.longValue()) | xq2Var3.f(context2);
                Object P = xq2Var3.P();
                if (e2 || P == vs0Var2) {
                    if (l8.longValue() <= 0) {
                        quantityString = context2.getString(R.string.offline_ra_ledger_expired);
                    } else {
                        long longValue = (l8.longValue() + 86399999) / 86400000;
                        if (longValue < 1) {
                            longValue = 1;
                        }
                        int i10 = (int) longValue;
                        quantityString = context2.getResources().getQuantityString(R.plurals.offline_ra_ledger_expires_days, i10, Integer.valueOf(i10));
                    }
                    P = quantityString;
                    xq2Var3.l0(P);
                }
                xq2Var3.p(false);
                str4 = (String) P;
            }
            if (str4 != null) {
                xq2Var3.b0(615304982);
                a74 d7 = dj6.d(x64Var2);
                l26 a13 = k26.a(vs0Var, d40Var, xq2Var3, 54);
                int hashCode16 = Long.hashCode(ge7.C(xq2Var3));
                xv4 z17 = xq2Var3.z();
                a74 E17 = l.E(xq2Var3, d7);
                iy0 b15 = ix0.b();
                xq2Var3.f0();
                if (xq2Var3.D()) {
                    xq2Var3.k(b15);
                } else {
                    xq2Var3.o0();
                }
                yh2.K(xq2Var3, ix0.d(), a13);
                yh2.K(xq2Var3, ix0.f(), z17);
                i61.x(xq2Var3, Integer.valueOf(hashCode16), xq2Var3, xq2Var3, E17);
                l26 a14 = k26.a(duVar, d40Var, xq2Var3, 48);
                int hashCode17 = Long.hashCode(ge7.C(xq2Var3));
                xv4 z18 = xq2Var3.z();
                a74 E18 = l.E(xq2Var3, x64Var2);
                iy0 b16 = ix0.b();
                xq2Var3.f0();
                if (xq2Var3.D()) {
                    xq2Var3.k(b16);
                } else {
                    xq2Var3.o0();
                }
                yh2.K(xq2Var3, ix0.d(), a14);
                yh2.K(xq2Var3, ix0.f(), z18);
                i61.x(xq2Var3, Integer.valueOf(hashCode17), xq2Var3, xq2Var3, E18);
                a74 g5 = u24.g(dj6.i(x64Var2, 8.0f), z16.b(4.0f));
                if (l2 != null && l2.longValue() <= 0) {
                    c6 = hv.c(4293870660L);
                } else {
                    c6 = hv.c(4289222135L);
                }
                h70.a(vy7.M(g5, c6), xq2Var3, 0);
                gi2.h(xq2Var3, dj6.l(x64Var2, 8.0f));
                x64Var2 = x64Var2;
                str5 = null;
                x37.b("Срок действия кэша", null, F.d(), hi2.E(11), null, qs7.a(), 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 1575942, 0, 130994);
                xq2Var3.r();
                sr2 b17 = qs7.b();
                long E19 = hi2.E(10);
                if (l2 != null && l2.longValue() <= 0) {
                    c7 = hv.c(4293870660L);
                } else {
                    c7 = hv.c(4289222135L);
                }
                x37.b(str4, null, c7, E19, null, b17, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 1575936, 0, 130994);
                xq2Var3 = xq2Var3;
                xq2Var3.r();
                xq2Var3.s();
            } else {
                str5 = null;
                xq2Var3.b0(616797012);
                xq2Var3.s();
            }
            xq2Var3.r();
            xq2Var3.r();
            if (z3) {
                xq2Var3.b0(-2006614680);
                e45.b(dj6.d(x64Var2), hv.c(4294901845L), 0L, xq2Var3, 54, 12);
                xq2Var3.s();
            } else {
                xq2Var3.b0(-2006436895);
                xq2Var3.s();
            }
            a74 J2 = vy7.J(u24.g(dj6.d(x64Var2), z16.b(10.0f)), d90.k(hf.c0(kt0.a(hv.c(4294901845L)), kt0.a(hv.c(4290646588L))), RecyclerView.B1, RecyclerView.B1, 14));
            boolean z19 = !z3;
            if ((i9 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean h2 = xq2Var3.h(context) | z4;
            Object P2 = xq2Var3.P();
            if (!h2 && P2 != vs0Var2) {
                on2Var2 = on2Var;
            } else {
                on2Var2 = on2Var;
                P2 = new pe4(on2Var2, context);
                xq2Var3.l0(P2);
            }
            a74 Q = ge7.Q(mb3.u(J2, z19, str5, (on2) P2, 14), RecyclerView.B1, 12.0f, 1);
            e34 d8 = h70.d(d90.Z, false);
            int hashCode18 = Long.hashCode(ge7.C(xq2Var3));
            xv4 z20 = xq2Var3.z();
            a74 E20 = l.E(xq2Var3, Q);
            iy0 b18 = ix0.b();
            xq2Var3.f0();
            if (xq2Var3.D()) {
                xq2Var3.k(b18);
            } else {
                xq2Var3.o0();
            }
            yh2.K(xq2Var3, ix0.d(), d8);
            yh2.K(xq2Var3, ix0.f(), z20);
            i61.x(xq2Var3, Integer.valueOf(hashCode18), xq2Var3, xq2Var3, E20);
            l26 a15 = k26.a(duVar, d40Var, xq2Var3, 48);
            int hashCode19 = Long.hashCode(ge7.C(xq2Var3));
            xv4 z21 = xq2Var3.z();
            x64 x64Var3 = x64Var2;
            a74 E21 = l.E(xq2Var3, x64Var3);
            iy0 b19 = ix0.b();
            xq2Var3.f0();
            if (xq2Var3.D()) {
                xq2Var3.k(b19);
            } else {
                xq2Var3.o0();
            }
            yh2.K(xq2Var3, ix0.d(), a15);
            yh2.K(xq2Var3, ix0.f(), z21);
            i61.x(xq2Var3, Integer.valueOf(hashCode19), xq2Var3, xq2Var3, E21);
            if (z3) {
                xq2Var3.b0(532202896);
                xq2 xq2Var4 = xq2Var3;
                e45.a(dj6.i(x64Var3, 16.0f), xd5.q(), 2.0f, 0L, 0, xq2Var4, 438, 24);
                gi2.h(xq2Var4, dj6.l(x64Var3, 8.0f));
                pi2 a16 = qs7.a();
                xq2Var = xq2Var4;
                x37.b("СИНХРОНИЗАЦИЯ...", null, xd5.q(), hi2.E(12), nj2.p(), a16, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772934, 0, 130962);
                xq2Var.s();
            } else {
                xq2Var3.b0(532782348);
                pi2 a17 = qs7.a();
                xq2Var = xq2Var3;
                x37.b("СИНХРОНИЗИРОВАТЬ С СЕРВЕРОМ СЕЙЧАС", null, xd5.q(), hi2.E(12), nj2.p(), a17, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772934, 0, 130962);
                xq2Var.s();
            }
            xq2Var.r();
            xq2Var.r();
            xq2Var.r();
        } else {
            on2Var2 = on2Var;
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.e(new rl(a74Var, oi4Var, on2Var2, i2, 24));
        }
    }

    public static final void i(final a74 a74Var, final lq4 lq4Var, j06 j06Var, final oi4 oi4Var, final eo2 eo2Var, final on2 on2Var, final qn2 qn2Var, final on2 on2Var2, qn2 qn2Var2, eo2 eo2Var2, final qn2 qn2Var3, px0 px0Var, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        final qn2 qn2Var4;
        final eo2 eo2Var3;
        qn2 qn2Var5;
        eo2 eo2Var4;
        int i8;
        boolean z2;
        final j06 j06Var2 = j06Var;
        a74Var.getClass();
        lq4Var.getClass();
        j06Var2.getClass();
        oi4Var.getClass();
        eo2Var.getClass();
        on2Var.getClass();
        qn2Var.getClass();
        on2Var2.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1885867712);
        int i9 = 4;
        if (xq2Var.f(a74Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i2 | i3;
        if (xq2Var.f(lq4Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        if (xq2Var.f(j06Var2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i12 = i11 | i5;
        if (xq2Var.h(eo2Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (xq2Var.h(on2Var)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i14 = i13 | i7 | 369098752;
        qn2 qn2Var6 = qn2Var3;
        if (!xq2Var.h(qn2Var6)) {
            i9 = 2;
        }
        if ((302063763 & i14) == 302063762 && (i9 & 3) == 2) {
            z = false;
        } else {
            z = true;
        }
        if (xq2Var.S(i14 & 1, z)) {
            xq2Var.X();
            int i15 = i2 & 1;
            Object obj = ox0.a;
            if (i15 != 0 && !xq2Var.B()) {
                xq2Var.V();
                i8 = i14 & (-1879048193);
                qn2Var5 = qn2Var2;
                eo2Var4 = eo2Var2;
            } else {
                Object P = xq2Var.P();
                if (P == obj) {
                    P = new gn5(19);
                    xq2Var.l0(P);
                }
                qn2Var5 = (qn2) P;
                Object P2 = xq2Var.P();
                if (P2 == obj) {
                    P2 = new wg(2, null, 8);
                    xq2Var.l0(P2);
                }
                eo2Var4 = (eo2) P2;
                i8 = i14 & (-1879048193);
            }
            xq2Var.q();
            a74 N = ge7.N(a74Var, lq4Var);
            yt0 a2 = wt0.a(ju.c, d90.k0, xq2Var, 0);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, N);
            jx0.i.getClass();
            int i16 = i8;
            on2 on2Var3 = ix0.b;
            xq2Var.f0();
            int i17 = i9;
            if (xq2Var.S) {
                xq2Var.k(on2Var3);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            boolean z3 = j06Var2 instanceof g06;
            x64 x64Var = x64.a;
            if (z3) {
                xq2Var.b0(-735501898);
                e(dj6.c(zt0.a(x64Var), 1.0f), (g06) j06Var2, eo2Var, xq2Var, ((i16 >> 3) & 112) | ((i16 >> 6) & 896));
                xq2Var.p(false);
            } else if (j06Var2 instanceof f06) {
                xq2Var.b0(-735494763);
                d(dj6.c(zt0.a(x64Var), 1.0f), xq2Var, 0);
                xq2Var.p(false);
            } else if (j06Var2 instanceof i06) {
                xq2Var.b0(-1325360090);
                List<c6> list = ((i06) j06Var2).a;
                if (list == null || !list.isEmpty()) {
                    for (c6 c6Var : list) {
                        if (!c6Var.f.isEmpty()) {
                            xq2Var.b0(-1325203881);
                            a74 c2 = dj6.c(zt0.a(x64Var), 1.0f);
                            e34 d2 = h70.d(d90.L, false);
                            int hashCode2 = Long.hashCode(xq2Var.T);
                            xv4 l3 = xq2Var.l();
                            a74 E2 = l.E(xq2Var, c2);
                            jx0.i.getClass();
                            on2 on2Var4 = ix0.b;
                            xq2Var.f0();
                            if (xq2Var.S) {
                                xq2Var.k(on2Var4);
                            } else {
                                xq2Var.o0();
                            }
                            yh2.K(xq2Var, ix0.f, d2);
                            yh2.K(xq2Var, ix0.e, l3);
                            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode2));
                            yh2.F(xq2Var, ix0.h);
                            yh2.K(xq2Var, ix0.d, E2);
                            Object P3 = xq2Var.P();
                            if (P3 == obj) {
                                P3 = np2.Y(null);
                                xq2Var.l0(P3);
                            }
                            qa4 qa4Var = (qa4) P3;
                            lc2 lc2Var = dj6.c;
                            Object P4 = xq2Var.P();
                            if (P4 == obj) {
                                P4 = new e4(qa4Var, 5);
                                xq2Var.l0(P4);
                            }
                            eo2 eo2Var5 = (eo2) P4;
                            Object P5 = xq2Var.P();
                            if (P5 == obj) {
                                P5 = new c5(17);
                                xq2Var.l0(P5);
                            }
                            eo2 eo2Var6 = eo2Var4;
                            qn2 qn2Var7 = qn2Var5;
                            nc1.a(lc2Var, j06Var2, eo2Var5, qn2Var7, eo2Var6, on2Var, (on2) P5, qn2Var6, xq2Var, ((i16 >> 3) & 112) | 1576326 | (i16 & 458752) | ((i17 << 21) & 29360128));
                            eo2Var4 = eo2Var6;
                            qn2Var5 = qn2Var7;
                            j06Var2 = j06Var2;
                            vr4 vr4Var = (vr4) qa4Var.getValue();
                            if (vr4Var == null) {
                                xq2Var.b0(-575598600);
                                xq2Var.p(false);
                                z2 = false;
                            } else {
                                xq2Var.b0(-575598599);
                                o6 o6Var = (o6) vr4Var.A;
                                boolean booleanValue = ((Boolean) vr4Var.B).booleanValue();
                                Object P6 = xq2Var.P();
                                if (P6 == obj) {
                                    P6 = new oe4(qa4Var, 19);
                                    xq2Var.l0(P6);
                                }
                                l.b(o6Var, booleanValue, (on2) P6, xq2Var, RendererDebugBridge.CAPTURE_HEIGHT);
                                z2 = false;
                                xq2Var.p(false);
                            }
                            xq2Var.p(true);
                            xq2Var.p(z2);
                            xq2Var.p(z2);
                        } else {
                            qn2Var6 = qn2Var3;
                        }
                    }
                }
                z2 = false;
                xq2Var.b0(-1325338018);
                g(dj6.c(zt0.a(x64Var), 1.0f), xq2Var, 0);
                xq2Var.p(false);
                xq2Var.p(z2);
            } else if (j06Var2 instanceof h06) {
                xq2Var.b0(-735441098);
                f(dj6.c(zt0.a(x64Var), 1.0f), eo2Var, xq2Var, (i16 >> 9) & 112);
                xq2Var.p(false);
            } else if (j06Var2 instanceof e06) {
                xq2Var.b0(-735436487);
                c(dj6.c(zt0.a(x64Var), 1.0f), on2Var, xq2Var, (i16 >> 12) & 112);
                xq2Var.p(false);
            } else {
                throw xg6.f(xq2Var, -735502724, false);
            }
            xq2Var.p(true);
            eo2Var3 = eo2Var4;
            qn2Var4 = qn2Var5;
        } else {
            xq2Var.V();
            qn2Var4 = qn2Var2;
            eo2Var3 = eo2Var2;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2(lq4Var, j06Var2, oi4Var, eo2Var, on2Var, qn2Var, on2Var2, qn2Var4, eo2Var3, qn2Var3, i2) { // from class: d06
                public final /* synthetic */ lq4 B;
                public final /* synthetic */ j06 L;
                public final /* synthetic */ oi4 R;
                public final /* synthetic */ eo2 X;
                public final /* synthetic */ on2 Y;
                public final /* synthetic */ qn2 Z;
                public final /* synthetic */ on2 d0;
                public final /* synthetic */ qn2 e0;
                public final /* synthetic */ eo2 f0;
                public final /* synthetic */ qn2 g0;

                @Override // defpackage.eo2
                public final Object o(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int a0 = ii2.a0(1);
                    q60.i(a74.this, this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, this.e0, this.f0, this.g0, (px0) obj2, a0);
                    return jg7.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final x61 j(s41 s41Var) {
        vg1 vg1Var;
        int i2;
        if (s41Var instanceof vg1) {
            vg1 vg1Var2 = (vg1) s41Var;
            int i3 = vg1Var2.X;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vg1Var2.X = i3 - Integer.MIN_VALUE;
                vg1Var = vg1Var2;
                Object obj = vg1Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i2 = vg1Var.X;
                if (i2 == 0) {
                    if (i2 != 1) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    vg1Var.X = 1;
                    rj0 rj0Var = new rj0(1, np2.V(vg1Var));
                    rj0Var.v();
                    if (rj0Var.s() == x61Var) {
                        return x61Var;
                    }
                }
                e41.c();
                return null;
            }
        }
        vg1Var = new s41(s41Var);
        Object obj2 = vg1Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i2 = vg1Var.X;
        if (i2 == 0) {
        }
        e41.c();
        return null;
    }

    public static final Set k(wb6 wb6Var) {
        wb6Var.getClass();
        if (wb6Var instanceof ya0) {
            return ((ya0) wb6Var).b();
        }
        HashSet hashSet = new HashSet(wb6Var.f());
        int f2 = wb6Var.f();
        for (int i2 = 0; i2 < f2; i2++) {
            hashSet.add(wb6Var.g(i2));
        }
        return hashSet;
    }

    public static Type l(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return new uu2(0, l(cls.getComponentType()));
            }
            return cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new vu2(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new uu2(0, ((GenericArrayType) type).getGenericComponentType());
        } else {
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return new wu2(wildcardType.getUpperBounds(), wildcardType.getLowerBounds(), 0);
            }
            return type;
        }
    }

    public static void p(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            i.h("Primitive type is not allowed");
        }
    }

    public static final wb6[] r(List list) {
        wb6[] wb6VarArr;
        list = (list == null || list.isEmpty()) ? null : null;
        if (list != null && (wb6VarArr = (wb6[]) list.toArray(new wb6[0])) != null) {
            return wb6VarArr;
        }
        return k;
    }

    public static final a74 s(a74 a74Var, lq4 lq4Var) {
        return a74Var.d(new mq4(lq4Var));
    }

    public static final Object t(long j2, r41 r41Var) {
        if (j2 > 0) {
            rj0 rj0Var = new rj0(1, np2.V(r41Var));
            rj0Var.v();
            if (j2 < Long.MAX_VALUE) {
                D(rj0Var.X).J(j2, rj0Var);
            }
            Object s = rj0Var.s();
            if (s == x61.COROUTINE_SUSPENDED) {
                return s;
            }
        }
        return jg7.a;
    }

    public static final Object u(long j2, r41 r41Var) {
        Object t = t(Y(j2), r41Var);
        if (t == x61.COROUTINE_SUSPENDED) {
            return t;
        }
        return jg7.a;
    }

    public static final a74 v(a74 a74Var, qn2 qn2Var) {
        return a74Var.d(new io1(qn2Var));
    }

    public static final void w(v84 v84Var, xj0 xj0Var, f80 f80Var, float f2, ge6 ge6Var, b17 b17Var, oo1 oo1Var) {
        ArrayList arrayList = v84Var.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            yr4 yr4Var = (yr4) arrayList.get(i2);
            yr4Var.a.g(xj0Var, f80Var, f2, ge6Var, b17Var, oo1Var);
            xj0Var.o(RecyclerView.B1, yr4Var.a.b());
        }
    }

    public static final a74 x(a74 a74Var, qn2 qn2Var) {
        return a74Var.d(new qo1(qn2Var));
    }

    public static final a74 y(a74 a74Var, qn2 qn2Var) {
        return a74Var.d(new ro1(qn2Var));
    }

    public static boolean z(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return z(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName())) {
                return true;
            }
            return false;
        }
    }

    public abstract void C(we6 we6Var, float f2, float f3);

    public abstract void S(q1 q1Var, q1 q1Var2);

    public abstract void T(q1 q1Var, Thread thread);

    public abstract boolean m(r1 r1Var, n1 n1Var, n1 n1Var2);

    public abstract boolean n(r1 r1Var, Object obj, Object obj2);

    public abstract boolean o(r1 r1Var, q1 q1Var, q1 q1Var2);

    public abstract List q(String str, List list);
}
