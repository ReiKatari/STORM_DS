package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kd0  reason: default package */
/* loaded from: classes.dex */
public final class kd0 extends os0 {
    public static final xx Y;
    public static final xx Z;
    public static final xx d0;
    public static final xx e0;
    public static final xx f0;
    public static final xx g0;
    public static final xx h0;

    static {
        Class cls = Integer.TYPE;
        cls.getClass();
        Y = new xx("camera2.captureRequest.templateType", cls, null);
        Z = new xx("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);
        d0 = new xx("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);
        e0 = new xx("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);
        Class cls2 = Long.TYPE;
        cls2.getClass();
        f0 = new xx("camera2.cameraCaptureSession.streamUseCase", cls2, null);
        g0 = new xx("camera2.cameraCaptureSession.streamUseHint", cls2, null);
        h0 = new xx("camera2.cameraCaptureSession.physicalCameraId", String.class, null);
    }
}
