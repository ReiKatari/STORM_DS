package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import j0.g;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends a0.b {
    public static final g L = new g("camera2.captureRequest.templateType", Integer.TYPE, null);
    public static final g R = new g("camera2.cameraCaptureSession.streamUseCase", Long.TYPE, null);
    public static final g X = new g("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);
    public static final g Y = new g("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);
    public static final g Z = new g("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);

    /* renamed from: b0  reason: collision with root package name */
    public static final g f13571b0 = new g("camera2.cameraCaptureSession.physicalCameraId", String.class, null);

    public static g Z(CaptureRequest.Key key) {
        return new g("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }
}
