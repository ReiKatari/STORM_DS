package b4;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends nc.l implements mc.l {
    public final /* synthetic */ int B;
    public final /* synthetic */ nc.t L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(nc.t tVar, int i2) {
        super(1);
        this.B = i2;
        this.L = tVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        boolean z10;
        switch (this.B) {
            case 0:
                this.L.A = (g3.g0) obj;
                return Boolean.TRUE;
            case DSiCameraSource.FrontCamera /* 1 */:
                a4.q2 q2Var = (a4.q2) obj;
                if (((b3.o) q2Var).A.f1777h0) {
                    this.L.A = q2Var;
                    z10 = false;
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                v3.f fVar = (v3.f) obj;
                nc.t tVar = this.L;
                Object obj2 = tVar.A;
                if (obj2 == null && fVar.f13648k0) {
                    tVar.A = fVar;
                } else if (obj2 != null) {
                    fVar.getClass();
                }
                return Boolean.TRUE;
        }
    }
}
