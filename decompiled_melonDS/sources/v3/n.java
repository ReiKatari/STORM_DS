package v3;

import a4.j1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final a f13684a;

    public n(a aVar) {
        this.f13684a = aVar;
    }

    @Override // a4.j1
    public final b3.o e() {
        return new f(this.f13684a, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && this.f13684a.equals(((n) obj).f13684a)) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        o oVar2 = (o) oVar;
        a aVar = oVar2.f13647j0;
        a aVar2 = this.f13684a;
        if (!nc.k.a(aVar, aVar2)) {
            oVar2.f13647j0 = aVar2;
            if (oVar2.f13648k0) {
                oVar2.Q0();
            }
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f13684a.f13629b * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f13684a + ", overrideDescendants=false)";
    }
}
