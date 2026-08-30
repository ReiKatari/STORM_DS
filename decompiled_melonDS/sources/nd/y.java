package nd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y extends c1 {

    /* renamed from: l  reason: collision with root package name */
    public final ld.i f10390l;
    public final yb.n m;

    public y(String str, int i2) {
        super(str, null, i2);
        this.f10390l = ld.i.f9043o;
        this.m = new yb.n(new x(i2, str, this));
    }

    @Override // nd.c1, ld.e
    public final d0.d c() {
        return this.f10390l;
    }

    @Override // nd.c1
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof ld.e)) {
                ld.e eVar = (ld.e) obj;
                if (eVar.c() != ld.i.f9043o || !this.f10276a.equals(eVar.b()) || !nc.k.a(a1.b(this), a1.b(eVar))) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // nd.c1
    public final int hashCode() {
        int i2;
        int hashCode = this.f10276a.hashCode();
        a1.z0 z0Var = new a1.z0(this);
        int i10 = 1;
        while (z0Var.hasNext()) {
            int i11 = i10 * 31;
            String str = (String) z0Var.next();
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            i10 = i11 + i2;
        }
        return (hashCode * 31) + i10;
    }

    @Override // nd.c1, ld.e
    public final ld.e j(int i2) {
        return ((ld.e[]) this.m.getValue())[i2];
    }

    @Override // nd.c1
    public final String toString() {
        return zb.l.Y(new ld.g(0, this), ", ", this.f10276a.concat("("), ")", null, 56);
    }
}
