package n2;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ r B;

    public /* synthetic */ n(r rVar, v0 v0Var) {
        this.A = 0;
        this.B = rVar;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.A) {
            case 0:
                throw null;
            case DSiCameraSource.FrontCamera /* 1 */:
                return this.B.m();
            default:
                return this.B.m();
        }
    }

    public /* synthetic */ n(r rVar, int i2) {
        this.A = i2;
        this.B = rVar;
    }
}
