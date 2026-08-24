package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d46  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class d46 implements eo2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ c46 B;
    public final /* synthetic */ es7 L;
    public final /* synthetic */ qa4 R;
    public final /* synthetic */ List X;
    public final /* synthetic */ qn2 Y;
    public final /* synthetic */ on2 Z;

    public /* synthetic */ d46(c46 c46Var, es7 es7Var, qa4 qa4Var, List list, qn2 qn2Var, on2 on2Var) {
        this.B = c46Var;
        this.L = es7Var;
        this.R = qa4Var;
        this.X = list;
        this.Y = qn2Var;
        this.Z = on2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        Object valueOf;
        long j;
        String str;
        long j2;
        long j3;
        long j4;
        boolean z3;
        es7 es7Var;
        long j5;
        long j6;
        float f;
        float f2;
        float f3;
        float f4;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        x64 x64Var = x64.a;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    y16 b = z16.b(16.0f);
                    es7 es7Var2 = this.L;
                    ej2.c(ge7.O(dj6.c(x64Var, 1.0f), 16.0f), b, es7Var2.c, 0L, RecyclerView.B1, n16.I(-1494515723, new d46(this.B, es7Var2, this.R, this.X, this.Y, this.Z), xq2Var), xq2Var, 1572870, 56);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                jy2 jy2Var = u24.m;
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                e40 e40Var = d90.L;
                d40 d40Var = d90.h0;
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z2)) {
                    a74 O = ge7.O(x64Var, 20.0f);
                    yt0 a = wt0.a(ju.c, d90.l0, xq2Var2, 48);
                    int hashCode = Long.hashCode(xq2Var2.T);
                    xv4 l = xq2Var2.l();
                    a74 E = l.E(xq2Var2, O);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var);
                    } else {
                        xq2Var2.o0();
                    }
                    pn pnVar = ix0.f;
                    yh2.K(xq2Var2, pnVar, a);
                    pn pnVar2 = ix0.e;
                    yh2.K(xq2Var2, pnVar2, l);
                    Integer valueOf2 = Integer.valueOf(hashCode);
                    pn pnVar3 = ix0.g;
                    yh2.K(xq2Var2, pnVar3, valueOf2);
                    ne neVar = ix0.h;
                    yh2.F(xq2Var2, neVar);
                    pn pnVar4 = ix0.d;
                    yh2.K(xq2Var2, pnVar4, E);
                    int i2 = this.B.a;
                    if (i2 == 0) {
                        valueOf = "Быстрого сохранения";
                    } else {
                        valueOf = Integer.valueOf(i2);
                    }
                    String str2 = "Переименовать слот " + valueOf;
                    pi2 pi2Var = qs7.a;
                    long E2 = hi2.E(16);
                    oj2 oj2Var = oj2.e0;
                    es7 es7Var3 = this.L;
                    long j7 = es7Var3.g;
                    long j8 = es7Var3.d;
                    x37.b(str2, null, j7, E2, oj2Var, pi2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1772544, 0, 130962);
                    gi2.h(xq2Var2, dj6.e(x64Var, 14.0f));
                    qa4 qa4Var = this.R;
                    String str3 = (String) qa4Var.getValue();
                    jy2 jy2Var2 = jy2Var;
                    long j9 = es7Var3.g;
                    long j10 = es7Var3.j;
                    long j11 = es7Var3.f;
                    if (true & true) {
                        j = j11;
                        str = str3;
                        j2 = kt0.c(((Number) xq2Var2.j(g31.a)).floatValue(), ((kt0) xq2Var2.j(j31.a)).a);
                    } else {
                        j = j11;
                        str = str3;
                        j2 = j9;
                    }
                    py0 py0Var = j31.a;
                    e40 e40Var2 = e40Var;
                    long j12 = ((kt0) xq2Var2.j(py0Var)).a;
                    nq6 nq6Var = vt0.a;
                    if (((ut0) xq2Var2.j(nq6Var)).k()) {
                        hv.N(j12);
                    } else {
                        hv.N(j12);
                    }
                    long c = kt0.c(0.38f, j2);
                    long j13 = kt0.g;
                    if (true & true) {
                        j3 = ((ut0) xq2Var2.j(nq6Var)).g();
                    } else {
                        j3 = j10;
                    }
                    long b2 = ((ut0) xq2Var2.j(nq6Var)).b();
                    if (true & true) {
                        z3 = true;
                        es7Var = es7Var3;
                        long g = ((ut0) xq2Var2.j(nq6Var)).g();
                        j4 = j2;
                        long j14 = ((kt0) xq2Var2.j(py0Var)).a;
                        if (!((ut0) xq2Var2.j(nq6Var)).k() ? hv.N(j14) < 0.5d : hv.N(j14) > 0.5d) {
                            f4 = 1.0f;
                        } else {
                            f4 = 0.87f;
                        }
                        j5 = kt0.c(f4, g);
                    } else {
                        j4 = j2;
                        z3 = true;
                        es7Var = es7Var3;
                        j5 = j10;
                    }
                    if (z3 & true) {
                        long f5 = ((ut0) xq2Var2.j(nq6Var)).f();
                        long j15 = ((kt0) xq2Var2.j(py0Var)).a;
                        if (((ut0) xq2Var2.j(nq6Var)).k()) {
                            hv.N(j15);
                        } else {
                            hv.N(j15);
                        }
                        j6 = kt0.c(0.38f, f5);
                    } else {
                        j6 = j;
                    }
                    long j16 = ((kt0) xq2Var2.j(py0Var)).a;
                    if (((ut0) xq2Var2.j(nq6Var)).k()) {
                        hv.N(j16);
                    } else {
                        hv.N(j16);
                    }
                    long c2 = kt0.c(0.38f, j6);
                    long b3 = ((ut0) xq2Var2.j(nq6Var)).b();
                    long c3 = kt0.c(0.54f, ((ut0) xq2Var2.j(nq6Var)).f());
                    long j17 = j6;
                    long j18 = ((kt0) xq2Var2.j(py0Var)).a;
                    if (((ut0) xq2Var2.j(nq6Var)).k()) {
                        hv.N(j18);
                    } else {
                        hv.N(j18);
                    }
                    long c4 = kt0.c(0.38f, c3);
                    long c5 = kt0.c(0.54f, ((ut0) xq2Var2.j(nq6Var)).f());
                    long j19 = ((kt0) xq2Var2.j(py0Var)).a;
                    if (((ut0) xq2Var2.j(nq6Var)).k()) {
                        hv.N(j19);
                    } else {
                        hv.N(j19);
                    }
                    long c6 = kt0.c(0.38f, c5);
                    long b4 = ((ut0) xq2Var2.j(nq6Var)).b();
                    long g2 = ((ut0) xq2Var2.j(nq6Var)).g();
                    long j20 = ((kt0) xq2Var2.j(py0Var)).a;
                    if (!((ut0) xq2Var2.j(nq6Var)).k() ? hv.N(j20) < 0.5d : hv.N(j20) > 0.5d) {
                        f = 1.0f;
                    } else {
                        f = 0.87f;
                    }
                    long c7 = kt0.c(f, g2);
                    long f6 = ((ut0) xq2Var2.j(nq6Var)).f();
                    long j21 = ((kt0) xq2Var2.j(py0Var)).a;
                    if (!((ut0) xq2Var2.j(nq6Var)).k() ? hv.N(j21) < 0.5d : hv.N(j21) > 0.5d) {
                        f2 = 0.74f;
                    } else {
                        f2 = 0.6f;
                    }
                    long c8 = kt0.c(f2, f6);
                    long j22 = ((kt0) xq2Var2.j(py0Var)).a;
                    if (((ut0) xq2Var2.j(nq6Var)).k()) {
                        hv.N(j22);
                    } else {
                        hv.N(j22);
                    }
                    long c9 = kt0.c(0.38f, c8);
                    long b5 = ((ut0) xq2Var2.j(nq6Var)).b();
                    long f7 = ((ut0) xq2Var2.j(nq6Var)).f();
                    long j23 = ((kt0) xq2Var2.j(py0Var)).a;
                    if (!((ut0) xq2Var2.j(nq6Var)).k() ? hv.N(j23) < 0.5d : hv.N(j23) > 0.5d) {
                        f3 = 0.74f;
                    } else {
                        f3 = 0.6f;
                    }
                    long c10 = kt0.c(f3, f7);
                    long j24 = ((kt0) xq2Var2.j(py0Var)).a;
                    if (((ut0) xq2Var2.j(nq6Var)).k()) {
                        hv.N(j24);
                    } else {
                        hv.N(j24);
                    }
                    wf1 wf1Var = new wf1(j4, c, j3, b2, j5, j17, b3, c2, c3, c4, c3, c5, c6, b4, j13, c7, c8, c9, b5, c10, kt0.c(0.38f, c10));
                    a74 c11 = dj6.c(x64Var, 1.0f);
                    Object P = xq2Var2.P();
                    vs0 vs0Var = ox0.a;
                    if (P == vs0Var) {
                        P = new j4(qa4Var, 23);
                        xq2Var2.l0(P);
                    }
                    es7 es7Var4 = es7Var;
                    zo4.b(str, (qn2) P, c11, false, null, n16.I(-551251099, new d4(es7Var4, 11), xq2Var2), n16.I(1801607142, new d4(es7Var4, 12), xq2Var2), false, null, null, null, true, 0, 0, null, wf1Var, xq2Var2, 14156208, 24576, 507704);
                    gi2.h(xq2Var2, dj6.e(x64Var, 12.0f));
                    x37.b("Быстрые шаблоны:", new cy2(d90.k0), es7Var4.i, hi2.E(10), null, qs7.c, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1575942, 0, 130992);
                    xq2 xq2Var3 = xq2Var2;
                    gi2.h(xq2Var3, dj6.e(x64Var, 6.0f));
                    a74 c12 = dj6.c(x64Var, 1.0f);
                    l26 a2 = k26.a(new gu(6.0f, true, new i(1)), d40Var, xq2Var3, 6);
                    int hashCode2 = Long.hashCode(xq2Var3.T);
                    xv4 l2 = xq2Var3.l();
                    a74 E3 = l.E(xq2Var3, c12);
                    xq2Var3.f0();
                    if (xq2Var3.S) {
                        xq2Var3.k(iy0Var);
                    } else {
                        xq2Var3.o0();
                    }
                    yh2.K(xq2Var3, pnVar, a2);
                    yh2.K(xq2Var3, pnVar2, l2);
                    i61.w(hashCode2, xq2Var3, pnVar3, xq2Var3, neVar);
                    yh2.K(xq2Var3, pnVar4, E3);
                    xq2Var3.b0(646961143);
                    List list = this.X;
                    Iterator it = gt0.e1(list, 3).iterator();
                    while (it.hasNext()) {
                        String str4 = (String) it.next();
                        jy2 jy2Var3 = jy2Var2;
                        long j25 = j8;
                        a74 L = vy7.L(u24.g(x64Var, z16.b(6.0f)), j25, jy2Var3);
                        boolean f8 = xq2Var3.f(str4);
                        Object P2 = xq2Var3.P();
                        if (f8 || P2 == vs0Var) {
                            P2 = new lp0(str4, qa4Var, 1);
                            xq2Var3.l0(P2);
                        }
                        Iterator it2 = it;
                        a74 P3 = ge7.P(mb3.u(L, false, null, (on2) P2, 15), 8.0f, 4.0f);
                        e40 e40Var3 = e40Var2;
                        e34 d = h70.d(e40Var3, false);
                        int hashCode3 = Long.hashCode(xq2Var3.T);
                        xv4 l3 = xq2Var3.l();
                        a74 E4 = l.E(xq2Var3, P3);
                        jx0.i.getClass();
                        iy0 iy0Var2 = ix0.b;
                        xq2Var3.f0();
                        if (xq2Var3.S) {
                            xq2Var3.k(iy0Var2);
                        } else {
                            xq2Var3.o0();
                        }
                        yh2.K(xq2Var3, ix0.f, d);
                        yh2.K(xq2Var3, ix0.e, l3);
                        yh2.K(xq2Var3, ix0.g, Integer.valueOf(hashCode3));
                        yh2.F(xq2Var3, ix0.h);
                        yh2.K(xq2Var3, ix0.d, E4);
                        xq2 xq2Var4 = xq2Var3;
                        x37.b(str4, null, es7Var4.h, hi2.D(9.5d), null, qs7.a, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var4, 1575936, 0, 130994);
                        xq2Var3 = xq2Var4;
                        xq2Var3.p(true);
                        jy2Var2 = jy2Var3;
                        e40Var2 = e40Var3;
                        j8 = j25;
                        it = it2;
                    }
                    jy2 jy2Var4 = jy2Var2;
                    long j26 = j8;
                    e40 e40Var4 = e40Var2;
                    xq2Var3.p(false);
                    xq2Var3.p(true);
                    gi2.h(xq2Var3, dj6.e(x64Var, 6.0f));
                    a74 c13 = dj6.c(x64Var, 1.0f);
                    l26 a3 = k26.a(new gu(6.0f, true, new i(1)), d40Var, xq2Var3, 6);
                    int hashCode4 = Long.hashCode(xq2Var3.T);
                    xv4 l4 = xq2Var3.l();
                    a74 E5 = l.E(xq2Var3, c13);
                    jx0.i.getClass();
                    iy0 iy0Var3 = ix0.b;
                    xq2Var3.f0();
                    if (xq2Var3.S) {
                        xq2Var3.k(iy0Var3);
                    } else {
                        xq2Var3.o0();
                    }
                    yh2.K(xq2Var3, ix0.f, a3);
                    yh2.K(xq2Var3, ix0.e, l4);
                    yh2.K(xq2Var3, ix0.g, Integer.valueOf(hashCode4));
                    yh2.F(xq2Var3, ix0.h);
                    yh2.K(xq2Var3, ix0.d, E5);
                    xq2Var3.b0(1232985504);
                    for (String str5 : gt0.D0(list, 3)) {
                        a74 L2 = vy7.L(u24.g(x64Var, z16.b(6.0f)), j26, jy2Var4);
                        boolean f9 = xq2Var3.f(str5);
                        Object P4 = xq2Var3.P();
                        if (f9 || P4 == vs0Var) {
                            P4 = new lp0(str5, qa4Var, 2);
                            xq2Var3.l0(P4);
                        }
                        a74 P5 = ge7.P(mb3.u(L2, false, null, (on2) P4, 15), 8.0f, 4.0f);
                        e34 d2 = h70.d(e40Var4, false);
                        e40 e40Var5 = e40Var4;
                        long j27 = j26;
                        int hashCode5 = Long.hashCode(xq2Var3.T);
                        xv4 l5 = xq2Var3.l();
                        a74 E6 = l.E(xq2Var3, P5);
                        jx0.i.getClass();
                        iy0 iy0Var4 = ix0.b;
                        xq2Var3.f0();
                        if (xq2Var3.S) {
                            xq2Var3.k(iy0Var4);
                        } else {
                            xq2Var3.o0();
                        }
                        yh2.K(xq2Var3, ix0.f, d2);
                        yh2.K(xq2Var3, ix0.e, l5);
                        yh2.K(xq2Var3, ix0.g, Integer.valueOf(hashCode5));
                        yh2.F(xq2Var3, ix0.h);
                        yh2.K(xq2Var3, ix0.d, E6);
                        xq2 xq2Var5 = xq2Var3;
                        x37.b(str5, null, es7Var4.h, hi2.D(9.5d), null, qs7.a, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var5, 1575936, 0, 130994);
                        xq2Var3 = xq2Var5;
                        xq2Var3.p(true);
                        j26 = j27;
                        e40Var4 = e40Var5;
                    }
                    xq2Var3.p(false);
                    xq2Var3.p(true);
                    gi2.h(xq2Var3, dj6.e(x64Var, 20.0f));
                    a74 c14 = dj6.c(x64Var, 1.0f);
                    l26 a4 = k26.a(ju.b, d40Var, xq2Var3, 6);
                    int hashCode6 = Long.hashCode(xq2Var3.T);
                    xv4 l6 = xq2Var3.l();
                    a74 E7 = l.E(xq2Var3, c14);
                    jx0.i.getClass();
                    iy0 iy0Var5 = ix0.b;
                    xq2Var3.f0();
                    if (xq2Var3.S) {
                        xq2Var3.k(iy0Var5);
                    } else {
                        xq2Var3.o0();
                    }
                    yh2.K(xq2Var3, ix0.f, a4);
                    yh2.K(xq2Var3, ix0.e, l6);
                    yh2.K(xq2Var3, ix0.g, Integer.valueOf(hashCode6));
                    yh2.F(xq2Var3, ix0.h);
                    yh2.K(xq2Var3, ix0.d, E7);
                    qn2 qn2Var = this.Y;
                    boolean f10 = xq2Var3.f(qn2Var);
                    Object P6 = xq2Var3.P();
                    if (f10 || P6 == vs0Var) {
                        P6 = new j91(15, qn2Var);
                        xq2Var3.l0(P6);
                    }
                    xq2 xq2Var6 = xq2Var3;
                    mb3.o((on2) P6, null, false, null, n16.I(-139890042, new h46(es7Var4, 1), xq2Var3), xq2Var6, 805306368, 510);
                    gi2.h(xq2Var6, dj6.l(x64Var, 8.0f));
                    mb3.o(this.Z, null, false, null, n16.I(1961857711, new h46(es7Var4, 2), xq2Var6), xq2Var6, 805306368, 510);
                    gi2.h(xq2Var6, dj6.l(x64Var, 8.0f));
                    pq4 pq4Var = k90.a;
                    bd1 a5 = k90.a(es7Var4.j, 0L, xq2Var6, 0, 14);
                    y16 b6 = z16.b(8.0f);
                    boolean f11 = xq2Var6.f(qn2Var);
                    Object P7 = xq2Var6.P();
                    if (f11 || P7 == vs0Var) {
                        P7 = new tq5(qn2Var, qa4Var, 2);
                        xq2Var6.l0(P7);
                    }
                    mb3.a((on2) P7, null, false, null, b6, null, a5, null, l.e, xq2Var6, 805306368, 350);
                    xq2Var6.p(true);
                    xq2Var6.p(true);
                    return jg7Var;
                }
                xq2Var2.V();
                return jg7Var;
        }
    }

    public /* synthetic */ d46(es7 es7Var, c46 c46Var, qa4 qa4Var, List list, qn2 qn2Var, on2 on2Var) {
        this.L = es7Var;
        this.B = c46Var;
        this.R = qa4Var;
        this.X = list;
        this.Y = qn2Var;
        this.Z = on2Var;
    }
}
