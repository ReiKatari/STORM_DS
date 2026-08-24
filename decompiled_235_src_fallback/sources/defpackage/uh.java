package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uh  reason: default package */
/* loaded from: classes.dex */
public final class uh implements defpackage.l54, defpackage.hh7 {
    public final android.hardware.camera2.CaptureResult A;
    public final java.lang.String B;

    public uh(android.hardware.camera2.CaptureResult r1, java.lang.String r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // defpackage.hh7
    public final java.lang.Object e(defpackage.ar0 r2) {
            r1 = this;
            java.lang.Class<android.hardware.camera2.CaptureResult> r0 = android.hardware.camera2.CaptureResult.class
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r0 = r2.equals(r0)
            android.hardware.camera2.CaptureResult r1 = r1.A
            if (r0 == 0) goto L12
            r1.getClass()
            return r1
        L12:
            java.lang.Class<android.hardware.camera2.TotalCaptureResult> r0 = android.hardware.camera2.TotalCaptureResult.class
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L22
            if (r1 != 0) goto L21
            goto L22
        L21:
            return r1
        L22:
            r1 = 0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FrameMetadata(camera: "
            r0.<init>(r1)
            java.lang.String r1 = r3.B
            java.lang.String r1 = defpackage.xf0.b(r1)
            r0.append(r1)
            java.lang.String r1 = ", frameNumber: "
            r0.append(r1)
            android.hardware.camera2.CaptureResult r3 = r3.A
            long r1 = r3.getFrameNumber()
            r0.append(r1)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
