package f2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final u1.c0 f4738a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4739b;

    /* renamed from: c  reason: collision with root package name */
    public final g0 f4740c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4741d;

    public h0(u1.c0 c0Var, long j2, g0 g0Var, boolean z10) {
        this.f4738a = c0Var;
        this.f4739b = j2;
        this.f4740c = g0Var;
        this.f4741d = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h0) {
                h0 h0Var = (h0) obj;
                if (this.f4738a != h0Var.f4738a || !h3.b.b(this.f4739b, h0Var.f4739b) || this.f4740c != h0Var.f4740c || this.f4741d != h0Var.f4741d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int f8 = w.d.f(this.f4739b, this.f4738a.hashCode() * 31, 31);
        return Boolean.hashCode(this.f4741d) + ((this.f4740c.hashCode() + f8) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.f4738a + ", position=" + ((Object) h3.b.g(this.f4739b)) + ", anchor=" + this.f4740c + ", visible=" + this.f4741d + ')';
    }
}
