package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ib2  reason: default package */
/* loaded from: classes.dex */
public final class ib2 implements in6 {
    public final boolean A;
    public final boolean B;

    public ib2(ox4 ox4Var) {
        ox4Var.getClass();
        ArrayList c = ox4Var.c(CaptureIntentPreviewQuirk.class);
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
        this.B = ox4Var.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    @Override // defpackage.in6
    public Map b(jb5 jb5Var) {
        if (jb5Var != null && jb5Var.a == 3 && this.A) {
            Map singletonMap = Collections.singletonMap(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            singletonMap.getClass();
            return singletonMap;
        } else if (jb5Var != null && jb5Var.a == 4 && this.B) {
            Map singletonMap2 = Collections.singletonMap(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
            singletonMap2.getClass();
            return singletonMap2;
        } else {
            return qp1.A;
        }
    }

    public ib2(boolean z, boolean z2) {
        this.A = z;
        this.B = z2;
    }
}
