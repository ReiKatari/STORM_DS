package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zd0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zd0 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;

    public /* synthetic */ zd0(java.lang.Object r1, java.lang.Object r2, long r3, int r5) {
            r0 = this;
            r0.A = r5
            r0.L = r1
            r0.R = r2
            r0.B = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.A
            long r1 = r4.B
            java.lang.Object r3 = r4.R
            java.lang.Object r4 = r4.L
            switch(r0) {
                case 0: goto L13;
                default: goto Lb;
            }
        Lb:
            jk5 r4 = (defpackage.jk5) r4
            yk5 r3 = (defpackage.yk5) r3
            r4.n(r3, r1)
            return
        L13:
            ti0 r4 = (defpackage.ti0) r4
            android.hardware.camera2.CameraCaptureSession r3 = (android.hardware.camera2.CameraCaptureSession) r3
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r4 = r4.a
            r0 = -1
            r4.onCaptureSequenceCompleted(r3, r0, r1)
            return
    }
}
