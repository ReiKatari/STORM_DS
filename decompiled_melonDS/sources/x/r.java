package x;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class r extends q {
    @Override // x.q, p1.a0
    public final void B(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            ((CameraManager) this.B).openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e6) {
            throw new a(e6);
        }
    }

    @Override // x.q, p1.a0
    public final CameraCharacteristics x(String str) {
        try {
            return ((CameraManager) this.B).getCameraCharacteristics(str);
        } catch (CameraAccessException e6) {
            throw new a(e6);
        }
    }
}
