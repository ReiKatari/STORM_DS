package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zf2  reason: default package */
/* loaded from: classes.dex */
public final class zf2 implements defpackage.tz6 {
    public final boolean A;
    public final boolean B;

    public zf2(defpackage.y65 r6) {
            r5 = this;
            r6.getClass()
            r5.<init>()
            java.lang.Class<androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk> r0 = androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk.class
            java.util.ArrayList r0 = r6.c(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L12:
            if (r3 >= r1) goto L23
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk r4 = (androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk) r4
            boolean r4 = r4.a()
            if (r4 == 0) goto L12
            r2 = 1
        L23:
            r5.A = r2
            java.lang.Class<androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk> r0 = androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.class
            boolean r6 = r6.a(r0)
            r5.B = r6
            return
    }

    public zf2(boolean r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // defpackage.tz6
    public java.util.Map b(defpackage.bl5 r3) {
            r2 = this;
            if (r3 == 0) goto L1a
            int r0 = r3.a
            r1 = 3
            if (r0 != r1) goto L1a
            boolean r0 = r2.A
            if (r0 == 0) goto L1a
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT
            r3 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.Map r2 = java.util.Collections.singletonMap(r2, r3)
            r2.getClass()
            return r2
        L1a:
            if (r3 == 0) goto L34
            int r3 = r3.a
            r0 = 4
            if (r3 != r0) goto L34
            boolean r2 = r2.B
            if (r2 == 0) goto L34
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT
            r3 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.Map r2 = java.util.Collections.singletonMap(r2, r3)
            r2.getClass()
            return r2
        L34:
            zt1 r2 = defpackage.zt1.A
            return r2
    }
}
