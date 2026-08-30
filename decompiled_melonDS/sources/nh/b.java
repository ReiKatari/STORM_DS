package nh;

import i3.k0;
import mc.l;
import me.magnum.melonds.common.camera.DSiCameraSource;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int A;
    public final /* synthetic */ d1.c B;

    public /* synthetic */ b(d1.c cVar, int i2) {
        this.A = i2;
        this.B = cVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        int i2 = this.A;
        k0 k0Var = (k0) obj;
        k0Var.getClass();
        switch (i2) {
            case 0:
                k0Var.d(((Number) this.B.e()).floatValue());
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                k0Var.d(((Number) this.B.e()).floatValue());
                break;
            default:
                k0Var.d(((Number) this.B.e()).floatValue());
                break;
        }
        return y.f14813a;
    }
}
