package ai;

import g2.d1;
import g2.e7;
import g2.f7;
import g2.g7;
import g2.v2;
import l1.m1;
import l1.o1;
import l1.r1;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ n2.w0 B;
    public final /* synthetic */ n2.w0 L;
    public final /* synthetic */ mc.a R;
    public final /* synthetic */ mc.p X;

    public /* synthetic */ q(n2.w0 w0Var, n2.w0 w0Var2, mc.a aVar, mc.p pVar, int i2) {
        this.A = i2;
        this.B = w0Var;
        this.L = w0Var2;
        this.R = aVar;
        this.X = pVar;
    }

    /* JADX WARN: Type inference failed for: r13v8, types: [q4.g0, java.lang.Object] */
    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        switch (this.A) {
            case 0:
                n2.m mVar = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    g2.n0.b(r1.b(r1.m(b3.m.f1770a, 0.0f, 450, 1), 0.85f), null, 0L, v2.h.c(-498924677, new q(this.B, this.L, this.R, this.X, 1), rVar), rVar, 1572870, 62);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
            default:
                n2.m mVar2 = (n2.m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar2 = (n2.r) mVar2;
                if (rVar2.O(intValue2 & 1, z11)) {
                    l1.d dVar = l1.i.f8573c;
                    b3.f fVar = b3.c.f1758g0;
                    l1.w a10 = l1.u.a(dVar, fVar, rVar2, 0);
                    int hashCode = Long.hashCode(rVar2.T);
                    v2.g l10 = rVar2.l();
                    b3.m mVar3 = b3.m.f1770a;
                    b3.p c4 = b3.a.c(mVar3, rVar2);
                    a4.h.f220a.getClass();
                    mc.a aVar = a4.g.f212b;
                    rVar2.b0();
                    if (rVar2.S) {
                        rVar2.k(aVar);
                    } else {
                        rVar2.k0();
                    }
                    a4.f fVar2 = a4.g.f215e;
                    n2.s.C(a10, fVar2, rVar2);
                    a4.f fVar3 = a4.g.f214d;
                    n2.s.C(l10, fVar3, rVar2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    a4.f fVar4 = a4.g.f216f;
                    n2.s.u(rVar2, valueOf, fVar4);
                    a4.e eVar = a4.g.f217g;
                    n2.s.y(rVar2, eVar);
                    a4.f fVar5 = a4.g.f213c;
                    n2.s.C(c4, fVar5, rVar2);
                    float f8 = 24;
                    b3.p v10 = l1.c.v(r1.e(mVar3, 64, 0.0f, 2), f8, 0.0f, 2);
                    y3.v0 d4 = l1.p.d(b3.c.R, false);
                    int hashCode2 = Long.hashCode(rVar2.T);
                    v2.g l11 = rVar2.l();
                    b3.p c10 = b3.a.c(v10, rVar2);
                    rVar2.b0();
                    if (rVar2.S) {
                        rVar2.k(aVar);
                    } else {
                        rVar2.k0();
                    }
                    n2.s.C(d4, fVar2, rVar2);
                    n2.s.C(l11, fVar3, rVar2);
                    w.d.x(hashCode2, rVar2, fVar4, rVar2, eVar);
                    n2.s.C(c10, fVar5, rVar2);
                    e7.b(l0.f.I(rVar2, R.string.login_with_retro_achievements), mVar3, 0L, 0L, p4.j.Y, 0L, null, 0L, 2, false, 2, 0, null, ((f7) rVar2.j(g7.f5161b)).f5147f, rVar2, 196656, 3120, 55260);
                    rVar2.p(true);
                    float f10 = 8;
                    b3.p u4 = l1.c.u(mVar3, f8, f10);
                    l1.w a11 = l1.u.a(l1.i.g(4), fVar, rVar2, 6);
                    int hashCode3 = Long.hashCode(rVar2.T);
                    v2.g l12 = rVar2.l();
                    b3.p c11 = b3.a.c(u4, rVar2);
                    rVar2.b0();
                    if (rVar2.S) {
                        rVar2.k(aVar);
                    } else {
                        rVar2.k0();
                    }
                    n2.s.C(a11, fVar2, rVar2);
                    n2.s.C(l12, fVar3, rVar2);
                    w.d.x(hashCode3, rVar2, fVar4, rVar2, eVar);
                    n2.s.C(c11, fVar5, rVar2);
                    b3.p b10 = r1.b(mVar3, 1.0f);
                    c3.o.f2572a.getClass();
                    b3.p a12 = i4.n.a(b10, false, new a4.a(11, c3.n.f2568b));
                    n2.w0 w0Var = this.B;
                    String str = (String) w0Var.getValue();
                    d1 e6 = og.a.e(rVar2);
                    boolean f11 = rVar2.f(w0Var);
                    Object L = rVar2.L();
                    Object obj3 = n2.l.f9953a;
                    if (f11 || L == obj3) {
                        L = new o(w0Var, 0);
                        rVar2.h0(L);
                    }
                    v2.a(str, (mc.l) L, a12, false, null, n.f833a, null, null, null, 0, 0, null, e6, rVar2, 1572864, 0, 524216);
                    b3.p a13 = i4.n.a(r1.b(mVar3, 1.0f), false, new a4.a(11, c3.n.f2569c));
                    n2.w0 w0Var2 = this.L;
                    String str2 = (String) w0Var2.getValue();
                    ?? obj4 = new Object();
                    u1.o0 o0Var = new u1.o0(0, 7, 0, 121);
                    d1 e10 = og.a.e(rVar2);
                    Object L2 = rVar2.L();
                    if (L2 == obj3) {
                        L2 = new o(w0Var2, 1);
                        rVar2.h0(L2);
                    }
                    v2.a(str2, (mc.l) L2, a13, false, null, n.f834b, obj4, o0Var, null, 0, 0, null, e10, rVar2, 1572912, 384, 518072);
                    rVar2.p(true);
                    b3.p t5 = l1.c.t(r1.c(r1.b(mVar3, 1.0f), 52), f10);
                    o1 a14 = m1.a(l1.i.f8572b, b3.c.f1756e0, rVar2, 54);
                    int hashCode4 = Long.hashCode(rVar2.T);
                    v2.g l13 = rVar2.l();
                    b3.p c12 = b3.a.c(t5, rVar2);
                    rVar2.b0();
                    if (rVar2.S) {
                        rVar2.k(aVar);
                    } else {
                        rVar2.k0();
                    }
                    n2.s.C(a14, fVar2, rVar2);
                    n2.s.C(l13, fVar3, rVar2);
                    w.d.x(hashCode4, rVar2, fVar4, rVar2, eVar);
                    n2.s.C(c12, fVar5, rVar2);
                    g2.n0.j(this.R, null, false, og.a.f(rVar2), n.f835c, rVar2, 805306368, 382);
                    Object obj5 = this.X;
                    boolean f12 = rVar2.f(obj5) | rVar2.f(w0Var);
                    Object L3 = rVar2.L();
                    if (f12 || L3 == obj3) {
                        L3 = new p(obj5, w0Var, w0Var2, 0);
                        rVar2.h0(L3);
                    }
                    g2.n0.j((mc.a) L3, null, false, og.a.f(rVar2), n.f836d, rVar2, 805306368, 382);
                    rVar2.p(true);
                    rVar2.p(true);
                } else {
                    rVar2.R();
                }
                return yb.y.f14813a;
        }
    }
}
