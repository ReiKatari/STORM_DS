package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l70  reason: default package */
/* loaded from: classes.dex */
public final class l70 {
    public final qh1 a;
    public final long b;

    public l70(qt6 qt6Var, long j) {
        this.a = qt6Var;
        this.b = j;
    }

    public final float a() {
        long j = this.b;
        if (q21.c(j)) {
            return this.a.Q(q21.g(j));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l70) {
                l70 l70Var = (l70) obj;
                if (!nb3.k(this.a, l70Var.a) || !q21.b(this.b, l70Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + ((Object) q21.k(this.b)) + ')';
    }
}
