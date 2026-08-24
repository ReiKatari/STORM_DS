package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Path;
import android.graphics.Typeface;
import android.media.ImageReader;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import com.stormds.emulator.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ln2  reason: default package */
/* loaded from: classes.dex */
public abstract class ln2 {
    public static final /* synthetic */ int a = 0;
    public static long b;
    public static Method c;
    public static Method d;
    public static Method e;
    public static Method f;

    public static final fp A(c37 c37Var) {
        fp fpVar = c37Var.a;
        long j = c37Var.b;
        fpVar.getClass();
        return fpVar.subSequence(k47.f(j), k47.e(j));
    }

    public static final fp C(c37 c37Var, int i) {
        fp fpVar = c37Var.a;
        fp fpVar2 = c37Var.a;
        long j = c37Var.b;
        int e2 = k47.e(j);
        int e3 = k47.e(j);
        int i2 = e3 + i;
        if (((i ^ i2) & (e3 ^ i2)) < 0) {
            i2 = fpVar2.B.length();
        }
        return fpVar.subSequence(e2, Math.min(i2, fpVar2.B.length()));
    }

    public static final fp D(c37 c37Var, int i) {
        fp fpVar = c37Var.a;
        long j = c37Var.b;
        int f2 = k47.f(j);
        int i2 = f2 - i;
        if (((f2 ^ i2) & (i ^ f2)) < 0) {
            i2 = 0;
        }
        return fpVar.subSequence(Math.max(0, i2), k47.f(j));
    }

    public static final a47 E(ta6 ta6Var) {
        qn2 qn2Var;
        ArrayList arrayList = new ArrayList();
        Object g = ta6Var.A.g(sa6.a);
        if (g == null) {
            g = null;
        }
        y1 y1Var = (y1) g;
        if (y1Var == null || (qn2Var = (qn2) y1Var.b) == null || !((Boolean) qn2Var.g(arrayList)).booleanValue()) {
            return null;
        }
        return (a47) arrayList.get(0);
    }

