package p1;

import h1.n1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final q f11227a;

    /* renamed from: b  reason: collision with root package name */
    public final h1.a f11228b;

    /* renamed from: c  reason: collision with root package name */
    public final n1 f11229c;

    public k(q qVar, h1.a aVar, n1 n1Var) {
        this.f11227a = qVar;
        this.f11228b = aVar;
        this.f11229c = n1Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p1.p, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f11245i0 = this.f11227a;
        oVar.f11246j0 = this.f11228b;
        oVar.f11247k0 = this.f11229c;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k) {
                k kVar = (k) obj;
                if (!nc.k.a(this.f11227a, kVar.f11227a) || !nc.k.a(this.f11228b, kVar.f11228b) || this.f11229c != kVar.f11229c) {
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
        p pVar = (p) oVar;
        pVar.f11245i0 = this.f11227a;
        pVar.f11246j0 = this.f11228b;
        pVar.f11247k0 = this.f11229c;
    }

    public final int hashCode() {
        return this.f11229c.hashCode() + w.d.e((this.f11228b.hashCode() + (this.f11227a.hashCode() * 31)) * 31, false, 31);
    }
}
