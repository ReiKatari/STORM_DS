package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f5907a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5908b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5909c;

    public h1(long j2, long j10, boolean z10) {
        this.f5907a = j2;
        this.f5908b = j10;
        this.f5909c = z10;
    }

    public final h1 a(h1 h1Var) {
        return new h1(h3.b.e(this.f5907a, h1Var.f5907a), Math.max(this.f5908b, h1Var.f5908b), this.f5909c);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h1) {
                h1 h1Var = (h1) obj;
                if (!h3.b.b(this.f5907a, h1Var.f5907a) || this.f5908b != h1Var.f5908b || this.f5909c != h1Var.f5909c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5909c) + w.d.f(this.f5908b, Long.hashCode(this.f5907a) * 31, 31);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) h3.b.g(this.f5907a)) + ", timeMillis=" + this.f5908b + ", shouldApplyImmediately=" + this.f5909c + ')';
    }
}
