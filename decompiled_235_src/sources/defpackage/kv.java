package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kv  reason: default package */
/* loaded from: classes.dex */
public final class kv extends z64 implements jm3 {
    public float k0;

    public final long R0(long j, boolean z) {
        int round;
        int g = q21.g(j);
        if (g != Integer.MAX_VALUE && (round = Math.round(g * this.k0)) > 0) {
            if (!z || ak7.m0(j, round, g)) {
                return (round << 32) | (g & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long S0(long j, boolean z) {
        int round;
        int h = q21.h(j);
        if (h != Integer.MAX_VALUE && (round = Math.round(h / this.k0)) > 0) {
            if (!z || ak7.m0(j, h, round)) {
                return (h << 32) | (round & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long T0(long j, boolean z) {
        int i = q21.i(j);
        int round = Math.round(i * this.k0);
        if (round > 0) {
            if (!z || ak7.m0(j, round, i)) {
                return (round << 32) | (i & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long U0(long j, boolean z) {
        int j2 = q21.j(j);
        int round = Math.round(j2 / this.k0);
        if (round > 0) {
            if (!z || ak7.m0(j, j2, round)) {
                return (j2 << 32) | (round & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.jm3
    public final int Z(kz3 kz3Var, x24 x24Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i / this.k0);
        }
        return x24Var.c(i);
    }

    @Override // defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        boolean z;
        boolean z2 = true;
        long S0 = S0(j, true);
        if (q93.b(S0, 0L)) {
            S0 = R0(j, true);
            if (q93.b(S0, 0L)) {
                S0 = U0(j, true);
                if (q93.b(S0, 0L)) {
                    S0 = T0(j, true);
                    if (q93.b(S0, 0L)) {
                        S0 = S0(j, false);
                        if (q93.b(S0, 0L)) {
                            S0 = R0(j, false);
                            if (q93.b(S0, 0L)) {
                                S0 = U0(j, false);
                                if (q93.b(S0, 0L)) {
                                    S0 = T0(j, false);
                                    if (q93.b(S0, 0L)) {
                                        S0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!q93.b(S0, 0L)) {
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
                r53.a("width and height must be >= 0");
            }
            j = s21.h(i, i, i2, i2);
        }
        dx4 y = x24Var.y(j);
        return g34Var.K(y.A, y.B, zt1.A, new jv(y, 0));
    }

    @Override // defpackage.jm3
    public final int f(kz3 kz3Var, x24 x24Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i * this.k0);
        }
        return x24Var.u(i);
    }

    @Override // defpackage.jm3
    public final int h0(kz3 kz3Var, x24 x24Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i / this.k0);
        }
        return x24Var.V(i);
    }

    @Override // defpackage.jm3
    public final int s0(kz3 kz3Var, x24 x24Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i * this.k0);
        }
        return x24Var.n(i);
    }
}
