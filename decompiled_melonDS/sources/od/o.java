package od;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o implements jd.a {

    /* renamed from: a  reason: collision with root package name */
    public static final o f10898a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final ld.f f10899b = aj.g.h("kotlinx.serialization.json.JsonElement", ld.c.f9020p, new ld.e[0], new l4.c0(29));

    @Override // jd.a
    public final Object a(md.c cVar) {
        return k0.d.k(cVar).s();
    }

    @Override // jd.a
    public final void d(md.d dVar, Object obj) {
        l lVar = (l) obj;
        lVar.getClass();
        k0.d.i(dVar);
        if (lVar instanceof d0) {
            dVar.n(e0.f10888a, lVar);
        } else if (lVar instanceof z) {
            dVar.n(b0.f10882a, lVar);
        } else if (lVar instanceof e) {
            dVar.n(g.f10893a, lVar);
        } else {
            m9.o.o();
        }
    }

    @Override // jd.a
    public final ld.e e() {
        return f10899b;
    }
}
