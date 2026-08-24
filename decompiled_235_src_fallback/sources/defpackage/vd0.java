package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vd0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vd0 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;
    public final /* synthetic */ java.lang.Object X;

    public /* synthetic */ vd0(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
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
            r6 = this;
            int r0 = r6.A
            java.lang.Object r1 = r6.X
            java.lang.Object r2 = r6.R
            java.lang.Object r3 = r6.L
            java.lang.Object r6 = r6.B
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L2f;
                default: goto Ld;
            }
        Ld:
            java.util.List r6 = (java.util.List) r6
            gw7 r3 = (defpackage.gw7) r3
            az0 r2 = (defpackage.az0) r2
            androidx.work.impl.WorkDatabase r1 = (androidx.work.impl.WorkDatabase) r1
            java.util.Iterator r0 = r6.iterator()
        L19:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L2b
            java.lang.Object r4 = r0.next()
            e66 r4 = (defpackage.e66) r4
            java.lang.String r5 = r3.a
            r4.d(r5)
            goto L19
        L2b:
            defpackage.h66.b(r2, r1, r6)
            return
        L2f:
            ti0 r6 = (defpackage.ti0) r6
            android.hardware.camera2.CameraCaptureSession r3 = (android.hardware.camera2.CameraCaptureSession) r3
            android.hardware.camera2.CaptureRequest r2 = (android.hardware.camera2.CaptureRequest) r2
            android.hardware.camera2.CaptureFailure r1 = (android.hardware.camera2.CaptureFailure) r1
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r6 = r6.a
            r6.onCaptureFailed(r3, r2, r1)
            return
        L3d:
            ti0 r6 = (defpackage.ti0) r6
            android.hardware.camera2.CameraCaptureSession r3 = (android.hardware.camera2.CameraCaptureSession) r3
            android.hardware.camera2.CaptureRequest r2 = (android.hardware.camera2.CaptureRequest) r2
            android.hardware.camera2.TotalCaptureResult r1 = (android.hardware.camera2.TotalCaptureResult) r1
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r6 = r6.a
            r6.onCaptureCompleted(r3, r2, r1)
            return
    }
}
