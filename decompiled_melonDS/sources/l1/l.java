package l1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final b3.h f8580a;

    public l(b3.h hVar) {
        this.f8580a = hVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l1.m, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f8586i0 = this.f8580a;
        return oVar;
    }

    public final boolean equals(Object obj) {
        l lVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            lVar = (l) obj;
        } else {
            lVar = null;
        }
        if (lVar != null && this.f8580a.equals(lVar.f8580a)) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        ((m) oVar).f8586i0 = this.f8580a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f8580a.hashCode() * 31);
    }
}
