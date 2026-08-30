package gk;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ e B;

    public /* synthetic */ v(e eVar, int i2) {
        this.A = i2;
        this.B = eVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.A) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.B.cancel();
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                Throwable th3 = (Throwable) obj;
                this.B.cancel();
                return yb.y.f14813a;
            default:
                Throwable th4 = (Throwable) obj;
                this.B.cancel();
                return yb.y.f14813a;
        }
    }
}
