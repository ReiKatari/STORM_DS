package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fi7  reason: default package */
/* loaded from: classes.dex */
public final class fi7 {
    public final qn2 a;
    public final qt2 b;
    public final tc6 c;
    public final go3 d;

    public fi7(qn2 qn2Var, qt2 qt2Var, tc6 tc6Var, go3 go3Var) {
        qn2Var.getClass();
        this.a = qn2Var;
        this.b = qt2Var;
        this.c = tc6Var;
        this.d = go3Var;
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
        if (!fi7.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        fi7 fi7Var = (fi7) obj;
        if (this.c == fi7Var.c && this.b == fi7Var.b) {
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
