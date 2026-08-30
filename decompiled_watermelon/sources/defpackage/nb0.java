package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nb0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nb0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ kg0 B;
    public final /* synthetic */ CameraCaptureSession L;
    public final /* synthetic */ CaptureRequest R;
    public final /* synthetic */ CaptureResult X;

    public /* synthetic */ nb0(kg0 kg0Var, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult, int i) {
        this.A = i;
        this.B = kg0Var;
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
        kg0 kg0Var = this.B;
        switch (i) {
            case 0:
                kg0Var.a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                return;
            default:
                kg0Var.a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                return;
        }
    }
}
