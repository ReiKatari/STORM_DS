package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x1 extends b3.o implements a4.a0 {

    /* renamed from: i0  reason: collision with root package name */
    public float f8647i0;

    /* renamed from: j0  reason: collision with root package name */
    public float f8648j0;

    @Override // a4.a0
    public final int B0(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        int i10;
        int h02 = u0Var.h0(i2);
        if (!Float.isNaN(this.f8648j0)) {
            i10 = x0Var.O(this.f8648j0);
        } else {
            i10 = 0;
        }
        if (h02 < i10) {
            return i10;
        }
        return h02;
    }

    @Override // a4.a0
    public final int K(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        int i10;
        int g10 = u0Var.g(i2);
        if (!Float.isNaN(this.f8648j0)) {
            i10 = x0Var.O(this.f8648j0);
        } else {
            i10 = 0;
        }
        if (g10 < i10) {
            return i10;
        }
        return g10;
    }

    @Override // a4.a0
    public final y3.w0 d(y3.x0 x0Var, y3.u0 u0Var, long j2) {
        int j10;
        int i2;
        int i10 = 0;
        if (!Float.isNaN(this.f8647i0) && x4.a.j(j2) == 0) {
            int O = x0Var.O(this.f8647i0);
            j10 = x4.a.h(j2);
            if (O < 0) {
                O = 0;
            }
            if (O <= j10) {
                j10 = O;
            }
        } else {
            j10 = x4.a.j(j2);
        }
        int h2 = x4.a.h(j2);
        if (!Float.isNaN(this.f8648j0) && x4.a.i(j2) == 0) {
            int O2 = x0Var.O(this.f8648j0);
            i2 = x4.a.g(j2);
            if (O2 >= 0) {
                i10 = O2;
            }
            if (i10 <= i2) {
                i2 = i10;
            }
        } else {
            i2 = x4.a.i(j2);
        }
        y3.i1 e6 = u0Var.e(x4.b.a(j10, h2, i2, x4.a.g(j2)));
        return x0Var.u0(e6.A, e6.B, zb.r.A, new c9.o(e6, 8));
    }

    @Override // a4.a0
    public final int p0(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        int i10;
        int g02 = u0Var.g0(i2);
        if (!Float.isNaN(this.f8647i0)) {
            i10 = x0Var.O(this.f8647i0);
        } else {
            i10 = 0;
        }
        if (g02 < i10) {
            return i10;
        }
        return g02;
    }

    @Override // a4.a0
    public final int y0(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        int i10;
        int b02 = u0Var.b0(i2);
        if (!Float.isNaN(this.f8647i0)) {
            i10 = x0Var.O(this.f8647i0);
        } else {
            i10 = 0;
        }
        if (b02 < i10) {
            return i10;
        }
        return b02;
    }
}
