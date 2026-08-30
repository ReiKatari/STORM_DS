package defpackage;

import android.hardware.camera2.CameraManager;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q90  reason: default package */
/* loaded from: classes.dex */
public final class q90 extends CameraManager.AvailabilityCallback {
    public final /* synthetic */ nu4 a;

    public q90(nu4 nu4Var) {
        this.a = nu4Var;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        str.getClass();
        od0.a(str);
        w81.I(this.a, new od0(str));
    }
}
