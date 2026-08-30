package x;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import p1.a0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends a0 {
    @Override // p1.a0
    public final void v(y.s sVar) {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) sVar.f14656a.a();
        sessionConfiguration.getClass();
        try {
            ((CameraDevice) this.B).createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e6) {
            throw new a(e6);
        }
    }
}
