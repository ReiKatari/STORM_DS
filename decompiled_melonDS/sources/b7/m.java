package b7;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public m(a7.i iVar, c1.p pVar) {
        this.A = 2;
        this.L = iVar;
        this.B = pVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                n2.m mVar = (n2.m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    n2.r rVar = (n2.r) mVar;
                    if (rVar.A()) {
                        rVar.R();
                        return yb.y.f14813a;
                    }
                }
                ((q) this.B).Z.i((a7.i) this.L, mVar, 0);
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                n2.m mVar2 = (n2.m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    n2.r rVar2 = (n2.r) mVar2;
                    if (rVar2.A()) {
                        rVar2.R();
                        return yb.y.f14813a;
                    }
                }
                k7.w.d((y2.d) this.B, (v2.c) this.L, mVar2, 0);
                return yb.y.f14813a;
            default:
                n2.m mVar3 = (n2.m) obj;
                int intValue = ((Number) obj2).intValue();
                a7.i iVar = (a7.i) this.L;
                if ((intValue & 3) == 2) {
                    n2.r rVar3 = (n2.r) mVar3;
                    if (rVar3.A()) {
                        rVar3.R();
                        return yb.y.f14813a;
                    }
                }
                a7.x xVar = iVar.B;
                xVar.getClass();
                ((h) xVar).Y.r((c1.p) this.B, iVar, mVar3, 0);
                return yb.y.f14813a;
        }
    }

    public /* synthetic */ m(int i2, Object obj, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }
}
