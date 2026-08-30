package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ui3  reason: default package */
/* loaded from: classes.dex */
public final class ui3 extends yy3 implements mf3 {
    public static final ri3 m0 = new Object();
    public vi3 j0;
    public l50 k0;
    public jf4 l0;

    public final boolean R0(pi3 pi3Var, int i) {
        if (i == 5 || i == 6) {
            if (this.l0 == jf4.Horizontal) {
                return false;
            }
        } else if (i == 3 || i == 4) {
            if (this.l0 == jf4.Vertical) {
                return false;
            }
        } else if (i != 1 && i != 2) {
            i.n("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        if (S0(i)) {
            if (pi3Var.b >= this.j0.a() - 1) {
                return false;
            }
        } else if (pi3Var.a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean S0(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int i2 = si3.a[l.P(this).u0.ordinal()];
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2) {
                return true;
            }
            i.c();
            return false;
        } else if (i == 4) {
            int i3 = si3.a[l.P(this).u0.ordinal()];
            if (i3 == 1) {
                return true;
            }
            if (i3 == 2) {
                return false;
            }
            i.c();
            return false;
        } else {
            i.n("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
    }

    @Override // defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        yn4 c = mv3Var.c(j);
        return vv3Var.s0(c.A, c.B, qp1.A, new ru(c, 6));
    }
}
