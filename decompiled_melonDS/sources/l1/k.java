package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends b3.o implements a4.a0 {

    /* renamed from: i0  reason: collision with root package name */
    public float f8579i0;

    @Override // a4.a0
    public final int B0(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        if (i2 != Integer.MAX_VALUE) {
            return Math.round(i2 / this.f8579i0);
        }
        return u0Var.h0(i2);
    }

    @Override // a4.a0
    public final int K(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        if (i2 != Integer.MAX_VALUE) {
            return Math.round(i2 / this.f8579i0);
        }
        return u0Var.g(i2);
    }

    public final long O0(long j2, boolean z10) {
        int round;
        int g10 = x4.a.g(j2);
        if (g10 != Integer.MAX_VALUE && (round = Math.round(g10 * this.f8579i0)) > 0) {
            if (!z10 || c.o(j2, round, g10)) {
                return (round << 32) | (g10 & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long P0(long j2, boolean z10) {
        int round;
        int h2 = x4.a.h(j2);
        if (h2 != Integer.MAX_VALUE && (round = Math.round(h2 / this.f8579i0)) > 0) {
            if (!z10 || c.o(j2, h2, round)) {
                return (h2 << 32) | (round & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long Q0(long j2, boolean z10) {
        int i2 = x4.a.i(j2);
        int round = Math.round(i2 * this.f8579i0);
        if (round > 0) {
            if (!z10 || c.o(j2, round, i2)) {
                return (round << 32) | (i2 & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long R0(long j2, boolean z10) {
        int j10 = x4.a.j(j2);
        int round = Math.round(j10 / this.f8579i0);
        if (round > 0) {
            if (!z10 || c.o(j2, j10, round)) {
                return (j10 << 32) | (round & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // a4.a0
    public final y3.w0 d(y3.x0 x0Var, y3.u0 u0Var, long j2) {
        boolean z10;
        boolean z11 = true;
        long P0 = P0(j2, true);
        if (x4.l.b(P0, 0L)) {
            P0 = O0(j2, true);
            if (x4.l.b(P0, 0L)) {
                P0 = R0(j2, true);
                if (x4.l.b(P0, 0L)) {
                    P0 = Q0(j2, true);
                    if (x4.l.b(P0, 0L)) {
                        P0 = P0(j2, false);
                        if (x4.l.b(P0, 0L)) {
                            P0 = O0(j2, false);
                            if (x4.l.b(P0, 0L)) {
                                P0 = R0(j2, false);
                                if (x4.l.b(P0, 0L)) {
                                    P0 = Q0(j2, false);
                                    if (x4.l.b(P0, 0L)) {
                                        P0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!x4.l.b(P0, 0L)) {
            int i2 = (int) (P0 >> 32);
            int i10 = (int) (P0 & 4294967295L);
            if (i2 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 < 0) {
                z11 = false;
            }
            if (!(z11 & z10)) {
                x4.i.a("width and height must be >= 0");
            }
            j2 = x4.b.h(i2, i2, i10, i10);
        }
        y3.i1 e6 = u0Var.e(j2);
        return x0Var.u0(e6.A, e6.B, zb.r.A, new c9.o(e6, 4));
    }

    @Override // a4.a0
    public final int p0(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        if (i2 != Integer.MAX_VALUE) {
            return Math.round(i2 * this.f8579i0);
        }
        return u0Var.g0(i2);
    }

    @Override // a4.a0
    public final int y0(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        if (i2 != Integer.MAX_VALUE) {
            return Math.round(i2 * this.f8579i0);
        }
        return u0Var.b0(i2);
    }
}
