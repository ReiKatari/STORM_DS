package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hv6  reason: default package */
/* loaded from: classes.dex */
public final class hv6 extends dz3 {
    public final boolean a;
    public final l14 b;
    public final boolean c;
    public final og5 d;
    public final mi2 e;

    public hv6(boolean z, l14 l14Var, boolean z2, og5 og5Var, mi2 mi2Var) {
        this.a = z;
        this.b = l14Var;
        this.c = z2;
        this.d = og5Var;
        this.e = mi2Var;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new jv6(this.a, this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && hv6.class == obj.getClass()) {
                hv6 hv6Var = (hv6) obj;
                if (this.a != hv6Var.a || !b53.x(this.b, hv6Var.b) || this.c != hv6Var.c || !this.d.equals(hv6Var.d) || this.e != hv6Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        jv6 jv6Var = (jv6) yy3Var;
        boolean z = jv6Var.I0;
        boolean z2 = this.a;
        if (z != z2) {
            jv6Var.I0 = z2;
            nl2.M(jv6Var);
        }
        jv6Var.J0 = this.e;
        jv6Var.f1(this.b, null, false, this.c, null, this.d, jv6Var.K0);
    }

    public final int hashCode() {
        int i;
        int hashCode = Boolean.hashCode(this.a) * 31;
        l14 l14Var = this.b;
        if (l14Var != null) {
            i = l14Var.hashCode();
        } else {
            i = 0;
        }
        return this.e.hashCode() + wh1.a(this.d.a, ej6.c(ej6.c((hashCode + i) * 961, false, 31), this.c, 31), 31);
    }
}
