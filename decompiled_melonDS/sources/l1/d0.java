package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 implements b2 {

    /* renamed from: a  reason: collision with root package name */
    public final b2 f8541a;

    /* renamed from: b  reason: collision with root package name */
    public final b2 f8542b;

    public d0(b2 b2Var, b2 b2Var2) {
        this.f8541a = b2Var;
        this.f8542b = b2Var2;
    }

    @Override // l1.b2
    public final int a(x4.c cVar) {
        int a10 = this.f8541a.a(cVar) - this.f8542b.a(cVar);
        if (a10 < 0) {
            return 0;
        }
        return a10;
    }

    @Override // l1.b2
    public final int b(x4.c cVar, x4.m mVar) {
        int b10 = this.f8541a.b(cVar, mVar) - this.f8542b.b(cVar, mVar);
        if (b10 < 0) {
            return 0;
        }
        return b10;
    }

    @Override // l1.b2
    public final int c(x4.c cVar, x4.m mVar) {
        int c4 = this.f8541a.c(cVar, mVar) - this.f8542b.c(cVar, mVar);
        if (c4 < 0) {
            return 0;
        }
        return c4;
    }

    @Override // l1.b2
    public final int d(x4.c cVar) {
        int d4 = this.f8541a.d(cVar) - this.f8542b.d(cVar);
        if (d4 < 0) {
            return 0;
        }
        return d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (nc.k.a(d0Var.f8541a, this.f8541a) && nc.k.a(d0Var.f8542b, this.f8542b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8542b.hashCode() + (this.f8541a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f8541a + " - " + this.f8542b + ')';
    }
}
