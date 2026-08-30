package ah;

import java.util.ArrayList;
import kf.d2;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z0 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ boolean Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Object f820b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(boolean z10, g2.n nVar, cc.c cVar) {
        super(2, cVar);
        this.X = 2;
        this.Z = z10;
        this.f820b0 = nVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((z0) t(cVar, uVar)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((z0) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((z0) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new z0((h1) this.f820b0, this.Z, cVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new z0((f2.b1) this.f820b0, this.Z, cVar, 1);
            default:
                return new z0(this.Z, (g2.n) this.f820b0, cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [fc.a] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    @Override // ec.a
    public final Object v(Object obj) {
        ?? r22;
        boolean a10;
        l4.h hVar;
        b4.m1 m1Var;
        switch (this.X) {
            case 0:
                h1 h1Var = (h1) this.f820b0;
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                yb.y yVar = yb.y.f14813a;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            p7.j.I(obj);
                            return yVar;
                        }
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p7.j.I(obj);
                } else {
                    p7.j.I(obj);
                    pf.j jVar = h1Var.f773l;
                    this.Y = 1;
                    jVar.getClass();
                    MelonEmulator.f9466a.pauseEmulation();
                    if (yVar == aVar) {
                        return aVar;
                    }
                }
                if (this.Z) {
                    hh.o oVar = (hh.o) h1Var.f777q.getValue();
                    if (oVar instanceof hh.k) {
                        fc.a entries = lh.a.getEntries();
                        r22 = new ArrayList();
                        for (Object obj2 : entries) {
                            pf.p pVar = h1Var.m;
                            int i10 = i0.f787a[((lh.a) obj2).ordinal()];
                            if (i10 != 3) {
                                a10 = false;
                                if (i10 == 4 ? !(!((d2) h1Var.f763b).f8181b.getBoolean("enable_rewind", false) || !pVar.a()) : !(i10 == 5 ? !(!pVar.f11642a || !pVar.f11643b) : !(i10 != 6 || (pVar.f11643b && pVar.f11644c)))) {
                                    a10 = true;
                                }
                            } else {
                                a10 = pVar.a();
                            }
                            if (a10) {
                                r22.add(obj2);
                            }
                        }
                    } else if (oVar instanceof hh.j) {
                        r22 = dh.a.getEntries();
                    } else {
                        r22 = 0;
                    }
                    if (r22 != 0) {
                        cd.e1 e1Var = h1Var.O;
                        hh.u uVar = new hh.u(new hh.e0(r22));
                        this.Y = 2;
                        if (e1Var.a(uVar, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                f2.b1 b1Var = (f2.b1) this.f820b0;
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                int i11 = this.Y;
                yb.y yVar2 = yb.y.f14813a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    if (!l4.q0.c(b1Var.n().f12277b) && !(b1Var.f4711f instanceof q4.r)) {
                        hVar = p7.t.m(b1Var.n());
                        if (this.Z) {
                            int e6 = l4.q0.e(b1Var.n().f12277b);
                            b1Var.f4708c.k(f2.b1.e(b1Var.n().f12276a, l4.i0.b(e6, e6)));
                            b1Var.q(u1.d0.None);
                        }
                    } else {
                        hVar = null;
                    }
                    if (hVar != null && (m1Var = b1Var.f4713h) != null) {
                        b4.l1 a11 = k1.d.a(hVar);
                        this.Y = 1;
                        ((b4.i) m1Var).a(a11);
                        if (yVar2 == aVar2) {
                            return aVar2;
                        }
                    }
                }
                return yVar2;
            default:
                g2.n nVar = (g2.n) this.f820b0;
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
                int i12 = this.Y;
                if (i12 != 0) {
                    if (i12 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    boolean booleanValue = ((Boolean) nVar.f5269g.getValue()).booleanValue();
                    boolean z10 = this.Z;
                    if (z10 != booleanValue) {
                        Boolean valueOf = Boolean.valueOf(z10);
                        this.Y = 1;
                        if (g2.n0.l(nVar, valueOf, nVar.f5273k.g(), this) == aVar3) {
                            return aVar3;
                        }
                    }
                }
                return yb.y.f14813a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(Object obj, boolean z10, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.f820b0 = obj;
        this.Z = z10;
    }
}
