package a5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f427a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f428b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f429c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f430d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f431e;

    public r0(boolean z10, s0 s0Var, boolean z11) {
        int i2;
        boolean z12;
        n2.b0 b0Var = u.f433a;
        if (!z10) {
            i2 = 262152;
        } else {
            i2 = 262144;
        }
        i2 = s0Var == s0.SecureOn ? i2 | 8192 : i2;
        i2 = z11 ? i2 : i2 | 512;
        if (s0Var == s0.Inherit) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f427a = i2;
        this.f428b = z12;
        this.f429c = true;
        this.f430d = true;
        this.f431e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            if (this.f427a == r0Var.f427a && this.f428b == r0Var.f428b && this.f429c == r0Var.f429c && this.f430d == r0Var.f430d && this.f431e == r0Var.f431e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + w.d.e(w.d.e(w.d.e(w.d.e(this.f427a * 31, this.f428b, 31), this.f429c, 31), this.f430d, 31), this.f431e, 31);
    }

    public r0(int i2) {
        this((i2 & 1) == 0, s0.Inherit, true);
    }
}
