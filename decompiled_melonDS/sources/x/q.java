package x;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;
import p1.a0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class q extends a0 {
    public static boolean O(RuntimeException runtimeException) {
        boolean z10;
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT == 28) {
            if (runtimeException.getClass().equals(RuntimeException.class) && (stackTrace = runtimeException.getStackTrace()) != null && stackTrace.length >= 0) {
                z10 = "_enableShutterSound".equals(stackTrace[0].getMethodName());
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // p1.a0
    public void B(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            ((CameraManager) this.B).openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e6) {
            throw new a(e6);
        } catch (IllegalArgumentException e10) {
        } catch (SecurityException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            if (O(e12)) {
                throw new a(e12);
            }
            throw e12;
        }
    }

    @Override // p1.a0
    public final void C(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        ((CameraManager) this.B).registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // p1.a0
    public final void L(CameraManager.AvailabilityCallback availabilityCallback) {
        ((CameraManager) this.B).unregisterAvailabilityCallback(availabilityCallback);
    }

    @Override // p1.a0
    public CameraCharacteristics x(String str) {
        try {
            return super.x(str);
        } catch (RuntimeException e6) {
            if (O(e6)) {
                throw new a(e6);
            }
            throw e6;
        }
    }
}
