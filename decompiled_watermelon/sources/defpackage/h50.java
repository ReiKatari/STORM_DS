package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h50  reason: default package */
/* loaded from: classes.dex */
public final class h50 {
    public final od1 a;
    public final long b;

    public h50(zh6 zh6Var, long j) {
        this.a = zh6Var;
        this.b = j;
    }

    public final float a() {
        long j = this.b;
        if (lz0.c(j)) {
            return this.a.A0(lz0.g(j));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h50) {
                h50 h50Var = (h50) obj;
                if (!b53.x(this.a, h50Var.a) || !lz0.b(this.b, h50Var.b)) {
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
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + ((Object) lz0.k(this.b)) + ')';
    }
}
