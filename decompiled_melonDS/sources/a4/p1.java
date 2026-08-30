package a4;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p1 extends nc.l implements mc.p {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(int i2, Object obj, Object obj2) {
        super(2);
        this.B = i2;
        this.L = obj;
        this.R = obj2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        int i2 = this.B;
        yb.y yVar = yb.y.f14813a;
        Object obj3 = this.R;
        Object obj4 = this.L;
        switch (i2) {
            case 0:
                i3.q qVar = (i3.q) obj;
                l3.b bVar = (l3.b) obj2;
                r1 r1Var = (r1) obj4;
                o0 o0Var = r1Var.f315i0;
                if (o0Var.I()) {
                    r1Var.D0 = qVar;
                    r1Var.C0 = bVar;
                    e2 snapshotObserver = ((b4.x) s0.a(o0Var)).getSnapshotObserver();
                    i3.k0 k0Var = r1.I0;
                    snapshotObserver.f194a.c(r1Var, e.X, (q1) obj3);
                    r1Var.G0 = false;
                } else {
                    r1Var.G0 = true;
                }
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((Number) obj2).intValue();
                b4.r0.a((b4.x) obj4, (mc.p) obj3, (n2.m) obj, n2.s.F(1));
                return yVar;
            case 2:
                ((Number) obj2).intValue();
                c1.c2.a((b3.p) obj4, (v2.c) obj3, (n2.m) obj, n2.s.F(49));
                return yVar;
            case 3:
                int intValue = ((Number) obj).intValue();
                i4.p pVar = (i4.p) obj2;
                d3.e eVar = (d3.e) obj3;
                if (!((b4.q2) obj4).f1935b.b(pVar.f6773g)) {
                    eVar.i(intValue, pVar);
                    eVar.f3797b0.a(yVar);
                }
                return yVar;
            default:
                n2.m mVar = (n2.m) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue2 & 1, z10)) {
                    Boolean bool = (Boolean) ((y3.h0) obj4).f14687g.getValue();
                    boolean booleanValue = bool.booleanValue();
                    mc.p pVar2 = (mc.p) obj3;
                    rVar.a0(bool);
                    boolean g10 = rVar.g(booleanValue);
                    if (booleanValue) {
                        pVar2.j(rVar, 0);
                    } else {
                        if (rVar.f10005l != 0) {
                            n2.t.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!rVar.S) {
                            if (!g10) {
                                rVar.Q();
                            } else {
                                n2.d2 d2Var = rVar.G;
                                int i10 = d2Var.f9892g;
                                int i11 = d2Var.f9893h;
                                o2.b bVar2 = rVar.M;
                                bVar2.getClass();
                                bVar2.d(false);
                                bVar2.f10615b.f10612d.V(o2.i.f10640d);
                                n2.s.i(rVar.f10011s, i10, i11);
                                rVar.G.t();
                            }
                        }
                    }
                    if (rVar.f10017y && rVar.G.f9894i == rVar.f10018z) {
                        rVar.f10018z = -1;
                        rVar.f10017y = false;
                    }
                    rVar.p(false);
                } else {
                    rVar.R();
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(Object obj, mc.p pVar, int i2, int i10) {
        super(2);
        this.B = i10;
        this.L = obj;
        this.R = pVar;
    }
}
