package mh;

import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.b1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ b1 B;

    public /* synthetic */ r(b1 b1Var, int i2) {
        this.A = i2;
        this.B = b1Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.A) {
            case 0:
                ((x4.c) obj).getClass();
                return new x4.j((0 << 32) | (pc.a.M(this.B.g()) & 4294967295L));
            case DSiCameraSource.FrontCamera /* 1 */:
                this.B.h(((Float) obj).floatValue());
                return yb.y.f14813a;
            default:
                this.B.h(((Float) obj).floatValue());
                return yb.y.f14813a;
        }
    }
}
