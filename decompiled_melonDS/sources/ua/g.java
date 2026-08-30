package ua;

import xa.a0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class g extends a0 {

    /* renamed from: a  reason: collision with root package name */
    public u f13528a = null;

    @Override // ua.u
    public final Object b(cb.a aVar) {
        u uVar = this.f13528a;
        if (uVar != null) {
            return uVar.b(aVar);
        }
        a0.j.p("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        u uVar = this.f13528a;
        if (uVar != null) {
            uVar.c(cVar, obj);
        } else {
            a0.j.p("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    @Override // xa.a0
    public final u d() {
        u uVar = this.f13528a;
        if (uVar != null) {
            return uVar;
        }
        a0.j.p("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }
}
