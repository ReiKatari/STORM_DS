package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 implements j {

    /* renamed from: a  reason: collision with root package name */
    public final u f3518a;

    /* renamed from: b  reason: collision with root package name */
    public final o0 f3519b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3520c;

    public b0(u uVar, o0 o0Var, long j2) {
        this.f3518a = uVar;
        this.f3519b = o0Var;
        this.f3520c = j2;
    }

    @Override // d1.j
    public final y1 a(w1 w1Var) {
        return new c2(this.f3518a.a(w1Var), this.f3519b, this.f3520c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (b0Var.f3518a.equals(this.f3518a) && b0Var.f3519b == this.f3519b && b0Var.f3520c == this.f3520c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f3519b.hashCode();
        return Long.hashCode(this.f3520c) + ((hashCode + (this.f3518a.hashCode() * 31)) * 31);
    }
}
