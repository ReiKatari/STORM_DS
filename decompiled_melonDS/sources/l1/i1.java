package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i1 implements b2 {

    /* renamed from: a  reason: collision with root package name */
    public final d1 f8576a;

    public i1(d1 d1Var) {
        this.f8576a = d1Var;
    }

    @Override // l1.b2
    public final int a(x4.c cVar) {
        return cVar.O(this.f8576a.a());
    }

    @Override // l1.b2
    public final int b(x4.c cVar, x4.m mVar) {
        return cVar.O(this.f8576a.d(mVar));
    }

    @Override // l1.b2
    public final int c(x4.c cVar, x4.m mVar) {
        return cVar.O(this.f8576a.c(mVar));
    }

    @Override // l1.b2
    public final int d(x4.c cVar) {
        return cVar.O(this.f8576a.b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        return nc.k.a(((i1) obj).f8576a, this.f8576a);
    }

    public final int hashCode() {
        return this.f8576a.hashCode();
    }

    public final String toString() {
        x4.m mVar = x4.m.Ltr;
        d1 d1Var = this.f8576a;
        float c4 = d1Var.c(mVar);
        float b10 = d1Var.b();
        float d4 = d1Var.d(mVar);
        float a10 = d1Var.a();
        return "PaddingValues(" + ((Object) x4.f.c(c4)) + ", " + ((Object) x4.f.c(b10)) + ", " + ((Object) x4.f.c(d4)) + ", " + ((Object) x4.f.c(a10)) + ')';
    }
}
