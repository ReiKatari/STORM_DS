package g2;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ v2.c B;

    public /* synthetic */ y(v2.c cVar, int i2) {
        this.A = i2;
        this.B = cVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        float f8;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        n2.m mVar = (n2.m) obj;
        Integer num = (Integer) obj2;
        switch (this.A) {
            case 0:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    n2.b0 b0Var = o0.f5308a;
                    long j2 = ((i3.s) rVar.j(q0.f5361a)).f6689a;
                    if (!((l0) rVar.j(m0.f5257a)).k() ? i3.z.r(j2) < 0.5d : i3.z.r(j2) > 0.5d) {
                        f8 = 1.0f;
                    } else {
                        f8 = 0.87f;
                    }
                    n2.s.a(b0Var.a(Float.valueOf(f8)), this.B, rVar, 8);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                int intValue2 = num.intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar2 = (n2.r) mVar;
                if (rVar2.O(intValue2 & 1, z11)) {
                    e7.a(((f7) rVar2.j(g7.f5161b)).f5152k, v2.h.c(-1686273317, new y(this.B, 2), rVar2), rVar2, 48);
                } else {
                    rVar2.R();
                }
                return yb.y.f14813a;
            case 2:
                int intValue3 = num.intValue();
                if ((intValue3 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                n2.r rVar3 = (n2.r) mVar;
                if (rVar3.O(intValue3 & 1, z12)) {
                    b3.m mVar2 = b3.m.f1770a;
                    float f10 = w1.f5444a;
                    b3.p a10 = l1.r1.a(mVar2, f10, f10);
                    y3.v0 d4 = l1.p.d(b3.c.X, false);
                    int hashCode = Long.hashCode(rVar3.T);
                    v2.g l10 = rVar3.l();
                    b3.p c4 = b3.a.c(a10, rVar3);
                    a4.h.f220a.getClass();
                    a4.f0 f0Var = a4.g.f212b;
                    rVar3.b0();
                    if (rVar3.S) {
                        rVar3.k(f0Var);
                    } else {
                        rVar3.k0();
                    }
                    n2.s.C(d4, a4.g.f215e, rVar3);
                    n2.s.C(l10, a4.g.f214d, rVar3);
                    a4.f fVar = a4.g.f216f;
                    if (rVar3.S || !nc.k.a(rVar3.L(), Integer.valueOf(hashCode))) {
                        w.d.w(hashCode, rVar3, hashCode, fVar);
                    }
                    n2.s.C(c4, a4.g.f213c, rVar3);
                    this.B.j(rVar3, 0);
                    rVar3.p(true);
                } else {
                    rVar3.R();
                }
                return yb.y.f14813a;
            case 3:
                int intValue4 = num.intValue();
                if ((intValue4 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                n2.r rVar4 = (n2.r) mVar;
                if (rVar4.O(intValue4 & 1, z13)) {
                    n0.f(this.B, rVar4, 0);
                } else {
                    rVar4.R();
                }
                return yb.y.f14813a;
            case 4:
                num.getClass();
                n0.f(this.B, mVar, n2.s.F(1));
                break;
            case l1.c.f8511g /* 5 */:
                num.getClass();
                e5.d(this.B, mVar, n2.s.F(1));
                break;
            case l1.c.f8509e /* 6 */:
                int intValue5 = num.intValue();
                if ((intValue5 & 3) != 2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                n2.r rVar5 = (n2.r) mVar;
                if (rVar5.O(intValue5 & 1, z14)) {
                    this.B.j(rVar5, 0);
                } else {
                    rVar5.R();
                }
                return yb.y.f14813a;
            default:
                num.getClass();
                p1.l.c(this.B, mVar, n2.s.F(7));
                break;
        }
        return yb.y.f14813a;
    }

    public /* synthetic */ y(v2.c cVar, int i2, int i10) {
        this.A = i10;
        this.B = cVar;
    }
}
