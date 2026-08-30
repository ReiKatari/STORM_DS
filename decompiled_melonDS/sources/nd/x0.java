package nd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x0 implements jd.a {

    /* renamed from: a  reason: collision with root package name */
    public final jd.a f10387a;

    /* renamed from: b  reason: collision with root package name */
    public final j1 f10388b;

    public x0(jd.a aVar) {
        aVar.getClass();
        this.f10387a = aVar;
        this.f10388b = new j1(aVar.e());
    }

    @Override // jd.a
    public final Object a(md.c cVar) {
        if (cVar.i()) {
            return cVar.t(this.f10387a);
        }
        return null;
    }

    @Override // jd.a
    public final void d(md.d dVar, Object obj) {
        if (obj != null) {
            dVar.n(this.f10387a, obj);
        } else {
            dVar.f();
        }
    }

    @Override // jd.a
    public final ld.e e() {
        return this.f10388b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x0.class == obj.getClass() && nc.k.a(this.f10387a, ((x0) obj).f10387a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10387a.hashCode();
    }
}
