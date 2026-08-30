package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Range;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ve2  reason: default package */
/* loaded from: classes.dex */
public abstract class ve2 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static int c = 3;
    public static q9 d;

    public static final Class A(qo0 qo0Var) {
        qo0Var.getClass();
        Class a2 = qo0Var.a();
        if (!a2.isPrimitive()) {
            return a2;
        }
        String name = a2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.class;
                }
                return a2;
            case 104431:
                if (name.equals("int")) {
                    return Integer.class;
                }
                return a2;
            case 3039496:
                if (name.equals("byte")) {
                    return Byte.class;
                }
                return a2;
            case 3052374:
                if (name.equals("char")) {
                    return Character.class;
                }
                return a2;
            case 3327612:
                if (name.equals("long")) {
                    return Long.class;
                }
                return a2;
            case 3625364:
                if (name.equals("void")) {
                    return Void.class;
                }
                return a2;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.class;
                }
                return a2;
            case 97526364:
                if (name.equals("float")) {
                    return Float.class;
                }
                return a2;
            case 109413500:
                if (name.equals("short")) {
                    return Short.class;
                }
                return a2;
            default:
                return a2;
        }
    }

    public static final boolean B(to toVar) {
        int length = toVar.B.length();
        List list = toVar.A;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                so soVar = (so) list.get(i);
                if ((soVar.a instanceof no3) && uo.b(0, length, soVar.b, soVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void C(String str, String str2) {
        String a0 = a0(str);
        if (G(4, a0)) {
            Log.i(a0, str2);
        }
    }

    public static boolean D(String str) {
        return G(3, a0(str));
    }

    public static boolean E() {
        return G(6, a0("CXCP"));
    }

    public static boolean F() {
        return G(4, a0("CXCP"));
    }

    public static boolean G(int i, String str) {
        if (c > i && !Log.isLoggable(str, i)) {
            return false;
        }
        return true;
    }

    public static final boolean H(rp4 rp4Var, long j, long j2) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (rp4Var.i == 1) {
            i = 1;
        } else {
            i = 0;
        }
        long j3 = rp4Var.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        float f3 = ((int) (j & 4294967295L)) + intBitsToFloat4;
        if (intBitsToFloat < (-intBitsToFloat3)) {
            z = true;
        } else {
            z = false;
        }
        if (intBitsToFloat > f2) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z2 | z;
        if (intBitsToFloat2 < (-intBitsToFloat4)) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 | z3;
        if (intBitsToFloat2 > f3) {
            z4 = true;
        }
        return z6 | z4;
    }

    public static boolean I() {
        return G(5, a0("CXCP"));
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.qi4 J(defpackage.tu0 r55, int r56) {
        /*
            Method dump skipped, instructions count: 1506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve2.J(tu0, int):qi4");
    }

    public static final long K(rp4 rp4Var, boolean z) {
        long d2 = mb4.d(rp4Var.c, rp4Var.g);
        if (!z && rp4Var.b()) {
            return 0L;
        }
        return d2;
    }

    public static void L(float f, float[] fArr) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, RecyclerView.A1);
        Matrix.rotateM(fArr, 0, f, RecyclerView.A1, RecyclerView.A1, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, RecyclerView.A1);
    }

    public static void M(float[] fArr) {
        Matrix.translateM(fArr, 0, RecyclerView.A1, 0.5f, RecyclerView.A1);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, RecyclerView.A1);
    }

    public static final Class N(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            return N(rawType);
        } else if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            upperBounds.getClass();
            Object p0 = nu.p0(upperBounds);
            p0.getClass();
            return N((Type) p0);
        } else if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            genericComponentType.getClass();
            return N(genericComponentType);
        } else {
            StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
            sb.append(type);
            vd6.h(sb, " has type ", q75.a(type.getClass()));
            return null;
        }
    }

    public static final m93 O(vn1 vn1Var, Class cls, List list) {
        m93[] m93VarArr = (m93[]) list.toArray(new m93[0]);
        m93 x = ln2.x(cls, (m93[]) Arrays.copyOf(m93VarArr, m93VarArr.length));
        if (x != null) {
            return x;
        }
        m93 m93Var = (m93) yt4.a.get(q75.a(cls));
        if (m93Var == null) {
            vn1Var.getClass();
            if (cls.isInterface()) {
                return new bq4(q75.a(cls));
            }
            return null;
        }
        return m93Var;
    }

    public static final x66 P(tu0 tu0Var) {
        sk2 sk2Var = (sk2) tu0Var;
        Object L = sk2Var.L();
        if (L == su0.a) {
            L = new x66();
            sk2Var.h0(L);
        }
        return (x66) L;
    }

    public static final Object Q(aj2 aj2Var) {
        Thread.interrupted();
        return tq5.A(mp1.A, new zr5(aj2Var, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r7 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
        if (r7 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.m93 R(defpackage.vn1 r7, java.lang.reflect.Type r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve2.R(vn1, java.lang.reflect.Type, boolean):m93");
    }

    public static final void S(td0 td0Var, me1 me1Var, qb5 qb5Var) {
        boolean z;
        v80 s;
        q9 q9Var = d;
        if (q9Var != null) {
            String f = td0Var.f();
            f.getClass();
            vd0 b2 = ((bf0) q9Var.B).b(f);
            v9 v9Var = new v9(b2.l(), ic0.a);
            q03 q03Var = q03.X;
            qg0 qg0Var = new qg0(b2, null, v9Var, null, q03Var, q03Var, (qc0) q9Var.L, (ci3) q9Var.X, (e57) q9Var.R);
            synchronized (qg0Var.f0) {
            }
            List list = (List) me1Var.c;
            synchronized (qg0Var.f0) {
                qg0Var.c0 = list;
            }
            synchronized (qg0Var.f0) {
            }
            Range range = (Range) me1Var.d;
            synchronized (qg0Var.f0) {
                qg0Var.d0 = range;
            }
            List list2 = (List) me1Var.g;
            v("CameraUseCaseAdapter", "simulateAddUseCases: appUseCasesToAdd = " + list2 + ", featureGroup = " + qb5Var);
            synchronized (qg0Var.f0) {
                w9 w9Var = qg0Var.A;
                fc0 fc0Var = qg0Var.e0;
                w9Var.r(fc0Var);
                w9 w9Var2 = qg0Var.B;
                if (w9Var2 != null) {
                    w9Var2.r(fc0Var);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(qg0Var.X);
                linkedHashSet.addAll(list2);
                HashMap o = qg0.o(linkedHashSet, qb5Var);
                try {
                    if (qg0Var.B != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    s = qg0Var.s(linkedHashSet, z);
                    qg0.D(o);
                } catch (IllegalArgumentException e) {
                    throw new Exception(e);
                }
            }
            s.getClass();
            return;
        }
        i.n("mCameraUseCaseAdapterProvider must be initialized first!");
    }

    public static final Rect T(e33 e33Var) {
        return new Rect(e33Var.a, e33Var.b, e33Var.c, e33Var.d);
    }

    public static final RectF U(y55 y55Var) {
        return new RectF(y55Var.a, y55Var.b, y55Var.c, y55Var.d);
    }

    public static final y55 V(RectF rectF) {
        return new y55(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final void W(vc1 vc1Var, Object obj, mi2 mi2Var) {
        zc0 zc0Var;
        if (!((yy3) vc1Var).A.i0) {
            mz2.c("visitAncestors called on an unattached node");
        }
        yy3 yy3Var = ((yy3) vc1Var).A.X;
        vf3 P = l.P(vc1Var);
        while (P != null) {
            if ((((yy3) P.A0.g).R & 262144) != 0) {
                while (yy3Var != null) {
                    if ((yy3Var.L & 262144) != 0) {
                        yy3 yy3Var2 = yy3Var;
                        o24 o24Var = null;
                        while (yy3Var2 != null) {
                            boolean z = true;
                            if (yy3Var2 instanceof zx6) {
                                zx6 zx6Var = (zx6) yy3Var2;
                                if (obj.equals(zx6Var.t())) {
                                    z = ((Boolean) mi2Var.n(zx6Var)).booleanValue();
                                }
                                if (!z) {
                                    return;
                                }
                            } else if ((yy3Var2.L & 262144) != 0 && (yy3Var2 instanceof xc1)) {
                                int i = 0;
                                for (yy3 yy3Var3 = ((xc1) yy3Var2).k0; yy3Var3 != null; yy3Var3 = yy3Var3.Y) {
                                    if ((yy3Var3.L & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            yy3Var2 = yy3Var3;
                                        } else {
                                            if (o24Var == null) {
                                                o24Var = new o24(new yy3[16]);
                                            }
                                            if (yy3Var2 != null) {
                                                o24Var.b(yy3Var2);
                                                yy3Var2 = null;
                                            }
                                            o24Var.b(yy3Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            yy3Var2 = l.p(o24Var);
                        }
                        continue;
                    }
                    yy3Var = yy3Var.X;
                }
            }
            P = P.u();
            if (P != null && (zc0Var = P.A0) != null) {
                yy3Var = (lm6) zc0Var.f;
            } else {
                yy3Var = null;
            }
        }
    }

    public static final void X(zx6 zx6Var, mi2 mi2Var) {
        zc0 zc0Var;
        yy3 yy3Var = (yy3) zx6Var;
        if (!yy3Var.A.i0) {
            mz2.c("visitAncestors called on an unattached node");
        }
        yy3 yy3Var2 = yy3Var.A.X;
        vf3 P = l.P(zx6Var);
        while (P != null) {
            if ((((yy3) P.A0.g).R & 262144) != 0) {
                while (yy3Var2 != null) {
                    if ((yy3Var2.L & 262144) != 0) {
                        yy3 yy3Var3 = yy3Var2;
                        o24 o24Var = null;
                        while (yy3Var3 != null) {
                            boolean z = true;
                            if (yy3Var3 instanceof zx6) {
                                zx6 zx6Var2 = (zx6) yy3Var3;
                                if (b53.x(zx6Var.t(), zx6Var2.t()) && zx6Var.getClass() == zx6Var2.getClass()) {
                                    z = ((Boolean) mi2Var.n(zx6Var2)).booleanValue();
                                }
                                if (!z) {
                                    return;
                                }
                            } else if ((yy3Var3.L & 262144) != 0 && (yy3Var3 instanceof xc1)) {
                                int i = 0;
                                for (yy3 yy3Var4 = ((xc1) yy3Var3).k0; yy3Var4 != null; yy3Var4 = yy3Var4.Y) {
                                    if ((yy3Var4.L & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            yy3Var3 = yy3Var4;
                                        } else {
                                            if (o24Var == null) {
                                                o24Var = new o24(new yy3[16]);
                                            }
                                            if (yy3Var3 != null) {
                                                o24Var.b(yy3Var3);
                                                yy3Var3 = null;
                                            }
                                            o24Var.b(yy3Var4);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            yy3Var3 = l.p(o24Var);
                        }
                        continue;
                    }
                    yy3Var2 = yy3Var2.X;
                }
            }
            P = P.u();
            if (P != null && (zc0Var = P.A0) != null) {
                yy3Var2 = (lm6) zc0Var.f;
            } else {
                yy3Var2 = null;
            }
        }
    }

    public static final void Y(yy3 yy3Var, String str, mi2 mi2Var) {
        yx6 yx6Var;
        if (!yy3Var.A.i0) {
            mz2.c("visitSubtreeIf called on an unattached node");
        }
        o24 o24Var = new o24(new yy3[16]);
        yy3 yy3Var2 = yy3Var.A;
        yy3 yy3Var3 = yy3Var2.Y;
        if (yy3Var3 == null) {
            l.l(o24Var, yy3Var2);
        } else {
            o24Var.b(yy3Var3);
        }
        while (true) {
            int i = o24Var.L;
            if (i != 0) {
                yy3 yy3Var4 = (yy3) o24Var.l(i - 1);
                if ((yy3Var4.R & 262144) != 0) {
                    for (yy3 yy3Var5 = yy3Var4; yy3Var5 != null && yy3Var5.i0; yy3Var5 = yy3Var5.Y) {
                        if ((yy3Var5.L & 262144) != 0) {
                            yy3 yy3Var6 = yy3Var5;
                            o24 o24Var2 = null;
                            while (yy3Var6 != null) {
                                if (yy3Var6 instanceof zx6) {
                                    zx6 zx6Var = (zx6) yy3Var6;
                                    if (str.equals(zx6Var.t())) {
                                        yx6Var = (yx6) mi2Var.n(zx6Var);
                                    } else {
                                        yx6Var = yx6.ContinueTraversal;
                                    }
                                    if (yx6Var != yx6.CancelTraversal) {
                                        if (yx6Var == yx6.SkipSubtreeAndContinueTraversal) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((yy3Var6.L & 262144) != 0 && (yy3Var6 instanceof xc1)) {
                                    int i2 = 0;
                                    for (yy3 yy3Var7 = ((xc1) yy3Var6).k0; yy3Var7 != null; yy3Var7 = yy3Var7.Y) {
                                        if ((yy3Var7.L & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                yy3Var6 = yy3Var7;
                                            } else {
                                                if (o24Var2 == null) {
                                                    o24Var2 = new o24(new yy3[16]);
                                                }
                                                if (yy3Var6 != null) {
                                                    o24Var2.b(yy3Var6);
                                                    yy3Var6 = null;
                                                }
                                                o24Var2.b(yy3Var7);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                yy3Var6 = l.p(o24Var2);
                            }
                            continue;
                        }
                    }
                }
                l.l(o24Var, yy3Var4);
            } else {
                return;
            }
        }
    }

    public static final void Z(zx6 zx6Var, mi2 mi2Var) {
        yx6 yx6Var;
        yy3 yy3Var = (yy3) zx6Var;
        if (!yy3Var.A.i0) {
            mz2.c("visitSubtreeIf called on an unattached node");
        }
        o24 o24Var = new o24(new yy3[16]);
        yy3 yy3Var2 = yy3Var.A;
        yy3 yy3Var3 = yy3Var2.Y;
        if (yy3Var3 == null) {
            l.l(o24Var, yy3Var2);
        } else {
            o24Var.b(yy3Var3);
        }
        while (true) {
            int i = o24Var.L;
            if (i != 0) {
                yy3 yy3Var4 = (yy3) o24Var.l(i - 1);
                if ((yy3Var4.R & 262144) != 0) {
                    for (yy3 yy3Var5 = yy3Var4; yy3Var5 != null && yy3Var5.i0; yy3Var5 = yy3Var5.Y) {
                        if ((yy3Var5.L & 262144) != 0) {
                            yy3 yy3Var6 = yy3Var5;
                            o24 o24Var2 = null;
                            while (yy3Var6 != null) {
                                if (yy3Var6 instanceof zx6) {
                                    zx6 zx6Var2 = (zx6) yy3Var6;
                                    if (b53.x(zx6Var.t(), zx6Var2.t()) && zx6Var.getClass() == zx6Var2.getClass()) {
                                        yx6Var = (yx6) mi2Var.n(zx6Var2);
                                    } else {
                                        yx6Var = yx6.ContinueTraversal;
                                    }
                                    if (yx6Var != yx6.CancelTraversal) {
                                        if (yx6Var == yx6.SkipSubtreeAndContinueTraversal) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((yy3Var6.L & 262144) != 0 && (yy3Var6 instanceof xc1)) {
                                    int i2 = 0;
                                    for (yy3 yy3Var7 = ((xc1) yy3Var6).k0; yy3Var7 != null; yy3Var7 = yy3Var7.Y) {
                                        if ((yy3Var7.L & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                yy3Var6 = yy3Var7;
                                            } else {
                                                if (o24Var2 == null) {
                                                    o24Var2 = new o24(new yy3[16]);
                                                }
                                                if (yy3Var6 != null) {
                                                    o24Var2.b(yy3Var6);
                                                    yy3Var6 = null;
                                                }
                                                o24Var2.b(yy3Var7);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                yy3Var6 = l.p(o24Var2);
                            }
                            continue;
                        }
                    }
                }
                l.l(o24Var, yy3Var4);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r25, java.lang.String r26, defpackage.ki2 r27, defpackage.zy3 r28, defpackage.tu0 r29, int r30) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve2.a(java.lang.String, java.lang.String, ki2, zy3, tu0, int):void");
    }

    public static String a0(String str) {
        if (Build.VERSION.SDK_INT <= 25 && 23 < str.length()) {
            return str.substring(0, 23);
        }
        return str;
    }

    public static final long b(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            pz2.a("The span value should be higher than 0");
        }
        return i;
    }

    public static Object b0(String str) {
        String obj;
        if (str != null) {
            try {
                obj = zg6.Z0(str).toString();
            } catch (Throwable th) {
                return new kc5(th);
            }
        } else {
            obj = null;
        }
        if (obj == null) {
            obj = "";
        }
        if (obj.length() > 0) {
            URI uri = new URI(obj);
            if (b53.x(uri.getScheme(), "http")) {
                if (uri.getRawUserInfo() == null) {
                    if (uri.getRawQuery() == null) {
                        if (uri.getRawFragment() == null) {
                            if (!b53.x(uri.getHost(), "127.0.0.1") && !gh6.g0(uri.getHost(), "localhost", true)) {
                                throw new IllegalArgumentException("Only localhost or 127.0.0.1 is allowed");
                            }
                            int port = uri.getPort();
                            if (1 <= port && port < 65536) {
                                String rawPath = uri.getRawPath();
                                if (rawPath != null && rawPath.length() != 0 && !b53.x(uri.getRawPath(), "/") && !b53.x(uri.getRawPath(), "/dorequest.php")) {
                                    throw new IllegalArgumentException("Only /dorequest.php is allowed");
                                }
                                String host = uri.getHost();
                                host.getClass();
                                String lowerCase = host.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                String str2 = "http://" + lowerCase + ":" + uri.getPort();
                                return new l67(str2, str2.concat("/dorequest.php"));
                            }
                            throw new IllegalArgumentException("A valid explicit port is required");
                        }
                        throw new IllegalArgumentException("Fragment is not allowed");
                    }
                    throw new IllegalArgumentException("Query is not allowed");
                }
                throw new IllegalArgumentException("User info is not allowed");
            }
            throw new IllegalArgumentException("Only HTTP loopback is supported");
        }
        throw new IllegalArgumentException("Missing host");
    }

    public static nh c(int i, int i2, int i3, int i4) {
        Bitmap createBitmap;
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        eg5 eg5Var = dr0.e;
        Bitmap.Config T = f34.T(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, f34.T(i3), true, cr0.a(eg5Var));
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, T);
            createBitmap.setHasAlpha(true);
        }
        return new nh(createBitmap);
    }

    public static void c0(String str, String str2) {
        String a0 = a0(str);
        if (G(5, a0)) {
            Log.w(a0, str2);
        }
    }

    public static final void d(o3 o3Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1390797292);
        if (sk2Var.h(o3Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            pu.a(b53.X(wy3.a, 8.0f), o3Var.d, o3Var.i, new xq0(s25.a), ct3.H0(1474506770, new km4(7, o3Var), sk2Var), sk2Var, 27654, 0);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new z5(i, 16, o3Var);
        }
    }

    public static void d0(String str, String str2, Throwable th) {
        String a0 = a0(str);
        if (G(5, a0)) {
            Log.w(a0, str2, th);
        }
    }

    public static final void e(final rg5 rg5Var, final String str, final String str2, final boolean z, final boolean z2, final ki2 ki2Var, final ki2 ki2Var2, final zy3 zy3Var, tu0 tu0Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        float f;
        mv0 mv0Var;
        dn dnVar;
        boolean z4;
        float f2;
        mv0 mv0Var2;
        dn dnVar2;
        dn dnVar3;
        y60 y60Var;
        boolean z5;
        boolean z6;
        j20 j20Var = y60.d0;
        ki2Var.getClass();
        ki2Var2.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1263458246);
        if (sk2Var.h(rg5Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i10 = i | i2;
        if (sk2Var.f(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i11 = i10 | i3;
        if (sk2Var.f(str2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i12 = i11 | i4;
        if (sk2Var.g(z)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i13 = i12 | i5;
        if (sk2Var.g(z2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i14 = i13 | i6;
        if (sk2Var.h(ki2Var)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i15 = i14 | i7;
        if (sk2Var.h(ki2Var2)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i16 = i15 | i8;
        if (sk2Var.f(zy3Var)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i17 = i16 | i9;
        if ((i17 & 4793491) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (sk2Var.O(i17 & 1, z3)) {
            jd7 C = mj2.C(sk2Var);
            fr5 b2 = gr5.b(7.0f);
            Object L = sk2Var.L();
            Object obj = su0.a;
            if (L == obj) {
                L = b31.f(sk2Var);
            }
            l14 l14Var = (l14) L;
            k24 a2 = bh7.a(l14Var, sk2Var, 6);
            if (((Boolean) io2.q(l14Var, sk2Var).getValue()).booleanValue()) {
                f = 0.93f;
            } else {
                f = 1.0f;
            }
            ae6 b3 = wm.b(f, ct3.P0(1.0f, 4000.0f, null, 4), "press", sk2Var, 3120, 20);
            boolean f3 = sk2Var.f(rg5Var.d);
            Object L2 = sk2Var.L();
            if (f3 || L2 == obj) {
                L2 = me2.G(Boolean.FALSE);
                sk2Var.h0(L2);
            }
            k24 k24Var = (k24) L2;
            zy3 v = a53.v(a53.t(jk2.Q(l07.p(o76.c(sn2.L(zy3Var, ((Number) b3.getValue()).floatValue()), 1.0f), 1.117904f), 5.0f, b2, false, 0L, 28), b2), l14Var, false, ki2Var2, ki2Var, 444);
            j20 j20Var2 = y60.L;
            tv3 d2 = d50.d(j20Var2, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, v);
            nu0.i.getClass();
            mv0 mv0Var3 = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var3);
            } else {
                sk2Var.k0();
            }
            dn dnVar4 = mu0.f;
            oo2.S(sk2Var, dnVar4, d2);
            dn dnVar5 = mu0.e;
            oo2.S(sk2Var, dnVar5, l);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar6 = mu0.g;
            oo2.S(sk2Var, dnVar6, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar7 = mu0.d;
            oo2.S(sk2Var, dnVar7, e0);
            y60 y60Var2 = y60.n0;
            long B = hi2.B(44);
            wy3 wy3Var = wy3.a;
            zy3 c2 = o76.c(l07.p(wy3Var, 1.117904f), 1.0f);
            boolean f4 = sk2Var.f(k24Var);
            Object L3 = sk2Var.L();
            if (f4 || L3 == obj) {
                L3 = new j4(k24Var, 19);
                sk2Var.h0(L3);
            }
            int i18 = i17 & 14;
            int i19 = (i17 << 3) & 896;
            f34.o(rg5Var, str2, str, c2, B, null, z, (mi2) L3, sk2Var, i18 | 27648 | ((i17 >> 3) & 112) | i19 | ((i17 << 9) & 3670016), 32);
            sk2Var = sk2Var;
            zy3 c3 = o76.c(l07.p(wy3Var, 1.117904f), 1.0f);
            long j = xq0.d;
            d50.a(b53.z(1.0f, xq0.b(0.13f, j), c3, b2), sk2Var, 0);
            zy3 X = b53.X(y60Var2.i(wy3Var, j20Var2), 7.0f);
            sr5 a3 = rr5.a(rt.a, y60.h0, sk2Var, 48);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, X);
            sk2Var.b0();
            if (sk2Var.S) {
                mv0Var = mv0Var3;
                sk2Var.k(mv0Var);
            } else {
                mv0Var = mv0Var3;
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar4, a3);
            oo2.S(sk2Var, dnVar5, l2);
            b31.x(hashCode2, sk2Var, dnVar6, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar7, e02);
            mv0 mv0Var4 = mv0Var;
            f34.g(f34.Q(rg5Var), null, 0L, sk2Var, 0, 6);
            if (z2) {
                sk2Var.X(835535730);
                cg2.k(sk2Var, o76.k(wy3Var, 4.0f));
                zy3 Y = b53.Y(dk7.i(a53.t(wy3Var, gr5.b(4.0f)), xq0.b(0.35f, xq0.b), iq2.g), 4.0f, 2.0f);
                tv3 d3 = d50.d(j20Var2, false);
                int hashCode3 = Long.hashCode(sk2Var.T);
                sm4 l3 = sk2Var.l();
                zy3 e03 = l07.e0(sk2Var, Y);
                sk2Var.b0();
                if (sk2Var.S) {
                    sk2Var.k(mv0Var4);
                } else {
                    sk2Var.k0();
                }
                oo2.S(sk2Var, dnVar4, d3);
                oo2.S(sk2Var, dnVar5, l3);
                b31.x(hashCode3, sk2Var, dnVar6, sk2Var, ydVar);
                oo2.S(sk2Var, dnVar7, e03);
                dnVar = dnVar5;
                f2 = 7.0f;
                ev2.a(mh7.N(), null, o76.h(wy3Var, 10.0f), jd7.p, sk2Var, 3504, 0);
                sk2Var = sk2Var;
                z4 = true;
                sk2Var.p(true);
                sk2Var.p(false);
            } else {
                dnVar = dnVar5;
                z4 = true;
                f2 = 7.0f;
                sk2Var.X(836139238);
                sk2Var.p(false);
            }
            sk2Var.p(z4);
            if (rg5Var.k) {
                sk2Var.X(1458310581);
                sk2 sk2Var2 = sk2Var;
                mv0Var2 = mv0Var4;
                y60Var = y60Var2;
                dnVar3 = dnVar4;
                dnVar2 = dnVar7;
                ev2.a(jk2.C(), null, o76.h(b53.b0(y60Var2.i(wy3Var, y60.X), RecyclerView.A1, 6.0f, f2, RecyclerView.A1, 9), 13.0f), jd7.q, sk2Var2, 3120, 0);
                sk2Var = sk2Var2;
                sk2Var.p(false);
            } else {
                mv0Var2 = mv0Var4;
                dnVar2 = dnVar7;
                dnVar3 = dnVar4;
                y60Var = y60Var2;
                sk2Var.X(1458640514);
                sk2Var.p(false);
            }
            if (!((Boolean) k24Var.getValue()).booleanValue()) {
                sk2Var.X(1458703847);
                zy3 a0 = b53.a0(dk7.h(o76.c(y60Var.i(wy3Var, j20Var), 1.0f), sn1.o(l07.c0(new xq0(xq0.g), new xq0(xq0.b(0.8f, xq0.b))), RecyclerView.A1, RecyclerView.A1, 14)), 9.0f, 22.0f, 9.0f, 9.0f);
                lr0 a4 = jr0.a(rt.c, y60.j0, sk2Var, 0);
                int hashCode4 = Long.hashCode(sk2Var.T);
                sm4 l4 = sk2Var.l();
                zy3 e04 = l07.e0(sk2Var, a0);
                sk2Var.b0();
                if (sk2Var.S) {
                    sk2Var.k(mv0Var2);
                } else {
                    sk2Var.k0();
                }
                oo2.S(sk2Var, dnVar3, a4);
                oo2.S(sk2Var, dnVar, l4);
                b31.x(hashCode4, sk2Var, dnVar6, sk2Var, ydVar);
                oo2.S(sk2Var, dnVar2, e04);
                ir6.b(f34.M(rg5Var), null, j, hi2.A(11.5d), pe2.d0, null, 0L, null, hi2.A(14.5d), 2, false, 2, 0, null, null, sk2Var, 200064, 3126, 119762);
                String B2 = f34.B(rg5Var.j);
                if (B2.length() > 0) {
                    sk2Var.X(-1595446469);
                    ir6.b(B2, b53.b0(wy3Var, RecyclerView.A1, 3.0f, RecyclerView.A1, RecyclerView.A1, 13), xq0.b(0.65f, j), hi2.A(8.5d), null, td7.c, 0L, null, hi2.B(10), 0, false, 0, 0, null, null, sk2Var, 1576368, 6, 129968);
                    z6 = false;
                    sk2Var.p(false);
                } else {
                    z6 = false;
                    sk2Var.X(-1595106678);
                    sk2Var.p(false);
                }
                z5 = true;
                sk2Var.p(true);
                sk2Var.p(z6);
            } else {
                z5 = true;
                sk2Var.X(1459892790);
                f34.l(rg5Var, b53.X(y60Var.i(wy3Var, j20Var), 7.0f), str, RecyclerView.A1, sk2Var, i18 | i19, 8);
                sk2Var.p(false);
            }
            if (((Boolean) a2.getValue()).booleanValue()) {
                sk2Var.X(1460096429);
                d50.a(b53.z(3.0f, C.j, o76.c(l07.p(wy3Var, 1.117904f), 1.0f), b2), sk2Var, 0);
                sk2Var.p(false);
            } else {
                sk2Var.X(1460208866);
                sk2Var.p(false);
            }
            sk2Var.p(z5);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2(str, str2, z, z2, ki2Var, ki2Var2, zy3Var, i) { // from class: nm5
                public final /* synthetic */ String B;
                public final /* synthetic */ String L;
                public final /* synthetic */ boolean R;
                public final /* synthetic */ boolean X;
                public final /* synthetic */ ki2 Y;
                public final /* synthetic */ ki2 Z;
                public final /* synthetic */ zy3 c0;

                @Override // defpackage.aj2
                public final Object j(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ep2.I(1);
                    ve2.e(rg5.this, this.B, this.L, this.R, this.X, this.Y, this.Z, this.c0, (tu0) obj2, I);
                    return o27.a;
                }
            };
        }
    }

    public static final void f(x66 x66Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        m55 r;
        v66 v66Var;
        x66Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-43957353);
        if (sk2Var.f(x66Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        boolean z2 = false;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            if (!((Boolean) x66Var.a.getValue()).booleanValue()) {
                r = sk2Var.r();
                if (r != null) {
                    v66Var = new v66(x66Var, i, 0);
                } else {
                    return;
                }
            } else {
                w66 w66Var = (w66) x66Var.b.getValue();
                if (w66Var == null) {
                    r = sk2Var.r();
                    if (r != null) {
                        v66Var = new v66(x66Var, i, 1);
                    } else {
                        return;
                    }
                } else {
                    String str = w66Var.a;
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    }
                    Object L = sk2Var.L();
                    if (z2 || L == su0.a) {
                        L = new u66(x66Var, 1);
                        sk2Var.h0(L);
                    }
                    mh7.a(str, (ki2) L, ct3.H0(497074786, new l4(13, w66Var, x66Var), sk2Var), ct3.H0(367337888, new v66(x66Var), sk2Var), false, sk2Var, 3456, 16);
                }
            }
            r.d = v66Var;
        }
        sk2Var.R();
        r = sk2Var.r();
        if (r != null) {
            v66Var = new v66(x66Var, i, 3);
            r.d = v66Var;
        }
    }

    public static final long g(int i, int i2) {
        if (i < 0 || i2 < 0) {
            nz2.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (i2 & 4294967295L) | (i << 32);
        int i3 = vr6.c;
        return j;
    }

    public static final wd h(o0 o0Var, rm3 rm3Var) {
        if (rm3Var.b().compareTo(qm3.DESTROYED) > 0) {
            p34 p34Var = new p34(2, o0Var);
            rm3Var.a(p34Var);
            return new wd(10, rm3Var, p34Var);
        }
        f81.m("Cannot configure ", o0Var, " to disposeComposition at Lifecycle ON_DESTROY: ", rm3Var, "is already destroyed");
        return null;
    }

    public static final boolean i(float f) {
        if (!Float.isNaN(f) && Math.abs(f) >= 0.5f) {
            return false;
        }
        return true;
    }

    public static final void j(xn6 xn6Var, Context context, final boolean z, final String str, final long j) {
        if (!vr6.c(j) && str.length() != 0) {
            PackageManager packageManager = context.getPackageManager();
            final Context context2 = context;
            List list = (List) se.k.n(context2);
            if (!list.isEmpty()) {
                w14 w14Var = xn6Var.a;
                w14 w14Var2 = xn6Var.a;
                lo6 lo6Var = lo6.b;
                w14Var.a(lo6Var);
                int size = list.size();
                int i = 0;
                while (i < size) {
                    final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
                    w14Var2.a(new ho6(new fu4(i), resolveInfo.loadLabel(packageManager).toString(), 0, new mi2() { // from class: gu4
                        @Override // defpackage.mi2
                        public final Object n(Object obj) {
                            se.l.o(context2, resolveInfo, Boolean.valueOf(z), str, new vr6(j));
                            ((mo6) obj).close();
                            return o27.a;
                        }
                    }));
                    i++;
                    context2 = context;
                }
                w14Var2.a(lo6Var);
            }
        }
    }

    public static final void k(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(defpackage.sk6 r8, defpackage.lp4 r9, defpackage.m00 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.te2
            if (r0 == 0) goto L13
            r0 = r10
            te2 r0 = (defpackage.te2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            te2 r0 = new te2
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.Y
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2f
            lp4 r8 = r0.X
            sk6 r9 = r0.R
            defpackage.me2.a0(r10)
            r7 = r9
            r9 = r8
            r8 = r7
            goto L5d
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r8)
            r8 = 0
            return r8
        L36:
            defpackage.me2.a0(r10)
            uk6 r10 = r8.Y
            kp4 r10 = r10.o0
            java.util.List r10 = r10.a
            int r2 = r10.size()
            r5 = r3
        L44:
            if (r5 >= r2) goto L79
            java.lang.Object r6 = r10.get(r5)
            rp4 r6 = (defpackage.rp4) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L76
        L50:
            r0.R = r8
            r0.X = r9
            r0.Z = r4
            java.lang.Object r10 = r8.c(r9, r0)
            if (r10 != r1) goto L5d
            return r1
        L5d:
            kp4 r10 = (defpackage.kp4) r10
            java.util.List r10 = r10.a
            int r2 = r10.size()
            r5 = r3
        L66:
            if (r5 >= r2) goto L79
            java.lang.Object r6 = r10.get(r5)
            rp4 r6 = (defpackage.rp4) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L73
            goto L50
        L73:
            int r5 = r5 + 1
            goto L66
        L76:
            int r5 = r5 + 1
            goto L44
        L79:
            o27 r8 = defpackage.o27.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve2.l(sk6, lp4, m00):java.lang.Object");
    }

    public static final Object m(vp4 vp4Var, aj2 aj2Var, j11 j11Var) {
        Object R0 = ((uk6) vp4Var).R0(new ue2(j11Var.a(), aj2Var, null, 0), j11Var);
        if (R0 == p31.COROUTINE_SUSPENDED) {
            return R0;
        }
        return o27.a;
    }

    public static final boolean n(rp4 rp4Var) {
        if (!rp4Var.b() && !rp4Var.h && rp4Var.d) {
            return true;
        }
        return false;
    }

    public static final boolean o(rp4 rp4Var) {
        if (!rp4Var.h && rp4Var.d) {
            return true;
        }
        return false;
    }

    public static final boolean p(rp4 rp4Var) {
        if (!rp4Var.b() && rp4Var.h && !rp4Var.d) {
            return true;
        }
        return false;
    }

    public static final boolean q(rp4 rp4Var) {
        if (rp4Var.h && !rp4Var.d) {
            return true;
        }
        return false;
    }

    public static final long r(int i, long j) {
        int i2;
        int i3 = vr6.c;
        int i4 = (int) (j >> 32);
        int i5 = 0;
        if (i4 < 0) {
            i2 = 0;
        } else {
            i2 = i4;
        }
        if (i2 > i) {
            i2 = i;
        }
        int i6 = (int) (4294967295L & j);
        if (i6 >= 0) {
            i5 = i6;
        }
        if (i5 <= i) {
            i = i5;
        }
        if (i2 == i4 && i == i6) {
            return j;
        }
        return g(i2, i);
    }

    public static int s(c75 c75Var, io1 io1Var, View view, View view2, q65 q65Var, boolean z) {
        if (q65Var.v() != 0 && c75Var.b() != 0 && view != null && view2 != null) {
            if (!z) {
                return Math.abs(q65.G(view) - q65.G(view2)) + 1;
            }
            return Math.min(io1Var.n(), io1Var.d(view2) - io1Var.g(view));
        }
        return 0;
    }

    public static int t(c75 c75Var, io1 io1Var, View view, View view2, q65 q65Var, boolean z, boolean z2) {
        int max;
        if (q65Var.v() == 0 || c75Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(q65.G(view), q65.G(view2));
        int max2 = Math.max(q65.G(view), q65.G(view2));
        if (z2) {
            max = Math.max(0, (c75Var.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((max * (Math.abs(io1Var.d(view2) - io1Var.g(view)) / (Math.abs(q65.G(view) - q65.G(view2)) + 1))) + (io1Var.m() - io1Var.g(view)));
    }

    public static int u(c75 c75Var, io1 io1Var, View view, View view2, q65 q65Var, boolean z) {
        if (q65Var.v() != 0 && c75Var.b() != 0 && view != null && view2 != null) {
            if (!z) {
                return c75Var.b();
            }
            return (int) (((io1Var.d(view2) - io1Var.g(view)) / (Math.abs(q65.G(view) - q65.G(view2)) + 1)) * c75Var.b());
        }
        return 0;
    }

    public static void v(String str, String str2) {
        String a0 = a0(str);
        if (G(3, a0)) {
            Log.d(a0, str2);
        }
    }

    public static void w(String str, String str2) {
        String a0 = a0(str);
        if (G(6, a0)) {
            Log.e(a0, str2);
        }
    }

    public static void x(String str, String str2, Throwable th) {
        String a0 = a0(str);
        if (G(6, a0)) {
            Log.e(a0, str2, th);
        }
    }

    public static final zx6 y(xc1 xc1Var, Object obj) {
        zc0 zc0Var;
        if (!xc1Var.A.i0) {
            mz2.c("visitAncestors called on an unattached node");
        }
        yy3 yy3Var = xc1Var.A.X;
        vf3 P = l.P(xc1Var);
        while (P != null) {
            if ((((yy3) P.A0.g).R & 262144) != 0) {
                while (yy3Var != null) {
                    if ((yy3Var.L & 262144) != 0) {
                        yy3 yy3Var2 = yy3Var;
                        o24 o24Var = null;
                        while (yy3Var2 != null) {
                            if (yy3Var2 instanceof zx6) {
                                zx6 zx6Var = (zx6) yy3Var2;
                                if (obj.equals(zx6Var.t())) {
                                    return zx6Var;
                                }
                            }
                            if ((yy3Var2.L & 262144) != 0 && (yy3Var2 instanceof xc1)) {
                                int i = 0;
                                for (yy3 yy3Var3 = ((xc1) yy3Var2).k0; yy3Var3 != null; yy3Var3 = yy3Var3.Y) {
                                    if ((yy3Var3.L & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            yy3Var2 = yy3Var3;
                                        } else {
                                            if (o24Var == null) {
                                                o24Var = new o24(new yy3[16]);
                                            }
                                            if (yy3Var2 != null) {
                                                o24Var.b(yy3Var2);
                                                yy3Var2 = null;
                                            }
                                            o24Var.b(yy3Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            yy3Var2 = l.p(o24Var);
                        }
                        continue;
                    }
                    yy3Var = yy3Var.X;
                }
            }
            P = P.u();
            if (P != null && (zc0Var = P.A0) != null) {
                yy3Var = (lm6) zc0Var.f;
            } else {
                yy3Var = null;
            }
        }
        return null;
    }

    public static op2 z(SSLSession sSLSession) {
        List list;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            if (!cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") && !cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                ho0 o = ho0.b.o(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol != null) {
                    if (!"NONE".equals(protocol)) {
                        ut6.Companion.getClass();
                        ut6 a2 = tt6.a(protocol);
                        try {
                            list = ik7.j(sSLSession.getPeerCertificates());
                        } catch (SSLPeerUnverifiedException unused) {
                            list = pp1.A;
                        }
                        return new op2(a2, o, ik7.j(sSLSession.getLocalCertificates()), new c5(2, list));
                    }
                    f81.j("tlsVersion == NONE");
                    return null;
                }
                i.n("tlsVersion == null");
                return null;
            }
            f81.j("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        i.n("cipherSuite == null");
        return null;
    }
}
