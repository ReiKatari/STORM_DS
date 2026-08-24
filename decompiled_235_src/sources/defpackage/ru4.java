package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ru4  reason: default package */
/* loaded from: classes.dex */
public abstract class ru4 {
    public static final long a = hv.c(3758622474L);
    public static final /* synthetic */ int b = 0;

    public static final void a(final String str, final long j, final long j2, final on2 on2Var, final a74 a74Var, px0 px0Var, final int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1464249217);
        if ((i & 6) == 0) {
            if (xq2Var.f(str)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.e(j)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.e(j2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (xq2Var.h(on2Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (xq2Var.f(a74Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            es7 F = bl2.F(xq2Var);
            Object P = xq2Var.P();
            if (P == ox0.a) {
                P = i61.f(xq2Var);
            }
            r94 r94Var = (r94) P;
            qa4 a2 = bw7.a(r94Var, xq2Var, 6);
            y16 b2 = z16.b(11.0f);
            a74 L = vy7.L(u24.g(dj6.e(a74Var, 42.0f), b2), j, u24.m);
            if (((Boolean) a2.getValue()).booleanValue()) {
                L = ak7.I(L, 2.0f, F.j, b2);
            }
            a74 t = mb3.t(L, r94Var, null, false, null, on2Var, 28);
            e34 d = h70.d(d90.Z, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, t);
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
            x37.b(str, null, j2, hi2.E(13), oj2.d0, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, (i2 & 14) | 199680 | (i2 & 896), 0, 131026);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new eo2() { // from class: ou4
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ru4.a(str, j, j2, on2Var, a74Var, (px0) obj, ii2.a0(i | 1));
                    return jg7.a;
                }
            };
        }
    }

    public static final void b(nu4 nu4Var, on2 on2Var, on2 on2Var2, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        e33 L;
        float f;
        float f2;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1775077993);
        if (xq2Var.f(nu4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (xq2Var.h(on2Var2)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i8 = i7 | i3;
        if ((i8 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i8 & 1, z)) {
            es7 F = bl2.F(xq2Var);
            if (nu4Var != xz5.RESET && nu4Var != cd2.RESET) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                i4 = R.string.pause_confirm_reset_title;
            } else {
                i4 = R.string.pause_confirm_exit_title;
            }
            String O = yh2.O(xq2Var, i4);
            if (z2) {
                i5 = R.string.pause_confirm_reset_message;
            } else {
                i5 = R.string.pause_confirm_exit_message;
            }
            String O2 = yh2.O(xq2Var, i5);
            if (z2) {
                i6 = R.string.reset;
            } else {
                i6 = R.string.exit;
            }
            String O3 = yh2.O(xq2Var, i6);
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = new nh2();
                xq2Var.l0(P);
            }
            nh2 nh2Var = (nh2) P;
            lc2 lc2Var = dj6.c;
            long c = kt0.c(0.6f, kt0.b);
            jy2 jy2Var = u24.m;
            a74 L2 = vy7.L(lc2Var, c, jy2Var);
            Object P2 = xq2Var.P();
            if (P2 == vs0Var) {
                P2 = new x84(29);
                xq2Var.l0(P2);
            }
            a74 y = ge7.y(L2, (qn2) P2);
            Object P3 = xq2Var.P();
            if (P3 == vs0Var) {
                P3 = i61.f(xq2Var);
            }
            r94 r94Var = (r94) P3;
            Object P4 = xq2Var.P();
            if (P4 == vs0Var) {
                P4 = new x7(13, on2Var);
                xq2Var.l0(P4);
            }
            a74 t = mb3.t(y, r94Var, null, false, null, (on2) P4, 28);
            e34 d = h70.d(d90.Z, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, t);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, d);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            c40 c40Var = d90.l0;
            x64 x64Var = x64.a;
            boolean z3 = z2;
            a74 I = ak7.I(vy7.L(u24.g(dj6.m(330.0f, 1, ge7.O(x64Var, 28.0f)), z16.b(17.0f)), F.c, jy2Var), 1.0f, F.f, z16.b(17.0f));
            Object P5 = xq2Var.P();
            if (P5 == vs0Var) {
                P5 = new x84(25);
                xq2Var.l0(P5);
            }
            a74 y2 = ge7.y(I, (qn2) P5);
            Object P6 = xq2Var.P();
            if (P6 == vs0Var) {
                P6 = i61.f(xq2Var);
            }
            r94 r94Var2 = (r94) P6;
            Object P7 = xq2Var.P();
            if (P7 == vs0Var) {
                P7 = new pi3(25);
                xq2Var.l0(P7);
            }
            a74 R = ge7.R(mb3.t(y2, r94Var2, null, false, null, (on2) P7, 28), 20.0f, 22.0f, 20.0f, 16.0f);
            yt0 a2 = wt0.a(ju.c, c40Var, xq2Var, 48);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, R);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a2);
            yh2.K(xq2Var, pnVar2, l2);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            if (z3) {
                L = ii2.y();
            } else {
                L = uj2.L();
            }
            i13.a(L, null, dj6.i(x64Var, 34.0f), F.j, xq2Var, 432, 0);
            x37.b(O, ge7.S(x64Var, RecyclerView.B1, 10.0f, RecyclerView.B1, RecyclerView.B1, 13), F.g, hi2.E(17), oj2.e0, qs7.a, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772592, 0, 130960);
            x37.b(O2, ge7.S(x64Var, RecyclerView.B1, 6.0f, RecyclerView.B1, RecyclerView.B1, 13), F.i, hi2.D(12.5d), null, null, 0L, new wz6(3), hi2.E(18), 0, false, 0, 0, null, null, xq2Var, 3120, 6, 129520);
            xq2Var = xq2Var;
            a74 S = ge7.S(dj6.c(x64Var, 1.0f), RecyclerView.B1, 16.0f, RecyclerView.B1, RecyclerView.B1, 13);
            l26 a3 = k26.a(ju.a, d90.h0, xq2Var, 0);
            int hashCode3 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E3 = l.E(xq2Var, S);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a3);
            yh2.K(xq2Var, pnVar2, l3);
            i61.w(hashCode3, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E3);
            String O4 = yh2.O(xq2Var, R.string.cancel);
            long j = F.d;
            long j2 = F.g;
            if (1.0f <= 0.0d) {
                n53.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f;
            }
            a(O4, j, j2, on2Var, new vn3(f, true), xq2Var, 3072);
            gi2.h(xq2Var, dj6.l(x64Var, 9.0f));
            long j3 = F.j;
            long j4 = kt0.d;
            if (1.0f <= 0.0d) {
                n53.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            a(O3, j3, j4, on2Var2, ak7.S(new vn3(f2, true), nh2Var), xq2Var, ((i8 << 3) & 7168) | RendererDebugBridge.CAPTURE_HEIGHT);
            i61.y(xq2Var, true, true, true);
            is7.b(nh2Var, xq2Var, 6);
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new x3(nu4Var, on2Var, on2Var2, i, 25);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x06d8  */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(mu4 mu4Var, pq5 pq5Var, qn2 qn2Var, on2 on2Var, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        qn2 qn2Var2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        lc2 lc2Var;
        float f;
        pn pnVar;
        long j;
        pn pnVar2;
        ne neVar;
        jy2 jy2Var;
        pq5 pq5Var2;
        float f2;
        int i6;
        String str;
        String str2;
        x64 x64Var;
        boolean z6;
        int i7;
        float f3;
        boolean z7;
        int i8;
        boolean z8;
        boolean z9;
        Object P;
        qa4 qa4Var;
        int i9;
        nu4 nu4Var;
        boolean z10;
        qn2Var.getClass();
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1520489257);
        if (xq2Var.h(mu4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i10 = i | i2;
        if (xq2Var.h(pq5Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i11 = i10 | i3;
        if (xq2Var.h(qn2Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i12 = i11 | i4;
        if (xq2Var.h(on2Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i13 = i12 | i5;
        if ((i13 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i13 & 1, z)) {
            es7 F = bl2.F(xq2Var);
            Object P2 = xq2Var.P();
            Object obj = ox0.a;
            if (P2 == obj) {
                P2 = np2.Y(null);
                xq2Var.l0(P2);
            }
            qa4 qa4Var2 = (qa4) P2;
            Object P3 = xq2Var.P();
            if (P3 == obj) {
                P3 = new nh2();
                xq2Var.l0(P3);
            }
            nh2 nh2Var = (nh2) P3;
            Configuration configuration = (Configuration) xq2Var.j(kf.a);
            if (configuration.screenWidthDp > configuration.screenHeightDp) {
                z2 = true;
            } else {
                z2 = false;
            }
            Context context = (Context) xq2Var.j(kf.b);
            int i14 = 57344 & i13;
            if (i14 == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P4 = xq2Var.P();
            if (z3 || P4 == obj) {
                P4 = new s00(on2Var, qa4Var2, 11);
                xq2Var.l0(P4);
            }
            ge7.b(false, (on2) P4, xq2Var, 0, 1);
            lc2 lc2Var2 = dj6.c;
            jy2 jy2Var2 = u24.m;
            a74 L = vy7.L(lc2Var2, a, jy2Var2);
            Object P5 = xq2Var.P();
            if (P5 == obj) {
                P5 = new x84(27);
                xq2Var.l0(P5);
            }
            a74 y = ge7.y(L, (qn2) P5);
            Object P6 = xq2Var.P();
            if (P6 == obj) {
                P6 = i61.f(xq2Var);
            }
            r94 r94Var = P6;
            if (i14 == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P7 = xq2Var.P();
            if (z4 || P7 == obj) {
                P7 = new x7(14, on2Var);
                xq2Var.l0(P7);
            }
            a74 t = mb3.t(y, r94Var, null, false, null, P7, 28);
            if (i14 == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object P8 = xq2Var.P();
            if (z5 || P8 == obj) {
                P8 = new r5(17, on2Var, qa4Var2);
                xq2Var.l0(P8);
            }
            a74 B = u24.B(t, (qn2) P8);
            e34 d = h70.d(d90.L, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, B);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar3 = ix0.f;
            yh2.K(xq2Var, pnVar3, d);
            pn pnVar4 = ix0.e;
            yh2.K(xq2Var, pnVar4, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar5 = ix0.g;
            yh2.K(xq2Var, pnVar5, valueOf);
            ne neVar2 = ix0.h;
            yh2.F(xq2Var, neVar2);
            pn pnVar6 = ix0.d;
            yh2.K(xq2Var, pnVar6, E);
            a74 j0 = nc1.j0(lc2Var2, nc1.o);
            Object P9 = xq2Var.P();
            if (P9 == obj) {
                lc2Var = lc2Var2;
                P9 = new x84(28);
                xq2Var.l0(P9);
            } else {
                lc2Var = lc2Var2;
            }
            a74 y2 = ge7.y(j0, (qn2) P9);
            Object P10 = xq2Var.P();
            if (P10 == obj) {
                P10 = i61.f(xq2Var);
            }
            r94 r94Var2 = (r94) P10;
            Object P11 = xq2Var.P();
            if (P11 == obj) {
                P11 = new pi3(25);
                xq2Var.l0(P11);
            }
            a74 t2 = mb3.t(y2, r94Var2, null, false, null, (on2) P11, 28);
            c40 c40Var = d90.k0;
            eu euVar = ju.c;
            yt0 a2 = wt0.a(euVar, c40Var, xq2Var, 0);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, t2);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar3, a2);
            yh2.K(xq2Var, pnVar4, l2);
            i61.w(hashCode2, xq2Var, pnVar5, xq2Var, neVar2);
            yh2.K(xq2Var, pnVar6, E2);
            d40 d40Var = d90.i0;
            x64 x64Var2 = x64.a;
            a74 c = dj6.c(x64Var2, 1.0f);
            if (z2) {
                f = 22.0f;
            } else {
                f = 16.0f;
            }
            a74 P12 = ge7.P(c, f, 10.0f);
            du duVar = ju.a;
            l26 a3 = k26.a(duVar, d40Var, xq2Var, 48);
            int hashCode3 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E3 = l.E(xq2Var, P12);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar3, a3);
            yh2.K(xq2Var, pnVar4, l3);
            i61.w(hashCode3, xq2Var, pnVar5, xq2Var, neVar2);
            yh2.K(xq2Var, pnVar6, E3);
            a74 g = u24.g(dj6.i(x64Var2, 38.0f), z16.b(10.0f));
            int i15 = kt0.i;
            long j2 = kt0.d;
            a74 u = mb3.u(vy7.L(g, kt0.c(0.12f, j2), jy2Var2), false, null, on2Var, 15);
            e40 e40Var = d90.Z;
            e34 d2 = h70.d(e40Var, false);
            int hashCode4 = Long.hashCode(xq2Var.T);
            xv4 l4 = xq2Var.l();
            a74 E4 = l.E(xq2Var, u);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar3, d2);
            yh2.K(xq2Var, pnVar4, l4);
            i61.w(hashCode4, xq2Var, pnVar5, xq2Var, neVar2);
            yh2.K(xq2Var, pnVar6, E4);
            i13.a(jw2.q(), yh2.O(xq2Var, R.string.back), dj6.i(x64Var2, 20.0f), j2, xq2Var, 3456, 0);
            xq2Var.p(true);
            gi2.h(xq2Var, dj6.l(x64Var2, 10.0f));
            a74 L2 = vy7.L(u24.g(dj6.i(x64Var2, 40.0f), z16.b(9.0f)), kt0.c(0.08f, j2), jy2Var2);
            e34 d3 = h70.d(e40Var, false);
            int hashCode5 = Long.hashCode(xq2Var.T);
            xv4 l5 = xq2Var.l();
            a74 E5 = l.E(xq2Var, L2);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar3, d3);
            yh2.K(xq2Var, pnVar4, l5);
            i61.w(hashCode5, xq2Var, pnVar5, xq2Var, neVar2);
            yh2.K(xq2Var, pnVar6, E5);
            if (pq5Var != null) {
                xq2Var.b0(751341016);
                x23 x23Var = new x23(context);
                x23Var.c = pq5Var;
                neVar = neVar2;
                pnVar = pnVar5;
                jy2Var = jy2Var2;
                j = j2;
                pnVar2 = pnVar6;
                pq5Var2 = pq5Var;
                gi2.b(x23Var.a(), null, lc2Var, null, RecyclerView.B1, xq2Var, 432, 3576);
                i6 = 0;
                xq2Var.p(false);
                f2 = 22.0f;
            } else {
                pnVar = pnVar5;
                j = j2;
                pnVar2 = pnVar6;
                neVar = neVar2;
                jy2Var = jy2Var2;
                pq5Var2 = pq5Var;
                xq2Var.b0(751695563);
                f2 = 22.0f;
                i13.a(yh2.v(), null, dj6.i(x64Var2, 22.0f), kt0.c(0.7f, j), xq2Var, 3504, 0);
                i6 = 0;
                xq2Var.p(false);
            }
            xq2Var.p(true);
            gi2.h(xq2Var, dj6.l(x64Var2, 12.0f));
            vn3 vn3Var = new vn3(1.0f, true);
            yt0 a4 = wt0.a(euVar, c40Var, xq2Var, i6);
            int hashCode6 = Long.hashCode(xq2Var.T);
            xv4 l6 = xq2Var.l();
            a74 E6 = l.E(xq2Var, vn3Var);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar3, a4);
            yh2.K(xq2Var, pnVar4, l6);
            ne neVar3 = neVar;
            pn pnVar7 = pnVar;
            i61.w(hashCode6, xq2Var, pnVar7, xq2Var, neVar3);
            pn pnVar8 = pnVar2;
            yh2.K(xq2Var, pnVar8, E6);
            if (pq5Var2 != null) {
                str = pq5Var2.f.e;
                if (str == null) {
                    str = pq5Var2.a;
                }
            } else {
                str = null;
            }
            if (str == null) {
                str = i61.l(xq2Var, -116779905, R.string.pause, xq2Var, false);
            } else {
                xq2Var.b0(-116781393);
                xq2Var.p(false);
            }
            String str3 = str;
            pi2 pi2Var = qs7.a;
            long E7 = hi2.E(16);
            oj2 oj2Var = oj2.d0;
            jy2 jy2Var3 = jy2Var;
            long j3 = j;
            x37.b(str3, null, j3, E7, oj2Var, pi2Var, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var, 1772928, 3120, 120722);
            a74 S = ge7.S(x64Var2, RecyclerView.B1, 2.0f, RecyclerView.B1, RecyclerView.B1, 13);
            l26 a5 = k26.a(duVar, d40Var, xq2Var, 48);
            int hashCode7 = Long.hashCode(xq2Var.T);
            xv4 l7 = xq2Var.l();
            a74 E8 = l.E(xq2Var, S);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar3, a5);
            yh2.K(xq2Var, pnVar4, l7);
            i61.w(hashCode7, xq2Var, pnVar7, xq2Var, neVar3);
            yh2.K(xq2Var, pnVar8, E8);
            String O = yh2.O(xq2Var, R.string.pause_paused_label);
            long j4 = F.j;
            sr2 sr2Var = qs7.c;
            x37.b(O, null, j4, hi2.E(9), oj2Var, sr2Var, hi2.D(0.8d), null, 0L, 0, false, 0, 0, null, null, xq2Var, 14355456, 0, 130834);
            xq2 xq2Var2 = xq2Var;
            if (pq5Var != null) {
                long j5 = pq5Var.j;
                oq1 oq1Var = new oq1(j5);
                jd1 jd1Var = oq1.B;
                if (oq1.d(j5, 0L)) {
                    oq1Var = null;
                }
                if (oq1Var != null) {
                    str2 = hf.P(oq1Var.A);
                    if (str2 == null) {
                        xq2Var2.b0(-1718906416);
                        x64Var = x64Var2;
                        x37.b(str2, ge7.S(x64Var2, 10.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14), kt0.c(0.5f, j3), hi2.D(9.5d), null, sr2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1576368, 0, 130992);
                        xq2Var2 = xq2Var2;
                        z6 = false;
                        xq2Var2.p(false);
                    } else {
                        x64Var = x64Var2;
                        z6 = false;
                        xq2Var2.b0(-1718552923);
                        xq2Var2.p(false);
                    }
                    xq2Var2.p(true);
                    xq2Var2.p(true);
                    xq2Var2.b0(-1350651445);
                    xq2Var2.p(z6);
                    xq2Var2.p(true);
                    h70.a(vy7.L(dj6.e(dj6.c(x64Var, 1.0f), 1.0f), kt0.c(0.09f, j3), jy2Var3), xq2Var2, 6);
                    if (!z2) {
                        i7 = 3;
                    } else {
                        i7 = 1;
                    }
                    hu2 hu2Var = new hu2(i7);
                    gu guVar = new gu(5.0f, true, new i(1));
                    boolean z11 = z6;
                    gu guVar2 = new gu(5.0f, true, new i(1));
                    a74 d4 = dj6.m(640.0f, 1, zt0.a(x64Var)).d(new cy2(d90.l0));
                    if (!z2) {
                        f3 = f2;
                    } else {
                        f3 = 16.0f;
                    }
                    a74 P13 = ge7.P(d4, f3, 12.0f);
                    if (i14 != 16384) {
                        z7 = true;
                    } else {
                        z7 = z11;
                    }
                    boolean h = z7 | xq2Var2.h(mu4Var);
                    i8 = i13 & 7168;
                    if (i8 != 2048) {
                        z8 = true;
                    } else {
                        z8 = z11;
                    }
                    z9 = h | z8;
                    P = xq2Var2.P();
                    if (z9 && P != obj) {
                        qa4Var = qa4Var2;
                        i9 = 2;
                    } else {
                        qa4Var = qa4Var2;
                        i9 = 2;
                        d5 d5Var = new d5(mu4Var, on2Var, nh2Var, qn2Var, qa4Var);
                        xq2Var2.l0(d5Var);
                        P = d5Var;
                    }
                    xq2 xq2Var3 = xq2Var2;
                    hi2.c(hu2Var, P13, null, null, guVar2, guVar, null, false, null, (qn2) P, xq2Var3, 1769472, 924);
                    xq2Var = xq2Var3;
                    qa4 qa4Var3 = qa4Var;
                    qn2Var2 = qn2Var;
                    is7.a(hf.c0(new rq2(null, yh2.O(xq2Var, R.string.pause_hint_navigate)), new rq2("A", yh2.O(xq2Var, R.string.pause_hint_accept)), new rq2("B", yh2.O(xq2Var, R.string.pause_hint_resume))), null, false, xq2Var, 0, 6);
                    xq2Var.p(true);
                    nu4Var = (nu4) qa4Var3.getValue();
                    if (nu4Var == null) {
                        xq2Var.b0(-829881663);
                        Object P14 = xq2Var.P();
                        if (P14 == obj) {
                            P14 = new oe4(qa4Var3, i9);
                            xq2Var.l0(P14);
                        }
                        on2 on2Var2 = (on2) P14;
                        if (i8 == 2048) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolean h2 = xq2Var.h(nu4Var) | z10;
                        Object P15 = xq2Var.P();
                        if (h2 || P15 == obj) {
                            P15 = new u6(qn2Var2, nu4Var, qa4Var3, 16);
                            xq2Var.l0(P15);
                        }
                        b(nu4Var, on2Var2, (on2) P15, xq2Var, 48);
                        xq2Var.p(false);
                    } else {
                        xq2Var.b0(-829589519);
                        xq2Var.p(false);
                    }
                    is7.b(nh2Var, xq2Var, 6);
                    xq2Var.p(true);
                }
            }
            str2 = null;
            if (str2 == null) {
            }
            xq2Var2.p(true);
            xq2Var2.p(true);
            xq2Var2.b0(-1350651445);
            xq2Var2.p(z6);
            xq2Var2.p(true);
            h70.a(vy7.L(dj6.e(dj6.c(x64Var, 1.0f), 1.0f), kt0.c(0.09f, j3), jy2Var3), xq2Var2, 6);
            if (!z2) {
            }
            hu2 hu2Var2 = new hu2(i7);
            gu guVar3 = new gu(5.0f, true, new i(1));
            boolean z112 = z6;
            gu guVar22 = new gu(5.0f, true, new i(1));
            a74 d42 = dj6.m(640.0f, 1, zt0.a(x64Var)).d(new cy2(d90.l0));
            if (!z2) {
            }
            a74 P132 = ge7.P(d42, f3, 12.0f);
            if (i14 != 16384) {
            }
            boolean h3 = z7 | xq2Var2.h(mu4Var);
            i8 = i13 & 7168;
            if (i8 != 2048) {
            }
            z9 = h3 | z8;
            P = xq2Var2.P();
            if (z9) {
            }
            qa4Var = qa4Var2;
            i9 = 2;
            d5 d5Var2 = new d5(mu4Var, on2Var, nh2Var, qn2Var, qa4Var);
            xq2Var2.l0(d5Var2);
            P = d5Var2;
            xq2 xq2Var32 = xq2Var2;
            hi2.c(hu2Var2, P132, null, null, guVar22, guVar3, null, false, null, (qn2) P, xq2Var32, 1769472, 924);
            xq2Var = xq2Var32;
            qa4 qa4Var32 = qa4Var;
            qn2Var2 = qn2Var;
            is7.a(hf.c0(new rq2(null, yh2.O(xq2Var, R.string.pause_hint_navigate)), new rq2("A", yh2.O(xq2Var, R.string.pause_hint_accept)), new rq2("B", yh2.O(xq2Var, R.string.pause_hint_resume))), null, false, xq2Var, 0, 6);
            xq2Var.p(true);
            nu4Var = (nu4) qa4Var32.getValue();
            if (nu4Var == null) {
            }
            is7.b(nh2Var, xq2Var, 6);
            xq2Var.p(true);
        } else {
            qn2Var2 = qn2Var;
            xq2Var.V();
        }
        cf5 t3 = xq2Var.t();
        if (t3 != null) {
            t3.d = new p4((Object) mu4Var, (Object) pq5Var, qn2Var2, on2Var, i, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final String str, final e33 e33Var, final boolean z, final boolean z2, final on2 on2Var, nh2 nh2Var, px0 px0Var, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        final nh2 nh2Var2;
        int i6;
        boolean z3;
        cf5 t;
        nh2 nh2Var3;
        long j;
        int i7;
        long c;
        long c2;
        int i8;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-992142091);
        if (xq2Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i3 | i;
        if (xq2Var.f(e33Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i10 = i9 | i4;
        if ((i & 3072) == 0) {
            if (xq2Var.g(z2)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i10 |= i8;
        }
        if (xq2Var.h(on2Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i11 = i10 | i5;
        int i12 = i2 & 32;
        if (i12 != 0) {
            i11 |= 196608;
        } else if ((196608 & i) == 0) {
            nh2Var2 = nh2Var;
            if (xq2Var.f(nh2Var2)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i11 |= i6;
            if ((74899 & i11) == 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!xq2Var.S(i11 & 1, z3)) {
                if (i12 != 0) {
                    nh2Var3 = null;
                } else {
                    nh2Var3 = nh2Var2;
                }
                es7 F = bl2.F(xq2Var);
                Object P = xq2Var.P();
                if (P == ox0.a) {
                    P = i61.f(xq2Var);
                }
                r94 r94Var = (r94) P;
                qa4 a2 = bw7.a(r94Var, xq2Var, 6);
                y16 b2 = z16.b(10.0f);
                if (z2) {
                    j = F.j;
                } else {
                    j = kt0.d;
                }
                long j2 = j;
                d40 d40Var = d90.i0;
                x64 x64Var = x64.a;
                a74 g = u24.g(dj6.e(dj6.c(x64Var, 1.0f), 42.0f), b2);
                if (((Boolean) a2.getValue()).booleanValue()) {
                    i7 = i11;
                    c = kt0.c(0.16f, kt0.d);
                } else {
                    i7 = i11;
                    if (z) {
                        c = kt0.c(0.1f, kt0.d);
                    } else {
                        c = kt0.c(0.045f, kt0.d);
                    }
                }
                jy2 jy2Var = u24.m;
                a74 L = vy7.L(g, c, jy2Var);
                if (((Boolean) a2.getValue()).booleanValue()) {
                    L = ak7.I(L, 2.0f, F.j, b2);
                } else if (z) {
                    L = ak7.I(L, 1.0f, kt0.c(0.6f, F.j), b2);
                }
                if (nh2Var3 != null) {
                    L = ak7.S(L, nh2Var3);
                }
                a74 Q = ge7.Q(mb3.t(L, r94Var, null, false, null, on2Var, 28), 14.0f, RecyclerView.B1, 2);
                l26 a3 = k26.a(ju.a, d40Var, xq2Var, 48);
                int hashCode = Long.hashCode(xq2Var.T);
                xv4 l = xq2Var.l();
                a74 E = l.E(xq2Var, Q);
                jx0.i.getClass();
                iy0 iy0Var = ix0.b;
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, ix0.f, a3);
                yh2.K(xq2Var, ix0.e, l);
                yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                yh2.F(xq2Var, ix0.h);
                yh2.K(xq2Var, ix0.d, E);
                if (z) {
                    xq2Var.b0(1466545623);
                    h70.a(vy7.L(u24.g(dj6.e(dj6.l(x64Var, 3.0f), 20.0f), z16.b(2.0f)), F.j, jy2Var), xq2Var, 0);
                    gi2.h(xq2Var, dj6.l(x64Var, 10.0f));
                    xq2Var.p(false);
                } else {
                    xq2Var.b0(1466808937);
                    xq2Var.p(false);
                }
                if (z2) {
                    c2 = F.j;
                } else {
                    c2 = kt0.c(0.85f, kt0.d);
                }
                i13.a(e33Var, null, dj6.i(x64Var, 20.0f), c2, xq2Var, ((i7 >> 3) & 14) | 432, 0);
                gi2.h(xq2Var, dj6.l(x64Var, 13.0f));
                x37.b(str, null, j2, hi2.D(13.5d), oj2.d0, null, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var, (i7 & 14) | 199680, 3120, 120786);
                xq2Var = xq2Var;
                xq2Var.p(true);
                nh2Var2 = nh2Var3;
            } else {
                xq2Var.V();
            }
            t = xq2Var.t();
            if (t == null) {
                t.d = new eo2() { // from class: pu4
                    @Override // defpackage.eo2
                    public final Object o(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ru4.d(str, e33Var, z, z2, on2Var, nh2Var2, (px0) obj, ii2.a0(i | 1), i2);
                        return jg7.a;
                    }
                };
                return;
            }
            return;
        }
        nh2Var2 = nh2Var;
        if ((74899 & i11) == 74898) {
        }
        if (!xq2Var.S(i11 & 1, z3)) {
        }
        t = xq2Var.t();
        if (t == null) {
        }
    }
}
