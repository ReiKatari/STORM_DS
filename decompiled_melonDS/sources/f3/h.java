package f3;

import a4.j1;
import b3.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
final class h extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final mc.l f4823a;

    public h(mc.l lVar) {
        this.f4823a = lVar;
    }

    @Override // a4.j1
    public final o e() {
        return new b(new c(), this.f4823a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        if (this.f4823a == ((h) obj).f4823a) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(o oVar) {
        b bVar = (b) oVar;
        bVar.f4820k0 = this.f4823a;
        bVar.O0();
    }

    public final int hashCode() {
        return this.f4823a.hashCode();
    }
}
