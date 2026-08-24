package defpackage;

import android.hardware.camera2.CaptureFailure;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yd  reason: default package */
/* loaded from: classes.dex */
public final class yd implements wk5 {
    public final CaptureFailure A;
    public final int B;
    public final boolean L;

    public yd(yk5 yk5Var, CaptureFailure captureFailure) {
        yk5Var.getClass();
        this.A = captureFailure;
        captureFailure.getFrameNumber();
        this.B = captureFailure.getReason();
        this.L = captureFailure.wasImageCaptured();
    }

    @Override // defpackage.hh7
    public final Object e(ar0 ar0Var) {
        if (ar0Var.equals(gh5.a(CaptureFailure.class))) {
            return this.A;
        }
        return null;
    }

    @Override // defpackage.wk5
    public final boolean r() {
        return this.L;
    }

    @Override // defpackage.wk5
    public final int v() {
        return this.B;
    }
}
