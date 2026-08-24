package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Trace;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase;
import com.github.junrar.unpack.decode.Compress;
import com.stormds.emulator.R;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nw7 */
/* loaded from: classes.dex */
public abstract class nw7 implements sc1, ux0 {
    public static final mw A = new Object();
    public static final zv0 B = new zv0(-1894838564, false, new fn0(14));
    public static final zv0 L = new zv0(1851299011, false, new iw0(13));
    public static final zv0 R = new zv0(1365620410, false, new iw0(14));
    public static final hy4 X = new hy4(null, new ux4());
    public static final bk Y = new bk(5);
    public static final StackTraceElement[] Z = new StackTraceElement[0];
    public static final o57 d0 = new o57(0, new long[0], new Object[0]);
    public static final wc7 e0 = new wc7(new h37(14), new rk7(1));
    public static final wc7 f0 = new wc7(new h37(15), new h37(16));
    public static final wc7 g0 = new wc7(new h37(17), new h37(18));
    public static final wc7 h0 = new wc7(new h37(19), new h37(20));
    public static final wc7 i0 = new wc7(new h37(21), new h37(22));
    public static final wc7 j0 = new wc7(new h37(23), new h37(24));
    public static final wc7 k0 = new wc7(new h37(25), new h37(26));
    public static final wc7 l0 = new wc7(new h37(27), new h37(28));
    public static final wc7 m0 = new wc7(new h37(29), new rk7(0));
    public static Method n0;
    public static Method o0;
    public static boolean p0;
    public static e33 q0;
    public static final /* synthetic */ int r0 = 0;
    public static e33 s0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0458  */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, ah5] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, ah5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void D(final ss5 ss5Var, final Map map, final Map map2, final String str, final boolean z, final m06 m06Var, final Set set, final boolean z2, final qn2 qn2Var, final qn2 qn2Var2, final qn2 qn2Var3, final qn2 qn2Var4, final qn2 qn2Var5, final qn2 qn2Var6, final on2 on2Var, final on2 on2Var2, final qn2 qn2Var7, final on2 on2Var3, final on2 on2Var4, final on2 on2Var5, final on2 on2Var6, final on2 on2Var7, final qn2 qn2Var8, final qn2 qn2Var9, qn2 qn2Var10, px0 px0Var, int i) {
        xq2 xq2Var;
        w61 w61Var;
        boolean z3;
        boolean z4;
        boolean f;
        Object P;
        boolean f2;
        Object P2;
        boolean h;
        Object P3;
        boolean z5;
        n65 n65Var;
        es7 es7Var;
        ip3 ip3Var;
        pr3 pr3Var;
        int i2;
        final boolean z6;
        vs0 vs0Var;
        Object P4;
        boolean d;
        Object P5;
        int i3;
        int i4;
        Object P6;
        boolean h2;
        Object P7;
        pr3 pr3Var2;
        ip3 ip3Var2;
        ss5 ss5Var2 = ss5Var;
        ss5Var2.getClass();
        n06 n06Var = ss5Var2.f;
        qw5 qw5Var = ss5Var2.g;
        boolean z7 = ss5Var2.d;
        List list = ss5Var2.a;
        map.getClass();
        map2.getClass();
        str.getClass();
        m06Var.getClass();
        set.getClass();
        qn2Var.getClass();
        qn2Var2.getClass();
        qn2Var3.getClass();
        qn2Var4.getClass();
        qn2Var5.getClass();
        qn2Var6.getClass();
        on2Var.getClass();
        on2Var2.getClass();
        qn2Var7.getClass();
        on2Var3.getClass();
        on2Var4.getClass();
        on2Var5.getClass();
        on2Var6.getClass();
        on2Var7.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(912236056);
        int i5 = i | (xq2Var2.h(ss5Var2) ? 4 : 2) | (xq2Var2.h(map) ? 32 : 16) | (xq2Var2.h(map2) ? 256 : 128) | (xq2Var2.f(str) ? 2048 : 1024) | (xq2Var2.g(z) ? 16384 : 8192) | (xq2Var2.d(m06Var.ordinal()) ? 131072 : 65536) | (xq2Var2.h(set) ? 1048576 : 524288) | (xq2Var2.g(z2) ? 8388608 : 4194304) | (xq2Var2.h(qn2Var) ? 67108864 : 33554432) | (xq2Var2.h(qn2Var2) ? 536870912 : 268435456);
        int i6 = '6' | (xq2Var2.h(qn2Var5) ? (char) 256 : (char) 128) | (xq2Var2.h(qn2Var6) ? 2048 : 1024) | (xq2Var2.h(on2Var) ? 16384 : 8192) | (xq2Var2.h(on2Var2) ? (char) 0 : (char) 0) | (xq2Var2.h(qn2Var7) ? (char) 0 : (char) 0) | (xq2Var2.h(on2Var3) ? (char) 0 : (char) 0) | (xq2Var2.h(on2Var4) ? (char) 0 : (char) 0) | (xq2Var2.h(on2Var5) ? (char) 0 : (char) 0);
        boolean z8 = (xq2Var2.h(on2Var6) ? (char) 4 : (char) 2) | (xq2Var2.h(on2Var7) ? ' ' : (char) 16) | (xq2Var2.h(qn2Var8) ? (char) 256 : (char) 128) | (xq2Var2.h(qn2Var9) ? (char) 2048 : (char) 1024) | (xq2Var2.h(qn2Var10) ? (char) 16384 : (char) 8192);
        if (xq2Var2.S(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 306783379) == 306783378 && (z8 & 9363) == 9362) ? false : true)) {
            es7 F = bl2.F(xq2Var2);
            boolean z9 = m06Var == m06.SCANNING;
            if (om1.a(80.0f, RecyclerView.B1) > 0) {
                Object P8 = xq2Var2.P();
                vs0 vs0Var2 = ox0.a;
                if (P8 == vs0Var2) {
                    P8 = mb3.w(xq2Var2);
                    xq2Var2.l0(P8);
                }
                w61 w61Var2 = (w61) P8;
                qa4 b0 = np2.b0(on2Var2, xq2Var2);
                ?? obj = new Object();
                ?? obj2 = new Object();
                qh1 qh1Var = (qh1) xq2Var2.j(ky0.h);
                obj.A = qh1Var.e0(80.0f);
                obj2.A = qh1Var.e0(56.0f);
                boolean f3 = xq2Var2.f(w61Var2);
                Object P9 = xq2Var2.P();
                if (f3 || P9 == vs0Var2) {
                    P9 = new n65(w61Var2, b0, obj2.A, obj.A);
                    xq2Var2.l0(P9);
                }
                n65 n65Var2 = (n65) P9;
                boolean h3 = xq2Var2.h(n65Var2) | xq2Var2.g(z9) | xq2Var2.c(obj.A) | xq2Var2.c(obj2.A);
                Object P10 = xq2Var2.P();
                if (h3 || P10 == vs0Var2) {
                    P10 = new o65(n65Var2, z9, (ah5) obj, (ah5) obj2);
                    xq2Var2.l0(P10);
                }
                mb3.n((on2) P10, xq2Var2);
                Object P11 = xq2Var2.P();
                if (P11 == vs0Var2) {
                    P11 = mb3.w(xq2Var2);
                    xq2Var2.l0(P11);
                }
                w61 w61Var3 = (w61) P11;
                ip3 a = kp3.a(xq2Var2);
                pr3 a2 = qr3.a(xq2Var2);
                Object P12 = xq2Var2.P();
                if (P12 == vs0Var2) {
                    P12 = new om6();
                    xq2Var2.l0(P12);
                }
                final om6 om6Var = (om6) P12;
                Object P13 = xq2Var2.P();
                if (P13 == vs0Var2) {
                    P13 = new ss4(-1);
                    xq2Var2.l0(P13);
                }
                final ss4 ss4Var = (ss4) P13;
                boolean f4 = xq2Var2.f(list);
                Object P14 = xq2Var2.P();
                if (f4 || P14 == vs0Var2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (!(((nr5) obj3) instanceof lr5)) {
                            break;
                        }
                        arrayList.add(obj3);
                    }
                    P14 = Integer.valueOf(arrayList.size());
                    xq2Var2.l0(P14);
                }
                final int intValue = ((Number) P14).intValue();
                boolean z10 = intValue > 0;
                int size = list.size() - intValue;
                if (!ss5Var2.k.isEmpty() || z10) {
                    w61Var = w61Var3;
                    if (ss5Var2.h == gn6.ALPHABETICALLY) {
                        z3 = true;
                        final boolean z11 = ((ss5Var2.e && ss5Var2.c) || z7 || qw5Var != qw5.ALL || ss5Var2.j.isEmpty()) ? false : true;
                        z4 = !z7;
                        final boolean z12 = z3;
                        List list2 = ss5Var2.b;
                        final boolean z13 = z10;
                        Boolean valueOf = Boolean.valueOf(z7);
                        f = xq2Var2.f(a) | xq2Var2.f(a2);
                        P = xq2Var2.P();
                        if (!f || P == vs0Var2) {
                            P = new u12(a, a2, ss4Var, (r41) null, 26);
                            xq2Var2.l0(P);
                        }
                        eo2 eo2Var = (eo2) P;
                        l61 l61Var = xq2Var2.R;
                        f2 = xq2Var2.f(qw5Var) | xq2Var2.f(list2) | xq2Var2.f(valueOf);
                        P2 = xq2Var2.P();
                        if (!f2 || P2 == vs0Var2) {
                            P2 = new ij3(l61Var, eo2Var);
                            xq2Var2.l0(P2);
                        }
                        ij3 ij3Var = (ij3) P2;
                        Integer valueOf2 = Integer.valueOf(ss4Var.h());
                        h = xq2Var2.h(ss5Var2) | ((z8 & 7168) != 2048);
                        P3 = xq2Var2.P();
                        if (!h || P3 == vs0Var2) {
                            z5 = z8;
                            n65Var = n65Var2;
                            es7Var = F;
                            ip3Var = a;
                            pr3Var = a2;
                            i2 = 1;
                            z6 = z4;
                            vs0Var = vs0Var2;
                            ag agVar = new ag(ss5Var2, qn2Var9, ss4Var, null, 11);
                            xq2Var2.l0(agVar);
                            P3 = agVar;
                        } else {
                            z5 = z8;
                            n65Var = n65Var2;
                            es7Var = F;
                            ip3Var = a;
                            pr3Var = a2;
                            i2 = 1;
                            z6 = z4;
                            vs0Var = vs0Var2;
                        }
                        mb3.j(valueOf2, list, (eo2) P3, xq2Var2);
                        P4 = xq2Var2.P();
                        if (P4 == vs0Var) {
                            P4 = np2.I(new er2(ip3Var, 21));
                            xq2Var2.l0(P4);
                        }
                        pp6 pp6Var = (pp6) P4;
                        d = xq2Var2.d(((Number) pp6Var.getValue()).intValue()) | xq2Var2.d(size) | xq2Var2.d(intValue);
                        P5 = xq2Var2.P();
                        if (!d || P5 == vs0Var) {
                            int i7 = Integer.MAX_VALUE;
                            if (size > 0) {
                                i3 = i2;
                            } else {
                                int intValue2 = ((Number) pp6Var.getValue()).intValue();
                                int i8 = size - 1;
                                if (i8 < 0) {
                                    i3 = i2;
                                } else {
                                    i3 = i2;
                                    if (intValue2 < i3) {
                                        intValue2 = i3;
                                    }
                                    i7 = i8 - (i8 % intValue2);
                                }
                                i7 += intValue;
                            }
                            P5 = Integer.valueOf(i7);
                            xq2Var2.l0(P5);
                        } else {
                            i3 = i2;
                        }
                        final int intValue3 = ((Number) P5).intValue();
                        Object[] objArr = {n06Var, Integer.valueOf(ss4Var.h()), Integer.valueOf(intValue3), Integer.valueOf(list.size()), qn2Var10};
                        i4 = (xq2Var2.h(ss5Var2) ? 1 : 0) | (!(z5 & true) ? i3 : 0) | (xq2Var2.d(intValue3) ? 1 : 0);
                        P6 = xq2Var2.P();
                        if (i4 == 0 || P6 == vs0Var) {
                            gi1 gi1Var = new gi1(qn2Var10, ss5Var2, intValue3, ss4Var, 2);
                            ss5Var2 = ss5Var2;
                            xq2Var2.l0(gi1Var);
                            P6 = gi1Var;
                        }
                        mb3.f(objArr, (qn2) P6, xq2Var2);
                        Object[] objArr2 = {n06Var, Integer.valueOf(intValue3), Integer.valueOf(list.size()), Integer.valueOf(ss4Var.h())};
                        h2 = xq2Var2.h(ss5Var2) | xq2Var2.d(intValue3) | xq2Var2.f(ip3Var) | xq2Var2.f(pr3Var);
                        P7 = xq2Var2.P();
                        if (!h2 || P7 == vs0Var) {
                            ip3 ip3Var3 = ip3Var;
                            pr3Var2 = pr3Var;
                            z22 z22Var = new z22(ss5Var2, ss4Var, intValue3, ip3Var3, pr3Var2, null);
                            ip3Var2 = ip3Var3;
                            xq2Var2.l0(z22Var);
                            P7 = z22Var;
                        } else {
                            ip3Var2 = ip3Var;
                            pr3Var2 = pr3Var;
                        }
                        mb3.k(objArr2, (eo2) P7, xq2Var2);
                        final es7 es7Var2 = es7Var;
                        long j = es7Var2.b;
                        lc2 lc2Var = dj6.c;
                        final pr3 pr3Var3 = pr3Var2;
                        final w61 w61Var4 = w61Var;
                        final ip3 ip3Var4 = ip3Var2;
                        final n65 n65Var3 = n65Var;
                        final int i9 = z13 ? 1 : 0;
                        ej2.c(lc2Var, null, j, 0L, RecyclerView.B1, n16.I(71588444, new eo2() { // from class: qr5
                            @Override // defpackage.eo2
                            public final Object o(Object obj4, Object obj5) {
                                boolean z14;
                                es7 es7Var3;
                                c40 c40Var;
                                m06 m06Var2;
                                m06 m06Var3;
                                x64 x64Var;
                                x64 x64Var2;
                                final om6 om6Var2;
                                qw5 qw5Var2;
                                final qn2 qn2Var11;
                                boolean z15;
                                e40 e40Var;
                                m06 m06Var4;
                                final qn2 qn2Var12;
                                qn2 qn2Var13;
                                m06 m06Var5;
                                int i10;
                                Map map3;
                                ss5 ss5Var3;
                                final int i11;
                                boolean z16;
                                final ip3 ip3Var5;
                                final ss5 ss5Var4;
                                final int i12;
                                boolean z17;
                                boolean z18;
                                vs0 vs0Var3;
                                xq2 xq2Var3;
                                boolean z19;
                                boolean z20;
                                String l;
                                qr5 qr5Var;
                                int i13;
                                ss5 ss5Var5;
                                ip3 ip3Var6;
                                pr3 pr3Var4;
                                pp6 I;
                                final Map map4;
                                qw5 qw5Var3;
                                final qn2 qn2Var14;
                                c40 c40Var2;
                                qn2 qn2Var15;
                                int i14;
                                float f5;
                                float f6;
                                Map map5;
                                qn2 qn2Var16;
                                es7 es7Var4;
                                final qn2 qn2Var17;
                                final ss5 ss5Var6;
                                boolean z21;
                                ss5 ss5Var7;
                                ip3 ip3Var7;
                                boolean z22;
                                String l2;
                                boolean z23;
                                es7 es7Var5 = es7Var2;
                                long j2 = es7Var5.f;
                                px0 px0Var2 = (px0) obj4;
                                int intValue4 = ((Integer) obj5).intValue();
                                e40 e40Var2 = d90.R;
                                if ((intValue4 & 3) != 2) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                xq2 xq2Var4 = (xq2) px0Var2;
                                if (xq2Var4.S(intValue4 & 1, z14)) {
                                    lc2 lc2Var2 = dj6.c;
                                    a74 j02 = nc1.j0(lc2Var2, nc1.o);
                                    e40 e40Var3 = d90.L;
                                    e34 d2 = h70.d(e40Var3, false);
                                    int hashCode = Long.hashCode(xq2Var4.T);
                                    xv4 l3 = xq2Var4.l();
                                    a74 E = l.E(xq2Var4, j02);
                                    jx0.i.getClass();
                                    iy0 iy0Var = ix0.b;
                                    xq2Var4.f0();
                                    if (xq2Var4.S) {
                                        xq2Var4.k(iy0Var);
                                    } else {
                                        xq2Var4.o0();
                                    }
                                    pn pnVar = ix0.f;
                                    yh2.K(xq2Var4, pnVar, d2);
                                    pn pnVar2 = ix0.e;
                                    yh2.K(xq2Var4, pnVar2, l3);
                                    Integer valueOf3 = Integer.valueOf(hashCode);
                                    pn pnVar3 = ix0.g;
                                    yh2.K(xq2Var4, pnVar3, valueOf3);
                                    ne neVar = ix0.h;
                                    yh2.F(xq2Var4, neVar);
                                    pn pnVar4 = ix0.d;
                                    yh2.K(xq2Var4, pnVar4, E);
                                    vs0 vs0Var4 = vs0.Y;
                                    c40 c40Var3 = d90.k0;
                                    eu euVar = ju.c;
                                    yt0 a3 = wt0.a(euVar, c40Var3, xq2Var4, 0);
                                    int hashCode2 = Long.hashCode(xq2Var4.T);
                                    xv4 l4 = xq2Var4.l();
                                    a74 E2 = l.E(xq2Var4, lc2Var2);
                                    xq2Var4.f0();
                                    if (xq2Var4.S) {
                                        xq2Var4.k(iy0Var);
                                    } else {
                                        xq2Var4.o0();
                                    }
                                    yh2.K(xq2Var4, pnVar, a3);
                                    yh2.K(xq2Var4, pnVar2, l4);
                                    i61.w(hashCode2, xq2Var4, pnVar3, xq2Var4, neVar);
                                    yh2.K(xq2Var4, pnVar4, E2);
                                    ss5 ss5Var8 = ss5Var;
                                    boolean z24 = ss5Var8.d;
                                    boolean z25 = ss5Var8.c;
                                    List list3 = ss5Var8.b;
                                    n06 n06Var2 = ss5Var8.f;
                                    qw5 qw5Var4 = ss5Var8.g;
                                    List list4 = ss5Var8.a;
                                    ak7.D(z24, str, ss5Var8.f, qn2Var7, on2Var3, on2Var4, on2Var5, on2Var6, on2Var2, on2Var7, null, xq2Var4, 0);
                                    xq2 xq2Var5 = xq2Var4;
                                    m06 m06Var6 = m06.SCANNING;
                                    m06 m06Var7 = m06Var;
                                    x64 x64Var3 = x64.a;
                                    if (m06Var7 == m06Var6) {
                                        xq2Var5.b0(1705617527);
                                        c40Var = c40Var3;
                                        m06Var3 = m06Var7;
                                        x64Var = x64Var3;
                                        m06Var2 = m06Var6;
                                        es7Var3 = es7Var5;
                                        e45.b(dj6.c(x64Var3, 1.0f), es7Var5.l, es7Var5.d, xq2Var5, 6, 8);
                                        xq2Var5 = xq2Var5;
                                        xq2Var5.p(false);
                                    } else {
                                        es7Var3 = es7Var5;
                                        c40Var = c40Var3;
                                        m06Var2 = m06Var6;
                                        m06Var3 = m06Var7;
                                        x64Var = x64Var3;
                                        xq2Var5.b0(1705838154);
                                        xq2Var5.p(false);
                                    }
                                    boolean z26 = ss5Var8.c;
                                    boolean z27 = ss5Var8.e;
                                    boolean z28 = ss5Var8.d;
                                    xq2 xq2Var6 = xq2Var5;
                                    final on2 on2Var8 = on2Var;
                                    ak7.i(list3, z26, z27, z28, on2Var8, null, xq2Var6, 0);
                                    xq2 xq2Var7 = xq2Var6;
                                    Configuration configuration = (Configuration) xq2Var7.j(kf.a);
                                    int i15 = configuration.screenWidthDp;
                                    int i16 = configuration.screenHeightDp;
                                    final boolean z29 = z12;
                                    final int i17 = intValue;
                                    final ip3 ip3Var8 = ip3Var4;
                                    final pr3 pr3Var5 = pr3Var3;
                                    n65 n65Var4 = n65Var3;
                                    Map map6 = map;
                                    Map map7 = map2;
                                    final qn2 qn2Var18 = qn2Var2;
                                    final qn2 qn2Var19 = qn2Var3;
                                    qn2 qn2Var20 = qn2Var9;
                                    qn2 qn2Var21 = qn2Var8;
                                    qn2 qn2Var22 = qn2Var5;
                                    boolean z30 = z6;
                                    final qn2 qn2Var23 = qn2Var6;
                                    final Set set2 = set;
                                    final boolean z31 = z2;
                                    om6 om6Var3 = om6Var;
                                    final int i18 = intValue3;
                                    final qn2 qn2Var24 = qn2Var;
                                    final boolean z32 = z;
                                    final qn2 qn2Var25 = qn2Var4;
                                    final ss4 ss4Var2 = ss4Var;
                                    if (i15 > i16) {
                                        xq2Var7.b0(1706661700);
                                        a74 a4 = zt0.a(dj6.c(x64Var, 1.0f));
                                        l26 a5 = k26.a(ju.a, d90.h0, xq2Var7, 0);
                                        int hashCode3 = Long.hashCode(xq2Var7.T);
                                        xv4 l5 = xq2Var7.l();
                                        a74 E3 = l.E(xq2Var7, a4);
                                        xq2Var7.f0();
                                        if (xq2Var7.S) {
                                            xq2Var7.k(iy0Var);
                                        } else {
                                            xq2Var7.o0();
                                        }
                                        yh2.K(xq2Var7, pnVar, a5);
                                        yh2.K(xq2Var7, pnVar2, l5);
                                        i61.w(hashCode3, xq2Var7, pnVar3, xq2Var7, neVar);
                                        yh2.K(xq2Var7, pnVar4, E3);
                                        a74 R2 = ge7.R(dj6.b(dj6.c(x64Var, 0.38f), 1.0f), 16.0f, 6.0f, 10.0f, 6.0f);
                                        yt0 a6 = wt0.a(euVar, c40Var, xq2Var7, 0);
                                        int hashCode4 = Long.hashCode(xq2Var7.T);
                                        xv4 l6 = xq2Var7.l();
                                        a74 E4 = l.E(xq2Var7, R2);
                                        xq2Var7.f0();
                                        if (xq2Var7.S) {
                                            xq2Var7.k(iy0Var);
                                        } else {
                                            xq2Var7.o0();
                                        }
                                        yh2.K(xq2Var7, pnVar, a6);
                                        yh2.K(xq2Var7, pnVar2, l6);
                                        i61.w(hashCode4, xq2Var7, pnVar3, xq2Var7, neVar);
                                        yh2.K(xq2Var7, pnVar4, E4);
                                        if (!ss5Var8.j.isEmpty() && !ss5Var8.d && !z25) {
                                            xq2Var7.b0(284390862);
                                            c40Var2 = c40Var;
                                            f5 = 10.0f;
                                            f6 = 16.0f;
                                            ak7.o(ss5Var8.j, map6, map7, qn2Var18, qn2Var19, null, qn2Var20, qn2Var21, xq2Var7, 0);
                                            map5 = map7;
                                            qn2Var15 = qn2Var20;
                                            qn2Var14 = qn2Var21;
                                            xq2Var7 = xq2Var7;
                                            qw5Var3 = qw5Var4;
                                            i14 = R.string.rom_all_games;
                                            map4 = map6;
                                            xq2Var7.p(false);
                                            qn2Var16 = qn2Var22;
                                        } else {
                                            map4 = map6;
                                            qw5Var3 = qw5Var4;
                                            qn2Var14 = qn2Var21;
                                            c40Var2 = c40Var;
                                            qn2Var15 = qn2Var20;
                                            i14 = R.string.rom_all_games;
                                            f5 = 10.0f;
                                            f6 = 16.0f;
                                            map5 = map7;
                                            xq2Var7.b0(284975708);
                                            ak7.l(list4.size(), ss5Var8.g, qn2Var22, null, xq2Var7, 0);
                                            qn2Var16 = qn2Var22;
                                            xq2Var7.p(false);
                                        }
                                        xq2Var7.p(true);
                                        a74 Q = ge7.Q(dj6.b(dj6.l(x64Var, 1.0f), 1.0f), RecyclerView.B1, 8.0f, 1);
                                        int i19 = kt0.i;
                                        qn2 qn2Var26 = qn2Var16;
                                        long j3 = kt0.g;
                                        x64 x64Var4 = x64Var;
                                        es7 es7Var6 = es7Var3;
                                        h70.a(vy7.J(Q, d90.m(hf.c0(new kt0(j3), new kt0(kt0.c(0.6f, j2)), new kt0(kt0.c(0.5f, es7Var6.j)), new kt0(kt0.c(0.6f, j2)), new kt0(j3)), RecyclerView.B1, RecyclerView.B1, 14)), xq2Var7, 0);
                                        a74 S = ge7.S(dj6.b(new vn3(1.0f, true), 1.0f), f5, RecyclerView.B1, f6, RecyclerView.B1, 10);
                                        yt0 a7 = wt0.a(euVar, c40Var2, xq2Var7, 0);
                                        int hashCode5 = Long.hashCode(xq2Var7.T);
                                        xv4 l7 = xq2Var7.l();
                                        a74 E5 = l.E(xq2Var7, S);
                                        xq2Var7.f0();
                                        if (xq2Var7.S) {
                                            xq2Var7.k(iy0Var);
                                        } else {
                                            xq2Var7.o0();
                                        }
                                        yh2.K(xq2Var7, pnVar, a7);
                                        yh2.K(xq2Var7, pnVar2, l7);
                                        i61.w(hashCode5, xq2Var7, pnVar3, xq2Var7, neVar);
                                        yh2.K(xq2Var7, pnVar4, E5);
                                        qw5 qw5Var5 = qw5Var3;
                                        ak7.v(qw5Var5, qn2Var26, null, xq2Var7, 0);
                                        if (z30) {
                                            xq2Var7.b0(-874948230);
                                            int size2 = gt0.D0(list4, i17).size();
                                            if (z25) {
                                                xq2Var7.b0(-874764865);
                                                l2 = (String) gt0.R0(list3);
                                                if (l2 == null) {
                                                    list4 = list4;
                                                    qn2Var17 = qn2Var26;
                                                    z23 = false;
                                                    l2 = i61.l(xq2Var7, 525972161, i14, xq2Var7, false);
                                                } else {
                                                    list4 = list4;
                                                    qn2Var17 = qn2Var26;
                                                    z23 = false;
                                                    xq2Var7.b0(525971107);
                                                    xq2Var7.p(false);
                                                }
                                                xq2Var7.p(z23);
                                            } else {
                                                list4 = list4;
                                                qn2Var17 = qn2Var26;
                                                l2 = i61.l(xq2Var7, 525973569, i14, xq2Var7, false);
                                            }
                                            i17 = i17;
                                            xq2 xq2Var8 = xq2Var7;
                                            es7Var4 = es7Var6;
                                            x64Var2 = x64Var4;
                                            ss5Var6 = ss5Var8;
                                            ak7.x(l2, ss5Var8.c, ss5Var8.h, ss5Var8.i, size2, on2Var8, qn2Var23, ge7.Q(x64Var2, RecyclerView.B1, RecyclerView.B1, 2), xq2Var8, 12582912);
                                            xq2Var7 = xq2Var8;
                                            z21 = false;
                                            xq2Var7.p(false);
                                        } else {
                                            es7Var4 = es7Var6;
                                            qn2Var17 = qn2Var26;
                                            ss5Var6 = ss5Var8;
                                            x64Var2 = x64Var4;
                                            z21 = false;
                                            xq2Var7.b0(-874105433);
                                            xq2Var7.p(false);
                                        }
                                        a74 G = xk2.G(zt0.a(dj6.c(x64Var2, 1.0f)), n65Var4);
                                        e34 d3 = h70.d(e40Var3, z21);
                                        int hashCode6 = Long.hashCode(xq2Var7.T);
                                        xv4 l8 = xq2Var7.l();
                                        a74 E6 = l.E(xq2Var7, G);
                                        xq2Var7.f0();
                                        if (xq2Var7.S) {
                                            xq2Var7.k(iy0Var);
                                        } else {
                                            xq2Var7.o0();
                                        }
                                        yh2.K(xq2Var7, pnVar, d3);
                                        yh2.K(xq2Var7, pnVar2, l8);
                                        i61.w(hashCode6, xq2Var7, pnVar3, xq2Var7, neVar);
                                        yh2.K(xq2Var7, pnVar4, E6);
                                        if (list4.isEmpty()) {
                                            xq2Var7.b0(-1588783810);
                                            yt0 a8 = wt0.a(euVar, c40Var2, xq2Var7, 0);
                                            int hashCode7 = Long.hashCode(xq2Var7.T);
                                            xv4 l9 = xq2Var7.l();
                                            a74 E7 = l.E(xq2Var7, lc2Var2);
                                            xq2Var7.f0();
                                            if (xq2Var7.S) {
                                                xq2Var7.k(iy0Var);
                                            } else {
                                                xq2Var7.o0();
                                            }
                                            yh2.K(xq2Var7, pnVar, a8);
                                            yh2.K(xq2Var7, pnVar2, l9);
                                            i61.w(hashCode7, xq2Var7, pnVar3, xq2Var7, neVar);
                                            yh2.K(xq2Var7, pnVar4, E7);
                                            nw7.r(qw5Var5, xq2Var7, 0);
                                            xq2Var7.p(true);
                                            xq2Var7.p(false);
                                            ip3Var7 = ip3Var8;
                                            ss5Var7 = ss5Var6;
                                            om6Var2 = om6Var3;
                                        } else {
                                            xq2Var7.b0(-1588413360);
                                            om6Var2 = om6Var3;
                                            final Map map8 = map5;
                                            final qn2 qn2Var27 = qn2Var15;
                                            ss5Var7 = ss5Var6;
                                            ip3Var7 = ip3Var8;
                                            nw7.j(lc2Var2, null, n16.I(-1655686469, new fo2() { // from class: tr5
                                                @Override // defpackage.fo2
                                                public final Object e(Object obj6, Object obj7, Object obj8) {
                                                    int i20 = r24;
                                                    jg7 jg7Var = jg7.a;
                                                    boolean z33 = false;
                                                    int i21 = 2;
                                                    switch (i20) {
                                                        case 0:
                                                            final l70 l70Var = (l70) obj6;
                                                            px0 px0Var3 = (px0) obj7;
                                                            int intValue5 = ((Integer) obj8).intValue();
                                                            l70Var.getClass();
                                                            if ((intValue5 & 6) == 0) {
                                                                if (((xq2) px0Var3).f(l70Var)) {
                                                                    i21 = 4;
                                                                }
                                                                intValue5 |= i21;
                                                            }
                                                            if ((intValue5 & 19) != 18) {
                                                                z33 = true;
                                                            }
                                                            xq2 xq2Var9 = (xq2) px0Var3;
                                                            if (xq2Var9.S(intValue5 & 1, z33)) {
                                                                final ss5 ss5Var9 = ss5Var6;
                                                                n06 n06Var3 = ss5Var9.f;
                                                                final ip3 ip3Var9 = ip3Var8;
                                                                final Map map9 = map4;
                                                                final Map map10 = map8;
                                                                final Set set3 = set2;
                                                                final boolean z34 = z31;
                                                                final boolean z35 = z29;
                                                                final int i22 = i17;
                                                                final om6 om6Var4 = om6Var2;
                                                                final int i23 = i18;
                                                                final qn2 qn2Var28 = qn2Var27;
                                                                final qn2 qn2Var29 = qn2Var24;
                                                                final qn2 qn2Var30 = qn2Var18;
                                                                final qn2 qn2Var31 = qn2Var19;
                                                                final qn2 qn2Var32 = qn2Var17;
                                                                final qn2 qn2Var33 = qn2Var23;
                                                                final on2 on2Var9 = on2Var8;
                                                                final qn2 qn2Var34 = qn2Var14;
                                                                final pr3 pr3Var6 = pr3Var5;
                                                                final boolean z36 = z32;
                                                                final qn2 qn2Var35 = qn2Var25;
                                                                final ss4 ss4Var3 = ss4Var2;
                                                                n16.d(n06Var3, null, null, "view_mode", n16.I(-263214166, new fo2() { // from class: xr5
                                                                    @Override // defpackage.fo2
                                                                    public final Object e(Object obj9, Object obj10, Object obj11) {
                                                                        boolean z37;
                                                                        boolean z38;
                                                                        int i24 = r25;
                                                                        jg7 jg7Var2 = jg7.a;
                                                                        int i25 = 4;
                                                                        vs0 vs0Var5 = ox0.a;
                                                                        final ss4 ss4Var4 = ss4Var3;
                                                                        l70 l70Var2 = l70Var;
                                                                        switch (i24) {
                                                                            case 0:
                                                                                n06 n06Var4 = (n06) obj9;
                                                                                px0 px0Var4 = (px0) obj10;
                                                                                int intValue6 = ((Integer) obj11).intValue();
                                                                                n06Var4.getClass();
                                                                                if ((intValue6 & 6) == 0) {
                                                                                    if (!((xq2) px0Var4).d(n06Var4.ordinal())) {
                                                                                        i25 = 2;
                                                                                    }
                                                                                    intValue6 |= i25;
                                                                                }
                                                                                if ((intValue6 & 19) != 18) {
                                                                                    z37 = true;
                                                                                } else {
                                                                                    z37 = false;
                                                                                }
                                                                                xq2 xq2Var10 = (xq2) px0Var4;
                                                                                if (xq2Var10.S(intValue6 & 1, z37)) {
                                                                                    int i26 = ps5.a[n06Var4.ordinal()];
                                                                                    ss5 ss5Var10 = ss5Var9;
                                                                                    Map map11 = map9;
                                                                                    Map map12 = map10;
                                                                                    Set set4 = set3;
                                                                                    boolean z39 = z34;
                                                                                    boolean z40 = z35;
                                                                                    int i27 = i22;
                                                                                    om6 om6Var5 = om6Var4;
                                                                                    qn2 qn2Var36 = qn2Var28;
                                                                                    qn2 qn2Var37 = qn2Var29;
                                                                                    qn2 qn2Var38 = qn2Var30;
                                                                                    qn2 qn2Var39 = qn2Var31;
                                                                                    qn2 qn2Var40 = qn2Var32;
                                                                                    qn2 qn2Var41 = qn2Var33;
                                                                                    on2 on2Var10 = on2Var9;
                                                                                    qn2 qn2Var42 = qn2Var34;
                                                                                    if (i26 != 1) {
                                                                                        if (i26 == 2) {
                                                                                            xq2Var10.b0(454331178);
                                                                                            float a9 = l70Var2.a();
                                                                                            int h4 = ss4Var4.h();
                                                                                            Object P15 = xq2Var10.P();
                                                                                            if (P15 == vs0Var5) {
                                                                                                P15 = new qn2() { // from class: yr5
                                                                                                    @Override // defpackage.qn2
                                                                                                    public final Object g(Object obj12) {
                                                                                                        int i28 = r2;
                                                                                                        jg7 jg7Var3 = jg7.a;
                                                                                                        ss4 ss4Var5 = ss4Var4;
                                                                                                        int intValue7 = ((Integer) obj12).intValue();
                                                                                                        switch (i28) {
                                                                                                            case 0:
                                                                                                                ss4Var5.i(intValue7);
                                                                                                                return jg7Var3;
                                                                                                            case 1:
                                                                                                                ss4Var5.i(intValue7);
                                                                                                                return jg7Var3;
                                                                                                            case 2:
                                                                                                                ss4Var5.i(intValue7);
                                                                                                                return jg7Var3;
                                                                                                            default:
                                                                                                                ss4Var5.i(intValue7);
                                                                                                                return jg7Var3;
                                                                                                        }
                                                                                                    }
                                                                                                };
                                                                                                xq2Var10.l0(P15);
                                                                                            }
                                                                                            nw7.w(ss5Var10, pr3Var6, map11, map12, z36, set4, z39, z40, i27, a9, om6Var5, h4, (qn2) P15, qn2Var36, qn2Var37, qn2Var38, qn2Var39, qn2Var35, qn2Var40, qn2Var41, on2Var10, qn2Var42, xq2Var10, 905969664);
                                                                                            xq2Var10.p(false);
                                                                                        } else {
                                                                                            throw xg6.f(xq2Var10, 454263024, false);
                                                                                        }
                                                                                    } else {
                                                                                        xq2Var10.b0(454263339);
                                                                                        float a10 = l70Var2.a();
                                                                                        int h5 = ss4Var4.h();
                                                                                        Object P16 = xq2Var10.P();
                                                                                        if (P16 == vs0Var5) {
                                                                                            P16 = new qn2() { // from class: yr5
                                                                                                @Override // defpackage.qn2
                                                                                                public final Object g(Object obj12) {
                                                                                                    int i28 = r2;
                                                                                                    jg7 jg7Var3 = jg7.a;
                                                                                                    ss4 ss4Var5 = ss4Var4;
                                                                                                    int intValue7 = ((Integer) obj12).intValue();
                                                                                                    switch (i28) {
                                                                                                        case 0:
                                                                                                            ss4Var5.i(intValue7);
                                                                                                            return jg7Var3;
                                                                                                        case 1:
                                                                                                            ss4Var5.i(intValue7);
                                                                                                            return jg7Var3;
                                                                                                        case 2:
                                                                                                            ss4Var5.i(intValue7);
                                                                                                            return jg7Var3;
                                                                                                        default:
                                                                                                            ss4Var5.i(intValue7);
                                                                                                            return jg7Var3;
                                                                                                    }
                                                                                                }
                                                                                            };
                                                                                            xq2Var10.l0(P16);
                                                                                        }
                                                                                        nw7.s(ss5Var10, ip3Var9, map11, map12, set4, z39, z40, i27, a10, om6Var5, h5, i23, (qn2) P16, qn2Var36, qn2Var37, qn2Var38, qn2Var39, qn2Var40, qn2Var41, on2Var10, qn2Var42, xq2Var10, 113246208);
                                                                                        xq2Var10.p(false);
                                                                                    }
                                                                                } else {
                                                                                    xq2Var10.V();
                                                                                }
                                                                                return jg7Var2;
                                                                            default:
                                                                                n06 n06Var5 = (n06) obj9;
                                                                                px0 px0Var5 = (px0) obj10;
                                                                                int intValue7 = ((Integer) obj11).intValue();
                                                                                n06Var5.getClass();
                                                                                if ((intValue7 & 6) == 0) {
                                                                                    if (!((xq2) px0Var5).d(n06Var5.ordinal())) {
                                                                                        i25 = 2;
                                                                                    }
                                                                                    intValue7 |= i25;
                                                                                }
                                                                                if ((intValue7 & 19) != 18) {
                                                                                    z38 = true;
                                                                                } else {
                                                                                    z38 = false;
                                                                                }
                                                                                xq2 xq2Var11 = (xq2) px0Var5;
                                                                                if (xq2Var11.S(intValue7 & 1, z38)) {
                                                                                    int i28 = ps5.a[n06Var5.ordinal()];
                                                                                    ss5 ss5Var11 = ss5Var9;
                                                                                    Map map13 = map9;
                                                                                    Map map14 = map10;
                                                                                    Set set5 = set3;
                                                                                    boolean z41 = z34;
                                                                                    boolean z42 = z35;
                                                                                    int i29 = i22;
                                                                                    om6 om6Var6 = om6Var4;
                                                                                    qn2 qn2Var43 = qn2Var28;
                                                                                    qn2 qn2Var44 = qn2Var29;
                                                                                    qn2 qn2Var45 = qn2Var30;
                                                                                    qn2 qn2Var46 = qn2Var31;
                                                                                    qn2 qn2Var47 = qn2Var32;
                                                                                    qn2 qn2Var48 = qn2Var33;
                                                                                    on2 on2Var11 = on2Var9;
                                                                                    qn2 qn2Var49 = qn2Var34;
                                                                                    if (i28 != 1) {
                                                                                        if (i28 == 2) {
                                                                                            xq2Var11.b0(-1111928998);
                                                                                            float a11 = l70Var2.a();
                                                                                            int h6 = ss4Var4.h();
                                                                                            Object P17 = xq2Var11.P();
                                                                                            if (P17 == vs0Var5) {
                                                                                                P17 = new qn2() { // from class: yr5
                                                                                                    @Override // defpackage.qn2
                                                                                                    public final Object g(Object obj12) {
                                                                                                        int i282 = r2;
                                                                                                        jg7 jg7Var3 = jg7.a;
                                                                                                        ss4 ss4Var5 = ss4Var4;
                                                                                                        int intValue72 = ((Integer) obj12).intValue();
                                                                                                        switch (i282) {
                                                                                                            case 0:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                            case 1:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                            case 2:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                            default:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                        }
                                                                                                    }
                                                                                                };
                                                                                                xq2Var11.l0(P17);
                                                                                            }
                                                                                            nw7.w(ss5Var11, pr3Var6, map13, map14, z36, set5, z41, z42, i29, a11, om6Var6, h6, (qn2) P17, qn2Var43, qn2Var44, qn2Var45, qn2Var46, qn2Var35, qn2Var47, qn2Var48, on2Var11, qn2Var49, xq2Var11, 905969664);
                                                                                            xq2Var11.p(false);
                                                                                            return jg7Var2;
                                                                                        }
                                                                                        throw xg6.f(xq2Var11, -1111990712, false);
                                                                                    }
                                                                                    xq2Var11.b0(-1111990429);
                                                                                    float a12 = l70Var2.a();
                                                                                    int h7 = ss4Var4.h();
                                                                                    Object P18 = xq2Var11.P();
                                                                                    if (P18 == vs0Var5) {
                                                                                        P18 = new qn2() { // from class: yr5
                                                                                            @Override // defpackage.qn2
                                                                                            public final Object g(Object obj12) {
                                                                                                int i282 = r2;
                                                                                                jg7 jg7Var3 = jg7.a;
                                                                                                ss4 ss4Var5 = ss4Var4;
                                                                                                int intValue72 = ((Integer) obj12).intValue();
                                                                                                switch (i282) {
                                                                                                    case 0:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 1:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 2:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    default:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                }
                                                                                            }
                                                                                        };
                                                                                        xq2Var11.l0(P18);
                                                                                    }
                                                                                    nw7.s(ss5Var11, ip3Var9, map13, map14, set5, z41, z42, i29, a12, om6Var6, h7, i23, (qn2) P18, qn2Var43, qn2Var44, qn2Var45, qn2Var46, qn2Var47, qn2Var48, on2Var11, qn2Var49, xq2Var11, 113246208);
                                                                                    xq2Var11.p(false);
                                                                                    return jg7Var2;
                                                                                }
                                                                                xq2Var11.V();
                                                                                return jg7Var2;
                                                                        }
                                                                    }
                                                                }, xq2Var9), xq2Var9, 27648, 6);
                                                            } else {
                                                                xq2Var9.V();
                                                            }
                                                            return jg7Var;
                                                        default:
                                                            final l70 l70Var2 = (l70) obj6;
                                                            px0 px0Var4 = (px0) obj7;
                                                            int intValue6 = ((Integer) obj8).intValue();
                                                            l70Var2.getClass();
                                                            if ((intValue6 & 6) == 0) {
                                                                if (((xq2) px0Var4).f(l70Var2)) {
                                                                    i21 = 4;
                                                                }
                                                                intValue6 |= i21;
                                                            }
                                                            if ((intValue6 & 19) != 18) {
                                                                z33 = true;
                                                            }
                                                            xq2 xq2Var10 = (xq2) px0Var4;
                                                            if (xq2Var10.S(intValue6 & 1, z33)) {
                                                                final ss5 ss5Var10 = ss5Var6;
                                                                n06 n06Var4 = ss5Var10.f;
                                                                final ip3 ip3Var10 = ip3Var8;
                                                                final Map map11 = map4;
                                                                final Map map12 = map8;
                                                                final Set set4 = set2;
                                                                final boolean z37 = z31;
                                                                final boolean z38 = z29;
                                                                final int i24 = i17;
                                                                final om6 om6Var5 = om6Var2;
                                                                final int i25 = i18;
                                                                final qn2 qn2Var36 = qn2Var27;
                                                                final qn2 qn2Var37 = qn2Var24;
                                                                final qn2 qn2Var38 = qn2Var18;
                                                                final qn2 qn2Var39 = qn2Var19;
                                                                final qn2 qn2Var40 = qn2Var17;
                                                                final qn2 qn2Var41 = qn2Var23;
                                                                final on2 on2Var10 = on2Var8;
                                                                final qn2 qn2Var42 = qn2Var14;
                                                                final pr3 pr3Var7 = pr3Var5;
                                                                final boolean z39 = z32;
                                                                final qn2 qn2Var43 = qn2Var25;
                                                                final ss4 ss4Var4 = ss4Var2;
                                                                n16.d(n06Var4, null, null, "view_mode", n16.I(1411131810, new fo2() { // from class: xr5
                                                                    @Override // defpackage.fo2
                                                                    public final Object e(Object obj9, Object obj10, Object obj11) {
                                                                        boolean z372;
                                                                        boolean z382;
                                                                        int i242 = r25;
                                                                        jg7 jg7Var2 = jg7.a;
                                                                        int i252 = 4;
                                                                        vs0 vs0Var5 = ox0.a;
                                                                        final ss4 ss4Var42 = ss4Var4;
                                                                        l70 l70Var22 = l70Var2;
                                                                        switch (i242) {
                                                                            case 0:
                                                                                n06 n06Var42 = (n06) obj9;
                                                                                px0 px0Var42 = (px0) obj10;
                                                                                int intValue62 = ((Integer) obj11).intValue();
                                                                                n06Var42.getClass();
                                                                                if ((intValue62 & 6) == 0) {
                                                                                    if (!((xq2) px0Var42).d(n06Var42.ordinal())) {
                                                                                        i252 = 2;
                                                                                    }
                                                                                    intValue62 |= i252;
                                                                                }
                                                                                if ((intValue62 & 19) != 18) {
                                                                                    z372 = true;
                                                                                } else {
                                                                                    z372 = false;
                                                                                }
                                                                                xq2 xq2Var102 = (xq2) px0Var42;
                                                                                if (xq2Var102.S(intValue62 & 1, z372)) {
                                                                                    int i26 = ps5.a[n06Var42.ordinal()];
                                                                                    ss5 ss5Var102 = ss5Var10;
                                                                                    Map map112 = map11;
                                                                                    Map map122 = map12;
                                                                                    Set set42 = set4;
                                                                                    boolean z392 = z37;
                                                                                    boolean z40 = z38;
                                                                                    int i27 = i24;
                                                                                    om6 om6Var52 = om6Var5;
                                                                                    qn2 qn2Var362 = qn2Var36;
                                                                                    qn2 qn2Var372 = qn2Var37;
                                                                                    qn2 qn2Var382 = qn2Var38;
                                                                                    qn2 qn2Var392 = qn2Var39;
                                                                                    qn2 qn2Var402 = qn2Var40;
                                                                                    qn2 qn2Var412 = qn2Var41;
                                                                                    on2 on2Var102 = on2Var10;
                                                                                    qn2 qn2Var422 = qn2Var42;
                                                                                    if (i26 != 1) {
                                                                                        if (i26 == 2) {
                                                                                            xq2Var102.b0(454331178);
                                                                                            float a9 = l70Var22.a();
                                                                                            int h4 = ss4Var42.h();
                                                                                            Object P15 = xq2Var102.P();
                                                                                            if (P15 == vs0Var5) {
                                                                                                P15 = new qn2() { // from class: yr5
                                                                                                    @Override // defpackage.qn2
                                                                                                    public final Object g(Object obj12) {
                                                                                                        int i282 = r2;
                                                                                                        jg7 jg7Var3 = jg7.a;
                                                                                                        ss4 ss4Var5 = ss4Var42;
                                                                                                        int intValue72 = ((Integer) obj12).intValue();
                                                                                                        switch (i282) {
                                                                                                            case 0:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                            case 1:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                            case 2:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                            default:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                        }
                                                                                                    }
                                                                                                };
                                                                                                xq2Var102.l0(P15);
                                                                                            }
                                                                                            nw7.w(ss5Var102, pr3Var7, map112, map122, z39, set42, z392, z40, i27, a9, om6Var52, h4, (qn2) P15, qn2Var362, qn2Var372, qn2Var382, qn2Var392, qn2Var43, qn2Var402, qn2Var412, on2Var102, qn2Var422, xq2Var102, 905969664);
                                                                                            xq2Var102.p(false);
                                                                                        } else {
                                                                                            throw xg6.f(xq2Var102, 454263024, false);
                                                                                        }
                                                                                    } else {
                                                                                        xq2Var102.b0(454263339);
                                                                                        float a10 = l70Var22.a();
                                                                                        int h5 = ss4Var42.h();
                                                                                        Object P16 = xq2Var102.P();
                                                                                        if (P16 == vs0Var5) {
                                                                                            P16 = new qn2() { // from class: yr5
                                                                                                @Override // defpackage.qn2
                                                                                                public final Object g(Object obj12) {
                                                                                                    int i282 = r2;
                                                                                                    jg7 jg7Var3 = jg7.a;
                                                                                                    ss4 ss4Var5 = ss4Var42;
                                                                                                    int intValue72 = ((Integer) obj12).intValue();
                                                                                                    switch (i282) {
                                                                                                        case 0:
                                                                                                            ss4Var5.i(intValue72);
                                                                                                            return jg7Var3;
                                                                                                        case 1:
                                                                                                            ss4Var5.i(intValue72);
                                                                                                            return jg7Var3;
                                                                                                        case 2:
                                                                                                            ss4Var5.i(intValue72);
                                                                                                            return jg7Var3;
                                                                                                        default:
                                                                                                            ss4Var5.i(intValue72);
                                                                                                            return jg7Var3;
                                                                                                    }
                                                                                                }
                                                                                            };
                                                                                            xq2Var102.l0(P16);
                                                                                        }
                                                                                        nw7.s(ss5Var102, ip3Var10, map112, map122, set42, z392, z40, i27, a10, om6Var52, h5, i25, (qn2) P16, qn2Var362, qn2Var372, qn2Var382, qn2Var392, qn2Var402, qn2Var412, on2Var102, qn2Var422, xq2Var102, 113246208);
                                                                                        xq2Var102.p(false);
                                                                                    }
                                                                                } else {
                                                                                    xq2Var102.V();
                                                                                }
                                                                                return jg7Var2;
                                                                            default:
                                                                                n06 n06Var5 = (n06) obj9;
                                                                                px0 px0Var5 = (px0) obj10;
                                                                                int intValue7 = ((Integer) obj11).intValue();
                                                                                n06Var5.getClass();
                                                                                if ((intValue7 & 6) == 0) {
                                                                                    if (!((xq2) px0Var5).d(n06Var5.ordinal())) {
                                                                                        i252 = 2;
                                                                                    }
                                                                                    intValue7 |= i252;
                                                                                }
                                                                                if ((intValue7 & 19) != 18) {
                                                                                    z382 = true;
                                                                                } else {
                                                                                    z382 = false;
                                                                                }
                                                                                xq2 xq2Var11 = (xq2) px0Var5;
                                                                                if (xq2Var11.S(intValue7 & 1, z382)) {
                                                                                    int i28 = ps5.a[n06Var5.ordinal()];
                                                                                    ss5 ss5Var11 = ss5Var10;
                                                                                    Map map13 = map11;
                                                                                    Map map14 = map12;
                                                                                    Set set5 = set4;
                                                                                    boolean z41 = z37;
                                                                                    boolean z42 = z38;
                                                                                    int i29 = i24;
                                                                                    om6 om6Var6 = om6Var5;
                                                                                    qn2 qn2Var432 = qn2Var36;
                                                                                    qn2 qn2Var44 = qn2Var37;
                                                                                    qn2 qn2Var45 = qn2Var38;
                                                                                    qn2 qn2Var46 = qn2Var39;
                                                                                    qn2 qn2Var47 = qn2Var40;
                                                                                    qn2 qn2Var48 = qn2Var41;
                                                                                    on2 on2Var11 = on2Var10;
                                                                                    qn2 qn2Var49 = qn2Var42;
                                                                                    if (i28 != 1) {
                                                                                        if (i28 == 2) {
                                                                                            xq2Var11.b0(-1111928998);
                                                                                            float a11 = l70Var22.a();
                                                                                            int h6 = ss4Var42.h();
                                                                                            Object P17 = xq2Var11.P();
                                                                                            if (P17 == vs0Var5) {
                                                                                                P17 = new qn2() { // from class: yr5
                                                                                                    @Override // defpackage.qn2
                                                                                                    public final Object g(Object obj12) {
                                                                                                        int i282 = r2;
                                                                                                        jg7 jg7Var3 = jg7.a;
                                                                                                        ss4 ss4Var5 = ss4Var42;
                                                                                                        int intValue72 = ((Integer) obj12).intValue();
                                                                                                        switch (i282) {
                                                                                                            case 0:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                            case 1:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                            case 2:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                            default:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                        }
                                                                                                    }
                                                                                                };
                                                                                                xq2Var11.l0(P17);
                                                                                            }
                                                                                            nw7.w(ss5Var11, pr3Var7, map13, map14, z39, set5, z41, z42, i29, a11, om6Var6, h6, (qn2) P17, qn2Var432, qn2Var44, qn2Var45, qn2Var46, qn2Var43, qn2Var47, qn2Var48, on2Var11, qn2Var49, xq2Var11, 905969664);
                                                                                            xq2Var11.p(false);
                                                                                            return jg7Var2;
                                                                                        }
                                                                                        throw xg6.f(xq2Var11, -1111990712, false);
                                                                                    }
                                                                                    xq2Var11.b0(-1111990429);
                                                                                    float a12 = l70Var22.a();
                                                                                    int h7 = ss4Var42.h();
                                                                                    Object P18 = xq2Var11.P();
                                                                                    if (P18 == vs0Var5) {
                                                                                        P18 = new qn2() { // from class: yr5
                                                                                            @Override // defpackage.qn2
                                                                                            public final Object g(Object obj12) {
                                                                                                int i282 = r2;
                                                                                                jg7 jg7Var3 = jg7.a;
                                                                                                ss4 ss4Var5 = ss4Var42;
                                                                                                int intValue72 = ((Integer) obj12).intValue();
                                                                                                switch (i282) {
                                                                                                    case 0:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 1:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 2:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    default:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                }
                                                                                            }
                                                                                        };
                                                                                        xq2Var11.l0(P18);
                                                                                    }
                                                                                    nw7.s(ss5Var11, ip3Var10, map13, map14, set5, z41, z42, i29, a12, om6Var6, h7, i25, (qn2) P18, qn2Var432, qn2Var44, qn2Var45, qn2Var46, qn2Var47, qn2Var48, on2Var11, qn2Var49, xq2Var11, 113246208);
                                                                                    xq2Var11.p(false);
                                                                                    return jg7Var2;
                                                                                }
                                                                                xq2Var11.V();
                                                                                return jg7Var2;
                                                                        }
                                                                    }
                                                                }, xq2Var10), xq2Var10, 27648, 6);
                                                            } else {
                                                                xq2Var10.V();
                                                            }
                                                            return jg7Var;
                                                    }
                                                }
                                            }, xq2Var7), xq2Var7, 3078);
                                            xq2Var7.p(false);
                                        }
                                        if (m06Var3 == m06Var2) {
                                            z22 = true;
                                        } else {
                                            z22 = false;
                                        }
                                        xq2 xq2Var9 = xq2Var7;
                                        es7 es7Var7 = es7Var4;
                                        k65.b(z22, n65Var4, vs0Var4.n(x64Var2, e40Var2), es7Var7.c, es7Var7.j, xq2Var9, 64);
                                        xq2Var3 = xq2Var9;
                                        xq2Var3.p(true);
                                        xq2Var3.p(true);
                                        xq2Var3.p(true);
                                        xq2Var3.p(false);
                                        vs0Var3 = vs0Var4;
                                        ss5Var4 = ss5Var7;
                                        ip3Var5 = ip3Var7;
                                        i12 = i17;
                                        z19 = true;
                                    } else {
                                        x64Var2 = x64Var;
                                        es7 es7Var8 = es7Var3;
                                        c40 c40Var4 = c40Var;
                                        om6Var2 = om6Var3;
                                        m06 m06Var8 = m06Var3;
                                        final Map map9 = map6;
                                        xq2Var7.b0(1716398273);
                                        a74 Q2 = ge7.Q(dj6.c(x64Var2, 1.0f), 16.0f, RecyclerView.B1, 2);
                                        yt0 a9 = wt0.a(euVar, c40Var4, xq2Var7, 0);
                                        int hashCode8 = Long.hashCode(xq2Var7.T);
                                        xv4 l10 = xq2Var7.l();
                                        a74 E8 = l.E(xq2Var7, Q2);
                                        xq2Var7.f0();
                                        if (xq2Var7.S) {
                                            xq2Var7.k(iy0Var);
                                        } else {
                                            xq2Var7.o0();
                                        }
                                        yh2.K(xq2Var7, pnVar, a9);
                                        yh2.K(xq2Var7, pnVar2, l10);
                                        i61.w(hashCode8, xq2Var7, pnVar3, xq2Var7, neVar);
                                        yh2.K(xq2Var7, pnVar4, E8);
                                        ak7.v(qw5Var4, qn2Var22, null, xq2Var7, 0);
                                        boolean z33 = z11;
                                        if (z33) {
                                            xq2Var7.b0(1988804737);
                                            qn2Var11 = qn2Var22;
                                            z15 = z33;
                                            m06Var4 = m06Var8;
                                            m06Var5 = m06Var2;
                                            e40Var = e40Var3;
                                            ak7.p(ss5Var8.j, map9, map7, qn2Var18, qn2Var19, null, RecyclerView.B1, qn2Var20, qn2Var21, xq2Var7, 1572864);
                                            map3 = map7;
                                            qn2Var13 = qn2Var20;
                                            qn2Var12 = qn2Var21;
                                            xq2Var7 = xq2Var7;
                                            qw5Var2 = qw5Var4;
                                            i10 = R.string.rom_all_games;
                                            map9 = map9;
                                            xq2Var7.p(false);
                                        } else {
                                            qw5Var2 = qw5Var4;
                                            qn2Var11 = qn2Var22;
                                            z15 = z33;
                                            e40Var = e40Var3;
                                            m06Var4 = m06Var8;
                                            qn2Var12 = qn2Var21;
                                            qn2Var13 = qn2Var20;
                                            m06Var5 = m06Var2;
                                            i10 = R.string.rom_all_games;
                                            map3 = map7;
                                            xq2Var7.b0(1989381337);
                                            xq2Var7.p(false);
                                        }
                                        if (z30) {
                                            xq2Var7.b0(1989454652);
                                            int size3 = gt0.D0(list4, i17).size();
                                            if (z25) {
                                                xq2Var7.b0(1989627601);
                                                l = (String) gt0.R0(list3);
                                                if (l == null) {
                                                    list4 = list4;
                                                    z20 = false;
                                                    l = i61.l(xq2Var7, 1726750575, i10, xq2Var7, false);
                                                } else {
                                                    list4 = list4;
                                                    z20 = false;
                                                    xq2Var7.b0(1726749521);
                                                    xq2Var7.p(false);
                                                }
                                                xq2Var7.p(z20);
                                            } else {
                                                list4 = list4;
                                                z20 = false;
                                                l = i61.l(xq2Var7, 1726751983, i10, xq2Var7, false);
                                            }
                                            xq2 xq2Var10 = xq2Var7;
                                            i11 = i17;
                                            ss5Var3 = ss5Var8;
                                            z16 = z20;
                                            ak7.x(l, ss5Var8.c, ss5Var8.h, ss5Var8.i, size3, on2Var8, qn2Var23, ge7.Q(x64Var2, RecyclerView.B1, RecyclerView.B1, 2), xq2Var10, 12582912);
                                            xq2Var7 = xq2Var10;
                                            xq2Var7.p(z16);
                                        } else {
                                            ss5Var3 = ss5Var8;
                                            i11 = i17;
                                            z16 = false;
                                            xq2Var7.b0(1990251321);
                                            xq2Var7.p(false);
                                        }
                                        xq2Var7.p(true);
                                        a74 G2 = xk2.G(zt0.a(dj6.c(x64Var2, 1.0f)), n65Var4);
                                        e34 d4 = h70.d(e40Var, z16);
                                        int hashCode9 = Long.hashCode(xq2Var7.T);
                                        xv4 l11 = xq2Var7.l();
                                        a74 E9 = l.E(xq2Var7, G2);
                                        xq2Var7.f0();
                                        if (xq2Var7.S) {
                                            xq2Var7.k(iy0Var);
                                        } else {
                                            xq2Var7.o0();
                                        }
                                        yh2.K(xq2Var7, pnVar, d4);
                                        yh2.K(xq2Var7, pnVar2, l11);
                                        i61.w(hashCode9, xq2Var7, pnVar3, xq2Var7, neVar);
                                        yh2.K(xq2Var7, pnVar4, E9);
                                        if (list4.isEmpty() && !z15) {
                                            xq2Var7.b0(-629494426);
                                            yt0 a10 = wt0.a(euVar, c40Var4, xq2Var7, 0);
                                            int hashCode10 = Long.hashCode(xq2Var7.T);
                                            xv4 l12 = xq2Var7.l();
                                            a74 E10 = l.E(xq2Var7, lc2Var2);
                                            xq2Var7.f0();
                                            if (xq2Var7.S) {
                                                xq2Var7.k(iy0Var);
                                            } else {
                                                xq2Var7.o0();
                                            }
                                            yh2.K(xq2Var7, pnVar, a10);
                                            yh2.K(xq2Var7, pnVar2, l12);
                                            i61.w(hashCode10, xq2Var7, pnVar3, xq2Var7, neVar);
                                            yh2.K(xq2Var7, pnVar4, E10);
                                            nw7.r(qw5Var2, xq2Var7, 0);
                                            xq2Var7.p(true);
                                            xq2Var7.p(false);
                                            z17 = false;
                                            ip3Var5 = ip3Var8;
                                            i12 = i11;
                                            ss5Var4 = ss5Var3;
                                        } else {
                                            xq2Var7.b0(-629169112);
                                            ip3Var5 = ip3Var8;
                                            final Map map10 = map3;
                                            final qn2 qn2Var28 = qn2Var13;
                                            ss5Var4 = ss5Var3;
                                            fo2 fo2Var = new fo2() { // from class: tr5
                                                @Override // defpackage.fo2
                                                public final Object e(Object obj6, Object obj7, Object obj8) {
                                                    int i20 = r24;
                                                    jg7 jg7Var = jg7.a;
                                                    boolean z332 = false;
                                                    int i21 = 2;
                                                    switch (i20) {
                                                        case 0:
                                                            final l70 l70Var = (l70) obj6;
                                                            px0 px0Var3 = (px0) obj7;
                                                            int intValue5 = ((Integer) obj8).intValue();
                                                            l70Var.getClass();
                                                            if ((intValue5 & 6) == 0) {
                                                                if (((xq2) px0Var3).f(l70Var)) {
                                                                    i21 = 4;
                                                                }
                                                                intValue5 |= i21;
                                                            }
                                                            if ((intValue5 & 19) != 18) {
                                                                z332 = true;
                                                            }
                                                            xq2 xq2Var92 = (xq2) px0Var3;
                                                            if (xq2Var92.S(intValue5 & 1, z332)) {
                                                                final ss5 ss5Var9 = ss5Var4;
                                                                n06 n06Var3 = ss5Var9.f;
                                                                final ip3 ip3Var9 = ip3Var5;
                                                                final Map map92 = map9;
                                                                final Map map102 = map10;
                                                                final Set set3 = set2;
                                                                final boolean z34 = z31;
                                                                final boolean z35 = z29;
                                                                final int i22 = i11;
                                                                final om6 om6Var4 = om6Var2;
                                                                final int i23 = i18;
                                                                final qn2 qn2Var282 = qn2Var28;
                                                                final qn2 qn2Var29 = qn2Var24;
                                                                final qn2 qn2Var30 = qn2Var18;
                                                                final qn2 qn2Var31 = qn2Var19;
                                                                final qn2 qn2Var32 = qn2Var11;
                                                                final qn2 qn2Var33 = qn2Var23;
                                                                final on2 on2Var9 = on2Var8;
                                                                final qn2 qn2Var34 = qn2Var12;
                                                                final pr3 pr3Var6 = pr3Var5;
                                                                final boolean z36 = z32;
                                                                final qn2 qn2Var35 = qn2Var25;
                                                                final ss4 ss4Var3 = ss4Var2;
                                                                n16.d(n06Var3, null, null, "view_mode", n16.I(-263214166, new fo2() { // from class: xr5
                                                                    @Override // defpackage.fo2
                                                                    public final Object e(Object obj9, Object obj10, Object obj11) {
                                                                        boolean z372;
                                                                        boolean z382;
                                                                        int i242 = r25;
                                                                        jg7 jg7Var2 = jg7.a;
                                                                        int i252 = 4;
                                                                        vs0 vs0Var5 = ox0.a;
                                                                        final ss4 ss4Var42 = ss4Var3;
                                                                        l70 l70Var22 = l70Var;
                                                                        switch (i242) {
                                                                            case 0:
                                                                                n06 n06Var42 = (n06) obj9;
                                                                                px0 px0Var42 = (px0) obj10;
                                                                                int intValue62 = ((Integer) obj11).intValue();
                                                                                n06Var42.getClass();
                                                                                if ((intValue62 & 6) == 0) {
                                                                                    if (!((xq2) px0Var42).d(n06Var42.ordinal())) {
                                                                                        i252 = 2;
                                                                                    }
                                                                                    intValue62 |= i252;
                                                                                }
                                                                                if ((intValue62 & 19) != 18) {
                                                                                    z372 = true;
                                                                                } else {
                                                                                    z372 = false;
                                                                                }
                                                                                xq2 xq2Var102 = (xq2) px0Var42;
                                                                                if (xq2Var102.S(intValue62 & 1, z372)) {
                                                                                    int i26 = ps5.a[n06Var42.ordinal()];
                                                                                    ss5 ss5Var102 = ss5Var9;
                                                                                    Map map112 = map92;
                                                                                    Map map122 = map102;
                                                                                    Set set42 = set3;
                                                                                    boolean z392 = z34;
                                                                                    boolean z40 = z35;
                                                                                    int i27 = i22;
                                                                                    om6 om6Var52 = om6Var4;
                                                                                    qn2 qn2Var362 = qn2Var282;
                                                                                    qn2 qn2Var372 = qn2Var29;
                                                                                    qn2 qn2Var382 = qn2Var30;
                                                                                    qn2 qn2Var392 = qn2Var31;
                                                                                    qn2 qn2Var402 = qn2Var32;
                                                                                    qn2 qn2Var412 = qn2Var33;
                                                                                    on2 on2Var102 = on2Var9;
                                                                                    qn2 qn2Var422 = qn2Var34;
                                                                                    if (i26 != 1) {
                                                                                        if (i26 == 2) {
                                                                                            xq2Var102.b0(454331178);
                                                                                            float a92 = l70Var22.a();
                                                                                            int h4 = ss4Var42.h();
                                                                                            Object P15 = xq2Var102.P();
                                                                                            if (P15 == vs0Var5) {
                                                                                                P15 = new qn2() { // from class: yr5
                                                                                                    @Override // defpackage.qn2
                                                                                                    public final Object g(Object obj12) {
                                                                                                        int i282 = r2;
                                                                                                        jg7 jg7Var3 = jg7.a;
                                                                                                        ss4 ss4Var5 = ss4Var42;
                                                                                                        int intValue72 = ((Integer) obj12).intValue();
                                                                                                        switch (i282) {
                                                                                                            case 0:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                            case 1:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                            case 2:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                            default:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                        }
                                                                                                    }
                                                                                                };
                                                                                                xq2Var102.l0(P15);
                                                                                            }
                                                                                            nw7.w(ss5Var102, pr3Var6, map112, map122, z36, set42, z392, z40, i27, a92, om6Var52, h4, (qn2) P15, qn2Var362, qn2Var372, qn2Var382, qn2Var392, qn2Var35, qn2Var402, qn2Var412, on2Var102, qn2Var422, xq2Var102, 905969664);
                                                                                            xq2Var102.p(false);
                                                                                        } else {
                                                                                            throw xg6.f(xq2Var102, 454263024, false);
                                                                                        }
                                                                                    } else {
                                                                                        xq2Var102.b0(454263339);
                                                                                        float a102 = l70Var22.a();
                                                                                        int h5 = ss4Var42.h();
                                                                                        Object P16 = xq2Var102.P();
                                                                                        if (P16 == vs0Var5) {
                                                                                            P16 = new qn2() { // from class: yr5
                                                                                                @Override // defpackage.qn2
                                                                                                public final Object g(Object obj12) {
                                                                                                    int i282 = r2;
                                                                                                    jg7 jg7Var3 = jg7.a;
                                                                                                    ss4 ss4Var5 = ss4Var42;
                                                                                                    int intValue72 = ((Integer) obj12).intValue();
                                                                                                    switch (i282) {
                                                                                                        case 0:
                                                                                                            ss4Var5.i(intValue72);
                                                                                                            return jg7Var3;
                                                                                                        case 1:
                                                                                                            ss4Var5.i(intValue72);
                                                                                                            return jg7Var3;
                                                                                                        case 2:
                                                                                                            ss4Var5.i(intValue72);
                                                                                                            return jg7Var3;
                                                                                                        default:
                                                                                                            ss4Var5.i(intValue72);
                                                                                                            return jg7Var3;
                                                                                                    }
                                                                                                }
                                                                                            };
                                                                                            xq2Var102.l0(P16);
                                                                                        }
                                                                                        nw7.s(ss5Var102, ip3Var9, map112, map122, set42, z392, z40, i27, a102, om6Var52, h5, i23, (qn2) P16, qn2Var362, qn2Var372, qn2Var382, qn2Var392, qn2Var402, qn2Var412, on2Var102, qn2Var422, xq2Var102, 113246208);
                                                                                        xq2Var102.p(false);
                                                                                    }
                                                                                } else {
                                                                                    xq2Var102.V();
                                                                                }
                                                                                return jg7Var2;
                                                                            default:
                                                                                n06 n06Var5 = (n06) obj9;
                                                                                px0 px0Var5 = (px0) obj10;
                                                                                int intValue7 = ((Integer) obj11).intValue();
                                                                                n06Var5.getClass();
                                                                                if ((intValue7 & 6) == 0) {
                                                                                    if (!((xq2) px0Var5).d(n06Var5.ordinal())) {
                                                                                        i252 = 2;
                                                                                    }
                                                                                    intValue7 |= i252;
                                                                                }
                                                                                if ((intValue7 & 19) != 18) {
                                                                                    z382 = true;
                                                                                } else {
                                                                                    z382 = false;
                                                                                }
                                                                                xq2 xq2Var11 = (xq2) px0Var5;
                                                                                if (xq2Var11.S(intValue7 & 1, z382)) {
                                                                                    int i28 = ps5.a[n06Var5.ordinal()];
                                                                                    ss5 ss5Var11 = ss5Var9;
                                                                                    Map map13 = map92;
                                                                                    Map map14 = map102;
                                                                                    Set set5 = set3;
                                                                                    boolean z41 = z34;
                                                                                    boolean z42 = z35;
                                                                                    int i29 = i22;
                                                                                    om6 om6Var6 = om6Var4;
                                                                                    qn2 qn2Var432 = qn2Var282;
                                                                                    qn2 qn2Var44 = qn2Var29;
                                                                                    qn2 qn2Var45 = qn2Var30;
                                                                                    qn2 qn2Var46 = qn2Var31;
                                                                                    qn2 qn2Var47 = qn2Var32;
                                                                                    qn2 qn2Var48 = qn2Var33;
                                                                                    on2 on2Var11 = on2Var9;
                                                                                    qn2 qn2Var49 = qn2Var34;
                                                                                    if (i28 != 1) {
                                                                                        if (i28 == 2) {
                                                                                            xq2Var11.b0(-1111928998);
                                                                                            float a11 = l70Var22.a();
                                                                                            int h6 = ss4Var42.h();
                                                                                            Object P17 = xq2Var11.P();
                                                                                            if (P17 == vs0Var5) {
                                                                                                P17 = new qn2() { // from class: yr5
                                                                                                    @Override // defpackage.qn2
                                                                                                    public final Object g(Object obj12) {
                                                                                                        int i282 = r2;
                                                                                                        jg7 jg7Var3 = jg7.a;
                                                                                                        ss4 ss4Var5 = ss4Var42;
                                                                                                        int intValue72 = ((Integer) obj12).intValue();
                                                                                                        switch (i282) {
                                                                                                            case 0:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                            case 1:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                            case 2:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                            default:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                        }
                                                                                                    }
                                                                                                };
                                                                                                xq2Var11.l0(P17);
                                                                                            }
                                                                                            nw7.w(ss5Var11, pr3Var6, map13, map14, z36, set5, z41, z42, i29, a11, om6Var6, h6, (qn2) P17, qn2Var432, qn2Var44, qn2Var45, qn2Var46, qn2Var35, qn2Var47, qn2Var48, on2Var11, qn2Var49, xq2Var11, 905969664);
                                                                                            xq2Var11.p(false);
                                                                                            return jg7Var2;
                                                                                        }
                                                                                        throw xg6.f(xq2Var11, -1111990712, false);
                                                                                    }
                                                                                    xq2Var11.b0(-1111990429);
                                                                                    float a12 = l70Var22.a();
                                                                                    int h7 = ss4Var42.h();
                                                                                    Object P18 = xq2Var11.P();
                                                                                    if (P18 == vs0Var5) {
                                                                                        P18 = new qn2() { // from class: yr5
                                                                                            @Override // defpackage.qn2
                                                                                            public final Object g(Object obj12) {
                                                                                                int i282 = r2;
                                                                                                jg7 jg7Var3 = jg7.a;
                                                                                                ss4 ss4Var5 = ss4Var42;
                                                                                                int intValue72 = ((Integer) obj12).intValue();
                                                                                                switch (i282) {
                                                                                                    case 0:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 1:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 2:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    default:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                }
                                                                                            }
                                                                                        };
                                                                                        xq2Var11.l0(P18);
                                                                                    }
                                                                                    nw7.s(ss5Var11, ip3Var9, map13, map14, set5, z41, z42, i29, a12, om6Var6, h7, i23, (qn2) P18, qn2Var432, qn2Var44, qn2Var45, qn2Var46, qn2Var47, qn2Var48, on2Var11, qn2Var49, xq2Var11, 113246208);
                                                                                    xq2Var11.p(false);
                                                                                    return jg7Var2;
                                                                                }
                                                                                xq2Var11.V();
                                                                                return jg7Var2;
                                                                        }
                                                                    }
                                                                }, xq2Var92), xq2Var92, 27648, 6);
                                                            } else {
                                                                xq2Var92.V();
                                                            }
                                                            return jg7Var;
                                                        default:
                                                            final l70 l70Var2 = (l70) obj6;
                                                            px0 px0Var4 = (px0) obj7;
                                                            int intValue6 = ((Integer) obj8).intValue();
                                                            l70Var2.getClass();
                                                            if ((intValue6 & 6) == 0) {
                                                                if (((xq2) px0Var4).f(l70Var2)) {
                                                                    i21 = 4;
                                                                }
                                                                intValue6 |= i21;
                                                            }
                                                            if ((intValue6 & 19) != 18) {
                                                                z332 = true;
                                                            }
                                                            xq2 xq2Var102 = (xq2) px0Var4;
                                                            if (xq2Var102.S(intValue6 & 1, z332)) {
                                                                final ss5 ss5Var10 = ss5Var4;
                                                                n06 n06Var4 = ss5Var10.f;
                                                                final ip3 ip3Var10 = ip3Var5;
                                                                final Map map11 = map9;
                                                                final Map map12 = map10;
                                                                final Set set4 = set2;
                                                                final boolean z37 = z31;
                                                                final boolean z38 = z29;
                                                                final int i24 = i11;
                                                                final om6 om6Var5 = om6Var2;
                                                                final int i25 = i18;
                                                                final qn2 qn2Var36 = qn2Var28;
                                                                final qn2 qn2Var37 = qn2Var24;
                                                                final qn2 qn2Var38 = qn2Var18;
                                                                final qn2 qn2Var39 = qn2Var19;
                                                                final qn2 qn2Var40 = qn2Var11;
                                                                final qn2 qn2Var41 = qn2Var23;
                                                                final on2 on2Var10 = on2Var8;
                                                                final qn2 qn2Var42 = qn2Var12;
                                                                final pr3 pr3Var7 = pr3Var5;
                                                                final boolean z39 = z32;
                                                                final qn2 qn2Var43 = qn2Var25;
                                                                final ss4 ss4Var4 = ss4Var2;
                                                                n16.d(n06Var4, null, null, "view_mode", n16.I(1411131810, new fo2() { // from class: xr5
                                                                    @Override // defpackage.fo2
                                                                    public final Object e(Object obj9, Object obj10, Object obj11) {
                                                                        boolean z372;
                                                                        boolean z382;
                                                                        int i242 = r25;
                                                                        jg7 jg7Var2 = jg7.a;
                                                                        int i252 = 4;
                                                                        vs0 vs0Var5 = ox0.a;
                                                                        final ss4 ss4Var42 = ss4Var4;
                                                                        l70 l70Var22 = l70Var2;
                                                                        switch (i242) {
                                                                            case 0:
                                                                                n06 n06Var42 = (n06) obj9;
                                                                                px0 px0Var42 = (px0) obj10;
                                                                                int intValue62 = ((Integer) obj11).intValue();
                                                                                n06Var42.getClass();
                                                                                if ((intValue62 & 6) == 0) {
                                                                                    if (!((xq2) px0Var42).d(n06Var42.ordinal())) {
                                                                                        i252 = 2;
                                                                                    }
                                                                                    intValue62 |= i252;
                                                                                }
                                                                                if ((intValue62 & 19) != 18) {
                                                                                    z372 = true;
                                                                                } else {
                                                                                    z372 = false;
                                                                                }
                                                                                xq2 xq2Var1022 = (xq2) px0Var42;
                                                                                if (xq2Var1022.S(intValue62 & 1, z372)) {
                                                                                    int i26 = ps5.a[n06Var42.ordinal()];
                                                                                    ss5 ss5Var102 = ss5Var10;
                                                                                    Map map112 = map11;
                                                                                    Map map122 = map12;
                                                                                    Set set42 = set4;
                                                                                    boolean z392 = z37;
                                                                                    boolean z40 = z38;
                                                                                    int i27 = i24;
                                                                                    om6 om6Var52 = om6Var5;
                                                                                    qn2 qn2Var362 = qn2Var36;
                                                                                    qn2 qn2Var372 = qn2Var37;
                                                                                    qn2 qn2Var382 = qn2Var38;
                                                                                    qn2 qn2Var392 = qn2Var39;
                                                                                    qn2 qn2Var402 = qn2Var40;
                                                                                    qn2 qn2Var412 = qn2Var41;
                                                                                    on2 on2Var102 = on2Var10;
                                                                                    qn2 qn2Var422 = qn2Var42;
                                                                                    if (i26 != 1) {
                                                                                        if (i26 == 2) {
                                                                                            xq2Var1022.b0(454331178);
                                                                                            float a92 = l70Var22.a();
                                                                                            int h4 = ss4Var42.h();
                                                                                            Object P15 = xq2Var1022.P();
                                                                                            if (P15 == vs0Var5) {
                                                                                                P15 = new qn2() { // from class: yr5
                                                                                                    @Override // defpackage.qn2
                                                                                                    public final Object g(Object obj12) {
                                                                                                        int i282 = r2;
                                                                                                        jg7 jg7Var3 = jg7.a;
                                                                                                        ss4 ss4Var5 = ss4Var42;
                                                                                                        int intValue72 = ((Integer) obj12).intValue();
                                                                                                        switch (i282) {
                                                                                                            case 0:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                            case 1:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                            case 2:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                            default:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                        }
                                                                                                    }
                                                                                                };
                                                                                                xq2Var1022.l0(P15);
                                                                                            }
                                                                                            nw7.w(ss5Var102, pr3Var7, map112, map122, z39, set42, z392, z40, i27, a92, om6Var52, h4, (qn2) P15, qn2Var362, qn2Var372, qn2Var382, qn2Var392, qn2Var43, qn2Var402, qn2Var412, on2Var102, qn2Var422, xq2Var1022, 905969664);
                                                                                            xq2Var1022.p(false);
                                                                                        } else {
                                                                                            throw xg6.f(xq2Var1022, 454263024, false);
                                                                                        }
                                                                                    } else {
                                                                                        xq2Var1022.b0(454263339);
                                                                                        float a102 = l70Var22.a();
                                                                                        int h5 = ss4Var42.h();
                                                                                        Object P16 = xq2Var1022.P();
                                                                                        if (P16 == vs0Var5) {
                                                                                            P16 = new qn2() { // from class: yr5
                                                                                                @Override // defpackage.qn2
                                                                                                public final Object g(Object obj12) {
                                                                                                    int i282 = r2;
                                                                                                    jg7 jg7Var3 = jg7.a;
                                                                                                    ss4 ss4Var5 = ss4Var42;
                                                                                                    int intValue72 = ((Integer) obj12).intValue();
                                                                                                    switch (i282) {
                                                                                                        case 0:
                                                                                                            ss4Var5.i(intValue72);
                                                                                                            return jg7Var3;
                                                                                                        case 1:
                                                                                                            ss4Var5.i(intValue72);
                                                                                                            return jg7Var3;
                                                                                                        case 2:
                                                                                                            ss4Var5.i(intValue72);
                                                                                                            return jg7Var3;
                                                                                                        default:
                                                                                                            ss4Var5.i(intValue72);
                                                                                                            return jg7Var3;
                                                                                                    }
                                                                                                }
                                                                                            };
                                                                                            xq2Var1022.l0(P16);
                                                                                        }
                                                                                        nw7.s(ss5Var102, ip3Var10, map112, map122, set42, z392, z40, i27, a102, om6Var52, h5, i25, (qn2) P16, qn2Var362, qn2Var372, qn2Var382, qn2Var392, qn2Var402, qn2Var412, on2Var102, qn2Var422, xq2Var1022, 113246208);
                                                                                        xq2Var1022.p(false);
                                                                                    }
                                                                                } else {
                                                                                    xq2Var1022.V();
                                                                                }
                                                                                return jg7Var2;
                                                                            default:
                                                                                n06 n06Var5 = (n06) obj9;
                                                                                px0 px0Var5 = (px0) obj10;
                                                                                int intValue7 = ((Integer) obj11).intValue();
                                                                                n06Var5.getClass();
                                                                                if ((intValue7 & 6) == 0) {
                                                                                    if (!((xq2) px0Var5).d(n06Var5.ordinal())) {
                                                                                        i252 = 2;
                                                                                    }
                                                                                    intValue7 |= i252;
                                                                                }
                                                                                if ((intValue7 & 19) != 18) {
                                                                                    z382 = true;
                                                                                } else {
                                                                                    z382 = false;
                                                                                }
                                                                                xq2 xq2Var11 = (xq2) px0Var5;
                                                                                if (xq2Var11.S(intValue7 & 1, z382)) {
                                                                                    int i28 = ps5.a[n06Var5.ordinal()];
                                                                                    ss5 ss5Var11 = ss5Var10;
                                                                                    Map map13 = map11;
                                                                                    Map map14 = map12;
                                                                                    Set set5 = set4;
                                                                                    boolean z41 = z37;
                                                                                    boolean z42 = z38;
                                                                                    int i29 = i24;
                                                                                    om6 om6Var6 = om6Var5;
                                                                                    qn2 qn2Var432 = qn2Var36;
                                                                                    qn2 qn2Var44 = qn2Var37;
                                                                                    qn2 qn2Var45 = qn2Var38;
                                                                                    qn2 qn2Var46 = qn2Var39;
                                                                                    qn2 qn2Var47 = qn2Var40;
                                                                                    qn2 qn2Var48 = qn2Var41;
                                                                                    on2 on2Var11 = on2Var10;
                                                                                    qn2 qn2Var49 = qn2Var42;
                                                                                    if (i28 != 1) {
                                                                                        if (i28 == 2) {
                                                                                            xq2Var11.b0(-1111928998);
                                                                                            float a11 = l70Var22.a();
                                                                                            int h6 = ss4Var42.h();
                                                                                            Object P17 = xq2Var11.P();
                                                                                            if (P17 == vs0Var5) {
                                                                                                P17 = new qn2() { // from class: yr5
                                                                                                    @Override // defpackage.qn2
                                                                                                    public final Object g(Object obj12) {
                                                                                                        int i282 = r2;
                                                                                                        jg7 jg7Var3 = jg7.a;
                                                                                                        ss4 ss4Var5 = ss4Var42;
                                                                                                        int intValue72 = ((Integer) obj12).intValue();
                                                                                                        switch (i282) {
                                                                                                            case 0:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                            case 1:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                            case 2:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                            default:
                                                                                                                ss4Var5.i(intValue72);
                                                                                                                return jg7Var3;
                                                                                                        }
                                                                                                    }
                                                                                                };
                                                                                                xq2Var11.l0(P17);
                                                                                            }
                                                                                            nw7.w(ss5Var11, pr3Var7, map13, map14, z39, set5, z41, z42, i29, a11, om6Var6, h6, (qn2) P17, qn2Var432, qn2Var44, qn2Var45, qn2Var46, qn2Var43, qn2Var47, qn2Var48, on2Var11, qn2Var49, xq2Var11, 905969664);
                                                                                            xq2Var11.p(false);
                                                                                            return jg7Var2;
                                                                                        }
                                                                                        throw xg6.f(xq2Var11, -1111990712, false);
                                                                                    }
                                                                                    xq2Var11.b0(-1111990429);
                                                                                    float a12 = l70Var22.a();
                                                                                    int h7 = ss4Var42.h();
                                                                                    Object P18 = xq2Var11.P();
                                                                                    if (P18 == vs0Var5) {
                                                                                        P18 = new qn2() { // from class: yr5
                                                                                            @Override // defpackage.qn2
                                                                                            public final Object g(Object obj12) {
                                                                                                int i282 = r2;
                                                                                                jg7 jg7Var3 = jg7.a;
                                                                                                ss4 ss4Var5 = ss4Var42;
                                                                                                int intValue72 = ((Integer) obj12).intValue();
                                                                                                switch (i282) {
                                                                                                    case 0:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 1:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 2:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    default:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                }
                                                                                            }
                                                                                        };
                                                                                        xq2Var11.l0(P18);
                                                                                    }
                                                                                    nw7.s(ss5Var11, ip3Var10, map13, map14, set5, z41, z42, i29, a12, om6Var6, h7, i25, (qn2) P18, qn2Var432, qn2Var44, qn2Var45, qn2Var46, qn2Var47, qn2Var48, on2Var11, qn2Var49, xq2Var11, 113246208);
                                                                                    xq2Var11.p(false);
                                                                                    return jg7Var2;
                                                                                }
                                                                                xq2Var11.V();
                                                                                return jg7Var2;
                                                                        }
                                                                    }
                                                                }, xq2Var102), xq2Var102, 27648, 6);
                                                            } else {
                                                                xq2Var102.V();
                                                            }
                                                            return jg7Var;
                                                    }
                                                }
                                            };
                                            i12 = i11;
                                            nw7.j(lc2Var2, null, n16.I(1671964019, fo2Var, xq2Var7), xq2Var7, 3078);
                                            z17 = false;
                                            xq2Var7.p(false);
                                        }
                                        if (m06Var4 == m06Var5) {
                                            z18 = true;
                                        } else {
                                            z18 = z17;
                                        }
                                        vs0Var3 = vs0Var4;
                                        xq2 xq2Var11 = xq2Var7;
                                        k65.b(z18, n65Var4, vs0Var3.n(x64Var2, e40Var2), es7Var8.c, es7Var8.j, xq2Var11, 64);
                                        xq2Var3 = xq2Var11;
                                        z19 = true;
                                        xq2Var3.p(true);
                                        xq2Var3.p(z17);
                                    }
                                    xq2Var3.p(z19);
                                    if (z29) {
                                        xq2Var3.b0(339000470);
                                        int i20 = ps5.a[n06Var2.ordinal()];
                                        if (i20 != z19) {
                                            if (i20 == 2) {
                                                i13 = 0;
                                                qr5Var = this;
                                            } else {
                                                i.d();
                                                return null;
                                            }
                                        } else {
                                            qr5Var = this;
                                            i13 = i9;
                                        }
                                        boolean d5 = xq2Var3.d(n06Var2.ordinal()) | xq2Var3.d(i13) | xq2Var3.d(i12);
                                        Object P15 = xq2Var3.P();
                                        vs0 vs0Var5 = ox0.a;
                                        if (!d5 && P15 != vs0Var5) {
                                            I = P15;
                                            ss5Var5 = ss5Var4;
                                            ip3Var6 = ip3Var5;
                                            pr3Var4 = pr3Var5;
                                        } else {
                                            ss5 ss5Var9 = ss5Var4;
                                            ip3 ip3Var9 = ip3Var5;
                                            ss5Var5 = ss5Var9;
                                            ip3Var6 = ip3Var9;
                                            pr3Var4 = pr3Var5;
                                            I = np2.I(new vr5(ss5Var9, ip3Var9, pr3Var5, i13, i12));
                                            xq2Var3.l0(I);
                                        }
                                        final pp6 pp6Var2 = I;
                                        boolean f7 = xq2Var3.f(ss5Var5.k) | xq2Var3.d(n06Var2.ordinal());
                                        Object P16 = xq2Var3.P();
                                        if (f7 || P16 == vs0Var5) {
                                            P16 = np2.I(new ci2(23, ss5Var5, pp6Var2));
                                            xq2Var3.l0(P16);
                                        }
                                        pp6 pp6Var3 = (pp6) P16;
                                        boolean d6 = xq2Var3.d(i12) | xq2Var3.d(n06Var2.ordinal());
                                        Object P17 = xq2Var3.P();
                                        final boolean z34 = z13;
                                        if (d6 || P17 == vs0Var5) {
                                            P17 = np2.I(new on2() { // from class: wr5
                                                @Override // defpackage.on2
                                                public final Object c() {
                                                    boolean z35;
                                                    if (z34 && ((Number) pp6Var2.getValue()).intValue() < i12) {
                                                        z35 = true;
                                                    } else {
                                                        z35 = false;
                                                    }
                                                    return Boolean.valueOf(z35);
                                                }
                                            });
                                            xq2Var3.l0(P17);
                                        }
                                        Map map11 = ss5Var5.k;
                                        Character ch = (Character) pp6Var3.getValue();
                                        boolean booleanValue = ((Boolean) ((pp6) P17).getValue()).booleanValue();
                                        w61 w61Var5 = w61Var4;
                                        boolean h4 = xq2Var3.h(w61Var5) | xq2Var3.h(ss5Var5) | xq2Var3.f(ip3Var6) | xq2Var3.f(pr3Var4);
                                        Object P18 = xq2Var3.P();
                                        if (h4 || P18 == vs0Var5) {
                                            P18 = new jn3(w61Var5, ss5Var5, ip3Var6, pr3Var4, om6Var2, 1);
                                            xq2Var3.l0(P18);
                                        }
                                        on2 on2Var9 = (on2) P18;
                                        boolean h5 = xq2Var3.h(w61Var5) | xq2Var3.h(ss5Var5) | xq2Var3.d(i13) | xq2Var3.d(i12) | xq2Var3.f(ip3Var6) | xq2Var3.f(pr3Var4);
                                        Object P19 = xq2Var3.P();
                                        if (h5 || P19 == vs0Var5) {
                                            P19 = new w3(w61Var5, ss5Var5, i13, i12, ip3Var6, pr3Var4, om6Var2);
                                            xq2Var3.l0(P19);
                                        }
                                        xq2 xq2Var12 = xq2Var3;
                                        ak7.e(map11, ch, z34, booleanValue, on2Var9, (eo2) P19, ge7.S(vs0Var3.n(x64Var2, d90.d0), RecyclerView.B1, 56.0f, 2.0f, 16.0f, 1), xq2Var12, 0);
                                        xq2Var3 = xq2Var12;
                                        xq2Var3.p(false);
                                    } else {
                                        xq2Var3.b0(342331296);
                                        xq2Var3.p(false);
                                    }
                                    xq2Var3.p(true);
                                } else {
                                    xq2Var4.V();
                                }
                                return jg7.a;
                            }
                        }, xq2Var2), xq2Var2, 1572870, 58);
                        xq2Var = xq2Var2;
                    }
                } else {
                    w61Var = w61Var3;
                }
                z3 = false;
                if (ss5Var2.e) {
                }
                z4 = !z7;
                final boolean z122 = z3;
                List list22 = ss5Var2.b;
                final boolean z132 = z10;
                Boolean valueOf3 = Boolean.valueOf(z7);
                f = xq2Var2.f(a) | xq2Var2.f(a2);
                P = xq2Var2.P();
                if (!f) {
                }
                P = new u12(a, a2, ss4Var, (r41) null, 26);
                xq2Var2.l0(P);
                eo2 eo2Var2 = (eo2) P;
                l61 l61Var2 = xq2Var2.R;
                f2 = xq2Var2.f(qw5Var) | xq2Var2.f(list22) | xq2Var2.f(valueOf3);
                P2 = xq2Var2.P();
                if (!f2) {
                }
                P2 = new ij3(l61Var2, eo2Var2);
                xq2Var2.l0(P2);
                ij3 ij3Var2 = (ij3) P2;
                Integer valueOf22 = Integer.valueOf(ss4Var.h());
                h = xq2Var2.h(ss5Var2) | ((z8 & 7168) != 2048);
                P3 = xq2Var2.P();
                if (h) {
                }
                z5 = z8;
                n65Var = n65Var2;
                es7Var = F;
                ip3Var = a;
                pr3Var = a2;
                i2 = 1;
                z6 = z4;
                vs0Var = vs0Var2;
                ag agVar2 = new ag(ss5Var2, qn2Var9, ss4Var, null, 11);
                xq2Var2.l0(agVar2);
                P3 = agVar2;
                mb3.j(valueOf22, list, (eo2) P3, xq2Var2);
                P4 = xq2Var2.P();
                if (P4 == vs0Var) {
                }
                pp6 pp6Var2 = (pp6) P4;
                d = xq2Var2.d(((Number) pp6Var2.getValue()).intValue()) | xq2Var2.d(size) | xq2Var2.d(intValue);
                P5 = xq2Var2.P();
                if (d) {
                }
                int i72 = Integer.MAX_VALUE;
                if (size > 0) {
                }
                P5 = Integer.valueOf(i72);
                xq2Var2.l0(P5);
                final int intValue32 = ((Number) P5).intValue();
                Object[] objArr3 = {n06Var, Integer.valueOf(ss4Var.h()), Integer.valueOf(intValue32), Integer.valueOf(list.size()), qn2Var10};
                i4 = (xq2Var2.h(ss5Var2) ? 1 : 0) | (!(z5 & true) ? i3 : 0) | (xq2Var2.d(intValue32) ? 1 : 0);
                P6 = xq2Var2.P();
                if (i4 == 0) {
                }
                gi1 gi1Var2 = new gi1(qn2Var10, ss5Var2, intValue32, ss4Var, 2);
                ss5Var2 = ss5Var2;
                xq2Var2.l0(gi1Var2);
                P6 = gi1Var2;
                mb3.f(objArr3, (qn2) P6, xq2Var2);
                Object[] objArr22 = {n06Var, Integer.valueOf(intValue32), Integer.valueOf(list.size()), Integer.valueOf(ss4Var.h())};
                h2 = xq2Var2.h(ss5Var2) | xq2Var2.d(intValue32) | xq2Var2.f(ip3Var) | xq2Var2.f(pr3Var);
                P7 = xq2Var2.P();
                if (h2) {
                }
                ip3 ip3Var32 = ip3Var;
                pr3Var2 = pr3Var;
                z22 z22Var2 = new z22(ss5Var2, ss4Var, intValue32, ip3Var32, pr3Var2, null);
                ip3Var2 = ip3Var32;
                xq2Var2.l0(z22Var2);
                P7 = z22Var2;
                mb3.k(objArr22, (eo2) P7, xq2Var2);
                final es7 es7Var22 = es7Var;
                long j2 = es7Var22.b;
                lc2 lc2Var2 = dj6.c;
                final pr3 pr3Var32 = pr3Var2;
                final w61 w61Var42 = w61Var;
                final ip3 ip3Var42 = ip3Var2;
                final n65 n65Var32 = n65Var;
                final int i92 = z132 ? 1 : 0;
                ej2.c(lc2Var2, null, j2, 0L, RecyclerView.B1, n16.I(71588444, new eo2() { // from class: qr5
                    @Override // defpackage.eo2
                    public final Object o(Object obj4, Object obj5) {
                        boolean z14;
                        es7 es7Var3;
                        c40 c40Var;
                        m06 m06Var2;
                        m06 m06Var3;
                        x64 x64Var;
                        x64 x64Var2;
                        final om6 om6Var2;
                        qw5 qw5Var2;
                        final qn2 qn2Var11;
                        boolean z15;
                        e40 e40Var;
                        m06 m06Var4;
                        final qn2 qn2Var12;
                        qn2 qn2Var13;
                        m06 m06Var5;
                        int i10;
                        Map map3;
                        ss5 ss5Var3;
                        final int i11;
                        boolean z16;
                        final ip3 ip3Var5;
                        final ss5 ss5Var4;
                        final int i12;
                        boolean z17;
                        boolean z18;
                        vs0 vs0Var3;
                        xq2 xq2Var3;
                        boolean z19;
                        boolean z20;
                        String l;
                        qr5 qr5Var;
                        int i13;
                        ss5 ss5Var5;
                        ip3 ip3Var6;
                        pr3 pr3Var4;
                        pp6 I;
                        final Map map4;
                        qw5 qw5Var3;
                        final qn2 qn2Var14;
                        c40 c40Var2;
                        qn2 qn2Var15;
                        int i14;
                        float f5;
                        float f6;
                        Map map5;
                        qn2 qn2Var16;
                        es7 es7Var4;
                        final qn2 qn2Var17;
                        final ss5 ss5Var6;
                        boolean z21;
                        ss5 ss5Var7;
                        ip3 ip3Var7;
                        boolean z22;
                        String l2;
                        boolean z23;
                        es7 es7Var5 = es7Var22;
                        long j22 = es7Var5.f;
                        px0 px0Var2 = (px0) obj4;
                        int intValue4 = ((Integer) obj5).intValue();
                        e40 e40Var2 = d90.R;
                        if ((intValue4 & 3) != 2) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        xq2 xq2Var4 = (xq2) px0Var2;
                        if (xq2Var4.S(intValue4 & 1, z14)) {
                            lc2 lc2Var22 = dj6.c;
                            a74 j02 = nc1.j0(lc2Var22, nc1.o);
                            e40 e40Var3 = d90.L;
                            e34 d2 = h70.d(e40Var3, false);
                            int hashCode = Long.hashCode(xq2Var4.T);
                            xv4 l3 = xq2Var4.l();
                            a74 E = l.E(xq2Var4, j02);
                            jx0.i.getClass();
                            iy0 iy0Var = ix0.b;
                            xq2Var4.f0();
                            if (xq2Var4.S) {
                                xq2Var4.k(iy0Var);
                            } else {
                                xq2Var4.o0();
                            }
                            pn pnVar = ix0.f;
                            yh2.K(xq2Var4, pnVar, d2);
                            pn pnVar2 = ix0.e;
                            yh2.K(xq2Var4, pnVar2, l3);
                            Integer valueOf32 = Integer.valueOf(hashCode);
                            pn pnVar3 = ix0.g;
                            yh2.K(xq2Var4, pnVar3, valueOf32);
                            ne neVar = ix0.h;
                            yh2.F(xq2Var4, neVar);
                            pn pnVar4 = ix0.d;
                            yh2.K(xq2Var4, pnVar4, E);
                            vs0 vs0Var4 = vs0.Y;
                            c40 c40Var3 = d90.k0;
                            eu euVar = ju.c;
                            yt0 a3 = wt0.a(euVar, c40Var3, xq2Var4, 0);
                            int hashCode2 = Long.hashCode(xq2Var4.T);
                            xv4 l4 = xq2Var4.l();
                            a74 E2 = l.E(xq2Var4, lc2Var22);
                            xq2Var4.f0();
                            if (xq2Var4.S) {
                                xq2Var4.k(iy0Var);
                            } else {
                                xq2Var4.o0();
                            }
                            yh2.K(xq2Var4, pnVar, a3);
                            yh2.K(xq2Var4, pnVar2, l4);
                            i61.w(hashCode2, xq2Var4, pnVar3, xq2Var4, neVar);
                            yh2.K(xq2Var4, pnVar4, E2);
                            ss5 ss5Var8 = ss5Var;
                            boolean z24 = ss5Var8.d;
                            boolean z25 = ss5Var8.c;
                            List list3 = ss5Var8.b;
                            n06 n06Var2 = ss5Var8.f;
                            qw5 qw5Var4 = ss5Var8.g;
                            List list4 = ss5Var8.a;
                            ak7.D(z24, str, ss5Var8.f, qn2Var7, on2Var3, on2Var4, on2Var5, on2Var6, on2Var2, on2Var7, null, xq2Var4, 0);
                            xq2 xq2Var5 = xq2Var4;
                            m06 m06Var6 = m06.SCANNING;
                            m06 m06Var7 = m06Var;
                            x64 x64Var3 = x64.a;
                            if (m06Var7 == m06Var6) {
                                xq2Var5.b0(1705617527);
                                c40Var = c40Var3;
                                m06Var3 = m06Var7;
                                x64Var = x64Var3;
                                m06Var2 = m06Var6;
                                es7Var3 = es7Var5;
                                e45.b(dj6.c(x64Var3, 1.0f), es7Var5.l, es7Var5.d, xq2Var5, 6, 8);
                                xq2Var5 = xq2Var5;
                                xq2Var5.p(false);
                            } else {
                                es7Var3 = es7Var5;
                                c40Var = c40Var3;
                                m06Var2 = m06Var6;
                                m06Var3 = m06Var7;
                                x64Var = x64Var3;
                                xq2Var5.b0(1705838154);
                                xq2Var5.p(false);
                            }
                            boolean z26 = ss5Var8.c;
                            boolean z27 = ss5Var8.e;
                            boolean z28 = ss5Var8.d;
                            xq2 xq2Var6 = xq2Var5;
                            final on2 on2Var8 = on2Var;
                            ak7.i(list3, z26, z27, z28, on2Var8, null, xq2Var6, 0);
                            xq2 xq2Var7 = xq2Var6;
                            Configuration configuration = (Configuration) xq2Var7.j(kf.a);
                            int i15 = configuration.screenWidthDp;
                            int i16 = configuration.screenHeightDp;
                            final boolean z29 = z122;
                            final int i17 = intValue;
                            final ip3 ip3Var8 = ip3Var42;
                            final pr3 pr3Var5 = pr3Var32;
                            n65 n65Var4 = n65Var32;
                            Map map6 = map;
                            Map map7 = map2;
                            final qn2 qn2Var18 = qn2Var2;
                            final qn2 qn2Var19 = qn2Var3;
                            qn2 qn2Var20 = qn2Var9;
                            qn2 qn2Var21 = qn2Var8;
                            qn2 qn2Var22 = qn2Var5;
                            boolean z30 = z6;
                            final qn2 qn2Var23 = qn2Var6;
                            final Set set2 = set;
                            final boolean z31 = z2;
                            om6 om6Var3 = om6Var;
                            final int i18 = intValue32;
                            final qn2 qn2Var24 = qn2Var;
                            final boolean z32 = z;
                            final qn2 qn2Var25 = qn2Var4;
                            final ss4 ss4Var2 = ss4Var;
                            if (i15 > i16) {
                                xq2Var7.b0(1706661700);
                                a74 a4 = zt0.a(dj6.c(x64Var, 1.0f));
                                l26 a5 = k26.a(ju.a, d90.h0, xq2Var7, 0);
                                int hashCode3 = Long.hashCode(xq2Var7.T);
                                xv4 l5 = xq2Var7.l();
                                a74 E3 = l.E(xq2Var7, a4);
                                xq2Var7.f0();
                                if (xq2Var7.S) {
                                    xq2Var7.k(iy0Var);
                                } else {
                                    xq2Var7.o0();
                                }
                                yh2.K(xq2Var7, pnVar, a5);
                                yh2.K(xq2Var7, pnVar2, l5);
                                i61.w(hashCode3, xq2Var7, pnVar3, xq2Var7, neVar);
                                yh2.K(xq2Var7, pnVar4, E3);
                                a74 R2 = ge7.R(dj6.b(dj6.c(x64Var, 0.38f), 1.0f), 16.0f, 6.0f, 10.0f, 6.0f);
                                yt0 a6 = wt0.a(euVar, c40Var, xq2Var7, 0);
                                int hashCode4 = Long.hashCode(xq2Var7.T);
                                xv4 l6 = xq2Var7.l();
                                a74 E4 = l.E(xq2Var7, R2);
                                xq2Var7.f0();
                                if (xq2Var7.S) {
                                    xq2Var7.k(iy0Var);
                                } else {
                                    xq2Var7.o0();
                                }
                                yh2.K(xq2Var7, pnVar, a6);
                                yh2.K(xq2Var7, pnVar2, l6);
                                i61.w(hashCode4, xq2Var7, pnVar3, xq2Var7, neVar);
                                yh2.K(xq2Var7, pnVar4, E4);
                                if (!ss5Var8.j.isEmpty() && !ss5Var8.d && !z25) {
                                    xq2Var7.b0(284390862);
                                    c40Var2 = c40Var;
                                    f5 = 10.0f;
                                    f6 = 16.0f;
                                    ak7.o(ss5Var8.j, map6, map7, qn2Var18, qn2Var19, null, qn2Var20, qn2Var21, xq2Var7, 0);
                                    map5 = map7;
                                    qn2Var15 = qn2Var20;
                                    qn2Var14 = qn2Var21;
                                    xq2Var7 = xq2Var7;
                                    qw5Var3 = qw5Var4;
                                    i14 = R.string.rom_all_games;
                                    map4 = map6;
                                    xq2Var7.p(false);
                                    qn2Var16 = qn2Var22;
                                } else {
                                    map4 = map6;
                                    qw5Var3 = qw5Var4;
                                    qn2Var14 = qn2Var21;
                                    c40Var2 = c40Var;
                                    qn2Var15 = qn2Var20;
                                    i14 = R.string.rom_all_games;
                                    f5 = 10.0f;
                                    f6 = 16.0f;
                                    map5 = map7;
                                    xq2Var7.b0(284975708);
                                    ak7.l(list4.size(), ss5Var8.g, qn2Var22, null, xq2Var7, 0);
                                    qn2Var16 = qn2Var22;
                                    xq2Var7.p(false);
                                }
                                xq2Var7.p(true);
                                a74 Q = ge7.Q(dj6.b(dj6.l(x64Var, 1.0f), 1.0f), RecyclerView.B1, 8.0f, 1);
                                int i19 = kt0.i;
                                qn2 qn2Var26 = qn2Var16;
                                long j3 = kt0.g;
                                x64 x64Var4 = x64Var;
                                es7 es7Var6 = es7Var3;
                                h70.a(vy7.J(Q, d90.m(hf.c0(new kt0(j3), new kt0(kt0.c(0.6f, j22)), new kt0(kt0.c(0.5f, es7Var6.j)), new kt0(kt0.c(0.6f, j22)), new kt0(j3)), RecyclerView.B1, RecyclerView.B1, 14)), xq2Var7, 0);
                                a74 S = ge7.S(dj6.b(new vn3(1.0f, true), 1.0f), f5, RecyclerView.B1, f6, RecyclerView.B1, 10);
                                yt0 a7 = wt0.a(euVar, c40Var2, xq2Var7, 0);
                                int hashCode5 = Long.hashCode(xq2Var7.T);
                                xv4 l7 = xq2Var7.l();
                                a74 E5 = l.E(xq2Var7, S);
                                xq2Var7.f0();
                                if (xq2Var7.S) {
                                    xq2Var7.k(iy0Var);
                                } else {
                                    xq2Var7.o0();
                                }
                                yh2.K(xq2Var7, pnVar, a7);
                                yh2.K(xq2Var7, pnVar2, l7);
                                i61.w(hashCode5, xq2Var7, pnVar3, xq2Var7, neVar);
                                yh2.K(xq2Var7, pnVar4, E5);
                                qw5 qw5Var5 = qw5Var3;
                                ak7.v(qw5Var5, qn2Var26, null, xq2Var7, 0);
                                if (z30) {
                                    xq2Var7.b0(-874948230);
                                    int size2 = gt0.D0(list4, i17).size();
                                    if (z25) {
                                        xq2Var7.b0(-874764865);
                                        l2 = (String) gt0.R0(list3);
                                        if (l2 == null) {
                                            list4 = list4;
                                            qn2Var17 = qn2Var26;
                                            z23 = false;
                                            l2 = i61.l(xq2Var7, 525972161, i14, xq2Var7, false);
                                        } else {
                                            list4 = list4;
                                            qn2Var17 = qn2Var26;
                                            z23 = false;
                                            xq2Var7.b0(525971107);
                                            xq2Var7.p(false);
                                        }
                                        xq2Var7.p(z23);
                                    } else {
                                        list4 = list4;
                                        qn2Var17 = qn2Var26;
                                        l2 = i61.l(xq2Var7, 525973569, i14, xq2Var7, false);
                                    }
                                    i17 = i17;
                                    xq2 xq2Var8 = xq2Var7;
                                    es7Var4 = es7Var6;
                                    x64Var2 = x64Var4;
                                    ss5Var6 = ss5Var8;
                                    ak7.x(l2, ss5Var8.c, ss5Var8.h, ss5Var8.i, size2, on2Var8, qn2Var23, ge7.Q(x64Var2, RecyclerView.B1, RecyclerView.B1, 2), xq2Var8, 12582912);
                                    xq2Var7 = xq2Var8;
                                    z21 = false;
                                    xq2Var7.p(false);
                                } else {
                                    es7Var4 = es7Var6;
                                    qn2Var17 = qn2Var26;
                                    ss5Var6 = ss5Var8;
                                    x64Var2 = x64Var4;
                                    z21 = false;
                                    xq2Var7.b0(-874105433);
                                    xq2Var7.p(false);
                                }
                                a74 G = xk2.G(zt0.a(dj6.c(x64Var2, 1.0f)), n65Var4);
                                e34 d3 = h70.d(e40Var3, z21);
                                int hashCode6 = Long.hashCode(xq2Var7.T);
                                xv4 l8 = xq2Var7.l();
                                a74 E6 = l.E(xq2Var7, G);
                                xq2Var7.f0();
                                if (xq2Var7.S) {
                                    xq2Var7.k(iy0Var);
                                } else {
                                    xq2Var7.o0();
                                }
                                yh2.K(xq2Var7, pnVar, d3);
                                yh2.K(xq2Var7, pnVar2, l8);
                                i61.w(hashCode6, xq2Var7, pnVar3, xq2Var7, neVar);
                                yh2.K(xq2Var7, pnVar4, E6);
                                if (list4.isEmpty()) {
                                    xq2Var7.b0(-1588783810);
                                    yt0 a8 = wt0.a(euVar, c40Var2, xq2Var7, 0);
                                    int hashCode7 = Long.hashCode(xq2Var7.T);
                                    xv4 l9 = xq2Var7.l();
                                    a74 E7 = l.E(xq2Var7, lc2Var22);
                                    xq2Var7.f0();
                                    if (xq2Var7.S) {
                                        xq2Var7.k(iy0Var);
                                    } else {
                                        xq2Var7.o0();
                                    }
                                    yh2.K(xq2Var7, pnVar, a8);
                                    yh2.K(xq2Var7, pnVar2, l9);
                                    i61.w(hashCode7, xq2Var7, pnVar3, xq2Var7, neVar);
                                    yh2.K(xq2Var7, pnVar4, E7);
                                    nw7.r(qw5Var5, xq2Var7, 0);
                                    xq2Var7.p(true);
                                    xq2Var7.p(false);
                                    ip3Var7 = ip3Var8;
                                    ss5Var7 = ss5Var6;
                                    om6Var2 = om6Var3;
                                } else {
                                    xq2Var7.b0(-1588413360);
                                    om6Var2 = om6Var3;
                                    final Map map8 = map5;
                                    final qn2 qn2Var27 = qn2Var15;
                                    ss5Var7 = ss5Var6;
                                    ip3Var7 = ip3Var8;
                                    nw7.j(lc2Var22, null, n16.I(-1655686469, new fo2() { // from class: tr5
                                        @Override // defpackage.fo2
                                        public final Object e(Object obj6, Object obj7, Object obj8) {
                                            int i20 = r24;
                                            jg7 jg7Var = jg7.a;
                                            boolean z332 = false;
                                            int i21 = 2;
                                            switch (i20) {
                                                case 0:
                                                    final l70 l70Var = (l70) obj6;
                                                    px0 px0Var3 = (px0) obj7;
                                                    int intValue5 = ((Integer) obj8).intValue();
                                                    l70Var.getClass();
                                                    if ((intValue5 & 6) == 0) {
                                                        if (((xq2) px0Var3).f(l70Var)) {
                                                            i21 = 4;
                                                        }
                                                        intValue5 |= i21;
                                                    }
                                                    if ((intValue5 & 19) != 18) {
                                                        z332 = true;
                                                    }
                                                    xq2 xq2Var92 = (xq2) px0Var3;
                                                    if (xq2Var92.S(intValue5 & 1, z332)) {
                                                        final ss5 ss5Var9 = ss5Var6;
                                                        n06 n06Var3 = ss5Var9.f;
                                                        final ip3 ip3Var9 = ip3Var8;
                                                        final Map map92 = map4;
                                                        final Map map102 = map8;
                                                        final Set set3 = set2;
                                                        final boolean z34 = z31;
                                                        final boolean z35 = z29;
                                                        final int i22 = i17;
                                                        final om6 om6Var4 = om6Var2;
                                                        final int i23 = i18;
                                                        final qn2 qn2Var282 = qn2Var27;
                                                        final qn2 qn2Var29 = qn2Var24;
                                                        final qn2 qn2Var30 = qn2Var18;
                                                        final qn2 qn2Var31 = qn2Var19;
                                                        final qn2 qn2Var32 = qn2Var17;
                                                        final qn2 qn2Var33 = qn2Var23;
                                                        final on2 on2Var9 = on2Var8;
                                                        final qn2 qn2Var34 = qn2Var14;
                                                        final pr3 pr3Var6 = pr3Var5;
                                                        final boolean z36 = z32;
                                                        final qn2 qn2Var35 = qn2Var25;
                                                        final ss4 ss4Var3 = ss4Var2;
                                                        n16.d(n06Var3, null, null, "view_mode", n16.I(-263214166, new fo2() { // from class: xr5
                                                            @Override // defpackage.fo2
                                                            public final Object e(Object obj9, Object obj10, Object obj11) {
                                                                boolean z372;
                                                                boolean z382;
                                                                int i242 = r25;
                                                                jg7 jg7Var2 = jg7.a;
                                                                int i252 = 4;
                                                                vs0 vs0Var5 = ox0.a;
                                                                final ss4 ss4Var42 = ss4Var3;
                                                                l70 l70Var22 = l70Var;
                                                                switch (i242) {
                                                                    case 0:
                                                                        n06 n06Var42 = (n06) obj9;
                                                                        px0 px0Var42 = (px0) obj10;
                                                                        int intValue62 = ((Integer) obj11).intValue();
                                                                        n06Var42.getClass();
                                                                        if ((intValue62 & 6) == 0) {
                                                                            if (!((xq2) px0Var42).d(n06Var42.ordinal())) {
                                                                                i252 = 2;
                                                                            }
                                                                            intValue62 |= i252;
                                                                        }
                                                                        if ((intValue62 & 19) != 18) {
                                                                            z372 = true;
                                                                        } else {
                                                                            z372 = false;
                                                                        }
                                                                        xq2 xq2Var1022 = (xq2) px0Var42;
                                                                        if (xq2Var1022.S(intValue62 & 1, z372)) {
                                                                            int i26 = ps5.a[n06Var42.ordinal()];
                                                                            ss5 ss5Var102 = ss5Var9;
                                                                            Map map112 = map92;
                                                                            Map map122 = map102;
                                                                            Set set42 = set3;
                                                                            boolean z392 = z34;
                                                                            boolean z40 = z35;
                                                                            int i27 = i22;
                                                                            om6 om6Var52 = om6Var4;
                                                                            qn2 qn2Var362 = qn2Var282;
                                                                            qn2 qn2Var372 = qn2Var29;
                                                                            qn2 qn2Var382 = qn2Var30;
                                                                            qn2 qn2Var392 = qn2Var31;
                                                                            qn2 qn2Var402 = qn2Var32;
                                                                            qn2 qn2Var412 = qn2Var33;
                                                                            on2 on2Var102 = on2Var9;
                                                                            qn2 qn2Var422 = qn2Var34;
                                                                            if (i26 != 1) {
                                                                                if (i26 == 2) {
                                                                                    xq2Var1022.b0(454331178);
                                                                                    float a92 = l70Var22.a();
                                                                                    int h4 = ss4Var42.h();
                                                                                    Object P15 = xq2Var1022.P();
                                                                                    if (P15 == vs0Var5) {
                                                                                        P15 = new qn2() { // from class: yr5
                                                                                            @Override // defpackage.qn2
                                                                                            public final Object g(Object obj12) {
                                                                                                int i282 = r2;
                                                                                                jg7 jg7Var3 = jg7.a;
                                                                                                ss4 ss4Var5 = ss4Var42;
                                                                                                int intValue72 = ((Integer) obj12).intValue();
                                                                                                switch (i282) {
                                                                                                    case 0:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 1:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 2:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    default:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                }
                                                                                            }
                                                                                        };
                                                                                        xq2Var1022.l0(P15);
                                                                                    }
                                                                                    nw7.w(ss5Var102, pr3Var6, map112, map122, z36, set42, z392, z40, i27, a92, om6Var52, h4, (qn2) P15, qn2Var362, qn2Var372, qn2Var382, qn2Var392, qn2Var35, qn2Var402, qn2Var412, on2Var102, qn2Var422, xq2Var1022, 905969664);
                                                                                    xq2Var1022.p(false);
                                                                                } else {
                                                                                    throw xg6.f(xq2Var1022, 454263024, false);
                                                                                }
                                                                            } else {
                                                                                xq2Var1022.b0(454263339);
                                                                                float a102 = l70Var22.a();
                                                                                int h5 = ss4Var42.h();
                                                                                Object P16 = xq2Var1022.P();
                                                                                if (P16 == vs0Var5) {
                                                                                    P16 = new qn2() { // from class: yr5
                                                                                        @Override // defpackage.qn2
                                                                                        public final Object g(Object obj12) {
                                                                                            int i282 = r2;
                                                                                            jg7 jg7Var3 = jg7.a;
                                                                                            ss4 ss4Var5 = ss4Var42;
                                                                                            int intValue72 = ((Integer) obj12).intValue();
                                                                                            switch (i282) {
                                                                                                case 0:
                                                                                                    ss4Var5.i(intValue72);
                                                                                                    return jg7Var3;
                                                                                                case 1:
                                                                                                    ss4Var5.i(intValue72);
                                                                                                    return jg7Var3;
                                                                                                case 2:
                                                                                                    ss4Var5.i(intValue72);
                                                                                                    return jg7Var3;
                                                                                                default:
                                                                                                    ss4Var5.i(intValue72);
                                                                                                    return jg7Var3;
                                                                                            }
                                                                                        }
                                                                                    };
                                                                                    xq2Var1022.l0(P16);
                                                                                }
                                                                                nw7.s(ss5Var102, ip3Var9, map112, map122, set42, z392, z40, i27, a102, om6Var52, h5, i23, (qn2) P16, qn2Var362, qn2Var372, qn2Var382, qn2Var392, qn2Var402, qn2Var412, on2Var102, qn2Var422, xq2Var1022, 113246208);
                                                                                xq2Var1022.p(false);
                                                                            }
                                                                        } else {
                                                                            xq2Var1022.V();
                                                                        }
                                                                        return jg7Var2;
                                                                    default:
                                                                        n06 n06Var5 = (n06) obj9;
                                                                        px0 px0Var5 = (px0) obj10;
                                                                        int intValue7 = ((Integer) obj11).intValue();
                                                                        n06Var5.getClass();
                                                                        if ((intValue7 & 6) == 0) {
                                                                            if (!((xq2) px0Var5).d(n06Var5.ordinal())) {
                                                                                i252 = 2;
                                                                            }
                                                                            intValue7 |= i252;
                                                                        }
                                                                        if ((intValue7 & 19) != 18) {
                                                                            z382 = true;
                                                                        } else {
                                                                            z382 = false;
                                                                        }
                                                                        xq2 xq2Var11 = (xq2) px0Var5;
                                                                        if (xq2Var11.S(intValue7 & 1, z382)) {
                                                                            int i28 = ps5.a[n06Var5.ordinal()];
                                                                            ss5 ss5Var11 = ss5Var9;
                                                                            Map map13 = map92;
                                                                            Map map14 = map102;
                                                                            Set set5 = set3;
                                                                            boolean z41 = z34;
                                                                            boolean z42 = z35;
                                                                            int i29 = i22;
                                                                            om6 om6Var6 = om6Var4;
                                                                            qn2 qn2Var432 = qn2Var282;
                                                                            qn2 qn2Var44 = qn2Var29;
                                                                            qn2 qn2Var45 = qn2Var30;
                                                                            qn2 qn2Var46 = qn2Var31;
                                                                            qn2 qn2Var47 = qn2Var32;
                                                                            qn2 qn2Var48 = qn2Var33;
                                                                            on2 on2Var11 = on2Var9;
                                                                            qn2 qn2Var49 = qn2Var34;
                                                                            if (i28 != 1) {
                                                                                if (i28 == 2) {
                                                                                    xq2Var11.b0(-1111928998);
                                                                                    float a11 = l70Var22.a();
                                                                                    int h6 = ss4Var42.h();
                                                                                    Object P17 = xq2Var11.P();
                                                                                    if (P17 == vs0Var5) {
                                                                                        P17 = new qn2() { // from class: yr5
                                                                                            @Override // defpackage.qn2
                                                                                            public final Object g(Object obj12) {
                                                                                                int i282 = r2;
                                                                                                jg7 jg7Var3 = jg7.a;
                                                                                                ss4 ss4Var5 = ss4Var42;
                                                                                                int intValue72 = ((Integer) obj12).intValue();
                                                                                                switch (i282) {
                                                                                                    case 0:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 1:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 2:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    default:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                }
                                                                                            }
                                                                                        };
                                                                                        xq2Var11.l0(P17);
                                                                                    }
                                                                                    nw7.w(ss5Var11, pr3Var6, map13, map14, z36, set5, z41, z42, i29, a11, om6Var6, h6, (qn2) P17, qn2Var432, qn2Var44, qn2Var45, qn2Var46, qn2Var35, qn2Var47, qn2Var48, on2Var11, qn2Var49, xq2Var11, 905969664);
                                                                                    xq2Var11.p(false);
                                                                                    return jg7Var2;
                                                                                }
                                                                                throw xg6.f(xq2Var11, -1111990712, false);
                                                                            }
                                                                            xq2Var11.b0(-1111990429);
                                                                            float a12 = l70Var22.a();
                                                                            int h7 = ss4Var42.h();
                                                                            Object P18 = xq2Var11.P();
                                                                            if (P18 == vs0Var5) {
                                                                                P18 = new qn2() { // from class: yr5
                                                                                    @Override // defpackage.qn2
                                                                                    public final Object g(Object obj12) {
                                                                                        int i282 = r2;
                                                                                        jg7 jg7Var3 = jg7.a;
                                                                                        ss4 ss4Var5 = ss4Var42;
                                                                                        int intValue72 = ((Integer) obj12).intValue();
                                                                                        switch (i282) {
                                                                                            case 0:
                                                                                                ss4Var5.i(intValue72);
                                                                                                return jg7Var3;
                                                                                            case 1:
                                                                                                ss4Var5.i(intValue72);
                                                                                                return jg7Var3;
                                                                                            case 2:
                                                                                                ss4Var5.i(intValue72);
                                                                                                return jg7Var3;
                                                                                            default:
                                                                                                ss4Var5.i(intValue72);
                                                                                                return jg7Var3;
                                                                                        }
                                                                                    }
                                                                                };
                                                                                xq2Var11.l0(P18);
                                                                            }
                                                                            nw7.s(ss5Var11, ip3Var9, map13, map14, set5, z41, z42, i29, a12, om6Var6, h7, i23, (qn2) P18, qn2Var432, qn2Var44, qn2Var45, qn2Var46, qn2Var47, qn2Var48, on2Var11, qn2Var49, xq2Var11, 113246208);
                                                                            xq2Var11.p(false);
                                                                            return jg7Var2;
                                                                        }
                                                                        xq2Var11.V();
                                                                        return jg7Var2;
                                                                }
                                                            }
                                                        }, xq2Var92), xq2Var92, 27648, 6);
                                                    } else {
                                                        xq2Var92.V();
                                                    }
                                                    return jg7Var;
                                                default:
                                                    final l70 l70Var2 = (l70) obj6;
                                                    px0 px0Var4 = (px0) obj7;
                                                    int intValue6 = ((Integer) obj8).intValue();
                                                    l70Var2.getClass();
                                                    if ((intValue6 & 6) == 0) {
                                                        if (((xq2) px0Var4).f(l70Var2)) {
                                                            i21 = 4;
                                                        }
                                                        intValue6 |= i21;
                                                    }
                                                    if ((intValue6 & 19) != 18) {
                                                        z332 = true;
                                                    }
                                                    xq2 xq2Var102 = (xq2) px0Var4;
                                                    if (xq2Var102.S(intValue6 & 1, z332)) {
                                                        final ss5 ss5Var10 = ss5Var6;
                                                        n06 n06Var4 = ss5Var10.f;
                                                        final ip3 ip3Var10 = ip3Var8;
                                                        final Map map11 = map4;
                                                        final Map map12 = map8;
                                                        final Set set4 = set2;
                                                        final boolean z37 = z31;
                                                        final boolean z38 = z29;
                                                        final int i24 = i17;
                                                        final om6 om6Var5 = om6Var2;
                                                        final int i25 = i18;
                                                        final qn2 qn2Var36 = qn2Var27;
                                                        final qn2 qn2Var37 = qn2Var24;
                                                        final qn2 qn2Var38 = qn2Var18;
                                                        final qn2 qn2Var39 = qn2Var19;
                                                        final qn2 qn2Var40 = qn2Var17;
                                                        final qn2 qn2Var41 = qn2Var23;
                                                        final on2 on2Var10 = on2Var8;
                                                        final qn2 qn2Var42 = qn2Var14;
                                                        final pr3 pr3Var7 = pr3Var5;
                                                        final boolean z39 = z32;
                                                        final qn2 qn2Var43 = qn2Var25;
                                                        final ss4 ss4Var4 = ss4Var2;
                                                        n16.d(n06Var4, null, null, "view_mode", n16.I(1411131810, new fo2() { // from class: xr5
                                                            @Override // defpackage.fo2
                                                            public final Object e(Object obj9, Object obj10, Object obj11) {
                                                                boolean z372;
                                                                boolean z382;
                                                                int i242 = r25;
                                                                jg7 jg7Var2 = jg7.a;
                                                                int i252 = 4;
                                                                vs0 vs0Var5 = ox0.a;
                                                                final ss4 ss4Var42 = ss4Var4;
                                                                l70 l70Var22 = l70Var2;
                                                                switch (i242) {
                                                                    case 0:
                                                                        n06 n06Var42 = (n06) obj9;
                                                                        px0 px0Var42 = (px0) obj10;
                                                                        int intValue62 = ((Integer) obj11).intValue();
                                                                        n06Var42.getClass();
                                                                        if ((intValue62 & 6) == 0) {
                                                                            if (!((xq2) px0Var42).d(n06Var42.ordinal())) {
                                                                                i252 = 2;
                                                                            }
                                                                            intValue62 |= i252;
                                                                        }
                                                                        if ((intValue62 & 19) != 18) {
                                                                            z372 = true;
                                                                        } else {
                                                                            z372 = false;
                                                                        }
                                                                        xq2 xq2Var1022 = (xq2) px0Var42;
                                                                        if (xq2Var1022.S(intValue62 & 1, z372)) {
                                                                            int i26 = ps5.a[n06Var42.ordinal()];
                                                                            ss5 ss5Var102 = ss5Var10;
                                                                            Map map112 = map11;
                                                                            Map map122 = map12;
                                                                            Set set42 = set4;
                                                                            boolean z392 = z37;
                                                                            boolean z40 = z38;
                                                                            int i27 = i24;
                                                                            om6 om6Var52 = om6Var5;
                                                                            qn2 qn2Var362 = qn2Var36;
                                                                            qn2 qn2Var372 = qn2Var37;
                                                                            qn2 qn2Var382 = qn2Var38;
                                                                            qn2 qn2Var392 = qn2Var39;
                                                                            qn2 qn2Var402 = qn2Var40;
                                                                            qn2 qn2Var412 = qn2Var41;
                                                                            on2 on2Var102 = on2Var10;
                                                                            qn2 qn2Var422 = qn2Var42;
                                                                            if (i26 != 1) {
                                                                                if (i26 == 2) {
                                                                                    xq2Var1022.b0(454331178);
                                                                                    float a92 = l70Var22.a();
                                                                                    int h4 = ss4Var42.h();
                                                                                    Object P15 = xq2Var1022.P();
                                                                                    if (P15 == vs0Var5) {
                                                                                        P15 = new qn2() { // from class: yr5
                                                                                            @Override // defpackage.qn2
                                                                                            public final Object g(Object obj12) {
                                                                                                int i282 = r2;
                                                                                                jg7 jg7Var3 = jg7.a;
                                                                                                ss4 ss4Var5 = ss4Var42;
                                                                                                int intValue72 = ((Integer) obj12).intValue();
                                                                                                switch (i282) {
                                                                                                    case 0:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 1:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 2:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    default:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                }
                                                                                            }
                                                                                        };
                                                                                        xq2Var1022.l0(P15);
                                                                                    }
                                                                                    nw7.w(ss5Var102, pr3Var7, map112, map122, z39, set42, z392, z40, i27, a92, om6Var52, h4, (qn2) P15, qn2Var362, qn2Var372, qn2Var382, qn2Var392, qn2Var43, qn2Var402, qn2Var412, on2Var102, qn2Var422, xq2Var1022, 905969664);
                                                                                    xq2Var1022.p(false);
                                                                                } else {
                                                                                    throw xg6.f(xq2Var1022, 454263024, false);
                                                                                }
                                                                            } else {
                                                                                xq2Var1022.b0(454263339);
                                                                                float a102 = l70Var22.a();
                                                                                int h5 = ss4Var42.h();
                                                                                Object P16 = xq2Var1022.P();
                                                                                if (P16 == vs0Var5) {
                                                                                    P16 = new qn2() { // from class: yr5
                                                                                        @Override // defpackage.qn2
                                                                                        public final Object g(Object obj12) {
                                                                                            int i282 = r2;
                                                                                            jg7 jg7Var3 = jg7.a;
                                                                                            ss4 ss4Var5 = ss4Var42;
                                                                                            int intValue72 = ((Integer) obj12).intValue();
                                                                                            switch (i282) {
                                                                                                case 0:
                                                                                                    ss4Var5.i(intValue72);
                                                                                                    return jg7Var3;
                                                                                                case 1:
                                                                                                    ss4Var5.i(intValue72);
                                                                                                    return jg7Var3;
                                                                                                case 2:
                                                                                                    ss4Var5.i(intValue72);
                                                                                                    return jg7Var3;
                                                                                                default:
                                                                                                    ss4Var5.i(intValue72);
                                                                                                    return jg7Var3;
                                                                                            }
                                                                                        }
                                                                                    };
                                                                                    xq2Var1022.l0(P16);
                                                                                }
                                                                                nw7.s(ss5Var102, ip3Var10, map112, map122, set42, z392, z40, i27, a102, om6Var52, h5, i25, (qn2) P16, qn2Var362, qn2Var372, qn2Var382, qn2Var392, qn2Var402, qn2Var412, on2Var102, qn2Var422, xq2Var1022, 113246208);
                                                                                xq2Var1022.p(false);
                                                                            }
                                                                        } else {
                                                                            xq2Var1022.V();
                                                                        }
                                                                        return jg7Var2;
                                                                    default:
                                                                        n06 n06Var5 = (n06) obj9;
                                                                        px0 px0Var5 = (px0) obj10;
                                                                        int intValue7 = ((Integer) obj11).intValue();
                                                                        n06Var5.getClass();
                                                                        if ((intValue7 & 6) == 0) {
                                                                            if (!((xq2) px0Var5).d(n06Var5.ordinal())) {
                                                                                i252 = 2;
                                                                            }
                                                                            intValue7 |= i252;
                                                                        }
                                                                        if ((intValue7 & 19) != 18) {
                                                                            z382 = true;
                                                                        } else {
                                                                            z382 = false;
                                                                        }
                                                                        xq2 xq2Var11 = (xq2) px0Var5;
                                                                        if (xq2Var11.S(intValue7 & 1, z382)) {
                                                                            int i28 = ps5.a[n06Var5.ordinal()];
                                                                            ss5 ss5Var11 = ss5Var10;
                                                                            Map map13 = map11;
                                                                            Map map14 = map12;
                                                                            Set set5 = set4;
                                                                            boolean z41 = z37;
                                                                            boolean z42 = z38;
                                                                            int i29 = i24;
                                                                            om6 om6Var6 = om6Var5;
                                                                            qn2 qn2Var432 = qn2Var36;
                                                                            qn2 qn2Var44 = qn2Var37;
                                                                            qn2 qn2Var45 = qn2Var38;
                                                                            qn2 qn2Var46 = qn2Var39;
                                                                            qn2 qn2Var47 = qn2Var40;
                                                                            qn2 qn2Var48 = qn2Var41;
                                                                            on2 on2Var11 = on2Var10;
                                                                            qn2 qn2Var49 = qn2Var42;
                                                                            if (i28 != 1) {
                                                                                if (i28 == 2) {
                                                                                    xq2Var11.b0(-1111928998);
                                                                                    float a11 = l70Var22.a();
                                                                                    int h6 = ss4Var42.h();
                                                                                    Object P17 = xq2Var11.P();
                                                                                    if (P17 == vs0Var5) {
                                                                                        P17 = new qn2() { // from class: yr5
                                                                                            @Override // defpackage.qn2
                                                                                            public final Object g(Object obj12) {
                                                                                                int i282 = r2;
                                                                                                jg7 jg7Var3 = jg7.a;
                                                                                                ss4 ss4Var5 = ss4Var42;
                                                                                                int intValue72 = ((Integer) obj12).intValue();
                                                                                                switch (i282) {
                                                                                                    case 0:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 1:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 2:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    default:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                }
                                                                                            }
                                                                                        };
                                                                                        xq2Var11.l0(P17);
                                                                                    }
                                                                                    nw7.w(ss5Var11, pr3Var7, map13, map14, z39, set5, z41, z42, i29, a11, om6Var6, h6, (qn2) P17, qn2Var432, qn2Var44, qn2Var45, qn2Var46, qn2Var43, qn2Var47, qn2Var48, on2Var11, qn2Var49, xq2Var11, 905969664);
                                                                                    xq2Var11.p(false);
                                                                                    return jg7Var2;
                                                                                }
                                                                                throw xg6.f(xq2Var11, -1111990712, false);
                                                                            }
                                                                            xq2Var11.b0(-1111990429);
                                                                            float a12 = l70Var22.a();
                                                                            int h7 = ss4Var42.h();
                                                                            Object P18 = xq2Var11.P();
                                                                            if (P18 == vs0Var5) {
                                                                                P18 = new qn2() { // from class: yr5
                                                                                    @Override // defpackage.qn2
                                                                                    public final Object g(Object obj12) {
                                                                                        int i282 = r2;
                                                                                        jg7 jg7Var3 = jg7.a;
                                                                                        ss4 ss4Var5 = ss4Var42;
                                                                                        int intValue72 = ((Integer) obj12).intValue();
                                                                                        switch (i282) {
                                                                                            case 0:
                                                                                                ss4Var5.i(intValue72);
                                                                                                return jg7Var3;
                                                                                            case 1:
                                                                                                ss4Var5.i(intValue72);
                                                                                                return jg7Var3;
                                                                                            case 2:
                                                                                                ss4Var5.i(intValue72);
                                                                                                return jg7Var3;
                                                                                            default:
                                                                                                ss4Var5.i(intValue72);
                                                                                                return jg7Var3;
                                                                                        }
                                                                                    }
                                                                                };
                                                                                xq2Var11.l0(P18);
                                                                            }
                                                                            nw7.s(ss5Var11, ip3Var10, map13, map14, set5, z41, z42, i29, a12, om6Var6, h7, i25, (qn2) P18, qn2Var432, qn2Var44, qn2Var45, qn2Var46, qn2Var47, qn2Var48, on2Var11, qn2Var49, xq2Var11, 113246208);
                                                                            xq2Var11.p(false);
                                                                            return jg7Var2;
                                                                        }
                                                                        xq2Var11.V();
                                                                        return jg7Var2;
                                                                }
                                                            }
                                                        }, xq2Var102), xq2Var102, 27648, 6);
                                                    } else {
                                                        xq2Var102.V();
                                                    }
                                                    return jg7Var;
                                            }
                                        }
                                    }, xq2Var7), xq2Var7, 3078);
                                    xq2Var7.p(false);
                                }
                                if (m06Var3 == m06Var2) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                xq2 xq2Var9 = xq2Var7;
                                es7 es7Var7 = es7Var4;
                                k65.b(z22, n65Var4, vs0Var4.n(x64Var2, e40Var2), es7Var7.c, es7Var7.j, xq2Var9, 64);
                                xq2Var3 = xq2Var9;
                                xq2Var3.p(true);
                                xq2Var3.p(true);
                                xq2Var3.p(true);
                                xq2Var3.p(false);
                                vs0Var3 = vs0Var4;
                                ss5Var4 = ss5Var7;
                                ip3Var5 = ip3Var7;
                                i12 = i17;
                                z19 = true;
                            } else {
                                x64Var2 = x64Var;
                                es7 es7Var8 = es7Var3;
                                c40 c40Var4 = c40Var;
                                om6Var2 = om6Var3;
                                m06 m06Var8 = m06Var3;
                                final Map map9 = map6;
                                xq2Var7.b0(1716398273);
                                a74 Q2 = ge7.Q(dj6.c(x64Var2, 1.0f), 16.0f, RecyclerView.B1, 2);
                                yt0 a9 = wt0.a(euVar, c40Var4, xq2Var7, 0);
                                int hashCode8 = Long.hashCode(xq2Var7.T);
                                xv4 l10 = xq2Var7.l();
                                a74 E8 = l.E(xq2Var7, Q2);
                                xq2Var7.f0();
                                if (xq2Var7.S) {
                                    xq2Var7.k(iy0Var);
                                } else {
                                    xq2Var7.o0();
                                }
                                yh2.K(xq2Var7, pnVar, a9);
                                yh2.K(xq2Var7, pnVar2, l10);
                                i61.w(hashCode8, xq2Var7, pnVar3, xq2Var7, neVar);
                                yh2.K(xq2Var7, pnVar4, E8);
                                ak7.v(qw5Var4, qn2Var22, null, xq2Var7, 0);
                                boolean z33 = z11;
                                if (z33) {
                                    xq2Var7.b0(1988804737);
                                    qn2Var11 = qn2Var22;
                                    z15 = z33;
                                    m06Var4 = m06Var8;
                                    m06Var5 = m06Var2;
                                    e40Var = e40Var3;
                                    ak7.p(ss5Var8.j, map9, map7, qn2Var18, qn2Var19, null, RecyclerView.B1, qn2Var20, qn2Var21, xq2Var7, 1572864);
                                    map3 = map7;
                                    qn2Var13 = qn2Var20;
                                    qn2Var12 = qn2Var21;
                                    xq2Var7 = xq2Var7;
                                    qw5Var2 = qw5Var4;
                                    i10 = R.string.rom_all_games;
                                    map9 = map9;
                                    xq2Var7.p(false);
                                } else {
                                    qw5Var2 = qw5Var4;
                                    qn2Var11 = qn2Var22;
                                    z15 = z33;
                                    e40Var = e40Var3;
                                    m06Var4 = m06Var8;
                                    qn2Var12 = qn2Var21;
                                    qn2Var13 = qn2Var20;
                                    m06Var5 = m06Var2;
                                    i10 = R.string.rom_all_games;
                                    map3 = map7;
                                    xq2Var7.b0(1989381337);
                                    xq2Var7.p(false);
                                }
                                if (z30) {
                                    xq2Var7.b0(1989454652);
                                    int size3 = gt0.D0(list4, i17).size();
                                    if (z25) {
                                        xq2Var7.b0(1989627601);
                                        l = (String) gt0.R0(list3);
                                        if (l == null) {
                                            list4 = list4;
                                            z20 = false;
                                            l = i61.l(xq2Var7, 1726750575, i10, xq2Var7, false);
                                        } else {
                                            list4 = list4;
                                            z20 = false;
                                            xq2Var7.b0(1726749521);
                                            xq2Var7.p(false);
                                        }
                                        xq2Var7.p(z20);
                                    } else {
                                        list4 = list4;
                                        z20 = false;
                                        l = i61.l(xq2Var7, 1726751983, i10, xq2Var7, false);
                                    }
                                    xq2 xq2Var10 = xq2Var7;
                                    i11 = i17;
                                    ss5Var3 = ss5Var8;
                                    z16 = z20;
                                    ak7.x(l, ss5Var8.c, ss5Var8.h, ss5Var8.i, size3, on2Var8, qn2Var23, ge7.Q(x64Var2, RecyclerView.B1, RecyclerView.B1, 2), xq2Var10, 12582912);
                                    xq2Var7 = xq2Var10;
                                    xq2Var7.p(z16);
                                } else {
                                    ss5Var3 = ss5Var8;
                                    i11 = i17;
                                    z16 = false;
                                    xq2Var7.b0(1990251321);
                                    xq2Var7.p(false);
                                }
                                xq2Var7.p(true);
                                a74 G2 = xk2.G(zt0.a(dj6.c(x64Var2, 1.0f)), n65Var4);
                                e34 d4 = h70.d(e40Var, z16);
                                int hashCode9 = Long.hashCode(xq2Var7.T);
                                xv4 l11 = xq2Var7.l();
                                a74 E9 = l.E(xq2Var7, G2);
                                xq2Var7.f0();
                                if (xq2Var7.S) {
                                    xq2Var7.k(iy0Var);
                                } else {
                                    xq2Var7.o0();
                                }
                                yh2.K(xq2Var7, pnVar, d4);
                                yh2.K(xq2Var7, pnVar2, l11);
                                i61.w(hashCode9, xq2Var7, pnVar3, xq2Var7, neVar);
                                yh2.K(xq2Var7, pnVar4, E9);
                                if (list4.isEmpty() && !z15) {
                                    xq2Var7.b0(-629494426);
                                    yt0 a10 = wt0.a(euVar, c40Var4, xq2Var7, 0);
                                    int hashCode10 = Long.hashCode(xq2Var7.T);
                                    xv4 l12 = xq2Var7.l();
                                    a74 E10 = l.E(xq2Var7, lc2Var22);
                                    xq2Var7.f0();
                                    if (xq2Var7.S) {
                                        xq2Var7.k(iy0Var);
                                    } else {
                                        xq2Var7.o0();
                                    }
                                    yh2.K(xq2Var7, pnVar, a10);
                                    yh2.K(xq2Var7, pnVar2, l12);
                                    i61.w(hashCode10, xq2Var7, pnVar3, xq2Var7, neVar);
                                    yh2.K(xq2Var7, pnVar4, E10);
                                    nw7.r(qw5Var2, xq2Var7, 0);
                                    xq2Var7.p(true);
                                    xq2Var7.p(false);
                                    z17 = false;
                                    ip3Var5 = ip3Var8;
                                    i12 = i11;
                                    ss5Var4 = ss5Var3;
                                } else {
                                    xq2Var7.b0(-629169112);
                                    ip3Var5 = ip3Var8;
                                    final Map map10 = map3;
                                    final qn2 qn2Var28 = qn2Var13;
                                    ss5Var4 = ss5Var3;
                                    fo2 fo2Var = new fo2() { // from class: tr5
                                        @Override // defpackage.fo2
                                        public final Object e(Object obj6, Object obj7, Object obj8) {
                                            int i20 = r24;
                                            jg7 jg7Var = jg7.a;
                                            boolean z332 = false;
                                            int i21 = 2;
                                            switch (i20) {
                                                case 0:
                                                    final l70 l70Var = (l70) obj6;
                                                    px0 px0Var3 = (px0) obj7;
                                                    int intValue5 = ((Integer) obj8).intValue();
                                                    l70Var.getClass();
                                                    if ((intValue5 & 6) == 0) {
                                                        if (((xq2) px0Var3).f(l70Var)) {
                                                            i21 = 4;
                                                        }
                                                        intValue5 |= i21;
                                                    }
                                                    if ((intValue5 & 19) != 18) {
                                                        z332 = true;
                                                    }
                                                    xq2 xq2Var92 = (xq2) px0Var3;
                                                    if (xq2Var92.S(intValue5 & 1, z332)) {
                                                        final ss5 ss5Var9 = ss5Var4;
                                                        n06 n06Var3 = ss5Var9.f;
                                                        final ip3 ip3Var9 = ip3Var5;
                                                        final Map map92 = map9;
                                                        final Map map102 = map10;
                                                        final Set set3 = set2;
                                                        final boolean z34 = z31;
                                                        final boolean z35 = z29;
                                                        final int i22 = i11;
                                                        final om6 om6Var4 = om6Var2;
                                                        final int i23 = i18;
                                                        final qn2 qn2Var282 = qn2Var28;
                                                        final qn2 qn2Var29 = qn2Var24;
                                                        final qn2 qn2Var30 = qn2Var18;
                                                        final qn2 qn2Var31 = qn2Var19;
                                                        final qn2 qn2Var32 = qn2Var11;
                                                        final qn2 qn2Var33 = qn2Var23;
                                                        final on2 on2Var9 = on2Var8;
                                                        final qn2 qn2Var34 = qn2Var12;
                                                        final pr3 pr3Var6 = pr3Var5;
                                                        final boolean z36 = z32;
                                                        final qn2 qn2Var35 = qn2Var25;
                                                        final ss4 ss4Var3 = ss4Var2;
                                                        n16.d(n06Var3, null, null, "view_mode", n16.I(-263214166, new fo2() { // from class: xr5
                                                            @Override // defpackage.fo2
                                                            public final Object e(Object obj9, Object obj10, Object obj11) {
                                                                boolean z372;
                                                                boolean z382;
                                                                int i242 = r25;
                                                                jg7 jg7Var2 = jg7.a;
                                                                int i252 = 4;
                                                                vs0 vs0Var5 = ox0.a;
                                                                final ss4 ss4Var42 = ss4Var3;
                                                                l70 l70Var22 = l70Var;
                                                                switch (i242) {
                                                                    case 0:
                                                                        n06 n06Var42 = (n06) obj9;
                                                                        px0 px0Var42 = (px0) obj10;
                                                                        int intValue62 = ((Integer) obj11).intValue();
                                                                        n06Var42.getClass();
                                                                        if ((intValue62 & 6) == 0) {
                                                                            if (!((xq2) px0Var42).d(n06Var42.ordinal())) {
                                                                                i252 = 2;
                                                                            }
                                                                            intValue62 |= i252;
                                                                        }
                                                                        if ((intValue62 & 19) != 18) {
                                                                            z372 = true;
                                                                        } else {
                                                                            z372 = false;
                                                                        }
                                                                        xq2 xq2Var1022 = (xq2) px0Var42;
                                                                        if (xq2Var1022.S(intValue62 & 1, z372)) {
                                                                            int i26 = ps5.a[n06Var42.ordinal()];
                                                                            ss5 ss5Var102 = ss5Var9;
                                                                            Map map112 = map92;
                                                                            Map map122 = map102;
                                                                            Set set42 = set3;
                                                                            boolean z392 = z34;
                                                                            boolean z40 = z35;
                                                                            int i27 = i22;
                                                                            om6 om6Var52 = om6Var4;
                                                                            qn2 qn2Var362 = qn2Var282;
                                                                            qn2 qn2Var372 = qn2Var29;
                                                                            qn2 qn2Var382 = qn2Var30;
                                                                            qn2 qn2Var392 = qn2Var31;
                                                                            qn2 qn2Var402 = qn2Var32;
                                                                            qn2 qn2Var412 = qn2Var33;
                                                                            on2 on2Var102 = on2Var9;
                                                                            qn2 qn2Var422 = qn2Var34;
                                                                            if (i26 != 1) {
                                                                                if (i26 == 2) {
                                                                                    xq2Var1022.b0(454331178);
                                                                                    float a92 = l70Var22.a();
                                                                                    int h4 = ss4Var42.h();
                                                                                    Object P15 = xq2Var1022.P();
                                                                                    if (P15 == vs0Var5) {
                                                                                        P15 = new qn2() { // from class: yr5
                                                                                            @Override // defpackage.qn2
                                                                                            public final Object g(Object obj12) {
                                                                                                int i282 = r2;
                                                                                                jg7 jg7Var3 = jg7.a;
                                                                                                ss4 ss4Var5 = ss4Var42;
                                                                                                int intValue72 = ((Integer) obj12).intValue();
                                                                                                switch (i282) {
                                                                                                    case 0:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 1:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 2:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    default:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                }
                                                                                            }
                                                                                        };
                                                                                        xq2Var1022.l0(P15);
                                                                                    }
                                                                                    nw7.w(ss5Var102, pr3Var6, map112, map122, z36, set42, z392, z40, i27, a92, om6Var52, h4, (qn2) P15, qn2Var362, qn2Var372, qn2Var382, qn2Var392, qn2Var35, qn2Var402, qn2Var412, on2Var102, qn2Var422, xq2Var1022, 905969664);
                                                                                    xq2Var1022.p(false);
                                                                                } else {
                                                                                    throw xg6.f(xq2Var1022, 454263024, false);
                                                                                }
                                                                            } else {
                                                                                xq2Var1022.b0(454263339);
                                                                                float a102 = l70Var22.a();
                                                                                int h5 = ss4Var42.h();
                                                                                Object P16 = xq2Var1022.P();
                                                                                if (P16 == vs0Var5) {
                                                                                    P16 = new qn2() { // from class: yr5
                                                                                        @Override // defpackage.qn2
                                                                                        public final Object g(Object obj12) {
                                                                                            int i282 = r2;
                                                                                            jg7 jg7Var3 = jg7.a;
                                                                                            ss4 ss4Var5 = ss4Var42;
                                                                                            int intValue72 = ((Integer) obj12).intValue();
                                                                                            switch (i282) {
                                                                                                case 0:
                                                                                                    ss4Var5.i(intValue72);
                                                                                                    return jg7Var3;
                                                                                                case 1:
                                                                                                    ss4Var5.i(intValue72);
                                                                                                    return jg7Var3;
                                                                                                case 2:
                                                                                                    ss4Var5.i(intValue72);
                                                                                                    return jg7Var3;
                                                                                                default:
                                                                                                    ss4Var5.i(intValue72);
                                                                                                    return jg7Var3;
                                                                                            }
                                                                                        }
                                                                                    };
                                                                                    xq2Var1022.l0(P16);
                                                                                }
                                                                                nw7.s(ss5Var102, ip3Var9, map112, map122, set42, z392, z40, i27, a102, om6Var52, h5, i23, (qn2) P16, qn2Var362, qn2Var372, qn2Var382, qn2Var392, qn2Var402, qn2Var412, on2Var102, qn2Var422, xq2Var1022, 113246208);
                                                                                xq2Var1022.p(false);
                                                                            }
                                                                        } else {
                                                                            xq2Var1022.V();
                                                                        }
                                                                        return jg7Var2;
                                                                    default:
                                                                        n06 n06Var5 = (n06) obj9;
                                                                        px0 px0Var5 = (px0) obj10;
                                                                        int intValue7 = ((Integer) obj11).intValue();
                                                                        n06Var5.getClass();
                                                                        if ((intValue7 & 6) == 0) {
                                                                            if (!((xq2) px0Var5).d(n06Var5.ordinal())) {
                                                                                i252 = 2;
                                                                            }
                                                                            intValue7 |= i252;
                                                                        }
                                                                        if ((intValue7 & 19) != 18) {
                                                                            z382 = true;
                                                                        } else {
                                                                            z382 = false;
                                                                        }
                                                                        xq2 xq2Var11 = (xq2) px0Var5;
                                                                        if (xq2Var11.S(intValue7 & 1, z382)) {
                                                                            int i28 = ps5.a[n06Var5.ordinal()];
                                                                            ss5 ss5Var11 = ss5Var9;
                                                                            Map map13 = map92;
                                                                            Map map14 = map102;
                                                                            Set set5 = set3;
                                                                            boolean z41 = z34;
                                                                            boolean z42 = z35;
                                                                            int i29 = i22;
                                                                            om6 om6Var6 = om6Var4;
                                                                            qn2 qn2Var432 = qn2Var282;
                                                                            qn2 qn2Var44 = qn2Var29;
                                                                            qn2 qn2Var45 = qn2Var30;
                                                                            qn2 qn2Var46 = qn2Var31;
                                                                            qn2 qn2Var47 = qn2Var32;
                                                                            qn2 qn2Var48 = qn2Var33;
                                                                            on2 on2Var11 = on2Var9;
                                                                            qn2 qn2Var49 = qn2Var34;
                                                                            if (i28 != 1) {
                                                                                if (i28 == 2) {
                                                                                    xq2Var11.b0(-1111928998);
                                                                                    float a11 = l70Var22.a();
                                                                                    int h6 = ss4Var42.h();
                                                                                    Object P17 = xq2Var11.P();
                                                                                    if (P17 == vs0Var5) {
                                                                                        P17 = new qn2() { // from class: yr5
                                                                                            @Override // defpackage.qn2
                                                                                            public final Object g(Object obj12) {
                                                                                                int i282 = r2;
                                                                                                jg7 jg7Var3 = jg7.a;
                                                                                                ss4 ss4Var5 = ss4Var42;
                                                                                                int intValue72 = ((Integer) obj12).intValue();
                                                                                                switch (i282) {
                                                                                                    case 0:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 1:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 2:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    default:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                }
                                                                                            }
                                                                                        };
                                                                                        xq2Var11.l0(P17);
                                                                                    }
                                                                                    nw7.w(ss5Var11, pr3Var6, map13, map14, z36, set5, z41, z42, i29, a11, om6Var6, h6, (qn2) P17, qn2Var432, qn2Var44, qn2Var45, qn2Var46, qn2Var35, qn2Var47, qn2Var48, on2Var11, qn2Var49, xq2Var11, 905969664);
                                                                                    xq2Var11.p(false);
                                                                                    return jg7Var2;
                                                                                }
                                                                                throw xg6.f(xq2Var11, -1111990712, false);
                                                                            }
                                                                            xq2Var11.b0(-1111990429);
                                                                            float a12 = l70Var22.a();
                                                                            int h7 = ss4Var42.h();
                                                                            Object P18 = xq2Var11.P();
                                                                            if (P18 == vs0Var5) {
                                                                                P18 = new qn2() { // from class: yr5
                                                                                    @Override // defpackage.qn2
                                                                                    public final Object g(Object obj12) {
                                                                                        int i282 = r2;
                                                                                        jg7 jg7Var3 = jg7.a;
                                                                                        ss4 ss4Var5 = ss4Var42;
                                                                                        int intValue72 = ((Integer) obj12).intValue();
                                                                                        switch (i282) {
                                                                                            case 0:
                                                                                                ss4Var5.i(intValue72);
                                                                                                return jg7Var3;
                                                                                            case 1:
                                                                                                ss4Var5.i(intValue72);
                                                                                                return jg7Var3;
                                                                                            case 2:
                                                                                                ss4Var5.i(intValue72);
                                                                                                return jg7Var3;
                                                                                            default:
                                                                                                ss4Var5.i(intValue72);
                                                                                                return jg7Var3;
                                                                                        }
                                                                                    }
                                                                                };
                                                                                xq2Var11.l0(P18);
                                                                            }
                                                                            nw7.s(ss5Var11, ip3Var9, map13, map14, set5, z41, z42, i29, a12, om6Var6, h7, i23, (qn2) P18, qn2Var432, qn2Var44, qn2Var45, qn2Var46, qn2Var47, qn2Var48, on2Var11, qn2Var49, xq2Var11, 113246208);
                                                                            xq2Var11.p(false);
                                                                            return jg7Var2;
                                                                        }
                                                                        xq2Var11.V();
                                                                        return jg7Var2;
                                                                }
                                                            }
                                                        }, xq2Var92), xq2Var92, 27648, 6);
                                                    } else {
                                                        xq2Var92.V();
                                                    }
                                                    return jg7Var;
                                                default:
                                                    final l70 l70Var2 = (l70) obj6;
                                                    px0 px0Var4 = (px0) obj7;
                                                    int intValue6 = ((Integer) obj8).intValue();
                                                    l70Var2.getClass();
                                                    if ((intValue6 & 6) == 0) {
                                                        if (((xq2) px0Var4).f(l70Var2)) {
                                                            i21 = 4;
                                                        }
                                                        intValue6 |= i21;
                                                    }
                                                    if ((intValue6 & 19) != 18) {
                                                        z332 = true;
                                                    }
                                                    xq2 xq2Var102 = (xq2) px0Var4;
                                                    if (xq2Var102.S(intValue6 & 1, z332)) {
                                                        final ss5 ss5Var10 = ss5Var4;
                                                        n06 n06Var4 = ss5Var10.f;
                                                        final ip3 ip3Var10 = ip3Var5;
                                                        final Map map11 = map9;
                                                        final Map map12 = map10;
                                                        final Set set4 = set2;
                                                        final boolean z37 = z31;
                                                        final boolean z38 = z29;
                                                        final int i24 = i11;
                                                        final om6 om6Var5 = om6Var2;
                                                        final int i25 = i18;
                                                        final qn2 qn2Var36 = qn2Var28;
                                                        final qn2 qn2Var37 = qn2Var24;
                                                        final qn2 qn2Var38 = qn2Var18;
                                                        final qn2 qn2Var39 = qn2Var19;
                                                        final qn2 qn2Var40 = qn2Var11;
                                                        final qn2 qn2Var41 = qn2Var23;
                                                        final on2 on2Var10 = on2Var8;
                                                        final qn2 qn2Var42 = qn2Var12;
                                                        final pr3 pr3Var7 = pr3Var5;
                                                        final boolean z39 = z32;
                                                        final qn2 qn2Var43 = qn2Var25;
                                                        final ss4 ss4Var4 = ss4Var2;
                                                        n16.d(n06Var4, null, null, "view_mode", n16.I(1411131810, new fo2() { // from class: xr5
                                                            @Override // defpackage.fo2
                                                            public final Object e(Object obj9, Object obj10, Object obj11) {
                                                                boolean z372;
                                                                boolean z382;
                                                                int i242 = r25;
                                                                jg7 jg7Var2 = jg7.a;
                                                                int i252 = 4;
                                                                vs0 vs0Var5 = ox0.a;
                                                                final ss4 ss4Var42 = ss4Var4;
                                                                l70 l70Var22 = l70Var2;
                                                                switch (i242) {
                                                                    case 0:
                                                                        n06 n06Var42 = (n06) obj9;
                                                                        px0 px0Var42 = (px0) obj10;
                                                                        int intValue62 = ((Integer) obj11).intValue();
                                                                        n06Var42.getClass();
                                                                        if ((intValue62 & 6) == 0) {
                                                                            if (!((xq2) px0Var42).d(n06Var42.ordinal())) {
                                                                                i252 = 2;
                                                                            }
                                                                            intValue62 |= i252;
                                                                        }
                                                                        if ((intValue62 & 19) != 18) {
                                                                            z372 = true;
                                                                        } else {
                                                                            z372 = false;
                                                                        }
                                                                        xq2 xq2Var1022 = (xq2) px0Var42;
                                                                        if (xq2Var1022.S(intValue62 & 1, z372)) {
                                                                            int i26 = ps5.a[n06Var42.ordinal()];
                                                                            ss5 ss5Var102 = ss5Var10;
                                                                            Map map112 = map11;
                                                                            Map map122 = map12;
                                                                            Set set42 = set4;
                                                                            boolean z392 = z37;
                                                                            boolean z40 = z38;
                                                                            int i27 = i24;
                                                                            om6 om6Var52 = om6Var5;
                                                                            qn2 qn2Var362 = qn2Var36;
                                                                            qn2 qn2Var372 = qn2Var37;
                                                                            qn2 qn2Var382 = qn2Var38;
                                                                            qn2 qn2Var392 = qn2Var39;
                                                                            qn2 qn2Var402 = qn2Var40;
                                                                            qn2 qn2Var412 = qn2Var41;
                                                                            on2 on2Var102 = on2Var10;
                                                                            qn2 qn2Var422 = qn2Var42;
                                                                            if (i26 != 1) {
                                                                                if (i26 == 2) {
                                                                                    xq2Var1022.b0(454331178);
                                                                                    float a92 = l70Var22.a();
                                                                                    int h4 = ss4Var42.h();
                                                                                    Object P15 = xq2Var1022.P();
                                                                                    if (P15 == vs0Var5) {
                                                                                        P15 = new qn2() { // from class: yr5
                                                                                            @Override // defpackage.qn2
                                                                                            public final Object g(Object obj12) {
                                                                                                int i282 = r2;
                                                                                                jg7 jg7Var3 = jg7.a;
                                                                                                ss4 ss4Var5 = ss4Var42;
                                                                                                int intValue72 = ((Integer) obj12).intValue();
                                                                                                switch (i282) {
                                                                                                    case 0:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 1:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 2:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    default:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                }
                                                                                            }
                                                                                        };
                                                                                        xq2Var1022.l0(P15);
                                                                                    }
                                                                                    nw7.w(ss5Var102, pr3Var7, map112, map122, z39, set42, z392, z40, i27, a92, om6Var52, h4, (qn2) P15, qn2Var362, qn2Var372, qn2Var382, qn2Var392, qn2Var43, qn2Var402, qn2Var412, on2Var102, qn2Var422, xq2Var1022, 905969664);
                                                                                    xq2Var1022.p(false);
                                                                                } else {
                                                                                    throw xg6.f(xq2Var1022, 454263024, false);
                                                                                }
                                                                            } else {
                                                                                xq2Var1022.b0(454263339);
                                                                                float a102 = l70Var22.a();
                                                                                int h5 = ss4Var42.h();
                                                                                Object P16 = xq2Var1022.P();
                                                                                if (P16 == vs0Var5) {
                                                                                    P16 = new qn2() { // from class: yr5
                                                                                        @Override // defpackage.qn2
                                                                                        public final Object g(Object obj12) {
                                                                                            int i282 = r2;
                                                                                            jg7 jg7Var3 = jg7.a;
                                                                                            ss4 ss4Var5 = ss4Var42;
                                                                                            int intValue72 = ((Integer) obj12).intValue();
                                                                                            switch (i282) {
                                                                                                case 0:
                                                                                                    ss4Var5.i(intValue72);
                                                                                                    return jg7Var3;
                                                                                                case 1:
                                                                                                    ss4Var5.i(intValue72);
                                                                                                    return jg7Var3;
                                                                                                case 2:
                                                                                                    ss4Var5.i(intValue72);
                                                                                                    return jg7Var3;
                                                                                                default:
                                                                                                    ss4Var5.i(intValue72);
                                                                                                    return jg7Var3;
                                                                                            }
                                                                                        }
                                                                                    };
                                                                                    xq2Var1022.l0(P16);
                                                                                }
                                                                                nw7.s(ss5Var102, ip3Var10, map112, map122, set42, z392, z40, i27, a102, om6Var52, h5, i25, (qn2) P16, qn2Var362, qn2Var372, qn2Var382, qn2Var392, qn2Var402, qn2Var412, on2Var102, qn2Var422, xq2Var1022, 113246208);
                                                                                xq2Var1022.p(false);
                                                                            }
                                                                        } else {
                                                                            xq2Var1022.V();
                                                                        }
                                                                        return jg7Var2;
                                                                    default:
                                                                        n06 n06Var5 = (n06) obj9;
                                                                        px0 px0Var5 = (px0) obj10;
                                                                        int intValue7 = ((Integer) obj11).intValue();
                                                                        n06Var5.getClass();
                                                                        if ((intValue7 & 6) == 0) {
                                                                            if (!((xq2) px0Var5).d(n06Var5.ordinal())) {
                                                                                i252 = 2;
                                                                            }
                                                                            intValue7 |= i252;
                                                                        }
                                                                        if ((intValue7 & 19) != 18) {
                                                                            z382 = true;
                                                                        } else {
                                                                            z382 = false;
                                                                        }
                                                                        xq2 xq2Var11 = (xq2) px0Var5;
                                                                        if (xq2Var11.S(intValue7 & 1, z382)) {
                                                                            int i28 = ps5.a[n06Var5.ordinal()];
                                                                            ss5 ss5Var11 = ss5Var10;
                                                                            Map map13 = map11;
                                                                            Map map14 = map12;
                                                                            Set set5 = set4;
                                                                            boolean z41 = z37;
                                                                            boolean z42 = z38;
                                                                            int i29 = i24;
                                                                            om6 om6Var6 = om6Var5;
                                                                            qn2 qn2Var432 = qn2Var36;
                                                                            qn2 qn2Var44 = qn2Var37;
                                                                            qn2 qn2Var45 = qn2Var38;
                                                                            qn2 qn2Var46 = qn2Var39;
                                                                            qn2 qn2Var47 = qn2Var40;
                                                                            qn2 qn2Var48 = qn2Var41;
                                                                            on2 on2Var11 = on2Var10;
                                                                            qn2 qn2Var49 = qn2Var42;
                                                                            if (i28 != 1) {
                                                                                if (i28 == 2) {
                                                                                    xq2Var11.b0(-1111928998);
                                                                                    float a11 = l70Var22.a();
                                                                                    int h6 = ss4Var42.h();
                                                                                    Object P17 = xq2Var11.P();
                                                                                    if (P17 == vs0Var5) {
                                                                                        P17 = new qn2() { // from class: yr5
                                                                                            @Override // defpackage.qn2
                                                                                            public final Object g(Object obj12) {
                                                                                                int i282 = r2;
                                                                                                jg7 jg7Var3 = jg7.a;
                                                                                                ss4 ss4Var5 = ss4Var42;
                                                                                                int intValue72 = ((Integer) obj12).intValue();
                                                                                                switch (i282) {
                                                                                                    case 0:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 1:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    case 2:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                    default:
                                                                                                        ss4Var5.i(intValue72);
                                                                                                        return jg7Var3;
                                                                                                }
                                                                                            }
                                                                                        };
                                                                                        xq2Var11.l0(P17);
                                                                                    }
                                                                                    nw7.w(ss5Var11, pr3Var7, map13, map14, z39, set5, z41, z42, i29, a11, om6Var6, h6, (qn2) P17, qn2Var432, qn2Var44, qn2Var45, qn2Var46, qn2Var43, qn2Var47, qn2Var48, on2Var11, qn2Var49, xq2Var11, 905969664);
                                                                                    xq2Var11.p(false);
                                                                                    return jg7Var2;
                                                                                }
                                                                                throw xg6.f(xq2Var11, -1111990712, false);
                                                                            }
                                                                            xq2Var11.b0(-1111990429);
                                                                            float a12 = l70Var22.a();
                                                                            int h7 = ss4Var42.h();
                                                                            Object P18 = xq2Var11.P();
                                                                            if (P18 == vs0Var5) {
                                                                                P18 = new qn2() { // from class: yr5
                                                                                    @Override // defpackage.qn2
                                                                                    public final Object g(Object obj12) {
                                                                                        int i282 = r2;
                                                                                        jg7 jg7Var3 = jg7.a;
                                                                                        ss4 ss4Var5 = ss4Var42;
                                                                                        int intValue72 = ((Integer) obj12).intValue();
                                                                                        switch (i282) {
                                                                                            case 0:
                                                                                                ss4Var5.i(intValue72);
                                                                                                return jg7Var3;
                                                                                            case 1:
                                                                                                ss4Var5.i(intValue72);
                                                                                                return jg7Var3;
                                                                                            case 2:
                                                                                                ss4Var5.i(intValue72);
                                                                                                return jg7Var3;
                                                                                            default:
                                                                                                ss4Var5.i(intValue72);
                                                                                                return jg7Var3;
                                                                                        }
                                                                                    }
                                                                                };
                                                                                xq2Var11.l0(P18);
                                                                            }
                                                                            nw7.s(ss5Var11, ip3Var10, map13, map14, set5, z41, z42, i29, a12, om6Var6, h7, i25, (qn2) P18, qn2Var432, qn2Var44, qn2Var45, qn2Var46, qn2Var47, qn2Var48, on2Var11, qn2Var49, xq2Var11, 113246208);
                                                                            xq2Var11.p(false);
                                                                            return jg7Var2;
                                                                        }
                                                                        xq2Var11.V();
                                                                        return jg7Var2;
                                                                }
                                                            }
                                                        }, xq2Var102), xq2Var102, 27648, 6);
                                                    } else {
                                                        xq2Var102.V();
                                                    }
                                                    return jg7Var;
                                            }
                                        }
                                    };
                                    i12 = i11;
                                    nw7.j(lc2Var22, null, n16.I(1671964019, fo2Var, xq2Var7), xq2Var7, 3078);
                                    z17 = false;
                                    xq2Var7.p(false);
                                }
                                if (m06Var4 == m06Var5) {
                                    z18 = true;
                                } else {
                                    z18 = z17;
                                }
                                vs0Var3 = vs0Var4;
                                xq2 xq2Var11 = xq2Var7;
                                k65.b(z18, n65Var4, vs0Var3.n(x64Var2, e40Var2), es7Var8.c, es7Var8.j, xq2Var11, 64);
                                xq2Var3 = xq2Var11;
                                z19 = true;
                                xq2Var3.p(true);
                                xq2Var3.p(z17);
                            }
                            xq2Var3.p(z19);
                            if (z29) {
                                xq2Var3.b0(339000470);
                                int i20 = ps5.a[n06Var2.ordinal()];
                                if (i20 != z19) {
                                    if (i20 == 2) {
                                        i13 = 0;
                                        qr5Var = this;
                                    } else {
                                        i.d();
                                        return null;
                                    }
                                } else {
                                    qr5Var = this;
                                    i13 = i92;
                                }
                                boolean d5 = xq2Var3.d(n06Var2.ordinal()) | xq2Var3.d(i13) | xq2Var3.d(i12);
                                Object P15 = xq2Var3.P();
                                vs0 vs0Var5 = ox0.a;
                                if (!d5 && P15 != vs0Var5) {
                                    I = P15;
                                    ss5Var5 = ss5Var4;
                                    ip3Var6 = ip3Var5;
                                    pr3Var4 = pr3Var5;
                                } else {
                                    ss5 ss5Var9 = ss5Var4;
                                    ip3 ip3Var9 = ip3Var5;
                                    ss5Var5 = ss5Var9;
                                    ip3Var6 = ip3Var9;
                                    pr3Var4 = pr3Var5;
                                    I = np2.I(new vr5(ss5Var9, ip3Var9, pr3Var5, i13, i12));
                                    xq2Var3.l0(I);
                                }
                                final pp6 pp6Var22 = I;
                                boolean f7 = xq2Var3.f(ss5Var5.k) | xq2Var3.d(n06Var2.ordinal());
                                Object P16 = xq2Var3.P();
                                if (f7 || P16 == vs0Var5) {
                                    P16 = np2.I(new ci2(23, ss5Var5, pp6Var22));
                                    xq2Var3.l0(P16);
                                }
                                pp6 pp6Var3 = (pp6) P16;
                                boolean d6 = xq2Var3.d(i12) | xq2Var3.d(n06Var2.ordinal());
                                Object P17 = xq2Var3.P();
                                final boolean z34 = z132;
                                if (d6 || P17 == vs0Var5) {
                                    P17 = np2.I(new on2() { // from class: wr5
                                        @Override // defpackage.on2
                                        public final Object c() {
                                            boolean z35;
                                            if (z34 && ((Number) pp6Var22.getValue()).intValue() < i12) {
                                                z35 = true;
                                            } else {
                                                z35 = false;
                                            }
                                            return Boolean.valueOf(z35);
                                        }
                                    });
                                    xq2Var3.l0(P17);
                                }
                                Map map11 = ss5Var5.k;
                                Character ch = (Character) pp6Var3.getValue();
                                boolean booleanValue = ((Boolean) ((pp6) P17).getValue()).booleanValue();
                                w61 w61Var5 = w61Var42;
                                boolean h4 = xq2Var3.h(w61Var5) | xq2Var3.h(ss5Var5) | xq2Var3.f(ip3Var6) | xq2Var3.f(pr3Var4);
                                Object P18 = xq2Var3.P();
                                if (h4 || P18 == vs0Var5) {
                                    P18 = new jn3(w61Var5, ss5Var5, ip3Var6, pr3Var4, om6Var2, 1);
                                    xq2Var3.l0(P18);
                                }
                                on2 on2Var9 = (on2) P18;
                                boolean h5 = xq2Var3.h(w61Var5) | xq2Var3.h(ss5Var5) | xq2Var3.d(i13) | xq2Var3.d(i12) | xq2Var3.f(ip3Var6) | xq2Var3.f(pr3Var4);
                                Object P19 = xq2Var3.P();
                                if (h5 || P19 == vs0Var5) {
                                    P19 = new w3(w61Var5, ss5Var5, i13, i12, ip3Var6, pr3Var4, om6Var2);
                                    xq2Var3.l0(P19);
                                }
                                xq2 xq2Var12 = xq2Var3;
                                ak7.e(map11, ch, z34, booleanValue, on2Var9, (eo2) P19, ge7.S(vs0Var3.n(x64Var2, d90.d0), RecyclerView.B1, 56.0f, 2.0f, 16.0f, 1), xq2Var12, 0);
                                xq2Var3 = xq2Var12;
                                xq2Var3.p(false);
                            } else {
                                xq2Var3.b0(342331296);
                                xq2Var3.p(false);
                            }
                            xq2Var3.p(true);
                        } else {
                            xq2Var4.V();
                        }
                        return jg7.a;
                    }
                }, xq2Var2), xq2Var2, 1572870, 58);
                xq2Var = xq2Var2;
            } else {
                i.h("The refresh trigger must be greater than zero!");
                return;
            }
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2(map, map2, str, z, m06Var, set, z2, qn2Var, qn2Var2, qn2Var3, qn2Var4, qn2Var5, qn2Var6, on2Var, on2Var2, qn2Var7, on2Var3, on2Var4, on2Var5, on2Var6, on2Var7, qn2Var8, qn2Var9, qn2Var10, i) { // from class: rr5
                public final /* synthetic */ Map B;
                public final /* synthetic */ Map L;
                public final /* synthetic */ String R;
                public final /* synthetic */ boolean X;
                public final /* synthetic */ m06 Y;
                public final /* synthetic */ Set Z;
                public final /* synthetic */ boolean d0;
                public final /* synthetic */ qn2 e0;
                public final /* synthetic */ qn2 f0;
                public final /* synthetic */ qn2 g0;
                public final /* synthetic */ qn2 h0;
                public final /* synthetic */ qn2 i0;
                public final /* synthetic */ qn2 j0;
                public final /* synthetic */ on2 k0;
                public final /* synthetic */ on2 l0;
                public final /* synthetic */ qn2 m0;
                public final /* synthetic */ on2 n0;
                public final /* synthetic */ on2 o0;
                public final /* synthetic */ on2 p0;
                public final /* synthetic */ on2 q0;
                public final /* synthetic */ on2 r0;
                public final /* synthetic */ qn2 s0;
                public final /* synthetic */ qn2 t0;
                public final /* synthetic */ qn2 u0;

                @Override // defpackage.eo2
                public final Object o(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int a0 = ii2.a0(1);
                    nw7.D(ss5.this, this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, this.n0, this.o0, this.p0, this.q0, this.r0, this.s0, this.t0, this.u0, (px0) obj4, a0);
                    return jg7.a;
                }
            };
        }
    }

    public static final void E(zv0 zv0Var, px0 px0Var, int i) {
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(214570716);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i & 1, z)) {
            hv.d(xp4.a.a(null), n16.I(282847772, new eq(zv0Var, 8), xq2Var), xq2Var, 56);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eq(zv0Var, i, 9);
        }
    }

    public static final void K(a74 a74Var, eo2 eo2Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1090521195);
        if ((i & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.h(eo2Var)) {
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
            Object P = xq2Var.P();
            if (P == ox0.a) {
                P = fc.c;
                xq2Var.l0(P);
            }
            e34 e34Var = (e34) P;
            int i5 = ((i2 << 3) & 112) | ((i2 >> 3) & 14) | RendererDebugBridge.CAPTURE_HEIGHT;
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, a74Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            int i6 = ((i5 << 6) & 896) | 6;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, e34Var);
            yh2.K(xq2Var, ix0.e, l);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            eo2Var.o(xq2Var, Integer.valueOf((i6 >> 6) & 14));
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new lg(a74Var, eo2Var, i);
        }
    }

    public static final a74 N(a74 a74Var, boolean z) {
        if (!z) {
            return a74Var;
        }
        return ge7.y(u24.B(a74Var, up3.Y), new gn5(14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x007b, code lost:
        if (defpackage.ii2.x(r8).a(r7, r0) == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x007b -> B:62:0x007e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object O(ss5 ss5Var, int i, ip3 ip3Var, pr3 pr3Var, Map map, s41 s41Var) {
        rs5 rs5Var;
        int i2;
        int i3;
        ss5 ss5Var2;
        int i4;
        Map map2;
        pr3 pr3Var2;
        ip3 ip3Var2;
        int i5;
        mr5 mr5Var;
        nh2 nh2Var;
        if (s41Var instanceof rs5) {
            rs5 rs5Var2 = (rs5) s41Var;
            int i6 = rs5Var2.h0;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                rs5Var2.h0 = i6 - Integer.MIN_VALUE;
                rs5Var = rs5Var2;
                Object obj = rs5Var.g0;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i2 = rs5Var.h0;
                jg7 jg7Var = jg7.a;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            oi2.Y(obj);
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = rs5Var.f0;
                    int i7 = rs5Var.e0;
                    i5 = rs5Var.d0;
                    Map map3 = rs5Var.Z;
                    pr3Var2 = rs5Var.Y;
                    ip3 ip3Var3 = rs5Var.X;
                    ss5 ss5Var3 = rs5Var.R;
                    oi2.Y(obj);
                    map2 = map3;
                    ip3Var2 = ip3Var3;
                    i3 = i7;
                    ss5Var2 = ss5Var3;
                    Object K0 = gt0.K0(i5, ss5Var2.a);
                    if (K0 instanceof mr5) {
                        mr5Var = (mr5) K0;
                    } else {
                        mr5Var = null;
                    }
                    if (mr5Var != null) {
                        nh2Var = (nh2) map2.get(a0(mr5Var));
                    } else {
                        nh2Var = null;
                    }
                    if (nh2Var != null) {
                        try {
                            nh2.a(nh2Var);
                        } catch (Throwable unused) {
                        }
                        return jg7Var;
                    }
                    i4++;
                    if (i4 >= i3) {
                        qn2 v83Var = new v83(23);
                        rs5Var.R = ss5Var2;
                        rs5Var.X = ip3Var2;
                        rs5Var.Y = pr3Var2;
                        rs5Var.Z = map2;
                        rs5Var.d0 = i5;
                        rs5Var.e0 = i3;
                        rs5Var.f0 = i4;
                        rs5Var.h0 = 1;
                        l61 l61Var = rs5Var.B;
                        l61Var.getClass();
                    } else {
                        rs5Var.R = null;
                        rs5Var.X = null;
                        rs5Var.Y = null;
                        rs5Var.Z = null;
                        rs5Var.d0 = i5;
                        rs5Var.h0 = 2;
                        if (q0(ss5Var2, ip3Var2, pr3Var2, map2, rs5Var) != obj2) {
                            return jg7Var;
                        }
                    }
                    return obj2;
                }
                oi2.Y(obj);
                i3 = 4;
                ss5Var2 = ss5Var;
                i4 = 0;
                map2 = map;
                pr3Var2 = pr3Var;
                ip3Var2 = ip3Var;
                i5 = i;
                if (i4 >= i3) {
                }
                return obj2;
            }
        }
        rs5Var = new s41(s41Var);
        Object obj3 = rs5Var.g0;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i2 = rs5Var.h0;
        jg7 jg7Var2 = jg7.a;
        if (i2 == 0) {
        }
    }

    public static byte[] Q(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static final ap R(ap apVar) {
        ap c = apVar.c();
        int b = c.b();
        for (int i = 0; i < b; i++) {
            c.e(i, apVar.a(i));
        }
        return c;
    }

    public static final xx T(CaptureRequest.Key key) {
        key.getClass();
        return new xx("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public static final lw7 U(Context context, az0 az0Var) {
        j16 n;
        context.getClass();
        ow7 ow7Var = new ow7(az0Var.c);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        zb6 zb6Var = ow7Var.a;
        zb6Var.getClass();
        q61 q61Var = az0Var.d;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        q61Var.getClass();
        if (z) {
            n = new j16(applicationContext, WorkDatabase.class, null);
            n.i = true;
        } else {
            n = ln2.n(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            n.h = new h61(applicationContext, 23);
        }
        n.f = zb6Var;
        n.d.add(new gr0(q61Var));
        n.a(j64.h);
        n.a(new cl5(applicationContext, 2, 3));
        n.a(j64.i);
        n.a(j64.j);
        n.a(new cl5(applicationContext, 5, 6));
        n.a(j64.k);
        n.a(j64.l);
        n.a(j64.m);
        n.a(new cl5(applicationContext));
        n.a(new cl5(applicationContext, 10, 11));
        n.a(j64.d);
        n.a(j64.e);
        n.a(j64.f);
        n.a(j64.g);
        n.a(new cl5(applicationContext, 21, 22));
        n.p = false;
        n.q = true;
        n.r = true;
        WorkDatabase workDatabase = (WorkDatabase) n.b();
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        w87 w87Var = new w87(applicationContext2, ow7Var);
        o35 o35Var = new o35(context.getApplicationContext(), az0Var, ow7Var, workDatabase);
        return new lw7(context.getApplicationContext(), az0Var, ow7Var, workDatabase, (List) mw7.d0.n(context, az0Var, ow7Var, workDatabase, w87Var, o35Var), o35Var, w87Var);
    }

    public static void X(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!p0) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    n0 = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    o0 = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    n0 = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    o0 = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = n0;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = o0;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            p0 = true;
        }
        if (z) {
            try {
                Method method4 = n0;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z && (method = o0) != null) {
            method.invoke(canvas, null);
        }
    }

    public static final String a0(mr5 mr5Var) {
        return xg6.n(mr5Var.a.d, "rom:");
    }

    public static final void d(String str, String str2, boolean z, on2 on2Var, float f, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        str.getClass();
        str2.getClass();
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1893850551);
        if (xq2Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (xq2Var.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3 | RendererDebugBridge.CAPTURE_HEIGHT;
        if (xq2Var.h(on2Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (xq2Var.c(f)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i8 | i5;
        if ((i9 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i9 & 1, z2)) {
            xq2Var.b0(-1075746068);
            float f2 = 1.0f;
            a74 c = dj6.c(x64.a, 1.0f);
            xq2Var.b0(-999499856);
            if ((i9 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P = xq2Var.P();
            if (z4 || P == ox0.a) {
                P = new x7(0, on2Var);
                xq2Var.l0(P);
            }
            a74 f02 = f0(mb3.u(c, false, null, (on2) P, 15), false, null, 3);
            xq2Var.p(false);
            xq2Var.p(false);
            a74 R2 = ge7.R(dj6.f(f02, 64.0f, RecyclerView.B1, 2), f, 8.0f, f, 8.0f);
            yt0 a = wt0.a(ju.d, d90.k0, xq2Var, 6);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, R2);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a);
            yh2.K(xq2Var, ix0.e, l);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            py0 py0Var = g31.a;
            xq2Var.b0(-1337436731);
            long j = ((kt0) xq2Var.j(j31.a)).a;
            if (!((ut0) xq2Var.j(vt0.a)).k() ? hv.N(j) >= 0.5d : hv.N(j) <= 0.5d) {
                f2 = 0.87f;
            }
            xq2Var.p(false);
            hv.d(py0Var.a(Float.valueOf(f2)), n16.I(-1998714303, new y7(str, 0, str2), xq2Var), xq2Var, 56);
            xq2Var.p(true);
            z3 = true;
        } else {
            xq2Var.V();
            z3 = z;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2(str, str2, z3, on2Var, f, i) { // from class: z7
                public final /* synthetic */ String A;
                public final /* synthetic */ String B;
                public final /* synthetic */ boolean L;
                public final /* synthetic */ on2 R;
                public final /* synthetic */ float X;

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(1);
                    nw7.d(this.A, this.B, this.L, this.R, this.X, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }

    public static final a74 d0(a74 a74Var, boolean z, r94 r94Var) {
        a74 a74Var2;
        if (z) {
            a74Var2 = new ai2(r94Var);
        } else {
            a74Var2 = x64.a;
        }
        return a74Var.d(a74Var2);
    }

    public static final void f(final a74 a74Var, final lq4 lq4Var, final List list, final UUID uuid, final sg6 sg6Var, final sn snVar, final qn2 qn2Var, final qn2 qn2Var2, final qn2 qn2Var3, px0 px0Var, final int i) {
        int i2;
        sg6 sg6Var2;
        qn2 qn2Var4;
        qn2 qn2Var5;
        qn2 qn2Var6;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1872213612);
        if ((i & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.f(lq4Var)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(list)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (xq2Var.h(uuid)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if ((i & 24576) == 0) {
            sg6Var2 = sg6Var;
            if (xq2Var.f(sg6Var2)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        } else {
            sg6Var2 = sg6Var;
        }
        if ((196608 & i) == 0) {
            if (xq2Var.h(snVar)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            qn2Var4 = qn2Var;
            if (xq2Var.h(qn2Var4)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        } else {
            qn2Var4 = qn2Var;
        }
        if ((12582912 & i) == 0) {
            qn2Var5 = qn2Var2;
            if (xq2Var.h(qn2Var5)) {
                i4 = 8388608;
            } else {
                i4 = Compress.MAXWINSIZE;
            }
            i2 |= i4;
        } else {
            qn2Var5 = qn2Var2;
        }
        if ((100663296 & i) == 0) {
            qn2Var6 = qn2Var3;
            if (xq2Var.h(qn2Var6)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i2 |= i3;
        } else {
            qn2Var6 = qn2Var3;
        }
        boolean z5 = false;
        if ((i2 & 38347923) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            a74 s = q60.s(a74Var, lq4Var);
            gu2 gu2Var = new gu2(140.0f);
            nq6 nq6Var = ky0.n;
            pq4 pq4Var = new pq4(ge7.r(lq4Var, (kk3) xq2Var.j(nq6Var)) + 16.0f, lq4Var.d() + 16.0f, ge7.q(lq4Var, (kk3) xq2Var.j(nq6Var)) + 16.0f, lq4Var.a() + 16.0f + 56.0f + 16.0f);
            gu guVar = new gu(16.0f, true, new i(1));
            gu guVar2 = new gu(16.0f, true, new i(1));
            boolean h = xq2Var.h(list) | xq2Var.h(uuid);
            if ((3670016 & i2) == 1048576) {
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
            boolean h2 = z6 | z3 | xq2Var.h(snVar);
            if ((29360128 & i2) == 8388608) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = h2 | z4;
            if ((i2 & 234881024) == 67108864) {
                z5 = true;
            }
            boolean z8 = z7 | z5;
            Object P = xq2Var.P();
            if (z8 || P == ox0.a) {
                z00 z00Var = new z00(list, uuid, qn2Var4, sg6Var2, snVar, qn2Var5, qn2Var6);
                xq2Var.l0(z00Var);
                P = z00Var;
            }
            hi2.c(gu2Var, s, null, pq4Var, guVar2, guVar, null, false, null, (qn2) P, xq2Var, 1769472, 916);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2() { // from class: u00
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nw7.f(a74.this, lq4Var, list, uuid, sg6Var, snVar, qn2Var, qn2Var2, qn2Var3, (px0) obj, ii2.a0(i | 1));
                    return jg7.a;
                }
            };
        }
    }

    public static /* synthetic */ a74 f0(a74 a74Var, boolean z, r94 r94Var, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            r94Var = null;
        }
        return d0(a74Var, z, r94Var);
    }

    public static float g0(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return kr1.b(edgeEffect);
        }
        return RecyclerView.B1;
    }

    public static final e33 h0() {
        e33 e33Var = s0;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.FileDownload", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(19.0f, 9.0f);
        ww2Var.l(-4.0f);
        ww2Var.t(3.0f);
        ww2Var.k(9.0f);
        ww2Var.u(6.0f);
        ww2Var.k(5.0f);
        ww2Var.n(7.0f, 7.0f);
        ww2Var.n(7.0f, -7.0f);
        ww2Var.g();
        ww2Var.o(5.0f, 18.0f);
        ww2Var.u(2.0f);
        ww2Var.l(14.0f);
        ww2Var.u(-2.0f);
        ww2Var.k(5.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b = d33Var.b();
        s0 = b;
        return b;
    }

    public static final void i(final v10 v10Var, final sg6 sg6Var, sn snVar, qn2 qn2Var, qn2 qn2Var2, on2 on2Var, px0 px0Var, int i) {
        int i2;
        sn snVar2;
        final qn2 qn2Var3;
        final qn2 qn2Var4;
        boolean z;
        xq2 xq2Var;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        sg6Var.getClass();
        snVar.getClass();
        qn2Var.getClass();
        qn2Var2.getClass();
        on2Var.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-602231173);
        if ((i & 6) == 0) {
            if (xq2Var2.h(v10Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var2.f(sg6Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            snVar2 = snVar;
            if (xq2Var2.h(snVar2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        } else {
            snVar2 = snVar;
        }
        if ((i & 3072) == 0) {
            qn2Var3 = qn2Var;
            if (xq2Var2.h(qn2Var3)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        } else {
            qn2Var3 = qn2Var;
        }
        if ((i & 24576) == 0) {
            qn2Var4 = qn2Var2;
            if (xq2Var2.h(qn2Var4)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        } else {
            qn2Var4 = qn2Var2;
        }
        if ((196608 & i) == 0) {
            if (xq2Var2.h(on2Var)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        int i10 = i2;
        if ((74899 & i10) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i10 & 1, z)) {
            Context context = (Context) xq2Var2.j(kf.b);
            j37 T = mp2.T(xq2Var2);
            final qa4 n = nb3.n(v10Var.e, xq2Var2);
            final qa4 n2 = nb3.n(v10Var.g, xq2Var2);
            zj1 zj1Var = new zj1(sv4.READ, 1);
            boolean h = xq2Var2.h(context) | xq2Var2.f(T) | xq2Var2.h(v10Var);
            Object P = xq2Var2.P();
            Object obj = ox0.a;
            if (!h && P != obj) {
                i3 = 0;
            } else {
                i3 = 0;
                P = new t00(context, T, v10Var, 0);
                xq2Var2.l0(P);
            }
            j04 K = l.K(zj1Var, (qn2) P, xq2Var2, i3);
            final String O = yh2.O(xq2Var2, R.string.background_deleted);
            final String O2 = yh2.O(xq2Var2, R.string.undo);
            final x56 d = v56.d(null, xq2Var2, 3);
            Object P2 = xq2Var2.P();
            if (P2 == obj) {
                P2 = mb3.w(xq2Var2);
                xq2Var2.l0(P2);
            }
            final w61 w61Var = (w61) P2;
            final sn snVar3 = snVar2;
            ps7.a(yh2.O(xq2Var2, R.string.backgrounds), on2Var, null, null, n16.I(-605213652, new z5(K, 3), xq2Var2), d, n16.I(-1843444025, new fo2() { // from class: w00
                @Override // defpackage.fo2
                public final Object e(Object obj2, Object obj3, Object obj4) {
                    boolean z2;
                    int i11;
                    lq4 lq4Var = (lq4) obj2;
                    px0 px0Var2 = (px0) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    lq4Var.getClass();
                    if ((intValue & 6) == 0) {
                        if (((xq2) px0Var2).f(lq4Var)) {
                            i11 = 4;
                        } else {
                            i11 = 2;
                        }
                        intValue |= i11;
                    }
                    if ((intValue & 19) != 18) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    xq2 xq2Var3 = (xq2) px0Var2;
                    if (xq2Var3.S(intValue & 1, z2)) {
                        pp6 pp6Var = n;
                        if (((List) pp6Var.getValue()) == null) {
                            xq2Var3.b0(1705915244);
                            nw7.x(ge7.N(nc1.j0(x64.a, nc1.o), lq4Var).d(dj6.c), xq2Var3, 0);
                            xq2Var3.p(false);
                        } else {
                            xq2Var3.b0(1706098144);
                            lc2 lc2Var = dj6.c;
                            List list = (List) pp6Var.getValue();
                            if (list == null) {
                                list = yt1.A;
                            }
                            UUID uuid = (UUID) n2.getValue();
                            Object obj5 = v10Var;
                            boolean h2 = xq2Var3.h(obj5);
                            Object obj6 = qn2Var3;
                            boolean f = h2 | xq2Var3.f(obj6);
                            Object P3 = xq2Var3.P();
                            Object obj7 = ox0.a;
                            if (f || P3 == obj7) {
                                P3 = new y(5, obj5, obj6);
                                xq2Var3.l0(P3);
                            }
                            qn2 qn2Var5 = (qn2) P3;
                            qn2 qn2Var6 = qn2Var4;
                            boolean f2 = xq2Var3.f(qn2Var6);
                            Object P4 = xq2Var3.P();
                            if (f2 || P4 == obj7) {
                                P4 = new y00(0, qn2Var6);
                                xq2Var3.l0(P4);
                            }
                            qn2 qn2Var7 = (qn2) P4;
                            boolean h3 = xq2Var3.h(obj5);
                            Object obj8 = w61Var;
                            Object obj9 = d;
                            boolean h4 = h3 | xq2Var3.h(obj8) | xq2Var3.f(obj9);
                            Object obj10 = O;
                            Object obj11 = O2;
                            boolean f3 = h4 | xq2Var3.f(obj10) | xq2Var3.f(obj11);
                            Object P5 = xq2Var3.P();
                            if (f3 || P5 == obj7) {
                                Object d5Var = new d5(obj5, obj8, obj9, obj10, obj11, 3);
                                xq2Var3.l0(d5Var);
                                P5 = d5Var;
                            }
                            nw7.f(lc2Var, lq4Var, list, uuid, sg6.this, snVar3, qn2Var5, qn2Var7, (qn2) P5, xq2Var3, ((intValue << 3) & 112) | 6);
                            xq2Var3.p(false);
                        }
                    } else {
                        xq2Var3.V();
                    }
                    return jg7.a;
                }
            }, xq2Var2), xq2Var2, ((i10 >> 12) & 112) | 1597440, 12);
            xq2Var = xq2Var2;
            mp2.e(yh2.O(xq2Var, R.string.background_name), T, null, null, xq2Var, 0, 12);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new e5(v10Var, sg6Var, snVar, qn2Var, qn2Var2, on2Var, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0007, code lost:
        r3 = r3.getRoundedCorner(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static x16 i0(Display display, int i) {
        RoundedCorner roundedCorner;
        int position;
        int i2;
        int radius;
        Point center;
        if (Build.VERSION.SDK_INT >= 31 && roundedCorner != null) {
            position = roundedCorner.getPosition();
            if (position != 0) {
                i2 = 1;
                if (position != 1) {
                    i2 = 2;
                    if (position != 2) {
                        i2 = 3;
                        if (position != 3) {
                            i.h(lb1.g(position, "Invalid position: "));
                            return null;
                        }
                    }
                }
            } else {
                i2 = 0;
            }
            radius = roundedCorner.getRadius();
            center = roundedCorner.getCenter();
            return new x16(i2, radius, center);
        }
        return null;
    }

    public static final void j(a74 a74Var, ic icVar, zv0 zv0Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        e40 e40Var;
        int i3;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(380139498);
        if ((i & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 432;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i4 & 1, z)) {
            e40 e40Var2 = d90.L;
            e34 d = h70.d(e40Var2, false);
            boolean f = xq2Var.f(d);
            Object P = xq2Var.P();
            if (f || P == ox0.a) {
                P = new ql1(4, d, zv0Var);
                xq2Var.l0(P);
            }
            mt6.a(a74Var, (eo2) P, xq2Var, i4 & 14, 0);
            e40Var = e40Var2;
        } else {
            xq2Var.V();
            e40Var = icVar;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new rl(a74Var, e40Var, zv0Var, i, 2);
        }
    }

    public static float j0(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return kr1.c(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static byte[] k0(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                i.m(lb1.g(i, "Not enough bytes to read: "));
                return null;
            }
        }
        return bArr;
    }

    public static final void l(a74 a74Var, lq4 lq4Var, rp0 rp0Var, qn2 qn2Var, qn2 qn2Var2, eo2 eo2Var, qn2 qn2Var3, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        a74Var.getClass();
        lq4Var.getClass();
        rp0Var.getClass();
        qn2Var.getClass();
        qn2Var2.getClass();
        eo2Var.getClass();
        qn2Var3.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1133390423);
        if (xq2Var.f(lq4Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i8 = i | i2;
        if (xq2Var.f(rp0Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i9 = i8 | i3;
        if (xq2Var.h(qn2Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i10 = i9 | i4;
        if (xq2Var.h(qn2Var2)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i11 = i10 | i5;
        if (xq2Var.h(eo2Var)) {
            i6 = 131072;
        } else {
            i6 = 65536;
        }
        int i12 = i11 | i6;
        if (xq2Var.h(qn2Var3)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i13 = i12 | i7;
        if ((599187 & i13) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i13 & 1, z)) {
            if (rp0Var instanceof pp0) {
                xq2Var.b0(1733508728);
                hi2.e(ge7.N(a74Var, lq4Var), xq2Var, 0);
                xq2Var.p(false);
            } else if (rp0Var instanceof qp0) {
                xq2Var.b0(1733511804);
                u(a74Var, lq4Var, (List) ((qp0) rp0Var).a, qn2Var, qn2Var2, eo2Var, qn2Var3, xq2Var, i13 & 4193406);
                xq2Var.p(false);
            } else {
                throw xg6.f(xq2Var, 1733507284, false);
            }
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new fo0(a74Var, lq4Var, rp0Var, qn2Var, qn2Var2, eo2Var, qn2Var3, i, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x005d, code lost:
        if (r0.finished() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0062, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x006a, code lost:
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] l0(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = fileInputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    try {
                        i4 += inflater.inflate(bArr, i4, i2 - i4);
                        i3 += read;
                    } catch (DataFormatException e) {
                        throw new IllegalStateException(e.getMessage());
                    }
                } else {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    public static final void m(p27 p27Var, zv0 zv0Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(2080741862);
        if ((i & 6) == 0) {
            if (xq2Var.h(p27Var)) {
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
            f04.e(p27Var, zv0Var, xq2Var, i2 & 126);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new qu0(p27Var, zv0Var, i, 1);
        }
    }

    public static long m0(InputStream inputStream, int i) {
        byte[] k02 = k0(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (k02[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public static final void n(on2 on2Var, on2 on2Var2, xc1 xc1Var, float f, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        on2Var.getClass();
        on2Var2.getClass();
        xc1Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1053286735);
        if (xq2Var.h(on2Var2)) {
            i2 = 256;
        } else {
            i2 = 128;
        }
        int i5 = i2 | i;
        if (xq2Var.d(xc1Var.ordinal())) {
            i3 = 2048;
        } else {
            i3 = 1024;
        }
        int i6 = i5 | i3;
        if (xq2Var.c(f)) {
            i4 = 16384;
        } else {
            i4 = 8192;
        }
        int i7 = i6 | i4;
        boolean z4 = false;
        if ((i7 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i7 & 1, z)) {
            if ((i7 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = xq2Var.P();
            if (z2 || P == ox0.a) {
                P = new q6(22, xc1Var, on2Var);
                xq2Var.l0(P);
            }
            on2 on2Var3 = (on2) P;
            xc1 xc1Var2 = xc1.DECRYPTING;
            if (xc1Var != xc1Var2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (xc1Var != xc1Var2) {
                z4 = true;
            }
            o(on2Var3, new jj1(4, z3, z4), n16.I(650987110, new uc1(xc1Var, on2Var, on2Var2, f), xq2Var), xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new uc1(on2Var, on2Var2, xc1Var, f, i);
        }
    }

    public static final lw n0(Object obj, pe5 pe5Var, qn2 qn2Var, qn2 qn2Var2, z31 z31Var, int i, px0 px0Var) {
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.c0(1645646697);
        xq2Var.c0(952940650);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            z23 a = dk7.a(obj, xq2Var);
            v0(a);
            xq2Var.c0(1094691773);
            Object P = xq2Var.P();
            if (P == ox0.a) {
                P = new lw(a, pe5Var);
                xq2Var.l0(P);
            }
            lw lwVar = (lw) P;
            xq2Var.p(false);
            lwVar.h0 = qn2Var;
            lwVar.i0 = qn2Var2;
            lwVar.j0 = z31Var;
            lwVar.k0 = i;
            lwVar.l0 = ((Boolean) xq2Var.j(q83.a)).booleanValue();
            lwVar.o0.setValue(pe5Var);
            lwVar.n0.setValue(a);
            lwVar.c();
            xq2Var.p(false);
            Trace.endSection();
            xq2Var.p(false);
            return lwVar;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(on2 on2Var, jj1 jj1Var, zv0 zv0Var, px0 px0Var, int i, int i2) {
        on2 on2Var2;
        int i3;
        jj1 jj1Var2;
        int i4;
        int i5;
        boolean z;
        cf5 t;
        boolean z2;
        boolean z3;
        int i6;
        int i7;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(826668973);
        if ((i & 6) == 0) {
            on2Var2 = on2Var;
            if (xq2Var.h(on2Var2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i;
        } else {
            on2Var2 = on2Var;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            jj1Var2 = jj1Var;
            if (xq2Var.f(jj1Var2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
            if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
                if (xq2Var.h(zv0Var)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i3 |= i6;
            }
            i5 = i3;
            boolean z4 = true;
            if ((i5 & 147) == 146) {
                z = true;
            } else {
                z = false;
            }
            if (!xq2Var.S(i5 & 1, z)) {
                if (i8 != 0) {
                    jj1Var2 = new jj1(7, false, false);
                }
                View view = (View) xq2Var.j(kf.f);
                qh1 qh1Var = (qh1) xq2Var.j(ky0.h);
                kk3 kk3Var = (kk3) xq2Var.j(ky0.n);
                vq2 T = ge7.T(xq2Var);
                qa4 b0 = np2.b0(zv0Var, xq2Var);
                Object[] objArr = new Object[0];
                Object P = xq2Var.P();
                vs0 vs0Var = ox0.a;
                if (P == vs0Var) {
                    P = jf.d0;
                    xq2Var.l0(P);
                }
                UUID uuid = (UUID) qo2.I(objArr, (on2) P, xq2Var, 48);
                boolean d = xq2Var.d(jj1Var2.g) | xq2Var.f(view) | xq2Var.f(qh1Var) | xq2Var.f(null);
                Object P2 = xq2Var.P();
                if (d || P2 == vs0Var) {
                    mj1 mj1Var = new mj1(on2Var2, jj1Var2, view, kk3Var, qh1Var, uuid);
                    zv0 zv0Var2 = new zv0(-1338939603, true, new o0(b0, 1));
                    gj1 gj1Var = mj1Var.d0;
                    gj1Var.setParentCompositionContext(T);
                    gj1Var.j0.setValue(zv0Var2);
                    gj1Var.n0 = true;
                    gj1Var.d();
                    xq2Var.l0(mj1Var);
                    P2 = mj1Var;
                }
                mj1 mj1Var2 = (mj1) P2;
                boolean h = xq2Var.h(mj1Var2);
                Object P3 = xq2Var.P();
                if (!h && P3 != vs0Var) {
                    z2 = false;
                } else {
                    z2 = false;
                    P3 = new hg(mj1Var2, 0);
                    xq2Var.l0(P3);
                }
                mb3.d(mj1Var2, (qn2) P3, xq2Var);
                boolean h2 = xq2Var.h(mj1Var2);
                if ((i5 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                boolean z5 = h2 | z3;
                if ((i5 & 112) != 32) {
                    z4 = z2;
                }
                boolean d2 = z5 | z4 | xq2Var.d(kk3Var.ordinal());
                Object P4 = xq2Var.P();
                if (d2 || P4 == vs0Var) {
                    jj1 jj1Var3 = jj1Var2;
                    P4 = new ig(mj1Var2, on2Var, jj1Var3, kk3Var, 0);
                    jj1Var2 = jj1Var3;
                    xq2Var.l0(P4);
                }
                mb3.n((on2) P4, xq2Var);
            } else {
                xq2Var.V();
            }
            jj1 jj1Var4 = jj1Var2;
            t = xq2Var.t();
            if (t == null) {
                t.d = new jg(on2Var, jj1Var4, zv0Var, i, i2);
                return;
            }
            return;
        }
        jj1Var2 = jj1Var;
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
        }
        i5 = i3;
        boolean z42 = true;
        if ((i5 & 147) == 146) {
        }
        if (!xq2Var.S(i5 & 1, z)) {
        }
        jj1 jj1Var42 = jj1Var2;
        t = xq2Var.t();
        if (t == null) {
        }
    }

    public static final a74 o0(int i, String str, Map map, int i2, qn2 qn2Var, xq2 xq2Var, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4 = (i3 & 112) ^ 48;
        boolean z5 = false;
        if ((i4 > 32 && xq2Var.f(str)) || (i3 & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        Object P = xq2Var.P();
        Object obj = ox0.a;
        if (z || P == obj) {
            P = new nh2();
            xq2Var.l0(P);
        }
        nh2 nh2Var = (nh2) P;
        boolean h = xq2Var.h(map);
        if ((i4 > 32 && xq2Var.f(str)) || (i3 & 48) == 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean f = z2 | h | xq2Var.f(nh2Var);
        Object P2 = xq2Var.P();
        if (f || P2 == obj) {
            P2 = new t00(map, str, nh2Var, 20);
            xq2Var.l0(P2);
        }
        mb3.e(str, nh2Var, (qn2) P2, xq2Var);
        a74 S = ak7.S(x64.a, nh2Var);
        if ((((57344 & i3) ^ 24576) > 16384 && xq2Var.f(qn2Var)) || (i3 & 24576) == 16384) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((((i3 & 14) ^ 6) > 4 && xq2Var.d(i)) || (i3 & 6) == 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z6 = z3 | z4;
        if ((((i3 & 7168) ^ 3072) > 2048 && xq2Var.d(i2)) || (i3 & 3072) == 2048) {
            z5 = true;
        }
        boolean z7 = z6 | z5;
        Object P3 = xq2Var.P();
        if (z7 || P3 == obj) {
            P3 = new u84(qn2Var, i, i2, 2);
            xq2Var.l0(P3);
        }
        return n16.G(S, (qn2) P3);
    }

    public static final float p0(float f, int i, float f2, xq2 xq2Var) {
        xq2Var.b0(2117325265);
        qh1 qh1Var = (qh1) xq2Var.j(ky0.h);
        if (i <= 0) {
            xq2Var.p(false);
            return f2;
        }
        om1 om1Var = new om1(f - qh1Var.Q(i));
        om1 om1Var2 = new om1(RecyclerView.B1);
        if (om1Var.compareTo(om1Var2) < 0) {
            om1Var = om1Var2;
        }
        om1 om1Var3 = new om1(f2);
        om1 om1Var4 = new om1(om1Var.A);
        if (om1Var3.compareTo(om1Var4) < 0) {
            om1Var3 = om1Var4;
        }
        xq2Var.p(false);
        return om1Var3.A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x006f -> B:83:0x0072). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q0(ss5 ss5Var, ip3 ip3Var, pr3 pr3Var, Map map, s41 s41Var) {
        qs5 qs5Var;
        int i;
        int i2;
        ss5 ss5Var2;
        int i3;
        Map map2;
        pr3 pr3Var2;
        ip3 ip3Var2;
        ArrayList arrayList;
        Object next;
        nh2 nh2Var;
        if (s41Var instanceof qs5) {
            qs5 qs5Var2 = (qs5) s41Var;
            int i4 = qs5Var2.g0;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                qs5Var2.g0 = i4 - Integer.MIN_VALUE;
                qs5Var = qs5Var2;
                Object obj = qs5Var.f0;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = qs5Var.g0;
                jg7 jg7Var = jg7.a;
                if (i == 0) {
                    if (i == 1) {
                        i3 = qs5Var.e0;
                        int i5 = qs5Var.d0;
                        Map map3 = qs5Var.Z;
                        pr3Var2 = qs5Var.Y;
                        ip3 ip3Var3 = qs5Var.X;
                        ss5 ss5Var3 = qs5Var.R;
                        oi2.Y(obj);
                        map2 = map3;
                        ip3Var2 = ip3Var3;
                        i2 = i5;
                        ss5Var2 = ss5Var3;
                        int i6 = ps5.a[ss5Var2.f.ordinal()];
                        if (i6 != 1) {
                            if (i6 == 2) {
                                List<kr3> list = pr3Var2.j().k;
                                arrayList = new ArrayList(ht0.v0(list, 10));
                                for (kr3 kr3Var : list) {
                                    arrayList.add(new Integer(kr3Var.a));
                                }
                            } else {
                                i.d();
                                return null;
                            }
                        } else {
                            List<xo3> list2 = ip3Var2.h().m;
                            arrayList = new ArrayList(ht0.v0(list2, 10));
                            for (xo3 xo3Var : list2) {
                                arrayList.add(new Integer(xo3Var.a));
                            }
                        }
                        oc2 oc2Var = new oc2(sb6.b0(new ev(gt0.c1(arrayList), 1), new ro5(ss5Var2, 1)));
                        if (oc2Var.hasNext()) {
                            next = null;
                        } else {
                            next = oc2Var.next();
                        }
                        mr5 mr5Var = (mr5) next;
                        if (mr5Var == null) {
                            List list3 = ss5Var2.a;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : list3) {
                                if (obj3 instanceof mr5) {
                                    arrayList2.add(obj3);
                                }
                            }
                            mr5Var = (mr5) gt0.J0(arrayList2);
                        }
                        if (mr5Var == null) {
                            nh2Var = (nh2) map2.get(a0(mr5Var));
                        } else {
                            nh2Var = null;
                        }
                        if (nh2Var == null) {
                            try {
                                nh2.a(nh2Var);
                            } catch (Throwable unused) {
                            }
                            return jg7Var;
                        }
                        i3++;
                        if (i3 >= i2) {
                            qn2 v83Var = new v83(23);
                            qs5Var.R = ss5Var2;
                            qs5Var.X = ip3Var2;
                            qs5Var.Y = pr3Var2;
                            qs5Var.Z = map2;
                            qs5Var.d0 = i2;
                            qs5Var.e0 = i3;
                            qs5Var.g0 = 1;
                            l61 l61Var = qs5Var.B;
                            l61Var.getClass();
                            if (ii2.x(l61Var).a(v83Var, qs5Var) == obj2) {
                                return obj2;
                            }
                            int i62 = ps5.a[ss5Var2.f.ordinal()];
                            if (i62 != 1) {
                            }
                            oc2 oc2Var2 = new oc2(sb6.b0(new ev(gt0.c1(arrayList), 1), new ro5(ss5Var2, 1)));
                            if (oc2Var2.hasNext()) {
                            }
                            mr5 mr5Var2 = (mr5) next;
                            if (mr5Var2 == null) {
                            }
                            if (mr5Var2 == null) {
                            }
                            if (nh2Var == null) {
                            }
                        } else {
                            return jg7Var;
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    i2 = 4;
                    ss5Var2 = ss5Var;
                    i3 = 0;
                    map2 = map;
                    pr3Var2 = pr3Var;
                    ip3Var2 = ip3Var;
                    if (i3 >= i2) {
                    }
                }
            }
        }
        qs5Var = new s41(s41Var);
        Object obj4 = qs5Var.f0;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = qs5Var.g0;
        jg7 jg7Var2 = jg7.a;
        if (i == 0) {
        }
    }

    public static final void r(qw5 qw5Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        String l;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1404300063);
        if (xq2Var.d(qw5Var.ordinal())) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            es7 F = bl2.F(xq2Var);
            a74 O = ge7.O(dj6.c, 32.0f);
            e34 d = h70.d(d90.Z, false);
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
            yh2.K(xq2Var, ix0.f, d);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            int i4 = ps5.b[qw5Var.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    l = i61.l(xq2Var, -50144077, R.string.rom_no_results_filter, xq2Var, false);
                } else {
                    l = i61.l(xq2Var, -50146066, R.string.rom_no_favorites, xq2Var, false);
                }
            } else {
                l = i61.l(xq2Var, -50148437, R.string.no_roms_found, xq2Var, false);
            }
            x37.b(l, null, F.h, 0L, null, null, 0L, new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var, 0, 0, 130554);
            xq2Var = xq2Var;
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new z5(qw5Var, i, 25);
        }
    }

    public static final LinkedHashMap r0(yy0 yy0Var) {
        CaptureRequest.Key key;
        Object e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (xx xxVar : yy0Var.c()) {
            Object obj = xxVar.c;
            if (obj instanceof CaptureRequest.Key) {
                key = (CaptureRequest.Key) obj;
            } else {
                key = null;
            }
            if (key != null && (e = yy0Var.e(xxVar)) != null) {
                linkedHashMap.put(key, e);
            }
        }
        return linkedHashMap;
    }

    public static final void s(final ss5 ss5Var, final ip3 ip3Var, final Map map, final Map map2, final Set set, final boolean z, final boolean z2, final int i, final float f, final Map map3, final int i2, final int i3, final qn2 qn2Var, qn2 qn2Var2, final qn2 qn2Var3, final qn2 qn2Var4, final qn2 qn2Var5, qn2 qn2Var6, qn2 qn2Var7, on2 on2Var, final qn2 qn2Var8, px0 px0Var, int i4) {
        xq2 xq2Var;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(886411063);
        int i5 = i4 | (xq2Var2.h(ss5Var) ? 4 : 2) | (xq2Var2.f(ip3Var) ? 32 : 16) | (xq2Var2.h(map) ? 256 : 128) | (xq2Var2.h(map2) ? 2048 : 1024) | (xq2Var2.h(set) ? 16384 : 8192) | (xq2Var2.g(z) ? 131072 : 65536) | (xq2Var2.g(z2) ? 1048576 : 524288) | (xq2Var2.d(i) ? 536870912 : 268435456);
        if (xq2Var2.S(i5 & 1, ((i5 & 269034643) == 269034642 && (((((((24624 | (xq2Var2.c(f) ? (char) 4 : (char) 2)) | (xq2Var2.d(i2) ? 256 : 128)) | (xq2Var2.d(i3) ? (char) 2048 : (char) 1024)) | (xq2Var2.h(qn2Var3) ? (char) 0 : (char) 0)) | (xq2Var2.h(qn2Var4) ? 8388608 : Compress.MAXWINSIZE)) | (xq2Var2.h(qn2Var5) ? 67108864 : 33554432)) & 38282387) == 38282386 && ((xq2Var2.h(qn2Var8) ? (char) 256 : (char) 128) & 129) == 128) ? false : true)) {
            List e1 = gt0.e1(ss5Var.a, i);
            final ArrayList arrayList = new ArrayList();
            for (Object obj : e1) {
                if (obj instanceof lr5) {
                    arrayList.add(obj);
                }
            }
            List D0 = gt0.D0(ss5Var.a, i);
            final ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : D0) {
                if (obj2 instanceof mr5) {
                    arrayList2.add(obj2);
                }
            }
            xq2Var = xq2Var2;
            E(n16.I(2032247138, new eo2() { // from class: zr5
                @Override // defpackage.eo2
                public final Object o(Object obj3, Object obj4) {
                    boolean z3;
                    float f2;
                    Integer num;
                    float f3;
                    px0 px0Var2 = (px0) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    int i6 = 0;
                    if ((intValue & 3) != 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    xq2 xq2Var3 = (xq2) px0Var2;
                    if (xq2Var3.S(intValue & 1, z3)) {
                        gu2 gu2Var = new gu2(104.0f);
                        if (z2) {
                            f2 = 28.0f;
                        } else {
                            f2 = 16.0f;
                        }
                        ip3 ip3Var2 = ip3Var;
                        Iterator it = ip3Var2.h().m.iterator();
                        if (!it.hasNext()) {
                            num = null;
                        } else {
                            Integer valueOf = Integer.valueOf((int) (((xo3) it.next()).n & 4294967295L));
                            while (it.hasNext()) {
                                Integer valueOf2 = Integer.valueOf((int) (((xo3) it.next()).n & 4294967295L));
                                if (valueOf.compareTo(valueOf2) < 0) {
                                    valueOf = valueOf2;
                                }
                            }
                            num = valueOf;
                        }
                        if (num != null) {
                            i6 = num.intValue();
                        }
                        if (ss5Var.g == qw5.FAVORITES) {
                            f3 = 96.0f;
                        } else {
                            f3 = 32.0f;
                        }
                        pq4 pq4Var = new pq4(16.0f, RecyclerView.B1, f2, nw7.p0(f, i6, f3, xq2Var3));
                        gu guVar = new gu(11.0f, true, new i(1));
                        gu guVar2 = new gu(11.0f, true, new i(1));
                        lc2 lc2Var = dj6.c;
                        final ArrayList arrayList3 = arrayList;
                        boolean h = xq2Var3.h(arrayList3);
                        final qn2 qn2Var9 = qn2Var3;
                        boolean f4 = h | xq2Var3.f(qn2Var9);
                        final Map map4 = map3;
                        boolean h2 = f4 | xq2Var3.h(map4);
                        final int i7 = i2;
                        boolean d = h2 | xq2Var3.d(i7);
                        final qn2 qn2Var10 = qn2Var;
                        final ArrayList arrayList4 = arrayList2;
                        boolean f5 = d | xq2Var3.f(qn2Var10) | xq2Var3.h(arrayList4);
                        final int i8 = i;
                        boolean d2 = f5 | xq2Var3.d(i8);
                        final qn2 qn2Var11 = qn2Var8;
                        boolean f6 = d2 | xq2Var3.f(qn2Var11);
                        final Map map5 = map;
                        final Map map6 = map2;
                        final boolean z4 = z;
                        final Set set2 = set;
                        final qn2 qn2Var12 = qn2Var4;
                        final qn2 qn2Var13 = qn2Var5;
                        final int i9 = i3;
                        boolean h3 = f6 | xq2Var3.h(map5) | xq2Var3.h(map6) | xq2Var3.g(z4) | xq2Var3.h(set2) | xq2Var3.f(qn2Var12) | xq2Var3.f(qn2Var13) | xq2Var3.d(i9);
                        Object P = xq2Var3.P();
                        if (h3 || P == ox0.a) {
                            qn2 qn2Var14 = new qn2() { // from class: or5
                                @Override // defpackage.qn2
                                public final Object g(Object obj5) {
                                    qn2 qn2Var15;
                                    oo3 oo3Var = (oo3) obj5;
                                    oo3Var.getClass();
                                    ArrayList arrayList5 = arrayList3;
                                    boolean isEmpty = arrayList5.isEmpty();
                                    Map map7 = map4;
                                    int i10 = i7;
                                    qn2 qn2Var16 = qn2Var10;
                                    if (!isEmpty) {
                                        qn2Var15 = qn2Var16;
                                        oo3.g0(oo3Var, "folders", new gn5(13), new zv0(1159037747, true, new pr5(arrayList5, qn2Var9, map7, i10, qn2Var16, 1)), 4);
                                    } else {
                                        qn2Var15 = qn2Var16;
                                    }
                                    ep3 ep3Var = new ep3(10, (byte) 0);
                                    ArrayList arrayList6 = arrayList4;
                                    oo3Var.h0(arrayList6.size(), new r5(22, ep3Var, arrayList6), new fs5(0, arrayList6), new zv0(-1942245546, true, new gs5(arrayList6, i8, qn2Var11, map5, map6, z4, set2, qn2Var12, qn2Var13, map7, i10, qn2Var15, i9)));
                                    return jg7.a;
                                }
                            };
                            xq2Var3.l0(qn2Var14);
                            P = qn2Var14;
                        }
                        hi2.c(gu2Var, lc2Var, ip3Var2, pq4Var, guVar, guVar2, null, false, null, (qn2) P, xq2Var3, 1769520, 912);
                    } else {
                        xq2Var3.V();
                    }
                    return jg7.a;
                }
            }, xq2Var), xq2Var, 6);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2(ip3Var, map, map2, set, z, z2, i, f, map3, i2, i3, qn2Var, qn2Var2, qn2Var3, qn2Var4, qn2Var5, qn2Var6, qn2Var7, on2Var, qn2Var8, i4) { // from class: as5
                public final /* synthetic */ ip3 B;
                public final /* synthetic */ Map L;
                public final /* synthetic */ Map R;
                public final /* synthetic */ Set X;
                public final /* synthetic */ boolean Y;
                public final /* synthetic */ boolean Z;
                public final /* synthetic */ int d0;
                public final /* synthetic */ float e0;
                public final /* synthetic */ Map f0;
                public final /* synthetic */ int g0;
                public final /* synthetic */ int h0;
                public final /* synthetic */ qn2 i0;
                public final /* synthetic */ qn2 j0;
                public final /* synthetic */ qn2 k0;
                public final /* synthetic */ qn2 l0;
                public final /* synthetic */ qn2 m0;
                public final /* synthetic */ qn2 n0;
                public final /* synthetic */ qn2 o0;
                public final /* synthetic */ on2 p0;
                public final /* synthetic */ qn2 q0;

                @Override // defpackage.eo2
                public final Object o(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int a0 = ii2.a0(113246209);
                    nw7.s(ss5.this, this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, this.n0, this.o0, this.p0, this.q0, (px0) obj3, a0);
                    return jg7.a;
                }
            };
        }
    }

    public static final boolean s0(Throwable th, on2 on2Var) {
        List asList;
        Object invoke;
        th.getClass();
        Integer num = gc3.a;
        ui1 ui1Var = null;
        if (num != null && num.intValue() < 19) {
            Method method = mx4.b;
            if (method != null && (invoke = method.invoke(th, null)) != null) {
                asList = Arrays.asList((Throwable[]) invoke);
                asList.getClass();
            } else {
                asList = yt1.A;
            }
        } else {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            asList = Arrays.asList(suppressed);
            asList.getClass();
        }
        int size = asList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) asList.get(i)) instanceof ui1) {
                return false;
            }
        }
        try {
            fx0 fx0Var = (fx0) on2Var.c();
            if (fx0Var != null) {
                boolean z2 = fx0Var.b;
                List list = fx0Var.a;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((hx0) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                fx0Var.getClass();
                ui1Var = new ui1(fx0Var);
            }
        } catch (Throwable th2) {
            ui1Var = th2;
        }
        if (ui1Var != null) {
            mb3.q(th, ui1Var);
        }
        return z;
    }

    public static void t0(String str) {
        String A2 = lb1.A("If you wish to display this ", str, ", use androidx.compose.foundation.Image.");
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + A2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static final void u(a74 a74Var, lq4 lq4Var, List list, qn2 qn2Var, qn2 qn2Var2, eo2 eo2Var, qn2 qn2Var3, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        qn2 qn2Var4;
        eo2 eo2Var2;
        xq2 xq2Var;
        x64 x64Var;
        boolean z2;
        boolean z3;
        int i8;
        vs0 vs0Var;
        char c;
        boolean z4;
        vs0 vs0Var2;
        cn cnVar;
        vs0 vs0Var3;
        int i9;
        vs0 vs0Var4;
        qa4 qa4Var;
        xq2 xq2Var2;
        ?? r1;
        boolean z5;
        boolean z6;
        xq2 xq2Var3 = (xq2) px0Var;
        xq2Var3.d0(-1442409283);
        if (xq2Var3.f(lq4Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i10 = i | i2;
        if (xq2Var3.h(list)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i11 = i10 | i3;
        if (xq2Var3.h(qn2Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i12 = i11 | i4;
        if (xq2Var3.h(qn2Var2)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i13 = i12 | i5;
        if (xq2Var3.h(eo2Var)) {
            i6 = 131072;
        } else {
            i6 = 65536;
        }
        int i14 = i13 | i6;
        if (xq2Var3.h(qn2Var3)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i15 = i14 | i7;
        if ((599187 & i15) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var3.S(i15 & 1, z)) {
            Object[] objArr = new Object[0];
            ap3 ap3Var = jn0.a;
            Object P = xq2Var3.P();
            vs0 vs0Var5 = ox0.a;
            if (P == vs0Var5) {
                P = new c5(13);
                xq2Var3.l0(P);
            }
            Object[] copyOf = Arrays.copyOf(objArr, 0);
            ap3Var.getClass();
            qa4 qa4Var2 = (qa4) qo2.K(copyOf, new ap3(28, new z5(ap3Var, 23), new bg2(ap3Var, 28)), (on2) P, xq2Var3, 3456, 0);
            e34 d = h70.d(d90.L, false);
            int hashCode = Long.hashCode(xq2Var3.T);
            xv4 l = xq2Var3.l();
            a74 E = l.E(xq2Var3, a74Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var3.f0();
            if (xq2Var3.S) {
                xq2Var3.k(iy0Var);
            } else {
                xq2Var3.o0();
            }
            yh2.K(xq2Var3, ix0.f, d);
            yh2.K(xq2Var3, ix0.e, l);
            yh2.K(xq2Var3, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var3, ix0.h);
            yh2.K(xq2Var3, ix0.d, E);
            vs0 vs0Var6 = vs0.Y;
            boolean isEmpty = list.isEmpty();
            x64 x64Var2 = x64.a;
            if (isEmpty) {
                xq2Var3.b0(-649043771);
                x64Var = x64Var2;
                x37.b(yh2.O(xq2Var3, R.string.folder_is_empty), vs0Var6.n(ge7.O(ge7.N(x64Var2, lq4Var), 24.0f), d90.Z), 0L, 0L, null, null, 0L, new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var3, 0, 0, 130556);
                xq2 xq2Var4 = xq2Var3;
                xq2Var4.p(false);
                i9 = i15;
                vs0Var3 = vs0Var5;
                qa4Var = qa4Var2;
                vs0Var4 = vs0Var6;
                r1 = 0;
                xq2Var2 = xq2Var4;
            } else {
                x64Var = x64Var2;
                xq2Var3.b0(-648731105);
                a74 s = q60.s(a74Var, lq4Var);
                gu guVar = new gu(8.0f, true, new i(1));
                nq6 nq6Var = ky0.n;
                pq4 pq4Var = new pq4(ge7.r(lq4Var, (kk3) xq2Var3.j(nq6Var)) + 16.0f, lq4Var.d() + 12.0f, ge7.q(lq4Var, (kk3) xq2Var3.j(nq6Var)) + 16.0f, lq4Var.a() + 16.0f + 56.0f + 16.0f);
                boolean h = xq2Var3.h(list);
                if ((i15 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean f = h | z2 | xq2Var3.f(qa4Var2);
                if ((3670016 & i15) == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z7 = f | z3;
                Object P2 = xq2Var3.P();
                if (!z7 && P2 != vs0Var5) {
                    i8 = i15;
                    vs0Var = vs0Var5;
                    vs0Var2 = vs0Var6;
                    cnVar = P2;
                    c = 16384;
                    z4 = false;
                } else {
                    i8 = i15;
                    vs0Var = vs0Var5;
                    c = 16384;
                    z4 = false;
                    vs0Var2 = vs0Var6;
                    cn cnVar2 = new cn(1, qn2Var, qa4Var2, qn2Var3, list);
                    xq2Var3.l0(cnVar2);
                    cnVar = cnVar2;
                }
                vs0Var3 = vs0Var;
                i9 = i8;
                vs0Var4 = vs0Var2;
                qa4Var = qa4Var2;
                boolean z8 = z4;
                gi2.e(s, null, pq4Var, guVar, null, null, false, null, (qn2) cnVar, xq2Var3, 24576, 490);
                xq2Var3.p(z8);
                r1 = z8;
                xq2Var2 = xq2Var3;
            }
            a74 S = ge7.S(vs0Var4.n(x64Var, d90.g0), RecyclerView.B1, RecyclerView.B1, ge7.q(lq4Var, (kk3) xq2Var2.j(ky0.n)) + 16.0f, lq4Var.a() + 16.0f, 3);
            qa4 qa4Var3 = qa4Var;
            boolean f2 = xq2Var2.f(qa4Var3);
            Object P3 = xq2Var2.P();
            vs0 vs0Var7 = vs0Var3;
            if (f2 || P3 == vs0Var7) {
                P3 = new f4(qa4Var3, 11);
                xq2Var2.l0(P3);
            }
            mb3.g((on2) P3, S, null, 0L, 0L, null, ak7.d, xq2Var2, 12582912);
            xq2Var2.p(true);
            jn0 jn0Var = (jn0) qa4Var3.getValue();
            boolean f3 = xq2Var2.f(qa4Var3);
            Object P4 = xq2Var2.P();
            if (f3 || P4 == vs0Var7) {
                P4 = new f4(qa4Var3, 12);
                xq2Var2.l0(P4);
            }
            on2 on2Var = (on2) P4;
            boolean f4 = xq2Var2.f(qa4Var3);
            if ((i9 & 57344) == 16384) {
                z5 = true;
            } else {
                z5 = r1;
            }
            boolean z9 = f4 | z5;
            if ((i9 & 458752) == 131072) {
                z6 = true;
            } else {
                z6 = r1;
            }
            boolean z10 = z9 | z6;
            Object P5 = xq2Var2.P();
            if (!z10 && P5 != vs0Var7) {
                qn2Var4 = qn2Var2;
                eo2Var2 = eo2Var;
            } else {
                qn2Var4 = qn2Var2;
                eo2Var2 = eo2Var;
                P5 = new t00(qn2Var4, eo2Var2, qa4Var3, 3);
                xq2Var2.l0(P5);
            }
            lb4.c(jn0Var, on2Var, (qn2) P5, xq2Var2, r1);
            xq2Var = xq2Var2;
        } else {
            qn2Var4 = qn2Var2;
            eo2Var2 = eo2Var;
            xq2Var3.V();
            xq2Var = xq2Var3;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new fo0(a74Var, lq4Var, list, qn2Var, qn2Var4, eo2Var2, qn2Var3, i, 1);
        }
    }

    public static final List u0(int i, int i2, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return yt1.A;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            gq3 gq3Var = (gq3) arrayList.get(i3);
            int index = gq3Var.getIndex();
            if (i <= index && index <= i2) {
                arrayList2.add(gq3Var);
            }
        }
        jt0.x0(arrayList2, Y);
        return arrayList2;
    }

    public static final void v0(z23 z23Var) {
        Object obj = z23Var.b;
        if (!(obj instanceof x23)) {
            if (!(obj instanceof zh)) {
                if (!(obj instanceof e33)) {
                    if (!(obj instanceof sr4)) {
                        if (z23Var.c == null) {
                            return;
                        }
                        i.h("request.target must be null.");
                        return;
                    }
                    t0("Painter");
                    throw null;
                }
                t0("ImageVector");
                throw null;
            }
            t0("ImageBitmap");
            throw null;
        }
        i.h("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
    }

    public static final void w(final ss5 ss5Var, final pr3 pr3Var, final Map map, final Map map2, final boolean z, final Set set, final boolean z2, final boolean z3, int i, final float f, final Map map3, final int i2, final qn2 qn2Var, qn2 qn2Var2, final qn2 qn2Var3, final qn2 qn2Var4, final qn2 qn2Var5, final qn2 qn2Var6, qn2 qn2Var7, qn2 qn2Var8, on2 on2Var, final qn2 qn2Var9, px0 px0Var, int i3) {
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1374246367);
        int i4 = i3 | (xq2Var.h(ss5Var) ? 4 : 2) | (xq2Var.f(pr3Var) ? 32 : 16) | (xq2Var.h(map) ? 256 : 128) | (xq2Var.h(map2) ? 2048 : 1024) | (xq2Var.g(z) ? 16384 : 8192) | (xq2Var.h(set) ? 131072 : 65536) | (xq2Var.g(z2) ? 1048576 : 524288) | (xq2Var.g(z3) ? 8388608 : 4194304);
        if (xq2Var.S(i4 & 1, ((i4 & 4793491) == 4793490 && (306717841 & ((((((24960 | (xq2Var.c(f) ? ' ' : (char) 16)) | (xq2Var.d(i2) ? 2048 : 1024)) | (xq2Var.h(qn2Var3) ? (char) 0 : (char) 0)) | (xq2Var.h(qn2Var4) ? (char) 0 : (char) 0)) | (xq2Var.h(qn2Var5) ? 67108864 : 33554432)) | (xq2Var.h(qn2Var6) ? 536870912 : 268435456))) == 306717840 && ((xq2Var.h(qn2Var9) ? (char) 2048 : (char) 1024) & 1025) == 1024) ? false : true)) {
            E(n16.I(45487372, new eo2() { // from class: bs5
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    boolean z4;
                    float f2;
                    Integer num;
                    float f3;
                    px0 px0Var2 = (px0) obj;
                    int intValue = ((Integer) obj2).intValue();
                    int i5 = 0;
                    if ((intValue & 3) != 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    xq2 xq2Var2 = (xq2) px0Var2;
                    if (xq2Var2.S(intValue & 1, z4)) {
                        lc2 lc2Var = dj6.c;
                        if (z3) {
                            f2 = 28.0f;
                        } else {
                            f2 = 0.0f;
                        }
                        pr3 pr3Var2 = pr3Var;
                        Iterator it = pr3Var2.j().k.iterator();
                        if (!it.hasNext()) {
                            num = null;
                        } else {
                            Integer valueOf = Integer.valueOf(((kr3) it.next()).m);
                            while (it.hasNext()) {
                                Integer valueOf2 = Integer.valueOf(((kr3) it.next()).m);
                                if (valueOf.compareTo(valueOf2) < 0) {
                                    valueOf = valueOf2;
                                }
                            }
                            num = valueOf;
                        }
                        if (num != null) {
                            i5 = num.intValue();
                        }
                        final ss5 ss5Var2 = ss5Var;
                        if (ss5Var2.g == qw5.FAVORITES) {
                            f3 = 96.0f;
                        } else {
                            f3 = 32.0f;
                        }
                        pq4 pq4Var = new pq4(RecyclerView.B1, RecyclerView.B1, f2, nw7.p0(f, i5, f3, xq2Var2));
                        boolean h = xq2Var2.h(ss5Var2);
                        final qn2 qn2Var10 = qn2Var3;
                        boolean f4 = h | xq2Var2.f(qn2Var10);
                        final Map map4 = map3;
                        boolean h2 = f4 | xq2Var2.h(map4);
                        final int i6 = i2;
                        boolean d = h2 | xq2Var2.d(i6);
                        final qn2 qn2Var11 = qn2Var;
                        boolean f5 = d | xq2Var2.f(qn2Var11);
                        final qn2 qn2Var12 = qn2Var9;
                        boolean f6 = f5 | xq2Var2.f(qn2Var12);
                        final Map map5 = map;
                        boolean h3 = f6 | xq2Var2.h(map5);
                        final Map map6 = map2;
                        boolean h4 = h3 | xq2Var2.h(map6);
                        final boolean z5 = z;
                        boolean g = h4 | xq2Var2.g(z5);
                        final boolean z6 = z2;
                        boolean g2 = g | xq2Var2.g(z6);
                        final Set set2 = set;
                        boolean h5 = g2 | xq2Var2.h(set2);
                        final qn2 qn2Var13 = qn2Var4;
                        final qn2 qn2Var14 = qn2Var5;
                        final qn2 qn2Var15 = qn2Var6;
                        boolean f7 = h5 | xq2Var2.f(qn2Var13) | xq2Var2.f(qn2Var14) | xq2Var2.f(qn2Var15);
                        Object P = xq2Var2.P();
                        if (f7 || P == ox0.a) {
                            P = new qn2() { // from class: ur5
                                @Override // defpackage.qn2
                                public final Object g(Object obj3) {
                                    er3 er3Var = (er3) obj3;
                                    er3Var.getClass();
                                    ss5 ss5Var3 = ss5.this;
                                    List list = ss5Var3.a;
                                    er3Var.h0(list.size(), new r5(23, new ep3(11, (byte) 0), list), new j5(21, list), new zv0(2039820996, true, new hs5(list, qn2Var10, map4, i6, qn2Var11, ss5Var3, qn2Var12, map5, map6, z5, z6, set2, qn2Var13, qn2Var14, qn2Var15)));
                                    return jg7.a;
                                }
                            };
                            xq2Var2.l0(P);
                        }
                        gi2.e(lc2Var, pr3Var2, pq4Var, null, null, null, false, null, (qn2) P, xq2Var2, 6, 504);
                    } else {
                        xq2Var2.V();
                    }
                    return jg7.a;
                }
            }, xq2Var), xq2Var, 6);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2(pr3Var, map, map2, z, set, z2, z3, i, f, map3, i2, qn2Var, qn2Var2, qn2Var3, qn2Var4, qn2Var5, qn2Var6, qn2Var7, qn2Var8, on2Var, qn2Var9, i3) { // from class: cs5
                public final /* synthetic */ pr3 B;
                public final /* synthetic */ Map L;
                public final /* synthetic */ Map R;
                public final /* synthetic */ boolean X;
                public final /* synthetic */ Set Y;
                public final /* synthetic */ boolean Z;
                public final /* synthetic */ boolean d0;
                public final /* synthetic */ int e0;
                public final /* synthetic */ float f0;
                public final /* synthetic */ Map g0;
                public final /* synthetic */ int h0;
                public final /* synthetic */ qn2 i0;
                public final /* synthetic */ qn2 j0;
                public final /* synthetic */ qn2 k0;
                public final /* synthetic */ qn2 l0;
                public final /* synthetic */ qn2 m0;
                public final /* synthetic */ qn2 n0;
                public final /* synthetic */ qn2 o0;
                public final /* synthetic */ qn2 p0;
                public final /* synthetic */ on2 q0;
                public final /* synthetic */ qn2 r0;

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(905969665);
                    nw7.w(ss5.this, this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, this.n0, this.o0, this.p0, this.q0, this.r0, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }

    public static void w0(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final void x(a74 a74Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(351258571);
        if (xq2Var.f(a74Var)) {
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
        if (xq2Var.S(i3 & 1, z)) {
            e34 d = h70.d(d90.L, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, a74Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, d);
            yh2.K(xq2Var, ix0.e, l);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            e45.a(vs0.Y.n(x64.a, d90.Z), bl2.F(xq2Var).j, RecyclerView.B1, 0L, 0, xq2Var, 0, 28);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new v00(a74Var, i, 0);
        }
    }

    public static void x0(ByteArrayOutputStream byteArrayOutputStream, int i) {
        w0(byteArrayOutputStream, i, 2);
    }

    @Override // defpackage.ux0
    public String A(wb6 wb6Var, int i) {
        wb6Var.getClass();
        return I();
    }

    @Override // defpackage.sc1
    public int B() {
        Object V = V();
        V.getClass();
        return ((Integer) V).intValue();
    }

    @Override // defpackage.ux0
    public short C(t25 t25Var, int i) {
        t25Var.getClass();
        return Z();
    }

    @Override // defpackage.sc1
    public sc1 F(wb6 wb6Var) {
        wb6Var.getClass();
        return this;
    }

    public Object G(wb6 wb6Var, int i, gg3 gg3Var, Object obj) {
        wb6Var.getClass();
        gg3Var.getClass();
        return k(gg3Var);
    }

    @Override // defpackage.ux0
    public int H(wb6 wb6Var, int i) {
        wb6Var.getClass();
        return B();
    }

    @Override // defpackage.sc1
    public String I() {
        Object V = V();
        V.getClass();
        return (String) V;
    }

    @Override // defpackage.sc1
    public int J(wb6 wb6Var) {
        wb6Var.getClass();
        Object V = V();
        V.getClass();
        return ((Integer) V).intValue();
    }

    @Override // defpackage.sc1
    public long L() {
        Object V = V();
        V.getClass();
        return ((Long) V).longValue();
    }

    @Override // defpackage.sc1
    public boolean M() {
        return true;
    }

    @Override // defpackage.ux0
    public Object P(wb6 wb6Var, int i, gg3 gg3Var, Object obj) {
        wb6Var.getClass();
        gg3Var.getClass();
        if (!gg3Var.e().c() && !M()) {
            return null;
        }
        return k(gg3Var);
    }

    public Object V() {
        throw new IllegalArgumentException(gh5.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // defpackage.ux0
    public boolean W(wb6 wb6Var, int i) {
        wb6Var.getClass();
        return g();
    }

    @Override // defpackage.sc1
    public byte Y() {
        Object V = V();
        V.getClass();
        return ((Byte) V).byteValue();
    }

    @Override // defpackage.sc1
    public short Z() {
        Object V = V();
        V.getClass();
        return ((Short) V).shortValue();
    }

    public void a(wb6 wb6Var) {
        wb6Var.getClass();
    }

    @Override // defpackage.sc1
    public float b0() {
        Object V = V();
        V.getClass();
        return ((Float) V).floatValue();
    }

    @Override // defpackage.sc1
    public ux0 c(wb6 wb6Var) {
        wb6Var.getClass();
        return this;
    }

    @Override // defpackage.ux0
    public long c0(wb6 wb6Var, int i) {
        wb6Var.getClass();
        return L();
    }

    @Override // defpackage.ux0
    public sc1 e(t25 t25Var, int i) {
        t25Var.getClass();
        return F(t25Var.j(i));
    }

    @Override // defpackage.sc1
    public double e0() {
        Object V = V();
        V.getClass();
        return ((Double) V).doubleValue();
    }

    @Override // defpackage.sc1
    public boolean g() {
        Object V = V();
        V.getClass();
        return ((Boolean) V).booleanValue();
    }

    @Override // defpackage.sc1
    public char h() {
        Object V = V();
        V.getClass();
        return ((Character) V).charValue();
    }

    @Override // defpackage.ux0
    public float p(wb6 wb6Var, int i) {
        wb6Var.getClass();
        return b0();
    }

    @Override // defpackage.ux0
    public double t(t25 t25Var, int i) {
        t25Var.getClass();
        return e0();
    }

    @Override // defpackage.ux0
    public char v(t25 t25Var, int i) {
        t25Var.getClass();
        return h();
    }

    @Override // defpackage.ux0
    public byte z(t25 t25Var, int i) {
        t25Var.getClass();
        return Y();
    }
}
