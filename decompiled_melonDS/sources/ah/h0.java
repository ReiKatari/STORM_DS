package ah;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h0 implements zc.u {
    public final /* synthetic */ int A = 0;
    public cc.g B;

    public h0(cc.g gVar) {
        this.B = gVar;
    }

    public String toString() {
        switch (this.A) {
            case DSiCameraSource.FrontCamera /* 1 */:
                return "CoroutineScope(coroutineContext=" + this.B + ')';
            default:
                return super.toString();
        }
    }

    @Override // zc.u
    public final cc.g v() {
        switch (this.A) {
            case 0:
                return this.B;
            default:
                return this.B;
        }
    }

    public /* synthetic */ h0() {
    }
}
