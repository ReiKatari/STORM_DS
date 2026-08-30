package l1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g1 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final d1 f8564a;

    public g1(d1 d1Var) {
        this.f8564a = d1Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l1.j1, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f8578i0 = this.f8564a;
        return oVar;
    }

    public final boolean equals(Object obj) {
        g1 g1Var;
        if (obj instanceof g1) {
            g1Var = (g1) obj;
        } else {
            g1Var = null;
        }
        if (g1Var == null) {
            return false;
        }
        return nc.k.a(this.f8564a, g1Var.f8564a);
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        ((j1) oVar).f8578i0 = this.f8564a;
    }

    public final int hashCode() {
        return this.f8564a.hashCode();
    }
}
