package x;

import android.hardware.camera2.CameraManager;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends CameraManager.AvailabilityCallback {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f14302a;

    /* renamed from: b  reason: collision with root package name */
    public final CameraManager.AvailabilityCallback f14303b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f14304c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public boolean f14305d = false;

    public o(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f14302a = executor;
        this.f14303b = availabilityCallback;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        synchronized (this.f14304c) {
            try {
                if (!this.f14305d) {
                    this.f14302a.execute(new r0.b(10, this));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        synchronized (this.f14304c) {
            try {
                if (!this.f14305d) {
                    this.f14302a.execute(new n(this, str, 0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        synchronized (this.f14304c) {
            try {
                if (!this.f14305d) {
                    this.f14302a.execute(new n(this, str, 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
