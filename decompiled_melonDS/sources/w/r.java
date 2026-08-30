package w;

import android.hardware.camera2.CameraManager;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r extends CameraManager.AvailabilityCallback {

    /* renamed from: a  reason: collision with root package name */
    public final String f14037a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14038b = true;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x f14039c;

    public r(x xVar, String str) {
        this.f14039c = xVar;
        this.f14037a = str;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        if (this.f14037a.equals(str)) {
            this.f14038b = true;
            if (this.f14039c.X != u.PENDING_OPEN && this.f14039c.X != u.OPENING_WITH_ERROR) {
                return;
            }
            this.f14039c.K(false);
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        if (!this.f14037a.equals(str)) {
            return;
        }
        this.f14038b = false;
    }
}
