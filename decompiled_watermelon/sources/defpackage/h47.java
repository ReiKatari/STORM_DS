package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h47  reason: default package */
/* loaded from: classes.dex */
public final class h47 {
    public final mi2 a;
    public final kn2 b;
    public final f16 c;
    public final gh3 d;

    public h47(mi2 mi2Var, kn2 kn2Var, f16 f16Var, gh3 gh3Var) {
        mi2Var.getClass();
        this.a = mi2Var;
        this.b = kn2Var;
        this.c = f16Var;
        this.d = gh3Var;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!h47.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        h47 h47Var = (h47) obj;
        if (this.c == h47Var.c && this.b == h47Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.c.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "UseCaseCameraConfig(cameraGraphFactory=" + this.a + ", graphStateToCameraStateAdapter=" + this.b + ", sessionConfigAdapter=" + this.c + ", sessionProcessor=null, lazyCreationResult=" + this.d + ')';
    }
}
