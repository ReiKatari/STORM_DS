package defpackage;

import android.hardware.camera2.CameraManager;
import android.util.Log;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ja0  reason: default package */
/* loaded from: classes.dex */
public final class ja0 extends CameraManager.AvailabilityCallback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ nu4 b;
    public final /* synthetic */ Object c;

    public ja0(nu4 nu4Var, ka0 ka0Var) {
        this.b = nu4Var;
        this.c = ka0Var;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraAccessPrioritiesChanged() {
        switch (this.a) {
            case 0:
                Log.d("CXCP", "Camera access priorities have changed");
                if (w81.I(this.b, wf0.a) instanceof wj0) {
                    Log.w("CXCP", "Failed to emit CameraPrioritiesChanged");
                    return;
                }
                return;
            default:
                super.onCameraAccessPrioritiesChanged();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        int i = this.a;
        nu4 nu4Var = this.b;
        Object obj = this.c;
        str.getClass();
        switch (i) {
            case 0:
                if (str.equals(((ka0) obj).B)) {
                    Log.d("CXCP", "Camera " + str + " has become available");
                    od0.a(str);
                    if (w81.I(nu4Var, new vf0(str)) instanceof wj0) {
                        Log.w("CXCP", "Failed to emit CameraAvailable(" + str + ')');
                        return;
                    }
                    return;
                }
                return;
            default:
                wa0.a((wa0) obj, nu4Var, str, true);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        int i = this.a;
        nu4 nu4Var = this.b;
        Object obj = this.c;
        str.getClass();
        switch (i) {
            case 0:
                if (str.equals(((ka0) obj).B)) {
                    Log.d("CXCP", "Camera " + str + " has become unavailable");
                    od0.a(str);
                    if (w81.I(nu4Var, new xf0(str)) instanceof wj0) {
                        Log.w("CXCP", "Failed to emit CameraUnavailable(" + str + ')');
                        return;
                    }
                    return;
                }
                return;
            default:
                wa0.a((wa0) obj, nu4Var, str, false);
                return;
        }
    }

    public ja0(wa0 wa0Var, nu4 nu4Var) {
        this.c = wa0Var;
        this.b = nu4Var;
    }
}
