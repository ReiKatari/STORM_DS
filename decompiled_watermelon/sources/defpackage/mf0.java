package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mf0  reason: default package */
/* loaded from: classes.dex */
public final class mf0 extends ff0 {
    public final sc0 a;

    public mf0(sc0 sc0Var) {
        this.a = sc0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof mf0) || !this.a.equals(((mf0) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CameraStateOpen(cameraDevice=" + this.a + ')';
    }
}
