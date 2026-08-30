package zc;

import java.util.concurrent.ScheduledFuture;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements f {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ e(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // zc.f
    public final void a(Throwable th2) {
        switch (this.A) {
            case 0:
                ((ScheduledFuture) this.B).cancel(false);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((mc.l) this.B).k(th2);
                return;
            default:
                ((i0) this.B).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.A) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.B) + ']';
            case DSiCameraSource.FrontCamera /* 1 */:
                return "CancelHandler.UserSupplied[" + ((mc.l) this.B).getClass().getSimpleName() + '@' + x.n(this) + ']';
            default:
                return "DisposeOnCancel[" + ((i0) this.B) + ']';
        }
    }
}
