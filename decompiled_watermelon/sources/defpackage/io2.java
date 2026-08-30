package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: io2  reason: default package */
/* loaded from: classes.dex */
public abstract class io2 {
    public static ax2 a;
    public static ax2 b;
    public static final /* synthetic */ int c = 0;
    public static long d;
    public static Method e;
    public static Method f;
    public static Method g;
    public static Method h;
    public static ax2 i;

    public static final int C(Layout layout, int i2, boolean z) {
        if (i2 <= 0) {
            return 0;
        }
        if (i2 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i2 || lineEnd == i2) {
            if (lineStart == i2) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final im F(e31 e31Var) {
        im imVar = (im) e31Var.I(k45.e0);
        if (imVar != null) {
            return imVar;
        }
        i.n("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final ax2 I() {
        ax2 ax2Var = b;
        if (ax2Var != null) {
            return ax2Var;
        }
        zw2 zw2Var = new zw2("Filled.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = f77.a;
        mb6 mb6Var = new mb6(xq0.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new rk4(8.0f, 5.0f));
        arrayList.add(new dl4(14.0f));
        arrayList.add(new yk4(11.0f, -7.0f));
        arrayList.add(nk4.c);
        zw2.a(zw2Var, arrayList, 0, mb6Var);
        ax2 b2 = zw2Var.b();
        b = b2;
        return b2;
    }

    public static final to J(oq6 oq6Var) {
        to toVar = oq6Var.a;
        long j = oq6Var.b;
        toVar.getClass();
        return toVar.subSequence(vr6.f(j), vr6.e(j));
    }

    public static final to L(oq6 oq6Var, int i2) {
        to toVar = oq6Var.a;
        to toVar2 = oq6Var.a;
        long j = oq6Var.b;
        int e2 = vr6.e(j);
        int e3 = vr6.e(j);
        int i3 = e3 + i2;
        if (((i2 ^ i3) & (e3 ^ i3)) < 0) {
            i3 = toVar2.B.length();
        }
        return toVar.subSequence(e2, Math.min(i3, toVar2.B.length()));
    }

    public static final to M(oq6 oq6Var, int i2) {
        to toVar = oq6Var.a;
        long j = oq6Var.b;
        int f2 = vr6.f(j);
        int i3 = f2 - i2;
        if (((f2 ^ i3) & (i2 ^ f2)) < 0) {
            i3 = 0;
        }
        return toVar.subSequence(Math.max(0, i3), vr6.f(j));
    }

    public static final ax2 N() {
        ax2 ax2Var = i;
        if (ax2Var != null) {
            return ax2Var;
        }
        zw2 zw2Var = new zw2("Filled.Warning", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = f77.a;
        mb6 mb6Var = new mb6(xq0.b);
        vq2 vq2Var = new vq2(1, (byte) 0);
        vq2Var.o(1.0f, 21.0f);
        vq2Var.l(22.0f);
        vq2Var.m(12.0f, 2.0f);
        vq2Var.m(1.0f, 21.0f);
        vq2Var.g();
        vq2Var.o(13.0f, 18.0f);
        vq2Var.l(-2.0f);
        vq2Var.u(-2.0f);
        vq2Var.l(2.0f);
        vq2Var.u(2.0f);
        vq2Var.g();
        vq2Var.o(13.0f, 14.0f);
        vq2Var.l(-2.0f);
        vq2Var.u(-4.0f);
        vq2Var.l(2.0f);
        vq2Var.u(4.0f);
        vq2Var.g();
        zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
        ax2 b2 = zw2Var.b();
        i = b2;
        return b2;
    }

    public static void O(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = ((InvocationTargetException) exc).getCause();
            if (cause instanceof RuntimeException) {
                throw cause;
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static final void Q(t0 t0Var, String str) {
        t0Var.p("Trailing comma before the end of JSON ".concat(str), t0Var.B - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final boolean R() {
        if (Build.VERSION.SDK_INT >= 29) {
            return fp.f();
        }
        try {
            if (e == null) {
                d = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                e = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            Method method = e;
            if (method != null) {
                Object invoke = method.invoke(null, Long.valueOf(d));
                invoke.getClass();
                return ((Boolean) invoke).booleanValue();
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Exception e2) {
            O("isTagEnabled", e2);
            return false;
        }
    }

    public static final boolean V(h06 h06Var) {
        h06Var.getClass();
        if (b53.x(h06Var.c(), kh6.h) && h06Var.f() && h06Var.d() == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c06, java.lang.Object, j11] */
    public static c06 W(aj2 aj2Var) {
        ?? obj = new Object();
        obj.R = nk2.v(aj2Var, obj, obj);
        return obj;
    }

    public static final ci3 X(aj2 aj2Var, mi2 mi2Var) {
        cq3 cq3Var = new cq3(0, aj2Var);
        l07.q(1, mi2Var);
        return new ci3(22, cq3Var, mi2Var);
    }

    public static ga6 Y(ga6 ga6Var) {
        if (ga6Var instanceof wx6) {
            wx6 wx6Var = (wx6) ga6Var;
            if (wx6Var.t == jk2.s()) {
                wx6Var.r = null;
                return ga6Var;
            }
        }
        if (ga6Var instanceof xx6) {
            xx6 xx6Var = (xx6) ga6Var;
            if (xx6Var.i == jk2.s()) {
                xx6Var.h = null;
                return ga6Var;
            }
        }
        ga6 g2 = ma6.g(ga6Var, null, false);
        g2.j();
        return g2;
    }

    public static final CharSequence Z(int i2, CharSequence charSequence) {
        String str;
        int length;
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            String str2 = ".....";
            if (i2 == -1) {
                if (charSequence.length() - 60 > 0) {
                    return "....." + charSequence.subSequence(length, charSequence.length()).toString();
                }
            } else {
                int i3 = i2 - 30;
                int i4 = i2 + 30;
                if (i3 > 0) {
                    str = ".....";
                } else {
                    str = "";
                }
                if (i4 >= charSequence.length()) {
                    str2 = "";
                }
                StringBuilder r = wh1.r(str);
                if (i3 < 0) {
                    i3 = 0;
                }
                int length2 = charSequence.length();
                if (i4 > length2) {
                    i4 = length2;
                }
                r.append(charSequence.subSequence(i3, i4).toString());
                r.append(str2);
                return r.toString();
            }
        }
        return charSequence;
    }

    public static final s73 a(h06 h06Var) {
        String str = "Value of type '" + h06Var.b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + h06Var.c() + '\'';
        h06Var.b();
        return new s73(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final String a0(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        String str2 = ". ";
        if (str != null) {
            str2 = wh1.A(" with key ", str, ". ");
        }
        return b31.q(sb, str2, "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.zy3 r27, defpackage.pk3 r28, defpackage.ih4 r29, defpackage.qt r30, defpackage.h20 r31, defpackage.a92 r32, boolean r33, defpackage.eg r34, defpackage.mi2 r35, defpackage.tu0 r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io2.b(zy3, pk3, ih4, qt, h20, a92, boolean, eg, mi2, tu0, int, int):void");
    }

    public static Object b0(ce1 ce1Var, ki2 ki2Var) {
        i24 i24Var;
        ga6 wx6Var;
        ga6 ga6Var = (ga6) ma6.b.d();
        if (ga6Var instanceof wx6) {
            wx6 wx6Var2 = (wx6) ga6Var;
            if (wx6Var2.t == jk2.s()) {
                mi2 mi2Var = wx6Var2.r;
                mi2 mi2Var2 = wx6Var2.s;
                try {
                    ((wx6) ga6Var).r = ma6.k(ce1Var, mi2Var, true);
                    ((wx6) ga6Var).s = mi2Var2;
                    return ki2Var.c();
                } finally {
                    wx6Var2.r = mi2Var;
                    wx6Var2.s = mi2Var2;
                }
            }
        }
        if (ga6Var != null && !(ga6Var instanceof i24)) {
            wx6Var = ga6Var.u(ce1Var);
        } else {
            if (ga6Var instanceof i24) {
                i24Var = (i24) ga6Var;
            } else {
                i24Var = null;
            }
            wx6Var = new wx6(i24Var, ce1Var, null, true, false);
        }
        try {
            ga6 j = wx6Var.j();
            Object c2 = ki2Var.c();
            ga6.q(j);
            wx6Var.c();
            return c2;
        } catch (Throwable th) {
            wx6Var.c();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.zy3 r27, defpackage.pk3 r28, defpackage.ih4 r29, defpackage.nt r30, defpackage.i20 r31, defpackage.a92 r32, boolean r33, defpackage.eg r34, defpackage.mi2 r35, defpackage.tu0 r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io2.c(zy3, pk3, ih4, nt, i20, a92, boolean, eg, mi2, tu0, int, int):void");
    }

    public static final void d(hr0 hr0Var, c17 c17Var, m36 m36Var, et0 et0Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        boolean z;
        m36 m36Var2;
        m36 m36Var3;
        tj4 tj4Var;
        float f2;
        float f3;
        double d2;
        c17 c17Var2 = c17Var;
        tj4 tj4Var2 = hr0Var.l;
        tj4 tj4Var3 = hr0Var.d;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(53836214);
        if (sk2Var.f(hr0Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (sk2Var.f(c17Var2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4 | 128;
        if ((i6 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i6 & 1, z)) {
            sk2Var.T();
            if ((i2 & 1) != 0 && !sk2Var.y()) {
                sk2Var.R();
                m36Var3 = m36Var;
            } else {
                m36Var3 = (m36) sk2Var.j(n36.a);
            }
            sk2Var.q();
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                tj4Var = tj4Var2;
                hr0 hr0Var2 = new hr0(hr0Var.g(), hr0Var.h(), hr0Var.i(), ((xq0) tj4Var3.getValue()).a, hr0Var.a(), hr0Var.j(), hr0Var.b(), hr0Var.d(), hr0Var.e(), hr0Var.c(), hr0Var.f(), ((xq0) tj4Var2.getValue()).a, hr0Var.k());
                sk2Var.h0(hr0Var2);
                L = hr0Var2;
            } else {
                tj4Var = tj4Var2;
            }
            hr0 hr0Var3 = (hr0) L;
            ye6 ye6Var = ir0.a;
            hr0Var3.a.setValue(new xq0(hr0Var.g()));
            hr0Var3.b.setValue(new xq0(hr0Var.h()));
            hr0Var3.c.setValue(new xq0(hr0Var.i()));
            hr0Var3.d.setValue(new xq0(((xq0) tj4Var3.getValue()).a));
            hr0Var3.e.setValue(new xq0(hr0Var.a()));
            hr0Var3.f.setValue(new xq0(hr0Var.j()));
            hr0Var3.g.setValue(new xq0(hr0Var.b()));
            hr0Var3.h.setValue(new xq0(hr0Var.d()));
            hr0Var3.i.setValue(new xq0(hr0Var.e()));
            hr0Var3.j.setValue(new xq0(hr0Var.c()));
            hr0Var3.k.setValue(new xq0(hr0Var.f()));
            hr0Var3.l.setValue(new xq0(((xq0) tj4Var.getValue()).a));
            hr0Var3.m.setValue(Boolean.valueOf(hr0Var.k()));
            mg5 a2 = lg5.a(7, false);
            long g2 = hr0Var3.g();
            long a3 = hr0Var3.a();
            sk2Var.X(-2060762245);
            long a4 = ir0.a(hr0Var3, a3);
            if (a4 == 16) {
                a4 = ((xq0) sk2Var.j(e01.a)).a;
            }
            sk2Var.p(false);
            long j = ((xq0) sk2Var.j(e01.a)).a;
            if (!((hr0) sk2Var.j(ir0.a)).k() ? mh7.V(j) < 0.5d : mh7.V(j) > 0.5d) {
                f2 = 0.74f;
            } else {
                f2 = 0.6f;
            }
            long b2 = xq0.b(f2, a4);
            boolean e2 = sk2Var.e(g2) | sk2Var.e(a3) | sk2Var.e(b2);
            Object L2 = sk2Var.L();
            float f4 = 1.0f;
            if (!e2 && L2 != sn1Var) {
                d2 = 0.5d;
            } else {
                long g3 = hr0Var3.g();
                float s = ln2.s(g2, 0.4f, b2, a3);
                float s2 = ln2.s(g2, 0.2f, b2, a3);
                if (s >= 4.5f) {
                    d2 = 0.5d;
                    f3 = 0.4f;
                } else {
                    int i7 = (s2 > 4.5f ? 1 : (s2 == 4.5f ? 0 : -1));
                    f3 = 0.2f;
                    if (i7 < 0) {
                        d2 = 0.5d;
                    } else {
                        d2 = 0.5d;
                        float f5 = 0.4f;
                        float f6 = 0.2f;
                        f3 = 0.4f;
                        for (int i8 = 0; i8 < 7; i8++) {
                            float s3 = (ln2.s(g2, f3, b2, a3) / 4.5f) - 1.0f;
                            if (RecyclerView.A1 <= s3 && s3 <= 0.01f) {
                                break;
                            }
                            if (s3 < RecyclerView.A1) {
                                f5 = f3;
                            } else {
                                f6 = f3;
                            }
                            f3 = (f5 + f6) / 2.0f;
                        }
                    }
                }
                L2 = new xr6(g3, xq0.b(f3, g2));
                sk2Var.h0(L2);
            }
            xr6 xr6Var = (xr6) L2;
            ye6 ye6Var2 = ir0.a;
            dq a5 = ye6Var2.a(hr0Var3);
            tv0 tv0Var = b01.a;
            long j2 = ((xq0) sk2Var.j(e01.a)).a;
            if (!((hr0) sk2Var.j(ye6Var2)).k() ? mh7.V(j2) >= d2 : mh7.V(j2) <= d2) {
                f4 = 0.87f;
            }
            dq a6 = tv0Var.a(Float.valueOf(f4));
            dq a7 = gy2.a.a(a2);
            dq a8 = n36.a.a(m36Var3);
            dq a9 = yr6.a.a(xr6Var);
            c17Var2 = c17Var;
            dk7.b(new dq[]{a5, a6, a7, a8, a9, d17.b.a(c17Var2)}, ct3.H0(496803446, new s4(24, c17Var2, et0Var), sk2Var), sk2Var, 56);
            m36Var2 = m36Var3;
        } else {
            sk2Var.R();
            m36Var2 = m36Var;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new p4(hr0Var, c17Var2, m36Var2, et0Var, i2, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x047f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final defpackage.l44 r43, final defpackage.g44 r44, final defpackage.zy3 r45, final defpackage.ub r46, final defpackage.mi2 r47, final defpackage.mi2 r48, final defpackage.mi2 r49, final defpackage.mi2 r50, defpackage.tu0 r51, final int r52) {
        /*
            Method dump skipped, instructions count: 2776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io2.e(l44, g44, zy3, ub, mi2, mi2, mi2, mi2, tu0, int):void");
    }

    public static final void e0(jy5 jy5Var, long j, mi2 mi2Var) {
        zc4 zc4Var = new zc4(j);
        yc4 yc4Var = yc4.c0;
        l07.q(3, yc4Var);
        hy5 hy5Var = new hy5(jy5Var, zc4Var, yc4Var, lt0.L, ky5.e, (nk6) mi2Var, null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = jy5.Y;
        jy5Var.j(hy5Var, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final defpackage.l44 r18, final java.lang.Object r19, defpackage.zy3 r20, defpackage.ub r21, java.util.Map r22, final defpackage.mi2 r23, defpackage.mi2 r24, final defpackage.mi2 r25, final defpackage.mi2 r26, final defpackage.mi2 r27, defpackage.tu0 r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io2.f(l44, java.lang.Object, zy3, ub, java.util.Map, mi2, mi2, mi2, mi2, mi2, tu0, int, int):void");
    }

    public static d87 f0(String str) {
        String group;
        String str2;
        if (str != null && !zg6.B0(str)) {
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (matcher.matches() && (group = matcher.group(1)) != null) {
                int parseInt = Integer.parseInt(group);
                String group2 = matcher.group(2);
                if (group2 != null) {
                    int parseInt2 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    if (group3 != null) {
                        int parseInt3 = Integer.parseInt(group3);
                        if (matcher.group(4) != null) {
                            str2 = matcher.group(4);
                        } else {
                            str2 = "";
                        }
                        str2.getClass();
                        return new d87(str2, parseInt, parseInt2, parseInt3);
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static final Object h0(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final List j0(ns5 ns5Var) {
        int h2 = hi2.h(ns5Var, "id");
        int h3 = hi2.h(ns5Var, "seq");
        int h4 = hi2.h(ns5Var, "from");
        int h5 = hi2.h(ns5Var, "to");
        ip3 C = l07.C();
        while (ns5Var.a0()) {
            C.add(new ze2((int) ns5Var.getLong(h2), (int) ns5Var.getLong(h3), ns5Var.q(h4), ns5Var.q(h5)));
        }
        return tq0.f1(l07.t(C));
    }

    public static double k(double d2, double d3, double d4) {
        if (d3 <= d4) {
            if (d2 < d3) {
                return d3;
            }
            if (d2 > d4) {
                return d4;
            }
            return d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
    }

    public static final fm6 k0(ls5 ls5Var, String str, boolean z) {
        String str2;
        ns5 i0 = ls5Var.i0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int h2 = hi2.h(i0, "seqno");
            int h3 = hi2.h(i0, "cid");
            int h4 = hi2.h(i0, "name");
            int h5 = hi2.h(i0, "desc");
            if (h2 != -1 && h3 != -1 && h4 != -1 && h5 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (i0.a0()) {
                    if (((int) i0.getLong(h3)) >= 0) {
                        int i2 = (int) i0.getLong(h2);
                        String q = i0.q(h4);
                        if (i0.getLong(h5) > 0) {
                            str2 = "DESC";
                        } else {
                            str2 = "ASC";
                        }
                        linkedHashMap.put(Integer.valueOf(i2), q);
                        linkedHashMap2.put(Integer.valueOf(i2), str2);
                    }
                }
                List<Map.Entry> g1 = tq0.g1(linkedHashMap.entrySet(), new so5(3));
                ArrayList arrayList = new ArrayList(uq0.y0(g1, 10));
                for (Map.Entry entry : g1) {
                    arrayList.add((String) entry.getValue());
                }
                List n1 = tq0.n1(arrayList);
                List<Map.Entry> g12 = tq0.g1(linkedHashMap2.entrySet(), new so5(4));
                ArrayList arrayList2 = new ArrayList(uq0.y0(g12, 10));
                for (Map.Entry entry2 : g12) {
                    arrayList2.add((String) entry2.getValue());
                }
                fm6 fm6Var = new fm6(str, z, n1, tq0.n1(arrayList2));
                iq2.h(i0, null);
                return fm6Var;
            }
            iq2.h(i0, null);
            return null;
        } finally {
        }
    }

    public static float l(float f2, float f3, float f4) {
        if (f3 <= f4) {
            if (f2 < f3) {
                return f3;
            }
            if (f2 > f4) {
                return f4;
            }
            return f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + '.');
    }

    public static void l0(ga6 ga6Var, ga6 ga6Var2, mi2 mi2Var) {
        if (ga6Var == ga6Var2) {
            if (ga6Var instanceof wx6) {
                ((wx6) ga6Var).r = mi2Var;
                return;
            } else if (ga6Var instanceof xx6) {
                ((xx6) ga6Var).h = mi2Var;
                return;
            } else {
                f81.p(ga6Var, "Non-transparent snapshot was reused: ");
                return;
            }
        }
        ga6Var2.getClass();
        ga6.q(ga6Var);
        ga6Var2.c();
    }

    public static int m(int i2, int i3, int i4) {
        if (i3 <= i4) {
            if (i2 < i3) {
                return i3;
            }
            if (i2 > i4) {
                return i4;
            }
            return i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    public static int n(int i2, d33 d33Var) {
        int i3 = d33Var.B;
        int i4 = d33Var.A;
        if (!d33Var.isEmpty()) {
            if (i2 < Integer.valueOf(i4).intValue()) {
                return Integer.valueOf(i4).intValue();
            }
            if (i2 > Integer.valueOf(i3).intValue()) {
                return Integer.valueOf(i3).intValue();
            }
            return i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + d33Var + '.');
    }

    public static long o(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            if (j > j3) {
                return j3;
            }
            return j;
        }
        StringBuilder q = wh1.q(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        q.append(j2);
        q.append('.');
        throw new IllegalArgumentException(q.toString());
    }

    public static b33 o0(int i2, d33 d33Var) {
        boolean z;
        d33Var.getClass();
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        Integer valueOf = Integer.valueOf(i2);
        if (z) {
            int i3 = d33Var.A;
            int i4 = d33Var.B;
            if (d33Var.L <= 0) {
                i2 = -i2;
            }
            return new b33(i3, i4, i2);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static Comparable p(Comparable comparable, op0 op0Var) {
        op0Var.getClass();
        float f2 = op0Var.b;
        float f3 = op0Var.a;
        if (!op0Var.c()) {
            if (op0.d(comparable, Float.valueOf(f3)) && !op0.d(Float.valueOf(f3), comparable)) {
                return Float.valueOf(f3);
            }
            if (op0.d(Float.valueOf(f2), comparable) && !op0.d(comparable, Float.valueOf(f2))) {
                return Float.valueOf(f2);
            }
            return comparable;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + op0Var + '.');
    }

    public static String p0(String str) {
        String str2;
        if (str.length() <= 127) {
            str2 = str;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return str.substring(0, 127);
        }
        return str2;
    }

    public static final k24 q(l14 l14Var, tu0 tu0Var) {
        sk2 sk2Var = (sk2) tu0Var;
        Object L = sk2Var.L();
        sn1 sn1Var = su0.a;
        if (L == sn1Var) {
            L = me2.G(Boolean.FALSE);
            sk2Var.h0(L);
        }
        k24 k24Var = (k24) L;
        Object L2 = sk2Var.L();
        if (L2 == sn1Var) {
            L2 = new ec2(l14Var, k24Var, null, 1);
            sk2Var.h0(L2);
        }
        l.g(sk2Var, (aj2) L2, l14Var);
        return k24Var;
    }

    public static final double q0(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0125, code lost:
        if (r8 == null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.z44 r(defpackage.h06 r7, java.util.Map r8) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io2.r(h06, java.util.Map):z44");
    }

    public static final String r0(int i2, long j) {
        if (j >= 0) {
            iq2.g(i2);
            String l = Long.toString(j, i2);
            l.getClass();
            return l;
        }
        long j2 = i2;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        iq2.g(i2);
        String l2 = Long.toString(j3, i2);
        l2.getClass();
        iq2.g(i2);
        String l3 = Long.toString(j4, i2);
        l3.getClass();
        return l2.concat(l3);
    }

    public static final int s(int i2, CharSequence charSequence) {
        int length = charSequence.length();
        while (i2 < length) {
            if (charSequence.charAt(i2) == '\n') {
                return i2;
            }
            i2++;
        }
        return charSequence.length();
    }

    public static final String s0(String str, String str2, String str3, String str4) {
        StringBuilder v = b31.v("Route ", str3, " could not find any NavType for argument ", str, " of type ");
        v.append(str2);
        v.append(" - typeMap received was ");
        v.append(str4);
        return v.toString();
    }

    public static final int t(int i2, CharSequence charSequence) {
        while (i2 > 0) {
            if (charSequence.charAt(i2 - 1) == '\n') {
                return i2;
            }
            i2--;
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [b33, d33] */
    public static d33 t0(int i2, int i3) {
        if (i3 <= Integer.MIN_VALUE) {
            d33 d33Var = d33.R;
            return d33.R;
        }
        return new b33(i2, i3 - 1, 1);
    }

    public static final String u(String str, String str2, int i2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i2 >= 0) {
            sb.append("Unexpected JSON token at offset " + i2 + ": ");
        }
        sb.append(str);
        if (str2 != null && !zg6.B0(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !zg6.B0(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    public static final int v(m93 m93Var) {
        int hashCode = m93Var.e().b().hashCode();
        int d2 = m93Var.e().d();
        for (int i2 = 0; i2 < d2; i2++) {
            hashCode = (hashCode * 31) + m93Var.e().e(i2).hashCode();
        }
        return hashCode;
    }

    public static final int v0(jk3 jk3Var) {
        List list = jk3Var.k;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((kk3) list.get(i3)).m;
        }
        return (i2 / list.size()) + jk3Var.q;
    }

    public static final String w(Object obj, LinkedHashMap linkedHashMap) {
        obj.getClass();
        m93 O = me2.O(q75.a(obj.getClass()));
        mr5 mr5Var = new mr5(O, linkedHashMap);
        O.d(mr5Var, obj);
        Map r0 = zt3.r0(mr5Var.t0);
        q9 q9Var = new q9(O);
        l4 l4Var = new l4(12, r0, q9Var);
        int d2 = O.e().d();
        for (int i2 = 0; i2 < d2; i2++) {
            String e2 = O.e().e(i2);
            z44 z44Var = (z44) linkedHashMap.get(e2);
            if (z44Var != null) {
                l4Var.i(Integer.valueOf(i2), e2, z44Var);
            } else {
                c44.e(b31.n(']', "Cannot locate NavType for argument [", e2));
                return null;
            }
        }
        return ((String) q9Var.L) + ((String) q9Var.R) + ((String) q9Var.X);
    }

    public static final xv3 y(gj3 gj3Var, int i2, long j, xh4 xh4Var, long j2, jf4 jf4Var, i20 i20Var, sd3 sd3Var, int i3, j14 j14Var) {
        ArrayList arrayList;
        Object c2 = xh4Var.c(i2);
        List list = (List) j14Var.b(i2);
        if (list != null) {
            arrayList = list;
        } else {
            List a2 = gj3Var.a(i2);
            int size = a2.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList2.add(((mv3) a2.get(i4)).c(j));
            }
            j14Var.i(i2, arrayList2);
            arrayList = arrayList2;
        }
        return new xv3(i2, i3, arrayList, j2, c2, jf4Var, i20Var, sd3Var);
    }

    public static ga6 z() {
        return (ga6) ma6.b.d();
    }

    public abstract int A();

    public abstract int B();

    public abstract int D();

    public abstract int E();

    public abstract int G(View view);

    public abstract int H(CoordinatorLayout coordinatorLayout);

    public abstract int K();

    public abstract boolean P();

    public abstract boolean S(float f2);

    public abstract boolean T(View view);

    public abstract boolean U(float f2, float f3);

    public abstract void c0(int i2);

    public abstract void d0(Typeface typeface);

    public abstract int g();

    public abstract io2 g0(qo0 qo0Var, Object obj);

    public abstract int h(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float i(int i2);

    public abstract int i0(byte[] bArr, int i2, int i3);

    public void j(int i2) {
        new Handler(Looper.getMainLooper()).post(new cm(i2, 5, this));
    }

    public abstract boolean m0(View view, float f2);

    public abstract nu2 n0();

    public abstract void u0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3);

    public abstract Object x(qo0 qo0Var);
}
