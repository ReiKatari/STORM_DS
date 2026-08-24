package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uh  reason: default package */
/* loaded from: classes.dex */
public final class uh implements l54, hh7 {
    public final CaptureResult A;
    public final String B;

    public uh(CaptureResult captureResult, String str) {
        captureResult.getClass();
        str.getClass();
        this.A = captureResult;
        this.B = str;
    }

    @Override // defpackage.hh7
    public final Object e(ar0 ar0Var) {
        boolean equals = ar0Var.equals(gh5.a(CaptureResult.class));
        CaptureResult captureResult = this.A;
        if (equals) {
            captureResult.getClass();
            return captureResult;
        } else if (ar0Var.equals(gh5.a(TotalCaptureResult.class)) && captureResult != null) {
            return captureResult;
        } else {
            return null;
        }
    }

    public final String toString() {
        return "FrameMetadata(camera: " + ((Object) xf0.b(this.B)) + ", frameNumber: " + this.A.getFrameNumber() + ')';
    }
}
