package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kd4  reason: default package */
/* loaded from: classes.dex */
public final class kd4 {
    public final hd a;
    public final uc0 b;

    public kd4(hd hdVar, uc0 uc0Var, int i) {
        hdVar = (i & 1) != 0 ? null : hdVar;
        uc0Var = (i & 2) != 0 ? null : uc0Var;
        this.a = hdVar;
        this.b = uc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd4)) {
            return false;
        }
        kd4 kd4Var = (kd4) obj;
        if (b53.x(this.a, kd4Var.a) && b53.x(this.b, kd4Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        hd hdVar = this.a;
        if (hdVar == null) {
            hashCode = 0;
        } else {
            hashCode = hdVar.hashCode();
        }
        int i2 = hashCode * 31;
        uc0 uc0Var = this.b;
        if (uc0Var != null) {
            i = Integer.hashCode(uc0Var.a);
        }
        return i2 + i;
    }

    public final String toString() {
        return "OpenCameraResult(cameraState=" + this.a + ", errorCode=" + this.b + ')';
    }
}
