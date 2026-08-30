package p1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final w f11261a;

    public t(w wVar) {
        this.f11261a = wVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p1.u, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f11265i0 = this.f11261a;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof t) || !this.f11261a.equals(((t) obj).f11261a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        u uVar = (u) oVar;
        w wVar = uVar.f11265i0;
        w wVar2 = this.f11261a;
        if (!nc.k.a(wVar, wVar2) && uVar.A.f1777h0) {
            w wVar3 = uVar.f11265i0;
            wVar3.d();
            wVar3.f11273b = null;
            uVar.f11265i0 = wVar2;
        }
    }

    public final int hashCode() {
        return this.f11261a.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.f11261a + ')';
    }
}
