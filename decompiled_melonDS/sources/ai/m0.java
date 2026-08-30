package ai;

import b4.d2;
import f1.w1;
import f2.g1;
import g2.e7;
import g2.i2;
import g2.p2;
import g2.v2;
import h1.n2;
import j0.o1;
import java.util.List;
import java.util.WeakHashMap;
import l1.c2;
import l1.d1;
import l1.r1;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.f1;
import q4.x;
import u1.l1;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ m0(g3.z zVar, mg.l lVar, mc.a aVar) {
        this.A = 9;
        this.L = zVar;
        this.B = lVar;
        this.R = aVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int i2 = this.A;
        b3.m mVar = b3.m.f1770a;
        n2.e eVar = n2.l.f9953a;
        yb.y yVar = yb.y.f14813a;
        Object obj3 = this.L;
        Object obj4 = this.R;
        Object obj5 = this.B;
        switch (i2) {
            case 0:
                ze.a aVar = (ze.a) obj5;
                g3.z zVar = (g3.z) obj3;
                mc.a aVar2 = (mc.a) obj4;
                n2.m mVar2 = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar2;
                if (rVar.O(intValue & 1, z10)) {
                    boolean booleanValue = ((Boolean) rVar.j(d2.f1832a)).booleanValue();
                    b3.m mVar3 = b3.m.f1770a;
                    if (booleanValue) {
                        rVar.X(-1281173833);
                        l1.p.a(f1.n.f(r1.i(mVar3, 42), i3.s.f6682c, i3.z.f6703b), rVar, 6);
                        rVar.p(false);
                    } else {
                        rVar.X(-1281066387);
                        c9.m.b(aVar, r1.i(mVar3, 42), rVar, 432, 3576);
                        rVar.p(false);
                    }
                    float f8 = 16;
                    b3.p x9 = l1.c.x(mVar3, f8, 0.0f, 0.0f, 0.0f, 14);
                    if (1.0f <= 0.0d) {
                        m1.a.a("invalid weight; must be greater than zero");
                    }
                    b3.p f10 = x9.f(new l1.w0(1.0f, true));
                    l1.w a10 = l1.u.a(l1.i.f8573c, b3.c.f1758g0, rVar, 0);
                    int hashCode = Long.hashCode(rVar.T);
                    v2.g l10 = rVar.l();
                    b3.p c4 = b3.a.c(f10, rVar);
                    a4.h.f220a.getClass();
                    a4.f0 f0Var = a4.g.f212b;
                    rVar.b0();
                    if (rVar.S) {
                        rVar.k(f0Var);
                    } else {
                        rVar.k0();
                    }
                    n2.s.C(a10, a4.g.f215e, rVar);
                    n2.s.C(l10, a4.g.f214d, rVar);
                    n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
                    n2.s.y(rVar, a4.g.f217g);
                    n2.s.C(c4, a4.g.f213c, rVar);
                    String str = aVar.f15058f.f711e;
                    if (str == null) {
                        str = aVar.f15053a;
                    }
                    e7.b(str, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, null, rVar, 0, 3120, 120830);
                    n.m(aVar.f15062j, rVar, 0);
                    rVar.p(true);
                    n.l(g3.d.k(l1.c.v(mVar3, f8, 0.0f, 2), zVar), aVar2, rVar, 0);
                } else {
                    rVar.R();
                }
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((Integer) obj2).getClass();
                k7.w.c((a7.i) obj5, (y2.d) obj3, (v2.c) obj4, (n2.m) obj, n2.s.F(385));
                return yVar;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                zc.x.v((zc.u) obj5, null, null, new b7.a0(floatValue, (d1.x0) obj3, (a7.i) obj4, (cc.c) null), 3);
                return yVar;
            case 3:
                n2.w0 w0Var = (n2.w0) obj5;
                d1 d1Var = (d1) obj3;
                mc.q qVar = (mc.q) obj4;
                n2.m mVar4 = (n2.m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar2 = (n2.r) mVar4;
                if (rVar2.O(intValue2 & 1, z11)) {
                    n2.s.a(g2.o0.f5308a.a(Float.valueOf(i3.s.d(((i3.s) w0Var.getValue()).f6689a))), v2.h.c(-869936862, new g2.d0(d1Var, qVar, 0), rVar2), rVar2, 56);
                } else {
                    rVar2.R();
                }
                return yVar;
            case 4:
                b3.p pVar = (b3.p) obj5;
                w1 w1Var = (w1) obj3;
                v2.c cVar = (v2.c) obj4;
                n2.m mVar5 = (n2.m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                n2.r rVar3 = (n2.r) mVar5;
                if (rVar3.O(intValue3 & 1, z12)) {
                    b3.p r5 = f1.n.r(l1.c.B(l1.c.v(pVar, 0.0f, i2.f5174d, 1), l1.t0.Max), w1Var);
                    l1.w a11 = l1.u.a(l1.i.f8573c, b3.c.f1758g0, rVar3, 0);
                    int hashCode2 = Long.hashCode(rVar3.T);
                    v2.g l11 = rVar3.l();
                    b3.p c10 = b3.a.c(r5, rVar3);
                    a4.h.f220a.getClass();
                    a4.f0 f0Var2 = a4.g.f212b;
                    rVar3.b0();
                    if (rVar3.S) {
                        rVar3.k(f0Var2);
                    } else {
                        rVar3.k0();
                    }
                    n2.s.C(a11, a4.g.f215e, rVar3);
                    n2.s.C(l11, a4.g.f214d, rVar3);
                    a4.f fVar = a4.g.f216f;
                    if (rVar3.S || !nc.k.a(rVar3.L(), Integer.valueOf(hashCode2))) {
                        w.d.w(hashCode2, rVar3, hashCode2, fVar);
                    }
                    n2.s.C(c10, a4.g.f213c, rVar3);
                    cVar.i(l1.x.f8644a, rVar3, 6);
                    rVar3.p(true);
                } else {
                    rVar3.R();
                }
                return yVar;
            case l1.c.f8511g /* 5 */:
                n2.w0 w0Var2 = (n2.w0) obj5;
                d1 d1Var2 = (d1) obj3;
                v2.c cVar2 = (v2.c) obj4;
                n2.m mVar6 = (n2.m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                n2.r rVar4 = (n2.r) mVar6;
                if (rVar4.O(intValue4 & 1, z13)) {
                    b3.p m = y3.c0.m("border");
                    long j2 = ((h3.e) w0Var2.getValue()).f6064a;
                    float f11 = v2.f5434a;
                    b3.p f12 = f3.g.f(m, new p2(j2, d1Var2, 0));
                    y3.v0 d4 = l1.p.d(b3.c.A, true);
                    int hashCode3 = Long.hashCode(rVar4.T);
                    v2.g l12 = rVar4.l();
                    b3.p c11 = b3.a.c(f12, rVar4);
                    a4.h.f220a.getClass();
                    a4.f0 f0Var3 = a4.g.f212b;
                    rVar4.b0();
                    if (rVar4.S) {
                        rVar4.k(f0Var3);
                    } else {
                        rVar4.k0();
                    }
                    n2.s.C(d4, a4.g.f215e, rVar4);
                    n2.s.C(l12, a4.g.f214d, rVar4);
                    a4.f fVar2 = a4.g.f216f;
                    if (rVar4.S || !nc.k.a(rVar4.L(), Integer.valueOf(hashCode3))) {
                        w.d.w(hashCode3, rVar4, hashCode3, fVar2);
                    }
                    n2.s.C(c11, a4.g.f213c, rVar4);
                    rVar4.X(235288868);
                    cVar2.j(rVar4, 0);
                    rVar4.p(false);
                    rVar4.p(true);
                } else {
                    rVar4.R();
                }
                return yVar;
            case l1.c.f8509e /* 6 */:
                nc.q qVar2 = (nc.q) obj5;
                h1.p2 p2Var = (h1.p2) obj3;
                float floatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long h2 = p2Var.h(p2Var.d(floatValue2 - qVar2.A));
                h1.p2 p2Var2 = ((n2) obj4).f5985a;
                qVar2.A += p2Var.d(p2Var.g(p2Var2.c(p2Var2.f5999k, h2, 1)));
                return yVar;
            case 7:
                ((Integer) obj2).getClass();
                l1.c.a((b3.p) obj5, (b3.d) obj3, (v2.c) obj4, (n2.m) obj, n2.s.F(3073));
                return yVar;
            case 8:
                ((Integer) obj2).getClass();
                mg.n.b((kg.d) obj5, (mc.a) obj4, (mc.l) obj3, (n2.m) obj, n2.s.F(1));
                return yVar;
            case l1.c.f8508d /* 9 */:
                g3.z zVar2 = (g3.z) obj3;
                final mg.l lVar = (mg.l) obj5;
                mc.a aVar3 = (mc.a) obj4;
                n2.m mVar7 = (n2.m) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                n2.r rVar5 = (n2.r) mVar7;
                if (rVar5.O(intValue5 & 1, z14)) {
                    b3.p k10 = g3.d.k(r1.b(mVar, 1.0f), zVar2);
                    q4.x xVar = (q4.x) lVar.f9654b.getValue();
                    if (((mg.k) lVar.f9657e.getValue()) != null) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    g2.d1 e6 = og.a.e(rVar5);
                    u1.o0 o0Var = new u1.o0(3, 0, 6, 118);
                    boolean f13 = rVar5.f(lVar);
                    Object L = rVar5.L();
                    if (f13 || L == eVar) {
                        L = new mc.l() { // from class: mg.d
                            @Override // mc.l
                            public final Object k(Object obj6) {
                                x xVar2 = (x) obj6;
                                switch (r2) {
                                    case 0:
                                        xVar2.getClass();
                                        l lVar2 = lVar;
                                        lVar2.getClass();
                                        f1 f1Var = lVar2.f9654b;
                                        f1Var.setValue(xVar2);
                                        f1 f1Var2 = lVar2.f9657e;
                                        if (((k) f1Var2.getValue()) != null) {
                                            if (vc.h.j0(((x) f1Var.getValue()).f12276a.B)) {
                                                f1Var2.setValue(k.CANNOT_BE_EMPTY);
                                            } else {
                                                f1Var2.setValue(null);
                                            }
                                        }
                                        return y.f14813a;
                                    case DSiCameraSource.FrontCamera /* 1 */:
                                        xVar2.getClass();
                                        l lVar3 = lVar;
                                        lVar3.getClass();
                                        lVar3.f9655c.setValue(xVar2);
                                        return y.f14813a;
                                    default:
                                        xVar2.getClass();
                                        x e10 = n.e(xVar2);
                                        l lVar4 = lVar;
                                        lVar4.f9656d.setValue(e10);
                                        if (((k) lVar4.f9658f.getValue()) != null) {
                                            lVar4.b();
                                        }
                                        return y.f14813a;
                                }
                            }
                        };
                        rVar5.h0(L);
                    }
                    p7.m.b(xVar, (mc.l) L, k10, false, null, mg.n.f9661c, mg.n.f9662d, z15, null, o0Var, null, true, 0, 0, null, e6, rVar5, 1572864, 199686, 1004472);
                    b3.p b10 = r1.b(mVar, 1.0f);
                    q4.x xVar2 = (q4.x) lVar.f9655c.getValue();
                    g2.d1 e10 = og.a.e(rVar5);
                    u1.o0 o0Var2 = new u1.o0(3, 0, 6, 118);
                    boolean f14 = rVar5.f(lVar);
                    Object L2 = rVar5.L();
                    if (f14 || L2 == eVar) {
                        L2 = new mc.l() { // from class: mg.d
                            @Override // mc.l
                            public final Object k(Object obj6) {
                                x xVar22 = (x) obj6;
                                switch (r2) {
                                    case 0:
                                        xVar22.getClass();
                                        l lVar2 = lVar;
                                        lVar2.getClass();
                                        f1 f1Var = lVar2.f9654b;
                                        f1Var.setValue(xVar22);
                                        f1 f1Var2 = lVar2.f9657e;
                                        if (((k) f1Var2.getValue()) != null) {
                                            if (vc.h.j0(((x) f1Var.getValue()).f12276a.B)) {
                                                f1Var2.setValue(k.CANNOT_BE_EMPTY);
                                            } else {
                                                f1Var2.setValue(null);
                                            }
                                        }
                                        return y.f14813a;
                                    case DSiCameraSource.FrontCamera /* 1 */:
                                        xVar22.getClass();
                                        l lVar3 = lVar;
                                        lVar3.getClass();
                                        lVar3.f9655c.setValue(xVar22);
                                        return y.f14813a;
                                    default:
                                        xVar22.getClass();
                                        x e102 = n.e(xVar22);
                                        l lVar4 = lVar;
                                        lVar4.f9656d.setValue(e102);
                                        if (((k) lVar4.f9658f.getValue()) != null) {
                                            lVar4.b();
                                        }
                                        return y.f14813a;
                                }
                            }
                        };
                        rVar5.h0(L2);
                    }
                    v2.b(xVar2, (mc.l) L2, b10, false, null, mg.n.f9663e, false, null, o0Var2, null, false, 0, 0, null, e10, rVar5, 1573248, 384, 520120);
                    b3.p b11 = r1.b(mVar, 1.0f);
                    q4.x xVar3 = (q4.x) lVar.f9656d.getValue();
                    l4.r0 a12 = l4.r0.a((l4.r0) rVar5.j(e7.f5133a), 0L, 0L, null, p4.p.f11316b, 0L, 0L, null, 16777183);
                    if (((mg.k) lVar.f9658f.getValue()) != null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    g2.d1 e11 = og.a.e(rVar5);
                    u1.o0 o0Var3 = new u1.o0(1, 0, 7, 116);
                    boolean f15 = rVar5.f(aVar3);
                    Object L3 = rVar5.L();
                    if (f15 || L3 == eVar) {
                        L3 = new g1(3, aVar3);
                        rVar5.h0(L3);
                    }
                    u1.n0 n0Var = new u1.n0((mc.l) L3, 62);
                    boolean f16 = rVar5.f(lVar);
                    Object L4 = rVar5.L();
                    if (f16 || L4 == eVar) {
                        L4 = new mc.l() { // from class: mg.d
                            @Override // mc.l
                            public final Object k(Object obj6) {
                                x xVar22 = (x) obj6;
                                switch (r2) {
                                    case 0:
                                        xVar22.getClass();
                                        l lVar2 = lVar;
                                        lVar2.getClass();
                                        f1 f1Var = lVar2.f9654b;
                                        f1Var.setValue(xVar22);
                                        f1 f1Var2 = lVar2.f9657e;
                                        if (((k) f1Var2.getValue()) != null) {
                                            if (vc.h.j0(((x) f1Var.getValue()).f12276a.B)) {
                                                f1Var2.setValue(k.CANNOT_BE_EMPTY);
                                            } else {
                                                f1Var2.setValue(null);
                                            }
                                        }
                                        return y.f14813a;
                                    case DSiCameraSource.FrontCamera /* 1 */:
                                        xVar22.getClass();
                                        l lVar3 = lVar;
                                        lVar3.getClass();
                                        lVar3.f9655c.setValue(xVar22);
                                        return y.f14813a;
                                    default:
                                        xVar22.getClass();
                                        x e102 = n.e(xVar22);
                                        l lVar4 = lVar;
                                        lVar4.f9656d.setValue(e102);
                                        if (((k) lVar4.f9658f.getValue()) != null) {
                                            lVar4.b();
                                        }
                                        return y.f14813a;
                                }
                            }
                        };
                        rVar5.h0(L4);
                    }
                    p7.m.b(xVar3, (mc.l) L4, b11, false, a12, mg.n.f9664f, v2.h.c(1770623028, new mg.e(lVar, 0), rVar5), z16, null, o0Var3, n0Var, false, 0, 4, null, e11, rVar5, 1573248, 12585990, 889752);
                } else {
                    rVar5.R();
                }
                return yVar;
            case l1.c.f8510f /* 10 */:
                ((Integer) obj2).getClass();
                mh.g0.g((cd.h) obj5, (mc.a) obj4, (mc.a) obj3, (n2.m) obj, n2.s.F(1));
                return yVar;
            case 11:
                ((Integer) obj2).getClass();
                ng.b.a((b3.p) obj5, (oe.f) obj3, (mc.a) obj4, (n2.m) obj, n2.s.F(7));
                return yVar;
            case 12:
                ((Integer) obj2).getClass();
                ng.b.c((b3.p) obj5, (oe.c) obj3, (mc.a) obj4, (n2.m) obj, n2.s.F(7));
                return yVar;
            case 13:
                ((Integer) obj2).getClass();
                ng.b.d((b3.p) obj5, (oe.q) obj3, (mc.a) obj4, (n2.m) obj, n2.s.F(7));
                return yVar;
            case 14:
                ((Integer) obj2).getClass();
                og.a.c((b3.p) obj5, (List) obj3, (mc.l) obj4, (n2.m) obj, n2.s.F(3137));
                return yVar;
            case l1.c.f8512h /* 15 */:
                final rg.d dVar = (rg.d) obj5;
                mc.a aVar4 = (mc.a) obj4;
                n2.w0 w0Var3 = (n2.w0) obj3;
                n2.m mVar8 = (n2.m) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                n2.r rVar6 = (n2.r) mVar8;
                if (rVar6.O(intValue6 & 1, z17)) {
                    String I = l0.f.I(rVar6, R.string.cancel);
                    boolean f17 = rVar6.f(dVar);
                    Object L5 = rVar6.L();
                    if (f17 || L5 == eVar) {
                        L5 = new mc.a() { // from class: rg.c
                            @Override // mc.a
                            public final Object b() {
                                switch (r2) {
                                    case 0:
                                        dVar.a();
                                        break;
                                    default:
                                        dVar.b();
                                        break;
                                }
                                return y.f14813a;
                            }
                        };
                        rVar6.h0(L5);
                    }
                    p7.l.d(I, false, (mc.a) L5, rVar6, 0, 2);
                    if (aVar4 != null) {
                        rVar6.X(-243960189);
                        String I2 = l0.f.I(rVar6, R.string.delete);
                        boolean f18 = rVar6.f(aVar4) | rVar6.f(dVar);
                        Object L6 = rVar6.L();
                        if (f18 || L6 == eVar) {
                            L6 = new q1.e(1, aVar4, dVar);
                            rVar6.h0(L6);
                        }
                        p7.l.d(I2, false, (mc.a) L6, rVar6, 0, 2);
                        rVar6.p(false);
                    } else {
                        rVar6.X(-243681499);
                        rVar6.p(false);
                    }
                    String I3 = l0.f.I(rVar6, R.string.ok);
                    boolean z20 = !((Boolean) w0Var3.getValue()).booleanValue();
                    boolean f19 = rVar6.f(dVar);
                    Object L7 = rVar6.L();
                    if (f19 || L7 == eVar) {
                        L7 = new mc.a() { // from class: rg.c
                            @Override // mc.a
                            public final Object b() {
                                switch (r2) {
                                    case 0:
                                        dVar.a();
                                        break;
                                    default:
                                        dVar.b();
                                        break;
                                }
                                return y.f14813a;
                            }
                        };
                        rVar6.h0(L7);
                    }
                    p7.l.d(I3, z20, (mc.a) L7, rVar6, 0, 0);
                } else {
                    rVar6.R();
                }
                return yVar;
            case 16:
                ((Integer) obj2).getClass();
                p7.l.e((ve.f) obj5, (mc.a) obj4, (mc.r) obj3, (n2.m) obj, n2.s.F(1));
                return yVar;
            case 17:
                ((Integer) obj2).getClass();
                u1.l0.f((b3.p) obj5, (f2.b1) obj3, (v2.c) obj4, (n2.m) obj, n2.s.F(385));
                return yVar;
            case 18:
                b3.p pVar2 = (b3.p) obj5;
                n2.w0 w0Var4 = (n2.w0) obj3;
                v2.c cVar3 = (v2.c) obj4;
                n2.m mVar9 = (n2.m) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                n2.r rVar7 = (n2.r) mVar9;
                if (rVar7.O(intValue7 & 1, z18)) {
                    Object L8 = rVar7.L();
                    if (L8 == eVar) {
                        L8 = new o(w0Var4, 12);
                        rVar7.h0(L8);
                    }
                    b3.p n10 = y3.c0.n(pVar2, (mc.l) L8);
                    y3.v0 d10 = l1.p.d(b3.c.A, true);
                    int hashCode4 = Long.hashCode(rVar7.T);
                    v2.g l13 = rVar7.l();
                    b3.p c12 = b3.a.c(n10, rVar7);
                    a4.h.f220a.getClass();
                    a4.f0 f0Var4 = a4.g.f212b;
                    rVar7.b0();
                    if (rVar7.S) {
                        rVar7.k(f0Var4);
                    } else {
                        rVar7.k0();
                    }
                    n2.s.C(d10, a4.g.f215e, rVar7);
                    n2.s.C(l13, a4.g.f214d, rVar7);
                    n2.s.u(rVar7, Integer.valueOf(hashCode4), a4.g.f216f);
                    n2.s.y(rVar7, a4.g.f217g);
                    n2.s.C(c12, a4.g.f213c, rVar7);
                    cVar3.j(rVar7, 0);
                    rVar7.p(true);
                } else {
                    rVar7.R();
                }
                return yVar;
            case 19:
                yg.f fVar3 = (yg.f) obj5;
                e.k kVar = (e.k) obj3;
                n2.w0 w0Var5 = (n2.w0) obj4;
                n2.m mVar10 = (n2.m) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                n2.r rVar8 = (n2.r) mVar10;
                if (rVar8.O(intValue8 & 1, z19)) {
                    if (fVar3 instanceof yg.e) {
                        rVar8.X(2009516202);
                        WeakHashMap weakHashMap = c2.f8518w;
                        b3.p C = l1.c.C(mVar, new l1.d0(l1.s.f(rVar8).f8523e, l1.c.e(5)));
                        String I4 = l0.f.I(rVar8, R.string.dsiware_import_from_file);
                        o3.f fVar4 = aj.g.f871i;
                        if (fVar4 == null) {
                            o3.e eVar2 = new o3.e("AutoMirrored.Filled.InsertDriveFile", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                            int i10 = o3.h0.f10763a;
                            i3.p0 p0Var = new i3.p0(i3.s.f6681b);
                            o1 o1Var = new o1(2, false);
                            o1Var.q(6.0f, 2.0f);
                            o1Var.i(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                            o1Var.o(4.0f, 20.0f);
                            o1Var.i(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
                            o1Var.o(18.0f, 22.0f);
                            o1Var.i(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            o1Var.o(20.0f, 8.0f);
                            o1Var.p(-6.0f, -6.0f);
                            o1Var.o(6.0f, 2.0f);
                            o1Var.g();
                            o1Var.q(13.0f, 9.0f);
                            o1Var.o(13.0f, 3.5f);
                            o1Var.o(18.5f, 9.0f);
                            o1Var.o(13.0f, 9.0f);
                            o1Var.g();
                            o3.e.a(eVar2, o1Var.f7269a, p0Var);
                            fVar4 = eVar2.b();
                            aj.g.f871i = fVar4;
                        }
                        og.f fVar5 = new og.f(1, I4, o3.b.d(fVar4, rVar8));
                        String I5 = l0.f.I(rVar8, R.string.dsiware_import_from_rom_list);
                        o3.f fVar6 = d0.d.f3343d;
                        if (fVar6 == null) {
                            o3.e eVar3 = new o3.e("AutoMirrored.Filled.List", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                            int i11 = o3.h0.f10763a;
                            i3.p0 p0Var2 = new i3.p0(i3.s.f6681b);
                            o1 o1Var2 = new o1(2, false);
                            o1Var2.q(3.0f, 13.0f);
                            o1Var2.n(2.0f);
                            o1Var2.w(-2.0f);
                            o1Var2.o(3.0f, 11.0f);
                            o1Var2.w(2.0f);
                            o1Var2.g();
                            o1Var2.q(3.0f, 17.0f);
                            o1Var2.n(2.0f);
                            o1Var2.w(-2.0f);
                            o1Var2.o(3.0f, 15.0f);
                            o1Var2.w(2.0f);
                            o1Var2.g();
                            o1Var2.q(3.0f, 9.0f);
                            o1Var2.n(2.0f);
                            o1Var2.o(5.0f, 7.0f);
                            o1Var2.o(3.0f, 7.0f);
                            o1Var2.w(2.0f);
                            o1Var2.g();
                            o1Var2.q(7.0f, 13.0f);
                            o1Var2.n(14.0f);
                            o1Var2.w(-2.0f);
                            o1Var2.o(7.0f, 11.0f);
                            o1Var2.w(2.0f);
                            o1Var2.g();
                            o1Var2.q(7.0f, 17.0f);
                            o1Var2.n(14.0f);
                            o1Var2.w(-2.0f);
                            o1Var2.o(7.0f, 15.0f);
                            o1Var2.w(2.0f);
                            o1Var2.g();
                            o1Var2.q(7.0f, 7.0f);
                            o1Var2.w(2.0f);
                            o1Var2.n(14.0f);
                            o1Var2.o(21.0f, 7.0f);
                            o1Var2.o(7.0f, 7.0f);
                            o1Var2.g();
                            o3.e.a(eVar3, o1Var2.f7269a, p0Var2);
                            fVar6 = eVar3.b();
                            d0.d.f3343d = fVar6;
                        }
                        List y10 = p7.t.y(fVar5, new og.f(2, I5, o3.b.d(fVar6, rVar8)));
                        boolean h10 = rVar8.h(kVar) | rVar8.f(w0Var5);
                        Object L9 = rVar8.L();
                        if (h10 || L9 == eVar) {
                            L9 = new l1(14, kVar, w0Var5);
                            rVar8.h0(L9);
                        }
                        og.a.c(C, y10, (mc.l) L9, rVar8, 3136);
                        rVar8.p(false);
                    } else {
                        rVar8.X(2010934638);
                        rVar8.p(false);
                    }
                } else {
                    rVar8.R();
                }
                return yVar;
            default:
                ((Integer) obj2).getClass();
                zg.a.d((xg.k) obj5, (mc.a) obj4, (mc.l) obj3, (n2.m) obj, n2.s.F(1));
                return yVar;
        }
    }

    public /* synthetic */ m0(Object obj, Object obj2, Object obj3, int i2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }

    public /* synthetic */ m0(Object obj, Object obj2, yb.d dVar, int i2, int i10) {
        this.A = i10;
        this.B = obj;
        this.L = obj2;
        this.R = dVar;
    }

    public /* synthetic */ m0(Object obj, mc.a aVar, yb.d dVar, int i2, int i10) {
        this.A = i10;
        this.B = obj;
        this.R = aVar;
        this.L = dVar;
    }

    public /* synthetic */ m0(rg.d dVar, mc.a aVar, n2.w0 w0Var) {
        this.A = 15;
        this.B = dVar;
        this.R = aVar;
        this.L = w0Var;
    }
}
