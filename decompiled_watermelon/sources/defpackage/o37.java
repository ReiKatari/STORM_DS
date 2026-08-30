package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o37  reason: default package */
/* loaded from: classes.dex */
public final class o37 extends yy3 implements mf3 {
    public float j0;
    public float k0;

    @Override // defpackage.mf3
    public final int H(fs3 fs3Var, mv3 mv3Var, int i) {
        int i2;
        int g0 = mv3Var.g0(i);
        if (!Float.isNaN(this.k0)) {
            i2 = fs3Var.Y(this.k0);
        } else {
            i2 = 0;
        }
        if (g0 < i2) {
            return i2;
        }
        return g0;
    }

    @Override // defpackage.mf3
    public final int Z(fs3 fs3Var, mv3 mv3Var, int i) {
        int i2;
        int T = mv3Var.T(i);
        if (!Float.isNaN(this.j0)) {
            i2 = fs3Var.Y(this.j0);
        } else {
            i2 = 0;
        }
        if (T < i2) {
            return i2;
        }
        return T;
    }

    @Override // defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        int j2;
        int i;
        int i2 = 0;
        if (!Float.isNaN(this.j0) && lz0.j(j) == 0) {
            int Y = vv3Var.Y(this.j0);
            j2 = lz0.h(j);
            if (Y < 0) {
                Y = 0;
            }
            if (Y <= j2) {
                j2 = Y;
            }
        } else {
            j2 = lz0.j(j);
        }
        int h = lz0.h(j);
        if (!Float.isNaN(this.k0) && lz0.i(j) == 0) {
            int Y2 = vv3Var.Y(this.k0);
            i = lz0.g(j);
            if (Y2 >= 0) {
                i2 = Y2;
            }
            if (i2 <= i) {
                i = i2;
            }
        } else {
            i = lz0.i(j);
        }
        yn4 c = mv3Var.c(nz0.a(j2, h, i, lz0.g(j)));
        return vv3Var.s0(c.A, c.B, qp1.A, new ru(c, 11));
    }

    @Override // defpackage.mf3
    public final int h(fs3 fs3Var, mv3 mv3Var, int i) {
        int i2;
        int e0 = mv3Var.e0(i);
        if (!Float.isNaN(this.j0)) {
            i2 = fs3Var.Y(this.j0);
        } else {
            i2 = 0;
        }
        if (e0 < i2) {
            return i2;
        }
        return e0;
    }

    @Override // defpackage.mf3
    public final int r(fs3 fs3Var, mv3 mv3Var, int i) {
        int i2;
        int f = mv3Var.f(i);
        if (!Float.isNaN(this.k0)) {
            i2 = fs3Var.Y(this.k0);
        } else {
            i2 = 0;
        }
        if (f < i2) {
            return i2;
        }
        return f;
    }
}
