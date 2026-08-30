package b4;

import android.os.SystemClock;
import android.view.MotionEvent;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s extends nc.l implements mc.a {
    public final /* synthetic */ int B;
    public final /* synthetic */ x L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(x xVar, int i2) {
        super(0);
        this.B = i2;
        this.L = xVar;
    }

    @Override // mc.a
    public final Object b() {
        int actionMasked;
        n nVar;
        switch (this.B) {
            case 0:
                return l0.e(this.L);
            case DSiCameraSource.FrontCamera /* 1 */:
                x xVar = this.L;
                MotionEvent motionEvent = xVar.f1981n1;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    xVar.f1983o1 = SystemClock.uptimeMillis();
                    xVar.post(xVar.f1992t1);
                }
                return yb.y.f14813a;
            default:
                nVar = this.L.get_viewTreeOwners();
                return nVar;
        }
    }
}
