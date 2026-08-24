package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hu0  reason: default package */
/* loaded from: classes.dex */
public final class hu0 implements l61, Serializable {
    public final l61 A;
    public final j61 B;

    public hu0(j61 j61Var, l61 l61Var) {
        l61Var.getClass();
        j61Var.getClass();
        this.A = l61Var;
        this.B = j61Var;
    }

    @Override // defpackage.l61
    public final l61 D(k61 k61Var) {
        k61Var.getClass();
        j61 j61Var = this.B;
        j61 Z = j61Var.Z(k61Var);
        l61 l61Var = this.A;
        if (Z != null) {
            return l61Var;
        }
        l61 D = l61Var.D(k61Var);
        if (D == l61Var) {
            return this;
        }
        if (D == vt1.A) {
            return j61Var;
        }
        return new hu0(j61Var, D);
    }

    @Override // defpackage.l61
    public final l61 N(l61 l61Var) {
        l61Var.getClass();
        if (l61Var == vt1.A) {
            return this;
        }
        return (l61) l61Var.x(new lw0(20, (byte) 0), this);
    }

    @Override // defpackage.l61
    public final j61 Z(k61 k61Var) {
        k61Var.getClass();
        while (true) {
            j61 Z = this.B.Z(k61Var);
            if (Z != null) {
                return Z;
            }
            l61 l61Var = this.A;
            if (l61Var instanceof hu0) {
                this = (hu0) l61Var;
            } else {
                return l61Var.Z(k61Var);
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj instanceof hu0) {
                hu0 hu0Var = (hu0) obj;
                int i = 2;
                hu0 hu0Var2 = hu0Var;
                int i2 = 2;
                while (true) {
                    l61 l61Var = hu0Var2.A;
                    if (l61Var instanceof hu0) {
                        hu0Var2 = (hu0) l61Var;
                    } else {
                        hu0Var2 = null;
                    }
                    if (hu0Var2 == null) {
                        break;
                    }
                    i2++;
                }
                hu0 hu0Var3 = this;
                while (true) {
                    l61 l61Var2 = hu0Var3.A;
                    if (l61Var2 instanceof hu0) {
                        hu0Var3 = (hu0) l61Var2;
                    } else {
                        hu0Var3 = null;
                    }
                    if (hu0Var3 == null) {
                        break;
                    }
                    i++;
                }
                if (i2 == i) {
                    while (true) {
                        j61 j61Var = this.B;
                        if (!nb3.k(hu0Var.Z(j61Var.getKey()), j61Var)) {
                            z = false;
                            break;
                        }
                        l61 l61Var3 = this.A;
                        if (l61Var3 instanceof hu0) {
                            this = (hu0) l61Var3;
                        } else {
                            l61Var3.getClass();
                            j61 j61Var2 = (j61) l61Var3;
                            z = nb3.k(hu0Var.Z(j61Var2.getKey()), j61Var2);
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
        return lb1.q(new StringBuilder("["), (String) x(new fn0(3), ""), ']');
    }

    @Override // defpackage.l61
    public final Object x(eo2 eo2Var, Object obj) {
        return eo2Var.o(this.A.x(eo2Var, obj), this.B);
    }
}
