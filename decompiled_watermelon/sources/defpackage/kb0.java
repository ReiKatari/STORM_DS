package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kb0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kb0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ kg0 B;
    public final /* synthetic */ CameraCaptureSession L;
    public final /* synthetic */ CaptureRequest R;
    public final /* synthetic */ long X;
    public final /* synthetic */ long Y;

    public /* synthetic */ kb0(kg0 kg0Var, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2, int i) {
        this.A = i;
        this.B = kg0Var;
        this.L = cameraCaptureSession;
        this.R = captureRequest;
        this.X = j;
        this.Y = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        kg0 kg0Var = this.B;
        switch (i) {
            case 0:
                kg0Var.a.onCaptureStarted(this.L, this.R, this.X, this.Y);
                return;
            default:
                kg0Var.a.onReadoutStarted(this.L, this.R, this.X, this.Y);
                return;
        }
    }
}
