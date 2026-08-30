package defpackage;

import android.hardware.camera2.CameraDevice;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fe0  reason: default package */
/* loaded from: classes.dex */
public final class fe0 {
    public final CameraDevice.StateCallback a;
    public final q03 b;
    public final mm1 c;

    public fe0(CameraDevice.StateCallback stateCallback, q03 q03Var, mm1 mm1Var) {
        this.a = stateCallback;
        this.b = q03Var;
        this.c = mm1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe0)) {
            return false;
        }
        fe0 fe0Var = (fe0) obj;
        if (b53.x(this.a, fe0Var.a) && b53.x(this.b, fe0Var.b) && b53.x(this.c, fe0Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        CameraDevice.StateCallback stateCallback = this.a;
        if (stateCallback == null) {
            hashCode = 0;
        } else {
            hashCode = stateCallback.hashCode();
        }
        int i2 = hashCode * 31;
        q03 q03Var = this.b;
        if (q03Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = q03Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        mm1 mm1Var = this.c;
        if (mm1Var != null) {
            i = Long.hashCode(mm1Var.a);
        }
        return i3 + i;
    }

    public final String toString() {
        return "CameraInteropConfig(cameraDeviceStateCallback=" + this.a + ", cameraCaptureSessionListener=" + this.b + ", cameraOpenRetryMaxTimeoutNs=" + this.c + ')';
    }
}
