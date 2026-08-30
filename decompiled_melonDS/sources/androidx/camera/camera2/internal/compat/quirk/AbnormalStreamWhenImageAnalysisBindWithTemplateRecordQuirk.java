package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk implements CaptureIntentPreviewQuirk {
    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    public final boolean a() {
        if ("samsung".equalsIgnoreCase(Build.BRAND) && Build.DEVICE.equalsIgnoreCase("m55xq")) {
            return true;
        }
        return false;
    }
}
