package l1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u0 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final t0 f8631a;

    public u0(t0 t0Var) {
        this.f8631a = t0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c1.h1, l1.v0, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? h1Var = new c1.h1(1);
        h1Var.f8634j0 = this.f8631a;
        h1Var.f8635k0 = true;
        return h1Var;
    }

    public final boolean equals(Object obj) {
        u0 u0Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof u0) {
            u0Var = (u0) obj;
        } else {
            u0Var = null;
        }
        if (u0Var != null && this.f8631a == u0Var.f8631a) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        v0 v0Var = (v0) oVar;
        v0Var.f8634j0 = this.f8631a;
        v0Var.f8635k0 = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f8631a.hashCode() * 31);
    }
}
