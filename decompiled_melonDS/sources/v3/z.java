package v3;

import a4.j1;
import u1.l0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final a4.o f13721a;

    public z(a4.o oVar) {
        this.f13721a = oVar;
    }

    @Override // a4.j1
    public final b3.o e() {
        return new f(l0.f13362b, this.f13721a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z) {
                z zVar = (z) obj;
                a aVar = l0.f13362b;
                if (!aVar.equals(aVar) || !nc.k.a(this.f13721a, zVar.f13721a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        a0 a0Var = (a0) oVar;
        a aVar = l0.f13362b;
        if (!nc.k.a(a0Var.f13647j0, aVar)) {
            a0Var.f13647j0 = aVar;
            if (a0Var.f13648k0) {
                a0Var.Q0();
            }
        }
        a0Var.f13646i0 = this.f13721a;
    }

    public final int hashCode() {
        int i2 = 0;
        int e6 = w.d.e(1022 * 31, false, 31);
        a4.o oVar = this.f13721a;
        if (oVar != null) {
            i2 = oVar.hashCode();
        }
        return e6 + i2;
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + l0.f13362b + ", overrideDescendants=false, touchBoundsExpansion=" + this.f13721a + ')';
    }
}
