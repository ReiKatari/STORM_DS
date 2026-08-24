package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yd  reason: default package */
/* loaded from: classes.dex */
public final class yd implements defpackage.wk5 {
    public final android.hardware.camera2.CaptureFailure A;
    public final int B;
    public final boolean L;

    public yd(defpackage.yk5 r1, android.hardware.camera2.CaptureFailure r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r2
            r2.getFrameNumber()
            int r1 = r2.getReason()
            r0.B = r1
            boolean r1 = r2.wasImageCaptured()
            r0.L = r1
            return
    }

    @Override // defpackage.hh7
    public final java.lang.Object e(defpackage.ar0 r2) {
            r1 = this;
            java.lang.Class<android.hardware.camera2.CaptureFailure> r0 = android.hardware.camera2.CaptureFailure.class
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lf
            android.hardware.camera2.CaptureFailure r1 = r1.A
            return r1
        Lf:
            r1 = 0
            return r1
    }

    @Override // defpackage.wk5
    public final boolean r() {
            r0 = this;
            boolean r0 = r0.L
            return r0
    }

    @Override // defpackage.wk5
    public final int v() {
            r0 = this;
            int r0 = r0.B
            return r0
    }
}
