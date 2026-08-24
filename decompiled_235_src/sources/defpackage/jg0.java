package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jg0  reason: default package */
/* loaded from: classes.dex */
public final class jg0 extends CameraDevice.StateCallback {
    public xw a;

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        for (CameraDevice.StateCallback stateCallback : (List) this.a.a) {
            stateCallback.onClosed(cameraDevice);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        for (CameraDevice.StateCallback stateCallback : (List) this.a.a) {
            stateCallback.onDisconnected(cameraDevice);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        cameraDevice.getClass();
        for (CameraDevice.StateCallback stateCallback : (List) this.a.a) {
            stateCallback.onError(cameraDevice, i);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        for (CameraDevice.StateCallback stateCallback : (List) this.a.a) {
            stateCallback.onOpened(cameraDevice);
        }
    }
}
