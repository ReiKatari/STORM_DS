package ai;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ g3.z B;

    public /* synthetic */ t(g3.z zVar, int i2) {
        this.A = i2;
        this.B = zVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        g3.r rVar = (g3.r) obj;
        switch (this.A) {
            case 0:
                rVar.getClass();
                rVar.d(this.B);
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                rVar.getClass();
                rVar.c(this.B);
                break;
            case 2:
                rVar.getClass();
                rVar.d(this.B);
                break;
            case 3:
                rVar.getClass();
                rVar.d(this.B);
                break;
            default:
                rVar.getClass();
                rVar.d(this.B);
                break;
        }
        return yb.y.f14813a;
    }
}
