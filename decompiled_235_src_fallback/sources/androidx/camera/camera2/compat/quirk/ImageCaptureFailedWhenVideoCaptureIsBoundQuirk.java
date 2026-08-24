package androidx.camera.camera2.compat.quirk;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk, defpackage.u65 {
    @Override // androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk
    public final boolean a() {
            r0 = this;
            boolean r0 = defpackage.xk2.x()
            if (r0 != 0) goto L1b
            boolean r0 = defpackage.xk2.y()
            if (r0 != 0) goto L1b
            boolean r0 = defpackage.xk2.A()
            if (r0 != 0) goto L1b
            boolean r0 = defpackage.xk2.z()
            if (r0 == 0) goto L19
            goto L1b
        L19:
            r0 = 0
            return r0
        L1b:
            r0 = 1
            return r0
    }
}
