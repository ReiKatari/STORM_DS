package w;

import android.hardware.camera2.CameraCaptureSession;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l0 extends j0.m {

    /* renamed from: a  reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f13995a;

    public l0(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.f13995a = captureCallback;
        } else {
            m9.o.i("captureCallback is null");
            throw null;
        }
    }
}
