package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g31  reason: default package */
/* loaded from: classes.dex */
public abstract class g31 extends q0 implements c31 {
    public static final f31 B = new f31(k45.Y, new nl0(16));

    public g31() {
        super(k45.Y);
    }

    @Override // defpackage.q0, defpackage.e31
    public final c31 I(d31 d31Var) {
        c31 c31Var;
        d31Var.getClass();
        if (d31Var instanceof f31) {
            f31 f31Var = (f31) d31Var;
            d31 d31Var2 = this.A;
            if ((d31Var2 == f31Var || f31Var.B == d31Var2) && (c31Var = (c31) f31Var.A.n(this)) != null) {
                return c31Var;
            }
        } else if (k45.Y == d31Var) {
            return this;
        }
        return null;
    }

    @Override // defpackage.q0, defpackage.e31
    public final e31 T(d31 d31Var) {
        d31Var.getClass();
        if (d31Var instanceof f31) {
            f31 f31Var = (f31) d31Var;
            d31 d31Var2 = this.A;
            if (d31Var2 != f31Var && f31Var.B != d31Var2) {
                return this;
            }
            if (((c31) f31Var.A.n(this)) == null) {
                return this;
            }
        } else if (k45.Y != d31Var) {
            return this;
        }
        return mp1.A;
    }

    public abstract void j0(e31 e31Var, Runnable runnable);

    public void k0(e31 e31Var, Runnable runnable) {
        kg1.b(this, e31Var, runnable);
    }

    public boolean l0(e31 e31Var) {
        return !(this instanceof i27);
    }

    public g31 m0(int i) {
        jk2.m(i);
        return new pn3(this, i);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + w81.s(this);
    }
}
