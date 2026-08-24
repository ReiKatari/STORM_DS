package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sp3  reason: default package */
/* loaded from: classes.dex */
public final class sp3 extends z64 implements jm3 {
    public static final pp3 n0 = new Object();
    public tp3 k0;
    public p70 l0;
    public lo4 m0;

    public final boolean R0(np3 np3Var, int i) {
        if (i == 5 || i == 6) {
            if (this.m0 == lo4.Horizontal) {
                return false;
            }
        } else if (i == 3 || i == 4) {
            if (this.m0 == lo4.Vertical) {
                return false;
            }
        } else if (i != 1 && i != 2) {
            i.m("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        if (S0(i)) {
            if (np3Var.b >= this.k0.a() - 1) {
                return false;
            }
        } else if (np3Var.a <= 0) {
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
            int i2 = qp3.a[nc1.f0(this).v0.ordinal()];
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2) {
                return true;
            }
            i.d();
            return false;
        } else if (i == 4) {
            int i3 = qp3.a[nc1.f0(this).v0.ordinal()];
            if (i3 == 1) {
                return true;
            }
            if (i3 == 2) {
                return false;
            }
            i.d();
            return false;
        } else {
            i.m("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
    }

    @Override // defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        dx4 y = x24Var.y(j);
        return g34Var.K(y.A, y.B, zt1.A, new jv(y, 6));
    }
}
