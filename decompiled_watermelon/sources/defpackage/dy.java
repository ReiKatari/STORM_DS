package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dy  reason: default package */
/* loaded from: classes.dex */
public final class dy {
    public final sc0 a;
    public final hd b;

    public dy(sc0 sc0Var, hd hdVar) {
        this.a = sc0Var;
        this.b = hdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy)) {
            return false;
        }
        dy dyVar = (dy) obj;
        if (b53.x(this.a, dyVar.a) && b53.x(this.b, dyVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        sc0 sc0Var = this.a;
        if (sc0Var == null) {
            hashCode = 0;
        } else {
            hashCode = sc0Var.hashCode();
        }
        int i2 = hashCode * 31;
        hd hdVar = this.b;
        if (hdVar != null) {
            i = hdVar.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "AwaitOpenCameraResult(cameraDeviceWrapper=" + this.a + ", androidCameraState=" + this.b + ')';
    }
}
