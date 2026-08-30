package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ur0  reason: default package */
/* loaded from: classes.dex */
public final class ur0 implements e31, Serializable {
    public final e31 A;
    public final c31 B;

    public ur0(c31 c31Var, e31 e31Var) {
        e31Var.getClass();
        c31Var.getClass();
        this.A = e31Var;
        this.B = c31Var;
    }

    @Override // defpackage.e31
    public final e31 C(e31 e31Var) {
        e31Var.getClass();
        if (e31Var == mp1.A) {
            return this;
        }
        return (e31) e31Var.N(new qt0(6), this);
    }

    @Override // defpackage.e31
    public final c31 I(d31 d31Var) {
        d31Var.getClass();
        while (true) {
            c31 I = this.B.I(d31Var);
            if (I != null) {
                return I;
            }
            e31 e31Var = this.A;
            if (e31Var instanceof ur0) {
                this = (ur0) e31Var;
            } else {
                return e31Var.I(d31Var);
            }
        }
    }

    @Override // defpackage.e31
    public final Object N(aj2 aj2Var, Object obj) {
        return aj2Var.j(this.A.N(aj2Var, obj), this.B);
    }

    @Override // defpackage.e31
    public final e31 T(d31 d31Var) {
        d31Var.getClass();
        c31 c31Var = this.B;
        c31 I = c31Var.I(d31Var);
        e31 e31Var = this.A;
        if (I != null) {
            return e31Var;
        }
        e31 T = e31Var.T(d31Var);
        if (T == e31Var) {
            return this;
        }
        if (T == mp1.A) {
            return c31Var;
        }
        return new ur0(c31Var, T);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj instanceof ur0) {
                ur0 ur0Var = (ur0) obj;
                int i = 2;
                ur0 ur0Var2 = ur0Var;
                int i2 = 2;
                while (true) {
                    e31 e31Var = ur0Var2.A;
                    if (e31Var instanceof ur0) {
                        ur0Var2 = (ur0) e31Var;
                    } else {
                        ur0Var2 = null;
                    }
                    if (ur0Var2 == null) {
                        break;
                    }
                    i2++;
                }
                ur0 ur0Var3 = this;
                while (true) {
                    e31 e31Var2 = ur0Var3.A;
                    if (e31Var2 instanceof ur0) {
                        ur0Var3 = (ur0) e31Var2;
                    } else {
                        ur0Var3 = null;
                    }
                    if (ur0Var3 == null) {
                        break;
                    }
                    i++;
                }
                if (i2 == i) {
                    while (true) {
                        c31 c31Var = this.B;
                        if (!b53.x(ur0Var.I(c31Var.getKey()), c31Var)) {
                            z = false;
                            break;
                        }
                        e31 e31Var3 = this.A;
                        if (e31Var3 instanceof ur0) {
                            this = (ur0) e31Var3;
                        } else {
                            e31Var3.getClass();
                            c31 c31Var2 = (c31) e31Var3;
                            z = b53.x(ur0Var.I(c31Var2.getKey()), c31Var2);
                            break;
                        }
                    }
                    if (z) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.B.hashCode() + this.A.hashCode();
    }

    public final String toString() {
        return wh1.o(new StringBuilder("["), (String) N(new xk0(3), ""), ']');
    }
}
