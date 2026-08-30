package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cb0  reason: default package */
/* loaded from: classes.dex */
public final class cb0 extends bq0 {
    public static final uw Y;
    public static final uw Z;
    public static final uw c0;
    public static final uw d0;
    public static final uw e0;
    public static final uw f0;
    public static final uw g0;

    static {
        Class cls = Integer.TYPE;
        cls.getClass();
        Y = new uw("camera2.captureRequest.templateType", cls, null);
        Z = new uw("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);
        c0 = new uw("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);
        d0 = new uw("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);
        Class cls2 = Long.TYPE;
        cls2.getClass();
        e0 = new uw("camera2.cameraCaptureSession.streamUseCase", cls2, null);
        f0 = new uw("camera2.cameraCaptureSession.streamUseHint", cls2, null);
        g0 = new uw("camera2.cameraCaptureSession.physicalCameraId", String.class, null);
    }
}
