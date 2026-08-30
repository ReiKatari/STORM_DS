package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import j0.k1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, k1 {
    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    public final boolean a() {
        String str = Build.BRAND;
        if (!"blu".equalsIgnoreCase(str) || !"studio x10".equalsIgnoreCase(Build.MODEL)) {
            if (!"itel".equalsIgnoreCase(str) || !"itel w6004".equalsIgnoreCase(Build.MODEL)) {
                if (!"vivo".equalsIgnoreCase(str) || !"vivo 1805".equalsIgnoreCase(Build.MODEL)) {
                    if ("positivo".equalsIgnoreCase(str) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
