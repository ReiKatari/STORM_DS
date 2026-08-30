package g3;

import a4.j1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final mc.l f5500a;

    public c(mc.l lVar) {
        this.f5500a = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g3.e, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f5503i0 = this.f5500a;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        if (this.f5500a == ((c) obj).f5500a) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        ((e) oVar).f5503i0 = this.f5500a;
    }

    public final int hashCode() {
        return this.f5500a.hashCode();
    }
}
