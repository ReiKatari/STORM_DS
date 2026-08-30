package ug;

import a4.f0;
import g2.e7;
import g2.f7;
import g2.g7;
import g2.n0;
import java.util.List;
import l1.m1;
import l1.n1;
import l1.o1;
import l1.r1;
import l1.u;
import l1.w;
import mc.l;
import mc.p;
import n2.m;
import n2.r;
import n2.s;
import y3.v0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements p {
    public final /* synthetic */ int A;
    public final /* synthetic */ List B;
    public final /* synthetic */ l L;
    public final /* synthetic */ mc.a R;
    public final /* synthetic */ int X;
    public final /* synthetic */ String Y;

    public /* synthetic */ g(int i2, int i10, String str, List list, mc.a aVar, l lVar) {
        this.A = i10;
        this.B = list;
        this.L = lVar;
        this.R = aVar;
        this.X = i2;
        this.Y = str;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        n2.e eVar;
        mc.a aVar;
        switch (this.A) {
            case 0:
                m mVar = (m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = (r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    n0.b(r1.b(b3.m.f1770a, 1.0f), null, 0L, v2.h.c(-1304512071, new g(this.X, 1, this.Y, this.B, this.R, this.L), rVar), rVar, 1572870, 62);
                } else {
                    rVar.R();
                }
                return y.f14813a;
            default:
                m mVar2 = (m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r rVar2 = (r) mVar2;
                if (rVar2.O(intValue2 & 1, z11)) {
                    b3.m mVar3 = b3.m.f1770a;
                    b3.p b10 = r1.b(mVar3, 1.0f);
                    w a10 = u.a(l1.i.f8573c, b3.c.f1758g0, rVar2, 0);
                    int hashCode = Long.hashCode(rVar2.T);
                    v2.g l10 = rVar2.l();
                    b3.p c4 = b3.a.c(b10, rVar2);
                    a4.h.f220a.getClass();
                    f0 f0Var = a4.g.f212b;
                    rVar2.b0();
                    if (rVar2.S) {
                        rVar2.k(f0Var);
                    } else {
                        rVar2.k0();
                    }
                    a4.f fVar = a4.g.f215e;
                    s.C(a10, fVar, rVar2);
                    a4.f fVar2 = a4.g.f214d;
                    s.C(l10, fVar2, rVar2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    a4.f fVar3 = a4.g.f216f;
                    s.u(rVar2, valueOf, fVar3);
                    a4.e eVar2 = a4.g.f217g;
                    s.y(rVar2, eVar2);
                    a4.f fVar4 = a4.g.f213c;
                    s.C(c4, fVar4, rVar2);
                    float f8 = 24;
                    b3.p x9 = l1.c.x(r1.e(mVar3, 64, 0.0f, 2), f8, 0.0f, f8, 0.0f, 10);
                    v0 d4 = l1.p.d(b3.c.R, false);
                    int hashCode2 = Long.hashCode(rVar2.T);
                    v2.g l11 = rVar2.l();
                    b3.p c10 = b3.a.c(x9, rVar2);
                    rVar2.b0();
                    if (rVar2.S) {
                        rVar2.k(f0Var);
                    } else {
                        rVar2.k0();
                    }
                    s.C(d4, fVar, rVar2);
                    s.C(l11, fVar2, rVar2);
                    w.d.x(hashCode2, rVar2, fVar3, rVar2, eVar2);
                    s.C(c10, fVar4, rVar2);
                    e7.b(this.Y, mVar3, 0L, 0L, p4.j.Y, 0L, null, 0L, 2, false, 2, 0, null, ((f7) rVar2.j(g7.f5161b)).f5147f, rVar2, 196656, 3120, 55260);
                    rVar2.p(true);
                    List list = this.B;
                    boolean h2 = rVar2.h(list);
                    l lVar = this.L;
                    boolean f10 = h2 | rVar2.f(lVar);
                    mc.a aVar2 = this.R;
                    boolean f11 = f10 | rVar2.f(aVar2);
                    int i2 = this.X;
                    boolean d10 = f11 | rVar2.d(i2);
                    Object L = rVar2.L();
                    n2.e eVar3 = n2.l.f9953a;
                    if (d10 || L == eVar3) {
                        eVar = eVar3;
                        aVar = aVar2;
                        n1 n1Var = new n1(list, lVar, aVar, i2, 3);
                        rVar2.h0(n1Var);
                        L = n1Var;
                    } else {
                        aVar = aVar2;
                        eVar = eVar3;
                    }
                    n2.e eVar4 = eVar;
                    mc.a aVar3 = aVar;
                    k0.d.c(null, null, null, null, null, null, false, null, (l) L, rVar2, 0, 511);
                    b3.p t5 = l1.c.t(r1.c(r1.b(mVar3, 1.0f), 52), 8);
                    o1 a11 = m1.a(l1.i.f8572b, b3.c.f1756e0, rVar2, 54);
                    int hashCode3 = Long.hashCode(rVar2.T);
                    v2.g l12 = rVar2.l();
                    b3.p c11 = b3.a.c(t5, rVar2);
                    rVar2.b0();
                    if (rVar2.S) {
                        rVar2.k(f0Var);
                    } else {
                        rVar2.k0();
                    }
                    s.C(a11, fVar, rVar2);
                    s.C(l12, fVar2, rVar2);
                    w.d.x(hashCode3, rVar2, fVar3, rVar2, eVar2);
                    s.C(c11, fVar4, rVar2);
                    boolean f12 = rVar2.f(aVar3);
                    Object L2 = rVar2.L();
                    if (f12 || L2 == eVar4) {
                        L2 = new lg.e(8, aVar3);
                        rVar2.h0(L2);
                    }
                    n0.j((mc.a) L2, null, false, og.a.f(rVar2), b.f13550a, rVar2, 805306368, 382);
                    rVar2.p(true);
                    rVar2.p(true);
                } else {
                    rVar2.R();
                }
                return y.f14813a;
        }
    }
}
