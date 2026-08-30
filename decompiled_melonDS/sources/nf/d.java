package nf;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {
    @va.b("mainScreenDisplay")

    /* renamed from: a  reason: collision with root package name */
    private final c f10418a;
    @va.b("secondaryScreenDisplay")

    /* renamed from: b  reason: collision with root package name */
    private final c f10419b;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public d(c cVar, c cVar2) {
        this.f10418a = cVar;
        this.f10419b = cVar2;
    }

    public final ve.i a() {
        ve.h hVar;
        ve.h a10 = this.f10418a.a();
        c cVar = this.f10419b;
        if (cVar != null) {
            hVar = cVar.a();
        } else {
            hVar = null;
        }
        return new ve.i(a10, hVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (nc.k.a(this.f10418a, dVar.f10418a) && nc.k.a(this.f10419b, dVar.f10419b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f10418a.hashCode() * 31;
        c cVar = this.f10419b;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        c cVar = this.f10418a;
        c cVar2 = this.f10419b;
        return "LayoutDisplayPairDto(mainScreenDisplay=" + cVar + ", secondaryScreenDisplay=" + cVar2 + ")";
    }
}
