package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p0 implements d1 {

    /* renamed from: a  reason: collision with root package name */
    public final b2 f8598a;

    /* renamed from: b  reason: collision with root package name */
    public final x4.c f8599b;

    public p0(b2 b2Var, y3.r1 r1Var) {
        this.f8598a = b2Var;
        this.f8599b = r1Var;
    }

    @Override // l1.d1
    public final float a() {
        b2 b2Var = this.f8598a;
        x4.c cVar = this.f8599b;
        return cVar.t0(b2Var.a(cVar));
    }

    @Override // l1.d1
    public final float b() {
        b2 b2Var = this.f8598a;
        x4.c cVar = this.f8599b;
        return cVar.t0(b2Var.d(cVar));
    }

    @Override // l1.d1
    public final float c(x4.m mVar) {
        b2 b2Var = this.f8598a;
        x4.c cVar = this.f8599b;
        return cVar.t0(b2Var.c(cVar, mVar));
    }

    @Override // l1.d1
    public final float d(x4.m mVar) {
        b2 b2Var = this.f8598a;
        x4.c cVar = this.f8599b;
        return cVar.t0(b2Var.b(cVar, mVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (nc.k.a(this.f8598a, p0Var.f8598a) && nc.k.a(this.f8599b, p0Var.f8599b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8599b.hashCode() + (this.f8598a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f8598a + ", density=" + this.f8599b + ')';
    }
}
