package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o83  reason: default package */
/* loaded from: classes.dex */
public final class o83 implements lq4 {
    public final tt7 a;
    public final qh1 b;

    public o83(tt7 tt7Var, qh1 qh1Var) {
        this.a = tt7Var;
        this.b = qh1Var;
    }

    @Override // defpackage.lq4
    public final float a() {
        tt7 tt7Var = this.a;
        qh1 qh1Var = this.b;
        return qh1Var.Q(tt7Var.c(qh1Var));
    }

    @Override // defpackage.lq4
    public final float b(kk3 kk3Var) {
        tt7 tt7Var = this.a;
        qh1 qh1Var = this.b;
        return qh1Var.Q(tt7Var.d(qh1Var, kk3Var));
    }

    @Override // defpackage.lq4
    public final float c(kk3 kk3Var) {
        tt7 tt7Var = this.a;
        qh1 qh1Var = this.b;
        return qh1Var.Q(tt7Var.b(qh1Var, kk3Var));
    }

    @Override // defpackage.lq4
    public final float d() {
        tt7 tt7Var = this.a;
        qh1 qh1Var = this.b;
        return qh1Var.Q(tt7Var.a(qh1Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o83)) {
            return false;
        }
        o83 o83Var = (o83) obj;
        if (nb3.k(this.a, o83Var.a) && nb3.k(this.b, o83Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}
