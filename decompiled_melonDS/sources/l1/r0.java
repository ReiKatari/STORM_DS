package l1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r0 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final t0 f8612a;

    public r0(t0 t0Var) {
        this.f8612a = t0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c1.h1, l1.s0, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? h1Var = new c1.h1(1);
        h1Var.f8620j0 = this.f8612a;
        h1Var.f8621k0 = true;
        return h1Var;
    }

    public final boolean equals(Object obj) {
        r0 r0Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof r0) {
            r0Var = (r0) obj;
        } else {
            r0Var = null;
        }
        if (r0Var != null && this.f8612a == r0Var.f8612a) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        s0 s0Var = (s0) oVar;
        s0Var.f8620j0 = this.f8612a;
        s0Var.f8621k0 = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f8612a.hashCode() * 31);
    }
}
