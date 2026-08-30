package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f8601a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8602b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8603c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8604d;

    public q0(int i2, int i10, int i11, int i12) {
        this.f8601a = i2;
        this.f8602b = i10;
        this.f8603c = i11;
        this.f8604d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (this.f8601a == q0Var.f8601a && this.f8602b == q0Var.f8602b && this.f8603c == q0Var.f8603c && this.f8604d == q0Var.f8604d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f8601a * 31) + this.f8602b) * 31) + this.f8603c) * 31) + this.f8604d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsetsValues(left=");
        sb2.append(this.f8601a);
        sb2.append(", top=");
        sb2.append(this.f8602b);
        sb2.append(", right=");
        sb2.append(this.f8603c);
        sb2.append(", bottom=");
        return w.d.p(sb2, this.f8604d, ')');
    }
}
