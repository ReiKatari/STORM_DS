package l1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final mc.l f8649a;

    public y(mc.l lVar) {
        this.f8649a = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l1.z, l1.l0, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? l0Var = new l0();
        l0Var.f8654k0 = this.f8649a;
        return l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y) && ((y) obj).f8649a == this.f8649a) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        z zVar = (z) oVar;
        mc.l lVar = zVar.f8654k0;
        mc.l lVar2 = this.f8649a;
        if (lVar2 != lVar) {
            zVar.f8654k0 = lVar2;
        }
    }

    public final int hashCode() {
        return this.f8649a.hashCode();
    }
}
