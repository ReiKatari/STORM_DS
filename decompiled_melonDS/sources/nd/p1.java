package nd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p1 implements jd.a {

    /* renamed from: a  reason: collision with root package name */
    public final jd.a f10348a;

    /* renamed from: b  reason: collision with root package name */
    public final jd.a f10349b;

    /* renamed from: c  reason: collision with root package name */
    public final jd.a f10350c;

    /* renamed from: d  reason: collision with root package name */
    public final ld.f f10351d;

    public p1(jd.a aVar, jd.a aVar2, jd.a aVar3) {
        ld.f fVar;
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        this.f10348a = aVar;
        this.f10349b = aVar2;
        this.f10350c = aVar3;
        ld.e[] eVarArr = new ld.e[0];
        mh.z zVar = new mh.z(8, this);
        if (!vc.h.j0("kotlin.Triple")) {
            ld.a aVar4 = new ld.a("kotlin.Triple");
            zVar.k(aVar4);
            fVar = new ld.f("kotlin.Triple", ld.j.f9044o, aVar4.f9011c.size(), zb.k.Q(eVarArr), aVar4);
        } else {
            a0.j.h("Blank serial names are prohibited");
            fVar = null;
        }
        this.f10351d = fVar;
    }

    @Override // jd.a
    public final Object a(md.c cVar) {
        ld.f fVar = this.f10351d;
        md.a a10 = cVar.a(fVar);
        Object obj = a1.f10268c;
        Object obj2 = obj;
        Object obj3 = obj2;
        Object obj4 = obj3;
        while (true) {
            int g10 = a10.g(fVar);
            if (g10 != -1) {
                if (g10 != 0) {
                    if (g10 != 1) {
                        if (g10 == 2) {
                            obj4 = a10.o(fVar, 2, this.f10350c, null);
                        } else {
                            throw new IllegalArgumentException(w.d.l(g10, "Unexpected index "));
                        }
                    } else {
                        obj3 = a10.o(fVar, 1, this.f10349b, null);
                    }
                } else {
                    obj2 = a10.o(fVar, 0, this.f10348a, null);
                }
            } else {
                a10.b(fVar);
                if (obj2 != obj) {
                    if (obj3 != obj) {
                        if (obj4 != obj) {
                            return new yb.o(obj2, obj3, obj4);
                        }
                        throw new IllegalArgumentException("Element 'third' is missing");
                    }
                    throw new IllegalArgumentException("Element 'second' is missing");
                }
                throw new IllegalArgumentException("Element 'first' is missing");
            }
        }
    }

    @Override // jd.a
    public final void d(md.d dVar, Object obj) {
        yb.o oVar = (yb.o) obj;
        oVar.getClass();
        ld.f fVar = this.f10351d;
        ij.a aVar = (ij.a) dVar.a(fVar);
        aVar.J(fVar, 0, this.f10348a, oVar.A);
        aVar.J(fVar, 1, this.f10349b, oVar.B);
        aVar.J(fVar, 2, this.f10350c, oVar.L);
        aVar.b(fVar);
    }

    @Override // jd.a
    public final ld.e e() {
        return this.f10351d;
    }
}
