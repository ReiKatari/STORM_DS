package defpackage;

import android.hardware.camera2.CameraDevice;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: og0  reason: default package */
/* loaded from: classes.dex */
public final class og0 {
    public final CameraDevice.StateCallback a;
    public final u63 b;
    public final sq1 c;

    public og0(CameraDevice.StateCallback stateCallback, u63 u63Var, sq1 sq1Var) {
        this.a = stateCallback;
        this.b = u63Var;
        this.c = sq1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og0)) {
            return false;
        }
        og0 og0Var = (og0) obj;
        if (nb3.k(this.a, og0Var.a) && nb3.k(this.b, og0Var.b) && nb3.k(this.c, og0Var.c)) {
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
        u63 u63Var = this.b;
        if (u63Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = u63Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        sq1 sq1Var = this.c;
        if (sq1Var != null) {
            i = Long.hashCode(sq1Var.a);
        }
        return i3 + i;
    }

    public final String toString() {
        return "CameraInteropConfig(cameraDeviceStateCallback=" + this.a + ", cameraCaptureSessionListener=" + this.b + ", cameraOpenRetryMaxTimeoutNs=" + this.c + ')';
    }
}
