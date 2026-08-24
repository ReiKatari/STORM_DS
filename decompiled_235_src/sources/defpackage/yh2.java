package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yh2  reason: default package */
/* loaded from: classes.dex */
public abstract class yh2 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static e33 c;

    public static final boolean A(vh2 vh2Var) {
        sm3 sm3Var;
        eg4 eg4Var;
        sm3 sm3Var2;
        eg4 eg4Var2 = vh2Var.d0;
        if (eg4Var2 != null && (sm3Var = eg4Var2.k0) != null && sm3Var.I() && (eg4Var = vh2Var.d0) != null && (sm3Var2 = eg4Var.k0) != null && sm3Var2.H()) {
            return true;
        }
        return false;
    }

    public static tb0 B(l61 l61Var, eo2 eo2Var) {
        a71 a71Var = a71.DEFAULT;
        l61Var.getClass();
        a71Var.getClass();
        return ak7.W(new em2(l61Var, a71Var, eo2Var, 1));
    }

    public static final f34 C(i26 i26Var, int i, int i2, int i3, int i4, int i5, g34 g34Var, List list, dx4[] dx4VarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        int i10;
        int i11;
        float f;
        boolean z;
        int i12;
        long j;
        int i13;
        int i14;
        int i15;
        List list2 = list;
        long j2 = i5;
        int i16 = i7 - i6;
        int[] iArr2 = new int[i16];
        int i17 = i6;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        float f2 = RecyclerView.B1;
        while (i17 < i7) {
            x24 x24Var = (x24) list2.get(i17);
            float v = jx2.v(jx2.t(x24Var));
            if (v > RecyclerView.B1) {
                f2 += v;
                i19++;
                j = j2;
                i13 = i17;
            } else {
                int i22 = i3 - i20;
                dx4 dx4Var = dx4VarArr[i17];
                j = j2;
                if (dx4Var == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i13 = i17;
                        i14 = i19;
                        i15 = Integer.MAX_VALUE;
                    } else {
                        i13 = i17;
                        i14 = i19;
                        if (i22 < 0) {
                            i15 = 0;
                        } else {
                            i15 = i22;
                        }
                    }
                    dx4Var = x24Var.y(i26Var.c(0, i15, i4, false));
                } else {
                    i13 = i17;
                    i14 = i19;
                }
                dx4 dx4Var2 = dx4Var;
                int j3 = i26Var.j(dx4Var2);
                int h = i26Var.h(dx4Var2);
                iArr2[i13 - i6] = j3;
                int i23 = i22 - j3;
                if (i23 < 0) {
                    i23 = 0;
                }
                i21 = Math.min(i5, i23);
                i20 += j3 + i21;
                i18 = Math.max(i18, h);
                dx4VarArr[i13] = dx4Var2;
                i19 = i14;
            }
            i17 = i13 + 1;
            j2 = j;
        }
        long j4 = j2;
        if (i19 == 0) {
            i20 -= i21;
            i11 = 0;
        } else {
            if (i3 != Integer.MAX_VALUE) {
                i10 = i3;
            } else {
                i10 = i;
            }
            long j5 = (i9 - 1) * j4;
            long j6 = (i10 - i20) - j5;
            if (j6 < 0) {
                j6 = 0;
            }
            float f3 = ((float) j6) / f2;
            for (int i24 = i6; i24 < i7; i24++) {
                j6 -= Math.round(jx2.v(jx2.t((x24) list2.get(i24))) * f3);
            }
            int i25 = i6;
            int i26 = i18;
            int i27 = 0;
            while (i25 < i7) {
                if (dx4VarArr[i25] == null) {
                    x24 x24Var2 = (x24) list2.get(i25);
                    f = f3;
                    j26 t = jx2.t(x24Var2);
                    float v2 = jx2.v(t);
                    if (v2 <= RecyclerView.B1) {
                        n53.b("All weights <= 0 should have placeables");
                    }
                    int signum = Long.signum(j6);
                    long j7 = j6 - signum;
                    int max = Math.max(0, Math.round(v2 * f) + signum);
                    if (t != null) {
                        z = t.b;
                    } else {
                        z = true;
                    }
                    if (z && max != Integer.MAX_VALUE) {
                        i12 = max;
                    } else {
                        i12 = 0;
                    }
                    dx4 y = x24Var2.y(i26Var.c(i12, max, i4, true));
                    int j8 = i26Var.j(y);
                    int h2 = i26Var.h(y);
                    iArr2[i25 - i6] = j8;
                    i27 += j8;
                    int max2 = Math.max(i26, h2);
                    dx4VarArr[i25] = y;
                    i26 = max2;
                    j6 = j7;
                } else {
                    f = f3;
                }
                i25++;
                list2 = list;
                f3 = f;
            }
            i11 = (int) (i27 + j5);
            int i28 = i3 - i20;
            if (i11 < 0) {
                i11 = 0;
            }
            if (i11 > i28) {
                i11 = i28;
            }
            i18 = i26;
        }
        int i29 = i11 + i20;
        if (i29 < 0) {
            i29 = 0;
        }
        int max3 = Math.max(i29, i);
        int max4 = Math.max(i18, Math.max(i2, 0));
        int[] iArr3 = new int[i16];
        i26Var.b(max3, iArr2, iArr3, g34Var);
        return i26Var.f(dx4VarArr, g34Var, iArr3, max3, max4, iArr, i8, i6, i7);
    }

    public static final Class D(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            return D(rawType);
        } else if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            upperBounds.getClass();
            Object D0 = fv.D0(upperBounds);
            D0.getClass();
            return D((Type) D0);
        } else if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            genericComponentType.getClass();
            return D(genericComponentType);
        } else {
            StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
            sb.append(type);
            fa6.g(sb, " has type ", gh5.a(type.getClass()));
            return null;
        }
    }

    public static final String E(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        return stringWriter2;
    }

    public static final void F(px0 px0Var, qn2 qn2Var) {
        ((xq2) px0Var).b(new no3(2, qn2Var), jg7.a);
    }

    public static final gg3 G(jd1 jd1Var, Class cls, List list) {
        gg3[] gg3VarArr = (gg3[]) list.toArray(new gg3[0]);
        gg3 p = jx2.p(cls, (gg3[]) Arrays.copyOf(gg3VarArr, gg3VarArr.length));
        if (p != null) {
            return p;
        }
        gg3 gg3Var = (gg3) a35.a.get(gh5.a(cls));
        if (gg3Var == null) {
            jd1Var.getClass();
            if (cls.isInterface()) {
                return new fz4(gh5.a(cls));
            }
            return null;
        }
        return gg3Var;
    }

    public static final g53 H(String str, px0 px0Var, int i) {
        xq2 xq2Var = (xq2) px0Var;
        Object P = xq2Var.P();
        if (P == ox0.a) {
            P = new g53();
            xq2Var.l0(P);
        }
        g53 g53Var = (g53) P;
        g53Var.a(xq2Var, 0);
        return g53Var;
    }

    public static final rc4 I(qd4[] qd4VarArr, px0 px0Var) {
        xq2 xq2Var = (xq2) px0Var;
        Context context = (Context) xq2Var.j(kf.b);
        Object[] copyOf = Arrays.copyOf(qd4VarArr, qd4VarArr.length);
        ap3 ap3Var = new ap3(28, new ep3(3, (byte) 0), new zn3(context, 2));
        boolean h = xq2Var.h(context);
        Object P = xq2Var.P();
        if (h || P == ox0.a) {
            P = new ej0(context, 5);
            xq2Var.l0(P);
        }
        rc4 rc4Var = (rc4) qo2.K(copyOf, ap3Var, (on2) P, xq2Var, 0, 4);
        for (qd4 qd4Var : qd4VarArr) {
            rc4Var.b.s.a(qd4Var);
        }
        return rc4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r7 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
        if (r7 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final gg3 J(jd1 jd1Var, Type type, boolean z) {
        ArrayList arrayList;
        gg3 J;
        gg3 J2;
        ar0 ar0Var;
        int i = 0;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
                upperBounds.getClass();
                genericComponentType = (Type) fv.D0(upperBounds);
            }
            genericComponentType.getClass();
            if (z) {
                J2 = jx2.L(jd1Var, genericComponentType);
            } else {
                jd1Var.getClass();
                J2 = J(jd1Var, genericComponentType, false);
            }
            if (genericComponentType instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) genericComponentType).getRawType();
                rawType.getClass();
                ar0Var = gh5.a((Class) rawType);
            } else if (genericComponentType instanceof ar0) {
                ar0Var = (ar0) genericComponentType;
            } else {
                e41.z(gh5.a(genericComponentType.getClass()), "unsupported type in GenericArray: ");
                return null;
            }
            ar0Var.getClass();
            return new eh5(ar0Var, J2);
        } else if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray() && !cls.getComponentType().isPrimitive()) {
                Class<?> componentType = cls.getComponentType();
                componentType.getClass();
                if (z) {
                    J = jx2.L(jd1Var, componentType);
                } else {
                    jd1Var.getClass();
                    J = J(jd1Var, componentType, false);
                }
                return new eh5(gh5.a(componentType), J);
            }
            return G(jd1Var, cls, yt1.A);
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType2 = parameterizedType.getRawType();
            rawType2.getClass();
            Class cls2 = (Class) rawType2;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            actualTypeArguments.getClass();
            if (z) {
                arrayList = new ArrayList(actualTypeArguments.length);
                for (Type type2 : actualTypeArguments) {
                    type2.getClass();
                    arrayList.add(jx2.L(jd1Var, type2));
                }
            } else {
                arrayList = new ArrayList(actualTypeArguments.length);
                for (Type type3 : actualTypeArguments) {
                    type3.getClass();
                    jd1Var.getClass();
                    gg3 J3 = J(jd1Var, type3, false);
                    if (J3 != null) {
                        arrayList.add(J3);
                    }
                }
            }
            if (Set.class.isAssignableFrom(cls2)) {
                gg3 gg3Var = (gg3) arrayList.get(0);
                gg3Var.getClass();
                return new ru(gg3Var, 2);
            } else if (!List.class.isAssignableFrom(cls2) && !Collection.class.isAssignableFrom(cls2)) {
                if (Map.class.isAssignableFrom(cls2)) {
                    gg3 gg3Var2 = (gg3) arrayList.get(0);
                    gg3 gg3Var3 = (gg3) arrayList.get(1);
                    gg3Var2.getClass();
                    gg3Var3.getClass();
                    return new qw2(gg3Var2, gg3Var3, 1);
                } else if (Map.Entry.class.isAssignableFrom(cls2)) {
                    gg3 gg3Var4 = (gg3) arrayList.get(0);
                    gg3 gg3Var5 = (gg3) arrayList.get(1);
                    gg3Var4.getClass();
                    gg3Var5.getClass();
                    return new w04(gg3Var4, gg3Var5, 0);
                } else if (vr4.class.isAssignableFrom(cls2)) {
                    gg3 gg3Var6 = (gg3) arrayList.get(0);
                    gg3 gg3Var7 = (gg3) arrayList.get(1);
                    gg3Var6.getClass();
                    gg3Var7.getClass();
                    return new w04(gg3Var6, gg3Var7, 1);
                } else if (oc7.class.isAssignableFrom(cls2)) {
                    gg3 gg3Var8 = (gg3) arrayList.get(0);
                    gg3 gg3Var9 = (gg3) arrayList.get(1);
                    gg3 gg3Var10 = (gg3) arrayList.get(2);
                    gg3Var8.getClass();
                    gg3Var9.getClass();
                    gg3Var10.getClass();
                    return new pc7(gg3Var8, gg3Var9, gg3Var10);
                } else {
                    ArrayList arrayList2 = new ArrayList(ht0.v0(arrayList, 10));
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        gg3 gg3Var11 = (gg3) obj;
                        gg3Var11.getClass();
                        arrayList2.add(gg3Var11);
                    }
                    return G(jd1Var, cls2, arrayList2);
                }
            } else {
                gg3 gg3Var12 = (gg3) arrayList.get(0);
                gg3Var12.getClass();
                return new ru(gg3Var12, 0);
            }
        } else if (type instanceof WildcardType) {
            Type[] upperBounds2 = ((WildcardType) type).getUpperBounds();
            upperBounds2.getClass();
            Object D0 = fv.D0(upperBounds2);
            D0.getClass();
            return J(jd1Var, (Type) D0, true);
        } else {
            StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
            sb.append(type);
            fa6.g(sb, " has type ", gh5.a(type.getClass()));
            return null;
        }
        return null;
    }

    public static final void K(px0 px0Var, eo2 eo2Var, Object obj) {
        if (!((xq2) px0Var).S && nb3.k(((xq2) px0Var).P(), obj)) {
            return;
        }
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.l0(obj);
        xq2Var.b(eo2Var, obj);
    }

    public static final String L(byte[] bArr) {
        byte[] digest = MessageDigest.getInstance("SHA-256").digest(bArr);
        digest.getClass();
        return fv.L0(digest, new x84(16));
    }

    public static final String[] M(px0 px0Var, int i) {
        return ((Resources) ((xq2) px0Var).j(kf.c)).getStringArray(i);
    }

    public static final String N(int i, Object[] objArr, px0 px0Var) {
        return ((Resources) ((xq2) px0Var).j(kf.c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static final String O(px0 px0Var, int i) {
        return ((Resources) ((xq2) px0Var).j(kf.c)).getString(i);
    }

    public static final int P(jr3 jr3Var) {
        List list = jr3Var.k;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((kr3) list.get(i2)).m;
        }
        return (i / list.size()) + jr3Var.q;
    }

    public static final void Q(CaptureRequest.Builder builder, Object obj, Object obj2) {
        if (obj != null && (obj instanceof CaptureRequest.Key)) {
            try {
                builder.set((CaptureRequest.Key) obj, obj2);
            } catch (IllegalArgumentException e) {
                Log.w("CXCP", "Failed to set [" + ((CaptureRequest.Key) obj).getName() + ": " + obj2 + "] on CaptureRequest.Builder", e);
            }
        }
    }

    public static final void R(CaptureRequest.Builder builder, Map map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            Q(builder, entry.getKey(), entry.getValue());
        }
    }

    public static final long a(float f, boolean z, boolean z2) {
        long j;
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        long j2 = 0;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        if (z2) {
            j2 = 2;
        }
        return ((j | j2) & 4294967295L) | (floatToRawIntBits << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [fr4, java.lang.Object] */
    public static final void b(ue1 ue1Var, a74 a74Var, lq4 lq4Var, cs1 cs1Var, d40 d40Var, ql6 ql6Var, boolean z, ae4 ae4Var, cs1 cs1Var2, sg sgVar, zv0 zv0Var, px0 px0Var, int i) {
        int i2;
        boolean z2;
        lq4 lq4Var2;
        cs1 cs1Var3;
        d40 d40Var2;
        ql6 ql6Var2;
        te1 te1Var;
        cs1 cs1Var4;
        sg sgVar2;
        d40 d40Var3;
        boolean z3;
        ql6 ql6Var3;
        int i3;
        cs1 cs1Var5;
        cs1 cs1Var6;
        pq4 pq4Var;
        sg a2;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1860873769);
        if (xq2Var.f(ue1Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2 | 811298176;
        boolean z4 = true;
        if ((306783379 & i4) == 306783378) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (xq2Var.S(i4 & 1, z2)) {
            xq2Var.X();
            if ((i & 1) != 0 && !xq2Var.B()) {
                xq2Var.V();
                i3 = i4 & (-29360129);
                pq4Var = lq4Var;
                cs1Var5 = cs1Var;
                d40Var3 = d40Var;
                ql6Var3 = ql6Var;
                te1Var = ae4Var;
                cs1Var6 = cs1Var2;
                a2 = sgVar;
            } else {
                pq4 pq4Var2 = new pq4(RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1);
                cs1 cs1Var7 = cs1.j0;
                d40Var3 = d90.i0;
                int i5 = (i4 & 14) | 196608;
                ?? obj = new Object();
                oc1 a3 = eo6.a(xq2Var);
                of5 of5Var = vq7.a;
                io6 U = ge7.U(RecyclerView.B1, 400.0f, Float.valueOf(1.0f), 1);
                qh1 qh1Var = (qh1) xq2Var.j(ky0.h);
                kk3 kk3Var = (kk3) xq2Var.j(ky0.n);
                if ((((i5 & 14) ^ 6) > 4 && xq2Var.f(ue1Var)) || (i5 & 6) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean f = z3 | xq2Var.f(a3) | xq2Var.f(U) | xq2Var.f(obj) | xq2Var.f(qh1Var) | xq2Var.d(kk3Var.ordinal());
                Object P = xq2Var.P();
                Object obj2 = ox0.a;
                if (f || P == obj2) {
                    Object ql6Var4 = new ql6(new ap3(ue1Var, new l4(8, ue1Var, kk3Var), (fr4) obj), a3, U);
                    xq2Var.l0(ql6Var4);
                    P = ql6Var4;
                }
                ql6Var3 = (ql6) P;
                int i6 = i4 & (-29360129);
                lo4 lo4Var = lo4.Horizontal;
                int i7 = (i4 & 14) | 432;
                if ((((i7 & 14) ^ 6) <= 4 || !xq2Var.f(ue1Var)) && (i7 & 6) != 4) {
                    z4 = false;
                }
                Object P2 = xq2Var.P();
                if (z4 || P2 == obj2) {
                    P2 = new te1(ue1Var, lo4Var);
                    xq2Var.l0(P2);
                }
                te1Var = (te1) P2;
                i3 = i6;
                cs1Var5 = cs1Var7;
                cs1Var6 = cs1.l0;
                pq4Var = pq4Var2;
                a2 = xp4.a(xq2Var);
            }
            xq2Var.q();
            ln2.d(a74Var, ue1Var, pq4Var, lo4.Horizontal, ql6Var3, z, a2, cs1Var5, te1Var, d40Var3, cs1Var6, zv0Var, xq2Var, ((i3 << 3) & 112) | 907570566, 1797510);
            lq4Var2 = pq4Var;
            d40Var2 = d40Var3;
            cs1Var4 = cs1Var6;
            sgVar2 = a2;
            ql6Var2 = ql6Var3;
            cs1Var3 = cs1Var5;
        } else {
            xq2Var.V();
            lq4Var2 = lq4Var;
            cs1Var3 = cs1Var;
            d40Var2 = d40Var;
            ql6Var2 = ql6Var;
            te1Var = ae4Var;
            cs1Var4 = cs1Var2;
            sgVar2 = sgVar;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new wq4(ue1Var, a74Var, lq4Var2, cs1Var3, d40Var2, ql6Var2, z, te1Var, cs1Var4, sgVar2, zv0Var, i);
        }
    }

    public static tc3 c() {
        return new tc3(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fy7, java.lang.Object] */
    public static final fy7 d(long j) {
        int i = (int) j;
        int i2 = (int) (j >> 32);
        int i3 = ~i;
        ?? obj = new Object();
        obj.B = i;
        obj.L = i2;
        obj.R = 0;
        obj.X = 0;
        obj.Y = i3;
        obj.Z = (i << 10) ^ (i2 >>> 4);
        if ((i2 | i | i3) != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                obj.d();
            }
            return obj;
        }
        i.h("Initial state must have at least one non-zero element.");
        return null;
    }

    public static final void e(String str, List list, int i, qn2 qn2Var, on2 on2Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1472832339);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(str)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.h(list)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.d(i)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if (xq2Var.h(qn2Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if (xq2Var.h(on2Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        int i9 = i3;
        if ((i9 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i9 & 1, z)) {
            u24.c(on2Var, null, n16.I(960321110, new l01(list, qn2Var, on2Var, i, str, 1), xq2Var), xq2Var, ((i9 >> 12) & 14) | RendererDebugBridge.CAPTURE_HEIGHT);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new sp5(str, list, i, qn2Var, on2Var, i2, 1);
        }
    }

    public static final void f(final String str, final String str2, final List list, final int i, final qn2 qn2Var, boolean z, final float f, px0 px0Var, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        final boolean z3;
        float f2;
        str.getClass();
        str2.getClass();
        qn2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1352551305);
        if (xq2Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i2 | i3;
        if (xq2Var.f(str2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i10 = i9 | i4;
        if (xq2Var.h(list)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i11 = i10 | i5;
        if (xq2Var.d(i)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i12 = i11 | i6;
        if (xq2Var.h(qn2Var)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i13 = i12 | i7 | 196608;
        if (xq2Var.c(f)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i14 = i13 | i8;
        if ((599187 & i14) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i14 & 1, z2)) {
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = np2.Y(Boolean.FALSE);
                xq2Var.l0(P);
            }
            qa4 qa4Var = (qa4) P;
            py0 py0Var = g31.a;
            xq2Var.b0(-1573274739);
            long j = ((kt0) xq2Var.j(j31.a)).a;
            if (!((ut0) xq2Var.j(vt0.a)).k() ? hv.N(j) < 0.5d : hv.N(j) > 0.5d) {
                f2 = 1.0f;
            } else {
                f2 = 0.87f;
            }
            xq2Var.p(false);
            hv.d(py0Var.a(Float.valueOf(f2)), n16.I(1427320905, new uc1(f, qa4Var, str, str2), xq2Var), xq2Var, 56);
            if (((Boolean) qa4Var.getValue()).booleanValue()) {
                xq2Var.b0(-1526048517);
                Object P2 = xq2Var.P();
                if (P2 == vs0Var) {
                    P2 = new oe4(qa4Var, 24);
                    xq2Var.l0(P2);
                }
                int i15 = i14 >> 3;
                e(str, list, i, qn2Var, (on2) P2, xq2Var, (i14 & 14) | 24576 | (i15 & 112) | (i15 & 896) | (i15 & 7168));
                xq2Var.p(false);
            } else {
                xq2Var.b0(-1525804423);
                xq2Var.p(false);
            }
            z3 = true;
        } else {
            xq2Var.V();
            z3 = z;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2(str, str2, list, i, qn2Var, z3, f, i2) { // from class: ni6
                public final /* synthetic */ String A;
                public final /* synthetic */ String B;
                public final /* synthetic */ List L;
                public final /* synthetic */ int R;
                public final /* synthetic */ qn2 X;
                public final /* synthetic */ boolean Y;
                public final /* synthetic */ float Z;

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(1);
                    yh2.f(this.A, this.B, this.L, this.R, this.X, this.Y, this.Z, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }

    public static final void g(Preference preference, x05 x05Var) {
        preference.getClass();
        x05 onPreferenceChangeListener = preference.getOnPreferenceChangeListener();
        if (onPreferenceChangeListener instanceof wx0) {
            ((wx0) onPreferenceChangeListener).a.add(x05Var);
            return;
        }
        wx0 wx0Var = new wx0();
        ArrayList arrayList = wx0Var.a;
        if (onPreferenceChangeListener != null) {
            arrayList.add(onPreferenceChangeListener);
        }
        arrayList.add(x05Var);
        preference.setOnPreferenceChangeListener(wx0Var);
    }

    public static final e53 h(g53 g53Var, float f, float f2, d53 d53Var, String str, px0 px0Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        return j(g53Var, Float.valueOf(f), Float.valueOf(f2), nw7.e0, d53Var, str, px0Var, (i & 1022) | 32768 | ((i << 3) & 458752), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, ah5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(f86 f86Var, float f, io6 io6Var, s41 s41Var) {
        h76 h76Var;
        int i;
        ah5 ah5Var;
        if (s41Var instanceof h76) {
            h76 h76Var2 = (h76) s41Var;
            int i2 = h76Var2.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h76Var2.Y = i2 - Integer.MIN_VALUE;
                h76Var = h76Var2;
                Object obj = h76Var.X;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = h76Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        ah5Var = h76Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ?? obj3 = new Object();
                    eo2 i76Var = new i76(f, io6Var, obj3, null);
                    h76Var.R = obj3;
                    h76Var.Y = 1;
                    if (f86Var.d(xa4.Default, i76Var, h76Var) == obj2) {
                        return obj2;
                    }
                    ah5Var = obj3;
                }
                return new Float(ah5Var.A);
            }
        }
        h76Var = new s41(s41Var);
        Object obj4 = h76Var.X;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = h76Var.Y;
        if (i == 0) {
        }
        return new Float(ah5Var.A);
    }

    public static final e53 j(g53 g53Var, Number number, Number number2, wc7 wc7Var, d53 d53Var, String str, px0 px0Var, int i, int i2) {
        g53 g53Var2;
        Number number3;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        Object P = xq2Var.P();
        vs0 vs0Var = ox0.a;
        if (P == vs0Var) {
            g53Var2 = g53Var;
            e53 e53Var = new e53(g53Var2, number, number2, wc7Var, d53Var);
            number3 = number2;
            xq2Var.l0(e53Var);
            P = e53Var;
        } else {
            g53Var2 = g53Var;
            number3 = number2;
        }
        e53 e53Var2 = (e53) P;
        boolean z2 = true;
        if ((((i & 896) ^ RendererDebugBridge.CAPTURE_HEIGHT) > 256 && xq2Var.h(number3)) || (i & RendererDebugBridge.CAPTURE_HEIGHT) == 256) {
            z = true;
        } else {
            z = false;
        }
        if ((((57344 & i) ^ 24576) <= 16384 || !xq2Var.h(d53Var)) && (i & 24576) != 16384) {
            z2 = false;
        }
        boolean z3 = z | z2;
        Object P2 = xq2Var.P();
        if (z3 || P2 == vs0Var) {
            hf0 hf0Var = new hf0(number, e53Var2, number3, d53Var, 3);
            xq2Var.l0(hf0Var);
            P2 = hf0Var;
        }
        mb3.n((on2) P2, xq2Var);
        boolean h = xq2Var.h(g53Var2);
        Object P3 = xq2Var.P();
        if (h || P3 == vs0Var) {
            P3 = new bi2(8, g53Var2, e53Var2);
            xq2Var.l0(P3);
        }
        mb3.d(e53Var2, (qn2) P3, xq2Var);
        return e53Var2;
    }

    public static final sq2 k(sq2 sq2Var) {
        if (sq2Var == null) {
            sq2Var = null;
        }
        if (sq2Var != null) {
            return sq2Var;
        }
        tx0.b("Inconsistent composition");
        e41.c();
        return null;
    }

    public static final float l(long j, float f, long j2, long j3) {
        long l = hv.l(kt0.c(f, j), j3);
        float N = hv.N(hv.l(j2, l)) + 0.05f;
        float N2 = hv.N(l) + 0.05f;
        return Math.max(N, N2) / Math.min(N, N2);
    }

    public static final void m(l61 l61Var, CancellationException cancellationException) {
        rc3 rc3Var = (rc3) l61Var.Z(vs0.h0);
        if (rc3Var != null) {
            rc3Var.h(cancellationException);
        }
    }

    public static final Object n(rc3 rc3Var, hw6 hw6Var) {
        rc3Var.h(null);
        Object c0 = rc3Var.c0(hw6Var);
        if (c0 == x61.COROUTINE_SUSPENDED) {
            return c0;
        }
        return jg7.a;
    }

    public static final void o(l61 l61Var) {
        rc3 rc3Var = (rc3) l61Var.Z(vs0.h0);
        if (rc3Var != null && !rc3Var.e()) {
            throw rc3Var.v();
        }
    }

    public static final gx3 p(Executor executor, String str, on2 on2Var) {
        executor.getClass();
        return ak7.W(new em2(executor, str, on2Var, 2));
    }

    public static final vh2 q(vh2 vh2Var) {
        vh2 f = ((eh2) ((te) nc1.g0(vh2Var)).getFocusOwner()).f();
        if (f != null && f.j0) {
            return f;
        }
        return null;
    }

    public static final of5 r(vh2 vh2Var) {
        eg4 eg4Var;
        if (vh2Var.j0 && (eg4Var = vh2Var.d0) != null) {
            jk3 w = ej2.w(eg4Var);
            if (!w.t()) {
                w = null;
            }
            if (w != null) {
                return vh2Var.U0(w);
            }
        }
        return of5.e;
    }

    public static k64 s(k64 k64Var, kk3 kk3Var, s47 s47Var, qh1 qh1Var, ki2 ki2Var) {
        if (k64Var != null && kk3Var == k64Var.a && gi2.N(s47Var, kk3Var).equals(k64Var.b) && qh1Var.a() == k64Var.c.A && ki2Var == k64Var.d) {
            return k64Var;
        }
        k64 k64Var2 = k64.h;
        if (k64Var2 != null && kk3Var == k64Var2.a && gi2.N(s47Var, kk3Var).equals(k64Var2.b) && qh1Var.a() == k64Var2.c.A && ki2Var == k64Var2.d) {
            return k64Var2;
        }
        k64 k64Var3 = new k64(kk3Var, gi2.N(s47Var, kk3Var), new th1(qh1Var.a(), qh1Var.Y()), ki2Var);
        k64.h = k64Var3;
        return k64Var3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0026, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final vh2 t(vh2 vh2Var) {
        boolean z = vh2Var.A.j0;
        if (z) {
            if (!z) {
                p53.c("visitChildren called on an unattached node");
            }
            ua4 ua4Var = new ua4(new z64[16]);
            z64 z64Var = vh2Var.A;
            z64 z64Var2 = z64Var.Y;
            if (z64Var2 == null) {
                nc1.z(ua4Var, z64Var);
            } else {
                ua4Var.b(z64Var2);
            }
            loop0: while (true) {
                int i = ua4Var.L;
                if (i == 0) {
                    break;
                }
                z64 z64Var3 = (z64) ua4Var.l(i - 1);
                if ((z64Var3.R & 1024) == 0) {
                    nc1.z(ua4Var, z64Var3);
                } else {
                    while (true) {
                        if (z64Var3 == null) {
                            break;
                        } else if ((z64Var3.L & 1024) != 0) {
                            ua4 ua4Var2 = null;
                            while (z64Var3 != null) {
                                if (z64Var3 instanceof vh2) {
                                    vh2 vh2Var2 = (vh2) z64Var3;
                                    if (vh2Var2.A.j0) {
                                        int i2 = xh2.b[vh2Var2.W0().ordinal()];
                                        if (i2 == 1 || i2 == 2 || i2 == 3) {
                                            break loop0;
                                        } else if (i2 != 4) {
                                            i.d();
                                            return null;
                                        }
                                    }
                                } else if ((z64Var3.L & 1024) != 0 && (z64Var3 instanceof zg1)) {
                                    int i3 = 0;
                                    for (z64 z64Var4 = ((zg1) z64Var3).l0; z64Var4 != null; z64Var4 = z64Var4.Y) {
                                        if ((z64Var4.L & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                z64Var3 = z64Var4;
                                            } else {
                                                if (ua4Var2 == null) {
                                                    ua4Var2 = new ua4(new z64[16]);
                                                }
                                                if (z64Var3 != null) {
                                                    ua4Var2.b(z64Var3);
                                                    z64Var3 = null;
                                                }
                                                ua4Var2.b(z64Var4);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                z64Var3 = nc1.A(ua4Var2);
                            }
                            continue;
                        } else {
                            z64Var3 = z64Var3.Y;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final rc3 u(l61 l61Var) {
        rc3 rc3Var = (rc3) l61Var.Z(vs0.h0);
        if (rc3Var != null) {
            return rc3Var;
        }
        e41.h(l61Var, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final e33 v() {
        e33 e33Var = c;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.VideogameAsset", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(21.0f, 6.0f);
        ww2Var.m(3.0f, 6.0f);
        ww2Var.i(-1.1f, RecyclerView.B1, -2.0f, 0.9f, -2.0f, 2.0f);
        ww2Var.u(8.0f);
        ww2Var.i(RecyclerView.B1, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        ww2Var.l(18.0f);
        ww2Var.i(1.1f, RecyclerView.B1, 2.0f, -0.9f, 2.0f, -2.0f);
        ww2Var.m(23.0f, 8.0f);
        ww2Var.i(RecyclerView.B1, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        ww2Var.g();
        ww2Var.o(11.0f, 13.0f);
        ww2Var.m(8.0f, 13.0f);
        ww2Var.u(3.0f);
        ww2Var.m(6.0f, 16.0f);
        ww2Var.u(-3.0f);
        ww2Var.m(3.0f, 13.0f);
        ww2Var.u(-2.0f);
        ww2Var.l(3.0f);
        ww2Var.m(6.0f, 8.0f);
        ww2Var.l(2.0f);
        ww2Var.u(3.0f);
        ww2Var.l(3.0f);
        ww2Var.u(2.0f);
        ww2Var.g();
        ww2Var.o(15.5f, 15.0f);
        ww2Var.i(-0.83f, RecyclerView.B1, -1.5f, -0.67f, -1.5f, -1.5f);
        ww2Var.q(0.67f, -1.5f, 1.5f, -1.5f);
        ww2Var.q(1.5f, 0.67f, 1.5f, 1.5f);
        ww2Var.q(-0.67f, 1.5f, -1.5f, 1.5f);
        ww2Var.g();
        ww2Var.o(19.5f, 12.0f);
        ww2Var.i(-0.83f, RecyclerView.B1, -1.5f, -0.67f, -1.5f, -1.5f);
        ww2Var.p(18.67f, 9.0f, 19.5f, 9.0f);
        ww2Var.q(1.5f, 0.67f, 1.5f, 1.5f);
        ww2Var.q(-0.67f, 1.5f, -1.5f, 1.5f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b2 = d33Var.b();
        c = b2;
        return b2;
    }

    public static final boolean w(fp fpVar) {
        int length = fpVar.B.length();
        List list = fpVar.A;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ep epVar = (ep) list.get(i);
                if ((epVar.a instanceof pv3) && gp.b(0, length, epVar.b, epVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void x(px0 px0Var, Integer num, eo2 eo2Var) {
        if (((xq2) px0Var).S) {
            ((xq2) px0Var).b(eo2Var, num);
        }
    }

    public static final il1 y(rc3 rc3Var, boolean z, uc3 uc3Var) {
        if (rc3Var instanceof ed3) {
            return ((ed3) rc3Var).V(z, uc3Var);
        }
        return rc3Var.e0(uc3Var.q(), z, new a0(1, uc3Var, uc3.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 24));
    }

    public static final boolean z(l61 l61Var) {
        rc3 rc3Var = (rc3) l61Var.Z(vs0.h0);
        if (rc3Var != null) {
            return rc3Var.e();
        }
        return true;
    }
}
