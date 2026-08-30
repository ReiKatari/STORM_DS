package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qr0  reason: default package */
/* loaded from: classes.dex */
public final class qr0 extends dz3 {
    public final l14 a;
    public final boolean b;
    public final ki2 c;
    public final ki2 d;

    public qr0(ki2 ki2Var, ki2 ki2Var2, l14 l14Var, boolean z) {
        this.a = l14Var;
        this.b = z;
        this.c = ki2Var;
        this.d = ki2Var2;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new tr0(this.c, this.d, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qr0.class == obj.getClass()) {
            qr0 qr0Var = (qr0) obj;
            if (b53.x(this.a, qr0Var.a) && this.b == qr0Var.b && this.c == qr0Var.c && this.d == qr0Var.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        tr0 tr0Var = (tr0) yy3Var;
        tr0Var.H0 = true;
        if (tr0Var.G0 == null) {
            z = true;
        } else {
            z = false;
        }
        ki2 ki2Var = this.d;
        if (ki2Var == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            tr0Var.V0();
            nl2.M(tr0Var);
            z3 = true;
        } else {
            z3 = false;
        }
        tr0Var.G0 = ki2Var;
        boolean z5 = tr0Var.q0;
        boolean z6 = this.b;
        if (z5 != z6) {
            z4 = true;
        } else {
            z4 = z3;
        }
        tr0Var.f1(this.a, null, false, z6, null, null, this.c);
        if (z4) {
            tr0Var.g1(false);
            tr0Var.g1(true);
        }
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        l14 l14Var = this.a;
        if (l14Var != null) {
            i = l14Var.hashCode();
        } else {
            i = 0;
        }
        int hashCode = (this.c.hashCode() + ej6.c(ej6.c(i * 961, false, 31), this.b, 29791)) * 961;
        ki2 ki2Var = this.d;
        if (ki2Var != null) {
            i2 = ki2Var.hashCode();
        }
        return Boolean.hashCode(true) + ((hashCode + i2) * 961);
    }
}
