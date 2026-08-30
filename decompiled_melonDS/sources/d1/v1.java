package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v1 implements u {

    /* renamed from: a  reason: collision with root package name */
    public final int f3684a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3685b;

    /* renamed from: c  reason: collision with root package name */
    public final v f3686c;

    public v1(int i2, v vVar, int i10) {
        this(i2, 0, (i10 & 4) != 0 ? w.f3687a : vVar);
    }

    @Override // d1.j
    public final y1 a(w1 w1Var) {
        return new g2(this.f3684a, this.f3685b, this.f3686c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            if (v1Var.f3684a == this.f3684a && v1Var.f3685b == this.f3685b && nc.k.a(v1Var.f3686c, this.f3686c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f3686c.hashCode() + (this.f3684a * 31)) * 31) + this.f3685b;
    }

    public v1(int i2, int i10, v vVar) {
        this.f3684a = i2;
        this.f3685b = i10;
        this.f3686c = vVar;
    }

    @Override // d1.u, d1.j
    public final a2 a(w1 w1Var) {
        return new g2(this.f3684a, this.f3685b, this.f3686c);
    }
}
