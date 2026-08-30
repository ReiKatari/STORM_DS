package x;

import android.hardware.camera2.CameraDevice;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ w.p B;
    public final /* synthetic */ CameraDevice L;

    public /* synthetic */ k(w.p pVar, CameraDevice cameraDevice, int i2) {
        this.A = i2;
        this.B = pVar;
        this.L = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                ((CameraDevice.StateCallback) this.B.f14008b).onClosed(this.L);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((CameraDevice.StateCallback) this.B.f14008b).onDisconnected(this.L);
                return;
            default:
                ((CameraDevice.StateCallback) this.B.f14008b).onOpened(this.L);
                return;
        }
    }
}
