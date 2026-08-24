package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: td0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class td0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ ti0 B;
    public final /* synthetic */ CameraCaptureSession L;
    public final /* synthetic */ CaptureRequest R;
    public final /* synthetic */ long X;
    public final /* synthetic */ long Y;

    public /* synthetic */ td0(ti0 ti0Var, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2, int i) {
        this.A = i;
        this.B = ti0Var;
        this.L = cameraCaptureSession;
        this.R = captureRequest;
        this.X = j;
        this.Y = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        ti0 ti0Var = this.B;
        switch (i) {
            case 0:
                ti0Var.a.onCaptureStarted(this.L, this.R, this.X, this.Y);
                return;
            default:
                ti0Var.a.onReadoutStarted(this.L, this.R, this.X, this.Y);
                return;
        }
    }
}
