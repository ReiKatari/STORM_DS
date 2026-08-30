package mh;

import ai.j0;
import ai.x0;
import ai.z0;
import b4.q1;
import g2.e7;
import g2.f3;
import g2.l0;
import g2.m0;
import g2.n0;
import java.util.List;
import l1.h1;
import l1.r1;
import me.magnum.melonds.R;
import n2.b1;
import n2.d1;
import n2.p1;
import n2.s2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public static final float f9704a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f9705b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f9706c = 40;

    static {
        float f8 = 150;
        f9704a = f8;
        f9705b = f8;
    }

    public static final void a(b3.p pVar, zh.y yVar, mc.l lVar, mc.a aVar, mc.a aVar2, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        n2.r rVar;
        float f8;
        b1 b1Var;
        float f10;
        boolean z11;
        boolean z12;
        pVar.getClass();
        yVar.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        n2.r rVar2 = (n2.r) mVar;
        rVar2.Z(-793713193);
        if (rVar2.f(yVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i2 | i10;
        if (rVar2.h(lVar)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if (rVar2.h(aVar)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i16 = i15 | i12;
        if (rVar2.h(aVar2)) {
            i13 = 16384;
        } else {
            i13 = 8192;
        }
        int i17 = i16 | i13;
        if ((i17 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.O(i17 & 1, z10)) {
            Object L = rVar2.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = n2.s.o(rVar2);
                rVar2.h0(L);
            }
            zc.u uVar = (zc.u) L;
            n1.x a10 = n1.z.a(rVar2);
            Object L2 = rVar2.L();
            if (L2 == eVar) {
                L2 = new b1(0.0f);
                rVar2.h0(L2);
            }
            b1 b1Var2 = (b1) L2;
            Object L3 = rVar2.L();
            if (L3 == eVar) {
                L3 = n2.s.q(new q(a10, 0));
                rVar2.h0(L3);
            }
            s2 s2Var = (s2) L3;
            x4.c cVar = (x4.c) rVar2.j(q1.f1919h);
            float v10 = cVar.v(f9704a);
            float v11 = cVar.v(f9705b);
            Object L4 = rVar2.L();
            if (L4 == eVar) {
                b1Var = b1Var2;
                f8 = 0.0f;
                z11 = false;
                u uVar2 = new u(s2Var, b1Var, uVar, v11, v10, aVar2);
                f10 = v10;
                rVar2.h0(uVar2);
                L4 = uVar2;
            } else {
                f8 = 0.0f;
                b1Var = b1Var2;
                f10 = v10;
                z11 = false;
            }
            b3.p a11 = u3.e.a(pVar.f(r1.f8615c), (u) L4);
            Object L5 = rVar2.L();
            if (L5 == eVar) {
                L5 = new r(b1Var, 0);
                rVar2.h0(L5);
            }
            b3.p a12 = f3.g.a(l1.c.q(a11, (mc.l) L5), p7.j.f(1.0f - (b1Var.g() / f10), f8, 1.0f));
            l1.w a13 = l1.u.a(l1.i.f8574d, b3.c.f1759h0, rVar2, 54);
            int hashCode = Long.hashCode(rVar2.T);
            v2.g l10 = rVar2.l();
            b3.p c4 = b3.a.c(a12, rVar2);
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
            rVar2.b0();
            if (rVar2.S) {
                rVar2.k(f0Var);
            } else {
                rVar2.k0();
            }
            n2.s.C(a13, a4.g.f215e, rVar2);
            n2.s.C(l10, a4.g.f214d, rVar2);
            n2.s.u(rVar2, Integer.valueOf(hashCode), a4.g.f216f);
            n2.s.y(rVar2, a4.g.f217g);
            n2.s.C(c4, a4.g.f213c, rVar2);
            if (yVar.equals(zh.u.f15139a)) {
                rVar2.X(-941473351);
                rVar = rVar2;
                z12 = true;
                f3.a(null, ((l0) rVar2.j(m0.f5257a)).i(), 0.0f, 0L, 0, rVar, 0, 29);
                rVar.p(z11);
            } else {
                boolean z13 = z11;
                rVar = rVar2;
                z12 = true;
                boolean z14 = yVar instanceof zh.x;
                b3.m mVar2 = b3.m.f1770a;
                if (z14) {
                    rVar.X(-941268193);
                    l1.p.a(f1.n.l(mVar2, z13, null, 3), rVar, 6);
                    b(r1.m(mVar2, f8, 640, 1), ((zh.x) yVar).f15142a, lVar, a10, rVar, 6 | (i17 & 896));
                    rVar.p(z13);
                } else if (!yVar.equals(zh.t.f15138a) && !yVar.equals(zh.v.f15140a) && !yVar.equals(zh.w.f15141a)) {
                    throw w.d.i(rVar, 1216554949, z13);
                } else {
                    rVar.X(-940417584);
                    c(l1.c.t(r1.m(mVar2, f8, 640, 1), 32), aVar, rVar, ((i17 >> 6) & 112) | 6);
                    rVar.p(z13);
                }
            }
            rVar.p(z12);
        } else {
            rVar = rVar2;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.v(pVar, yVar, lVar, aVar, aVar2, i2);
        }
    }

    public static final void b(final b3.p pVar, List list, mc.l lVar, final n1.x xVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        List<zh.c> list2 = list;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(911687337);
        if (rVar.h(list2)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i2 | i10;
        final mc.l lVar2 = lVar;
        if (rVar.h(lVar2)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i14 = i13 | i11;
        if (rVar.f(xVar)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i15 = i14 | i12;
        if ((i15 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i15 & 1, z10)) {
            Object[] objArr = new Object[0];
            boolean h2 = rVar.h(list2);
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (h2 || L == eVar) {
                L = new jd.i(2, list2);
                rVar.h0(L);
            }
            final d1 d1Var = (d1) y2.k.c(objArr, (mc.a) L, rVar, 0);
            boolean e6 = rVar.e(d1Var.g());
            Object L2 = rVar.L();
            zh.c cVar = L2;
            if (e6 || L2 == eVar) {
                for (zh.c cVar2 : list2) {
                    if (cVar2.f15110a == d1Var.g()) {
                        rVar.h0(cVar2);
                        cVar = cVar2;
                    } else {
                        list2 = list;
                        lVar2 = lVar;
                    }
                }
                m9.o.x("Collection contains no element matching the predicate.");
                return;
            }
            final zh.c cVar3 = (zh.c) cVar;
            final long a10 = ((l0) rVar.j(m0.f5257a)).a();
            x4.c cVar4 = (x4.c) rVar.j(q1.f1919h);
            final x4.m mVar2 = (x4.m) rVar.j(q1.f1924n);
            Object L3 = rVar.L();
            if (L3 == eVar) {
                L3 = n2.s.o(rVar);
                rVar.h0(L3);
            }
            final zc.u uVar = (zc.u) L3;
            boolean f8 = rVar.f(cVar4);
            Object L4 = rVar.L();
            if (f8 || L4 == eVar) {
                float v10 = cVar4.v(f9706c);
                L4 = new i(v10, v10);
                rVar.h0(L4);
            }
            i iVar = (i) L4;
            boolean f10 = rVar.f(cVar4);
            Object L5 = rVar.L();
            if (f10 || L5 == eVar) {
                L5 = Float.valueOf(cVar4.v(80));
                rVar.h0(L5);
            }
            final float floatValue = ((Number) L5).floatValue();
            final List list3 = list2;
            n2.s.a(h1.f.f5891a.a(iVar), v2.h.c(1972290409, new mc.p() { // from class: mh.n
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    boolean z11;
                    n2.m mVar3 = (n2.m) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    n2.r rVar2 = (n2.r) mVar3;
                    if (rVar2.O(intValue & 1, z11)) {
                        n1.x xVar2 = xVar;
                        boolean f11 = rVar2.f(xVar2);
                        zc.u uVar2 = uVar;
                        boolean h10 = f11 | rVar2.h(uVar2);
                        float f12 = floatValue;
                        boolean c4 = h10 | rVar2.c(f12);
                        Object L6 = rVar2.L();
                        n2.e eVar2 = n2.l.f9953a;
                        if (c4 || L6 == eVar2) {
                            L6 = new o(xVar2, uVar2, f12, 0);
                            rVar2.h0(L6);
                        }
                        b3.p i16 = g3.d.i(b3.p.this, (mc.l) L6);
                        x4.m mVar4 = mVar2;
                        boolean d4 = rVar2.d(mVar4.ordinal());
                        List list4 = list3;
                        d1 d1Var2 = d1Var;
                        boolean h11 = d4 | rVar2.h(list4) | rVar2.f(d1Var2);
                        Object L7 = rVar2.L();
                        if (h11 || L7 == eVar2) {
                            L7 = new z0(list4, mVar4, d1Var2, 1);
                            rVar2.h0(L7);
                        }
                        b3.p d10 = t3.c.d(i16, (mc.l) L7);
                        long j2 = a10;
                        boolean e10 = rVar2.e(j2);
                        Object L8 = rVar2.L();
                        if (e10 || L8 == eVar2) {
                            L8 = new cd.k(12, j2);
                            rVar2.h0(L8);
                        }
                        b3.p e11 = f3.g.e(d10, (mc.l) L8);
                        b3.f fVar = b3.c.f1759h0;
                        float f13 = x.f9704a;
                        h1 b10 = l1.c.b(1, 0.0f);
                        zh.c cVar5 = cVar3;
                        mc.l lVar3 = lVar2;
                        boolean h12 = rVar2.h(list4) | rVar2.f(d1Var2) | rVar2.h(cVar5) | rVar2.f(lVar3);
                        Object L9 = rVar2.L();
                        if (h12 || L9 == eVar2) {
                            x0 x0Var = new x0(list4, cVar5, d1Var2, lVar3, 7);
                            rVar2.h0(x0Var);
                            L9 = x0Var;
                        }
                        k0.d.c(e11, xVar2, b10, null, fVar, null, false, null, (mc.l) L9, rVar2, 196992, 472);
                    } else {
                        rVar2.R();
                    }
                    return yb.y.f14813a;
                }
            }, rVar), rVar, 56);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new b2.e(pVar, list, lVar, xVar, i2);
        }
    }

    public static final void c(b3.p pVar, mc.a aVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(2119940746);
        if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(aVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            l1.w a10 = l1.u.a(l1.i.g(32), b3.c.f1759h0, rVar, 54);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(pVar, rVar);
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
            e7.b(l0.f.I(rVar, R.string.retro_achievements_load_error), null, 0L, 0L, null, 0L, new w4.k(3), 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 130558);
            rVar = rVar;
            n0.a(aVar, null, false, null, null, og.a.d(rVar), null, g0.f9688a, rVar, ((i10 >> 3) & 14) | 805306368, 382);
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new j0(pVar, aVar, i2, 2);
        }
    }
}
