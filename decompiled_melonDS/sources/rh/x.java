package rh;

import cd.q1;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x implements cd.i {
    public final /* synthetic */ int A;
    public final /* synthetic */ e0 B;

    public /* synthetic */ x(e0 e0Var, int i2) {
        this.A = i2;
        this.B = e0Var;
    }

    @Override // cd.i
    public final Object a(Object obj, cc.c cVar) {
        switch (this.A) {
            case 0:
                ve.f fVar = (ve.f) obj;
                d5.f fVar2 = this.B.f12728d;
                fVar2.getClass();
                fVar.getClass();
                q1 q1Var = (q1) fVar2.f3845g;
                q1Var.getClass();
                q1Var.k(null, fVar);
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                yb.j jVar = (yb.j) obj;
                e0 e0Var = this.B;
                q1 q1Var2 = e0Var.m;
                if (jVar == null) {
                    q1Var2.j(null);
                } else {
                    ve.o oVar = (ve.o) jVar.A;
                    ve.n nVar = (ve.n) jVar.B;
                    ve.f fVar3 = (ve.f) e0Var.f12731g.getValue();
                    if (fVar3 != null) {
                        e0Var.f12730f = oVar;
                        sh.a aVar = new sh.a(nVar, fVar3.f13801d);
                        q1Var2.getClass();
                        q1Var2.k(null, aVar);
                    }
                }
                return yb.y.f14813a;
            case 2:
                sh.a aVar2 = (sh.a) obj;
                e0 e0Var2 = this.B;
                if (aVar2 != null) {
                    ve.m mVar = aVar2.f12919a.f13821a;
                    e0.e(e0Var2, mVar.f13818a, mVar.f13819b);
                } else {
                    e0.e(e0Var2, null, ve.a.FIT_CENTER);
                }
                return yb.y.f14813a;
            default:
                sh.a aVar3 = (sh.a) obj;
                e0 e0Var3 = this.B;
                if (aVar3 != null) {
                    ve.m mVar2 = aVar3.f12919a.f13822b;
                    e0.f(e0Var3, mVar2.f13818a, mVar2.f13819b);
                } else {
                    e0.f(e0Var3, null, ve.a.FIT_CENTER);
                }
                return yb.y.f14813a;
        }
    }
}
