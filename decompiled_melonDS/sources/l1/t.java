package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final x4.c f8627a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8628b;

    public t(y3.r1 r1Var, long j2) {
        this.f8627a = r1Var;
        this.f8628b = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t) {
                t tVar = (t) obj;
                if (!nc.k.a(this.f8627a, tVar.f8627a) || !x4.a.b(this.f8628b, tVar.f8628b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8628b) + (this.f8627a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f8627a + ", constraints=" + ((Object) x4.a.k(this.f8628b)) + ')';
    }
}
