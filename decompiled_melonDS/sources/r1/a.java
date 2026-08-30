package r1;

import a4.j1;
import b3.o;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
final class a extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final c f12601a;

    public a(c cVar) {
        this.f12601a = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [r1.e, b3.o] */
    @Override // a4.j1
    public final o e() {
        ?? oVar = new o();
        oVar.f12606i0 = this.f12601a;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                if (!k.a(this.f12601a, ((a) obj).f12601a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // a4.j1
    public final void g(o oVar) {
        e eVar = (e) oVar;
        c cVar = eVar.f12606i0;
        if (cVar != null) {
            cVar.f12605a.j(eVar);
        }
        c cVar2 = this.f12601a;
        if (cVar2 != null) {
            cVar2.f12605a.b(eVar);
        }
        eVar.f12606i0 = cVar2;
    }

    public final int hashCode() {
        return this.f12601a.hashCode();
    }
}
