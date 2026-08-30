package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements b2 {

    /* renamed from: a  reason: collision with root package name */
    public final b2 f8490a;

    /* renamed from: b  reason: collision with root package name */
    public final i1 f8491b;

    public a(b2 b2Var, i1 i1Var) {
        this.f8490a = b2Var;
        this.f8491b = i1Var;
    }

    @Override // l1.b2
    public final int a(x4.c cVar) {
        return this.f8491b.a(cVar) + this.f8490a.a(cVar);
    }

    @Override // l1.b2
    public final int b(x4.c cVar, x4.m mVar) {
        return this.f8491b.b(cVar, mVar) + this.f8490a.b(cVar, mVar);
    }

    @Override // l1.b2
    public final int c(x4.c cVar, x4.m mVar) {
        return this.f8491b.c(cVar, mVar) + this.f8490a.c(cVar, mVar);
    }

    @Override // l1.b2
    public final int d(x4.c cVar) {
        return this.f8491b.d(cVar) + this.f8490a.d(cVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (nc.k.a(aVar.f8490a, this.f8490a) && aVar.f8491b.equals(this.f8491b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f8491b.f8576a.hashCode() * 31) + this.f8490a.hashCode();
    }

    public final String toString() {
        return "(" + this.f8490a + " + " + this.f8491b + ')';
    }
}
