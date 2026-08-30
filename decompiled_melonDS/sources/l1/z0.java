package l1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z0 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final mc.l f8655a;

    public z0(mc.l lVar) {
        this.f8655a = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l1.a1, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f8493i0 = this.f8655a;
        oVar.f8494j0 = true;
        return oVar;
    }

    public final boolean equals(Object obj) {
        z0 z0Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof z0) {
            z0Var = (z0) obj;
        } else {
            z0Var = null;
        }
        if (z0Var != null && this.f8655a == z0Var.f8655a) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        a1 a1Var = (a1) oVar;
        mc.l lVar = a1Var.f8493i0;
        mc.l lVar2 = this.f8655a;
        if (lVar != lVar2 || !a1Var.f8494j0) {
            a4.l.t(a1Var).W(false);
        }
        a1Var.f8493i0 = lVar2;
        a1Var.f8494j0 = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f8655a.hashCode() * 31);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f8655a + ", rtlAware=true)";
    }
}
