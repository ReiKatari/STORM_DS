package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zf2  reason: default package */
/* loaded from: classes.dex */
public final class zf2 implements tz6 {
    public final boolean A;
    public final boolean B;

    public zf2(y65 y65Var) {
        y65Var.getClass();
        ArrayList c = y65Var.c(CaptureIntentPreviewQuirk.class);
        int size = c.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj = c.get(i);
            i++;
            if (((CaptureIntentPreviewQuirk) obj).a()) {
                z = true;
                break;
            }
        }
        this.A = z;
        this.B = y65Var.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    @Override // defpackage.tz6
    public Map b(bl5 bl5Var) {
        if (bl5Var != null && bl5Var.a == 3 && this.A) {
            Map singletonMap = Collections.singletonMap(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            singletonMap.getClass();
            return singletonMap;
        } else if (bl5Var != null && bl5Var.a == 4 && this.B) {
            Map singletonMap2 = Collections.singletonMap(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
            singletonMap2.getClass();
            return singletonMap2;
        } else {
            return zt1.A;
        }
    }

    public zf2(boolean z, boolean z2) {
        this.A = z;
        this.B = z2;
    }
}
