package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yb0  reason: default package */
/* loaded from: classes.dex */
public final class yb0 extends android.hardware.camera2.CameraManager.AvailabilityCallback {
    public final /* synthetic */ defpackage.r35 a;

    public yb0(defpackage.r35 r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            defpackage.xf0.a(r2)
            xf0 r0 = new xf0
            r0.<init>(r2)
            r35 r1 = r1.a
            defpackage.f04.W(r1, r0)
            return
    }
}
