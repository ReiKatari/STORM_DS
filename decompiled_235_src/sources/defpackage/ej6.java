package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ej6  reason: default package */
/* loaded from: classes.dex */
public final class ej6 extends z64 implements jm3 {
    public float k0;
    public float l0;
    public float m0;
    public float n0;
    public boolean o0;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
        if (r4 != Integer.MAX_VALUE) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long R0(g34 g34Var) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (!Float.isNaN(this.m0)) {
            i = g34Var.r0(this.m0);
            if (i < 0) {
                i = 0;
            }
        } else {
            i = Integer.MAX_VALUE;
        }
        if (!Float.isNaN(this.n0)) {
            i2 = g34Var.r0(this.n0);
            if (i2 < 0) {
                i2 = 0;
            }
        } else {
            i2 = Integer.MAX_VALUE;
        }
        if (!Float.isNaN(this.k0)) {
            i3 = g34Var.r0(this.k0);
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 > i) {
                i3 = i;
            }
        }
        i3 = 0;
        if (!Float.isNaN(this.l0)) {
            int r0 = g34Var.r0(this.l0);
            if (r0 < 0) {
                r0 = 0;
            }
            if (r0 > i2) {
                r0 = i2;
            }
            if (r0 != Integer.MAX_VALUE) {
                i4 = r0;
            }
        }
        return s21.a(i3, i, i4, i2);
    }

    @Override // defpackage.jm3
    public final int Z(kz3 kz3Var, x24 x24Var, int i) {
        long R0 = R0(kz3Var);
        if (q21.e(R0)) {
            return q21.g(R0);
        }
        if (!this.o0) {
            i = s21.g(i, R0);
        }
        return s21.f(x24Var.c(i), R0);
    }

    @Override // defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        int j2;
        int h;
        int i;
        int g;
        long a;
        long R0 = R0(g34Var);
        if (this.o0) {
            a = s21.e(j, R0);
        } else {
            if (!Float.isNaN(this.k0)) {
                j2 = q21.j(R0);
            } else {
                j2 = q21.j(j);
                int h2 = q21.h(R0);
                if (j2 > h2) {
                    j2 = h2;
                }
            }
            if (!Float.isNaN(this.m0)) {
                h = q21.h(R0);
            } else {
                h = q21.h(j);
                int j3 = q21.j(R0);
                if (h < j3) {
                    h = j3;
                }
            }
            if (!Float.isNaN(this.l0)) {
                i = q21.i(R0);
            } else {
                i = q21.i(j);
                int g2 = q21.g(R0);
                if (i > g2) {
                    i = g2;
                }
            }
            if (!Float.isNaN(this.n0)) {
                g = q21.g(R0);
            } else {
                g = q21.g(j);
                int i2 = q21.i(R0);
                if (g < i2) {
                    g = i2;
                }
            }
            a = s21.a(j2, h, i, g);
        }
        dx4 y = x24Var.y(a);
        return g34Var.K(y.A, y.B, zt1.A, new jv(y, 7));
    }

    @Override // defpackage.jm3
    public final int f(kz3 kz3Var, x24 x24Var, int i) {
        long R0 = R0(kz3Var);
        if (q21.f(R0)) {
            return q21.h(R0);
        }
        if (!this.o0) {
            i = s21.f(i, R0);
        }
        return s21.g(x24Var.u(i), R0);
    }

    @Override // defpackage.jm3
    public final int h0(kz3 kz3Var, x24 x24Var, int i) {
        long R0 = R0(kz3Var);
        if (q21.e(R0)) {
            return q21.g(R0);
        }
        if (!this.o0) {
            i = s21.g(i, R0);
        }
        return s21.f(x24Var.V(i), R0);
    }

    @Override // defpackage.jm3
    public final int s0(kz3 kz3Var, x24 x24Var, int i) {
        long R0 = R0(kz3Var);
        if (q21.f(R0)) {
            return q21.h(R0);
        }
        if (!this.o0) {
            i = s21.f(i, R0);
        }
        return s21.g(x24Var.n(i), R0);
    }
}
