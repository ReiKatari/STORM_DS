package g2;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class z4 implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ mc.p B;
    public final /* synthetic */ v2.c L;

    public /* synthetic */ z4(v2.c cVar, mc.p pVar, int i2) {
        this.A = 2;
        this.L = cVar;
        this.B = pVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f8;
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
                    e7.a(((f7) rVar.j(g7.f5161b)).f5151j, v2.h.c(1789628237, new z4(this.B, this.L, 1), rVar), rVar, 48);
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
                    mc.p pVar = this.B;
                    v2.c cVar = this.L;
                    if (pVar == null) {
                        rVar2.X(1845819398);
                        e5.d(cVar, rVar2, 0);
                        rVar2.p(false);
                    } else {
                        rVar2.X(1845823628);
                        e5.a(cVar, pVar, rVar2, 0);
                        rVar2.p(false);
                    }
                } else {
                    rVar2.R();
                }
                return yb.y.f14813a;
            case 2:
                num.getClass();
                e5.a(this.L, this.B, mVar, n2.s.F(1));
                return yb.y.f14813a;
            default:
                int intValue3 = num.intValue();
                if ((intValue3 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                n2.r rVar3 = (n2.r) mVar;
                if (rVar3.O(intValue3 & 1, z12)) {
                    n2.b0 b0Var = o0.f5308a;
                    long j2 = ((i3.s) rVar3.j(q0.f5361a)).f6689a;
                    if (!((l0) rVar3.j(m0.f5257a)).k() ? i3.z.r(j2) < 0.5d : i3.z.r(j2) > 0.5d) {
                        f8 = 1.0f;
                    } else {
                        f8 = 0.87f;
                    }
                    n2.s.a(b0Var.a(Float.valueOf(f8)), v2.h.c(1236486620, new z4(this.B, this.L, 0), rVar3), rVar3, 56);
                } else {
                    rVar3.R();
                }
                return yb.y.f14813a;
        }
    }

    public /* synthetic */ z4(mc.p pVar, v2.c cVar, int i2) {
        this.A = i2;
        this.B = pVar;
        this.L = cVar;
    }
}
