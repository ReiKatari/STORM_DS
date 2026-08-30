package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b1 implements j {

    /* renamed from: a  reason: collision with root package name */
    public final j f3521a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3522b;

    public b1(x xVar, long j2) {
        this.f3521a = xVar;
        this.f3522b = j2;
    }

    @Override // d1.j
    public final y1 a(w1 w1Var) {
        return new c1(this.f3521a.a(w1Var), this.f3522b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (b1Var.f3522b != this.f3522b || !nc.k.a(b1Var.f3521a, this.f3521a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3522b) + (this.f3521a.hashCode() * 31);
    }
}
