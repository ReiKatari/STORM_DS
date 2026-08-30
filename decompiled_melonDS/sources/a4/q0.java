package a4;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q0 extends nc.l implements mc.l {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(g3.g0 g0Var, g3.p pVar, mc.l lVar) {
        super(1);
        this.B = 7;
        this.L = g0Var;
        this.R = pVar;
        this.X = (nc.l) lVar;
    }

    /* JADX WARN: Type inference failed for: r2v43, types: [nc.l, mc.l] */
    @Override // mc.l
    public final Object k(Object obj) {
        p pVar;
        float f8;
        float f10;
        long j2;
        i3.q0 q0Var;
        long j10;
        boolean booleanValue;
        switch (this.B) {
            case 0:
                k3.d dVar = (k3.d) obj;
                r0 r0Var = (r0) this.L;
                k3.b bVar = r0Var.A;
                p pVar2 = r0Var.B;
                r0Var.B = (p) this.R;
                try {
                    x4.c q10 = dVar.E().q();
                    x4.m r5 = dVar.E().r();
                    i3.q p10 = dVar.E().p();
                    long t5 = dVar.E().t();
                    l3.b bVar2 = (l3.b) dVar.E().L;
                    c1.g gVar = (c1.g) this.X;
                    x4.c q11 = bVar.B.q();
                    x4.m r10 = bVar.B.r();
                    i3.q p11 = bVar.B.p();
                    long t10 = bVar.B.t();
                    n nVar = bVar.B;
                    try {
                        l3.b bVar3 = (l3.b) nVar.L;
                        nVar.H(q10);
                        nVar.I(r5);
                        nVar.G(p10);
                        nVar.J(t5);
                        nVar.L = bVar2;
                        p10.p();
                        try {
                            gVar.k(r0Var);
                            p10.m();
                            n nVar2 = bVar.B;
                            nVar2.H(q11);
                            nVar2.I(r10);
                            nVar2.G(p11);
                            nVar2.J(t10);
                            nVar2.L = bVar3;
                            r0Var.B = pVar2;
                            return yb.y.f14813a;
                        } catch (Throwable th2) {
                            pVar = pVar2;
                            try {
                                p10.m();
                                n nVar3 = bVar.B;
                                nVar3.H(q11);
                                nVar3.I(r10);
                                nVar3.G(p11);
                                nVar3.J(t10);
                                nVar3.L = bVar3;
                                throw th2;
                            } catch (Throwable th3) {
                                th = th3;
                                r0Var.B = pVar;
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        pVar = pVar2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    pVar = pVar2;
                }
            case DSiCameraSource.FrontCamera /* 1 */:
                n2.h0 h0Var = (n2.h0) obj;
                return new b7.n((z2.p) this.L, this.R, (c1.v) this.X);
            case 2:
                if (((Boolean) obj).booleanValue() == ((Boolean) ((c1.i0) this.L).f2438b.f3652d.getValue()).booleanValue()) {
                    return (h3.c) this.R;
                }
                return (h3.c) this.X;
            case 3:
                i3.k0 k0Var = (i3.k0) obj;
                n2.s2 s2Var = (n2.s2) this.R;
                n2.s2 s2Var2 = (n2.s2) this.L;
                float f11 = 1.0f;
                if (s2Var2 != null) {
                    f8 = ((Number) s2Var2.getValue()).floatValue();
                } else {
                    f8 = 1.0f;
                }
                k0Var.d(f8);
                if (s2Var != null) {
                    f10 = ((Number) s2Var.getValue()).floatValue();
                } else {
                    f10 = 1.0f;
                }
                k0Var.k(f10);
                if (s2Var != null) {
                    f11 = ((Number) s2Var.getValue()).floatValue();
                }
                k0Var.l(f11);
                n2.s2 s2Var3 = (n2.s2) this.X;
                if (s2Var3 != null) {
                    j2 = ((i3.q0) s2Var3.getValue()).f6679a;
                } else {
                    j2 = i3.q0.f6677b;
                }
                k0Var.u(j2);
                return yb.y.f14813a;
            case 4:
                c1.d1 d1Var = (c1.d1) this.X;
                int i2 = c1.s0.f2519a[((c1.m0) obj).ordinal()];
                if (i2 != 1) {
                    q0Var = null;
                    if (i2 != 2) {
                        if (i2 == 3) {
                            c1.s2 s2Var4 = d1Var.f2403a;
                        } else {
                            m9.o.o();
                            return null;
                        }
                    } else {
                        c1.s2 s2Var5 = d1Var.f2403a;
                    }
                } else {
                    q0Var = (i3.q0) this.L;
                }
                if (q0Var != null) {
                    j10 = q0Var.f6679a;
                } else {
                    j10 = i3.q0.f6677b;
                }
                return new i3.q0(j10);
            case l1.c.f8511g /* 5 */:
                y3.h1 h1Var = (y3.h1) obj;
                y3.z e6 = h1Var.e();
                if (e6 != null) {
                    boolean q12 = ((y3.x0) this.L).q();
                    c1.y1 y1Var = ((c1.e2) this.R).f2416i0;
                    if (!q12) {
                        y1Var.X = e6;
                    } else {
                        y1Var.Y = e6;
                    }
                }
                y3.h1.k(h1Var, (y3.i1) this.X, 0, 0);
                return yb.y.f14813a;
            case l1.c.f8509e /* 6 */:
                q2 q2Var = (q2) obj;
                e3.f fVar = (e3.f) q2Var;
                if (((e3.b) ((b4.x) l.u((e3.f) this.R)).m10getDragAndDropManager()).f4252b.contains(fVar) && l0.f.c(fVar, pc.a.z((d2.t) this.X))) {
                    ((nc.t) this.L).A = q2Var;
                    return p2.CancelTraversal;
                }
                return p2.ContinueTraversal;
            default:
                g3.g0 g0Var = (g3.g0) obj;
                if (nc.k.a(g0Var, (g3.g0) this.L)) {
                    booleanValue = false;
                } else if (!nc.k.a(g0Var, ((g3.p) this.R).f5529c)) {
                    booleanValue = ((Boolean) ((nc.l) this.X).k(g0Var)).booleanValue();
                } else {
                    a0.j.p("Focus search landed at the root.");
                    return null;
                }
                return Boolean.valueOf(booleanValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Object obj, Object obj2, Object obj3, int i2) {
        super(1);
        this.B = i2;
        this.L = obj;
        this.R = obj2;
        this.X = obj3;
    }
}
