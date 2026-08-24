package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qd  reason: default package */
/* loaded from: classes.dex */
public final class qd extends defpackage.pd {
    public final android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession X;

    public qd(defpackage.rd r1, android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession r2, defpackage.id0 r3, android.os.Handler r4) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>(r1, r2, r3, r4)
            r0.X = r2
            return
    }

    @Override // defpackage.pd, defpackage.hh7
    public final java.lang.Object e(defpackage.ar0 r2) {
            r1 = this;
            java.lang.Class<android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession> r0 = android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession.class
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lf
            android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession r1 = r1.X
            return r1
        Lf:
            java.lang.Object r1 = super.e(r2)
            return r1
    }
}
