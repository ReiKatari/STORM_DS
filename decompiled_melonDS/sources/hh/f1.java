package hh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a  reason: collision with root package name */
    public final oe.u0 f6524a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6525b;

    public f1(oe.u0 u0Var, int i2) {
        u0Var.getClass();
        this.f6524a = u0Var;
        this.f6525b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        if (this.f6524a == f1Var.f6524a && this.f6525b == f1Var.f6525b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6525b) + (this.f6524a.hashCode() * 31);
    }

    public final String toString() {
        return "RuntimeRendererConfiguration(videoFiltering=" + this.f6524a + ", resolutionScaling=" + this.f6525b + ")";
    }
}
