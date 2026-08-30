package rg;

import a4.e;
import a4.f0;
import ai.s0;
import b3.f;
import b3.m;
import f1.n;
import g2.e7;
import g2.f7;
import g2.g7;
import g2.l5;
import g2.n0;
import l1.i;
import l1.m1;
import l1.o1;
import l1.r1;
import l1.u;
import l1.w;
import l1.w0;
import mc.p;
import n2.r;
import n2.s;
import p4.j;
import v2.g;
import v2.h;
import y3.v0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements p {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ String L;
    public final /* synthetic */ v2.c R;
    public final /* synthetic */ p X;

    public /* synthetic */ a(boolean z10, String str, v2.c cVar, p pVar, int i2) {
        this.A = i2;
        this.B = z10;
        this.L = str;
        this.R = cVar;
        this.X = pVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        int i2;
        b3.p pVar;
        float f8;
        m mVar;
        boolean z12;
        boolean z13;
        switch (this.A) {
            case 0:
                n2.m mVar2 = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = (r) mVar2;
                if (rVar.O(intValue & 1, z10)) {
                    n0.b(l1.c.D(r1.b(m.f1770a, 1.0f), new l5(26)), null, 0L, h.c(1626890049, new a(this.B, this.L, this.R, this.X, 1), rVar), rVar, 1572864, 62);
                } else {
                    rVar.R();
                }
                return y.f14813a;
            default:
                n2.m mVar3 = (n2.m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r rVar2 = (r) mVar3;
                if (rVar2.O(intValue2 & 1, z11)) {
                    m mVar4 = m.f1770a;
                    b3.p b10 = r1.b(mVar4, 1.0f);
                    l1.d dVar = i.f8573c;
                    f fVar = b3.c.f1758g0;
                    w a10 = u.a(dVar, fVar, rVar2, 0);
                    int hashCode = Long.hashCode(rVar2.T);
                    g l10 = rVar2.l();
                    b3.p c4 = b3.a.c(b10, rVar2);
                    a4.h.f220a.getClass();
                    f0 f0Var = a4.g.f212b;
                    rVar2.b0();
                    if (rVar2.S) {
                        rVar2.k(f0Var);
                    } else {
                        rVar2.k0();
                    }
                    a4.f fVar2 = a4.g.f215e;
                    s.C(a10, fVar2, rVar2);
                    a4.f fVar3 = a4.g.f214d;
                    s.C(l10, fVar3, rVar2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    a4.f fVar4 = a4.g.f216f;
                    s.u(rVar2, valueOf, fVar4);
                    e eVar = a4.g.f217g;
                    s.y(rVar2, eVar);
                    a4.f fVar5 = a4.g.f213c;
                    s.C(c4, fVar5, rVar2);
                    float f10 = 24;
                    b3.p v10 = l1.c.v(r1.e(mVar4, 64, 0.0f, 2), f10, 0.0f, 2);
                    v0 d4 = l1.p.d(b3.c.R, false);
                    int hashCode2 = Long.hashCode(rVar2.T);
                    g l11 = rVar2.l();
                    b3.p c10 = b3.a.c(v10, rVar2);
                    rVar2.b0();
                    if (rVar2.S) {
                        rVar2.k(f0Var);
                    } else {
                        rVar2.k0();
                    }
                    s.C(d4, fVar2, rVar2);
                    s.C(l11, fVar3, rVar2);
                    w.d.x(hashCode2, rVar2, fVar4, rVar2, eVar);
                    s.C(c10, fVar5, rVar2);
                    e7.b(this.L, null, 0L, 0L, j.Y, 0L, null, 0L, 2, false, 2, 0, null, ((f7) rVar2.j(g7.f5161b)).f5147f, rVar2, 196608, 3120, 55262);
                    rVar2.p(true);
                    boolean z14 = this.B;
                    if (z14) {
                        rVar2.X(-2120780912);
                        pVar = n.r(mVar4, n.o(rVar2));
                        i2 = 0;
                        rVar2.p(false);
                    } else {
                        i2 = 0;
                        rVar2.X(-2120779565);
                        rVar2.p(false);
                        pVar = mVar4;
                    }
                    w a11 = u.a(dVar, fVar, rVar2, i2);
                    int hashCode3 = Long.hashCode(rVar2.T);
                    g l12 = rVar2.l();
                    b3.p c11 = b3.a.c(pVar, rVar2);
                    rVar2.b0();
                    if (rVar2.S) {
                        rVar2.k(f0Var);
                    } else {
                        rVar2.k0();
                    }
                    s.C(a11, fVar2, rVar2);
                    s.C(l12, fVar3, rVar2);
                    w.d.x(hashCode3, rVar2, fVar4, rVar2, eVar);
                    s.C(c11, fVar5, rVar2);
                    v2.c cVar = this.R;
                    if (z14) {
                        rVar2.X(-1306580429);
                        f8 = f10;
                        cVar.i(l1.c.b(2, f8), rVar2, 6);
                        z12 = false;
                        rVar2.p(false);
                        mVar = mVar4;
                    } else {
                        f8 = f10;
                        rVar2.X(-1306482252);
                        if (1.0f <= 0.0d) {
                            m1.a.a("invalid weight; must be greater than zero");
                        }
                        w0 w0Var = new w0(1.0f, false);
                        v0 d10 = l1.p.d(b3.c.A, false);
                        int hashCode4 = Long.hashCode(rVar2.T);
                        g l13 = rVar2.l();
                        b3.p c12 = b3.a.c(w0Var, rVar2);
                        rVar2.b0();
                        mVar = mVar4;
                        if (rVar2.S) {
                            rVar2.k(f0Var);
                        } else {
                            rVar2.k0();
                        }
                        s.C(d10, fVar2, rVar2);
                        s.C(l13, fVar3, rVar2);
                        w.d.x(hashCode4, rVar2, fVar4, rVar2, eVar);
                        s.C(c12, fVar5, rVar2);
                        cVar.i(l1.c.b(2, f8), rVar2, 6);
                        rVar2.p(true);
                        z12 = false;
                        rVar2.p(false);
                    }
                    p pVar2 = this.X;
                    if (pVar2 == null) {
                        rVar2.X(-1306261285);
                        rVar2.p(z12);
                        z13 = true;
                    } else {
                        rVar2.X(-1306261284);
                        float f11 = 8;
                        b3.p w10 = l1.c.w(r1.b(mVar, 1.0f), f8, f11, f11, f11);
                        o1 a12 = m1.a(new l1.g(f11, true, new s0(7, b3.c.f1760i0)), b3.c.f1755d0, rVar2, 6);
                        int hashCode5 = Long.hashCode(rVar2.T);
                        g l14 = rVar2.l();
                        b3.p c13 = b3.a.c(w10, rVar2);
                        rVar2.b0();
                        if (rVar2.S) {
                            rVar2.k(f0Var);
                        } else {
                            rVar2.k0();
                        }
                        s.C(a12, fVar2, rVar2);
                        s.C(l14, fVar3, rVar2);
                        w.d.x(hashCode5, rVar2, fVar4, rVar2, eVar);
                        s.C(c13, fVar5, rVar2);
                        pVar2.j(rVar2, 0);
                        z13 = true;
                        rVar2.p(true);
                        rVar2.p(false);
                    }
                    rVar2.p(z13);
                    rVar2.p(z13);
                } else {
                    rVar2.R();
                }
                return y.f14813a;
        }
    }
}
