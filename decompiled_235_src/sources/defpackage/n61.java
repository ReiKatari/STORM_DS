package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n61  reason: default package */
/* loaded from: classes.dex */
public abstract class n61 extends r0 implements j61 {
    public static final m61 B = new m61(d90.r0, new vn0(17));

    public n61() {
        super(d90.r0);
    }

    @Override // defpackage.r0, defpackage.l61
    public final l61 D(k61 k61Var) {
        k61Var.getClass();
        if (k61Var instanceof m61) {
            m61 m61Var = (m61) k61Var;
            k61 k61Var2 = this.A;
            if (k61Var2 != m61Var && m61Var.B != k61Var2) {
                return this;
            }
            if (((j61) m61Var.A.g(this)) == null) {
                return this;
            }
        } else if (d90.r0 != k61Var) {
            return this;
        }
        return vt1.A;
    }

    @Override // defpackage.r0, defpackage.l61
    public final j61 Z(k61 k61Var) {
        j61 j61Var;
        k61Var.getClass();
        if (k61Var instanceof m61) {
            m61 m61Var = (m61) k61Var;
            k61 k61Var2 = this.A;
            if ((k61Var2 == m61Var || m61Var.B == k61Var2) && (j61Var = (j61) m61Var.A.g(this)) != null) {
                return j61Var;
            }
        } else if (d90.r0 == k61Var) {
            return this;
        }
        return null;
    }

    public abstract void j0(l61 l61Var, Runnable runnable);

    public void k0(l61 l61Var, Runnable runnable) {
        ok1.b(this, l61Var, runnable);
    }

    public boolean l0(l61 l61Var) {
        return !(this instanceof dg7);
    }

    public n61 m0(int i) {
        kn2.u(i);
        return new ru3(this, i);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + nc1.P(this);
    }
}
