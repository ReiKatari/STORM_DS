package androidx.camera.camera2.compat.quirk;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, u65 {
    @Override // androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk
    public final boolean a() {
        if (!xk2.x() && !xk2.y() && !xk2.A() && !xk2.z()) {
            return false;
        }
        return true;
    }
}
