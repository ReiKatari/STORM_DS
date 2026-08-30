package y3;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final mc.q f14661a;

    public a0(mc.q qVar) {
        this.f14661a = qVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b3.o, y3.f0] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f14679i0 = this.f14661a;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        if (this.f14661a == ((a0) obj).f14661a) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        ((f0) oVar).f14679i0 = this.f14661a;
    }

    public final int hashCode() {
        return this.f14661a.hashCode();
    }
}
