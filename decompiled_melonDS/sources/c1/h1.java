package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class h1 extends b3.o implements a4.a0 {

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f2428i0;

    @Override // a4.a0
    public int B0(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        switch (this.f2428i0) {
            case 0:
                return u0Var.h0(i2);
            default:
                return u0Var.h0(i2);
        }
    }

    @Override // a4.a0
    public int K(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        switch (this.f2428i0) {
            case 0:
                return u0Var.g(i2);
            default:
                return u0Var.g(i2);
        }
    }

    public abstract long O0(y3.u0 u0Var, long j2);

    public abstract boolean P0();

    public y3.w0 d(y3.x0 x0Var, y3.u0 u0Var, long j2) {
        long O0 = O0(u0Var, j2);
        if (P0()) {
            O0 = x4.b.e(j2, O0);
        }
        y3.i1 e6 = u0Var.e(O0);
        return x0Var.u0(e6.A, e6.B, zb.r.A, new c9.o(e6, 6));
    }

    @Override // a4.a0
    public int p0(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        switch (this.f2428i0) {
            case 0:
                return u0Var.g0(i2);
            default:
                return u0Var.g0(i2);
        }
    }

    @Override // a4.a0
    public int y0(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        switch (this.f2428i0) {
            case 0:
                return u0Var.b0(i2);
            default:
                return u0Var.b0(i2);
        }
    }
}
