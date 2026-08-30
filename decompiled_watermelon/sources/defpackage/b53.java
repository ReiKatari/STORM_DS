package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import android.util.LongSparseArray;
import android.util.Range;
import android.view.View;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import me.magnum.melonds.domain.model.DSiWareTitle;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b53  reason: default package */
/* loaded from: classes.dex */
public abstract class b53 {
    public static final Object[] a = new Object[0];
    public static final et0 b = new et0(1918584073, false, new xk0(23));
    public static final mm1[] c = {new mm1(120000000000L), new mm1(300000000000L)};
    public static final Object d = new Object();
    public static final Object e = new Object();
    public static final /* synthetic */ int f = 0;

    public static final float A(ih4 ih4Var, sd3 sd3Var) {
        if (sd3Var == sd3.Ltr) {
            return ih4Var.b(sd3Var);
        }
        return ih4Var.a(sd3Var);
    }

    public static final float B(ih4 ih4Var, sd3 sd3Var) {
        if (sd3Var == sd3.Ltr) {
            return ih4Var.a(sd3Var);
        }
        return ih4Var.b(sd3Var);
    }

    public static final be1 C(View view) {
        pg7 pg7Var;
        t40 t40Var;
        Context context = view.getContext();
        ContextWrapper contextWrapper = context;
        while (contextWrapper instanceof ContextWrapper) {
            if ((contextWrapper instanceof Activity) || (contextWrapper instanceof InputMethodService) || (contextWrapper instanceof Application)) {
                break;
            }
            ContextWrapper contextWrapper2 = (ContextWrapper) contextWrapper;
            if (contextWrapper2.getBaseContext() == null) {
                break;
            }
            contextWrapper = contextWrapper2.getBaseContext();
        }
        contextWrapper = null;
        if (contextWrapper != null) {
            ng7.a.getClass();
            mg7 mg7Var = mg7.a;
            og7 og7Var = mg7.b;
            og7Var.getClass();
            ContextWrapper contextWrapper3 = contextWrapper;
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                pg7Var = qd1.B;
            } else if (i >= 30) {
                pg7Var = y40.B;
            } else {
                pg7Var = sn1.v0;
            }
            long height = (4294967295L & t40Var.c().height()) | (pg7Var.l(contextWrapper3, og7Var.b).a.c().width() << 32);
            return new be1(height, ct3.z(contextWrapper).B(hk2.U(height)));
        }
        Configuration configuration = context.getResources().getConfiguration();
        sd1 z = ct3.z(context);
        long c2 = dk7.c(configuration.screenWidthDp, configuration.screenHeightDp);
        long i0 = z.i0(c2);
        return new be1((((int) Float.intBitsToFloat((int) (i0 & 4294967295L))) & 4294967295L) | (((int) Float.intBitsToFloat((int) (i0 >> 32))) << 32), c2);
    }

    public static xq2 D(xq2 xq2Var, xq2 xq2Var2) {
        vq2 vq2Var = new vq2(0, (byte) 0);
        int size = xq2Var.size();
        for (int i = 0; i < size; i++) {
            String c2 = xq2Var.c(i);
            String i2 = xq2Var.i(i);
            if ((!"Warning".equalsIgnoreCase(c2) || !gh6.n0(i2, "1", false)) && ("Content-Length".equalsIgnoreCase(c2) || "Content-Encoding".equalsIgnoreCase(c2) || "Content-Type".equalsIgnoreCase(c2) || !R(c2) || xq2Var2.b(c2) == null)) {
                vq2Var.e(c2, i2);
            }
        }
        int size2 = xq2Var2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            String c3 = xq2Var2.c(i3);
            if (!"Content-Length".equalsIgnoreCase(c3) && !"Content-Encoding".equalsIgnoreCase(c3) && !"Content-Type".equalsIgnoreCase(c3) && R(c3)) {
                vq2Var.e(c3, xq2Var2.i(i3));
            }
        }
        return vq2Var.f();
    }

    public static int E(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        if (i == i2) {
            return 0;
        }
        return 1;
    }

    public static int F(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        return 1;
    }

    public static void G(af afVar, LongSparseArray longSparseArray) {
        TranslationResponseValue l;
        CharSequence p;
        kz5 kz5Var;
        iz5 iz5Var;
        mi2 mi2Var;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long keyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse o = dd.o(longSparseArray.get(keyAt));
            if (o != null && (l = dd.l(o)) != null && (p = dd.p(l)) != null && (kz5Var = (kz5) afVar.c().b((int) keyAt)) != null && (iz5Var = kz5Var.a) != null) {
                Object g = iz5Var.d.A.g(dz5.l);
                if (g == null) {
                    g = null;
                }
                w1 w1Var = (w1) g;
                if (w1Var != null && (mi2Var = (mi2) w1Var.b) != null) {
                    Boolean bool = (Boolean) mi2Var.n(new to(p.toString()));
                }
            }
        }
    }

    public static final long H(long j) {
        long j2 = (j << 1) + 1;
        im1.B.getClass();
        int i = km1.a;
        return j2;
    }

    public static final zy3 I(zy3 zy3Var, wc2 wc2Var) {
        return zy3Var.f(new xc2(wc2Var));
    }

    public static final String[] J(w01 w01Var) {
        w01Var.getClass();
        return (String[]) ((cf) w01Var).b.toArray(new String[0]);
    }

    public static String K() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String L() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String M(Context context, int i) {
        if (i != -1) {
            try {
                return context.getResources().getResourceEntryName(i);
            } catch (Exception unused) {
                return wh1.g(i, "?");
            }
        }
        return "UNKNOWN";
    }

    public static String N(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static final ih0 O(j11 j11Var) {
        if (!(j11Var instanceof jg1)) {
            return new ih0(1, j11Var);
        }
        ih0 n = ((jg1) j11Var).n();
        if (n != null) {
            if (!n.F()) {
                n = null;
            }
            if (n != null) {
                return n;
            }
        }
        return new ih0(2, j11Var);
    }

    public static final me6 P(xa6 xa6Var) {
        me6 me6Var = xa6Var.A;
        me6Var.getClass();
        return (me6) ma6.t(me6Var, xa6Var);
    }

    public static final int Q(xa6 xa6Var) {
        me6 me6Var = xa6Var.A;
        me6Var.getClass();
        return ((me6) ma6.h(me6Var)).e;
    }

    public static boolean R(String str) {
        if (!"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static boolean S() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        LinkedHashMap linkedHashMap = ExtraCroppingQuirk.a;
        String str3 = Build.MODEL;
        str3.getClass();
        Locale locale = Locale.ROOT;
        String upperCase = str3.toUpperCase(locale);
        upperCase.getClass();
        if (linkedHashMap.containsKey(upperCase)) {
            String upperCase2 = str3.toUpperCase(locale);
            upperCase2.getClass();
            Range range = (Range) linkedHashMap.get(upperCase2);
            if (range != null) {
                return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
            }
            return true;
        }
        return false;
    }

    public static boolean T() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        if (gh6.g0(Build.DEVICE, "m55xq", true)) {
            return true;
        }
        return false;
    }

    public static final zy3 U(zy3 zy3Var, bj2 bj2Var) {
        return zy3Var.f(new cf3(bj2Var));
    }

    public static final boolean V(xa6 xa6Var, mi2 mi2Var) {
        int i;
        g1 g1Var;
        Object n;
        ga6 j;
        boolean y;
        do {
            synchronized (d) {
                me6 me6Var = xa6Var.A;
                me6Var.getClass();
                me6 me6Var2 = (me6) ma6.h(me6Var);
                i = me6Var2.d;
                g1Var = me6Var2.c;
            }
            g1Var.getClass();
            en4 j2 = g1Var.j();
            n = mi2Var.n(j2);
            g1 d2 = j2.d();
            if (x(d2, g1Var)) {
                break;
            }
            me6 me6Var3 = xa6Var.A;
            me6Var3.getClass();
            synchronized (ma6.c) {
                j = ma6.j();
                y = y((me6) ma6.w(me6Var3, xa6Var, j), i, d2, true);
            }
            ma6.n(j, xa6Var);
        } while (!y);
        return ((Boolean) n).booleanValue();
    }

    public static final zy3 W(zy3 zy3Var, ih4 ih4Var) {
        return zy3Var.f(new lh4(ih4Var));
    }

    public static final zy3 X(zy3 zy3Var, float f2) {
        return zy3Var.f(new gh4(f2, f2, f2, f2));
    }

    public static final zy3 Y(zy3 zy3Var, float f2, float f3) {
        return zy3Var.f(new gh4(f2, f3, f2, f3));
    }

    public static zy3 Z(zy3 zy3Var, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i & 2) != 0) {
            f3 = 0.0f;
        }
        return Y(zy3Var, f2, f3);
    }

    public static final void a(List list, final long j, mi2 mi2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        sk2 sk2Var;
        final mi2 mi2Var2;
        boolean z2;
        kx6 kx6Var;
        Object f2;
        float f3;
        float f4;
        ae6 q;
        boolean z3;
        mi2 m7Var;
        int i5;
        sd3 sd3Var;
        mi2 mi2Var3;
        zy3 zy3Var;
        float f5;
        pk3 pk3Var;
        boolean z4;
        boolean z5;
        mi2 mi2Var4;
        final List list2 = list;
        list2.getClass();
        mi2Var.getClass();
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(-1816202422);
        if (sk2Var2.h(list2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (sk2Var2.e(j)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (sk2Var2.h(mi2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if ((i8 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i8 & 1, z)) {
            ye6 ye6Var = ir0.a;
            final long c2 = ((hr0) sk2Var2.j(ye6Var)).c();
            final long i9 = ((hr0) sk2Var2.j(ye6Var)).i();
            boolean f6 = sk2Var2.f(list2);
            int i10 = i8 & 112;
            if (i10 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z6 = f6 | z2;
            Object L = sk2Var2.L();
            sn1 sn1Var = su0.a;
            if (z6 || L == sn1Var) {
                Iterator it = list2.iterator();
                int i11 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (((c6) it.next()).a == j) {
                            break;
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                L = Integer.valueOf(i11);
                sk2Var2.h0(L);
            }
            int intValue = ((Number) L).intValue();
            Object L2 = sk2Var2.L();
            if (L2 == sn1Var) {
                L2 = b31.f(sk2Var2);
            }
            l14 l14Var = (l14) L2;
            k24 a2 = bh7.a(l14Var, sk2Var2, 6);
            Boolean bool = (Boolean) a2.getValue();
            bool.getClass();
            kx6 V = a53.V(bool, null, sk2Var2, 0, 2);
            ku0 ku0Var = V.a;
            final ae6 b2 = wm.b(intValue, null, "Tab position", sk2Var2, 3072, 22);
            bz6 bz6Var = dt3.g0;
            if (!V.g()) {
                sk2Var2.X(1666573488);
                kx6Var = V;
                boolean f7 = sk2Var2.f(kx6Var);
                f2 = sk2Var2.L();
                if (f7 || f2 == sn1Var) {
                    ga6 z7 = io2.z();
                    if (z7 != null) {
                        mi2Var4 = z7.e();
                    } else {
                        mi2Var4 = null;
                    }
                    ga6 Y = io2.Y(z7);
                    try {
                        Object f8 = ku0Var.f();
                        io2.l0(z7, Y, mi2Var4);
                        sk2Var2.h0(f8);
                        f2 = f8;
                    } catch (Throwable th) {
                        io2.l0(z7, Y, mi2Var4);
                        throw th;
                    }
                }
                sk2Var2.p(false);
            } else {
                kx6Var = V;
                sk2Var2.X(1666827533);
                sk2Var2.p(false);
                f2 = ku0Var.f();
            }
            boolean booleanValue = ((Boolean) f2).booleanValue();
            sk2Var2.X(195499522);
            if (booleanValue) {
                f3 = 1.0f;
            } else {
                f3 = 0.75f;
            }
            sk2Var2.p(false);
            Float valueOf = Float.valueOf(f3);
            boolean f9 = sk2Var2.f(kx6Var);
            Object L3 = sk2Var2.L();
            if (f9 || L3 == sn1Var) {
                L3 = me2.q(new j7(kx6Var, 0));
                sk2Var2.h0(L3);
            }
            boolean booleanValue2 = ((Boolean) ((ae6) L3).getValue()).booleanValue();
            sk2Var2.X(195499522);
            if (booleanValue2) {
                f4 = 1.0f;
            } else {
                f4 = 0.75f;
            }
            sk2Var2.p(false);
            Float valueOf2 = Float.valueOf(f4);
            boolean f10 = sk2Var2.f(kx6Var);
            Object L4 = sk2Var2.L();
            if (!f10 && L4 != sn1Var) {
                q = L4;
            } else {
                q = me2.q(new j7(kx6Var, 1));
                sk2Var2.h0(q);
            }
            ex6 ex6Var = (ex6) q.getValue();
            sk2Var2.X(-985243360);
            sc6 P0 = ct3.P0(RecyclerView.A1, RecyclerView.A1, null, 7);
            sk2Var2.p(false);
            final gx6 y = a53.y(kx6Var, valueOf, valueOf2, P0, bz6Var, sk2Var2, 0);
            Object L5 = sk2Var2.L();
            if (L5 == sn1Var) {
                L5 = a53.c(-1.0f);
                sk2Var2.h0(L5);
            }
            final um umVar = (um) L5;
            final pk3 a3 = qk3.a(sk2Var2);
            sd3 sd3Var2 = (sd3) sk2Var2.j(ov0.n);
            Integer valueOf3 = Integer.valueOf(intValue);
            boolean f11 = sk2Var2.f(a3) | sk2Var2.d(intValue) | sk2Var2.h(umVar);
            Object L6 = sk2Var2.L();
            if (f11 || L6 == sn1Var) {
                L6 = new l7(a3, umVar, intValue, null);
                sk2Var2.h0(L6);
            }
            l.g(sk2Var2, (aj2) L6, valueOf3);
            zy3 a4 = fz5.a(ct3.f0(wy3.a, false, l14Var, 1), false, new fu5(21));
            boolean f12 = sk2Var2.f(a2) | sk2Var2.d(sd3Var2.ordinal()) | sk2Var2.h(list2) | sk2Var2.d(intValue);
            int i12 = i8 & 896;
            if (i12 == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z8 = z3 | f12;
            Object L7 = sk2Var2.L();
            if (!z8 && L7 != sn1Var) {
                m7Var = L7;
                i5 = 1;
                sd3Var = sd3Var2;
            } else {
                i5 = 1;
                m7Var = new m7(list2, intValue, mi2Var, a2, sd3Var2);
                sd3Var = sd3Var2;
                sk2Var2.h0(m7Var);
            }
            zy3 Z = Z(w81.B(a4, m7Var), RecyclerView.A1, 16.0f, i5);
            final sd3 sd3Var3 = sd3Var;
            boolean f13 = sk2Var2.f(a3) | sk2Var2.h(list2) | sk2Var2.d(sd3Var.ordinal()) | sk2Var2.e(c2) | sk2Var2.f(b2) | sk2Var2.h(umVar) | sk2Var2.f(y) | sk2Var2.e(i9);
            Object L8 = sk2Var2.L();
            if (!f13 && L8 != sn1Var) {
                zy3Var = Z;
                mi2Var3 = L8;
                sk2Var = sk2Var2;
                pk3Var = a3;
                f5 = 16.0f;
            } else {
                zy3Var = Z;
                sk2Var = sk2Var2;
                f5 = 16.0f;
                mi2Var3 = new mi2() { // from class: f7
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.mi2
                    public final Object n(Object obj) {
                        float f14;
                        Object next;
                        float intBitsToFloat;
                        float intBitsToFloat2;
                        float f15;
                        float f16;
                        float floatValue;
                        float intBitsToFloat3;
                        float f17;
                        float ceil;
                        int i13;
                        xf3 xf3Var = (xf3) obj;
                        xf3Var.getClass();
                        rh0 rh0Var = xf3Var.A;
                        pk3 pk3Var2 = pk3.this;
                        if (pk3Var2.h() == 0) {
                            f14 = (-pk3Var2.i()) + (-pk3Var2.j().l);
                        } else {
                            f14 = (-Float.intBitsToFloat((int) (rh0Var.d() & 4294967295L))) / 2.0f;
                        }
                        Iterator it2 = pk3Var2.j().k.iterator();
                        kk3 kk3Var = null;
                        if (!it2.hasNext()) {
                            next = null;
                        } else {
                            next = it2.next();
                            if (it2.hasNext()) {
                                int i14 = ((kk3) next).l;
                                do {
                                    Object next2 = it2.next();
                                    int i15 = ((kk3) next2).l;
                                    if (i14 < i15) {
                                        next = next2;
                                        i14 = i15;
                                    }
                                } while (it2.hasNext());
                            }
                        }
                        kk3 kk3Var2 = (kk3) next;
                        if (kk3Var2 != null && kk3Var2.a == l07.P(list2)) {
                            intBitsToFloat = kk3Var2.l + kk3Var2.m + pk3Var2.j().p;
                        } else {
                            intBitsToFloat = Float.intBitsToFloat((int) (rh0Var.d() >> 32)) + (Float.intBitsToFloat((int) (rh0Var.d() & 4294967295L)) / 2.0f);
                        }
                        float f18 = intBitsToFloat - f14;
                        sd3 sd3Var4 = sd3.Ltr;
                        sd3 sd3Var5 = sd3Var3;
                        if (sd3Var5 != sd3Var4) {
                            f14 = Float.intBitsToFloat((int) (rh0Var.d() >> 32)) - intBitsToFloat;
                        }
                        hk1.u(xf3Var, c2, (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(RecyclerView.A1) & 4294967295L), i76.a(f18, rh0Var.d()), (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (rh0Var.d() & 4294967295L)) / 2.0f) & 4294967295L), 0.15f, 208);
                        ae6 ae6Var = b2;
                        float floatValue2 = ((Number) ae6Var.getValue()).floatValue();
                        kk3 kk3Var3 = (kk3) tq0.U0(pk3Var2.j().k);
                        if (kk3Var3 != null) {
                            f15 = kk3Var3.a;
                        } else {
                            f15 = Float.MAX_VALUE;
                        }
                        if (floatValue2 <= f15) {
                            float floatValue3 = ((Number) ae6Var.getValue()).floatValue() + 0.999f;
                            kk3 kk3Var4 = (kk3) tq0.M0(pk3Var2.j().k);
                            if (kk3Var4 != null) {
                                f16 = kk3Var4.a;
                            } else {
                                f16 = Float.MIN_VALUE;
                            }
                            if (floatValue3 > f16) {
                                if (((Number) ae6Var.getValue()).floatValue() < ((kk3) tq0.K0(pk3Var2.j().k)).a) {
                                    Iterator it3 = pk3Var2.j().k.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            break;
                                        }
                                        Object next3 = it3.next();
                                        if (((kk3) next3).a == ((int) ((Number) ae6Var.getValue()).floatValue()) + 1) {
                                            kk3Var = next3;
                                            break;
                                        }
                                    }
                                    kk3 kk3Var5 = kk3Var;
                                    if (kk3Var5 == null) {
                                        kk3 kk3Var6 = (kk3) tq0.T0(pk3Var2.j().k);
                                        f17 = kk3Var6.l;
                                        ceil = ((float) Math.ceil(((Number) ae6Var.getValue()).floatValue())) - ((Number) ae6Var.getValue()).floatValue();
                                        i13 = kk3Var6.m;
                                    } else {
                                        f17 = kk3Var5.l;
                                        ceil = ((float) Math.ceil(((Number) ae6Var.getValue()).floatValue())) - ((Number) ae6Var.getValue()).floatValue();
                                        i13 = kk3Var5.m;
                                    }
                                    floatValue = f17 - (ceil * i13);
                                } else {
                                    for (kk3 kk3Var7 : pk3Var2.j().k) {
                                        if (kk3Var7.a == ((int) ((Number) ae6Var.getValue()).floatValue())) {
                                            floatValue = ((((Number) ae6Var.getValue()).floatValue() - ((float) Math.floor(((Number) ae6Var.getValue()).floatValue()))) * kk3Var7.m) + kk3Var7.l + (-pk3Var2.j().l);
                                        }
                                    }
                                    vd6.e("Collection contains no element matching the predicate.");
                                    return null;
                                }
                                sd3 sd3Var6 = sd3.Ltr;
                                um umVar2 = umVar;
                                if (sd3Var5 != sd3Var6) {
                                    floatValue = (Float.intBitsToFloat((int) (rh0Var.d() >> 32)) - floatValue) - ((Number) umVar2.d()).floatValue();
                                }
                                float floatValue4 = ((Number) y.getValue()).floatValue();
                                hk1.u(xf3Var, i9, (Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(RecyclerView.A1) & 4294967295L), i76.a(((Number) umVar2.d()).floatValue(), rh0Var.d()), (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (rh0Var.d() & 4294967295L)) / 2.0f) & 4294967295L), floatValue4, 208);
                                xf3Var = xf3Var;
                            }
                        }
                        xf3Var.a();
                        return o27.a;
                    }
                };
                pk3Var = a3;
                list2 = list2;
                sk2Var.h0(mi2Var3);
            }
            zy3 G = l07.G(zy3Var, mi2Var3);
            mh4 q2 = q(2, f5);
            boolean h = sk2Var.h(list2);
            if (i10 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z9 = h | z4;
            if (i12 == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z10 = z9 | z5;
            Object L9 = sk2Var.L();
            if (!z10 && L9 != sn1Var) {
                mi2Var2 = mi2Var;
            } else {
                mi2Var2 = mi2Var;
                L9 = new mi2() { // from class: g7
                    @Override // defpackage.mi2
                    public final Object n(Object obj) {
                        ek3 ek3Var = (ek3) obj;
                        ek3Var.getClass();
                        List list3 = list2;
                        ek3Var.b0(list3.size(), null, new k5(2, list3), new et0(802480018, true, new n7(list3, j, mi2Var2)));
                        return o27.a;
                    }
                };
                sk2Var.h0(L9);
            }
            io2.c(G, pk3Var, q2, rt.d, null, null, false, null, (mi2) L9, sk2Var, 24960, 488);
        } else {
            sk2Var = sk2Var2;
            mi2Var2 = mi2Var;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new h7(list2, j, mi2Var2, i, 0);
        }
    }

    public static final zy3 a0(zy3 zy3Var, float f2, float f3, float f4, float f5) {
        return zy3Var.f(new gh4(f2, f3, f4, f5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v2 */
    public static final void b(kx6 kx6Var, zy3 zy3Var, mi2 mi2Var, ub ubVar, mi2 mi2Var2, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        mi2 mi2Var3;
        sk2 sk2Var;
        boolean z2;
        boolean z3;
        boolean z4;
        ku0 ku0Var;
        mn mnVar;
        xa6 xa6Var;
        mn mnVar2;
        ax6 ax6Var;
        boolean z5;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        mi2 mi2Var4 = mi2Var;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(511725103);
        if ((i & 6) == 0) {
            if (sk2Var2.f(kx6Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var2.f(zy3Var)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var2.h(mi2Var4)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (sk2Var2.f(ubVar)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (sk2Var2.h(mi2Var2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        et0 et0Var2 = et0Var;
        if ((196608 & i) == 0) {
            if (sk2Var2.h(et0Var2)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((74899 & i2) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i2 & 1, z)) {
            sd3 sd3Var = (sd3) sk2Var2.j(ov0.n);
            int i9 = i2 & 14;
            if (i9 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object L = sk2Var2.L();
            Object obj = su0.a;
            if (z2 || L == obj) {
                L = new mn(kx6Var, ubVar);
                sk2Var2.h0(L);
            }
            mn mnVar3 = L;
            if (i9 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object L2 = sk2Var2.L();
            xa6 xa6Var2 = L2;
            if (z3 || L2 == obj) {
                xa6 xa6Var3 = new xa6();
                xa6Var3.addAll(nu.F0(new Object[]{kx6Var.a.f()}));
                sk2Var2.h0(xa6Var3);
                xa6Var2 = xa6Var3;
            }
            xa6 xa6Var4 = (xa6) xa6Var2;
            if (i9 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object L3 = sk2Var2.L();
            if (z4 || L3 == obj) {
                long[] jArr = wu5.a;
                L3 = new d24();
                sk2Var2.h0(L3);
            }
            d24 d24Var = (d24) L3;
            ku0 ku0Var2 = kx6Var.a;
            tj4 tj4Var = kx6Var.d;
            if (!xa6Var4.contains(ku0Var2.f())) {
                xa6Var4.clear();
                xa6Var4.add(ku0Var2.f());
            }
            if (x(ku0Var2.f(), tj4Var.getValue())) {
                if (xa6Var4.size() != 1 || !x(xa6Var4.get(0), ku0Var2.f())) {
                    xa6Var4.clear();
                    xa6Var4.add(ku0Var2.f());
                }
                if (d24Var.e != 1 || d24Var.c(ku0Var2.f())) {
                    d24Var.a();
                }
                mnVar3.b = ubVar;
            }
            if (!x(ku0Var2.f(), tj4Var.getValue()) && !xa6Var4.contains(tj4Var.getValue())) {
                ListIterator listIterator = xa6Var4.listIterator();
                int i10 = 0;
                while (true) {
                    wr2 wr2Var = (wr2) listIterator;
                    ku0Var = ku0Var2;
                    if (wr2Var.hasNext()) {
                        if (x(mi2Var2.n(wr2Var.next()), mi2Var2.n(tj4Var.getValue()))) {
                            break;
                        }
                        i10++;
                        ku0Var2 = ku0Var;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 == -1) {
                    xa6Var4.add(tj4Var.getValue());
                } else {
                    xa6Var4.set(i10, tj4Var.getValue());
                }
            } else {
                ku0Var = ku0Var2;
            }
            if (d24Var.c(tj4Var.getValue()) && d24Var.c(ku0Var.f())) {
                sk2Var2.X(1968995539);
                sk2Var2.p(false);
                mi2Var3 = mi2Var4;
                mnVar = mnVar3;
            } else {
                sk2Var2.X(1966410449);
                d24Var.a();
                int size = xa6Var4.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = xa6Var4.get(i11);
                    d24Var.m(obj2, ct3.H0(-23915175, new bn(kx6Var, obj2, mi2Var4, mnVar3, xa6Var4, et0Var2), sk2Var2));
                    i11++;
                    mi2Var4 = mi2Var4;
                    et0Var2 = et0Var;
                }
                mi2Var3 = mi2Var4;
                mnVar = mnVar3;
                sk2Var2.p(false);
            }
            boolean f2 = sk2Var2.f(kx6Var.f()) | sk2Var2.f(mnVar);
            Object L4 = sk2Var2.L();
            if (f2 || L4 == obj) {
                L4 = (u01) mi2Var3.n(mnVar);
                sk2Var2.h0(L4);
            }
            u01 u01Var = (u01) L4;
            kx6 kx6Var2 = mnVar.a;
            boolean f3 = sk2Var2.f(mnVar);
            Object L5 = sk2Var2.L();
            if (f3 || L5 == obj) {
                L5 = me2.G(Boolean.FALSE);
                sk2Var2.h0(L5);
            }
            k24 k24Var = (k24) L5;
            k24 L6 = me2.L(u01Var.d, sk2Var2);
            if (x(kx6Var2.a.f(), kx6Var2.d.getValue())) {
                k24Var.setValue(Boolean.FALSE);
            } else if (L6.getValue() != null) {
                k24Var.setValue(Boolean.TRUE);
            }
            boolean booleanValue = ((Boolean) k24Var.getValue()).booleanValue();
            zy3 zy3Var2 = wy3.a;
            if (booleanValue) {
                sk2Var2.X(1353077497);
                mn mnVar4 = mnVar;
                xa6Var = xa6Var4;
                sk2Var = sk2Var2;
                mnVar2 = mnVar4;
                ax6Var = a53.x(mnVar4.a, dt3.n0, null, sk2Var, 0, 2);
                boolean f4 = sk2Var.f(ax6Var);
                Object L7 = sk2Var.L();
                if (f4 || L7 == obj) {
                    r76 r76Var = (r76) L6.getValue();
                    L7 = a53.u(zy3Var2);
                    sk2Var.h0(L7);
                }
                zy3Var2 = (zy3) L7;
                sk2Var.p(false);
            } else {
                xa6Var = xa6Var4;
                sk2Var = sk2Var2;
                mnVar2 = mnVar;
                sk2Var.X(1353343539);
                sk2Var.p(false);
                ax6Var = null;
            }
            zy3 f5 = zy3Var.f(zy3Var2.f(new in(ax6Var, L6, mnVar2)));
            Object L8 = sk2Var.L();
            if (L8 == obj) {
                L8 = new fn(mnVar2);
                sk2Var.h0(L8);
            }
            fn fnVar = (fn) L8;
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, f5);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, fnVar);
            oo2.S(sk2Var, mu0.e, l);
            oo2.N(sk2Var, Integer.valueOf(hashCode), mu0.g);
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            sk2Var.X(-860173498);
            int size2 = xa6Var.size();
            int i12 = 0;
            while (i12 < size2) {
                xa6 xa6Var5 = xa6Var;
                Object obj3 = xa6Var5.get(i12);
                sk2Var.V(-2026002954, mi2Var2.n(obj3));
                aj2 aj2Var = (aj2) d24Var.g(obj3);
                if (aj2Var == null) {
                    sk2Var.X(1618454323);
                    z5 = false;
                } else {
                    z5 = false;
                    sk2Var.X(-2026001778);
                    aj2Var.j(sk2Var, 0);
                }
                sk2Var.p(z5);
                sk2Var.p(z5);
                i12++;
                xa6Var = xa6Var5;
            }
            sk2Var.p(false);
            sk2Var.p(true);
        } else {
            mi2Var3 = mi2Var4;
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new cn(kx6Var, zy3Var, (mi2) mi2Var3, ubVar, mi2Var2, et0Var, i);
        }
    }

    public static zy3 b0(zy3 zy3Var, float f2, float f3, float f4, float f5, int i) {
        if ((i & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i & 8) != 0) {
            f5 = 0.0f;
        }
        return a0(zy3Var, f2, f3, f4, f5);
    }

    public static final void c(Object obj, zy3 zy3Var, mi2 mi2Var, ub ubVar, String str, mi2 mi2Var2, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        j20 j20Var;
        mi2 mi2Var3;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1501828832);
        if (sk2Var.f(obj)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2 | 199680;
        if ((599187 & i3) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            j20 j20Var2 = y60.L;
            Object L = sk2Var.L();
            if (L == su0.a) {
                L = yd.g0;
                sk2Var.h0(L);
            }
            mi2Var3 = (mi2) L;
            b(a53.V(obj, str, sk2Var, (i3 & 14) | 48, 0), zy3Var, mi2Var, j20Var2, mi2Var3, et0Var, sk2Var, 224688);
            j20Var = j20Var2;
        } else {
            sk2Var.R();
            j20Var = ubVar;
            mi2Var3 = mi2Var2;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new xm(obj, zy3Var, mi2Var, j20Var, str, mi2Var3, et0Var, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b8, code lost:
        if (r5 == r26.length()) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01c0, code lost:
        if (r26.charAt(r5) != 'S') goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c2, code lost:
        r2 = (r14 * 1000000000) + r15;
        r14 = r9;
        r4 = defpackage.om1.SECONDS;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01d6, code lost:
        switch(defpackage.lm1.a[r4.ordinal()]) {
            case 1: goto L114;
            case 2: goto L113;
            case 3: goto L112;
            case 4: goto L111;
            case 5: goto L110;
            case 6: goto L109;
            case 7: goto L107;
            default: goto L105;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01d9, code lost:
        defpackage.f81.p(r4, "Unknown unit: ");
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01e1, code lost:
        r21 = 0.0864d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01e7, code lost:
        r21 = 0.0036d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01ed, code lost:
        r21 = 6.0E-5d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01f3, code lost:
        r21 = 1.0E-6d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01f9, code lost:
        r21 = 1.0E-9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01ff, code lost:
        r21 = 1.0E-15d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0205, code lost:
        r21 = 1.0E-12d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x020a, code lost:
        r2 = defpackage.jv3.Y(r2 * r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0210, code lost:
        r14 = r2 * r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:
        r25 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d1, code lost:
        if (r5 >= r26.length()) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d3, code lost:
        r3 = r26.charAt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d9, code lost:
        if ('0' > r3) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00dd, code lost:
        if (r3 >= ':') goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00df, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e6, code lost:
        if (r5 == r26.length()) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ea, code lost:
        if (r2 == '+') goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ee, code lost:
        if (r2 == '-') goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f0, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f2, code lost:
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f6, code lost:
        if (r5 == (r23 + r2)) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f8, code lost:
        r20 = 4611686018427387903L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0104, code lost:
        defpackage.i.i("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0107, code lost:
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0195 A[LOOP:7: B:105:0x0193->B:106:0x0195, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x029e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015c A[LOOP:5: B:95:0x015a->B:96:0x015c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long c0(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b53.c0(java.lang.String):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v7, types: [b2, tt0, java.lang.Object] */
    public static final void d(boolean z, ki2 ki2Var, tu0 tu0Var, int i, int i2) {
        boolean z2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        c54 c54Var;
        q9 q9Var;
        lc4 lc4Var;
        boolean z5;
        boolean z6;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-361453782);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i4 = i | 6;
            z2 = z;
        } else {
            z2 = z;
            if (sk2Var.g(z2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i4 = i3 | i;
        }
        if (sk2Var.h(ki2Var)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i7 = i4 | i5;
        if ((i7 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (sk2Var.O(i7 & 1, z3)) {
            if (i6 != 0) {
                z4 = true;
            } else {
                z4 = z2;
            }
            Object a2 = zq3.a(sk2Var);
            if (a2 == null) {
                sk2Var.X(535274673);
                a2 = ar3.a(sk2Var);
            } else {
                sk2Var.X(535271790);
            }
            sk2Var.p(false);
            if (a2 != null) {
                boolean f2 = sk2Var.f(a2);
                Object L = sk2Var.L();
                Object obj = su0.a;
                if (f2 || L == obj) {
                    kc4 kc4Var = null;
                    if (a2 instanceof c54) {
                        c54Var = (c54) a2;
                    } else {
                        c54Var = null;
                    }
                    if (c54Var != null) {
                        q9Var = c54Var.a();
                    } else {
                        q9Var = null;
                    }
                    if (a2 instanceof lc4) {
                        lc4Var = (lc4) a2;
                    } else {
                        lc4Var = null;
                    }
                    if (lc4Var != null) {
                        kc4Var = lc4Var.b();
                    }
                    L = new ny(q9Var, kc4Var);
                    sk2Var.h0(L);
                }
                ny nyVar = (ny) L;
                long j = sk2Var.T;
                boolean f3 = sk2Var.f(nyVar) | sk2Var.e(j);
                Object L2 = sk2Var.L();
                tt0 tt0Var = L2;
                if (f3 || L2 == obj) {
                    ?? b2Var = new b2(new oy(j, a2));
                    b2Var.c = new d5(17);
                    sk2Var.h0(b2Var);
                    tt0Var = b2Var;
                }
                tt0 tt0Var2 = tt0Var;
                sk2Var.X(-585307852);
                boolean h = sk2Var.h(tt0Var2);
                if ((i7 & 112) == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z7 = h | z5;
                Object L3 = sk2Var.L();
                if (z7 || L3 == obj) {
                    L3 = new p6(8, tt0Var2, ki2Var);
                    sk2Var.h0(L3);
                }
                l.j((ki2) L3, sk2Var);
                Boolean valueOf = Boolean.valueOf(z4);
                boolean h2 = sk2Var.h(tt0Var2);
                int i8 = i7 & 14;
                if (i8 == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z8 = h2 | z6;
                Object L4 = sk2Var.L();
                if (z8 || L4 == obj) {
                    L4 = new py(tt0Var2, z4, 0);
                    sk2Var.h0(L4);
                }
                gk2.h(valueOf, tt0Var2, null, (mi2) L4, sk2Var, i8);
                boolean h3 = sk2Var.h(nyVar) | sk2Var.h(tt0Var2);
                Object L5 = sk2Var.L();
                if (h3 || L5 == obj) {
                    L5 = new x(4, nyVar, tt0Var2);
                    sk2Var.h0(L5);
                }
                l.e(nyVar, tt0Var2, (mi2) L5, sk2Var);
                sk2Var.p(false);
                z2 = z4;
            } else {
                i.n("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new qy(z2, ki2Var, i, i2);
        }
    }

    public static final Object d0(Object obj) {
        if (obj instanceof ns0) {
            return me2.o(((ns0) obj).a);
        }
        return obj;
    }

    public static final void e(zy3 zy3Var, pl0 pl0Var, ih4 ih4Var, ki2 ki2Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-2059675956);
        if ((i & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.f(pl0Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.f(ih4Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (sk2Var.h(ki2Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = new wc2();
                sk2Var.h0(L);
            }
            wc2 wc2Var = (wc2) L;
            zy3 W = W(zy3Var, ih4Var);
            lr0 a2 = jr0.a(new ot(16.0f, true, new i(1)), y60.j0, sk2Var, 6);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, W);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, a2);
            oo2.S(sk2Var, mu0.e, l);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            tv0 tv0Var = yr6.a;
            dk7.a(tv0Var.a(new xr6(((hr0) sk2Var.j(ir0.a)).i(), ((xr6) sk2Var.j(tv0Var)).b)), ct3.H0(-1778091006, new w3(wc2Var, pl0Var, ki2Var, 5), sk2Var), sk2Var, 56);
            sk2Var.p(true);
            Object L2 = sk2Var.L();
            if (L2 == sn1Var) {
                L2 = new kl0(wc2Var, null, 0);
                sk2Var.h0(L2);
            }
            l.g(sk2Var, (aj2) L2, o27.a);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new rz(zy3Var, pl0Var, ih4Var, ki2Var, i, 1);
        }
    }

    public static void e0(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static final void f(bl0 bl0Var, ki2 ki2Var, mi2 mi2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        bl0Var.getClass();
        ki2Var.getClass();
        mi2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-548343735);
        if (sk2Var.f(bl0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (sk2Var.h(ki2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (sk2Var.h(mi2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        boolean z2 = true;
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i7 & 1, z)) {
            if (!bl0Var.equals(zk0.b)) {
                sk2Var.X(-1947384047);
                Object[] objArr = {bl0Var};
                ci3 ci3Var = pl0.g;
                if ((((i7 & 14) ^ 6) <= 4 || !sk2Var.f(bl0Var)) && (i7 & 6) != 4) {
                    z2 = false;
                }
                Object L = sk2Var.L();
                if (z2 || L == su0.a) {
                    L = new b5(15, bl0Var);
                    sk2Var.h0(L);
                }
                pl0 pl0Var = (pl0) jk2.N(objArr, ci3Var, (ki2) L, sk2Var, 0);
                if (de7.a(sk2Var, 0).a.a >= 840) {
                    sk2Var.X(-1947118501);
                    h(pl0Var, ki2Var, mi2Var, sk2Var, i7 & 1008);
                    sk2Var.p(false);
                } else {
                    sk2Var.X(-1946923914);
                    g(pl0Var, ki2Var, mi2Var, sk2Var, i7 & 1008);
                    sk2Var.p(false);
                }
                sk2Var.p(false);
            } else {
                sk2Var.X(-1946730567);
                sk2Var.p(false);
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new w3(bl0Var, ki2Var, mi2Var, i, 6);
        }
    }

    public static final long f0(float f2, long j) {
        return (Float.floatToRawIntBits(Math.max((float) RecyclerView.A1, Float.intBitsToFloat((int) (j >> 32)) - f2)) << 32) | (Float.floatToRawIntBits(Math.max((float) RecyclerView.A1, Float.intBitsToFloat((int) (j & 4294967295L)) - f2)) & 4294967295L);
    }

    public static final void g(pl0 pl0Var, ki2 ki2Var, mi2 mi2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1421209610);
        if (sk2Var.f(pl0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (sk2Var.h(ki2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (sk2Var.h(mi2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i7 & 1, z)) {
            if ((i7 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i7 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = z2 | z3;
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (z5 || L == sn1Var) {
                L = new cl0(pl0Var, mi2Var, 1);
                sk2Var.h0(L);
            }
            ki2 ki2Var2 = (ki2) L;
            if ((((Configuration) sk2Var.j(ue.a)).uiMode & 48) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            Context context = (Context) sk2Var.j(ue.b);
            View view = (View) sk2Var.j(ue.f);
            boolean f2 = sk2Var.f(context) | sk2Var.f(view);
            Object L2 = sk2Var.L();
            if (f2 || L2 == sn1Var) {
                context.getClass();
                L2 = new cg7(((Activity) context).getWindow(), view);
                sk2Var.h0(L2);
            }
            cg7 cg7Var = (cg7) L2;
            cg7Var.getClass();
            boolean h = sk2Var.h(cg7Var) | sk2Var.g(z4);
            Object L3 = sk2Var.L();
            if (h || L3 == sn1Var) {
                L3 = new py(cg7Var, z4, 1);
                sk2Var.h0(L3);
            }
            l.d(o27.a, (mi2) L3, sk2Var);
            hi2.a(ki2Var, ct3.H0(-1505530067, new jl0(pl0Var, ki2Var, ki2Var2, 0), sk2Var), sk2Var, ((i7 >> 3) & 14) | 48);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new il0(pl0Var, ki2Var, mi2Var, i, 1);
        }
    }

    public static void g0(String str) {
        RuntimeException runtimeException = new RuntimeException(wh1.A("lateinit property ", str, " has not been initialized"));
        e0(runtimeException, b53.class.getName());
        throw runtimeException;
    }

    public static final void h(pl0 pl0Var, ki2 ki2Var, mi2 mi2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        int i5;
        int i6;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1520793769);
        if (sk2Var.f(pl0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i2 | i;
        if (sk2Var.h(ki2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (sk2Var.h(mi2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i9 = i8 | i4;
        boolean z3 = true;
        if ((i9 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i9 & 1, z)) {
            if ((i9 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i9 & 896) != 256) {
                z3 = false;
            }
            boolean z4 = z2 | z3;
            Object L = sk2Var.L();
            if (z4 || L == su0.a) {
                L = new cl0(pl0Var, mi2Var, 0);
                sk2Var.h0(L);
            }
            ki2 ki2Var2 = (ki2) L;
            if (pl0Var.a) {
                i5 = -1193917191;
                i6 = R.string.new_cheat;
            } else {
                i5 = -1193915910;
                i6 = R.string.edit_cheat;
            }
            mh7.a(b31.o(sk2Var, i5, i6, sk2Var, false), ki2Var, ct3.H0(-979761630, new gl0(pl0Var, ki2Var2, 0), sk2Var), ct3.H0(-1109498528, new hl0(ki2Var, ki2Var2, 0), sk2Var), false, sk2Var, (i9 & 112) | 3456, 16);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new il0(pl0Var, ki2Var, mi2Var, i, 0);
        }
    }

    public static final Object[] h0(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArr2, i2);
            }
            i = i2;
        }
    }

    public static final cf i(String str) {
        return new cf(hi2.X(str));
    }

    public static final Object[] i0(Collection collection, Object[] objArr) {
        Object[] objArr2;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
        } else {
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                if (objArr.length > 0) {
                    objArr[0] = null;
                }
            } else {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    newInstance.getClass();
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i2] = null;
                            return objArr;
                        }
                        return Arrays.copyOf(objArr2, i2);
                    }
                    i = i2;
                }
            }
        }
        return objArr;
    }

    public static final void j(w61 w61Var, ki2 ki2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        boolean z;
        w61 w61Var2;
        sk2 sk2Var;
        Context context;
        k24 k24Var;
        sk2 sk2Var2;
        sn1 sn1Var;
        nm4 nm4Var;
        k24 k24Var2;
        j11 j11Var;
        ki2 ki2Var2 = ki2Var;
        ki2Var2.getClass();
        sk2 sk2Var3 = (sk2) tu0Var;
        sk2Var3.Z(-134762069);
        if (sk2Var3.h(w61Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (sk2Var3.h(ki2Var2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var3.O(i5 & 1, z)) {
            k24 m = me2.m(w61Var.f, sk2Var3);
            q45 q45Var = w61Var.h;
            Boolean bool = Boolean.FALSE;
            k24 l = me2.l(q45Var, bool, null, sk2Var3, 48, 2);
            Context context2 = (Context) sk2Var3.j(ue.b);
            Object[] objArr = {null};
            Object L = sk2Var3.L();
            sn1 sn1Var2 = su0.a;
            if (L == sn1Var2) {
                L = new d5(26);
                sk2Var3.h0(L);
            }
            k24 k24Var3 = (k24) jk2.M(objArr, (ki2) L, sk2Var3, 48);
            boolean h = sk2Var3.h(w61Var);
            Object L2 = sk2Var3.L();
            if (!h && L2 != sn1Var2) {
                sk2Var2 = sk2Var3;
                context = context2;
                k24Var = k24Var3;
                sn1Var = sn1Var2;
            } else {
                context = context2;
                k24Var = k24Var3;
                sk2Var2 = sk2Var3;
                sn1Var = sn1Var2;
                j60 j60Var = new j60(3, w61Var, w61.class, "importDSiWareTitleFile", "importDSiWareTitleFile(Lme/magnum/melonds/domain/model/DSiWareTitle;Lme/magnum/melonds/domain/model/dsinand/DSiWareTitleFileType;Landroid/net/Uri;)V", 0, 0, 3);
                sk2Var2.h0(j60Var);
                L2 = j60Var;
            }
            bj2 bj2Var = (bj2) ((lj2) L2);
            bj2Var.getClass();
            nm4 nm4Var2 = nm4.READ;
            final k24 L3 = me2.L(bj2Var, sk2Var2);
            Object L4 = sk2Var2.L();
            if (L4 == sn1Var) {
                L4 = new Object();
                sk2Var2.h0(L4);
            }
            final l71 l71Var = (l71) L4;
            vf1 vf1Var = new vf1(nm4Var2, 1);
            boolean h2 = sk2Var2.h(l71Var) | sk2Var2.f(L3);
            Object L5 = sk2Var2.L();
            if (h2 || L5 == sn1Var) {
                L5 = new mi2() { // from class: j71
                    @Override // defpackage.mi2
                    public final Object n(Object obj) {
                        m71 m71Var;
                        m71 m71Var2;
                        int i6 = r3;
                        o27 o27Var = o27.a;
                        k24 k24Var4 = L3;
                        l71 l71Var2 = l71Var;
                        Uri uri = (Uri) obj;
                        switch (i6) {
                            case 0:
                                if (uri != null) {
                                    DSiWareTitle dSiWareTitle = l71Var2.a;
                                    if (dSiWareTitle != null && (m71Var = l71Var2.b) != null) {
                                        ((bj2) k24Var4.getValue()).i(dSiWareTitle, m71Var, uri);
                                    }
                                    return o27Var;
                                }
                                l71Var2.a = null;
                                l71Var2.b = null;
                                return o27Var;
                            default:
                                if (uri != null) {
                                    DSiWareTitle dSiWareTitle2 = l71Var2.a;
                                    if (dSiWareTitle2 != null && (m71Var2 = l71Var2.b) != null) {
                                        ((bj2) k24Var4.getValue()).i(dSiWareTitle2, m71Var2, uri);
                                    }
                                    return o27Var;
                                }
                                l71Var2.a = null;
                                l71Var2.b = null;
                                return o27Var;
                        }
                    }
                };
                sk2Var2.h0(L5);
            }
            gt3 z2 = tq5.z(vf1Var, (mi2) L5, sk2Var2, 0);
            Object L6 = sk2Var2.L();
            if (L6 == sn1Var) {
                L6 = new k71(l71Var, z2);
                sk2Var2.h0(L6);
            }
            k71 k71Var = (k71) L6;
            boolean h3 = sk2Var2.h(w61Var);
            Object L7 = sk2Var2.L();
            if (!h3 && L7 != sn1Var) {
                nm4Var = nm4Var2;
            } else {
                nm4Var = nm4Var2;
                j60 j60Var2 = new j60(3, w61Var, w61.class, "exportDSiWareTitleFile", "exportDSiWareTitleFile(Lme/magnum/melonds/domain/model/DSiWareTitle;Lme/magnum/melonds/domain/model/dsinand/DSiWareTitleFileType;Landroid/net/Uri;)V", 0, 0, 2);
                sk2Var2.h0(j60Var2);
                L7 = j60Var2;
            }
            bj2 bj2Var2 = (bj2) ((lj2) L7);
            bj2Var2.getClass();
            final k24 L8 = me2.L(bj2Var2, sk2Var2);
            Object L9 = sk2Var2.L();
            if (L9 == sn1Var) {
                L9 = new Object();
                sk2Var2.h0(L9);
            }
            final l71 l71Var2 = (l71) L9;
            b9 b9Var = new b9(5);
            boolean h4 = sk2Var2.h(l71Var2) | sk2Var2.f(L8);
            Object L10 = sk2Var2.L();
            if (h4 || L10 == sn1Var) {
                L10 = new mi2() { // from class: j71
                    @Override // defpackage.mi2
                    public final Object n(Object obj) {
                        m71 m71Var;
                        m71 m71Var2;
                        int i6 = r3;
                        o27 o27Var = o27.a;
                        k24 k24Var4 = L8;
                        l71 l71Var22 = l71Var2;
                        Uri uri = (Uri) obj;
                        switch (i6) {
                            case 0:
                                if (uri != null) {
                                    DSiWareTitle dSiWareTitle = l71Var22.a;
                                    if (dSiWareTitle != null && (m71Var = l71Var22.b) != null) {
                                        ((bj2) k24Var4.getValue()).i(dSiWareTitle, m71Var, uri);
                                    }
                                    return o27Var;
                                }
                                l71Var22.a = null;
                                l71Var22.b = null;
                                return o27Var;
                            default:
                                if (uri != null) {
                                    DSiWareTitle dSiWareTitle2 = l71Var22.a;
                                    if (dSiWareTitle2 != null && (m71Var2 = l71Var22.b) != null) {
                                        ((bj2) k24Var4.getValue()).i(dSiWareTitle2, m71Var2, uri);
                                    }
                                    return o27Var;
                                }
                                l71Var22.a = null;
                                l71Var22.b = null;
                                return o27Var;
                        }
                    }
                };
                sk2Var2.h0(L10);
            }
            gt3 z3 = tq5.z(b9Var, (mi2) L10, sk2Var2, 0);
            Object L11 = sk2Var2.L();
            if (L11 == sn1Var) {
                L11 = new n71(l71Var2, z3);
                sk2Var2.h0(L11);
            }
            n71 n71Var = (n71) L11;
            vf1 vf1Var2 = new vf1(nm4Var, 1);
            boolean h5 = sk2Var2.h(w61Var);
            Object L12 = sk2Var2.L();
            if (h5 || L12 == sn1Var) {
                L12 = new j0(18, w61Var);
                sk2Var2.h0(L12);
            }
            gt3 z4 = tq5.z(vf1Var2, (mi2) L12, sk2Var2, 0);
            r61 r61Var = (r61) m.getValue();
            Object L13 = sk2Var2.L();
            if (L13 == sn1Var) {
                L13 = me2.G(bool);
                sk2Var2.h0(L13);
            }
            k24 k24Var4 = (k24) L13;
            sn1 sn1Var3 = sn1Var;
            sk2 sk2Var4 = sk2Var2;
            w61Var2 = w61Var;
            ep2.h(me2.X(sk2Var2, R.string.dsiware_manager), ki2Var, null, null, ct3.H0(-689990950, new s4(8, r61Var, k24Var4), sk2Var2), null, ct3.H0(1272777695, new g61(r61Var, w61Var, k71Var, n71Var, 0), sk2Var2), sk2Var4, (i5 & 112) | 1597440, 44);
            ki2Var2 = ki2Var;
            sk2Var = sk2Var4;
            if (((Boolean) k24Var4.getValue()).booleanValue()) {
                sk2Var.X(1100604213);
                String X = me2.X(sk2Var, R.string.import_dsiware_title);
                Object L14 = sk2Var.L();
                if (L14 == sn1Var3) {
                    L14 = new f4(k24Var4, 19);
                    sk2Var.h0(L14);
                }
                k24Var2 = k24Var;
                n40.g(X, (ki2) L14, ct3.H0(-1505443618, new m4(z4, k24Var2, k24Var4, 3), sk2Var), sk2Var, 432);
                sk2Var.p(false);
            } else {
                k24Var2 = k24Var;
                sk2Var.X(1101159671);
                sk2Var.p(false);
            }
            if (((Boolean) k24Var2.getValue()).booleanValue()) {
                sk2Var.X(1101199072);
                boolean f2 = sk2Var.f(k24Var2);
                Object L15 = sk2Var.L();
                if (f2 || L15 == sn1Var3) {
                    L15 = new f4(k24Var2, 20);
                    sk2Var.h0(L15);
                }
                ki2 ki2Var3 = (ki2) L15;
                boolean h6 = sk2Var.h(w61Var2) | sk2Var.f(k24Var2);
                Object L16 = sk2Var.L();
                if (h6 || L16 == sn1Var3) {
                    L16 = new x(20, w61Var2, k24Var2);
                    sk2Var.h0(L16);
                }
                j11Var = null;
                n40.m(null, ki2Var3, (mi2) L16, sk2Var, 0);
                sk2Var.p(false);
            } else {
                j11Var = null;
                sk2Var.X(1101436439);
                sk2Var.p(false);
            }
            if (((Boolean) l.getValue()).booleanValue()) {
                sk2Var.X(1101485202);
                ff1 ff1Var = new ff1(4);
                Object L17 = sk2Var.L();
                if (L17 == sn1Var3) {
                    L17 = new d5(17);
                    sk2Var.h0(L17);
                }
                dt3.t((ki2) L17, ff1Var, pu.b, sk2Var, 438, 0);
                sk2Var.p(false);
            } else {
                sk2Var.X(1101711223);
                sk2Var.p(false);
            }
            Context context3 = context;
            boolean h7 = sk2Var.h(w61Var2) | sk2Var.h(context3);
            Object L18 = sk2Var.L();
            if (h7 || L18 == sn1Var3) {
                L18 = new i61(w61Var2, context3, j11Var, 0);
                sk2Var.h0(L18);
            }
            l.g(sk2Var, (aj2) L18, j11Var);
            boolean h8 = sk2Var.h(w61Var2) | sk2Var.h(context3);
            Object L19 = sk2Var.L();
            if (h8 || L19 == sn1Var3) {
                L19 = new i61(w61Var2, context3, j11Var, 1);
                sk2Var.h0(L19);
            }
            l.g(sk2Var, (aj2) L19, j11Var);
        } else {
            w61Var2 = w61Var;
            sk2Var = sk2Var3;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new s4(i, 9, w61Var2, ki2Var2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [y81, java.lang.Object] */
    public static final gp0 j0(to toVar) {
        List list;
        SpannableString spannableString;
        byte b2;
        List list2 = toVar.L;
        List list3 = pp1.A;
        if (list2 == null) {
            list = list3;
        } else {
            list = list2;
        }
        String str = toVar.B;
        if (!list.isEmpty()) {
            SpannableString spannableString2 = new SpannableString(str);
            ?? obj = new Object();
            obj.a = Parcel.obtain();
            if (list2 == null) {
                list2 = list3;
            }
            int size = list2.size();
            int i = 0;
            while (i < size) {
                so soVar = (so) list2.get(i);
                xb6 xb6Var = (xb6) soVar.a;
                int i2 = soVar.b;
                int i3 = soVar.c;
                obj.a.recycle();
                obj.a = Parcel.obtain();
                qq6 qq6Var = xb6Var.a;
                long j = xb6Var.l;
                long j2 = xb6Var.h;
                int i4 = i;
                long j3 = xb6Var.b;
                List list4 = list2;
                int i5 = size;
                long b3 = qq6Var.b();
                long j4 = xq0.h;
                if (!xq0.c(b3, j4)) {
                    obj.c((byte) 1);
                    spannableString = spannableString2;
                    obj.a.writeLong(xb6Var.a.b());
                } else {
                    spannableString = spannableString2;
                }
                long j5 = is6.c;
                byte b4 = 2;
                if (!is6.a(j3, j5)) {
                    obj.c((byte) 2);
                    obj.e(j3);
                }
                pe2 pe2Var = xb6Var.c;
                if (pe2Var != null) {
                    obj.c((byte) 3);
                    obj.a.writeInt(pe2Var.A);
                }
                ke2 ke2Var = xb6Var.d;
                if (ke2Var != null) {
                    int i6 = ke2Var.a;
                    obj.c((byte) 4);
                    if (i6 == 0 || i6 != 1) {
                        b2 = 0;
                    } else {
                        b2 = 1;
                    }
                    obj.c(b2);
                }
                le2 le2Var = xb6Var.e;
                if (le2Var != null) {
                    int i7 = le2Var.a;
                    obj.c((byte) 5);
                    if (i7 != 0) {
                        if (i7 == 65535) {
                            b4 = 1;
                        } else if (i7 != 1) {
                            if (i7 == 2) {
                                b4 = 3;
                            }
                        }
                        obj.c(b4);
                    }
                    b4 = 0;
                    obj.c(b4);
                }
                String str2 = xb6Var.g;
                if (str2 != null) {
                    obj.c((byte) 6);
                    obj.a.writeString(str2);
                }
                if (!is6.a(j2, j5)) {
                    obj.c((byte) 7);
                    obj.e(j2);
                }
                d10 d10Var = xb6Var.i;
                if (d10Var != null) {
                    float f2 = d10Var.a;
                    obj.c((byte) 8);
                    obj.d(f2);
                }
                rq6 rq6Var = xb6Var.j;
                if (rq6Var != null) {
                    obj.c((byte) 9);
                    obj.d(rq6Var.a);
                    obj.d(rq6Var.b);
                }
                if (!xq0.c(j, j4)) {
                    obj.c((byte) 10);
                    obj.a.writeLong(j);
                }
                qo6 qo6Var = xb6Var.m;
                if (qo6Var != null) {
                    obj.c((byte) 11);
                    obj.a.writeInt(qo6Var.a);
                }
                u26 u26Var = xb6Var.n;
                if (u26Var != null) {
                    obj.c((byte) 12);
                    obj.a.writeLong(u26Var.a);
                    long j6 = u26Var.b;
                    obj.d(Float.intBitsToFloat((int) (j6 >> 32)));
                    obj.d(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                    obj.d(u26Var.c);
                }
                SpannableString spannableString3 = spannableString;
                spannableString3.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(obj.a.marshall(), 0)), i2, i3, 33);
                i = i4 + 1;
                spannableString2 = spannableString3;
                list2 = list4;
                size = i5;
            }
            str = spannableString2;
        }
        return new gp0(ClipData.newPlainText("plain text", str));
    }

    public static final void k(zy3 zy3Var, ih4 ih4Var, List list, mi2 mi2Var, aj2 aj2Var, aj2 aj2Var2, mi2 mi2Var2, tu0 tu0Var, int i) {
        zy3 zy3Var2;
        int i2;
        mi2 mi2Var3;
        aj2 aj2Var3;
        aj2 aj2Var4;
        mi2 mi2Var4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        mh4 mh4Var;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-858350362);
        if ((i & 6) == 0) {
            zy3Var2 = zy3Var;
            if (sk2Var.f(zy3Var2)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            zy3Var2 = zy3Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.f(ih4Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(list)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            mi2Var3 = mi2Var;
            if (sk2Var.h(mi2Var3)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        } else {
            mi2Var3 = mi2Var;
        }
        if ((i & 24576) == 0) {
            aj2Var3 = aj2Var;
            if (sk2Var.h(aj2Var3)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        } else {
            aj2Var3 = aj2Var;
        }
        if ((196608 & i) == 0) {
            aj2Var4 = aj2Var2;
            if (sk2Var.h(aj2Var4)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        } else {
            aj2Var4 = aj2Var2;
        }
        if ((1572864 & i) == 0) {
            mi2Var4 = mi2Var2;
            if (sk2Var.h(mi2Var4)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        } else {
            mi2Var4 = mi2Var2;
        }
        boolean z5 = false;
        if ((599187 & i2) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            zy3 B = l07.B(zy3Var, ih4Var);
            ye6 ye6Var = ov0.n;
            mh4 mh4Var2 = new mh4(B(ih4Var, (sd3) sk2Var.j(ye6Var)), ih4Var.d(), A(ih4Var, (sd3) sk2Var.j(ye6Var)), ih4Var.c() + 16.0f + 56.0f + 16.0f);
            boolean h = sk2Var.h(list);
            if ((i2 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z6 = h | z2;
            if ((57344 & i2) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z7 = z6 | z3;
            if ((458752 & i2) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z8 = z7 | z4;
            if ((i2 & 3670016) == 1048576) {
                z5 = true;
            }
            boolean z9 = z8 | z5;
            Object L = sk2Var.L();
            if (!z9 && L != su0.a) {
                mh4Var = mh4Var2;
            } else {
                aj2 aj2Var5 = aj2Var4;
                mh4Var = mh4Var2;
                e5 e5Var = new e5(list, mi2Var3, aj2Var3, aj2Var5, mi2Var4);
                sk2Var.h0(e5Var);
                L = e5Var;
            }
            io2.b(B, null, mh4Var, null, null, null, false, null, (mi2) L, sk2Var, 0, 506);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new f61(zy3Var2, ih4Var, list, mi2Var, aj2Var, aj2Var2, mi2Var2, i, 1);
        }
    }

    public static final long k0(int i, om1 om1Var) {
        om1Var.getClass();
        if (om1Var.compareTo(om1.SECONDS) <= 0) {
            long j = i;
            om1 om1Var2 = om1.NANOSECONDS;
            om1Var2.getClass();
            long convert = om1Var2.getTimeUnit$kotlin_stdlib().convert(j, om1Var.getTimeUnit$kotlin_stdlib());
            hm1 hm1Var = im1.B;
            long j2 = convert << 1;
            int i2 = km1.a;
            return j2;
        }
        return l0(i, om1Var);
    }

    public static final void l(ef1 ef1Var, tu0 tu0Var, int i) {
        int i2;
        boolean isAtLeast;
        xa6 xa6Var;
        ef1 ef1Var2 = ef1Var;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(294589392);
        if (sk2Var.h(ef1Var2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        if (((i2 | i) & 3) == 2 && sk2Var.A()) {
            sk2Var.R();
        } else {
            kt5 c0 = gk2.c0(sk2Var);
            k24 m = me2.m(ef1Var2.b().e, sk2Var);
            List list = (List) m.getValue();
            boolean booleanValue = ((Boolean) sk2Var.j(j23.a)).booleanValue();
            boolean f2 = sk2Var.f(list);
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            xa6 xa6Var2 = L;
            if (f2 || L == sn1Var) {
                xa6 xa6Var3 = new xa6();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    l34 l34Var = (l34) obj;
                    if (booleanValue) {
                        isAtLeast = true;
                    } else {
                        isAtLeast = ((in3) l34Var.c0.k).d.isAtLeast(qm3.STARTED);
                    }
                    if (isAtLeast) {
                        arrayList.add(obj);
                    }
                }
                xa6Var3.addAll(arrayList);
                sk2Var.h0(xa6Var3);
                xa6Var2 = xa6Var3;
            }
            xa6 xa6Var4 = xa6Var2;
            s(xa6Var4, (List) m.getValue(), sk2Var, 0);
            k24 m2 = me2.m(ef1Var2.b().f, sk2Var);
            Object L2 = sk2Var.L();
            if (L2 == sn1Var) {
                L2 = new xa6();
                sk2Var.h0(L2);
            }
            xa6 xa6Var5 = (xa6) L2;
            sk2Var.X(-367418626);
            ListIterator listIterator = xa6Var4.listIterator();
            while (true) {
                wr2 wr2Var = (wr2) listIterator;
                if (!wr2Var.hasNext()) {
                    break;
                }
                l34 l34Var2 = (l34) wr2Var.next();
                b44 b44Var = l34Var2.B;
                b44Var.getClass();
                df1 df1Var = (df1) b44Var;
                boolean h = sk2Var.h(ef1Var2) | sk2Var.h(l34Var2);
                Object L3 = sk2Var.L();
                if (h || L3 == sn1Var) {
                    L3 = new p6(25, ef1Var2, l34Var2);
                    sk2Var.h0(L3);
                }
                dt3.t((ki2) L3, df1Var.Y, ct3.H0(1129586364, new af1(l34Var2, ef1Var2, c0, xa6Var5, df1Var), sk2Var), sk2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                ef1Var2 = ef1Var2;
                c0 = c0;
                xa6Var5 = xa6Var5;
            }
            ef1 ef1Var3 = ef1Var2;
            xa6 xa6Var6 = xa6Var5;
            sk2Var.p(false);
            Set set = (Set) m2.getValue();
            boolean f3 = sk2Var.f(m2) | sk2Var.h(ef1Var3);
            Object L4 = sk2Var.L();
            if (!f3 && L4 != sn1Var) {
                ef1Var2 = ef1Var3;
                xa6Var = xa6Var6;
            } else {
                ef1Var2 = ef1Var3;
                xa6Var = xa6Var6;
                ug ugVar = new ug(m2, ef1Var2, xa6Var, null, 2);
                sk2Var.h0(ugVar);
                L4 = ugVar;
            }
            l.h(set, xa6Var, (aj2) L4, sk2Var);
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new z5(i, 9, ef1Var2);
        }
    }

    public static final long l0(long j, om1 om1Var) {
        om1Var.getClass();
        om1 om1Var2 = om1.NANOSECONDS;
        om1Var2.getClass();
        long convert = om1Var.getTimeUnit$kotlin_stdlib().convert(4611686018426999999L, om1Var2.getTimeUnit$kotlin_stdlib());
        if ((-convert) <= j && j <= convert) {
            long convert2 = om1Var2.getTimeUnit$kotlin_stdlib().convert(j, om1Var.getTimeUnit$kotlin_stdlib());
            hm1 hm1Var = im1.B;
            long j2 = convert2 << 1;
            int i = km1.a;
            return j2;
        }
        om1 om1Var3 = om1.MILLISECONDS;
        if (om1Var.compareTo(om1Var3) >= 0) {
            long signum = Long.signum(j);
            if (j < -9223372036854775807L) {
                j = -9223372036854775807L;
            }
            return H(ct3.R(Math.abs(j), om1Var) * signum);
        }
        om1Var3.getClass();
        return H(io2.o(om1Var3.getTimeUnit$kotlin_stdlib().convert(j, om1Var.getTimeUnit$kotlin_stdlib()), -4611686018427387903L, 4611686018427387903L));
    }

    public static final void m(zy3 zy3Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        int i3;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-853335576);
        if ((i & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            zy3 X = X(zy3Var, 24.0f);
            tv3 d2 = d50.d(y60.Z, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, X);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d2);
            oo2.S(sk2Var, mu0.e, l);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            ir6.b(me2.X(sk2Var, R.string.dsiware_manager_load_error), null, 0L, 0L, null, null, 0L, new kn6(3), 0L, 0, false, 0, 0, null, null, sk2Var, 0, 0, 130558);
            sk2Var = sk2Var;
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new g5(zy3Var, i, 3, (byte) 0);
        }
    }

    public static final u01 m0(z02 z02Var, h32 h32Var) {
        return new u01(z02Var, h32Var, RecyclerView.A1, new r76(dn.L));
    }

    public static final void n(zy3 zy3Var, gw0 gw0Var, ki2 ki2Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(121602030);
        if ((i & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.d(gw0Var.ordinal())) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(ki2Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            Context context = (Context) sk2Var.j(ue.b);
            b9 b9Var = new b9(4);
            if ((i2 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (z2 || L == sn1Var) {
                L = new el0(3, ki2Var);
                sk2Var.h0(L);
            }
            gt3 z5 = tq5.z(b9Var, (mi2) L, sk2Var, 0);
            zy3 X = X(zy3Var, 24.0f);
            lr0 a2 = jr0.a(rt.d, y60.k0, sk2Var, 54);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, X);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, a2);
            oo2.S(sk2Var, mu0.e, l);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            int i6 = m61.a[gw0Var.ordinal()];
            wy3 wy3Var = wy3.a;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        sk2Var.X(-1376837873);
                        sk2Var.p(false);
                        z4 = true;
                    } else {
                        throw ej6.d(sk2Var, -44468706, false);
                    }
                } else {
                    sk2Var.X(-1377651034);
                    ir6.b(me2.X(sk2Var, R.string.dsiware_manager_invalid_dsi_setup), null, 0L, 0L, null, null, 0L, new kn6(3), 0L, 0, false, 0, 0, null, null, sk2Var, 0, 0, 130558);
                    sk2Var = sk2Var;
                    cg2.k(sk2Var, o76.d(wy3Var, 8.0f));
                    boolean h = sk2Var.h(context) | sk2Var.h(z5);
                    Object L2 = sk2Var.L();
                    if (!h && L2 != sn1Var) {
                        z4 = true;
                    } else {
                        z4 = true;
                        L2 = new e61(context, z5, 1);
                        sk2Var.h0(L2);
                    }
                    l.c((ki2) L2, null, false, null, null, pu.v(sk2Var), null, pu.d, sk2Var, 805306368, 382);
                    sk2Var.p(false);
                }
            } else {
                sk2Var.X(-1378481617);
                ir6.b(me2.X(sk2Var, R.string.dsiware_manager_no_dsi_setup), null, 0L, 0L, null, null, 0L, new kn6(3), 0L, 0, false, 0, 0, null, null, sk2Var, 0, 0, 130558);
                sk2Var = sk2Var;
                cg2.k(sk2Var, o76.d(wy3Var, 8.0f));
                boolean h2 = sk2Var.h(context) | sk2Var.h(z5);
                Object L3 = sk2Var.L();
                if (!h2 && L3 != sn1Var) {
                    z3 = false;
                } else {
                    z3 = false;
                    L3 = new e61(context, z5, 0);
                    sk2Var.h0(L3);
                }
                l.c((ki2) L3, null, false, null, null, pu.v(sk2Var), null, pu.c, sk2Var, 805306368, 382);
                sk2Var.p(z3);
                z4 = true;
            }
            sk2Var.p(z4);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new fl(zy3Var, gw0Var, ki2Var, i, 7);
        }
    }

    public static final void o(zy3 zy3Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-791636580);
        if (sk2Var.f(zy3Var)) {
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
            tv3 d2 = d50.d(y60.L, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, zy3Var);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d2);
            oo2.S(sk2Var, mu0.e, l);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            yu4.a(y60.n0.i(wy3.a, y60.Z), mj2.C(sk2Var).j, RecyclerView.A1, 0L, 0, sk2Var, 0, 28);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new ez(zy3Var, i, 1);
        }
    }

    public static final void p(zy3 zy3Var, c6 c6Var, boolean z, ki2 ki2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        zy3 zy3Var2;
        long f2;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1758575878);
        int i5 = i | 6;
        if (sk2Var.h(c6Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i6 = i5 | i2;
        if (sk2Var.g(z)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i7 = i6 | i3;
        if (sk2Var.h(ki2Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if ((i8 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i8 & 1, z2)) {
            fr5 a2 = gr5.a();
            zy3Var2 = wy3.a;
            zy3 Y = Y(n40.d0(a53.t(zy3Var2, a2), z, null, ki2Var, 14), 32.0f, 8.0f);
            sr5 a3 = rr5.a(new ot(8.0f, true, new a31(2, y60.k0)), y60.h0, sk2Var, 54);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, Y);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, a3);
            oo2.S(sk2Var, mu0.e, l);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            if (((Boolean) sk2Var.j(j23.a)).booleanValue()) {
                sk2Var.X(130077244);
                d50.a(dk7.i(o76.h(zy3Var2, 24.0f), xq0.c, iq2.g), sk2Var, 6);
                sk2Var.p(false);
            } else {
                sk2Var.X(130175607);
                zy3 h = o76.h(zy3Var2, 24.0f);
                tw2 tw2Var = new tw2((Context) sk2Var.j(ue.b));
                tw2Var.c = c6Var.d.toString();
                tw2Var.b(true);
                cg2.b(tw2Var.a(), null, h, null, RecyclerView.A1, sk2Var, 432, 4088);
                sk2Var.p(false);
            }
            String str = c6Var.b;
            if (str == null) {
                str = b31.o(sk2Var, 2082420514, R.string.ra_base_set, sk2Var, false);
            } else {
                sk2Var.X(2082420018);
                sk2Var.p(false);
            }
            String str2 = str;
            ds6 ds6Var = ((c17) sk2Var.j(d17.b)).j;
            if (z) {
                sk2Var.X(2082425129);
                f2 = ((hr0) sk2Var.j(ir0.a)).e();
            } else {
                sk2Var.X(2082426343);
                f2 = ((hr0) sk2Var.j(ir0.a)).f();
            }
            sk2Var.p(false);
            ir6.b(str2, null, f2, 0L, null, null, 0L, null, hi2.B(16), 0, false, 2, 0, null, ds6Var, sk2Var, 0, 3078, 56314);
            sk2Var = sk2Var;
            sk2Var.p(true);
        } else {
            sk2Var.R();
            zy3Var2 = zy3Var;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new i7(zy3Var2, c6Var, z, ki2Var, i);
        }
    }

    public static mh4 q(int i, float f2) {
        int i2 = i & 1;
        float f3 = RecyclerView.A1;
        if (i2 != 0) {
            f2 = 0.0f;
        }
        if ((i & 2) == 0) {
            f3 = 40.0f;
        }
        return new mh4(f2, f3, f2, f3);
    }

    public static mh4 r(float f2, float f3, float f4, int i) {
        float f5;
        if ((i & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i & 4) != 0) {
            f5 = 0.0f;
        } else {
            f5 = 4.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return new mh4(f2, f3, f5, f4);
    }

    public static final void s(List list, Collection collection, tu0 tu0Var, int i) {
        int i2;
        int i3;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1537894851);
        if (sk2Var.h(list)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (sk2Var.h(collection)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        if (((i4 | i3) & 19) == 18 && sk2Var.A()) {
            sk2Var.R();
        } else {
            boolean booleanValue = ((Boolean) sk2Var.j(j23.a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                l34 l34Var = (l34) it.next();
                in3 in3Var = (in3) l34Var.c0.k;
                boolean g = sk2Var.g(booleanValue) | sk2Var.h(list) | sk2Var.h(l34Var);
                Object L = sk2Var.L();
                if (g || L == su0.a) {
                    L = new xe1(l34Var, list, booleanValue);
                    sk2Var.h0(L);
                }
                l.d(in3Var, (mi2) L, sk2Var);
            }
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new s4(i, 12, list, collection);
        }
    }

    public static final void t(zy3 zy3Var, ih4 ih4Var, List list, mi2 mi2Var, aj2 aj2Var, aj2 aj2Var2, mi2 mi2Var2, tu0 tu0Var, int i) {
        int i2;
        List list2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-866377154);
        if ((i & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.f(ih4Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            list2 = list;
            if (sk2Var.h(list2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        } else {
            list2 = list;
        }
        if ((i & 3072) == 0) {
            if (sk2Var.h(mi2Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (sk2Var.h(aj2Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (sk2Var.h(aj2Var2)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (sk2Var.h(mi2Var2)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        if ((599187 & i2) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            tv3 d2 = d50.d(y60.L, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, zy3Var);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d2);
            oo2.S(sk2Var, mu0.e, l);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            y60 y60Var = y60.n0;
            if (list2.isEmpty()) {
                sk2Var.X(-1810956402);
                ir6.b(me2.X(sk2Var, R.string.no_dsiware_titles_installed), X(y60Var.i(l07.B(W(wy3.a, ih4Var), ih4Var), y60.Z), 24.0f), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var, 0, 0, 131068);
                sk2Var = sk2Var;
                sk2Var.p(false);
            } else {
                sk2Var.X(-1810624454);
                k(o76.c, ih4Var, list, mi2Var, aj2Var, aj2Var2, mi2Var2, sk2Var, (i2 & 112) | 6 | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (i2 & 3670016));
                sk2Var.p(false);
            }
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new f61(zy3Var, ih4Var, list, mi2Var, aj2Var, aj2Var2, mi2Var2, i, 0);
        }
    }

    public static final void u(int i, int i2) {
        if (i >= 0 && i < i2) {
            return;
        }
        throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
    }

    public static final long v(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            if (j2 != 4611686018427387903L && j2 != -4611686018427387903L) {
                return io2.o(j + j2, -4611686018427387903L, 4611686018427387903L);
            }
            return j2;
        } else if (-4611686018427387903L < j2 && j2 < 4611686018427387903L) {
            return j;
        } else {
            if ((j2 ^ j) >= 0) {
                return j;
            }
            return 9223372036854759646L;
        }
    }

    public static boolean x(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static final boolean y(me6 me6Var, int i, g1 g1Var, boolean z) {
        boolean z2;
        synchronized (d) {
            try {
                int i2 = me6Var.d;
                if (i2 == i) {
                    me6Var.c = g1Var;
                    z2 = true;
                    if (z) {
                        me6Var.e++;
                    }
                    me6Var.d = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final zy3 z(float f2, long j, zy3 zy3Var, y26 y26Var) {
        return zy3Var.f(new d40(f2, new mb6(j), y26Var));
    }

    public abstract int w(int i, int i2, sd3 sd3Var);
}
