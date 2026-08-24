package defpackage;

import android.hardware.camera2.CameraManager;
import android.util.Log;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rc0  reason: default package */
/* loaded from: classes.dex */
public final class rc0 extends CameraManager.AvailabilityCallback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ r35 b;
    public final /* synthetic */ Object c;

    public rc0(r35 r35Var, sc0 sc0Var) {
        this.b = r35Var;
        this.c = sc0Var;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraAccessPrioritiesChanged() {
        switch (this.a) {
            case 0:
                Log.d("CXCP", "Camera access priorities have changed");
                if (f04.W(this.b, fi0.a) instanceof fm0) {
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
        r35 r35Var = this.b;
        Object obj = this.c;
        str.getClass();
        switch (i) {
            case 0:
                if (str.equals(((sc0) obj).B)) {
                    Log.d("CXCP", "Camera " + str + " has become available");
                    xf0.a(str);
                    if (f04.W(r35Var, new ei0(str)) instanceof fm0) {
                        Log.w("CXCP", "Failed to emit CameraAvailable(" + str + ')');
                        return;
                    }
                    return;
                }
                return;
            default:
                ed0.a((ed0) obj, r35Var, str, true);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        int i = this.a;
        r35 r35Var = this.b;
        Object obj = this.c;
        str.getClass();
        switch (i) {
            case 0:
                if (str.equals(((sc0) obj).B)) {
                    Log.d("CXCP", "Camera " + str + " has become unavailable");
                    xf0.a(str);
                    if (f04.W(r35Var, new gi0(str)) instanceof fm0) {
                        Log.w("CXCP", "Failed to emit CameraUnavailable(" + str + ')');
                        return;
                    }
                    return;
                }
                return;
            default:
                ed0.a((ed0) obj, r35Var, str, false);
                return;
        }
    }

    public rc0(ed0 ed0Var, r35 r35Var) {
        this.c = ed0Var;
        this.b = r35Var;
    }
}
