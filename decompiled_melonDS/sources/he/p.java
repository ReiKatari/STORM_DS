package he;

import me.magnum.melonds.common.camera.DSiCameraSource;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ t B;
    public final /* synthetic */ t7.a L;

    public /* synthetic */ p(t tVar, t7.a aVar, int i2) {
        this.A = i2;
        this.B = tVar;
        this.L = aVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        a1.q qVar = (a1.q) obj;
        switch (this.A) {
            case 0:
                qVar.getClass();
                this.B.F(this.L, qVar);
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                qVar.getClass();
                this.B.G(this.L, qVar);
                break;
            default:
                qVar.getClass();
                this.B.E(this.L, qVar);
                break;
        }
        return y.f14813a;
    }
}
