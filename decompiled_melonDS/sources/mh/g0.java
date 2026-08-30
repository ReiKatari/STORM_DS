package mh;

import ah.h1;
import ah.l0;
import ai.q0;
import ai.s0;
import android.content.res.Resources;
import b4.r0;
import cd.x0;
import g2.e7;
import g2.f7;
import g2.g7;
import g2.l5;
import h1.x2;
import hh.h0;
import hh.i0;
import i3.m0;
import java.util.Collections;
import java.util.Map;
import l1.r1;
import l4.j0;
import me.magnum.melonds.R;
import n2.b1;
import n2.p1;
import n2.t2;
import n2.w0;
import y3.v0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final v2.c f9688a = new v2.c(856421348, false, new ai.m(23));

    /* renamed from: b  reason: collision with root package name */
    public static final v2.c f9689b = new v2.c(-1862642174, false, new ai.m(24));

    /* renamed from: c  reason: collision with root package name */
    public static final v2.c f9690c = new v2.c(-1686313917, false, new ai.m(25));

    /* renamed from: d  reason: collision with root package name */
    public static final v2.c f9691d = new v2.c(-1333657403, false, new ai.m(26));

    /* renamed from: e  reason: collision with root package name */
    public static final v2.c f9692e = new v2.c(-127107155, false, new ai.m(27));

    public static final void a(ah.e0 e0Var, mc.a aVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z10;
        aVar.getClass();
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1327981391);
        if (rVar.h(e0Var)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i2;
        if (rVar.h(aVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        if ((i13 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i13 & 1, z10)) {
            k0.d.a(aVar, new a5.f0(3), v2.h.c(1587473816, new j(e0Var, aVar), rVar), rVar, ((i13 >> 3) & 14) | 432);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new j(e0Var, aVar, i2);
        }
    }

    public static final void b(b3.p pVar, cd.h hVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z10;
        b3.p pVar2;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-2115049507);
        if (rVar.f(pVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i2;
        if (rVar.h(hVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        if ((i13 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i13 & 1, z10)) {
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = new a0();
                rVar.h0(L);
            }
            a0 a0Var = (a0) L;
            boolean h2 = rVar.h(hVar);
            Object L2 = rVar.L();
            if (h2 || L2 == eVar) {
                L2 = new m(hVar, a0Var, null, 1);
                rVar.h0(L2);
            }
            n2.s.g(hVar, (mc.p) L2, rVar);
            Object L3 = rVar.L();
            if (L3 == eVar) {
                L3 = new z(1, a0Var);
                rVar.h0(L3);
            }
            pVar2 = pVar;
            k0.d.c(pVar2, null, null, null, null, null, false, null, (mc.l) L3, rVar, (i13 & 14) | 805306368, 510);
        } else {
            pVar2 = pVar;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new b0(pVar2, hVar, i2, 1);
        }
    }

    public static final void c(h1 h1Var, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        h1Var.getClass();
        x0 x0Var = h1Var.G;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-1053005445);
        if (rVar.h(h1Var)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i2;
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i11 & 1, z10)) {
            boolean f8 = rVar.f(h1Var);
            Object L = rVar.L();
            if (f8 || L == n2.l.f9953a) {
                L = cd.q.w(new l0(x0Var, 11), new l0(h1Var.M, 10));
                rVar.h0(L);
            }
            cd.h hVar = (cd.h) L;
            b3.m mVar2 = b3.m.f1770a;
            b3.p D = l1.c.D(r1.b(mVar2, 1.0f), new l5(28));
            b3.h hVar2 = b3.c.A;
            v0 d4 = l1.p.d(hVar2, false);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(D, rVar);
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(d4, a4.g.f215e, rVar);
            n2.s.C(l10, a4.g.f214d, rVar);
            n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            n2.s.y(rVar, a4.g.f217g);
            n2.s.C(c4, a4.g.f213c, rVar);
            b(r1.n(l1.s.f8618b.e(mVar2, hVar2), null, 3), x0Var, rVar, 0);
            f(r1.b(mVar2, 1.0f), hVar, rVar, 6);
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new s0(i2, 12, h1Var);
        }
    }

    public static final void d(bh.g gVar, bh.g gVar2, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        long j2;
        int i14;
        n2.r rVar;
        String str;
        t2 t2Var;
        int i15;
        d1.e0 e0Var;
        int i16;
        String str2;
        l4.h h2;
        boolean z12;
        int f8;
        boolean z13;
        n2.r rVar2 = (n2.r) mVar;
        rVar2.Z(537291603);
        if (rVar2.f(gVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i17 = i2 | i10;
        if (rVar2.f(gVar2)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i18 = i17 | i11;
        if ((i18 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.O(i18 & 1, z10)) {
            t2 t2Var2 = g7.f5161b;
            long j10 = ((f7) rVar2.j(t2Var2)).f5150i.f8888b.f8905c;
            Resources resources = (Resources) rVar2.j(r0.f1938c);
            d1.e0 p10 = d1.d.p(rVar2, 0);
            if ((i18 & 112) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object L = rVar2.L();
            if (!z11 && L != n2.l.f9953a) {
                str = "checkmark";
                t2Var = t2Var2;
                h2 = L;
                str2 = "spinner";
                j2 = j10;
                e0Var = p10;
            } else {
                if (gVar2 != null) {
                    i12 = gVar2.f2264a;
                } else {
                    i12 = 0;
                }
                if (gVar2 != null) {
                    i13 = gVar2.f2265b;
                } else {
                    i13 = 0;
                }
                l4.e eVar = new l4.e();
                j2 = j10;
                if (gVar != null) {
                    i14 = gVar.f2264a;
                } else {
                    i14 = 0;
                }
                if (i14 > 0) {
                    e0Var = p10;
                    x4.p[] pVarArr = x4.o.f14348b;
                    long j11 = j2 & 1095216660480L;
                    if (j11 == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        x4.i.a("Cannot perform operation for Unspecified type.");
                    }
                    t2Var = t2Var2;
                    rVar = rVar2;
                    i15 = i13;
                    f8 = eVar.f(new l4.v(p7.t.C(j11, x4.o.c(j2) * 1.5f), new w4.q(2, l4.l.f8846a)));
                    try {
                        u1.l0.m(eVar, "pending-achievement", "�");
                        eVar.b("\u2003");
                        String quantityString = resources.getQuantityString(R.plurals.retroachievements_pending_achievement_unlocks, i12, Integer.valueOf(i12));
                        quantityString.getClass();
                        eVar.b(quantityString);
                        eVar.b(" ");
                        if (i12 > 0) {
                            u1.l0.m(eVar, "spinner", "�");
                            str = "checkmark";
                        } else {
                            str = "checkmark";
                            u1.l0.m(eVar, str, "�");
                        }
                    } finally {
                        eVar.e(f8);
                    }
                } else {
                    rVar = rVar2;
                    str = "checkmark";
                    t2Var = t2Var2;
                    i15 = i13;
                    e0Var = p10;
                }
                if (gVar != null) {
                    i16 = gVar.f2265b;
                } else {
                    i16 = 0;
                }
                if (i16 <= 0) {
                    str2 = "spinner";
                } else {
                    x4.p[] pVarArr2 = x4.o.f14348b;
                    long j12 = j2 & 1095216660480L;
                    if (j12 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        x4.i.a("Cannot perform operation for Unspecified type.");
                    }
                    str2 = "spinner";
                    f8 = eVar.f(new l4.v(p7.t.C(j12, x4.o.c(j2) * 1.5f), new w4.q(2, l4.l.f8846a)));
                    try {
                        u1.l0.m(eVar, "pending-leaderboard", "�");
                        eVar.b("\u2003");
                        int i19 = i15;
                        String quantityString2 = resources.getQuantityString(R.plurals.retroachievements_pending_leaderboard_entries, i19, Integer.valueOf(i15));
                        quantityString2.getClass();
                        eVar.b(quantityString2);
                        eVar.b(" ");
                        if (i19 > 0) {
                            u1.l0.m(eVar, str2, "�");
                        } else {
                            u1.l0.m(eVar, str, "�");
                        }
                    } finally {
                        eVar.e(f8);
                    }
                }
                h2 = eVar.h();
                rVar2 = rVar;
                rVar2.h0(h2);
            }
            l4.h hVar = (l4.h) h2;
            l1.w a10 = l1.u.a(l1.i.f8573c, b3.c.f1758g0, rVar2, 0);
            int hashCode = Long.hashCode(rVar2.T);
            v2.g l10 = rVar2.l();
            b3.m mVar2 = b3.m.f1770a;
            b3.p c4 = b3.a.c(mVar2, rVar2);
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
            rVar2.b0();
            if (rVar2.S) {
                rVar2.k(f0Var);
            } else {
                rVar2.k0();
            }
            n2.s.C(a10, a4.g.f215e, rVar2);
            n2.s.C(l10, a4.g.f214d, rVar2);
            n2.s.u(rVar2, Integer.valueOf(hashCode), a4.g.f216f);
            n2.s.y(rVar2, a4.g.f217g);
            n2.s.C(c4, a4.g.f213c, rVar2);
            n2.r rVar3 = rVar2;
            long j13 = j2;
            String str3 = str;
            t2 t2Var3 = t2Var;
            e7.b(l0.f.I(rVar2, R.string.retroachievements_unsynchronized_data_info), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((f7) rVar2.j(t2Var)).f5150i, rVar3, 0, 0, 65534);
            e7.c(hVar, l1.c.v(mVar2, 0.0f, 8, 1), 0L, 0L, null, 0L, 0L, 0, false, 0, 0, zb.v.F(new yb.j("pending-achievement", new u1.g0(new l4.x(j13, j13), f9689b)), new yb.j("pending-leaderboard", new u1.g0(new l4.x(j13, j13), f9690c)), new yb.j(str2, new u1.g0(new l4.x(j13, j13), v2.h.c(-1509985660, new q0(10, e0Var), rVar3))), new yb.j(str3, new u1.g0(new l4.x(((f7) rVar3.j(t2Var3)).f5150i.f8887a.f8828b, ((f7) rVar3.j(t2Var3)).f5150i.f8887a.f8828b), f9691d))), null, ((f7) rVar3.j(t2Var3)).f5150i, rVar3, 48, 0, 98300);
            l4.e eVar2 = new l4.e();
            eVar2.append(resources.getString(R.string.retroachievements_unsynchronized_data_connect_internet));
            eVar2.append('\n');
            int g10 = eVar2.g(new j0(0L, 0L, p4.j.Y, (p4.h) null, (p4.i) null, (p4.p) null, (String) null, 0L, (w4.a) null, (w4.p) null, (s4.b) null, 0L, (w4.l) null, (m0) null, 65531));
            try {
                String string = resources.getString(R.string.retroachievements_unsynchronized_data_loss_info);
                string.getClass();
                eVar2.b(string);
                eVar2.e(g10);
                e7.c(eVar2.h(), null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, null, ((f7) rVar3.j(t2Var3)).f5150i, rVar3, 0, 0, 131070);
                rVar2 = rVar3;
                rVar2.p(true);
            } catch (Throwable th2) {
                eVar2.e(g10);
                throw th2;
            }
        } else {
            rVar2.R();
        }
        p1 r5 = rVar2.r();
        if (r5 != null) {
            r5.f9983d = new ai.r0(gVar, gVar2, i2, 17);
        }
    }

    public static final void e(n2.m mVar, int i2) {
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-1829798492);
        if (i2 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i2 & 1, z10)) {
            l1.w a10 = l1.u.a(l1.i.g(8), b3.c.f1758g0, rVar, 6);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(b3.m.f1770a, rVar);
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
            rVar.X(1163639459);
            l4.e eVar = new l4.e();
            eVar.b(l0.f.I(rVar, R.string.retroachievements_unsynchronized_data_synchronized));
            eVar.b(" ");
            u1.l0.m(eVar, "checkmark", "�");
            l4.h h2 = eVar.h();
            rVar.p(false);
            t2 t2Var = g7.f5161b;
            l4.r0 r0Var = ((f7) rVar.j(t2Var)).f5150i;
            p4.j jVar = p4.j.Y;
            Map singletonMap = Collections.singletonMap("checkmark", new u1.g0(new l4.x(((f7) rVar.j(t2Var)).f5150i.f8887a.f8828b, ((f7) rVar.j(t2Var)).f5150i.f8887a.f8828b), f9692e));
            singletonMap.getClass();
            e7.c(h2, null, 0L, 0L, jVar, 0L, 0L, 0, false, 0, 0, singletonMap, null, r0Var, rVar, 196608, 0, 98270);
            e7.b(l0.f.I(rVar, R.string.retroachievements_unsynchronized_data_exiting), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((f7) rVar.j(t2Var)).f5150i, rVar, 0, 0, 65534);
            rVar = rVar;
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mg.m(i2);
        }
    }

    public static final void f(b3.p pVar, cd.h hVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        cd.h hVar2;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-1273173056);
        if (rVar.h(hVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i11 = i10 | i2;
        if ((i11 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i11 & 1, z10)) {
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = n2.s.w(null);
                rVar.h0(L);
            }
            w0 w0Var = (w0) L;
            Object L2 = rVar.L();
            if (L2 == eVar) {
                L2 = new b1(-1.0f);
                rVar.h0(L2);
            }
            b1 b1Var = (b1) L2;
            Object L3 = rVar.L();
            if (L3 == eVar) {
                L3 = n2.s.w(null);
                rVar.h0(L3);
            }
            w0 w0Var2 = (w0) L3;
            boolean h2 = rVar.h(hVar);
            Object L4 = rVar.L();
            if (!h2 && L4 != eVar) {
                hVar2 = hVar;
            } else {
                hVar2 = hVar;
                L4 = new x2(hVar2, w0Var, b1Var, null, 12);
                rVar.h0(L4);
            }
            n2.s.g(hVar2, (mc.p) L4, rVar);
            v0 d4 = l1.p.d(b3.c.A, false);
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
            n2.s.C(d4, a4.g.f215e, rVar);
            n2.s.C(l10, a4.g.f214d, rVar);
            n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            n2.s.y(rVar, a4.g.f217g);
            n2.s.C(c4, a4.g.f213c, rVar);
            i0 i0Var = (i0) w0Var.getValue();
            b3.p e6 = l1.s.f8618b.e(b3.m.f1770a, b3.c.B);
            Object L5 = rVar.L();
            if (L5 == eVar) {
                L5 = new he.g(10, b1Var, w0Var2);
                rVar.h0(L5);
            }
            b3.p q10 = l1.c.q(e6, (mc.l) L5);
            Object L6 = rVar.L();
            if (L6 == eVar) {
                L6 = new ai.o(w0Var2, 5);
                rVar.h0(L6);
            }
            b3.p o5 = y3.c0.o(q10, (mc.l) L6);
            if (i0Var instanceof hh.f0) {
                rVar.X(4395501);
                q8.r.a(o5, ((hh.f0) i0Var).f6523a, rVar, 0);
                rVar.p(false);
            } else if (i0Var instanceof h0) {
                rVar.X(4617399);
                aj.g.d(o5, ((h0) i0Var).f6530a, rVar, 0);
                rVar.p(false);
            } else if (i0Var instanceof hh.g0) {
                rVar.X(4827889);
                a.a.b(o5, ((hh.g0) i0Var).f6527a, rVar, 0);
                rVar.p(false);
            } else if (i0Var == null) {
                rVar.X(5014447);
                rVar.p(false);
            } else {
                throw w.d.i(rVar, -1385333472, false);
            }
            rVar.p(true);
        } else {
            hVar2 = hVar;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new b0(pVar, hVar2, i2, 0);
        }
    }

    public static final void g(cd.h hVar, mc.a aVar, mc.a aVar2, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        mc.a aVar3;
        n2.r rVar;
        boolean z11;
        mc.p x2Var;
        w0 w0Var;
        hVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        n2.r rVar2 = (n2.r) mVar;
        rVar2.Z(-778426770);
        if (rVar2.h(hVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i2 | i10;
        if (rVar2.h(aVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i13 | i11;
        if (rVar2.h(aVar2)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i15 = i14 | i12;
        boolean z12 = false;
        if ((i15 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.O(i15 & 1, z10)) {
            w0 k10 = p7.j.k(hVar, null, rVar2, (i15 & 14) | 48);
            if (((bh.g) k10.getValue()) != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean g10 = rVar2.g(z11);
            Object L = rVar2.L();
            n2.e eVar = n2.l.f9953a;
            if (g10 || L == eVar) {
                L = (bh.g) k10.getValue();
                rVar2.h0(L);
            }
            bh.g gVar = (bh.g) L;
            Object L2 = rVar2.L();
            if (L2 == eVar) {
                L2 = n2.s.w(Boolean.FALSE);
                rVar2.h0(L2);
            }
            w0 w0Var2 = (w0) L2;
            bh.g gVar2 = (bh.g) k10.getValue();
            boolean f8 = rVar2.f(k10);
            if ((i15 & 112) == 32) {
                z12 = true;
            }
            boolean z13 = f8 | z12;
            Object L3 = rVar2.L();
            if (!z13 && L3 != eVar) {
                aVar3 = aVar;
                x2Var = L3;
                w0Var = w0Var2;
            } else {
                w0Var = w0Var2;
                x2Var = new x2(aVar, k10, w0Var, null, 13);
                aVar3 = aVar;
                rVar2.h0(x2Var);
            }
            n2.s.g(gVar2, x2Var, rVar2);
            String I = l0.f.I(rVar2, R.string.retroachievements_unsynchronized_data);
            Object L4 = rVar2.L();
            if (L4 == eVar) {
                L4 = new a3.g(14);
                rVar2.h0(L4);
            }
            rVar = rVar2;
            p7.l.a(I, (mc.a) L4, v2.h.c(-1186299645, new ai.a0(gVar, w0Var, k10, 2), rVar2), v2.h.c(-913176187, new mg.g(aVar2, aVar3, 1), rVar2), false, rVar, 3504, 16);
        } else {
            aVar3 = aVar;
            rVar = rVar2;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.m0((Object) hVar, aVar3, (yb.d) aVar2, i2, 10);
        }
    }
}
