package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: su  reason: default package */
/* loaded from: classes.dex */
public final class su extends yy3 implements mf3 {
    public float j0;

    @Override // defpackage.mf3
    public final int H(fs3 fs3Var, mv3 mv3Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i / this.j0);
        }
        return mv3Var.g0(i);
    }

    public final long R0(long j, boolean z) {
        int round;
        int g = lz0.g(j);
        if (g != Integer.MAX_VALUE && (round = Math.round(g * this.j0)) > 0) {
            if (!z || l07.a0(j, round, g)) {
                return (round << 32) | (g & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long S0(long j, boolean z) {
        int round;
        int h = lz0.h(j);
        if (h != Integer.MAX_VALUE && (round = Math.round(h / this.j0)) > 0) {
            if (!z || l07.a0(j, h, round)) {
                return (h << 32) | (round & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long T0(long j, boolean z) {
        int i = lz0.i(j);
        int round = Math.round(i * this.j0);
        if (round > 0) {
            if (!z || l07.a0(j, round, i)) {
                return (round << 32) | (i & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long U0(long j, boolean z) {
        int j2 = lz0.j(j);
        int round = Math.round(j2 / this.j0);
        if (round > 0) {
            if (!z || l07.a0(j, j2, round)) {
                return (j2 << 32) | (round & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.mf3
    public final int Z(fs3 fs3Var, mv3 mv3Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i * this.j0);
        }
        return mv3Var.T(i);
    }

    @Override // defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        boolean z;
        boolean z2 = true;
        long S0 = S0(j, true);
        if (i33.b(S0, 0L)) {
            S0 = R0(j, true);
            if (i33.b(S0, 0L)) {
                S0 = U0(j, true);
                if (i33.b(S0, 0L)) {
                    S0 = T0(j, true);
                    if (i33.b(S0, 0L)) {
                        S0 = S0(j, false);
                        if (i33.b(S0, 0L)) {
                            S0 = R0(j, false);
                            if (i33.b(S0, 0L)) {
                                S0 = U0(j, false);
                                if (i33.b(S0, 0L)) {
                                    S0 = T0(j, false);
                                    if (i33.b(S0, 0L)) {
                                        S0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!i33.b(S0, 0L)) {
            int i = (int) (S0 >> 32);
            int i2 = (int) (4294967295L & S0);
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (i2 < 0) {
                z2 = false;
            }
            if (!(z & z2)) {
                oz2.a("width and height must be >= 0");
            }
            j = nz0.h(i, i, i2, i2);
        }
        yn4 c = mv3Var.c(j);
        return vv3Var.s0(c.A, c.B, qp1.A, new ru(c, 0));
    }

    @Override // defpackage.mf3
    public final int h(fs3 fs3Var, mv3 mv3Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i * this.j0);
        }
        return mv3Var.e0(i);
    }

    @Override // defpackage.mf3
    public final int r(fs3 fs3Var, mv3 mv3Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i / this.j0);
        }
        return mv3Var.f(i);
    }
}
