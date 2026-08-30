package l0;

import a1.z0;
import a4.n;
import a4.v;
import a7.a0;
import a7.x;
import a9.k;
import ah.l0;
import ai.y0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b4.b3;
import b4.e2;
import b4.q1;
import b4.r0;
import b4.t1;
import b7.i;
import c1.e0;
import c1.w0;
import d1.i0;
import f2.b1;
import f2.c1;
import f2.x0;
import h1.x2;
import i3.z;
import j0.l1;
import java.io.Closeable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l4.n0;
import l4.o0;
import l4.q0;
import m9.o;
import n1.p;
import n1.q;
import n2.f1;
import n2.l;
import n2.p1;
import n2.r;
import n2.s;
import o2.k0;
import p7.m;
import p7.t;
import u1.k1;
import u1.p0;
import u1.v0;
import v3.c0;
import w4.j;
import yb.y;
import zc.g0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class f implements t.a {
    public static volatile d A = null;
    public static final /* synthetic */ int B = 0;
    public static boolean L = true;
    public static Field R;
    public static boolean X;
    public static final /* synthetic */ int Y = 0;
    public static o3.f Z;

    /* renamed from: b0  reason: collision with root package name */
    public static final /* synthetic */ int f8489b0 = 0;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashSet A(java.lang.String[] r8) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r8.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L4a
            r3 = r8[r2]
            java.lang.String r4 = "QuirkSettingsLoader"
            java.lang.Class r5 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.Class<j0.k1> r6 = j0.k1.class
            boolean r6 = r6.isAssignableFrom(r5)     // Catch: java.lang.ClassNotFoundException -> L2f
            if (r6 == 0) goto L1a
            goto L42
        L1a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L2f
            r5.<init>()     // Catch: java.lang.ClassNotFoundException -> L2f
            r5.append(r3)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.String r6 = " does not implement the Quirk interface."
            r5.append(r6)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.ClassNotFoundException -> L2f
            aj.g.y0(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L2f
            goto L41
        L2f:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Class not found: "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            aj.g.z0(r4, r3, r5)
        L41:
            r5 = 0
        L42:
            if (r5 == 0) goto L47
            r0.add(r5)
        L47:
            int r2 = r2 + 1
            goto L7
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.f.A(java.lang.String[]):java.util.HashSet");
    }

    public static void B(Runnable runnable) {
        if (t()) {
            runnable.run();
        } else {
            m.o("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }

    public static final void C(k0 k0Var, int i2, Object obj) {
        k0Var.f10648h[(k0Var.f10649i - k0Var.f10644d[k0Var.f10645e - 1].f4507c) + i2] = obj;
    }

    public static final void D(k0 k0Var, int i2, Object obj, int i10, Object obj2) {
        int i11 = k0Var.f10649i - k0Var.f10644d[k0Var.f10645e - 1].f4507c;
        Object[] objArr = k0Var.f10648h;
        objArr[i2 + i11] = obj;
        objArr[i11 + i10] = obj2;
    }

    public static final void F(View view, boolean z10) {
        view.getClass();
        view.setEnabled(z10);
        if (view instanceof ViewGroup) {
            z0 z0Var = new z0(1, (ViewGroup) view);
            while (z0Var.hasNext()) {
                F((View) z0Var.next(), z10);
            }
        }
    }

    public static final String[] G(n2.m mVar, int i2) {
        return ((Resources) ((r) mVar).j(r0.f1938c)).getStringArray(i2);
    }

    public static final String H(int i2, Object[] objArr, n2.m mVar) {
        return ((Resources) ((r) mVar).j(r0.f1938c)).getString(i2, Arrays.copyOf(objArr, objArr.length));
    }

    public static final String I(n2.m mVar, int i2) {
        return ((Resources) ((r) mVar).j(r0.f1938c)).getString(i2);
    }

    public static int J(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i2});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public static final int K(p pVar) {
        ?? r02 = pVar.f9810k;
        if (r02.isEmpty()) {
            return 0;
        }
        int size = r02.size();
        int i2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i2 += ((q) r02.get(i10)).m;
        }
        return (i2 / r02.size()) + pVar.f9815q;
    }

    public static final void a(b3.p pVar, Object obj, n nVar, mc.q qVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        r rVar = (r) mVar;
        rVar.Z(839314201);
        if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i2;
        } else {
            i10 = i2;
        }
        if (rVar.h(obj)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i10 | i11;
        if (rVar.f(nVar)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i15 = i14 | i12;
        boolean z11 = true;
        if ((i15 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i15 & 1, z10)) {
            if ((i15 & 896) != 256) {
                z11 = false;
            }
            Object L2 = rVar.L();
            if (z11 || L2 == l.f9953a) {
                L2 = new k(8, null, nVar);
                rVar.h0(L2);
            }
            s.g(y.f14813a, (mc.p) L2, rVar);
            e0.b((i0) nVar.L, null, w0.d(null, 3).a(w0.i(null, 3)).a(w0.c(9)), w0.e(null, 3).a(w0.j(null, 3)).a(w0.g(d1.d.r(0, 300, null, 5), 12)), null, v2.h.c(-988010687, new g1.d(nVar, pVar, obj, qVar), rVar), rVar, 199680);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new y0(pVar, obj, nVar, qVar, i2, 4);
        }
    }

    public static final void b(boolean z10, j jVar, b1 b1Var, n2.m mVar, int i2) {
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j2;
        k1 d4;
        int i11;
        int i12;
        int i13;
        r rVar = (r) mVar;
        rVar.Z(-1344558920);
        if ((i2 & 6) == 0) {
            if (rVar.g(z10)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.d(jVar.ordinal())) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i2 & 384) == 0) {
            if (rVar.h(b1Var)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i10 |= i11;
        }
        if ((i10 & 147) != 146) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i10 & 1, z11)) {
            int i14 = i10 & 14;
            if (i14 == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean f8 = z12 | rVar.f(b1Var);
            Object L2 = rVar.L();
            n2.e eVar = l.f9953a;
            if (f8 || L2 == eVar) {
                L2 = new x0(b1Var, z10);
                rVar.h0(L2);
            }
            v0 v0Var = (v0) L2;
            boolean h2 = rVar.h(b1Var);
            if (i14 == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z14 = z13 | h2;
            Object L3 = rVar.L();
            if (z14 || L3 == eVar) {
                L3 = new c1(b1Var, z10);
                rVar.h0(L3);
            }
            f2.m mVar2 = (f2.m) L3;
            boolean g10 = q0.g(b1Var.n().f12277b);
            if (z10) {
                j2 = b1Var.n().f12277b >> 32;
            } else {
                j2 = b1Var.n().f12277b & 4294967295L;
            }
            int i15 = (int) j2;
            p0 p0Var = b1Var.f4709d;
            float f10 = 0.0f;
            if (p0Var != null && (d4 = p0Var.d()) != null) {
                o0 o0Var = d4.f13358a;
                if (i15 >= 0) {
                    n0 n0Var = o0Var.f8865a;
                    l4.q qVar = o0Var.f8866b;
                    if (n0Var.f8853a.B.length() != 0) {
                        int min = Math.min(qVar.d(i15), Math.min(qVar.f8876b - 1, qVar.f8880f - 1));
                        if (i15 <= qVar.c(min, false)) {
                            qVar.m(min);
                            ArrayList arrayList = qVar.f8882h;
                            l4.s sVar = (l4.s) arrayList.get(l4.i0.e(min, arrayList));
                            l4.b bVar = sVar.f8890a;
                            int i16 = min - sVar.f8893d;
                            m4.k kVar = bVar.f8783d;
                            f10 = kVar.e(i16) - kVar.g(i16);
                        }
                    }
                }
            }
            float f11 = f10;
            boolean h10 = rVar.h(v0Var);
            Object L4 = rVar.L();
            if (h10 || L4 == eVar) {
                L4 = new a2.h(5, v0Var);
                rVar.h0(L4);
            }
            pc.a.i(mVar2, z10, jVar, g10, 0L, f11, c0.a(b3.m.f1770a, v0Var, (PointerInputEventHandler) L4), rVar, (i10 << 3) & 1008);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new f2.g(z10, jVar, b1Var, i2);
        }
    }

    public static final boolean c(e3.f fVar, long j2) {
        if (fVar.A.f1777h0) {
            v vVar = a4.l.t(fVar).A0.f265c;
            if (vVar.N0.f1777h0) {
                long a02 = vVar.a0(0L);
                float intBitsToFloat = Float.intBitsToFloat((int) (a02 >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (a02 & 4294967295L));
                long j10 = fVar.f4257k0;
                float f8 = ((int) (j10 >> 32)) + intBitsToFloat;
                float f10 = ((int) (j10 & 4294967295L)) + intBitsToFloat2;
                float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
                if (intBitsToFloat <= intBitsToFloat3 && intBitsToFloat3 <= f8) {
                    float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
                    if (intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f10) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static l1 d(Context context, Bundle bundle) {
        boolean z10 = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] w10 = w(context, "androidx.camera.core.quirks.FORCE_ENABLED", bundle);
        String[] w11 = w(context, "androidx.camera.core.quirks.FORCE_DISABLED", bundle);
        aj.g.o("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        aj.g.o("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z10);
        aj.g.o("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(w10));
        aj.g.o("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(w11));
        return new l1(z10, new HashSet(A(w10)), new HashSet(A(w11)));
    }

    public static void e() {
        m.o("Not in application's main thread", t());
    }

    public static final void f(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                t.a(th2, th3);
            }
        }
    }

    public static final void g(a0 a0Var, nc.e eVar, Map map, v2.c cVar) {
        a7.n0 n0Var = a0Var.f545g;
        n0Var.getClass();
        a0Var.f547i.add(new b7.j((i) n0Var.b(pc.a.y(i.class)), eVar, map, cVar).a());
    }

    public static final p4.e h(Context context) {
        int i2;
        l7.a aVar = new l7.a(8);
        context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 31) {
            i2 = p4.k.f11313a.a(context);
        } else {
            i2 = 0;
        }
        return new p4.e(aVar, new p4.a(i2));
    }

    public static final long i() {
        return Thread.currentThread().getId();
    }

    public static final m2.f j(n2.m mVar, int i2) {
        boolean z10;
        i8.a n10;
        j8.b bVar;
        t1 t1Var;
        boolean z11 = false;
        if ((i2 & 1) != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        r rVar = (r) mVar;
        rVar.X(280825064);
        x4.c cVar = (x4.c) rVar.j(q1.f1919h);
        e2 e2Var = (e2) ((b3) rVar.j(q1.f1930t));
        if (e2Var.f1840b == null) {
            mc.a aVar = e2Var.f1839a;
            if (aVar == null || (t1Var = (t1) aVar.b()) == null) {
                t1Var = t1.f1947c;
            }
            e2Var.f1840b = s.w(t1Var);
            e2Var.f1839a = null;
        }
        f1 f1Var = e2Var.f1840b;
        f1Var.getClass();
        long t5 = cVar.t(zb.k.T(((t1) f1Var.getValue()).f1948a));
        rVar.p(false);
        if (z10) {
            int i10 = i8.a.f7027c;
            n10 = pc.a.n(t5, m2.c.f9190b, m2.b.f9188a);
        } else {
            int i11 = i8.a.f7027c;
            n10 = pc.a.n(t5, m2.c.f9189a, m2.b.f9188a);
        }
        Context context = (Context) rVar.j(r0.f1937b);
        boolean f8 = rVar.f(context);
        Object L2 = rVar.L();
        if (f8 || L2 == l.f9953a) {
            j8.g.f7773a.getClass();
            cd.c h2 = cd.q.h(new x2(j8.f.a(context), context, null, 2));
            gd.f fVar = g0.f15015a;
            L2 = new l0(cd.q.t(h2, ed.n.f4465a), 9);
            rVar.h0(L2);
        }
        j8.b bVar2 = j8.b.f7755e;
        ArrayList arrayList = new ArrayList();
        for (j8.c cVar2 : (List) s.l((cd.h) L2, zb.q.A, null, rVar, 48, 2).getValue()) {
            j8.b a10 = cVar2.a();
            h8.b bVar3 = cVar2.f7764a;
            j8.b bVar4 = cVar2.f7766c;
            if (a10.equals(j8.b.f7757g) && bVar4.equals(j8.b.f7759i)) {
                z11 = true;
            }
            h3.c A2 = z.A(bVar3.c());
            boolean equals = bVar4.equals(j8.b.f7758h);
            boolean equals2 = cVar2.a().equals(j8.b.f7756f);
            boolean b10 = cVar2.b();
            if (bVar3.b() != 0 && bVar3.a() != 0) {
                bVar = bVar2;
            } else {
                bVar = j8.b.f7754d;
            }
            arrayList.add(new m2.d(A2, equals, equals2, b10, bVar.equals(bVar2)));
        }
        return new m2.f(n10, new m2.e(arrayList, z11));
    }

    public static x k(a7.z zVar) {
        Iterator it = uc.h.J(zVar, new a7.a(6)).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return (x) next;
        }
        o.x("Sequence is empty.");
        return null;
    }

    public static int l(Context context, int i2, int i10) {
        Integer num;
        int i11;
        TypedValue I = k0.d.I(context, i2);
        if (I != null) {
            int i12 = I.resourceId;
            if (i12 != 0) {
                i11 = context.getColor(i12);
            } else {
                i11 = I.data;
            }
            num = Integer.valueOf(i11);
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return i10;
    }

    public static int m(View view, int i2) {
        Context context = view.getContext();
        TypedValue K = k0.d.K(view.getContext(), i2, view.getClass().getCanonicalName());
        int i10 = K.resourceId;
        if (i10 != 0) {
            return context.getColor(i10);
        }
        return K.data;
    }

    public static ColorStateList n(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT >= 29 && e4.a.l(drawable)) {
            colorStateList = e4.a.f(drawable).getColorStateList();
            return colorStateList;
        }
        return null;
    }

    public static Set o() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set<Object> set = (Set) invoke;
            for (Object obj : set) {
                if (!(obj instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static boolean q(int i2) {
        double pow;
        double pow2;
        double pow3;
        if (i2 != 0) {
            ThreadLocal threadLocal = q5.a.f12281a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i2);
            int green = Color.green(i2);
            int blue = Color.blue(i2);
            if (dArr.length == 3) {
                double d4 = red / 255.0d;
                if (d4 < 0.04045d) {
                    pow = d4 / 12.92d;
                } else {
                    pow = Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
                }
                double d10 = green / 255.0d;
                if (d10 < 0.04045d) {
                    pow2 = d10 / 12.92d;
                } else {
                    pow2 = Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
                }
                double d11 = blue / 255.0d;
                if (d11 < 0.04045d) {
                    pow3 = d11 / 12.92d;
                } else {
                    pow3 = Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
                }
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d12 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[1] = d12;
                double d13 = pow3 * 0.9505d;
                dArr[2] = (d13 + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d12 / 100.0d <= 0.5d) {
                    return false;
                }
                return true;
            }
            a0.j.h("outXyz must have a length of 3.");
            return false;
        }
        return false;
    }

    public static boolean r(Context context) {
        boolean z10;
        ((rd.g) ((hb.a) pc.a.u(context, hb.a.class))).getClass();
        Set set = Collections.EMPTY_SET;
        if (set.size() <= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        aj.g.l(z10, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (set.isEmpty()) {
            return true;
        }
        return ((Boolean) set.iterator().next()).booleanValue();
    }

    public static boolean s(MotionEvent motionEvent, int i2) {
        if ((motionEvent.getSource() & i2) == i2) {
            return true;
        }
        return false;
    }

    public static boolean t() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static int u(float f8, int i2, int i10) {
        return q5.a.b(q5.a.d(i10, Math.round(Color.alpha(i10) * f8)), i2);
    }

    public static final long v(float f8, long j2, long j10) {
        return (Float.floatToRawIntBits(p7.l.w(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j10 >> 32)), f8)) << 32) | (Float.floatToRawIntBits(p7.l.w(Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j10 & 4294967295L)), f8)) & 4294967295L);
    }

    public static String[] w(Context context, String str, Bundle bundle) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i2 = bundle.getInt(str, -1);
        if (i2 == -1) {
            aj.g.y0("QuirkSettingsLoader", "Resource ID not found for key: ".concat(str));
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i2);
        } catch (Resources.NotFoundException e6) {
            aj.g.z0("QuirkSettingsLoader", "Quirk class names resource not found: " + i2, e6);
            return new String[0];
        }
    }

    public static oe.z z(qc.e eVar) {
        if (eVar == null) {
            eVar = p7.n.a(System.nanoTime());
        }
        return new oe.z(zb.l.e0(oe.z.f10965b, zb.l.p0(new yb.q(eVar.c(new byte[3])))));
    }

    public void E(View view, float f8) {
        if (L) {
            try {
                view.setTransitionAlpha(f8);
                return;
            } catch (NoSuchMethodError unused) {
                L = false;
            }
        }
        view.setAlpha(f8);
    }

    public float p(View view) {
        float transitionAlpha;
        if (L) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                L = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void x(int i2);

    public abstract void y(Typeface typeface, boolean z10);
}
