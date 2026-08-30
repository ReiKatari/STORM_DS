package ai;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ e.k B;

    public /* synthetic */ y(e.k kVar, int i2) {
        this.A = i2;
        this.B = kVar;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.A) {
            case 0:
                this.B.a(new yb.j(null, null));
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                this.B.a(new yb.j(null, null));
                break;
            default:
                this.B.a(new yb.j(null, new String[]{"image/png", "image/jpeg"}));
                break;
        }
        return yb.y.f14813a;
    }
}
