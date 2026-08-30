package ig;

import me.magnum.melonds.common.camera.DSiCameraSource;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ mc.l B;
    public final /* synthetic */ oe.a L;

    public /* synthetic */ i(mc.l lVar, oe.a aVar, int i2) {
        this.A = i2;
        this.B = lVar;
        this.L = aVar;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.A) {
            case 0:
                this.B.k(this.L);
                return y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                this.B.k(this.L);
                return y.f14813a;
            default:
                this.B.k(this.L);
                return y.f14813a;
        }
    }
}
