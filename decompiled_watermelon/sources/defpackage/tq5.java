package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.ImageWriter;
import android.os.Build;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.format.DateUtils;
import android.text.util.Linkify;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tq5 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class tq5 {
    public static rf5 l;
    public static final /* synthetic */ int q = 0;
    public static final /* synthetic */ int r = 0;
    public static Constructor s;
    public static final lt a = new lt(0);
    public static final lt b = new lt(1);
    public static final et0 c = new et0(-1890422454, false, new xk0(8));
    public static final et0 d = new et0(-163762566, false, new ot0(18));
    public static final et0 e = new et0(803814188, false, new xk0(9));
    public static final et0 f = new et0(387696893, false, new xk0(10));
    public static final et0 g = new et0(899959196, false, new xk0(11));
    public static final et0 h = new et0(-2067582301, false, new xk0(12));
    public static final et0 i = new et0(1851299011, false, new pt0(6));
    public static final et0 j = new et0(1365620410, false, new pt0(7));
    public static final rd1 k = new rd1(1.0f, 1.0f);
    public static final pj m = new pj(6);
    public static final StackTraceElement[] n = new StackTraceElement[0];
    public static final StackTraceElement[] o = new StackTraceElement[0];
    public static final p82 p = new p82(0);

    public static final Object A(e31 e31Var, aj2 aj2Var) {
        u12 u12Var;
        e31 r2;
        long q0;
        ns0 ns0Var;
        Thread currentThread = Thread.currentThread();
        d31 d31Var = k45.Y;
        g31 g31Var = (g31) e31Var.I(d31Var);
        mp1 mp1Var = mp1.A;
        if (g31Var == null) {
            u12Var = vs6.a();
            r2 = pu.r(mp1Var, e31Var.C(u12Var), true);
            bb1 bb1Var = tg1.a;
            if (r2 != bb1Var && r2.I(d31Var) == null) {
                r2 = r2.C(bb1Var);
            }
        } else {
            u12Var = (u12) vs6.a.get();
            r2 = pu.r(mp1Var, e31Var, true);
            bb1 bb1Var2 = tg1.a;
            if (r2 != bb1Var2 && r2.I(d31Var) == null) {
                r2 = r2.C(bb1Var2);
            }
        }
        m30 m30Var = new m30(r2, currentThread, u12Var);
        s31.DEFAULT.invoke(aj2Var, m30Var, m30Var);
        u12 u12Var2 = m30Var.Z;
        if (u12Var2 != null) {
            int i2 = u12.Y;
            u12Var2.p0(false);
        }
        while (true) {
            if (u12Var2 != null) {
                try {
                    q0 = u12Var2.q0();
                } catch (Throwable th) {
                    if (u12Var2 != null) {
                        int i3 = u12.Y;
                        u12Var2.n0(false);
                    }
                    throw th;
                }
            } else {
                q0 = Long.MAX_VALUE;
            }
            if (m30Var.a0()) {
                break;
            }
            LockSupport.parkNanos(m30Var, q0);
            if (Thread.interrupted()) {
                m30Var.t(new InterruptedException());
            }
        }
        if (u12Var2 != null) {
            int i4 = u12.Y;
            u12Var2.n0(false);
        }
        Object a2 = q63.a(m30Var.S());
        if (a2 instanceof ns0) {
            ns0Var = (ns0) a2;
        } else {
            ns0Var = null;
        }
        if (ns0Var == null) {
            return a2;
        }
        throw ns0Var.a;
    }

    public static final void C(t2 t2Var, iz5 iz5Var) {
        int size;
        AccessibilityNodeInfo accessibilityNodeInfo = t2Var.a;
        Object g2 = iz5Var.k().A.g(mz5.f);
        Object obj = null;
        if (g2 == null) {
            g2 = null;
        }
        oq0 oq0Var = (oq0) g2;
        if (oq0Var != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(oq0Var.a, oq0Var.b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object g3 = iz5Var.k().A.g(mz5.e);
        if (g3 != null) {
            obj = g3;
        }
        if (obj != null) {
            List j2 = iz5.j(4, iz5Var);
            int size2 = j2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                iz5 iz5Var2 = (iz5) j2.get(i2);
                if (iz5Var2.k().A.c(mz5.J)) {
                    arrayList.add(iz5Var2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            boolean h2 = h(arrayList);
            int i3 = 1;
            if (h2) {
                size = 1;
            } else {
                size = arrayList.size();
            }
            if (h2) {
                i3 = arrayList.size();
            }
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size, i3, false, 0));
        }
    }

    public static final void D(qo0 qo0Var, String str) {
        String sb;
        qo0Var.getClass();
        String str2 = "in the polymorphic scope of '" + qo0Var.c() + '\'';
        if (str == null) {
            sb = b31.n('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder v = b31.v("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            b31.B(v, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            v.append(qo0Var.c());
            v.append("' has to be sealed and '@Serializable'.");
            sb = v.toString();
        }
        throw new IllegalArgumentException(sb);
    }

    public static final f62 E(File file) {
        List list;
        String path = file.getPath();
        path.getClass();
        int p2 = p(path);
        String substring = path.substring(0, p2);
        String substring2 = path.substring(p2);
        if (substring2.length() == 0) {
            list = pp1.A;
        } else {
            List<String> P0 = zg6.P0(substring2, new char[]{File.separatorChar}, 6);
            ArrayList arrayList = new ArrayList(uq0.y0(P0, 10));
            for (String str : P0) {
                arrayList.add(new File(str));
            }
            list = arrayList;
        }
        return new f62(new File(substring), list);
    }

    public static final long F(long j2, long j3) {
        boolean z;
        boolean z2;
        int d2;
        boolean z3;
        boolean z4;
        boolean z5;
        int f2 = vr6.f(j2);
        int e2 = vr6.e(j2);
        boolean z6 = false;
        if (vr6.f(j3) < vr6.e(j2)) {
            z = true;
        } else {
            z = false;
        }
        if (vr6.f(j2) < vr6.e(j3)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z & z2) {
            if (vr6.f(j3) <= vr6.f(j2)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (vr6.e(j2) <= vr6.e(j3)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z3 & z4) {
                f2 = vr6.f(j3);
                e2 = f2;
            } else {
                if (vr6.f(j2) <= vr6.f(j3)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (vr6.e(j3) <= vr6.e(j2)) {
                    z6 = true;
                }
                if (z5 & z6) {
                    d2 = vr6.d(j3);
                } else {
                    int f3 = vr6.f(j3);
                    if (f2 < vr6.e(j3) && f3 <= f2) {
                        f2 = vr6.f(j3);
                        d2 = vr6.d(j3);
                    } else {
                        e2 = vr6.f(j3);
                    }
                }
                e2 -= d2;
            }
        } else if (e2 > vr6.f(j3)) {
            f2 -= vr6.d(j3);
            d2 = vr6.d(j3);
            e2 -= d2;
        }
        return ve2.g(f2, e2);
    }

    public static final Object G(e31 e31Var, aj2 aj2Var, j11 j11Var) {
        e31 r2;
        Object a2;
        e31 a3 = j11Var.a();
        if (!((Boolean) e31Var.N(new qt0(7), Boolean.FALSE)).booleanValue()) {
            r2 = a3.C(e31Var);
        } else {
            r2 = pu.r(a3, e31Var, false);
        }
        ln2.B(r2);
        if (r2 == a3) {
            fv5 fv5Var = new fv5(j11Var, r2);
            a2 = ln2.T(fv5Var, true, fv5Var, aj2Var);
        } else {
            k45 k45Var = k45.Y;
            if (b53.x(r2.I(k45Var), a3.I(k45Var))) {
                j27 j27Var = new j27(j11Var, r2);
                e31 e31Var2 = j27Var.X;
                Object c2 = ts6.c(e31Var2, null);
                try {
                    Object T = ln2.T(j27Var, true, j27Var, aj2Var);
                    ts6.a(e31Var2, c2);
                    a2 = T;
                } catch (Throwable th) {
                    ts6.a(e31Var2, c2);
                    throw th;
                }
            } else {
                fv5 fv5Var2 = new fv5(j11Var, r2);
                try {
                    kg1.a(nk2.J(nk2.v(aj2Var, fv5Var2, fv5Var2)), o27.a);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = lg1.Z;
                    while (true) {
                        int i2 = atomicIntegerFieldUpdater.get(fv5Var2);
                        if (i2 != 0) {
                            if (i2 == 2) {
                                a2 = q63.a(fv5Var2.S());
                                if (a2 instanceof ns0) {
                                    throw ((ns0) a2).a;
                                }
                            } else {
                                i.n("Already suspended");
                                return null;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(fv5Var2, 0, 1)) {
                            a2 = p31.COROUTINE_SUSPENDED;
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof ig1) {
                        th = ((ig1) th).A;
                    }
                    fv5Var2.k(me2.o(th));
                    throw th;
                }
            }
        }
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.zy3 r16, long r17, float r19, defpackage.tu0 r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq5.a(zy3, long, float, tu0, int, int):void");
    }

    public static final void b(String str, String str2, ki2 ki2Var, zy3 zy3Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        zy3 zy3Var2;
        ki2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1318050154);
        if (sk2Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (sk2Var.f(str2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (sk2Var.h(ki2Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        if (sk2Var.f(zy3Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i10 = i9 | i6;
        if ((i10 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i10 & 1, z)) {
            jd7 C = mj2.C(sk2Var);
            fr5 b2 = gr5.b(8.0f);
            Object L = sk2Var.L();
            if (L == su0.a) {
                L = b31.f(sk2Var);
            }
            l14 l14Var = (l14) L;
            k24 a2 = bh7.a(l14Var, sk2Var, 6);
            zy3 t = a53.t(b53.Y(o76.c(zy3Var, 1.0f), 12.0f, 1.0f), b2);
            boolean booleanValue = ((Boolean) a2.getValue()).booleanValue();
            wy3 wy3Var = wy3.a;
            if (booleanValue) {
                zy3Var2 = b53.z(3.0f, C.j, wy3Var, b2);
            } else {
                zy3Var2 = wy3Var;
            }
            zy3 Y = b53.Y(a53.r(t.f(zy3Var2), l14Var, null, false, null, ki2Var, 28), 8.0f, 10.0f);
            sr5 a3 = rr5.a(rt.a, y60.h0, sk2Var, 48);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, Y);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, a3);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            zy3 i11 = dk7.i(a53.t(o76.h(wy3Var, 46.0f), gr5.b(6.0f)), C.m, iq2.g);
            tv3 d2 = d50.d(y60.Z, false);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, i11);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, d2);
            oo2.S(sk2Var, dnVar2, l3);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e02);
            ev2.a(fj7.b(), null, o76.h(wy3Var, 24.0f), C.l, sk2Var, 432, 0);
            sk2Var.p(true);
            cg2.k(sk2Var, o76.k(wy3Var, 13.0f));
            xg3 xg3Var = new xg3(1.0f, true);
            lr0 a4 = jr0.a(rt.d, y60.j0, sk2Var, 6);
            int hashCode3 = Long.hashCode(sk2Var.T);
            sm4 l4 = sk2Var.l();
            zy3 e03 = l07.e0(sk2Var, xg3Var);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a4);
            oo2.S(sk2Var, dnVar2, l4);
            b31.x(hashCode3, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e03);
            ir6.b(str, null, C.g, hi2.B(14), pe2.c0, null, 0L, null, hi2.B(18), 2, false, 1, 0, null, null, sk2Var, (i10 & 14) | 199680, 3126, 119762);
            sk2Var = sk2Var;
            if (str2.length() > 0 && !str2.equals(str)) {
                sk2Var.X(-1246224798);
                ir6.b(str2, null, C.i, hi2.B(12), null, null, 0L, null, hi2.B(15), 2, false, 1, 0, null, null, sk2Var, ((i10 >> 3) & 14) | 3072, 3126, 119794);
                sk2Var = sk2Var;
                sk2Var.p(false);
            } else {
                sk2Var.X(-1245949518);
                sk2Var.p(false);
            }
            sk2Var.p(true);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new om5(str, str2, ki2Var, zy3Var, i2, 1);
        }
    }

    public static final void c(rg5 rg5Var, String str, String str2, boolean z, boolean z2, boolean z3, ki2 ki2Var, ki2 ki2Var2, ki2 ki2Var3, zy3 zy3Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z4;
        float f2;
        zy3 zy3Var2;
        float f3;
        float f4;
        pe2 pe2Var;
        dn dnVar;
        dn dnVar2;
        dn dnVar3;
        yd ydVar;
        Context context;
        String S0;
        String str3;
        String str4;
        wy3 wy3Var;
        long j2 = rg5Var.j;
        String str5 = rg5Var.b;
        ki2Var.getClass();
        ki2Var2.getClass();
        ki2Var3.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1445968064);
        if (sk2Var.h(rg5Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i13 = i2 | i3;
        if (sk2Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i14 = i13 | i4;
        if (sk2Var.f(str2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i15 = i14 | i5;
        if (sk2Var.g(z)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i16 = i15 | i6;
        if (sk2Var.g(z2)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i17 = i16 | i7;
        if (sk2Var.g(z3)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i18 = i17 | i8;
        if (sk2Var.h(ki2Var)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i19 = i18 | i9;
        if (sk2Var.h(ki2Var2)) {
            i10 = 8388608;
        } else {
            i10 = 4194304;
        }
        int i20 = i19 | i10;
        if (sk2Var.h(ki2Var3)) {
            i11 = 67108864;
        } else {
            i11 = 33554432;
        }
        int i21 = i20 | i11;
        if (sk2Var.f(zy3Var)) {
            i12 = 536870912;
        } else {
            i12 = 268435456;
        }
        int i22 = i21 | i12;
        if ((i22 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (sk2Var.O(i22 & 1, z4)) {
            jd7 C = mj2.C(sk2Var);
            Context context2 = (Context) sk2Var.j(ue.b);
            fr5 b2 = gr5.b(8.0f);
            Object L = sk2Var.L();
            if (L == su0.a) {
                L = b31.f(sk2Var);
            }
            l14 l14Var = (l14) L;
            k24 a2 = bh7.a(l14Var, sk2Var, 6);
            if (((Boolean) io2.q(l14Var, sk2Var).getValue()).booleanValue()) {
                f2 = 0.96f;
            } else {
                f2 = 1.0f;
            }
            zy3 t = a53.t(b53.Y(sn2.L(o76.c(zy3Var, 1.0f), ((Number) wm.b(f2, ct3.P0(1.0f, 4000.0f, null, 4), "press", sk2Var, 3120, 20).getValue()).floatValue()), 12.0f, 1.0f), b2);
            boolean booleanValue = ((Boolean) a2.getValue()).booleanValue();
            wy3 wy3Var2 = wy3.a;
            if (booleanValue) {
                zy3Var2 = b53.z(3.0f, C.j, wy3Var2, b2);
            } else {
                zy3Var2 = wy3Var2;
            }
            zy3 Y = b53.Y(a53.v(t.f(zy3Var2), l14Var, false, ki2Var2, ki2Var, 444), 8.0f, 9.0f);
            i20 i20Var = y60.h0;
            lt ltVar = rt.a;
            sr5 a3 = rr5.a(ltVar, i20Var, sk2Var, 48);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, Y);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar4 = mu0.f;
            oo2.S(sk2Var, dnVar4, a3);
            dn dnVar5 = mu0.e;
            oo2.S(sk2Var, dnVar5, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar6 = mu0.g;
            oo2.S(sk2Var, dnVar6, valueOf);
            yd ydVar2 = mu0.h;
            oo2.P(sk2Var, ydVar2);
            dn dnVar7 = mu0.d;
            oo2.S(sk2Var, dnVar7, e0);
            zy3 t2 = a53.t(l07.p(o76.k(wy3Var2, 48.0f), 1.117904f), gr5.b(6.0f));
            j20 j20Var = y60.L;
            tv3 d2 = d50.d(j20Var, false);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, t2);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar4, d2);
            oo2.S(sk2Var, dnVar5, l3);
            b31.x(hashCode2, sk2Var, dnVar6, sk2Var, ydVar2);
            oo2.S(sk2Var, dnVar7, e02);
            long j3 = j2;
            f34.o(rg5Var, str2, str, o76.c, hi2.B(18), null, z, null, sk2Var, (i22 & 14) | 27648 | ((i22 >> 3) & 112) | ((i22 << 3) & 896) | ((i22 << 9) & 3670016), 160);
            sk2Var = sk2Var;
            sk2Var.p(true);
            cg2.k(sk2Var, o76.k(wy3Var2, 13.0f));
            if (1.0f <= 0.0d) {
                kz2.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            } else {
                f3 = 1.0f;
            }
            xg3 xg3Var = new xg3(f3, true);
            h20 h20Var = y60.j0;
            mt mtVar = rt.c;
            lr0 a4 = jr0.a(mtVar, h20Var, sk2Var, 0);
            int hashCode3 = Long.hashCode(sk2Var.T);
            sm4 l4 = sk2Var.l();
            zy3 e03 = l07.e0(sk2Var, xg3Var);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar4, a4);
            oo2.S(sk2Var, dnVar5, l4);
            b31.x(hashCode3, sk2Var, dnVar6, sk2Var, ydVar2);
            oo2.S(sk2Var, dnVar7, e03);
            sr5 a5 = rr5.a(ltVar, i20Var, sk2Var, 48);
            int hashCode4 = Long.hashCode(sk2Var.T);
            sm4 l5 = sk2Var.l();
            zy3 e04 = l07.e0(sk2Var, wy3Var2);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar4, a5);
            oo2.S(sk2Var, dnVar5, l5);
            b31.x(hashCode4, sk2Var, dnVar6, sk2Var, ydVar2);
            oo2.S(sk2Var, dnVar7, e04);
            String M = f34.M(rg5Var);
            long j4 = C.g;
            long B = hi2.B(14);
            long B2 = hi2.B(18);
            pe2 pe2Var2 = pe2.c0;
            if (1.0f <= 0.0d) {
                kz2.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f4 = Float.MAX_VALUE;
            } else {
                f4 = 1.0f;
            }
            ir6.b(M, new xg3(f4, false), j4, B, pe2Var2, null, 0L, null, B2, 2, false, 1, 0, null, null, sk2Var, 199680, 3126, 119760);
            if (rg5Var.k) {
                sk2Var.X(-1534901655);
                cg2.k(sk2Var, o76.k(wy3Var2, 6.0f));
                pe2Var = pe2Var2;
                ydVar = ydVar2;
                dnVar3 = dnVar7;
                dnVar2 = dnVar6;
                dnVar = dnVar4;
                ev2.a(jk2.C(), null, o76.h(wy3Var2, 13.0f), jd7.q, sk2Var, 3504, 0);
                sk2Var.p(false);
            } else {
                pe2Var = pe2Var2;
                dnVar = dnVar4;
                dnVar2 = dnVar6;
                dnVar3 = dnVar7;
                ydVar = ydVar2;
                sk2Var.X(-1534572032);
                sk2Var.p(false);
            }
            if (z3) {
                sk2Var.X(-1534518774);
                cg2.k(sk2Var, o76.k(wy3Var2, 4.0f));
                ev2.a(mh7.N(), null, o76.h(wy3Var2, 13.0f), jd7.p, sk2Var, 3504, 0);
                sk2Var.p(false);
            } else {
                sk2Var.X(-1534190112);
                sk2Var.p(false);
            }
            sk2Var.p(true);
            if (!zg6.B0(str5)) {
                S0 = str5;
            } else {
                ArrayList arrayList = new ArrayList();
                Date date = rg5Var.g;
                if (date != null) {
                    context = context2;
                    arrayList.add(context.getString(R.string.rom_last_played_format, DateUtils.getRelativeTimeSpanString(date.getTime(), System.currentTimeMillis(), 60000L).toString()));
                } else {
                    context = context2;
                }
                if (!im1.d(j3, 0L)) {
                    if (im1.d(j3, 0L)) {
                        str3 = "";
                        j3 = j3;
                    } else {
                        long k2 = im1.k(j3, om1.HOURS);
                        long k3 = im1.k(j3, om1.MINUTES);
                        j3 = j3;
                        long j5 = k3 % 60;
                        if (k2 >= 1) {
                            str3 = k2 + "h " + j5 + "m";
                        } else if (j5 >= 1) {
                            str3 = j5 + "m";
                        } else {
                            str3 = "<1m";
                        }
                    }
                    arrayList.add(context.getString(R.string.rom_total_play_time_format, str3));
                } else {
                    j3 = j3;
                }
                if (arrayList.isEmpty()) {
                    arrayList.add(rg5Var.c);
                }
                S0 = tq0.S0(arrayList, " • ", null, null, null, 62);
            }
            if (S0.length() > 0) {
                sk2Var.X(-1089388237);
                ir6.b(S0, b53.b0(wy3Var2, RecyclerView.A1, 2.0f, RecyclerView.A1, RecyclerView.A1, 13), C.i, hi2.B(12), null, null, 0L, null, hi2.B(15), 2, false, 1, 0, null, null, sk2Var, 3120, 3126, 119792);
                sk2Var.p(false);
            } else {
                sk2Var.X(-1089058180);
                sk2Var.p(false);
            }
            sk2Var.p(true);
            cg2.k(sk2Var, o76.k(wy3Var2, 8.0f));
            lr0 a6 = jr0.a(mtVar, y60.l0, sk2Var, 48);
            int hashCode5 = Long.hashCode(sk2Var.T);
            sm4 l6 = sk2Var.l();
            zy3 e05 = l07.e0(sk2Var, wy3Var2);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a6);
            oo2.S(sk2Var, dnVar5, l6);
            dn dnVar8 = dnVar2;
            yd ydVar3 = ydVar;
            b31.x(hashCode5, sk2Var, dnVar8, sk2Var, ydVar3);
            dn dnVar9 = dnVar3;
            oo2.S(sk2Var, dnVar9, e05);
            zy3 Y2 = b53.Y(dk7.i(a53.t(wy3Var2, gr5.b(4.0f)), C.d, iq2.g), 6.0f, 2.0f);
            tv3 d3 = d50.d(j20Var, false);
            int hashCode6 = Long.hashCode(sk2Var.T);
            sm4 l7 = sk2Var.l();
            zy3 e06 = l07.e0(sk2Var, Y2);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, d3);
            oo2.S(sk2Var, dnVar5, l7);
            b31.x(hashCode6, sk2Var, dnVar8, sk2Var, ydVar3);
            oo2.S(sk2Var, dnVar9, e06);
            if (rg5Var.h) {
                str4 = "DSiWARE";
            } else {
                str4 = "DS";
            }
            String str6 = str4;
            long j6 = C.h;
            ml2 ml2Var = td7.c;
            ir6.b(str6, null, j6, hi2.B(8), pe2Var, ml2Var, hi2.A(0.5d), null, hi2.B(9), 0, false, 0, 0, null, null, sk2Var, 14355456, 6, 129810);
            sk2Var.p(true);
            String B3 = f34.B(j3);
            if (B3.length() > 0) {
                sk2Var.X(1571388852);
                wy3Var = wy3Var2;
                ir6.b(B3, b53.b0(wy3Var2, RecyclerView.A1, 4.0f, RecyclerView.A1, RecyclerView.A1, 13), C.i, hi2.B(10), null, ml2Var, 0L, null, hi2.B(12), 0, false, 0, 0, null, null, sk2Var, 1575984, 6, 129968);
                sk2Var.p(false);
            } else {
                wy3Var = wy3Var2;
                sk2Var.X(1571678547);
                sk2Var.p(false);
            }
            sk2Var.p(true);
            if (z2) {
                sk2Var.X(2022033790);
                oo2.c(ki2Var3, o76.h(wy3Var, 34.0f), false, ct3.H0(178170693, new d4(C, 7), sk2Var), sk2Var, ((i22 >> 24) & 14) | 24624, 12);
                sk2Var = sk2Var;
                sk2Var.p(false);
            } else {
                sk2Var.X(2022441254);
                sk2Var.p(false);
            }
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new aj2(str, str2, z, z2, z3, ki2Var, ki2Var2, ki2Var3, zy3Var, i2) { // from class: fo5
                public final /* synthetic */ String B;
                public final /* synthetic */ String L;
                public final /* synthetic */ boolean R;
                public final /* synthetic */ boolean X;
                public final /* synthetic */ boolean Y;
                public final /* synthetic */ ki2 Z;
                public final /* synthetic */ ki2 c0;
                public final /* synthetic */ ki2 d0;
                public final /* synthetic */ zy3 e0;

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(1);
                    tq5.c(rg5.this, this.B, this.L, this.R, this.X, this.Y, this.Z, this.c0, this.d0, this.e0, (tu0) obj, I);
                    return o27.a;
                }
            };
        }
    }

    public static final mt3 d(Map map, tf6 tf6Var) {
        mt3 mt3Var = new mt3();
        ArrayList arrayList = tf6Var.Z;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            bg0 bg0Var = (bg0) obj;
            Surface surface = (Surface) map.get(new uf6(bg0Var.a));
            if (surface != null) {
                ArrayList arrayList2 = bg0Var.b;
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    mt3Var.put(new dg4(((sf6) obj2).a), surface);
                }
            }
        }
        return mt3Var.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [jc1, java.lang.Object, j11] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public static jc1 e(o31 o31Var, e31 e31Var, s31 s31Var, aj2 aj2Var, int i2) {
        ih3 ih3Var;
        if ((i2 & 1) != 0) {
            e31Var = mp1.A;
        }
        if ((i2 & 2) != 0) {
            s31Var = s31.DEFAULT;
        }
        e31 y = pu.y(o31Var, e31Var);
        if (s31Var.isLazy()) {
            ih3Var = new ih3(y, aj2Var);
        } else {
            ih3Var = new p0(y, true);
        }
        s31Var.invoke(aj2Var, ih3Var, ih3Var);
        return ih3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final zf4 g(bd0 bd0Var, tf6 tf6Var, Map map) {
        LinkedHashMap linkedHashMap;
        zf4 zf4Var;
        boolean z;
        String str;
        boolean z2;
        String str2;
        Surface surface;
        pw2 pw2Var;
        bg0 d2;
        bd0Var.getClass();
        String str3 = bd0Var.a;
        LinkedHashMap linkedHashMap2 = tf6Var.R;
        map.getClass();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        Iterator it = ((nt3) tf6Var.X.entrySet()).iterator();
        do {
            int i2 = 1;
            zf4 zf4Var2 = null;
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int i3 = ((uf6) entry.getKey()).a;
                pw2Var = (pw2) entry.getValue();
                d2 = tf6Var.d(i3);
                if (d2 == null) {
                    i.n("Required value was null.");
                    return null;
                }
            } else {
                ArrayList arrayList2 = tf6Var.Z;
                int size = arrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList2.get(i4);
                    i4++;
                    zf4 zf4Var3 = zf4Var2;
                    bg0 bg0Var = (bg0) obj;
                    ArrayList arrayList3 = bg0Var.b;
                    int i5 = bg0Var.a;
                    ArrayList arrayList4 = arrayList2;
                    if (arrayList3.size() == i2) {
                        Surface surface2 = (Surface) map.get(new uf6(i5));
                        if (surface2 != null) {
                            linkedHashMap4.put(new dg4(((sf6) tq0.e1(arrayList3)).a), surface2);
                        }
                        zf4Var2 = zf4Var3;
                        arrayList2 = arrayList4;
                    } else {
                        int size2 = arrayList3.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            Object obj2 = arrayList3.get(i6);
                            i6++;
                            int i7 = size2;
                            sf6 sf6Var = (sf6) obj2;
                            Object obj3 = linkedHashMap2.get(sf6Var);
                            if (obj3 != null) {
                                LinkedHashMap linkedHashMap6 = linkedHashMap2;
                                OutputConfiguration outputConfiguration = (OutputConfiguration) linkedHashMap5.get((rf6) obj3);
                                if (outputConfiguration != null) {
                                    surface = outputConfiguration.getSurface();
                                } else {
                                    surface = (Surface) map.get(new uf6(i5));
                                }
                                if (surface != null) {
                                    linkedHashMap4.put(new dg4(sf6Var.a), surface);
                                    size = size;
                                }
                                size2 = i7;
                                linkedHashMap2 = linkedHashMap6;
                            } else {
                                i.n("Required value was null.");
                                return zf4Var3;
                            }
                        }
                        zf4Var2 = zf4Var3;
                        arrayList2 = arrayList4;
                        i2 = 1;
                    }
                }
                zf4 zf4Var4 = zf4Var2;
                Iterator it2 = tf6Var.L.iterator();
                zf4 zf4Var5 = zf4Var4;
                while (it2.hasNext()) {
                    rf6 rf6Var = (rf6) it2.next();
                    ArrayList arrayList5 = rf6Var.l;
                    ArrayList arrayList6 = rf6Var.l;
                    List list = rf6Var.k;
                    sn1 sn1Var = rf6Var.f;
                    Integer num = rf6Var.e;
                    Iterator it3 = it2;
                    String str4 = rf6Var.d;
                    ArrayList arrayList7 = new ArrayList();
                    int size3 = arrayList5.size();
                    int i8 = 0;
                    while (i8 < size3) {
                        Object obj4 = arrayList5.get(i8);
                        int i9 = i8 + 1;
                        int i10 = size3;
                        Surface surface3 = (Surface) map.get(new uf6(((bg0) obj4).a));
                        if (surface3 != null) {
                            arrayList7.add(surface3);
                        }
                        i8 = i9;
                        size3 = i10;
                    }
                    OutputConfiguration outputConfiguration2 = (OutputConfiguration) linkedHashMap5.get(rf6Var);
                    LinkedHashMap linkedHashMap7 = linkedHashMap5;
                    if (outputConfiguration2 != null) {
                        if (arrayList7.size() == arrayList5.size()) {
                            arrayList.add(new li(outputConfiguration2));
                            linkedHashMap = linkedHashMap4;
                            zf4Var = zf4Var5;
                        } else {
                            ArrayList arrayList8 = new ArrayList();
                            int size4 = arrayList5.size();
                            int i11 = 0;
                            while (i11 < size4) {
                                Object obj5 = arrayList5.get(i11);
                                i11++;
                                if (!map.containsKey(new uf6(((bg0) obj5).a))) {
                                    arrayList8.add(obj5);
                                }
                            }
                            throw new IllegalStateException(("Surfaces are not yet available for " + rf6Var + "! Missing surfaces for " + arrayList8 + '!').toString());
                        }
                    } else {
                        int i12 = -1;
                        if (sn1Var != null) {
                            linkedHashMap = linkedHashMap4;
                            zf4Var = zf4Var5;
                            if (arrayList7.size() != arrayList5.size()) {
                                Size size5 = rf6Var.b;
                                og4 og4Var = rf6Var.g;
                                ng4 ng4Var = rf6Var.h;
                                pg4 pg4Var = rf6Var.i;
                                if (arrayList6.size() > 1) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (num != null) {
                                    i12 = num.intValue();
                                }
                                int i13 = i12;
                                if (!b53.x(str4, str3)) {
                                    str2 = str4;
                                } else {
                                    str2 = zf4Var4;
                                }
                                li n2 = y60.n(null, null, sn1Var, og4Var, ng4Var, pg4Var, list, size5, z2, i13, str2, 2);
                                if (n2 == null) {
                                    Log.w("CXCP", "Failed to create AndroidOutputConfiguration for " + rf6Var);
                                } else {
                                    arrayList.add(n2);
                                    int size6 = arrayList5.size();
                                    int i14 = 0;
                                    while (i14 < size6) {
                                        Object obj6 = arrayList5.get(i14);
                                        i14++;
                                        linkedHashMap3.put(new uf6(((bg0) obj6).a), n2);
                                    }
                                }
                            }
                        } else {
                            linkedHashMap = linkedHashMap4;
                            zf4Var = zf4Var5;
                        }
                        if (arrayList7.size() == arrayList5.size()) {
                            Surface surface4 = (Surface) tq0.K0(arrayList7);
                            og4 og4Var2 = rf6Var.g;
                            ng4 ng4Var2 = rf6Var.h;
                            pg4 pg4Var2 = rf6Var.i;
                            Size size7 = rf6Var.b;
                            if (arrayList6.size() > 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (num != null) {
                                i12 = num.intValue();
                            }
                            int i15 = i12;
                            if (!b53.x(str4, str3)) {
                                str = str4;
                            } else {
                                str = zf4Var4;
                            }
                            li n3 = y60.n(surface4, null, null, og4Var2, ng4Var2, pg4Var2, list, size7, z, i15, str, 6);
                            if (n3 == 0) {
                                Log.w("CXCP", "Failed to create AndroidOutputConfiguration for " + rf6Var);
                            } else {
                                for (Surface surface5 : tq0.G0(1, arrayList7)) {
                                    n3.a(surface5);
                                }
                                ag0 ag0Var = bd0Var.e;
                                if (ag0Var != null) {
                                    bg0 bg0Var2 = (bg0) tf6Var.B.get(ag0Var);
                                    if (bg0Var2 != null) {
                                        if (zf4Var == null && arrayList5.contains(bg0Var2)) {
                                            zf4Var5 = n3;
                                            it2 = it3;
                                            linkedHashMap5 = linkedHashMap7;
                                            linkedHashMap4 = linkedHashMap;
                                        } else {
                                            arrayList.add(n3);
                                        }
                                    } else {
                                        i.n("Postview Stream in StreamGraph cannot be null for reprocessing request");
                                        return zf4Var4;
                                    }
                                } else {
                                    arrayList.add(n3);
                                }
                                it2 = it3;
                                linkedHashMap5 = linkedHashMap7;
                                linkedHashMap4 = linkedHashMap;
                                zf4Var5 = zf4Var;
                            }
                        } else {
                            ArrayList arrayList9 = new ArrayList();
                            int size8 = arrayList5.size();
                            int i16 = 0;
                            while (i16 < size8) {
                                Object obj7 = arrayList5.get(i16);
                                i16++;
                                if (!map.containsKey(new uf6(((bg0) obj7).a))) {
                                    arrayList9.add(obj7);
                                }
                            }
                            throw new IllegalStateException(("Surfaces are not yet available for " + rf6Var + "! Missing surfaces for " + arrayList9 + '!').toString());
                        }
                    }
                    it2 = it3;
                    linkedHashMap5 = linkedHashMap7;
                    linkedHashMap4 = linkedHashMap;
                    zf4Var5 = zf4Var;
                }
                return new zf4(arrayList, linkedHashMap3, zf4Var5, linkedHashMap4);
            }
        } while (d2.b.size() == 1);
        if (Build.VERSION.SDK_INT < 31) {
            i.i("Cannot configure multiple outputs pre-S!");
            return null;
        }
        q75.a(ii.class);
        pw2Var.getClass();
        throw null;
    }

    public static final boolean h(ArrayList arrayList) {
        List list;
        long j2;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = pp1.A;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    iz5 iz5Var = (iz5) obj2;
                    iz5 iz5Var2 = (iz5) obj;
                    arrayList2.add(new mb4((Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (iz5Var2.g().b() >> 32)) - Float.intBitsToFloat((int) (iz5Var.g().b() >> 32)))) << 32) | (Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (iz5Var2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (iz5Var.g().b() & 4294967295L)))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j2 = ((mb4) tq0.K0(list)).a;
            } else {
                if (list.isEmpty()) {
                    dq3.c("Empty collection can't be reduced.");
                }
                Object K0 = tq0.K0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        K0 = new mb4(mb4.e(((mb4) K0).a, ((mb4) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j2 = ((mb4) K0).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j2)) >= Float.intBitsToFloat((int) (j2 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static rh i(Surface surface, int i2, pf6 pf6Var, Handler handler) {
        ImageWriter newInstance;
        handler.getClass();
        int i3 = Build.VERSION.SDK_INT;
        int i4 = pf6Var.a;
        if (i3 >= 29) {
            newInstance = ImageWriter.newInstance(surface, 1, i4);
            newInstance.getClass();
        } else {
            Log.w("CXCP", "Ignoring format (" + ((Object) pf6.b(i4)) + ") for " + ((Object) ("Input-" + i2)) + ". Android " + i3 + " does not support creating ImageWriters with formats. This may lead to unexpected behaviors.");
            newInstance = ImageWriter.newInstance(surface, 1);
            newInstance.getClass();
        }
        rh rhVar = new rh(newInstance, i2);
        newInstance.setOnImageReleasedListener(rhVar, handler);
        return rhVar;
    }

    public static int k(int i2, int i3, String str, boolean z) {
        boolean z2;
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if ((charAt >= ' ' || charAt == '\t') && charAt < 127 && (('0' > charAt || charAt >= ':') && (('a' > charAt || charAt >= '{') && (('A' > charAt || charAt >= '[') && charAt != ':')))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final int l(View view, int i2) {
        int i3 = 0;
        int i4 = Preference.DEFAULT_ORDER;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i2);
            if (tag != null) {
                if (obj == null) {
                    obj = tag;
                } else if (!tag.equals(obj)) {
                    break;
                }
                i4 = i3;
            }
            i3++;
            ViewParent z = hk2.z(view);
            if (z instanceof View) {
                view = (View) z;
            } else {
                view = null;
            }
        }
        return i4;
    }

    public static final View m(View view) {
        View view2;
        if (view.isAttachedToWindow()) {
            int min = Math.min(l(view, R.id.view_tree_lifecycle_owner), l(view, R.id.view_tree_saved_state_registry_owner));
            View view3 = view;
            int i2 = 0;
            View view4 = view3;
            while (view != null) {
                if (i2 == min) {
                    if (!(view.getParent() instanceof ViewGroup)) {
                        return view3;
                    }
                } else if (o(view) == null) {
                    i2++;
                    ViewParent z = hk2.z(view);
                    if (z instanceof View) {
                        view2 = (View) z;
                    } else {
                        view2 = null;
                    }
                    View view5 = view3;
                    view3 = view;
                    view = view2;
                    view4 = view5;
                }
                return view;
            }
            return view4;
        }
        return view;
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, zo3] */
    public static void n(ArrayList arrayList, SpannableStringBuilder spannableStringBuilder, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter) {
        boolean z;
        Matcher matcher = pattern.matcher(spannableStringBuilder);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if ((matchFilter == null || matchFilter.acceptMatch(spannableStringBuilder, start, end)) && group != null) {
                ?? obj = new Object();
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        String str = strArr[i2];
                        if (group.regionMatches(true, 0, str, 0, str.length())) {
                            z = true;
                            if (!group.regionMatches(false, 0, str, 0, str.length())) {
                                group = str.concat(group.substring(str.length()));
                            }
                        } else {
                            i2++;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z && strArr.length > 0) {
                    group = b31.q(new StringBuilder(), strArr[0], group);
                }
                obj.b = group;
                obj.c = start;
                obj.d = end;
                arrayList.add(obj);
            }
        }
    }

    public static final qu0 o(View view) {
        WeakReference weakReference;
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        if (tag instanceof WeakReference) {
            weakReference = (WeakReference) tag;
        } else {
            weakReference = null;
        }
        if (weakReference == null) {
            return null;
        }
        return (qu0) weakReference.get();
    }

    public static final int p(String str) {
        int y0;
        char c2 = File.separatorChar;
        int y02 = zg6.y0(c2, 0, 4, str);
        if (y02 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c2 || (y0 = zg6.y0(c2, 2, 4, str)) < 0) {
                return 1;
            }
            int y03 = zg6.y0(c2, y0 + 1, 4, str);
            if (y03 >= 0) {
                return y03 + 1;
            }
            return str.length();
        } else if (y02 > 0 && str.charAt(y02 - 1) == ':') {
            return y02 + 1;
        } else {
            if (y02 != -1 || !zg6.t0(str, ':')) {
                return 0;
            }
            return str.length();
        }
    }

    public static final zy3 q(zy3 zy3Var, mi2 mi2Var) {
        return zy3Var.f(new e30(mi2Var));
    }

    public static final zy3 r(zy3 zy3Var, float f2, float f3, float f4, long j2, y26 y26Var, boolean z, long j3, long j4) {
        return zy3Var.f(new qn2(f2, f3, f4, j2, y26Var, z, j3, j4));
    }

    public static zy3 s(zy3 zy3Var, float f2, float f3, float f4, y26 y26Var, int i2) {
        float f5;
        float f6;
        float f7;
        is2 is2Var;
        boolean z;
        if ((i2 & 1) != 0) {
            f5 = 1.0f;
        } else {
            f5 = f2;
        }
        if ((i2 & 2) != 0) {
            f6 = 1.0f;
        } else {
            f6 = f3;
        }
        if ((i2 & 4) != 0) {
            f7 = 1.0f;
        } else {
            f7 = f4;
        }
        long j2 = sw6.b;
        if ((i2 & 2048) != 0) {
            is2Var = iq2.g;
        } else {
            is2Var = y26Var;
        }
        if ((i2 & 4096) != 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z;
        long j3 = un2.a;
        return r(zy3Var, f5, f6, f7, j2, is2Var, z2, j3, j3);
    }

    public static Object u(Object obj, Method method, Object[] objArr) {
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        Constructor constructor = s;
        if (constructor == null) {
            constructor = rx.f().getDeclaredConstructor(Class.class, Integer.TYPE);
            constructor.setAccessible(true);
            s = constructor;
        }
        unreflectSpecial = rx.j(constructor.newInstance(tl2.class, -1)).unreflectSpecial(method, tl2.class);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        return invokeWithArguments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, j11, kd6] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static final kd6 v(o31 o31Var, e31 e31Var, s31 s31Var, aj2 aj2Var) {
        tk3 tk3Var;
        e31 y = pu.y(o31Var, e31Var);
        if (s31Var.isLazy()) {
            tk3Var = new tk3(y, aj2Var);
        } else {
            tk3Var = new p0(y, true);
        }
        s31Var.invoke(aj2Var, tk3Var, tk3Var);
        return tk3Var;
    }

    public static /* synthetic */ kd6 w(o31 o31Var, e31 e31Var, s31 s31Var, aj2 aj2Var, int i2) {
        if ((i2 & 1) != 0) {
            e31Var = mp1.A;
        }
        if ((i2 & 2) != 0) {
            s31Var = s31.DEFAULT;
        }
        return v(o31Var, e31Var, s31Var, aj2Var);
    }

    public static void x(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    public static long y(int i2, String str) {
        int k2 = k(0, i2, str, false);
        Matcher matcher = u11.n.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (k2 < i2) {
            int k3 = k(k2 + 1, i2, str, true);
            matcher.region(k2, k3);
            if (i4 == -1 && matcher.usePattern(u11.n).matches()) {
                String group = matcher.group(1);
                group.getClass();
                i4 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                group2.getClass();
                i7 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                group3.getClass();
                i8 = Integer.parseInt(group3);
            } else if (i5 == -1 && matcher.usePattern(u11.m).matches()) {
                String group4 = matcher.group(1);
                group4.getClass();
                i5 = Integer.parseInt(group4);
            } else {
                if (i6 == -1) {
                    Pattern pattern = u11.l;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        group5.getClass();
                        Locale locale = Locale.US;
                        locale.getClass();
                        String lowerCase = group5.toLowerCase(locale);
                        lowerCase.getClass();
                        String pattern2 = pattern.pattern();
                        pattern2.getClass();
                        i6 = zg6.z0(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(u11.k).matches()) {
                    String group6 = matcher.group(1);
                    group6.getClass();
                    i3 = Integer.parseInt(group6);
                }
            }
            k2 = k(k3 + 1, i2, str, false);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 >= 1601) {
            if (i6 != -1) {
                if (1 <= i5 && i5 < 32) {
                    if (i4 >= 0 && i4 < 24) {
                        if (i7 >= 0 && i7 < 60) {
                            if (i8 >= 0 && i8 < 60) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(ik7.a);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i3);
                                gregorianCalendar.set(2, i6 - 1);
                                gregorianCalendar.set(5, i5);
                                gregorianCalendar.set(11, i4);
                                gregorianCalendar.set(12, i7);
                                gregorianCalendar.set(13, i8);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            i.i("Failed requirement.");
                            return 0L;
                        }
                        i.i("Failed requirement.");
                        return 0L;
                    }
                    i.i("Failed requirement.");
                    return 0L;
                }
                i.i("Failed requirement.");
                return 0L;
            }
            i.i("Failed requirement.");
            return 0L;
        }
        i.i("Failed requirement.");
        return 0L;
    }

    public static final gt3 z(a9 a9Var, mi2 mi2Var, tu0 tu0Var, int i2) {
        a9 a9Var2;
        me2.L(a9Var, tu0Var);
        k24 L = me2.L(mi2Var, tu0Var);
        Object[] objArr = new Object[0];
        sk2 sk2Var = (sk2) tu0Var;
        Object L2 = sk2Var.L();
        sn1 sn1Var = su0.a;
        if (L2 == sn1Var) {
            L2 = new d5(6);
            sk2Var.h0(L2);
        }
        String str = (String) jk2.M(objArr, (ki2) L2, sk2Var, 48);
        k9 k9Var = (k9) sk2Var.j(wq3.a);
        if (k9Var == null) {
            sk2Var.X(1213380307);
            Context context = (Context) sk2Var.j(ue.b);
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof k9) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                    break;
                }
            }
            k9Var = (k9) context;
        } else {
            sk2Var.X(1213379439);
        }
        sk2Var.p(false);
        if (k9Var != null) {
            i9 l2 = k9Var.l();
            Object L3 = sk2Var.L();
            if (L3 == sn1Var) {
                L3 = new Object();
                sk2Var.h0(L3);
            }
            d9 d9Var = (d9) L3;
            Object L4 = sk2Var.L();
            if (L4 == sn1Var) {
                L4 = new gt3(d9Var);
                sk2Var.h0(L4);
            }
            gt3 gt3Var = (gt3) L4;
            boolean h2 = sk2Var.h(d9Var) | sk2Var.h(l2) | sk2Var.f(str) | sk2Var.h(a9Var) | sk2Var.f(L);
            Object L5 = sk2Var.L();
            if (!h2 && L5 != sn1Var) {
                a9Var2 = a9Var;
            } else {
                a9Var2 = a9Var;
                L5 = new e5(d9Var, l2, str, a9Var2, L, 1);
                sk2Var.h0(L5);
            }
            mi2 mi2Var2 = (mi2) L5;
            boolean f2 = sk2Var.f(l2) | sk2Var.f(str) | sk2Var.f(a9Var2);
            Object L6 = sk2Var.L();
            if (f2 || L6 == sn1Var) {
                L6 = new ah1(mi2Var2);
                sk2Var.h0(L6);
            }
            ah1 ah1Var = (ah1) L6;
            return gt3Var;
        }
        i.n("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        return null;
    }

    public abstract void f(ns5 ns5Var, Object obj);

    public abstract String j();

    public void t(ls5 ls5Var, Object obj) {
        ls5Var.getClass();
        if (obj == null) {
            return;
        }
        ns5 i0 = ls5Var.i0(j());
        try {
            f(i0, obj);
            i0.a0();
            iq2.h(i0, null);
            cg2.I(ls5Var);
        } finally {
        }
    }
}
