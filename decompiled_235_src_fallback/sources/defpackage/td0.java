package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: td0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class td0 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.ti0 B;
    public final /* synthetic */ android.hardware.camera2.CameraCaptureSession L;
    public final /* synthetic */ android.hardware.camera2.CaptureRequest R;
    public final /* synthetic */ long X;
    public final /* synthetic */ long Y;

    public /* synthetic */ td0(defpackage.ti0 r1, android.hardware.camera2.CameraCaptureSession r2, android.hardware.camera2.CaptureRequest r3, long r4, long r6, int r8) {
            r0 = this;
            r0.A = r8
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.X = r4
            r0.Y = r6
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r17 = this;
            r0 = r17
            int r1 = r0.A
            ti0 r2 = r0.B
            switch(r1) {
                case 0: goto L17;
                default: goto L9;
            }
        L9:
            long r8 = r0.Y
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r3 = r2.a
            android.hardware.camera2.CameraCaptureSession r4 = r0.L
            android.hardware.camera2.CaptureRequest r5 = r0.R
            long r6 = r0.X
            defpackage.gi.m(r3, r4, r5, r6, r8)
            return
        L17:
            long r3 = r0.Y
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r10 = r2.a
            android.hardware.camera2.CameraCaptureSession r11 = r0.L
            android.hardware.camera2.CaptureRequest r12 = r0.R
            long r13 = r0.X
            r15 = r3
            r10.onCaptureStarted(r11, r12, r13, r15)
            return
    }
}
