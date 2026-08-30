package defpackage;

import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Handler;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bd  reason: default package */
/* loaded from: classes.dex */
public final class bd extends ad {
    public final CameraConstrainedHighSpeedCaptureSession X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd(cd cdVar, CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession, ab0 ab0Var, Handler handler) {
        super(cdVar, cameraConstrainedHighSpeedCaptureSession, ab0Var, handler);
        cdVar.getClass();
        ab0Var.getClass();
        handler.getClass();
        this.X = cameraConstrainedHighSpeedCaptureSession;
    }

    @Override // defpackage.ad, defpackage.m37
    public final Object p(qo0 qo0Var) {
        if (qo0Var.equals(q75.a(CameraConstrainedHighSpeedCaptureSession.class))) {
            return this.X;
        }
        return super.p(qo0Var);
    }
}
