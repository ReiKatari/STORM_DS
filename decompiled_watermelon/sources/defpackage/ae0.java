package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ae0  reason: default package */
/* loaded from: classes.dex */
public final class ae0 extends CameraDevice.StateCallback {
    public fw a;

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
