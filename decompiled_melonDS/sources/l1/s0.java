package l1;

import androidx.preference.Preference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s0 extends c1.h1 {

    /* renamed from: j0  reason: collision with root package name */
    public t0 f8620j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f8621k0;

    @Override // c1.h1, a4.a0
    public final int B0(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        if (this.f8620j0 == t0.Min) {
            return u0Var.h0(i2);
        }
        return u0Var.g(i2);
    }

    @Override // c1.h1, a4.a0
    public final int K(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        if (this.f8620j0 == t0.Min) {
            return u0Var.h0(i2);
        }
        return u0Var.g(i2);
    }

    @Override // c1.h1
    public final long O0(y3.u0 u0Var, long j2) {
        int g10;
        if (this.f8620j0 == t0.Min) {
            g10 = u0Var.h0(x4.a.h(j2));
        } else {
            g10 = u0Var.g(x4.a.h(j2));
        }
        if (g10 < 0) {
            g10 = 0;
        }
        if (g10 < 0) {
            x4.i.a("height must be >= 0");
        }
        return x4.b.h(0, Preference.DEFAULT_ORDER, g10, g10);
    }

    @Override // c1.h1
    public final boolean P0() {
        return this.f8621k0;
    }
}
