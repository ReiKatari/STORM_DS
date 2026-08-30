package ng;

import a4.e;
import a4.f0;
import a4.h;
import ai.m;
import ai.m0;
import ai.t;
import ai.v;
import b3.p;
import f1.n;
import g2.b2;
import g2.e7;
import g2.f7;
import g2.g7;
import g2.k0;
import g2.l0;
import g2.o0;
import g2.q0;
import g3.y;
import g3.z;
import l1.i;
import l1.m1;
import l1.o1;
import l1.r1;
import l1.u;
import l1.w;
import l1.w0;
import me.magnum.melonds.domain.model.Cheat;
import n2.b0;
import n2.p1;
import n2.r;
import n2.s;
import oe.f;
import oe.q;
import p7.l;
import v2.c;
import v2.g;
import w.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final c f10443a = new c(1939508790, false, new m(28));

    /* renamed from: b  reason: collision with root package name */
    public static final c f10444b = new c(-1081404563, false, new m(29));

    public static final void a(p pVar, f fVar, mc.a aVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z10;
        f fVar2;
        String description;
        pVar.getClass();
        fVar.getClass();
        Cheat cheat = fVar.f10927a;
        aVar.getClass();
        r rVar = (r) mVar;
        rVar.Z(1315035595);
        if (rVar.f(fVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i12 = i2 | i10;
        if (rVar.h(aVar)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i13 = i12 | i11;
        if ((i13 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i13 & 1, z10)) {
            p u4 = l1.c.u(n.i(pVar, false, null, aVar, 15), 16, 12);
            o1 a10 = m1.a(i.g(32), b3.c.f1755d0, rVar, 6);
            int hashCode = Long.hashCode(rVar.T);
            g l10 = rVar.l();
            p c4 = b3.a.c(u4, rVar);
            h.f220a.getClass();
            f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            a4.f fVar3 = a4.g.f215e;
            s.C(a10, fVar3, rVar);
            a4.f fVar4 = a4.g.f214d;
            s.C(l10, fVar4, rVar);
            Integer valueOf = Integer.valueOf(hashCode);
            a4.f fVar5 = a4.g.f216f;
            s.u(rVar, valueOf, fVar5);
            e eVar = a4.g.f217g;
            s.y(rVar, eVar);
            a4.f fVar6 = a4.g.f213c;
            s.C(c4, fVar6, rVar);
            b3.m mVar2 = b3.m.f1770a;
            k0.a(cheat.getEnabled(), l1.c.x(mVar2, 0.0f, 4, 0.0f, 0.0f, 13), false, null, rVar, 432);
            w a11 = u.a(i.f8573c, b3.c.f1758g0, rVar, 0);
            int hashCode2 = Long.hashCode(rVar.T);
            g l11 = rVar.l();
            p c10 = b3.a.c(mVar2, rVar);
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            s.C(a11, fVar3, rVar);
            s.C(l11, fVar4, rVar);
            d.x(hashCode2, rVar, fVar5, rVar, eVar);
            s.C(c10, fVar6, rVar);
            o1 a12 = m1.a(i.g(8), b3.c.f1756e0, rVar, 54);
            int hashCode3 = Long.hashCode(rVar.T);
            g l12 = rVar.l();
            p c11 = b3.a.c(mVar2, rVar);
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            s.C(a12, fVar3, rVar);
            s.C(l12, fVar4, rVar);
            d.x(hashCode3, rVar, fVar5, rVar, eVar);
            s.C(c11, fVar6, rVar);
            b2.b(k7.w.r(), null, r1.i(mVar2, 20), 0L, rVar, 432, 8);
            if (1.0f <= 0.0d) {
                m1.a.a("invalid weight; must be greater than zero");
            }
            fVar2 = fVar;
            e7.b(fVar2.f10928b, new w0(1.0f, true), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, null, rVar, 0, 3120, 120828);
            rVar.p(true);
            e7.b(cheat.getName(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 131070);
            rVar = rVar;
            if (cheat.getDescription() != null && (!vc.h.j0(description))) {
                rVar.X(1071166791);
                l.b(cheat.getDescription(), null, 0L, 0L, 0L, 0L, 0, false, 0, 0, null, ((f7) rVar.j(g7.f5161b)).f5151j, rVar, 0, 0, 65534);
                rVar = rVar;
                rVar.p(false);
            } else {
                rVar.X(1071341693);
                rVar.p(false);
            }
            rVar.p(true);
            rVar.p(true);
        } else {
            fVar2 = fVar;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new m0(pVar, fVar2, aVar, i2, 11);
        }
    }

    public static final void b(p pVar, Cheat cheat, mc.a aVar, mc.a aVar2, mc.a aVar3, n2.m mVar, int i2) {
        int i10;
        mc.a aVar4;
        boolean z10;
        String description;
        boolean z11;
        float f8;
        b3.g gVar;
        float f10;
        int i11;
        int i12;
        int i13;
        pVar.getClass();
        cheat.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        r rVar = (r) mVar;
        rVar.Z(-1297853370);
        if (rVar.f(cheat)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i10 | i2;
        if ((i2 & 384) == 0) {
            if (rVar.h(aVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i14 |= i13;
        }
        if ((i2 & 3072) == 0) {
            if (rVar.h(aVar2)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i14 |= i12;
        }
        if ((i2 & 24576) == 0) {
            aVar4 = aVar3;
            if (rVar.h(aVar4)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i14 |= i11;
        } else {
            aVar4 = aVar3;
        }
        if ((i14 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i14 & 1, z10)) {
            if (cheat.getDescription() != null && (!vc.h.j0(description))) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object L = rVar.L();
            Object obj = n2.l.f9953a;
            if (L == obj) {
                L = s.w(Boolean.FALSE);
                rVar.h0(L);
            }
            n2.w0 w0Var = (n2.w0) L;
            Object L2 = rVar.L();
            if (L2 == obj) {
                z zVar = z.f5551b;
                L2 = y.f5550a;
                rVar.h0(L2);
            }
            ((y) L2).getClass();
            z zVar2 = new z();
            z zVar3 = new z();
            if (z11) {
                f8 = 12;
            } else {
                f8 = 4;
            }
            float f11 = f8;
            p k10 = g3.d.k(pVar, zVar2);
            boolean f12 = rVar.f(zVar3);
            Object L3 = rVar.L();
            if (f12 || L3 == obj) {
                L3 = new t(zVar3, 1);
                rVar.h0(L3);
            }
            p i15 = n.i(g3.d.i(k10, (mc.l) L3), false, null, aVar, 15);
            Object L4 = rVar.L();
            if (L4 == obj) {
                L4 = new a(w0Var, 0);
                rVar.h0(L4);
            }
            p d4 = t3.c.d(i15, (mc.l) L4);
            float f13 = 16;
            p x9 = l1.c.x(d4, f13, f11, 0.0f, f11, 4);
            l1.g g10 = i.g(f13);
            if (z11) {
                gVar = b3.c.f1755d0;
            } else {
                gVar = b3.c.f1756e0;
            }
            o1 a10 = m1.a(g10, gVar, rVar, 6);
            int hashCode = Long.hashCode(rVar.T);
            g l10 = rVar.l();
            p c4 = b3.a.c(x9, rVar);
            h.f220a.getClass();
            f0 f0Var = a4.g.f212b;
            rVar.b0();
            boolean z12 = z11;
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            a4.f fVar = a4.g.f215e;
            s.C(a10, fVar, rVar);
            a4.f fVar2 = a4.g.f214d;
            s.C(l10, fVar2, rVar);
            Integer valueOf = Integer.valueOf(hashCode);
            a4.f fVar3 = a4.g.f216f;
            s.u(rVar, valueOf, fVar3);
            e eVar = a4.g.f217g;
            s.y(rVar, eVar);
            a4.f fVar4 = a4.g.f213c;
            s.C(c4, fVar4, rVar);
            p pVar2 = b3.m.f1770a;
            if (z12) {
                pVar2 = l1.c.x(pVar2, 0.0f, 4, 0.0f, 0.0f, 13);
            }
            k0.a(cheat.getEnabled(), pVar2, false, null, rVar, 48);
            if (1.0f <= 0.0d) {
                m1.a.a("invalid weight; must be greater than zero");
            }
            p x10 = l1.c.x(new w0(1.0f, true), f13, 0.0f, 0.0f, 0.0f, 14);
            w a11 = u.a(i.g(4), b3.c.f1758g0, rVar, 6);
            int hashCode2 = Long.hashCode(rVar.T);
            g l11 = rVar.l();
            p c10 = b3.a.c(x10, rVar);
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            s.C(a11, fVar, rVar);
            s.C(l11, fVar2, rVar);
            d.x(hashCode2, rVar, fVar3, rVar, eVar);
            s.C(c10, fVar4, rVar);
            e7.b(cheat.getName(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 131070);
            rVar = rVar;
            if (z12) {
                rVar.X(1179372186);
                l.b(cheat.getDescription(), null, 0L, 0L, 0L, 0L, 0, false, 0, 0, null, ((f7) rVar.j(g7.f5161b)).f5151j, rVar, 0, 0, 65534);
                rVar = rVar;
                rVar.p(false);
            } else {
                rVar.X(1179516770);
                rVar.p(false);
            }
            rVar.p(true);
            b0 b0Var = o0.f5308a;
            long j2 = ((i3.s) rVar.j(q0.f5361a)).f6689a;
            if (!((l0) rVar.j(g2.m0.f5257a)).k() ? i3.z.r(j2) < 0.5d : i3.z.r(j2) > 0.5d) {
                f10 = 1.0f;
            } else {
                f10 = 0.87f;
            }
            s.a(b0Var.a(Float.valueOf(f10)), v2.h.c(1097232746, new v(zVar3, zVar2, w0Var, aVar2, aVar4, 5), rVar), rVar, 56);
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new d1.r1(pVar, cheat, aVar, aVar2, aVar3, i2, 1);
        }
    }

    public static final void c(p pVar, oe.c cVar, mc.a aVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        pVar.getClass();
        cVar.getClass();
        aVar.getClass();
        r rVar = (r) mVar;
        rVar.Z(-2038549408);
        if (rVar.h(cVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i12 = i2 | i10;
        if (rVar.h(aVar)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i13 = i12 | i11;
        if ((i13 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i13 & 1, z10)) {
            if ((i13 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object L = rVar.L();
            if (z11 || L == n2.l.f9953a) {
                L = new lg.e(2, aVar);
                rVar.h0(L);
            }
            p v10 = l1.c.v(n.i(pVar, false, null, (mc.a) L, 15), 16, 0.0f, 2);
            o1 a10 = m1.a(i.g(32), b3.c.f1756e0, rVar, 54);
            int hashCode = Long.hashCode(rVar.T);
            g l10 = rVar.l();
            p c4 = b3.a.c(v10, rVar);
            h.f220a.getClass();
            f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            s.C(a10, a4.g.f215e, rVar);
            s.C(l10, a4.g.f214d, rVar);
            s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            s.y(rVar, a4.g.f217g);
            s.C(c4, a4.g.f213c, rVar);
            b2.b(k7.w.r(), null, r1.i(l1.c.v(b3.m.f1770a, 0.0f, 12, 1), 24), ((l0) rVar.j(g2.m0.f5257a)).i(), rVar, 432, 0);
            if (1.0f <= 0.0d) {
                m1.a.a("invalid weight; must be greater than zero");
            }
            e7.b(cVar.f10917b, new w0(1.0f, true), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 131068);
            rVar = rVar;
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new m0(pVar, cVar, aVar, i2, 12);
        }
    }

    public static final void d(p pVar, q qVar, mc.a aVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        pVar.getClass();
        qVar.getClass();
        aVar.getClass();
        r rVar = (r) mVar;
        rVar.Z(-1995127703);
        if (rVar.h(qVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i12 = i2 | i10;
        if (rVar.h(aVar)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i13 = i12 | i11;
        if ((i13 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i13 & 1, z10)) {
            if ((i13 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object L = rVar.L();
            if (z11 || L == n2.l.f9953a) {
                L = new lg.e(3, aVar);
                rVar.h0(L);
            }
            p v10 = l1.c.v(n.i(pVar, false, null, (mc.a) L, 15), 16, 0.0f, 2);
            o1 a10 = m1.a(i.g(32), b3.c.f1756e0, rVar, 54);
            int hashCode = Long.hashCode(rVar.T);
            g l10 = rVar.l();
            p c4 = b3.a.c(v10, rVar);
            h.f220a.getClass();
            f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            s.C(a10, a4.g.f215e, rVar);
            s.C(l10, a4.g.f214d, rVar);
            s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            s.y(rVar, a4.g.f217g);
            s.C(c4, a4.g.f213c, rVar);
            b2.b(k7.w.r(), null, r1.i(l1.c.v(b3.m.f1770a, 0.0f, 12, 1), 24), ((l0) rVar.j(g2.m0.f5257a)).i(), rVar, 432, 0);
            if (1.0f <= 0.0d) {
                m1.a.a("invalid weight; must be greater than zero");
            }
            e7.b(qVar.f10951b, new w0(1.0f, true), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 131068);
            rVar = rVar;
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new m0(pVar, qVar, aVar, i2, 13);
        }
    }
}
