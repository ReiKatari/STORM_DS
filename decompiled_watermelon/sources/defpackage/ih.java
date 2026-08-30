package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ih  reason: default package */
/* loaded from: classes.dex */
public final class ih implements ux3, m37 {
    public final CaptureResult A;
    public final String B;

    public ih(CaptureResult captureResult, String str) {
        captureResult.getClass();
        str.getClass();
        this.A = captureResult;
        this.B = str;
    }

    @Override // defpackage.m37
    public final Object p(qo0 qo0Var) {
        boolean equals = qo0Var.equals(q75.a(CaptureResult.class));
        CaptureResult captureResult = this.A;
        if (equals) {
            captureResult.getClass();
            return captureResult;
        } else if (qo0Var.equals(q75.a(TotalCaptureResult.class)) && captureResult != null) {
            return captureResult;
        } else {
            return null;
        }
    }

    public final String toString() {
        return "FrameMetadata(camera: " + ((Object) od0.b(this.B)) + ", frameNumber: " + this.A.getFrameNumber() + ')';
    }
}
