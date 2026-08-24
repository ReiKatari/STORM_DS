package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wd0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wd0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ ti0 B;
    public final /* synthetic */ CameraCaptureSession L;
    public final /* synthetic */ CaptureRequest R;
    public final /* synthetic */ CaptureResult X;

    public /* synthetic */ wd0(ti0 ti0Var, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult, int i) {
        this.A = i;
        this.B = ti0Var;
        this.L = cameraCaptureSession;
        this.R = captureRequest;
        this.X = captureResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        CaptureResult captureResult = this.X;
        CaptureRequest captureRequest = this.R;
        CameraCaptureSession cameraCaptureSession = this.L;
        ti0 ti0Var = this.B;
        switch (i) {
            case 0:
                ti0Var.a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                return;
            default:
                ti0Var.a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                return;
        }
    }
}
