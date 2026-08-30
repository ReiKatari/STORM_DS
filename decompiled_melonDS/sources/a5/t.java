package a5;

import me.magnum.melonds.common.camera.DSiCameraSource;
import y3.h1;
import y3.i1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t extends nc.l implements mc.l {
    public final /* synthetic */ int B;
    public final /* synthetic */ i1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(i1 i1Var, int i2) {
        super(1);
        this.B = i2;
        this.L = i1Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.B) {
            case 0:
                h1.n((h1) obj, this.L, 0, 0);
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                h1.k((h1) obj, this.L, 0, 0);
                return yb.y.f14813a;
            case 2:
                h1.n((h1) obj, this.L, 0, 0);
                return yb.y.f14813a;
            default:
                h1.o((h1) obj, this.L, 0, 0);
                return yb.y.f14813a;
        }
    }
}
