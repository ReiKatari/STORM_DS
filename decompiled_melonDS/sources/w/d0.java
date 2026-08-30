package w;

import android.hardware.camera2.CameraManager;
import android.util.Log;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 extends CameraManager.AvailabilityCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d0.b1 f13917a;

    public d0(d0.b1 b1Var) {
        this.f13917a = b1Var;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        Log.d("Camera2PresenceSrc", "System onCameraAccessPrioritiesChanged.");
        a.a.A(new m0.e((b5.l) this.f13917a.d(), 0));
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        str.getClass();
        Log.d("Camera2PresenceSrc", "System onCameraAvailable: ".concat(str));
        a.a.A(new m0.e((b5.l) this.f13917a.d(), 0));
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        str.getClass();
        Log.d("Camera2PresenceSrc", "System onCameraUnavailable: ".concat(str));
        a.a.A(new m0.e((b5.l) this.f13917a.d(), 0));
    }
}
