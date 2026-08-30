package androidx.fragment.app;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ r(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                w wVar = (w) this.B;
                wVar.R.onDismiss(wVar.f1432f0);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                q qVar = (q) this.B;
                if (!qVar.f1396b.isEmpty()) {
                    qVar.e();
                    return;
                }
                return;
            default:
                ((g1) this.B).z(true);
                return;
        }
    }
}
