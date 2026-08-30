package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f5041a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5042b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5043c;

    public a1(long j2, long j10, long j11) {
        this.f5041a = j2;
        this.f5042b = j10;
        this.f5043c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a1.class != obj.getClass()) {
            return false;
        }
        a1 a1Var = (a1) obj;
        if (i3.s.c(this.f5041a, a1Var.f5041a) && i3.s.c(this.f5042b, a1Var.f5042b) && i3.s.c(this.f5043c, a1Var.f5043c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = i3.s.f6688i;
        return Long.hashCode(this.f5043c) + w.d.f(this.f5042b, Long.hashCode(this.f5041a) * 31, 31);
    }
}
