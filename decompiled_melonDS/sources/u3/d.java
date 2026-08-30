package u3;

import a4.j1;
import a4.m0;
import b3.o;
import nc.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final a f13480a;

    public d(a aVar) {
        this.f13480a = aVar;
    }

    @Override // a4.j1
    public final o e() {
        return new h(this.f13480a, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d) || !k.a(((d) obj).f13480a, this.f13480a)) {
            return false;
        }
        return true;
    }

    @Override // a4.j1
    public final void g(o oVar) {
        h hVar = (h) oVar;
        hVar.f13482i0 = this.f13480a;
        b9.e eVar = hVar.f13483j0;
        if (((h) eVar.B) == hVar) {
            eVar.B = null;
        }
        b9.e eVar2 = new b9.e(23);
        hVar.f13483j0 = eVar2;
        if (hVar.f1777h0) {
            eVar2.B = hVar;
            eVar2.L = null;
            hVar.f13484k0 = null;
            eVar2.R = new m0(16, hVar);
            eVar2.X = hVar.C0();
        }
    }

    public final int hashCode() {
        return this.f13480a.hashCode() * 31;
    }
}
