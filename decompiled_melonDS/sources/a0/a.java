package a0;

import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import j0.o1;
import java.util.ArrayList;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2b;

    public a(o1 o1Var, int i2) {
        boolean z10;
        boolean z11;
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                ArrayList l10 = o1Var.l(CaptureIntentPreviewQuirk.class);
                int size = l10.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        Object obj = l10.get(i10);
                        i10++;
                        z10 = ((CaptureIntentPreviewQuirk) obj).a();
                    }
                }
                this.f1a = z10;
                this.f2b = o1Var.h(ImageCaptureFailedForVideoSnapshotQuirk.class);
                return;
            default:
                this.f1a = o1Var.h(ImageCaptureFailWithAutoFlashQuirk.class);
                if (z.a.f14847a.j(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f2b = z11;
                return;
        }
    }
}
