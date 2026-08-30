package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v1 implements b2 {

    /* renamed from: a  reason: collision with root package name */
    public final b2 f8636a;

    /* renamed from: b  reason: collision with root package name */
    public final b2 f8637b;

    public v1(b2 b2Var, b2 b2Var2) {
        this.f8636a = b2Var;
        this.f8637b = b2Var2;
    }

    @Override // l1.b2
    public final int a(x4.c cVar) {
        return Math.max(this.f8636a.a(cVar), this.f8637b.a(cVar));
    }

    @Override // l1.b2
    public final int b(x4.c cVar, x4.m mVar) {
        return Math.max(this.f8636a.b(cVar, mVar), this.f8637b.b(cVar, mVar));
    }

    @Override // l1.b2
    public final int c(x4.c cVar, x4.m mVar) {
        return Math.max(this.f8636a.c(cVar, mVar), this.f8637b.c(cVar, mVar));
    }

    @Override // l1.b2
    public final int d(x4.c cVar) {
        return Math.max(this.f8636a.d(cVar), this.f8637b.d(cVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        if (nc.k.a(v1Var.f8636a, this.f8636a) && nc.k.a(v1Var.f8637b, this.f8637b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8637b.hashCode() * 31) + this.f8636a.hashCode();
    }

    public final String toString() {
        return "(" + this.f8636a + " ∪ " + this.f8637b + ')';
    }
}
