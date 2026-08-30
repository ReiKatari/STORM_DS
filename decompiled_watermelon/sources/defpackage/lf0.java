package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lf0  reason: default package */
/* loaded from: classes.dex */
public final class lf0 extends ff0 {
    public final uc0 a;

    public lf0(uc0 uc0Var) {
        this.a = uc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lf0) && b53.x(this.a, ((lf0) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        uc0 uc0Var = this.a;
        if (uc0Var == null) {
            return 0;
        }
        return Integer.hashCode(uc0Var.a);
    }

    public final String toString() {
        return "CameraStateClosing(cameraErrorCode=" + this.a + ')';
    }
}
