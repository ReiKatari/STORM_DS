package x;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import p1.a0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends a0 {
    @Override // p1.a0
    public final int F(List list, l0.h hVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.B).setRepeatingBurstRequests(list, hVar, captureCallback);
    }

    @Override // p1.a0
    public final int H(CaptureRequest captureRequest, l0.h hVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.B).setSingleRepeatingRequest(captureRequest, hVar, captureCallback);
    }

    @Override // p1.a0
    public final int s(List list, l0.h hVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.B).captureBurstRequests(list, hVar, captureCallback);
    }
}
