package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wd0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wd0 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.ti0 B;
    public final /* synthetic */ android.hardware.camera2.CameraCaptureSession L;
    public final /* synthetic */ android.hardware.camera2.CaptureRequest R;
    public final /* synthetic */ android.hardware.camera2.CaptureResult X;

    public /* synthetic */ wd0(defpackage.ti0 r1, android.hardware.camera2.CameraCaptureSession r2, android.hardware.camera2.CaptureRequest r3, android.hardware.camera2.CaptureResult r4, int r5) {
            r0 = this;
            r0.A = r5
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.X = r4
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.A
            android.hardware.camera2.CaptureResult r1 = r4.X
            android.hardware.camera2.CaptureRequest r2 = r4.R
            android.hardware.camera2.CameraCaptureSession r3 = r4.L
            ti0 r4 = r4.B
            switch(r0) {
                case 0: goto L13;
                default: goto Ld;
            }
        Ld:
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r4 = r4.a
            r4.onCaptureProgressed(r3, r2, r1)
            return
        L13:
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r4 = r4.a
            r4.onCaptureProgressed(r3, r2, r1)
            return
    }
}
