package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n01  reason: default package */
/* loaded from: classes.dex */
public abstract class n01 {
    public static final long a = hv.c(3758622474L);
    public static final /* synthetic */ int b = 0;

    public static final void a(String str, List list, int i, qn2 qn2Var, on2 on2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        qn2 qn2Var2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i8;
        boolean z6;
        String str2;
        long j;
        float f;
        Iterator it;
        es7 es7Var;
        jy2 jy2Var;
        int i9;
        nh2 nh2Var;
        boolean z7;
        oj2 oj2Var;
        jy2 jy2Var2 = u24.m;
        d40 d40Var = d90.i0;
        qn2Var.getClass();
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1821035555);
        if (xq2Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i2 | i3;
        if (xq2Var.h(list)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        if (xq2Var.d(i)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i12 = i11 | i5;
        if (xq2Var.h(qn2Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i13 = i12 | i6;
        if (xq2Var.h(on2Var)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i14 = i13 | i7;
        if ((i14 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i14 & 1, z)) {
            es7 F = bl2.F(xq2Var);
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = new nh2();
                xq2Var.l0(P);
            }
            nh2 nh2Var2 = (nh2) P;
            int i15 = i14 & 57344;
            if (i15 == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P2 = xq2Var.P();
            if (z2 || P2 == vs0Var) {
                P2 = new x7(3, on2Var);
                xq2Var.l0(P2);
            }
            ge7.b(false, (on2) P2, xq2Var, 0, 1);
            lc2 lc2Var = dj6.c;
            a74 L = vy7.L(lc2Var, a, jy2Var2);
            Object P3 = xq2Var.P();
            if (P3 == vs0Var) {
                P3 = new vn0(8);
                xq2Var.l0(P3);
            }
            a74 y = ge7.y(L, (qn2) P3);
            Object P4 = xq2Var.P();
            if (P4 == vs0Var) {
                P4 = i61.f(xq2Var);
            }
            r94 r94Var = (r94) P4;
            if (i15 == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P5 = xq2Var.P();
            if (z3 || P5 == vs0Var) {
                P5 = new x7(4, on2Var);
                xq2Var.l0(P5);
            }
            a74 t = mb3.t(y, r94Var, null, false, null, (on2) P5, 28);
            if (i15 == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P6 = xq2Var.P();
            if (!z4 && P6 != vs0Var) {
                z5 = false;
            } else {
                z5 = false;
                P6 = new m01(0, on2Var);
                xq2Var.l0(P6);
            }
            a74 B = u24.B(t, (qn2) P6);
            e34 d = h70.d(d90.L, z5);
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
            a74 j0 = nc1.j0(lc2Var, nc1.o);
            Object P7 = xq2Var.P();
            if (P7 == vs0Var) {
                i8 = i14;
                P7 = new vn0(9);
                xq2Var.l0(P7);
            } else {
                i8 = i14;
            }
            a74 y2 = ge7.y(j0, (qn2) P7);
            Object P8 = xq2Var.P();
            if (P8 == vs0Var) {
                P8 = i61.f(xq2Var);
            }
            r94 r94Var2 = (r94) P8;
            Object P9 = xq2Var.P();
            if (P9 == vs0Var) {
                P9 = new c5(20);
                xq2Var.l0(P9);
            }
            a74 t2 = mb3.t(y2, r94Var2, null, false, null, (on2) P9, 28);
            c40 c40Var = d90.k0;
            yt0 a2 = wt0.a(ju.c, c40Var, xq2Var, 0);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, t2);
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
            x64 x64Var = x64.a;
            a74 R = ge7.R(dj6.c(x64Var, 1.0f), 12.0f, 8.0f, 22.0f, 8.0f);
            du duVar = ju.a;
            l26 a3 = k26.a(duVar, d40Var, xq2Var, 48);
            int hashCode3 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E3 = l.E(xq2Var, R);
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
            a74 g = u24.g(dj6.i(x64Var, 38.0f), z16.a);
            Object P10 = xq2Var.P();
            if (P10 == vs0Var) {
                P10 = new vn0(10);
                xq2Var.l0(P10);
            }
            a74 u = mb3.u(ge7.y(g, (qn2) P10), false, null, on2Var, 15);
            e34 d2 = h70.d(d90.Z, false);
            int hashCode4 = Long.hashCode(xq2Var.T);
            xv4 l4 = xq2Var.l();
            a74 E4 = l.E(xq2Var, u);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, d2);
            yh2.K(xq2Var, pnVar2, l4);
            i61.w(hashCode4, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E4);
            e33 q = jw2.q();
            String O = yh2.O(xq2Var, R.string.pause_hint_back);
            long j2 = kt0.d;
            es7 es7Var2 = F;
            nh2 nh2Var3 = nh2Var2;
            int i16 = i8;
            du duVar2 = duVar;
            boolean z8 = true;
            i13.a(q, O, dj6.i(x64Var, 20.0f), j2, xq2Var, 3456, 0);
            xq2Var.p(true);
            gi2.h(xq2Var, dj6.l(x64Var, 10.0f));
            d40 d40Var2 = d40Var;
            int i17 = i16;
            float f2 = 10.0f;
            x37.b(str, null, j2, hi2.E(16), oj2.d0, qs7.a, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var, (i16 & 14) | 1772928, 3120, 120722);
            xq2 xq2Var2 = xq2Var;
            xq2Var2.p(true);
            int i18 = 6;
            h70.a(vy7.L(dj6.e(dj6.c(x64Var, 1.0f), 1.0f), kt0.c(0.09f, j2), jy2Var2), xq2Var2, 6);
            gu guVar = new gu(5.0f, true, new i(1));
            a74 P11 = ge7.P(nb3.W(dj6.m(640.0f, 1, zt0.a(x64Var)).d(new cy2(d90.l0)), nb3.U(xq2Var2), true), 22.0f, 12.0f);
            yt0 a4 = wt0.a(guVar, c40Var, xq2Var2, 6);
            int hashCode5 = Long.hashCode(xq2Var2.T);
            xv4 l5 = xq2Var2.l();
            a74 E5 = l.E(xq2Var2, P11);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, a4);
            yh2.K(xq2Var2, pnVar2, l5);
            i61.w(hashCode5, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E5);
            xq2Var2.b0(321035194);
            Iterator it2 = list.iterator();
            int i19 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i20 = i19 + 1;
                if (i19 >= 0) {
                    String str3 = (String) next;
                    Object P12 = xq2Var2.P();
                    if (P12 == vs0Var) {
                        P12 = i61.f(xq2Var2);
                    }
                    r94 r94Var3 = (r94) P12;
                    qa4 a5 = bw7.a(r94Var3, xq2Var2, i18);
                    if (i19 == i) {
                        z6 = z8;
                    } else {
                        z6 = false;
                    }
                    y16 b2 = z16.b(f2);
                    a74 g2 = u24.g(dj6.f(dj6.c(x64Var, 1.0f), 42.0f, RecyclerView.B1, 2), b2);
                    if (((Boolean) a5.getValue()).booleanValue()) {
                        str2 = str3;
                        j = kt0.d;
                        f = 0.16f;
                    } else {
                        str2 = str3;
                        int i21 = kt0.i;
                        j = kt0.d;
                        f = 0.045f;
                    }
                    a74 L2 = vy7.L(g2, kt0.c(f, j), jy2Var2);
                    if (((Boolean) a5.getValue()).booleanValue()) {
                        it = it2;
                        es7Var = es7Var2;
                        jy2Var = jy2Var2;
                        L2 = ak7.I(L2, 2.0f, es7Var.j, b2);
                    } else {
                        it = it2;
                        es7Var = es7Var2;
                        jy2Var = jy2Var2;
                    }
                    if (i < 0) {
                        i9 = 0;
                    } else {
                        i9 = i;
                    }
                    if (i19 == i9) {
                        nh2Var = nh2Var3;
                        L2 = ak7.S(L2, nh2Var);
                    } else {
                        nh2Var = nh2Var3;
                    }
                    a74 a74Var = L2;
                    int i22 = i17;
                    if ((i22 & 7168) == 2048) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean d3 = z7 | xq2Var2.d(i19);
                    Object P13 = xq2Var2.P();
                    if (d3 || P13 == vs0Var) {
                        P13 = new k01(qn2Var, i19, 0);
                        xq2Var2.l0(P13);
                    }
                    a74 P14 = ge7.P(mb3.t(a74Var, r94Var3, null, false, null, (on2) P13, 28), 14.0f, f2);
                    du duVar3 = duVar2;
                    d40 d40Var3 = d40Var2;
                    l26 a6 = k26.a(duVar3, d40Var3, xq2Var2, 48);
                    es7 es7Var3 = es7Var;
                    int hashCode6 = Long.hashCode(xq2Var2.T);
                    xv4 l6 = xq2Var2.l();
                    a74 E6 = l.E(xq2Var2, P14);
                    jx0.i.getClass();
                    iy0 iy0Var2 = ix0.b;
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var2);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, ix0.f, a6);
                    yh2.K(xq2Var2, ix0.e, l6);
                    yh2.K(xq2Var2, ix0.g, Integer.valueOf(hashCode6));
                    yh2.F(xq2Var2, ix0.h);
                    yh2.K(xq2Var2, ix0.d, E6);
                    int i23 = kt0.i;
                    long j3 = kt0.d;
                    long D = hi2.D(13.5d);
                    long E7 = hi2.E(17);
                    if (z6) {
                        oj2Var = oj2.d0;
                    } else {
                        oj2Var = oj2.Y;
                    }
                    d40Var2 = d40Var3;
                    xq2 xq2Var3 = xq2Var2;
                    duVar2 = duVar3;
                    i17 = i22;
                    f2 = 10.0f;
                    x37.b(str2, new vn3(1.0f, true), j3, D, oj2Var, null, 0L, null, E7, 2, false, 2, 0, null, null, xq2Var3, 3456, 3126, 119760);
                    xq2Var2 = xq2Var3;
                    if (z6) {
                        xq2Var2.b0(347191917);
                        i13.a(jw2.r(), null, dj6.i(x64Var, 20.0f), es7Var3.l, xq2Var2, 432, 0);
                        xq2Var2.p(false);
                    } else {
                        xq2Var2.b0(347484867);
                        xq2Var2.p(false);
                    }
                    xq2Var2.p(true);
                    nh2Var3 = nh2Var;
                    i18 = 6;
                    z8 = true;
                    i19 = i20;
                    jy2Var2 = jy2Var;
                    it2 = it;
                    es7Var2 = es7Var3;
                } else {
                    hf.q0();
                    throw null;
                }
            }
            boolean z9 = z8;
            qn2Var2 = qn2Var;
            xq2Var2.p(false);
            xq2Var2.p(z9);
            xq2 xq2Var4 = xq2Var2;
            is7.a(hf.c0(new rq2(null, yh2.O(xq2Var2, R.string.pause_hint_navigate)), new rq2("A", yh2.O(xq2Var2, R.string.pause_hint_accept)), new rq2("B", yh2.O(xq2Var2, R.string.pause_hint_back))), null, false, xq2Var4, 0, 6);
            xq2Var = xq2Var4;
            xq2Var.p(true);
            is7.b(nh2Var3, xq2Var, i18);
            xq2Var.p(true);
        } else {
            qn2Var2 = qn2Var;
            xq2Var.V();
        }
        cf5 t3 = xq2Var.t();
        if (t3 != null) {
            t3.d = new l01(str, list, i, qn2Var2, on2Var, i2);
        }
    }
}
