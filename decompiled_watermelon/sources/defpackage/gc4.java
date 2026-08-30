package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gc4  reason: default package */
/* loaded from: classes.dex */
public final class gc4 extends ve2 {
    public final fc4 e;
    public final fn3 f;

    public gc4(fn3 fn3Var, fc4 fc4Var) {
        fc4Var.getClass();
        this.e = fc4Var;
        this.f = fn3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc4)) {
            return false;
        }
        gc4 gc4Var = (gc4) obj;
        if (b53.x(this.e, gc4Var.e) && b53.x(this.f, gc4Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.e.hashCode() * 31;
        fn3 fn3Var = this.f;
        if (fn3Var == null) {
            hashCode = 0;
        } else {
            hashCode = fn3Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.e + ", owner=" + this.f + ')';
    }
}
