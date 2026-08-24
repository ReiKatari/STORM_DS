package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jh7  reason: default package */
/* loaded from: classes.dex */
public final class jh7 extends z64 implements jm3 {
    public float k0;
    public float l0;

    @Override // defpackage.jm3
    public final int Z(kz3 kz3Var, x24 x24Var, int i) {
        int i2;
        int c = x24Var.c(i);
        if (!Float.isNaN(this.l0)) {
            i2 = kz3Var.r0(this.l0);
        } else {
            i2 = 0;
        }
        if (c < i2) {
            return i2;
        }
        return c;
    }

    @Override // defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        int j2;
        int i;
        int i2 = 0;
        if (!Float.isNaN(this.k0) && q21.j(j) == 0) {
            int r0 = g34Var.r0(this.k0);
            j2 = q21.h(j);
            if (r0 < 0) {
                r0 = 0;
            }
            if (r0 <= j2) {
                j2 = r0;
            }
        } else {
            j2 = q21.j(j);
        }
        int h = q21.h(j);
        if (!Float.isNaN(this.l0) && q21.i(j) == 0) {
            int r02 = g34Var.r0(this.l0);
            i = q21.g(j);
            if (r02 >= 0) {
                i2 = r02;
            }
            if (i2 <= i) {
                i = i2;
            }
        } else {
            i = q21.i(j);
        }
        dx4 y = x24Var.y(s21.a(j2, h, i, q21.g(j)));
        return g34Var.K(y.A, y.B, zt1.A, new jv(y, 11));
    }

    @Override // defpackage.jm3
    public final int f(kz3 kz3Var, x24 x24Var, int i) {
        int i2;
        int u = x24Var.u(i);
        if (!Float.isNaN(this.k0)) {
            i2 = kz3Var.r0(this.k0);
        } else {
            i2 = 0;
        }
        if (u < i2) {
            return i2;
        }
        return u;
    }

    @Override // defpackage.jm3
    public final int h0(kz3 kz3Var, x24 x24Var, int i) {
        int i2;
        int V = x24Var.V(i);
        if (!Float.isNaN(this.l0)) {
            i2 = kz3Var.r0(this.l0);
        } else {
            i2 = 0;
        }
        if (V < i2) {
            return i2;
        }
        return V;
    }

    @Override // defpackage.jm3
    public final int s0(kz3 kz3Var, x24 x24Var, int i) {
        int i2;
        int n = x24Var.n(i);
        if (!Float.isNaN(this.k0)) {
            i2 = kz3Var.r0(this.k0);
        } else {
            i2 = 0;
        }
        if (n < i2) {
            return i2;
        }
        return n;
    }
}
