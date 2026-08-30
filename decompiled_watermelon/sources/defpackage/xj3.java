package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xj3  reason: default package */
/* loaded from: classes.dex */
public final class xj3 extends dz3 {
    public final ki2 a;
    public final uj3 b;
    public final jf4 c;
    public final boolean d;

    public xj3(ki2 ki2Var, uj3 uj3Var, jf4 jf4Var, boolean z) {
        this.a = ki2Var;
        this.b = uj3Var;
        this.c = jf4Var;
        this.d = z;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new ak3(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xj3) {
            xj3 xj3Var = (xj3) obj;
            if (this.a == xj3Var.a && b53.x(this.b, xj3Var.b) && this.c == xj3Var.c && this.d == xj3Var.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        ak3 ak3Var = (ak3) yy3Var;
        ak3Var.j0 = this.a;
        ak3Var.k0 = this.b;
        jf4 jf4Var = ak3Var.l0;
        jf4 jf4Var2 = this.c;
        if (jf4Var != jf4Var2) {
            ak3Var.l0 = jf4Var2;
            nl2.M(ak3Var);
        }
        boolean z = ak3Var.m0;
        boolean z2 = this.d;
        if (z == z2) {
            return;
        }
        ak3Var.m0 = z2;
        ak3Var.R0();
        nl2.M(ak3Var);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Boolean.hashCode(false) + ej6.c((this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, this.d, 31);
    }
}
