package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o85  reason: default package */
/* loaded from: classes.dex */
public final class o85 extends CameraCaptureSession {
    public static String d(String str) {
        return wh1.A("Current capture session is running on extensions mode which isn't allowed to invoke the ", str, " function!");
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final void abortCaptures() {
        throw new IllegalArgumentException(d("abortCaptures"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final int capture(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        captureRequest.getClass();
        throw new IllegalArgumentException(d("capture"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final int captureBurst(List list, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        list.getClass();
        throw new IllegalArgumentException(d("captureBurst"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalArgumentException(d("close"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final void finalizeOutputConfigurations(List list) {
        throw new IllegalArgumentException(d("finalizeOutputConfigurations"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final CameraDevice getDevice() {
        throw new IllegalArgumentException(d("getDevice"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final Surface getInputSurface() {
        throw new IllegalArgumentException(d("getInputSurface"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final boolean isReprocessable() {
        throw new IllegalArgumentException(d("isReprocessable"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final void prepare(Surface surface) {
        surface.getClass();
        throw new IllegalArgumentException(d("prepare"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final int setRepeatingBurst(List list, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        list.getClass();
        throw new IllegalArgumentException(d("setRepeatingBurst"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final int setRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        captureRequest.getClass();
        throw new IllegalArgumentException(d("setRepeatingRequest"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final void stopRepeating() {
        throw new IllegalArgumentException(d("stopRepeating"));
    }
}
