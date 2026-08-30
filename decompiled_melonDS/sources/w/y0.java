package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y0 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a  reason: collision with root package name */
    public final CaptureRequest f14101a;

    /* renamed from: b  reason: collision with root package name */
    public final a0.k f14102b;

    public y0(CaptureRequest captureRequest, a0.k kVar) {
        captureRequest.getClass();
        this.f14101a = captureRequest;
        this.f14102b = kVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j2) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        surface.getClass();
        this.f14102b.onCaptureBufferLost(cameraCaptureSession, this.f14101a, surface, j2);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        totalCaptureResult.getClass();
        this.f14102b.onCaptureCompleted(cameraCaptureSession, this.f14101a, totalCaptureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        captureFailure.getClass();
        this.f14102b.onCaptureFailed(cameraCaptureSession, this.f14101a, captureFailure);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        captureResult.getClass();
        this.f14102b.onCaptureProgressed(cameraCaptureSession, this.f14101a, captureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i2) {
        cameraCaptureSession.getClass();
        this.f14102b.onCaptureSequenceAborted(cameraCaptureSession, i2);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i2, long j2) {
        cameraCaptureSession.getClass();
        this.f14102b.onCaptureSequenceCompleted(cameraCaptureSession, i2, j2);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j2, long j10) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        this.f14102b.onCaptureStarted(cameraCaptureSession, this.f14101a, j2, j10);
    }

    public void onReadoutStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j2, long j10) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        this.f14102b.onReadoutStarted(cameraCaptureSession, this.f14101a, j2, j10);
    }
}
