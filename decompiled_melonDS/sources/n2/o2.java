package n2;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o2 implements cd.i {
    public final /* synthetic */ int A;
    public final /* synthetic */ m1 B;

    public /* synthetic */ o2(m1 m1Var, int i2) {
        this.A = i2;
        this.B = m1Var;
    }

    @Override // cd.i
    public final Object a(Object obj, cc.c cVar) {
        switch (this.A) {
            case 0:
                this.B.setValue(obj);
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                this.B.setValue(obj);
                return yb.y.f14813a;
            case 2:
                this.B.setValue(obj);
                return yb.y.f14813a;
            default:
                this.B.setValue(obj);
                return yb.y.f14813a;
        }
    }
}
