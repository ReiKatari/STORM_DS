package g1;

import a4.f0;
import a5.s0;
import a5.u;
import ai.v0;
import b3.p;
import f1.n;
import i3.s;
import i3.z;
import l1.m1;
import l1.o1;
import l1.r1;
import l1.t0;
import l1.w;
import l1.w0;
import l1.x;
import l4.r0;
import mc.l;
import mc.q;
import n2.b0;
import n2.m;
import n2.p1;
import n2.r;
import u1.l0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final c f5035a;

    static {
        s0 s0Var = s0.Inherit;
        b0 b0Var = u.f433a;
        s0 s0Var2 = s0.Inherit;
        s0 s0Var3 = s0.Inherit;
        long j2 = s.f6683d;
        long j10 = s.f6681b;
        f5035a = new c(j2, j10, j10, s.b(j10, 0.38f), s.b(j10, 0.38f));
    }

    public static final void a(c cVar, p pVar, v2.c cVar2, m mVar, int i2) {
        int i10;
        boolean z10;
        p pVar2;
        int i11;
        int i12;
        int i13;
        r rVar = (r) mVar;
        rVar.Z(-527864079);
        if ((i2 & 6) == 0) {
            if (rVar.f(cVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.f(pVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i2 & 384) == 0) {
            if (rVar.h(cVar2)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i10 |= i11;
        }
        if ((i10 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            pVar2 = pVar;
            p r5 = n.r(l1.c.v(l1.c.B(n.f(f3.g.h(pVar2, f.f5023d, t1.e.b(f.f5024e), 0L, 28), cVar.f5014a, z.f6703b), t0.Max), 0.0f, f.f5028i, 1), n.o(rVar));
            int i14 = (i10 << 3) & 7168;
            w a10 = l1.u.a(l1.i.f8573c, b3.c.f1758g0, rVar, 0);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            p c4 = b3.a.c(r5, rVar);
            a4.h.f220a.getClass();
            f0 f0Var = a4.g.f212b;
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
            cVar2.i(x.f8644a, rVar, Integer.valueOf(((i14 >> 6) & 112) | 6));
            rVar.p(true);
        } else {
            pVar2 = pVar;
            rVar.R();
        }
        p1 r10 = rVar.r();
        if (r10 != null) {
            r10.f9983d = new b2.f((Object) cVar, pVar2, (q) cVar2, i2, 3);
        }
    }

    public static final void b(p pVar, c cVar, l lVar, m mVar, int i2, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        r rVar = (r) mVar;
        rVar.Z(-625529233);
        int i16 = i10 & 1;
        if (i16 != 0) {
            i12 = i2 | 6;
        } else {
            if (rVar.f(pVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i12 = i11 | i2;
        }
        int i17 = i10 & 2;
        if (i17 != 0) {
            i14 = i12 | 48;
        } else {
            if (rVar.f(cVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i14 = i12 | i13;
        }
        if (rVar.h(lVar)) {
            i15 = 256;
        } else {
            i15 = 128;
        }
        int i18 = i14 | i15;
        if ((i18 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i18 & 1, z10)) {
            if (i16 != 0) {
                pVar = b3.m.f1770a;
            }
            if (i17 != 0) {
                cVar = f5035a;
            }
            a(cVar, pVar, v2.h.c(-250345048, new v0(2, lVar, cVar), rVar), rVar, ((i18 << 3) & 112) | ((i18 >> 3) & 14) | 384);
        } else {
            rVar.R();
        }
        p pVar2 = pVar;
        c cVar2 = cVar;
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new b2.f(pVar2, cVar2, lVar, i2, i10);
        }
    }

    public static final void c(final String str, final boolean z10, final c cVar, final p pVar, final q qVar, final mc.a aVar, m mVar, final int i2) {
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        long j2;
        long j10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        r rVar = (r) mVar;
        rVar.Z(-2001167027);
        if ((i2 & 6) == 0) {
            if (rVar.f(str)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i10 = i17 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.g(z10)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i10 |= i16;
        }
        if ((i2 & 384) == 0) {
            if (rVar.f(cVar)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i10 |= i15;
        }
        if ((i2 & 3072) == 0) {
            if (rVar.f(pVar)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i10 |= i14;
        }
        if ((i2 & 24576) == 0) {
            if (rVar.h(qVar)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i10 |= i13;
        }
        if ((196608 & i2) == 0) {
            if (rVar.h(aVar)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i10 |= i12;
        }
        if ((74899 & i10) != 74898) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i10 & 1, z11)) {
            b3.g gVar = f.f5025f;
            l1.s sVar = l1.i.f8571a;
            float f8 = f.f5027h;
            l1.g g10 = l1.i.g(f8);
            if ((i10 & 112) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            if ((458752 & i10) == 131072) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z14 = z12 | z13;
            Object L = rVar.L();
            if (z14 || L == n2.l.f9953a) {
                L = new g(z10, aVar, 0);
                rVar.h0(L);
            }
            p b10 = r1.b(n.i(pVar, z10, str, (mc.a) L, 12), 1.0f);
            float f10 = f.f5020a;
            float f11 = f.f5021b;
            float f12 = f.f5022c;
            p v10 = l1.c.v(r1.k(b10, f10, f12, f11, f12), f8, 0.0f, 2);
            o1 a10 = m1.a(g10, gVar, rVar, 54);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            p c4 = b3.a.c(v10, rVar);
            a4.h.f220a.getClass();
            f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            a4.f fVar = a4.g.f215e;
            n2.s.C(a10, fVar, rVar);
            a4.f fVar2 = a4.g.f214d;
            n2.s.C(l10, fVar2, rVar);
            Integer valueOf = Integer.valueOf(hashCode);
            a4.f fVar3 = a4.g.f216f;
            n2.s.u(rVar, valueOf, fVar3);
            a4.e eVar = a4.g.f217g;
            n2.s.y(rVar, eVar);
            a4.f fVar4 = a4.g.f213c;
            n2.s.C(c4, fVar4, rVar);
            if (qVar == null) {
                rVar.X(-1597947094);
                rVar.p(false);
                i11 = i10;
            } else {
                rVar.X(-1597947093);
                float f13 = f.f5029j;
                p h2 = r1.h(b3.m.f1770a, f13, 0.0f, f13, f13, 2);
                y3.v0 d4 = l1.p.d(b3.c.A, false);
                int hashCode2 = Long.hashCode(rVar.T);
                v2.g l11 = rVar.l();
                p c10 = b3.a.c(h2, rVar);
                rVar.b0();
                i11 = i10;
                if (rVar.S) {
                    rVar.k(f0Var);
                } else {
                    rVar.k0();
                }
                n2.s.C(d4, fVar, rVar);
                n2.s.C(l11, fVar2, rVar);
                w.d.x(hashCode2, rVar, fVar3, rVar, eVar);
                n2.s.C(c10, fVar4, rVar);
                if (z10) {
                    j2 = cVar.f5016c;
                } else {
                    j2 = cVar.f5018e;
                }
                qVar.i(new s(j2), rVar, 0);
                rVar.p(true);
                rVar.p(false);
            }
            if (z10) {
                j10 = cVar.f5015b;
            } else {
                j10 = cVar.f5017d;
            }
            long j11 = j10;
            r0 r0Var = new r0(j11, f.m, f.f5032n, f.f5034p, f.f5026g, f.f5033o, 16613240);
            if (1.0f <= 0.0d) {
                m1.a.a("invalid weight; must be greater than zero");
            }
            l0.b(str, new w0(1.0f, true), r0Var, null, 0, false, 1, 0, null, rVar, (i11 & 14) | 1572864, 952);
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p() { // from class: g1.h
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    i.c(str, z10, cVar, pVar, qVar, aVar, (m) obj, n2.s.F(i2 | 1));
                    return y.f14813a;
                }
            };
        }
    }
}
