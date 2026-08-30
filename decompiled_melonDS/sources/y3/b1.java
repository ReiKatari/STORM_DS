package y3;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b1 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final mc.l f14664a;

    public b1(mc.l lVar) {
        this.f14664a = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y3.c1, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f14669i0 = this.f14664a;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        if (this.f14664a == ((b1) obj).f14664a) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        ((c1) oVar).f14669i0 = this.f14664a;
    }

    public final int hashCode() {
        return this.f14664a.hashCode();
    }
}
