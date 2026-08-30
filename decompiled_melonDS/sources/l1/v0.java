package l1;

import androidx.preference.Preference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v0 extends c1.h1 {

    /* renamed from: j0  reason: collision with root package name */
    public t0 f8634j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f8635k0;

    @Override // c1.h1
    public final long O0(y3.u0 u0Var, long j2) {
        int g02;
        if (this.f8634j0 == t0.Min) {
            g02 = u0Var.b0(x4.a.g(j2));
        } else {
            g02 = u0Var.g0(x4.a.g(j2));
        }
        if (g02 < 0) {
            g02 = 0;
        }
        if (g02 < 0) {
            x4.i.a("width must be >= 0");
        }
        return x4.b.h(g02, g02, 0, Preference.DEFAULT_ORDER);
    }

    @Override // c1.h1
    public final boolean P0() {
        return this.f8635k0;
    }

    @Override // c1.h1, a4.a0
    public final int p0(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        if (this.f8634j0 == t0.Min) {
            return u0Var.b0(i2);
        }
        return u0Var.g0(i2);
    }

    @Override // c1.h1, a4.a0
    public final int y0(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        if (this.f8634j0 == t0.Min) {
            return u0Var.b0(i2);
        }
        return u0Var.g0(i2);
    }
}
