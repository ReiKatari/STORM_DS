package defpackage;

import android.hardware.camera2.CameraManager;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yb0  reason: default package */
/* loaded from: classes.dex */
public final class yb0 extends CameraManager.AvailabilityCallback {
    public final /* synthetic */ r35 a;

    public yb0(r35 r35Var) {
        this.a = r35Var;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        str.getClass();
        xf0.a(str);
        f04.W(this.a, new xf0(str));
    }
}