    public static void F(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = ((InvocationTargetException) exc).getCause();
            if (cause instanceof RuntimeException) {
                throw cause;
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static final boolean G(String str) {
        String replace = str.replace((char) 0, '\t');
        replace.getClass();
        return qs6.v0(replace);
    }

    public static final boolean H() {
        if (Build.VERSION.SDK_INT >= 29) {
            return rp.f();
        }
        try {
            if (c == null) {
                b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            Method method = c;
            if (method != null) {
                Object invoke = method.invoke(null, Long.valueOf(b));
                invoke.getClass();
                return ((Boolean) invoke).booleanValue();
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Exception e2) {
            F("isTagEnabled", e2);
            return false;
        }
    }

    public static final String L(Collection collection) {
        return rs6.Q(gt0.P0(collection, ",", null, null, null, 62)).concat(rs6.Q(" }"));
    }

    public static final String M(Collection collection) {
        return rs6.Q(gt0.P0(collection, ",", null, null, null, 62)).concat(rs6.Q("},"));
    }

    public static vl6 N(vl6 vl6Var) {
        if (vl6Var instanceof nb7) {
            nb7 nb7Var = (nb7) vl6Var;
            if (nb7Var.t == kj2.s()) {
                nb7Var.r = null;
                return vl6Var;
            }
        }
        if (vl6Var instanceof ob7) {
            ob7 ob7Var = (ob7) vl6Var;
            if (ob7Var.i == kj2.s()) {
                ob7Var.h = null;
                return vl6Var;
            }
        }
        vl6 g = bm6.g(vl6Var, null, false);
        g.j();
        return g;
    }

    public static final da5 O(ka5 ka5Var) {
        ea5 ea5Var = ka5Var.a;
        long j = ea5Var.a;
        String str = ea5Var.b;
        String str2 = ea5Var.c;
        URL url = new URL(ea5Var.d);
        List list = ka5Var.b;
        int i = 10;
        ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v75 v75Var = (v75) it.next();
            List<p75> list2 = v75Var.b;
            ArrayList arrayList2 = new ArrayList(ht0.v0(list2, i));
            for (p75 p75Var : list2) {
                arrayList2.add(kn2.S(p75Var));
            }
            List<va5> list3 = v75Var.c;
            ArrayList arrayList3 = new ArrayList(ht0.v0(list3, i));
            for (va5 va5Var : list3) {
                va5Var.getClass();
                arrayList3.add(new ta5(va5Var.a, va5Var.b, va5Var.c, va5Var.d, va5Var.e, va5Var.f, va5Var.g, va5Var.h, va5Var.i));
                v75Var = v75Var;
                it = it;
            }
            Iterator it2 = it;
            t75 t75Var = v75Var.a;
            long j2 = t75Var.a;
            long j3 = t75Var.b;
            String str3 = t75Var.c;
            r75 valueOf = r75.valueOf(t75Var.d);
            URL url2 = new URI(t75Var.e).toURL();
            url2.getClass();
            arrayList.add(new s75(j2, j3, valueOf, str3, url2, arrayList2, arrayList3));
            it = it2;
            i = 10;
        }
        return new da5(j, str2, url, str, arrayList);
    }

    public static Typeface P(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int weight;
        int i3;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i = configuration.fontWeightAdjustment;
            if (i != Integer.MAX_VALUE) {
                i2 = configuration.fontWeightAdjustment;
                if (i2 != 0 && typeface != null) {
                    weight = typeface.getWeight();
                    i3 = configuration.fontWeightAdjustment;
                    create = Typeface.create(typeface, ej2.q(i3 + weight, 1, 1000), typeface.isItalic());
                    return create;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static Object Q(gi1 gi1Var, on2 on2Var) {
        oa4 oa4Var;
        vl6 nb7Var;
        vl6 vl6Var = (vl6) bm6.b.f();
        if (vl6Var instanceof nb7) {
            nb7 nb7Var2 = (nb7) vl6Var;
            if (nb7Var2.t == kj2.s()) {
                qn2 qn2Var = nb7Var2.r;
                qn2 qn2Var2 = nb7Var2.s;
                try {
                    ((nb7) vl6Var).r = bm6.k(gi1Var, qn2Var, true);
                    ((nb7) vl6Var).s = qn2Var2;
                    return on2Var.c();
                } finally {
                    nb7Var2.r = qn2Var;
                    nb7Var2.s = qn2Var2;
                }
            }
        }
        if (vl6Var != null && !(vl6Var instanceof oa4)) {
            nb7Var = vl6Var.u(gi1Var);
        } else {
            if (vl6Var instanceof oa4) {
                oa4Var = (oa4) vl6Var;
            } else {
                oa4Var = null;
            }
            nb7Var = new nb7(oa4Var, gi1Var, null, true, false);
        }
        try {
            vl6 j = nb7Var.j();
            Object c2 = on2Var.c();
            vl6.q(j);
            nb7Var.c();
            return c2;
        } catch (Throwable th) {
            nb7Var.c();
            throw th;
        }
    }

    public static yw2 R(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length % 2 == 0) {
            String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
            int length = strArr3.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (strArr3[i2] != null) {
                    strArr3[i2] = qs6.T0(strArr2[i2]).toString();
                } else {
                    i.h("Headers cannot be null");
                    return null;
                }
            }
            int s = nj2.s(0, strArr3.length - 1, 2);
            if (s >= 0) {
                while (true) {
                    String str = strArr3[i];
                    String str2 = strArr3[i + 1];
                    ft7.c(str);
                    ft7.d(str2, str);
                    if (i == s) {
                        break;
                    }
                    i += 2;
                }
            }
            return new yw2(strArr3);
        }
        i.h("Expected alternating header names and values");
        return null;
    }

    public static final void T(wu wuVar, qn2 qn2Var) {
        wuVar.getClass();
        ci6 ci6Var = new ci6(999);
        int i = wuVar.L;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            ci6Var.put(wuVar.f(i2), wuVar.i(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                qn2Var.g(ci6Var);
                ci6Var.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            qn2Var.g(ci6Var);
        }
    }

    public static final void U(hz3 hz3Var, qn2 qn2Var) {
        hz3Var.getClass();
        hz3 hz3Var2 = new hz3(999);
        int i = hz3Var.i();
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            hz3Var2.f(hz3Var.e(i2), hz3Var.j(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                qn2Var.g(hz3Var2);
                hz3Var2.a();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            qn2Var.g(hz3Var2);
        }
    }

    public static void V(vl6 vl6Var, vl6 vl6Var2, qn2 qn2Var) {
        if (vl6Var == vl6Var2) {
            if (vl6Var instanceof nb7) {
                ((nb7) vl6Var).r = qn2Var;
                return;
            } else if (vl6Var instanceof ob7) {
                ((ob7) vl6Var).h = qn2Var;
                return;
            } else {
                e41.h(vl6Var, "Non-transparent snapshot was reused: ");
                return;
            }
        }
        vl6Var2.getClass();
        vl6.q(vl6Var);
        vl6Var2.c();
    }

    public static final m93 W(of5 of5Var) {
        return new m93(Math.round(of5Var.a), Math.round(of5Var.b), Math.round(of5Var.c), Math.round(of5Var.d));
    }

    public static final a74 X(a74 a74Var, float f2) {
        int i = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
        if (i == 0 && i == 0) {
            return a74Var;
        }
        return hv.I(a74Var, f2, f2, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, null, 524284);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0078 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int Y(int i, CharSequence charSequence) {
        char charAt;
        if (i >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i) == '<') {
            while (true) {
                i++;
                if (i >= charSequence.length() || (charAt = charSequence.charAt(i)) == '\n' || charAt == '<') {
                    break;
                } else if (charAt != '>') {
                    if (charAt == '\\') {
                        int i2 = i + 1;
                        if (bl2.H(i2, charSequence)) {
                            i = i2;
                        }
                    }
                } else {
                    return i + 1;
                }
            }
            return -1;
        }
        int i3 = 0;
        int i4 = i;
        while (i4 < charSequence.length()) {
            char charAt2 = charSequence.charAt(i4);
            if (charAt2 != 0 && charAt2 != ' ') {
                if (charAt2 != '\\') {
                    if (charAt2 != '(') {
                        if (charAt2 != ')') {
                            if (Character.isISOControl(charAt2)) {
                                if (i4 != i) {
                                }
                            }
                        } else if (i3 != 0) {
                            i3--;
                        } else {
                            return i4;
                        }
                    } else {
                        i3++;
                        if (i3 > 32) {
                            return -1;
                        }
                    }
                } else {
                    int i5 = i4 + 1;
                    if (bl2.H(i5, charSequence)) {
                        i4 = i5;
                    }
                }
                i4++;
            } else if (i4 == i) {
                return -1;
            } else {
                return i4;
            }
        }
        return charSequence.length();
    }

    public static int Z(int i, CharSequence charSequence) {
        while (i < charSequence.length()) {
            switch (charSequence.charAt(i)) {
                case '[':
                    return -1;
                case '\\':
                    int i2 = i + 1;
                    if (!bl2.H(i2, charSequence)) {
                        break;
                    } else {
                        i = i2;
                        break;
                    }
                case ']':
                    return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final void a(ta4 ta4Var, qa4 qa4Var, s76 s76Var, a74 a74Var, zv0 zv0Var, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        qa4 qa4Var2;
        float f2;
        hr1 hr1Var;
        sc7 Y;
        boolean z2;
        float f3;
        float f4;
        sc7 Y2;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1077393800);
        if (xq2Var.f(ta4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (xq2Var.f(s76Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i7 = i6 | i3;
        if (xq2Var.f(a74Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (xq2Var.h(zv0Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i8 | i5;
        if ((i9 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i9 & 1, z)) {
            ga7 J = n16.J(ta4Var, "DropDownMenu", xq2Var, (i9 & 14) | 48, 0);
            wc7 wc7Var = nw7.e0;
            gx0 gx0Var = J.a;
            vs4 vs4Var = J.d;
            boolean booleanValue = ((Boolean) gx0Var.f()).booleanValue();
            xq2Var.b0(-1833869404);
            float f5 = 0.8f;
            if (booleanValue) {
                f2 = 1.0f;
            } else {
                f2 = 0.8f;
            }
            xq2Var.p(false);
            Float valueOf = Float.valueOf(f2);
            boolean booleanValue2 = ((Boolean) vs4Var.getValue()).booleanValue();
            xq2Var.b0(-1833869404);
            if (booleanValue2) {
                f5 = 1.0f;
            }
            xq2Var.p(false);
            Float valueOf2 = Float.valueOf(f5);
            aa7 f6 = J.f();
            xq2Var.b0(445475263);
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            if (f6.b(bool, bool2)) {
                Y = ge7.Y(120, 0, ir1.b, 2);
                z2 = false;
                hr1Var = null;
            } else {
                hr1Var = null;
                Y = ge7.Y(1, 74, null, 4);
                z2 = false;
            }
            xq2Var.p(z2);
            hr1 hr1Var2 = hr1Var;
            ca7 t = n16.t(J, valueOf, valueOf2, Y, wc7Var, xq2Var, 0);
            boolean booleanValue3 = ((Boolean) J.a.f()).booleanValue();
            xq2Var.b0(-1578341192);
            if (booleanValue3) {
                f3 = 1.0f;
            } else {
                f3 = RecyclerView.B1;
            }
            xq2Var.p(false);
            Float valueOf3 = Float.valueOf(f3);
            boolean booleanValue4 = ((Boolean) vs4Var.getValue()).booleanValue();
            xq2Var.b0(-1578341192);
            if (booleanValue4) {
                f4 = 1.0f;
            } else {
                f4 = RecyclerView.B1;
            }
            xq2Var.p(false);
            Float valueOf4 = Float.valueOf(f4);
            aa7 f7 = J.f();
            xq2Var.b0(701003475);
            if (f7.b(bool, bool2)) {
                Y2 = ge7.Y(30, 0, hr1Var2, 6);
            } else {
                Y2 = ge7.Y(75, 0, hr1Var2, 6);
            }
            xq2Var.p(false);
            ca7 t2 = n16.t(J, valueOf3, valueOf4, Y2, wc7Var, xq2Var, 0);
            boolean f8 = xq2Var.f(t) | xq2Var.f(t2);
            Object P = xq2Var.P();
            if (!f8 && P != ox0.a) {
                qa4Var2 = qa4Var;
            } else {
                qa4Var2 = qa4Var;
                P = new t00(qa4Var2, t, t2, 17);
                xq2Var.l0(P);
            }
            hf.b(hv.G(x64.a, (qn2) P), null, 0L, 8.0f, n16.I(-707086267, new x3(a74Var, s76Var, zv0Var, 22), xq2Var), xq2Var, 1769472, 30);
            xq2Var = xq2Var;
        } else {
            qa4Var2 = qa4Var;
            xq2Var.V();
        }
        cf5 t3 = xq2Var.t();
        if (t3 != null) {
            t3.d = new qi(ta4Var, qa4Var2, s76Var, a74Var, zv0Var, i);
        }
    }

    public static int a0(CharSequence charSequence, int i, char c2) {
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            if (charAt == '\\') {
                int i2 = i + 1;
                if (bl2.H(i2, charSequence)) {
                    i = i2;
                    i++;
                }
            }
            if (charAt == c2) {
                return i;
            }
            if (c2 == ')' && charAt == '(') {
                return -1;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final void b(on2 on2Var, a74 a74Var, lq4 lq4Var, fo2 fo2Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-674391690);
        if ((i & 6) == 0) {
            if (xq2Var.h(on2Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.f(a74Var)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.g(true)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (xq2Var.f(lq4Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (xq2Var.f(null)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (xq2Var.h(fo2Var)) {
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
        if (xq2Var.S(i2 & 1, z)) {
            a74 N = ge7.N(dj6.k(dj6.c(mb3.t(a74Var, null, jq5.a(6, 0L, true), true, null, on2Var, 24), 1.0f), 112.0f, 48.0f, 280.0f, Float.NaN), lq4Var);
            l26 a2 = k26.a(ju.a, d90.i0, xq2Var, 48);
            int B = ge7.B(xq2Var);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, N);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a2);
            yh2.K(xq2Var, ix0.e, l);
            pn pnVar = ix0.g;
            if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B))) {
                i61.v(B, xq2Var, B, pnVar);
            }
            yh2.K(xq2Var, ix0.d, E);
            x37.a(((xe7) xq2Var.j(ye7.b)).g, n16.I(-77738101, new fq(fo2Var, 1), xq2Var), xq2Var, 48);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new i10(on2Var, a74Var, lq4Var, fo2Var, i);
        }
    }

    public static final void b0(zm zmVar, int i) {
        Object obj;
        Iterator<T> it = zmVar.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((sm3) ((Map.Entry) obj).getKey()).B == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null && entry.getValue() != null) {
            u34.a();
        }
    }

    public static final void c(on2 on2Var, zv0 zv0Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1642214335);
        if ((i & 6) == 0) {
            if (xq2Var.h(on2Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.h(zv0Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            View view = (View) xq2Var.j(kf.f);
            vq2 T = ge7.T(xq2Var);
            qa4 b0 = np2.b0(zv0Var, xq2Var);
            qa4 b02 = np2.b0(on2Var, xq2Var);
            Object[] objArr = new Object[0];
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = new ns1(3);
                xq2Var.l0(P);
            }
            UUID uuid = (UUID) qo2.I(objArr, (on2) P, xq2Var, 48);
            Object[] objArr2 = new Object[0];
            Object P2 = xq2Var.P();
            if (P2 == vs0Var) {
                P2 = new ns1(4);
                xq2Var.l0(P2);
            }
            qa4 qa4Var = (qa4) qo2.I(objArr2, (on2) P2, xq2Var, 48);
            Object P3 = xq2Var.P();
            mn2 mn2Var = P3;
            if (P3 == vs0Var) {
                boolean booleanValue = ((Boolean) qa4Var.getValue()).booleanValue();
                uuid.getClass();
                mn2 mn2Var2 = new mn2(view, booleanValue, uuid);
                zv0 zv0Var2 = new zv0(-1221710001, true, new e4(b0, 3));
                mn2Var2.setParentCompositionContext(T);
                mn2Var2.m0.setValue(zv0Var2);
                mn2Var2.l0 = true;
                mn2Var2.k0 = (on2) b02.getValue();
                xq2Var.l0(mn2Var2);
                mn2Var = mn2Var2;
            }
            mn2 mn2Var3 = (mn2) mn2Var;
            boolean h = xq2Var.h(mn2Var3) | xq2Var.f(qa4Var);
            Object P4 = xq2Var.P();
            if (h || P4 == vs0Var) {
                P4 = new bi2(2, mn2Var3, qa4Var);
                xq2Var.l0(P4);
            }
            mb3.d(mn2Var3, (qn2) P4, xq2Var);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new hp(on2Var, i, 5, zv0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x0348, code lost:
        if (r7.d(0) == false) goto L271;
     */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x049b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(a74 a74Var, final ue1 ue1Var, final lq4 lq4Var, final lo4 lo4Var, final ql6 ql6Var, final boolean z, final sg sgVar, final cs1 cs1Var, ae4 ae4Var, final d40 d40Var, final cs1 cs1Var2, final zv0 zv0Var, px0 px0Var, final int i, final int i2) {
        int i3;
        int i4;
        a74 a74Var2;
        xq2 xq2Var;
        boolean z2;
        boolean f2;
        Object P;
        lo4 lo4Var2;
        int i5;
        int i6;
        qo3 qo3Var;
        boolean z3;
        boolean g;
        Object P2;
        boolean z4;
        Object P3;
        boolean f3;
        Object P4;
        a74 a74Var3;
        a74 d2;
        ae4 ae4Var2 = ae4Var;
        c40 c40Var = d90.l0;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-572816025);
        if ((i & 6) == 0) {
            i3 = i | (xq2Var2.f(a74Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq2Var2.f(ue1Var) ? 32 : 16;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            i3 |= xq2Var2.f(lq4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= xq2Var2.g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= xq2Var2.d(lo4Var.ordinal()) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= xq2Var2.f(ql6Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= xq2Var2.g(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= xq2Var2.f(sgVar) ? 8388608 : Compress.MAXWINSIZE;
        }
        if ((i & 100663296) == 0) {
            i3 |= xq2Var2.d(0) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= xq2Var2.c(RecyclerView.B1) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (xq2Var2.f(cs1Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= xq2Var2.h(ae4Var2) ? 32 : 16;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            i4 |= xq2Var2.h(null) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= xq2Var2.f(c40Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= xq2Var2.f(d40Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= xq2Var2.f(cs1Var2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= xq2Var2.h(zv0Var) ? 1048576 : 524288;
        }
        int i7 = i4;
        if (xq2Var2.S(i3 & 1, ((i3 & 306783379) == 306783378 && (599187 & i7) == 599186) ? false : true)) {
            int i8 = i3 & 112;
            boolean z5 = i8 == 32;
            Object P5 = xq2Var2.P();
            Object obj = ox0.a;
            if (z5 || P5 == obj) {
                P5 = new on2() { // from class: iq3
                    @Override // defpackage.on2
                    public final Object c() {
                        int n;
                        int i9 = r2;
                        ue1 ue1Var2 = ue1Var;
                        switch (i9) {
                            case 0:
                                n = ue1Var2.n();
                                break;
                            default:
                                n = ue1Var2.n();
                                break;
                        }
                        return Integer.valueOf(n);
                    }
                };
                xq2Var2.l0(P5);
            }
            on2 on2Var = (on2) P5;
            int i9 = i3 >> 3;
            int i10 = i9 & 14;
            int i11 = i7 >> 15;
            int i12 = i10 | (i11 & 112) | (i7 & 896);
            qa4 b0 = np2.b0(zv0Var, xq2Var2);
            qa4 b02 = np2.b0(null, xq2Var2);
            boolean f4 = ((((i12 & 14) ^ 6) > 4 && xq2Var2.f(ue1Var)) || (i12 & 6) == 4) | xq2Var2.f(b0) | xq2Var2.f(b02) | xq2Var2.f(on2Var);
            Object P6 = xq2Var2.P();
            if (f4 || P6 == obj) {
                vs0 vs0Var = vs0.s0;
                P6 = new qo3(0, 1, pp6.class, np2.J(new ci2(10, np2.J(new u6(b0, b02, on2Var, 13), vs0Var), ue1Var), vs0Var), "value", "getValue()Ljava/lang/Object;");
                xq2Var2.l0(P6);
            }
            qo3 qo3Var2 = (qo3) P6;
            Object P7 = xq2Var2.P();
            if (P7 == obj) {
                P7 = mb3.w(xq2Var2);
                xq2Var2.l0(P7);
            }
            w61 w61Var = (w61) P7;
            boolean z6 = i8 == 32;
            Object P8 = xq2Var2.P();
            if (z6 || P8 == obj) {
                P8 = new on2() { // from class: iq3
                    @Override // defpackage.on2
                    public final Object c() {
                        int n;
                        int i92 = r2;
                        ue1 ue1Var2 = ue1Var;
                        switch (i92) {
                            case 0:
                                n = ue1Var2.n();
                                break;
                            default:
                                n = ue1Var2.n();
                                break;
                        }
                        return Integer.valueOf(n);
                    }
                };
                xq2Var2.l0(P8);
            }
            on2 on2Var2 = (on2) P8;
            int i13 = i3 >> 9;
            int i14 = (i3 & 65520) | (i13 & 458752) | (i13 & 3670016) | ((i7 << 21) & 29360128);
            int i15 = i7 << 15;
            int i16 = i14 | (i15 & 234881024) | (i15 & 1879048192);
            boolean f5 = ((((i16 & 896) ^ RendererDebugBridge.CAPTURE_HEIGHT) > 256 && xq2Var2.f(lq4Var)) || (i16 & RendererDebugBridge.CAPTURE_HEIGHT) == 256) | ((((i16 & 112) ^ 48) > 32 && xq2Var2.f(ue1Var)) || (i16 & 48) == 32) | ((((i16 & 7168) ^ 3072) > 2048 && xq2Var2.g(false)) || (i16 & 3072) == 2048) | ((((57344 & i16) ^ 24576) > 16384 && xq2Var2.d(lo4Var.ordinal())) || (i16 & 24576) == 16384) | ((((i16 & 234881024) ^ 100663296) > 67108864 && xq2Var2.f(c40Var)) || (i16 & 100663296) == 67108864) | ((((i16 & 1879048192) ^ 805306368) > 536870912 && xq2Var2.f(d40Var)) || (i16 & 805306368) == 536870912) | ((((i16 & 3670016) ^ 1572864) > 1048576 && xq2Var2.c(RecyclerView.B1)) || (i16 & 1572864) == 1048576) | ((((i16 & 29360128) ^ 12582912) > 8388608 && xq2Var2.f(cs1Var)) || (i16 & 12582912) == 8388608) | ((((i11 & 14) ^ 6) > 4 && xq2Var2.f(cs1Var2)) || (i11 & 6) == 4) | xq2Var2.f(on2Var2);
            boolean z7 = ((i16 & 458752) ^ 196608) > 131072 ? false : false;
            if ((i16 & 196608) != 131072) {
                z2 = z7;
                f2 = z2 | f5 | xq2Var2.f(w61Var);
                P = xq2Var2.P();
                if (!f2 || P == obj) {
                    lo4Var2 = lo4Var;
                    xq2Var = xq2Var2;
                    i5 = i8;
                    i6 = 32;
                    P = new br4(ue1Var, lo4Var2, lq4Var, cs1Var, qo3Var2, on2Var2, d40Var, cs1Var2, w61Var);
                    qo3Var = qo3Var2;
                    xq2Var.l0(P);
                } else {
                    lo4Var2 = lo4Var;
                    xq2Var = xq2Var2;
                    qo3Var = qo3Var2;
                    i5 = i8;
                    i6 = 32;
                }
                eq3 eq3Var = (eq3) P;
                lo4 lo4Var3 = lo4.Vertical;
                z3 = lo4Var2 != lo4Var3;
                g = (((i10 ^ 6) <= 4 && xq2Var.f(ue1Var)) || (i9 & 6) == 4) | xq2Var.g(z3);
                P2 = xq2Var.P();
                if (!g || P2 == obj) {
                    P2 = new uq3(ue1Var, z3);
                    xq2Var.l0(P2);
                }
                tq3 tq3Var = (tq3) P2;
                z4 = ((i3 & 458752) != 131072) | (i5 != i6);
                P3 = xq2Var.P();
                if (!z4 || P3 == obj) {
                    P3 = new rr4(ql6Var, ue1Var);
                    xq2Var.l0(P3);
                }
                rr4 rr4Var = (rr4) P3;
                z70 z70Var = (z70) xq2Var.j(b80.a);
                kk3 kk3Var = (kk3) xq2Var.j(ky0.n);
                xq2Var.b0(-853904960);
                f3 = (i5 != i6) | xq2Var.f(z70Var) | xq2Var.d(kk3Var.ordinal());
                P4 = xq2Var.P();
                if (!f3 || P4 == obj) {
                    P4 = new tq4(ue1Var, z70Var, kk3Var);
                    xq2Var.l0(P4);
                }
                tq4 tq4Var = (tq4) P4;
                xq2Var.p(false);
                x64 x64Var = x64.a;
                if (!z) {
                    xq2Var.b0(-853484445);
                    int i17 = i10 | ((i3 >> 21) & 112);
                    boolean z8 = ((((i17 & 112) ^ 48) > i6 && xq2Var.d(0)) || (i17 & 48) == i6) | ((((i17 & 14) ^ 6) > 4 && xq2Var.f(ue1Var)) || (i17 & 6) == 4);
                    Object P9 = xq2Var.P();
                    if (z8 || P9 == obj) {
                        P9 = new sq4(ue1Var);
                        xq2Var.l0(P9);
                    }
                    a74Var3 = ak7.n0((sq4) P9, ue1Var.u, lo4Var2);
                    xq2Var.p(false);
                } else {
                    xq2Var.b0(-853054661);
                    xq2Var.p(false);
                    a74Var3 = x64Var;
                }
                a74Var2 = a74Var;
                a74 p0 = vy7.p0(a74Var2.d(ue1Var.x).d(ue1Var.v), qo3Var, tq3Var, lo4Var2, z);
                boolean z9 = lo4Var2 != lo4Var3;
                if (!z) {
                    d2 = p0.d(ua6.a(x64Var, false, new bj1(1, ue1Var, w61Var, z9)));
                } else {
                    d2 = p0.d(x64Var);
                }
                ae4Var2 = ae4Var;
                kn2.e(qo3Var, mb3.L(f04.O(d2.d(a74Var3), ue1Var, lo4Var2, sgVar, z, rr4Var, ue1Var.p, tq4Var).d(jw6.a(x64Var, ue1Var, new rg(ue1Var, 2))), ae4Var2), ue1Var.s, eq3Var, xq2Var, 0);
            }
            z2 = true;
            f2 = z2 | f5 | xq2Var2.f(w61Var);
            P = xq2Var2.P();
            if (f2) {
            }
            lo4Var2 = lo4Var;
            xq2Var = xq2Var2;
            i5 = i8;
            i6 = 32;
            P = new br4(ue1Var, lo4Var2, lq4Var, cs1Var, qo3Var2, on2Var2, d40Var, cs1Var2, w61Var);
            qo3Var = qo3Var2;
            xq2Var.l0(P);
            eq3 eq3Var2 = (eq3) P;
            lo4 lo4Var32 = lo4.Vertical;
            if (lo4Var2 != lo4Var32) {
            }
            g = (((i10 ^ 6) <= 4 && xq2Var.f(ue1Var)) || (i9 & 6) == 4) | xq2Var.g(z3);
            P2 = xq2Var.P();
            if (!g) {
            }
            P2 = new uq3(ue1Var, z3);
            xq2Var.l0(P2);
            tq3 tq3Var2 = (tq3) P2;
            if (i5 != i6) {
            }
            z4 = ((i3 & 458752) != 131072) | (i5 != i6);
            P3 = xq2Var.P();
            if (!z4) {
            }
            P3 = new rr4(ql6Var, ue1Var);
            xq2Var.l0(P3);
            rr4 rr4Var2 = (rr4) P3;
            z70 z70Var2 = (z70) xq2Var.j(b80.a);
            kk3 kk3Var2 = (kk3) xq2Var.j(ky0.n);
            xq2Var.b0(-853904960);
            f3 = (i5 != i6) | xq2Var.f(z70Var2) | xq2Var.d(kk3Var2.ordinal());
            P4 = xq2Var.P();
            if (!f3) {
            }
            P4 = new tq4(ue1Var, z70Var2, kk3Var2);
            xq2Var.l0(P4);
            tq4 tq4Var2 = (tq4) P4;
            xq2Var.p(false);
            x64 x64Var2 = x64.a;
            if (!z) {
            }
            a74Var2 = a74Var;
            a74 p02 = vy7.p0(a74Var2.d(ue1Var.x).d(ue1Var.v), qo3Var, tq3Var2, lo4Var2, z);
            if (lo4Var2 != lo4Var32) {
            }
            if (!z) {
            }
            ae4Var2 = ae4Var;
            kn2.e(qo3Var, mb3.L(f04.O(d2.d(a74Var3), ue1Var, lo4Var2, sgVar, z, rr4Var2, ue1Var.p, tq4Var2).d(jw6.a(x64Var2, ue1Var, new rg(ue1Var, 2))), ae4Var2), ue1Var.s, eq3Var2, xq2Var, 0);
        } else {
            a74Var2 = a74Var;
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            final a74 a74Var4 = a74Var2;
            final ae4 ae4Var3 = ae4Var2;
            t.d = new eo2() { // from class: jq3
                @Override // defpackage.eo2
                public final Object o(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int a0 = ii2.a0(i | 1);
                    int a02 = ii2.a0(i2);
                    ln2.d(a74.this, ue1Var, lq4Var, lo4Var, ql6Var, z, sgVar, cs1Var, ae4Var3, d40Var, cs1Var2, zv0Var, (px0) obj2, a0, a02);
                    return jg7.a;
                }
            };
        }
    }

    public static final String d0(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final void e(boolean z, eo2 eo2Var, px0 px0Var, int i) {
        int i2;
        int i3;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1818896922);
        if (xq2Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (xq2Var.h(eo2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) == 18 && xq2Var.E()) {
            xq2Var.V();
        } else {
            jx2.d(z, eo2Var, xq2Var, i5 & 126);
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new v51(z, eo2Var, i);
        }
    }

    public static final void e0(List list, hj hjVar) {
        int i;
        hu4 hu4Var;
        Path path;
        int i2;
        float f2;
        int i3;
        hu4 hu4Var2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        List list2 = list;
        hj hjVar2 = hjVar;
        Path path2 = hjVar2.a;
        Path path3 = hjVar2.a;
        if (path2.getFillType() == Path.FillType.EVEN_ODD) {
            i = 1;
        } else {
            i = 0;
        }
        path3.rewind();
        hjVar2.h(i);
        if (list2.isEmpty()) {
            hu4Var = pt4.c;
        } else {
            hu4Var = (hu4) list2.get(0);
        }
        int size = list2.size();
        float f11 = RecyclerView.B1;
        int i4 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i4 < size) {
            hu4 hu4Var3 = (hu4) list2.get(i4);
            if (hu4Var3 instanceof pt4) {
                path3.close();
                path = path3;
                i2 = size;
                f2 = f11;
                i3 = i4;
                hu4Var2 = hu4Var3;
                f12 = f16;
                f14 = f12;
                f13 = f17;
                f15 = f13;
            } else {
                if (hu4Var3 instanceof bu4) {
                    bu4 bu4Var = (bu4) hu4Var3;
                    float f18 = bu4Var.c;
                    f14 += f18;
                    float f19 = bu4Var.d;
                    f15 += f19;
                    path3.rMoveTo(f18, f19);
                    path = path3;
                    i2 = size;
                    f2 = f11;
                    i3 = i4;
                    f16 = f14;
                    f17 = f15;
                } else {
                    if (hu4Var3 instanceof tt4) {
                        tt4 tt4Var = (tt4) hu4Var3;
                        float f20 = tt4Var.c;
                        float f21 = tt4Var.d;
                        path3.moveTo(f20, f21);
                        f15 = f21;
                        f17 = f15;
                        path = path3;
                        f14 = f20;
                        f16 = f14;
                    } else {
                        if (hu4Var3 instanceof au4) {
                            au4 au4Var = (au4) hu4Var3;
                            float f22 = au4Var.d;
                            float f23 = au4Var.c;
                            path3.rLineTo(f23, f22);
                            f14 += f23;
                            f15 += f22;
                        } else if (hu4Var3 instanceof st4) {
                            st4 st4Var = (st4) hu4Var3;
                            float f24 = st4Var.d;
                            float f25 = st4Var.c;
                            hjVar2.e(f25, f24);
                            f14 = f25;
                            path = path3;
                            f15 = f24;
                        } else if (hu4Var3 instanceof zt4) {
                            float f26 = ((zt4) hu4Var3).c;
                            path3.rLineTo(f26, f11);
                            f14 += f26;
                        } else if (hu4Var3 instanceof rt4) {
                            float f27 = ((rt4) hu4Var3).c;
                            hjVar2.e(f27, f15);
                            f14 = f27;
                        } else {
                            if (hu4Var3 instanceof fu4) {
                                f10 = ((fu4) hu4Var3).c;
                                path3.rLineTo(f11, f10);
                            } else if (hu4Var3 instanceof gu4) {
                                float f28 = ((gu4) hu4Var3).c;
                                hjVar2.e(f14, f28);
                                f15 = f28;
                            } else if (hu4Var3 instanceof yt4) {
                                yt4 yt4Var = (yt4) hu4Var3;
                                path3.rCubicTo(yt4Var.c, yt4Var.d, yt4Var.e, yt4Var.f, yt4Var.g, yt4Var.h);
                                f12 = yt4Var.e + f14;
                                f13 = yt4Var.f + f15;
                                f14 += yt4Var.g;
                                f10 = yt4Var.h;
                            } else {
                                if (hu4Var3 instanceof qt4) {
                                    qt4 qt4Var = (qt4) hu4Var3;
                                    path3.cubicTo(qt4Var.c, qt4Var.d, qt4Var.e, qt4Var.f, qt4Var.g, qt4Var.h);
                                    f12 = qt4Var.e;
                                    f13 = qt4Var.f;
                                    f6 = qt4Var.g;
                                    f7 = qt4Var.h;
                                } else if (hu4Var3 instanceof du4) {
                                    if (hu4Var.a) {
                                        f9 = f15 - f13;
                                        f8 = f14 - f12;
                                    } else {
                                        f8 = f11;
                                        f9 = f8;
                                    }
                                    du4 du4Var = (du4) hu4Var3;
                                    path3.rCubicTo(f8, f9, du4Var.c, du4Var.d, du4Var.e, du4Var.f);
                                    f12 = du4Var.c + f14;
                                    f13 = du4Var.d + f15;
                                    f14 += du4Var.e;
                                    f10 = du4Var.f;
                                } else if (hu4Var3 instanceof vt4) {
                                    if (hu4Var.a) {
                                        f14 = (f14 * 2.0f) - f12;
                                        f15 = (2.0f * f15) - f13;
                                    }
                                    vt4 vt4Var = (vt4) hu4Var3;
                                    path3.cubicTo(f14, f15, vt4Var.c, vt4Var.d, vt4Var.e, vt4Var.f);
                                    f12 = vt4Var.c;
                                    f13 = vt4Var.d;
                                    f6 = vt4Var.e;
                                    f7 = vt4Var.f;
                                } else if (hu4Var3 instanceof cu4) {
                                    cu4 cu4Var = (cu4) hu4Var3;
                                    float f29 = cu4Var.f;
                                    float f30 = cu4Var.e;
                                    float f31 = cu4Var.d;
                                    float f32 = cu4Var.c;
                                    path3.rQuadTo(f32, f31, f30, f29);
                                    float f33 = f32 + f14;
                                    float f34 = f31 + f15;
                                    f14 += f30;
                                    f15 += f29;
                                    f12 = f33;
                                    path = path3;
                                    f13 = f34;
                                } else {
                                    if (hu4Var3 instanceof ut4) {
                                        ut4 ut4Var = (ut4) hu4Var3;
                                        float f35 = ut4Var.f;
                                        float f36 = ut4Var.e;
                                        float f37 = ut4Var.d;
                                        f5 = ut4Var.c;
                                        path3.quadTo(f5, f37, f36, f35);
                                        path = path3;
                                        f15 = f35;
                                        f14 = f36;
                                        f13 = f37;
                                    } else if (hu4Var3 instanceof eu4) {
                                        if (hu4Var.b) {
                                            f3 = f14 - f12;
                                            f4 = f15 - f13;
                                        } else {
                                            f3 = f11;
                                            f4 = f3;
                                        }
                                        eu4 eu4Var = (eu4) hu4Var3;
                                        float f38 = eu4Var.d;
                                        float f39 = eu4Var.c;
                                        path3.rQuadTo(f3, f4, f39, f38);
                                        f5 = f3 + f14;
                                        float f40 = f4 + f15;
                                        f14 += f39;
                                        f15 += f38;
                                        path = path3;
                                        f13 = f40;
                                    } else if (hu4Var3 instanceof wt4) {
                                        if (hu4Var.b) {
                                            f14 = (f14 * 2.0f) - f12;
                                            f15 = (2.0f * f15) - f13;
                                        }
                                        wt4 wt4Var = (wt4) hu4Var3;
                                        float f41 = wt4Var.d;
                                        float f42 = wt4Var.c;
                                        path3.quadTo(f14, f15, f42, f41);
                                        path = path3;
                                        i2 = size;
                                        f2 = f11;
                                        i3 = i4;
                                        f13 = f15;
                                        hu4Var2 = hu4Var3;
                                        f15 = f41;
                                        f12 = f14;
                                        f14 = f42;
                                    } else if (hu4Var3 instanceof xt4) {
                                        xt4 xt4Var = (xt4) hu4Var3;
                                        float f43 = xt4Var.h + f14;
                                        float f44 = xt4Var.i + f15;
                                        double d2 = xt4Var.c;
                                        double d3 = xt4Var.d;
                                        double d4 = xt4Var.e;
                                        boolean z = xt4Var.f;
                                        boolean z2 = xt4Var.g;
                                        i2 = size;
                                        f2 = RecyclerView.B1;
                                        path = path3;
                                        i3 = i4;
                                        p(hjVar, f14, f15, f43, f44, d2, d3, d4, z, z2);
                                        f12 = f43;
                                        f14 = f12;
                                        f13 = f44;
                                        f15 = f13;
                                        hu4Var2 = hu4Var3;
                                    } else {
                                        path = path3;
                                        i2 = size;
                                        f2 = f11;
                                        i3 = i4;
                                        if (hu4Var3 instanceof ot4) {
                                            ot4 ot4Var = (ot4) hu4Var3;
                                            float f45 = ot4Var.i;
                                            float f46 = ot4Var.h;
                                            hu4Var2 = hu4Var3;
                                            p(hjVar, f14, f15, f46, f45, ot4Var.c, ot4Var.d, ot4Var.e, ot4Var.f, ot4Var.g);
                                            f13 = f45;
                                            f15 = f13;
                                            f12 = f46;
                                            f14 = f12;
                                        } else {
                                            i.d();
                                            return;
                                        }
                                    }
                                    i2 = size;
                                    f2 = f11;
                                    i3 = i4;
                                    hu4Var2 = hu4Var3;
                                    f12 = f5;
                                }
                                f15 = f7;
                                path = path3;
                                f14 = f6;
                            }
                            f15 += f10;
                        }
                        path = path3;
                    }
                    i2 = size;
                    f2 = f11;
                    i3 = i4;
                }
                hu4Var2 = hu4Var3;
            }
            i4 = i3 + 1;
            list2 = list;
            hjVar2 = hjVar;
            size = i2;
            path3 = path;
            hu4Var = hu4Var2;
            f11 = f2;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object f(defpackage.mw6 r7, defpackage.d20 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.dq5
            if (r0 == 0) goto L13
            r0 = r8
            dq5 r0 = (defpackage.dq5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            dq5 r0 = new dq5
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            mw6 r7 = r0.R
            defpackage.oi2.Y(r8)
            goto L40
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            r7 = 0
            return r7
        L30:
            defpackage.oi2.Y(r8)
        L33:
            r0.R = r7
            r0.Y = r3
            py4 r8 = defpackage.py4.Main
            java.lang.Object r8 = r7.c(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            oy4 r8 = (defpackage.oy4) r8
            int r2 = r8.d
            java.util.List r8 = r8.a
            r2 = r2 & 66
            if (r2 == 0) goto L33
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L50:
            if (r5 >= r2) goto L62
            java.lang.Object r6 = r8.get(r5)
            vy4 r6 = (defpackage.vy4) r6
            boolean r6 = defpackage.ej2.m(r6)
            if (r6 != 0) goto L5f
            goto L33
        L5f:
            int r5 = r5 + 1
            goto L50
        L62:
            java.lang.Object r7 = r8.get(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln2.f(mw6, d20):java.lang.Object");
    }

    public static String f0(String str) {
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

    public static final z64 g(xg1 xg1Var, int i) {
        z64 z64Var = ((z64) xg1Var).A.Y;
        if (z64Var != null && (z64Var.R & i) != 0) {
            while (z64Var != null) {
                int i2 = z64Var.L;
                if ((i2 & 2) == 0) {
                    if ((i2 & i) != 0) {
                        return z64Var;
                    }
                    z64Var = z64Var.Y;
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [in6, k80, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [in6, k80, java.lang.Object] */
    public static void h(long j, k80 k80Var, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 < i3) {
            for (int i8 = i2; i8 < i3; i8++) {
                if (((da0) arrayList4.get(i8)).d() < i7) {
                    i.h("Failed requirement.");
                    return;
                }
            }
            da0 da0Var = (da0) arrayList.get(i2);
            da0 da0Var2 = (da0) arrayList4.get(i3 - 1);
            if (i7 == da0Var.d()) {
                int intValue = ((Number) arrayList5.get(i2)).intValue();
                int i9 = i2 + 1;
                da0 da0Var3 = (da0) arrayList4.get(i9);
                i4 = i9;
                i5 = intValue;
                da0Var = da0Var3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (da0Var.i(i7) != da0Var2.i(i7)) {
                int i10 = 1;
                for (int i11 = i4 + 1; i11 < i3; i11++) {
                    if (((da0) arrayList4.get(i11 - 1)).i(i7) != ((da0) arrayList4.get(i11)).i(i7)) {
                        i10++;
                    }
                }
                long j3 = (k80Var.B / 4) + j + 2 + (i10 * 2);
                k80Var.q0(i10);
                k80Var.q0(i5);
                for (int i12 = i4; i12 < i3; i12++) {
                    byte i13 = ((da0) arrayList4.get(i12)).i(i7);
                    if (i12 == i4 || i13 != ((da0) arrayList4.get(i12 - 1)).i(i7)) {
                        k80Var.q0(i13 & 255);
                    }
                }
                ?? obj = new Object();
                int i14 = i4;
                while (i14 < i3) {
                    byte i15 = ((da0) arrayList4.get(i14)).i(i7);
                    int i16 = i14 + 1;
                    int i17 = i16;
                    while (true) {
                        if (i17 < i3) {
                            if (i15 != ((da0) arrayList4.get(i17)).i(i7)) {
                                break;
                            }
                            i17++;
                        } else {
                            i17 = i3;
                            break;
                        }
                    }
                    if (i16 == i17 && i7 + 1 == ((da0) arrayList4.get(i14)).d()) {
                        k80Var.q0(((Number) arrayList5.get(i14)).intValue());
                        arrayList3 = arrayList5;
                        j2 = j3;
                        i6 = i17;
                    } else {
                        k80Var.q0(((int) ((obj.B / 4) + j3)) * (-1));
                        arrayList3 = arrayList5;
                        j2 = j3;
                        i6 = i17;
                        h(j2, obj, i7 + 1, arrayList, i14, i6, arrayList3);
                        arrayList4 = arrayList;
                    }
                    j3 = j2;
                    i14 = i6;
                    arrayList5 = arrayList3;
                }
                k80Var.m0(obj);
                return;
            }
            int min = Math.min(da0Var.d(), da0Var2.d());
            int i18 = 0;
            for (int i19 = i7; i19 < min && da0Var.i(i19) == da0Var2.i(i19); i19++) {
                i18++;
            }
            long j4 = (k80Var.B / 4) + j + 2 + i18 + 1;
            k80Var.q0(-i18);
            k80Var.q0(i5);
            int i20 = i7 + i18;
            while (i7 < i20) {
                k80Var.q0(da0Var.i(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i20 == ((da0) arrayList4.get(i4)).d()) {
                    k80Var.q0(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    i.m("Check failed.");
                    return;
                }
            }
            ?? obj2 = new Object();
            k80Var.q0(((int) ((obj2.B / 4) + j4)) * (-1));
            h(j4, obj2, i20, arrayList4, i4, i3, arrayList5);
            k80Var.m0(obj2);
            return;
        }
        i.h("Failed requirement.");
    }

    public static void k(Object obj, String str) {
        if (obj != null) {
            return;
        }
        u34.x(str);
    }

    public static ci l(int i, int i2, int i3, int i4) {
        return new ci(ImageReader.newInstance(i, i2, i3, i4));
    }

    public static final j16 n(Context context, Class cls, String str) {
        if (!qs6.v0(str)) {
            if (!str.equals(":memory:")) {
                return new j16(context, cls, str);
            }
            i.h("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        i.h("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }

    public static final boolean o(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i2++;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return nb3.k(qs6.T0(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final void p(hj hjVar, double d2, double d3, double d4, double d5, double d6, double d7, double d8, boolean z, boolean z2) {
        double d9;
        double d10;
        boolean z3;
        double d11 = d6;
        double d12 = (d8 / 180.0d) * 3.141592653589793d;
        double cos = Math.cos(d12);
        double sin = Math.sin(d12);
        double d13 = ((d3 * sin) + (d2 * cos)) / d11;
        double d14 = ((d3 * cos) + ((-d2) * sin)) / d7;
        double d15 = ((d5 * sin) + (d4 * cos)) / d11;
        double d16 = ((d5 * cos) + ((-d4) * sin)) / d7;
        double d17 = d13 - d15;
        double d18 = d14 - d16;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d14 + d16) / 2.0d;
        double d21 = (d18 * d18) + (d17 * d17);
        if (d21 != 0.0d) {
            double d22 = (1.0d / d21) - 0.25d;
            if (d22 < 0.0d) {
                double sqrt = (float) (Math.sqrt(d21) / 1.99999d);
                p(hjVar, d2, d3, d4, d5, d11 * sqrt, d7 * sqrt, d8, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d22);
            double d23 = d17 * sqrt2;
            double d24 = sqrt2 * d18;
            if (z == z2) {
                d9 = d19 - d24;
                d10 = d20 + d23;
            } else {
                d9 = d19 + d24;
                d10 = d20 - d23;
            }
            double atan2 = Math.atan2(d14 - d10, d13 - d9);
            double atan22 = Math.atan2(d16 - d10, d15 - d9) - atan2;
            int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (i >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 != z3) {
                if (i > 0) {
                    atan22 -= 6.283185307179586d;
                } else {
                    atan22 += 6.283185307179586d;
                }
            }
            double d25 = d9 * d11;
            double d26 = d10 * d7;
            double d27 = (d25 * cos) - (d26 * sin);
            double d28 = (d26 * cos) + (d25 * sin);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(d12);
            double sin2 = Math.sin(d12);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d29 = -d11;
            double d30 = d29 * cos2;
            double d31 = d7 * sin2;
            double d32 = (d30 * sin3) - (d31 * cos3);
            double d33 = d29 * sin2;
            double d34 = d7 * cos2;
            double d35 = (cos3 * d34) + (sin3 * d33);
            double d36 = atan22 / ceil;
            double d37 = atan2;
            double d38 = d32;
            int i2 = 0;
            double d39 = d35;
            double d40 = d3;
            while (i2 < ceil) {
                double d41 = d37 + d36;
                double sin4 = Math.sin(d41);
                double cos4 = Math.cos(d41);
                int i3 = ceil;
                double d42 = (((d11 * cos2) * cos4) + d27) - (d31 * sin4);
                double d43 = (d34 * sin4) + (d11 * sin2 * cos4) + d28;
                double d44 = (d30 * sin4) - (d31 * cos4);
                double d45 = (cos4 * d34) + (sin4 * d33);
                double d46 = d41 - d37;
                double tan = Math.tan(d46 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d46)) / 3.0d;
                double d47 = d33;
                hjVar.a.cubicTo((float) ((d38 * sqrt3) + d2), (float) ((d39 * sqrt3) + d40), (float) (d42 - (sqrt3 * d44)), (float) (d43 - (sqrt3 * d45)), (float) d42, (float) d43);
                d36 = d36;
                sin2 = sin2;
                d27 = d27;
                d2 = d42;
                i2++;
                d33 = d47;
                d37 = d41;
                d39 = d45;
                d38 = d44;
                ceil = i3;
                d40 = d43;
                d11 = d6;
            }
        }
    }

    public static final String q(Collection collection) {
        collection.getClass();
        if (!collection.isEmpty()) {
            return rs6.Q(gt0.P0(collection, ",\n", "\n", "\n", null, 56)).concat("},");
        }
        return " }";
    }

    public static final bp7 r(View view) {
        bp7 bp7Var;
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            if (tag instanceof bp7) {
                bp7Var = (bp7) tag;
            } else {
                bp7Var = null;
            }
            if (bp7Var != null) {
                return bp7Var;
            }
            ViewParent s = xk2.s(view);
            if (s instanceof View) {
                view = (View) s;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static vl6 t() {
        return (vl6) bm6.b.f();
    }

    public abstract int B();

    public abstract boolean I(float f2);

    public abstract boolean J(View view);

    public abstract boolean K(float f2, float f3);

    public abstract c1 S(ea0 ea0Var);

    public abstract boolean c0(View view, float f2);

    public abstract void g0(ViewGroup.MarginLayoutParams marginLayoutParams, int i);

    public abstract void h0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public abstract int i(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract void i0(c1 c1Var);

    public abstract float j(int i);

    public abstract Object m(c1 c1Var);

    public abstract int s(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int u();

    public abstract int v();

    public abstract int w();

    public abstract int x();

    public abstract int y(View view);

    public abstract int z(CoordinatorLayout coordinatorLayout);
}
