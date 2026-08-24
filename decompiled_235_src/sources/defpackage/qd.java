package defpackage;

import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Handler;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qd  reason: default package */
/* loaded from: classes.dex */
public final class qd extends pd {
    public final CameraConstrainedHighSpeedCaptureSession X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd(rd rdVar, CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession, id0 id0Var, Handler handler) {
        super(rdVar, cameraConstrainedHighSpeedCaptureSession, id0Var, handler);
        rdVar.getClass();
        id0Var.getClass();
        handler.getClass();
        this.X = cameraConstrainedHighSpeedCaptureSession;
    }

    @Override // defpackage.pd, defpackage.hh7
    public final Object e(ar0 ar0Var) {
        if (ar0Var.equals(gh5.a(CameraConstrainedHighSpeedCaptureSession.class))) {
            return this.X;
        }
        return super.e(ar0Var);
    }
}
