package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qq4  reason: default package */
/* loaded from: classes.dex */
public final class qq4 implements tt7 {
    public final lq4 a;

    public qq4(lq4 lq4Var) {
        this.a = lq4Var;
    }

    @Override // defpackage.tt7
    public final int a(qh1 qh1Var) {
        return qh1Var.r0(this.a.d());
    }

    @Override // defpackage.tt7
    public final int b(qh1 qh1Var, kk3 kk3Var) {
        return qh1Var.r0(this.a.c(kk3Var));
    }

    @Override // defpackage.tt7
    public final int c(qh1 qh1Var) {
        return qh1Var.r0(this.a.a());
    }

    @Override // defpackage.tt7
    public final int d(qh1 qh1Var, kk3 kk3Var) {
        return qh1Var.r0(this.a.b(kk3Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq4)) {
            return false;
        }
        return nb3.k(((qq4) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        kk3 kk3Var = kk3.Ltr;
        lq4 lq4Var = this.a;
        float b = lq4Var.b(kk3Var);
        float d = lq4Var.d();
        float c = lq4Var.c(kk3Var);
        float a = lq4Var.a();
        return "PaddingValues(" + ((Object) om1.c(b)) + ", " + ((Object) om1.c(d)) + ", " + ((Object) om1.c(c)) + ", " + ((Object) om1.c(a)) + ')';
    }
}
