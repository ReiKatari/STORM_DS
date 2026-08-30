package defpackage;

import android.hardware.camera2.CaptureFailure;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kd  reason: default package */
/* loaded from: classes.dex */
public final class kd implements eb5 {
    public final CaptureFailure A;
    public final int B;
    public final boolean L;

    public kd(gb5 gb5Var, CaptureFailure captureFailure) {
        gb5Var.getClass();
        this.A = captureFailure;
        captureFailure.getFrameNumber();
        this.B = captureFailure.getReason();
        this.L = captureFailure.wasImageCaptured();
    }

    @Override // defpackage.eb5
    public final boolean I() {
        return this.L;
    }

    @Override // defpackage.eb5
    public final int K() {
        return this.B;
    }

    @Override // defpackage.m37
    public final Object p(qo0 qo0Var) {
        if (qo0Var.equals(q75.a(CaptureFailure.class))) {
            return this.A;
        }
        return null;
    }
}
