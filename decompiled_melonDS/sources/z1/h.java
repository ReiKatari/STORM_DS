package z1;

import a4.f0;
import a5.r0;
import ai.m0;
import ai.s;
import ai.v;
import android.view.View;
import n2.f1;
import n2.o1;
import n2.p1;
import n2.r;
import n2.w0;
import y3.v0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final v2.c f14877a = new v2.c(636288403, false, new v1.a(1));

    /* renamed from: b  reason: collision with root package name */
    public static final v2.c f14878b = new v2.c(-1357803046, false, new v1.a(2));

    public static final void a(b3.p pVar, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        b3.p pVar2;
        v2.c cVar2;
        int i11;
        int i12;
        r rVar = (r) mVar;
        rVar.Z(790527681);
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
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                f1 f1Var = new f1(null, n2.e.R);
                rVar.h0(f1Var);
                L = f1Var;
            }
            w0 w0Var = (w0) L;
            Object L2 = rVar.L();
            if (L2 == eVar) {
                L2 = new s(w0Var, 27);
                rVar.h0(L2);
            }
            mc.a aVar = (mc.a) L2;
            r0 r0Var = k.f14879a;
            b2.d k10 = pc.a.k(f14878b, rVar, 6);
            pVar2 = pVar;
            cVar2 = cVar;
            n2.s.b(new o1[]{b2.i.f1749b.a(e(2, aVar, rVar)), b2.i.f1748a.a(k10)}, v2.h.c(1070596993, new v(pVar2, w0Var, cVar2, k10, aVar, 7), rVar), rVar, 56);
        } else {
            pVar2 = pVar;
            cVar2 = cVar;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new g(pVar2, cVar2, i2, 4);
        }
    }

    public static final void b(b3.p pVar, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        r rVar = (r) mVar;
        rVar.Z(155925518);
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
            if (rVar.j(b2.i.f1748a) != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (rVar.j(b2.i.f1749b) != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 && z12) {
                rVar.X(-1977187922);
                v0 d4 = l1.p.d(b3.c.A, true);
                int hashCode = Long.hashCode(rVar.T);
                v2.g l10 = rVar.l();
                b3.p c4 = b3.a.c(pVar, rVar);
                a4.h.f220a.getClass();
                f0 f0Var = a4.g.f212b;
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
                cVar.j(rVar, Integer.valueOf((i10 >> 3) & 14));
                rVar.p(true);
                rVar.p(false);
            } else if (z11) {
                rVar.X(-1976997706);
                c(pVar, cVar, rVar, i10 & 126);
                rVar.p(false);
            } else if (z12) {
                rVar.X(-1976846922);
                k.d(pVar, cVar, rVar, i10 & 126);
                rVar.p(false);
            } else {
                rVar.X(-1976716505);
                a(pVar, cVar, rVar, i10 & 126);
                rVar.p(false);
            }
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new g(pVar, cVar, i2, 3);
        }
    }

    public static final void c(b3.p pVar, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        r rVar = (r) mVar;
        rVar.Z(2064964257);
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
            d(pVar, cVar, rVar, ((i10 << 3) & 896) | (i10 & 14) | 48);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new g(pVar, cVar, i2, 0);
        }
    }

    public static final void d(b3.p pVar, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        r rVar = (r) mVar;
        rVar.Z(771959668);
        if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(null)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i2 & 384) == 0) {
            if (rVar.h(cVar)) {
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
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                f1 f1Var = new f1(null, n2.e.R);
                rVar.h0(f1Var);
                L = f1Var;
            }
            w0 w0Var = (w0) L;
            Object L2 = rVar.L();
            if (L2 == eVar) {
                L2 = new s(w0Var, 26);
                rVar.h0(L2);
            }
            n2.s.a(b2.i.f1749b.a(e(0, (mc.a) L2, rVar)), v2.h.c(-291176396, new m0(pVar, w0Var, cVar, 18), rVar), rVar, 56);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new g(pVar, cVar, i2, 1);
        }
    }

    public static final f e(int i2, mc.a aVar, n2.m mVar) {
        r rVar = (r) mVar;
        View view = (View) rVar.j(b4.r0.f1941f);
        boolean f8 = rVar.f(view);
        Object L = rVar.L();
        n2.e eVar = n2.l.f9953a;
        if (f8 || L == eVar) {
            L = new f(view, null, aVar);
            rVar.h0(L);
        }
        f fVar = (f) L;
        boolean h2 = rVar.h(fVar);
        Object L2 = rVar.L();
        if (h2 || L2 == eVar) {
            L2 = new a(fVar, 3);
            rVar.h0(L2);
        }
        n2.s.d(fVar, (mc.l) L2, rVar);
        return fVar;
    }
}
