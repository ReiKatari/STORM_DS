package l1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e1 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final d1 f8550a;

    public e1(d1 d1Var) {
        this.f8550a = d1Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l1.l0, l1.f1, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? l0Var = new l0();
        l0Var.f8553k0 = this.f8550a;
        return l0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        return nc.k.a(((e1) obj).f8550a, this.f8550a);
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        f1 f1Var = (f1) oVar;
        d1 d1Var = f1Var.f8553k0;
        d1 d1Var2 = this.f8550a;
        if (!nc.k.a(d1Var2, d1Var)) {
            f1Var.f8553k0 = d1Var2;
            f1Var.P0();
        }
    }

    public final int hashCode() {
        return this.f8550a.hashCode();
    }
}
