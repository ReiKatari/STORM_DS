package l1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n0 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final b2 f8588a;

    public n0(b2 b2Var) {
        this.f8588a = b2Var;
    }

    @Override // a4.j1
    public final b3.o e() {
        return new o0(this.f8588a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        return nc.k.a(((n0) obj).f8588a, this.f8588a);
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        o0 o0Var = (o0) oVar;
        b2 b2Var = o0Var.f8592k0;
        b2 b2Var2 = this.f8588a;
        if (!nc.k.a(b2Var2, b2Var)) {
            o0Var.f8592k0 = b2Var2;
            o0Var.P0();
        }
    }

    public final int hashCode() {
        return this.f8588a.hashCode();
    }
}
