package x;

import android.hardware.camera2.CameraCaptureSession;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ f B;
    public final /* synthetic */ CameraCaptureSession L;

    public /* synthetic */ e(f fVar, CameraCaptureSession cameraCaptureSession, int i2) {
        this.A = i2;
        this.B = fVar;
        this.L = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                this.B.f14294a.onActive(this.L);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                this.B.f14294a.onClosed(this.L);
                return;
            case 2:
                this.B.f14294a.onCaptureQueueEmpty(this.L);
                return;
            case 3:
                this.B.f14294a.onConfigured(this.L);
                return;
            case 4:
                this.B.f14294a.onReady(this.L);
                return;
            default:
                this.B.f14294a.onConfigureFailed(this.L);
                return;
        }
    }
}
