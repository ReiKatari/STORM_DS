package og;

import a5.f0;
import ai.a0;
import ai.m0;
import android.view.View;
import b4.r0;
import c1.c1;
import c1.e0;
import g2.b0;
import g2.d1;
import g2.l0;
import g2.n0;
import g2.o0;
import g2.q0;
import g2.w1;
import i3.z;
import java.util.List;
import java.util.UUID;
import l1.h1;
import l1.u;
import l1.w;
import n2.p1;
import n2.r;
import n2.s;
import n2.t2;
import n2.w0;
import p7.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final v2.c f10986a = new v2.c(-1656469621, false, new mg.m(7, (byte) 0));

    /* renamed from: b  reason: collision with root package name */
    public static final v2.c f10987b = new v2.c(1918584073, false, new mg.m(8, (byte) 0));

    public static final void a(mc.a aVar, f0 f0Var, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        aVar.getClass();
        r rVar = (r) mVar;
        rVar.Z(1926476888);
        if ((i2 & 6) == 0) {
            if (rVar.h(aVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | i2;
        } else {
            i10 = i2;
        }
        int i13 = i10 | 48;
        if ((i2 & 384) == 0) {
            if (rVar.h(cVar)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i13 |= i11;
        }
        if ((i13 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i13 & 1, z10)) {
            f0Var = new f0(7);
            View view = (View) rVar.j(r0.f1941f);
            n2.p z11 = s.z(rVar);
            w0 A = s.A(cVar, rVar);
            w0 A2 = s.A(aVar, rVar);
            Object[] objArr = new Object[0];
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = new od.n(4);
                rVar.h0(L);
            }
            UUID uuid = (UUID) y2.k.c(objArr, (mc.a) L, rVar, 48);
            Object L2 = rVar.L();
            e eVar2 = L2;
            if (L2 == eVar) {
                uuid.getClass();
                e eVar3 = new e(view, f0Var, uuid);
                v2.c cVar2 = new v2.c(-1782407382, true, new g2.o(A, 1));
                eVar3.setParentCompositionContext(z11);
                eVar3.f10996k0.setValue(cVar2);
                eVar3.f10995j0 = true;
                eVar3.f10994i0 = (mc.a) A2.getValue();
                rVar.h0(eVar3);
                eVar2 = eVar3;
            }
            e eVar4 = (e) eVar2;
            boolean h2 = rVar.h(eVar4);
            Object L3 = rVar.L();
            if (h2 || L3 == eVar) {
                L3 = new b(eVar4, 0);
                rVar.h0(L3);
            }
            s.d(eVar4, (mc.l) L3, rVar);
        } else {
            rVar.R();
        }
        f0 f0Var2 = f0Var;
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new b2.f(aVar, f0Var2, cVar, i2, 5);
        }
    }

    public static final void b(mc.a aVar, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        aVar.getClass();
        r rVar = (r) mVar;
        rVar.Z(-1642214335);
        if ((i2 & 6) == 0) {
            if (rVar.h(aVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(cVar)) {
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
            View view = (View) rVar.j(r0.f1941f);
            n2.p z11 = s.z(rVar);
            w0 A = s.A(cVar, rVar);
            w0 A2 = s.A(aVar, rVar);
            Object[] objArr = new Object[0];
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = new od.n(5);
                rVar.h0(L);
            }
            UUID uuid = (UUID) y2.k.c(objArr, (mc.a) L, rVar, 48);
            Object[] objArr2 = new Object[0];
            Object L2 = rVar.L();
            if (L2 == eVar) {
                L2 = new od.n(6);
                rVar.h0(L2);
            }
            w0 w0Var = (w0) y2.k.c(objArr2, (mc.a) L2, rVar, 48);
            Object L3 = rVar.L();
            h hVar = L3;
            if (L3 == eVar) {
                boolean booleanValue = ((Boolean) w0Var.getValue()).booleanValue();
                uuid.getClass();
                h hVar2 = new h(view, booleanValue, uuid);
                v2.c cVar2 = new v2.c(-1221710001, true, new g2.o(A, 2));
                hVar2.setParentCompositionContext(z11);
                hVar2.f11004j0.setValue(cVar2);
                hVar2.f11003i0 = true;
                hVar2.f11002h0 = (mc.a) A2.getValue();
                rVar.h0(hVar2);
                hVar = hVar2;
            }
            h hVar3 = (h) hVar;
            boolean h2 = rVar.h(hVar3) | rVar.f(w0Var);
            Object L4 = rVar.L();
            if (h2 || L4 == eVar) {
                L4 = new he.g(16, hVar3, w0Var);
                rVar.h0(L4);
            }
            s.d(hVar3, (mc.l) L4, rVar);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.r(aVar, cVar, i2, 9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(b3.p pVar, final List list, mc.l lVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        float f8;
        int i13;
        v2.c cVar = zg.a.f15085f;
        lVar.getClass();
        r rVar = (r) mVar;
        rVar.Z(-1139404281);
        if (rVar.f(pVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i2 | i10;
        if (rVar.h(list)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11;
        if (rVar.h(lVar)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i16 = i15 | i12;
        int i17 = 1;
        if ((i16 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i16 & 1, z10)) {
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = s.w(g.COLLAPSED);
                rVar.h0(L);
            }
            w0 w0Var = (w0) L;
            w a10 = u.a(l1.i.f8573c, b3.c.f1760i0, rVar, 48);
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
            s.C(a10, a4.g.f215e, rVar);
            s.C(l10, a4.g.f214d, rVar);
            s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            s.y(rVar, a4.g.f217g);
            s.C(c4, a4.g.f213c, rVar);
            rVar.X(1194218642);
            final int i18 = 0;
            for (Object obj : list) {
                int i19 = i18 + 1;
                if (i18 >= 0) {
                    f fVar = (f) obj;
                    if (w0Var.getValue() == g.EXPANDED) {
                        i13 = i17;
                    } else {
                        i13 = 0;
                    }
                    boolean h2 = rVar.h(list) | rVar.d(i18);
                    Object L2 = rVar.L();
                    if (h2 || L2 == eVar) {
                        L2 = new mc.l() { // from class: og.p
                            @Override // mc.l
                            public final Object k(Object obj2) {
                                int size;
                                int i20;
                                int i21 = r3;
                                int intValue = ((Integer) obj2).intValue();
                                switch (i21) {
                                    case 0:
                                        size = list.size();
                                        i20 = i18;
                                        break;
                                    default:
                                        size = list.size();
                                        i20 = i18;
                                        break;
                                }
                                return Integer.valueOf((size - i20) * intValue);
                            }
                        };
                        rVar.h0(L2);
                    }
                    c1 a11 = c1.w0.i((mc.l) L2, i17).a(c1.w0.d(null, 3));
                    boolean h10 = rVar.h(list) | rVar.d(i18);
                    Object L3 = rVar.L();
                    if (h10 || L3 == eVar) {
                        L3 = new mc.l() { // from class: og.p
                            @Override // mc.l
                            public final Object k(Object obj2) {
                                int size;
                                int i20;
                                int i21 = r3;
                                int intValue = ((Integer) obj2).intValue();
                                switch (i21) {
                                    case 0:
                                        size = list.size();
                                        i20 = i18;
                                        break;
                                    default:
                                        size = list.size();
                                        i20 = i18;
                                        break;
                                }
                                return Integer.valueOf((size - i20) * intValue);
                            }
                        };
                        rVar.h0(L3);
                    }
                    r rVar2 = rVar;
                    e0.e(i13, null, a11, c1.w0.k((mc.l) L3).a(c1.w0.e(null, 3)), null, v2.h.c(-66629038, new a0(lVar, fVar, w0Var, 4), rVar), rVar2, 1572870, 18);
                    i18 = i19;
                    rVar = rVar2;
                    i17 = 1;
                } else {
                    t.F();
                    throw null;
                }
            }
            rVar.p(false);
            if (w0Var.getValue() == g.COLLAPSED) {
                f8 = 0.0f;
            } else {
                f8 = 45.0f;
            }
            float floatValue = ((Number) d1.e.b(f8, rVar, 0, 30).getValue()).floatValue();
            int i20 = (floatValue > 0.0f ? 1 : (floatValue == 0.0f ? 0 : -1));
            b3.p pVar2 = b3.m.f1770a;
            if (i20 != 0) {
                pVar2 = z.o(pVar2, 0.0f, floatValue, null, 524031);
            }
            b3.p pVar3 = pVar2;
            Object L4 = rVar.L();
            if (L4 == eVar) {
                L4 = new ai.s(w0Var, 16);
                rVar.h0(L4);
            }
            w1.a((mc.a) L4, pVar3, null, 0L, 0L, null, cVar, rVar, 12582918);
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new m0(pVar, list, lVar, i2, 14);
        }
    }

    public static final g2.r0 d(n2.m mVar) {
        h1 h1Var = b0.f5046a;
        t2 t2Var = g2.m0.f5257a;
        r rVar = (r) mVar;
        return b0.a(((l0) rVar.j(t2Var)).i(), ((l0) rVar.j(t2Var)).e(), mVar, 0, 12);
    }

    public static final d1 e(r rVar) {
        float f8;
        float f10;
        t2 t2Var = g2.m0.f5257a;
        long i2 = ((l0) rVar.j(t2Var)).i();
        long c4 = ((l0) rVar.j(t2Var)).c();
        long b10 = i3.s.b(((l0) rVar.j(t2Var)).i(), n0.r(rVar));
        long b11 = i3.s.b(((l0) rVar.j(t2Var)).i(), n0.r(rVar));
        long b12 = i3.s.b(((l0) rVar.j(t2Var)).i(), n0.r(rVar));
        n2.b0 b0Var = q0.f5361a;
        long b13 = i3.s.b(((i3.s) rVar.j(b0Var)).f6689a, ((Number) rVar.j(o0.f5308a)).floatValue());
        long j2 = ((i3.s) rVar.j(b0Var)).f6689a;
        if (((l0) rVar.j(t2Var)).k()) {
            z.r(j2);
        } else {
            z.r(j2);
        }
        long b14 = i3.s.b(b13, 0.38f);
        long j10 = i3.s.f6686g;
        long b15 = ((l0) rVar.j(t2Var)).b();
        long j11 = ((i3.s) rVar.j(b0Var)).f6689a;
        if (((l0) rVar.j(t2Var)).k()) {
            z.r(j11);
        } else {
            z.r(j11);
        }
        long b16 = i3.s.b(c4, 0.38f);
        long b17 = ((l0) rVar.j(t2Var)).b();
        long b18 = i3.s.b(((l0) rVar.j(t2Var)).f(), 0.54f);
        long j12 = ((i3.s) rVar.j(b0Var)).f6689a;
        if (((l0) rVar.j(t2Var)).k()) {
            z.r(j12);
        } else {
            z.r(j12);
        }
        long b19 = i3.s.b(b18, 0.38f);
        long b20 = i3.s.b(((l0) rVar.j(t2Var)).f(), 0.54f);
        long j13 = ((i3.s) rVar.j(b0Var)).f6689a;
        if (((l0) rVar.j(t2Var)).k()) {
            z.r(j13);
        } else {
            z.r(j13);
        }
        long b21 = i3.s.b(b20, 0.38f);
        long b22 = ((l0) rVar.j(t2Var)).b();
        long f11 = ((l0) rVar.j(t2Var)).f();
        long j14 = ((i3.s) rVar.j(b0Var)).f6689a;
        if (!((l0) rVar.j(t2Var)).k() ? z.r(j14) < 0.5d : z.r(j14) > 0.5d) {
            f8 = 0.74f;
        } else {
            f8 = 0.6f;
        }
        long b23 = i3.s.b(f11, f8);
        long j15 = ((i3.s) rVar.j(b0Var)).f6689a;
        if (((l0) rVar.j(t2Var)).k()) {
            z.r(j15);
        } else {
            z.r(j15);
        }
        long b24 = i3.s.b(b23, 0.38f);
        long b25 = ((l0) rVar.j(t2Var)).b();
        long f12 = ((l0) rVar.j(t2Var)).f();
        long j16 = ((i3.s) rVar.j(b0Var)).f6689a;
        if (!((l0) rVar.j(t2Var)).k() ? z.r(j16) < 0.5d : z.r(j16) > 0.5d) {
            f10 = 0.74f;
        } else {
            f10 = 0.6f;
        }
        long b26 = i3.s.b(f12, f10);
        long j17 = ((i3.s) rVar.j(b0Var)).f6689a;
        if (((l0) rVar.j(t2Var)).k()) {
            z.r(j17);
        } else {
            z.r(j17);
        }
        return new d1(b13, b14, i2, b15, b10, c4, b17, b16, b18, b19, b18, b20, b12, b21, b22, j10, b11, b23, b24, b25, b26, i3.s.b(b26, 0.38f));
    }

    public static final g2.r0 f(n2.m mVar) {
        h1 h1Var = b0.f5046a;
        return b0.b(((l0) ((r) mVar).j(g2.m0.f5257a)).i(), mVar, 5);
    }
}
